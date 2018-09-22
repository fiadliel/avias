package avias.gen.generator

import avias.gen.parse.service._

import scala.meta.{Defn, Enumerator, Lit, Name, Pat, Term, Tree, Type}
import scala.meta.quasiquotes._

case class StructureField(name: String, typ: Type, isOptional: Boolean) {
  val scalaLiteral = Lit.String(name)

  val scalaName: Term.Name = {
    val upper = name.takeWhile(_.isUpper)
    val afterUpper = name.dropWhile(_.isUpper)
    Term.Name(upper.toLowerCase + afterUpper)
  }

  val scalaType: Type = {
    if (isOptional)
      Type.Apply(Type.Name("scala.Option"), List(typ))
    else
      typ
  }

  val scalaMethodParam: Term.Param = {
    if (isOptional)
      Term.Param(List.empty, scalaName, Some(scalaType), Some(Term.Name("scala.None")))
    else
      Term.Param(List.empty, scalaName, Some(scalaType), None)
  }
}

trait Structure {
  def typeName: String
  def scalaType: Type
  def decoder: Defn
  def encoder: List[Defn]
  def definition: Defn
  def params: List[StructureField]
}

object Structure {
  def apply(typePackage: String, typeName: String, isError: Boolean, params: List[StructureField], serviceProtocol: ServiceProtocol, operationName: Option[String]): Structure =
    serviceProtocol match {
      case JsonProtocol if params.isEmpty ⇒
        JsonObjectStructure(typePackage, typeName, isError)
      case JsonProtocol ⇒
        JsonClassStructure(typePackage, typeName, isError, params)
      case Ec2Protocol ⇒
        Ec2ClassStructure(typePackage, typeName, isError, params, operationName)
    }
}

case class JsonObjectStructure(typePackage: String, typeName: String, isError: Boolean)
    extends Structure {
  val scalaType = Type.Select(Term.Name(typePackage), Type.Name(typeName + ".type"))
  val scalaObjectName = Term.Select(Term.Name(typePackage), Term.Name(typeName))
  val params: List[StructureField] = List.empty

  def decoder: Defn.Val = {
    val decoderName = Pat.Var(Term.Name(typeName + "Decoder"))
    q"final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.decodeUnit.as($scalaObjectName)"
  }

  def encoder: List[Defn.Val] = List({
    val encoderName = Pat.Var(Term.Name(typeName + "Encoder"))
    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => Json.obj() }"
  })

  def definition: Defn = {
    q"case object ${Term.Name(typeName)}"
  }
}

case class JsonClassStructure(typePackage: String, typeName: String,
                              isError: Boolean,
                              params: List[StructureField])
    extends Structure {
  val scalaType = Type.Select(Term.Name(typePackage), Type.Name(typeName))
  val scalaObjectName = Term.Select(Term.Name(typePackage), Term.Name(typeName))

  def decoder: Defn.Val = {
    def monadicDecoder: Term.ForYield = {
      def extractItem(item: StructureField): Enumerator.Generator = {
        enumerator"${p"${item.scalaName}"} <- o.get[${item.scalaType}](${item.scalaLiteral})"
      }

      val enumeratorsnel = params.map(extractItem)
      val fields = params.map(_.scalaName)

      q"for (..$enumeratorsnel) yield $scalaObjectName(..$fields)"
    }

    def applicativeDecoder: Term.Apply = {
      def extractItem(item: StructureField): Term = {
        q"o.get[${item.scalaType}](${item.scalaLiteral})"
      }
      val fields = params.map(extractItem)

      q"(..$fields).mapN($scalaObjectName.apply _)"
    }

    def singleFieldDecoder(item: StructureField): Term.Apply = {
      q"o.get[${item.scalaType}](${item.scalaLiteral}).map($scalaObjectName.apply _)"
    }

    def decoderInstance: Term = {
      if (params.size == 1)
        singleFieldDecoder(params.head)
      else if (params.size >= 23)
        monadicDecoder
      else
        applicativeDecoder
    }

    val decoderName = Pat.Var(Term.Name(typeName + "Decoder"))

    q"""

  final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.instance { o => $decoderInstance }
"""
  }

  def encoder: List[Defn.Val] = List({
    val encoderInstance: Term.Apply = {
      val fields = params.map(i => q"${i.scalaLiteral} -> o.${i.scalaName}.asJson")
      q"Json.obj(..$fields)"
    }

    val encoderName = Pat.Var(Term.Name(typeName + "Encoder"))

    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => $encoderInstance }"
  })

  def definition: Defn = {
    q"final case class ${Type.Name(typeName)}(..${params.map(_.scalaMethodParam)})"
  }
}

case class Ec2ClassStructure(typePackage: String,
                             typeName: String,
                             isError: Boolean,
                             params: List[StructureField],
                             maybeAction: Option[String],
                            ) extends Structure {
  val scalaType = Type.Select(Term.Name(typePackage), Type.Name(typeName))
  val scalaObjectName = Term.Select(Term.Name(typePackage), Term.Name(typeName))

  override def decoder: Defn.Val = {
    q"""
       val decoder = 42
     """
  }

  override def encoder: List[Defn] = {
    val dtoName = Type.Name(typeName)

    val entityEncoder =
      (for {
        action ← maybeAction
        if typeName == s"${action}Request"
      } yield {
        val actionName = Lit.String(action)
        val encoderName = Term.Name(typeName + "EntityEncoder")
        val (paramNames, fields) = params.map { p ⇒
          val paramName = Pat.Var(p.scalaName.copy(p.scalaName.value + "Params"))
          val requestFieldName: Term.Name = Term.Name(p.scalaMethodParam.name.value)

          Term.Name(p.scalaName.value + "Params") →
            q"""
                val $paramName = Ec2RequestEncoder.encode(${p.scalaLiteral}, req.$requestFieldName)
              """
        }.unzip

        List(q"""
            implicit def $encoderName[F[_] : cats.Applicative]: EntityEncoder[F, $dtoName] = EntityEncoder[F, UrlForm].contramap { req ⇒
              ..$fields
              UrlForm(("Action" -> $actionName) +: ${paramNames.reduceLeft[Term]((x, v) ⇒ q"""$v ++ $x""")}: _*)
            }
          """)
      }).getOrElse(List.empty)

    val ec2ProtocolEncoder = maybeAction.fold {
      val encoderName = Pat.Var(Term.Name(typeName + "Ec2Encoder"))
      val (paramNames, fields) = params.map { p ⇒
        val paramName = Pat.Var(p.scalaName.copy(p.scalaName.value + "Params"))
        val requestFieldName: Term.Name = Term.Name(p.scalaMethodParam.name.value)

        Term.Name(p.scalaName.value + "Params") →
          q"""
              val $paramName = Ec2RequestEncoder.encode(fieldName + "." + ${p.scalaLiteral}, dto.$requestFieldName)
            """
      }.unzip
      List(
        q"""
          implicit val $encoderName: Ec2RequestEncoder[$dtoName] =
            (fieldName: String, dto: $dtoName) => {
              ..$fields

              ${paramNames.reduceLeft[Term]((x, v) ⇒ q"""$v ++ $x""")}
            }
        """)
    } (_ ⇒ List.empty)

    entityEncoder ++ ec2ProtocolEncoder
  }

  def definition: Defn = {
    q"final case class ${Type.Name(typeName)}(..${params.map(_.scalaMethodParam)})"
  }
}
