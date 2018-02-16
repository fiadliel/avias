package avias.gamelift
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListFleetsInputEncoder: io.circe.Encoder[avias.gamelift.models.ListFleetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResolveAliasOutputEncoder: io.circe.Encoder[avias.gamelift.models.ResolveAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val ResolveAliasInputEncoder: io.circe.Encoder[avias.gamelift.models.ResolveAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val GameSessionConnectionInfoEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionConnectionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionArn" -> o.gameSessionArn.asJson, "IpAddress" -> o.ipAddress.asJson, "Port" -> o.port.asJson, "MatchedPlayerSessions" -> o.matchedPlayerSessions.asJson)
  }
  final implicit val UpdateFleetPortSettingsOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetPortSettingsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val StartMatchmakingInputEncoder: io.circe.Encoder[avias.gamelift.models.StartMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationName" -> o.configurationName.asJson, "Players" -> o.players.asJson, "TicketId" -> o.ticketId.asJson)
  }
  final implicit val StopMatchmakingOutputEncoder: io.circe.Encoder[avias.gamelift.models.StopMatchmakingOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PlayerEncoder: io.circe.Encoder[avias.gamelift.models.Player] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerAttributes" -> o.playerAttributes.asJson, "Team" -> o.team.asJson, "LatencyInMs" -> o.latencyInMs.asJson)
  }
  final implicit val DescribeRuntimeConfigurationInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeRuntimeConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val AliasEncoder: io.circe.Encoder[avias.gamelift.models.Alias] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "LastUpdatedTime" -> o.lastUpdatedTime.asJson, "RoutingStrategy" -> o.routingStrategy.asJson, "Description" -> o.description.asJson, "AliasId" -> o.aliasId.asJson, "Name" -> o.name.asJson, "AliasArn" -> o.aliasArn.asJson)
  }
  final implicit val DescribeGameSessionsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessions" -> o.gameSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateMatchmakingRuleSetInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateMatchmakingRuleSetInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "RuleSetBody" -> o.ruleSetBody.asJson)
  }
  final implicit val RoutingStrategyEncoder: io.circe.Encoder[avias.gamelift.models.RoutingStrategy] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "FleetId" -> o.fleetId.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AcceptMatchInputEncoder: io.circe.Encoder[avias.gamelift.models.AcceptMatchInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketId" -> o.ticketId.asJson, "PlayerIds" -> o.playerIds.asJson, "AcceptanceType" -> o.acceptanceType.asJson)
  }
  final implicit val DeleteGameSessionQueueOutputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteGameSessionQueueOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AcceptMatchOutputEncoder: io.circe.Encoder[avias.gamelift.models.AcceptMatchOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeFleetAttributesOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetAttributesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetAttributes" -> o.fleetAttributes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteBuildInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val DeleteVpcPeeringAuthorizationInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteVpcPeeringAuthorizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val ListBuildsInputEncoder: io.circe.Encoder[avias.gamelift.models.ListBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateAliasOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val DesiredPlayerSessionEncoder: io.circe.Encoder[avias.gamelift.models.DesiredPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerData" -> o.playerData.asJson)
  }
  final implicit val UpdateGameSessionInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateGameSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "ProtectionPolicy" -> o.protectionPolicy.asJson, "Name" -> o.name.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "PlayerSessionCreationPolicy" -> o.playerSessionCreationPolicy.asJson)
  }
  final implicit val DescribeInstancesOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Instances" -> o.instances.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeGameSessionPlacementInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson)
  }
  final implicit val RequestUploadCredentialsInputEncoder: io.circe.Encoder[avias.gamelift.models.RequestUploadCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val ListFleetsOutputEncoder: io.circe.Encoder[avias.gamelift.models.ListFleetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateFleetAttributesInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetAttributesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "MetricGroups" -> o.metricGroups.asJson)
  }
  final implicit val DeleteFleetInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[avias.gamelift.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeGameSessionDetailsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StatusFilter" -> o.statusFilter.asJson, "NextToken" -> o.nextToken.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "FleetId" -> o.fleetId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val IpPermissionEncoder: io.circe.Encoder[avias.gamelift.models.IpPermission] = io.circe.Encoder.instance { o => 
    Json.obj("FromPort" -> o.fromPort.asJson, "ToPort" -> o.toPort.asJson, "IpRange" -> o.ipRange.asJson, "Protocol" -> o.protocol.asJson)
  }
  final implicit val CreateAliasOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val ListAliasesOutputEncoder: io.circe.Encoder[avias.gamelift.models.ListAliasesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Aliases" -> o.aliases.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeGameSessionQueuesInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionQueuesInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EC2InstanceCountsEncoder: io.circe.Encoder[avias.gamelift.models.EC2InstanceCounts] = io.circe.Encoder.instance { o => 
    Json.obj("TERMINATING" -> o.terminating.asJson, "IDLE" -> o.idle.asJson, "MAXIMUM" -> o.maximum.asJson, "ACTIVE" -> o.active.asJson, "DESIRED" -> o.desired.asJson, "MINIMUM" -> o.minimum.asJson, "PENDING" -> o.pending.asJson)
  }
  final implicit val MatchedPlayerSessionEncoder: io.circe.Encoder[avias.gamelift.models.MatchedPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerSessionId" -> o.playerSessionId.asJson)
  }
  final implicit val AttributeValueEncoder: io.circe.Encoder[avias.gamelift.models.AttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("S" -> o.s.asJson, "N" -> o.n.asJson, "SL" -> o.sl.asJson, "SDM" -> o.sdm.asJson)
  }
  final implicit val ListBuildsOutputEncoder: io.circe.Encoder[avias.gamelift.models.ListBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Builds" -> o.builds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateGameSessionQueueInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val MatchmakingConfigurationEncoder: io.circe.Encoder[avias.gamelift.models.MatchmakingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "NotificationTarget" -> o.notificationTarget.asJson, "Name" -> o.name.asJson, "RuleSetName" -> o.ruleSetName.asJson)
  }
  final implicit val CreateMatchmakingConfigurationInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "Name" -> o.name.asJson, "RuleSetName" -> o.ruleSetName.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "NotificationTarget" -> o.notificationTarget.asJson)
  }
  final implicit val PlacedPlayerSessionEncoder: io.circe.Encoder[avias.gamelift.models.PlacedPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerSessionId" -> o.playerSessionId.asJson)
  }
  final implicit val VpcPeeringConnectionEncoder: io.circe.Encoder[avias.gamelift.models.VpcPeeringConnection] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "IpV4CidrBlock" -> o.ipV4CidrBlock.asJson, "VpcPeeringConnectionId" -> o.vpcPeeringConnectionId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "GameLiftVpcId" -> o.gameLiftVpcId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DeleteGameSessionQueueInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val VpcPeeringConnectionStatusEncoder: io.circe.Encoder[avias.gamelift.models.VpcPeeringConnectionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DescribePlayerSessionsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribePlayerSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSessions" -> o.playerSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidateMatchmakingRuleSetOutputEncoder: io.circe.Encoder[avias.gamelift.models.ValidateMatchmakingRuleSetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Valid" -> o.valid.asJson)
  }
  final implicit val UpdateFleetCapacityOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetCapacityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DescribeFleetEventsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetEventsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Events" -> o.events.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFleetEventsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetEventsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EC2InstanceLimitEncoder: io.circe.Encoder[avias.gamelift.models.EC2InstanceLimit] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceType" -> o.ec2InstanceType.asJson, "CurrentInstances" -> o.currentInstances.asJson, "InstanceLimit" -> o.instanceLimit.asJson)
  }
  final implicit val CreateBuildInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Version" -> o.version.asJson, "StorageLocation" -> o.storageLocation.asJson, "OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val DescribeFleetPortSettingsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetPortSettingsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val GamePropertyEncoder: io.circe.Encoder[avias.gamelift.models.GameProperty] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val GameSessionFullExceptionEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionFullException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMatchmakingConfigurationsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingConfigurationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "RuleSetName" -> o.ruleSetName.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InstanceAccessEncoder: io.circe.Encoder[avias.gamelift.models.InstanceAccess] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "Credentials" -> o.credentials.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val ResourceCreationLimitPolicyEncoder: io.circe.Encoder[avias.gamelift.models.ResourceCreationLimitPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("NewGameSessionsPerCreator" -> o.newGameSessionsPerCreator.asJson, "PolicyPeriodInMinutes" -> o.policyPeriodInMinutes.asJson)
  }
  final implicit val InternalServiceExceptionEncoder: io.circe.Encoder[avias.gamelift.models.InternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMatchmakingConfigurationsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingConfigurationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configurations" -> o.configurations.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteScalingPolicyInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "FleetId" -> o.fleetId.asJson)
  }
  final implicit val CreateAliasInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "RoutingStrategy" -> o.routingStrategy.asJson, "Description" -> o.description.asJson)
  }
  final implicit val RuntimeConfigurationEncoder: io.circe.Encoder[avias.gamelift.models.RuntimeConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ServerProcesses" -> o.serverProcesses.asJson, "MaxConcurrentGameSessionActivations" -> o.maxConcurrentGameSessionActivations.asJson, "GameSessionActivationTimeoutSeconds" -> o.gameSessionActivationTimeoutSeconds.asJson)
  }
  final implicit val CreateVpcPeeringAuthorizationInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateVpcPeeringAuthorizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val UnauthorizedExceptionEncoder: io.circe.Encoder[avias.gamelift.models.UnauthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PlayerLatencyEncoder: io.circe.Encoder[avias.gamelift.models.PlayerLatency] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "RegionIdentifier" -> o.regionIdentifier.asJson, "LatencyInMilliseconds" -> o.latencyInMilliseconds.asJson)
  }
  final implicit val DescribeMatchmakingRuleSetsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingRuleSetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateFleetInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EC2InstanceType" -> o.ec2InstanceType.asJson, "BuildId" -> o.buildId.asJson, "EC2InboundPermissions" -> o.ec2InboundPermissions.asJson, "NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "ServerLaunchPath" -> o.serverLaunchPath.asJson, "Description" -> o.description.asJson, "ServerLaunchParameters" -> o.serverLaunchParameters.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "RuntimeConfiguration" -> o.runtimeConfiguration.asJson, "MetricGroups" -> o.metricGroups.asJson, "LogPaths" -> o.logPaths.asJson)
  }
  final implicit val UpdateFleetPortSettingsInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetPortSettingsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InboundPermissionAuthorizations" -> o.inboundPermissionAuthorizations.asJson, "InboundPermissionRevocations" -> o.inboundPermissionRevocations.asJson)
  }
  final implicit val DescribeScalingPoliciesOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeScalingPoliciesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingPolicies" -> o.scalingPolicies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFleetUtilizationInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetUtilizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeEC2InstanceLimitsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeEC2InstanceLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceLimits" -> o.ec2InstanceLimits.asJson)
  }
  final implicit val StartGameSessionPlacementOutputEncoder: io.circe.Encoder[avias.gamelift.models.StartGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val DescribeBuildOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson)
  }
  final implicit val FleetAttributesEncoder: io.circe.Encoder[avias.gamelift.models.FleetAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "Status" -> o.status.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "ServerLaunchPath" -> o.serverLaunchPath.asJson, "ServerLaunchParameters" -> o.serverLaunchParameters.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "FleetArn" -> o.fleetArn.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "MetricGroups" -> o.metricGroups.asJson, "LogPaths" -> o.logPaths.asJson, "FleetId" -> o.fleetId.asJson, "BuildId" -> o.buildId.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.gamelift.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeEC2InstanceLimitsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeEC2InstanceLimitsInput] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceType" -> o.ec2InstanceType.asJson)
  }
  final implicit val FleetCapacityEncoder: io.circe.Encoder[avias.gamelift.models.FleetCapacity] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceCounts" -> o.instanceCounts.asJson)
  }
  final implicit val GameSessionEncoder: io.circe.Encoder[avias.gamelift.models.GameSession] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "Status" -> o.status.asJson, "GameSessionId" -> o.gameSessionId.asJson, "Name" -> o.name.asJson, "CreatorId" -> o.creatorId.asJson, "Port" -> o.port.asJson, "CurrentPlayerSessionCount" -> o.currentPlayerSessionCount.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "PlayerSessionCreationPolicy" -> o.playerSessionCreationPolicy.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val InstanceCredentialsEncoder: io.circe.Encoder[avias.gamelift.models.InstanceCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "Secret" -> o.secret.asJson)
  }
  final implicit val CreateMatchmakingRuleSetOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateMatchmakingRuleSetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSet" -> o.ruleSet.asJson)
  }
  final implicit val GameSessionQueueEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionQueue] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "GameSessionQueueArn" -> o.gameSessionQueueArn.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val GetInstanceAccessOutputEncoder: io.circe.Encoder[avias.gamelift.models.GetInstanceAccessOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceAccess" -> o.instanceAccess.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[avias.gamelift.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateFleetCapacityInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetCapacityInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "DesiredInstances" -> o.desiredInstances.asJson, "MinSize" -> o.minSize.asJson, "MaxSize" -> o.maxSize.asJson)
  }
  final implicit val DescribeGameSessionDetailsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionDetails" -> o.gameSessionDetails.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildEncoder: io.circe.Encoder[avias.gamelift.models.Build] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "BuildId" -> o.buildId.asJson, "Status" -> o.status.asJson, "SizeOnDisk" -> o.sizeOnDisk.asJson)
  }
  final implicit val GetGameSessionLogUrlOutputEncoder: io.circe.Encoder[avias.gamelift.models.GetGameSessionLogUrlOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PreSignedUrl" -> o.preSignedUrl.asJson)
  }
  final implicit val DescribeMatchmakingOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketList" -> o.ticketList.asJson)
  }
  final implicit val CreateVpcPeeringConnectionInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateVpcPeeringConnectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val S3LocationEncoder: io.circe.Encoder[avias.gamelift.models.S3Location] = io.circe.Encoder.instance { o => 
    Json.obj("Bucket" -> o.bucket.asJson, "Key" -> o.key.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val DescribeAliasInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val DescribeMatchmakingRuleSetsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingRuleSetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSets" -> o.ruleSets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnsupportedRegionExceptionEncoder: io.circe.Encoder[avias.gamelift.models.UnsupportedRegionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeVpcPeeringConnectionsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeVpcPeeringConnectionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringConnections" -> o.vpcPeeringConnections.asJson)
  }
  final implicit val UpdateBuildOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson)
  }
  final implicit val StartGameSessionPlacementInputEncoder: io.circe.Encoder[avias.gamelift.models.StartGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson, "GameSessionQueueName" -> o.gameSessionQueueName.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "GameSessionName" -> o.gameSessionName.asJson, "PlayerLatencies" -> o.playerLatencies.asJson, "DesiredPlayerSessions" -> o.desiredPlayerSessions.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson)
  }
  final implicit val GetInstanceAccessInputEncoder: io.circe.Encoder[avias.gamelift.models.GetInstanceAccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceId" -> o.instanceId.asJson)
  }
  final implicit val CreateVpcPeeringAuthorizationOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateVpcPeeringAuthorizationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringAuthorization" -> o.vpcPeeringAuthorization.asJson)
  }
  final implicit val FleetCapacityExceededExceptionEncoder: io.circe.Encoder[avias.gamelift.models.FleetCapacityExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeFleetUtilizationOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetUtilizationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetUtilization" -> o.fleetUtilization.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidFleetStatusExceptionEncoder: io.circe.Encoder[avias.gamelift.models.InvalidFleetStatusException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val GetGameSessionLogUrlInputEncoder: io.circe.Encoder[avias.gamelift.models.GetGameSessionLogUrlInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson)
  }
  final implicit val ConflictExceptionEncoder: io.circe.Encoder[avias.gamelift.models.ConflictException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeFleetCapacityOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetCapacityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetCapacity" -> o.fleetCapacity.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GameSessionDetailEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson, "ProtectionPolicy" -> o.protectionPolicy.asJson)
  }
  final implicit val DescribeBuildInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val InvalidGameSessionStatusExceptionEncoder: io.circe.Encoder[avias.gamelift.models.InvalidGameSessionStatusException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListAliasesInputEncoder: io.circe.Encoder[avias.gamelift.models.ListAliasesInput] = io.circe.Encoder.instance { o => 
    Json.obj("RoutingStrategyType" -> o.routingStrategyType.asJson, "Name" -> o.name.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val PutScalingPolicyOutputEncoder: io.circe.Encoder[avias.gamelift.models.PutScalingPolicyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val StartMatchmakingOutputEncoder: io.circe.Encoder[avias.gamelift.models.StartMatchmakingOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MatchmakingTicket" -> o.matchmakingTicket.asJson)
  }
  final implicit val UpdateRuntimeConfigurationInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateRuntimeConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val DescribeGameSessionQueuesOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionQueuesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueues" -> o.gameSessionQueues.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateMatchmakingConfigurationOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateMatchmakingConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configuration" -> o.configuration.asJson)
  }
  final implicit val ValidateMatchmakingRuleSetInputEncoder: io.circe.Encoder[avias.gamelift.models.ValidateMatchmakingRuleSetInput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSetBody" -> o.ruleSetBody.asJson)
  }
  final implicit val CreatePlayerSessionOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreatePlayerSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSession" -> o.playerSession.asJson)
  }
  final implicit val UpdateBuildInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson)
  }
  final implicit val GameSessionQueueDestinationEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionQueueDestination] = io.circe.Encoder.instance { o => 
    Json.obj("DestinationArn" -> o.destinationArn.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[avias.gamelift.models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "CreationTime" -> o.creationTime.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val DescribeVpcPeeringConnectionsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeVpcPeeringConnectionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DeleteAliasInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val DescribeFleetAttributesInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetAttributesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateRuntimeConfigurationOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateRuntimeConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[avias.gamelift.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("EventId" -> o.eventId.asJson, "ResourceId" -> o.resourceId.asJson, "PreSignedLogUrl" -> o.preSignedLogUrl.asJson, "EventCode" -> o.eventCode.asJson, "Message" -> o.message.asJson, "EventTime" -> o.eventTime.asJson)
  }
  final implicit val MatchmakingRuleSetEncoder: io.circe.Encoder[avias.gamelift.models.MatchmakingRuleSet] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSetBody" -> o.ruleSetBody.asJson, "RuleSetName" -> o.ruleSetName.asJson, "CreationTime" -> o.creationTime.asJson)
  }
  final implicit val SearchGameSessionsInputEncoder: io.circe.Encoder[avias.gamelift.models.SearchGameSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "AliasId" -> o.aliasId.asJson, "FilterExpression" -> o.filterExpression.asJson, "SortExpression" -> o.sortExpression.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val PutScalingPolicyInputEncoder: io.circe.Encoder[avias.gamelift.models.PutScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "Name" -> o.name.asJson, "MetricName" -> o.metricName.asJson, "FleetId" -> o.fleetId.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "ScalingAdjustment" -> o.scalingAdjustment.asJson, "Threshold" -> o.threshold.asJson, "ScalingAdjustmentType" -> o.scalingAdjustmentType.asJson)
  }
  final implicit val MatchmakingTicketEncoder: io.circe.Encoder[avias.gamelift.models.MatchmakingTicket] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionConnectionInfo" -> o.gameSessionConnectionInfo.asJson, "StatusReason" -> o.statusReason.asJson, "StatusMessage" -> o.statusMessage.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Status" -> o.status.asJson, "Players" -> o.players.asJson, "EstimatedWaitTime" -> o.estimatedWaitTime.asJson, "TicketId" -> o.ticketId.asJson, "ConfigurationName" -> o.configurationName.asJson)
  }
  final implicit val DescribeGameSessionsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StatusFilter" -> o.statusFilter.asJson, "NextToken" -> o.nextToken.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "FleetId" -> o.fleetId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val GameSessionPlacementEncoder: io.circe.Encoder[avias.gamelift.models.GameSessionPlacement] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "GameSessionName" -> o.gameSessionName.asJson, "GameSessionId" -> o.gameSessionId.asJson, "GameSessionArn" -> o.gameSessionArn.asJson, "GameSessionRegion" -> o.gameSessionRegion.asJson, "PlayerLatencies" -> o.playerLatencies.asJson, "PlacementId" -> o.placementId.asJson, "GameSessionQueueName" -> o.gameSessionQueueName.asJson, "Port" -> o.port.asJson, "PlacedPlayerSessions" -> o.placedPlayerSessions.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "Status" -> o.status.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val UpdateAliasInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "RoutingStrategy" -> o.routingStrategy.asJson)
  }
  final implicit val DeleteMatchmakingConfigurationInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val RequestUploadCredentialsOutputEncoder: io.circe.Encoder[avias.gamelift.models.RequestUploadCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("UploadCredentials" -> o.uploadCredentials.asJson, "StorageLocation" -> o.storageLocation.asJson)
  }
  final implicit val CreatePlayerSessionsInputEncoder: io.circe.Encoder[avias.gamelift.models.CreatePlayerSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerIds" -> o.playerIds.asJson, "PlayerDataMap" -> o.playerDataMap.asJson)
  }
  final implicit val CreateGameSessionQueueInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val TerminalRoutingStrategyExceptionEncoder: io.circe.Encoder[avias.gamelift.models.TerminalRoutingStrategyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteVpcPeeringConnectionOutputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteVpcPeeringConnectionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateGameSessionOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateGameSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson)
  }
  final implicit val ScalingPolicyEncoder: io.circe.Encoder[avias.gamelift.models.ScalingPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "Name" -> o.name.asJson, "MetricName" -> o.metricName.asJson, "FleetId" -> o.fleetId.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "Status" -> o.status.asJson, "ScalingAdjustment" -> o.scalingAdjustment.asJson, "Threshold" -> o.threshold.asJson, "ScalingAdjustmentType" -> o.scalingAdjustmentType.asJson)
  }
  final implicit val DescribeRuntimeConfigurationOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeRuntimeConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val DescribeAliasOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val UpdateGameSessionQueueOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateGameSessionQueueOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueue" -> o.gameSessionQueue.asJson)
  }
  final implicit val FleetUtilizationEncoder: io.circe.Encoder[avias.gamelift.models.FleetUtilization] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "ActiveServerProcessCount" -> o.activeServerProcessCount.asJson, "ActiveGameSessionCount" -> o.activeGameSessionCount.asJson, "CurrentPlayerSessionCount" -> o.currentPlayerSessionCount.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson)
  }
  final implicit val DescribeVpcPeeringAuthorizationsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeVpcPeeringAuthorizationsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeVpcPeeringAuthorizationsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeVpcPeeringAuthorizationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringAuthorizations" -> o.vpcPeeringAuthorizations.asJson)
  }
  final implicit val DescribeInstancesInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceId" -> o.instanceId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateMatchmakingConfigurationOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateMatchmakingConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configuration" -> o.configuration.asJson)
  }
  final implicit val CreateGameSessionQueueOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateGameSessionQueueOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueue" -> o.gameSessionQueue.asJson)
  }
  final implicit val PlayerSessionEncoder: io.circe.Encoder[avias.gamelift.models.PlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "PlayerSessionId" -> o.playerSessionId.asJson, "PlayerId" -> o.playerId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "Status" -> o.status.asJson, "Port" -> o.port.asJson, "PlayerData" -> o.playerData.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val UpdateMatchmakingConfigurationInputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "NotificationTarget" -> o.notificationTarget.asJson, "RuleSetName" -> o.ruleSetName.asJson)
  }
  final implicit val VpcPeeringAuthorizationEncoder: io.circe.Encoder[avias.gamelift.models.VpcPeeringAuthorization] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "CreationTime" -> o.creationTime.asJson, "ExpirationTime" -> o.expirationTime.asJson)
  }
  final implicit val DescribeScalingPoliciesInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeScalingPoliciesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "StatusFilter" -> o.statusFilter.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateGameSessionInputEncoder: io.circe.Encoder[avias.gamelift.models.CreateGameSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "Name" -> o.name.asJson, "CreatorId" -> o.creatorId.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "FleetId" -> o.fleetId.asJson)
  }
  final implicit val StopMatchmakingInputEncoder: io.circe.Encoder[avias.gamelift.models.StopMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketId" -> o.ticketId.asJson)
  }
  final implicit val DescribePlayerSessionsInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribePlayerSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerId" -> o.playerId.asJson, "PlayerSessionStatusFilter" -> o.playerSessionStatusFilter.asJson, "NextToken" -> o.nextToken.asJson, "PlayerSessionId" -> o.playerSessionId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreatePlayerSessionInputEncoder: io.circe.Encoder[avias.gamelift.models.CreatePlayerSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerId" -> o.playerId.asJson, "PlayerData" -> o.playerData.asJson)
  }
  final implicit val AwsCredentialsEncoder: io.circe.Encoder[avias.gamelift.models.AwsCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("AccessKeyId" -> o.accessKeyId.asJson, "SecretAccessKey" -> o.secretAccessKey.asJson, "SessionToken" -> o.sessionToken.asJson)
  }
  final implicit val DescribeFleetPortSettingsOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetPortSettingsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InboundPermissions" -> o.inboundPermissions.asJson)
  }
  final implicit val IdempotentParameterMismatchExceptionEncoder: io.circe.Encoder[avias.gamelift.models.IdempotentParameterMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateGameSessionOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateGameSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson)
  }
  final implicit val CreateVpcPeeringConnectionOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateVpcPeeringConnectionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopGameSessionPlacementInputEncoder: io.circe.Encoder[avias.gamelift.models.StopGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson)
  }
  final implicit val DeleteMatchmakingConfigurationOutputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteMatchmakingConfigurationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateFleetOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateFleetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetAttributes" -> o.fleetAttributes.asJson)
  }
  final implicit val PlayerLatencyPolicyEncoder: io.circe.Encoder[avias.gamelift.models.PlayerLatencyPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("MaximumIndividualPlayerLatencyMilliseconds" -> o.maximumIndividualPlayerLatencyMilliseconds.asJson, "PolicyDurationSeconds" -> o.policyDurationSeconds.asJson)
  }
  final implicit val SearchGameSessionsOutputEncoder: io.circe.Encoder[avias.gamelift.models.SearchGameSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessions" -> o.gameSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteVpcPeeringConnectionInputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteVpcPeeringConnectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "VpcPeeringConnectionId" -> o.vpcPeeringConnectionId.asJson)
  }
  final implicit val DescribeFleetCapacityInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeFleetCapacityInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteVpcPeeringAuthorizationOutputEncoder: io.circe.Encoder[avias.gamelift.models.DeleteVpcPeeringAuthorizationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateFleetAttributesOutputEncoder: io.circe.Encoder[avias.gamelift.models.UpdateFleetAttributesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DescribeGameSessionPlacementOutputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val ServerProcessEncoder: io.circe.Encoder[avias.gamelift.models.ServerProcess] = io.circe.Encoder.instance { o => 
    Json.obj("LaunchPath" -> o.launchPath.asJson, "ConcurrentExecutions" -> o.concurrentExecutions.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val DescribeMatchmakingInputEncoder: io.circe.Encoder[avias.gamelift.models.DescribeMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketIds" -> o.ticketIds.asJson)
  }
  final implicit val StopGameSessionPlacementOutputEncoder: io.circe.Encoder[avias.gamelift.models.StopGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val CreateBuildOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreateBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson, "UploadCredentials" -> o.uploadCredentials.asJson, "StorageLocation" -> o.storageLocation.asJson)
  }
  final implicit val CreatePlayerSessionsOutputEncoder: io.circe.Encoder[avias.gamelift.models.CreatePlayerSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSessions" -> o.playerSessions.asJson)
  }
  final implicit val ListFleetsInputDecoder: io.circe.Decoder[avias.gamelift.models.ListFleetsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BuildId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.ListFleetsInput.apply _)
  }
  final implicit val ResolveAliasOutputDecoder: io.circe.Decoder[avias.gamelift.models.ResolveAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(avias.gamelift.models.ResolveAliasOutput.apply _)
  }
  final implicit val ResolveAliasInputDecoder: io.circe.Decoder[avias.gamelift.models.ResolveAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(avias.gamelift.models.ResolveAliasInput.apply _)
  }
  final implicit val GameSessionConnectionInfoDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionConnectionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameSessionArn"), o.get[scala.Option[java.lang.String]]("IpAddress"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.List[avias.gamelift.models.MatchedPlayerSession]]]("MatchedPlayerSessions")).mapN(avias.gamelift.models.GameSessionConnectionInfo.apply _)
  }
  final implicit val UpdateFleetPortSettingsOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetPortSettingsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(avias.gamelift.models.UpdateFleetPortSettingsOutput.apply _)
  }
  final implicit val StartMatchmakingInputDecoder: io.circe.Decoder[avias.gamelift.models.StartMatchmakingInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ConfigurationName"), o.get[scala.List[avias.gamelift.models.Player]]("Players"), o.get[scala.Option[java.lang.String]]("TicketId")).mapN(avias.gamelift.models.StartMatchmakingInput.apply _)
  }
  final implicit val StopMatchmakingOutputDecoder: io.circe.Decoder[avias.gamelift.models.StopMatchmakingOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.StopMatchmakingOutput)
  final implicit val PlayerDecoder: io.circe.Decoder[avias.gamelift.models.Player] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.gamelift.models.AttributeValue]]]("PlayerAttributes"), o.get[scala.Option[java.lang.String]]("Team"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("LatencyInMs")).mapN(avias.gamelift.models.Player.apply _)
  }
  final implicit val DescribeRuntimeConfigurationInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeRuntimeConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(avias.gamelift.models.DescribeRuntimeConfigurationInput.apply _)
  }
  final implicit val AliasDecoder: io.circe.Decoder[avias.gamelift.models.Alias] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("LastUpdatedTime"), o.get[scala.Option[avias.gamelift.models.RoutingStrategy]]("RoutingStrategy"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("AliasArn")).mapN(avias.gamelift.models.Alias.apply _)
  }
  final implicit val DescribeGameSessionsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.GameSession]]]("GameSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeGameSessionsOutput.apply _)
  }
  final implicit val CreateMatchmakingRuleSetInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateMatchmakingRuleSetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("RuleSetBody")).mapN(avias.gamelift.models.CreateMatchmakingRuleSetInput.apply _)
  }
  final implicit val RoutingStrategyDecoder: io.circe.Decoder[avias.gamelift.models.RoutingStrategy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.gamelift.models.RoutingStrategy.apply _)
  }
  final implicit val AcceptMatchInputDecoder: io.circe.Decoder[avias.gamelift.models.AcceptMatchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TicketId"), o.get[scala.List[java.lang.String]]("PlayerIds"), o.get[java.lang.String]("AcceptanceType")).mapN(avias.gamelift.models.AcceptMatchInput.apply _)
  }
  final implicit val DeleteGameSessionQueueOutputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteGameSessionQueueOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.DeleteGameSessionQueueOutput)
  final implicit val AcceptMatchOutputDecoder: io.circe.Decoder[avias.gamelift.models.AcceptMatchOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.AcceptMatchOutput)
  final implicit val DescribeFleetAttributesOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetAttributesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.FleetAttributes]]]("FleetAttributes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetAttributesOutput.apply _)
  }
  final implicit val DeleteBuildInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(avias.gamelift.models.DeleteBuildInput.apply _)
  }
  final implicit val DeleteVpcPeeringAuthorizationInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteVpcPeeringAuthorizationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameLiftAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(avias.gamelift.models.DeleteVpcPeeringAuthorizationInput.apply _)
  }
  final implicit val ListBuildsInputDecoder: io.circe.Decoder[avias.gamelift.models.ListBuildsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.ListBuildsInput.apply _)
  }
  final implicit val UpdateAliasOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.Alias]]("Alias").map(avias.gamelift.models.UpdateAliasOutput.apply _)
  }
  final implicit val DesiredPlayerSessionDecoder: io.circe.Decoder[avias.gamelift.models.DesiredPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerData")).mapN(avias.gamelift.models.DesiredPlayerSession.apply _)
  }
  final implicit val UpdateGameSessionInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateGameSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[scala.Option[java.lang.String]]("ProtectionPolicy"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("PlayerSessionCreationPolicy")).mapN(avias.gamelift.models.UpdateGameSessionInput.apply _)
  }
  final implicit val DescribeInstancesOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.Instance]]]("Instances"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeInstancesOutput.apply _)
  }
  final implicit val DescribeGameSessionPlacementInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PlacementId").map(avias.gamelift.models.DescribeGameSessionPlacementInput.apply _)
  }
  final implicit val RequestUploadCredentialsInputDecoder: io.circe.Decoder[avias.gamelift.models.RequestUploadCredentialsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(avias.gamelift.models.RequestUploadCredentialsInput.apply _)
  }
  final implicit val ListFleetsOutputDecoder: io.circe.Decoder[avias.gamelift.models.ListFleetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.ListFleetsOutput.apply _)
  }
  final implicit val UpdateFleetAttributesInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetAttributesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups")).mapN(avias.gamelift.models.UpdateFleetAttributesInput.apply _)
  }
  final implicit val DeleteFleetInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteFleetInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(avias.gamelift.models.DeleteFleetInput.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[avias.gamelift.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.InvalidRequestException.apply _)
  }
  final implicit val DescribeGameSessionDetailsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionDetailsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.gamelift.models.DescribeGameSessionDetailsInput.apply _)
  }
  final implicit val IpPermissionDecoder: io.circe.Decoder[avias.gamelift.models.IpPermission] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("FromPort"), o.get[scala.Int]("ToPort"), o.get[java.lang.String]("IpRange"), o.get[java.lang.String]("Protocol")).mapN(avias.gamelift.models.IpPermission.apply _)
  }
  final implicit val CreateAliasOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.Alias]]("Alias").map(avias.gamelift.models.CreateAliasOutput.apply _)
  }
  final implicit val ListAliasesOutputDecoder: io.circe.Decoder[avias.gamelift.models.ListAliasesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.Alias]]]("Aliases"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.ListAliasesOutput.apply _)
  }
  final implicit val DescribeGameSessionQueuesInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionQueuesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeGameSessionQueuesInput.apply _)
  }
  final implicit val EC2InstanceCountsDecoder: io.circe.Decoder[avias.gamelift.models.EC2InstanceCounts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("TERMINATING"), o.get[scala.Option[scala.Int]]("IDLE"), o.get[scala.Option[scala.Int]]("MAXIMUM"), o.get[scala.Option[scala.Int]]("ACTIVE"), o.get[scala.Option[scala.Int]]("DESIRED"), o.get[scala.Option[scala.Int]]("MINIMUM"), o.get[scala.Option[scala.Int]]("PENDING")).mapN(avias.gamelift.models.EC2InstanceCounts.apply _)
  }
  final implicit val MatchedPlayerSessionDecoder: io.circe.Decoder[avias.gamelift.models.MatchedPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionId")).mapN(avias.gamelift.models.MatchedPlayerSession.apply _)
  }
  final implicit val AttributeValueDecoder: io.circe.Decoder[avias.gamelift.models.AttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S"), o.get[scala.Option[scala.Double]]("N"), o.get[scala.Option[scala.List[java.lang.String]]]("SL"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Double]]]("SDM")).mapN(avias.gamelift.models.AttributeValue.apply _)
  }
  final implicit val ListBuildsOutputDecoder: io.circe.Decoder[avias.gamelift.models.ListBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.Build]]]("Builds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.ListBuildsOutput.apply _)
  }
  final implicit val UpdateGameSessionQueueInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[avias.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.List[avias.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(avias.gamelift.models.UpdateGameSessionQueueInput.apply _)
  }
  final implicit val MatchmakingConfigurationDecoder: io.circe.Decoder[avias.gamelift.models.MatchmakingConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("RequestTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[scala.Boolean]]("AcceptanceRequired"), o.get[scala.Option[scala.List[java.lang.String]]]("GameSessionQueueArns"), o.get[scala.Option[java.lang.String]]("NotificationTarget"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RuleSetName")).mapN(avias.gamelift.models.MatchmakingConfiguration.apply _)
  }
  final implicit val CreateMatchmakingConfigurationInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("RequestTimeoutSeconds"), o.get[scala.Boolean]("AcceptanceRequired"), o.get[scala.List[java.lang.String]]("GameSessionQueueArns"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("RuleSetName"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("NotificationTarget")).mapN(avias.gamelift.models.CreateMatchmakingConfigurationInput.apply _)
  }
  final implicit val PlacedPlayerSessionDecoder: io.circe.Decoder[avias.gamelift.models.PlacedPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionId")).mapN(avias.gamelift.models.PlacedPlayerSession.apply _)
  }
  final implicit val VpcPeeringConnectionDecoder: io.circe.Decoder[avias.gamelift.models.VpcPeeringConnection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpV4CidrBlock"), o.get[scala.Option[java.lang.String]]("VpcPeeringConnectionId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.lang.String]]("GameLiftVpcId"), o.get[scala.Option[avias.gamelift.models.VpcPeeringConnectionStatus]]("Status")).mapN(avias.gamelift.models.VpcPeeringConnection.apply _)
  }
  final implicit val DeleteGameSessionQueueInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.gamelift.models.DeleteGameSessionQueueInput.apply _)
  }
  final implicit val VpcPeeringConnectionStatusDecoder: io.circe.Decoder[avias.gamelift.models.VpcPeeringConnectionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.gamelift.models.VpcPeeringConnectionStatus.apply _)
  }
  final implicit val DescribePlayerSessionsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribePlayerSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.PlayerSession]]]("PlayerSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribePlayerSessionsOutput.apply _)
  }
  final implicit val ValidateMatchmakingRuleSetOutputDecoder: io.circe.Decoder[avias.gamelift.models.ValidateMatchmakingRuleSetOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("Valid").map(avias.gamelift.models.ValidateMatchmakingRuleSetOutput.apply _)
  }
  final implicit val UpdateFleetCapacityOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetCapacityOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(avias.gamelift.models.UpdateFleetCapacityOutput.apply _)
  }
  final implicit val DescribeFleetEventsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetEventsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.Event]]]("Events"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetEventsOutput.apply _)
  }
  final implicit val DescribeFleetEventsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetEventsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetEventsInput.apply _)
  }
  final implicit val EC2InstanceLimitDecoder: io.circe.Decoder[avias.gamelift.models.EC2InstanceLimit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EC2InstanceType"), o.get[scala.Option[scala.Int]]("CurrentInstances"), o.get[scala.Option[scala.Int]]("InstanceLimit")).mapN(avias.gamelift.models.EC2InstanceLimit.apply _)
  }
  final implicit val CreateBuildInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[avias.gamelift.models.S3Location]]("StorageLocation"), o.get[scala.Option[java.lang.String]]("OperatingSystem")).mapN(avias.gamelift.models.CreateBuildInput.apply _)
  }
  final implicit val DescribeFleetPortSettingsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetPortSettingsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(avias.gamelift.models.DescribeFleetPortSettingsInput.apply _)
  }
  final implicit val GamePropertyDecoder: io.circe.Decoder[avias.gamelift.models.GameProperty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.gamelift.models.GameProperty.apply _)
  }
  final implicit val GameSessionFullExceptionDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionFullException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.GameSessionFullException.apply _)
  }
  final implicit val DescribeMatchmakingConfigurationsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingConfigurationsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("RuleSetName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeMatchmakingConfigurationsInput.apply _)
  }
  final implicit val InstanceAccessDecoder: io.circe.Decoder[avias.gamelift.models.InstanceAccess] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[avias.gamelift.models.InstanceCredentials]]("Credentials"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.gamelift.models.InstanceAccess.apply _)
  }
  final implicit val ResourceCreationLimitPolicyDecoder: io.circe.Decoder[avias.gamelift.models.ResourceCreationLimitPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NewGameSessionsPerCreator"), o.get[scala.Option[scala.Int]]("PolicyPeriodInMinutes")).mapN(avias.gamelift.models.ResourceCreationLimitPolicy.apply _)
  }
  final implicit val InternalServiceExceptionDecoder: io.circe.Decoder[avias.gamelift.models.InternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.InternalServiceException.apply _)
  }
  final implicit val DescribeMatchmakingConfigurationsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingConfigurationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.MatchmakingConfiguration]]]("Configurations"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeMatchmakingConfigurationsOutput.apply _)
  }
  final implicit val DeleteScalingPolicyInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("FleetId")).mapN(avias.gamelift.models.DeleteScalingPolicyInput.apply _)
  }
  final implicit val CreateAliasInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateAliasInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.gamelift.models.RoutingStrategy]("RoutingStrategy"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.gamelift.models.CreateAliasInput.apply _)
  }
  final implicit val RuntimeConfigurationDecoder: io.circe.Decoder[avias.gamelift.models.RuntimeConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.ServerProcess]]]("ServerProcesses"), o.get[scala.Option[scala.Int]]("MaxConcurrentGameSessionActivations"), o.get[scala.Option[scala.Int]]("GameSessionActivationTimeoutSeconds")).mapN(avias.gamelift.models.RuntimeConfiguration.apply _)
  }
  final implicit val CreateVpcPeeringAuthorizationInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateVpcPeeringAuthorizationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameLiftAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(avias.gamelift.models.CreateVpcPeeringAuthorizationInput.apply _)
  }
  final implicit val UnauthorizedExceptionDecoder: io.circe.Decoder[avias.gamelift.models.UnauthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.UnauthorizedException.apply _)
  }
  final implicit val PlayerLatencyDecoder: io.circe.Decoder[avias.gamelift.models.PlayerLatency] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("RegionIdentifier"), o.get[scala.Option[scala.Float]]("LatencyInMilliseconds")).mapN(avias.gamelift.models.PlayerLatency.apply _)
  }
  final implicit val DescribeMatchmakingRuleSetsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingRuleSetsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeMatchmakingRuleSetsInput.apply _)
  }
  final implicit val CreateFleetInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("EC2InstanceType"), o.get[java.lang.String]("BuildId"), o.get[scala.Option[scala.List[avias.gamelift.models.IpPermission]]]("EC2InboundPermissions"), o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.lang.String]]("PeerVpcAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.lang.String]]("ServerLaunchPath"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ServerLaunchParameters"), o.get[scala.Option[avias.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[avias.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("LogPaths")).mapN(avias.gamelift.models.CreateFleetInput.apply _)
  }
  final implicit val UpdateFleetPortSettingsInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetPortSettingsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[scala.List[avias.gamelift.models.IpPermission]]]("InboundPermissionAuthorizations"), o.get[scala.Option[scala.List[avias.gamelift.models.IpPermission]]]("InboundPermissionRevocations")).mapN(avias.gamelift.models.UpdateFleetPortSettingsInput.apply _)
  }
  final implicit val DescribeScalingPoliciesOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeScalingPoliciesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.ScalingPolicy]]]("ScalingPolicies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeScalingPoliciesOutput.apply _)
  }
  final implicit val DescribeFleetUtilizationInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetUtilizationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetUtilizationInput.apply _)
  }
  final implicit val DescribeEC2InstanceLimitsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeEC2InstanceLimitsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.EC2InstanceLimit]]]("EC2InstanceLimits").map(avias.gamelift.models.DescribeEC2InstanceLimitsOutput.apply _)
  }
  final implicit val StartGameSessionPlacementOutputDecoder: io.circe.Decoder[avias.gamelift.models.StartGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(avias.gamelift.models.StartGameSessionPlacementOutput.apply _)
  }
  final implicit val DescribeBuildOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.Build]]("Build").map(avias.gamelift.models.DescribeBuildOutput.apply _)
  }
  final implicit val FleetAttributesDecoder: io.circe.Decoder[avias.gamelift.models.FleetAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ServerLaunchPath"), o.get[scala.Option[java.lang.String]]("ServerLaunchParameters"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("FleetArn"), o.get[scala.Option[avias.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("LogPaths"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("BuildId")).mapN(avias.gamelift.models.FleetAttributes.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.gamelift.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.LimitExceededException.apply _)
  }
  final implicit val DescribeEC2InstanceLimitsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeEC2InstanceLimitsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EC2InstanceType").map(avias.gamelift.models.DescribeEC2InstanceLimitsInput.apply _)
  }
  final implicit val FleetCapacityDecoder: io.circe.Decoder[avias.gamelift.models.FleetCapacity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[avias.gamelift.models.EC2InstanceCounts]]("InstanceCounts")).mapN(avias.gamelift.models.FleetCapacity.apply _)
  }
  final implicit val GameSessionDecoder: io.circe.Decoder[avias.gamelift.models.GameSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatorId"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.Int]]("CurrentPlayerSessionCount"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("PlayerSessionCreationPolicy"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.gamelift.models.GameSession.apply _)
  }
  final implicit val InstanceCredentialsDecoder: io.circe.Decoder[avias.gamelift.models.InstanceCredentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Secret")).mapN(avias.gamelift.models.InstanceCredentials.apply _)
  }
  final implicit val CreateMatchmakingRuleSetOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateMatchmakingRuleSetOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.gamelift.models.MatchmakingRuleSet]("RuleSet").map(avias.gamelift.models.CreateMatchmakingRuleSetOutput.apply _)
  }
  final implicit val GameSessionQueueDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionQueue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("GameSessionQueueArn"), o.get[scala.Option[scala.List[avias.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[avias.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(avias.gamelift.models.GameSessionQueue.apply _)
  }
  final implicit val GetInstanceAccessOutputDecoder: io.circe.Decoder[avias.gamelift.models.GetInstanceAccessOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.InstanceAccess]]("InstanceAccess").map(avias.gamelift.models.GetInstanceAccessOutput.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[avias.gamelift.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.NotFoundException.apply _)
  }
  final implicit val UpdateFleetCapacityInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetCapacityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[scala.Int]]("DesiredInstances"), o.get[scala.Option[scala.Int]]("MinSize"), o.get[scala.Option[scala.Int]]("MaxSize")).mapN(avias.gamelift.models.UpdateFleetCapacityInput.apply _)
  }
  final implicit val DescribeGameSessionDetailsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionDetailsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.GameSessionDetail]]]("GameSessionDetails"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeGameSessionDetailsOutput.apply _)
  }
  final implicit val BuildDecoder: io.circe.Decoder[avias.gamelift.models.Build] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("BuildId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Long]]("SizeOnDisk")).mapN(avias.gamelift.models.Build.apply _)
  }
  final implicit val GetGameSessionLogUrlOutputDecoder: io.circe.Decoder[avias.gamelift.models.GetGameSessionLogUrlOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("PreSignedUrl").map(avias.gamelift.models.GetGameSessionLogUrlOutput.apply _)
  }
  final implicit val DescribeMatchmakingOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.MatchmakingTicket]]]("TicketList").map(avias.gamelift.models.DescribeMatchmakingOutput.apply _)
  }
  final implicit val CreateVpcPeeringConnectionInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateVpcPeeringConnectionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("PeerVpcAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(avias.gamelift.models.CreateVpcPeeringConnectionInput.apply _)
  }
  final implicit val S3LocationDecoder: io.circe.Decoder[avias.gamelift.models.S3Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Bucket"), o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(avias.gamelift.models.S3Location.apply _)
  }
  final implicit val DescribeAliasInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(avias.gamelift.models.DescribeAliasInput.apply _)
  }
  final implicit val DescribeMatchmakingRuleSetsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingRuleSetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.gamelift.models.MatchmakingRuleSet]]("RuleSets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeMatchmakingRuleSetsOutput.apply _)
  }
  final implicit val UnsupportedRegionExceptionDecoder: io.circe.Decoder[avias.gamelift.models.UnsupportedRegionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.UnsupportedRegionException.apply _)
  }
  final implicit val DescribeVpcPeeringConnectionsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeVpcPeeringConnectionsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.VpcPeeringConnection]]]("VpcPeeringConnections").map(avias.gamelift.models.DescribeVpcPeeringConnectionsOutput.apply _)
  }
  final implicit val UpdateBuildOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.Build]]("Build").map(avias.gamelift.models.UpdateBuildOutput.apply _)
  }
  final implicit val StartGameSessionPlacementInputDecoder: io.circe.Decoder[avias.gamelift.models.StartGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PlacementId"), o.get[java.lang.String]("GameSessionQueueName"), o.get[scala.Int]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("GameSessionName"), o.get[scala.Option[scala.List[avias.gamelift.models.PlayerLatency]]]("PlayerLatencies"), o.get[scala.Option[scala.List[avias.gamelift.models.DesiredPlayerSession]]]("DesiredPlayerSessions"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData")).mapN(avias.gamelift.models.StartGameSessionPlacementInput.apply _)
  }
  final implicit val GetInstanceAccessInputDecoder: io.circe.Decoder[avias.gamelift.models.GetInstanceAccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("InstanceId")).mapN(avias.gamelift.models.GetInstanceAccessInput.apply _)
  }
  final implicit val CreateVpcPeeringAuthorizationOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateVpcPeeringAuthorizationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.VpcPeeringAuthorization]]("VpcPeeringAuthorization").map(avias.gamelift.models.CreateVpcPeeringAuthorizationOutput.apply _)
  }
  final implicit val FleetCapacityExceededExceptionDecoder: io.circe.Decoder[avias.gamelift.models.FleetCapacityExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.FleetCapacityExceededException.apply _)
  }
  final implicit val DescribeFleetUtilizationOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetUtilizationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.FleetUtilization]]]("FleetUtilization"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetUtilizationOutput.apply _)
  }
  final implicit val InvalidFleetStatusExceptionDecoder: io.circe.Decoder[avias.gamelift.models.InvalidFleetStatusException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.InvalidFleetStatusException.apply _)
  }
  final implicit val GetGameSessionLogUrlInputDecoder: io.circe.Decoder[avias.gamelift.models.GetGameSessionLogUrlInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GameSessionId").map(avias.gamelift.models.GetGameSessionLogUrlInput.apply _)
  }
  final implicit val ConflictExceptionDecoder: io.circe.Decoder[avias.gamelift.models.ConflictException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.ConflictException.apply _)
  }
  final implicit val DescribeFleetCapacityOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetCapacityOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.FleetCapacity]]]("FleetCapacity"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetCapacityOutput.apply _)
  }
  final implicit val GameSessionDetailDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.gamelift.models.GameSession]]("GameSession"), o.get[scala.Option[java.lang.String]]("ProtectionPolicy")).mapN(avias.gamelift.models.GameSessionDetail.apply _)
  }
  final implicit val DescribeBuildInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(avias.gamelift.models.DescribeBuildInput.apply _)
  }
  final implicit val InvalidGameSessionStatusExceptionDecoder: io.circe.Decoder[avias.gamelift.models.InvalidGameSessionStatusException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.InvalidGameSessionStatusException.apply _)
  }
  final implicit val ListAliasesInputDecoder: io.circe.Decoder[avias.gamelift.models.ListAliasesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RoutingStrategyType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.gamelift.models.ListAliasesInput.apply _)
  }
  final implicit val PutScalingPolicyOutputDecoder: io.circe.Decoder[avias.gamelift.models.PutScalingPolicyOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Name").map(avias.gamelift.models.PutScalingPolicyOutput.apply _)
  }
  final implicit val StartMatchmakingOutputDecoder: io.circe.Decoder[avias.gamelift.models.StartMatchmakingOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.MatchmakingTicket]]("MatchmakingTicket").map(avias.gamelift.models.StartMatchmakingOutput.apply _)
  }
  final implicit val UpdateRuntimeConfigurationInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateRuntimeConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[avias.gamelift.models.RuntimeConfiguration]("RuntimeConfiguration")).mapN(avias.gamelift.models.UpdateRuntimeConfigurationInput.apply _)
  }
  final implicit val DescribeGameSessionQueuesOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionQueuesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.GameSessionQueue]]]("GameSessionQueues"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeGameSessionQueuesOutput.apply _)
  }
  final implicit val UpdateMatchmakingConfigurationOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateMatchmakingConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.MatchmakingConfiguration]]("Configuration").map(avias.gamelift.models.UpdateMatchmakingConfigurationOutput.apply _)
  }
  final implicit val ValidateMatchmakingRuleSetInputDecoder: io.circe.Decoder[avias.gamelift.models.ValidateMatchmakingRuleSetInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RuleSetBody").map(avias.gamelift.models.ValidateMatchmakingRuleSetInput.apply _)
  }
  final implicit val CreatePlayerSessionOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreatePlayerSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.PlayerSession]]("PlayerSession").map(avias.gamelift.models.CreatePlayerSessionOutput.apply _)
  }
  final implicit val UpdateBuildInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BuildId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version")).mapN(avias.gamelift.models.UpdateBuildInput.apply _)
  }
  final implicit val GameSessionQueueDestinationDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionQueueDestination] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DestinationArn").map(avias.gamelift.models.GameSessionQueueDestination.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[avias.gamelift.models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.gamelift.models.Instance.apply _)
  }
  final implicit val DescribeVpcPeeringConnectionsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeVpcPeeringConnectionsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(avias.gamelift.models.DescribeVpcPeeringConnectionsInput.apply _)
  }
  final implicit val DeleteAliasInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(avias.gamelift.models.DeleteAliasInput.apply _)
  }
  final implicit val DescribeFleetAttributesInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetAttributesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetAttributesInput.apply _)
  }
  final implicit val UpdateRuntimeConfigurationOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateRuntimeConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration").map(avias.gamelift.models.UpdateRuntimeConfigurationOutput.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[avias.gamelift.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("PreSignedLogUrl"), o.get[scala.Option[java.lang.String]]("EventCode"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.time.Instant]]("EventTime")).mapN(avias.gamelift.models.Event.apply _)
  }
  final implicit val MatchmakingRuleSetDecoder: io.circe.Decoder[avias.gamelift.models.MatchmakingRuleSet] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RuleSetBody"), o.get[scala.Option[java.lang.String]]("RuleSetName"), o.get[scala.Option[java.time.Instant]]("CreationTime")).mapN(avias.gamelift.models.MatchmakingRuleSet.apply _)
  }
  final implicit val SearchGameSessionsInputDecoder: io.circe.Decoder[avias.gamelift.models.SearchGameSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("SortExpression"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.gamelift.models.SearchGameSessionsInput.apply _)
  }
  final implicit val PutScalingPolicyInputDecoder: io.circe.Decoder[avias.gamelift.models.PutScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ComparisonOperator"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("MetricName"), o.get[java.lang.String]("FleetId"), o.get[scala.Int]("EvaluationPeriods"), o.get[scala.Int]("ScalingAdjustment"), o.get[scala.Double]("Threshold"), o.get[java.lang.String]("ScalingAdjustmentType")).mapN(avias.gamelift.models.PutScalingPolicyInput.apply _)
  }
  final implicit val MatchmakingTicketDecoder: io.circe.Decoder[avias.gamelift.models.MatchmakingTicket] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.gamelift.models.GameSessionConnectionInfo]]("GameSessionConnectionInfo"), o.get[scala.Option[java.lang.String]]("StatusReason"), o.get[scala.Option[java.lang.String]]("StatusMessage"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.List[avias.gamelift.models.Player]]]("Players"), o.get[scala.Option[scala.Int]]("EstimatedWaitTime"), o.get[scala.Option[java.lang.String]]("TicketId"), o.get[scala.Option[java.lang.String]]("ConfigurationName")).mapN(avias.gamelift.models.MatchmakingTicket.apply _)
  }
  final implicit val DescribeGameSessionsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.gamelift.models.DescribeGameSessionsInput.apply _)
  }
  final implicit val GameSessionPlacementDecoder: io.circe.Decoder[avias.gamelift.models.GameSessionPlacement] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("GameSessionName"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("GameSessionArn"), o.get[scala.Option[java.lang.String]]("GameSessionRegion"), o.get[scala.Option[scala.List[avias.gamelift.models.PlayerLatency]]]("PlayerLatencies"), o.get[scala.Option[java.lang.String]]("PlacementId"), o.get[scala.Option[java.lang.String]]("GameSessionQueueName"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.List[avias.gamelift.models.PlacedPlayerSession]]]("PlacedPlayerSessions"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.gamelift.models.GameSessionPlacement.apply _)
  }
  final implicit val UpdateAliasInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateAliasInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.gamelift.models.RoutingStrategy]]("RoutingStrategy")).mapN(avias.gamelift.models.UpdateAliasInput.apply _)
  }
  final implicit val DeleteMatchmakingConfigurationInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.gamelift.models.DeleteMatchmakingConfigurationInput.apply _)
  }
  final implicit val RequestUploadCredentialsOutputDecoder: io.circe.Decoder[avias.gamelift.models.RequestUploadCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.gamelift.models.AwsCredentials]]("UploadCredentials"), o.get[scala.Option[avias.gamelift.models.S3Location]]("StorageLocation")).mapN(avias.gamelift.models.RequestUploadCredentialsOutput.apply _)
  }
  final implicit val CreatePlayerSessionsInputDecoder: io.circe.Decoder[avias.gamelift.models.CreatePlayerSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[scala.List[java.lang.String]]("PlayerIds"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("PlayerDataMap")).mapN(avias.gamelift.models.CreatePlayerSessionsInput.apply _)
  }
  final implicit val CreateGameSessionQueueInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[avias.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.List[avias.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(avias.gamelift.models.CreateGameSessionQueueInput.apply _)
  }
  final implicit val TerminalRoutingStrategyExceptionDecoder: io.circe.Decoder[avias.gamelift.models.TerminalRoutingStrategyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.TerminalRoutingStrategyException.apply _)
  }
  final implicit val DeleteVpcPeeringConnectionOutputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteVpcPeeringConnectionOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.DeleteVpcPeeringConnectionOutput)
  final implicit val UpdateGameSessionOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateGameSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSession]]("GameSession").map(avias.gamelift.models.UpdateGameSessionOutput.apply _)
  }
  final implicit val ScalingPolicyDecoder: io.circe.Decoder[avias.gamelift.models.ScalingPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComparisonOperator"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("MetricName"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("EvaluationPeriods"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("ScalingAdjustment"), o.get[scala.Option[scala.Double]]("Threshold"), o.get[scala.Option[java.lang.String]]("ScalingAdjustmentType")).mapN(avias.gamelift.models.ScalingPolicy.apply _)
  }
  final implicit val DescribeRuntimeConfigurationOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeRuntimeConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration").map(avias.gamelift.models.DescribeRuntimeConfigurationOutput.apply _)
  }
  final implicit val DescribeAliasOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.Alias]]("Alias").map(avias.gamelift.models.DescribeAliasOutput.apply _)
  }
  final implicit val UpdateGameSessionQueueOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateGameSessionQueueOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSessionQueue]]("GameSessionQueue").map(avias.gamelift.models.UpdateGameSessionQueueOutput.apply _)
  }
  final implicit val FleetUtilizationDecoder: io.circe.Decoder[avias.gamelift.models.FleetUtilization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("ActiveServerProcessCount"), o.get[scala.Option[scala.Int]]("ActiveGameSessionCount"), o.get[scala.Option[scala.Int]]("CurrentPlayerSessionCount"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount")).mapN(avias.gamelift.models.FleetUtilization.apply _)
  }
  final implicit val DescribeVpcPeeringAuthorizationsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeVpcPeeringAuthorizationsInput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.DescribeVpcPeeringAuthorizationsInput)
  final implicit val DescribeVpcPeeringAuthorizationsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeVpcPeeringAuthorizationsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.VpcPeeringAuthorization]]]("VpcPeeringAuthorizations").map(avias.gamelift.models.DescribeVpcPeeringAuthorizationsOutput.apply _)
  }
  final implicit val DescribeInstancesInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeInstancesInput.apply _)
  }
  final implicit val CreateMatchmakingConfigurationOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateMatchmakingConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.MatchmakingConfiguration]]("Configuration").map(avias.gamelift.models.CreateMatchmakingConfigurationOutput.apply _)
  }
  final implicit val CreateGameSessionQueueOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateGameSessionQueueOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSessionQueue]]("GameSessionQueue").map(avias.gamelift.models.CreateGameSessionQueueOutput.apply _)
  }
  final implicit val PlayerSessionDecoder: io.circe.Decoder[avias.gamelift.models.PlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("PlayerSessionId"), o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[java.lang.String]]("PlayerData"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.gamelift.models.PlayerSession.apply _)
  }
  final implicit val UpdateMatchmakingConfigurationInputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("RequestTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[scala.Boolean]]("AcceptanceRequired"), o.get[scala.Option[scala.List[java.lang.String]]]("GameSessionQueueArns"), o.get[scala.Option[java.lang.String]]("NotificationTarget"), o.get[scala.Option[java.lang.String]]("RuleSetName")).mapN(avias.gamelift.models.UpdateMatchmakingConfigurationInput.apply _)
  }
  final implicit val VpcPeeringAuthorizationDecoder: io.circe.Decoder[avias.gamelift.models.VpcPeeringAuthorization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameLiftAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("ExpirationTime")).mapN(avias.gamelift.models.VpcPeeringAuthorization.apply _)
  }
  final implicit val DescribeScalingPoliciesInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeScalingPoliciesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeScalingPoliciesInput.apply _)
  }
  final implicit val CreateGameSessionInputDecoder: io.circe.Decoder[avias.gamelift.models.CreateGameSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatorId"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[scala.List[avias.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("FleetId")).mapN(avias.gamelift.models.CreateGameSessionInput.apply _)
  }
  final implicit val StopMatchmakingInputDecoder: io.circe.Decoder[avias.gamelift.models.StopMatchmakingInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TicketId").map(avias.gamelift.models.StopMatchmakingInput.apply _)
  }
  final implicit val DescribePlayerSessionsInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribePlayerSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionStatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("PlayerSessionId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.gamelift.models.DescribePlayerSessionsInput.apply _)
  }
  final implicit val CreatePlayerSessionInputDecoder: io.circe.Decoder[avias.gamelift.models.CreatePlayerSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[java.lang.String]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerData")).mapN(avias.gamelift.models.CreatePlayerSessionInput.apply _)
  }
  final implicit val AwsCredentialsDecoder: io.circe.Decoder[avias.gamelift.models.AwsCredentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessKeyId"), o.get[scala.Option[java.lang.String]]("SecretAccessKey"), o.get[scala.Option[java.lang.String]]("SessionToken")).mapN(avias.gamelift.models.AwsCredentials.apply _)
  }
  final implicit val DescribeFleetPortSettingsOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetPortSettingsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.IpPermission]]]("InboundPermissions").map(avias.gamelift.models.DescribeFleetPortSettingsOutput.apply _)
  }
  final implicit val IdempotentParameterMismatchExceptionDecoder: io.circe.Decoder[avias.gamelift.models.IdempotentParameterMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.gamelift.models.IdempotentParameterMismatchException.apply _)
  }
  final implicit val CreateGameSessionOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateGameSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSession]]("GameSession").map(avias.gamelift.models.CreateGameSessionOutput.apply _)
  }
  final implicit val CreateVpcPeeringConnectionOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateVpcPeeringConnectionOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.CreateVpcPeeringConnectionOutput)
  final implicit val StopGameSessionPlacementInputDecoder: io.circe.Decoder[avias.gamelift.models.StopGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PlacementId").map(avias.gamelift.models.StopGameSessionPlacementInput.apply _)
  }
  final implicit val DeleteMatchmakingConfigurationOutputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteMatchmakingConfigurationOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.DeleteMatchmakingConfigurationOutput)
  final implicit val CreateFleetOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateFleetOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.FleetAttributes]]("FleetAttributes").map(avias.gamelift.models.CreateFleetOutput.apply _)
  }
  final implicit val PlayerLatencyPolicyDecoder: io.circe.Decoder[avias.gamelift.models.PlayerLatencyPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaximumIndividualPlayerLatencyMilliseconds"), o.get[scala.Option[scala.Int]]("PolicyDurationSeconds")).mapN(avias.gamelift.models.PlayerLatencyPolicy.apply _)
  }
  final implicit val SearchGameSessionsOutputDecoder: io.circe.Decoder[avias.gamelift.models.SearchGameSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.gamelift.models.GameSession]]]("GameSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.SearchGameSessionsOutput.apply _)
  }
  final implicit val DeleteVpcPeeringConnectionInputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteVpcPeeringConnectionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("VpcPeeringConnectionId")).mapN(avias.gamelift.models.DeleteVpcPeeringConnectionInput.apply _)
  }
  final implicit val DescribeFleetCapacityInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeFleetCapacityInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.gamelift.models.DescribeFleetCapacityInput.apply _)
  }
  final implicit val DeleteVpcPeeringAuthorizationOutputDecoder: io.circe.Decoder[avias.gamelift.models.DeleteVpcPeeringAuthorizationOutput.type] = io.circe.Decoder.decodeUnit.as(avias.gamelift.models.DeleteVpcPeeringAuthorizationOutput)
  final implicit val UpdateFleetAttributesOutputDecoder: io.circe.Decoder[avias.gamelift.models.UpdateFleetAttributesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(avias.gamelift.models.UpdateFleetAttributesOutput.apply _)
  }
  final implicit val DescribeGameSessionPlacementOutputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(avias.gamelift.models.DescribeGameSessionPlacementOutput.apply _)
  }
  final implicit val ServerProcessDecoder: io.circe.Decoder[avias.gamelift.models.ServerProcess] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LaunchPath"), o.get[scala.Int]("ConcurrentExecutions"), o.get[scala.Option[java.lang.String]]("Parameters")).mapN(avias.gamelift.models.ServerProcess.apply _)
  }
  final implicit val DescribeMatchmakingInputDecoder: io.circe.Decoder[avias.gamelift.models.DescribeMatchmakingInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("TicketIds").map(avias.gamelift.models.DescribeMatchmakingInput.apply _)
  }
  final implicit val StopGameSessionPlacementOutputDecoder: io.circe.Decoder[avias.gamelift.models.StopGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(avias.gamelift.models.StopGameSessionPlacementOutput.apply _)
  }
  final implicit val CreateBuildOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreateBuildOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.gamelift.models.Build]]("Build"), o.get[scala.Option[avias.gamelift.models.AwsCredentials]]("UploadCredentials"), o.get[scala.Option[avias.gamelift.models.S3Location]]("StorageLocation")).mapN(avias.gamelift.models.CreateBuildOutput.apply _)
  }
  final implicit val CreatePlayerSessionsOutputDecoder: io.circe.Decoder[avias.gamelift.models.CreatePlayerSessionsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.gamelift.models.PlayerSession]]]("PlayerSessions").map(avias.gamelift.models.CreatePlayerSessionsOutput.apply _)
  }
}