package scalajsgraphql

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import Types._

object Types {

 type SelectionNode = FieldNode | FragmentSpreadNode | InlineFragmentNode
}

@js.native
trait DocumentNode extends js.Object {
  val kind: Kind = js.native
}

@js.native
trait FieldNode extends js.Object {
  val kind:Kind = js.native
}

@js.native
trait SelectionSetNode extends js.Object {
  val kind:Kind = js.native
  val selections:js.Array[SelectionNode] = js.native
}
@js.native
trait FragmentSpreadNode extends js.Object {
  val kind:Kind = js.native
}
@js.native
trait InlineFragmentNode extends js.Object {
  val kind:Kind = js.native
}

@js.native
trait Kind extends js.Object

@js.native
@JSImport("graphql", "Kind")
object Kind extends js.Object {
  val NAME: Kind = js.native
  val DOCUMENT: Kind = js.native
  val OPERATION_DEFINITION: Kind = js.native
  val VARIABLE_DEFINITION: Kind = js.native
  val VARIABLE: Kind = js.native
  val SELECTION_SET: Kind = js.native
  val FIELD: Kind = js.native
  val ARGUMENT: Kind = js.native
  val FRAGMENT_SPREAD: Kind = js.native
  val INLINE_FRAGMENT: Kind = js.native
  val FRAGMENT_DEFINITION: Kind = js.native
  val INT: Kind = js.native
  val FLOAT: Kind = js.native
  val STRING: Kind = js.native
  val BOOLEAN: Kind = js.native
  val NULL: Kind = js.native
  val ENUM: Kind = js.native
  val LIST: Kind = js.native
  val OBJECT: Kind = js.native
  val OBJECT_FIELD: Kind = js.native
  val DIRECTIVE: Kind = js.native
  val NAMED_TYPE: Kind = js.native
  val LIST_TYPE: Kind = js.native
  val NON_NULL_TYPE: Kind = js.native
  val SCHEMA_DEFINITION: Kind = js.native
  val OPERATION_TYPE_DEFINITION: Kind = js.native
  val SCALAR_TYPE_DEFINITION: Kind = js.native
  val OBJECT_TYPE_DEFINITION: Kind = js.native
  val FIELD_DEFINITION: Kind = js.native
  val INPUT_VALUE_DEFINITION: Kind = js.native
  val INTERFACE_TYPE_DEFINITION: Kind = js.native
  val UNION_TYPE_DEFINITION: Kind = js.native
  val ENUM_TYPE_DEFINITION: Kind = js.native
  val ENUM_VALUE_DEFINITION: Kind = js.native
  val INPUT_OBJECT_TYPE_DEFINITION: Kind = js.native
  val DIRECTIVE_DEFINITION: Kind = js.native
  val SCHEMA_EXTENSION: Kind = js.native
  val SCALAR_TYPE_EXTENSION: Kind = js.native
  val OBJECT_TYPE_EXTENSION: Kind = js.native
  val INTERFACE_TYPE_EXTENSION: Kind = js.native
  val UNION_TYPE_EXTENSION: Kind = js.native
  val ENUM_TYPE_EXTENSION: Kind = js.native
  val INPUT_OBJECT_TYPE_EXTENSION: Kind = js.native
}


@js.native
trait OperationDefinitionNode extends js.Object {
  val kind:Kind = js.native
  val operation:OperationTypeNode
}


@js.native
trait OperationTypeNode extends js.Object

object OperationTypeNode {
  @inline def QUERY = "query".asInstanceOf[OperationTypeNode]
  @inline def MUTATION = "mutation".asInstanceOf[OperationTypeNode]
  @inline def SUBSCRIPTION = "subscription".asInstanceOf[OperationTypeNode]
}

@js.native
trait FragmentDefinitionNode extends js.Object

@js.native
trait ValueNode extends js.Object

@js.native
trait GraphQLResolveInfo extends js.Object



@js.native
trait ExecutionResult extends js.Object