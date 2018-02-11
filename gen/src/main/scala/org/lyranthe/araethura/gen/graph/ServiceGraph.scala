package org.lyranthe.araethura.gen.graph

import org.lyranthe.araethura.gen.parse.service._
import quiver._

import scala.meta._

object ServiceGraph {
  def apply(service: Service): Graph[ServiceNode, NodeName, EdgeLabel] = {
    val operationNodes: Map[String, LNode[ServiceNode, NodeName]] =
      service.operations.map {
        case (k, v) =>
          k -> LNode(ServiceNode.operationNode(v.name, v.http, v.documentation),
                     NodeName(Term.Name(k)))
      }

    val shapeNodes: Map[String, LNode[ServiceNode, NodeName]] =
      service.shapes.map {
        case (k, v) =>
          val n = v match {
            case BlobServiceShape(documentation) =>
              ServiceNode.blobNode(k, documentation)
            case BooleanServiceShape(documentation) =>
              ServiceNode.booleanNode(k, documentation)
            case DoubleServiceShape(documentation) =>
              ServiceNode.doubleNode(k, documentation)
            case FloatServiceShape(documentation) =>
              ServiceNode.floatNode(k, documentation)
            case IntegerServiceShape(documentation, min, max) =>
              ServiceNode.integerNode(k, documentation, min, max)
            case ListServiceShape(documentation, shape, min) =>
              ServiceNode.listNode(k, documentation, min)
            case LongServiceShape(documentation, min, max) =>
              ServiceNode.longNode(k, documentation, min, max)
            case MapServiceShape(documentation, kShape, vShape) =>
              ServiceNode.mapNode(k, documentation)
            case StringServiceShape(documentation, enum, max) =>
              ServiceNode.stringNode(k, documentation, enum, max)
            case StructureServiceShape(documentation, required, members) =>
              ServiceNode.structureNode(k, documentation, members.isEmpty)
            case TimestampServiceShape(documentation) =>
              ServiceNode.timestampNode(k, documentation)
          }
          k -> LNode(n, NodeName(Term.Name(k)))
      }

    val nodes: Seq[LNode[ServiceNode, NodeName]] =
      (operationNodes.valuesIterator ++ shapeNodes.valuesIterator).toSeq

    val operationEdges = service.operations.flatMap {
      case (k, v) =>
        val src = operationNodes(k).vertex

        v.input
          .map { i =>

            LEdge(src, shapeNodes(i.shape).vertex, EdgeLabel.inputForOperation) }
          .toSeq ++
          v.output
            .map(
              o =>
                LEdge(src,
                      shapeNodes(o.shape).vertex,
                      EdgeLabel.outputForOperation))
            .toSeq ++
          v.errors
            .getOrElse(List.empty)
            .map(
              e =>
                LEdge(src,
                      shapeNodes(e.shape).vertex,
                      EdgeLabel.errorForOperation))
    } toSeq

    val shapeEdges: Seq[LEdge[ServiceNode, EdgeLabel]] =
      service.shapes.flatMap {
        case (k, BlobServiceShape(_)) =>
          Seq.empty
        case (k, BooleanServiceShape(_)) =>
          Seq.empty
        case (k, DoubleServiceShape(_)) =>
          Seq.empty
        case (k, FloatServiceShape(_)) =>
          Seq.empty
        case (k, IntegerServiceShape(_, _, _)) =>
          Seq.empty
        case (k, ListServiceShape(_, a, b)) =>
          val src = shapeNodes(k).vertex
          Seq(LEdge(src, shapeNodes(a.shape).vertex, EdgeLabel.shapeForList))
        case (k, LongServiceShape(_, _, _)) =>
          Seq.empty
        case (k, MapServiceShape(_, kShape, vShape)) =>
          val src = shapeNodes(k).vertex
          Seq(
            LEdge(src, shapeNodes(kShape.shape).vertex, EdgeLabel.keyForMap),
            LEdge(src, shapeNodes(vShape.shape).vertex, EdgeLabel.valueForMap))
        case (k, StringServiceShape(_, _, _)) =>
          Seq.empty
        case (k, StructureServiceShape(_, required, members)) =>
          val src = shapeNodes(k).vertex
          val reqKeys = required.toList.flatten.toSet
          val req = members
            .filterKeys(k => reqKeys.contains(k.repr))
            .map {
              case (k, v) =>
                LEdge(src,
                      shapeNodes(v.shape).vertex,
                      EdgeLabel.itemForStructure(k, required = true))
            }
          val notreq = members
            .filterKeys(k => !reqKeys.contains(k.repr))
            .map {
              case (k, v) =>
                LEdge(src,
                      shapeNodes(v.shape).vertex,
                      EdgeLabel.itemForStructure(k, required = false))
            }

          req ++ notreq

        case (k, TimestampServiceShape(_)) =>
          Seq.empty
      } toSeq

    val edges = operationEdges ++ shapeEdges

    quiver.mkGraph(nodes, edges)
  }
}
