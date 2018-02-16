package avias.machinelearning
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val MLModelEncoder: io.circe.Encoder[avias.machinelearning.models.MLModel] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "TrainingDataSourceId" -> o.trainingDataSourceId.asJson, "TrainingParameters" -> o.trainingParameters.asJson, "ScoreThresholdLastUpdatedAt" -> o.scoreThresholdLastUpdatedAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "CreatedAt" -> o.createdAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "MLModelType" -> o.mlmodelType.asJson, "Status" -> o.status.asJson, "Algorithm" -> o.algorithm.asJson, "EndpointInfo" -> o.endpointInfo.asJson, "ScoreThreshold" -> o.scoreThreshold.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "SizeInBytes" -> o.sizeInBytes.asJson, "ComputeTime" -> o.computeTime.asJson, "Name" -> o.name.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val CreateMLModelOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateMLModelOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val BatchPredictionEncoder: io.circe.Encoder[avias.machinelearning.models.BatchPrediction] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson, "MLModelId" -> o.mlmodelId.asJson, "BatchPredictionDataSourceId" -> o.batchPredictionDataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "Name" -> o.name.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "OutputUri" -> o.outputUri.asJson, "ComputeTime" -> o.computeTime.asJson, "TotalRecordCount" -> o.totalRecordCount.asJson, "InvalidRecordCount" -> o.invalidRecordCount.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val GetEvaluationInputEncoder: io.circe.Encoder[avias.machinelearning.models.GetEvaluationInput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson)
  }
  final implicit val CreateBatchPredictionInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateBatchPredictionInput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson, "MLModelId" -> o.mlmodelId.asJson, "BatchPredictionDataSourceId" -> o.batchPredictionDataSourceId.asJson, "OutputUri" -> o.outputUri.asJson, "BatchPredictionName" -> o.batchPredictionName.asJson)
  }
  final implicit val DeleteMLModelOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteMLModelOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val IdempotentParameterMismatchExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.IdempotentParameterMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "code" -> o.code.asJson)
  }
  final implicit val CreateDataSourceFromRDSOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromRDSOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val EvaluationEncoder: io.circe.Encoder[avias.machinelearning.models.Evaluation] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson, "MLModelId" -> o.mlmodelId.asJson, "EvaluationDataSourceId" -> o.evaluationDataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "PerformanceMetrics" -> o.performanceMetrics.asJson, "Name" -> o.name.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "ComputeTime" -> o.computeTime.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val CreateBatchPredictionOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateBatchPredictionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson)
  }
  final implicit val DescribeBatchPredictionsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeBatchPredictionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeMLModelsInputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeMLModelsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SortOrder" -> o.sortOrder.asJson, "GT" -> o.gt.asJson, "LT" -> o.lt.asJson, "Prefix" -> o.prefix.asJson, "EQ" -> o.eq.asJson, "NE" -> o.ne.asJson, "GE" -> o.ge.asJson, "LE" -> o.le.asJson, "Limit" -> o.limit.asJson, "FilterVariable" -> o.filterVariable.asJson)
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "code" -> o.code.asJson)
  }
  final implicit val DescribeMLModelsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeMLModelsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RDSDatabaseCredentialsEncoder: io.circe.Encoder[avias.machinelearning.models.RDSDatabaseCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "Password" -> o.password.asJson)
  }
  final implicit val RDSDatabaseEncoder: io.circe.Encoder[avias.machinelearning.models.RDSDatabase] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceIdentifier" -> o.instanceIdentifier.asJson, "DatabaseName" -> o.databaseName.asJson)
  }
  final implicit val PredictOutputEncoder: io.circe.Encoder[avias.machinelearning.models.PredictOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Prediction" -> o.prediction.asJson)
  }
  final implicit val DescribeDataSourcesOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeDataSourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteEvaluationInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteEvaluationInput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson)
  }
  final implicit val DeleteRealtimeEndpointInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteRealtimeEndpointInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val DeleteDataSourceInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteDataSourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.TagLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeEvaluationsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeEvaluationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteTagsInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TagKeys" -> o.tagKeys.asJson, "ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val CreateDataSourceFromRDSInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromRDSInput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "RoleARN" -> o.roleARN.asJson, "RDSData" -> o.rdsdata.asJson, "ComputeStatistics" -> o.computeStatistics.asJson, "DataSourceName" -> o.dataSourceName.asJson)
  }
  final implicit val PredictionEncoder: io.circe.Encoder[avias.machinelearning.models.Prediction] = io.circe.Encoder.instance { o => 
    Json.obj("predictedLabel" -> o.predictedLabel.asJson, "predictedValue" -> o.predictedValue.asJson, "predictedScores" -> o.predictedScores.asJson, "details" -> o.details.asJson)
  }
  final implicit val CreateEvaluationInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateEvaluationInput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson, "MLModelId" -> o.mlmodelId.asJson, "EvaluationDataSourceId" -> o.evaluationDataSourceId.asJson, "EvaluationName" -> o.evaluationName.asJson)
  }
  final implicit val DeleteBatchPredictionInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteBatchPredictionInput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson)
  }
  final implicit val DeleteTagsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteTagsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val GetEvaluationOutputEncoder: io.circe.Encoder[avias.machinelearning.models.GetEvaluationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson, "MLModelId" -> o.mlmodelId.asJson, "EvaluationDataSourceId" -> o.evaluationDataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "PerformanceMetrics" -> o.performanceMetrics.asJson, "Name" -> o.name.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "LogUri" -> o.logUri.asJson, "ComputeTime" -> o.computeTime.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val UpdateBatchPredictionOutputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateBatchPredictionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson)
  }
  final implicit val UpdateBatchPredictionInputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateBatchPredictionInput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson, "BatchPredictionName" -> o.batchPredictionName.asJson)
  }
  final implicit val CreateRealtimeEndpointInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateRealtimeEndpointInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val PerformanceMetricsEncoder: io.circe.Encoder[avias.machinelearning.models.PerformanceMetrics] = io.circe.Encoder.instance { o => 
    Json.obj("Properties" -> o.properties.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "code" -> o.code.asJson)
  }
  final implicit val CreateEvaluationOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateEvaluationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson)
  }
  final implicit val RealtimeEndpointInfoEncoder: io.circe.Encoder[avias.machinelearning.models.RealtimeEndpointInfo] = io.circe.Encoder.instance { o => 
    Json.obj("PeakRequestsPerSecond" -> o.peakRequestsPerSecond.asJson, "CreatedAt" -> o.createdAt.asJson, "EndpointUrl" -> o.endpointUrl.asJson, "EndpointStatus" -> o.endpointStatus.asJson)
  }
  final implicit val GetMLModelOutputEncoder: io.circe.Encoder[avias.machinelearning.models.GetMLModelOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Schema" -> o.schema.asJson, "MLModelId" -> o.mlmodelId.asJson, "TrainingDataSourceId" -> o.trainingDataSourceId.asJson, "TrainingParameters" -> o.trainingParameters.asJson, "ScoreThresholdLastUpdatedAt" -> o.scoreThresholdLastUpdatedAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "CreatedAt" -> o.createdAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Recipe" -> o.recipe.asJson, "Message" -> o.message.asJson, "MLModelType" -> o.mlmodelType.asJson, "Status" -> o.status.asJson, "EndpointInfo" -> o.endpointInfo.asJson, "ScoreThreshold" -> o.scoreThreshold.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "LogUri" -> o.logUri.asJson, "SizeInBytes" -> o.sizeInBytes.asJson, "ComputeTime" -> o.computeTime.asJson, "Name" -> o.name.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val RedshiftDatabaseEncoder: io.circe.Encoder[avias.machinelearning.models.RedshiftDatabase] = io.circe.Encoder.instance { o => 
    Json.obj("DatabaseName" -> o.databaseName.asJson, "ClusterIdentifier" -> o.clusterIdentifier.asJson)
  }
  final implicit val GetDataSourceOutputEncoder: io.circe.Encoder[avias.machinelearning.models.GetDataSourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceSchema" -> o.dataSourceSchema.asJson, "DataSourceId" -> o.dataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "ComputeStatistics" -> o.computeStatistics.asJson, "Name" -> o.name.asJson, "DataRearrangement" -> o.dataRearrangement.asJson, "RedshiftMetadata" -> o.redshiftMetadata.asJson, "RoleARN" -> o.roleARN.asJson, "DataLocationS3" -> o.dataLocationS3.asJson, "LogUri" -> o.logUri.asJson, "RDSMetadata" -> o.rdsmetadata.asJson, "DataSizeInBytes" -> o.dataSizeInBytes.asJson, "NumberOfFiles" -> o.numberOfFiles.asJson, "ComputeTime" -> o.computeTime.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val CreateRealtimeEndpointOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateRealtimeEndpointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "RealtimeEndpointInfo" -> o.realtimeEndpointInfo.asJson)
  }
  final implicit val UpdateMLModelOutputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateMLModelOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val AddTagsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.AddTagsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val UpdateEvaluationOutputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateEvaluationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson)
  }
  final implicit val RedshiftMetadataEncoder: io.circe.Encoder[avias.machinelearning.models.RedshiftMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("RedshiftDatabase" -> o.redshiftDatabase.asJson, "DatabaseUserName" -> o.databaseUserName.asJson, "SelectSqlQuery" -> o.selectSqlQuery.asJson)
  }
  final implicit val DeleteRealtimeEndpointOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteRealtimeEndpointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "RealtimeEndpointInfo" -> o.realtimeEndpointInfo.asJson)
  }
  final implicit val GetDataSourceInputEncoder: io.circe.Encoder[avias.machinelearning.models.GetDataSourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "Verbose" -> o.verbose.asJson)
  }
  final implicit val RedshiftDataSpecEncoder: io.circe.Encoder[avias.machinelearning.models.RedshiftDataSpec] = io.circe.Encoder.instance { o => 
    Json.obj("DatabaseInformation" -> o.databaseInformation.asJson, "S3StagingLocation" -> o.s3StagingLocation.asJson, "DatabaseCredentials" -> o.databaseCredentials.asJson, "SelectSqlQuery" -> o.selectSqlQuery.asJson, "DataSchema" -> o.dataSchema.asJson, "DataRearrangement" -> o.dataRearrangement.asJson, "DataSchemaUri" -> o.dataSchemaUri.asJson)
  }
  final implicit val CreateMLModelInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateMLModelInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "TrainingDataSourceId" -> o.trainingDataSourceId.asJson, "MLModelType" -> o.mlmodelType.asJson, "Parameters" -> o.parameters.asJson, "Recipe" -> o.recipe.asJson, "MLModelName" -> o.mlmodelName.asJson, "RecipeUri" -> o.recipeUri.asJson)
  }
  final implicit val DeleteDataSourceOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteDataSourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val UpdateDataSourceOutputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateDataSourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val CreateDataSourceFromRedshiftOutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromRedshiftOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.machinelearning.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val AddTagsInputEncoder: io.circe.Encoder[avias.machinelearning.models.AddTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val DescribeBatchPredictionsInputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeBatchPredictionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SortOrder" -> o.sortOrder.asJson, "GT" -> o.gt.asJson, "LT" -> o.lt.asJson, "Prefix" -> o.prefix.asJson, "EQ" -> o.eq.asJson, "NE" -> o.ne.asJson, "GE" -> o.ge.asJson, "LE" -> o.le.asJson, "Limit" -> o.limit.asJson, "FilterVariable" -> o.filterVariable.asJson)
  }
  final implicit val RDSDataSpecEncoder: io.circe.Encoder[avias.machinelearning.models.RDSDataSpec] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetId" -> o.subnetId.asJson, "DatabaseCredentials" -> o.databaseCredentials.asJson, "DatabaseInformation" -> o.databaseInformation.asJson, "ServiceRole" -> o.serviceRole.asJson, "ResourceRole" -> o.resourceRole.asJson, "S3StagingLocation" -> o.s3StagingLocation.asJson, "SelectSqlQuery" -> o.selectSqlQuery.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "DataSchema" -> o.dataSchema.asJson, "DataRearrangement" -> o.dataRearrangement.asJson, "DataSchemaUri" -> o.dataSchemaUri.asJson)
  }
  final implicit val CreateDataSourceFromRedshiftInputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromRedshiftInput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "DataSpec" -> o.dataSpec.asJson, "RoleARN" -> o.roleARN.asJson, "ComputeStatistics" -> o.computeStatistics.asJson, "DataSourceName" -> o.dataSourceName.asJson)
  }
  final implicit val S3DataSpecEncoder: io.circe.Encoder[avias.machinelearning.models.S3DataSpec] = io.circe.Encoder.instance { o => 
    Json.obj("DataLocationS3" -> o.dataLocationS3.asJson, "DataSchemaLocationS3" -> o.dataSchemaLocationS3.asJson, "DataRearrangement" -> o.dataRearrangement.asJson, "DataSchema" -> o.dataSchema.asJson)
  }
  final implicit val DeleteBatchPredictionOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteBatchPredictionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson)
  }
  final implicit val PredictInputEncoder: io.circe.Encoder[avias.machinelearning.models.PredictInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "Record" -> o.record.asJson, "PredictEndpoint" -> o.predictEndpoint.asJson)
  }
  final implicit val UpdateMLModelInputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateMLModelInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "MLModelName" -> o.mlmodelName.asJson, "ScoreThreshold" -> o.scoreThreshold.asJson)
  }
  final implicit val DescribeDataSourcesInputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeDataSourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SortOrder" -> o.sortOrder.asJson, "GT" -> o.gt.asJson, "LT" -> o.lt.asJson, "Prefix" -> o.prefix.asJson, "EQ" -> o.eq.asJson, "NE" -> o.ne.asJson, "GE" -> o.ge.asJson, "LE" -> o.le.asJson, "Limit" -> o.limit.asJson, "FilterVariable" -> o.filterVariable.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "code" -> o.code.asJson)
  }
  final implicit val GetBatchPredictionOutputEncoder: io.circe.Encoder[avias.machinelearning.models.GetBatchPredictionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson, "MLModelId" -> o.mlmodelId.asJson, "BatchPredictionDataSourceId" -> o.batchPredictionDataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "Name" -> o.name.asJson, "InputDataLocationS3" -> o.inputDataLocationS3.asJson, "OutputUri" -> o.outputUri.asJson, "LogUri" -> o.logUri.asJson, "ComputeTime" -> o.computeTime.asJson, "TotalRecordCount" -> o.totalRecordCount.asJson, "InvalidRecordCount" -> o.invalidRecordCount.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val RedshiftDatabaseCredentialsEncoder: io.circe.Encoder[avias.machinelearning.models.RedshiftDatabaseCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "Password" -> o.password.asJson)
  }
  final implicit val DeleteEvaluationOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteEvaluationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson)
  }
  final implicit val CreateDataSourceFromS3InputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromS3Input] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "DataSpec" -> o.dataSpec.asJson, "DataSourceName" -> o.dataSourceName.asJson, "ComputeStatistics" -> o.computeStatistics.asJson)
  }
  final implicit val DeleteMLModelInputEncoder: io.circe.Encoder[avias.machinelearning.models.DeleteMLModelInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson)
  }
  final implicit val RDSMetadataEncoder: io.circe.Encoder[avias.machinelearning.models.RDSMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("Database" -> o.database.asJson, "ServiceRole" -> o.serviceRole.asJson, "DataPipelineId" -> o.dataPipelineId.asJson, "ResourceRole" -> o.resourceRole.asJson, "DatabaseUserName" -> o.databaseUserName.asJson, "SelectSqlQuery" -> o.selectSqlQuery.asJson)
  }
  final implicit val UpdateDataSourceInputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateDataSourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "DataSourceName" -> o.dataSourceName.asJson)
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.InvalidTagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "code" -> o.code.asJson)
  }
  final implicit val CreateDataSourceFromS3OutputEncoder: io.circe.Encoder[avias.machinelearning.models.CreateDataSourceFromS3Output] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson)
  }
  final implicit val DescribeTagsInputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val GetMLModelInputEncoder: io.circe.Encoder[avias.machinelearning.models.GetMLModelInput] = io.circe.Encoder.instance { o => 
    Json.obj("MLModelId" -> o.mlmodelId.asJson, "Verbose" -> o.verbose.asJson)
  }
  final implicit val DescribeTagsOutputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeTagsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetBatchPredictionInputEncoder: io.circe.Encoder[avias.machinelearning.models.GetBatchPredictionInput] = io.circe.Encoder.instance { o => 
    Json.obj("BatchPredictionId" -> o.batchPredictionId.asJson)
  }
  final implicit val UpdateEvaluationInputEncoder: io.circe.Encoder[avias.machinelearning.models.UpdateEvaluationInput] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationId" -> o.evaluationId.asJson, "EvaluationName" -> o.evaluationName.asJson)
  }
  final implicit val PredictorNotMountedExceptionEncoder: io.circe.Encoder[avias.machinelearning.models.PredictorNotMountedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeEvaluationsInputEncoder: io.circe.Encoder[avias.machinelearning.models.DescribeEvaluationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SortOrder" -> o.sortOrder.asJson, "GT" -> o.gt.asJson, "LT" -> o.lt.asJson, "Prefix" -> o.prefix.asJson, "EQ" -> o.eq.asJson, "NE" -> o.ne.asJson, "GE" -> o.ge.asJson, "LE" -> o.le.asJson, "Limit" -> o.limit.asJson, "FilterVariable" -> o.filterVariable.asJson)
  }
  final implicit val DataSourceEncoder: io.circe.Encoder[avias.machinelearning.models.DataSource] = io.circe.Encoder.instance { o => 
    Json.obj("DataSourceId" -> o.dataSourceId.asJson, "CreatedAt" -> o.createdAt.asJson, "LastUpdatedAt" -> o.lastUpdatedAt.asJson, "FinishedAt" -> o.finishedAt.asJson, "StartedAt" -> o.startedAt.asJson, "Message" -> o.message.asJson, "Status" -> o.status.asJson, "ComputeStatistics" -> o.computeStatistics.asJson, "Name" -> o.name.asJson, "DataRearrangement" -> o.dataRearrangement.asJson, "RedshiftMetadata" -> o.redshiftMetadata.asJson, "RoleARN" -> o.roleARN.asJson, "DataLocationS3" -> o.dataLocationS3.asJson, "RDSMetadata" -> o.rdsmetadata.asJson, "DataSizeInBytes" -> o.dataSizeInBytes.asJson, "NumberOfFiles" -> o.numberOfFiles.asJson, "ComputeTime" -> o.computeTime.asJson, "CreatedByIamUser" -> o.createdByIamUser.asJson)
  }
  final implicit val MLModelDecoder: io.circe.Decoder[avias.machinelearning.models.MLModel] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("TrainingDataSourceId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("TrainingParameters"), o.get[scala.Option[java.time.Instant]]("ScoreThresholdLastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("MLModelType"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Algorithm"), o.get[scala.Option[avias.machinelearning.models.RealtimeEndpointInfo]]("EndpointInfo"), o.get[scala.Option[scala.Float]]("ScoreThreshold"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[scala.Long]]("SizeInBytes"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.MLModel.apply _)
  }
  final implicit val CreateMLModelOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateMLModelOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MLModelId").map(avias.machinelearning.models.CreateMLModelOutput.apply _)
  }
  final implicit val BatchPredictionDecoder: io.circe.Decoder[avias.machinelearning.models.BatchPrediction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BatchPredictionId"), o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("BatchPredictionDataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[java.lang.String]]("OutputUri"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[scala.Long]]("TotalRecordCount"), o.get[scala.Option[scala.Long]]("InvalidRecordCount"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.BatchPrediction.apply _)
  }
  final implicit val GetEvaluationInputDecoder: io.circe.Decoder[avias.machinelearning.models.GetEvaluationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("EvaluationId").map(avias.machinelearning.models.GetEvaluationInput.apply _)
  }
  final implicit val CreateBatchPredictionInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateBatchPredictionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BatchPredictionId"), o.get[java.lang.String]("MLModelId"), o.get[java.lang.String]("BatchPredictionDataSourceId"), o.get[java.lang.String]("OutputUri"), o.get[scala.Option[java.lang.String]]("BatchPredictionName")).mapN(avias.machinelearning.models.CreateBatchPredictionInput.apply _)
  }
  final implicit val DeleteMLModelOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteMLModelOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MLModelId").map(avias.machinelearning.models.DeleteMLModelOutput.apply _)
  }
  final implicit val IdempotentParameterMismatchExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.IdempotentParameterMismatchException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Int]]("code")).mapN(avias.machinelearning.models.IdempotentParameterMismatchException.apply _)
  }
  final implicit val CreateDataSourceFromRDSOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromRDSOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DataSourceId").map(avias.machinelearning.models.CreateDataSourceFromRDSOutput.apply _)
  }
  final implicit val EvaluationDecoder: io.circe.Decoder[avias.machinelearning.models.Evaluation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EvaluationId"), o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("EvaluationDataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[avias.machinelearning.models.PerformanceMetrics]]("PerformanceMetrics"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.Evaluation.apply _)
  }
  final implicit val CreateBatchPredictionOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateBatchPredictionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BatchPredictionId").map(avias.machinelearning.models.CreateBatchPredictionOutput.apply _)
  }
  final implicit val DescribeBatchPredictionsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeBatchPredictionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.machinelearning.models.BatchPrediction]]]("Results"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.machinelearning.models.DescribeBatchPredictionsOutput.apply _)
  }
  final implicit val DescribeMLModelsInputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeMLModelsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[java.lang.String]]("GT"), o.get[scala.Option[java.lang.String]]("LT"), o.get[scala.Option[java.lang.String]]("Prefix"), o.get[scala.Option[java.lang.String]]("EQ"), o.get[scala.Option[java.lang.String]]("NE"), o.get[scala.Option[java.lang.String]]("GE"), o.get[scala.Option[java.lang.String]]("LE"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("FilterVariable")).mapN(avias.machinelearning.models.DescribeMLModelsInput.apply _)
  }
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.InternalServerException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Int]]("code")).mapN(avias.machinelearning.models.InternalServerException.apply _)
  }
  final implicit val DescribeMLModelsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeMLModelsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.machinelearning.models.MLModel]]]("Results"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.machinelearning.models.DescribeMLModelsOutput.apply _)
  }
  final implicit val RDSDatabaseCredentialsDecoder: io.circe.Decoder[avias.machinelearning.models.RDSDatabaseCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("Password")).mapN(avias.machinelearning.models.RDSDatabaseCredentials.apply _)
  }
  final implicit val RDSDatabaseDecoder: io.circe.Decoder[avias.machinelearning.models.RDSDatabase] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceIdentifier"), o.get[java.lang.String]("DatabaseName")).mapN(avias.machinelearning.models.RDSDatabase.apply _)
  }
  final implicit val PredictOutputDecoder: io.circe.Decoder[avias.machinelearning.models.PredictOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.machinelearning.models.Prediction]]("Prediction").map(avias.machinelearning.models.PredictOutput.apply _)
  }
  final implicit val DescribeDataSourcesOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeDataSourcesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.machinelearning.models.DataSource]]]("Results"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.machinelearning.models.DescribeDataSourcesOutput.apply _)
  }
  final implicit val DeleteEvaluationInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteEvaluationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("EvaluationId").map(avias.machinelearning.models.DeleteEvaluationInput.apply _)
  }
  final implicit val DeleteRealtimeEndpointInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteRealtimeEndpointInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("MLModelId").map(avias.machinelearning.models.DeleteRealtimeEndpointInput.apply _)
  }
  final implicit val DeleteDataSourceInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteDataSourceInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DataSourceId").map(avias.machinelearning.models.DeleteDataSourceInput.apply _)
  }
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.TagLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.machinelearning.models.TagLimitExceededException.apply _)
  }
  final implicit val DescribeEvaluationsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeEvaluationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.machinelearning.models.Evaluation]]]("Results"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.machinelearning.models.DescribeEvaluationsOutput.apply _)
  }
  final implicit val DeleteTagsInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("TagKeys"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ResourceType")).mapN(avias.machinelearning.models.DeleteTagsInput.apply _)
  }
  final implicit val CreateDataSourceFromRDSInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromRDSInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataSourceId"), o.get[java.lang.String]("RoleARN"), o.get[avias.machinelearning.models.RDSDataSpec]("RDSData"), o.get[scala.Option[scala.Boolean]]("ComputeStatistics"), o.get[scala.Option[java.lang.String]]("DataSourceName")).mapN(avias.machinelearning.models.CreateDataSourceFromRDSInput.apply _)
  }
  final implicit val PredictionDecoder: io.circe.Decoder[avias.machinelearning.models.Prediction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("predictedLabel"), o.get[scala.Option[scala.Float]]("predictedValue"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Float]]]("predictedScores"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("details")).mapN(avias.machinelearning.models.Prediction.apply _)
  }
  final implicit val CreateEvaluationInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateEvaluationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EvaluationId"), o.get[java.lang.String]("MLModelId"), o.get[java.lang.String]("EvaluationDataSourceId"), o.get[scala.Option[java.lang.String]]("EvaluationName")).mapN(avias.machinelearning.models.CreateEvaluationInput.apply _)
  }
  final implicit val DeleteBatchPredictionInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteBatchPredictionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BatchPredictionId").map(avias.machinelearning.models.DeleteBatchPredictionInput.apply _)
  }
  final implicit val DeleteTagsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteTagsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("ResourceType")).mapN(avias.machinelearning.models.DeleteTagsOutput.apply _)
  }
  final implicit val GetEvaluationOutputDecoder: io.circe.Decoder[avias.machinelearning.models.GetEvaluationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EvaluationId"), o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("EvaluationDataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[avias.machinelearning.models.PerformanceMetrics]]("PerformanceMetrics"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.GetEvaluationOutput.apply _)
  }
  final implicit val UpdateBatchPredictionOutputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateBatchPredictionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BatchPredictionId").map(avias.machinelearning.models.UpdateBatchPredictionOutput.apply _)
  }
  final implicit val UpdateBatchPredictionInputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateBatchPredictionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BatchPredictionId"), o.get[java.lang.String]("BatchPredictionName")).mapN(avias.machinelearning.models.UpdateBatchPredictionInput.apply _)
  }
  final implicit val CreateRealtimeEndpointInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateRealtimeEndpointInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("MLModelId").map(avias.machinelearning.models.CreateRealtimeEndpointInput.apply _)
  }
  final implicit val PerformanceMetricsDecoder: io.circe.Decoder[avias.machinelearning.models.PerformanceMetrics] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Properties").map(avias.machinelearning.models.PerformanceMetrics.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Int]]("code")).mapN(avias.machinelearning.models.InvalidInputException.apply _)
  }
  final implicit val CreateEvaluationOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateEvaluationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EvaluationId").map(avias.machinelearning.models.CreateEvaluationOutput.apply _)
  }
  final implicit val RealtimeEndpointInfoDecoder: io.circe.Decoder[avias.machinelearning.models.RealtimeEndpointInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("PeakRequestsPerSecond"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("EndpointUrl"), o.get[scala.Option[java.lang.String]]("EndpointStatus")).mapN(avias.machinelearning.models.RealtimeEndpointInfo.apply _)
  }
  final implicit val GetMLModelOutputDecoder: io.circe.Decoder[avias.machinelearning.models.GetMLModelOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Schema"), o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("TrainingDataSourceId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("TrainingParameters"), o.get[scala.Option[java.time.Instant]]("ScoreThresholdLastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Recipe"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("MLModelType"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[avias.machinelearning.models.RealtimeEndpointInfo]]("EndpointInfo"), o.get[scala.Option[scala.Float]]("ScoreThreshold"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[scala.Long]]("SizeInBytes"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.GetMLModelOutput.apply _)
  }
  final implicit val RedshiftDatabaseDecoder: io.circe.Decoder[avias.machinelearning.models.RedshiftDatabase] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DatabaseName"), o.get[java.lang.String]("ClusterIdentifier")).mapN(avias.machinelearning.models.RedshiftDatabase.apply _)
  }
  final implicit val GetDataSourceOutputDecoder: io.circe.Decoder[avias.machinelearning.models.GetDataSourceOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DataSourceSchema"), o.get[scala.Option[java.lang.String]]("DataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Boolean]]("ComputeStatistics"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DataRearrangement"), o.get[scala.Option[avias.machinelearning.models.RedshiftMetadata]]("RedshiftMetadata"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("DataLocationS3"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[avias.machinelearning.models.RDSMetadata]]("RDSMetadata"), o.get[scala.Option[scala.Long]]("DataSizeInBytes"), o.get[scala.Option[scala.Long]]("NumberOfFiles"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.GetDataSourceOutput.apply _)
  }
  final implicit val CreateRealtimeEndpointOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateRealtimeEndpointOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[avias.machinelearning.models.RealtimeEndpointInfo]]("RealtimeEndpointInfo")).mapN(avias.machinelearning.models.CreateRealtimeEndpointOutput.apply _)
  }
  final implicit val UpdateMLModelOutputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateMLModelOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MLModelId").map(avias.machinelearning.models.UpdateMLModelOutput.apply _)
  }
  final implicit val AddTagsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.AddTagsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("ResourceType")).mapN(avias.machinelearning.models.AddTagsOutput.apply _)
  }
  final implicit val UpdateEvaluationOutputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateEvaluationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EvaluationId").map(avias.machinelearning.models.UpdateEvaluationOutput.apply _)
  }
  final implicit val RedshiftMetadataDecoder: io.circe.Decoder[avias.machinelearning.models.RedshiftMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.machinelearning.models.RedshiftDatabase]]("RedshiftDatabase"), o.get[scala.Option[java.lang.String]]("DatabaseUserName"), o.get[scala.Option[java.lang.String]]("SelectSqlQuery")).mapN(avias.machinelearning.models.RedshiftMetadata.apply _)
  }
  final implicit val DeleteRealtimeEndpointOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteRealtimeEndpointOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[avias.machinelearning.models.RealtimeEndpointInfo]]("RealtimeEndpointInfo")).mapN(avias.machinelearning.models.DeleteRealtimeEndpointOutput.apply _)
  }
  final implicit val GetDataSourceInputDecoder: io.circe.Decoder[avias.machinelearning.models.GetDataSourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataSourceId"), o.get[scala.Option[scala.Boolean]]("Verbose")).mapN(avias.machinelearning.models.GetDataSourceInput.apply _)
  }
  final implicit val RedshiftDataSpecDecoder: io.circe.Decoder[avias.machinelearning.models.RedshiftDataSpec] = io.circe.Decoder.instance { o => 
    (o.get[avias.machinelearning.models.RedshiftDatabase]("DatabaseInformation"), o.get[java.lang.String]("S3StagingLocation"), o.get[avias.machinelearning.models.RedshiftDatabaseCredentials]("DatabaseCredentials"), o.get[java.lang.String]("SelectSqlQuery"), o.get[scala.Option[java.lang.String]]("DataSchema"), o.get[scala.Option[java.lang.String]]("DataRearrangement"), o.get[scala.Option[java.lang.String]]("DataSchemaUri")).mapN(avias.machinelearning.models.RedshiftDataSpec.apply _)
  }
  final implicit val CreateMLModelInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateMLModelInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MLModelId"), o.get[java.lang.String]("TrainingDataSourceId"), o.get[java.lang.String]("MLModelType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Parameters"), o.get[scala.Option[java.lang.String]]("Recipe"), o.get[scala.Option[java.lang.String]]("MLModelName"), o.get[scala.Option[java.lang.String]]("RecipeUri")).mapN(avias.machinelearning.models.CreateMLModelInput.apply _)
  }
  final implicit val DeleteDataSourceOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteDataSourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DataSourceId").map(avias.machinelearning.models.DeleteDataSourceOutput.apply _)
  }
  final implicit val UpdateDataSourceOutputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateDataSourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DataSourceId").map(avias.machinelearning.models.UpdateDataSourceOutput.apply _)
  }
  final implicit val CreateDataSourceFromRedshiftOutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromRedshiftOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DataSourceId").map(avias.machinelearning.models.CreateDataSourceFromRedshiftOutput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.machinelearning.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.machinelearning.models.Tag.apply _)
  }
  final implicit val AddTagsInputDecoder: io.circe.Decoder[avias.machinelearning.models.AddTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.machinelearning.models.Tag]]("Tags"), o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ResourceType")).mapN(avias.machinelearning.models.AddTagsInput.apply _)
  }
  final implicit val DescribeBatchPredictionsInputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeBatchPredictionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[java.lang.String]]("GT"), o.get[scala.Option[java.lang.String]]("LT"), o.get[scala.Option[java.lang.String]]("Prefix"), o.get[scala.Option[java.lang.String]]("EQ"), o.get[scala.Option[java.lang.String]]("NE"), o.get[scala.Option[java.lang.String]]("GE"), o.get[scala.Option[java.lang.String]]("LE"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("FilterVariable")).mapN(avias.machinelearning.models.DescribeBatchPredictionsInput.apply _)
  }
  final implicit val RDSDataSpecDecoder: io.circe.Decoder[avias.machinelearning.models.RDSDataSpec] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetId"), o.get[avias.machinelearning.models.RDSDatabaseCredentials]("DatabaseCredentials"), o.get[avias.machinelearning.models.RDSDatabase]("DatabaseInformation"), o.get[java.lang.String]("ServiceRole"), o.get[java.lang.String]("ResourceRole"), o.get[java.lang.String]("S3StagingLocation"), o.get[java.lang.String]("SelectSqlQuery"), o.get[scala.List[java.lang.String]]("SecurityGroupIds"), o.get[scala.Option[java.lang.String]]("DataSchema"), o.get[scala.Option[java.lang.String]]("DataRearrangement"), o.get[scala.Option[java.lang.String]]("DataSchemaUri")).mapN(avias.machinelearning.models.RDSDataSpec.apply _)
  }
  final implicit val CreateDataSourceFromRedshiftInputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromRedshiftInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataSourceId"), o.get[avias.machinelearning.models.RedshiftDataSpec]("DataSpec"), o.get[java.lang.String]("RoleARN"), o.get[scala.Option[scala.Boolean]]("ComputeStatistics"), o.get[scala.Option[java.lang.String]]("DataSourceName")).mapN(avias.machinelearning.models.CreateDataSourceFromRedshiftInput.apply _)
  }
  final implicit val S3DataSpecDecoder: io.circe.Decoder[avias.machinelearning.models.S3DataSpec] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataLocationS3"), o.get[scala.Option[java.lang.String]]("DataSchemaLocationS3"), o.get[scala.Option[java.lang.String]]("DataRearrangement"), o.get[scala.Option[java.lang.String]]("DataSchema")).mapN(avias.machinelearning.models.S3DataSpec.apply _)
  }
  final implicit val DeleteBatchPredictionOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteBatchPredictionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BatchPredictionId").map(avias.machinelearning.models.DeleteBatchPredictionOutput.apply _)
  }
  final implicit val PredictInputDecoder: io.circe.Decoder[avias.machinelearning.models.PredictInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MLModelId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Record"), o.get[java.lang.String]("PredictEndpoint")).mapN(avias.machinelearning.models.PredictInput.apply _)
  }
  final implicit val UpdateMLModelInputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateMLModelInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MLModelId"), o.get[scala.Option[java.lang.String]]("MLModelName"), o.get[scala.Option[scala.Float]]("ScoreThreshold")).mapN(avias.machinelearning.models.UpdateMLModelInput.apply _)
  }
  final implicit val DescribeDataSourcesInputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeDataSourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[java.lang.String]]("GT"), o.get[scala.Option[java.lang.String]]("LT"), o.get[scala.Option[java.lang.String]]("Prefix"), o.get[scala.Option[java.lang.String]]("EQ"), o.get[scala.Option[java.lang.String]]("NE"), o.get[scala.Option[java.lang.String]]("GE"), o.get[scala.Option[java.lang.String]]("LE"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("FilterVariable")).mapN(avias.machinelearning.models.DescribeDataSourcesInput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Int]]("code")).mapN(avias.machinelearning.models.ResourceNotFoundException.apply _)
  }
  final implicit val GetBatchPredictionOutputDecoder: io.circe.Decoder[avias.machinelearning.models.GetBatchPredictionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BatchPredictionId"), o.get[scala.Option[java.lang.String]]("MLModelId"), o.get[scala.Option[java.lang.String]]("BatchPredictionDataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InputDataLocationS3"), o.get[scala.Option[java.lang.String]]("OutputUri"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[scala.Long]]("TotalRecordCount"), o.get[scala.Option[scala.Long]]("InvalidRecordCount"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.GetBatchPredictionOutput.apply _)
  }
  final implicit val RedshiftDatabaseCredentialsDecoder: io.circe.Decoder[avias.machinelearning.models.RedshiftDatabaseCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("Password")).mapN(avias.machinelearning.models.RedshiftDatabaseCredentials.apply _)
  }
  final implicit val DeleteEvaluationOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteEvaluationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EvaluationId").map(avias.machinelearning.models.DeleteEvaluationOutput.apply _)
  }
  final implicit val CreateDataSourceFromS3InputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromS3Input] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataSourceId"), o.get[avias.machinelearning.models.S3DataSpec]("DataSpec"), o.get[scala.Option[java.lang.String]]("DataSourceName"), o.get[scala.Option[scala.Boolean]]("ComputeStatistics")).mapN(avias.machinelearning.models.CreateDataSourceFromS3Input.apply _)
  }
  final implicit val DeleteMLModelInputDecoder: io.circe.Decoder[avias.machinelearning.models.DeleteMLModelInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("MLModelId").map(avias.machinelearning.models.DeleteMLModelInput.apply _)
  }
  final implicit val RDSMetadataDecoder: io.circe.Decoder[avias.machinelearning.models.RDSMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.machinelearning.models.RDSDatabase]]("Database"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[java.lang.String]]("DataPipelineId"), o.get[scala.Option[java.lang.String]]("ResourceRole"), o.get[scala.Option[java.lang.String]]("DatabaseUserName"), o.get[scala.Option[java.lang.String]]("SelectSqlQuery")).mapN(avias.machinelearning.models.RDSMetadata.apply _)
  }
  final implicit val UpdateDataSourceInputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateDataSourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataSourceId"), o.get[java.lang.String]("DataSourceName")).mapN(avias.machinelearning.models.UpdateDataSourceInput.apply _)
  }
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.InvalidTagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.machinelearning.models.InvalidTagException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Int]]("code")).mapN(avias.machinelearning.models.LimitExceededException.apply _)
  }
  final implicit val CreateDataSourceFromS3OutputDecoder: io.circe.Decoder[avias.machinelearning.models.CreateDataSourceFromS3Output] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DataSourceId").map(avias.machinelearning.models.CreateDataSourceFromS3Output.apply _)
  }
  final implicit val DescribeTagsInputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("ResourceType")).mapN(avias.machinelearning.models.DescribeTagsInput.apply _)
  }
  final implicit val GetMLModelInputDecoder: io.circe.Decoder[avias.machinelearning.models.GetMLModelInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MLModelId"), o.get[scala.Option[scala.Boolean]]("Verbose")).mapN(avias.machinelearning.models.GetMLModelInput.apply _)
  }
  final implicit val DescribeTagsOutputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeTagsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[scala.List[avias.machinelearning.models.Tag]]]("Tags")).mapN(avias.machinelearning.models.DescribeTagsOutput.apply _)
  }
  final implicit val GetBatchPredictionInputDecoder: io.circe.Decoder[avias.machinelearning.models.GetBatchPredictionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BatchPredictionId").map(avias.machinelearning.models.GetBatchPredictionInput.apply _)
  }
  final implicit val UpdateEvaluationInputDecoder: io.circe.Decoder[avias.machinelearning.models.UpdateEvaluationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EvaluationId"), o.get[java.lang.String]("EvaluationName")).mapN(avias.machinelearning.models.UpdateEvaluationInput.apply _)
  }
  final implicit val PredictorNotMountedExceptionDecoder: io.circe.Decoder[avias.machinelearning.models.PredictorNotMountedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.machinelearning.models.PredictorNotMountedException.apply _)
  }
  final implicit val DescribeEvaluationsInputDecoder: io.circe.Decoder[avias.machinelearning.models.DescribeEvaluationsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[java.lang.String]]("GT"), o.get[scala.Option[java.lang.String]]("LT"), o.get[scala.Option[java.lang.String]]("Prefix"), o.get[scala.Option[java.lang.String]]("EQ"), o.get[scala.Option[java.lang.String]]("NE"), o.get[scala.Option[java.lang.String]]("GE"), o.get[scala.Option[java.lang.String]]("LE"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("FilterVariable")).mapN(avias.machinelearning.models.DescribeEvaluationsInput.apply _)
  }
  final implicit val DataSourceDecoder: io.circe.Decoder[avias.machinelearning.models.DataSource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DataSourceId"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("LastUpdatedAt"), o.get[scala.Option[java.time.Instant]]("FinishedAt"), o.get[scala.Option[java.time.Instant]]("StartedAt"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Boolean]]("ComputeStatistics"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DataRearrangement"), o.get[scala.Option[avias.machinelearning.models.RedshiftMetadata]]("RedshiftMetadata"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("DataLocationS3"), o.get[scala.Option[avias.machinelearning.models.RDSMetadata]]("RDSMetadata"), o.get[scala.Option[scala.Long]]("DataSizeInBytes"), o.get[scala.Option[scala.Long]]("NumberOfFiles"), o.get[scala.Option[scala.Long]]("ComputeTime"), o.get[scala.Option[java.lang.String]]("CreatedByIamUser")).mapN(avias.machinelearning.models.DataSource.apply _)
  }
}