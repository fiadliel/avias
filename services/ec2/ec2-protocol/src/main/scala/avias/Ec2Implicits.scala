package avias.ec2
import org.http4s._
import org.http4s.UrlForm._
import avias.ec2.models._
import avias.Ec2RequestEncoder
object ec2 {
  implicit val PrivateIpAddressSpecificationEc2Encoder: Ec2RequestEncoder[PrivateIpAddressSpecification] = (fieldName: String, dto: PrivateIpAddressSpecification) => {
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val primaryParams = Ec2RequestEncoder.encode(fieldName + "." + "primary", dto.primary)
    primaryParams ++ privateIpAddressParams
  }
  implicit def DescribeVolumeStatusRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVolumeStatusRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVolumeStatus") +: (dryRunParams ++ (maxResultsParams ++ (volumeIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def AcceptVpcPeeringConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AcceptVpcPeeringConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("vpcPeeringConnectionId", req.vpcPeeringConnectionId)
    UrlForm(("Action" -> "AcceptVpcPeeringConnection") +: (vpcPeeringConnectionIdParams ++ dryRunParams): _*)
  }
  implicit def PurchaseHostReservationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, PurchaseHostReservationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val hostIdSetParams = Ec2RequestEncoder.encode("HostIdSet", req.hostIdSet)
    val offeringIdParams = Ec2RequestEncoder.encode("OfferingId", req.offeringId)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val limitPriceParams = Ec2RequestEncoder.encode("LimitPrice", req.limitPrice)
    val currencyCodeParams = Ec2RequestEncoder.encode("CurrencyCode", req.currencyCode)
    UrlForm(("Action" -> "PurchaseHostReservation") +: (currencyCodeParams ++ (limitPriceParams ++ (clientTokenParams ++ (offeringIdParams ++ hostIdSetParams)))): _*)
  }
  implicit val ReservedInstancesModificationResultEc2Encoder: Ec2RequestEncoder[ReservedInstancesModificationResult] = (fieldName: String, dto: ReservedInstancesModificationResult) => {
    val reservedInstancesIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesId", dto.reservedInstancesId)
    val targetConfigurationParams = Ec2RequestEncoder.encode(fieldName + "." + "targetConfiguration", dto.targetConfiguration)
    targetConfigurationParams ++ reservedInstancesIdParams
  }
  implicit def UnassignIpv6AddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, UnassignIpv6AddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ipv6AddressesParams = Ec2RequestEncoder.encode("ipv6Addresses", req.ipv6Addresses)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    UrlForm(("Action" -> "UnassignIpv6Addresses") +: (networkInterfaceIdParams ++ ipv6AddressesParams): _*)
  }
  implicit val VpnGatewayEc2Encoder: Ec2RequestEncoder[VpnGateway] = (fieldName: String, dto: VpnGateway) => {
    val amazonSideAsnParams = Ec2RequestEncoder.encode(fieldName + "." + "amazonSideAsn", dto.amazonSideAsn)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpnGatewayId", dto.vpnGatewayId)
    val attachmentsParams = Ec2RequestEncoder.encode(fieldName + "." + "attachments", dto.attachments)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (typeParams ++ (tagSetParams ++ (attachmentsParams ++ (vpnGatewayIdParams ++ (availabilityZoneParams ++ amazonSideAsnParams)))))
  }
  implicit val VpcCidrBlockStateEc2Encoder: Ec2RequestEncoder[VpcCidrBlockState] = (fieldName: String, dto: VpcCidrBlockState) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    statusMessageParams ++ stateParams
  }
  implicit val FpgaImageAttributeEc2Encoder: Ec2RequestEncoder[FpgaImageAttribute] = (fieldName: String, dto: FpgaImageAttribute) => {
    val fpgaImageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "fpgaImageId", dto.fpgaImageId)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val loadPermissionsParams = Ec2RequestEncoder.encode(fieldName + "." + "loadPermissions", dto.loadPermissions)
    val productCodesParams = Ec2RequestEncoder.encode(fieldName + "." + "productCodes", dto.productCodes)
    productCodesParams ++ (loadPermissionsParams ++ (descriptionParams ++ (nameParams ++ fpgaImageIdParams)))
  }
  implicit val IamInstanceProfileAssociationEc2Encoder: Ec2RequestEncoder[IamInstanceProfileAssociation] = (fieldName: String, dto: IamInstanceProfileAssociation) => {
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "iamInstanceProfile", dto.iamInstanceProfile)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val timestampParams = Ec2RequestEncoder.encode(fieldName + "." + "timestamp", dto.timestamp)
    timestampParams ++ (stateParams ++ (iamInstanceProfileParams ++ (instanceIdParams ++ associationIdParams)))
  }
  implicit val ElasticGpusEc2Encoder: Ec2RequestEncoder[ElasticGpus] = (fieldName: String, dto: ElasticGpus) => {
    val elasticGpuIdParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuId", dto.elasticGpuId)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val elasticGpuTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuType", dto.elasticGpuType)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val elasticGpuHealthParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuHealth", dto.elasticGpuHealth)
    val elasticGpuStateParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuState", dto.elasticGpuState)
    elasticGpuStateParams ++ (elasticGpuHealthParams ++ (instanceIdParams ++ (elasticGpuTypeParams ++ (availabilityZoneParams ++ elasticGpuIdParams))))
  }
  implicit val VolumeStatusItemEc2Encoder: Ec2RequestEncoder[VolumeStatusItem] = (fieldName: String, dto: VolumeStatusItem) => {
    val actionsSetParams = Ec2RequestEncoder.encode(fieldName + "." + "actionsSet", dto.actionsSet)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val volumeIdParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeId", dto.volumeId)
    val eventsSetParams = Ec2RequestEncoder.encode(fieldName + "." + "eventsSet", dto.eventsSet)
    val volumeStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeStatus", dto.volumeStatus)
    volumeStatusParams ++ (eventsSetParams ++ (volumeIdParams ++ (availabilityZoneParams ++ actionsSetParams)))
  }
  implicit def ModifyVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val sizeParams = Ec2RequestEncoder.encode("Size", req.size)
    val iopsParams = Ec2RequestEncoder.encode("Iops", req.iops)
    val volumeTypeParams = Ec2RequestEncoder.encode("VolumeType", req.volumeType)
    UrlForm(("Action" -> "ModifyVolume") +: (volumeTypeParams ++ (iopsParams ++ (sizeParams ++ (dryRunParams ++ volumeIdParams)))): _*)
  }
  implicit def CreateSnapshotRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateSnapshotRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateSnapshot") +: (dryRunParams ++ (descriptionParams ++ volumeIdParams)): _*)
  }
  implicit def AuthorizeSecurityGroupIngressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AuthorizeSecurityGroupIngressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val sourceSecurityGroupNameParams = Ec2RequestEncoder.encode("SourceSecurityGroupName", req.sourceSecurityGroupName)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val ipProtocolParams = Ec2RequestEncoder.encode("IpProtocol", req.ipProtocol)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    val sourceSecurityGroupOwnerIdParams = Ec2RequestEncoder.encode("SourceSecurityGroupOwnerId", req.sourceSecurityGroupOwnerId)
    val cidrIpParams = Ec2RequestEncoder.encode("CidrIp", req.cidrIp)
    val fromPortParams = Ec2RequestEncoder.encode("FromPort", req.fromPort)
    val toPortParams = Ec2RequestEncoder.encode("ToPort", req.toPort)
    val ipPermissionsParams = Ec2RequestEncoder.encode("IpPermissions", req.ipPermissions)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AuthorizeSecurityGroupIngress") +: (dryRunParams ++ (ipPermissionsParams ++ (toPortParams ++ (fromPortParams ++ (cidrIpParams ++ (sourceSecurityGroupOwnerIdParams ++ (groupNameParams ++ (ipProtocolParams ++ (groupIdParams ++ sourceSecurityGroupNameParams))))))))): _*)
  }
  implicit val ReservedInstancesConfigurationEc2Encoder: Ec2RequestEncoder[ReservedInstancesConfiguration] = (fieldName: String, dto: ReservedInstancesConfiguration) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCount", dto.instanceCount)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val scopeParams = Ec2RequestEncoder.encode(fieldName + "." + "scope", dto.scope)
    scopeParams ++ (instanceTypeParams ++ (instanceCountParams ++ (platformParams ++ availabilityZoneParams)))
  }
  implicit def UnmonitorInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, UnmonitorInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "UnmonitorInstances") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit def AuthorizeSecurityGroupEgressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AuthorizeSecurityGroupEgressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupIdParams = Ec2RequestEncoder.encode("groupId", req.groupId)
    val ipProtocolParams = Ec2RequestEncoder.encode("ipProtocol", req.ipProtocol)
    val sourceSecurityGroupOwnerIdParams = Ec2RequestEncoder.encode("sourceSecurityGroupOwnerId", req.sourceSecurityGroupOwnerId)
    val sourceSecurityGroupNameParams = Ec2RequestEncoder.encode("sourceSecurityGroupName", req.sourceSecurityGroupName)
    val cidrIpParams = Ec2RequestEncoder.encode("cidrIp", req.cidrIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val ipPermissionsParams = Ec2RequestEncoder.encode("ipPermissions", req.ipPermissions)
    val fromPortParams = Ec2RequestEncoder.encode("fromPort", req.fromPort)
    val toPortParams = Ec2RequestEncoder.encode("toPort", req.toPort)
    UrlForm(("Action" -> "AuthorizeSecurityGroupEgress") +: (toPortParams ++ (fromPortParams ++ (ipPermissionsParams ++ (dryRunParams ++ (cidrIpParams ++ (sourceSecurityGroupNameParams ++ (sourceSecurityGroupOwnerIdParams ++ (ipProtocolParams ++ groupIdParams)))))))): _*)
  }
  implicit def DeleteNetworkAclEntryRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteNetworkAclEntryRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val egressParams = Ec2RequestEncoder.encode("egress", req.egress)
    val networkAclIdParams = Ec2RequestEncoder.encode("networkAclId", req.networkAclId)
    val ruleNumberParams = Ec2RequestEncoder.encode("ruleNumber", req.ruleNumber)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteNetworkAclEntry") +: (dryRunParams ++ (ruleNumberParams ++ (networkAclIdParams ++ egressParams))): _*)
  }
  implicit def ModifyReservedInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyReservedInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val reservedInstancesIdParams = Ec2RequestEncoder.encode("ReservedInstancesId", req.reservedInstancesId)
    val reservedInstancesConfigurationSetItemTypeParams = Ec2RequestEncoder.encode("ReservedInstancesConfigurationSetItemType", req.reservedInstancesConfigurationSetItemType)
    val clientTokenParams = Ec2RequestEncoder.encode("clientToken", req.clientToken)
    UrlForm(("Action" -> "ModifyReservedInstances") +: (clientTokenParams ++ (reservedInstancesConfigurationSetItemTypeParams ++ reservedInstancesIdParams)): _*)
  }
  implicit def ModifyInstancePlacementRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyInstancePlacementRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val hostIdParams = Ec2RequestEncoder.encode("hostId", req.hostId)
    val affinityParams = Ec2RequestEncoder.encode("affinity", req.affinity)
    val tenancyParams = Ec2RequestEncoder.encode("tenancy", req.tenancy)
    UrlForm(("Action" -> "ModifyInstancePlacement") +: (tenancyParams ++ (affinityParams ++ (hostIdParams ++ instanceIdParams))): _*)
  }
  implicit def ModifyVpcAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVpcAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val enableDnsHostnamesParams = Ec2RequestEncoder.encode("EnableDnsHostnames", req.enableDnsHostnames)
    val enableDnsSupportParams = Ec2RequestEncoder.encode("EnableDnsSupport", req.enableDnsSupport)
    UrlForm(("Action" -> "ModifyVpcAttribute") +: (enableDnsSupportParams ++ (enableDnsHostnamesParams ++ vpcIdParams)): _*)
  }
  implicit val SpotInstanceStateFaultEc2Encoder: Ec2RequestEncoder[SpotInstanceStateFault] = (fieldName: String, dto: SpotInstanceStateFault) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val CreateVolumePermissionEc2Encoder: Ec2RequestEncoder[CreateVolumePermission] = (fieldName: String, dto: CreateVolumePermission) => {
    val groupParams = Ec2RequestEncoder.encode(fieldName + "." + "group", dto.group)
    val userIdParams = Ec2RequestEncoder.encode(fieldName + "." + "userId", dto.userId)
    userIdParams ++ groupParams
  }
  implicit val UnsuccessfulItemErrorEc2Encoder: Ec2RequestEncoder[UnsuccessfulItemError] = (fieldName: String, dto: UnsuccessfulItemError) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit def DescribeImportImageTasksRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeImportImageTasksRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val importTaskIdParams = Ec2RequestEncoder.encode("ImportTaskId", req.importTaskId)
    val filtersParams = Ec2RequestEncoder.encode("Filters", req.filters)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeImportImageTasks") +: (dryRunParams ++ (maxResultsParams ++ (nextTokenParams ++ (filtersParams ++ importTaskIdParams)))): _*)
  }
  implicit val Ipv6RangeEc2Encoder: Ec2RequestEncoder[Ipv6Range] = (fieldName: String, dto: Ipv6Range) => {
    val cidrIpv6Params = Ec2RequestEncoder.encode(fieldName + "." + "cidrIpv6", dto.cidrIpv6)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    descriptionParams ++ cidrIpv6Params
  }
  implicit def ModifyVpcEndpointRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVpcEndpointRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcEndpointIdParams = Ec2RequestEncoder.encode("VpcEndpointId", req.vpcEndpointId)
    val policyDocumentParams = Ec2RequestEncoder.encode("PolicyDocument", req.policyDocument)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val resetPolicyParams = Ec2RequestEncoder.encode("ResetPolicy", req.resetPolicy)
    val privateDnsEnabledParams = Ec2RequestEncoder.encode("PrivateDnsEnabled", req.privateDnsEnabled)
    val addSecurityGroupIdParams = Ec2RequestEncoder.encode("AddSecurityGroupId", req.addSecurityGroupId)
    val addRouteTableIdParams = Ec2RequestEncoder.encode("AddRouteTableId", req.addRouteTableId)
    val addSubnetIdParams = Ec2RequestEncoder.encode("AddSubnetId", req.addSubnetId)
    val removeSecurityGroupIdParams = Ec2RequestEncoder.encode("RemoveSecurityGroupId", req.removeSecurityGroupId)
    val removeRouteTableIdParams = Ec2RequestEncoder.encode("RemoveRouteTableId", req.removeRouteTableId)
    val removeSubnetIdParams = Ec2RequestEncoder.encode("RemoveSubnetId", req.removeSubnetId)
    UrlForm(("Action" -> "ModifyVpcEndpoint") +: (removeSubnetIdParams ++ (removeRouteTableIdParams ++ (removeSecurityGroupIdParams ++ (addSubnetIdParams ++ (addRouteTableIdParams ++ (addSecurityGroupIdParams ++ (privateDnsEnabledParams ++ (resetPolicyParams ++ (dryRunParams ++ (policyDocumentParams ++ vpcEndpointIdParams)))))))))): _*)
  }
  implicit def DescribeClassicLinkInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeClassicLinkInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeClassicLinkInstances") +: (dryRunParams ++ (maxResultsParams ++ (instanceIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def CreatePlacementGroupRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreatePlacementGroupRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupNameParams = Ec2RequestEncoder.encode("groupName", req.groupName)
    val strategyParams = Ec2RequestEncoder.encode("strategy", req.strategy)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreatePlacementGroup") +: (dryRunParams ++ (strategyParams ++ groupNameParams)): _*)
  }
  implicit val NetworkAclAssociationEc2Encoder: Ec2RequestEncoder[NetworkAclAssociation] = (fieldName: String, dto: NetworkAclAssociation) => {
    val networkAclAssociationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkAclAssociationId", dto.networkAclAssociationId)
    val networkAclIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkAclId", dto.networkAclId)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    subnetIdParams ++ (networkAclIdParams ++ networkAclAssociationIdParams)
  }
  implicit def CancelReservedInstancesListingRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelReservedInstancesListingRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val reservedInstancesListingIdParams = Ec2RequestEncoder.encode("reservedInstancesListingId", req.reservedInstancesListingId)
    UrlForm(("Action" -> "CancelReservedInstancesListing") +: reservedInstancesListingIdParams: _*)
  }
  implicit def CreateSecurityGroupRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateSecurityGroupRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupDescriptionParams = Ec2RequestEncoder.encode("GroupDescription", req.groupDescription)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateSecurityGroup") +: (dryRunParams ++ (vpcIdParams ++ (groupNameParams ++ groupDescriptionParams))): _*)
  }
  implicit val DnsEntryEc2Encoder: Ec2RequestEncoder[DnsEntry] = (fieldName: String, dto: DnsEntry) => {
    val dnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "dnsName", dto.dnsName)
    val hostedZoneIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostedZoneId", dto.hostedZoneId)
    hostedZoneIdParams ++ dnsNameParams
  }
  implicit val RouteEc2Encoder: Ec2RequestEncoder[Route] = (fieldName: String, dto: Route) => {
    val destinationPrefixListIdParams = Ec2RequestEncoder.encode(fieldName + "." + "destinationPrefixListId", dto.destinationPrefixListId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val natGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "natGatewayId", dto.natGatewayId)
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "egressOnlyInternetGatewayId", dto.egressOnlyInternetGatewayId)
    val instanceOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceOwnerId", dto.instanceOwnerId)
    val destinationIpv6CidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "destinationIpv6CidrBlock", dto.destinationIpv6CidrBlock)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcPeeringConnectionId", dto.vpcPeeringConnectionId)
    val destinationCidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "destinationCidrBlock", dto.destinationCidrBlock)
    val gatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "gatewayId", dto.gatewayId)
    val originParams = Ec2RequestEncoder.encode(fieldName + "." + "origin", dto.origin)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (originParams ++ (gatewayIdParams ++ (destinationCidrBlockParams ++ (vpcPeeringConnectionIdParams ++ (instanceIdParams ++ (destinationIpv6CidrBlockParams ++ (instanceOwnerIdParams ++ (egressOnlyInternetGatewayIdParams ++ (natGatewayIdParams ++ (networkInterfaceIdParams ++ destinationPrefixListIdParams))))))))))
  }
  implicit def DeleteSnapshotRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteSnapshotRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteSnapshot") +: (dryRunParams ++ snapshotIdParams): _*)
  }
  implicit def CreateNetworkInterfaceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateNetworkInterfaceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val subnetIdParams = Ec2RequestEncoder.encode("subnetId", req.subnetId)
    val privateIpAddressesParams = Ec2RequestEncoder.encode("privateIpAddresses", req.privateIpAddresses)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val privateIpAddressParams = Ec2RequestEncoder.encode("privateIpAddress", req.privateIpAddress)
    val ipv6AddressesParams = Ec2RequestEncoder.encode("ipv6Addresses", req.ipv6Addresses)
    val securityGroupIdParams = Ec2RequestEncoder.encode("SecurityGroupId", req.securityGroupId)
    val ipv6AddressCountParams = Ec2RequestEncoder.encode("ipv6AddressCount", req.ipv6AddressCount)
    val secondaryPrivateIpAddressCountParams = Ec2RequestEncoder.encode("secondaryPrivateIpAddressCount", req.secondaryPrivateIpAddressCount)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateNetworkInterface") +: (dryRunParams ++ (secondaryPrivateIpAddressCountParams ++ (ipv6AddressCountParams ++ (securityGroupIdParams ++ (ipv6AddressesParams ++ (privateIpAddressParams ++ (descriptionParams ++ (privateIpAddressesParams ++ subnetIdParams)))))))): _*)
  }
  implicit val ReservationValueEc2Encoder: Ec2RequestEncoder[ReservationValue] = (fieldName: String, dto: ReservationValue) => {
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val remainingTotalValueParams = Ec2RequestEncoder.encode(fieldName + "." + "remainingTotalValue", dto.remainingTotalValue)
    val remainingUpfrontValueParams = Ec2RequestEncoder.encode(fieldName + "." + "remainingUpfrontValue", dto.remainingUpfrontValue)
    remainingUpfrontValueParams ++ (remainingTotalValueParams ++ hourlyPriceParams)
  }
  implicit def DescribeVolumesModificationsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVolumesModificationsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVolumesModifications") +: (dryRunParams ++ (maxResultsParams ++ (volumeIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def ReleaseAddressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReleaseAddressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val allocationIdParams = Ec2RequestEncoder.encode("AllocationId", req.allocationId)
    val publicIpParams = Ec2RequestEncoder.encode("PublicIp", req.publicIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReleaseAddress") +: (dryRunParams ++ (publicIpParams ++ allocationIdParams)): _*)
  }
  implicit val NetworkInterfacePermissionEc2Encoder: Ec2RequestEncoder[NetworkInterfacePermission] = (fieldName: String, dto: NetworkInterfacePermission) => {
    val networkInterfacePermissionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfacePermissionId", dto.networkInterfacePermissionId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val awsAccountIdParams = Ec2RequestEncoder.encode(fieldName + "." + "awsAccountId", dto.awsAccountId)
    val awsServiceParams = Ec2RequestEncoder.encode(fieldName + "." + "awsService", dto.awsService)
    val permissionParams = Ec2RequestEncoder.encode(fieldName + "." + "permission", dto.permission)
    val permissionStateParams = Ec2RequestEncoder.encode(fieldName + "." + "permissionState", dto.permissionState)
    permissionStateParams ++ (permissionParams ++ (awsServiceParams ++ (awsAccountIdParams ++ (networkInterfaceIdParams ++ networkInterfacePermissionIdParams))))
  }
  implicit def ModifyImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val userIdParams = Ec2RequestEncoder.encode("UserId", req.userId)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val valueParams = Ec2RequestEncoder.encode("Value", req.value)
    val operationTypeParams = Ec2RequestEncoder.encode("OperationType", req.operationType)
    val launchPermissionParams = Ec2RequestEncoder.encode("LaunchPermission", req.launchPermission)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val userGroupParams = Ec2RequestEncoder.encode("UserGroup", req.userGroup)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val productCodeParams = Ec2RequestEncoder.encode("ProductCode", req.productCode)
    UrlForm(("Action" -> "ModifyImageAttribute") +: (productCodeParams ++ (dryRunParams ++ (userGroupParams ++ (descriptionParams ++ (launchPermissionParams ++ (operationTypeParams ++ (valueParams ++ (attributeParams ++ (userIdParams ++ imageIdParams))))))))): _*)
  }
  implicit def DescribeVolumeAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVolumeAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVolumeAttribute") +: (dryRunParams ++ (attributeParams ++ volumeIdParams)): _*)
  }
  implicit def GetConsoleScreenshotRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, GetConsoleScreenshotRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val wakeUpParams = Ec2RequestEncoder.encode("WakeUp", req.wakeUp)
    UrlForm(("Action" -> "GetConsoleScreenshot") +: (wakeUpParams ++ (dryRunParams ++ instanceIdParams)): _*)
  }
  implicit val BlockDeviceMappingEc2Encoder: Ec2RequestEncoder[BlockDeviceMapping] = (fieldName: String, dto: BlockDeviceMapping) => {
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceName", dto.deviceName)
    val virtualNameParams = Ec2RequestEncoder.encode(fieldName + "." + "virtualName", dto.virtualName)
    val noDeviceParams = Ec2RequestEncoder.encode(fieldName + "." + "noDevice", dto.noDevice)
    val ebsParams = Ec2RequestEncoder.encode(fieldName + "." + "ebs", dto.ebs)
    ebsParams ++ (noDeviceParams ++ (virtualNameParams ++ deviceNameParams))
  }
  implicit def ImportImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ImportImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val roleNameParams = Ec2RequestEncoder.encode("RoleName", req.roleName)
    val hypervisorParams = Ec2RequestEncoder.encode("Hypervisor", req.hypervisor)
    val licenseTypeParams = Ec2RequestEncoder.encode("LicenseType", req.licenseType)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val platformParams = Ec2RequestEncoder.encode("Platform", req.platform)
    val architectureParams = Ec2RequestEncoder.encode("Architecture", req.architecture)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val clientDataParams = Ec2RequestEncoder.encode("ClientData", req.clientData)
    val diskContainerParams = Ec2RequestEncoder.encode("DiskContainer", req.diskContainer)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "ImportImage") +: (dryRunParams ++ (diskContainerParams ++ (clientDataParams ++ (descriptionParams ++ (architectureParams ++ (platformParams ++ (clientTokenParams ++ (licenseTypeParams ++ (hypervisorParams ++ roleNameParams))))))))): _*)
  }
  implicit def DeleteNetworkAclRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteNetworkAclRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkAclIdParams = Ec2RequestEncoder.encode("networkAclId", req.networkAclId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteNetworkAcl") +: (dryRunParams ++ networkAclIdParams): _*)
  }
  implicit val SnapshotDetailEc2Encoder: Ec2RequestEncoder[SnapshotDetail] = (fieldName: String, dto: SnapshotDetail) => {
    val urlParams = Ec2RequestEncoder.encode(fieldName + "." + "url", dto.url)
    val progressParams = Ec2RequestEncoder.encode(fieldName + "." + "progress", dto.progress)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "format", dto.format)
    val snapshotIdParams = Ec2RequestEncoder.encode(fieldName + "." + "snapshotId", dto.snapshotId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceName", dto.deviceName)
    val diskImageSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "diskImageSize", dto.diskImageSize)
    val userBucketParams = Ec2RequestEncoder.encode(fieldName + "." + "userBucket", dto.userBucket)
    userBucketParams ++ (diskImageSizeParams ++ (deviceNameParams ++ (statusMessageParams ++ (snapshotIdParams ++ (formatParams ++ (statusParams ++ (descriptionParams ++ (progressParams ++ urlParams))))))))
  }
  implicit def CreateSpotDatafeedSubscriptionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateSpotDatafeedSubscriptionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val bucketParams = Ec2RequestEncoder.encode("bucket", req.bucket)
    val prefixParams = Ec2RequestEncoder.encode("prefix", req.prefix)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateSpotDatafeedSubscription") +: (dryRunParams ++ (prefixParams ++ bucketParams)): _*)
  }
  implicit def DeleteKeyPairRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteKeyPairRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val keyNameParams = Ec2RequestEncoder.encode("KeyName", req.keyName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteKeyPair") +: (dryRunParams ++ keyNameParams): _*)
  }
  implicit val ScheduledInstancesMonitoringEc2Encoder: Ec2RequestEncoder[ScheduledInstancesMonitoring] = (fieldName: String, dto: ScheduledInstancesMonitoring) => {
    val enabledParams = Ec2RequestEncoder.encode(fieldName + "." + "Enabled", dto.enabled)
    enabledParams
  }
  implicit val ClientDataEc2Encoder: Ec2RequestEncoder[ClientData] = (fieldName: String, dto: ClientData) => {
    val commentParams = Ec2RequestEncoder.encode(fieldName + "." + "Comment", dto.comment)
    val uploadEndParams = Ec2RequestEncoder.encode(fieldName + "." + "UploadEnd", dto.uploadEnd)
    val uploadStartParams = Ec2RequestEncoder.encode(fieldName + "." + "UploadStart", dto.uploadStart)
    val uploadSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "UploadSize", dto.uploadSize)
    uploadSizeParams ++ (uploadStartParams ++ (uploadEndParams ++ commentParams))
  }
  implicit def DescribeVolumesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVolumesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVolumes") +: (dryRunParams ++ (maxResultsParams ++ (volumeIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def ConfirmProductInstanceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ConfirmProductInstanceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val productCodeParams = Ec2RequestEncoder.encode("ProductCode", req.productCode)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ConfirmProductInstance") +: (dryRunParams ++ (productCodeParams ++ instanceIdParams)): _*)
  }
  implicit def AttachVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AttachVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val deviceParams = Ec2RequestEncoder.encode("Device", req.device)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AttachVolume") +: (dryRunParams ++ (volumeIdParams ++ (instanceIdParams ++ deviceParams))): _*)
  }
  implicit def DisableVpcClassicLinkDnsSupportRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisableVpcClassicLinkDnsSupportRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    UrlForm(("Action" -> "DisableVpcClassicLinkDnsSupport") +: vpcIdParams: _*)
  }
  implicit def CreateNetworkAclEntryRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateNetworkAclEntryRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkAclIdParams = Ec2RequestEncoder.encode("networkAclId", req.networkAclId)
    val protocolParams = Ec2RequestEncoder.encode("protocol", req.protocol)
    val ruleActionParams = Ec2RequestEncoder.encode("ruleAction", req.ruleAction)
    val ruleNumberParams = Ec2RequestEncoder.encode("ruleNumber", req.ruleNumber)
    val egressParams = Ec2RequestEncoder.encode("egress", req.egress)
    val cidrBlockParams = Ec2RequestEncoder.encode("cidrBlock", req.cidrBlock)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode("ipv6CidrBlock", req.ipv6CidrBlock)
    val icmpParams = Ec2RequestEncoder.encode("Icmp", req.icmp)
    val portRangeParams = Ec2RequestEncoder.encode("portRange", req.portRange)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateNetworkAclEntry") +: (dryRunParams ++ (portRangeParams ++ (icmpParams ++ (ipv6CidrBlockParams ++ (cidrBlockParams ++ (egressParams ++ (ruleNumberParams ++ (ruleActionParams ++ (protocolParams ++ networkAclIdParams))))))))): _*)
  }
  implicit def StartInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, StartInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val additionalInfoParams = Ec2RequestEncoder.encode("additionalInfo", req.additionalInfo)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "StartInstances") +: (dryRunParams ++ (additionalInfoParams ++ instanceIdParams)): _*)
  }
  implicit val NewDhcpConfigurationEc2Encoder: Ec2RequestEncoder[NewDhcpConfiguration] = (fieldName: String, dto: NewDhcpConfiguration) => {
    val keyParams = Ec2RequestEncoder.encode(fieldName + "." + "key", dto.key)
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "Value", dto.value)
    valueParams ++ keyParams
  }
  implicit def DisassociateSubnetCidrBlockRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisassociateSubnetCidrBlockRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("associationId", req.associationId)
    UrlForm(("Action" -> "DisassociateSubnetCidrBlock") +: associationIdParams: _*)
  }
  implicit val PurchaseEc2Encoder: Ec2RequestEncoder[Purchase] = (fieldName: String, dto: Purchase) => {
    val paymentOptionParams = Ec2RequestEncoder.encode(fieldName + "." + "paymentOption", dto.paymentOption)
    val hostIdSetParams = Ec2RequestEncoder.encode(fieldName + "." + "hostIdSet", dto.hostIdSet)
    val hostReservationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostReservationId", dto.hostReservationId)
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val instanceFamilyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceFamily", dto.instanceFamily)
    val upfrontPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "upfrontPrice", dto.upfrontPrice)
    val durationParams = Ec2RequestEncoder.encode(fieldName + "." + "duration", dto.duration)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    currencyCodeParams ++ (durationParams ++ (upfrontPriceParams ++ (instanceFamilyParams ++ (hourlyPriceParams ++ (hostReservationIdParams ++ (hostIdSetParams ++ paymentOptionParams))))))
  }
  implicit def ImportKeyPairRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ImportKeyPairRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val keyNameParams = Ec2RequestEncoder.encode("keyName", req.keyName)
    val publicKeyMaterialParams = Ec2RequestEncoder.encode("publicKeyMaterial", req.publicKeyMaterial)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ImportKeyPair") +: (dryRunParams ++ (publicKeyMaterialParams ++ keyNameParams)): _*)
  }
  implicit def RequestSpotFleetRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RequestSpotFleetRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotFleetRequestConfigParams = Ec2RequestEncoder.encode("spotFleetRequestConfig", req.spotFleetRequestConfig)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RequestSpotFleet") +: (dryRunParams ++ spotFleetRequestConfigParams): _*)
  }
  implicit val ImportInstanceLaunchSpecificationEc2Encoder: Ec2RequestEncoder[ImportInstanceLaunchSpecification] = (fieldName: String, dto: ImportInstanceLaunchSpecification) => {
    val architectureParams = Ec2RequestEncoder.encode(fieldName + "." + "architecture", dto.architecture)
    val instanceInitiatedShutdownBehaviorParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceInitiatedShutdownBehavior", dto.instanceInitiatedShutdownBehavior)
    val additionalInfoParams = Ec2RequestEncoder.encode(fieldName + "." + "additionalInfo", dto.additionalInfo)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "placement", dto.placement)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "GroupName", dto.groupName)
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "GroupId", dto.groupId)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    val userDataParams = Ec2RequestEncoder.encode(fieldName + "." + "userData", dto.userData)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (userDataParams ++ (monitoringParams ++ (groupIdParams ++ (groupNameParams ++ (placementParams ++ (subnetIdParams ++ (privateIpAddressParams ++ (additionalInfoParams ++ (instanceInitiatedShutdownBehaviorParams ++ architectureParams)))))))))
  }
  implicit def DeleteNatGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteNatGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val natGatewayIdParams = Ec2RequestEncoder.encode("NatGatewayId", req.natGatewayId)
    UrlForm(("Action" -> "DeleteNatGateway") +: natGatewayIdParams: _*)
  }
  implicit val ElasticGpuHealthEc2Encoder: Ec2RequestEncoder[ElasticGpuHealth] = (fieldName: String, dto: ElasticGpuHealth) => {
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams
  }
  implicit def DeleteVpcEndpointsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpcEndpointsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcEndpointIdParams = Ec2RequestEncoder.encode("VpcEndpointId", req.vpcEndpointId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVpcEndpoints") +: (dryRunParams ++ vpcEndpointIdParams): _*)
  }
  implicit def CreateDefaultVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateDefaultVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CreateDefaultVpc") +: dryRunParams: _*)
  }
  implicit def ModifyNetworkInterfaceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyNetworkInterfaceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val attachmentParams = Ec2RequestEncoder.encode("attachment", req.attachment)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val securityGroupIdParams = Ec2RequestEncoder.encode("SecurityGroupId", req.securityGroupId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val sourceDestCheckParams = Ec2RequestEncoder.encode("sourceDestCheck", req.sourceDestCheck)
    UrlForm(("Action" -> "ModifyNetworkInterfaceAttribute") +: (sourceDestCheckParams ++ (dryRunParams ++ (securityGroupIdParams ++ (descriptionParams ++ (attachmentParams ++ networkInterfaceIdParams))))): _*)
  }
  implicit val AccountAttributeEc2Encoder: Ec2RequestEncoder[AccountAttribute] = (fieldName: String, dto: AccountAttribute) => {
    val attributeNameParams = Ec2RequestEncoder.encode(fieldName + "." + "attributeName", dto.attributeName)
    val attributeValueSetParams = Ec2RequestEncoder.encode(fieldName + "." + "attributeValueSet", dto.attributeValueSet)
    attributeValueSetParams ++ attributeNameParams
  }
  implicit def DescribeConversionTasksRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeConversionTasksRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val conversionTaskIdParams = Ec2RequestEncoder.encode("conversionTaskId", req.conversionTaskId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeConversionTasks") +: (dryRunParams ++ conversionTaskIdParams): _*)
  }
  implicit def CreateVpnConnectionRouteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpnConnectionRouteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val destinationCidrBlockParams = Ec2RequestEncoder.encode("DestinationCidrBlock", req.destinationCidrBlock)
    val vpnConnectionIdParams = Ec2RequestEncoder.encode("VpnConnectionId", req.vpnConnectionId)
    UrlForm(("Action" -> "CreateVpnConnectionRoute") +: (vpnConnectionIdParams ++ destinationCidrBlockParams): _*)
  }
  implicit val SecurityGroupEc2Encoder: Ec2RequestEncoder[SecurityGroup] = (fieldName: String, dto: SecurityGroup) => {
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    val groupDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "groupDescription", dto.groupDescription)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val ipPermissionsParams = Ec2RequestEncoder.encode(fieldName + "." + "ipPermissions", dto.ipPermissions)
    val ipPermissionsEgressParams = Ec2RequestEncoder.encode(fieldName + "." + "ipPermissionsEgress", dto.ipPermissionsEgress)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    tagSetParams ++ (ipPermissionsEgressParams ++ (ipPermissionsParams ++ (vpcIdParams ++ (groupNameParams ++ (ownerIdParams ++ (groupDescriptionParams ++ groupIdParams))))))
  }
  implicit def ModifyIdFormatRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyIdFormatRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val resourceParams = Ec2RequestEncoder.encode("Resource", req.resource)
    val useLongIdsParams = Ec2RequestEncoder.encode("UseLongIds", req.useLongIds)
    UrlForm(("Action" -> "ModifyIdFormat") +: (useLongIdsParams ++ resourceParams): _*)
  }
  implicit val DiskImageDetailEc2Encoder: Ec2RequestEncoder[DiskImageDetail] = (fieldName: String, dto: DiskImageDetail) => {
    val bytesParams = Ec2RequestEncoder.encode(fieldName + "." + "bytes", dto.bytes)
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "format", dto.format)
    val importManifestUrlParams = Ec2RequestEncoder.encode(fieldName + "." + "importManifestUrl", dto.importManifestUrl)
    importManifestUrlParams ++ (formatParams ++ bytesParams)
  }
  implicit def DescribeSpotPriceHistoryRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotPriceHistoryRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val availabilityZoneParams = Ec2RequestEncoder.encode("availabilityZone", req.availabilityZone)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val productDescriptionParams = Ec2RequestEncoder.encode("ProductDescription", req.productDescription)
    val endTimeParams = Ec2RequestEncoder.encode("endTime", req.endTime)
    val startTimeParams = Ec2RequestEncoder.encode("startTime", req.startTime)
    val instanceTypeParams = Ec2RequestEncoder.encode("InstanceType", req.instanceType)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSpotPriceHistory") +: (dryRunParams ++ (maxResultsParams ++ (instanceTypeParams ++ (startTimeParams ++ (endTimeParams ++ (productDescriptionParams ++ (nextTokenParams ++ (availabilityZoneParams ++ filterParams)))))))): _*)
  }
  implicit val FpgaImageStateEc2Encoder: Ec2RequestEncoder[FpgaImageState] = (fieldName: String, dto: FpgaImageState) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val EgressOnlyInternetGatewayEc2Encoder: Ec2RequestEncoder[EgressOnlyInternetGateway] = (fieldName: String, dto: EgressOnlyInternetGateway) => {
    val attachmentSetParams = Ec2RequestEncoder.encode(fieldName + "." + "attachmentSet", dto.attachmentSet)
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "egressOnlyInternetGatewayId", dto.egressOnlyInternetGatewayId)
    egressOnlyInternetGatewayIdParams ++ attachmentSetParams
  }
  implicit def DescribeSpotFleetRequestsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotFleetRequestsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode("spotFleetRequestId", req.spotFleetRequestId)
    UrlForm(("Action" -> "DescribeSpotFleetRequests") +: (spotFleetRequestIdParams ++ (nextTokenParams ++ (maxResultsParams ++ dryRunParams))): _*)
  }
  implicit val CreateVolumePermissionModificationsEc2Encoder: Ec2RequestEncoder[CreateVolumePermissionModifications] = (fieldName: String, dto: CreateVolumePermissionModifications) => {
    val addParams = Ec2RequestEncoder.encode(fieldName + "." + "Add", dto.add)
    val removeParams = Ec2RequestEncoder.encode(fieldName + "." + "Remove", dto.remove)
    removeParams ++ addParams
  }
  implicit def DescribeNetworkInterfacesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeNetworkInterfacesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("NetworkInterfaceId", req.networkInterfaceId)
    UrlForm(("Action" -> "DescribeNetworkInterfaces") +: (networkInterfaceIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val KeyPairInfoEc2Encoder: Ec2RequestEncoder[KeyPairInfo] = (fieldName: String, dto: KeyPairInfo) => {
    val keyFingerprintParams = Ec2RequestEncoder.encode(fieldName + "." + "keyFingerprint", dto.keyFingerprint)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "keyName", dto.keyName)
    keyNameParams ++ keyFingerprintParams
  }
  implicit val VpcAttachmentEc2Encoder: Ec2RequestEncoder[VpcAttachment] = (fieldName: String, dto: VpcAttachment) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    vpcIdParams ++ stateParams
  }
  implicit def DescribeKeyPairsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeKeyPairsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val keyNameParams = Ec2RequestEncoder.encode("KeyName", req.keyName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeKeyPairs") +: (dryRunParams ++ (keyNameParams ++ filterParams)): _*)
  }
  implicit val MovingAddressStatusEc2Encoder: Ec2RequestEncoder[MovingAddressStatus] = (fieldName: String, dto: MovingAddressStatus) => {
    val moveStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "moveStatus", dto.moveStatus)
    val publicIpParams = Ec2RequestEncoder.encode(fieldName + "." + "publicIp", dto.publicIp)
    publicIpParams ++ moveStatusParams
  }
  implicit val SnapshotDiskContainerEc2Encoder: Ec2RequestEncoder[SnapshotDiskContainer] = (fieldName: String, dto: SnapshotDiskContainer) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "Description", dto.description)
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "Format", dto.format)
    val urlParams = Ec2RequestEncoder.encode(fieldName + "." + "Url", dto.url)
    val userBucketParams = Ec2RequestEncoder.encode(fieldName + "." + "UserBucket", dto.userBucket)
    userBucketParams ++ (urlParams ++ (formatParams ++ descriptionParams))
  }
  implicit def DescribeIdFormatRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeIdFormatRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val resourceParams = Ec2RequestEncoder.encode("Resource", req.resource)
    UrlForm(("Action" -> "DescribeIdFormat") +: resourceParams: _*)
  }
  implicit val ExportToS3TaskEc2Encoder: Ec2RequestEncoder[ExportToS3Task] = (fieldName: String, dto: ExportToS3Task) => {
    val containerFormatParams = Ec2RequestEncoder.encode(fieldName + "." + "containerFormat", dto.containerFormat)
    val diskImageFormatParams = Ec2RequestEncoder.encode(fieldName + "." + "diskImageFormat", dto.diskImageFormat)
    val s3BucketParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Bucket", dto.s3Bucket)
    val s3KeyParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Key", dto.s3Key)
    s3KeyParams ++ (s3BucketParams ++ (diskImageFormatParams ++ containerFormatParams))
  }
  implicit def ReleaseHostsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReleaseHostsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val hostIdParams = Ec2RequestEncoder.encode("hostId", req.hostId)
    UrlForm(("Action" -> "ReleaseHosts") +: hostIdParams: _*)
  }
  implicit val ImageEc2Encoder: Ec2RequestEncoder[Image] = (fieldName: String, dto: Image) => {
    val productCodesParams = Ec2RequestEncoder.encode(fieldName + "." + "productCodes", dto.productCodes)
    val architectureParams = Ec2RequestEncoder.encode(fieldName + "." + "architecture", dto.architecture)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val imageOwnerAliasParams = Ec2RequestEncoder.encode(fieldName + "." + "imageOwnerAlias", dto.imageOwnerAlias)
    val rootDeviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "rootDeviceName", dto.rootDeviceName)
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ramdiskId", dto.ramdiskId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val imageLocationParams = Ec2RequestEncoder.encode(fieldName + "." + "imageLocation", dto.imageLocation)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "kernelId", dto.kernelId)
    val imageOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageOwnerId", dto.imageOwnerId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val creationDateParams = Ec2RequestEncoder.encode(fieldName + "." + "creationDate", dto.creationDate)
    val sriovNetSupportParams = Ec2RequestEncoder.encode(fieldName + "." + "sriovNetSupport", dto.sriovNetSupport)
    val stateReasonParams = Ec2RequestEncoder.encode(fieldName + "." + "stateReason", dto.stateReason)
    val rootDeviceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "rootDeviceType", dto.rootDeviceType)
    val imageTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "imageType", dto.imageType)
    val imageStateParams = Ec2RequestEncoder.encode(fieldName + "." + "imageState", dto.imageState)
    val virtualizationTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "virtualizationType", dto.virtualizationType)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDeviceMapping", dto.blockDeviceMapping)
    val isPublicParams = Ec2RequestEncoder.encode(fieldName + "." + "isPublic", dto.isPublic)
    val enaSupportParams = Ec2RequestEncoder.encode(fieldName + "." + "enaSupport", dto.enaSupport)
    val hypervisorParams = Ec2RequestEncoder.encode(fieldName + "." + "hypervisor", dto.hypervisor)
    hypervisorParams ++ (enaSupportParams ++ (isPublicParams ++ (blockDeviceMappingParams ++ (tagSetParams ++ (virtualizationTypeParams ++ (imageStateParams ++ (imageTypeParams ++ (rootDeviceTypeParams ++ (stateReasonParams ++ (sriovNetSupportParams ++ (creationDateParams ++ (imageIdParams ++ (imageOwnerIdParams ++ (kernelIdParams ++ (nameParams ++ (imageLocationParams ++ (descriptionParams ++ (ramdiskIdParams ++ (rootDeviceNameParams ++ (imageOwnerAliasParams ++ (platformParams ++ (architectureParams ++ productCodesParams))))))))))))))))))))))
  }
  implicit val InstanceNetworkInterfaceAttachmentEc2Encoder: Ec2RequestEncoder[InstanceNetworkInterfaceAttachment] = (fieldName: String, dto: InstanceNetworkInterfaceAttachment) => {
    val attachmentIdParams = Ec2RequestEncoder.encode(fieldName + "." + "attachmentId", dto.attachmentId)
    val attachTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "attachTime", dto.attachTime)
    val deviceIndexParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceIndex", dto.deviceIndex)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ (deleteOnTerminationParams ++ (deviceIndexParams ++ (attachTimeParams ++ attachmentIdParams)))
  }
  implicit def DisableVgwRoutePropagationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisableVgwRoutePropagationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val gatewayIdParams = Ec2RequestEncoder.encode("GatewayId", req.gatewayId)
    val routeTableIdParams = Ec2RequestEncoder.encode("RouteTableId", req.routeTableId)
    UrlForm(("Action" -> "DisableVgwRoutePropagation") +: (routeTableIdParams ++ gatewayIdParams): _*)
  }
  implicit def DeregisterImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeregisterImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeregisterImage") +: (dryRunParams ++ imageIdParams): _*)
  }
  implicit def CreateVpnGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpnGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val typeParams = Ec2RequestEncoder.encode("Type", req.`type`)
    val availabilityZoneParams = Ec2RequestEncoder.encode("AvailabilityZone", req.availabilityZone)
    val amazonSideAsnParams = Ec2RequestEncoder.encode("AmazonSideAsn", req.amazonSideAsn)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateVpnGateway") +: (dryRunParams ++ (amazonSideAsnParams ++ (availabilityZoneParams ++ typeParams))): _*)
  }
  implicit def RevokeSecurityGroupEgressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RevokeSecurityGroupEgressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupIdParams = Ec2RequestEncoder.encode("groupId", req.groupId)
    val ipProtocolParams = Ec2RequestEncoder.encode("ipProtocol", req.ipProtocol)
    val sourceSecurityGroupOwnerIdParams = Ec2RequestEncoder.encode("sourceSecurityGroupOwnerId", req.sourceSecurityGroupOwnerId)
    val sourceSecurityGroupNameParams = Ec2RequestEncoder.encode("sourceSecurityGroupName", req.sourceSecurityGroupName)
    val cidrIpParams = Ec2RequestEncoder.encode("cidrIp", req.cidrIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val ipPermissionsParams = Ec2RequestEncoder.encode("ipPermissions", req.ipPermissions)
    val fromPortParams = Ec2RequestEncoder.encode("fromPort", req.fromPort)
    val toPortParams = Ec2RequestEncoder.encode("toPort", req.toPort)
    UrlForm(("Action" -> "RevokeSecurityGroupEgress") +: (toPortParams ++ (fromPortParams ++ (ipPermissionsParams ++ (dryRunParams ++ (cidrIpParams ++ (sourceSecurityGroupNameParams ++ (sourceSecurityGroupOwnerIdParams ++ (ipProtocolParams ++ groupIdParams)))))))): _*)
  }
  implicit val PrefixListIdEc2Encoder: Ec2RequestEncoder[PrefixListId] = (fieldName: String, dto: PrefixListId) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val prefixListIdParams = Ec2RequestEncoder.encode(fieldName + "." + "prefixListId", dto.prefixListId)
    prefixListIdParams ++ descriptionParams
  }
  implicit def DescribePlacementGroupsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribePlacementGroupsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val groupNameParams = Ec2RequestEncoder.encode("groupName", req.groupName)
    UrlForm(("Action" -> "DescribePlacementGroups") +: (groupNameParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val ServiceDetailEc2Encoder: Ec2RequestEncoder[ServiceDetail] = (fieldName: String, dto: ServiceDetail) => {
    val serviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "serviceName", dto.serviceName)
    val ownerParams = Ec2RequestEncoder.encode(fieldName + "." + "owner", dto.owner)
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val serviceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "serviceType", dto.serviceType)
    val availabilityZoneSetParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZoneSet", dto.availabilityZoneSet)
    val baseEndpointDnsNameSetParams = Ec2RequestEncoder.encode(fieldName + "." + "baseEndpointDnsNameSet", dto.baseEndpointDnsNameSet)
    val vpcEndpointPolicySupportedParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcEndpointPolicySupported", dto.vpcEndpointPolicySupported)
    val acceptanceRequiredParams = Ec2RequestEncoder.encode(fieldName + "." + "acceptanceRequired", dto.acceptanceRequired)
    acceptanceRequiredParams ++ (vpcEndpointPolicySupportedParams ++ (baseEndpointDnsNameSetParams ++ (availabilityZoneSetParams ++ (serviceTypeParams ++ (privateDnsNameParams ++ (ownerParams ++ serviceNameParams))))))
  }
  implicit def DescribeSpotInstanceRequestsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotInstanceRequestsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode("SpotInstanceRequestId", req.spotInstanceRequestId)
    UrlForm(("Action" -> "DescribeSpotInstanceRequests") +: (spotInstanceRequestIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val ConversionTaskEc2Encoder: Ec2RequestEncoder[ConversionTask] = (fieldName: String, dto: ConversionTask) => {
    val conversionTaskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "conversionTaskId", dto.conversionTaskId)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val expirationTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "expirationTime", dto.expirationTime)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val importInstanceParams = Ec2RequestEncoder.encode(fieldName + "." + "importInstance", dto.importInstance)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val importVolumeParams = Ec2RequestEncoder.encode(fieldName + "." + "importVolume", dto.importVolume)
    importVolumeParams ++ (tagSetParams ++ (importInstanceParams ++ (statusMessageParams ++ (expirationTimeParams ++ (stateParams ++ conversionTaskIdParams)))))
  }
  implicit val DiskImageVolumeDescriptionEc2Encoder: Ec2RequestEncoder[DiskImageVolumeDescription] = (fieldName: String, dto: DiskImageVolumeDescription) => {
    val idParams = Ec2RequestEncoder.encode(fieldName + "." + "id", dto.id)
    val sizeParams = Ec2RequestEncoder.encode(fieldName + "." + "size", dto.size)
    sizeParams ++ idParams
  }
  implicit def RestoreAddressToClassicRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RestoreAddressToClassicRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val publicIpParams = Ec2RequestEncoder.encode("publicIp", req.publicIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RestoreAddressToClassic") +: (dryRunParams ++ publicIpParams): _*)
  }
  implicit val EbsInstanceBlockDeviceEc2Encoder: Ec2RequestEncoder[EbsInstanceBlockDevice] = (fieldName: String, dto: EbsInstanceBlockDevice) => {
    val attachTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "attachTime", dto.attachTime)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val volumeIdParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeId", dto.volumeId)
    volumeIdParams ++ (statusParams ++ (deleteOnTerminationParams ++ attachTimeParams))
  }
  implicit val NetworkAclEc2Encoder: Ec2RequestEncoder[NetworkAcl] = (fieldName: String, dto: NetworkAcl) => {
    val networkAclIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkAclId", dto.networkAclId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val entrySetParams = Ec2RequestEncoder.encode(fieldName + "." + "entrySet", dto.entrySet)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val associationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "associationSet", dto.associationSet)
    val defaultParams = Ec2RequestEncoder.encode(fieldName + "." + "default", dto.default)
    defaultParams ++ (associationSetParams ++ (tagSetParams ++ (entrySetParams ++ (vpcIdParams ++ networkAclIdParams))))
  }
  implicit def DeleteInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val internetGatewayIdParams = Ec2RequestEncoder.encode("internetGatewayId", req.internetGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteInternetGateway") +: (dryRunParams ++ internetGatewayIdParams): _*)
  }
  implicit def DescribeElasticGpusRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeElasticGpusRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val elasticGpuIdParams = Ec2RequestEncoder.encode("ElasticGpuId", req.elasticGpuId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeElasticGpus") +: (dryRunParams ++ (maxResultsParams ++ (elasticGpuIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit val LoadPermissionRequestEc2Encoder: Ec2RequestEncoder[LoadPermissionRequest] = (fieldName: String, dto: LoadPermissionRequest) => {
    val groupParams = Ec2RequestEncoder.encode(fieldName + "." + "Group", dto.group)
    val userIdParams = Ec2RequestEncoder.encode(fieldName + "." + "UserId", dto.userId)
    userIdParams ++ groupParams
  }
  implicit def DeleteDhcpOptionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteDhcpOptionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dhcpOptionsIdParams = Ec2RequestEncoder.encode("DhcpOptionsId", req.dhcpOptionsId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteDhcpOptions") +: (dryRunParams ++ dhcpOptionsIdParams): _*)
  }
  implicit def DetachVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DetachVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val deviceParams = Ec2RequestEncoder.encode("Device", req.device)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val forceParams = Ec2RequestEncoder.encode("Force", req.force)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DetachVolume") +: (dryRunParams ++ (forceParams ++ (instanceIdParams ++ (deviceParams ++ volumeIdParams)))): _*)
  }
  implicit val ScheduledInstancesPrivateIpAddressConfigEc2Encoder: Ec2RequestEncoder[ScheduledInstancesPrivateIpAddressConfig] = (fieldName: String, dto: ScheduledInstancesPrivateIpAddressConfig) => {
    val primaryParams = Ec2RequestEncoder.encode(fieldName + "." + "Primary", dto.primary)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "PrivateIpAddress", dto.privateIpAddress)
    privateIpAddressParams ++ primaryParams
  }
  implicit val VpnStaticRouteEc2Encoder: Ec2RequestEncoder[VpnStaticRoute] = (fieldName: String, dto: VpnStaticRoute) => {
    val destinationCidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "destinationCidrBlock", dto.destinationCidrBlock)
    val sourceParams = Ec2RequestEncoder.encode(fieldName + "." + "source", dto.source)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (sourceParams ++ destinationCidrBlockParams)
  }
  implicit val IcmpTypeCodeEc2Encoder: Ec2RequestEncoder[IcmpTypeCode] = (fieldName: String, dto: IcmpTypeCode) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    typeParams ++ codeParams
  }
  implicit def DeleteSubnetRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteSubnetRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val subnetIdParams = Ec2RequestEncoder.encode("SubnetId", req.subnetId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteSubnet") +: (dryRunParams ++ subnetIdParams): _*)
  }
  implicit def RunInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RunInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val maxCountParams = Ec2RequestEncoder.encode("MaxCount", req.maxCount)
    val minCountParams = Ec2RequestEncoder.encode("MinCount", req.minCount)
    val instanceInitiatedShutdownBehaviorParams = Ec2RequestEncoder.encode("instanceInitiatedShutdownBehavior", req.instanceInitiatedShutdownBehavior)
    val ramdiskIdParams = Ec2RequestEncoder.encode("RamdiskId", req.ramdiskId)
    val subnetIdParams = Ec2RequestEncoder.encode("SubnetId", req.subnetId)
    val clientTokenParams = Ec2RequestEncoder.encode("clientToken", req.clientToken)
    val additionalInfoParams = Ec2RequestEncoder.encode("additionalInfo", req.additionalInfo)
    val privateIpAddressParams = Ec2RequestEncoder.encode("privateIpAddress", req.privateIpAddress)
    val keyNameParams = Ec2RequestEncoder.encode("KeyName", req.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode("KernelId", req.kernelId)
    val userDataParams = Ec2RequestEncoder.encode("UserData", req.userData)
    val elasticGpuSpecificationParams = Ec2RequestEncoder.encode("ElasticGpuSpecification", req.elasticGpuSpecification)
    val placementParams = Ec2RequestEncoder.encode("Placement", req.placement)
    val ipv6AddressParams = Ec2RequestEncoder.encode("Ipv6Address", req.ipv6Address)
    val tagSpecificationParams = Ec2RequestEncoder.encode("TagSpecification", req.tagSpecification)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode("iamInstanceProfile", req.iamInstanceProfile)
    val monitoringParams = Ec2RequestEncoder.encode("Monitoring", req.monitoring)
    val securityGroupParams = Ec2RequestEncoder.encode("SecurityGroup", req.securityGroup)
    val securityGroupIdParams = Ec2RequestEncoder.encode("SecurityGroupId", req.securityGroupId)
    val networkInterfaceParams = Ec2RequestEncoder.encode("networkInterface", req.networkInterface)
    val ipv6AddressCountParams = Ec2RequestEncoder.encode("Ipv6AddressCount", req.ipv6AddressCount)
    val disableApiTerminationParams = Ec2RequestEncoder.encode("disableApiTermination", req.disableApiTermination)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val ebsOptimizedParams = Ec2RequestEncoder.encode("ebsOptimized", req.ebsOptimized)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode("BlockDeviceMapping", req.blockDeviceMapping)
    val instanceTypeParams = Ec2RequestEncoder.encode("InstanceType", req.instanceType)
    UrlForm(("Action" -> "RunInstances") +: (instanceTypeParams ++ (blockDeviceMappingParams ++ (ebsOptimizedParams ++ (dryRunParams ++ (disableApiTerminationParams ++ (ipv6AddressCountParams ++ (networkInterfaceParams ++ (securityGroupIdParams ++ (securityGroupParams ++ (monitoringParams ++ (iamInstanceProfileParams ++ (tagSpecificationParams ++ (ipv6AddressParams ++ (placementParams ++ (elasticGpuSpecificationParams ++ (userDataParams ++ (kernelIdParams ++ (keyNameParams ++ (privateIpAddressParams ++ (additionalInfoParams ++ (clientTokenParams ++ (subnetIdParams ++ (ramdiskIdParams ++ (instanceInitiatedShutdownBehaviorParams ++ (minCountParams ++ (maxCountParams ++ imageIdParams)))))))))))))))))))))))))): _*)
  }
  implicit val PriceScheduleEc2Encoder: Ec2RequestEncoder[PriceSchedule] = (fieldName: String, dto: PriceSchedule) => {
    val activeParams = Ec2RequestEncoder.encode(fieldName + "." + "active", dto.active)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    val priceParams = Ec2RequestEncoder.encode(fieldName + "." + "price", dto.price)
    val termParams = Ec2RequestEncoder.encode(fieldName + "." + "term", dto.term)
    termParams ++ (priceParams ++ (currencyCodeParams ++ activeParams))
  }
  implicit def ModifyVpcTenancyRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVpcTenancyRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val instanceTenancyParams = Ec2RequestEncoder.encode("InstanceTenancy", req.instanceTenancy)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "ModifyVpcTenancy") +: (dryRunParams ++ (instanceTenancyParams ++ vpcIdParams)): _*)
  }
  implicit val HostOfferingEc2Encoder: Ec2RequestEncoder[HostOffering] = (fieldName: String, dto: HostOffering) => {
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    val durationParams = Ec2RequestEncoder.encode(fieldName + "." + "duration", dto.duration)
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val instanceFamilyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceFamily", dto.instanceFamily)
    val offeringIdParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringId", dto.offeringId)
    val upfrontPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "upfrontPrice", dto.upfrontPrice)
    val paymentOptionParams = Ec2RequestEncoder.encode(fieldName + "." + "paymentOption", dto.paymentOption)
    paymentOptionParams ++ (upfrontPriceParams ++ (offeringIdParams ++ (instanceFamilyParams ++ (hourlyPriceParams ++ (durationParams ++ currencyCodeParams)))))
  }
  implicit def EnableVpcClassicLinkDnsSupportRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, EnableVpcClassicLinkDnsSupportRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    UrlForm(("Action" -> "EnableVpcClassicLinkDnsSupport") +: vpcIdParams: _*)
  }
  implicit def AssociateAddressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateAddressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val privateIpAddressParams = Ec2RequestEncoder.encode("privateIpAddress", req.privateIpAddress)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val publicIpParams = Ec2RequestEncoder.encode("PublicIp", req.publicIp)
    val allocationIdParams = Ec2RequestEncoder.encode("AllocationId", req.allocationId)
    val allowReassociationParams = Ec2RequestEncoder.encode("allowReassociation", req.allowReassociation)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AssociateAddress") +: (dryRunParams ++ (allowReassociationParams ++ (allocationIdParams ++ (publicIpParams ++ (instanceIdParams ++ (privateIpAddressParams ++ networkInterfaceIdParams)))))): _*)
  }
  implicit val ClassicLoadBalancersConfigEc2Encoder: Ec2RequestEncoder[ClassicLoadBalancersConfig] = (fieldName: String, dto: ClassicLoadBalancersConfig) => {
    val classicLoadBalancersParams = Ec2RequestEncoder.encode(fieldName + "." + "classicLoadBalancers", dto.classicLoadBalancers)
    classicLoadBalancersParams
  }
  implicit def DescribeFlowLogsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeFlowLogsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val flowLogIdParams = Ec2RequestEncoder.encode("FlowLogId", req.flowLogId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeFlowLogs") +: (nextTokenParams ++ (maxResultsParams ++ (flowLogIdParams ++ filterParams))): _*)
  }
  implicit def DescribeNetworkInterfacePermissionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeNetworkInterfacePermissionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfacePermissionIdParams = Ec2RequestEncoder.encode("NetworkInterfacePermissionId", req.networkInterfacePermissionId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    UrlForm(("Action" -> "DescribeNetworkInterfacePermissions") +: (maxResultsParams ++ (nextTokenParams ++ (filterParams ++ networkInterfacePermissionIdParams))): _*)
  }
  implicit def CreateInstanceExportTaskRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateInstanceExportTaskRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val exportToS3Params = Ec2RequestEncoder.encode("exportToS3", req.exportToS3)
    val targetEnvironmentParams = Ec2RequestEncoder.encode("targetEnvironment", req.targetEnvironment)
    UrlForm(("Action" -> "CreateInstanceExportTask") +: (targetEnvironmentParams ++ (exportToS3Params ++ (descriptionParams ++ instanceIdParams))): _*)
  }
  implicit val StateReasonEc2Encoder: Ec2RequestEncoder[StateReason] = (fieldName: String, dto: StateReason) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val RouteTableEc2Encoder: Ec2RequestEncoder[RouteTable] = (fieldName: String, dto: RouteTable) => {
    val routeTableIdParams = Ec2RequestEncoder.encode(fieldName + "." + "routeTableId", dto.routeTableId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val associationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "associationSet", dto.associationSet)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val routeSetParams = Ec2RequestEncoder.encode(fieldName + "." + "routeSet", dto.routeSet)
    val propagatingVgwSetParams = Ec2RequestEncoder.encode(fieldName + "." + "propagatingVgwSet", dto.propagatingVgwSet)
    propagatingVgwSetParams ++ (routeSetParams ++ (tagSetParams ++ (associationSetParams ++ (vpcIdParams ++ routeTableIdParams))))
  }
  implicit def CreateRouteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateRouteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val natGatewayIdParams = Ec2RequestEncoder.encode("natGatewayId", req.natGatewayId)
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode("egressOnlyInternetGatewayId", req.egressOnlyInternetGatewayId)
    val destinationIpv6CidrBlockParams = Ec2RequestEncoder.encode("destinationIpv6CidrBlock", req.destinationIpv6CidrBlock)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("vpcPeeringConnectionId", req.vpcPeeringConnectionId)
    val destinationCidrBlockParams = Ec2RequestEncoder.encode("destinationCidrBlock", req.destinationCidrBlock)
    val gatewayIdParams = Ec2RequestEncoder.encode("gatewayId", req.gatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateRoute") +: (dryRunParams ++ (gatewayIdParams ++ (destinationCidrBlockParams ++ (vpcPeeringConnectionIdParams ++ (instanceIdParams ++ (destinationIpv6CidrBlockParams ++ (egressOnlyInternetGatewayIdParams ++ (natGatewayIdParams ++ (networkInterfaceIdParams ++ routeTableIdParams))))))))): _*)
  }
  implicit val BundleTaskErrorEc2Encoder: Ec2RequestEncoder[BundleTaskError] = (fieldName: String, dto: BundleTaskError) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val AvailabilityZoneMessageEc2Encoder: Ec2RequestEncoder[AvailabilityZoneMessage] = (fieldName: String, dto: AvailabilityZoneMessage) => {
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams
  }
  implicit def ResetImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ResetImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ResetImageAttribute") +: (dryRunParams ++ (imageIdParams ++ attributeParams)): _*)
  }
  implicit def DescribeHostsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeHostsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("filter", req.filter)
    val hostIdParams = Ec2RequestEncoder.encode("hostId", req.hostId)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeHosts") +: (nextTokenParams ++ (maxResultsParams ++ (hostIdParams ++ filterParams))): _*)
  }
  implicit def ModifyIdentityIdFormatRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyIdentityIdFormatRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val principalArnParams = Ec2RequestEncoder.encode("principalArn", req.principalArn)
    val resourceParams = Ec2RequestEncoder.encode("resource", req.resource)
    val useLongIdsParams = Ec2RequestEncoder.encode("useLongIds", req.useLongIds)
    UrlForm(("Action" -> "ModifyIdentityIdFormat") +: (useLongIdsParams ++ (resourceParams ++ principalArnParams)): _*)
  }
  implicit val Ipv6CidrBlockEc2Encoder: Ec2RequestEncoder[Ipv6CidrBlock] = (fieldName: String, dto: Ipv6CidrBlock) => {
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlock", dto.ipv6CidrBlock)
    ipv6CidrBlockParams
  }
  implicit val VolumeDetailEc2Encoder: Ec2RequestEncoder[VolumeDetail] = (fieldName: String, dto: VolumeDetail) => {
    val sizeParams = Ec2RequestEncoder.encode(fieldName + "." + "size", dto.size)
    sizeParams
  }
  implicit def CreateDefaultSubnetRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateDefaultSubnetRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val availabilityZoneParams = Ec2RequestEncoder.encode("AvailabilityZone", req.availabilityZone)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CreateDefaultSubnet") +: (dryRunParams ++ availabilityZoneParams): _*)
  }
  implicit val VolumeStatusDetailsEc2Encoder: Ec2RequestEncoder[VolumeStatusDetails] = (fieldName: String, dto: VolumeStatusDetails) => {
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ nameParams
  }
  implicit def DescribeVpnConnectionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpnConnectionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val vpnConnectionIdParams = Ec2RequestEncoder.encode("VpnConnectionId", req.vpnConnectionId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpnConnections") +: (dryRunParams ++ (vpnConnectionIdParams ++ filterParams)): _*)
  }
  implicit def DeletePlacementGroupRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeletePlacementGroupRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupNameParams = Ec2RequestEncoder.encode("groupName", req.groupName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeletePlacementGroup") +: (dryRunParams ++ groupNameParams): _*)
  }
  implicit def ReplaceNetworkAclEntryRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReplaceNetworkAclEntryRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkAclIdParams = Ec2RequestEncoder.encode("networkAclId", req.networkAclId)
    val protocolParams = Ec2RequestEncoder.encode("protocol", req.protocol)
    val ruleActionParams = Ec2RequestEncoder.encode("ruleAction", req.ruleAction)
    val ruleNumberParams = Ec2RequestEncoder.encode("ruleNumber", req.ruleNumber)
    val egressParams = Ec2RequestEncoder.encode("egress", req.egress)
    val cidrBlockParams = Ec2RequestEncoder.encode("cidrBlock", req.cidrBlock)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode("ipv6CidrBlock", req.ipv6CidrBlock)
    val icmpParams = Ec2RequestEncoder.encode("Icmp", req.icmp)
    val portRangeParams = Ec2RequestEncoder.encode("portRange", req.portRange)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReplaceNetworkAclEntry") +: (dryRunParams ++ (portRangeParams ++ (icmpParams ++ (ipv6CidrBlockParams ++ (cidrBlockParams ++ (egressParams ++ (ruleNumberParams ++ (ruleActionParams ++ (protocolParams ++ networkAclIdParams))))))))): _*)
  }
  implicit val AvailabilityZoneEc2Encoder: Ec2RequestEncoder[AvailabilityZone] = (fieldName: String, dto: AvailabilityZone) => {
    val zoneStateParams = Ec2RequestEncoder.encode(fieldName + "." + "zoneState", dto.zoneState)
    val messageSetParams = Ec2RequestEncoder.encode(fieldName + "." + "messageSet", dto.messageSet)
    val regionNameParams = Ec2RequestEncoder.encode(fieldName + "." + "regionName", dto.regionName)
    val zoneNameParams = Ec2RequestEncoder.encode(fieldName + "." + "zoneName", dto.zoneName)
    zoneNameParams ++ (regionNameParams ++ (messageSetParams ++ zoneStateParams))
  }
  implicit val SlotStartTimeRangeRequestEc2Encoder: Ec2RequestEncoder[SlotStartTimeRangeRequest] = (fieldName: String, dto: SlotStartTimeRangeRequest) => {
    val earliestTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "EarliestTime", dto.earliestTime)
    val latestTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "LatestTime", dto.latestTime)
    latestTimeParams ++ earliestTimeParams
  }
  implicit val UnsuccessfulItemEc2Encoder: Ec2RequestEncoder[UnsuccessfulItem] = (fieldName: String, dto: UnsuccessfulItem) => {
    val errorParams = Ec2RequestEncoder.encode(fieldName + "." + "error", dto.error)
    val resourceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceId", dto.resourceId)
    resourceIdParams ++ errorParams
  }
  implicit def DescribeReservedInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeReservedInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val reservedInstancesIdParams = Ec2RequestEncoder.encode("ReservedInstancesId", req.reservedInstancesId)
    val offeringClassParams = Ec2RequestEncoder.encode("OfferingClass", req.offeringClass)
    val offeringTypeParams = Ec2RequestEncoder.encode("offeringType", req.offeringType)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeReservedInstances") +: (dryRunParams ++ (offeringTypeParams ++ (offeringClassParams ++ (reservedInstancesIdParams ++ filterParams)))): _*)
  }
  implicit val RecurringChargeEc2Encoder: Ec2RequestEncoder[RecurringCharge] = (fieldName: String, dto: RecurringCharge) => {
    val amountParams = Ec2RequestEncoder.encode(fieldName + "." + "amount", dto.amount)
    val frequencyParams = Ec2RequestEncoder.encode(fieldName + "." + "frequency", dto.frequency)
    frequencyParams ++ amountParams
  }
  implicit val ScheduledInstancesPlacementEc2Encoder: Ec2RequestEncoder[ScheduledInstancesPlacement] = (fieldName: String, dto: ScheduledInstancesPlacement) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "AvailabilityZone", dto.availabilityZone)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "GroupName", dto.groupName)
    groupNameParams ++ availabilityZoneParams
  }
  implicit val HistoryRecordEc2Encoder: Ec2RequestEncoder[HistoryRecord] = (fieldName: String, dto: HistoryRecord) => {
    val eventInformationParams = Ec2RequestEncoder.encode(fieldName + "." + "eventInformation", dto.eventInformation)
    val eventTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "eventType", dto.eventType)
    val timestampParams = Ec2RequestEncoder.encode(fieldName + "." + "timestamp", dto.timestamp)
    timestampParams ++ (eventTypeParams ++ eventInformationParams)
  }
  implicit val ImportInstanceTaskDetailsEc2Encoder: Ec2RequestEncoder[ImportInstanceTaskDetails] = (fieldName: String, dto: ImportInstanceTaskDetails) => {
    val volumesParams = Ec2RequestEncoder.encode(fieldName + "." + "volumes", dto.volumes)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    platformParams ++ (instanceIdParams ++ (descriptionParams ++ volumesParams))
  }
  implicit val TargetReservationValueEc2Encoder: Ec2RequestEncoder[TargetReservationValue] = (fieldName: String, dto: TargetReservationValue) => {
    val reservationValueParams = Ec2RequestEncoder.encode(fieldName + "." + "reservationValue", dto.reservationValue)
    val targetConfigurationParams = Ec2RequestEncoder.encode(fieldName + "." + "targetConfiguration", dto.targetConfiguration)
    targetConfigurationParams ++ reservationValueParams
  }
  implicit val SubnetEc2Encoder: Ec2RequestEncoder[Subnet] = (fieldName: String, dto: Subnet) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val ipv6CidrBlockAssociationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlockAssociationSet", dto.ipv6CidrBlockAssociationSet)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val availableIpAddressCountParams = Ec2RequestEncoder.encode(fieldName + "." + "availableIpAddressCount", dto.availableIpAddressCount)
    val defaultForAzParams = Ec2RequestEncoder.encode(fieldName + "." + "defaultForAz", dto.defaultForAz)
    val mapPublicIpOnLaunchParams = Ec2RequestEncoder.encode(fieldName + "." + "mapPublicIpOnLaunch", dto.mapPublicIpOnLaunch)
    val assignIpv6AddressOnCreationParams = Ec2RequestEncoder.encode(fieldName + "." + "assignIpv6AddressOnCreation", dto.assignIpv6AddressOnCreation)
    assignIpv6AddressOnCreationParams ++ (mapPublicIpOnLaunchParams ++ (defaultForAzParams ++ (availableIpAddressCountParams ++ (tagSetParams ++ (ipv6CidrBlockAssociationSetParams ++ (vpcIdParams ++ (subnetIdParams ++ (cidrBlockParams ++ (availabilityZoneParams ++ stateParams)))))))))
  }
  implicit val ProductCodeEc2Encoder: Ec2RequestEncoder[ProductCode] = (fieldName: String, dto: ProductCode) => {
    val productCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "productCode", dto.productCode)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    typeParams ++ productCodeParams
  }
  implicit def AssociateDhcpOptionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateDhcpOptionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dhcpOptionsIdParams = Ec2RequestEncoder.encode("DhcpOptionsId", req.dhcpOptionsId)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AssociateDhcpOptions") +: (dryRunParams ++ (vpcIdParams ++ dhcpOptionsIdParams)): _*)
  }
  implicit def CreateCustomerGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateCustomerGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val bgpAsnParams = Ec2RequestEncoder.encode("BgpAsn", req.bgpAsn)
    val ipAddressParams = Ec2RequestEncoder.encode("IpAddress", req.ipAddress)
    val typeParams = Ec2RequestEncoder.encode("Type", req.`type`)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateCustomerGateway") +: (dryRunParams ++ (typeParams ++ (ipAddressParams ++ bgpAsnParams))): _*)
  }
  implicit val RequestSpotLaunchSpecificationEc2Encoder: Ec2RequestEncoder[RequestSpotLaunchSpecification] = (fieldName: String, dto: RequestSpotLaunchSpecification) => {
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ramdiskId", dto.ramdiskId)
    val userDataParams = Ec2RequestEncoder.encode(fieldName + "." + "userData", dto.userData)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "keyName", dto.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "kernelId", dto.kernelId)
    val addressingTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "addressingType", dto.addressingType)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "iamInstanceProfile", dto.iamInstanceProfile)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    val networkInterfaceParams = Ec2RequestEncoder.encode(fieldName + "." + "NetworkInterface", dto.networkInterface)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDeviceMapping", dto.blockDeviceMapping)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "placement", dto.placement)
    val securityGroupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SecurityGroupId", dto.securityGroupId)
    val securityGroupParams = Ec2RequestEncoder.encode(fieldName + "." + "SecurityGroup", dto.securityGroup)
    val ebsOptimizedParams = Ec2RequestEncoder.encode(fieldName + "." + "ebsOptimized", dto.ebsOptimized)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (ebsOptimizedParams ++ (securityGroupParams ++ (securityGroupIdParams ++ (placementParams ++ (blockDeviceMappingParams ++ (networkInterfaceParams ++ (monitoringParams ++ (iamInstanceProfileParams ++ (imageIdParams ++ (subnetIdParams ++ (addressingTypeParams ++ (kernelIdParams ++ (keyNameParams ++ (userDataParams ++ ramdiskIdParams))))))))))))))
  }
  implicit val InstanceCapacityEc2Encoder: Ec2RequestEncoder[InstanceCapacity] = (fieldName: String, dto: InstanceCapacity) => {
    val availableCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "availableCapacity", dto.availableCapacity)
    val totalCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "totalCapacity", dto.totalCapacity)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (totalCapacityParams ++ availableCapacityParams)
  }
  implicit val VpcIpv6CidrBlockAssociationEc2Encoder: Ec2RequestEncoder[VpcIpv6CidrBlockAssociation] = (fieldName: String, dto: VpcIpv6CidrBlockAssociation) => {
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlock", dto.ipv6CidrBlock)
    val ipv6CidrBlockStateParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlockState", dto.ipv6CidrBlockState)
    ipv6CidrBlockStateParams ++ (ipv6CidrBlockParams ++ associationIdParams)
  }
  implicit val HostInstanceEc2Encoder: Ec2RequestEncoder[HostInstance] = (fieldName: String, dto: HostInstance) => {
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ instanceIdParams
  }
  implicit val ImportInstanceVolumeDetailItemEc2Encoder: Ec2RequestEncoder[ImportInstanceVolumeDetailItem] = (fieldName: String, dto: ImportInstanceVolumeDetailItem) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val bytesConvertedParams = Ec2RequestEncoder.encode(fieldName + "." + "bytesConverted", dto.bytesConverted)
    val imageParams = Ec2RequestEncoder.encode(fieldName + "." + "image", dto.image)
    val volumeParams = Ec2RequestEncoder.encode(fieldName + "." + "volume", dto.volume)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    statusMessageParams ++ (descriptionParams ++ (volumeParams ++ (imageParams ++ (bytesConvertedParams ++ (statusParams ++ availabilityZoneParams)))))
  }
  implicit def DisassociateAddressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisassociateAddressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("AssociationId", req.associationId)
    val publicIpParams = Ec2RequestEncoder.encode("PublicIp", req.publicIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DisassociateAddress") +: (dryRunParams ++ (publicIpParams ++ associationIdParams)): _*)
  }
  implicit def DescribeImportSnapshotTasksRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeImportSnapshotTasksRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val importTaskIdParams = Ec2RequestEncoder.encode("ImportTaskId", req.importTaskId)
    val filtersParams = Ec2RequestEncoder.encode("Filters", req.filters)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeImportSnapshotTasks") +: (dryRunParams ++ (maxResultsParams ++ (nextTokenParams ++ (filtersParams ++ importTaskIdParams)))): _*)
  }
  implicit val ClassicLoadBalancerEc2Encoder: Ec2RequestEncoder[ClassicLoadBalancer] = (fieldName: String, dto: ClassicLoadBalancer) => {
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    nameParams
  }
  implicit def DeleteVpnGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpnGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpnGatewayIdParams = Ec2RequestEncoder.encode("VpnGatewayId", req.vpnGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVpnGateway") +: (dryRunParams ++ vpnGatewayIdParams): _*)
  }
  implicit def CreateVpcEndpointRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpcEndpointRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val serviceNameParams = Ec2RequestEncoder.encode("ServiceName", req.serviceName)
    val policyDocumentParams = Ec2RequestEncoder.encode("PolicyDocument", req.policyDocument)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val privateDnsEnabledParams = Ec2RequestEncoder.encode("PrivateDnsEnabled", req.privateDnsEnabled)
    val vpcEndpointTypeParams = Ec2RequestEncoder.encode("VpcEndpointType", req.vpcEndpointType)
    val routeTableIdParams = Ec2RequestEncoder.encode("RouteTableId", req.routeTableId)
    val subnetIdParams = Ec2RequestEncoder.encode("SubnetId", req.subnetId)
    val securityGroupIdParams = Ec2RequestEncoder.encode("SecurityGroupId", req.securityGroupId)
    UrlForm(("Action" -> "CreateVpcEndpoint") +: (securityGroupIdParams ++ (subnetIdParams ++ (routeTableIdParams ++ (vpcEndpointTypeParams ++ (privateDnsEnabledParams ++ (dryRunParams ++ (clientTokenParams ++ (policyDocumentParams ++ (serviceNameParams ++ vpcIdParams))))))))): _*)
  }
  implicit val NetworkInterfaceEc2Encoder: Ec2RequestEncoder[NetworkInterface] = (fieldName: String, dto: NetworkInterface) => {
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val macAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "macAddress", dto.macAddress)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val requesterIdParams = Ec2RequestEncoder.encode(fieldName + "." + "requesterId", dto.requesterId)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val interfaceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "interfaceType", dto.interfaceType)
    val associationParams = Ec2RequestEncoder.encode(fieldName + "." + "association", dto.association)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val attachmentParams = Ec2RequestEncoder.encode(fieldName + "." + "attachment", dto.attachment)
    val ipv6AddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6AddressesSet", dto.ipv6AddressesSet)
    val requesterManagedParams = Ec2RequestEncoder.encode(fieldName + "." + "requesterManaged", dto.requesterManaged)
    val sourceDestCheckParams = Ec2RequestEncoder.encode(fieldName + "." + "sourceDestCheck", dto.sourceDestCheck)
    val privateIpAddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddressesSet", dto.privateIpAddressesSet)
    privateIpAddressesSetParams ++ (sourceDestCheckParams ++ (requesterManagedParams ++ (ipv6AddressesSetParams ++ (attachmentParams ++ (statusParams ++ (tagSetParams ++ (associationParams ++ (interfaceTypeParams ++ (groupSetParams ++ (vpcIdParams ++ (subnetIdParams ++ (requesterIdParams ++ (availabilityZoneParams ++ (ownerIdParams ++ (privateIpAddressParams ++ (descriptionParams ++ (networkInterfaceIdParams ++ (macAddressParams ++ privateDnsNameParams))))))))))))))))))
  }
  implicit val PriceScheduleSpecificationEc2Encoder: Ec2RequestEncoder[PriceScheduleSpecification] = (fieldName: String, dto: PriceScheduleSpecification) => {
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    val priceParams = Ec2RequestEncoder.encode(fieldName + "." + "price", dto.price)
    val termParams = Ec2RequestEncoder.encode(fieldName + "." + "term", dto.term)
    termParams ++ (priceParams ++ currencyCodeParams)
  }
  implicit val VpcPeeringConnectionStateReasonEc2Encoder: Ec2RequestEncoder[VpcPeeringConnectionStateReason] = (fieldName: String, dto: VpcPeeringConnectionStateReason) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val InternetGatewayEc2Encoder: Ec2RequestEncoder[InternetGateway] = (fieldName: String, dto: InternetGateway) => {
    val attachmentSetParams = Ec2RequestEncoder.encode(fieldName + "." + "attachmentSet", dto.attachmentSet)
    val internetGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "internetGatewayId", dto.internetGatewayId)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    tagSetParams ++ (internetGatewayIdParams ++ attachmentSetParams)
  }
  implicit def DetachClassicLinkVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DetachClassicLinkVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DetachClassicLinkVpc") +: (dryRunParams ++ (vpcIdParams ++ instanceIdParams)): _*)
  }
  implicit def GetHostReservationPurchasePreviewRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, GetHostReservationPurchasePreviewRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val hostIdSetParams = Ec2RequestEncoder.encode("HostIdSet", req.hostIdSet)
    val offeringIdParams = Ec2RequestEncoder.encode("OfferingId", req.offeringId)
    UrlForm(("Action" -> "GetHostReservationPurchasePreview") +: (offeringIdParams ++ hostIdSetParams): _*)
  }
  implicit val NetworkAclEntryEc2Encoder: Ec2RequestEncoder[NetworkAclEntry] = (fieldName: String, dto: NetworkAclEntry) => {
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlock", dto.ipv6CidrBlock)
    val protocolParams = Ec2RequestEncoder.encode(fieldName + "." + "protocol", dto.protocol)
    val ruleActionParams = Ec2RequestEncoder.encode(fieldName + "." + "ruleAction", dto.ruleAction)
    val icmpTypeCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "icmpTypeCode", dto.icmpTypeCode)
    val portRangeParams = Ec2RequestEncoder.encode(fieldName + "." + "portRange", dto.portRange)
    val ruleNumberParams = Ec2RequestEncoder.encode(fieldName + "." + "ruleNumber", dto.ruleNumber)
    val egressParams = Ec2RequestEncoder.encode(fieldName + "." + "egress", dto.egress)
    egressParams ++ (ruleNumberParams ++ (portRangeParams ++ (icmpTypeCodeParams ++ (ruleActionParams ++ (protocolParams ++ (ipv6CidrBlockParams ++ cidrBlockParams))))))
  }
  implicit val NetworkInterfaceAttachmentChangesEc2Encoder: Ec2RequestEncoder[NetworkInterfaceAttachmentChanges] = (fieldName: String, dto: NetworkInterfaceAttachmentChanges) => {
    val attachmentIdParams = Ec2RequestEncoder.encode(fieldName + "." + "attachmentId", dto.attachmentId)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    deleteOnTerminationParams ++ attachmentIdParams
  }
  implicit def AssociateVpcCidrBlockRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateVpcCidrBlockRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val cidrBlockParams = Ec2RequestEncoder.encode("CidrBlock", req.cidrBlock)
    val amazonProvidedIpv6CidrBlockParams = Ec2RequestEncoder.encode("amazonProvidedIpv6CidrBlock", req.amazonProvidedIpv6CidrBlock)
    UrlForm(("Action" -> "AssociateVpcCidrBlock") +: (amazonProvidedIpv6CidrBlockParams ++ (cidrBlockParams ++ vpcIdParams)): _*)
  }
  implicit val InstanceEc2Encoder: Ec2RequestEncoder[Instance] = (fieldName: String, dto: Instance) => {
    val productCodesParams = Ec2RequestEncoder.encode(fieldName + "." + "productCodes", dto.productCodes)
    val instanceLifecycleParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceLifecycle", dto.instanceLifecycle)
    val architectureParams = Ec2RequestEncoder.encode(fieldName + "." + "architecture", dto.architecture)
    val elasticGpuAssociationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuAssociationSet", dto.elasticGpuAssociationSet)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDeviceMapping", dto.blockDeviceMapping)
    val ipAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "ipAddress", dto.ipAddress)
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val rootDeviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "rootDeviceName", dto.rootDeviceName)
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ramdiskId", dto.ramdiskId)
    val clientTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "clientToken", dto.clientToken)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "keyName", dto.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "kernelId", dto.kernelId)
    val reasonParams = Ec2RequestEncoder.encode(fieldName + "." + "reason", dto.reason)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotInstanceRequestId", dto.spotInstanceRequestId)
    val dnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "dnsName", dto.dnsName)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val sriovNetSupportParams = Ec2RequestEncoder.encode(fieldName + "." + "sriovNetSupport", dto.sriovNetSupport)
    val stateReasonParams = Ec2RequestEncoder.encode(fieldName + "." + "stateReason", dto.stateReason)
    val rootDeviceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "rootDeviceType", dto.rootDeviceType)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "placement", dto.placement)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val virtualizationTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "virtualizationType", dto.virtualizationType)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "iamInstanceProfile", dto.iamInstanceProfile)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val launchTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "launchTime", dto.launchTime)
    val networkInterfaceSetParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceSet", dto.networkInterfaceSet)
    val amiLaunchIndexParams = Ec2RequestEncoder.encode(fieldName + "." + "amiLaunchIndex", dto.amiLaunchIndex)
    val ebsOptimizedParams = Ec2RequestEncoder.encode(fieldName + "." + "ebsOptimized", dto.ebsOptimized)
    val enaSupportParams = Ec2RequestEncoder.encode(fieldName + "." + "enaSupport", dto.enaSupport)
    val sourceDestCheckParams = Ec2RequestEncoder.encode(fieldName + "." + "sourceDestCheck", dto.sourceDestCheck)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val instanceStateParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceState", dto.instanceState)
    val hypervisorParams = Ec2RequestEncoder.encode(fieldName + "." + "hypervisor", dto.hypervisor)
    hypervisorParams ++ (instanceStateParams ++ (instanceTypeParams ++ (monitoringParams ++ (sourceDestCheckParams ++ (enaSupportParams ++ (ebsOptimizedParams ++ (amiLaunchIndexParams ++ (networkInterfaceSetParams ++ (launchTimeParams ++ (tagSetParams ++ (iamInstanceProfileParams ++ (virtualizationTypeParams ++ (groupSetParams ++ (placementParams ++ (rootDeviceTypeParams ++ (stateReasonParams ++ (sriovNetSupportParams ++ (vpcIdParams ++ (imageIdParams ++ (subnetIdParams ++ (dnsNameParams ++ (spotInstanceRequestIdParams ++ (instanceIdParams ++ (reasonParams ++ (kernelIdParams ++ (keyNameParams ++ (privateIpAddressParams ++ (clientTokenParams ++ (ramdiskIdParams ++ (rootDeviceNameParams ++ (privateDnsNameParams ++ (ipAddressParams ++ (blockDeviceMappingParams ++ (platformParams ++ (elasticGpuAssociationSetParams ++ (architectureParams ++ (instanceLifecycleParams ++ productCodesParams)))))))))))))))))))))))))))))))))))))
  }
  implicit val RegionEc2Encoder: Ec2RequestEncoder[Region] = (fieldName: String, dto: Region) => {
    val regionEndpointParams = Ec2RequestEncoder.encode(fieldName + "." + "regionEndpoint", dto.regionEndpoint)
    val regionNameParams = Ec2RequestEncoder.encode(fieldName + "." + "regionName", dto.regionName)
    regionNameParams ++ regionEndpointParams
  }
  implicit val ImportImageTaskEc2Encoder: Ec2RequestEncoder[ImportImageTask] = (fieldName: String, dto: ImportImageTask) => {
    val hypervisorParams = Ec2RequestEncoder.encode(fieldName + "." + "hypervisor", dto.hypervisor)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val progressParams = Ec2RequestEncoder.encode(fieldName + "." + "progress", dto.progress)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val licenseTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "licenseType", dto.licenseType)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val architectureParams = Ec2RequestEncoder.encode(fieldName + "." + "architecture", dto.architecture)
    val importTaskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "importTaskId", dto.importTaskId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val snapshotDetailSetParams = Ec2RequestEncoder.encode(fieldName + "." + "snapshotDetailSet", dto.snapshotDetailSet)
    snapshotDetailSetParams ++ (statusMessageParams ++ (imageIdParams ++ (importTaskIdParams ++ (architectureParams ++ (statusParams ++ (licenseTypeParams ++ (descriptionParams ++ (progressParams ++ (platformParams ++ hypervisorParams)))))))))
  }
  implicit def UnassignPrivateIpAddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, UnassignPrivateIpAddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val privateIpAddressParams = Ec2RequestEncoder.encode("privateIpAddress", req.privateIpAddress)
    UrlForm(("Action" -> "UnassignPrivateIpAddresses") +: (privateIpAddressParams ++ networkInterfaceIdParams): _*)
  }
  implicit val InstanceMonitoringEc2Encoder: Ec2RequestEncoder[InstanceMonitoring] = (fieldName: String, dto: InstanceMonitoring) => {
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    monitoringParams ++ instanceIdParams
  }
  implicit def DescribeReservedInstancesModificationsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeReservedInstancesModificationsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val reservedInstancesModificationIdParams = Ec2RequestEncoder.encode("ReservedInstancesModificationId", req.reservedInstancesModificationId)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeReservedInstancesModifications") +: (nextTokenParams ++ (reservedInstancesModificationIdParams ++ filterParams)): _*)
  }
  implicit def DeleteCustomerGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteCustomerGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val customerGatewayIdParams = Ec2RequestEncoder.encode("CustomerGatewayId", req.customerGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteCustomerGateway") +: (dryRunParams ++ customerGatewayIdParams): _*)
  }
  implicit def DescribeImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeImageAttribute") +: (dryRunParams ++ (imageIdParams ++ attributeParams)): _*)
  }
  implicit def PurchaseReservedInstancesOfferingRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, PurchaseReservedInstancesOfferingRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceCountParams = Ec2RequestEncoder.encode("InstanceCount", req.instanceCount)
    val reservedInstancesOfferingIdParams = Ec2RequestEncoder.encode("ReservedInstancesOfferingId", req.reservedInstancesOfferingId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val limitPriceParams = Ec2RequestEncoder.encode("limitPrice", req.limitPrice)
    UrlForm(("Action" -> "PurchaseReservedInstancesOffering") +: (limitPriceParams ++ (dryRunParams ++ (reservedInstancesOfferingIdParams ++ instanceCountParams))): _*)
  }
  implicit val PlacementEc2Encoder: Ec2RequestEncoder[Placement] = (fieldName: String, dto: Placement) => {
    val spreadDomainParams = Ec2RequestEncoder.encode(fieldName + "." + "spreadDomain", dto.spreadDomain)
    val hostIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostId", dto.hostId)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val affinityParams = Ec2RequestEncoder.encode(fieldName + "." + "affinity", dto.affinity)
    val tenancyParams = Ec2RequestEncoder.encode(fieldName + "." + "tenancy", dto.tenancy)
    tenancyParams ++ (affinityParams ++ (availabilityZoneParams ++ (groupNameParams ++ (hostIdParams ++ spreadDomainParams))))
  }
  implicit def CopyFpgaImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CopyFpgaImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val sourceFpgaImageIdParams = Ec2RequestEncoder.encode("SourceFpgaImageId", req.sourceFpgaImageId)
    val sourceRegionParams = Ec2RequestEncoder.encode("SourceRegion", req.sourceRegion)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val nameParams = Ec2RequestEncoder.encode("Name", req.name)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CopyFpgaImage") +: (dryRunParams ++ (descriptionParams ++ (nameParams ++ (clientTokenParams ++ (sourceRegionParams ++ sourceFpgaImageIdParams))))): _*)
  }
  implicit def DescribeAvailabilityZonesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeAvailabilityZonesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val zoneNameParams = Ec2RequestEncoder.encode("ZoneName", req.zoneName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeAvailabilityZones") +: (dryRunParams ++ (zoneNameParams ++ filterParams)): _*)
  }
  implicit def DescribeNetworkInterfaceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeNetworkInterfaceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val attributeParams = Ec2RequestEncoder.encode("attribute", req.attribute)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeNetworkInterfaceAttribute") +: (dryRunParams ++ (attributeParams ++ networkInterfaceIdParams)): _*)
  }
  implicit val LaunchPermissionModificationsEc2Encoder: Ec2RequestEncoder[LaunchPermissionModifications] = (fieldName: String, dto: LaunchPermissionModifications) => {
    val addParams = Ec2RequestEncoder.encode(fieldName + "." + "Add", dto.add)
    val removeParams = Ec2RequestEncoder.encode(fieldName + "." + "Remove", dto.remove)
    removeParams ++ addParams
  }
  implicit val SubnetIpv6CidrBlockAssociationEc2Encoder: Ec2RequestEncoder[SubnetIpv6CidrBlockAssociation] = (fieldName: String, dto: SubnetIpv6CidrBlockAssociation) => {
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlock", dto.ipv6CidrBlock)
    val ipv6CidrBlockStateParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlockState", dto.ipv6CidrBlockState)
    ipv6CidrBlockStateParams ++ (ipv6CidrBlockParams ++ associationIdParams)
  }
  implicit val InstanceCountEc2Encoder: Ec2RequestEncoder[InstanceCount] = (fieldName: String, dto: InstanceCount) => {
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCount", dto.instanceCount)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ instanceCountParams
  }
  implicit def UpdateSecurityGroupRuleDescriptionsEgressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, UpdateSecurityGroupRuleDescriptionsEgressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ipPermissionsParams = Ec2RequestEncoder.encode("IpPermissions", req.ipPermissions)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    UrlForm(("Action" -> "UpdateSecurityGroupRuleDescriptionsEgress") +: (groupNameParams ++ (groupIdParams ++ (dryRunParams ++ ipPermissionsParams))): _*)
  }
  implicit def MoveAddressToVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, MoveAddressToVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val publicIpParams = Ec2RequestEncoder.encode("publicIp", req.publicIp)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "MoveAddressToVpc") +: (dryRunParams ++ publicIpParams): _*)
  }
  implicit val NatGatewayEc2Encoder: Ec2RequestEncoder[NatGateway] = (fieldName: String, dto: NatGateway) => {
    val natGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "natGatewayId", dto.natGatewayId)
    val failureCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "failureCode", dto.failureCode)
    val failureMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "failureMessage", dto.failureMessage)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val natGatewayAddressSetParams = Ec2RequestEncoder.encode(fieldName + "." + "natGatewayAddressSet", dto.natGatewayAddressSet)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val createTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "createTime", dto.createTime)
    val deleteTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteTime", dto.deleteTime)
    val provisionedBandwidthParams = Ec2RequestEncoder.encode(fieldName + "." + "provisionedBandwidth", dto.provisionedBandwidth)
    provisionedBandwidthParams ++ (deleteTimeParams ++ (createTimeParams ++ (stateParams ++ (tagSetParams ++ (natGatewayAddressSetParams ++ (vpcIdParams ++ (subnetIdParams ++ (failureMessageParams ++ (failureCodeParams ++ natGatewayIdParams)))))))))
  }
  implicit def AssociateRouteTableRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateRouteTableRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val subnetIdParams = Ec2RequestEncoder.encode("subnetId", req.subnetId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AssociateRouteTable") +: (dryRunParams ++ (subnetIdParams ++ routeTableIdParams)): _*)
  }
  implicit val ScheduledInstanceRecurrenceRequestEc2Encoder: Ec2RequestEncoder[ScheduledInstanceRecurrenceRequest] = (fieldName: String, dto: ScheduledInstanceRecurrenceRequest) => {
    val frequencyParams = Ec2RequestEncoder.encode(fieldName + "." + "Frequency", dto.frequency)
    val occurrenceUnitParams = Ec2RequestEncoder.encode(fieldName + "." + "OccurrenceUnit", dto.occurrenceUnit)
    val intervalParams = Ec2RequestEncoder.encode(fieldName + "." + "Interval", dto.interval)
    val occurrenceDayParams = Ec2RequestEncoder.encode(fieldName + "." + "OccurrenceDay", dto.occurrenceDay)
    val occurrenceRelativeToEndParams = Ec2RequestEncoder.encode(fieldName + "." + "OccurrenceRelativeToEnd", dto.occurrenceRelativeToEnd)
    occurrenceRelativeToEndParams ++ (occurrenceDayParams ++ (intervalParams ++ (occurrenceUnitParams ++ frequencyParams)))
  }
  implicit val DiskImageEc2Encoder: Ec2RequestEncoder[DiskImage] = (fieldName: String, dto: DiskImage) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "Description", dto.description)
    val imageParams = Ec2RequestEncoder.encode(fieldName + "." + "Image", dto.image)
    val volumeParams = Ec2RequestEncoder.encode(fieldName + "." + "Volume", dto.volume)
    volumeParams ++ (imageParams ++ descriptionParams)
  }
  implicit val ScheduledInstancesIpv6AddressEc2Encoder: Ec2RequestEncoder[ScheduledInstancesIpv6Address] = (fieldName: String, dto: ScheduledInstancesIpv6Address) => {
    val ipv6AddressParams = Ec2RequestEncoder.encode(fieldName + "." + "Ipv6Address", dto.ipv6Address)
    ipv6AddressParams
  }
  implicit val SnapshotTaskDetailEc2Encoder: Ec2RequestEncoder[SnapshotTaskDetail] = (fieldName: String, dto: SnapshotTaskDetail) => {
    val urlParams = Ec2RequestEncoder.encode(fieldName + "." + "url", dto.url)
    val progressParams = Ec2RequestEncoder.encode(fieldName + "." + "progress", dto.progress)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "format", dto.format)
    val snapshotIdParams = Ec2RequestEncoder.encode(fieldName + "." + "snapshotId", dto.snapshotId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val diskImageSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "diskImageSize", dto.diskImageSize)
    val userBucketParams = Ec2RequestEncoder.encode(fieldName + "." + "userBucket", dto.userBucket)
    userBucketParams ++ (diskImageSizeParams ++ (statusMessageParams ++ (snapshotIdParams ++ (formatParams ++ (statusParams ++ (descriptionParams ++ (progressParams ++ urlParams)))))))
  }
  implicit def CreateFpgaImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateFpgaImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val inputStorageLocationParams = Ec2RequestEncoder.encode("InputStorageLocation", req.inputStorageLocation)
    val logsStorageLocationParams = Ec2RequestEncoder.encode("LogsStorageLocation", req.logsStorageLocation)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val nameParams = Ec2RequestEncoder.encode("Name", req.name)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    UrlForm(("Action" -> "CreateFpgaImage") +: (clientTokenParams ++ (nameParams ++ (descriptionParams ++ (dryRunParams ++ (logsStorageLocationParams ++ inputStorageLocationParams))))): _*)
  }
  implicit val EventInformationEc2Encoder: Ec2RequestEncoder[EventInformation] = (fieldName: String, dto: EventInformation) => {
    val eventDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "eventDescription", dto.eventDescription)
    val eventSubTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "eventSubType", dto.eventSubType)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    instanceIdParams ++ (eventSubTypeParams ++ eventDescriptionParams)
  }
  implicit def DeleteRouteTableRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteRouteTableRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteRouteTable") +: (dryRunParams ++ routeTableIdParams): _*)
  }
  implicit def DescribeScheduledInstanceAvailabilityRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeScheduledInstanceAvailabilityRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val recurrenceParams = Ec2RequestEncoder.encode("Recurrence", req.recurrence)
    val firstSlotStartTimeRangeParams = Ec2RequestEncoder.encode("FirstSlotStartTimeRange", req.firstSlotStartTimeRange)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val maxSlotDurationInHoursParams = Ec2RequestEncoder.encode("MaxSlotDurationInHours", req.maxSlotDurationInHours)
    val minSlotDurationInHoursParams = Ec2RequestEncoder.encode("MinSlotDurationInHours", req.minSlotDurationInHours)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeScheduledInstanceAvailability") +: (dryRunParams ++ (minSlotDurationInHoursParams ++ (maxSlotDurationInHoursParams ++ (maxResultsParams ++ (nextTokenParams ++ (filterParams ++ (firstSlotStartTimeRangeParams ++ recurrenceParams))))))): _*)
  }
  implicit val SpotFleetMonitoringEc2Encoder: Ec2RequestEncoder[SpotFleetMonitoring] = (fieldName: String, dto: SpotFleetMonitoring) => {
    val enabledParams = Ec2RequestEncoder.encode(fieldName + "." + "enabled", dto.enabled)
    enabledParams
  }
  implicit def DeleteVpcPeeringConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpcPeeringConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("vpcPeeringConnectionId", req.vpcPeeringConnectionId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVpcPeeringConnection") +: (dryRunParams ++ vpcPeeringConnectionIdParams): _*)
  }
  implicit val ActiveInstanceEc2Encoder: Ec2RequestEncoder[ActiveInstance] = (fieldName: String, dto: ActiveInstance) => {
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotInstanceRequestId", dto.spotInstanceRequestId)
    val instanceHealthParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceHealth", dto.instanceHealth)
    instanceHealthParams ++ (spotInstanceRequestIdParams ++ (instanceTypeParams ++ instanceIdParams))
  }
  implicit def ImportVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ImportVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val availabilityZoneParams = Ec2RequestEncoder.encode("availabilityZone", req.availabilityZone)
    val imageParams = Ec2RequestEncoder.encode("image", req.image)
    val volumeParams = Ec2RequestEncoder.encode("volume", req.volume)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ImportVolume") +: (dryRunParams ++ (descriptionParams ++ (volumeParams ++ (imageParams ++ availabilityZoneParams)))): _*)
  }
  implicit def CreateEgressOnlyInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateEgressOnlyInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CreateEgressOnlyInternetGateway") +: (dryRunParams ++ (clientTokenParams ++ vpcIdParams)): _*)
  }
  implicit val VpcEndpointEc2Encoder: Ec2RequestEncoder[VpcEndpoint] = (fieldName: String, dto: VpcEndpoint) => {
    val vpcEndpointTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcEndpointType", dto.vpcEndpointType)
    val dnsEntrySetParams = Ec2RequestEncoder.encode(fieldName + "." + "dnsEntrySet", dto.dnsEntrySet)
    val vpcEndpointIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcEndpointId", dto.vpcEndpointId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val serviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "serviceName", dto.serviceName)
    val policyDocumentParams = Ec2RequestEncoder.encode(fieldName + "." + "policyDocument", dto.policyDocument)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val creationTimestampParams = Ec2RequestEncoder.encode(fieldName + "." + "creationTimestamp", dto.creationTimestamp)
    val routeTableIdSetParams = Ec2RequestEncoder.encode(fieldName + "." + "routeTableIdSet", dto.routeTableIdSet)
    val subnetIdSetParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetIdSet", dto.subnetIdSet)
    val networkInterfaceIdSetParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceIdSet", dto.networkInterfaceIdSet)
    val privateDnsEnabledParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsEnabled", dto.privateDnsEnabled)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    groupSetParams ++ (privateDnsEnabledParams ++ (networkInterfaceIdSetParams ++ (subnetIdSetParams ++ (routeTableIdSetParams ++ (creationTimestampParams ++ (stateParams ++ (policyDocumentParams ++ (serviceNameParams ++ (vpcIdParams ++ (vpcEndpointIdParams ++ (dnsEntrySetParams ++ vpcEndpointTypeParams)))))))))))
  }
  implicit def DeleteFlowLogsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteFlowLogsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val flowLogIdParams = Ec2RequestEncoder.encode("FlowLogId", req.flowLogId)
    UrlForm(("Action" -> "DeleteFlowLogs") +: flowLogIdParams: _*)
  }
  implicit def DescribeSpotFleetRequestHistoryRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotFleetRequestHistoryRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode("spotFleetRequestId", req.spotFleetRequestId)
    val startTimeParams = Ec2RequestEncoder.encode("startTime", req.startTime)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val eventTypeParams = Ec2RequestEncoder.encode("eventType", req.eventType)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSpotFleetRequestHistory") +: (dryRunParams ++ (maxResultsParams ++ (eventTypeParams ++ (nextTokenParams ++ (startTimeParams ++ spotFleetRequestIdParams))))): _*)
  }
  implicit def ResetSnapshotAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ResetSnapshotAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ResetSnapshotAttribute") +: (dryRunParams ++ (snapshotIdParams ++ attributeParams)): _*)
  }
  implicit def DescribeSecurityGroupsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSecurityGroupsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    UrlForm(("Action" -> "DescribeSecurityGroups") +: (groupNameParams ++ (dryRunParams ++ (maxResultsParams ++ (groupIdParams ++ (nextTokenParams ++ filterParams))))): _*)
  }
  implicit val LoadPermissionModificationsEc2Encoder: Ec2RequestEncoder[LoadPermissionModifications] = (fieldName: String, dto: LoadPermissionModifications) => {
    val addParams = Ec2RequestEncoder.encode(fieldName + "." + "Add", dto.add)
    val removeParams = Ec2RequestEncoder.encode(fieldName + "." + "Remove", dto.remove)
    removeParams ++ addParams
  }
  implicit def CreateTagsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateTagsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val resourceIdParams = Ec2RequestEncoder.encode("ResourceId", req.resourceId)
    val tagParams = Ec2RequestEncoder.encode("Tag", req.tag)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateTags") +: (dryRunParams ++ (tagParams ++ resourceIdParams)): _*)
  }
  implicit def DetachNetworkInterfaceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DetachNetworkInterfaceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attachmentIdParams = Ec2RequestEncoder.encode("attachmentId", req.attachmentId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val forceParams = Ec2RequestEncoder.encode("force", req.force)
    UrlForm(("Action" -> "DetachNetworkInterface") +: (forceParams ++ (dryRunParams ++ attachmentIdParams)): _*)
  }
  implicit val SpotInstanceStatusEc2Encoder: Ec2RequestEncoder[SpotInstanceStatus] = (fieldName: String, dto: SpotInstanceStatus) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    val updateTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "updateTime", dto.updateTime)
    updateTimeParams ++ (messageParams ++ codeParams)
  }
  implicit val HostEc2Encoder: Ec2RequestEncoder[Host] = (fieldName: String, dto: Host) => {
    val instancesParams = Ec2RequestEncoder.encode(fieldName + "." + "instances", dto.instances)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val clientTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "clientToken", dto.clientToken)
    val hostIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostId", dto.hostId)
    val hostReservationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostReservationId", dto.hostReservationId)
    val autoPlacementParams = Ec2RequestEncoder.encode(fieldName + "." + "autoPlacement", dto.autoPlacement)
    val availableCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "availableCapacity", dto.availableCapacity)
    val hostPropertiesParams = Ec2RequestEncoder.encode(fieldName + "." + "hostProperties", dto.hostProperties)
    hostPropertiesParams ++ (availableCapacityParams ++ (autoPlacementParams ++ (hostReservationIdParams ++ (hostIdParams ++ (clientTokenParams ++ (availabilityZoneParams ++ (stateParams ++ instancesParams)))))))
  }
  implicit val UserIdGroupPairEc2Encoder: Ec2RequestEncoder[UserIdGroupPair] = (fieldName: String, dto: UserIdGroupPair) => {
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val userIdParams = Ec2RequestEncoder.encode(fieldName + "." + "userId", dto.userId)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcPeeringConnectionId", dto.vpcPeeringConnectionId)
    val peeringStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "peeringStatus", dto.peeringStatus)
    peeringStatusParams ++ (vpcPeeringConnectionIdParams ++ (vpcIdParams ++ (groupNameParams ++ (userIdParams ++ (descriptionParams ++ groupIdParams)))))
  }
  implicit val LoadPermissionEc2Encoder: Ec2RequestEncoder[LoadPermission] = (fieldName: String, dto: LoadPermission) => {
    val userIdParams = Ec2RequestEncoder.encode(fieldName + "." + "userId", dto.userId)
    val groupParams = Ec2RequestEncoder.encode(fieldName + "." + "group", dto.group)
    groupParams ++ userIdParams
  }
  implicit def DeleteVpnConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpnConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpnConnectionIdParams = Ec2RequestEncoder.encode("VpnConnectionId", req.vpnConnectionId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVpnConnection") +: (dryRunParams ++ vpnConnectionIdParams): _*)
  }
  implicit def CreateKeyPairRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateKeyPairRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val keyNameParams = Ec2RequestEncoder.encode("KeyName", req.keyName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateKeyPair") +: (dryRunParams ++ keyNameParams): _*)
  }
  implicit val SecurityGroupReferenceEc2Encoder: Ec2RequestEncoder[SecurityGroupReference] = (fieldName: String, dto: SecurityGroupReference) => {
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    val referencingVpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "referencingVpcId", dto.referencingVpcId)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcPeeringConnectionId", dto.vpcPeeringConnectionId)
    vpcPeeringConnectionIdParams ++ (referencingVpcIdParams ++ groupIdParams)
  }
  implicit val SpotFleetRequestConfigDataEc2Encoder: Ec2RequestEncoder[SpotFleetRequestConfigData] = (fieldName: String, dto: SpotFleetRequestConfigData) => {
    val iamFleetRoleParams = Ec2RequestEncoder.encode(fieldName + "." + "iamFleetRole", dto.iamFleetRole)
    val spotPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "spotPrice", dto.spotPrice)
    val launchSpecificationsParams = Ec2RequestEncoder.encode(fieldName + "." + "launchSpecifications", dto.launchSpecifications)
    val targetCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "targetCapacity", dto.targetCapacity)
    val allocationStrategyParams = Ec2RequestEncoder.encode(fieldName + "." + "allocationStrategy", dto.allocationStrategy)
    val clientTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "clientToken", dto.clientToken)
    val instanceInterruptionBehaviorParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceInterruptionBehavior", dto.instanceInterruptionBehavior)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    val excessCapacityTerminationPolicyParams = Ec2RequestEncoder.encode(fieldName + "." + "excessCapacityTerminationPolicy", dto.excessCapacityTerminationPolicy)
    val validFromParams = Ec2RequestEncoder.encode(fieldName + "." + "validFrom", dto.validFrom)
    val validUntilParams = Ec2RequestEncoder.encode(fieldName + "." + "validUntil", dto.validUntil)
    val terminateInstancesWithExpirationParams = Ec2RequestEncoder.encode(fieldName + "." + "terminateInstancesWithExpiration", dto.terminateInstancesWithExpiration)
    val replaceUnhealthyInstancesParams = Ec2RequestEncoder.encode(fieldName + "." + "replaceUnhealthyInstances", dto.replaceUnhealthyInstances)
    val fulfilledCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "fulfilledCapacity", dto.fulfilledCapacity)
    val loadBalancersConfigParams = Ec2RequestEncoder.encode(fieldName + "." + "loadBalancersConfig", dto.loadBalancersConfig)
    loadBalancersConfigParams ++ (fulfilledCapacityParams ++ (replaceUnhealthyInstancesParams ++ (terminateInstancesWithExpirationParams ++ (validUntilParams ++ (validFromParams ++ (excessCapacityTerminationPolicyParams ++ (typeParams ++ (instanceInterruptionBehaviorParams ++ (clientTokenParams ++ (allocationStrategyParams ++ (targetCapacityParams ++ (launchSpecificationsParams ++ (spotPriceParams ++ iamFleetRoleParams)))))))))))))
  }
  implicit def DeleteSecurityGroupRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteSecurityGroupRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteSecurityGroup") +: (dryRunParams ++ (groupNameParams ++ groupIdParams)): _*)
  }
  implicit val AttributeValueEc2Encoder: Ec2RequestEncoder[AttributeValue] = (fieldName: String, dto: AttributeValue) => {
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "value", dto.value)
    valueParams
  }
  implicit val ElasticGpuSpecificationEc2Encoder: Ec2RequestEncoder[ElasticGpuSpecification] = (fieldName: String, dto: ElasticGpuSpecification) => {
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "Type", dto.`type`)
    typeParams
  }
  implicit val BlobAttributeValueEc2Encoder: Ec2RequestEncoder[BlobAttributeValue] = (fieldName: String, dto: BlobAttributeValue) => {
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "value", dto.value)
    valueParams
  }
  implicit val PurchaseRequestEc2Encoder: Ec2RequestEncoder[PurchaseRequest] = (fieldName: String, dto: PurchaseRequest) => {
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "InstanceCount", dto.instanceCount)
    val purchaseTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "PurchaseToken", dto.purchaseToken)
    purchaseTokenParams ++ instanceCountParams
  }
  implicit val StorageEc2Encoder: Ec2RequestEncoder[Storage] = (fieldName: String, dto: Storage) => {
    val s3Params = Ec2RequestEncoder.encode(fieldName + "." + "S3", dto.s3)
    s3Params
  }
  implicit def ModifyFpgaImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyFpgaImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val fpgaImageIdParams = Ec2RequestEncoder.encode("FpgaImageId", req.fpgaImageId)
    val userIdParams = Ec2RequestEncoder.encode("UserId", req.userId)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val nameParams = Ec2RequestEncoder.encode("Name", req.name)
    val operationTypeParams = Ec2RequestEncoder.encode("OperationType", req.operationType)
    val loadPermissionParams = Ec2RequestEncoder.encode("LoadPermission", req.loadPermission)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val userGroupParams = Ec2RequestEncoder.encode("UserGroup", req.userGroup)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val productCodeParams = Ec2RequestEncoder.encode("ProductCode", req.productCode)
    UrlForm(("Action" -> "ModifyFpgaImageAttribute") +: (productCodeParams ++ (dryRunParams ++ (userGroupParams ++ (attributeParams ++ (loadPermissionParams ++ (operationTypeParams ++ (nameParams ++ (descriptionParams ++ (userIdParams ++ fpgaImageIdParams))))))))): _*)
  }
  implicit val UserBucketDetailsEc2Encoder: Ec2RequestEncoder[UserBucketDetails] = (fieldName: String, dto: UserBucketDetails) => {
    val s3BucketParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Bucket", dto.s3Bucket)
    val s3KeyParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Key", dto.s3Key)
    s3KeyParams ++ s3BucketParams
  }
  implicit val CustomerGatewayEc2Encoder: Ec2RequestEncoder[CustomerGateway] = (fieldName: String, dto: CustomerGateway) => {
    val ipAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "ipAddress", dto.ipAddress)
    val customerGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "customerGatewayId", dto.customerGatewayId)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val bgpAsnParams = Ec2RequestEncoder.encode(fieldName + "." + "bgpAsn", dto.bgpAsn)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    tagSetParams ++ (typeParams ++ (bgpAsnParams ++ (stateParams ++ (customerGatewayIdParams ++ ipAddressParams))))
  }
  implicit def EnableVolumeIORequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, EnableVolumeIORequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("volumeId", req.volumeId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "EnableVolumeIO") +: (dryRunParams ++ volumeIdParams): _*)
  }
  implicit val EbsBlockDeviceEc2Encoder: Ec2RequestEncoder[EbsBlockDevice] = (fieldName: String, dto: EbsBlockDevice) => {
    val encryptedParams = Ec2RequestEncoder.encode(fieldName + "." + "encrypted", dto.encrypted)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    val iopsParams = Ec2RequestEncoder.encode(fieldName + "." + "iops", dto.iops)
    val volumeSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeSize", dto.volumeSize)
    val snapshotIdParams = Ec2RequestEncoder.encode(fieldName + "." + "snapshotId", dto.snapshotId)
    val volumeTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeType", dto.volumeType)
    volumeTypeParams ++ (snapshotIdParams ++ (volumeSizeParams ++ (iopsParams ++ (deleteOnTerminationParams ++ encryptedParams))))
  }
  implicit def DescribeInstanceStatusRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeInstanceStatusRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val includeAllInstancesParams = Ec2RequestEncoder.encode("includeAllInstances", req.includeAllInstances)
    UrlForm(("Action" -> "DescribeInstanceStatus") +: (includeAllInstancesParams ++ (dryRunParams ++ (maxResultsParams ++ (instanceIdParams ++ (nextTokenParams ++ filterParams))))): _*)
  }
  implicit def DescribeIamInstanceProfileAssociationsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeIamInstanceProfileAssociationsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("AssociationId", req.associationId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeIamInstanceProfileAssociations") +: (nextTokenParams ++ (maxResultsParams ++ (filterParams ++ associationIdParams))): _*)
  }
  implicit def DescribeImagesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeImagesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ownerParams = Ec2RequestEncoder.encode("Owner", req.owner)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val imageIdParams = Ec2RequestEncoder.encode("ImageId", req.imageId)
    val executableByParams = Ec2RequestEncoder.encode("ExecutableBy", req.executableBy)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeImages") +: (dryRunParams ++ (executableByParams ++ (imageIdParams ++ (filterParams ++ ownerParams)))): _*)
  }
  implicit val SpotFleetRequestConfigEc2Encoder: Ec2RequestEncoder[SpotFleetRequestConfig] = (fieldName: String, dto: SpotFleetRequestConfig) => {
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotFleetRequestId", dto.spotFleetRequestId)
    val spotFleetRequestConfigParams = Ec2RequestEncoder.encode(fieldName + "." + "spotFleetRequestConfig", dto.spotFleetRequestConfig)
    val createTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "createTime", dto.createTime)
    val spotFleetRequestStateParams = Ec2RequestEncoder.encode(fieldName + "." + "spotFleetRequestState", dto.spotFleetRequestState)
    val activityStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "activityStatus", dto.activityStatus)
    activityStatusParams ++ (spotFleetRequestStateParams ++ (createTimeParams ++ (spotFleetRequestConfigParams ++ spotFleetRequestIdParams)))
  }
  implicit val CancelSpotFleetRequestsErrorItemEc2Encoder: Ec2RequestEncoder[CancelSpotFleetRequestsErrorItem] = (fieldName: String, dto: CancelSpotFleetRequestsErrorItem) => {
    val errorParams = Ec2RequestEncoder.encode(fieldName + "." + "error", dto.error)
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotFleetRequestId", dto.spotFleetRequestId)
    spotFleetRequestIdParams ++ errorParams
  }
  implicit def DescribePrefixListsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribePrefixListsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val prefixListIdParams = Ec2RequestEncoder.encode("PrefixListId", req.prefixListId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribePrefixLists") +: (dryRunParams ++ (maxResultsParams ++ (prefixListIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def DescribeRegionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeRegionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val regionNameParams = Ec2RequestEncoder.encode("RegionName", req.regionName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeRegions") +: (dryRunParams ++ (regionNameParams ++ filterParams)): _*)
  }
  implicit def RebootInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RebootInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RebootInstances") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit val IamInstanceProfileSpecificationEc2Encoder: Ec2RequestEncoder[IamInstanceProfileSpecification] = (fieldName: String, dto: IamInstanceProfileSpecification) => {
    val arnParams = Ec2RequestEncoder.encode(fieldName + "." + "arn", dto.arn)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    nameParams ++ arnParams
  }
  implicit def ReportInstanceStatusRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReportInstanceStatusRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val statusParams = Ec2RequestEncoder.encode("status", req.status)
    val reasonCodeParams = Ec2RequestEncoder.encode("reasonCode", req.reasonCode)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val endTimeParams = Ec2RequestEncoder.encode("endTime", req.endTime)
    val startTimeParams = Ec2RequestEncoder.encode("startTime", req.startTime)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReportInstanceStatus") +: (dryRunParams ++ (startTimeParams ++ (endTimeParams ++ (descriptionParams ++ (reasonCodeParams ++ (statusParams ++ instanceIdParams)))))): _*)
  }
  implicit val IamInstanceProfileEc2Encoder: Ec2RequestEncoder[IamInstanceProfile] = (fieldName: String, dto: IamInstanceProfile) => {
    val arnParams = Ec2RequestEncoder.encode(fieldName + "." + "arn", dto.arn)
    val idParams = Ec2RequestEncoder.encode(fieldName + "." + "id", dto.id)
    idParams ++ arnParams
  }
  implicit val TargetGroupEc2Encoder: Ec2RequestEncoder[TargetGroup] = (fieldName: String, dto: TargetGroup) => {
    val arnParams = Ec2RequestEncoder.encode(fieldName + "." + "arn", dto.arn)
    arnParams
  }
  implicit def DescribeRouteTablesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeRouteTablesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val routeTableIdParams = Ec2RequestEncoder.encode("RouteTableId", req.routeTableId)
    UrlForm(("Action" -> "DescribeRouteTables") +: (routeTableIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val UserBucketEc2Encoder: Ec2RequestEncoder[UserBucket] = (fieldName: String, dto: UserBucket) => {
    val s3BucketParams = Ec2RequestEncoder.encode(fieldName + "." + "S3Bucket", dto.s3Bucket)
    val s3KeyParams = Ec2RequestEncoder.encode(fieldName + "." + "S3Key", dto.s3Key)
    s3KeyParams ++ s3BucketParams
  }
  implicit val InstanceBlockDeviceMappingSpecificationEc2Encoder: Ec2RequestEncoder[InstanceBlockDeviceMappingSpecification] = (fieldName: String, dto: InstanceBlockDeviceMappingSpecification) => {
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceName", dto.deviceName)
    val noDeviceParams = Ec2RequestEncoder.encode(fieldName + "." + "noDevice", dto.noDevice)
    val virtualNameParams = Ec2RequestEncoder.encode(fieldName + "." + "virtualName", dto.virtualName)
    val ebsParams = Ec2RequestEncoder.encode(fieldName + "." + "ebs", dto.ebs)
    ebsParams ++ (virtualNameParams ++ (noDeviceParams ++ deviceNameParams))
  }
  implicit val NetworkInterfaceAssociationEc2Encoder: Ec2RequestEncoder[NetworkInterfaceAssociation] = (fieldName: String, dto: NetworkInterfaceAssociation) => {
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val publicDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "publicDnsName", dto.publicDnsName)
    val allocationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "allocationId", dto.allocationId)
    val ipOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ipOwnerId", dto.ipOwnerId)
    val publicIpParams = Ec2RequestEncoder.encode(fieldName + "." + "publicIp", dto.publicIp)
    publicIpParams ++ (ipOwnerIdParams ++ (allocationIdParams ++ (publicDnsNameParams ++ associationIdParams)))
  }
  implicit def CreateNetworkInterfacePermissionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateNetworkInterfacePermissionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("NetworkInterfaceId", req.networkInterfaceId)
    val permissionParams = Ec2RequestEncoder.encode("Permission", req.permission)
    val awsAccountIdParams = Ec2RequestEncoder.encode("AwsAccountId", req.awsAccountId)
    val awsServiceParams = Ec2RequestEncoder.encode("AwsService", req.awsService)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CreateNetworkInterfacePermission") +: (dryRunParams ++ (awsServiceParams ++ (awsAccountIdParams ++ (permissionParams ++ networkInterfaceIdParams)))): _*)
  }
  implicit def DescribeReservedInstancesOfferingsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeReservedInstancesOfferingsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val maxDurationParams = Ec2RequestEncoder.encode("MaxDuration", req.maxDuration)
    val minDurationParams = Ec2RequestEncoder.encode("MinDuration", req.minDuration)
    val availabilityZoneParams = Ec2RequestEncoder.encode("AvailabilityZone", req.availabilityZone)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val offeringClassParams = Ec2RequestEncoder.encode("OfferingClass", req.offeringClass)
    val productDescriptionParams = Ec2RequestEncoder.encode("ProductDescription", req.productDescription)
    val reservedInstancesOfferingIdParams = Ec2RequestEncoder.encode("ReservedInstancesOfferingId", req.reservedInstancesOfferingId)
    val offeringTypeParams = Ec2RequestEncoder.encode("offeringType", req.offeringType)
    val instanceTenancyParams = Ec2RequestEncoder.encode("instanceTenancy", req.instanceTenancy)
    val maxInstanceCountParams = Ec2RequestEncoder.encode("MaxInstanceCount", req.maxInstanceCount)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val includeMarketplaceParams = Ec2RequestEncoder.encode("IncludeMarketplace", req.includeMarketplace)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val instanceTypeParams = Ec2RequestEncoder.encode("InstanceType", req.instanceType)
    UrlForm(("Action" -> "DescribeReservedInstancesOfferings") +: (instanceTypeParams ++ (dryRunParams ++ (includeMarketplaceParams ++ (maxResultsParams ++ (maxInstanceCountParams ++ (instanceTenancyParams ++ (offeringTypeParams ++ (reservedInstancesOfferingIdParams ++ (productDescriptionParams ++ (offeringClassParams ++ (nextTokenParams ++ (availabilityZoneParams ++ (minDurationParams ++ (maxDurationParams ++ filterParams)))))))))))))): _*)
  }
  implicit val SpotInstanceRequestEc2Encoder: Ec2RequestEncoder[SpotInstanceRequest] = (fieldName: String, dto: SpotInstanceRequest) => {
    val faultParams = Ec2RequestEncoder.encode(fieldName + "." + "fault", dto.fault)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    val launchedAvailabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "launchedAvailabilityZone", dto.launchedAvailabilityZone)
    val availabilityZoneGroupParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZoneGroup", dto.availabilityZoneGroup)
    val actualBlockHourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "actualBlockHourlyPrice", dto.actualBlockHourlyPrice)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val launchGroupParams = Ec2RequestEncoder.encode(fieldName + "." + "launchGroup", dto.launchGroup)
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotInstanceRequestId", dto.spotInstanceRequestId)
    val spotPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "spotPrice", dto.spotPrice)
    val instanceInterruptionBehaviorParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceInterruptionBehavior", dto.instanceInterruptionBehavior)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val productDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "productDescription", dto.productDescription)
    val createTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "createTime", dto.createTime)
    val validFromParams = Ec2RequestEncoder.encode(fieldName + "." + "validFrom", dto.validFrom)
    val validUntilParams = Ec2RequestEncoder.encode(fieldName + "." + "validUntil", dto.validUntil)
    val blockDurationMinutesParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDurationMinutes", dto.blockDurationMinutes)
    val launchSpecificationParams = Ec2RequestEncoder.encode(fieldName + "." + "launchSpecification", dto.launchSpecification)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (launchSpecificationParams ++ (blockDurationMinutesParams ++ (validUntilParams ++ (validFromParams ++ (createTimeParams ++ (productDescriptionParams ++ (tagSetParams ++ (statusParams ++ (instanceInterruptionBehaviorParams ++ (spotPriceParams ++ (spotInstanceRequestIdParams ++ (launchGroupParams ++ (instanceIdParams ++ (actualBlockHourlyPriceParams ++ (availabilityZoneGroupParams ++ (launchedAvailabilityZoneParams ++ (typeParams ++ faultParams)))))))))))))))))
  }
  implicit val CidrBlockEc2Encoder: Ec2RequestEncoder[CidrBlock] = (fieldName: String, dto: CidrBlock) => {
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    cidrBlockParams
  }
  implicit val GroupIdentifierEc2Encoder: Ec2RequestEncoder[GroupIdentifier] = (fieldName: String, dto: GroupIdentifier) => {
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    groupIdParams ++ groupNameParams
  }
  implicit def DescribeExportTasksRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeExportTasksRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val exportTaskIdParams = Ec2RequestEncoder.encode("exportTaskId", req.exportTaskId)
    UrlForm(("Action" -> "DescribeExportTasks") +: exportTaskIdParams: _*)
  }
  implicit def ModifyVolumeAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVolumeAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val autoEnableIOParams = Ec2RequestEncoder.encode("AutoEnableIO", req.autoEnableIO)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ModifyVolumeAttribute") +: (dryRunParams ++ (autoEnableIOParams ++ volumeIdParams)): _*)
  }
  implicit def DisassociateVpcCidrBlockRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisassociateVpcCidrBlockRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("associationId", req.associationId)
    UrlForm(("Action" -> "DisassociateVpcCidrBlock") +: associationIdParams: _*)
  }
  implicit def DeleteVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVpc") +: (dryRunParams ++ vpcIdParams): _*)
  }
  implicit def DeleteNetworkInterfaceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteNetworkInterfaceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteNetworkInterface") +: (dryRunParams ++ networkInterfaceIdParams): _*)
  }
  implicit val ScheduledInstancesNetworkInterfaceEc2Encoder: Ec2RequestEncoder[ScheduledInstancesNetworkInterface] = (fieldName: String, dto: ScheduledInstancesNetworkInterface) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "Description", dto.description)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "NetworkInterfaceId", dto.networkInterfaceId)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "PrivateIpAddress", dto.privateIpAddress)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SubnetId", dto.subnetId)
    val privateIpAddressConfigParams = Ec2RequestEncoder.encode(fieldName + "." + "PrivateIpAddressConfig", dto.privateIpAddressConfig)
    val ipv6AddressParams = Ec2RequestEncoder.encode(fieldName + "." + "Ipv6Address", dto.ipv6Address)
    val deviceIndexParams = Ec2RequestEncoder.encode(fieldName + "." + "DeviceIndex", dto.deviceIndex)
    val ipv6AddressCountParams = Ec2RequestEncoder.encode(fieldName + "." + "Ipv6AddressCount", dto.ipv6AddressCount)
    val secondaryPrivateIpAddressCountParams = Ec2RequestEncoder.encode(fieldName + "." + "SecondaryPrivateIpAddressCount", dto.secondaryPrivateIpAddressCount)
    val associatePublicIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "AssociatePublicIpAddress", dto.associatePublicIpAddress)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "DeleteOnTermination", dto.deleteOnTermination)
    val groupParams = Ec2RequestEncoder.encode(fieldName + "." + "Group", dto.group)
    groupParams ++ (deleteOnTerminationParams ++ (associatePublicIpAddressParams ++ (secondaryPrivateIpAddressCountParams ++ (ipv6AddressCountParams ++ (deviceIndexParams ++ (ipv6AddressParams ++ (privateIpAddressConfigParams ++ (subnetIdParams ++ (privateIpAddressParams ++ (networkInterfaceIdParams ++ descriptionParams))))))))))
  }
  implicit val ExportToS3TaskSpecificationEc2Encoder: Ec2RequestEncoder[ExportToS3TaskSpecification] = (fieldName: String, dto: ExportToS3TaskSpecification) => {
    val containerFormatParams = Ec2RequestEncoder.encode(fieldName + "." + "containerFormat", dto.containerFormat)
    val diskImageFormatParams = Ec2RequestEncoder.encode(fieldName + "." + "diskImageFormat", dto.diskImageFormat)
    val s3BucketParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Bucket", dto.s3Bucket)
    val s3PrefixParams = Ec2RequestEncoder.encode(fieldName + "." + "s3Prefix", dto.s3Prefix)
    s3PrefixParams ++ (s3BucketParams ++ (diskImageFormatParams ++ containerFormatParams))
  }
  implicit val VpnTunnelOptionsSpecificationEc2Encoder: Ec2RequestEncoder[VpnTunnelOptionsSpecification] = (fieldName: String, dto: VpnTunnelOptionsSpecification) => {
    val tunnelInsideCidrParams = Ec2RequestEncoder.encode(fieldName + "." + "TunnelInsideCidr", dto.tunnelInsideCidr)
    val preSharedKeyParams = Ec2RequestEncoder.encode(fieldName + "." + "PreSharedKey", dto.preSharedKey)
    preSharedKeyParams ++ tunnelInsideCidrParams
  }
  implicit val InstanceNetworkInterfaceAssociationEc2Encoder: Ec2RequestEncoder[InstanceNetworkInterfaceAssociation] = (fieldName: String, dto: InstanceNetworkInterfaceAssociation) => {
    val ipOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ipOwnerId", dto.ipOwnerId)
    val publicDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "publicDnsName", dto.publicDnsName)
    val publicIpParams = Ec2RequestEncoder.encode(fieldName + "." + "publicIp", dto.publicIp)
    publicIpParams ++ (publicDnsNameParams ++ ipOwnerIdParams)
  }
  implicit def DescribeInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeInstances") +: (dryRunParams ++ (maxResultsParams ++ (instanceIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def ImportInstanceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ImportInstanceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val platformParams = Ec2RequestEncoder.encode("platform", req.platform)
    val launchSpecificationParams = Ec2RequestEncoder.encode("launchSpecification", req.launchSpecification)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val diskImageParams = Ec2RequestEncoder.encode("diskImage", req.diskImage)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ImportInstance") +: (dryRunParams ++ (diskImageParams ++ (descriptionParams ++ (launchSpecificationParams ++ platformParams)))): _*)
  }
  implicit val ImportSnapshotTaskEc2Encoder: Ec2RequestEncoder[ImportSnapshotTask] = (fieldName: String, dto: ImportSnapshotTask) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val importTaskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "importTaskId", dto.importTaskId)
    val snapshotTaskDetailParams = Ec2RequestEncoder.encode(fieldName + "." + "snapshotTaskDetail", dto.snapshotTaskDetail)
    snapshotTaskDetailParams ++ (importTaskIdParams ++ descriptionParams)
  }
  implicit val VpnConnectionOptionsSpecificationEc2Encoder: Ec2RequestEncoder[VpnConnectionOptionsSpecification] = (fieldName: String, dto: VpnConnectionOptionsSpecification) => {
    val staticRoutesOnlyParams = Ec2RequestEncoder.encode(fieldName + "." + "staticRoutesOnly", dto.staticRoutesOnly)
    val tunnelOptionsParams = Ec2RequestEncoder.encode(fieldName + "." + "TunnelOptions", dto.tunnelOptions)
    tunnelOptionsParams ++ staticRoutesOnlyParams
  }
  implicit val InstanceStatusDetailsEc2Encoder: Ec2RequestEncoder[InstanceStatusDetails] = (fieldName: String, dto: InstanceStatusDetails) => {
    val impairedSinceParams = Ec2RequestEncoder.encode(fieldName + "." + "impairedSince", dto.impairedSince)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ (nameParams ++ impairedSinceParams)
  }
  implicit val ExportTaskEc2Encoder: Ec2RequestEncoder[ExportTask] = (fieldName: String, dto: ExportTask) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val exportTaskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "exportTaskId", dto.exportTaskId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val exportToS3Params = Ec2RequestEncoder.encode(fieldName + "." + "exportToS3", dto.exportToS3)
    val instanceExportParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceExport", dto.instanceExport)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (instanceExportParams ++ (exportToS3Params ++ (statusMessageParams ++ (exportTaskIdParams ++ descriptionParams))))
  }
  implicit def GetPasswordDataRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, GetPasswordDataRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "GetPasswordData") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit val VpcPeeringConnectionOptionsDescriptionEc2Encoder: Ec2RequestEncoder[VpcPeeringConnectionOptionsDescription] = (fieldName: String, dto: VpcPeeringConnectionOptionsDescription) => {
    val allowDnsResolutionFromRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "allowDnsResolutionFromRemoteVpc", dto.allowDnsResolutionFromRemoteVpc)
    val allowEgressFromLocalClassicLinkToRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "allowEgressFromLocalClassicLinkToRemoteVpc", dto.allowEgressFromLocalClassicLinkToRemoteVpc)
    val allowEgressFromLocalVpcToRemoteClassicLinkParams = Ec2RequestEncoder.encode(fieldName + "." + "allowEgressFromLocalVpcToRemoteClassicLink", dto.allowEgressFromLocalVpcToRemoteClassicLink)
    allowEgressFromLocalVpcToRemoteClassicLinkParams ++ (allowEgressFromLocalClassicLinkToRemoteVpcParams ++ allowDnsResolutionFromRemoteVpcParams)
  }
  implicit val AddressEc2Encoder: Ec2RequestEncoder[Address] = (fieldName: String, dto: Address) => {
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val allocationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "allocationId", dto.allocationId)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val networkInterfaceOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceOwnerId", dto.networkInterfaceOwnerId)
    val publicIpParams = Ec2RequestEncoder.encode(fieldName + "." + "publicIp", dto.publicIp)
    val domainParams = Ec2RequestEncoder.encode(fieldName + "." + "domain", dto.domain)
    domainParams ++ (publicIpParams ++ (networkInterfaceOwnerIdParams ++ (instanceIdParams ++ (allocationIdParams ++ (associationIdParams ++ (privateIpAddressParams ++ networkInterfaceIdParams))))))
  }
  implicit val InstanceStatusEventEc2Encoder: Ec2RequestEncoder[InstanceStatusEvent] = (fieldName: String, dto: InstanceStatusEvent) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val notAfterParams = Ec2RequestEncoder.encode(fieldName + "." + "notAfter", dto.notAfter)
    val notBeforeParams = Ec2RequestEncoder.encode(fieldName + "." + "notBefore", dto.notBefore)
    notBeforeParams ++ (notAfterParams ++ (descriptionParams ++ codeParams))
  }
  implicit def DescribeVpcsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpcs") +: (dryRunParams ++ (vpcIdParams ++ filterParams)): _*)
  }
  implicit val AccountAttributeValueEc2Encoder: Ec2RequestEncoder[AccountAttributeValue] = (fieldName: String, dto: AccountAttributeValue) => {
    val attributeValueParams = Ec2RequestEncoder.encode(fieldName + "." + "attributeValue", dto.attributeValue)
    attributeValueParams
  }
  implicit val PeeringConnectionOptionsEc2Encoder: Ec2RequestEncoder[PeeringConnectionOptions] = (fieldName: String, dto: PeeringConnectionOptions) => {
    val allowDnsResolutionFromRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "allowDnsResolutionFromRemoteVpc", dto.allowDnsResolutionFromRemoteVpc)
    val allowEgressFromLocalClassicLinkToRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "allowEgressFromLocalClassicLinkToRemoteVpc", dto.allowEgressFromLocalClassicLinkToRemoteVpc)
    val allowEgressFromLocalVpcToRemoteClassicLinkParams = Ec2RequestEncoder.encode(fieldName + "." + "allowEgressFromLocalVpcToRemoteClassicLink", dto.allowEgressFromLocalVpcToRemoteClassicLink)
    allowEgressFromLocalVpcToRemoteClassicLinkParams ++ (allowEgressFromLocalClassicLinkToRemoteVpcParams ++ allowDnsResolutionFromRemoteVpcParams)
  }
  implicit def DescribeAddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeAddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val publicIpParams = Ec2RequestEncoder.encode("PublicIp", req.publicIp)
    val allocationIdParams = Ec2RequestEncoder.encode("AllocationId", req.allocationId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeAddresses") +: (dryRunParams ++ (allocationIdParams ++ (publicIpParams ++ filterParams))): _*)
  }
  implicit def DescribeNetworkAclsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeNetworkAclsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val networkAclIdParams = Ec2RequestEncoder.encode("NetworkAclId", req.networkAclId)
    UrlForm(("Action" -> "DescribeNetworkAcls") +: (networkAclIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val RunInstancesMonitoringEnabledEc2Encoder: Ec2RequestEncoder[RunInstancesMonitoringEnabled] = (fieldName: String, dto: RunInstancesMonitoringEnabled) => {
    val enabledParams = Ec2RequestEncoder.encode(fieldName + "." + "enabled", dto.enabled)
    enabledParams
  }
  implicit val FpgaImageEc2Encoder: Ec2RequestEncoder[FpgaImage] = (fieldName: String, dto: FpgaImage) => {
    val productCodesParams = Ec2RequestEncoder.encode(fieldName + "." + "productCodes", dto.productCodes)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val shellVersionParams = Ec2RequestEncoder.encode(fieldName + "." + "shellVersion", dto.shellVersion)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    val ownerAliasParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerAlias", dto.ownerAlias)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val fpgaImageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "fpgaImageId", dto.fpgaImageId)
    val fpgaImageGlobalIdParams = Ec2RequestEncoder.encode(fieldName + "." + "fpgaImageGlobalId", dto.fpgaImageGlobalId)
    val tagsParams = Ec2RequestEncoder.encode(fieldName + "." + "tags", dto.tags)
    val createTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "createTime", dto.createTime)
    val updateTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "updateTime", dto.updateTime)
    val publicParams = Ec2RequestEncoder.encode(fieldName + "." + "public", dto.public)
    val pciIdParams = Ec2RequestEncoder.encode(fieldName + "." + "pciId", dto.pciId)
    pciIdParams ++ (publicParams ++ (updateTimeParams ++ (createTimeParams ++ (tagsParams ++ (fpgaImageGlobalIdParams ++ (fpgaImageIdParams ++ (ownerIdParams ++ (ownerAliasParams ++ (nameParams ++ (shellVersionParams ++ (descriptionParams ++ (stateParams ++ productCodesParams))))))))))))
  }
  implicit val TargetGroupsConfigEc2Encoder: Ec2RequestEncoder[TargetGroupsConfig] = (fieldName: String, dto: TargetGroupsConfig) => {
    val targetGroupsParams = Ec2RequestEncoder.encode(fieldName + "." + "targetGroups", dto.targetGroups)
    targetGroupsParams
  }
  implicit val VpnConnectionOptionsEc2Encoder: Ec2RequestEncoder[VpnConnectionOptions] = (fieldName: String, dto: VpnConnectionOptions) => {
    val staticRoutesOnlyParams = Ec2RequestEncoder.encode(fieldName + "." + "staticRoutesOnly", dto.staticRoutesOnly)
    staticRoutesOnlyParams
  }
  implicit def AssociateSubnetCidrBlockRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateSubnetCidrBlockRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode("ipv6CidrBlock", req.ipv6CidrBlock)
    val subnetIdParams = Ec2RequestEncoder.encode("subnetId", req.subnetId)
    UrlForm(("Action" -> "AssociateSubnetCidrBlock") +: (subnetIdParams ++ ipv6CidrBlockParams): _*)
  }
  implicit val ReservedInstanceReservationValueEc2Encoder: Ec2RequestEncoder[ReservedInstanceReservationValue] = (fieldName: String, dto: ReservedInstanceReservationValue) => {
    val reservationValueParams = Ec2RequestEncoder.encode(fieldName + "." + "reservationValue", dto.reservationValue)
    val reservedInstanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstanceId", dto.reservedInstanceId)
    reservedInstanceIdParams ++ reservationValueParams
  }
  implicit val TagEc2Encoder: Ec2RequestEncoder[Tag] = (fieldName: String, dto: Tag) => {
    val keyParams = Ec2RequestEncoder.encode(fieldName + "." + "key", dto.key)
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "value", dto.value)
    valueParams ++ keyParams
  }
  implicit val VolumeModificationEc2Encoder: Ec2RequestEncoder[VolumeModification] = (fieldName: String, dto: VolumeModification) => {
    val targetVolumeTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "targetVolumeType", dto.targetVolumeType)
    val originalVolumeTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "originalVolumeType", dto.originalVolumeType)
    val progressParams = Ec2RequestEncoder.encode(fieldName + "." + "progress", dto.progress)
    val volumeIdParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeId", dto.volumeId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val modificationStateParams = Ec2RequestEncoder.encode(fieldName + "." + "modificationState", dto.modificationState)
    val startTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "startTime", dto.startTime)
    val endTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "endTime", dto.endTime)
    val targetSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "targetSize", dto.targetSize)
    val targetIopsParams = Ec2RequestEncoder.encode(fieldName + "." + "targetIops", dto.targetIops)
    val originalSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "originalSize", dto.originalSize)
    val originalIopsParams = Ec2RequestEncoder.encode(fieldName + "." + "originalIops", dto.originalIops)
    originalIopsParams ++ (originalSizeParams ++ (targetIopsParams ++ (targetSizeParams ++ (endTimeParams ++ (startTimeParams ++ (modificationStateParams ++ (statusMessageParams ++ (volumeIdParams ++ (progressParams ++ (originalVolumeTypeParams ++ targetVolumeTypeParams))))))))))
  }
  implicit val VpcPeeringConnectionVpcInfoEc2Encoder: Ec2RequestEncoder[VpcPeeringConnectionVpcInfo] = (fieldName: String, dto: VpcPeeringConnectionVpcInfo) => {
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val ipv6CidrBlockSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlockSet", dto.ipv6CidrBlockSet)
    val cidrBlockSetParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlockSet", dto.cidrBlockSet)
    val peeringOptionsParams = Ec2RequestEncoder.encode(fieldName + "." + "peeringOptions", dto.peeringOptions)
    peeringOptionsParams ++ (cidrBlockSetParams ++ (ipv6CidrBlockSetParams ++ (vpcIdParams ++ (ownerIdParams ++ cidrBlockParams))))
  }
  implicit val VolumeStatusEventEc2Encoder: Ec2RequestEncoder[VolumeStatusEvent] = (fieldName: String, dto: VolumeStatusEvent) => {
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val eventIdParams = Ec2RequestEncoder.encode(fieldName + "." + "eventId", dto.eventId)
    val eventTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "eventType", dto.eventType)
    val notAfterParams = Ec2RequestEncoder.encode(fieldName + "." + "notAfter", dto.notAfter)
    val notBeforeParams = Ec2RequestEncoder.encode(fieldName + "." + "notBefore", dto.notBefore)
    notBeforeParams ++ (notAfterParams ++ (eventTypeParams ++ (eventIdParams ++ descriptionParams)))
  }
  implicit val ServiceTypeDetailEc2Encoder: Ec2RequestEncoder[ServiceTypeDetail] = (fieldName: String, dto: ServiceTypeDetail) => {
    val serviceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "serviceType", dto.serviceType)
    serviceTypeParams
  }
  implicit def CopySnapshotRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CopySnapshotRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val sourceSnapshotIdParams = Ec2RequestEncoder.encode("SourceSnapshotId", req.sourceSnapshotId)
    val sourceRegionParams = Ec2RequestEncoder.encode("SourceRegion", req.sourceRegion)
    val presignedUrlParams = Ec2RequestEncoder.encode("presignedUrl", req.presignedUrl)
    val destinationRegionParams = Ec2RequestEncoder.encode("destinationRegion", req.destinationRegion)
    val kmsKeyIdParams = Ec2RequestEncoder.encode("kmsKeyId", req.kmsKeyId)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val encryptedParams = Ec2RequestEncoder.encode("encrypted", req.encrypted)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CopySnapshot") +: (dryRunParams ++ (encryptedParams ++ (descriptionParams ++ (kmsKeyIdParams ++ (destinationRegionParams ++ (presignedUrlParams ++ (sourceRegionParams ++ sourceSnapshotIdParams))))))): _*)
  }
  implicit def DetachInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DetachInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val internetGatewayIdParams = Ec2RequestEncoder.encode("internetGatewayId", req.internetGatewayId)
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DetachInternetGateway") +: (dryRunParams ++ (vpcIdParams ++ internetGatewayIdParams)): _*)
  }
  implicit def DeleteVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val volumeIdParams = Ec2RequestEncoder.encode("VolumeId", req.volumeId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteVolume") +: (dryRunParams ++ volumeIdParams): _*)
  }
  implicit val ClassicLinkDnsSupportEc2Encoder: Ec2RequestEncoder[ClassicLinkDnsSupport] = (fieldName: String, dto: ClassicLinkDnsSupport) => {
    val classicLinkDnsSupportedParams = Ec2RequestEncoder.encode(fieldName + "." + "classicLinkDnsSupported", dto.classicLinkDnsSupported)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    vpcIdParams ++ classicLinkDnsSupportedParams
  }
  implicit def AssociateIamInstanceProfileRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssociateIamInstanceProfileRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val iamInstanceProfileParams = Ec2RequestEncoder.encode("IamInstanceProfile", req.iamInstanceProfile)
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    UrlForm(("Action" -> "AssociateIamInstanceProfile") +: (instanceIdParams ++ iamInstanceProfileParams): _*)
  }
  implicit val TargetConfigurationEc2Encoder: Ec2RequestEncoder[TargetConfiguration] = (fieldName: String, dto: TargetConfiguration) => {
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCount", dto.instanceCount)
    val offeringIdParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringId", dto.offeringId)
    offeringIdParams ++ instanceCountParams
  }
  implicit val TagSpecificationEc2Encoder: Ec2RequestEncoder[TagSpecification] = (fieldName: String, dto: TagSpecification) => {
    val resourceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceType", dto.resourceType)
    val tagParams = Ec2RequestEncoder.encode(fieldName + "." + "Tag", dto.tag)
    tagParams ++ resourceTypeParams
  }
  implicit val InstanceExportDetailsEc2Encoder: Ec2RequestEncoder[InstanceExportDetails] = (fieldName: String, dto: InstanceExportDetails) => {
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val targetEnvironmentParams = Ec2RequestEncoder.encode(fieldName + "." + "targetEnvironment", dto.targetEnvironment)
    targetEnvironmentParams ++ instanceIdParams
  }
  implicit val AvailableCapacityEc2Encoder: Ec2RequestEncoder[AvailableCapacity] = (fieldName: String, dto: AvailableCapacity) => {
    val availableInstanceCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "availableInstanceCapacity", dto.availableInstanceCapacity)
    val availableVCpusParams = Ec2RequestEncoder.encode(fieldName + "." + "availableVCpus", dto.availableVCpus)
    availableVCpusParams ++ availableInstanceCapacityParams
  }
  implicit def CreateInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateInternetGateway") +: dryRunParams: _*)
  }
  implicit def CancelBundleTaskRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelBundleTaskRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val bundleIdParams = Ec2RequestEncoder.encode("BundleId", req.bundleId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CancelBundleTask") +: (dryRunParams ++ bundleIdParams): _*)
  }
  implicit val RouteTableAssociationEc2Encoder: Ec2RequestEncoder[RouteTableAssociation] = (fieldName: String, dto: RouteTableAssociation) => {
    val mainParams = Ec2RequestEncoder.encode(fieldName + "." + "main", dto.main)
    val routeTableAssociationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "routeTableAssociationId", dto.routeTableAssociationId)
    val routeTableIdParams = Ec2RequestEncoder.encode(fieldName + "." + "routeTableId", dto.routeTableId)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    subnetIdParams ++ (routeTableIdParams ++ (routeTableAssociationIdParams ++ mainParams))
  }
  implicit def CreateVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val cidrBlockParams = Ec2RequestEncoder.encode("CidrBlock", req.cidrBlock)
    val amazonProvidedIpv6CidrBlockParams = Ec2RequestEncoder.encode("amazonProvidedIpv6CidrBlock", req.amazonProvidedIpv6CidrBlock)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val instanceTenancyParams = Ec2RequestEncoder.encode("instanceTenancy", req.instanceTenancy)
    UrlForm(("Action" -> "CreateVpc") +: (instanceTenancyParams ++ (dryRunParams ++ (amazonProvidedIpv6CidrBlockParams ++ cidrBlockParams))): _*)
  }
  implicit def DisassociateRouteTableRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisassociateRouteTableRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("associationId", req.associationId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DisassociateRouteTable") +: (dryRunParams ++ associationIdParams): _*)
  }
  implicit def ResetFpgaImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ResetFpgaImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val fpgaImageIdParams = Ec2RequestEncoder.encode("FpgaImageId", req.fpgaImageId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    UrlForm(("Action" -> "ResetFpgaImageAttribute") +: (attributeParams ++ (dryRunParams ++ fpgaImageIdParams)): _*)
  }
  implicit def CreateVolumeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVolumeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val availabilityZoneParams = Ec2RequestEncoder.encode("AvailabilityZone", req.availabilityZone)
    val volumeTypeParams = Ec2RequestEncoder.encode("VolumeType", req.volumeType)
    val kmsKeyIdParams = Ec2RequestEncoder.encode("KmsKeyId", req.kmsKeyId)
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val tagSpecificationParams = Ec2RequestEncoder.encode("TagSpecification", req.tagSpecification)
    val iopsParams = Ec2RequestEncoder.encode("Iops", req.iops)
    val sizeParams = Ec2RequestEncoder.encode("Size", req.size)
    val encryptedParams = Ec2RequestEncoder.encode("encrypted", req.encrypted)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateVolume") +: (dryRunParams ++ (encryptedParams ++ (sizeParams ++ (iopsParams ++ (tagSpecificationParams ++ (snapshotIdParams ++ (kmsKeyIdParams ++ (volumeTypeParams ++ availabilityZoneParams)))))))): _*)
  }
  implicit def DescribeSecurityGroupReferencesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSecurityGroupReferencesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSecurityGroupReferences") +: (dryRunParams ++ groupIdParams): _*)
  }
  implicit def DisassociateIamInstanceProfileRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisassociateIamInstanceProfileRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("AssociationId", req.associationId)
    UrlForm(("Action" -> "DisassociateIamInstanceProfile") +: associationIdParams: _*)
  }
  implicit val SecurityGroupIdentifierEc2Encoder: Ec2RequestEncoder[SecurityGroupIdentifier] = (fieldName: String, dto: SecurityGroupIdentifier) => {
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    groupNameParams ++ groupIdParams
  }
  implicit def DescribeReservedInstancesListingsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeReservedInstancesListingsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val reservedInstancesIdParams = Ec2RequestEncoder.encode("reservedInstancesId", req.reservedInstancesId)
    val reservedInstancesListingIdParams = Ec2RequestEncoder.encode("reservedInstancesListingId", req.reservedInstancesListingId)
    UrlForm(("Action" -> "DescribeReservedInstancesListings") +: (reservedInstancesListingIdParams ++ (reservedInstancesIdParams ++ filterParams)): _*)
  }
  implicit val IdFormatEc2Encoder: Ec2RequestEncoder[IdFormat] = (fieldName: String, dto: IdFormat) => {
    val deadlineParams = Ec2RequestEncoder.encode(fieldName + "." + "deadline", dto.deadline)
    val resourceParams = Ec2RequestEncoder.encode(fieldName + "." + "resource", dto.resource)
    val useLongIdsParams = Ec2RequestEncoder.encode(fieldName + "." + "useLongIds", dto.useLongIds)
    useLongIdsParams ++ (resourceParams ++ deadlineParams)
  }
  implicit def EnableVgwRoutePropagationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, EnableVgwRoutePropagationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val gatewayIdParams = Ec2RequestEncoder.encode("GatewayId", req.gatewayId)
    val routeTableIdParams = Ec2RequestEncoder.encode("RouteTableId", req.routeTableId)
    UrlForm(("Action" -> "EnableVgwRoutePropagation") +: (routeTableIdParams ++ gatewayIdParams): _*)
  }
  implicit val ReservedInstancesIdEc2Encoder: Ec2RequestEncoder[ReservedInstancesId] = (fieldName: String, dto: ReservedInstancesId) => {
    val reservedInstancesIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesId", dto.reservedInstancesId)
    reservedInstancesIdParams
  }
  implicit val CancelledSpotInstanceRequestEc2Encoder: Ec2RequestEncoder[CancelledSpotInstanceRequest] = (fieldName: String, dto: CancelledSpotInstanceRequest) => {
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotInstanceRequestId", dto.spotInstanceRequestId)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ spotInstanceRequestIdParams
  }
  implicit val InstancePrivateIpAddressEc2Encoder: Ec2RequestEncoder[InstancePrivateIpAddress] = (fieldName: String, dto: InstancePrivateIpAddress) => {
    val associationParams = Ec2RequestEncoder.encode(fieldName + "." + "association", dto.association)
    val primaryParams = Ec2RequestEncoder.encode(fieldName + "." + "primary", dto.primary)
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    privateIpAddressParams ++ (privateDnsNameParams ++ (primaryParams ++ associationParams))
  }
  implicit def DeleteEgressOnlyInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteEgressOnlyInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode("EgressOnlyInternetGatewayId", req.egressOnlyInternetGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteEgressOnlyInternetGateway") +: (dryRunParams ++ egressOnlyInternetGatewayIdParams): _*)
  }
  implicit val VpcEc2Encoder: Ec2RequestEncoder[Vpc] = (fieldName: String, dto: Vpc) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val cidrBlockAssociationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlockAssociationSet", dto.cidrBlockAssociationSet)
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    val dhcpOptionsIdParams = Ec2RequestEncoder.encode(fieldName + "." + "dhcpOptionsId", dto.dhcpOptionsId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val ipv6CidrBlockAssociationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6CidrBlockAssociationSet", dto.ipv6CidrBlockAssociationSet)
    val instanceTenancyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceTenancy", dto.instanceTenancy)
    val isDefaultParams = Ec2RequestEncoder.encode(fieldName + "." + "isDefault", dto.isDefault)
    isDefaultParams ++ (instanceTenancyParams ++ (ipv6CidrBlockAssociationSetParams ++ (tagSetParams ++ (vpcIdParams ++ (dhcpOptionsIdParams ++ (cidrBlockParams ++ (cidrBlockAssociationSetParams ++ stateParams)))))))
  }
  implicit val SlotDateTimeRangeRequestEc2Encoder: Ec2RequestEncoder[SlotDateTimeRangeRequest] = (fieldName: String, dto: SlotDateTimeRangeRequest) => {
    val earliestTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "EarliestTime", dto.earliestTime)
    val latestTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "LatestTime", dto.latestTime)
    latestTimeParams ++ earliestTimeParams
  }
  implicit def DeleteNetworkInterfacePermissionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteNetworkInterfacePermissionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfacePermissionIdParams = Ec2RequestEncoder.encode("NetworkInterfacePermissionId", req.networkInterfacePermissionId)
    val forceParams = Ec2RequestEncoder.encode("Force", req.force)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteNetworkInterfacePermission") +: (dryRunParams ++ (forceParams ++ networkInterfacePermissionIdParams)): _*)
  }
  implicit def UpdateSecurityGroupRuleDescriptionsIngressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, UpdateSecurityGroupRuleDescriptionsIngressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ipPermissionsParams = Ec2RequestEncoder.encode("IpPermissions", req.ipPermissions)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    UrlForm(("Action" -> "UpdateSecurityGroupRuleDescriptionsIngress") +: (groupNameParams ++ (groupIdParams ++ (dryRunParams ++ ipPermissionsParams))): _*)
  }
  implicit val ReservedInstancesModificationEc2Encoder: Ec2RequestEncoder[ReservedInstancesModification] = (fieldName: String, dto: ReservedInstancesModification) => {
    val clientTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "clientToken", dto.clientToken)
    val reservedInstancesModificationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesModificationId", dto.reservedInstancesModificationId)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val createDateParams = Ec2RequestEncoder.encode(fieldName + "." + "createDate", dto.createDate)
    val effectiveDateParams = Ec2RequestEncoder.encode(fieldName + "." + "effectiveDate", dto.effectiveDate)
    val updateDateParams = Ec2RequestEncoder.encode(fieldName + "." + "updateDate", dto.updateDate)
    val modificationResultSetParams = Ec2RequestEncoder.encode(fieldName + "." + "modificationResultSet", dto.modificationResultSet)
    val reservedInstancesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesSet", dto.reservedInstancesSet)
    reservedInstancesSetParams ++ (modificationResultSetParams ++ (updateDateParams ++ (effectiveDateParams ++ (createDateParams ++ (statusMessageParams ++ (statusParams ++ (reservedInstancesModificationIdParams ++ clientTokenParams)))))))
  }
  implicit def DescribeMovingAddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeMovingAddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val publicIpParams = Ec2RequestEncoder.encode("publicIp", req.publicIp)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeMovingAddresses") +: (dryRunParams ++ (maxResultsParams ++ (publicIpParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def DescribeEgressOnlyInternetGatewaysRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeEgressOnlyInternetGatewaysRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode("EgressOnlyInternetGatewayId", req.egressOnlyInternetGatewayId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeEgressOnlyInternetGateways") +: (nextTokenParams ++ (maxResultsParams ++ (egressOnlyInternetGatewayIdParams ++ dryRunParams))): _*)
  }
  implicit def EnableVpcClassicLinkRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, EnableVpcClassicLinkRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "EnableVpcClassicLink") +: (dryRunParams ++ vpcIdParams): _*)
  }
  implicit val VpcCidrBlockAssociationEc2Encoder: Ec2RequestEncoder[VpcCidrBlockAssociation] = (fieldName: String, dto: VpcCidrBlockAssociation) => {
    val associationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "associationId", dto.associationId)
    val cidrBlockParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlock", dto.cidrBlock)
    val cidrBlockStateParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrBlockState", dto.cidrBlockState)
    cidrBlockStateParams ++ (cidrBlockParams ++ associationIdParams)
  }
  implicit def DescribeTagsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeTagsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeTags") +: (nextTokenParams ++ (maxResultsParams ++ (filterParams ++ dryRunParams))): _*)
  }
  implicit def DisableVpcClassicLinkRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DisableVpcClassicLinkRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DisableVpcClassicLink") +: (dryRunParams ++ vpcIdParams): _*)
  }
  implicit def RequestSpotInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RequestSpotInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotPriceParams = Ec2RequestEncoder.encode("spotPrice", req.spotPrice)
    val typeParams = Ec2RequestEncoder.encode("type", req.`type`)
    val availabilityZoneGroupParams = Ec2RequestEncoder.encode("availabilityZoneGroup", req.availabilityZoneGroup)
    val clientTokenParams = Ec2RequestEncoder.encode("clientToken", req.clientToken)
    val launchGroupParams = Ec2RequestEncoder.encode("launchGroup", req.launchGroup)
    val launchSpecificationParams = Ec2RequestEncoder.encode("LaunchSpecification", req.launchSpecification)
    val instanceInterruptionBehaviorParams = Ec2RequestEncoder.encode("InstanceInterruptionBehavior", req.instanceInterruptionBehavior)
    val validFromParams = Ec2RequestEncoder.encode("validFrom", req.validFrom)
    val validUntilParams = Ec2RequestEncoder.encode("validUntil", req.validUntil)
    val blockDurationMinutesParams = Ec2RequestEncoder.encode("blockDurationMinutes", req.blockDurationMinutes)
    val instanceCountParams = Ec2RequestEncoder.encode("instanceCount", req.instanceCount)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RequestSpotInstances") +: (dryRunParams ++ (instanceCountParams ++ (blockDurationMinutesParams ++ (validUntilParams ++ (validFromParams ++ (instanceInterruptionBehaviorParams ++ (launchSpecificationParams ++ (launchGroupParams ++ (clientTokenParams ++ (availabilityZoneGroupParams ++ (typeParams ++ spotPriceParams))))))))))): _*)
  }
  implicit val ReservedInstanceLimitPriceEc2Encoder: Ec2RequestEncoder[ReservedInstanceLimitPrice] = (fieldName: String, dto: ReservedInstanceLimitPrice) => {
    val amountParams = Ec2RequestEncoder.encode(fieldName + "." + "amount", dto.amount)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    currencyCodeParams ++ amountParams
  }
  implicit def ResetNetworkInterfaceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ResetNetworkInterfaceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val sourceDestCheckParams = Ec2RequestEncoder.encode("sourceDestCheck", req.sourceDestCheck)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ResetNetworkInterfaceAttribute") +: (dryRunParams ++ (sourceDestCheckParams ++ networkInterfaceIdParams)): _*)
  }
  implicit def AllocateHostsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AllocateHostsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val availabilityZoneParams = Ec2RequestEncoder.encode("availabilityZone", req.availabilityZone)
    val instanceTypeParams = Ec2RequestEncoder.encode("instanceType", req.instanceType)
    val quantityParams = Ec2RequestEncoder.encode("quantity", req.quantity)
    val clientTokenParams = Ec2RequestEncoder.encode("clientToken", req.clientToken)
    val autoPlacementParams = Ec2RequestEncoder.encode("autoPlacement", req.autoPlacement)
    UrlForm(("Action" -> "AllocateHosts") +: (autoPlacementParams ++ (clientTokenParams ++ (quantityParams ++ (instanceTypeParams ++ availabilityZoneParams)))): _*)
  }
  implicit val ReservedInstancesOfferingEc2Encoder: Ec2RequestEncoder[ReservedInstancesOffering] = (fieldName: String, dto: ReservedInstancesOffering) => {
    val durationParams = Ec2RequestEncoder.encode(fieldName + "." + "duration", dto.duration)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val reservedInstancesOfferingIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesOfferingId", dto.reservedInstancesOfferingId)
    val offeringClassParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringClass", dto.offeringClass)
    val productDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "productDescription", dto.productDescription)
    val pricingDetailsSetParams = Ec2RequestEncoder.encode(fieldName + "." + "pricingDetailsSet", dto.pricingDetailsSet)
    val offeringTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringType", dto.offeringType)
    val recurringChargesParams = Ec2RequestEncoder.encode(fieldName + "." + "recurringCharges", dto.recurringCharges)
    val instanceTenancyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceTenancy", dto.instanceTenancy)
    val scopeParams = Ec2RequestEncoder.encode(fieldName + "." + "scope", dto.scope)
    val marketplaceParams = Ec2RequestEncoder.encode(fieldName + "." + "marketplace", dto.marketplace)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    val fixedPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "fixedPrice", dto.fixedPrice)
    val usagePriceParams = Ec2RequestEncoder.encode(fieldName + "." + "usagePrice", dto.usagePrice)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (usagePriceParams ++ (fixedPriceParams ++ (currencyCodeParams ++ (marketplaceParams ++ (scopeParams ++ (instanceTenancyParams ++ (recurringChargesParams ++ (offeringTypeParams ++ (pricingDetailsSetParams ++ (productDescriptionParams ++ (offeringClassParams ++ (reservedInstancesOfferingIdParams ++ (availabilityZoneParams ++ durationParams)))))))))))))
  }
  implicit def DescribeAccountAttributesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeAccountAttributesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeNameParams = Ec2RequestEncoder.encode("attributeName", req.attributeName)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeAccountAttributes") +: (dryRunParams ++ attributeNameParams): _*)
  }
  implicit val LaunchPermissionEc2Encoder: Ec2RequestEncoder[LaunchPermission] = (fieldName: String, dto: LaunchPermission) => {
    val groupParams = Ec2RequestEncoder.encode(fieldName + "." + "group", dto.group)
    val userIdParams = Ec2RequestEncoder.encode(fieldName + "." + "userId", dto.userId)
    userIdParams ++ groupParams
  }
  implicit val ScheduledInstancesEbsEc2Encoder: Ec2RequestEncoder[ScheduledInstancesEbs] = (fieldName: String, dto: ScheduledInstancesEbs) => {
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "DeleteOnTermination", dto.deleteOnTermination)
    val encryptedParams = Ec2RequestEncoder.encode(fieldName + "." + "Encrypted", dto.encrypted)
    val iopsParams = Ec2RequestEncoder.encode(fieldName + "." + "Iops", dto.iops)
    val volumeSizeParams = Ec2RequestEncoder.encode(fieldName + "." + "VolumeSize", dto.volumeSize)
    val snapshotIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SnapshotId", dto.snapshotId)
    val volumeTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "VolumeType", dto.volumeType)
    volumeTypeParams ++ (snapshotIdParams ++ (volumeSizeParams ++ (iopsParams ++ (encryptedParams ++ deleteOnTerminationParams))))
  }
  implicit def AttachNetworkInterfaceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AttachNetworkInterfaceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val deviceIndexParams = Ec2RequestEncoder.encode("deviceIndex", req.deviceIndex)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AttachNetworkInterface") +: (dryRunParams ++ (networkInterfaceIdParams ++ (instanceIdParams ++ deviceIndexParams))): _*)
  }
  implicit val StaleIpPermissionEc2Encoder: Ec2RequestEncoder[StaleIpPermission] = (fieldName: String, dto: StaleIpPermission) => {
    val ipRangesParams = Ec2RequestEncoder.encode(fieldName + "." + "ipRanges", dto.ipRanges)
    val prefixListIdsParams = Ec2RequestEncoder.encode(fieldName + "." + "prefixListIds", dto.prefixListIds)
    val ipProtocolParams = Ec2RequestEncoder.encode(fieldName + "." + "ipProtocol", dto.ipProtocol)
    val groupsParams = Ec2RequestEncoder.encode(fieldName + "." + "groups", dto.groups)
    val fromPortParams = Ec2RequestEncoder.encode(fieldName + "." + "fromPort", dto.fromPort)
    val toPortParams = Ec2RequestEncoder.encode(fieldName + "." + "toPort", dto.toPort)
    toPortParams ++ (fromPortParams ++ (groupsParams ++ (ipProtocolParams ++ (prefixListIdsParams ++ ipRangesParams))))
  }
  implicit def DescribeScheduledInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeScheduledInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val slotStartTimeRangeParams = Ec2RequestEncoder.encode("SlotStartTimeRange", req.slotStartTimeRange)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val scheduledInstanceIdParams = Ec2RequestEncoder.encode("ScheduledInstanceId", req.scheduledInstanceId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeScheduledInstances") +: (dryRunParams ++ (scheduledInstanceIdParams ++ (maxResultsParams ++ (slotStartTimeRangeParams ++ (nextTokenParams ++ filterParams))))): _*)
  }
  implicit val InstanceIpv6AddressEc2Encoder: Ec2RequestEncoder[InstanceIpv6Address] = (fieldName: String, dto: InstanceIpv6Address) => {
    val ipv6AddressParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6Address", dto.ipv6Address)
    ipv6AddressParams
  }
  implicit val SpotPriceEc2Encoder: Ec2RequestEncoder[SpotPrice] = (fieldName: String, dto: SpotPrice) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val spotPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "spotPrice", dto.spotPrice)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val productDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "productDescription", dto.productDescription)
    val timestampParams = Ec2RequestEncoder.encode(fieldName + "." + "timestamp", dto.timestamp)
    timestampParams ++ (productDescriptionParams ++ (instanceTypeParams ++ (spotPriceParams ++ availabilityZoneParams)))
  }
  implicit def CopyImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CopyImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val nameParams = Ec2RequestEncoder.encode("Name", req.name)
    val sourceImageIdParams = Ec2RequestEncoder.encode("SourceImageId", req.sourceImageId)
    val sourceRegionParams = Ec2RequestEncoder.encode("SourceRegion", req.sourceRegion)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val kmsKeyIdParams = Ec2RequestEncoder.encode("kmsKeyId", req.kmsKeyId)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val encryptedParams = Ec2RequestEncoder.encode("encrypted", req.encrypted)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CopyImage") +: (dryRunParams ++ (encryptedParams ++ (descriptionParams ++ (kmsKeyIdParams ++ (clientTokenParams ++ (sourceRegionParams ++ (sourceImageIdParams ++ nameParams))))))): _*)
  }
  implicit val NatGatewayAddressEc2Encoder: Ec2RequestEncoder[NatGatewayAddress] = (fieldName: String, dto: NatGatewayAddress) => {
    val allocationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "allocationId", dto.allocationId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val privateIpParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIp", dto.privateIp)
    val publicIpParams = Ec2RequestEncoder.encode(fieldName + "." + "publicIp", dto.publicIp)
    publicIpParams ++ (privateIpParams ++ (networkInterfaceIdParams ++ allocationIdParams))
  }
  implicit def DescribeSnapshotAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSnapshotAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSnapshotAttribute") +: (dryRunParams ++ (snapshotIdParams ++ attributeParams)): _*)
  }
  implicit def DescribeVpcClassicLinkDnsSupportRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcClassicLinkDnsSupportRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val vpcIdsParams = Ec2RequestEncoder.encode("VpcIds", req.vpcIds)
    UrlForm(("Action" -> "DescribeVpcClassicLinkDnsSupport") +: (vpcIdsParams ++ (nextTokenParams ++ maxResultsParams)): _*)
  }
  implicit val ImageDiskContainerEc2Encoder: Ec2RequestEncoder[ImageDiskContainer] = (fieldName: String, dto: ImageDiskContainer) => {
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "Format", dto.format)
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "DeviceName", dto.deviceName)
    val urlParams = Ec2RequestEncoder.encode(fieldName + "." + "Url", dto.url)
    val snapshotIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SnapshotId", dto.snapshotId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "Description", dto.description)
    val userBucketParams = Ec2RequestEncoder.encode(fieldName + "." + "UserBucket", dto.userBucket)
    userBucketParams ++ (descriptionParams ++ (snapshotIdParams ++ (urlParams ++ (deviceNameParams ++ formatParams))))
  }
  implicit def CreateFlowLogsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateFlowLogsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val deliverLogsPermissionArnParams = Ec2RequestEncoder.encode("DeliverLogsPermissionArn", req.deliverLogsPermissionArn)
    val logGroupNameParams = Ec2RequestEncoder.encode("LogGroupName", req.logGroupName)
    val resourceIdParams = Ec2RequestEncoder.encode("ResourceId", req.resourceId)
    val resourceTypeParams = Ec2RequestEncoder.encode("ResourceType", req.resourceType)
    val trafficTypeParams = Ec2RequestEncoder.encode("TrafficType", req.trafficType)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    UrlForm(("Action" -> "CreateFlowLogs") +: (clientTokenParams ++ (trafficTypeParams ++ (resourceTypeParams ++ (resourceIdParams ++ (logGroupNameParams ++ deliverLogsPermissionArnParams))))): _*)
  }
  implicit val HostReservationEc2Encoder: Ec2RequestEncoder[HostReservation] = (fieldName: String, dto: HostReservation) => {
    val paymentOptionParams = Ec2RequestEncoder.encode(fieldName + "." + "paymentOption", dto.paymentOption)
    val hostIdSetParams = Ec2RequestEncoder.encode(fieldName + "." + "hostIdSet", dto.hostIdSet)
    val offeringIdParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringId", dto.offeringId)
    val hostReservationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "hostReservationId", dto.hostReservationId)
    val instanceFamilyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceFamily", dto.instanceFamily)
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val upfrontPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "upfrontPrice", dto.upfrontPrice)
    val endParams = Ec2RequestEncoder.encode(fieldName + "." + "end", dto.end)
    val startParams = Ec2RequestEncoder.encode(fieldName + "." + "start", dto.start)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val countParams = Ec2RequestEncoder.encode(fieldName + "." + "count", dto.count)
    val durationParams = Ec2RequestEncoder.encode(fieldName + "." + "duration", dto.duration)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    currencyCodeParams ++ (durationParams ++ (countParams ++ (stateParams ++ (startParams ++ (endParams ++ (upfrontPriceParams ++ (hourlyPriceParams ++ (instanceFamilyParams ++ (hostReservationIdParams ++ (offeringIdParams ++ (hostIdSetParams ++ paymentOptionParams)))))))))))
  }
  implicit def DescribeSpotDatafeedSubscriptionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotDatafeedSubscriptionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSpotDatafeedSubscription") +: dryRunParams: _*)
  }
  implicit def RegisterImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RegisterImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val nameParams = Ec2RequestEncoder.encode("name", req.name)
    val architectureParams = Ec2RequestEncoder.encode("architecture", req.architecture)
    val rootDeviceNameParams = Ec2RequestEncoder.encode("rootDeviceName", req.rootDeviceName)
    val ramdiskIdParams = Ec2RequestEncoder.encode("ramdiskId", req.ramdiskId)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val imageLocationParams = Ec2RequestEncoder.encode("ImageLocation", req.imageLocation)
    val kernelIdParams = Ec2RequestEncoder.encode("kernelId", req.kernelId)
    val virtualizationTypeParams = Ec2RequestEncoder.encode("virtualizationType", req.virtualizationType)
    val sriovNetSupportParams = Ec2RequestEncoder.encode("sriovNetSupport", req.sriovNetSupport)
    val billingProductParams = Ec2RequestEncoder.encode("BillingProduct", req.billingProduct)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val enaSupportParams = Ec2RequestEncoder.encode("enaSupport", req.enaSupport)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode("BlockDeviceMapping", req.blockDeviceMapping)
    UrlForm(("Action" -> "RegisterImage") +: (blockDeviceMappingParams ++ (enaSupportParams ++ (dryRunParams ++ (billingProductParams ++ (sriovNetSupportParams ++ (virtualizationTypeParams ++ (kernelIdParams ++ (imageLocationParams ++ (descriptionParams ++ (ramdiskIdParams ++ (rootDeviceNameParams ++ (architectureParams ++ nameParams)))))))))))): _*)
  }
  implicit val NetworkInterfacePrivateIpAddressEc2Encoder: Ec2RequestEncoder[NetworkInterfacePrivateIpAddress] = (fieldName: String, dto: NetworkInterfacePrivateIpAddress) => {
    val associationParams = Ec2RequestEncoder.encode(fieldName + "." + "association", dto.association)
    val primaryParams = Ec2RequestEncoder.encode(fieldName + "." + "primary", dto.primary)
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    privateIpAddressParams ++ (privateDnsNameParams ++ (primaryParams ++ associationParams))
  }
  implicit def StopInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, StopInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val forceParams = Ec2RequestEncoder.encode("force", req.force)
    UrlForm(("Action" -> "StopInstances") +: (forceParams ++ (dryRunParams ++ instanceIdParams)): _*)
  }
  implicit def AcceptReservedInstancesExchangeQuoteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AcceptReservedInstancesExchangeQuoteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val reservedInstanceIdParams = Ec2RequestEncoder.encode("ReservedInstanceId", req.reservedInstanceId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val targetConfigurationParams = Ec2RequestEncoder.encode("TargetConfiguration", req.targetConfiguration)
    UrlForm(("Action" -> "AcceptReservedInstancesExchangeQuote") +: (targetConfigurationParams ++ (dryRunParams ++ reservedInstanceIdParams)): _*)
  }
  implicit val InstanceBlockDeviceMappingEc2Encoder: Ec2RequestEncoder[InstanceBlockDeviceMapping] = (fieldName: String, dto: InstanceBlockDeviceMapping) => {
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceName", dto.deviceName)
    val ebsParams = Ec2RequestEncoder.encode(fieldName + "." + "ebs", dto.ebs)
    ebsParams ++ deviceNameParams
  }
  implicit val ScheduledInstanceAvailabilityEc2Encoder: Ec2RequestEncoder[ScheduledInstanceAvailability] = (fieldName: String, dto: ScheduledInstanceAvailability) => {
    val networkPlatformParams = Ec2RequestEncoder.encode(fieldName + "." + "networkPlatform", dto.networkPlatform)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val purchaseTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "purchaseToken", dto.purchaseToken)
    val availableInstanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "availableInstanceCount", dto.availableInstanceCount)
    val minTermDurationInDaysParams = Ec2RequestEncoder.encode(fieldName + "." + "minTermDurationInDays", dto.minTermDurationInDays)
    val maxTermDurationInDaysParams = Ec2RequestEncoder.encode(fieldName + "." + "maxTermDurationInDays", dto.maxTermDurationInDays)
    val totalScheduledInstanceHoursParams = Ec2RequestEncoder.encode(fieldName + "." + "totalScheduledInstanceHours", dto.totalScheduledInstanceHours)
    val slotDurationInHoursParams = Ec2RequestEncoder.encode(fieldName + "." + "slotDurationInHours", dto.slotDurationInHours)
    val firstSlotStartTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "firstSlotStartTime", dto.firstSlotStartTime)
    val recurrenceParams = Ec2RequestEncoder.encode(fieldName + "." + "recurrence", dto.recurrence)
    recurrenceParams ++ (firstSlotStartTimeParams ++ (slotDurationInHoursParams ++ (totalScheduledInstanceHoursParams ++ (maxTermDurationInDaysParams ++ (minTermDurationInDaysParams ++ (availableInstanceCountParams ++ (purchaseTokenParams ++ (hourlyPriceParams ++ (availabilityZoneParams ++ (instanceTypeParams ++ (platformParams ++ networkPlatformParams)))))))))))
  }
  implicit val PortRangeEc2Encoder: Ec2RequestEncoder[PortRange] = (fieldName: String, dto: PortRange) => {
    val fromParams = Ec2RequestEncoder.encode(fieldName + "." + "from", dto.from)
    val toParams = Ec2RequestEncoder.encode(fieldName + "." + "to", dto.to)
    toParams ++ fromParams
  }
  implicit val InternetGatewayAttachmentEc2Encoder: Ec2RequestEncoder[InternetGatewayAttachment] = (fieldName: String, dto: InternetGatewayAttachment) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    vpcIdParams ++ stateParams
  }
  implicit val VolumeStatusActionEc2Encoder: Ec2RequestEncoder[VolumeStatusAction] = (fieldName: String, dto: VolumeStatusAction) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val eventIdParams = Ec2RequestEncoder.encode(fieldName + "." + "eventId", dto.eventId)
    val eventTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "eventType", dto.eventType)
    eventTypeParams ++ (eventIdParams ++ (descriptionParams ++ codeParams))
  }
  implicit def AllocateAddressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AllocateAddressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val domainParams = Ec2RequestEncoder.encode("Domain", req.domain)
    val addressParams = Ec2RequestEncoder.encode("Address", req.address)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AllocateAddress") +: (dryRunParams ++ (addressParams ++ domainParams)): _*)
  }
  implicit val InstanceStatusSummaryEc2Encoder: Ec2RequestEncoder[InstanceStatusSummary] = (fieldName: String, dto: InstanceStatusSummary) => {
    val detailsParams = Ec2RequestEncoder.encode(fieldName + "." + "details", dto.details)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ detailsParams
  }
  implicit val NetworkInterfaceAttachmentEc2Encoder: Ec2RequestEncoder[NetworkInterfaceAttachment] = (fieldName: String, dto: NetworkInterfaceAttachment) => {
    val attachmentIdParams = Ec2RequestEncoder.encode(fieldName + "." + "attachmentId", dto.attachmentId)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val instanceOwnerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceOwnerId", dto.instanceOwnerId)
    val attachTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "attachTime", dto.attachTime)
    val deviceIndexParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceIndex", dto.deviceIndex)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ (deleteOnTerminationParams ++ (deviceIndexParams ++ (attachTimeParams ++ (instanceOwnerIdParams ++ (instanceIdParams ++ attachmentIdParams)))))
  }
  implicit def DeleteTagsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteTagsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val resourceIdParams = Ec2RequestEncoder.encode("resourceId", req.resourceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val tagParams = Ec2RequestEncoder.encode("tag", req.tag)
    UrlForm(("Action" -> "DeleteTags") +: (tagParams ++ (dryRunParams ++ resourceIdParams)): _*)
  }
  implicit def CreateReservedInstancesListingRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateReservedInstancesListingRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val clientTokenParams = Ec2RequestEncoder.encode("clientToken", req.clientToken)
    val reservedInstancesIdParams = Ec2RequestEncoder.encode("reservedInstancesId", req.reservedInstancesId)
    val instanceCountParams = Ec2RequestEncoder.encode("instanceCount", req.instanceCount)
    val priceSchedulesParams = Ec2RequestEncoder.encode("priceSchedules", req.priceSchedules)
    UrlForm(("Action" -> "CreateReservedInstancesListing") +: (priceSchedulesParams ++ (instanceCountParams ++ (reservedInstancesIdParams ++ clientTokenParams))): _*)
  }
  implicit val ClassicLinkInstanceEc2Encoder: Ec2RequestEncoder[ClassicLinkInstance] = (fieldName: String, dto: ClassicLinkInstance) => {
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    tagSetParams ++ (vpcIdParams ++ (instanceIdParams ++ groupSetParams))
  }
  implicit def ReplaceRouteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReplaceRouteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val natGatewayIdParams = Ec2RequestEncoder.encode("natGatewayId", req.natGatewayId)
    val egressOnlyInternetGatewayIdParams = Ec2RequestEncoder.encode("egressOnlyInternetGatewayId", req.egressOnlyInternetGatewayId)
    val destinationIpv6CidrBlockParams = Ec2RequestEncoder.encode("destinationIpv6CidrBlock", req.destinationIpv6CidrBlock)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("vpcPeeringConnectionId", req.vpcPeeringConnectionId)
    val destinationCidrBlockParams = Ec2RequestEncoder.encode("destinationCidrBlock", req.destinationCidrBlock)
    val gatewayIdParams = Ec2RequestEncoder.encode("gatewayId", req.gatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReplaceRoute") +: (dryRunParams ++ (gatewayIdParams ++ (destinationCidrBlockParams ++ (vpcPeeringConnectionIdParams ++ (instanceIdParams ++ (destinationIpv6CidrBlockParams ++ (egressOnlyInternetGatewayIdParams ++ (natGatewayIdParams ++ (networkInterfaceIdParams ++ routeTableIdParams))))))))): _*)
  }
  implicit val VpcClassicLinkEc2Encoder: Ec2RequestEncoder[VpcClassicLink] = (fieldName: String, dto: VpcClassicLink) => {
    val classicLinkEnabledParams = Ec2RequestEncoder.encode(fieldName + "." + "classicLinkEnabled", dto.classicLinkEnabled)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    vpcIdParams ++ (tagSetParams ++ classicLinkEnabledParams)
  }
  implicit def GetReservedInstancesExchangeQuoteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, GetReservedInstancesExchangeQuoteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val reservedInstanceIdParams = Ec2RequestEncoder.encode("ReservedInstanceId", req.reservedInstanceId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val targetConfigurationParams = Ec2RequestEncoder.encode("TargetConfiguration", req.targetConfiguration)
    UrlForm(("Action" -> "GetReservedInstancesExchangeQuote") +: (targetConfigurationParams ++ (dryRunParams ++ reservedInstanceIdParams)): _*)
  }
  implicit def DeleteSpotDatafeedSubscriptionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteSpotDatafeedSubscriptionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteSpotDatafeedSubscription") +: dryRunParams: _*)
  }
  implicit def AttachInternetGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AttachInternetGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val internetGatewayIdParams = Ec2RequestEncoder.encode("internetGatewayId", req.internetGatewayId)
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AttachInternetGateway") +: (dryRunParams ++ (vpcIdParams ++ internetGatewayIdParams)): _*)
  }
  implicit val TagDescriptionEc2Encoder: Ec2RequestEncoder[TagDescription] = (fieldName: String, dto: TagDescription) => {
    val keyParams = Ec2RequestEncoder.encode(fieldName + "." + "key", dto.key)
    val resourceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceId", dto.resourceId)
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "value", dto.value)
    val resourceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceType", dto.resourceType)
    resourceTypeParams ++ (valueParams ++ (resourceIdParams ++ keyParams))
  }
  implicit def CreateDhcpOptionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateDhcpOptionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dhcpConfigurationParams = Ec2RequestEncoder.encode("dhcpConfiguration", req.dhcpConfiguration)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateDhcpOptions") +: (dryRunParams ++ dhcpConfigurationParams): _*)
  }
  implicit val StorageLocationEc2Encoder: Ec2RequestEncoder[StorageLocation] = (fieldName: String, dto: StorageLocation) => {
    val bucketParams = Ec2RequestEncoder.encode(fieldName + "." + "Bucket", dto.bucket)
    val keyParams = Ec2RequestEncoder.encode(fieldName + "." + "Key", dto.key)
    keyParams ++ bucketParams
  }
  implicit def DescribeFpgaImageAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeFpgaImageAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val fpgaImageIdParams = Ec2RequestEncoder.encode("FpgaImageId", req.fpgaImageId)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeFpgaImageAttribute") +: (dryRunParams ++ (attributeParams ++ fpgaImageIdParams)): _*)
  }
  implicit val ImportVolumeTaskDetailsEc2Encoder: Ec2RequestEncoder[ImportVolumeTaskDetails] = (fieldName: String, dto: ImportVolumeTaskDetails) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val bytesConvertedParams = Ec2RequestEncoder.encode(fieldName + "." + "bytesConverted", dto.bytesConverted)
    val imageParams = Ec2RequestEncoder.encode(fieldName + "." + "image", dto.image)
    val volumeParams = Ec2RequestEncoder.encode(fieldName + "." + "volume", dto.volume)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    descriptionParams ++ (volumeParams ++ (imageParams ++ (bytesConvertedParams ++ availabilityZoneParams)))
  }
  implicit def ImportSnapshotRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ImportSnapshotRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val clientDataParams = Ec2RequestEncoder.encode("ClientData", req.clientData)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val descriptionParams = Ec2RequestEncoder.encode("Description", req.description)
    val roleNameParams = Ec2RequestEncoder.encode("RoleName", req.roleName)
    val diskContainerParams = Ec2RequestEncoder.encode("DiskContainer", req.diskContainer)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "ImportSnapshot") +: (dryRunParams ++ (diskContainerParams ++ (roleNameParams ++ (descriptionParams ++ (clientTokenParams ++ clientDataParams))))): _*)
  }
  implicit def RunScheduledInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RunScheduledInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val launchSpecificationParams = Ec2RequestEncoder.encode("LaunchSpecification", req.launchSpecification)
    val scheduledInstanceIdParams = Ec2RequestEncoder.encode("ScheduledInstanceId", req.scheduledInstanceId)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val instanceCountParams = Ec2RequestEncoder.encode("InstanceCount", req.instanceCount)
    UrlForm(("Action" -> "RunScheduledInstances") +: (instanceCountParams ++ (dryRunParams ++ (clientTokenParams ++ (scheduledInstanceIdParams ++ launchSpecificationParams)))): _*)
  }
  implicit val StaleSecurityGroupEc2Encoder: Ec2RequestEncoder[StaleSecurityGroup] = (fieldName: String, dto: StaleSecurityGroup) => {
    val groupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "groupId", dto.groupId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val staleIpPermissionsParams = Ec2RequestEncoder.encode(fieldName + "." + "staleIpPermissions", dto.staleIpPermissions)
    val staleIpPermissionsEgressParams = Ec2RequestEncoder.encode(fieldName + "." + "staleIpPermissionsEgress", dto.staleIpPermissionsEgress)
    staleIpPermissionsEgressParams ++ (staleIpPermissionsParams ++ (vpcIdParams ++ (groupNameParams ++ (descriptionParams ++ groupIdParams))))
  }
  implicit def DetachVpnGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DetachVpnGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode("VpnGatewayId", req.vpnGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DetachVpnGateway") +: (dryRunParams ++ (vpnGatewayIdParams ++ vpcIdParams)): _*)
  }
  implicit def DescribeVpcPeeringConnectionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcPeeringConnectionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("VpcPeeringConnectionId", req.vpcPeeringConnectionId)
    UrlForm(("Action" -> "DescribeVpcPeeringConnections") +: (vpcPeeringConnectionIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val VpnConnectionEc2Encoder: Ec2RequestEncoder[VpnConnection] = (fieldName: String, dto: VpnConnection) => {
    val customerGatewayConfigurationParams = Ec2RequestEncoder.encode(fieldName + "." + "customerGatewayConfiguration", dto.customerGatewayConfiguration)
    val customerGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "customerGatewayId", dto.customerGatewayId)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpnGatewayId", dto.vpnGatewayId)
    val vpnConnectionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpnConnectionId", dto.vpnConnectionId)
    val categoryParams = Ec2RequestEncoder.encode(fieldName + "." + "category", dto.category)
    val vgwTelemetryParams = Ec2RequestEncoder.encode(fieldName + "." + "vgwTelemetry", dto.vgwTelemetry)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val optionsParams = Ec2RequestEncoder.encode(fieldName + "." + "options", dto.options)
    val typeParams = Ec2RequestEncoder.encode(fieldName + "." + "type", dto.`type`)
    val routesParams = Ec2RequestEncoder.encode(fieldName + "." + "routes", dto.routes)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (routesParams ++ (typeParams ++ (optionsParams ++ (tagSetParams ++ (vgwTelemetryParams ++ (categoryParams ++ (vpnConnectionIdParams ++ (vpnGatewayIdParams ++ (customerGatewayIdParams ++ customerGatewayConfigurationParams)))))))))
  }
  implicit def DescribeInternetGatewaysRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeInternetGatewaysRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val internetGatewayIdParams = Ec2RequestEncoder.encode("internetGatewayId", req.internetGatewayId)
    UrlForm(("Action" -> "DescribeInternetGateways") +: (internetGatewayIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit def ModifyHostsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyHostsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val autoPlacementParams = Ec2RequestEncoder.encode("autoPlacement", req.autoPlacement)
    val hostIdParams = Ec2RequestEncoder.encode("hostId", req.hostId)
    UrlForm(("Action" -> "ModifyHosts") +: (hostIdParams ++ autoPlacementParams): _*)
  }
  implicit def BundleInstanceRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, BundleInstanceRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val storageParams = Ec2RequestEncoder.encode("Storage", req.storage)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "BundleInstance") +: (dryRunParams ++ (storageParams ++ instanceIdParams)): _*)
  }
  implicit def DescribeSpotFleetInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSpotFleetInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode("spotFleetRequestId", req.spotFleetRequestId)
    val nextTokenParams = Ec2RequestEncoder.encode("nextToken", req.nextToken)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val maxResultsParams = Ec2RequestEncoder.encode("maxResults", req.maxResults)
    UrlForm(("Action" -> "DescribeSpotFleetInstances") +: (maxResultsParams ++ (dryRunParams ++ (nextTokenParams ++ spotFleetRequestIdParams))): _*)
  }
  implicit def AttachVpnGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AttachVpnGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode("VpnGatewayId", req.vpnGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AttachVpnGateway") +: (dryRunParams ++ (vpnGatewayIdParams ++ vpcIdParams)): _*)
  }
  implicit def DescribeDhcpOptionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeDhcpOptionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dhcpOptionsIdParams = Ec2RequestEncoder.encode("DhcpOptionsId", req.dhcpOptionsId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeDhcpOptions") +: (dryRunParams ++ (filterParams ++ dhcpOptionsIdParams)): _*)
  }
  implicit val SpotPlacementEc2Encoder: Ec2RequestEncoder[SpotPlacement] = (fieldName: String, dto: SpotPlacement) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val tenancyParams = Ec2RequestEncoder.encode(fieldName + "." + "tenancy", dto.tenancy)
    tenancyParams ++ (groupNameParams ++ availabilityZoneParams)
  }
  implicit val PlacementGroupEc2Encoder: Ec2RequestEncoder[PlacementGroup] = (fieldName: String, dto: PlacementGroup) => {
    val groupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "groupName", dto.groupName)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val strategyParams = Ec2RequestEncoder.encode(fieldName + "." + "strategy", dto.strategy)
    strategyParams ++ (stateParams ++ groupNameParams)
  }
  implicit val NetworkInterfaceIpv6AddressEc2Encoder: Ec2RequestEncoder[NetworkInterfaceIpv6Address] = (fieldName: String, dto: NetworkInterfaceIpv6Address) => {
    val ipv6AddressParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6Address", dto.ipv6Address)
    ipv6AddressParams
  }
  implicit val IpPermissionEc2Encoder: Ec2RequestEncoder[IpPermission] = (fieldName: String, dto: IpPermission) => {
    val ipProtocolParams = Ec2RequestEncoder.encode(fieldName + "." + "ipProtocol", dto.ipProtocol)
    val prefixListIdsParams = Ec2RequestEncoder.encode(fieldName + "." + "prefixListIds", dto.prefixListIds)
    val ipv6RangesParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6Ranges", dto.ipv6Ranges)
    val ipRangesParams = Ec2RequestEncoder.encode(fieldName + "." + "ipRanges", dto.ipRanges)
    val fromPortParams = Ec2RequestEncoder.encode(fieldName + "." + "fromPort", dto.fromPort)
    val toPortParams = Ec2RequestEncoder.encode(fieldName + "." + "toPort", dto.toPort)
    val groupsParams = Ec2RequestEncoder.encode(fieldName + "." + "groups", dto.groups)
    groupsParams ++ (toPortParams ++ (fromPortParams ++ (ipRangesParams ++ (ipv6RangesParams ++ (prefixListIdsParams ++ ipProtocolParams)))))
  }
  implicit def ModifySubnetAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifySubnetAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val subnetIdParams = Ec2RequestEncoder.encode("subnetId", req.subnetId)
    val assignIpv6AddressOnCreationParams = Ec2RequestEncoder.encode("AssignIpv6AddressOnCreation", req.assignIpv6AddressOnCreation)
    val mapPublicIpOnLaunchParams = Ec2RequestEncoder.encode("MapPublicIpOnLaunch", req.mapPublicIpOnLaunch)
    UrlForm(("Action" -> "ModifySubnetAttribute") +: (mapPublicIpOnLaunchParams ++ (assignIpv6AddressOnCreationParams ++ subnetIdParams)): _*)
  }
  implicit def PurchaseScheduledInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, PurchaseScheduledInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val purchaseRequestParams = Ec2RequestEncoder.encode("PurchaseRequest", req.purchaseRequest)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "PurchaseScheduledInstances") +: (dryRunParams ++ (clientTokenParams ++ purchaseRequestParams)): _*)
  }
  implicit def CancelSpotFleetRequestsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelSpotFleetRequestsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode("spotFleetRequestId", req.spotFleetRequestId)
    val terminateInstancesParams = Ec2RequestEncoder.encode("terminateInstances", req.terminateInstances)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CancelSpotFleetRequests") +: (dryRunParams ++ (terminateInstancesParams ++ spotFleetRequestIdParams)): _*)
  }
  implicit def ReplaceIamInstanceProfileAssociationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReplaceIamInstanceProfileAssociationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val iamInstanceProfileParams = Ec2RequestEncoder.encode("IamInstanceProfile", req.iamInstanceProfile)
    val associationIdParams = Ec2RequestEncoder.encode("AssociationId", req.associationId)
    UrlForm(("Action" -> "ReplaceIamInstanceProfileAssociation") +: (associationIdParams ++ iamInstanceProfileParams): _*)
  }
  implicit val CancelSpotFleetRequestsErrorEc2Encoder: Ec2RequestEncoder[CancelSpotFleetRequestsError] = (fieldName: String, dto: CancelSpotFleetRequestsError) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val messageParams = Ec2RequestEncoder.encode(fieldName + "." + "message", dto.message)
    messageParams ++ codeParams
  }
  implicit val S3StorageEc2Encoder: Ec2RequestEncoder[S3Storage] = (fieldName: String, dto: S3Storage) => {
    val awsaccessKeyIdParams = Ec2RequestEncoder.encode(fieldName + "." + "AWSAccessKeyId", dto.awsaccessKeyId)
    val bucketParams = Ec2RequestEncoder.encode(fieldName + "." + "bucket", dto.bucket)
    val prefixParams = Ec2RequestEncoder.encode(fieldName + "." + "prefix", dto.prefix)
    val uploadPolicySignatureParams = Ec2RequestEncoder.encode(fieldName + "." + "uploadPolicySignature", dto.uploadPolicySignature)
    val uploadPolicyParams = Ec2RequestEncoder.encode(fieldName + "." + "uploadPolicy", dto.uploadPolicy)
    uploadPolicyParams ++ (uploadPolicySignatureParams ++ (prefixParams ++ (bucketParams ++ awsaccessKeyIdParams)))
  }
  implicit val ElasticGpuAssociationEc2Encoder: Ec2RequestEncoder[ElasticGpuAssociation] = (fieldName: String, dto: ElasticGpuAssociation) => {
    val elasticGpuIdParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuId", dto.elasticGpuId)
    val elasticGpuAssociationIdParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuAssociationId", dto.elasticGpuAssociationId)
    val elasticGpuAssociationStateParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuAssociationState", dto.elasticGpuAssociationState)
    val elasticGpuAssociationTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "elasticGpuAssociationTime", dto.elasticGpuAssociationTime)
    elasticGpuAssociationTimeParams ++ (elasticGpuAssociationStateParams ++ (elasticGpuAssociationIdParams ++ elasticGpuIdParams))
  }
  implicit def ResetInstanceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ResetInstanceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("attribute", req.attribute)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ResetInstanceAttribute") +: (dryRunParams ++ (instanceIdParams ++ attributeParams)): _*)
  }
  implicit def DescribeCustomerGatewaysRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeCustomerGatewaysRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val customerGatewayIdParams = Ec2RequestEncoder.encode("CustomerGatewayId", req.customerGatewayId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeCustomerGateways") +: (dryRunParams ++ (filterParams ++ customerGatewayIdParams)): _*)
  }
  implicit def RejectVpcPeeringConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RejectVpcPeeringConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("vpcPeeringConnectionId", req.vpcPeeringConnectionId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RejectVpcPeeringConnection") +: (dryRunParams ++ vpcPeeringConnectionIdParams): _*)
  }
  implicit def CancelExportTaskRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelExportTaskRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val exportTaskIdParams = Ec2RequestEncoder.encode("exportTaskId", req.exportTaskId)
    UrlForm(("Action" -> "CancelExportTask") +: exportTaskIdParams: _*)
  }
  implicit val PrefixListEc2Encoder: Ec2RequestEncoder[PrefixList] = (fieldName: String, dto: PrefixList) => {
    val cidrSetParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrSet", dto.cidrSet)
    val prefixListIdParams = Ec2RequestEncoder.encode(fieldName + "." + "prefixListId", dto.prefixListId)
    val prefixListNameParams = Ec2RequestEncoder.encode(fieldName + "." + "prefixListName", dto.prefixListName)
    prefixListNameParams ++ (prefixListIdParams ++ cidrSetParams)
  }
  implicit val ScheduledInstancesBlockDeviceMappingEc2Encoder: Ec2RequestEncoder[ScheduledInstancesBlockDeviceMapping] = (fieldName: String, dto: ScheduledInstancesBlockDeviceMapping) => {
    val deviceNameParams = Ec2RequestEncoder.encode(fieldName + "." + "DeviceName", dto.deviceName)
    val noDeviceParams = Ec2RequestEncoder.encode(fieldName + "." + "NoDevice", dto.noDevice)
    val virtualNameParams = Ec2RequestEncoder.encode(fieldName + "." + "VirtualName", dto.virtualName)
    val ebsParams = Ec2RequestEncoder.encode(fieldName + "." + "Ebs", dto.ebs)
    ebsParams ++ (virtualNameParams ++ (noDeviceParams ++ deviceNameParams))
  }
  implicit val HostPropertiesEc2Encoder: Ec2RequestEncoder[HostProperties] = (fieldName: String, dto: HostProperties) => {
    val coresParams = Ec2RequestEncoder.encode(fieldName + "." + "cores", dto.cores)
    val socketsParams = Ec2RequestEncoder.encode(fieldName + "." + "sockets", dto.sockets)
    val totalVCpusParams = Ec2RequestEncoder.encode(fieldName + "." + "totalVCpus", dto.totalVCpus)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (totalVCpusParams ++ (socketsParams ++ coresParams))
  }
  implicit val InstanceStateChangeEc2Encoder: Ec2RequestEncoder[InstanceStateChange] = (fieldName: String, dto: InstanceStateChange) => {
    val currentStateParams = Ec2RequestEncoder.encode(fieldName + "." + "currentState", dto.currentState)
    val previousStateParams = Ec2RequestEncoder.encode(fieldName + "." + "previousState", dto.previousState)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    instanceIdParams ++ (previousStateParams ++ currentStateParams)
  }
  implicit def CreateRouteTableRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateRouteTableRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateRouteTable") +: (dryRunParams ++ vpcIdParams): _*)
  }
  implicit val IpRangeEc2Encoder: Ec2RequestEncoder[IpRange] = (fieldName: String, dto: IpRange) => {
    val cidrIpParams = Ec2RequestEncoder.encode(fieldName + "." + "cidrIp", dto.cidrIp)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    descriptionParams ++ cidrIpParams
  }
  implicit val DiskImageDescriptionEc2Encoder: Ec2RequestEncoder[DiskImageDescription] = (fieldName: String, dto: DiskImageDescription) => {
    val formatParams = Ec2RequestEncoder.encode(fieldName + "." + "format", dto.format)
    val importManifestUrlParams = Ec2RequestEncoder.encode(fieldName + "." + "importManifestUrl", dto.importManifestUrl)
    val sizeParams = Ec2RequestEncoder.encode(fieldName + "." + "size", dto.size)
    val checksumParams = Ec2RequestEncoder.encode(fieldName + "." + "checksum", dto.checksum)
    checksumParams ++ (sizeParams ++ (importManifestUrlParams ++ formatParams))
  }
  implicit val SpotFleetTagSpecificationEc2Encoder: Ec2RequestEncoder[SpotFleetTagSpecification] = (fieldName: String, dto: SpotFleetTagSpecification) => {
    val resourceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceType", dto.resourceType)
    val tagParams = Ec2RequestEncoder.encode(fieldName + "." + "tag", dto.tag)
    tagParams ++ resourceTypeParams
  }
  implicit def DescribeHostReservationsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeHostReservationsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val hostReservationIdSetParams = Ec2RequestEncoder.encode("HostReservationIdSet", req.hostReservationIdSet)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeHostReservations") +: (nextTokenParams ++ (maxResultsParams ++ (hostReservationIdSetParams ++ filterParams))): _*)
  }
  implicit def ModifyInstanceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyInstanceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val attributeParams = Ec2RequestEncoder.encode("attribute", req.attribute)
    val valueParams = Ec2RequestEncoder.encode("value", req.value)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val sriovNetSupportParams = Ec2RequestEncoder.encode("sriovNetSupport", req.sriovNetSupport)
    val instanceTypeParams = Ec2RequestEncoder.encode("instanceType", req.instanceType)
    val instanceInitiatedShutdownBehaviorParams = Ec2RequestEncoder.encode("instanceInitiatedShutdownBehavior", req.instanceInitiatedShutdownBehavior)
    val kernelParams = Ec2RequestEncoder.encode("kernel", req.kernel)
    val ramdiskParams = Ec2RequestEncoder.encode("ramdisk", req.ramdisk)
    val userDataParams = Ec2RequestEncoder.encode("userData", req.userData)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode("blockDeviceMapping", req.blockDeviceMapping)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val sourceDestCheckParams = Ec2RequestEncoder.encode("SourceDestCheck", req.sourceDestCheck)
    val disableApiTerminationParams = Ec2RequestEncoder.encode("disableApiTermination", req.disableApiTermination)
    val ebsOptimizedParams = Ec2RequestEncoder.encode("ebsOptimized", req.ebsOptimized)
    val enaSupportParams = Ec2RequestEncoder.encode("enaSupport", req.enaSupport)
    UrlForm(("Action" -> "ModifyInstanceAttribute") +: (enaSupportParams ++ (ebsOptimizedParams ++ (disableApiTerminationParams ++ (sourceDestCheckParams ++ (dryRunParams ++ (blockDeviceMappingParams ++ (userDataParams ++ (ramdiskParams ++ (kernelParams ++ (instanceInitiatedShutdownBehaviorParams ++ (instanceTypeParams ++ (sriovNetSupportParams ++ (groupIdParams ++ (valueParams ++ (attributeParams ++ instanceIdParams))))))))))))))): _*)
  }
  implicit val ReservedInstancesEc2Encoder: Ec2RequestEncoder[ReservedInstances] = (fieldName: String, dto: ReservedInstances) => {
    val durationParams = Ec2RequestEncoder.encode(fieldName + "." + "duration", dto.duration)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val reservedInstancesIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesId", dto.reservedInstancesId)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val offeringClassParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringClass", dto.offeringClass)
    val productDescriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "productDescription", dto.productDescription)
    val endParams = Ec2RequestEncoder.encode(fieldName + "." + "end", dto.end)
    val startParams = Ec2RequestEncoder.encode(fieldName + "." + "start", dto.start)
    val offeringTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "offeringType", dto.offeringType)
    val recurringChargesParams = Ec2RequestEncoder.encode(fieldName + "." + "recurringCharges", dto.recurringCharges)
    val instanceTenancyParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceTenancy", dto.instanceTenancy)
    val scopeParams = Ec2RequestEncoder.encode(fieldName + "." + "scope", dto.scope)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCount", dto.instanceCount)
    val currencyCodeParams = Ec2RequestEncoder.encode(fieldName + "." + "currencyCode", dto.currencyCode)
    val fixedPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "fixedPrice", dto.fixedPrice)
    val usagePriceParams = Ec2RequestEncoder.encode(fieldName + "." + "usagePrice", dto.usagePrice)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (usagePriceParams ++ (fixedPriceParams ++ (currencyCodeParams ++ (instanceCountParams ++ (stateParams ++ (scopeParams ++ (instanceTenancyParams ++ (recurringChargesParams ++ (offeringTypeParams ++ (startParams ++ (endParams ++ (productDescriptionParams ++ (offeringClassParams ++ (tagSetParams ++ (reservedInstancesIdParams ++ (availabilityZoneParams ++ durationParams))))))))))))))))
  }
  implicit val DhcpOptionsEc2Encoder: Ec2RequestEncoder[DhcpOptions] = (fieldName: String, dto: DhcpOptions) => {
    val dhcpConfigurationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "dhcpConfigurationSet", dto.dhcpConfigurationSet)
    val dhcpOptionsIdParams = Ec2RequestEncoder.encode(fieldName + "." + "dhcpOptionsId", dto.dhcpOptionsId)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    tagSetParams ++ (dhcpOptionsIdParams ++ dhcpConfigurationSetParams)
  }
  implicit def DescribeStaleSecurityGroupsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeStaleSecurityGroupsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeStaleSecurityGroups") +: (nextTokenParams ++ (maxResultsParams ++ (dryRunParams ++ vpcIdParams))): _*)
  }
  implicit val MonitoringEc2Encoder: Ec2RequestEncoder[Monitoring] = (fieldName: String, dto: Monitoring) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams
  }
  implicit def AssignIpv6AddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssignIpv6AddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val ipv6AddressCountParams = Ec2RequestEncoder.encode("ipv6AddressCount", req.ipv6AddressCount)
    val ipv6AddressesParams = Ec2RequestEncoder.encode("ipv6Addresses", req.ipv6Addresses)
    UrlForm(("Action" -> "AssignIpv6Addresses") +: (ipv6AddressesParams ++ (ipv6AddressCountParams ++ networkInterfaceIdParams)): _*)
  }
  implicit val EbsInstanceBlockDeviceSpecificationEc2Encoder: Ec2RequestEncoder[EbsInstanceBlockDeviceSpecification] = (fieldName: String, dto: EbsInstanceBlockDeviceSpecification) => {
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    val volumeIdParams = Ec2RequestEncoder.encode(fieldName + "." + "volumeId", dto.volumeId)
    volumeIdParams ++ deleteOnTerminationParams
  }
  implicit val BundleTaskEc2Encoder: Ec2RequestEncoder[BundleTask] = (fieldName: String, dto: BundleTask) => {
    val bundleIdParams = Ec2RequestEncoder.encode(fieldName + "." + "bundleId", dto.bundleId)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val progressParams = Ec2RequestEncoder.encode(fieldName + "." + "progress", dto.progress)
    val errorParams = Ec2RequestEncoder.encode(fieldName + "." + "error", dto.error)
    val storageParams = Ec2RequestEncoder.encode(fieldName + "." + "storage", dto.storage)
    val startTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "startTime", dto.startTime)
    val updateTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "updateTime", dto.updateTime)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (updateTimeParams ++ (startTimeParams ++ (storageParams ++ (errorParams ++ (progressParams ++ (instanceIdParams ++ bundleIdParams))))))
  }
  implicit def TerminateInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, TerminateInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "TerminateInstances") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit def DescribeFpgaImagesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeFpgaImagesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val ownerParams = Ec2RequestEncoder.encode("Owner", req.owner)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val fpgaImageIdParams = Ec2RequestEncoder.encode("FpgaImageId", req.fpgaImageId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeFpgaImages") +: (dryRunParams ++ (fpgaImageIdParams ++ (filterParams ++ (nextTokenParams ++ (ownerParams ++ maxResultsParams))))): _*)
  }
  implicit val UserDataEc2Encoder: Ec2RequestEncoder[UserData] = (fieldName: String, dto: UserData) => {
    val dataParams = Ec2RequestEncoder.encode(fieldName + "." + "data", dto.data)
    dataParams
  }
  implicit val FlowLogEc2Encoder: Ec2RequestEncoder[FlowLog] = (fieldName: String, dto: FlowLog) => {
    val creationTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "creationTime", dto.creationTime)
    val flowLogStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "flowLogStatus", dto.flowLogStatus)
    val flowLogIdParams = Ec2RequestEncoder.encode(fieldName + "." + "flowLogId", dto.flowLogId)
    val deliverLogsStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "deliverLogsStatus", dto.deliverLogsStatus)
    val resourceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "resourceId", dto.resourceId)
    val deliverLogsErrorMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "deliverLogsErrorMessage", dto.deliverLogsErrorMessage)
    val deliverLogsPermissionArnParams = Ec2RequestEncoder.encode(fieldName + "." + "deliverLogsPermissionArn", dto.deliverLogsPermissionArn)
    val logGroupNameParams = Ec2RequestEncoder.encode(fieldName + "." + "logGroupName", dto.logGroupName)
    val trafficTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "trafficType", dto.trafficType)
    trafficTypeParams ++ (logGroupNameParams ++ (deliverLogsPermissionArnParams ++ (deliverLogsErrorMessageParams ++ (resourceIdParams ++ (deliverLogsStatusParams ++ (flowLogIdParams ++ (flowLogStatusParams ++ creationTimeParams)))))))
  }
  implicit val LaunchSpecificationEc2Encoder: Ec2RequestEncoder[LaunchSpecification] = (fieldName: String, dto: LaunchSpecification) => {
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ramdiskId", dto.ramdiskId)
    val userDataParams = Ec2RequestEncoder.encode(fieldName + "." + "userData", dto.userData)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "keyName", dto.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "kernelId", dto.kernelId)
    val addressingTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "addressingType", dto.addressingType)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "iamInstanceProfile", dto.iamInstanceProfile)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    val networkInterfaceSetParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceSet", dto.networkInterfaceSet)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDeviceMapping", dto.blockDeviceMapping)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "placement", dto.placement)
    val ebsOptimizedParams = Ec2RequestEncoder.encode(fieldName + "." + "ebsOptimized", dto.ebsOptimized)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (ebsOptimizedParams ++ (placementParams ++ (blockDeviceMappingParams ++ (networkInterfaceSetParams ++ (monitoringParams ++ (iamInstanceProfileParams ++ (groupSetParams ++ (imageIdParams ++ (subnetIdParams ++ (addressingTypeParams ++ (kernelIdParams ++ (keyNameParams ++ (userDataParams ++ ramdiskIdParams)))))))))))))
  }
  implicit def CreateImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val nameParams = Ec2RequestEncoder.encode("name", req.name)
    val descriptionParams = Ec2RequestEncoder.encode("description", req.description)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode("blockDeviceMapping", req.blockDeviceMapping)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val noRebootParams = Ec2RequestEncoder.encode("noReboot", req.noReboot)
    UrlForm(("Action" -> "CreateImage") +: (noRebootParams ++ (dryRunParams ++ (blockDeviceMappingParams ++ (descriptionParams ++ (nameParams ++ instanceIdParams))))): _*)
  }
  implicit val PricingDetailEc2Encoder: Ec2RequestEncoder[PricingDetail] = (fieldName: String, dto: PricingDetail) => {
    val countParams = Ec2RequestEncoder.encode(fieldName + "." + "count", dto.count)
    val priceParams = Ec2RequestEncoder.encode(fieldName + "." + "price", dto.price)
    priceParams ++ countParams
  }
  implicit val CancelSpotFleetRequestsSuccessItemEc2Encoder: Ec2RequestEncoder[CancelSpotFleetRequestsSuccessItem] = (fieldName: String, dto: CancelSpotFleetRequestsSuccessItem) => {
    val currentSpotFleetRequestStateParams = Ec2RequestEncoder.encode(fieldName + "." + "currentSpotFleetRequestState", dto.currentSpotFleetRequestState)
    val previousSpotFleetRequestStateParams = Ec2RequestEncoder.encode(fieldName + "." + "previousSpotFleetRequestState", dto.previousSpotFleetRequestState)
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode(fieldName + "." + "spotFleetRequestId", dto.spotFleetRequestId)
    spotFleetRequestIdParams ++ (previousSpotFleetRequestStateParams ++ currentSpotFleetRequestStateParams)
  }
  implicit val FilterEc2Encoder: Ec2RequestEncoder[Filter] = (fieldName: String, dto: Filter) => {
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "Name", dto.name)
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "Value", dto.value)
    valueParams ++ nameParams
  }
  implicit val SubnetCidrBlockStateEc2Encoder: Ec2RequestEncoder[SubnetCidrBlockState] = (fieldName: String, dto: SubnetCidrBlockState) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    statusMessageParams ++ stateParams
  }
  implicit val SpotDatafeedSubscriptionEc2Encoder: Ec2RequestEncoder[SpotDatafeedSubscription] = (fieldName: String, dto: SpotDatafeedSubscription) => {
    val bucketParams = Ec2RequestEncoder.encode(fieldName + "." + "bucket", dto.bucket)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val prefixParams = Ec2RequestEncoder.encode(fieldName + "." + "prefix", dto.prefix)
    val faultParams = Ec2RequestEncoder.encode(fieldName + "." + "fault", dto.fault)
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    stateParams ++ (faultParams ++ (prefixParams ++ (ownerIdParams ++ bucketParams)))
  }
  implicit def CreateVpnConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpnConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val customerGatewayIdParams = Ec2RequestEncoder.encode("CustomerGatewayId", req.customerGatewayId)
    val typeParams = Ec2RequestEncoder.encode("Type", req.`type`)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode("VpnGatewayId", req.vpnGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val optionsParams = Ec2RequestEncoder.encode("options", req.options)
    UrlForm(("Action" -> "CreateVpnConnection") +: (optionsParams ++ (dryRunParams ++ (vpnGatewayIdParams ++ (typeParams ++ customerGatewayIdParams)))): _*)
  }
  implicit def CreateNatGatewayRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateNatGatewayRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val allocationIdParams = Ec2RequestEncoder.encode("AllocationId", req.allocationId)
    val subnetIdParams = Ec2RequestEncoder.encode("SubnetId", req.subnetId)
    val clientTokenParams = Ec2RequestEncoder.encode("ClientToken", req.clientToken)
    UrlForm(("Action" -> "CreateNatGateway") +: (clientTokenParams ++ (subnetIdParams ++ allocationIdParams)): _*)
  }
  implicit def CancelSpotInstanceRequestsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelSpotInstanceRequestsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotInstanceRequestIdParams = Ec2RequestEncoder.encode("SpotInstanceRequestId", req.spotInstanceRequestId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CancelSpotInstanceRequests") +: (dryRunParams ++ spotInstanceRequestIdParams): _*)
  }
  implicit val NetworkInterfacePermissionStateEc2Encoder: Ec2RequestEncoder[NetworkInterfacePermissionState] = (fieldName: String, dto: NetworkInterfacePermissionState) => {
    val stateParams = Ec2RequestEncoder.encode(fieldName + "." + "state", dto.state)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    statusMessageParams ++ stateParams
  }
  implicit def DescribeVpcClassicLinkRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcClassicLinkRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    UrlForm(("Action" -> "DescribeVpcClassicLink") +: (vpcIdParams ++ (dryRunParams ++ filterParams)): _*)
  }
  implicit val VolumeStatusInfoEc2Encoder: Ec2RequestEncoder[VolumeStatusInfo] = (fieldName: String, dto: VolumeStatusInfo) => {
    val detailsParams = Ec2RequestEncoder.encode(fieldName + "." + "details", dto.details)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ detailsParams
  }
  implicit val VpcPeeringConnectionEc2Encoder: Ec2RequestEncoder[VpcPeeringConnection] = (fieldName: String, dto: VpcPeeringConnection) => {
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcPeeringConnectionId", dto.vpcPeeringConnectionId)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val accepterVpcInfoParams = Ec2RequestEncoder.encode(fieldName + "." + "accepterVpcInfo", dto.accepterVpcInfo)
    val requesterVpcInfoParams = Ec2RequestEncoder.encode(fieldName + "." + "requesterVpcInfo", dto.requesterVpcInfo)
    val expirationTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "expirationTime", dto.expirationTime)
    expirationTimeParams ++ (requesterVpcInfoParams ++ (accepterVpcInfoParams ++ (tagSetParams ++ (statusParams ++ vpcPeeringConnectionIdParams))))
  }
  implicit val ReservedInstancesListingEc2Encoder: Ec2RequestEncoder[ReservedInstancesListing] = (fieldName: String, dto: ReservedInstancesListing) => {
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val clientTokenParams = Ec2RequestEncoder.encode(fieldName + "." + "clientToken", dto.clientToken)
    val reservedInstancesIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesId", dto.reservedInstancesId)
    val reservedInstancesListingIdParams = Ec2RequestEncoder.encode(fieldName + "." + "reservedInstancesListingId", dto.reservedInstancesListingId)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val tagSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSet", dto.tagSet)
    val createDateParams = Ec2RequestEncoder.encode(fieldName + "." + "createDate", dto.createDate)
    val updateDateParams = Ec2RequestEncoder.encode(fieldName + "." + "updateDate", dto.updateDate)
    val instanceCountsParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCounts", dto.instanceCounts)
    val priceSchedulesParams = Ec2RequestEncoder.encode(fieldName + "." + "priceSchedules", dto.priceSchedules)
    priceSchedulesParams ++ (instanceCountsParams ++ (updateDateParams ++ (createDateParams ++ (tagSetParams ++ (statusMessageParams ++ (reservedInstancesListingIdParams ++ (reservedInstancesIdParams ++ (clientTokenParams ++ statusParams))))))))
  }
  implicit def DescribeHostReservationOfferingsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeHostReservationOfferingsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val maxDurationParams = Ec2RequestEncoder.encode("MaxDuration", req.maxDuration)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val minDurationParams = Ec2RequestEncoder.encode("MinDuration", req.minDuration)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val offeringIdParams = Ec2RequestEncoder.encode("OfferingId", req.offeringId)
    UrlForm(("Action" -> "DescribeHostReservationOfferings") +: (offeringIdParams ++ (nextTokenParams ++ (minDurationParams ++ (maxResultsParams ++ (maxDurationParams ++ filterParams))))): _*)
  }
  implicit def CreateSubnetRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateSubnetRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val cidrBlockParams = Ec2RequestEncoder.encode("CidrBlock", req.cidrBlock)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val availabilityZoneParams = Ec2RequestEncoder.encode("AvailabilityZone", req.availabilityZone)
    val ipv6CidrBlockParams = Ec2RequestEncoder.encode("Ipv6CidrBlock", req.ipv6CidrBlock)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateSubnet") +: (dryRunParams ++ (ipv6CidrBlockParams ++ (availabilityZoneParams ++ (vpcIdParams ++ cidrBlockParams)))): _*)
  }
  implicit val InstanceNetworkInterfaceEc2Encoder: Ec2RequestEncoder[InstanceNetworkInterface] = (fieldName: String, dto: InstanceNetworkInterface) => {
    val privateIpAddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddressesSet", dto.privateIpAddressesSet)
    val attachmentParams = Ec2RequestEncoder.encode(fieldName + "." + "attachment", dto.attachment)
    val privateDnsNameParams = Ec2RequestEncoder.encode(fieldName + "." + "privateDnsName", dto.privateDnsName)
    val macAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "macAddress", dto.macAddress)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val ownerIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ownerId", dto.ownerId)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val vpcIdParams = Ec2RequestEncoder.encode(fieldName + "." + "vpcId", dto.vpcId)
    val ipv6AddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6AddressesSet", dto.ipv6AddressesSet)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val associationParams = Ec2RequestEncoder.encode(fieldName + "." + "association", dto.association)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    val sourceDestCheckParams = Ec2RequestEncoder.encode(fieldName + "." + "sourceDestCheck", dto.sourceDestCheck)
    sourceDestCheckParams ++ (statusParams ++ (associationParams ++ (groupSetParams ++ (ipv6AddressesSetParams ++ (vpcIdParams ++ (subnetIdParams ++ (ownerIdParams ++ (privateIpAddressParams ++ (descriptionParams ++ (networkInterfaceIdParams ++ (macAddressParams ++ (privateDnsNameParams ++ (attachmentParams ++ privateIpAddressesSetParams)))))))))))))
  }
  implicit val DhcpConfigurationEc2Encoder: Ec2RequestEncoder[DhcpConfiguration] = (fieldName: String, dto: DhcpConfiguration) => {
    val keyParams = Ec2RequestEncoder.encode(fieldName + "." + "key", dto.key)
    val valueSetParams = Ec2RequestEncoder.encode(fieldName + "." + "valueSet", dto.valueSet)
    valueSetParams ++ keyParams
  }
  implicit def ReplaceNetworkAclAssociationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReplaceNetworkAclAssociationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("associationId", req.associationId)
    val networkAclIdParams = Ec2RequestEncoder.encode("networkAclId", req.networkAclId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReplaceNetworkAclAssociation") +: (dryRunParams ++ (networkAclIdParams ++ associationIdParams)): _*)
  }
  implicit def DescribeVpcEndpointServicesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcEndpointServicesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val serviceNameParams = Ec2RequestEncoder.encode("ServiceName", req.serviceName)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpcEndpointServices") +: (dryRunParams ++ (maxResultsParams ++ (serviceNameParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit def DeleteVpnConnectionRouteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteVpnConnectionRouteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val destinationCidrBlockParams = Ec2RequestEncoder.encode("DestinationCidrBlock", req.destinationCidrBlock)
    val vpnConnectionIdParams = Ec2RequestEncoder.encode("VpnConnectionId", req.vpnConnectionId)
    UrlForm(("Action" -> "DeleteVpnConnectionRoute") +: (vpnConnectionIdParams ++ destinationCidrBlockParams): _*)
  }
  implicit val PeeringConnectionOptionsRequestEc2Encoder: Ec2RequestEncoder[PeeringConnectionOptionsRequest] = (fieldName: String, dto: PeeringConnectionOptionsRequest) => {
    val allowDnsResolutionFromRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "AllowDnsResolutionFromRemoteVpc", dto.allowDnsResolutionFromRemoteVpc)
    val allowEgressFromLocalClassicLinkToRemoteVpcParams = Ec2RequestEncoder.encode(fieldName + "." + "AllowEgressFromLocalClassicLinkToRemoteVpc", dto.allowEgressFromLocalClassicLinkToRemoteVpc)
    val allowEgressFromLocalVpcToRemoteClassicLinkParams = Ec2RequestEncoder.encode(fieldName + "." + "AllowEgressFromLocalVpcToRemoteClassicLink", dto.allowEgressFromLocalVpcToRemoteClassicLink)
    allowEgressFromLocalVpcToRemoteClassicLinkParams ++ (allowEgressFromLocalClassicLinkToRemoteVpcParams ++ allowDnsResolutionFromRemoteVpcParams)
  }
  implicit def DeleteRouteRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteRouteRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val destinationCidrBlockParams = Ec2RequestEncoder.encode("destinationCidrBlock", req.destinationCidrBlock)
    val destinationIpv6CidrBlockParams = Ec2RequestEncoder.encode("destinationIpv6CidrBlock", req.destinationIpv6CidrBlock)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteRoute") +: (dryRunParams ++ (destinationIpv6CidrBlockParams ++ (destinationCidrBlockParams ++ routeTableIdParams))): _*)
  }
  implicit def CancelImportTaskRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CancelImportTaskRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val cancelReasonParams = Ec2RequestEncoder.encode("CancelReason", req.cancelReason)
    val importTaskIdParams = Ec2RequestEncoder.encode("ImportTaskId", req.importTaskId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "CancelImportTask") +: (dryRunParams ++ (importTaskIdParams ++ cancelReasonParams)): _*)
  }
  implicit val ScheduledInstanceEc2Encoder: Ec2RequestEncoder[ScheduledInstance] = (fieldName: String, dto: ScheduledInstance) => {
    val networkPlatformParams = Ec2RequestEncoder.encode(fieldName + "." + "networkPlatform", dto.networkPlatform)
    val platformParams = Ec2RequestEncoder.encode(fieldName + "." + "platform", dto.platform)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val scheduledInstanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "scheduledInstanceId", dto.scheduledInstanceId)
    val hourlyPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "hourlyPrice", dto.hourlyPrice)
    val previousSlotEndTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "previousSlotEndTime", dto.previousSlotEndTime)
    val createDateParams = Ec2RequestEncoder.encode(fieldName + "." + "createDate", dto.createDate)
    val termEndDateParams = Ec2RequestEncoder.encode(fieldName + "." + "termEndDate", dto.termEndDate)
    val termStartDateParams = Ec2RequestEncoder.encode(fieldName + "." + "termStartDate", dto.termStartDate)
    val nextSlotStartTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "nextSlotStartTime", dto.nextSlotStartTime)
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceCount", dto.instanceCount)
    val slotDurationInHoursParams = Ec2RequestEncoder.encode(fieldName + "." + "slotDurationInHours", dto.slotDurationInHours)
    val totalScheduledInstanceHoursParams = Ec2RequestEncoder.encode(fieldName + "." + "totalScheduledInstanceHours", dto.totalScheduledInstanceHours)
    val recurrenceParams = Ec2RequestEncoder.encode(fieldName + "." + "recurrence", dto.recurrence)
    recurrenceParams ++ (totalScheduledInstanceHoursParams ++ (slotDurationInHoursParams ++ (instanceCountParams ++ (nextSlotStartTimeParams ++ (termStartDateParams ++ (termEndDateParams ++ (createDateParams ++ (previousSlotEndTimeParams ++ (hourlyPriceParams ++ (scheduledInstanceIdParams ++ (availabilityZoneParams ++ (instanceTypeParams ++ (platformParams ++ networkPlatformParams)))))))))))))
  }
  implicit def ModifySpotFleetRequestRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifySpotFleetRequestRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val spotFleetRequestIdParams = Ec2RequestEncoder.encode("spotFleetRequestId", req.spotFleetRequestId)
    val excessCapacityTerminationPolicyParams = Ec2RequestEncoder.encode("excessCapacityTerminationPolicy", req.excessCapacityTerminationPolicy)
    val targetCapacityParams = Ec2RequestEncoder.encode("targetCapacity", req.targetCapacity)
    UrlForm(("Action" -> "ModifySpotFleetRequest") +: (targetCapacityParams ++ (excessCapacityTerminationPolicyParams ++ spotFleetRequestIdParams)): _*)
  }
  implicit def DescribeSubnetsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSubnetsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val subnetIdParams = Ec2RequestEncoder.encode("SubnetId", req.subnetId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSubnets") +: (dryRunParams ++ (subnetIdParams ++ filterParams)): _*)
  }
  implicit def RevokeSecurityGroupIngressRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, RevokeSecurityGroupIngressRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val sourceSecurityGroupNameParams = Ec2RequestEncoder.encode("SourceSecurityGroupName", req.sourceSecurityGroupName)
    val groupIdParams = Ec2RequestEncoder.encode("GroupId", req.groupId)
    val ipProtocolParams = Ec2RequestEncoder.encode("IpProtocol", req.ipProtocol)
    val groupNameParams = Ec2RequestEncoder.encode("GroupName", req.groupName)
    val sourceSecurityGroupOwnerIdParams = Ec2RequestEncoder.encode("SourceSecurityGroupOwnerId", req.sourceSecurityGroupOwnerId)
    val cidrIpParams = Ec2RequestEncoder.encode("CidrIp", req.cidrIp)
    val fromPortParams = Ec2RequestEncoder.encode("FromPort", req.fromPort)
    val toPortParams = Ec2RequestEncoder.encode("ToPort", req.toPort)
    val ipPermissionsParams = Ec2RequestEncoder.encode("IpPermissions", req.ipPermissions)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "RevokeSecurityGroupIngress") +: (dryRunParams ++ (ipPermissionsParams ++ (toPortParams ++ (fromPortParams ++ (cidrIpParams ++ (sourceSecurityGroupOwnerIdParams ++ (groupNameParams ++ (ipProtocolParams ++ (groupIdParams ++ sourceSecurityGroupNameParams))))))))): _*)
  }
  implicit val LoadBalancersConfigEc2Encoder: Ec2RequestEncoder[LoadBalancersConfig] = (fieldName: String, dto: LoadBalancersConfig) => {
    val classicLoadBalancersConfigParams = Ec2RequestEncoder.encode(fieldName + "." + "classicLoadBalancersConfig", dto.classicLoadBalancersConfig)
    val targetGroupsConfigParams = Ec2RequestEncoder.encode(fieldName + "." + "targetGroupsConfig", dto.targetGroupsConfig)
    targetGroupsConfigParams ++ classicLoadBalancersConfigParams
  }
  implicit def ModifyVpcPeeringConnectionOptionsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifyVpcPeeringConnectionOptionsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcPeeringConnectionIdParams = Ec2RequestEncoder.encode("VpcPeeringConnectionId", req.vpcPeeringConnectionId)
    val accepterPeeringConnectionOptionsParams = Ec2RequestEncoder.encode("AccepterPeeringConnectionOptions", req.accepterPeeringConnectionOptions)
    val requesterPeeringConnectionOptionsParams = Ec2RequestEncoder.encode("RequesterPeeringConnectionOptions", req.requesterPeeringConnectionOptions)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "ModifyVpcPeeringConnectionOptions") +: (dryRunParams ++ (requesterPeeringConnectionOptionsParams ++ (accepterPeeringConnectionOptionsParams ++ vpcPeeringConnectionIdParams))): _*)
  }
  implicit def GetConsoleOutputRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, GetConsoleOutputRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "GetConsoleOutput") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit val ScheduledInstanceRecurrenceEc2Encoder: Ec2RequestEncoder[ScheduledInstanceRecurrence] = (fieldName: String, dto: ScheduledInstanceRecurrence) => {
    val frequencyParams = Ec2RequestEncoder.encode(fieldName + "." + "frequency", dto.frequency)
    val occurrenceUnitParams = Ec2RequestEncoder.encode(fieldName + "." + "occurrenceUnit", dto.occurrenceUnit)
    val intervalParams = Ec2RequestEncoder.encode(fieldName + "." + "interval", dto.interval)
    val occurrenceDaySetParams = Ec2RequestEncoder.encode(fieldName + "." + "occurrenceDaySet", dto.occurrenceDaySet)
    val occurrenceRelativeToEndParams = Ec2RequestEncoder.encode(fieldName + "." + "occurrenceRelativeToEnd", dto.occurrenceRelativeToEnd)
    occurrenceRelativeToEndParams ++ (occurrenceDaySetParams ++ (intervalParams ++ (occurrenceUnitParams ++ frequencyParams)))
  }
  implicit def DescribeVpcEndpointsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcEndpointsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val vpcEndpointIdParams = Ec2RequestEncoder.encode("VpcEndpointId", req.vpcEndpointId)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpcEndpoints") +: (dryRunParams ++ (maxResultsParams ++ (vpcEndpointIdParams ++ (nextTokenParams ++ filterParams)))): _*)
  }
  implicit val ProvisionedBandwidthEc2Encoder: Ec2RequestEncoder[ProvisionedBandwidth] = (fieldName: String, dto: ProvisionedBandwidth) => {
    val provisionTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "provisionTime", dto.provisionTime)
    val requestTimeParams = Ec2RequestEncoder.encode(fieldName + "." + "requestTime", dto.requestTime)
    val provisionedParams = Ec2RequestEncoder.encode(fieldName + "." + "provisioned", dto.provisioned)
    val requestedParams = Ec2RequestEncoder.encode(fieldName + "." + "requested", dto.requested)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ (requestedParams ++ (provisionedParams ++ (requestTimeParams ++ provisionTimeParams)))
  }
  implicit def ModifySnapshotAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ModifySnapshotAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val createVolumePermissionParams = Ec2RequestEncoder.encode("CreateVolumePermission", req.createVolumePermission)
    val userIdParams = Ec2RequestEncoder.encode("UserId", req.userId)
    val operationTypeParams = Ec2RequestEncoder.encode("OperationType", req.operationType)
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val userGroupParams = Ec2RequestEncoder.encode("UserGroup", req.userGroup)
    UrlForm(("Action" -> "ModifySnapshotAttribute") +: (userGroupParams ++ (dryRunParams ++ (attributeParams ++ (operationTypeParams ++ (userIdParams ++ (createVolumePermissionParams ++ snapshotIdParams)))))): _*)
  }
  implicit val InstanceStatusEc2Encoder: Ec2RequestEncoder[InstanceStatus] = (fieldName: String, dto: InstanceStatus) => {
    val availabilityZoneParams = Ec2RequestEncoder.encode(fieldName + "." + "availabilityZone", dto.availabilityZone)
    val instanceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceId", dto.instanceId)
    val eventsSetParams = Ec2RequestEncoder.encode(fieldName + "." + "eventsSet", dto.eventsSet)
    val instanceStateParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceState", dto.instanceState)
    val instanceStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceStatus", dto.instanceStatus)
    val systemStatusParams = Ec2RequestEncoder.encode(fieldName + "." + "systemStatus", dto.systemStatus)
    systemStatusParams ++ (instanceStatusParams ++ (instanceStateParams ++ (eventsSetParams ++ (instanceIdParams ++ availabilityZoneParams))))
  }
  implicit val TargetConfigurationRequestEc2Encoder: Ec2RequestEncoder[TargetConfigurationRequest] = (fieldName: String, dto: TargetConfigurationRequest) => {
    val offeringIdParams = Ec2RequestEncoder.encode(fieldName + "." + "OfferingId", dto.offeringId)
    val instanceCountParams = Ec2RequestEncoder.encode(fieldName + "." + "InstanceCount", dto.instanceCount)
    instanceCountParams ++ offeringIdParams
  }
  implicit val PciIdEc2Encoder: Ec2RequestEncoder[PciId] = (fieldName: String, dto: PciId) => {
    val deviceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "DeviceId", dto.deviceId)
    val vendorIdParams = Ec2RequestEncoder.encode(fieldName + "." + "VendorId", dto.vendorId)
    val subsystemIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SubsystemId", dto.subsystemId)
    val subsystemVendorIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SubsystemVendorId", dto.subsystemVendorId)
    subsystemVendorIdParams ++ (subsystemIdParams ++ (vendorIdParams ++ deviceIdParams))
  }
  implicit val InstanceStateEc2Encoder: Ec2RequestEncoder[InstanceState] = (fieldName: String, dto: InstanceState) => {
    val codeParams = Ec2RequestEncoder.encode(fieldName + "." + "code", dto.code)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "name", dto.name)
    nameParams ++ codeParams
  }
  implicit def CreateVpcPeeringConnectionRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateVpcPeeringConnectionRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    val peerOwnerIdParams = Ec2RequestEncoder.encode("peerOwnerId", req.peerOwnerId)
    val peerVpcIdParams = Ec2RequestEncoder.encode("peerVpcId", req.peerVpcId)
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    UrlForm(("Action" -> "CreateVpcPeeringConnection") +: (vpcIdParams ++ (peerVpcIdParams ++ (peerOwnerIdParams ++ dryRunParams))): _*)
  }
  implicit def DescribeBundleTasksRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeBundleTasksRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val bundleIdParams = Ec2RequestEncoder.encode("BundleId", req.bundleId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeBundleTasks") +: (dryRunParams ++ (filterParams ++ bundleIdParams)): _*)
  }
  implicit def DescribeSnapshotsRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeSnapshotsRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val ownerParams = Ec2RequestEncoder.encode("Owner", req.owner)
    val snapshotIdParams = Ec2RequestEncoder.encode("SnapshotId", req.snapshotId)
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    val restorableByParams = Ec2RequestEncoder.encode("RestorableBy", req.restorableBy)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeSnapshots") +: (dryRunParams ++ (maxResultsParams ++ (restorableByParams ++ (nextTokenParams ++ (filterParams ++ (snapshotIdParams ++ ownerParams)))))): _*)
  }
  implicit def AssignPrivateIpAddressesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AssignPrivateIpAddressesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val networkInterfaceIdParams = Ec2RequestEncoder.encode("networkInterfaceId", req.networkInterfaceId)
    val allowReassignmentParams = Ec2RequestEncoder.encode("allowReassignment", req.allowReassignment)
    val privateIpAddressParams = Ec2RequestEncoder.encode("privateIpAddress", req.privateIpAddress)
    val secondaryPrivateIpAddressCountParams = Ec2RequestEncoder.encode("secondaryPrivateIpAddressCount", req.secondaryPrivateIpAddressCount)
    UrlForm(("Action" -> "AssignPrivateIpAddresses") +: (secondaryPrivateIpAddressCountParams ++ (privateIpAddressParams ++ (allowReassignmentParams ++ networkInterfaceIdParams))): _*)
  }
  implicit val PropagatingVgwEc2Encoder: Ec2RequestEncoder[PropagatingVgw] = (fieldName: String, dto: PropagatingVgw) => {
    val gatewayIdParams = Ec2RequestEncoder.encode(fieldName + "." + "gatewayId", dto.gatewayId)
    gatewayIdParams
  }
  implicit val InstanceNetworkInterfaceSpecificationEc2Encoder: Ec2RequestEncoder[InstanceNetworkInterfaceSpecification] = (fieldName: String, dto: InstanceNetworkInterfaceSpecification) => {
    val privateIpAddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddressesSet", dto.privateIpAddressesSet)
    val descriptionParams = Ec2RequestEncoder.encode(fieldName + "." + "description", dto.description)
    val networkInterfaceIdParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceId", dto.networkInterfaceId)
    val privateIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "privateIpAddress", dto.privateIpAddress)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val ipv6AddressesSetParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6AddressesSet", dto.ipv6AddressesSet)
    val securityGroupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SecurityGroupId", dto.securityGroupId)
    val deviceIndexParams = Ec2RequestEncoder.encode(fieldName + "." + "deviceIndex", dto.deviceIndex)
    val ipv6AddressCountParams = Ec2RequestEncoder.encode(fieldName + "." + "ipv6AddressCount", dto.ipv6AddressCount)
    val secondaryPrivateIpAddressCountParams = Ec2RequestEncoder.encode(fieldName + "." + "secondaryPrivateIpAddressCount", dto.secondaryPrivateIpAddressCount)
    val associatePublicIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "associatePublicIpAddress", dto.associatePublicIpAddress)
    val deleteOnTerminationParams = Ec2RequestEncoder.encode(fieldName + "." + "deleteOnTermination", dto.deleteOnTermination)
    deleteOnTerminationParams ++ (associatePublicIpAddressParams ++ (secondaryPrivateIpAddressCountParams ++ (ipv6AddressCountParams ++ (deviceIndexParams ++ (securityGroupIdParams ++ (ipv6AddressesSetParams ++ (subnetIdParams ++ (privateIpAddressParams ++ (networkInterfaceIdParams ++ (descriptionParams ++ privateIpAddressesSetParams))))))))))
  }
  implicit val ScheduledInstancesLaunchSpecificationEc2Encoder: Ec2RequestEncoder[ScheduledInstancesLaunchSpecification] = (fieldName: String, dto: ScheduledInstancesLaunchSpecification) => {
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ImageId", dto.imageId)
    val networkInterfaceParams = Ec2RequestEncoder.encode(fieldName + "." + "NetworkInterface", dto.networkInterface)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "Monitoring", dto.monitoring)
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "RamdiskId", dto.ramdiskId)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SubnetId", dto.subnetId)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "InstanceType", dto.instanceType)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "KeyName", dto.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "KernelId", dto.kernelId)
    val userDataParams = Ec2RequestEncoder.encode(fieldName + "." + "UserData", dto.userData)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "BlockDeviceMapping", dto.blockDeviceMapping)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "Placement", dto.placement)
    val ebsOptimizedParams = Ec2RequestEncoder.encode(fieldName + "." + "EbsOptimized", dto.ebsOptimized)
    val securityGroupIdParams = Ec2RequestEncoder.encode(fieldName + "." + "SecurityGroupId", dto.securityGroupId)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "IamInstanceProfile", dto.iamInstanceProfile)
    iamInstanceProfileParams ++ (securityGroupIdParams ++ (ebsOptimizedParams ++ (placementParams ++ (blockDeviceMappingParams ++ (userDataParams ++ (kernelIdParams ++ (keyNameParams ++ (instanceTypeParams ++ (subnetIdParams ++ (ramdiskIdParams ++ (monitoringParams ++ (networkInterfaceParams ++ imageIdParams))))))))))))
  }
  implicit def DescribeInstanceAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeInstanceAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("attribute", req.attribute)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeInstanceAttribute") +: (dryRunParams ++ (instanceIdParams ++ attributeParams)): _*)
  }
  implicit def MonitorInstancesRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, MonitorInstancesRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val instanceIdParams = Ec2RequestEncoder.encode("InstanceId", req.instanceId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "MonitorInstances") +: (dryRunParams ++ instanceIdParams): _*)
  }
  implicit def DescribeVpnGatewaysRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpnGatewaysRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val vpnGatewayIdParams = Ec2RequestEncoder.encode("VpnGatewayId", req.vpnGatewayId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpnGateways") +: (dryRunParams ++ (vpnGatewayIdParams ++ filterParams)): _*)
  }
  implicit val ScheduledInstancesIamInstanceProfileEc2Encoder: Ec2RequestEncoder[ScheduledInstancesIamInstanceProfile] = (fieldName: String, dto: ScheduledInstancesIamInstanceProfile) => {
    val arnParams = Ec2RequestEncoder.encode(fieldName + "." + "Arn", dto.arn)
    val nameParams = Ec2RequestEncoder.encode(fieldName + "." + "Name", dto.name)
    nameParams ++ arnParams
  }
  implicit def DescribeIdentityIdFormatRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeIdentityIdFormatRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val principalArnParams = Ec2RequestEncoder.encode("principalArn", req.principalArn)
    val resourceParams = Ec2RequestEncoder.encode("resource", req.resource)
    UrlForm(("Action" -> "DescribeIdentityIdFormat") +: (resourceParams ++ principalArnParams): _*)
  }
  implicit val SpotFleetLaunchSpecificationEc2Encoder: Ec2RequestEncoder[SpotFleetLaunchSpecification] = (fieldName: String, dto: SpotFleetLaunchSpecification) => {
    val ramdiskIdParams = Ec2RequestEncoder.encode(fieldName + "." + "ramdiskId", dto.ramdiskId)
    val userDataParams = Ec2RequestEncoder.encode(fieldName + "." + "userData", dto.userData)
    val keyNameParams = Ec2RequestEncoder.encode(fieldName + "." + "keyName", dto.keyName)
    val kernelIdParams = Ec2RequestEncoder.encode(fieldName + "." + "kernelId", dto.kernelId)
    val addressingTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "addressingType", dto.addressingType)
    val subnetIdParams = Ec2RequestEncoder.encode(fieldName + "." + "subnetId", dto.subnetId)
    val imageIdParams = Ec2RequestEncoder.encode(fieldName + "." + "imageId", dto.imageId)
    val spotPriceParams = Ec2RequestEncoder.encode(fieldName + "." + "spotPrice", dto.spotPrice)
    val monitoringParams = Ec2RequestEncoder.encode(fieldName + "." + "monitoring", dto.monitoring)
    val groupSetParams = Ec2RequestEncoder.encode(fieldName + "." + "groupSet", dto.groupSet)
    val iamInstanceProfileParams = Ec2RequestEncoder.encode(fieldName + "." + "iamInstanceProfile", dto.iamInstanceProfile)
    val networkInterfaceSetParams = Ec2RequestEncoder.encode(fieldName + "." + "networkInterfaceSet", dto.networkInterfaceSet)
    val blockDeviceMappingParams = Ec2RequestEncoder.encode(fieldName + "." + "blockDeviceMapping", dto.blockDeviceMapping)
    val tagSpecificationSetParams = Ec2RequestEncoder.encode(fieldName + "." + "tagSpecificationSet", dto.tagSpecificationSet)
    val placementParams = Ec2RequestEncoder.encode(fieldName + "." + "placement", dto.placement)
    val ebsOptimizedParams = Ec2RequestEncoder.encode(fieldName + "." + "ebsOptimized", dto.ebsOptimized)
    val weightedCapacityParams = Ec2RequestEncoder.encode(fieldName + "." + "weightedCapacity", dto.weightedCapacity)
    val instanceTypeParams = Ec2RequestEncoder.encode(fieldName + "." + "instanceType", dto.instanceType)
    instanceTypeParams ++ (weightedCapacityParams ++ (ebsOptimizedParams ++ (placementParams ++ (tagSpecificationSetParams ++ (blockDeviceMappingParams ++ (networkInterfaceSetParams ++ (iamInstanceProfileParams ++ (groupSetParams ++ (monitoringParams ++ (spotPriceParams ++ (imageIdParams ++ (subnetIdParams ++ (addressingTypeParams ++ (kernelIdParams ++ (keyNameParams ++ (userDataParams ++ ramdiskIdParams))))))))))))))))
  }
  implicit def CreateNetworkAclRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, CreateNetworkAclRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "CreateNetworkAcl") +: (dryRunParams ++ vpcIdParams): _*)
  }
  implicit def ReplaceRouteTableAssociationRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, ReplaceRouteTableAssociationRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val associationIdParams = Ec2RequestEncoder.encode("associationId", req.associationId)
    val routeTableIdParams = Ec2RequestEncoder.encode("routeTableId", req.routeTableId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "ReplaceRouteTableAssociation") +: (dryRunParams ++ (routeTableIdParams ++ associationIdParams)): _*)
  }
  implicit def AttachClassicLinkVpcRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, AttachClassicLinkVpcRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val securityGroupIdParams = Ec2RequestEncoder.encode("SecurityGroupId", req.securityGroupId)
    val instanceIdParams = Ec2RequestEncoder.encode("instanceId", req.instanceId)
    val vpcIdParams = Ec2RequestEncoder.encode("vpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "AttachClassicLinkVpc") +: (dryRunParams ++ (vpcIdParams ++ (instanceIdParams ++ securityGroupIdParams))): _*)
  }
  implicit def DescribeNatGatewaysRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeNatGatewaysRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val filterParams = Ec2RequestEncoder.encode("Filter", req.filter)
    val maxResultsParams = Ec2RequestEncoder.encode("MaxResults", req.maxResults)
    val natGatewayIdParams = Ec2RequestEncoder.encode("NatGatewayId", req.natGatewayId)
    val nextTokenParams = Ec2RequestEncoder.encode("NextToken", req.nextToken)
    UrlForm(("Action" -> "DescribeNatGateways") +: (nextTokenParams ++ (natGatewayIdParams ++ (maxResultsParams ++ filterParams))): _*)
  }
  implicit def DescribeVpcAttributeRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DescribeVpcAttributeRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val attributeParams = Ec2RequestEncoder.encode("Attribute", req.attribute)
    val vpcIdParams = Ec2RequestEncoder.encode("VpcId", req.vpcId)
    val dryRunParams = Ec2RequestEncoder.encode("dryRun", req.dryRun)
    UrlForm(("Action" -> "DescribeVpcAttribute") +: (dryRunParams ++ (vpcIdParams ++ attributeParams)): _*)
  }
  implicit val AttributeBooleanValueEc2Encoder: Ec2RequestEncoder[AttributeBooleanValue] = (fieldName: String, dto: AttributeBooleanValue) => {
    val valueParams = Ec2RequestEncoder.encode(fieldName + "." + "value", dto.value)
    valueParams
  }
  implicit val VgwTelemetryEc2Encoder: Ec2RequestEncoder[VgwTelemetry] = (fieldName: String, dto: VgwTelemetry) => {
    val acceptedRouteCountParams = Ec2RequestEncoder.encode(fieldName + "." + "acceptedRouteCount", dto.acceptedRouteCount)
    val lastStatusChangeParams = Ec2RequestEncoder.encode(fieldName + "." + "lastStatusChange", dto.lastStatusChange)
    val outsideIpAddressParams = Ec2RequestEncoder.encode(fieldName + "." + "outsideIpAddress", dto.outsideIpAddress)
    val statusMessageParams = Ec2RequestEncoder.encode(fieldName + "." + "statusMessage", dto.statusMessage)
    val statusParams = Ec2RequestEncoder.encode(fieldName + "." + "status", dto.status)
    statusParams ++ (statusMessageParams ++ (outsideIpAddressParams ++ (lastStatusChangeParams ++ acceptedRouteCountParams)))
  }
  implicit def DeleteFpgaImageRequestEntityEncoder[F[_]: cats.Applicative]: EntityEncoder[F, DeleteFpgaImageRequest] = EntityEncoder[F, UrlForm].contramap { req => 
    val fpgaImageIdParams = Ec2RequestEncoder.encode("FpgaImageId", req.fpgaImageId)
    val dryRunParams = Ec2RequestEncoder.encode("DryRun", req.dryRun)
    UrlForm(("Action" -> "DeleteFpgaImage") +: (dryRunParams ++ fpgaImageIdParams): _*)
  }
}