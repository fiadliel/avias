package org.lyranthe.araethura.gen.graph

sealed trait EdgeLabel extends Product with Serializable

case object ShapeForList extends EdgeLabel
case object KeyForMap extends EdgeLabel
case object ValueForMap extends EdgeLabel
final case class ItemForStructure(item: String, required: Boolean)
    extends EdgeLabel
case object InputForOperation extends EdgeLabel
case object OutputForOperation extends EdgeLabel
case object ErrorForOperation extends EdgeLabel
