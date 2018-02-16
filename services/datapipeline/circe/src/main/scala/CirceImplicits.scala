package org.lyranthe.araethura.datapipeline
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val PutPipelineDefinitionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("errored" -> o.errored.asJson, "validationErrors" -> o.validationErrors.asJson, "validationWarnings" -> o.validationWarnings.asJson)
  }
  final implicit val QueryObjectsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.QueryObjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val DescribePipelinesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DescribePipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineIds" -> o.pipelineIds.asJson)
  }
  final implicit val ReportTaskRunnerHeartbeatOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatOutput] = io.circe.Encoder.instance { o => 
    Json.obj("terminate" -> o.terminate.asJson)
  }
  final implicit val FieldEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.Field] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "refValue" -> o.refValue.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val ValidatePipelineDefinitionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val CreatePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.CreatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "uniqueId" -> o.uniqueId.asJson, "description" -> o.description.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val OperatorEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.Operator] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "values" -> o.values.asJson)
  }
  final implicit val PipelineNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PipelineNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val QueryEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.Query] = io.circe.Encoder.instance { o => 
    Json.obj("selectors" -> o.selectors.asJson)
  }
  final implicit val GetPipelineDefinitionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "version" -> o.version.asJson)
  }
  final implicit val DescribePipelinesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DescribePipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineDescriptionList" -> o.pipelineDescriptionList.asJson)
  }
  final implicit val PutPipelineDefinitionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val ValidationErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ValidationError] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "errors" -> o.errors.asJson)
  }
  final implicit val SetTaskStatusInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.SetTaskStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "taskStatus" -> o.taskStatus.asJson, "errorId" -> o.errorId.asJson, "errorStackTrace" -> o.errorStackTrace.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val PipelineDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PipelineDescription] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "name" -> o.name.asJson, "fields" -> o.fields.asJson, "description" -> o.description.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ListPipelinesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ListPipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineIdList" -> o.pipelineIdList.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val CreatePipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.CreatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson)
  }
  final implicit val SetTaskStatusOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.SetTaskStatusOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeObjectsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DescribeObjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectIds" -> o.objectIds.asJson, "evaluateExpressions" -> o.evaluateExpressions.asJson, "marker" -> o.marker.asJson)
  }
  final implicit val ValidatePipelineDefinitionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("errored" -> o.errored.asJson, "validationErrors" -> o.validationErrors.asJson, "validationWarnings" -> o.validationWarnings.asJson)
  }
  final implicit val PipelineDeletedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PipelineDeletedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetPipelineDefinitionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val InternalServiceErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.InternalServiceError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SelectorEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.Selector] = io.circe.Encoder.instance { o => 
    Json.obj("fieldName" -> o.fieldName.asJson, "operator" -> o.operator.asJson)
  }
  final implicit val TaskObjectEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.TaskObject] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "pipelineId" -> o.pipelineId.asJson, "attemptId" -> o.attemptId.asJson, "objects" -> o.objects.asJson)
  }
  final implicit val InstanceIdentityEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.InstanceIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("document" -> o.document.asJson, "signature" -> o.signature.asJson)
  }
  final implicit val SetStatusInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.SetStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectIds" -> o.objectIds.asJson, "status" -> o.status.asJson)
  }
  final implicit val DeactivatePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DeactivatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "cancelActive" -> o.cancelActive.asJson)
  }
  final implicit val DeactivatePipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DeactivatePipelineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterObjectEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ParameterObject] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "attributes" -> o.attributes.asJson)
  }
  final implicit val ReportTaskRunnerHeartbeatInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskrunnerId" -> o.taskrunnerId.asJson, "hostname" -> o.hostname.asJson, "workerGroup" -> o.workerGroup.asJson)
  }
  final implicit val ParameterAttributeEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ParameterAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddTagsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.AddTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val RemoveTagsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.RemoveTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForTaskOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PollForTaskOutput] = io.circe.Encoder.instance { o => 
    Json.obj("taskObject" -> o.taskObject.asJson)
  }
  final implicit val PipelineObjectEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PipelineObject] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "fields" -> o.fields.asJson)
  }
  final implicit val ActivatePipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ActivatePipelineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForTaskInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PollForTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("workerGroup" -> o.workerGroup.asJson, "hostname" -> o.hostname.asJson, "instanceIdentity" -> o.instanceIdentity.asJson)
  }
  final implicit val ValidationWarningEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ValidationWarning] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "warnings" -> o.warnings.asJson)
  }
  final implicit val QueryObjectsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.QueryObjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "sphere" -> o.sphere.asJson, "marker" -> o.marker.asJson, "query" -> o.query.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val ParameterValueEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ParameterValue] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val PipelineIdNameEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.PipelineIdName] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson)
  }
  final implicit val ReportTaskProgressOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ReportTaskProgressOutput] = io.circe.Encoder.instance { o => 
    Json.obj("canceled" -> o.canceled.asJson)
  }
  final implicit val AddTagsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.AddTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.RemoveTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "tagKeys" -> o.tagKeys.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val DeletePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DeletePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson)
  }
  final implicit val EvaluateExpressionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.EvaluateExpressionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectId" -> o.objectId.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val TaskNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.TaskNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivatePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ActivatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "parameterValues" -> o.parameterValues.asJson, "startTimestamp" -> o.startTimestamp.asJson)
  }
  final implicit val DescribeObjectsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.DescribeObjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineObjects" -> o.pipelineObjects.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val ListPipelinesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ListPipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("marker" -> o.marker.asJson)
  }
  final implicit val ReportTaskProgressInputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.ReportTaskProgressInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "fields" -> o.fields.asJson)
  }
  final implicit val EvaluateExpressionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.datapipeline.models.EvaluateExpressionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("evaluatedExpression" -> o.evaluatedExpression.asJson)
  }
  final implicit val PutPipelineDefinitionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("errored"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ValidationError]]]("validationErrors"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ValidationWarning]]]("validationWarnings")).mapN(org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionOutput.apply _)
  }
  final implicit val QueryObjectsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.QueryObjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(org.lyranthe.araethura.datapipeline.models.QueryObjectsOutput.apply _)
  }
  final implicit val DescribePipelinesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DescribePipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("pipelineIds").map(org.lyranthe.araethura.datapipeline.models.DescribePipelinesInput.apply _)
  }
  final implicit val ReportTaskRunnerHeartbeatOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Boolean]("terminate").map(org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatOutput.apply _)
  }
  final implicit val FieldDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.Field] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("refValue"), o.get[scala.Option[java.lang.String]]("stringValue")).mapN(org.lyranthe.araethura.datapipeline.models.Field.apply _)
  }
  final implicit val ValidatePipelineDefinitionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterValue]]]("parameterValues")).mapN(org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionInput.apply _)
  }
  final implicit val CreatePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.CreatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("uniqueId"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.Tag]]]("tags")).mapN(org.lyranthe.araethura.datapipeline.models.CreatePipelineInput.apply _)
  }
  final implicit val OperatorDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.Operator] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.List[java.lang.String]]]("values")).mapN(org.lyranthe.araethura.datapipeline.models.Operator.apply _)
  }
  final implicit val PipelineNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PipelineNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.datapipeline.models.PipelineNotFoundException.apply _)
  }
  final implicit val QueryDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.Query] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.Selector]]]("selectors").map(org.lyranthe.araethura.datapipeline.models.Query.apply _)
  }
  final implicit val GetPipelineDefinitionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[java.lang.String]]("version")).mapN(org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionInput.apply _)
  }
  final implicit val DescribePipelinesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DescribePipelinesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineDescription]]("pipelineDescriptionList").map(org.lyranthe.araethura.datapipeline.models.DescribePipelinesOutput.apply _)
  }
  final implicit val PutPipelineDefinitionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterValue]]]("parameterValues")).mapN(org.lyranthe.araethura.datapipeline.models.PutPipelineDefinitionInput.apply _)
  }
  final implicit val ValidationErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ValidationError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[scala.List[java.lang.String]]]("errors")).mapN(org.lyranthe.araethura.datapipeline.models.ValidationError.apply _)
  }
  final implicit val SetTaskStatusInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.SetTaskStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskId"), o.get[java.lang.String]("taskStatus"), o.get[scala.Option[java.lang.String]]("errorId"), o.get[scala.Option[java.lang.String]]("errorStackTrace"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(org.lyranthe.araethura.datapipeline.models.SetTaskStatusInput.apply _)
  }
  final implicit val PipelineDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PipelineDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("name"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.Field]]("fields"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.Tag]]]("tags")).mapN(org.lyranthe.araethura.datapipeline.models.PipelineDescription.apply _)
  }
  final implicit val ListPipelinesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ListPipelinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineIdName]]("pipelineIdList"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(org.lyranthe.araethura.datapipeline.models.ListPipelinesOutput.apply _)
  }
  final implicit val CreatePipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.CreatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pipelineId").map(org.lyranthe.araethura.datapipeline.models.CreatePipelineOutput.apply _)
  }
  final implicit val SetTaskStatusOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.SetTaskStatusOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.datapipeline.models.SetTaskStatusOutput)
  final implicit val DescribeObjectsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DescribeObjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("objectIds"), o.get[scala.Option[scala.Boolean]]("evaluateExpressions"), o.get[scala.Option[java.lang.String]]("marker")).mapN(org.lyranthe.araethura.datapipeline.models.DescribeObjectsInput.apply _)
  }
  final implicit val ValidatePipelineDefinitionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("errored"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ValidationError]]]("validationErrors"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ValidationWarning]]]("validationWarnings")).mapN(org.lyranthe.araethura.datapipeline.models.ValidatePipelineDefinitionOutput.apply _)
  }
  final implicit val PipelineDeletedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PipelineDeletedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.datapipeline.models.PipelineDeletedException.apply _)
  }
  final implicit val GetPipelineDefinitionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineObject]]]("pipelineObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterValue]]]("parameterValues")).mapN(org.lyranthe.araethura.datapipeline.models.GetPipelineDefinitionOutput.apply _)
  }
  final implicit val InternalServiceErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.InternalServiceError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.datapipeline.models.InternalServiceError.apply _)
  }
  final implicit val SelectorDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.Selector] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("fieldName"), o.get[scala.Option[org.lyranthe.araethura.datapipeline.models.Operator]]("operator")).mapN(org.lyranthe.araethura.datapipeline.models.Selector.apply _)
  }
  final implicit val TaskObjectDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.TaskObject] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskId"), o.get[scala.Option[java.lang.String]]("pipelineId"), o.get[scala.Option[java.lang.String]]("attemptId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.datapipeline.models.PipelineObject]]]("objects")).mapN(org.lyranthe.araethura.datapipeline.models.TaskObject.apply _)
  }
  final implicit val InstanceIdentityDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.InstanceIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("document"), o.get[scala.Option[java.lang.String]]("signature")).mapN(org.lyranthe.araethura.datapipeline.models.InstanceIdentity.apply _)
  }
  final implicit val SetStatusInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.SetStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("objectIds"), o.get[java.lang.String]("status")).mapN(org.lyranthe.araethura.datapipeline.models.SetStatusInput.apply _)
  }
  final implicit val DeactivatePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DeactivatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[scala.Boolean]]("cancelActive")).mapN(org.lyranthe.araethura.datapipeline.models.DeactivatePipelineInput.apply _)
  }
  final implicit val DeactivatePipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DeactivatePipelineOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.datapipeline.models.DeactivatePipelineOutput)
  final implicit val ParameterObjectDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ParameterObject] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterAttribute]]("attributes")).mapN(org.lyranthe.araethura.datapipeline.models.ParameterObject.apply _)
  }
  final implicit val ReportTaskRunnerHeartbeatInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskrunnerId"), o.get[scala.Option[java.lang.String]]("hostname"), o.get[scala.Option[java.lang.String]]("workerGroup")).mapN(org.lyranthe.araethura.datapipeline.models.ReportTaskRunnerHeartbeatInput.apply _)
  }
  final implicit val ParameterAttributeDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ParameterAttribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("stringValue")).mapN(org.lyranthe.araethura.datapipeline.models.ParameterAttribute.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.datapipeline.models.InvalidRequestException.apply _)
  }
  final implicit val AddTagsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.AddTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.Tag]]("tags")).mapN(org.lyranthe.araethura.datapipeline.models.AddTagsInput.apply _)
  }
  final implicit val RemoveTagsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.RemoveTagsOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.datapipeline.models.RemoveTagsOutput)
  final implicit val PollForTaskOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PollForTaskOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.datapipeline.models.TaskObject]]("taskObject").map(org.lyranthe.araethura.datapipeline.models.PollForTaskOutput.apply _)
  }
  final implicit val PipelineObjectDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PipelineObject] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[scala.List[org.lyranthe.araethura.datapipeline.models.Field]]("fields")).mapN(org.lyranthe.araethura.datapipeline.models.PipelineObject.apply _)
  }
  final implicit val ActivatePipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ActivatePipelineOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.datapipeline.models.ActivatePipelineOutput)
  final implicit val PollForTaskInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PollForTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workerGroup"), o.get[scala.Option[java.lang.String]]("hostname"), o.get[scala.Option[org.lyranthe.araethura.datapipeline.models.InstanceIdentity]]("instanceIdentity")).mapN(org.lyranthe.araethura.datapipeline.models.PollForTaskInput.apply _)
  }
  final implicit val ValidationWarningDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ValidationWarning] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[scala.List[java.lang.String]]]("warnings")).mapN(org.lyranthe.araethura.datapipeline.models.ValidationWarning.apply _)
  }
  final implicit val QueryObjectsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.QueryObjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("sphere"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[org.lyranthe.araethura.datapipeline.models.Query]]("query"), o.get[scala.Option[scala.Int]]("limit")).mapN(org.lyranthe.araethura.datapipeline.models.QueryObjectsInput.apply _)
  }
  final implicit val ParameterValueDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ParameterValue] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("stringValue")).mapN(org.lyranthe.araethura.datapipeline.models.ParameterValue.apply _)
  }
  final implicit val PipelineIdNameDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.PipelineIdName] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.datapipeline.models.PipelineIdName.apply _)
  }
  final implicit val ReportTaskProgressOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ReportTaskProgressOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Boolean]("canceled").map(org.lyranthe.araethura.datapipeline.models.ReportTaskProgressOutput.apply _)
  }
  final implicit val AddTagsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.AddTagsOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.datapipeline.models.AddTagsOutput)
  final implicit val RemoveTagsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.RemoveTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("tagKeys")).mapN(org.lyranthe.araethura.datapipeline.models.RemoveTagsInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(org.lyranthe.araethura.datapipeline.models.Tag.apply _)
  }
  final implicit val DeletePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DeletePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pipelineId").map(org.lyranthe.araethura.datapipeline.models.DeletePipelineInput.apply _)
  }
  final implicit val EvaluateExpressionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.EvaluateExpressionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("objectId"), o.get[java.lang.String]("expression")).mapN(org.lyranthe.araethura.datapipeline.models.EvaluateExpressionInput.apply _)
  }
  final implicit val TaskNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.TaskNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.datapipeline.models.TaskNotFoundException.apply _)
  }
  final implicit val ActivatePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ActivatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.ParameterValue]]]("parameterValues"), o.get[scala.Option[java.time.Instant]]("startTimestamp")).mapN(org.lyranthe.araethura.datapipeline.models.ActivatePipelineInput.apply _)
  }
  final implicit val DescribeObjectsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.DescribeObjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.datapipeline.models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(org.lyranthe.araethura.datapipeline.models.DescribeObjectsOutput.apply _)
  }
  final implicit val ListPipelinesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ListPipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("marker").map(org.lyranthe.araethura.datapipeline.models.ListPipelinesInput.apply _)
  }
  final implicit val ReportTaskProgressInputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.ReportTaskProgressInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.datapipeline.models.Field]]]("fields")).mapN(org.lyranthe.araethura.datapipeline.models.ReportTaskProgressInput.apply _)
  }
  final implicit val EvaluateExpressionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.datapipeline.models.EvaluateExpressionOutput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("evaluatedExpression").map(org.lyranthe.araethura.datapipeline.models.EvaluateExpressionOutput.apply _)
  }
}