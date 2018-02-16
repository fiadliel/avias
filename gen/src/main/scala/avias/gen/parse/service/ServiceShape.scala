package avias.gen.parse.service

import io.circe._
import io.circe.generic.auto._

import scala.collection.immutable.ListMap

sealed trait ServiceShape extends Product with Serializable
case class BlobServiceShape(documentation: Option[String]) extends ServiceShape
case class BooleanServiceShape(documentation: Option[String])
    extends ServiceShape
case class DoubleServiceShape(documentation: Option[String])
    extends ServiceShape
case class FloatServiceShape(documentation: Option[String]) extends ServiceShape
case class IntegerServiceShape(documentation: Option[String],
                               min: Option[Int],
                               max: Option[Int])
    extends ServiceShape
case class ListServiceShape(documentation: Option[String],
                            member: StructureInstance,
                            min: Option[Int])
    extends ServiceShape
case class LongServiceShape(documentation: Option[String],
                            min: Option[Long],
                            max: Option[Long])
    extends ServiceShape
case class MapServiceShape(documentation: Option[String],
                           key: StructureInstance,
                           value: StructureInstance)
    extends ServiceShape
case class StringServiceShape(documentation: Option[String],
                              enum: Option[List[String]],
                              max: Option[Int])
    extends ServiceShape
case class StructureServiceShape(documentation: Option[String],
                                 required: Option[List[String]],
                                 members: ListMap[String, StructureInstance])
    extends ServiceShape
case class TimestampServiceShape(documentation: Option[String])
    extends ServiceShape

object ServiceShape {
  implicit val shapeDecoder: Decoder[ServiceShape] = new Decoder[ServiceShape] {
    override def apply(c: HCursor): Decoder.Result[ServiceShape] = {
      c.downField("type").as[String].flatMap {
        case "blob" =>
          c.as[BlobServiceShape]
        case "boolean" =>
          c.as[BooleanServiceShape]
        case "double" =>
          c.as[DoubleServiceShape]
        case "float" =>
          c.as[FloatServiceShape]
        case "integer" =>
          c.as[IntegerServiceShape]
        case "list" =>
          c.as[ListServiceShape]
        case "long" =>
          c.as[LongServiceShape]
        case "map" =>
          c.as[MapServiceShape]
        case "string" =>
          c.as[StringServiceShape]
        case "structure" =>
          c.as[StructureServiceShape]
        case "timestamp" =>
          c.as[TimestampServiceShape]
      }
    }
  }
}
