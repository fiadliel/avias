package avias.gen.parse.service

import cats.implicits._
import io.circe.Decoder

sealed abstract class ServiceProtocol extends Product with Serializable

object ServiceProtocol {
  implicit val decodeServiceProtocol: Decoder[ServiceProtocol] = {
    List[Decoder[ServiceProtocol]](
      Decoder[JsonProtocol.type].widen,
      Decoder[RestJsonProtocol.type].widen,
      Decoder[QueryProtocol.type].widen,
      Decoder[RestXmlProtocol.type].widen,
      Decoder[Ec2Protocol.type].widen
    ).reduceLeft(_ or _)
  }
}

case object JsonProtocol extends ServiceProtocol {
  implicit val jsonDecoder: Decoder[JsonProtocol.type] = Decoder[String].emap {
    s => Either.fromOption({ if (s == "json") Some(JsonProtocol) else None }, s + " is not json")
  }
}

case object RestJsonProtocol extends ServiceProtocol {
  implicit val restJsonDecoder: Decoder[RestJsonProtocol.type] = Decoder[String].emap {
    s => Either.fromOption({ if (s == "rest-json") Some(RestJsonProtocol) else None }, s + " is not rest-json")
  }
}

case object QueryProtocol extends ServiceProtocol {
  implicit val queryDecoder: Decoder[QueryProtocol.type] = Decoder[String].emap {
    s => Either.fromOption({ if (s == "query") Some(QueryProtocol) else None }, s + " is not query")
  }
}

case object RestXmlProtocol extends ServiceProtocol {
  implicit val restXmlDecoder: Decoder[RestXmlProtocol.type] = Decoder[String].emap {
    s => Either.fromOption({ if (s == "rest-xml") Some(RestXmlProtocol) else None }, s + " is not rest-xml")
  }
}

case object Ec2Protocol extends ServiceProtocol {
  implicit val ec2Decoder: Decoder[Ec2Protocol.type] = Decoder[String].emap {
    s => Either.fromOption({ if (s == "ec2") Some(Ec2Protocol) else None }, s + " is not ec2")
  }
}




case class ServiceMetadata(apiVersion: String,
                           endpointPrefix: String,
                           jsonVersion: Option[String],
                           protocol: ServiceProtocol,
                           serviceAbbreviation: Option[String],
                           serviceFullName: String,
                           signatureVersion: String,
                           targetPrefix: Option[String],
                           uid: Option[String])
