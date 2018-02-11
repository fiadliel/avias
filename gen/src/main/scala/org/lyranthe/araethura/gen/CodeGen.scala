package org.lyranthe.araethura.gen

import org.lyranthe.araethura.gen.generator.{Structures, Trait}
import org.lyranthe.araethura.gen.graph._
import org.lyranthe.araethura.gen.parse.service.ServiceMetadata
import quiver.Graph

import scala.meta.{Term, Type}

class CodeGen(serviceName: Term.Name,
              packageName: Term.Name,
              serviceException: String,
              traitName: Type.Name,
              http4sClientName: Type.Name,
              serviceMetadata: ServiceMetadata,
              graph: Graph[ServiceNode, NodeName, EdgeLabel]) {
  val structures: Structures =
    Structures.fromGraph(serviceName, packageName, graph)

  def traits: Trait = Trait.fromGraph(structures,
    serviceName, packageName,
    traitName,
    http4sClientName,
    serviceMetadata.endpointPrefix,
    serviceMetadata.targetPrefix,
    graph)

}

object CodeGen {
  def apply(serviceName: String,
            serviceMetadata: ServiceMetadata,
            graph: Graph[ServiceNode, NodeName, EdgeLabel]): CodeGen = {
    new CodeGen(
      Term.Name(serviceName),
      Term.Name("org.lyranthe.araethura"),
      serviceName + "Exception",
      Type.Name("Amazon" + serviceName),
      Type.Name("Amazon" + serviceName + "Client"),
      serviceMetadata,
      graph
    )
  }
}
