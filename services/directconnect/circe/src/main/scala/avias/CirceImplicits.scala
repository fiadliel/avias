package avias.directconnect
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DisassociateConnectionFromLagRequestEncoder: io.circe.Encoder[avias.directconnect.models.DisassociateConnectionFromLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val ResourceTagEncoder: io.circe.Encoder[avias.directconnect.models.ResourceTag] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ConnectionsEncoder: io.circe.Encoder[avias.directconnect.models.Connections] = io.circe.Encoder.instance { o => 
    Json.obj("connections" -> o.connections.asJson)
  }
  final implicit val DeleteDirectConnectGatewayAssociationResultEncoder: io.circe.Encoder[avias.directconnect.models.DeleteDirectConnectGatewayAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociation" -> o.directConnectGatewayAssociation.asJson)
  }
  final implicit val NewPrivateVirtualInterfaceAllocationEncoder: io.circe.Encoder[avias.directconnect.models.NewPrivateVirtualInterfaceAllocation] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeConnectionLoaResponseEncoder: io.circe.Encoder[avias.directconnect.models.DescribeConnectionLoaResponse] = io.circe.Encoder.instance { o => 
    Json.obj("loa" -> o.loa.asJson)
  }
  final implicit val DescribeConnectionsOnInterconnectRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeConnectionsOnInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val DeleteBGPPeerResponseEncoder: io.circe.Encoder[avias.directconnect.models.DeleteBGPPeerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterface" -> o.virtualInterface.asJson)
  }
  final implicit val CreateLagRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagName" -> o.lagName.asJson, "connectionsBandwidth" -> o.connectionsBandwidth.asJson, "location" -> o.location.asJson, "numberOfConnections" -> o.numberOfConnections.asJson, "connectionId" -> o.connectionId.asJson)
  }
  final implicit val DeleteVirtualInterfaceResponseEncoder: io.circe.Encoder[avias.directconnect.models.DeleteVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val InterconnectEncoder: io.circe.Encoder[avias.directconnect.models.Interconnect] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "interconnectName" -> o.interconnectName.asJson, "region" -> o.region.asJson, "loaIssueTime" -> o.loaIssueTime.asJson, "interconnectId" -> o.interconnectId.asJson, "lagId" -> o.lagId.asJson, "interconnectState" -> o.interconnectState.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson)
  }
  final implicit val DirectConnectGatewayAssociationEncoder: io.circe.Encoder[avias.directconnect.models.DirectConnectGatewayAssociation] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayOwnerAccount" -> o.virtualGatewayOwnerAccount.asJson, "virtualGatewayRegion" -> o.virtualGatewayRegion.asJson, "associationState" -> o.associationState.asJson, "stateChangeError" -> o.stateChangeError.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val DeleteDirectConnectGatewayResultEncoder: io.circe.Encoder[avias.directconnect.models.DeleteDirectConnectGatewayResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateway" -> o.directConnectGateway.asJson)
  }
  final implicit val ConnectionEncoder: io.circe.Encoder[avias.directconnect.models.Connection] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "region" -> o.region.asJson, "partnerName" -> o.partnerName.asJson, "loaIssueTime" -> o.loaIssueTime.asJson, "lagId" -> o.lagId.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson, "connectionState" -> o.connectionState.asJson)
  }
  final implicit val AllocateConnectionOnInterconnectRequestEncoder: io.circe.Encoder[avias.directconnect.models.AllocateConnectionOnInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ownerAccount" -> o.ownerAccount.asJson, "interconnectId" -> o.interconnectId.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateBGPPeerResponseEncoder: io.circe.Encoder[avias.directconnect.models.CreateBGPPeerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterface" -> o.virtualInterface.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[avias.directconnect.models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val AllocatePublicVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.AllocatePublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "newPublicVirtualInterfaceAllocation" -> o.newPublicVirtualInterfaceAllocation.asJson)
  }
  final implicit val AssociateHostedConnectionRequestEncoder: io.circe.Encoder[avias.directconnect.models.AssociateHostedConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "parentConnectionId" -> o.parentConnectionId.asJson)
  }
  final implicit val DescribeInterconnectLoaRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeInterconnectLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val DeleteBGPPeerRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteBGPPeerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "asn" -> o.asn.asJson, "customerAddress" -> o.customerAddress.asJson)
  }
  final implicit val ConfirmPrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmPrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson)
  }
  final implicit val DeleteInterconnectRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val ConfirmPrivateVirtualInterfaceResponseEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmPrivateVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val CreateConnectionRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "bandwidth" -> o.bandwidth.asJson, "connectionName" -> o.connectionName.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val LocationEncoder: io.circe.Encoder[avias.directconnect.models.Location] = io.circe.Encoder.instance { o => 
    Json.obj("locationCode" -> o.locationCode.asJson, "locationName" -> o.locationName.asJson)
  }
  final implicit val CreateBGPPeerRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateBGPPeerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "newBGPPeer" -> o.newBGPPeer.asJson)
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[avias.directconnect.models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tagKeys" -> o.tagKeys.asJson)
  }
  final implicit val DescribeConnectionLoaRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeConnectionLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.directconnect.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val AllocateHostedConnectionRequestEncoder: io.circe.Encoder[avias.directconnect.models.AllocateHostedConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson)
  }
  final implicit val DescribeLagsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeLagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson)
  }
  final implicit val DescribeConnectionsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeConnectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val NewPublicVirtualInterfaceEncoder: io.circe.Encoder[avias.directconnect.models.NewPublicVirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeDirectConnectGatewaysRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewaysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociateConnectionWithLagRequestEncoder: io.circe.Encoder[avias.directconnect.models.AssociateConnectionWithLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val CreateDirectConnectGatewayAssociationRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateDirectConnectGatewayAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val RouteFilterPrefixEncoder: io.circe.Encoder[avias.directconnect.models.RouteFilterPrefix] = io.circe.Encoder.instance { o => 
    Json.obj("cidr" -> o.cidr.asJson)
  }
  final implicit val DirectConnectServerExceptionEncoder: io.circe.Encoder[avias.directconnect.models.DirectConnectServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val NewBGPPeerEncoder: io.circe.Encoder[avias.directconnect.models.NewBGPPeer] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "asn" -> o.asn.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeHostedConnectionsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeHostedConnectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val AssociateVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.AssociateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "connectionId" -> o.connectionId.asJson)
  }
  final implicit val DescribeLoaRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val UpdateLagRequestEncoder: io.circe.Encoder[avias.directconnect.models.UpdateLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson, "lagName" -> o.lagName.asJson, "minimumLinks" -> o.minimumLinks.asJson)
  }
  final implicit val CreateDirectConnectGatewayAssociationResultEncoder: io.circe.Encoder[avias.directconnect.models.CreateDirectConnectGatewayAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociation" -> o.directConnectGatewayAssociation.asJson)
  }
  final implicit val VirtualGatewaysEncoder: io.circe.Encoder[avias.directconnect.models.VirtualGateways] = io.circe.Encoder.instance { o => 
    Json.obj("virtualGateways" -> o.virtualGateways.asJson)
  }
  final implicit val DeleteInterconnectResponseEncoder: io.circe.Encoder[avias.directconnect.models.DeleteInterconnectResponse] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectState" -> o.interconnectState.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val VirtualGatewayEncoder: io.circe.Encoder[avias.directconnect.models.VirtualGateway] = io.circe.Encoder.instance { o => 
    Json.obj("virtualGatewayId" -> o.virtualGatewayId.asJson, "virtualGatewayState" -> o.virtualGatewayState.asJson)
  }
  final implicit val InterconnectsEncoder: io.circe.Encoder[avias.directconnect.models.Interconnects] = io.circe.Encoder.instance { o => 
    Json.obj("interconnects" -> o.interconnects.asJson)
  }
  final implicit val DuplicateTagKeysExceptionEncoder: io.circe.Encoder[avias.directconnect.models.DuplicateTagKeysException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeTagsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArns" -> o.resourceArns.asJson)
  }
  final implicit val DeleteDirectConnectGatewayAssociationRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteDirectConnectGatewayAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val CreatePrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreatePrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "newPrivateVirtualInterface" -> o.newPrivateVirtualInterface.asJson)
  }
  final implicit val LagEncoder: io.circe.Encoder[avias.directconnect.models.Lag] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "lagState" -> o.lagState.asJson, "lagName" -> o.lagName.asJson, "ownerAccount" -> o.ownerAccount.asJson, "region" -> o.region.asJson, "allowsHostedConnections" -> o.allowsHostedConnections.asJson, "lagId" -> o.lagId.asJson, "connectionsBandwidth" -> o.connectionsBandwidth.asJson, "location" -> o.location.asJson, "connections" -> o.connections.asJson, "numberOfConnections" -> o.numberOfConnections.asJson, "minimumLinks" -> o.minimumLinks.asJson)
  }
  final implicit val ConfirmConnectionRequestEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val TooManyTagsExceptionEncoder: io.circe.Encoder[avias.directconnect.models.TooManyTagsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeVirtualInterfacesRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeVirtualInterfacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val TagResourceResponseEncoder: io.circe.Encoder[avias.directconnect.models.TagResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UntagResourceResponseEncoder: io.circe.Encoder[avias.directconnect.models.UntagResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LoaEncoder: io.circe.Encoder[avias.directconnect.models.Loa] = io.circe.Encoder.instance { o => 
    Json.obj("loaContent" -> o.loaContent.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val ConfirmPublicVirtualInterfaceResponseEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmPublicVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val ConfirmPublicVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmPublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val CreateDirectConnectGatewayRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateDirectConnectGatewayRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayName" -> o.directConnectGatewayName.asJson, "amazonSideAsn" -> o.amazonSideAsn.asJson)
  }
  final implicit val NewPublicVirtualInterfaceAllocationEncoder: io.circe.Encoder[avias.directconnect.models.NewPublicVirtualInterfaceAllocation] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DeleteVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsResultEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewayAssociationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociations" -> o.directConnectGatewayAssociations.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeInterconnectsRequestEncoder: io.circe.Encoder[avias.directconnect.models.DescribeInterconnectsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val BGPPeerEncoder: io.circe.Encoder[avias.directconnect.models.BGPPeer] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "asn" -> o.asn.asJson, "bgpStatus" -> o.bgpStatus.asJson, "bgpPeerState" -> o.bgpPeerState.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val ConfirmConnectionResponseEncoder: io.circe.Encoder[avias.directconnect.models.ConfirmConnectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("connectionState" -> o.connectionState.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsResultEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAttachments" -> o.directConnectGatewayAttachments.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val VirtualInterfacesEncoder: io.circe.Encoder[avias.directconnect.models.VirtualInterfaces] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaces" -> o.virtualInterfaces.asJson)
  }
  final implicit val CreateDirectConnectGatewayResultEncoder: io.circe.Encoder[avias.directconnect.models.CreateDirectConnectGatewayResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateway" -> o.directConnectGateway.asJson)
  }
  final implicit val CreatePublicVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreatePublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "newPublicVirtualInterface" -> o.newPublicVirtualInterface.asJson)
  }
  final implicit val DeleteLagRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson)
  }
  final implicit val DescribeDirectConnectGatewaysResultEncoder: io.circe.Encoder[avias.directconnect.models.DescribeDirectConnectGatewaysResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateways" -> o.directConnectGateways.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTagsResponseEncoder: io.circe.Encoder[avias.directconnect.models.DescribeTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourceTags" -> o.resourceTags.asJson)
  }
  final implicit val DescribeInterconnectLoaResponseEncoder: io.circe.Encoder[avias.directconnect.models.DescribeInterconnectLoaResponse] = io.circe.Encoder.instance { o => 
    Json.obj("loa" -> o.loa.asJson)
  }
  final implicit val NewPrivateVirtualInterfaceEncoder: io.circe.Encoder[avias.directconnect.models.NewPrivateVirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "addressFamily" -> o.addressFamily.asJson, "authKey" -> o.authKey.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val LocationsEncoder: io.circe.Encoder[avias.directconnect.models.Locations] = io.circe.Encoder.instance { o => 
    Json.obj("locations" -> o.locations.asJson)
  }
  final implicit val VirtualInterfaceEncoder: io.circe.Encoder[avias.directconnect.models.VirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "connectionId" -> o.connectionId.asJson, "virtualInterfaceType" -> o.virtualInterfaceType.asJson, "amazonAddress" -> o.amazonAddress.asJson, "virtualInterfaceState" -> o.virtualInterfaceState.asJson, "amazonSideAsn" -> o.amazonSideAsn.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "bgpPeers" -> o.bgpPeers.asJson, "addressFamily" -> o.addressFamily.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "authKey" -> o.authKey.asJson, "vlan" -> o.vlan.asJson, "location" -> o.location.asJson, "customerRouterConfig" -> o.customerRouterConfig.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val LagsEncoder: io.circe.Encoder[avias.directconnect.models.Lags] = io.circe.Encoder.instance { o => 
    Json.obj("lags" -> o.lags.asJson)
  }
  final implicit val DirectConnectClientExceptionEncoder: io.circe.Encoder[avias.directconnect.models.DirectConnectClientException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteConnectionRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val DirectConnectGatewayAttachmentEncoder: io.circe.Encoder[avias.directconnect.models.DirectConnectGatewayAttachment] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualInterfaceOwnerAccount" -> o.virtualInterfaceOwnerAccount.asJson, "attachmentState" -> o.attachmentState.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "stateChangeError" -> o.stateChangeError.asJson, "virtualInterfaceRegion" -> o.virtualInterfaceRegion.asJson)
  }
  final implicit val DirectConnectGatewayEncoder: io.circe.Encoder[avias.directconnect.models.DirectConnectGateway] = io.circe.Encoder.instance { o => 
    Json.obj("amazonSideAsn" -> o.amazonSideAsn.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "directConnectGatewayName" -> o.directConnectGatewayName.asJson, "stateChangeError" -> o.stateChangeError.asJson, "directConnectGatewayState" -> o.directConnectGatewayState.asJson)
  }
  final implicit val CreateInterconnectRequestEncoder: io.circe.Encoder[avias.directconnect.models.CreateInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectName" -> o.interconnectName.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val AllocatePrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[avias.directconnect.models.AllocatePrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "newPrivateVirtualInterfaceAllocation" -> o.newPrivateVirtualInterfaceAllocation.asJson)
  }
  final implicit val DeleteDirectConnectGatewayRequestEncoder: io.circe.Encoder[avias.directconnect.models.DeleteDirectConnectGatewayRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson)
  }
  final implicit val DisassociateConnectionFromLagRequestDecoder: io.circe.Decoder[avias.directconnect.models.DisassociateConnectionFromLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("lagId")).mapN(avias.directconnect.models.DisassociateConnectionFromLagRequest.apply _)
  }
  final implicit val ResourceTagDecoder: io.circe.Decoder[avias.directconnect.models.ResourceTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceArn"), o.get[scala.Option[scala.List[avias.directconnect.models.Tag]]]("tags")).mapN(avias.directconnect.models.ResourceTag.apply _)
  }
  final implicit val ConnectionsDecoder: io.circe.Decoder[avias.directconnect.models.Connections] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.Connection]]]("connections").map(avias.directconnect.models.Connections.apply _)
  }
  final implicit val DeleteDirectConnectGatewayAssociationResultDecoder: io.circe.Decoder[avias.directconnect.models.DeleteDirectConnectGatewayAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.DirectConnectGatewayAssociation]]("directConnectGatewayAssociation").map(avias.directconnect.models.DeleteDirectConnectGatewayAssociationResult.apply _)
  }
  final implicit val NewPrivateVirtualInterfaceAllocationDecoder: io.circe.Decoder[avias.directconnect.models.NewPrivateVirtualInterfaceAllocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(avias.directconnect.models.NewPrivateVirtualInterfaceAllocation.apply _)
  }
  final implicit val DescribeConnectionLoaResponseDecoder: io.circe.Decoder[avias.directconnect.models.DescribeConnectionLoaResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.Loa]]("loa").map(avias.directconnect.models.DescribeConnectionLoaResponse.apply _)
  }
  final implicit val DescribeConnectionsOnInterconnectRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeConnectionsOnInterconnectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("interconnectId").map(avias.directconnect.models.DescribeConnectionsOnInterconnectRequest.apply _)
  }
  final implicit val DeleteBGPPeerResponseDecoder: io.circe.Decoder[avias.directconnect.models.DeleteBGPPeerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.VirtualInterface]]("virtualInterface").map(avias.directconnect.models.DeleteBGPPeerResponse.apply _)
  }
  final implicit val CreateLagRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("lagName"), o.get[java.lang.String]("connectionsBandwidth"), o.get[java.lang.String]("location"), o.get[scala.Int]("numberOfConnections"), o.get[scala.Option[java.lang.String]]("connectionId")).mapN(avias.directconnect.models.CreateLagRequest.apply _)
  }
  final implicit val DeleteVirtualInterfaceResponseDecoder: io.circe.Decoder[avias.directconnect.models.DeleteVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(avias.directconnect.models.DeleteVirtualInterfaceResponse.apply _)
  }
  final implicit val InterconnectDecoder: io.circe.Decoder[avias.directconnect.models.Interconnect] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("interconnectName"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[java.time.Instant]]("loaIssueTime"), o.get[scala.Option[java.lang.String]]("interconnectId"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("interconnectState"), o.get[scala.Option[java.lang.String]]("bandwidth"), o.get[scala.Option[java.lang.String]]("location")).mapN(avias.directconnect.models.Interconnect.apply _)
  }
  final implicit val DirectConnectGatewayAssociationDecoder: io.circe.Decoder[avias.directconnect.models.DirectConnectGatewayAssociation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayOwnerAccount"), o.get[scala.Option[java.lang.String]]("virtualGatewayRegion"), o.get[scala.Option[java.lang.String]]("associationState"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(avias.directconnect.models.DirectConnectGatewayAssociation.apply _)
  }
  final implicit val DeleteDirectConnectGatewayResultDecoder: io.circe.Decoder[avias.directconnect.models.DeleteDirectConnectGatewayResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.DirectConnectGateway]]("directConnectGateway").map(avias.directconnect.models.DeleteDirectConnectGatewayResult.apply _)
  }
  final implicit val ConnectionDecoder: io.circe.Decoder[avias.directconnect.models.Connection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[java.lang.String]]("partnerName"), o.get[scala.Option[java.time.Instant]]("loaIssueTime"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("connectionName"), o.get[scala.Option[scala.Int]]("vlan"), o.get[scala.Option[java.lang.String]]("bandwidth"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("connectionState")).mapN(avias.directconnect.models.Connection.apply _)
  }
  final implicit val AllocateConnectionOnInterconnectRequestDecoder: io.circe.Decoder[avias.directconnect.models.AllocateConnectionOnInterconnectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ownerAccount"), o.get[java.lang.String]("interconnectId"), o.get[java.lang.String]("connectionName"), o.get[scala.Int]("vlan"), o.get[java.lang.String]("bandwidth")).mapN(avias.directconnect.models.AllocateConnectionOnInterconnectRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest.apply _)
  }
  final implicit val CreateBGPPeerResponseDecoder: io.circe.Decoder[avias.directconnect.models.CreateBGPPeerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.VirtualInterface]]("virtualInterface").map(avias.directconnect.models.CreateBGPPeerResponse.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[avias.directconnect.models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[scala.List[avias.directconnect.models.Tag]]("tags")).mapN(avias.directconnect.models.TagResourceRequest.apply _)
  }
  final implicit val AllocatePublicVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.AllocatePublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[avias.directconnect.models.NewPublicVirtualInterfaceAllocation]("newPublicVirtualInterfaceAllocation")).mapN(avias.directconnect.models.AllocatePublicVirtualInterfaceRequest.apply _)
  }
  final implicit val AssociateHostedConnectionRequestDecoder: io.circe.Decoder[avias.directconnect.models.AssociateHostedConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("parentConnectionId")).mapN(avias.directconnect.models.AssociateHostedConnectionRequest.apply _)
  }
  final implicit val DescribeInterconnectLoaRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeInterconnectLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("interconnectId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(avias.directconnect.models.DescribeInterconnectLoaRequest.apply _)
  }
  final implicit val DeleteBGPPeerRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteBGPPeerRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("customerAddress")).mapN(avias.directconnect.models.DeleteBGPPeerRequest.apply _)
  }
  final implicit val ConfirmPrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmPrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("virtualInterfaceId"), o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId")).mapN(avias.directconnect.models.ConfirmPrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteInterconnectRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteInterconnectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("interconnectId").map(avias.directconnect.models.DeleteInterconnectRequest.apply _)
  }
  final implicit val ConfirmPrivateVirtualInterfaceResponseDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmPrivateVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(avias.directconnect.models.ConfirmPrivateVirtualInterfaceResponse.apply _)
  }
  final implicit val CreateConnectionRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("location"), o.get[java.lang.String]("bandwidth"), o.get[java.lang.String]("connectionName"), o.get[scala.Option[java.lang.String]]("lagId")).mapN(avias.directconnect.models.CreateConnectionRequest.apply _)
  }
  final implicit val LocationDecoder: io.circe.Decoder[avias.directconnect.models.Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("locationCode"), o.get[scala.Option[java.lang.String]]("locationName")).mapN(avias.directconnect.models.Location.apply _)
  }
  final implicit val CreateBGPPeerRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateBGPPeerRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[avias.directconnect.models.NewBGPPeer]]("newBGPPeer")).mapN(avias.directconnect.models.CreateBGPPeerRequest.apply _)
  }
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[avias.directconnect.models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[scala.List[java.lang.String]]("tagKeys")).mapN(avias.directconnect.models.UntagResourceRequest.apply _)
  }
  final implicit val DescribeConnectionLoaRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeConnectionLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(avias.directconnect.models.DescribeConnectionLoaRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.directconnect.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(avias.directconnect.models.Tag.apply _)
  }
  final implicit val AllocateHostedConnectionRequestDecoder: io.circe.Decoder[avias.directconnect.models.AllocateHostedConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[java.lang.String]("connectionName"), o.get[scala.Int]("vlan"), o.get[java.lang.String]("bandwidth")).mapN(avias.directconnect.models.AllocateHostedConnectionRequest.apply _)
  }
  final implicit val DescribeLagsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeLagsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("lagId").map(avias.directconnect.models.DescribeLagsRequest.apply _)
  }
  final implicit val DescribeConnectionsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeConnectionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("connectionId").map(avias.directconnect.models.DescribeConnectionsRequest.apply _)
  }
  final implicit val NewPublicVirtualInterfaceDecoder: io.circe.Decoder[avias.directconnect.models.NewPublicVirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.List[avias.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(avias.directconnect.models.NewPublicVirtualInterface.apply _)
  }
  final implicit val DescribeDirectConnectGatewaysRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewaysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewaysRequest.apply _)
  }
  final implicit val AssociateConnectionWithLagRequestDecoder: io.circe.Decoder[avias.directconnect.models.AssociateConnectionWithLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("lagId")).mapN(avias.directconnect.models.AssociateConnectionWithLagRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayAssociationRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateDirectConnectGatewayAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayId"), o.get[java.lang.String]("virtualGatewayId")).mapN(avias.directconnect.models.CreateDirectConnectGatewayAssociationRequest.apply _)
  }
  final implicit val RouteFilterPrefixDecoder: io.circe.Decoder[avias.directconnect.models.RouteFilterPrefix] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("cidr").map(avias.directconnect.models.RouteFilterPrefix.apply _)
  }
  final implicit val DirectConnectServerExceptionDecoder: io.circe.Decoder[avias.directconnect.models.DirectConnectServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.directconnect.models.DirectConnectServerException.apply _)
  }
  final implicit val NewBGPPeerDecoder: io.circe.Decoder[avias.directconnect.models.NewBGPPeer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(avias.directconnect.models.NewBGPPeer.apply _)
  }
  final implicit val DescribeHostedConnectionsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeHostedConnectionsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(avias.directconnect.models.DescribeHostedConnectionsRequest.apply _)
  }
  final implicit val AssociateVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.AssociateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("virtualInterfaceId"), o.get[java.lang.String]("connectionId")).mapN(avias.directconnect.models.AssociateVirtualInterfaceRequest.apply _)
  }
  final implicit val DescribeLoaRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(avias.directconnect.models.DescribeLoaRequest.apply _)
  }
  final implicit val UpdateLagRequestDecoder: io.circe.Decoder[avias.directconnect.models.UpdateLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("lagId"), o.get[scala.Option[java.lang.String]]("lagName"), o.get[scala.Option[scala.Int]]("minimumLinks")).mapN(avias.directconnect.models.UpdateLagRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayAssociationResultDecoder: io.circe.Decoder[avias.directconnect.models.CreateDirectConnectGatewayAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.DirectConnectGatewayAssociation]]("directConnectGatewayAssociation").map(avias.directconnect.models.CreateDirectConnectGatewayAssociationResult.apply _)
  }
  final implicit val VirtualGatewaysDecoder: io.circe.Decoder[avias.directconnect.models.VirtualGateways] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.VirtualGateway]]]("virtualGateways").map(avias.directconnect.models.VirtualGateways.apply _)
  }
  final implicit val DeleteInterconnectResponseDecoder: io.circe.Decoder[avias.directconnect.models.DeleteInterconnectResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("interconnectState").map(avias.directconnect.models.DeleteInterconnectResponse.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest.apply _)
  }
  final implicit val VirtualGatewayDecoder: io.circe.Decoder[avias.directconnect.models.VirtualGateway] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayState")).mapN(avias.directconnect.models.VirtualGateway.apply _)
  }
  final implicit val InterconnectsDecoder: io.circe.Decoder[avias.directconnect.models.Interconnects] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.Interconnect]]]("interconnects").map(avias.directconnect.models.Interconnects.apply _)
  }
  final implicit val DuplicateTagKeysExceptionDecoder: io.circe.Decoder[avias.directconnect.models.DuplicateTagKeysException.type] = io.circe.Decoder.decodeUnit.as(avias.directconnect.models.DuplicateTagKeysException)
  final implicit val DescribeTagsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeTagsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("resourceArns").map(avias.directconnect.models.DescribeTagsRequest.apply _)
  }
  final implicit val DeleteDirectConnectGatewayAssociationRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteDirectConnectGatewayAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayId"), o.get[java.lang.String]("virtualGatewayId")).mapN(avias.directconnect.models.DeleteDirectConnectGatewayAssociationRequest.apply _)
  }
  final implicit val CreatePrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreatePrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[avias.directconnect.models.NewPrivateVirtualInterface]("newPrivateVirtualInterface")).mapN(avias.directconnect.models.CreatePrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val LagDecoder: io.circe.Decoder[avias.directconnect.models.Lag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("lagState"), o.get[scala.Option[java.lang.String]]("lagName"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[scala.Boolean]]("allowsHostedConnections"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("connectionsBandwidth"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[scala.List[avias.directconnect.models.Connection]]]("connections"), o.get[scala.Option[scala.Int]]("numberOfConnections"), o.get[scala.Option[scala.Int]]("minimumLinks")).mapN(avias.directconnect.models.Lag.apply _)
  }
  final implicit val ConfirmConnectionRequestDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmConnectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(avias.directconnect.models.ConfirmConnectionRequest.apply _)
  }
  final implicit val TooManyTagsExceptionDecoder: io.circe.Decoder[avias.directconnect.models.TooManyTagsException.type] = io.circe.Decoder.decodeUnit.as(avias.directconnect.models.TooManyTagsException)
  final implicit val DescribeVirtualInterfacesRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeVirtualInterfacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId")).mapN(avias.directconnect.models.DescribeVirtualInterfacesRequest.apply _)
  }
  final implicit val TagResourceResponseDecoder: io.circe.Decoder[avias.directconnect.models.TagResourceResponse.type] = io.circe.Decoder.decodeUnit.as(avias.directconnect.models.TagResourceResponse)
  final implicit val UntagResourceResponseDecoder: io.circe.Decoder[avias.directconnect.models.UntagResourceResponse.type] = io.circe.Decoder.decodeUnit.as(avias.directconnect.models.UntagResourceResponse)
  final implicit val LoaDecoder: io.circe.Decoder[avias.directconnect.models.Loa] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("loaContent"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(avias.directconnect.models.Loa.apply _)
  }
  final implicit val ConfirmPublicVirtualInterfaceResponseDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmPublicVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(avias.directconnect.models.ConfirmPublicVirtualInterfaceResponse.apply _)
  }
  final implicit val ConfirmPublicVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmPublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("virtualInterfaceId").map(avias.directconnect.models.ConfirmPublicVirtualInterfaceRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateDirectConnectGatewayRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayName"), o.get[scala.Option[scala.Long]]("amazonSideAsn")).mapN(avias.directconnect.models.CreateDirectConnectGatewayRequest.apply _)
  }
  final implicit val NewPublicVirtualInterfaceAllocationDecoder: io.circe.Decoder[avias.directconnect.models.NewPublicVirtualInterfaceAllocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.List[avias.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(avias.directconnect.models.NewPublicVirtualInterfaceAllocation.apply _)
  }
  final implicit val DeleteVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("virtualInterfaceId").map(avias.directconnect.models.DeleteVirtualInterfaceRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsResultDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewayAssociationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directconnect.models.DirectConnectGatewayAssociation]]]("directConnectGatewayAssociations"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewayAssociationsResult.apply _)
  }
  final implicit val DescribeInterconnectsRequestDecoder: io.circe.Decoder[avias.directconnect.models.DescribeInterconnectsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("interconnectId").map(avias.directconnect.models.DescribeInterconnectsRequest.apply _)
  }
  final implicit val BGPPeerDecoder: io.circe.Decoder[avias.directconnect.models.BGPPeer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("bgpStatus"), o.get[scala.Option[java.lang.String]]("bgpPeerState"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(avias.directconnect.models.BGPPeer.apply _)
  }
  final implicit val ConfirmConnectionResponseDecoder: io.circe.Decoder[avias.directconnect.models.ConfirmConnectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("connectionState").map(avias.directconnect.models.ConfirmConnectionResponse.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsResultDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directconnect.models.DirectConnectGatewayAttachment]]]("directConnectGatewayAttachments"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult.apply _)
  }
  final implicit val VirtualInterfacesDecoder: io.circe.Decoder[avias.directconnect.models.VirtualInterfaces] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.VirtualInterface]]]("virtualInterfaces").map(avias.directconnect.models.VirtualInterfaces.apply _)
  }
  final implicit val CreateDirectConnectGatewayResultDecoder: io.circe.Decoder[avias.directconnect.models.CreateDirectConnectGatewayResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.DirectConnectGateway]]("directConnectGateway").map(avias.directconnect.models.CreateDirectConnectGatewayResult.apply _)
  }
  final implicit val CreatePublicVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreatePublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[avias.directconnect.models.NewPublicVirtualInterface]("newPublicVirtualInterface")).mapN(avias.directconnect.models.CreatePublicVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteLagRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteLagRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("lagId").map(avias.directconnect.models.DeleteLagRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewaysResultDecoder: io.circe.Decoder[avias.directconnect.models.DescribeDirectConnectGatewaysResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directconnect.models.DirectConnectGateway]]]("directConnectGateways"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.directconnect.models.DescribeDirectConnectGatewaysResult.apply _)
  }
  final implicit val DescribeTagsResponseDecoder: io.circe.Decoder[avias.directconnect.models.DescribeTagsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.ResourceTag]]]("resourceTags").map(avias.directconnect.models.DescribeTagsResponse.apply _)
  }
  final implicit val DescribeInterconnectLoaResponseDecoder: io.circe.Decoder[avias.directconnect.models.DescribeInterconnectLoaResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directconnect.models.Loa]]("loa").map(avias.directconnect.models.DescribeInterconnectLoaResponse.apply _)
  }
  final implicit val NewPrivateVirtualInterfaceDecoder: io.circe.Decoder[avias.directconnect.models.NewPrivateVirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("authKey"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(avias.directconnect.models.NewPrivateVirtualInterface.apply _)
  }
  final implicit val LocationsDecoder: io.circe.Decoder[avias.directconnect.models.Locations] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.Location]]]("locations").map(avias.directconnect.models.Locations.apply _)
  }
  final implicit val VirtualInterfaceDecoder: io.circe.Decoder[avias.directconnect.models.VirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceType"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("virtualInterfaceState"), o.get[scala.Option[scala.Long]]("amazonSideAsn"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[scala.List[avias.directconnect.models.BGPPeer]]]("bgpPeers"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.List[avias.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("virtualInterfaceName"), o.get[scala.Option[java.lang.String]]("authKey"), o.get[scala.Option[scala.Int]]("vlan"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("customerRouterConfig"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(avias.directconnect.models.VirtualInterface.apply _)
  }
  final implicit val LagsDecoder: io.circe.Decoder[avias.directconnect.models.Lags] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directconnect.models.Lag]]]("lags").map(avias.directconnect.models.Lags.apply _)
  }
  final implicit val DirectConnectClientExceptionDecoder: io.circe.Decoder[avias.directconnect.models.DirectConnectClientException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.directconnect.models.DirectConnectClientException.apply _)
  }
  final implicit val DeleteConnectionRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteConnectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(avias.directconnect.models.DeleteConnectionRequest.apply _)
  }
  final implicit val DirectConnectGatewayAttachmentDecoder: io.circe.Decoder[avias.directconnect.models.DirectConnectGatewayAttachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceOwnerAccount"), o.get[scala.Option[java.lang.String]]("attachmentState"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("virtualInterfaceRegion")).mapN(avias.directconnect.models.DirectConnectGatewayAttachment.apply _)
  }
  final implicit val DirectConnectGatewayDecoder: io.circe.Decoder[avias.directconnect.models.DirectConnectGateway] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("amazonSideAsn"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("directConnectGatewayName"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("directConnectGatewayState")).mapN(avias.directconnect.models.DirectConnectGateway.apply _)
  }
  final implicit val CreateInterconnectRequestDecoder: io.circe.Decoder[avias.directconnect.models.CreateInterconnectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("interconnectName"), o.get[java.lang.String]("bandwidth"), o.get[java.lang.String]("location"), o.get[scala.Option[java.lang.String]]("lagId")).mapN(avias.directconnect.models.CreateInterconnectRequest.apply _)
  }
  final implicit val AllocatePrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[avias.directconnect.models.AllocatePrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[avias.directconnect.models.NewPrivateVirtualInterfaceAllocation]("newPrivateVirtualInterfaceAllocation")).mapN(avias.directconnect.models.AllocatePrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteDirectConnectGatewayRequestDecoder: io.circe.Decoder[avias.directconnect.models.DeleteDirectConnectGatewayRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("directConnectGatewayId").map(avias.directconnect.models.DeleteDirectConnectGatewayRequest.apply _)
  }
}