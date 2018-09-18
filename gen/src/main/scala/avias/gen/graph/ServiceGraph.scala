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
            case ListServiceShape(documentation, _, min) =>
              ListNode(k, documentation, min)
            case LongServiceShape(documentation, min, max) =>
              LongNode(k, documentation, min, max)
            case MapServiceShape(documentation, _, _) =>
              MapNode(k, documentation)
            case StringServiceShape(documentation, enum, max) =>
              StringNode(k, documentation, enum.map(_.toSet), max)
            case StructureServiceShape(documentation, _, members) =>
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
        case (_, BlobServiceShape(_)) =>
          Seq.empty
        case (_, BooleanServiceShape(_)) =>
          Seq.empty
        case (_, DoubleServiceShape(_)) =>
          Seq.empty
        case (_, FloatServiceShape(_)) =>
          Seq.empty
        case (_, IntegerServiceShape(_, _, _)) =>
          Seq.empty
        case (k, ListServiceShape(_, a, b)) =>
          val src = shapeNodes(k).vertex
          Seq(LEdge(src, shapeNodes(a.shape).vertex, ShapeForList))
        case (_, LongServiceShape(_, _, _)) =>
          Seq.empty
        case (k, MapServiceShape(_, kShape, vShape)) =>
          val src = shapeNodes(k).vertex
          Seq(
            LEdge(src, shapeNodes(kShape.shape).vertex, KeyForMap),
            LEdge(src, shapeNodes(vShape.shape).vertex, ValueForMap))
        case (_, StringServiceShape(_, _, _)) =>
          Seq.empty
        case (k0, StructureServiceShape(_, required, members)) =>
          val src = shapeNodes(k0).vertex
          val reqKeys = required.toList.flatten.toSet
          val req = members
            .filterKeys(k => reqKeys.contains(k.repr))
            .map {
              case (k1, v) =>
                LEdge(src,
                      shapeNodes(v.shape).vertex,
                      ItemForStructure(v.locationName.getOrElse(k1), required = true))
            }
          val notreq = members
            .filterKeys(k => !reqKeys.contains(k.repr))
            .map {
              case (k1, v) =>
                LEdge(src,
                      shapeNodes(v.shape).vertex,
                      ItemForStructure(v.locationName.getOrElse(k1), required = false))
            }

          req ++ notreq

        case (_, TimestampServiceShape(_)) =>
          Seq.empty
      } toList

    val edges = operationEdges ++ shapeEdges

    quiver.mkGraph(nodes.asInstanceOf[List[LNode[ServiceNode, NodeName]]], edges.asInstanceOf[List[LEdge[ServiceNode, EdgeLabel]]])
  }
}
