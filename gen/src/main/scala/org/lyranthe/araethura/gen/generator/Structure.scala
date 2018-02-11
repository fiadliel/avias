package org.lyranthe.araethura.gen.generator

import scala.meta.{Defn, Enumerator, Lit, Pat, Pkg, Term, Type}
import scala.meta.quasiquotes._

case class StructureItem(name: Lit.String, structureType: Type) {
  val isOptional: Boolean = structureType.toString().startsWith("scala.Option")

  val scalaName: Term.Name = {
    val upper = name.value.takeWhile(_.isUpper)
    val afterUpper = name.value.dropWhile(_.isUpper)
    Term.Name(upper.toLowerCase + afterUpper)
  }

  val param: Term.Param = {
    if (isOptional)
      param"${scalaName}: ${structureType} = None"
    else
      param"${scalaName}: ${structureType}"
  }
}

trait Structure {
  def name: String
  def decoder: Defn.Val
  def encoder: Defn.Val
  def definition: Defn
  def requiredParams: List[StructureItem]
}

case class ObjectStructure(scalaTerm: Term.Select, isError: Boolean)
    extends Structure {
  val name = scalaTerm.toString
  val encoderName = Pat.Var(Term.Name(scalaTerm.name.value + "Encoder"))
  val decoderName = Pat.Var(Term.Name(scalaTerm.name.value + "Decoder"))
  val scalaType = Type.Name(scalaTerm + ".type")
  val requiredParams = List.empty

  def decoder: Defn.Val = {
    q"final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.decodeUnit.as($scalaTerm)"
  }

  def encoder: Defn.Val = {
    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => Json.obj() }"
  }

  def definition: Defn = {
    q"case object ${scalaTerm.name}"
  }
}

case class ClassStructure(scalaTerm: Term.Select,
                          isError: Boolean,
                          requiredParams: List[StructureItem], optionalParams: List[StructureItem])
    extends Structure {
  val name = scalaTerm.toString
  val encoderName = Pat.Var(Term.Name(scalaTerm.name.value + "Encoder"))
  val decoderName = Pat.Var(Term.Name(scalaTerm.name.value + "Decoder"))
  val scalaType = Type.Name(scalaTerm.toString())

  def monadicDecoder: Term.ForYield = {
    def extractItem(item: StructureItem): Enumerator.Generator = {
      enumerator"${p"${item.scalaName}"} <- o.get[${item.structureType}](${item.name})"
    }

    val enumeratorsnel = (requiredParams ++ optionalParams).map(extractItem)
    val fields = (requiredParams ++ optionalParams).map(_.scalaName)

    q"for (..$enumeratorsnel) yield $scalaTerm(..$fields)"
  }

  def applicativeDecoder: Term.Apply = {
    def extractItem(item: StructureItem): Term = {
      q"o.get[${item.structureType}](${item.name})"
    }
    val fields = (requiredParams ++ optionalParams).map(extractItem)

    q"(..$fields).mapN($scalaTerm.apply _)"
  }

  def singleFieldDecoder(item: StructureItem): Term.Apply = {
    q"o.get[${item.structureType}](${item.name}).map($scalaTerm.apply _)"
  }

  def decoderInstance: Term = {
    if ((requiredParams ++ optionalParams).size == 1)
      singleFieldDecoder((requiredParams ++ optionalParams).head)
    else if ((requiredParams ++ optionalParams).size >= 23)
      monadicDecoder
    else
      applicativeDecoder
  }

  def encoderInstance: Term.Apply = {
    val fields = (requiredParams ++ optionalParams).map(i => q"${i.name} -> o.${i.scalaName}.asJson")
    q"Json.obj(..$fields)"
  }

  def decoder: Defn.Val = {
    q"final implicit val $decoderName: io.circe.Decoder[$scalaType] = io.circe.Decoder.instance { o => $decoderInstance }"
  }

  def encoder: Defn.Val = {
    q"final implicit val $encoderName: io.circe.Encoder[$scalaType] = io.circe.Encoder.instance { o => $encoderInstance }"
  }

  def definition: Defn = {
    q"final case class ${Type.Name(scalaTerm.name.value)}(..${(requiredParams ++ optionalParams).map(_.param)})"
  }
}
