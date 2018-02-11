package org.lyranthe.araethura.gen.generator

import org.lyranthe.araethura.gen.graph._
import quiver.{Context, Graph}

import scala.meta.{Lit, Term}
import scala.meta.quasiquotes._

case class Structures(servicePackageName: Term.Select,
                      items: List[Structure]) {
  def itemLookup: Map[String, Structure] = {
    items.map { item => item.name -> item }.toMap
  }

  def circeImplicits = q"""
package $servicePackageName {

  import cats.implicits._
  import io.circe._
  import io.circe.syntax._

  object circe extends org.lyranthe.araethura.common.DefaultCodecs {

    ..${items.map(_.encoder)}
    ..${items.map(_.decoder)}
  }
}
"""

  def modelDefinitions =
    q"""
       package $servicePackageName.models {

         import $servicePackageName.models

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
    val circePackageName = Term.Select(servicePackageName, Term.Name("circe"))

    val structures = graph.contexts
      .collect({
        case Context(in, e: StructureNode, label, out) =>
          val isError = in.forall(_._1 == "error")

          val requiredParams = out.collect {
            case (ItemForStructure(item, true), v: ShapeNode) =>
              val tpe = v.getType(Term.Name("models"), graph)
              StructureItem(Lit.String(item), tpe)
          }

          val optionalParams = out.collect {
            case (ItemForStructure(item, false), v: ShapeNode) =>
              val tpe = v.getType(Term.Name("models"), graph)
              StructureItem(Lit.String(item), t"scala.Option[$tpe]")
          }

          if ((requiredParams ++ optionalParams).isEmpty)
            ObjectStructure(q"models.${label.scalaTerm}", isError)
          else
            ClassStructure(q"models.${label.scalaTerm}",
                           isError,
              requiredParams.toList, optionalParams.toList)
    }).toList

    Structures(servicePackageName, structures)
  }
}
