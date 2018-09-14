package avias

import java.time.Instant
import java.util.Base64

import simulacrum.typeclass

@typeclass trait Ec2RequestEncoder[A] { self ⇒
  def encode(fieldName: String, a: A): List[(String, String)]

  final def contramap[B](f: B => A): Ec2RequestEncoder[B] =
    (fieldName: String, b: B) => self.encode(fieldName, f(b))

}

object Ec2RequestEncoder {
  def encode[T: Ec2RequestEncoder](fieldName: String, t: T): List[(String, String)] =
    Ec2RequestEncoder[T].encode(fieldName, t)

  implicit val stringEncoder: Ec2RequestEncoder[String] =
    (fieldName: String, s: String) => List(fieldName → s)

  implicit val booleanEncoder: Ec2RequestEncoder[Boolean] =
    Ec2RequestEncoder[String].contramap(_.toString)

  implicit val intEncoder: Ec2RequestEncoder[Int] =
    Ec2RequestEncoder[String].contramap(_.toString)

  implicit val longEncoder: Ec2RequestEncoder[Long] =
    Ec2RequestEncoder[String].contramap(_.toString)

  implicit val doubleEncoder: Ec2RequestEncoder[Double] =
    Ec2RequestEncoder[String].contramap(_.toString)

  implicit val floatEncoder: Ec2RequestEncoder[Float] =
    Ec2RequestEncoder[String].contramap(_.toString)

  implicit val byteArrayEncoder: Ec2RequestEncoder[Array[Byte]] =
    Ec2RequestEncoder[String].contramap(Base64.getEncoder.encodeToString)

  implicit val instantEncoder: Ec2RequestEncoder[Instant] =
    Ec2RequestEncoder[Double].contramap((i: Instant) => i.toEpochMilli.toDouble / 1000)

  implicit def optionEncoder[X: Ec2RequestEncoder]: Ec2RequestEncoder[Option[X]] =
    (fieldName: String, maybeX: Option[X]) => maybeX.toList.flatMap(Ec2RequestEncoder[X].encode(fieldName, _))

  implicit def listEncoder[X: Ec2RequestEncoder]: Ec2RequestEncoder[List[X]] =
    (fieldName: String, xs: List[X]) => xs.zipWithIndex.flatMap {
      case (v, i) ⇒ Ec2RequestEncoder[X].encode(s"$fieldName.${i + 1}", v)
    }
}
