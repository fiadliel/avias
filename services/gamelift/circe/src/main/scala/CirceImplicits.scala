package org.lyranthe.araethura.gamelift
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListFleetsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListFleetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResolveAliasOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ResolveAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val ResolveAliasInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ResolveAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val GameSessionConnectionInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionConnectionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionArn" -> o.gameSessionArn.asJson, "IpAddress" -> o.ipAddress.asJson, "Port" -> o.port.asJson, "MatchedPlayerSessions" -> o.matchedPlayerSessions.asJson)
  }
  final implicit val UpdateFleetPortSettingsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val StartMatchmakingInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StartMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationName" -> o.configurationName.asJson, "Players" -> o.players.asJson, "TicketId" -> o.ticketId.asJson)
  }
  final implicit val StopMatchmakingOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StopMatchmakingOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PlayerEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.Player] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerAttributes" -> o.playerAttributes.asJson, "Team" -> o.team.asJson, "LatencyInMs" -> o.latencyInMs.asJson)
  }
  final implicit val DescribeRuntimeConfigurationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val AliasEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.Alias] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "LastUpdatedTime" -> o.lastUpdatedTime.asJson, "RoutingStrategy" -> o.routingStrategy.asJson, "Description" -> o.description.asJson, "AliasId" -> o.aliasId.asJson, "Name" -> o.name.asJson, "AliasArn" -> o.aliasArn.asJson)
  }
  final implicit val DescribeGameSessionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessions" -> o.gameSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateMatchmakingRuleSetInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "RuleSetBody" -> o.ruleSetBody.asJson)
  }
  final implicit val RoutingStrategyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.RoutingStrategy] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "FleetId" -> o.fleetId.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AcceptMatchInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.AcceptMatchInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketId" -> o.ticketId.asJson, "PlayerIds" -> o.playerIds.asJson, "AcceptanceType" -> o.acceptanceType.asJson)
  }
  final implicit val DeleteGameSessionQueueOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AcceptMatchOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.AcceptMatchOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeFleetAttributesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetAttributes" -> o.fleetAttributes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val DeleteVpcPeeringAuthorizationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val ListBuildsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateAliasOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val DesiredPlayerSessionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DesiredPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerData" -> o.playerData.asJson)
  }
  final implicit val UpdateGameSessionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "ProtectionPolicy" -> o.protectionPolicy.asJson, "Name" -> o.name.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "PlayerSessionCreationPolicy" -> o.playerSessionCreationPolicy.asJson)
  }
  final implicit val DescribeInstancesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Instances" -> o.instances.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeGameSessionPlacementInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson)
  }
  final implicit val RequestUploadCredentialsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val ListFleetsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListFleetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateFleetAttributesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "MetricGroups" -> o.metricGroups.asJson)
  }
  final implicit val DeleteFleetInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeGameSessionDetailsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StatusFilter" -> o.statusFilter.asJson, "NextToken" -> o.nextToken.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "FleetId" -> o.fleetId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val IpPermissionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.IpPermission] = io.circe.Encoder.instance { o => 
    Json.obj("FromPort" -> o.fromPort.asJson, "ToPort" -> o.toPort.asJson, "IpRange" -> o.ipRange.asJson, "Protocol" -> o.protocol.asJson)
  }
  final implicit val CreateAliasOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val ListAliasesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListAliasesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Aliases" -> o.aliases.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeGameSessionQueuesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EC2InstanceCountsEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.EC2InstanceCounts] = io.circe.Encoder.instance { o => 
    Json.obj("TERMINATING" -> o.terminating.asJson, "IDLE" -> o.idle.asJson, "MAXIMUM" -> o.maximum.asJson, "ACTIVE" -> o.active.asJson, "DESIRED" -> o.desired.asJson, "MINIMUM" -> o.minimum.asJson, "PENDING" -> o.pending.asJson)
  }
  final implicit val MatchedPlayerSessionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.MatchedPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerSessionId" -> o.playerSessionId.asJson)
  }
  final implicit val AttributeValueEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.AttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("S" -> o.s.asJson, "N" -> o.n.asJson, "SL" -> o.sl.asJson, "SDM" -> o.sdm.asJson)
  }
  final implicit val ListBuildsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Builds" -> o.builds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateGameSessionQueueInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val MatchmakingConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "NotificationTarget" -> o.notificationTarget.asJson, "Name" -> o.name.asJson, "RuleSetName" -> o.ruleSetName.asJson)
  }
  final implicit val CreateMatchmakingConfigurationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "Name" -> o.name.asJson, "RuleSetName" -> o.ruleSetName.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "NotificationTarget" -> o.notificationTarget.asJson)
  }
  final implicit val PlacedPlayerSessionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PlacedPlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "PlayerSessionId" -> o.playerSessionId.asJson)
  }
  final implicit val VpcPeeringConnectionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.VpcPeeringConnection] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "IpV4CidrBlock" -> o.ipV4CidrBlock.asJson, "VpcPeeringConnectionId" -> o.vpcPeeringConnectionId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "GameLiftVpcId" -> o.gameLiftVpcId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DeleteGameSessionQueueInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val VpcPeeringConnectionStatusEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.VpcPeeringConnectionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DescribePlayerSessionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSessions" -> o.playerSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidateMatchmakingRuleSetOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Valid" -> o.valid.asJson)
  }
  final implicit val UpdateFleetCapacityOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DescribeFleetEventsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetEventsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Events" -> o.events.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFleetEventsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetEventsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EC2InstanceLimitEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.EC2InstanceLimit] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceType" -> o.ec2InstanceType.asJson, "CurrentInstances" -> o.currentInstances.asJson, "InstanceLimit" -> o.instanceLimit.asJson)
  }
  final implicit val CreateBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Version" -> o.version.asJson, "StorageLocation" -> o.storageLocation.asJson, "OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val DescribeFleetPortSettingsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val GamePropertyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameProperty] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val GameSessionFullExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionFullException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMatchmakingConfigurationsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "RuleSetName" -> o.ruleSetName.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InstanceAccessEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InstanceAccess] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "Credentials" -> o.credentials.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val ResourceCreationLimitPolicyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("NewGameSessionsPerCreator" -> o.newGameSessionsPerCreator.asJson, "PolicyPeriodInMinutes" -> o.policyPeriodInMinutes.asJson)
  }
  final implicit val InternalServiceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMatchmakingConfigurationsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configurations" -> o.configurations.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteScalingPolicyInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "FleetId" -> o.fleetId.asJson)
  }
  final implicit val CreateAliasInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "RoutingStrategy" -> o.routingStrategy.asJson, "Description" -> o.description.asJson)
  }
  final implicit val RuntimeConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ServerProcesses" -> o.serverProcesses.asJson, "MaxConcurrentGameSessionActivations" -> o.maxConcurrentGameSessionActivations.asJson, "GameSessionActivationTimeoutSeconds" -> o.gameSessionActivationTimeoutSeconds.asJson)
  }
  final implicit val CreateVpcPeeringAuthorizationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val UnauthorizedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UnauthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PlayerLatencyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PlayerLatency] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerId" -> o.playerId.asJson, "RegionIdentifier" -> o.regionIdentifier.asJson, "LatencyInMilliseconds" -> o.latencyInMilliseconds.asJson)
  }
  final implicit val DescribeMatchmakingRuleSetsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateFleetInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EC2InstanceType" -> o.ec2InstanceType.asJson, "BuildId" -> o.buildId.asJson, "EC2InboundPermissions" -> o.ec2InboundPermissions.asJson, "NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "ServerLaunchPath" -> o.serverLaunchPath.asJson, "Description" -> o.description.asJson, "ServerLaunchParameters" -> o.serverLaunchParameters.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "RuntimeConfiguration" -> o.runtimeConfiguration.asJson, "MetricGroups" -> o.metricGroups.asJson, "LogPaths" -> o.logPaths.asJson)
  }
  final implicit val UpdateFleetPortSettingsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InboundPermissionAuthorizations" -> o.inboundPermissionAuthorizations.asJson, "InboundPermissionRevocations" -> o.inboundPermissionRevocations.asJson)
  }
  final implicit val DescribeScalingPoliciesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingPolicies" -> o.scalingPolicies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFleetUtilizationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeEC2InstanceLimitsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceLimits" -> o.ec2InstanceLimits.asJson)
  }
  final implicit val StartGameSessionPlacementOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val DescribeBuildOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson)
  }
  final implicit val FleetAttributesEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.FleetAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("NewGameSessionProtectionPolicy" -> o.newGameSessionProtectionPolicy.asJson, "CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "Status" -> o.status.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "ServerLaunchPath" -> o.serverLaunchPath.asJson, "ServerLaunchParameters" -> o.serverLaunchParameters.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "FleetArn" -> o.fleetArn.asJson, "ResourceCreationLimitPolicy" -> o.resourceCreationLimitPolicy.asJson, "MetricGroups" -> o.metricGroups.asJson, "LogPaths" -> o.logPaths.asJson, "FleetId" -> o.fleetId.asJson, "BuildId" -> o.buildId.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeEC2InstanceLimitsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsInput] = io.circe.Encoder.instance { o => 
    Json.obj("EC2InstanceType" -> o.ec2InstanceType.asJson)
  }
  final implicit val FleetCapacityEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.FleetCapacity] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceCounts" -> o.instanceCounts.asJson)
  }
  final implicit val GameSessionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSession] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "Status" -> o.status.asJson, "GameSessionId" -> o.gameSessionId.asJson, "Name" -> o.name.asJson, "CreatorId" -> o.creatorId.asJson, "Port" -> o.port.asJson, "CurrentPlayerSessionCount" -> o.currentPlayerSessionCount.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "PlayerSessionCreationPolicy" -> o.playerSessionCreationPolicy.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val InstanceCredentialsEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InstanceCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "Secret" -> o.secret.asJson)
  }
  final implicit val CreateMatchmakingRuleSetOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSet" -> o.ruleSet.asJson)
  }
  final implicit val GameSessionQueueEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionQueue] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "GameSessionQueueArn" -> o.gameSessionQueueArn.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val GetInstanceAccessOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GetInstanceAccessOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceAccess" -> o.instanceAccess.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateFleetCapacityInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "DesiredInstances" -> o.desiredInstances.asJson, "MinSize" -> o.minSize.asJson, "MaxSize" -> o.maxSize.asJson)
  }
  final implicit val DescribeGameSessionDetailsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionDetails" -> o.gameSessionDetails.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.Build] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "BuildId" -> o.buildId.asJson, "Status" -> o.status.asJson, "SizeOnDisk" -> o.sizeOnDisk.asJson)
  }
  final implicit val GetGameSessionLogUrlOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PreSignedUrl" -> o.preSignedUrl.asJson)
  }
  final implicit val DescribeMatchmakingOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketList" -> o.ticketList.asJson)
  }
  final implicit val CreateVpcPeeringConnectionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson)
  }
  final implicit val S3LocationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.S3Location] = io.circe.Encoder.instance { o => 
    Json.obj("Bucket" -> o.bucket.asJson, "Key" -> o.key.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val DescribeAliasInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val DescribeMatchmakingRuleSetsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSets" -> o.ruleSets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnsupportedRegionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UnsupportedRegionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeVpcPeeringConnectionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringConnections" -> o.vpcPeeringConnections.asJson)
  }
  final implicit val UpdateBuildOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson)
  }
  final implicit val StartGameSessionPlacementInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson, "GameSessionQueueName" -> o.gameSessionQueueName.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "GameSessionName" -> o.gameSessionName.asJson, "PlayerLatencies" -> o.playerLatencies.asJson, "DesiredPlayerSessions" -> o.desiredPlayerSessions.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson)
  }
  final implicit val GetInstanceAccessInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GetInstanceAccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceId" -> o.instanceId.asJson)
  }
  final implicit val CreateVpcPeeringAuthorizationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringAuthorization" -> o.vpcPeeringAuthorization.asJson)
  }
  final implicit val FleetCapacityExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.FleetCapacityExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeFleetUtilizationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetUtilization" -> o.fleetUtilization.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidFleetStatusExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InvalidFleetStatusException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val GetGameSessionLogUrlInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson)
  }
  final implicit val ConflictExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ConflictException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeFleetCapacityOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetCapacity" -> o.fleetCapacity.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GameSessionDetailEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson, "ProtectionPolicy" -> o.protectionPolicy.asJson)
  }
  final implicit val DescribeBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson)
  }
  final implicit val InvalidGameSessionStatusExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.InvalidGameSessionStatusException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListAliasesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ListAliasesInput] = io.circe.Encoder.instance { o => 
    Json.obj("RoutingStrategyType" -> o.routingStrategyType.asJson, "Name" -> o.name.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val PutScalingPolicyOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PutScalingPolicyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val StartMatchmakingOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StartMatchmakingOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MatchmakingTicket" -> o.matchmakingTicket.asJson)
  }
  final implicit val UpdateRuntimeConfigurationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val DescribeGameSessionQueuesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueues" -> o.gameSessionQueues.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateMatchmakingConfigurationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configuration" -> o.configuration.asJson)
  }
  final implicit val ValidateMatchmakingRuleSetInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetInput] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSetBody" -> o.ruleSetBody.asJson)
  }
  final implicit val CreatePlayerSessionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSession" -> o.playerSession.asJson)
  }
  final implicit val UpdateBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("BuildId" -> o.buildId.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson)
  }
  final implicit val GameSessionQueueDestinationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination] = io.circe.Encoder.instance { o => 
    Json.obj("DestinationArn" -> o.destinationArn.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "CreationTime" -> o.creationTime.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val DescribeVpcPeeringConnectionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DeleteAliasInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson)
  }
  final implicit val DescribeFleetAttributesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateRuntimeConfigurationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("EventId" -> o.eventId.asJson, "ResourceId" -> o.resourceId.asJson, "PreSignedLogUrl" -> o.preSignedLogUrl.asJson, "EventCode" -> o.eventCode.asJson, "Message" -> o.message.asJson, "EventTime" -> o.eventTime.asJson)
  }
  final implicit val MatchmakingRuleSetEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.MatchmakingRuleSet] = io.circe.Encoder.instance { o => 
    Json.obj("RuleSetBody" -> o.ruleSetBody.asJson, "RuleSetName" -> o.ruleSetName.asJson, "CreationTime" -> o.creationTime.asJson)
  }
  final implicit val SearchGameSessionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.SearchGameSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "AliasId" -> o.aliasId.asJson, "FilterExpression" -> o.filterExpression.asJson, "SortExpression" -> o.sortExpression.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val PutScalingPolicyInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PutScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "Name" -> o.name.asJson, "MetricName" -> o.metricName.asJson, "FleetId" -> o.fleetId.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "ScalingAdjustment" -> o.scalingAdjustment.asJson, "Threshold" -> o.threshold.asJson, "ScalingAdjustmentType" -> o.scalingAdjustmentType.asJson)
  }
  final implicit val MatchmakingTicketEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.MatchmakingTicket] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionConnectionInfo" -> o.gameSessionConnectionInfo.asJson, "StatusReason" -> o.statusReason.asJson, "StatusMessage" -> o.statusMessage.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Status" -> o.status.asJson, "Players" -> o.players.asJson, "EstimatedWaitTime" -> o.estimatedWaitTime.asJson, "TicketId" -> o.ticketId.asJson, "ConfigurationName" -> o.configurationName.asJson)
  }
  final implicit val DescribeGameSessionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StatusFilter" -> o.statusFilter.asJson, "NextToken" -> o.nextToken.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "FleetId" -> o.fleetId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val GameSessionPlacementEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.GameSessionPlacement] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "GameSessionName" -> o.gameSessionName.asJson, "GameSessionId" -> o.gameSessionId.asJson, "GameSessionArn" -> o.gameSessionArn.asJson, "GameSessionRegion" -> o.gameSessionRegion.asJson, "PlayerLatencies" -> o.playerLatencies.asJson, "PlacementId" -> o.placementId.asJson, "GameSessionQueueName" -> o.gameSessionQueueName.asJson, "Port" -> o.port.asJson, "PlacedPlayerSessions" -> o.placedPlayerSessions.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "Status" -> o.status.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val UpdateAliasInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateAliasInput] = io.circe.Encoder.instance { o => 
    Json.obj("AliasId" -> o.aliasId.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "RoutingStrategy" -> o.routingStrategy.asJson)
  }
  final implicit val DeleteMatchmakingConfigurationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val RequestUploadCredentialsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("UploadCredentials" -> o.uploadCredentials.asJson, "StorageLocation" -> o.storageLocation.asJson)
  }
  final implicit val CreatePlayerSessionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerIds" -> o.playerIds.asJson, "PlayerDataMap" -> o.playerDataMap.asJson)
  }
  final implicit val CreateGameSessionQueueInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "TimeoutInSeconds" -> o.timeoutInSeconds.asJson, "PlayerLatencyPolicies" -> o.playerLatencyPolicies.asJson, "Destinations" -> o.destinations.asJson)
  }
  final implicit val TerminalRoutingStrategyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.TerminalRoutingStrategyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteVpcPeeringConnectionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateGameSessionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson)
  }
  final implicit val ScalingPolicyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ScalingPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "Name" -> o.name.asJson, "MetricName" -> o.metricName.asJson, "FleetId" -> o.fleetId.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "Status" -> o.status.asJson, "ScalingAdjustment" -> o.scalingAdjustment.asJson, "Threshold" -> o.threshold.asJson, "ScalingAdjustmentType" -> o.scalingAdjustmentType.asJson)
  }
  final implicit val DescribeRuntimeConfigurationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RuntimeConfiguration" -> o.runtimeConfiguration.asJson)
  }
  final implicit val DescribeAliasOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeAliasOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson)
  }
  final implicit val UpdateGameSessionQueueOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueue" -> o.gameSessionQueue.asJson)
  }
  final implicit val FleetUtilizationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.FleetUtilization] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "ActiveServerProcessCount" -> o.activeServerProcessCount.asJson, "ActiveGameSessionCount" -> o.activeGameSessionCount.asJson, "CurrentPlayerSessionCount" -> o.currentPlayerSessionCount.asJson, "MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson)
  }
  final implicit val DescribeVpcPeeringAuthorizationsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeVpcPeeringAuthorizationsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VpcPeeringAuthorizations" -> o.vpcPeeringAuthorizations.asJson)
  }
  final implicit val DescribeInstancesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "InstanceId" -> o.instanceId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateMatchmakingConfigurationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Configuration" -> o.configuration.asJson)
  }
  final implicit val CreateGameSessionQueueOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionQueue" -> o.gameSessionQueue.asJson)
  }
  final implicit val PlayerSessionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PlayerSession] = io.circe.Encoder.instance { o => 
    Json.obj("CreationTime" -> o.creationTime.asJson, "TerminationTime" -> o.terminationTime.asJson, "PlayerSessionId" -> o.playerSessionId.asJson, "PlayerId" -> o.playerId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "Status" -> o.status.asJson, "Port" -> o.port.asJson, "PlayerData" -> o.playerData.asJson, "FleetId" -> o.fleetId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val UpdateMatchmakingConfigurationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "AcceptanceTimeoutSeconds" -> o.acceptanceTimeoutSeconds.asJson, "Description" -> o.description.asJson, "RequestTimeoutSeconds" -> o.requestTimeoutSeconds.asJson, "CustomEventData" -> o.customEventData.asJson, "AdditionalPlayerCount" -> o.additionalPlayerCount.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "AcceptanceRequired" -> o.acceptanceRequired.asJson, "GameSessionQueueArns" -> o.gameSessionQueueArns.asJson, "NotificationTarget" -> o.notificationTarget.asJson, "RuleSetName" -> o.ruleSetName.asJson)
  }
  final implicit val VpcPeeringAuthorizationEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.VpcPeeringAuthorization] = io.circe.Encoder.instance { o => 
    Json.obj("GameLiftAwsAccountId" -> o.gameLiftAwsAccountId.asJson, "PeerVpcAwsAccountId" -> o.peerVpcAwsAccountId.asJson, "PeerVpcId" -> o.peerVpcId.asJson, "CreationTime" -> o.creationTime.asJson, "ExpirationTime" -> o.expirationTime.asJson)
  }
  final implicit val DescribeScalingPoliciesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "StatusFilter" -> o.statusFilter.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateGameSessionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("MaximumPlayerSessionCount" -> o.maximumPlayerSessionCount.asJson, "Name" -> o.name.asJson, "CreatorId" -> o.creatorId.asJson, "AliasId" -> o.aliasId.asJson, "GameSessionId" -> o.gameSessionId.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "GameProperties" -> o.gameProperties.asJson, "GameSessionData" -> o.gameSessionData.asJson, "FleetId" -> o.fleetId.asJson)
  }
  final implicit val StopMatchmakingInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StopMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketId" -> o.ticketId.asJson)
  }
  final implicit val DescribePlayerSessionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerId" -> o.playerId.asJson, "PlayerSessionStatusFilter" -> o.playerSessionStatusFilter.asJson, "NextToken" -> o.nextToken.asJson, "PlayerSessionId" -> o.playerSessionId.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreatePlayerSessionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionInput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionId" -> o.gameSessionId.asJson, "PlayerId" -> o.playerId.asJson, "PlayerData" -> o.playerData.asJson)
  }
  final implicit val AwsCredentialsEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.AwsCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("AccessKeyId" -> o.accessKeyId.asJson, "SecretAccessKey" -> o.secretAccessKey.asJson, "SessionToken" -> o.sessionToken.asJson)
  }
  final implicit val DescribeFleetPortSettingsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InboundPermissions" -> o.inboundPermissions.asJson)
  }
  final implicit val IdempotentParameterMismatchExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.IdempotentParameterMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateGameSessionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSession" -> o.gameSession.asJson)
  }
  final implicit val CreateVpcPeeringConnectionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopGameSessionPlacementInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementInput] = io.circe.Encoder.instance { o => 
    Json.obj("PlacementId" -> o.placementId.asJson)
  }
  final implicit val DeleteMatchmakingConfigurationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateFleetOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateFleetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetAttributes" -> o.fleetAttributes.asJson)
  }
  final implicit val PlayerLatencyPolicyEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("MaximumIndividualPlayerLatencyMilliseconds" -> o.maximumIndividualPlayerLatencyMilliseconds.asJson, "PolicyDurationSeconds" -> o.policyDurationSeconds.asJson)
  }
  final implicit val SearchGameSessionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.SearchGameSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessions" -> o.gameSessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteVpcPeeringConnectionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson, "VpcPeeringConnectionId" -> o.vpcPeeringConnectionId.asJson)
  }
  final implicit val DescribeFleetCapacityInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityInput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetIds" -> o.fleetIds.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteVpcPeeringAuthorizationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateFleetAttributesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FleetId" -> o.fleetId.asJson)
  }
  final implicit val DescribeGameSessionPlacementOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val ServerProcessEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.ServerProcess] = io.circe.Encoder.instance { o => 
    Json.obj("LaunchPath" -> o.launchPath.asJson, "ConcurrentExecutions" -> o.concurrentExecutions.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val DescribeMatchmakingInputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingInput] = io.circe.Encoder.instance { o => 
    Json.obj("TicketIds" -> o.ticketIds.asJson)
  }
  final implicit val StopGameSessionPlacementOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GameSessionPlacement" -> o.gameSessionPlacement.asJson)
  }
  final implicit val CreateBuildOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreateBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Build" -> o.build.asJson, "UploadCredentials" -> o.uploadCredentials.asJson, "StorageLocation" -> o.storageLocation.asJson)
  }
  final implicit val CreatePlayerSessionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PlayerSessions" -> o.playerSessions.asJson)
  }
  final implicit val ListFleetsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListFleetsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BuildId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.ListFleetsInput.apply _)
  }
  final implicit val ResolveAliasOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ResolveAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(org.lyranthe.araethura.gamelift.models.ResolveAliasOutput.apply _)
  }
  final implicit val ResolveAliasInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ResolveAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(org.lyranthe.araethura.gamelift.models.ResolveAliasInput.apply _)
  }
  final implicit val GameSessionConnectionInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionConnectionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameSessionArn"), o.get[scala.Option[java.lang.String]]("IpAddress"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.MatchedPlayerSession]]]("MatchedPlayerSessions")).mapN(org.lyranthe.araethura.gamelift.models.GameSessionConnectionInfo.apply _)
  }
  final implicit val UpdateFleetPortSettingsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsOutput.apply _)
  }
  final implicit val StartMatchmakingInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StartMatchmakingInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ConfigurationName"), o.get[scala.List[org.lyranthe.araethura.gamelift.models.Player]]("Players"), o.get[scala.Option[java.lang.String]]("TicketId")).mapN(org.lyranthe.araethura.gamelift.models.StartMatchmakingInput.apply _)
  }
  final implicit val StopMatchmakingOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StopMatchmakingOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.StopMatchmakingOutput)
  final implicit val PlayerDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.Player] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.gamelift.models.AttributeValue]]]("PlayerAttributes"), o.get[scala.Option[java.lang.String]]("Team"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("LatencyInMs")).mapN(org.lyranthe.araethura.gamelift.models.Player.apply _)
  }
  final implicit val DescribeRuntimeConfigurationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationInput.apply _)
  }
  final implicit val AliasDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.Alias] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("LastUpdatedTime"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.RoutingStrategy]]("RoutingStrategy"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("AliasArn")).mapN(org.lyranthe.araethura.gamelift.models.Alias.apply _)
  }
  final implicit val DescribeGameSessionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSession]]]("GameSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionsOutput.apply _)
  }
  final implicit val CreateMatchmakingRuleSetInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("RuleSetBody")).mapN(org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetInput.apply _)
  }
  final implicit val RoutingStrategyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.RoutingStrategy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("Message")).mapN(org.lyranthe.araethura.gamelift.models.RoutingStrategy.apply _)
  }
  final implicit val AcceptMatchInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.AcceptMatchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TicketId"), o.get[scala.List[java.lang.String]]("PlayerIds"), o.get[java.lang.String]("AcceptanceType")).mapN(org.lyranthe.araethura.gamelift.models.AcceptMatchInput.apply _)
  }
  final implicit val DeleteGameSessionQueueOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueOutput)
  final implicit val AcceptMatchOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.AcceptMatchOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.AcceptMatchOutput)
  final implicit val DescribeFleetAttributesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.FleetAttributes]]]("FleetAttributes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesOutput.apply _)
  }
  final implicit val DeleteBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(org.lyranthe.araethura.gamelift.models.DeleteBuildInput.apply _)
  }
  final implicit val DeleteVpcPeeringAuthorizationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameLiftAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationInput.apply _)
  }
  final implicit val ListBuildsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListBuildsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.ListBuildsInput.apply _)
  }
  final implicit val UpdateAliasOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Alias]]("Alias").map(org.lyranthe.araethura.gamelift.models.UpdateAliasOutput.apply _)
  }
  final implicit val DesiredPlayerSessionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DesiredPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerData")).mapN(org.lyranthe.araethura.gamelift.models.DesiredPlayerSession.apply _)
  }
  final implicit val UpdateGameSessionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[scala.Option[java.lang.String]]("ProtectionPolicy"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("PlayerSessionCreationPolicy")).mapN(org.lyranthe.araethura.gamelift.models.UpdateGameSessionInput.apply _)
  }
  final implicit val DescribeInstancesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.Instance]]]("Instances"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeInstancesOutput.apply _)
  }
  final implicit val DescribeGameSessionPlacementInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PlacementId").map(org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementInput.apply _)
  }
  final implicit val RequestUploadCredentialsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsInput.apply _)
  }
  final implicit val ListFleetsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListFleetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.ListFleetsOutput.apply _)
  }
  final implicit val UpdateFleetAttributesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups")).mapN(org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesInput.apply _)
  }
  final implicit val DeleteFleetInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteFleetInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(org.lyranthe.araethura.gamelift.models.DeleteFleetInput.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.InvalidRequestException.apply _)
  }
  final implicit val DescribeGameSessionDetailsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsInput.apply _)
  }
  final implicit val IpPermissionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.IpPermission] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("FromPort"), o.get[scala.Int]("ToPort"), o.get[java.lang.String]("IpRange"), o.get[java.lang.String]("Protocol")).mapN(org.lyranthe.araethura.gamelift.models.IpPermission.apply _)
  }
  final implicit val CreateAliasOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Alias]]("Alias").map(org.lyranthe.araethura.gamelift.models.CreateAliasOutput.apply _)
  }
  final implicit val ListAliasesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListAliasesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.Alias]]]("Aliases"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.ListAliasesOutput.apply _)
  }
  final implicit val DescribeGameSessionQueuesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesInput.apply _)
  }
  final implicit val EC2InstanceCountsDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.EC2InstanceCounts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("TERMINATING"), o.get[scala.Option[scala.Int]]("IDLE"), o.get[scala.Option[scala.Int]]("MAXIMUM"), o.get[scala.Option[scala.Int]]("ACTIVE"), o.get[scala.Option[scala.Int]]("DESIRED"), o.get[scala.Option[scala.Int]]("MINIMUM"), o.get[scala.Option[scala.Int]]("PENDING")).mapN(org.lyranthe.araethura.gamelift.models.EC2InstanceCounts.apply _)
  }
  final implicit val MatchedPlayerSessionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.MatchedPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionId")).mapN(org.lyranthe.araethura.gamelift.models.MatchedPlayerSession.apply _)
  }
  final implicit val AttributeValueDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.AttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S"), o.get[scala.Option[scala.Double]]("N"), o.get[scala.Option[scala.List[java.lang.String]]]("SL"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Double]]]("SDM")).mapN(org.lyranthe.araethura.gamelift.models.AttributeValue.apply _)
  }
  final implicit val ListBuildsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.Build]]]("Builds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.ListBuildsOutput.apply _)
  }
  final implicit val UpdateGameSessionQueueInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueInput.apply _)
  }
  final implicit val MatchmakingConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("RequestTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[scala.Boolean]]("AcceptanceRequired"), o.get[scala.Option[scala.List[java.lang.String]]]("GameSessionQueueArns"), o.get[scala.Option[java.lang.String]]("NotificationTarget"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RuleSetName")).mapN(org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration.apply _)
  }
  final implicit val CreateMatchmakingConfigurationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("RequestTimeoutSeconds"), o.get[scala.Boolean]("AcceptanceRequired"), o.get[scala.List[java.lang.String]]("GameSessionQueueArns"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("RuleSetName"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("NotificationTarget")).mapN(org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationInput.apply _)
  }
  final implicit val PlacedPlayerSessionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PlacedPlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionId")).mapN(org.lyranthe.araethura.gamelift.models.PlacedPlayerSession.apply _)
  }
  final implicit val VpcPeeringConnectionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.VpcPeeringConnection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpV4CidrBlock"), o.get[scala.Option[java.lang.String]]("VpcPeeringConnectionId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.lang.String]]("GameLiftVpcId"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.VpcPeeringConnectionStatus]]("Status")).mapN(org.lyranthe.araethura.gamelift.models.VpcPeeringConnection.apply _)
  }
  final implicit val DeleteGameSessionQueueInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.gamelift.models.DeleteGameSessionQueueInput.apply _)
  }
  final implicit val VpcPeeringConnectionStatusDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.VpcPeeringConnectionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(org.lyranthe.araethura.gamelift.models.VpcPeeringConnectionStatus.apply _)
  }
  final implicit val DescribePlayerSessionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerSession]]]("PlayerSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsOutput.apply _)
  }
  final implicit val ValidateMatchmakingRuleSetOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("Valid").map(org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetOutput.apply _)
  }
  final implicit val UpdateFleetCapacityOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityOutput.apply _)
  }
  final implicit val DescribeFleetEventsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetEventsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.Event]]]("Events"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetEventsOutput.apply _)
  }
  final implicit val DescribeFleetEventsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetEventsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetEventsInput.apply _)
  }
  final implicit val EC2InstanceLimitDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.EC2InstanceLimit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EC2InstanceType"), o.get[scala.Option[scala.Int]]("CurrentInstances"), o.get[scala.Option[scala.Int]]("InstanceLimit")).mapN(org.lyranthe.araethura.gamelift.models.EC2InstanceLimit.apply _)
  }
  final implicit val CreateBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.S3Location]]("StorageLocation"), o.get[scala.Option[java.lang.String]]("OperatingSystem")).mapN(org.lyranthe.araethura.gamelift.models.CreateBuildInput.apply _)
  }
  final implicit val DescribeFleetPortSettingsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FleetId").map(org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsInput.apply _)
  }
  final implicit val GamePropertyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameProperty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(org.lyranthe.araethura.gamelift.models.GameProperty.apply _)
  }
  final implicit val GameSessionFullExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionFullException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.GameSessionFullException.apply _)
  }
  final implicit val DescribeMatchmakingConfigurationsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("RuleSetName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsInput.apply _)
  }
  final implicit val InstanceAccessDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InstanceAccess] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.InstanceCredentials]]("Credentials"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(org.lyranthe.araethura.gamelift.models.InstanceAccess.apply _)
  }
  final implicit val ResourceCreationLimitPolicyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NewGameSessionsPerCreator"), o.get[scala.Option[scala.Int]]("PolicyPeriodInMinutes")).mapN(org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy.apply _)
  }
  final implicit val InternalServiceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.InternalServiceException.apply _)
  }
  final implicit val DescribeMatchmakingConfigurationsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration]]]("Configurations"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingConfigurationsOutput.apply _)
  }
  final implicit val DeleteScalingPolicyInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("FleetId")).mapN(org.lyranthe.araethura.gamelift.models.DeleteScalingPolicyInput.apply _)
  }
  final implicit val CreateAliasInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateAliasInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[org.lyranthe.araethura.gamelift.models.RoutingStrategy]("RoutingStrategy"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.gamelift.models.CreateAliasInput.apply _)
  }
  final implicit val RuntimeConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.ServerProcess]]]("ServerProcesses"), o.get[scala.Option[scala.Int]]("MaxConcurrentGameSessionActivations"), o.get[scala.Option[scala.Int]]("GameSessionActivationTimeoutSeconds")).mapN(org.lyranthe.araethura.gamelift.models.RuntimeConfiguration.apply _)
  }
  final implicit val CreateVpcPeeringAuthorizationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameLiftAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationInput.apply _)
  }
  final implicit val UnauthorizedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UnauthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.UnauthorizedException.apply _)
  }
  final implicit val PlayerLatencyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PlayerLatency] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("RegionIdentifier"), o.get[scala.Option[scala.Float]]("LatencyInMilliseconds")).mapN(org.lyranthe.araethura.gamelift.models.PlayerLatency.apply _)
  }
  final implicit val DescribeMatchmakingRuleSetsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsInput.apply _)
  }
  final implicit val CreateFleetInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("EC2InstanceType"), o.get[java.lang.String]("BuildId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.IpPermission]]]("EC2InboundPermissions"), o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.lang.String]]("PeerVpcAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.lang.String]]("ServerLaunchPath"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ServerLaunchParameters"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("LogPaths")).mapN(org.lyranthe.araethura.gamelift.models.CreateFleetInput.apply _)
  }
  final implicit val UpdateFleetPortSettingsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.IpPermission]]]("InboundPermissionAuthorizations"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.IpPermission]]]("InboundPermissionRevocations")).mapN(org.lyranthe.araethura.gamelift.models.UpdateFleetPortSettingsInput.apply _)
  }
  final implicit val DescribeScalingPoliciesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.ScalingPolicy]]]("ScalingPolicies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesOutput.apply _)
  }
  final implicit val DescribeFleetUtilizationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationInput.apply _)
  }
  final implicit val DescribeEC2InstanceLimitsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.EC2InstanceLimit]]]("EC2InstanceLimits").map(org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsOutput.apply _)
  }
  final implicit val StartGameSessionPlacementOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementOutput.apply _)
  }
  final implicit val DescribeBuildOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Build]]("Build").map(org.lyranthe.araethura.gamelift.models.DescribeBuildOutput.apply _)
  }
  final implicit val FleetAttributesDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.FleetAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NewGameSessionProtectionPolicy"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ServerLaunchPath"), o.get[scala.Option[java.lang.String]]("ServerLaunchParameters"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("FleetArn"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.ResourceCreationLimitPolicy]]("ResourceCreationLimitPolicy"), o.get[scala.Option[scala.List[java.lang.String]]]("MetricGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("LogPaths"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("BuildId")).mapN(org.lyranthe.araethura.gamelift.models.FleetAttributes.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.LimitExceededException.apply _)
  }
  final implicit val DescribeEC2InstanceLimitsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("EC2InstanceType").map(org.lyranthe.araethura.gamelift.models.DescribeEC2InstanceLimitsInput.apply _)
  }
  final implicit val FleetCapacityDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.FleetCapacity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.EC2InstanceCounts]]("InstanceCounts")).mapN(org.lyranthe.araethura.gamelift.models.FleetCapacity.apply _)
  }
  final implicit val GameSessionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatorId"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.Int]]("CurrentPlayerSessionCount"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("PlayerSessionCreationPolicy"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(org.lyranthe.araethura.gamelift.models.GameSession.apply _)
  }
  final implicit val InstanceCredentialsDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InstanceCredentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Secret")).mapN(org.lyranthe.araethura.gamelift.models.InstanceCredentials.apply _)
  }
  final implicit val CreateMatchmakingRuleSetOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetOutput] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.gamelift.models.MatchmakingRuleSet]("RuleSet").map(org.lyranthe.araethura.gamelift.models.CreateMatchmakingRuleSetOutput.apply _)
  }
  final implicit val GameSessionQueueDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionQueue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("GameSessionQueueArn"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(org.lyranthe.araethura.gamelift.models.GameSessionQueue.apply _)
  }
  final implicit val GetInstanceAccessOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GetInstanceAccessOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.InstanceAccess]]("InstanceAccess").map(org.lyranthe.araethura.gamelift.models.GetInstanceAccessOutput.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.NotFoundException.apply _)
  }
  final implicit val UpdateFleetCapacityInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[scala.Int]]("DesiredInstances"), o.get[scala.Option[scala.Int]]("MinSize"), o.get[scala.Option[scala.Int]]("MaxSize")).mapN(org.lyranthe.araethura.gamelift.models.UpdateFleetCapacityInput.apply _)
  }
  final implicit val DescribeGameSessionDetailsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSessionDetail]]]("GameSessionDetails"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionDetailsOutput.apply _)
  }
  final implicit val BuildDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.Build] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("BuildId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Long]]("SizeOnDisk")).mapN(org.lyranthe.araethura.gamelift.models.Build.apply _)
  }
  final implicit val GetGameSessionLogUrlOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("PreSignedUrl").map(org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlOutput.apply _)
  }
  final implicit val DescribeMatchmakingOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.MatchmakingTicket]]]("TicketList").map(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingOutput.apply _)
  }
  final implicit val CreateVpcPeeringConnectionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("PeerVpcAwsAccountId"), o.get[java.lang.String]("PeerVpcId")).mapN(org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionInput.apply _)
  }
  final implicit val S3LocationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.S3Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Bucket"), o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(org.lyranthe.araethura.gamelift.models.S3Location.apply _)
  }
  final implicit val DescribeAliasInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(org.lyranthe.araethura.gamelift.models.DescribeAliasInput.apply _)
  }
  final implicit val DescribeMatchmakingRuleSetsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.gamelift.models.MatchmakingRuleSet]]("RuleSets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingRuleSetsOutput.apply _)
  }
  final implicit val UnsupportedRegionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UnsupportedRegionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.UnsupportedRegionException.apply _)
  }
  final implicit val DescribeVpcPeeringConnectionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.VpcPeeringConnection]]]("VpcPeeringConnections").map(org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsOutput.apply _)
  }
  final implicit val UpdateBuildOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Build]]("Build").map(org.lyranthe.araethura.gamelift.models.UpdateBuildOutput.apply _)
  }
  final implicit val StartGameSessionPlacementInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PlacementId"), o.get[java.lang.String]("GameSessionQueueName"), o.get[scala.Int]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("GameSessionName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerLatency]]]("PlayerLatencies"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.DesiredPlayerSession]]]("DesiredPlayerSessions"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData")).mapN(org.lyranthe.araethura.gamelift.models.StartGameSessionPlacementInput.apply _)
  }
  final implicit val GetInstanceAccessInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GetInstanceAccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("InstanceId")).mapN(org.lyranthe.araethura.gamelift.models.GetInstanceAccessInput.apply _)
  }
  final implicit val CreateVpcPeeringAuthorizationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.VpcPeeringAuthorization]]("VpcPeeringAuthorization").map(org.lyranthe.araethura.gamelift.models.CreateVpcPeeringAuthorizationOutput.apply _)
  }
  final implicit val FleetCapacityExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.FleetCapacityExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.FleetCapacityExceededException.apply _)
  }
  final implicit val DescribeFleetUtilizationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.FleetUtilization]]]("FleetUtilization"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetUtilizationOutput.apply _)
  }
  final implicit val InvalidFleetStatusExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InvalidFleetStatusException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.InvalidFleetStatusException.apply _)
  }
  final implicit val GetGameSessionLogUrlInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GameSessionId").map(org.lyranthe.araethura.gamelift.models.GetGameSessionLogUrlInput.apply _)
  }
  final implicit val ConflictExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ConflictException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.ConflictException.apply _)
  }
  final implicit val DescribeFleetCapacityOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.FleetCapacity]]]("FleetCapacity"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityOutput.apply _)
  }
  final implicit val GameSessionDetailDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSession]]("GameSession"), o.get[scala.Option[java.lang.String]]("ProtectionPolicy")).mapN(org.lyranthe.araethura.gamelift.models.GameSessionDetail.apply _)
  }
  final implicit val DescribeBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BuildId").map(org.lyranthe.araethura.gamelift.models.DescribeBuildInput.apply _)
  }
  final implicit val InvalidGameSessionStatusExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.InvalidGameSessionStatusException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.InvalidGameSessionStatusException.apply _)
  }
  final implicit val ListAliasesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ListAliasesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RoutingStrategyType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.gamelift.models.ListAliasesInput.apply _)
  }
  final implicit val PutScalingPolicyOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PutScalingPolicyOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Name").map(org.lyranthe.araethura.gamelift.models.PutScalingPolicyOutput.apply _)
  }
  final implicit val StartMatchmakingOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StartMatchmakingOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.MatchmakingTicket]]("MatchmakingTicket").map(org.lyranthe.araethura.gamelift.models.StartMatchmakingOutput.apply _)
  }
  final implicit val UpdateRuntimeConfigurationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration]("RuntimeConfiguration")).mapN(org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationInput.apply _)
  }
  final implicit val DescribeGameSessionQueuesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSessionQueue]]]("GameSessionQueues"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionQueuesOutput.apply _)
  }
  final implicit val UpdateMatchmakingConfigurationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration]]("Configuration").map(org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationOutput.apply _)
  }
  final implicit val ValidateMatchmakingRuleSetInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RuleSetBody").map(org.lyranthe.araethura.gamelift.models.ValidateMatchmakingRuleSetInput.apply _)
  }
  final implicit val CreatePlayerSessionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.PlayerSession]]("PlayerSession").map(org.lyranthe.araethura.gamelift.models.CreatePlayerSessionOutput.apply _)
  }
  final implicit val UpdateBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BuildId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version")).mapN(org.lyranthe.araethura.gamelift.models.UpdateBuildInput.apply _)
  }
  final implicit val GameSessionQueueDestinationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DestinationArn").map(org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(org.lyranthe.araethura.gamelift.models.Instance.apply _)
  }
  final implicit val DescribeVpcPeeringConnectionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringConnectionsInput.apply _)
  }
  final implicit val DeleteAliasInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteAliasInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasId").map(org.lyranthe.araethura.gamelift.models.DeleteAliasInput.apply _)
  }
  final implicit val DescribeFleetAttributesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetAttributesInput.apply _)
  }
  final implicit val UpdateRuntimeConfigurationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration").map(org.lyranthe.araethura.gamelift.models.UpdateRuntimeConfigurationOutput.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("PreSignedLogUrl"), o.get[scala.Option[java.lang.String]]("EventCode"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.time.Instant]]("EventTime")).mapN(org.lyranthe.araethura.gamelift.models.Event.apply _)
  }
  final implicit val MatchmakingRuleSetDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.MatchmakingRuleSet] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RuleSetBody"), o.get[scala.Option[java.lang.String]]("RuleSetName"), o.get[scala.Option[java.time.Instant]]("CreationTime")).mapN(org.lyranthe.araethura.gamelift.models.MatchmakingRuleSet.apply _)
  }
  final implicit val SearchGameSessionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.SearchGameSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("SortExpression"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.gamelift.models.SearchGameSessionsInput.apply _)
  }
  final implicit val PutScalingPolicyInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PutScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ComparisonOperator"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("MetricName"), o.get[java.lang.String]("FleetId"), o.get[scala.Int]("EvaluationPeriods"), o.get[scala.Int]("ScalingAdjustment"), o.get[scala.Double]("Threshold"), o.get[java.lang.String]("ScalingAdjustmentType")).mapN(org.lyranthe.araethura.gamelift.models.PutScalingPolicyInput.apply _)
  }
  final implicit val MatchmakingTicketDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.MatchmakingTicket] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionConnectionInfo]]("GameSessionConnectionInfo"), o.get[scala.Option[java.lang.String]]("StatusReason"), o.get[scala.Option[java.lang.String]]("StatusMessage"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.Player]]]("Players"), o.get[scala.Option[scala.Int]]("EstimatedWaitTime"), o.get[scala.Option[java.lang.String]]("TicketId"), o.get[scala.Option[java.lang.String]]("ConfigurationName")).mapN(org.lyranthe.araethura.gamelift.models.MatchmakingTicket.apply _)
  }
  final implicit val DescribeGameSessionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.gamelift.models.DescribeGameSessionsInput.apply _)
  }
  final implicit val GameSessionPlacementDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.GameSessionPlacement] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("GameSessionName"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("GameSessionArn"), o.get[scala.Option[java.lang.String]]("GameSessionRegion"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerLatency]]]("PlayerLatencies"), o.get[scala.Option[java.lang.String]]("PlacementId"), o.get[scala.Option[java.lang.String]]("GameSessionQueueName"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlacedPlayerSession]]]("PlacedPlayerSessions"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(org.lyranthe.araethura.gamelift.models.GameSessionPlacement.apply _)
  }
  final implicit val UpdateAliasInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateAliasInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.RoutingStrategy]]("RoutingStrategy")).mapN(org.lyranthe.araethura.gamelift.models.UpdateAliasInput.apply _)
  }
  final implicit val DeleteMatchmakingConfigurationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationInput.apply _)
  }
  final implicit val RequestUploadCredentialsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.gamelift.models.AwsCredentials]]("UploadCredentials"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.S3Location]]("StorageLocation")).mapN(org.lyranthe.araethura.gamelift.models.RequestUploadCredentialsOutput.apply _)
  }
  final implicit val CreatePlayerSessionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[scala.List[java.lang.String]]("PlayerIds"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("PlayerDataMap")).mapN(org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsInput.apply _)
  }
  final implicit val CreateGameSessionQueueInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("TimeoutInSeconds"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy]]]("PlayerLatencyPolicies"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSessionQueueDestination]]]("Destinations")).mapN(org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueInput.apply _)
  }
  final implicit val TerminalRoutingStrategyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.TerminalRoutingStrategyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.TerminalRoutingStrategyException.apply _)
  }
  final implicit val DeleteVpcPeeringConnectionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionOutput)
  final implicit val UpdateGameSessionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSession]]("GameSession").map(org.lyranthe.araethura.gamelift.models.UpdateGameSessionOutput.apply _)
  }
  final implicit val ScalingPolicyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ScalingPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComparisonOperator"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("MetricName"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("EvaluationPeriods"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("ScalingAdjustment"), o.get[scala.Option[scala.Double]]("Threshold"), o.get[scala.Option[java.lang.String]]("ScalingAdjustmentType")).mapN(org.lyranthe.araethura.gamelift.models.ScalingPolicy.apply _)
  }
  final implicit val DescribeRuntimeConfigurationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.RuntimeConfiguration]]("RuntimeConfiguration").map(org.lyranthe.araethura.gamelift.models.DescribeRuntimeConfigurationOutput.apply _)
  }
  final implicit val DescribeAliasOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeAliasOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Alias]]("Alias").map(org.lyranthe.araethura.gamelift.models.DescribeAliasOutput.apply _)
  }
  final implicit val UpdateGameSessionQueueOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionQueue]]("GameSessionQueue").map(org.lyranthe.araethura.gamelift.models.UpdateGameSessionQueueOutput.apply _)
  }
  final implicit val FleetUtilizationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.FleetUtilization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[scala.Int]]("ActiveServerProcessCount"), o.get[scala.Option[scala.Int]]("ActiveGameSessionCount"), o.get[scala.Option[scala.Int]]("CurrentPlayerSessionCount"), o.get[scala.Option[scala.Int]]("MaximumPlayerSessionCount")).mapN(org.lyranthe.araethura.gamelift.models.FleetUtilization.apply _)
  }
  final implicit val DescribeVpcPeeringAuthorizationsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsInput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsInput)
  final implicit val DescribeVpcPeeringAuthorizationsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.VpcPeeringAuthorization]]]("VpcPeeringAuthorizations").map(org.lyranthe.araethura.gamelift.models.DescribeVpcPeeringAuthorizationsOutput.apply _)
  }
  final implicit val DescribeInstancesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeInstancesInput.apply _)
  }
  final implicit val CreateMatchmakingConfigurationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.MatchmakingConfiguration]]("Configuration").map(org.lyranthe.araethura.gamelift.models.CreateMatchmakingConfigurationOutput.apply _)
  }
  final implicit val CreateGameSessionQueueOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionQueue]]("GameSessionQueue").map(org.lyranthe.araethura.gamelift.models.CreateGameSessionQueueOutput.apply _)
  }
  final implicit val PlayerSessionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PlayerSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("TerminationTime"), o.get[scala.Option[java.lang.String]]("PlayerSessionId"), o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("Port"), o.get[scala.Option[java.lang.String]]("PlayerData"), o.get[scala.Option[java.lang.String]]("FleetId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(org.lyranthe.araethura.gamelift.models.PlayerSession.apply _)
  }
  final implicit val UpdateMatchmakingConfigurationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("AcceptanceTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("RequestTimeoutSeconds"), o.get[scala.Option[java.lang.String]]("CustomEventData"), o.get[scala.Option[scala.Int]]("AdditionalPlayerCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[scala.Boolean]]("AcceptanceRequired"), o.get[scala.Option[scala.List[java.lang.String]]]("GameSessionQueueArns"), o.get[scala.Option[java.lang.String]]("NotificationTarget"), o.get[scala.Option[java.lang.String]]("RuleSetName")).mapN(org.lyranthe.araethura.gamelift.models.UpdateMatchmakingConfigurationInput.apply _)
  }
  final implicit val VpcPeeringAuthorizationDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.VpcPeeringAuthorization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameLiftAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcAwsAccountId"), o.get[scala.Option[java.lang.String]]("PeerVpcId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("ExpirationTime")).mapN(org.lyranthe.araethura.gamelift.models.VpcPeeringAuthorization.apply _)
  }
  final implicit val DescribeScalingPoliciesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[scala.Option[java.lang.String]]("StatusFilter"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeScalingPoliciesInput.apply _)
  }
  final implicit val CreateGameSessionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaximumPlayerSessionCount"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("CreatorId"), o.get[scala.Option[java.lang.String]]("AliasId"), o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameProperty]]]("GameProperties"), o.get[scala.Option[java.lang.String]]("GameSessionData"), o.get[scala.Option[java.lang.String]]("FleetId")).mapN(org.lyranthe.araethura.gamelift.models.CreateGameSessionInput.apply _)
  }
  final implicit val StopMatchmakingInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StopMatchmakingInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TicketId").map(org.lyranthe.araethura.gamelift.models.StopMatchmakingInput.apply _)
  }
  final implicit val DescribePlayerSessionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GameSessionId"), o.get[scala.Option[java.lang.String]]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerSessionStatusFilter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("PlayerSessionId"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.gamelift.models.DescribePlayerSessionsInput.apply _)
  }
  final implicit val CreatePlayerSessionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GameSessionId"), o.get[java.lang.String]("PlayerId"), o.get[scala.Option[java.lang.String]]("PlayerData")).mapN(org.lyranthe.araethura.gamelift.models.CreatePlayerSessionInput.apply _)
  }
  final implicit val AwsCredentialsDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.AwsCredentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessKeyId"), o.get[scala.Option[java.lang.String]]("SecretAccessKey"), o.get[scala.Option[java.lang.String]]("SessionToken")).mapN(org.lyranthe.araethura.gamelift.models.AwsCredentials.apply _)
  }
  final implicit val DescribeFleetPortSettingsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.IpPermission]]]("InboundPermissions").map(org.lyranthe.araethura.gamelift.models.DescribeFleetPortSettingsOutput.apply _)
  }
  final implicit val IdempotentParameterMismatchExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.IdempotentParameterMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.gamelift.models.IdempotentParameterMismatchException.apply _)
  }
  final implicit val CreateGameSessionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateGameSessionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSession]]("GameSession").map(org.lyranthe.araethura.gamelift.models.CreateGameSessionOutput.apply _)
  }
  final implicit val CreateVpcPeeringConnectionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.CreateVpcPeeringConnectionOutput)
  final implicit val StopGameSessionPlacementInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PlacementId").map(org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementInput.apply _)
  }
  final implicit val DeleteMatchmakingConfigurationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.DeleteMatchmakingConfigurationOutput)
  final implicit val CreateFleetOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateFleetOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.FleetAttributes]]("FleetAttributes").map(org.lyranthe.araethura.gamelift.models.CreateFleetOutput.apply _)
  }
  final implicit val PlayerLatencyPolicyDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaximumIndividualPlayerLatencyMilliseconds"), o.get[scala.Option[scala.Int]]("PolicyDurationSeconds")).mapN(org.lyranthe.araethura.gamelift.models.PlayerLatencyPolicy.apply _)
  }
  final implicit val SearchGameSessionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.SearchGameSessionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.GameSession]]]("GameSessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.SearchGameSessionsOutput.apply _)
  }
  final implicit val DeleteVpcPeeringConnectionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetId"), o.get[java.lang.String]("VpcPeeringConnectionId")).mapN(org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringConnectionInput.apply _)
  }
  final implicit val DescribeFleetCapacityInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("FleetIds"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.gamelift.models.DescribeFleetCapacityInput.apply _)
  }
  final implicit val DeleteVpcPeeringAuthorizationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.gamelift.models.DeleteVpcPeeringAuthorizationOutput)
  final implicit val UpdateFleetAttributesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FleetId").map(org.lyranthe.araethura.gamelift.models.UpdateFleetAttributesOutput.apply _)
  }
  final implicit val DescribeGameSessionPlacementOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(org.lyranthe.araethura.gamelift.models.DescribeGameSessionPlacementOutput.apply _)
  }
  final implicit val ServerProcessDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.ServerProcess] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LaunchPath"), o.get[scala.Int]("ConcurrentExecutions"), o.get[scala.Option[java.lang.String]]("Parameters")).mapN(org.lyranthe.araethura.gamelift.models.ServerProcess.apply _)
  }
  final implicit val DescribeMatchmakingInputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.DescribeMatchmakingInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("TicketIds").map(org.lyranthe.araethura.gamelift.models.DescribeMatchmakingInput.apply _)
  }
  final implicit val StopGameSessionPlacementOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.gamelift.models.GameSessionPlacement]]("GameSessionPlacement").map(org.lyranthe.araethura.gamelift.models.StopGameSessionPlacementOutput.apply _)
  }
  final implicit val CreateBuildOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreateBuildOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.gamelift.models.Build]]("Build"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.AwsCredentials]]("UploadCredentials"), o.get[scala.Option[org.lyranthe.araethura.gamelift.models.S3Location]]("StorageLocation")).mapN(org.lyranthe.araethura.gamelift.models.CreateBuildOutput.apply _)
  }
  final implicit val CreatePlayerSessionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.gamelift.models.PlayerSession]]]("PlayerSessions").map(org.lyranthe.araethura.gamelift.models.CreatePlayerSessionsOutput.apply _)
  }
}