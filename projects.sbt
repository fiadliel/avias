
val `common-core` = project.in(file("common/core"))
val `common-circe` = project.in(file("common/circe")).settings(Dependencies.circe).dependsOn(`common-core`)
val `common-ec2-protocol` = project.in(file("common/ec2-protocol")).settings(Dependencies.simulacrum)
val `common-http4s` = project.in(file("common/http4s")).settings(Dependencies.http4s).dependsOn(`common-circe`)

val `codebuild-core` = project.in(file("services/codebuild/core"))
val `codebuild-circe` = project.in(file("services/codebuild/circe")).dependsOn(`common-circe`, `codebuild-core`)
val `codebuild-http4s` = project.in(file("services/codebuild/http4s")).dependsOn(`common-http4s`, `codebuild-circe`)

val `kinesis-core` = project.in(file("services/kinesis/core"))
val `kinesis-circe` = project.in(file("services/kinesis/circe")).dependsOn(`common-circe`, `kinesis-core`)
val `kinesis-http4s` = project.in(file("services/kinesis/http4s")).dependsOn(`common-http4s`, `kinesis-circe`)

val `kinesisanalytics-core` = project.in(file("services/kinesisanalytics/core"))
val `kinesisanalytics-circe` = project.in(file("services/kinesisanalytics/circe")).dependsOn(`common-circe`, `kinesisanalytics-core`)
val `kinesisanalytics-http4s` = project.in(file("services/kinesisanalytics/http4s")).dependsOn(`common-http4s`, `kinesisanalytics-circe`)

val `kinesisfirehose-core` = project.in(file("services/kinesisfirehose/core"))
val `kinesisfirehose-circe` = project.in(file("services/kinesisfirehose/circe")).dependsOn(`common-circe`, `kinesisfirehose-core`)
val `kinesisfirehose-http4s` = project.in(file("services/kinesisfirehose/http4s")).dependsOn(`common-http4s`, `kinesisfirehose-circe`)

val `organizations-core` = project.in(file("services/organizations/core"))
val `organizations-circe` = project.in(file("services/organizations/circe")).dependsOn(`common-circe`, `organizations-core`)
val `organizations-http4s` = project.in(file("services/organizations/http4s")).dependsOn(`common-http4s`, `organizations-circe`)

val `shield-core` = project.in(file("services/shield/core"))
val `shield-circe` = project.in(file("services/shield/circe")).dependsOn(`common-circe`, `shield-core`)
val `shield-http4s` = project.in(file("services/shield/http4s")).dependsOn(`common-http4s`, `shield-circe`)

val `ssm-core` = project.in(file("services/ssm/core"))
val `ssm-circe` = project.in(file("services/ssm/circe")).dependsOn(`common-circe`, `ssm-core`)
val `ssm-http4s` = project.in(file("services/ssm/http4s")).dependsOn(`common-http4s`, `ssm-circe`)

val `servicecatalog-core` = project.in(file("services/servicecatalog/core"))
val `servicecatalog-circe` = project.in(file("services/servicecatalog/circe")).dependsOn(`common-circe`, `servicecatalog-core`)
val `servicecatalog-http4s` = project.in(file("services/servicecatalog/http4s")).dependsOn(`common-http4s`, `servicecatalog-circe`)

val `kms-core` = project.in(file("services/kms/core"))
val `kms-circe` = project.in(file("services/kms/circe")).dependsOn(`common-circe`, `kms-core`)
val `kms-http4s` = project.in(file("services/kms/http4s")).dependsOn(`common-http4s`, `kms-circe`)

val `emr-core` = project.in(file("services/emr/core"))
val `emr-circe` = project.in(file("services/emr/circe")).dependsOn(`common-circe`, `emr-core`)
val `emr-http4s` = project.in(file("services/emr/http4s")).dependsOn(`common-http4s`, `emr-circe`)

val `cloudhsm-core` = project.in(file("services/cloudhsm/core"))
val `cloudhsm-circe` = project.in(file("services/cloudhsm/circe")).dependsOn(`common-circe`, `cloudhsm-core`)
val `cloudhsm-http4s` = project.in(file("services/cloudhsm/http4s")).dependsOn(`common-http4s`, `cloudhsm-circe`)

val `cognitoidentity-core` = project.in(file("services/cognitoidentity/core"))
val `cognitoidentity-circe` = project.in(file("services/cognitoidentity/circe")).dependsOn(`common-circe`, `cognitoidentity-core`)
val `cognitoidentity-http4s` = project.in(file("services/cognitoidentity/http4s")).dependsOn(`common-http4s`, `cognitoidentity-circe`)

val `config-core` = project.in(file("services/config/core"))
val `config-circe` = project.in(file("services/config/circe")).dependsOn(`common-circe`, `config-core`)
val `config-http4s` = project.in(file("services/config/http4s")).dependsOn(`common-http4s`, `config-circe`)

val `inspector-core` = project.in(file("services/inspector/core"))
val `inspector-circe` = project.in(file("services/inspector/circe")).dependsOn(`common-circe`, `inspector-core`)
val `inspector-http4s` = project.in(file("services/inspector/http4s")).dependsOn(`common-http4s`, `inspector-circe`)

val `marketplacecommerceanalytics-core` = project.in(file("services/marketplacecommerceanalytics/core"))
val `marketplacecommerceanalytics-circe` = project.in(file("services/marketplacecommerceanalytics/circe")).dependsOn(`common-circe`, `marketplacecommerceanalytics-core`)
val `marketplacecommerceanalytics-http4s` = project.in(file("services/marketplacecommerceanalytics/http4s")).dependsOn(`common-http4s`, `marketplacecommerceanalytics-circe`)

val `mechanicalturkrequester-core` = project.in(file("services/mechanicalturkrequester/core"))
val `mechanicalturkrequester-circe` = project.in(file("services/mechanicalturkrequester/circe")).dependsOn(`common-circe`, `mechanicalturkrequester-core`)
val `mechanicalturkrequester-http4s` = project.in(file("services/mechanicalturkrequester/http4s")).dependsOn(`common-http4s`, `mechanicalturkrequester-circe`)

val `marketplacemeteringservice-core` = project.in(file("services/marketplacemeteringservice/core"))
val `marketplacemeteringservice-circe` = project.in(file("services/marketplacemeteringservice/circe")).dependsOn(`common-circe`, `marketplacemeteringservice-core`)
val `marketplacemeteringservice-http4s` = project.in(file("services/marketplacemeteringservice/http4s")).dependsOn(`common-http4s`, `marketplacemeteringservice-circe`)

val `cognitoidp-core` = project.in(file("services/cognitoidp/core"))
val `cognitoidp-circe` = project.in(file("services/cognitoidp/circe")).dependsOn(`common-circe`, `cognitoidp-core`)
val `cognitoidp-http4s` = project.in(file("services/cognitoidp/http4s")).dependsOn(`common-http4s`, `cognitoidp-circe`)

val `health-core` = project.in(file("services/health/core"))
val `health-circe` = project.in(file("services/health/circe")).dependsOn(`common-circe`, `health-core`)
val `health-http4s` = project.in(file("services/health/http4s")).dependsOn(`common-http4s`, `health-circe`)

val `lightsail-core` = project.in(file("services/lightsail/core"))
val `lightsail-circe` = project.in(file("services/lightsail/circe")).dependsOn(`common-circe`, `lightsail-core`)
val `lightsail-http4s` = project.in(file("services/lightsail/http4s")).dependsOn(`common-http4s`, `lightsail-circe`)

val `discovery-core` = project.in(file("services/discovery/core"))
val `discovery-circe` = project.in(file("services/discovery/circe")).dependsOn(`common-circe`, `discovery-core`)
val `discovery-http4s` = project.in(file("services/discovery/http4s")).dependsOn(`common-http4s`, `discovery-circe`)

val `ecr-core` = project.in(file("services/ecr/core"))
val `ecr-circe` = project.in(file("services/ecr/circe")).dependsOn(`common-circe`, `ecr-core`)
val `ecr-http4s` = project.in(file("services/ecr/http4s")).dependsOn(`common-http4s`, `ecr-circe`)

val `dynamodb-core` = project.in(file("services/dynamodb/core"))
val `dynamodb-circe` = project.in(file("services/dynamodb/circe")).dependsOn(`common-circe`, `dynamodb-core`)
val `dynamodb-http4s` = project.in(file("services/dynamodb/http4s")).dependsOn(`common-http4s`, `dynamodb-circe`)

val `dynamodbstreams-core` = project.in(file("services/dynamodbstreams/core"))
val `dynamodbstreams-circe` = project.in(file("services/dynamodbstreams/circe")).dependsOn(`common-circe`, `dynamodbstreams-core`)
val `dynamodbstreams-http4s` = project.in(file("services/dynamodbstreams/http4s")).dependsOn(`common-http4s`, `dynamodbstreams-circe`)

val `applicationautoscaling-core` = project.in(file("services/applicationautoscaling/core"))
val `applicationautoscaling-circe` = project.in(file("services/applicationautoscaling/circe")).dependsOn(`common-circe`, `applicationautoscaling-core`)
val `applicationautoscaling-http4s` = project.in(file("services/applicationautoscaling/http4s")).dependsOn(`common-http4s`, `applicationautoscaling-circe`)

val `storagegateway-core` = project.in(file("services/storagegateway/core"))
val `storagegateway-circe` = project.in(file("services/storagegateway/circe")).dependsOn(`common-circe`, `storagegateway-core`)
val `storagegateway-http4s` = project.in(file("services/storagegateway/http4s")).dependsOn(`common-http4s`, `storagegateway-circe`)

val `ecs-core` = project.in(file("services/ecs/core"))
val `ecs-circe` = project.in(file("services/ecs/circe")).dependsOn(`common-circe`, `ecs-core`)
val `ecs-http4s` = project.in(file("services/ecs/http4s")).dependsOn(`common-http4s`, `ecs-circe`)

val `workspaces-core` = project.in(file("services/workspaces/core"))
val `workspaces-circe` = project.in(file("services/workspaces/circe")).dependsOn(`common-circe`, `workspaces-core`)
val `workspaces-http4s` = project.in(file("services/workspaces/http4s")).dependsOn(`common-http4s`, `workspaces-circe`)

val `machinelearning-core` = project.in(file("services/machinelearning/core"))
val `machinelearning-circe` = project.in(file("services/machinelearning/circe")).dependsOn(`common-circe`, `machinelearning-core`)
val `machinelearning-http4s` = project.in(file("services/machinelearning/http4s")).dependsOn(`common-http4s`, `machinelearning-circe`)

val `costandusagereport-core` = project.in(file("services/costandusagereport/core"))
val `costandusagereport-circe` = project.in(file("services/costandusagereport/circe")).dependsOn(`common-circe`, `costandusagereport-core`)
val `costandusagereport-http4s` = project.in(file("services/costandusagereport/http4s")).dependsOn(`common-http4s`, `costandusagereport-circe`)

val `codepipeline-core` = project.in(file("services/codepipeline/core"))
val `codepipeline-circe` = project.in(file("services/codepipeline/circe")).dependsOn(`common-circe`, `codepipeline-core`)
val `codepipeline-http4s` = project.in(file("services/codepipeline/http4s")).dependsOn(`common-http4s`, `codepipeline-circe`)

val `directory-core` = project.in(file("services/directory/core"))
val `directory-circe` = project.in(file("services/directory/circe")).dependsOn(`common-circe`, `directory-core`)
val `directory-http4s` = project.in(file("services/directory/http4s")).dependsOn(`common-http4s`, `directory-circe`)

val `marketplaceentitlement-core` = project.in(file("services/marketplaceentitlement/core"))
val `marketplaceentitlement-circe` = project.in(file("services/marketplaceentitlement/circe")).dependsOn(`common-circe`, `marketplaceentitlement-core`)
val `marketplaceentitlement-http4s` = project.in(file("services/marketplaceentitlement/http4s")).dependsOn(`common-http4s`, `marketplaceentitlement-circe`)

val `gamelift-core` = project.in(file("services/gamelift/core"))
val `gamelift-circe` = project.in(file("services/gamelift/circe")).dependsOn(`common-circe`, `gamelift-core`)
val `gamelift-http4s` = project.in(file("services/gamelift/http4s")).dependsOn(`common-http4s`, `gamelift-circe`)

val `servermigration-core` = project.in(file("services/servermigration/core"))
val `servermigration-circe` = project.in(file("services/servermigration/circe")).dependsOn(`common-circe`, `servermigration-core`)
val `servermigration-http4s` = project.in(file("services/servermigration/http4s")).dependsOn(`common-http4s`, `servermigration-circe`)

val `cloudtrail-core` = project.in(file("services/cloudtrail/core"))
val `cloudtrail-circe` = project.in(file("services/cloudtrail/circe")).dependsOn(`common-circe`, `cloudtrail-core`)
val `cloudtrail-http4s` = project.in(file("services/cloudtrail/http4s")).dependsOn(`common-http4s`, `cloudtrail-circe`)

val `simpleworkflow-core` = project.in(file("services/simpleworkflow/core"))
val `simpleworkflow-circe` = project.in(file("services/simpleworkflow/circe")).dependsOn(`common-circe`, `simpleworkflow-core`)
val `simpleworkflow-http4s` = project.in(file("services/simpleworkflow/http4s")).dependsOn(`common-http4s`, `simpleworkflow-circe`)

val `logs-core` = project.in(file("services/logs/core"))
val `logs-circe` = project.in(file("services/logs/circe")).dependsOn(`common-circe`, `logs-core`)
val `logs-http4s` = project.in(file("services/logs/http4s")).dependsOn(`common-http4s`, `logs-circe`)

val `opsworks-core` = project.in(file("services/opsworks/core"))
val `opsworks-circe` = project.in(file("services/opsworks/circe")).dependsOn(`common-circe`, `opsworks-core`)
val `opsworks-http4s` = project.in(file("services/opsworks/http4s")).dependsOn(`common-http4s`, `opsworks-circe`)

val `support-core` = project.in(file("services/support/core"))
val `support-circe` = project.in(file("services/support/circe")).dependsOn(`common-circe`, `support-core`)
val `support-http4s` = project.in(file("services/support/http4s")).dependsOn(`common-http4s`, `support-circe`)

val `codedeploy-core` = project.in(file("services/codedeploy/core"))
val `codedeploy-circe` = project.in(file("services/codedeploy/circe")).dependsOn(`common-circe`, `codedeploy-core`)
val `codedeploy-http4s` = project.in(file("services/codedeploy/http4s")).dependsOn(`common-http4s`, `codedeploy-circe`)

val `budgets-core` = project.in(file("services/budgets/core"))
val `budgets-circe` = project.in(file("services/budgets/circe")).dependsOn(`common-circe`, `budgets-core`)
val `budgets-http4s` = project.in(file("services/budgets/http4s")).dependsOn(`common-http4s`, `budgets-circe`)

val `directconnect-core` = project.in(file("services/directconnect/core"))
val `directconnect-circe` = project.in(file("services/directconnect/circe")).dependsOn(`common-circe`, `directconnect-core`)
val `directconnect-http4s` = project.in(file("services/directconnect/http4s")).dependsOn(`common-http4s`, `directconnect-circe`)

val `codestar-core` = project.in(file("services/codestar/core"))
val `codestar-circe` = project.in(file("services/codestar/circe")).dependsOn(`common-circe`, `codestar-core`)
val `codestar-http4s` = project.in(file("services/codestar/http4s")).dependsOn(`common-http4s`, `codestar-circe`)

val `dax-core` = project.in(file("services/dax/core"))
val `dax-circe` = project.in(file("services/dax/circe")).dependsOn(`common-circe`, `dax-core`)
val `dax-http4s` = project.in(file("services/dax/http4s")).dependsOn(`common-http4s`, `dax-circe`)

val `opsworkscm-core` = project.in(file("services/opsworkscm/core"))
val `opsworkscm-circe` = project.in(file("services/opsworkscm/circe")).dependsOn(`common-circe`, `opsworkscm-core`)
val `opsworkscm-http4s` = project.in(file("services/opsworkscm/http4s")).dependsOn(`common-http4s`, `opsworkscm-circe`)

val `dms-core` = project.in(file("services/dms/core"))
val `dms-circe` = project.in(file("services/dms/circe")).dependsOn(`common-circe`, `dms-core`)
val `dms-http4s` = project.in(file("services/dms/http4s")).dependsOn(`common-http4s`, `dms-circe`)

val `events-core` = project.in(file("services/events/core"))
val `events-circe` = project.in(file("services/events/circe")).dependsOn(`common-circe`, `events-core`)
val `events-http4s` = project.in(file("services/events/http4s")).dependsOn(`common-http4s`, `events-circe`)

val `devicefarm-core` = project.in(file("services/devicefarm/core"))
val `devicefarm-circe` = project.in(file("services/devicefarm/circe")).dependsOn(`common-circe`, `devicefarm-core`)
val `devicefarm-http4s` = project.in(file("services/devicefarm/http4s")).dependsOn(`common-http4s`, `devicefarm-circe`)

val `rekognition-core` = project.in(file("services/rekognition/core"))
val `rekognition-circe` = project.in(file("services/rekognition/circe")).dependsOn(`common-circe`, `rekognition-core`)
val `rekognition-http4s` = project.in(file("services/rekognition/http4s")).dependsOn(`common-http4s`, `rekognition-circe`)

val `appstream-core` = project.in(file("services/appstream/core"))
val `appstream-circe` = project.in(file("services/appstream/circe")).dependsOn(`common-circe`, `appstream-core`)
val `appstream-http4s` = project.in(file("services/appstream/http4s")).dependsOn(`common-http4s`, `appstream-circe`)

val `datapipeline-core` = project.in(file("services/datapipeline/core"))
val `datapipeline-circe` = project.in(file("services/datapipeline/circe")).dependsOn(`common-circe`, `datapipeline-core`)
val `datapipeline-http4s` = project.in(file("services/datapipeline/http4s")).dependsOn(`common-http4s`, `datapipeline-circe`)

val `stepfunctions-core` = project.in(file("services/stepfunctions/core"))
val `stepfunctions-circe` = project.in(file("services/stepfunctions/circe")).dependsOn(`common-circe`, `stepfunctions-core`)
val `stepfunctions-http4s` = project.in(file("services/stepfunctions/http4s")).dependsOn(`common-http4s`, `stepfunctions-circe`)

val `codecommit-core` = project.in(file("services/codecommit/core"))
val `codecommit-circe` = project.in(file("services/codecommit/circe")).dependsOn(`common-circe`, `codecommit-core`)
val `codecommit-http4s` = project.in(file("services/codecommit/http4s")).dependsOn(`common-http4s`, `codecommit-circe`)

val `resourcegroupstaggingapi-core` = project.in(file("services/resourcegroupstaggingapi/core"))
val `resourcegroupstaggingapi-circe` = project.in(file("services/resourcegroupstaggingapi/circe")).dependsOn(`common-circe`, `resourcegroupstaggingapi-core`)
val `resourcegroupstaggingapi-http4s` = project.in(file("services/resourcegroupstaggingapi/http4s")).dependsOn(`common-http4s`, `resourcegroupstaggingapi-circe`)

val `acm-core` = project.in(file("services/acm/core"))
val `acm-circe` = project.in(file("services/acm/circe")).dependsOn(`common-circe`, `acm-core`)
val `acm-http4s` = project.in(file("services/acm/http4s")).dependsOn(`common-http4s`, `acm-circe`)

val `athena-core` = project.in(file("services/athena/core"))
val `athena-circe` = project.in(file("services/athena/circe")).dependsOn(`common-circe`, `athena-core`)
val `athena-http4s` = project.in(file("services/athena/http4s")).dependsOn(`common-http4s`, `athena-circe`)

val `route53domains-core` = project.in(file("services/route53domains/core"))
val `route53domains-circe` = project.in(file("services/route53domains/circe")).dependsOn(`common-circe`, `route53domains-core`)
val `route53domains-http4s` = project.in(file("services/route53domains/http4s")).dependsOn(`common-http4s`, `route53domains-circe`)

val `ec2-core` = project.in(file("services/ec2/core"))
val `ec2-ec2-protocol` = project.in(file("services/ec2/ec2-protocol")).settings(Dependencies.http4s).dependsOn(`common-ec2-protocol`, `ec2-core`)
val `ec2-http4s` = project.in(file("services/ec2/http4s")).dependsOn(`common-http4s`, `ec2-ec2-protocol`)
       