package avias.gen.generator

import avias.gen.graph._
import avias.gen.parse.service.HttpOperation
import quiver.{Context, Graph}

import scala.meta.{Init, Lit, Name, Pkg, Stat, Term, Type}
import scala.meta.quasiquotes._

class TraitMethod(operation: Lit.String,
                  scalaName: Term.Name,
                  http: HttpOperation,
                  awsDataType: Type,
                  commonHttp4sPackage: Term,
                  input: Option[Structure],
                  output: Option[Structure],
                  errors: List[Structure]) {
  def outputType: Type =
    output.filter(_.params.nonEmpty).map(_.scalaType).getOrElse(Type.Name("scala.Unit"))

  val paramss: List[List[Term.Param]] =
    List(input.filter(_.params.nonEmpty).map(i => param"input: ${i.scalaType}").toList).filter(_.nonEmpty)

  def methodResultType(effectType: String): Type =
    Type.Apply(Type.Name(effectType), List(outputType))

  def definition(effectType: String, body: Option[Term]): Stat = {
    body match {
      case None =>
          q"def $scalaName(...$paramss): ${methodResultType(effectType)}"
      case Some(b) =>
        q"override def $scalaName(...$paramss): ${methodResultType(effectType)} = $b"
    }
  }

  def http4sImplementation: Stat = {
    val baseArgs: List[Term] = List(q"client",
                                    q"awsData",
                                    q"ServiceType",
                                    q"ServiceAndPrefix",
                                    operation,
      Term.Name(http.method),
      Lit.String(http.requestUri))

    input match {
      case Some(i) =>
        val args = baseArgs ++ input.map({ i =>
                  if (i.params.isEmpty)
                    q"()"
                  else
                    q"input"
                }).toList

        val t = if (i.params.isEmpty) t"scala.Unit" else i.scalaType

        definition(
          "F",
          Some(
            q"$commonHttp4sPackage.ClientUtils.doRequest[F, $outputType, $t](..$args)"))
      case None =>
        definition(
          "F",
          Some(
            q"$commonHttp4sPackage.ClientUtils.doRequestWithoutBody[F, $outputType](..$baseArgs)"))
    }
  }
}

case class Trait(servicePackageName: Term.Ref,
                 traitName: Type.Name,
                 http4sImplName: Type.Name,
                 endpointPrefix: String,
                 targetPrefix: Option[String],
                 methods: List[TraitMethod]) {
  val http4sPackageName = q"$servicePackageName.http4s"

  def definition: Pkg = {
    q"""
package $servicePackageName {
  trait $traitName[F[_]] {
    ..${methods.map(_.definition("F", None))}
  }
}
     """
  }

  def http4sImplementation: Pkg = {
    val ext = Init(t"$servicePackageName.$traitName[F]", Name(""), List.empty)
    val serviceType = Lit.String(endpointPrefix)
    val serviceAndPrefix = targetPrefix match {
         case Some(tp) => Term.Apply(Term.Name("Some"), List(Lit.String(tp)))
         case None     => Term.Name("None")
    }
    q"""
package $http4sPackageName {
  import org.http4s.Method._
  import $servicePackageName.circe._
  import $servicePackageName.models

  class $http4sImplName[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends $ext {
    private[this] final val ServiceType: String = $serviceType
    private[this] final val ServiceAndPrefix: Option[String] = $serviceAndPrefix

    ..${methods.map(_.http4sImplementation)}
  }
}
"""

  }
}

object Trait {
  def fromGraph(structures: Structures,
                serviceName: Term.Name,
                packageName: Term.Ref,
                traitName: Type.Name,
                http4sImplName: Type.Name,
                endpointPrefix: String,
                targetPrefix: Option[String],
                graph: Graph[ServiceNode, NodeName, EdgeLabel]): Trait = {
    val serviceTraitName = Term.Name(serviceName.value.replace("-", "_"))
    val servicePackageName = q"$packageName.$serviceTraitName"
    val commonPackageName = q"$packageName.common"
    val modelsPackageName = q"$packageName.models"
    val commonHttp4sPackageName = q"$commonPackageName.http4s"

    val methods: List[TraitMethod] = graph.contexts.collect({
      case Context(_, OperationNode(methodName, http, doc), label, out) =>
        def scalaName: Term.Name = {
          val lowered = methodName.takeWhile(_.isUpper).toLowerCase
          val afterLowered = methodName.dropWhile(_.isUpper)
          Term.Name(lowered + afterLowered)
        }

        val input: Option[Structure] = out.collectFirst {
          case (InputForOperation, n: ShapeNode) =>
            n.name
        } flatMap structures.getByName

        val output: Option[Structure] = out.collectFirst {
          case (OutputForOperation, n: ShapeNode) =>
            n.name
        } flatMap structures.getByName

        val errors: List[Structure] = out.collect {
          case (ErrorForOperation, n: ShapeNode) =>
            n.name
        }.toList flatMap structures.getByName

        new TraitMethod(
          Lit.String(methodName),
          scalaName,
          http,
          Type.Select(commonPackageName, t"AwsData"),
          commonHttp4sPackageName,
          input,
          output,
          errors
        )
    })(collection.breakOut)

    Trait(servicePackageName, traitName, http4sImplName, endpointPrefix, targetPrefix, methods)
  }
}
