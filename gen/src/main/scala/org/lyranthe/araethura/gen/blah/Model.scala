//package org.lyranthe.araethura.gen.blah
//
//import scala.meta.{Defn, Template, Term, Type}
//import scala.meta.quasiquotes._
//
//case class Model(parentPackage: String,
//                 name: String,
//                 modelParameters: List[ModelParameter],
//                 extendsTemplate: Option[Template],
//                 documentation: Option[String]) {
//  def className = Type.Name(name)
//  def objectName = Term.Name(name)
//
//  def fullyQualifiedClassName =
//    Type.Name(Type.Name(parentPackage) + "." + className)
//
//  def fullyQualifiedObjectName =
//    Term.Name(Term.Name(parentPackage) + "." + objectName)
//
//  def requiredParameters: List[Term.Param] =
//    modelParameters.filter(_.isRequired == true).map(_.parameterDefinition)
//  def optionalParameters: List[Term.Param] =
//    modelParameters.filter(_.isRequired == false).map(_.parameterDefinition)
//
//  def params: List[Term.Param] = requiredParameters ++ optionalParameters
//
//  def definition: Defn = {
//    (modelParameters.isEmpty, extendsTemplate) match {
//      case (false, None) =>
//        q"final case class $className(..$params)"
//      case (false, Some(ext)) =>
//        q"final case class $className(..$params) extends $ext"
//      case (true, None) =>
//        q"case object $objectName"
//      case (true, Some(ext)) =>
//        q"case object $objectName extends $ext"
//    }
//  }
//}
