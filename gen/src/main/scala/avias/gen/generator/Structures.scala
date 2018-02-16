package avias.gen.generator

import avias.gen.graph._
import quiver.{Context, Graph}

import scala.meta.Term
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
    ..${items.map(_.encoder)}
    ..${items.map(_.decoder)}
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
                graph: Graph[ServiceNode, NodeName, EdgeLabel]): Structures = {
    val serviceTraitName = Term.Name(serviceName.value.replace("-", "_"))
    val servicePackageName = Term.Select(packageName, serviceTraitName)
    val commonPackageName = Term.Select(packageName, Term.Name("common"))
    val modelsPackageName = Term.Select(servicePackageName, Term.Name("models"))
    val circePackageName = Term.Select(servicePackageName, Term.Name("circe"))

    val structures = graph.contexts
      .collect({
        case Context(in, e: StructureNode, label, out) =>
          val isError = in.forall(_._1 == "error")

          val requiredParams = out.collect {
            case (ItemForStructure(item, true), v: ShapeNode) =>
              val tpe = v.getType(modelsPackageName.toString, graph)
              StructureField(item, tpe, false)
          }

          val optionalParams = out.collect {
            case (ItemForStructure(item, false), v: ShapeNode) =>
              val tpe = v.getType(modelsPackageName.toString, graph)
              StructureField(item, tpe, true)
          }

          val allParams = (requiredParams ++ optionalParams).toList
          Structure(modelsPackageName.toString, label.term, isError, allParams)
    }).toList

    Structures(servicePackageName, structures)
  }
}
