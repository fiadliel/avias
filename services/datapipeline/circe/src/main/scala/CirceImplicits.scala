package org.lyranthe.araethura.datapipeline
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val PutPipelineDefinitionOutputEncoder: io.circe.Encoder[models.PutPipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("errored" -> o.errored.asJson, "validationErrors" -> o.validationErrors.asJson, "validationWarnings" -> o.validationWarnings.asJson)
  }
  final implicit val QueryObjectsOutputEncoder: io.circe.Encoder[models.QueryObjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val DescribePipelinesInputEncoder: io.circe.Encoder[models.DescribePipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineIds" -> o.pipelineIds.asJson)
  }
  final implicit val ReportTaskRunnerHeartbeatOutputEncoder: io.circe.Encoder[models.ReportTaskRunnerHeartbeatOutput] = io.circe.Encoder.instance { o => 
    Json.obj("terminate" -> o.terminate.asJson)
  }
  final implicit val FieldEncoder: io.circe.Encoder[models.Field] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "refValue" -> o.refValue.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val ValidatePipelineDefinitionInputEncoder: io.circe.Encoder[models.ValidatePipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val CreatePipelineInputEncoder: io.circe.Encoder[models.CreatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "uniqueId" -> o.uniqueId.asJson, "description" -> o.description.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val OperatorEncoder: io.circe.Encoder[models.Operator] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "values" -> o.values.asJson)
  }
  final implicit val PipelineNotFoundExceptionEncoder: io.circe.Encoder[models.PipelineNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val QueryEncoder: io.circe.Encoder[models.Query] = io.circe.Encoder.instance { o => 
    Json.obj("selectors" -> o.selectors.asJson)
  }
  final implicit val GetPipelineDefinitionInputEncoder: io.circe.Encoder[models.GetPipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "version" -> o.version.asJson)
  }
  final implicit val DescribePipelinesOutputEncoder: io.circe.Encoder[models.DescribePipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineDescriptionList" -> o.pipelineDescriptionList.asJson)
  }
  final implicit val PutPipelineDefinitionInputEncoder: io.circe.Encoder[models.PutPipelineDefinitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val ValidationErrorEncoder: io.circe.Encoder[models.ValidationError] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "errors" -> o.errors.asJson)
  }
  final implicit val SetTaskStatusInputEncoder: io.circe.Encoder[models.SetTaskStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "taskStatus" -> o.taskStatus.asJson, "errorId" -> o.errorId.asJson, "errorStackTrace" -> o.errorStackTrace.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val PipelineDescriptionEncoder: io.circe.Encoder[models.PipelineDescription] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "name" -> o.name.asJson, "fields" -> o.fields.asJson, "description" -> o.description.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ListPipelinesOutputEncoder: io.circe.Encoder[models.ListPipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineIdList" -> o.pipelineIdList.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val CreatePipelineOutputEncoder: io.circe.Encoder[models.CreatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson)
  }
  final implicit val SetTaskStatusOutputEncoder: io.circe.Encoder[models.SetTaskStatusOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeObjectsInputEncoder: io.circe.Encoder[models.DescribeObjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectIds" -> o.objectIds.asJson, "evaluateExpressions" -> o.evaluateExpressions.asJson, "marker" -> o.marker.asJson)
  }
  final implicit val ValidatePipelineDefinitionOutputEncoder: io.circe.Encoder[models.ValidatePipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("errored" -> o.errored.asJson, "validationErrors" -> o.validationErrors.asJson, "validationWarnings" -> o.validationWarnings.asJson)
  }
  final implicit val PipelineDeletedExceptionEncoder: io.circe.Encoder[models.PipelineDeletedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetPipelineDefinitionOutputEncoder: io.circe.Encoder[models.GetPipelineDefinitionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineObjects" -> o.pipelineObjects.asJson, "parameterObjects" -> o.parameterObjects.asJson, "parameterValues" -> o.parameterValues.asJson)
  }
  final implicit val InternalServiceErrorEncoder: io.circe.Encoder[models.InternalServiceError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SelectorEncoder: io.circe.Encoder[models.Selector] = io.circe.Encoder.instance { o => 
    Json.obj("fieldName" -> o.fieldName.asJson, "operator" -> o.operator.asJson)
  }
  final implicit val TaskObjectEncoder: io.circe.Encoder[models.TaskObject] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "pipelineId" -> o.pipelineId.asJson, "attemptId" -> o.attemptId.asJson, "objects" -> o.objects.asJson)
  }
  final implicit val InstanceIdentityEncoder: io.circe.Encoder[models.InstanceIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("document" -> o.document.asJson, "signature" -> o.signature.asJson)
  }
  final implicit val SetStatusInputEncoder: io.circe.Encoder[models.SetStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectIds" -> o.objectIds.asJson, "status" -> o.status.asJson)
  }
  final implicit val DeactivatePipelineInputEncoder: io.circe.Encoder[models.DeactivatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "cancelActive" -> o.cancelActive.asJson)
  }
  final implicit val DeactivatePipelineOutputEncoder: io.circe.Encoder[models.DeactivatePipelineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterObjectEncoder: io.circe.Encoder[models.ParameterObject] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "attributes" -> o.attributes.asJson)
  }
  final implicit val ReportTaskRunnerHeartbeatInputEncoder: io.circe.Encoder[models.ReportTaskRunnerHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskrunnerId" -> o.taskrunnerId.asJson, "hostname" -> o.hostname.asJson, "workerGroup" -> o.workerGroup.asJson)
  }
  final implicit val ParameterAttributeEncoder: io.circe.Encoder[models.ParameterAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddTagsInputEncoder: io.circe.Encoder[models.AddTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val RemoveTagsOutputEncoder: io.circe.Encoder[models.RemoveTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForTaskOutputEncoder: io.circe.Encoder[models.PollForTaskOutput] = io.circe.Encoder.instance { o => 
    Json.obj("taskObject" -> o.taskObject.asJson)
  }
  final implicit val PipelineObjectEncoder: io.circe.Encoder[models.PipelineObject] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "fields" -> o.fields.asJson)
  }
  final implicit val ActivatePipelineOutputEncoder: io.circe.Encoder[models.ActivatePipelineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForTaskInputEncoder: io.circe.Encoder[models.PollForTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("workerGroup" -> o.workerGroup.asJson, "hostname" -> o.hostname.asJson, "instanceIdentity" -> o.instanceIdentity.asJson)
  }
  final implicit val ValidationWarningEncoder: io.circe.Encoder[models.ValidationWarning] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "warnings" -> o.warnings.asJson)
  }
  final implicit val QueryObjectsInputEncoder: io.circe.Encoder[models.QueryObjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "sphere" -> o.sphere.asJson, "marker" -> o.marker.asJson, "query" -> o.query.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val ParameterValueEncoder: io.circe.Encoder[models.ParameterValue] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "stringValue" -> o.stringValue.asJson)
  }
  final implicit val PipelineIdNameEncoder: io.circe.Encoder[models.PipelineIdName] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson)
  }
  final implicit val ReportTaskProgressOutputEncoder: io.circe.Encoder[models.ReportTaskProgressOutput] = io.circe.Encoder.instance { o => 
    Json.obj("canceled" -> o.canceled.asJson)
  }
  final implicit val AddTagsOutputEncoder: io.circe.Encoder[models.AddTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsInputEncoder: io.circe.Encoder[models.RemoveTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "tagKeys" -> o.tagKeys.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val DeletePipelineInputEncoder: io.circe.Encoder[models.DeletePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson)
  }
  final implicit val EvaluateExpressionInputEncoder: io.circe.Encoder[models.EvaluateExpressionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "objectId" -> o.objectId.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val TaskNotFoundExceptionEncoder: io.circe.Encoder[models.TaskNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivatePipelineInputEncoder: io.circe.Encoder[models.ActivatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineId" -> o.pipelineId.asJson, "parameterValues" -> o.parameterValues.asJson, "startTimestamp" -> o.startTimestamp.asJson)
  }
  final implicit val DescribeObjectsOutputEncoder: io.circe.Encoder[models.DescribeObjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineObjects" -> o.pipelineObjects.asJson, "marker" -> o.marker.asJson, "hasMoreResults" -> o.hasMoreResults.asJson)
  }
  final implicit val ListPipelinesInputEncoder: io.circe.Encoder[models.ListPipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("marker" -> o.marker.asJson)
  }
  final implicit val ReportTaskProgressInputEncoder: io.circe.Encoder[models.ReportTaskProgressInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "fields" -> o.fields.asJson)
  }
  final implicit val EvaluateExpressionOutputEncoder: io.circe.Encoder[models.EvaluateExpressionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("evaluatedExpression" -> o.evaluatedExpression.asJson)
  }
  final implicit val PutPipelineDefinitionOutputDecoder: io.circe.Decoder[models.PutPipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("errored"), o.get[scala.Option[scala.List[models.ValidationError]]]("validationErrors"), o.get[scala.Option[scala.List[models.ValidationWarning]]]("validationWarnings")).mapN(models.PutPipelineDefinitionOutput.apply _)
  }
  final implicit val QueryObjectsOutputDecoder: io.circe.Decoder[models.QueryObjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(models.QueryObjectsOutput.apply _)
  }
  final implicit val DescribePipelinesInputDecoder: io.circe.Decoder[models.DescribePipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("pipelineIds").map(models.DescribePipelinesInput.apply _)
  }
  final implicit val ReportTaskRunnerHeartbeatOutputDecoder: io.circe.Decoder[models.ReportTaskRunnerHeartbeatOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Boolean]("terminate").map(models.ReportTaskRunnerHeartbeatOutput.apply _)
  }
  final implicit val FieldDecoder: io.circe.Decoder[models.Field] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("refValue"), o.get[scala.Option[java.lang.String]]("stringValue")).mapN(models.Field.apply _)
  }
  final implicit val ValidatePipelineDefinitionInputDecoder: io.circe.Decoder[models.ValidatePipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[scala.List[models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[models.ParameterValue]]]("parameterValues")).mapN(models.ValidatePipelineDefinitionInput.apply _)
  }
  final implicit val CreatePipelineInputDecoder: io.circe.Decoder[models.CreatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("uniqueId"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[models.Tag]]]("tags")).mapN(models.CreatePipelineInput.apply _)
  }
  final implicit val OperatorDecoder: io.circe.Decoder[models.Operator] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.List[java.lang.String]]]("values")).mapN(models.Operator.apply _)
  }
  final implicit val PipelineNotFoundExceptionDecoder: io.circe.Decoder[models.PipelineNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.PipelineNotFoundException.apply _)
  }
  final implicit val QueryDecoder: io.circe.Decoder[models.Query] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Selector]]]("selectors").map(models.Query.apply _)
  }
  final implicit val GetPipelineDefinitionInputDecoder: io.circe.Decoder[models.GetPipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[java.lang.String]]("version")).mapN(models.GetPipelineDefinitionInput.apply _)
  }
  final implicit val DescribePipelinesOutputDecoder: io.circe.Decoder[models.DescribePipelinesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.PipelineDescription]]("pipelineDescriptionList").map(models.DescribePipelinesOutput.apply _)
  }
  final implicit val PutPipelineDefinitionInputDecoder: io.circe.Decoder[models.PutPipelineDefinitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[scala.List[models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[models.ParameterValue]]]("parameterValues")).mapN(models.PutPipelineDefinitionInput.apply _)
  }
  final implicit val ValidationErrorDecoder: io.circe.Decoder[models.ValidationError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[scala.List[java.lang.String]]]("errors")).mapN(models.ValidationError.apply _)
  }
  final implicit val SetTaskStatusInputDecoder: io.circe.Decoder[models.SetTaskStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskId"), o.get[java.lang.String]("taskStatus"), o.get[scala.Option[java.lang.String]]("errorId"), o.get[scala.Option[java.lang.String]]("errorStackTrace"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(models.SetTaskStatusInput.apply _)
  }
  final implicit val PipelineDescriptionDecoder: io.circe.Decoder[models.PipelineDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("name"), o.get[scala.List[models.Field]]("fields"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[models.Tag]]]("tags")).mapN(models.PipelineDescription.apply _)
  }
  final implicit val ListPipelinesOutputDecoder: io.circe.Decoder[models.ListPipelinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PipelineIdName]]("pipelineIdList"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(models.ListPipelinesOutput.apply _)
  }
  final implicit val CreatePipelineOutputDecoder: io.circe.Decoder[models.CreatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pipelineId").map(models.CreatePipelineOutput.apply _)
  }
  final implicit val SetTaskStatusOutputDecoder: io.circe.Decoder[models.SetTaskStatusOutput.type] = io.circe.Decoder.decodeUnit.as(models.SetTaskStatusOutput)
  final implicit val DescribeObjectsInputDecoder: io.circe.Decoder[models.DescribeObjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("objectIds"), o.get[scala.Option[scala.Boolean]]("evaluateExpressions"), o.get[scala.Option[java.lang.String]]("marker")).mapN(models.DescribeObjectsInput.apply _)
  }
  final implicit val ValidatePipelineDefinitionOutputDecoder: io.circe.Decoder[models.ValidatePipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("errored"), o.get[scala.Option[scala.List[models.ValidationError]]]("validationErrors"), o.get[scala.Option[scala.List[models.ValidationWarning]]]("validationWarnings")).mapN(models.ValidatePipelineDefinitionOutput.apply _)
  }
  final implicit val PipelineDeletedExceptionDecoder: io.circe.Decoder[models.PipelineDeletedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.PipelineDeletedException.apply _)
  }
  final implicit val GetPipelineDefinitionOutputDecoder: io.circe.Decoder[models.GetPipelineDefinitionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PipelineObject]]]("pipelineObjects"), o.get[scala.Option[scala.List[models.ParameterObject]]]("parameterObjects"), o.get[scala.Option[scala.List[models.ParameterValue]]]("parameterValues")).mapN(models.GetPipelineDefinitionOutput.apply _)
  }
  final implicit val InternalServiceErrorDecoder: io.circe.Decoder[models.InternalServiceError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalServiceError.apply _)
  }
  final implicit val SelectorDecoder: io.circe.Decoder[models.Selector] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("fieldName"), o.get[scala.Option[models.Operator]]("operator")).mapN(models.Selector.apply _)
  }
  final implicit val TaskObjectDecoder: io.circe.Decoder[models.TaskObject] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskId"), o.get[scala.Option[java.lang.String]]("pipelineId"), o.get[scala.Option[java.lang.String]]("attemptId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.PipelineObject]]]("objects")).mapN(models.TaskObject.apply _)
  }
  final implicit val InstanceIdentityDecoder: io.circe.Decoder[models.InstanceIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("document"), o.get[scala.Option[java.lang.String]]("signature")).mapN(models.InstanceIdentity.apply _)
  }
  final implicit val SetStatusInputDecoder: io.circe.Decoder[models.SetStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("objectIds"), o.get[java.lang.String]("status")).mapN(models.SetStatusInput.apply _)
  }
  final implicit val DeactivatePipelineInputDecoder: io.circe.Decoder[models.DeactivatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[scala.Boolean]]("cancelActive")).mapN(models.DeactivatePipelineInput.apply _)
  }
  final implicit val DeactivatePipelineOutputDecoder: io.circe.Decoder[models.DeactivatePipelineOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeactivatePipelineOutput)
  final implicit val ParameterObjectDecoder: io.circe.Decoder[models.ParameterObject] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.List[models.ParameterAttribute]]("attributes")).mapN(models.ParameterObject.apply _)
  }
  final implicit val ReportTaskRunnerHeartbeatInputDecoder: io.circe.Decoder[models.ReportTaskRunnerHeartbeatInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskrunnerId"), o.get[scala.Option[java.lang.String]]("hostname"), o.get[scala.Option[java.lang.String]]("workerGroup")).mapN(models.ReportTaskRunnerHeartbeatInput.apply _)
  }
  final implicit val ParameterAttributeDecoder: io.circe.Decoder[models.ParameterAttribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("stringValue")).mapN(models.ParameterAttribute.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidRequestException.apply _)
  }
  final implicit val AddTagsInputDecoder: io.circe.Decoder[models.AddTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[models.Tag]]("tags")).mapN(models.AddTagsInput.apply _)
  }
  final implicit val RemoveTagsOutputDecoder: io.circe.Decoder[models.RemoveTagsOutput.type] = io.circe.Decoder.decodeUnit.as(models.RemoveTagsOutput)
  final implicit val PollForTaskOutputDecoder: io.circe.Decoder[models.PollForTaskOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TaskObject]]("taskObject").map(models.PollForTaskOutput.apply _)
  }
  final implicit val PipelineObjectDecoder: io.circe.Decoder[models.PipelineObject] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[scala.List[models.Field]]("fields")).mapN(models.PipelineObject.apply _)
  }
  final implicit val ActivatePipelineOutputDecoder: io.circe.Decoder[models.ActivatePipelineOutput.type] = io.circe.Decoder.decodeUnit.as(models.ActivatePipelineOutput)
  final implicit val PollForTaskInputDecoder: io.circe.Decoder[models.PollForTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workerGroup"), o.get[scala.Option[java.lang.String]]("hostname"), o.get[scala.Option[models.InstanceIdentity]]("instanceIdentity")).mapN(models.PollForTaskInput.apply _)
  }
  final implicit val ValidationWarningDecoder: io.circe.Decoder[models.ValidationWarning] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[scala.List[java.lang.String]]]("warnings")).mapN(models.ValidationWarning.apply _)
  }
  final implicit val QueryObjectsInputDecoder: io.circe.Decoder[models.QueryObjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("sphere"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[models.Query]]("query"), o.get[scala.Option[scala.Int]]("limit")).mapN(models.QueryObjectsInput.apply _)
  }
  final implicit val ParameterValueDecoder: io.circe.Decoder[models.ParameterValue] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("stringValue")).mapN(models.ParameterValue.apply _)
  }
  final implicit val PipelineIdNameDecoder: io.circe.Decoder[models.PipelineIdName] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.PipelineIdName.apply _)
  }
  final implicit val ReportTaskProgressOutputDecoder: io.circe.Decoder[models.ReportTaskProgressOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Boolean]("canceled").map(models.ReportTaskProgressOutput.apply _)
  }
  final implicit val AddTagsOutputDecoder: io.circe.Decoder[models.AddTagsOutput.type] = io.circe.Decoder.decodeUnit.as(models.AddTagsOutput)
  final implicit val RemoveTagsInputDecoder: io.circe.Decoder[models.RemoveTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.List[java.lang.String]]("tagKeys")).mapN(models.RemoveTagsInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(models.Tag.apply _)
  }
  final implicit val DeletePipelineInputDecoder: io.circe.Decoder[models.DeletePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pipelineId").map(models.DeletePipelineInput.apply _)
  }
  final implicit val EvaluateExpressionInputDecoder: io.circe.Decoder[models.EvaluateExpressionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[java.lang.String]("objectId"), o.get[java.lang.String]("expression")).mapN(models.EvaluateExpressionInput.apply _)
  }
  final implicit val TaskNotFoundExceptionDecoder: io.circe.Decoder[models.TaskNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TaskNotFoundException.apply _)
  }
  final implicit val ActivatePipelineInputDecoder: io.circe.Decoder[models.ActivatePipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineId"), o.get[scala.Option[scala.List[models.ParameterValue]]]("parameterValues"), o.get[scala.Option[java.time.Instant]]("startTimestamp")).mapN(models.ActivatePipelineInput.apply _)
  }
  final implicit val DescribeObjectsOutputDecoder: io.circe.Decoder[models.DescribeObjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PipelineObject]]("pipelineObjects"), o.get[scala.Option[java.lang.String]]("marker"), o.get[scala.Option[scala.Boolean]]("hasMoreResults")).mapN(models.DescribeObjectsOutput.apply _)
  }
  final implicit val ListPipelinesInputDecoder: io.circe.Decoder[models.ListPipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("marker").map(models.ListPipelinesInput.apply _)
  }
  final implicit val ReportTaskProgressInputDecoder: io.circe.Decoder[models.ReportTaskProgressInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskId"), o.get[scala.Option[scala.List[models.Field]]]("fields")).mapN(models.ReportTaskProgressInput.apply _)
  }
  final implicit val EvaluateExpressionOutputDecoder: io.circe.Decoder[models.EvaluateExpressionOutput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("evaluatedExpression").map(models.EvaluateExpressionOutput.apply _)
  }
}