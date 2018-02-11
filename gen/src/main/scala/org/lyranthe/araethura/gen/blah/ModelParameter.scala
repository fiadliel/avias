//package org.lyranthe.araethura.gen.blah
//
//import scala.meta.{Term, Type}
//import scala.meta.quasiquotes._
//
//case class ModelParameter(jsonName: String,
//                          scalaType: Type.Name,
//                          isRequired: Boolean) {
//  def parameterName: Term.Name = Term.Name(jsonName)
//
//  def parameterDefinition: Term.Param = {
//    if (isRequired)
//      param"$parameterName: $scalaType"
//    else
//      param"$parameterName: ${t"scala.Option[$scalaType]"} = None"
//  }
//}
