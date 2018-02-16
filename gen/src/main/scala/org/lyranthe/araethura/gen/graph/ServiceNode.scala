package org.lyranthe.araethura.gen.graph

import org.lyranthe.araethura.gen.parse.service.HttpOperation
import quiver.Graph

import scala.meta.{Term, Type}
import scala.meta.quasiquotes._

sealed trait ServiceNode extends Product with Serializable

case class OperationNode(item: String,
                         http: HttpOperation,
                         documentation: Option[String])
    extends ServiceNode

trait ShapeNode extends ServiceNode {
  def name: String
  def documentation: Option[String]
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type
}

case class BlobNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type  =
    t"scala.Array[scala.Byte]"
}

case class BooleanNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"scala.Boolean"
}

case class DoubleNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"scala.Double"
}

case class FloatNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"scala.Float"
}

case class StructureNode(name: String,
                         hasZeroMembers: Boolean,
                         documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"${Term.Name(modelPackage)}.${Type.Name(name)}"
}

case class IntegerNode(name: String,
                       documentation: Option[String],
                       min: Option[Int],
                       max: Option[Int])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"scala.Int"
}

case class ListNode(name: String,
                    documentation: Option[String],
                    min: Option[Int])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type = {
    graph.outs(this).collectFirst {
      case (ShapeForList, s: ShapeNode) =>
        val listType = s.getType(modelPackage, graph)
        t"scala.List[$listType]"
    } getOrElse sys.error(
      "Should have output type for a list node: " + name + " " + graph.outs(
        this))
  }
}
case class LongNode(name: String,
                    documentation: Option[String],
                    min: Option[Long],
                    max: Option[Long])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"scala.Long"
}

case class MapNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type = {
    val outs = graph.outs(this)

    val k = outs.collectFirst {
      case (KeyForMap, s: ShapeNode) =>
        s.getType(modelPackage, graph)
    } getOrElse sys.error(
      "Should have key type for a map node: " + name + " " + graph.outs(this))

    val v = outs.collectFirst {
      case (ValueForMap, s: ShapeNode) =>
        s.getType(modelPackage, graph)
    } getOrElse sys.error(
      "Should have a value type for a map node: " + name + " " + graph.outs(
        this))

    t"scala.collection.immutable.Map[$k, $v]"
  }
}

case class StringNode(name: String,
                      documentation: Option[String],
                      enum: Option[Set[String]],
                      max: Option[Int])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"java.lang.String"
}

case class TimestampNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: String,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type =
    t"java.time.Instant"
}
