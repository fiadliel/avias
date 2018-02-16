package org.lyranthe.araethura.directconnect
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DisassociateConnectionFromLagRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DisassociateConnectionFromLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val ResourceTagEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ResourceTag] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ConnectionsEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Connections] = io.circe.Encoder.instance { o => 
    Json.obj("connections" -> o.connections.asJson)
  }
  final implicit val DeleteDirectConnectGatewayAssociationResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociation" -> o.directConnectGatewayAssociation.asJson)
  }
  final implicit val NewPrivateVirtualInterfaceAllocationEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterfaceAllocation] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeConnectionLoaResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaResponse] = io.circe.Encoder.instance { o => 
    Json.obj("loa" -> o.loa.asJson)
  }
  final implicit val DescribeConnectionsOnInterconnectRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionsOnInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val DeleteBGPPeerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteBGPPeerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterface" -> o.virtualInterface.asJson)
  }
  final implicit val CreateLagRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagName" -> o.lagName.asJson, "connectionsBandwidth" -> o.connectionsBandwidth.asJson, "location" -> o.location.asJson, "numberOfConnections" -> o.numberOfConnections.asJson, "connectionId" -> o.connectionId.asJson)
  }
  final implicit val DeleteVirtualInterfaceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val InterconnectEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Interconnect] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "interconnectName" -> o.interconnectName.asJson, "region" -> o.region.asJson, "loaIssueTime" -> o.loaIssueTime.asJson, "interconnectId" -> o.interconnectId.asJson, "lagId" -> o.lagId.asJson, "interconnectState" -> o.interconnectState.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson)
  }
  final implicit val DirectConnectGatewayAssociationEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayOwnerAccount" -> o.virtualGatewayOwnerAccount.asJson, "virtualGatewayRegion" -> o.virtualGatewayRegion.asJson, "associationState" -> o.associationState.asJson, "stateChangeError" -> o.stateChangeError.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val DeleteDirectConnectGatewayResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateway" -> o.directConnectGateway.asJson)
  }
  final implicit val ConnectionEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Connection] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "region" -> o.region.asJson, "partnerName" -> o.partnerName.asJson, "loaIssueTime" -> o.loaIssueTime.asJson, "lagId" -> o.lagId.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson, "connectionState" -> o.connectionState.asJson)
  }
  final implicit val AllocateConnectionOnInterconnectRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AllocateConnectionOnInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ownerAccount" -> o.ownerAccount.asJson, "interconnectId" -> o.interconnectId.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateBGPPeerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateBGPPeerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterface" -> o.virtualInterface.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val AllocatePublicVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AllocatePublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "newPublicVirtualInterfaceAllocation" -> o.newPublicVirtualInterfaceAllocation.asJson)
  }
  final implicit val AssociateHostedConnectionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AssociateHostedConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "parentConnectionId" -> o.parentConnectionId.asJson)
  }
  final implicit val DescribeInterconnectLoaRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val DeleteBGPPeerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteBGPPeerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "asn" -> o.asn.asJson, "customerAddress" -> o.customerAddress.asJson)
  }
  final implicit val ConfirmPrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson)
  }
  final implicit val DeleteInterconnectRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val ConfirmPrivateVirtualInterfaceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val CreateConnectionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "bandwidth" -> o.bandwidth.asJson, "connectionName" -> o.connectionName.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val LocationEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Location] = io.circe.Encoder.instance { o => 
    Json.obj("locationCode" -> o.locationCode.asJson, "locationName" -> o.locationName.asJson)
  }
  final implicit val CreateBGPPeerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateBGPPeerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "newBGPPeer" -> o.newBGPPeer.asJson)
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tagKeys" -> o.tagKeys.asJson)
  }
  final implicit val DescribeConnectionLoaRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val AllocateHostedConnectionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AllocateHostedConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "connectionName" -> o.connectionName.asJson, "vlan" -> o.vlan.asJson, "bandwidth" -> o.bandwidth.asJson)
  }
  final implicit val DescribeLagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeLagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson)
  }
  final implicit val DescribeConnectionsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val NewPublicVirtualInterfaceEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeDirectConnectGatewaysRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociateConnectionWithLagRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AssociateConnectionWithLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val CreateDirectConnectGatewayAssociationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val RouteFilterPrefixEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.RouteFilterPrefix] = io.circe.Encoder.instance { o => 
    Json.obj("cidr" -> o.cidr.asJson)
  }
  final implicit val DirectConnectServerExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DirectConnectServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val NewBGPPeerEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.NewBGPPeer] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "asn" -> o.asn.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DescribeHostedConnectionsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeHostedConnectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val AssociateVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AssociateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson, "connectionId" -> o.connectionId.asJson)
  }
  final implicit val DescribeLoaRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeLoaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "providerName" -> o.providerName.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val UpdateLagRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.UpdateLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson, "lagName" -> o.lagName.asJson, "minimumLinks" -> o.minimumLinks.asJson)
  }
  final implicit val CreateDirectConnectGatewayAssociationResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociation" -> o.directConnectGatewayAssociation.asJson)
  }
  final implicit val VirtualGatewaysEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.VirtualGateways] = io.circe.Encoder.instance { o => 
    Json.obj("virtualGateways" -> o.virtualGateways.asJson)
  }
  final implicit val DeleteInterconnectResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteInterconnectResponse] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectState" -> o.interconnectState.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val VirtualGatewayEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.VirtualGateway] = io.circe.Encoder.instance { o => 
    Json.obj("virtualGatewayId" -> o.virtualGatewayId.asJson, "virtualGatewayState" -> o.virtualGatewayState.asJson)
  }
  final implicit val InterconnectsEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Interconnects] = io.circe.Encoder.instance { o => 
    Json.obj("interconnects" -> o.interconnects.asJson)
  }
  final implicit val DuplicateTagKeysExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DuplicateTagKeysException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArns" -> o.resourceArns.asJson)
  }
  final implicit val DeleteDirectConnectGatewayAssociationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val CreatePrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreatePrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "newPrivateVirtualInterface" -> o.newPrivateVirtualInterface.asJson)
  }
  final implicit val LagEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Lag] = io.circe.Encoder.instance { o => 
    Json.obj("awsDevice" -> o.awsDevice.asJson, "lagState" -> o.lagState.asJson, "lagName" -> o.lagName.asJson, "ownerAccount" -> o.ownerAccount.asJson, "region" -> o.region.asJson, "allowsHostedConnections" -> o.allowsHostedConnections.asJson, "lagId" -> o.lagId.asJson, "connectionsBandwidth" -> o.connectionsBandwidth.asJson, "location" -> o.location.asJson, "connections" -> o.connections.asJson, "numberOfConnections" -> o.numberOfConnections.asJson, "minimumLinks" -> o.minimumLinks.asJson)
  }
  final implicit val ConfirmConnectionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val TooManyTagsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.TooManyTagsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeVirtualInterfacesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeVirtualInterfacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val TagResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.TagResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UntagResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.UntagResourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LoaEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Loa] = io.circe.Encoder.instance { o => 
    Json.obj("loaContent" -> o.loaContent.asJson, "loaContentType" -> o.loaContentType.asJson)
  }
  final implicit val ConfirmPublicVirtualInterfaceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceState" -> o.virtualInterfaceState.asJson)
  }
  final implicit val ConfirmPublicVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val CreateDirectConnectGatewayRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayName" -> o.directConnectGatewayName.asJson, "amazonSideAsn" -> o.amazonSideAsn.asJson)
  }
  final implicit val NewPublicVirtualInterfaceAllocationEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterfaceAllocation] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val DeleteVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaceId" -> o.virtualInterfaceId.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAssociations" -> o.directConnectGatewayAssociations.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeInterconnectsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectId" -> o.interconnectId.asJson)
  }
  final implicit val BGPPeerEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.BGPPeer] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "addressFamily" -> o.addressFamily.asJson, "asn" -> o.asn.asJson, "bgpStatus" -> o.bgpStatus.asJson, "bgpPeerState" -> o.bgpPeerState.asJson, "authKey" -> o.authKey.asJson)
  }
  final implicit val ConfirmConnectionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.ConfirmConnectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("connectionState" -> o.connectionState.asJson)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayAttachments" -> o.directConnectGatewayAttachments.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val VirtualInterfacesEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.VirtualInterfaces] = io.circe.Encoder.instance { o => 
    Json.obj("virtualInterfaces" -> o.virtualInterfaces.asJson)
  }
  final implicit val CreateDirectConnectGatewayResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateway" -> o.directConnectGateway.asJson)
  }
  final implicit val CreatePublicVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreatePublicVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "newPublicVirtualInterface" -> o.newPublicVirtualInterface.asJson)
  }
  final implicit val DeleteLagRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteLagRequest] = io.circe.Encoder.instance { o => 
    Json.obj("lagId" -> o.lagId.asJson)
  }
  final implicit val DescribeDirectConnectGatewaysResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysResult] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGateways" -> o.directConnectGateways.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourceTags" -> o.resourceTags.asJson)
  }
  final implicit val DescribeInterconnectLoaResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaResponse] = io.circe.Encoder.instance { o => 
    Json.obj("loa" -> o.loa.asJson)
  }
  final implicit val NewPrivateVirtualInterfaceEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "vlan" -> o.vlan.asJson, "customerAddress" -> o.customerAddress.asJson, "amazonAddress" -> o.amazonAddress.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "addressFamily" -> o.addressFamily.asJson, "authKey" -> o.authKey.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val LocationsEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Locations] = io.circe.Encoder.instance { o => 
    Json.obj("locations" -> o.locations.asJson)
  }
  final implicit val VirtualInterfaceEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.VirtualInterface] = io.circe.Encoder.instance { o => 
    Json.obj("customerAddress" -> o.customerAddress.asJson, "connectionId" -> o.connectionId.asJson, "virtualInterfaceType" -> o.virtualInterfaceType.asJson, "amazonAddress" -> o.amazonAddress.asJson, "virtualInterfaceState" -> o.virtualInterfaceState.asJson, "amazonSideAsn" -> o.amazonSideAsn.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "bgpPeers" -> o.bgpPeers.asJson, "addressFamily" -> o.addressFamily.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "routeFilterPrefixes" -> o.routeFilterPrefixes.asJson, "asn" -> o.asn.asJson, "virtualInterfaceName" -> o.virtualInterfaceName.asJson, "authKey" -> o.authKey.asJson, "vlan" -> o.vlan.asJson, "location" -> o.location.asJson, "customerRouterConfig" -> o.customerRouterConfig.asJson, "virtualGatewayId" -> o.virtualGatewayId.asJson)
  }
  final implicit val LagsEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.Lags] = io.circe.Encoder.instance { o => 
    Json.obj("lags" -> o.lags.asJson)
  }
  final implicit val DirectConnectClientExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DirectConnectClientException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteConnectionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteConnectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson)
  }
  final implicit val DirectConnectGatewayAttachmentEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAttachment] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson, "virtualInterfaceOwnerAccount" -> o.virtualInterfaceOwnerAccount.asJson, "attachmentState" -> o.attachmentState.asJson, "virtualInterfaceId" -> o.virtualInterfaceId.asJson, "stateChangeError" -> o.stateChangeError.asJson, "virtualInterfaceRegion" -> o.virtualInterfaceRegion.asJson)
  }
  final implicit val DirectConnectGatewayEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DirectConnectGateway] = io.circe.Encoder.instance { o => 
    Json.obj("amazonSideAsn" -> o.amazonSideAsn.asJson, "directConnectGatewayId" -> o.directConnectGatewayId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "directConnectGatewayName" -> o.directConnectGatewayName.asJson, "stateChangeError" -> o.stateChangeError.asJson, "directConnectGatewayState" -> o.directConnectGatewayState.asJson)
  }
  final implicit val CreateInterconnectRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.CreateInterconnectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("interconnectName" -> o.interconnectName.asJson, "bandwidth" -> o.bandwidth.asJson, "location" -> o.location.asJson, "lagId" -> o.lagId.asJson)
  }
  final implicit val AllocatePrivateVirtualInterfaceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.AllocatePrivateVirtualInterfaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectionId" -> o.connectionId.asJson, "ownerAccount" -> o.ownerAccount.asJson, "newPrivateVirtualInterfaceAllocation" -> o.newPrivateVirtualInterfaceAllocation.asJson)
  }
  final implicit val DeleteDirectConnectGatewayRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayRequest] = io.circe.Encoder.instance { o => 
    Json.obj("directConnectGatewayId" -> o.directConnectGatewayId.asJson)
  }
  final implicit val DisassociateConnectionFromLagRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DisassociateConnectionFromLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("lagId")).mapN(org.lyranthe.araethura.directconnect.models.DisassociateConnectionFromLagRequest.apply _)
  }
  final implicit val ResourceTagDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ResourceTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceArn"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Tag]]]("tags")).mapN(org.lyranthe.araethura.directconnect.models.ResourceTag.apply _)
  }
  final implicit val ConnectionsDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Connections] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Connection]]]("connections").map(org.lyranthe.araethura.directconnect.models.Connections.apply _)
  }
  final implicit val DeleteDirectConnectGatewayAssociationResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation]]("directConnectGatewayAssociation").map(org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationResult.apply _)
  }
  final implicit val NewPrivateVirtualInterfaceAllocationDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterfaceAllocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterfaceAllocation.apply _)
  }
  final implicit val DescribeConnectionLoaResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.Loa]]("loa").map(org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaResponse.apply _)
  }
  final implicit val DescribeConnectionsOnInterconnectRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionsOnInterconnectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("interconnectId").map(org.lyranthe.araethura.directconnect.models.DescribeConnectionsOnInterconnectRequest.apply _)
  }
  final implicit val DeleteBGPPeerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteBGPPeerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.VirtualInterface]]("virtualInterface").map(org.lyranthe.araethura.directconnect.models.DeleteBGPPeerResponse.apply _)
  }
  final implicit val CreateLagRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("lagName"), o.get[java.lang.String]("connectionsBandwidth"), o.get[java.lang.String]("location"), o.get[scala.Int]("numberOfConnections"), o.get[scala.Option[java.lang.String]]("connectionId")).mapN(org.lyranthe.araethura.directconnect.models.CreateLagRequest.apply _)
  }
  final implicit val DeleteVirtualInterfaceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceResponse.apply _)
  }
  final implicit val InterconnectDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Interconnect] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("interconnectName"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[java.time.Instant]]("loaIssueTime"), o.get[scala.Option[java.lang.String]]("interconnectId"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("interconnectState"), o.get[scala.Option[java.lang.String]]("bandwidth"), o.get[scala.Option[java.lang.String]]("location")).mapN(org.lyranthe.araethura.directconnect.models.Interconnect.apply _)
  }
  final implicit val DirectConnectGatewayAssociationDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayOwnerAccount"), o.get[scala.Option[java.lang.String]]("virtualGatewayRegion"), o.get[scala.Option[java.lang.String]]("associationState"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation.apply _)
  }
  final implicit val DeleteDirectConnectGatewayResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.DirectConnectGateway]]("directConnectGateway").map(org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayResult.apply _)
  }
  final implicit val ConnectionDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Connection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[java.lang.String]]("partnerName"), o.get[scala.Option[java.time.Instant]]("loaIssueTime"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("connectionName"), o.get[scala.Option[scala.Int]]("vlan"), o.get[scala.Option[java.lang.String]]("bandwidth"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("connectionState")).mapN(org.lyranthe.araethura.directconnect.models.Connection.apply _)
  }
  final implicit val AllocateConnectionOnInterconnectRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AllocateConnectionOnInterconnectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ownerAccount"), o.get[java.lang.String]("interconnectId"), o.get[java.lang.String]("connectionName"), o.get[scala.Int]("vlan"), o.get[java.lang.String]("bandwidth")).mapN(org.lyranthe.araethura.directconnect.models.AllocateConnectionOnInterconnectRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsRequest.apply _)
  }
  final implicit val CreateBGPPeerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateBGPPeerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.VirtualInterface]]("virtualInterface").map(org.lyranthe.araethura.directconnect.models.CreateBGPPeerResponse.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[scala.List[org.lyranthe.araethura.directconnect.models.Tag]]("tags")).mapN(org.lyranthe.araethura.directconnect.models.TagResourceRequest.apply _)
  }
  final implicit val AllocatePublicVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AllocatePublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterfaceAllocation]("newPublicVirtualInterfaceAllocation")).mapN(org.lyranthe.araethura.directconnect.models.AllocatePublicVirtualInterfaceRequest.apply _)
  }
  final implicit val AssociateHostedConnectionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AssociateHostedConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("parentConnectionId")).mapN(org.lyranthe.araethura.directconnect.models.AssociateHostedConnectionRequest.apply _)
  }
  final implicit val DescribeInterconnectLoaRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("interconnectId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaRequest.apply _)
  }
  final implicit val DeleteBGPPeerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteBGPPeerRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("customerAddress")).mapN(org.lyranthe.araethura.directconnect.models.DeleteBGPPeerRequest.apply _)
  }
  final implicit val ConfirmPrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("virtualInterfaceId"), o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteInterconnectRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteInterconnectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("interconnectId").map(org.lyranthe.araethura.directconnect.models.DeleteInterconnectRequest.apply _)
  }
  final implicit val ConfirmPrivateVirtualInterfaceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(org.lyranthe.araethura.directconnect.models.ConfirmPrivateVirtualInterfaceResponse.apply _)
  }
  final implicit val CreateConnectionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("location"), o.get[java.lang.String]("bandwidth"), o.get[java.lang.String]("connectionName"), o.get[scala.Option[java.lang.String]]("lagId")).mapN(org.lyranthe.araethura.directconnect.models.CreateConnectionRequest.apply _)
  }
  final implicit val LocationDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("locationCode"), o.get[scala.Option[java.lang.String]]("locationName")).mapN(org.lyranthe.araethura.directconnect.models.Location.apply _)
  }
  final implicit val CreateBGPPeerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateBGPPeerRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[org.lyranthe.araethura.directconnect.models.NewBGPPeer]]("newBGPPeer")).mapN(org.lyranthe.araethura.directconnect.models.CreateBGPPeerRequest.apply _)
  }
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[scala.List[java.lang.String]]("tagKeys")).mapN(org.lyranthe.araethura.directconnect.models.UntagResourceRequest.apply _)
  }
  final implicit val DescribeConnectionLoaRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(org.lyranthe.araethura.directconnect.models.DescribeConnectionLoaRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(org.lyranthe.araethura.directconnect.models.Tag.apply _)
  }
  final implicit val AllocateHostedConnectionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AllocateHostedConnectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[java.lang.String]("connectionName"), o.get[scala.Int]("vlan"), o.get[java.lang.String]("bandwidth")).mapN(org.lyranthe.araethura.directconnect.models.AllocateHostedConnectionRequest.apply _)
  }
  final implicit val DescribeLagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeLagsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("lagId").map(org.lyranthe.araethura.directconnect.models.DescribeLagsRequest.apply _)
  }
  final implicit val DescribeConnectionsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeConnectionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("connectionId").map(org.lyranthe.araethura.directconnect.models.DescribeConnectionsRequest.apply _)
  }
  final implicit val NewPublicVirtualInterfaceDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterface.apply _)
  }
  final implicit val DescribeDirectConnectGatewaysRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysRequest.apply _)
  }
  final implicit val AssociateConnectionWithLagRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AssociateConnectionWithLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("lagId")).mapN(org.lyranthe.araethura.directconnect.models.AssociateConnectionWithLagRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayAssociationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayId"), o.get[java.lang.String]("virtualGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationRequest.apply _)
  }
  final implicit val RouteFilterPrefixDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.RouteFilterPrefix] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("cidr").map(org.lyranthe.araethura.directconnect.models.RouteFilterPrefix.apply _)
  }
  final implicit val DirectConnectServerExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DirectConnectServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.directconnect.models.DirectConnectServerException.apply _)
  }
  final implicit val NewBGPPeerDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.NewBGPPeer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(org.lyranthe.araethura.directconnect.models.NewBGPPeer.apply _)
  }
  final implicit val DescribeHostedConnectionsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeHostedConnectionsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(org.lyranthe.araethura.directconnect.models.DescribeHostedConnectionsRequest.apply _)
  }
  final implicit val AssociateVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AssociateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("virtualInterfaceId"), o.get[java.lang.String]("connectionId")).mapN(org.lyranthe.araethura.directconnect.models.AssociateVirtualInterfaceRequest.apply _)
  }
  final implicit val DescribeLoaRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeLoaRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[scala.Option[java.lang.String]]("providerName"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(org.lyranthe.araethura.directconnect.models.DescribeLoaRequest.apply _)
  }
  final implicit val UpdateLagRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.UpdateLagRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("lagId"), o.get[scala.Option[java.lang.String]]("lagName"), o.get[scala.Option[scala.Int]]("minimumLinks")).mapN(org.lyranthe.araethura.directconnect.models.UpdateLagRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayAssociationResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation]]("directConnectGatewayAssociation").map(org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayAssociationResult.apply _)
  }
  final implicit val VirtualGatewaysDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.VirtualGateways] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.VirtualGateway]]]("virtualGateways").map(org.lyranthe.araethura.directconnect.models.VirtualGateways.apply _)
  }
  final implicit val DeleteInterconnectResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteInterconnectResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("interconnectState").map(org.lyranthe.araethura.directconnect.models.DeleteInterconnectResponse.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsRequest.apply _)
  }
  final implicit val VirtualGatewayDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.VirtualGateway] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("virtualGatewayId"), o.get[scala.Option[java.lang.String]]("virtualGatewayState")).mapN(org.lyranthe.araethura.directconnect.models.VirtualGateway.apply _)
  }
  final implicit val InterconnectsDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Interconnects] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Interconnect]]]("interconnects").map(org.lyranthe.araethura.directconnect.models.Interconnects.apply _)
  }
  final implicit val DuplicateTagKeysExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DuplicateTagKeysException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directconnect.models.DuplicateTagKeysException)
  final implicit val DescribeTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeTagsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("resourceArns").map(org.lyranthe.araethura.directconnect.models.DescribeTagsRequest.apply _)
  }
  final implicit val DeleteDirectConnectGatewayAssociationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayId"), o.get[java.lang.String]("virtualGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayAssociationRequest.apply _)
  }
  final implicit val CreatePrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreatePrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterface]("newPrivateVirtualInterface")).mapN(org.lyranthe.araethura.directconnect.models.CreatePrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val LagDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Lag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("awsDevice"), o.get[scala.Option[java.lang.String]]("lagState"), o.get[scala.Option[java.lang.String]]("lagName"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[scala.Boolean]]("allowsHostedConnections"), o.get[scala.Option[java.lang.String]]("lagId"), o.get[scala.Option[java.lang.String]]("connectionsBandwidth"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Connection]]]("connections"), o.get[scala.Option[scala.Int]]("numberOfConnections"), o.get[scala.Option[scala.Int]]("minimumLinks")).mapN(org.lyranthe.araethura.directconnect.models.Lag.apply _)
  }
  final implicit val ConfirmConnectionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmConnectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(org.lyranthe.araethura.directconnect.models.ConfirmConnectionRequest.apply _)
  }
  final implicit val TooManyTagsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.TooManyTagsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directconnect.models.TooManyTagsException)
  final implicit val DescribeVirtualInterfacesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeVirtualInterfacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId")).mapN(org.lyranthe.araethura.directconnect.models.DescribeVirtualInterfacesRequest.apply _)
  }
  final implicit val TagResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.TagResourceResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directconnect.models.TagResourceResponse)
  final implicit val UntagResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.UntagResourceResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directconnect.models.UntagResourceResponse)
  final implicit val LoaDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Loa] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("loaContent"), o.get[scala.Option[java.lang.String]]("loaContentType")).mapN(org.lyranthe.araethura.directconnect.models.Loa.apply _)
  }
  final implicit val ConfirmPublicVirtualInterfaceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("virtualInterfaceState").map(org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceResponse.apply _)
  }
  final implicit val ConfirmPublicVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("virtualInterfaceId").map(org.lyranthe.araethura.directconnect.models.ConfirmPublicVirtualInterfaceRequest.apply _)
  }
  final implicit val CreateDirectConnectGatewayRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("directConnectGatewayName"), o.get[scala.Option[scala.Long]]("amazonSideAsn")).mapN(org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayRequest.apply _)
  }
  final implicit val NewPublicVirtualInterfaceAllocationDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterfaceAllocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterfaceAllocation.apply _)
  }
  final implicit val DeleteVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("virtualInterfaceId").map(org.lyranthe.araethura.directconnect.models.DeleteVirtualInterfaceRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAssociationsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAssociation]]]("directConnectGatewayAssociations"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAssociationsResult.apply _)
  }
  final implicit val DescribeInterconnectsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("interconnectId").map(org.lyranthe.araethura.directconnect.models.DescribeInterconnectsRequest.apply _)
  }
  final implicit val BGPPeerDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.BGPPeer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("bgpStatus"), o.get[scala.Option[java.lang.String]]("bgpPeerState"), o.get[scala.Option[java.lang.String]]("authKey")).mapN(org.lyranthe.araethura.directconnect.models.BGPPeer.apply _)
  }
  final implicit val ConfirmConnectionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.ConfirmConnectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("connectionState").map(org.lyranthe.araethura.directconnect.models.ConfirmConnectionResponse.apply _)
  }
  final implicit val DescribeDirectConnectGatewayAttachmentsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAttachment]]]("directConnectGatewayAttachments"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewayAttachmentsResult.apply _)
  }
  final implicit val VirtualInterfacesDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.VirtualInterfaces] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.VirtualInterface]]]("virtualInterfaces").map(org.lyranthe.araethura.directconnect.models.VirtualInterfaces.apply _)
  }
  final implicit val CreateDirectConnectGatewayResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.DirectConnectGateway]]("directConnectGateway").map(org.lyranthe.araethura.directconnect.models.CreateDirectConnectGatewayResult.apply _)
  }
  final implicit val CreatePublicVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreatePublicVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[org.lyranthe.araethura.directconnect.models.NewPublicVirtualInterface]("newPublicVirtualInterface")).mapN(org.lyranthe.araethura.directconnect.models.CreatePublicVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteLagRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteLagRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("lagId").map(org.lyranthe.araethura.directconnect.models.DeleteLagRequest.apply _)
  }
  final implicit val DescribeDirectConnectGatewaysResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.DirectConnectGateway]]]("directConnectGateways"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.directconnect.models.DescribeDirectConnectGatewaysResult.apply _)
  }
  final implicit val DescribeTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeTagsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.ResourceTag]]]("resourceTags").map(org.lyranthe.araethura.directconnect.models.DescribeTagsResponse.apply _)
  }
  final implicit val DescribeInterconnectLoaResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directconnect.models.Loa]]("loa").map(org.lyranthe.araethura.directconnect.models.DescribeInterconnectLoaResponse.apply _)
  }
  final implicit val NewPrivateVirtualInterfaceDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("asn"), o.get[java.lang.String]("virtualInterfaceName"), o.get[scala.Int]("vlan"), o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("authKey"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterface.apply _)
  }
  final implicit val LocationsDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Locations] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Location]]]("locations").map(org.lyranthe.araethura.directconnect.models.Locations.apply _)
  }
  final implicit val VirtualInterfaceDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.VirtualInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("customerAddress"), o.get[scala.Option[java.lang.String]]("connectionId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceType"), o.get[scala.Option[java.lang.String]]("amazonAddress"), o.get[scala.Option[java.lang.String]]("virtualInterfaceState"), o.get[scala.Option[scala.Long]]("amazonSideAsn"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.BGPPeer]]]("bgpPeers"), o.get[scala.Option[java.lang.String]]("addressFamily"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.RouteFilterPrefix]]]("routeFilterPrefixes"), o.get[scala.Option[scala.Int]]("asn"), o.get[scala.Option[java.lang.String]]("virtualInterfaceName"), o.get[scala.Option[java.lang.String]]("authKey"), o.get[scala.Option[scala.Int]]("vlan"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("customerRouterConfig"), o.get[scala.Option[java.lang.String]]("virtualGatewayId")).mapN(org.lyranthe.araethura.directconnect.models.VirtualInterface.apply _)
  }
  final implicit val LagsDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.Lags] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directconnect.models.Lag]]]("lags").map(org.lyranthe.araethura.directconnect.models.Lags.apply _)
  }
  final implicit val DirectConnectClientExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DirectConnectClientException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.directconnect.models.DirectConnectClientException.apply _)
  }
  final implicit val DeleteConnectionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteConnectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectionId").map(org.lyranthe.araethura.directconnect.models.DeleteConnectionRequest.apply _)
  }
  final implicit val DirectConnectGatewayAttachmentDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAttachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("virtualInterfaceOwnerAccount"), o.get[scala.Option[java.lang.String]]("attachmentState"), o.get[scala.Option[java.lang.String]]("virtualInterfaceId"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("virtualInterfaceRegion")).mapN(org.lyranthe.araethura.directconnect.models.DirectConnectGatewayAttachment.apply _)
  }
  final implicit val DirectConnectGatewayDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DirectConnectGateway] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("amazonSideAsn"), o.get[scala.Option[java.lang.String]]("directConnectGatewayId"), o.get[scala.Option[java.lang.String]]("ownerAccount"), o.get[scala.Option[java.lang.String]]("directConnectGatewayName"), o.get[scala.Option[java.lang.String]]("stateChangeError"), o.get[scala.Option[java.lang.String]]("directConnectGatewayState")).mapN(org.lyranthe.araethura.directconnect.models.DirectConnectGateway.apply _)
  }
  final implicit val CreateInterconnectRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.CreateInterconnectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("interconnectName"), o.get[java.lang.String]("bandwidth"), o.get[java.lang.String]("location"), o.get[scala.Option[java.lang.String]]("lagId")).mapN(org.lyranthe.araethura.directconnect.models.CreateInterconnectRequest.apply _)
  }
  final implicit val AllocatePrivateVirtualInterfaceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.AllocatePrivateVirtualInterfaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("connectionId"), o.get[java.lang.String]("ownerAccount"), o.get[org.lyranthe.araethura.directconnect.models.NewPrivateVirtualInterfaceAllocation]("newPrivateVirtualInterfaceAllocation")).mapN(org.lyranthe.araethura.directconnect.models.AllocatePrivateVirtualInterfaceRequest.apply _)
  }
  final implicit val DeleteDirectConnectGatewayRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("directConnectGatewayId").map(org.lyranthe.araethura.directconnect.models.DeleteDirectConnectGatewayRequest.apply _)
  }
}