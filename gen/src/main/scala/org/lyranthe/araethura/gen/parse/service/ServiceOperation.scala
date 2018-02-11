package org.lyranthe.araethura.gen.parse.service

case class ServiceOperation(name: String,
                            http: HttpOperation,
                            input: Option[StructureInstance],
                            output: Option[StructureInstance],
                            errors: Option[List[StructureInstance]],
                            documentation: Option[String])
