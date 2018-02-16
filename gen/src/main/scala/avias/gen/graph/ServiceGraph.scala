package avias.gen.graph

import cats.implicits._
import avias.gen.parse.service._
import quiver._

object ServiceGraph {
  def apply(service: Service): Graph[ServiceNode, NodeName, EdgeLabel] = {
    val operationNodes =
      service.operations.map {
        case (k, v) =>
          k -> LNode(OperationNode(v.name, v.http, v.documentation),
                     NodeName(k))
      }

    val shapeNodes =
      service.shapes.map {
        case (k, v) =>
          val n = v match {
            case BlobServiceShape(documentation) =>
              BlobNode(k, documentation)
            case BooleanServiceShape(documentation) =>
              BooleanNode(k, documentation)
            case DoubleServiceShape(documentation) =>
              DoubleNode(k, documentation)
            case FloatServiceShape(documentation) =>
              FloatNode(k, documentation)
            case IntegerServiceShape(documentation, min, max) =>
              IntegerNode(k, documentation, min, max)
            case ListServiceShape(documentation, shape, min) =>
              ListNode(k, documentation, min)
            case LongServiceShape(documentation, min, max) =>
              LongNode(k, documentation, min, max)
            case MapServiceShape(documentation, kShape, vShape) =>
              MapNode(k, documentation)
            case StringServiceShape(documentation, enum, max) =>
              StringNode(k, documentation, enum.map(_.toSet), max)
            case StructureServiceShape(documentation, required, members) =>
              StructureNode(k, members.isEmpty, documentation)
            case TimestampServiceShape(documentation) =>
              TimestampNode(k, documentation)
          }
          k -> LNode(n, NodeName(k))
      }

    val nodes =
      (operationNodes.valuesIterator ++ shapeNodes.valuesIterator).toList

    val operationEdges = service.operations.flatMap {
      case (k, v) =>
        val src = operationNodes(k).vertex

        v.input
          .map { i =>

            LEdge(src, shapeNodes(i.shape).vertex, InputForOperation) }
          .toSeq ++
          v.output
            .map(
              o =>
                LEdge(src,
                      shapeNodes(o.shape).vertex,
                  OutputForOperation))
            .toSeq ++
          v.errors
            .getOrElse(List.empty)
            .map(
              e =>
                LEdge(src,
                      shapeNodes(e.shape).vertex,
                  ErrorForOperation))
    } toList

    val shapeEdges =
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
          Seq(LEdge(src, shapeNodes(a.shape).vertex, ShapeForList))
        case (k, LongServiceShape(_, _, _)) =>
          Seq.empty
        case (k, MapServiceShape(_, kShape, vShape)) =>
          val src = shapeNodes(k).vertex
          Seq(
            LEdge(src, shapeNodes(kShape.shape).vertex, KeyForMap),
            LEdge(src, shapeNodes(vShape.shape).vertex, ValueForMap))
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
                      ItemForStructure(k, required = true))
            }
          val notreq = members
            .filterKeys(k => !reqKeys.contains(k.repr))
            .map {
              case (k, v) =>
                LEdge(src,
                      shapeNodes(v.shape).vertex,
                      ItemForStructure(k, required = false))
            }

          req ++ notreq

        case (k, TimestampServiceShape(_)) =>
          Seq.empty
      } toList

    val edges = operationEdges ++ shapeEdges

    quiver.mkGraph(nodes.asInstanceOf[List[LNode[ServiceNode, NodeName]]], edges.asInstanceOf[List[LEdge[ServiceNode, EdgeLabel]]])
  }
}
