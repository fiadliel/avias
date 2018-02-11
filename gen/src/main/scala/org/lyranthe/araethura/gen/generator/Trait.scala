package org.lyranthe.araethura.gen.generator

import org.lyranthe.araethura.gen.graph._
import org.lyranthe.araethura.gen.parse.service.HttpOperation
import quiver.{Context, Graph}

import scala.meta.{Init, Lit, Name, Pkg, Stat, Term, Type}
import scala.meta.quasiquotes._

case class TraitInput(typ: Type, elideInput: Boolean) {
  def innerType: Type = {
    typ
  }

  def traitParam: Option[Term.Param] = {
    if (elideInput)
      None
    else
      Some(param"input: $innerType")
  }

  def name = {
    q"input"
  }
}

case class TraitOutput(typ: Type) {
  def innerType = typ

  def traitResult(effectType: Type) = {
    Type.Apply(effectType, List(typ))
  }
}

case class TraitError(typ: Type) {
  def innerType = typ
}

class Method(operation: Lit.String,
             scalaName: Term.Name,
             http: HttpOperation,
             awsDataType: Type,
             commonHttp4sPackage: Term,
             input: Option[TraitInput],
             requiredInputParams: List[StructureItem],
             output: Option[TraitOutput],
             errors: List[TraitError]) {

  println("Method " + operation)
  println("Required Input Params: " + requiredInputParams)

  def paramss(effectType: Type): List[List[Term.Param]] =
    List(input.flatMap(_.traitParam).toList)
      .filter(_.nonEmpty)

  def requiredParamss(effectType: Type): Option[List[Term.Param]] =
    Option(requiredInputParams.map(_.param)).filter(_.nonEmpty)

  def innerType: Type =
    output.map(_.innerType).getOrElse(t"Unit")

  def declType(effectType: Type): Type =
    Type.Apply(effectType, List(innerType))

  def definition(effectType: Type, body: Option[Term]): List[Stat] = {
    body match {
      case None =>
          q"def $scalaName(...${paramss(effectType)}): ${declType(effectType)}" :: Nil
          //requiredParamss(effectType).map(p => q"def $scalaName(...${List(p)}): ${declType(effectType)}").toList
      case Some(b) =>
        q"override def $scalaName(...${paramss(effectType)}): ${declType(
          effectType)} = $b" :: Nil
//        requiredParamss(effectType).map(p => q"override def $scalaName(...${List(p)}): ${declType(
//          effectType)} = $b").toList
    }
  }

  def http4sImplementation: List[Stat] = {
    val baseTargs: List[Type] = List(t"F", innerType)
    val baseArgs: List[Term] = List(q"client",
                                    q"awsData",
                                    q"ServiceType",
                                    q"ServiceAndPrefix",
                                    operation,
      Term.Name(http.method),
      Lit.String(http.requestUri))

    input match {
      case Some(i) =>
        val targs: List[Type] = baseTargs :+ i.innerType
        val args: List[Term] = {
          if (i.elideInput)
            baseArgs :+ q"()"
          else
            baseArgs :+ i.name
        }

        definition(
          t"F",
          Some(
            q"$commonHttp4sPackage.ClientUtils.doRequest[..$targs](..$args)"))
      case None =>
        definition(
          t"F",
          Some(
            q"$commonHttp4sPackage.ClientUtils.doRequestWithoutBody[..$baseTargs](..$baseArgs)"))
    }
  }
}

case class Trait(servicePackageName: Term.Ref,
                 traitName: Type.Name,
                 http4sImplName: Type.Name,
                 endpointPrefix: String,
                 targetPrefix: Option[String],
                 methods: List[Method]) {
  val http4sPackageName = q"$servicePackageName.http4s"

  def definition: Pkg = {
    q"""
package $servicePackageName {
  trait $traitName[F[_]] {
    ..${methods.flatMap(_.definition(t"F", None))}
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

  class $http4sImplName[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends $ext {
    private[this] final val ServiceType: String = $serviceType
    private[this] final val ServiceAndPrefix: Option[String] = $serviceAndPrefix

    ..${methods.flatMap(_.http4sImplementation)}
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
    val commonHttp4sPackageName = q"$commonPackageName.http4s"

    val methods: List[Method] = graph.contexts.collect({
      case Context(_, OperationNode(methodName, http, doc), label, out) =>
        def scalaName: Term.Name = {
          val lowered = methodName.takeWhile(_.isUpper).toLowerCase
          val afterLowered = methodName.dropWhile(_.isUpper)
          Term.Name(lowered + afterLowered)
        }

        val input: Option[TraitInput] = out.collectFirst {
          case (InputForOperation, n: ShapeNode) =>
            val jsonType = n.getType(Term.Name("models"), graph)

            val elideInput = jsonType.toString() == "scala.Unit"

            TraitInput(jsonType, elideInput)
        }

        val output: Option[Type] = out.collectFirst {
          case (OutputForOperation, n: ShapeNode) =>
            n.getType(Term.Name("models"), graph)
        }

        val errors: List[Type] = out.collect {
          case (ErrorForOperation, n: ShapeNode) =>
            n.getType(Term.Name("models"), graph)
        } toList

        println(methodName)
        println("Type: " + input.map(_.innerType.toString()))
        println("All required structures: " + structures.items.map(_.name).mkString(","))
        println("Structures: " + input.flatMap(i => structures.itemLookup.get(i.innerType.toString()).map(_.requiredParams)).mkString(","))
        println("Input: " + input)

        new Method(
          Lit.String(methodName),
          scalaName,
          http,
          Type.Select(commonPackageName, t"AwsData"),
          commonHttp4sPackageName,
          input,
          input.map(_.innerType.toString()).flatMap(structures.itemLookup.get(_)).toList.flatMap(_.requiredParams),
          output.map(TraitOutput.apply),
          errors.map(TraitError.apply)
        )
    })(collection.breakOut)

    Trait(servicePackageName, traitName, http4sImplName, endpointPrefix, targetPrefix, methods)
  }
}
