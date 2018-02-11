
lazy val `common-core` = project.in(file("common/core"))
lazy val `common-circe` = project.in(file("common/circe")).settings(Dependencies.circe).dependsOn(`common-core`)
lazy val `common-http4s` = project.in(file("common/http4s")).settings(Dependencies.http4s).dependsOn(`common-circe`)

lazy val `codebuild` = project.in(file("services/codebuild/core"))
lazy val `codebuild-circe` = project.in(file("services/codebuild/circe")).dependsOn(`common-circe`, `codebuild`)
lazy val `codebuild-http4s` = project.in(file("services/codebuild/http4s")).dependsOn(`common-http4s`, `codebuild-circe`)

lazy val `kinesis` = project.in(file("services/kinesis/core"))
lazy val `kinesis-circe` = project.in(file("services/kinesis/circe")).dependsOn(`common-circe`, `kinesis`)
lazy val `kinesis-http4s` = project.in(file("services/kinesis/http4s")).dependsOn(`common-http4s`, `kinesis-circe`)

lazy val `kinesisanalytics` = project.in(file("services/kinesisanalytics/core"))
lazy val `kinesisanalytics-circe` = project.in(file("services/kinesisanalytics/circe")).dependsOn(`common-circe`, `kinesisanalytics`)
lazy val `kinesisanalytics-http4s` = project.in(file("services/kinesisanalytics/http4s")).dependsOn(`common-http4s`, `kinesisanalytics-circe`)

lazy val `kinesisfirehose` = project.in(file("services/kinesisfirehose/core"))
lazy val `kinesisfirehose-circe` = project.in(file("services/kinesisfirehose/circe")).dependsOn(`common-circe`, `kinesisfirehose`)
lazy val `kinesisfirehose-http4s` = project.in(file("services/kinesisfirehose/http4s")).dependsOn(`common-http4s`, `kinesisfirehose-circe`)

lazy val `organizations` = project.in(file("services/organizations/core"))
lazy val `organizations-circe` = project.in(file("services/organizations/circe")).dependsOn(`common-circe`, `organizations`)
lazy val `organizations-http4s` = project.in(file("services/organizations/http4s")).dependsOn(`common-http4s`, `organizations-circe`)

lazy val `shield` = project.in(file("services/shield/core"))
lazy val `shield-circe` = project.in(file("services/shield/circe")).dependsOn(`common-circe`, `shield`)
lazy val `shield-http4s` = project.in(file("services/shield/http4s")).dependsOn(`common-http4s`, `shield-circe`)

lazy val `ssm` = project.in(file("services/ssm/core"))
lazy val `ssm-circe` = project.in(file("services/ssm/circe")).dependsOn(`common-circe`, `ssm`)
lazy val `ssm-http4s` = project.in(file("services/ssm/http4s")).dependsOn(`common-http4s`, `ssm-circe`)

lazy val `servicecatalog` = project.in(file("services/servicecatalog/core"))
lazy val `servicecatalog-circe` = project.in(file("services/servicecatalog/circe")).dependsOn(`common-circe`, `servicecatalog`)
lazy val `servicecatalog-http4s` = project.in(file("services/servicecatalog/http4s")).dependsOn(`common-http4s`, `servicecatalog-circe`)

lazy val `kms` = project.in(file("services/kms/core"))
lazy val `kms-circe` = project.in(file("services/kms/circe")).dependsOn(`common-circe`, `kms`)
lazy val `kms-http4s` = project.in(file("services/kms/http4s")).dependsOn(`common-http4s`, `kms-circe`)

lazy val `emr` = project.in(file("services/emr/core"))
lazy val `emr-circe` = project.in(file("services/emr/circe")).dependsOn(`common-circe`, `emr`)
lazy val `emr-http4s` = project.in(file("services/emr/http4s")).dependsOn(`common-http4s`, `emr-circe`)

lazy val `cloudhsm` = project.in(file("services/cloudhsm/core"))
lazy val `cloudhsm-circe` = project.in(file("services/cloudhsm/circe")).dependsOn(`common-circe`, `cloudhsm`)
lazy val `cloudhsm-http4s` = project.in(file("services/cloudhsm/http4s")).dependsOn(`common-http4s`, `cloudhsm-circe`)

lazy val `cognitoidentity` = project.in(file("services/cognitoidentity/core"))
lazy val `cognitoidentity-circe` = project.in(file("services/cognitoidentity/circe")).dependsOn(`common-circe`, `cognitoidentity`)
lazy val `cognitoidentity-http4s` = project.in(file("services/cognitoidentity/http4s")).dependsOn(`common-http4s`, `cognitoidentity-circe`)

lazy val `config` = project.in(file("services/config/core"))
lazy val `config-circe` = project.in(file("services/config/circe")).dependsOn(`common-circe`, `config`)
lazy val `config-http4s` = project.in(file("services/config/http4s")).dependsOn(`common-http4s`, `config-circe`)

lazy val `inspector` = project.in(file("services/inspector/core"))
lazy val `inspector-circe` = project.in(file("services/inspector/circe")).dependsOn(`common-circe`, `inspector`)
lazy val `inspector-http4s` = project.in(file("services/inspector/http4s")).dependsOn(`common-http4s`, `inspector-circe`)

lazy val `marketplacecommerceanalytics` = project.in(file("services/marketplacecommerceanalytics/core"))
lazy val `marketplacecommerceanalytics-circe` = project.in(file("services/marketplacecommerceanalytics/circe")).dependsOn(`common-circe`, `marketplacecommerceanalytics`)
lazy val `marketplacecommerceanalytics-http4s` = project.in(file("services/marketplacecommerceanalytics/http4s")).dependsOn(`common-http4s`, `marketplacecommerceanalytics-circe`)

lazy val `mechanicalturkrequester` = project.in(file("services/mechanicalturkrequester/core"))
lazy val `mechanicalturkrequester-circe` = project.in(file("services/mechanicalturkrequester/circe")).dependsOn(`common-circe`, `mechanicalturkrequester`)
lazy val `mechanicalturkrequester-http4s` = project.in(file("services/mechanicalturkrequester/http4s")).dependsOn(`common-http4s`, `mechanicalturkrequester-circe`)

lazy val `marketplacemeteringservice` = project.in(file("services/marketplacemeteringservice/core"))
lazy val `marketplacemeteringservice-circe` = project.in(file("services/marketplacemeteringservice/circe")).dependsOn(`common-circe`, `marketplacemeteringservice`)
lazy val `marketplacemeteringservice-http4s` = project.in(file("services/marketplacemeteringservice/http4s")).dependsOn(`common-http4s`, `marketplacemeteringservice-circe`)

lazy val `cognitoidp` = project.in(file("services/cognitoidp/core"))
lazy val `cognitoidp-circe` = project.in(file("services/cognitoidp/circe")).dependsOn(`common-circe`, `cognitoidp`)
lazy val `cognitoidp-http4s` = project.in(file("services/cognitoidp/http4s")).dependsOn(`common-http4s`, `cognitoidp-circe`)

lazy val `health` = project.in(file("services/health/core"))
lazy val `health-circe` = project.in(file("services/health/circe")).dependsOn(`common-circe`, `health`)
lazy val `health-http4s` = project.in(file("services/health/http4s")).dependsOn(`common-http4s`, `health-circe`)

lazy val `lightsail` = project.in(file("services/lightsail/core"))
lazy val `lightsail-circe` = project.in(file("services/lightsail/circe")).dependsOn(`common-circe`, `lightsail`)
lazy val `lightsail-http4s` = project.in(file("services/lightsail/http4s")).dependsOn(`common-http4s`, `lightsail-circe`)

lazy val `discovery` = project.in(file("services/discovery/core"))
lazy val `discovery-circe` = project.in(file("services/discovery/circe")).dependsOn(`common-circe`, `discovery`)
lazy val `discovery-http4s` = project.in(file("services/discovery/http4s")).dependsOn(`common-http4s`, `discovery-circe`)

lazy val `ecr` = project.in(file("services/ecr/core"))
lazy val `ecr-circe` = project.in(file("services/ecr/circe")).dependsOn(`common-circe`, `ecr`)
lazy val `ecr-http4s` = project.in(file("services/ecr/http4s")).dependsOn(`common-http4s`, `ecr-circe`)

lazy val `dynamodb` = project.in(file("services/dynamodb/core"))
lazy val `dynamodb-circe` = project.in(file("services/dynamodb/circe")).dependsOn(`common-circe`, `dynamodb`)
lazy val `dynamodb-http4s` = project.in(file("services/dynamodb/http4s")).dependsOn(`common-http4s`, `dynamodb-circe`)

lazy val `dynamodbstreams` = project.in(file("services/dynamodbstreams/core"))
lazy val `dynamodbstreams-circe` = project.in(file("services/dynamodbstreams/circe")).dependsOn(`common-circe`, `dynamodbstreams`)
lazy val `dynamodbstreams-http4s` = project.in(file("services/dynamodbstreams/http4s")).dependsOn(`common-http4s`, `dynamodbstreams-circe`)

lazy val `applicationautoscaling` = project.in(file("services/applicationautoscaling/core"))
lazy val `applicationautoscaling-circe` = project.in(file("services/applicationautoscaling/circe")).dependsOn(`common-circe`, `applicationautoscaling`)
lazy val `applicationautoscaling-http4s` = project.in(file("services/applicationautoscaling/http4s")).dependsOn(`common-http4s`, `applicationautoscaling-circe`)

lazy val `storagegateway` = project.in(file("services/storagegateway/core"))
lazy val `storagegateway-circe` = project.in(file("services/storagegateway/circe")).dependsOn(`common-circe`, `storagegateway`)
lazy val `storagegateway-http4s` = project.in(file("services/storagegateway/http4s")).dependsOn(`common-http4s`, `storagegateway-circe`)

lazy val `ecs` = project.in(file("services/ecs/core"))
lazy val `ecs-circe` = project.in(file("services/ecs/circe")).dependsOn(`common-circe`, `ecs`)
lazy val `ecs-http4s` = project.in(file("services/ecs/http4s")).dependsOn(`common-http4s`, `ecs-circe`)

lazy val `workspaces` = project.in(file("services/workspaces/core"))
lazy val `workspaces-circe` = project.in(file("services/workspaces/circe")).dependsOn(`common-circe`, `workspaces`)
lazy val `workspaces-http4s` = project.in(file("services/workspaces/http4s")).dependsOn(`common-http4s`, `workspaces-circe`)

lazy val `machinelearning` = project.in(file("services/machinelearning/core"))
lazy val `machinelearning-circe` = project.in(file("services/machinelearning/circe")).dependsOn(`common-circe`, `machinelearning`)
lazy val `machinelearning-http4s` = project.in(file("services/machinelearning/http4s")).dependsOn(`common-http4s`, `machinelearning-circe`)

lazy val `costandusagereport` = project.in(file("services/costandusagereport/core"))
lazy val `costandusagereport-circe` = project.in(file("services/costandusagereport/circe")).dependsOn(`common-circe`, `costandusagereport`)
lazy val `costandusagereport-http4s` = project.in(file("services/costandusagereport/http4s")).dependsOn(`common-http4s`, `costandusagereport-circe`)

lazy val `codepipeline` = project.in(file("services/codepipeline/core"))
lazy val `codepipeline-circe` = project.in(file("services/codepipeline/circe")).dependsOn(`common-circe`, `codepipeline`)
lazy val `codepipeline-http4s` = project.in(file("services/codepipeline/http4s")).dependsOn(`common-http4s`, `codepipeline-circe`)

lazy val `directory` = project.in(file("services/directory/core"))
lazy val `directory-circe` = project.in(file("services/directory/circe")).dependsOn(`common-circe`, `directory`)
lazy val `directory-http4s` = project.in(file("services/directory/http4s")).dependsOn(`common-http4s`, `directory-circe`)

lazy val `marketplaceentitlement` = project.in(file("services/marketplaceentitlement/core"))
lazy val `marketplaceentitlement-circe` = project.in(file("services/marketplaceentitlement/circe")).dependsOn(`common-circe`, `marketplaceentitlement`)
lazy val `marketplaceentitlement-http4s` = project.in(file("services/marketplaceentitlement/http4s")).dependsOn(`common-http4s`, `marketplaceentitlement-circe`)

lazy val `gamelift` = project.in(file("services/gamelift/core"))
lazy val `gamelift-circe` = project.in(file("services/gamelift/circe")).dependsOn(`common-circe`, `gamelift`)
lazy val `gamelift-http4s` = project.in(file("services/gamelift/http4s")).dependsOn(`common-http4s`, `gamelift-circe`)

lazy val `servermigration` = project.in(file("services/servermigration/core"))
lazy val `servermigration-circe` = project.in(file("services/servermigration/circe")).dependsOn(`common-circe`, `servermigration`)
lazy val `servermigration-http4s` = project.in(file("services/servermigration/http4s")).dependsOn(`common-http4s`, `servermigration-circe`)

lazy val `cloudtrail` = project.in(file("services/cloudtrail/core"))
lazy val `cloudtrail-circe` = project.in(file("services/cloudtrail/circe")).dependsOn(`common-circe`, `cloudtrail`)
lazy val `cloudtrail-http4s` = project.in(file("services/cloudtrail/http4s")).dependsOn(`common-http4s`, `cloudtrail-circe`)

lazy val `simpleworkflow` = project.in(file("services/simpleworkflow/core"))
lazy val `simpleworkflow-circe` = project.in(file("services/simpleworkflow/circe")).dependsOn(`common-circe`, `simpleworkflow`)
lazy val `simpleworkflow-http4s` = project.in(file("services/simpleworkflow/http4s")).dependsOn(`common-http4s`, `simpleworkflow-circe`)

lazy val `logs` = project.in(file("services/logs/core"))
lazy val `logs-circe` = project.in(file("services/logs/circe")).dependsOn(`common-circe`, `logs`)
lazy val `logs-http4s` = project.in(file("services/logs/http4s")).dependsOn(`common-http4s`, `logs-circe`)

lazy val `opsworks` = project.in(file("services/opsworks/core"))
lazy val `opsworks-circe` = project.in(file("services/opsworks/circe")).dependsOn(`common-circe`, `opsworks`)
lazy val `opsworks-http4s` = project.in(file("services/opsworks/http4s")).dependsOn(`common-http4s`, `opsworks-circe`)

lazy val `support` = project.in(file("services/support/core"))
lazy val `support-circe` = project.in(file("services/support/circe")).dependsOn(`common-circe`, `support`)
lazy val `support-http4s` = project.in(file("services/support/http4s")).dependsOn(`common-http4s`, `support-circe`)

lazy val `codedeploy` = project.in(file("services/codedeploy/core"))
lazy val `codedeploy-circe` = project.in(file("services/codedeploy/circe")).dependsOn(`common-circe`, `codedeploy`)
lazy val `codedeploy-http4s` = project.in(file("services/codedeploy/http4s")).dependsOn(`common-http4s`, `codedeploy-circe`)

lazy val `budgets` = project.in(file("services/budgets/core"))
lazy val `budgets-circe` = project.in(file("services/budgets/circe")).dependsOn(`common-circe`, `budgets`)
lazy val `budgets-http4s` = project.in(file("services/budgets/http4s")).dependsOn(`common-http4s`, `budgets-circe`)

lazy val `directconnect` = project.in(file("services/directconnect/core"))
lazy val `directconnect-circe` = project.in(file("services/directconnect/circe")).dependsOn(`common-circe`, `directconnect`)
lazy val `directconnect-http4s` = project.in(file("services/directconnect/http4s")).dependsOn(`common-http4s`, `directconnect-circe`)

lazy val `codestar` = project.in(file("services/codestar/core"))
lazy val `codestar-circe` = project.in(file("services/codestar/circe")).dependsOn(`common-circe`, `codestar`)
lazy val `codestar-http4s` = project.in(file("services/codestar/http4s")).dependsOn(`common-http4s`, `codestar-circe`)

lazy val `dax` = project.in(file("services/dax/core"))
lazy val `dax-circe` = project.in(file("services/dax/circe")).dependsOn(`common-circe`, `dax`)
lazy val `dax-http4s` = project.in(file("services/dax/http4s")).dependsOn(`common-http4s`, `dax-circe`)

lazy val `opsworkscm` = project.in(file("services/opsworkscm/core"))
lazy val `opsworkscm-circe` = project.in(file("services/opsworkscm/circe")).dependsOn(`common-circe`, `opsworkscm`)
lazy val `opsworkscm-http4s` = project.in(file("services/opsworkscm/http4s")).dependsOn(`common-http4s`, `opsworkscm-circe`)

lazy val `dms` = project.in(file("services/dms/core"))
lazy val `dms-circe` = project.in(file("services/dms/circe")).dependsOn(`common-circe`, `dms`)
lazy val `dms-http4s` = project.in(file("services/dms/http4s")).dependsOn(`common-http4s`, `dms-circe`)

lazy val `events` = project.in(file("services/events/core"))
lazy val `events-circe` = project.in(file("services/events/circe")).dependsOn(`common-circe`, `events`)
lazy val `events-http4s` = project.in(file("services/events/http4s")).dependsOn(`common-http4s`, `events-circe`)

lazy val `devicefarm` = project.in(file("services/devicefarm/core"))
lazy val `devicefarm-circe` = project.in(file("services/devicefarm/circe")).dependsOn(`common-circe`, `devicefarm`)
lazy val `devicefarm-http4s` = project.in(file("services/devicefarm/http4s")).dependsOn(`common-http4s`, `devicefarm-circe`)

lazy val `rekognition` = project.in(file("services/rekognition/core"))
lazy val `rekognition-circe` = project.in(file("services/rekognition/circe")).dependsOn(`common-circe`, `rekognition`)
lazy val `rekognition-http4s` = project.in(file("services/rekognition/http4s")).dependsOn(`common-http4s`, `rekognition-circe`)

lazy val `appstream` = project.in(file("services/appstream/core"))
lazy val `appstream-circe` = project.in(file("services/appstream/circe")).dependsOn(`common-circe`, `appstream`)
lazy val `appstream-http4s` = project.in(file("services/appstream/http4s")).dependsOn(`common-http4s`, `appstream-circe`)

lazy val `datapipeline` = project.in(file("services/datapipeline/core"))
lazy val `datapipeline-circe` = project.in(file("services/datapipeline/circe")).dependsOn(`common-circe`, `datapipeline`)
lazy val `datapipeline-http4s` = project.in(file("services/datapipeline/http4s")).dependsOn(`common-http4s`, `datapipeline-circe`)

lazy val `stepfunctions` = project.in(file("services/stepfunctions/core"))
lazy val `stepfunctions-circe` = project.in(file("services/stepfunctions/circe")).dependsOn(`common-circe`, `stepfunctions`)
lazy val `stepfunctions-http4s` = project.in(file("services/stepfunctions/http4s")).dependsOn(`common-http4s`, `stepfunctions-circe`)

lazy val `codecommit` = project.in(file("services/codecommit/core"))
lazy val `codecommit-circe` = project.in(file("services/codecommit/circe")).dependsOn(`common-circe`, `codecommit`)
lazy val `codecommit-http4s` = project.in(file("services/codecommit/http4s")).dependsOn(`common-http4s`, `codecommit-circe`)

lazy val `resourcegroupstaggingapi` = project.in(file("services/resourcegroupstaggingapi/core"))
lazy val `resourcegroupstaggingapi-circe` = project.in(file("services/resourcegroupstaggingapi/circe")).dependsOn(`common-circe`, `resourcegroupstaggingapi`)
lazy val `resourcegroupstaggingapi-http4s` = project.in(file("services/resourcegroupstaggingapi/http4s")).dependsOn(`common-http4s`, `resourcegroupstaggingapi-circe`)

lazy val `acm` = project.in(file("services/acm/core"))
lazy val `acm-circe` = project.in(file("services/acm/circe")).dependsOn(`common-circe`, `acm`)
lazy val `acm-http4s` = project.in(file("services/acm/http4s")).dependsOn(`common-http4s`, `acm-circe`)

lazy val `athena` = project.in(file("services/athena/core"))
lazy val `athena-circe` = project.in(file("services/athena/circe")).dependsOn(`common-circe`, `athena`)
lazy val `athena-http4s` = project.in(file("services/athena/http4s")).dependsOn(`common-http4s`, `athena-circe`)

lazy val `route53domains` = project.in(file("services/route53domains/core"))
lazy val `route53domains-circe` = project.in(file("services/route53domains/circe")).dependsOn(`common-circe`, `route53domains`)
lazy val `route53domains-http4s` = project.in(file("services/route53domains/http4s")).dependsOn(`common-http4s`, `route53domains-circe`)
