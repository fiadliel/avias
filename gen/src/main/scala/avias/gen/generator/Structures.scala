package avias.gen.generator

import avias.gen.graph._
import avias.gen.parse.service.ServiceProtocol
import quiver.{Context, Graph}

import scala.meta.{Pkg, Term}
import scala.meta.quasiquotes._

case class Structures(servicePackageName: Term.Select,
                      items: List[Structure]) {
  private val map = items.groupBy(_.typeName).map { case (k, v) => k -> v.head }

  def getByName(typeName: String): Option[Structure] = map.get(typeName)

  def circeImplicits = q"""
package $servicePackageName {

  import cats.implicits._
  import io.circe._
  import io.circe.syntax._

  object circe extends avias.common.DefaultCodecs {
    ..${items.flatMap(_.encoder)}
    ..${items.map(_.decoder)}
  }
}
"""

  def ec2Implicits: Pkg =
    q"""
package $servicePackageName {

  import org.http4s._
  import org.http4s.UrlForm._
  import avias.ec2.models._
  import avias.Ec2RequestEncoder

  object ec2 {
    ..${items.flatMap(_.encoder)}
  }
}
"""

  def modelDefinitions =
    q"""
       package $servicePackageName.models {
         ..${items.map(_.definition)}
       }
     """
}

object Structures {
  def fromGraph(serviceName: Term.Name,
                packageName: Term.Ref,
                graph: Graph[ServiceNode, NodeName, EdgeLabel],
                serviceProtocol: ServiceProtocol,
               ): Structures = {
    val serviceTraitName = Term.Name(serviceName.value.replace("-", "_"))
    val servicePackageName = Term.Select(packageName, serviceTraitName)
    val modelsPackageName = Term.Select(servicePackageName, Term.Name("models"))

    val structures = graph.contexts
      .collect {
        case Context(in, _: StructureNode, label, out) =>
          val isError = in.forall(_._1 == "error")

          val requiredParams = out.collect {
            case (ItemForStructure(item, true), v: ShapeNode) =>
              val tpe = v.getType(modelsPackageName.toString, graph)
              StructureField(item, tpe, isOptional = false)
          }

          val optionalParams = out.collect {
            case (ItemForStructure(item, false), v: ShapeNode) =>
              val tpe = v.getType(modelsPackageName.toString, graph)
              StructureField(item, tpe, isOptional = true)
          }

          val operation = in.collectFirst {
            case (_, operationNode: OperationNode) =>
              operationNode.item
          }

          val allParams = (requiredParams ++ optionalParams).toList
          Structure(modelsPackageName.toString, label.term, isError, allParams, serviceProtocol, operation)
      }.toList

    Structures(servicePackageName, structures)
  }
}
