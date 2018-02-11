package org.lyranthe.araethura.gen.graph

import org.lyranthe.araethura.gen.parse.service.HttpOperation
import quiver.Graph

import scala.meta._

sealed trait ServiceNode extends Product with Serializable

object ServiceNode {
  def blobNode(name: String, documentation: Option[String]): ServiceNode =
    BlobNode(name, documentation)
  def booleanNode(name: String, documentation: Option[String]): ServiceNode =
    BooleanNode(name, documentation)
  def doubleNode(name: String, documentation: Option[String]): ServiceNode =
    DoubleNode(name, documentation)
  def floatNode(name: String, documentation: Option[String]): ServiceNode =
    FloatNode(name, documentation)
  def integerNode(name: String,
                  documentation: Option[String],
                  min: Option[Int],
                  max: Option[Int]): ServiceNode =
    IntegerNode(name, documentation, min, max)
  def listNode(name: String,
               documentation: Option[String],
               min: Option[Int]): ServiceNode =
    ListNode(name, documentation, min)
  def longNode(name: String,
               documentation: Option[String],
               min: Option[Long],
               max: Option[Long]): ServiceNode =
    LongNode(name, documentation, min, max)
  def mapNode(name: String, documentation: Option[String]): ServiceNode =
    MapNode(name, documentation)

  def operationNode(name: String,
                    http: HttpOperation,
                    documentation: Option[String]): ServiceNode = {
    OperationNode(name, http, documentation)
  }

  def stringNode(name: String,
                 documentation: Option[String],
                 enum: Option[List[String]],
                 max: Option[Int]): ServiceNode =
    StringNode(name, documentation, enum.map(_.toSet), max)

  def structureNode(name: String,
                    documentation: Option[String],
                    hasZeroMembers: Boolean): ServiceNode =
    StructureNode(name, hasZeroMembers, documentation)
  def timestampNode(name: String, documentation: Option[String]): ServiceNode =
    TimestampNode(name, documentation)
}

case class OperationNode(item: String,
                         http: HttpOperation,
                         documentation: Option[String])
    extends ServiceNode

trait ShapeNode extends ServiceNode {
  def name: String
  def documentation: Option[String]
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]): Type
}

case class BlobNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Array[scala.Byte]"
}

case class BooleanNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Boolean"
}

case class DoubleNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Double"
}

case class FloatNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Float"
}

case class StructureNode(name: String,
                         hasZeroMembers: Boolean,
                         documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) = {
    if (hasZeroMembers)
      t"scala.Unit"
    else
      Type.Select(modelPackage, Type.Name(name))
  }
}

case class IntegerNode(name: String,
                       documentation: Option[String],
                       min: Option[Int],
                       max: Option[Int])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Int"
}

case class ListNode(name: String,
                    documentation: Option[String],
                    min: Option[Int])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) = {
    graph.outs(this).collectFirst {
      case (ShapeForList, s: ShapeNode) =>
        Type.Apply(Type.Name("scala.List"),
                   List(s.getType(modelPackage, graph)))
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
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"scala.Long"
}

case class MapNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) = {
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
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"java.lang.String"
}

case class TimestampNode(name: String, documentation: Option[String])
    extends ShapeNode {
  def getType(modelPackage: Term.Ref,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) =
    t"java.time.Instant"
}
