package avias.gen.generator

import scala.meta.{Defn, Enumerator, Lit, Pat, Term, Type}
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
  def decoder: Defn.Val
  def encoder: Defn.Val
  def definition: Defn
  def params: List[StructureField]
}

object Structure {
  def apply(typePackage: String, typeName: String, isError: Boolean, params: List[StructureField]): Structure = {
    if (params.isEmpty)
      ObjectStructure(typePackage, typeName, isError)
    else
      ClassStructure(typePackage, typeName, isError, params)
  }
}

case class ObjectStructure(typePackage: String, typeName: String, isError: Boolean)
    extends Structure {
  val scalaType = Type.Select(Term.Name(typePackage), Type.Name(typeName + ".type"))
  val scalaObjectName = Term.Select(Term.Name(typePackage), Term.Name(typeName))
  val params: List[StructureField] = List.empty

  def decoder: Defn.Val = {
    val decoderName = Pat.Var(Term.Name(typeName + "Decoder"))
    q"final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.decodeUnit.as($scalaObjectName)"
  }

  def encoder: Defn.Val = {
    val encoderName = Pat.Var(Term.Name(typeName + "Encoder"))
    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => Json.obj() }"
  }

  def definition: Defn = {
    q"case object ${Term.Name(typeName)}"
  }
}

case class ClassStructure(typePackage: String, typeName: String,
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

    q"final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.instance { o => $decoderInstance }"
  }

  def encoder: Defn.Val = {
    val encoderInstance: Term.Apply = {
      val fields = params.map(i => q"${i.scalaLiteral} -> o.${i.scalaName}.asJson")
      q"Json.obj(..$fields)"
    }

    val encoderName = Pat.Var(Term.Name(typeName + "Encoder"))

    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => $encoderInstance }"
  }

  def definition: Defn = {
    q"final case class ${Type.Name(typeName)}(..${params.map(_.scalaMethodParam)})"
  }
}
