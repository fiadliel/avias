package org.lyranthe.araethura.servicecatalog
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val CreateProductOutputEncoder: io.circe.Encoder[models.CreateProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UsageInstructionEncoder: io.circe.Encoder[models.UsageInstruction] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeCopyProductStatusOutputEncoder: io.circe.Encoder[models.DescribeCopyProductStatusOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductStatus" -> o.copyProductStatus.asJson, "TargetProductId" -> o.targetProductId.asJson, "StatusDetail" -> o.statusDetail.asJson)
  }
  final implicit val DeletePortfolioOutputEncoder: io.circe.Encoder[models.DeletePortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateProvisionedProductOutputEncoder: io.circe.Encoder[models.UpdateProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val DescribeTagOptionOutputEncoder: io.circe.Encoder[models.DescribeTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val DescribeCopyProductStatusInputEncoder: io.circe.Encoder[models.DescribeCopyProductStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductToken" -> o.copyProductToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProvisionedProductOutputEncoder: io.circe.Encoder[models.DescribeProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedProductDetail" -> o.provisionedProductDetail.asJson)
  }
  final implicit val CreateTagOptionInputEncoder: io.circe.Encoder[models.CreateTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val RecordOutputEncoder: io.circe.Encoder[models.RecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("OutputKey" -> o.outputKey.asJson, "OutputValue" -> o.outputValue.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TagOptionDetailEncoder: io.circe.Encoder[models.TagOptionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ProvisioningParameterEncoder: io.circe.Encoder[models.ProvisioningParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val UpdateTagOptionOutputEncoder: io.circe.Encoder[models.UpdateTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val RecordErrorEncoder: io.circe.Encoder[models.RecordError] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Description" -> o.description.asJson)
  }
  final implicit val UpdateProvisioningArtifactInputEncoder: io.circe.Encoder[models.UpdateProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson)
  }
  final implicit val CopyProductOutputEncoder: io.circe.Encoder[models.CopyProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CopyProductToken" -> o.copyProductToken.asJson)
  }
  final implicit val DescribeProductAsAdminInputEncoder: io.circe.Encoder[models.DescribeProductAsAdminInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListAcceptedPortfolioSharesOutputEncoder: io.circe.Encoder[models.ListAcceptedPortfolioSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ConstraintDetailEncoder: io.circe.Encoder[models.ConstraintDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintId" -> o.constraintId.asJson, "Type" -> o.`type`.asJson, "Description" -> o.description.asJson, "Owner" -> o.owner.asJson)
  }
  final implicit val DescribePortfolioInputEncoder: io.circe.Encoder[models.DescribePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductAsAdminOutputEncoder: io.circe.Encoder[models.DescribeProductAsAdminOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "ProvisioningArtifactSummaries" -> o.provisioningArtifactSummaries.asJson, "Tags" -> o.tags.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ListPortfoliosOutputEncoder: io.circe.Encoder[models.ListPortfoliosOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateProductOutputEncoder: io.circe.Encoder[models.UpdateProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetail" -> o.productViewDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ProvisioningArtifactPropertiesEncoder: io.circe.Encoder[models.ProvisioningArtifactProperties] = io.circe.Encoder.instance { o => 
    Json.obj("Info" -> o.info.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListTagOptionsOutputEncoder: io.circe.Encoder[models.ListTagOptionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetails" -> o.tagOptionDetails.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val UpdateProductInputEncoder: io.circe.Encoder[models.UpdateProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Owner" -> o.owner.asJson, "Distributor" -> o.distributor.asJson, "AddTags" -> o.addTags.asJson, "RemoveTags" -> o.removeTags.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "SupportEmail" -> o.supportEmail.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListPortfoliosForProductOutputEncoder: io.circe.Encoder[models.ListPortfoliosForProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetails" -> o.portfolioDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val SearchProductsAsAdminInputEncoder: io.circe.Encoder[models.SearchProductsAsAdminInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductSource" -> o.productSource.asJson, "PortfolioId" -> o.portfolioId.asJson, "SortOrder" -> o.sortOrder.asJson, "PageSize" -> o.pageSize.asJson, "Filters" -> o.filters.asJson, "PageToken" -> o.pageToken.asJson, "SortBy" -> o.sortBy.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DisassociateTagOptionFromResourceInputEncoder: io.circe.Encoder[models.DisassociateTagOptionFromResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagOptionId" -> o.tagOptionId.asJson)
  }
  final implicit val CreatePortfolioOutputEncoder: io.circe.Encoder[models.CreatePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val AssociateProductWithPortfolioInputEncoder: io.circe.Encoder[models.AssociateProductWithPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "PortfolioId" -> o.portfolioId.asJson, "SourcePortfolioId" -> o.sourcePortfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListRecordHistoryInputEncoder: io.circe.Encoder[models.ListRecordHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("SearchFilter" -> o.searchFilter.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "AccessLevelFilter" -> o.accessLevelFilter.asJson)
  }
  final implicit val ProvisioningArtifactParameterEncoder: io.circe.Encoder[models.ProvisioningArtifactParameter] = io.circe.Encoder.instance { o => 
    Json.obj("IsNoEcho" -> o.isNoEcho.asJson, "ParameterConstraints" -> o.parameterConstraints.asJson, "ParameterKey" -> o.parameterKey.asJson, "Description" -> o.description.asJson, "ParameterType" -> o.parameterType.asJson, "DefaultValue" -> o.defaultValue.asJson)
  }
  final implicit val ListConstraintsForPortfolioOutputEncoder: io.circe.Encoder[models.ListConstraintsForPortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetails" -> o.constraintDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DeleteProductInputEncoder: io.circe.Encoder[models.DeleteProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val RecordTagEncoder: io.circe.Encoder[models.RecordTag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListPortfoliosForProductInputEncoder: io.circe.Encoder[models.ListPortfoliosForProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DescribeProvisioningArtifactOutputEncoder: io.circe.Encoder[models.DescribeProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DisassociateTagOptionFromResourceOutputEncoder: io.circe.Encoder[models.DisassociateTagOptionFromResourceOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AssociateTagOptionWithResourceInputEncoder: io.circe.Encoder[models.AssociateTagOptionWithResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagOptionId" -> o.tagOptionId.asJson)
  }
  final implicit val ListResourcesForTagOptionInputEncoder: io.circe.Encoder[models.ListResourcesForTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionId" -> o.tagOptionId.asJson, "ResourceType" -> o.resourceType.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ListProvisioningArtifactsInputEncoder: io.circe.Encoder[models.ListProvisioningArtifactsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdateConstraintOutputEncoder: io.circe.Encoder[models.UpdateConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DeleteConstraintOutputEncoder: io.circe.Encoder[models.DeleteConstraintOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProductViewAggregationValueEncoder: io.circe.Encoder[models.ProductViewAggregationValue] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "ApproximateCount" -> o.approximateCount.asJson)
  }
  final implicit val CreateTagOptionOutputEncoder: io.circe.Encoder[models.CreateTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TagOptionDetail" -> o.tagOptionDetail.asJson)
  }
  final implicit val ProductViewDetailEncoder: io.circe.Encoder[models.ProductViewDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "Status" -> o.status.asJson, "ProductARN" -> o.productARN.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListResourcesForTagOptionOutputEncoder: io.circe.Encoder[models.ListResourcesForTagOptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceDetails" -> o.resourceDetails.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[models.ResourceInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteProvisioningArtifactOutputEncoder: io.circe.Encoder[models.DeleteProvisioningArtifactOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateProductInputEncoder: io.circe.Encoder[models.CreateProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "ProvisioningArtifactParameters" -> o.provisioningArtifactParameters.asJson, "Owner" -> o.owner.asJson, "ProductType" -> o.productType.asJson, "Name" -> o.name.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Distributor" -> o.distributor.asJson, "Tags" -> o.tags.asJson, "Description" -> o.description.asJson, "SupportEmail" -> o.supportEmail.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductViewInputEncoder: io.circe.Encoder[models.DescribeProductViewInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PortfolioDetailEncoder: io.circe.Encoder[models.PortfolioDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "ARN" -> o.arn.asJson, "Id" -> o.id.asJson, "CreatedTime" -> o.createdTime.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ProvisionedProductDetailEncoder: io.circe.Encoder[models.ProvisionedProductDetail] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "StatusMessage" -> o.statusMessage.asJson, "Type" -> o.`type`.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson, "LastRecordId" -> o.lastRecordId.asJson, "CreatedTime" -> o.createdTime.asJson, "Name" -> o.name.asJson, "Arn" -> o.arn.asJson)
  }
  final implicit val DisassociateProductFromPortfolioOutputEncoder: io.circe.Encoder[models.DisassociateProductFromPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeletePortfolioInputEncoder: io.circe.Encoder[models.DeletePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreatePortfolioShareOutputEncoder: io.circe.Encoder[models.CreatePortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProvisioningArtifactSummaryEncoder: io.circe.Encoder[models.ProvisioningArtifactSummary] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactMetadata" -> o.provisioningArtifactMetadata.asJson, "Id" -> o.id.asJson, "CreatedTime" -> o.createdTime.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ParameterConstraintsEncoder: io.circe.Encoder[models.ParameterConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("AllowedValues" -> o.allowedValues.asJson)
  }
  final implicit val AssociatePrincipalWithPortfolioInputEncoder: io.circe.Encoder[models.AssociatePrincipalWithPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "PrincipalARN" -> o.principalARN.asJson, "PrincipalType" -> o.principalType.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdatePortfolioInputEncoder: io.circe.Encoder[models.UpdatePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "AddTags" -> o.addTags.asJson, "RemoveTags" -> o.removeTags.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DescribeProductOutputEncoder: io.circe.Encoder[models.DescribeProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "ProvisioningArtifacts" -> o.provisioningArtifacts.asJson)
  }
  final implicit val DescribePortfolioOutputEncoder: io.circe.Encoder[models.DescribePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ListTagOptionsFiltersEncoder: io.circe.Encoder[models.ListTagOptionsFilters] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson)
  }
  final implicit val InvalidParametersExceptionEncoder: io.circe.Encoder[models.InvalidParametersException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DuplicateResourceExceptionEncoder: io.circe.Encoder[models.DuplicateResourceException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[models.InvalidStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProvisioningArtifactDetailEncoder: io.circe.Encoder[models.ProvisioningArtifactDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Type" -> o.`type`.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListLaunchPathsInputEncoder: io.circe.Encoder[models.ListLaunchPathsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val DescribeProductViewOutputEncoder: io.circe.Encoder[models.DescribeProductViewOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummary" -> o.productViewSummary.asJson, "ProvisioningArtifacts" -> o.provisioningArtifacts.asJson)
  }
  final implicit val DescribeProvisioningArtifactInputEncoder: io.circe.Encoder[models.DescribeProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Verbose" -> o.verbose.asJson)
  }
  final implicit val DescribeRecordOutputEncoder: io.circe.Encoder[models.DescribeRecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson, "RecordOutputs" -> o.recordOutputs.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ProvisionProductInputEncoder: io.circe.Encoder[models.ProvisionProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionToken" -> o.provisionToken.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson, "ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "ProvisioningParameters" -> o.provisioningParameters.asJson, "NotificationArns" -> o.notificationArns.asJson, "PathId" -> o.pathId.asJson, "Tags" -> o.tags.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val TagOptionNotMigratedExceptionEncoder: io.circe.Encoder[models.TagOptionNotMigratedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateProvisioningArtifactOutputEncoder: io.circe.Encoder[models.UpdateProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val CreateConstraintInputEncoder: io.circe.Encoder[models.CreateConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "Type" -> o.`type`.asJson, "PortfolioId" -> o.portfolioId.asJson, "ProductId" -> o.productId.asJson, "Parameters" -> o.parameters.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListConstraintsForPortfolioInputEncoder: io.circe.Encoder[models.ListConstraintsForPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "ProductId" -> o.productId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeConstraintOutputEncoder: io.circe.Encoder[models.DescribeConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ProductViewSummaryEncoder: io.circe.Encoder[models.ProductViewSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Distributor" -> o.distributor.asJson, "SupportUrl" -> o.supportUrl.asJson, "SupportDescription" -> o.supportDescription.asJson, "Owner" -> o.owner.asJson, "HasDefaultPath" -> o.hasDefaultPath.asJson, "Id" -> o.id.asJson, "ProductId" -> o.productId.asJson, "Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "ShortDescription" -> o.shortDescription.asJson, "SupportEmail" -> o.supportEmail.asJson)
  }
  final implicit val SearchProductsInputEncoder: io.circe.Encoder[models.SearchProductsInput] = io.circe.Encoder.instance { o => 
    Json.obj("SortOrder" -> o.sortOrder.asJson, "PageSize" -> o.pageSize.asJson, "Filters" -> o.filters.asJson, "PageToken" -> o.pageToken.asJson, "SortBy" -> o.sortBy.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AssociatePrincipalWithPortfolioOutputEncoder: io.circe.Encoder[models.AssociatePrincipalWithPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagOptionSummaryEncoder: io.circe.Encoder[models.TagOptionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val ListRecordHistorySearchFilterEncoder: io.circe.Encoder[models.ListRecordHistorySearchFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DescribeProductInputEncoder: io.circe.Encoder[models.DescribeProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ProvisionProductOutputEncoder: io.circe.Encoder[models.ProvisionProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val CreateProvisioningArtifactOutputEncoder: io.circe.Encoder[models.CreateProvisioningArtifactOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetail" -> o.provisioningArtifactDetail.asJson, "Info" -> o.info.asJson, "Status" -> o.status.asJson)
  }
  final implicit val SearchProductsOutputEncoder: io.circe.Encoder[models.SearchProductsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewSummaries" -> o.productViewSummaries.asJson, "ProductViewAggregations" -> o.productViewAggregations.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ListPortfolioAccessInputEncoder: io.circe.Encoder[models.ListPortfolioAccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CopyProductInputEncoder: io.circe.Encoder[models.CopyProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("SourceProductArn" -> o.sourceProductArn.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "TargetProductId" -> o.targetProductId.asJson, "TargetProductName" -> o.targetProductName.asJson, "SourceProvisioningArtifactIdentifiers" -> o.sourceProvisioningArtifactIdentifiers.asJson, "CopyOptions" -> o.copyOptions.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DisassociatePrincipalFromPortfolioInputEncoder: io.circe.Encoder[models.DisassociatePrincipalFromPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "PrincipalARN" -> o.principalARN.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AcceptPortfolioShareInputEncoder: io.circe.Encoder[models.AcceptPortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val SearchProductsAsAdminOutputEncoder: io.circe.Encoder[models.SearchProductsAsAdminOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductViewDetails" -> o.productViewDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DescribeConstraintInputEncoder: io.circe.Encoder[models.DescribeConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val UpdateProvisionedProductInputEncoder: io.circe.Encoder[models.UpdateProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("UpdateToken" -> o.updateToken.asJson, "ProvisioningParameters" -> o.provisioningParameters.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson)
  }
  final implicit val UpdatePortfolioOutputEncoder: io.circe.Encoder[models.UpdatePortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioDetail" -> o.portfolioDetail.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val TerminateProvisionedProductInputEncoder: io.circe.Encoder[models.TerminateProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("TerminateToken" -> o.terminateToken.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "IgnoreErrors" -> o.ignoreErrors.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson)
  }
  final implicit val ScanProvisionedProductsInputEncoder: io.circe.Encoder[models.ScanProvisionedProductsInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "AccessLevelFilter" -> o.accessLevelFilter.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val ResourceDetailEncoder: io.circe.Encoder[models.ResourceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Id" -> o.id.asJson, "Description" -> o.description.asJson, "CreatedTime" -> o.createdTime.asJson, "ARN" -> o.arn.asJson)
  }
  final implicit val DescribeProvisioningParametersOutputEncoder: io.circe.Encoder[models.DescribeProvisioningParametersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactParameters" -> o.provisioningArtifactParameters.asJson, "ConstraintSummaries" -> o.constraintSummaries.asJson, "UsageInstructions" -> o.usageInstructions.asJson, "TagOptions" -> o.tagOptions.asJson)
  }
  final implicit val ScanProvisionedProductsOutputEncoder: io.circe.Encoder[models.ScanProvisionedProductsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedProducts" -> o.provisionedProducts.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val LaunchPathSummaryEncoder: io.circe.Encoder[models.LaunchPathSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "ConstraintSummaries" -> o.constraintSummaries.asJson, "Tags" -> o.tags.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DescribeTagOptionInputEncoder: io.circe.Encoder[models.DescribeTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson)
  }
  final implicit val CreateConstraintOutputEncoder: io.circe.Encoder[models.CreateConstraintOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ConstraintDetail" -> o.constraintDetail.asJson, "ConstraintParameters" -> o.constraintParameters.asJson, "Status" -> o.status.asJson)
  }
  final implicit val UpdateConstraintInputEncoder: io.circe.Encoder[models.UpdateConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "Description" -> o.description.asJson)
  }
  final implicit val AssociateTagOptionWithResourceOutputEncoder: io.circe.Encoder[models.AssociateTagOptionWithResourceOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPrincipalsForPortfolioOutputEncoder: io.circe.Encoder[models.ListPrincipalsForPortfolioOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Principals" -> o.principals.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ListProvisioningArtifactsOutputEncoder: io.circe.Encoder[models.ListProvisioningArtifactsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisioningArtifactDetails" -> o.provisioningArtifactDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateProvisioningParameterEncoder: io.circe.Encoder[models.UpdateProvisioningParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "UsePreviousValue" -> o.usePreviousValue.asJson)
  }
  final implicit val ProvisioningArtifactEncoder: io.circe.Encoder[models.ProvisioningArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListPortfoliosInputEncoder: io.circe.Encoder[models.ListPortfoliosInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val CreatePortfolioShareInputEncoder: io.circe.Encoder[models.CreatePortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AccountId" -> o.accountId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val PrincipalEncoder: io.circe.Encoder[models.Principal] = io.circe.Encoder.instance { o => 
    Json.obj("PrincipalARN" -> o.principalARN.asJson, "PrincipalType" -> o.principalType.asJson)
  }
  final implicit val ListTagOptionsInputEncoder: io.circe.Encoder[models.ListTagOptionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val TerminateProvisionedProductOutputEncoder: io.circe.Encoder[models.TerminateProvisionedProductOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetail" -> o.recordDetail.asJson)
  }
  final implicit val RejectPortfolioShareInputEncoder: io.circe.Encoder[models.RejectPortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DeleteProductOutputEncoder: io.circe.Encoder[models.DeleteProductOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RecordDetailEncoder: io.circe.Encoder[models.RecordDetail] = io.circe.Encoder.instance { o => 
    Json.obj("RecordType" -> o.recordType.asJson, "ProvisionedProductType" -> o.provisionedProductType.asJson, "ProvisionedProductName" -> o.provisionedProductName.asJson, "Status" -> o.status.asJson, "ProductId" -> o.productId.asJson, "ProvisionedProductId" -> o.provisionedProductId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "RecordId" -> o.recordId.asJson, "RecordTags" -> o.recordTags.asJson, "UpdatedTime" -> o.updatedTime.asJson, "CreatedTime" -> o.createdTime.asJson, "RecordErrors" -> o.recordErrors.asJson)
  }
  final implicit val DescribeProvisioningParametersInputEncoder: io.circe.Encoder[models.DescribeProvisioningParametersInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "PathId" -> o.pathId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreatePortfolioInputEncoder: io.circe.Encoder[models.CreatePortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdempotencyToken" -> o.idempotencyToken.asJson, "ProviderName" -> o.providerName.asJson, "DisplayName" -> o.displayName.asJson, "Tags" -> o.tags.asJson, "Description" -> o.description.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreateProvisioningArtifactInputEncoder: io.circe.Encoder[models.CreateProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "Parameters" -> o.parameters.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val AssociateProductWithPortfolioOutputEncoder: io.circe.Encoder[models.AssociateProductWithPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListRecordHistoryOutputEncoder: io.circe.Encoder[models.ListRecordHistoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordDetails" -> o.recordDetails.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DisassociateProductFromPortfolioInputEncoder: io.circe.Encoder[models.DisassociateProductFromPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListPortfolioAccessOutputEncoder: io.circe.Encoder[models.ListPortfolioAccessOutput] = io.circe.Encoder.instance { o => 
    Json.obj("AccountIds" -> o.accountIds.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DescribeRecordInputEncoder: io.circe.Encoder[models.DescribeRecordInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DeletePortfolioShareOutputEncoder: io.circe.Encoder[models.DeletePortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPrincipalsForPortfolioInputEncoder: io.circe.Encoder[models.ListPrincipalsForPortfolioInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson, "PageSize" -> o.pageSize.asJson, "PageToken" -> o.pageToken.asJson)
  }
  final implicit val AcceptPortfolioShareOutputEncoder: io.circe.Encoder[models.AcceptPortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RejectPortfolioShareOutputEncoder: io.circe.Encoder[models.RejectPortfolioShareOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListAcceptedPortfolioSharesInputEncoder: io.circe.Encoder[models.ListAcceptedPortfolioSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("AcceptLanguage" -> o.acceptLanguage.asJson, "PageToken" -> o.pageToken.asJson, "PageSize" -> o.pageSize.asJson)
  }
  final implicit val DisassociatePrincipalFromPortfolioOutputEncoder: io.circe.Encoder[models.DisassociatePrincipalFromPortfolioOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AccessLevelFilterEncoder: io.circe.Encoder[models.AccessLevelFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val DeleteConstraintInputEncoder: io.circe.Encoder[models.DeleteConstraintInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ConstraintSummaryEncoder: io.circe.Encoder[models.ConstraintSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeProvisionedProductInputEncoder: io.circe.Encoder[models.DescribeProvisionedProductInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val DeletePortfolioShareInputEncoder: io.circe.Encoder[models.DeletePortfolioShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("PortfolioId" -> o.portfolioId.asJson, "AccountId" -> o.accountId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val ListLaunchPathsOutputEncoder: io.circe.Encoder[models.ListLaunchPathsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("LaunchPathSummaries" -> o.launchPathSummaries.asJson, "NextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val UpdateTagOptionInputEncoder: io.circe.Encoder[models.UpdateTagOptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Value" -> o.value.asJson, "Active" -> o.active.asJson)
  }
  final implicit val DeleteProvisioningArtifactInputEncoder: io.circe.Encoder[models.DeleteProvisioningArtifactInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProductId" -> o.productId.asJson, "ProvisioningArtifactId" -> o.provisioningArtifactId.asJson, "AcceptLanguage" -> o.acceptLanguage.asJson)
  }
  final implicit val CreateProductOutputDecoder: io.circe.Decoder[models.CreateProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.CreateProductOutput.apply _)
  }
  final implicit val UsageInstructionDecoder: io.circe.Decoder[models.UsageInstruction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.UsageInstruction.apply _)
  }
  final implicit val DescribeCopyProductStatusOutputDecoder: io.circe.Decoder[models.DescribeCopyProductStatusOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CopyProductStatus"), o.get[scala.Option[java.lang.String]]("TargetProductId"), o.get[scala.Option[java.lang.String]]("StatusDetail")).mapN(models.DescribeCopyProductStatusOutput.apply _)
  }
  final implicit val DeletePortfolioOutputDecoder: io.circe.Decoder[models.DeletePortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeletePortfolioOutput)
  final implicit val UpdateProvisionedProductOutputDecoder: io.circe.Decoder[models.UpdateProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.RecordDetail]]("RecordDetail").map(models.UpdateProvisionedProductOutput.apply _)
  }
  final implicit val DescribeTagOptionOutputDecoder: io.circe.Decoder[models.DescribeTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TagOptionDetail]]("TagOptionDetail").map(models.DescribeTagOptionOutput.apply _)
  }
  final implicit val DescribeCopyProductStatusInputDecoder: io.circe.Decoder[models.DescribeCopyProductStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CopyProductToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeCopyProductStatusInput.apply _)
  }
  final implicit val DescribeProvisionedProductOutputDecoder: io.circe.Decoder[models.DescribeProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ProvisionedProductDetail]]("ProvisionedProductDetail").map(models.DescribeProvisionedProductOutput.apply _)
  }
  final implicit val CreateTagOptionInputDecoder: io.circe.Decoder[models.CreateTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.CreateTagOptionInput.apply _)
  }
  final implicit val RecordOutputDecoder: io.circe.Decoder[models.RecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("OutputKey"), o.get[scala.Option[java.lang.String]]("OutputValue"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.RecordOutput.apply _)
  }
  final implicit val TagOptionDetailDecoder: io.circe.Decoder[models.TagOptionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active"), o.get[scala.Option[java.lang.String]]("Id")).mapN(models.TagOptionDetail.apply _)
  }
  final implicit val ProvisioningParameterDecoder: io.circe.Decoder[models.ProvisioningParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.ProvisioningParameter.apply _)
  }
  final implicit val UpdateTagOptionOutputDecoder: io.circe.Decoder[models.UpdateTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TagOptionDetail]]("TagOptionDetail").map(models.UpdateTagOptionOutput.apply _)
  }
  final implicit val RecordErrorDecoder: io.circe.Decoder[models.RecordError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.RecordError.apply _)
  }
  final implicit val UpdateProvisioningArtifactInputDecoder: io.circe.Decoder[models.UpdateProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.UpdateProvisioningArtifactInput.apply _)
  }
  final implicit val CopyProductOutputDecoder: io.circe.Decoder[models.CopyProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CopyProductToken").map(models.CopyProductOutput.apply _)
  }
  final implicit val DescribeProductAsAdminInputDecoder: io.circe.Decoder[models.DescribeProductAsAdminInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeProductAsAdminInput.apply _)
  }
  final implicit val ListAcceptedPortfolioSharesOutputDecoder: io.circe.Decoder[models.ListAcceptedPortfolioSharesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListAcceptedPortfolioSharesOutput.apply _)
  }
  final implicit val ConstraintDetailDecoder: io.circe.Decoder[models.ConstraintDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConstraintId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Owner")).mapN(models.ConstraintDetail.apply _)
  }
  final implicit val DescribePortfolioInputDecoder: io.circe.Decoder[models.DescribePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribePortfolioInput.apply _)
  }
  final implicit val DescribeProductAsAdminOutputDecoder: io.circe.Decoder[models.DescribeProductAsAdminOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[scala.List[models.ProvisioningArtifactSummary]]]("ProvisioningArtifactSummaries"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[scala.List[models.TagOptionDetail]]]("TagOptions")).mapN(models.DescribeProductAsAdminOutput.apply _)
  }
  final implicit val ListPortfoliosOutputDecoder: io.circe.Decoder[models.ListPortfoliosOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListPortfoliosOutput.apply _)
  }
  final implicit val UpdateProductOutputDecoder: io.circe.Decoder[models.UpdateProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewDetail]]("ProductViewDetail"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.UpdateProductOutput.apply _)
  }
  final implicit val ProvisioningArtifactPropertiesDecoder: io.circe.Decoder[models.ProvisioningArtifactProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Info"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.ProvisioningArtifactProperties.apply _)
  }
  final implicit val ListTagOptionsOutputDecoder: io.circe.Decoder[models.ListTagOptionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.TagOptionDetail]]]("TagOptionDetails"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListTagOptionsOutput.apply _)
  }
  final implicit val UpdateProductInputDecoder: io.circe.Decoder[models.UpdateProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[scala.List[models.Tag]]]("AddTags"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoveTags"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SupportEmail"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.UpdateProductInput.apply _)
  }
  final implicit val ListPortfoliosForProductOutputDecoder: io.circe.Decoder[models.ListPortfoliosForProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PortfolioDetail]]]("PortfolioDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListPortfoliosForProductOutput.apply _)
  }
  final implicit val SearchProductsAsAdminInputDecoder: io.circe.Decoder[models.SearchProductsAsAdminInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProductSource"), o.get[scala.Option[java.lang.String]]("PortfolioId"), o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filters"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("SortBy"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.SearchProductsAsAdminInput.apply _)
  }
  final implicit val DisassociateTagOptionFromResourceInputDecoder: io.circe.Decoder[models.DisassociateTagOptionFromResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("TagOptionId")).mapN(models.DisassociateTagOptionFromResourceInput.apply _)
  }
  final implicit val CreatePortfolioOutputDecoder: io.circe.Decoder[models.CreatePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.CreatePortfolioOutput.apply _)
  }
  final implicit val AssociateProductWithPortfolioInputDecoder: io.circe.Decoder[models.AssociateProductWithPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("SourcePortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.AssociateProductWithPortfolioInput.apply _)
  }
  final implicit val ListRecordHistoryInputDecoder: io.circe.Decoder[models.ListRecordHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ListRecordHistorySearchFilter]]("SearchFilter"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[models.AccessLevelFilter]]("AccessLevelFilter")).mapN(models.ListRecordHistoryInput.apply _)
  }
  final implicit val ProvisioningArtifactParameterDecoder: io.circe.Decoder[models.ProvisioningArtifactParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("IsNoEcho"), o.get[scala.Option[models.ParameterConstraints]]("ParameterConstraints"), o.get[scala.Option[java.lang.String]]("ParameterKey"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ParameterType"), o.get[scala.Option[java.lang.String]]("DefaultValue")).mapN(models.ProvisioningArtifactParameter.apply _)
  }
  final implicit val ListConstraintsForPortfolioOutputDecoder: io.circe.Decoder[models.ListConstraintsForPortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ConstraintDetail]]]("ConstraintDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListConstraintsForPortfolioOutput.apply _)
  }
  final implicit val DeleteProductInputDecoder: io.circe.Decoder[models.DeleteProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DeleteProductInput.apply _)
  }
  final implicit val RecordTagDecoder: io.circe.Decoder[models.RecordTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.RecordTag.apply _)
  }
  final implicit val ListPortfoliosForProductInputDecoder: io.circe.Decoder[models.ListPortfoliosForProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(models.ListPortfoliosForProductInput.apply _)
  }
  final implicit val DescribeProvisioningArtifactOutputDecoder: io.circe.Decoder[models.DescribeProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.DescribeProvisioningArtifactOutput.apply _)
  }
  final implicit val DisassociateTagOptionFromResourceOutputDecoder: io.circe.Decoder[models.DisassociateTagOptionFromResourceOutput.type] = io.circe.Decoder.decodeUnit.as(models.DisassociateTagOptionFromResourceOutput)
  final implicit val AssociateTagOptionWithResourceInputDecoder: io.circe.Decoder[models.AssociateTagOptionWithResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[java.lang.String]("TagOptionId")).mapN(models.AssociateTagOptionWithResourceInput.apply _)
  }
  final implicit val ListResourcesForTagOptionInputDecoder: io.circe.Decoder[models.ListResourcesForTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TagOptionId"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListResourcesForTagOptionInput.apply _)
  }
  final implicit val ListProvisioningArtifactsInputDecoder: io.circe.Decoder[models.ListProvisioningArtifactsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.ListProvisioningArtifactsInput.apply _)
  }
  final implicit val UpdateConstraintOutputDecoder: io.circe.Decoder[models.UpdateConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.UpdateConstraintOutput.apply _)
  }
  final implicit val DeleteConstraintOutputDecoder: io.circe.Decoder[models.DeleteConstraintOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteConstraintOutput)
  final implicit val ProductViewAggregationValueDecoder: io.circe.Decoder[models.ProductViewAggregationValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Int]]("ApproximateCount")).mapN(models.ProductViewAggregationValue.apply _)
  }
  final implicit val CreateTagOptionOutputDecoder: io.circe.Decoder[models.CreateTagOptionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TagOptionDetail]]("TagOptionDetail").map(models.CreateTagOptionOutput.apply _)
  }
  final implicit val ProductViewDetailDecoder: io.circe.Decoder[models.ProductViewDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ProductARN"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(models.ProductViewDetail.apply _)
  }
  final implicit val ListResourcesForTagOptionOutputDecoder: io.circe.Decoder[models.ListResourcesForTagOptionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ResourceDetail]]]("ResourceDetails"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListResourcesForTagOptionOutput.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[models.ResourceInUseException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceInUseException)
  final implicit val DeleteProvisioningArtifactOutputDecoder: io.circe.Decoder[models.DeleteProvisioningArtifactOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteProvisioningArtifactOutput)
  final implicit val CreateProductInputDecoder: io.circe.Decoder[models.CreateProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[models.ProvisioningArtifactProperties]("ProvisioningArtifactParameters"), o.get[java.lang.String]("Owner"), o.get[java.lang.String]("ProductType"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SupportEmail"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CreateProductInput.apply _)
  }
  final implicit val DescribeProductViewInputDecoder: io.circe.Decoder[models.DescribeProductViewInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeProductViewInput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceNotFoundException)
  final implicit val PortfolioDetailDecoder: io.circe.Decoder[models.PortfolioDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("ARN"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.PortfolioDetail.apply _)
  }
  final implicit val ProvisionedProductDetailDecoder: io.circe.Decoder[models.ProvisionedProductDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("StatusMessage"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("LastRecordId"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Arn")).mapN(models.ProvisionedProductDetail.apply _)
  }
  final implicit val DisassociateProductFromPortfolioOutputDecoder: io.circe.Decoder[models.DisassociateProductFromPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(models.DisassociateProductFromPortfolioOutput)
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.LimitExceededException)
  final implicit val DeletePortfolioInputDecoder: io.circe.Decoder[models.DeletePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DeletePortfolioInput.apply _)
  }
  final implicit val CreatePortfolioShareOutputDecoder: io.circe.Decoder[models.CreatePortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(models.CreatePortfolioShareOutput)
  final implicit val ProvisioningArtifactSummaryDecoder: io.circe.Decoder[models.ProvisioningArtifactSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProvisioningArtifactMetadata"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.ProvisioningArtifactSummary.apply _)
  }
  final implicit val ParameterConstraintsDecoder: io.circe.Decoder[models.ParameterConstraints] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("AllowedValues").map(models.ParameterConstraints.apply _)
  }
  final implicit val AssociatePrincipalWithPortfolioInputDecoder: io.circe.Decoder[models.AssociatePrincipalWithPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("PrincipalARN"), o.get[java.lang.String]("PrincipalType"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.AssociatePrincipalWithPortfolioInput.apply _)
  }
  final implicit val UpdatePortfolioInputDecoder: io.circe.Decoder[models.UpdatePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[scala.List[models.Tag]]]("AddTags"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoveTags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.UpdatePortfolioInput.apply _)
  }
  final implicit val DescribeProductOutputDecoder: io.circe.Decoder[models.DescribeProductOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[scala.List[models.ProvisioningArtifact]]]("ProvisioningArtifacts")).mapN(models.DescribeProductOutput.apply _)
  }
  final implicit val DescribePortfolioOutputDecoder: io.circe.Decoder[models.DescribePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[scala.List[models.TagOptionDetail]]]("TagOptions")).mapN(models.DescribePortfolioOutput.apply _)
  }
  final implicit val ListTagOptionsFiltersDecoder: io.circe.Decoder[models.ListTagOptionsFilters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(models.ListTagOptionsFilters.apply _)
  }
  final implicit val InvalidParametersExceptionDecoder: io.circe.Decoder[models.InvalidParametersException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidParametersException)
  final implicit val DuplicateResourceExceptionDecoder: io.circe.Decoder[models.DuplicateResourceException.type] = io.circe.Decoder.decodeUnit.as(models.DuplicateResourceException)
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[models.InvalidStateException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidStateException)
  final implicit val ProvisioningArtifactDetailDecoder: io.circe.Decoder[models.ProvisioningArtifactDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(models.ProvisioningArtifactDetail.apply _)
  }
  final implicit val ListLaunchPathsInputDecoder: io.circe.Decoder[models.ListLaunchPathsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListLaunchPathsInput.apply _)
  }
  final implicit val DescribeProductViewOutputDecoder: io.circe.Decoder[models.DescribeProductViewOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProductViewSummary]]("ProductViewSummary"), o.get[scala.Option[scala.List[models.ProvisioningArtifact]]]("ProvisioningArtifacts")).mapN(models.DescribeProductViewOutput.apply _)
  }
  final implicit val DescribeProvisioningArtifactInputDecoder: io.circe.Decoder[models.DescribeProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProvisioningArtifactId"), o.get[java.lang.String]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Boolean]]("Verbose")).mapN(models.DescribeProvisioningArtifactInput.apply _)
  }
  final implicit val DescribeRecordOutputDecoder: io.circe.Decoder[models.DescribeRecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.RecordDetail]]("RecordDetail"), o.get[scala.Option[scala.List[models.RecordOutput]]]("RecordOutputs"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.DescribeRecordOutput.apply _)
  }
  final implicit val ProvisionProductInputDecoder: io.circe.Decoder[models.ProvisionProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProvisionToken"), o.get[java.lang.String]("ProvisionedProductName"), o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[scala.List[models.ProvisioningParameter]]]("ProvisioningParameters"), o.get[scala.Option[scala.List[java.lang.String]]]("NotificationArns"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.ProvisionProductInput.apply _)
  }
  final implicit val TagOptionNotMigratedExceptionDecoder: io.circe.Decoder[models.TagOptionNotMigratedException.type] = io.circe.Decoder.decodeUnit.as(models.TagOptionNotMigratedException)
  final implicit val UpdateProvisioningArtifactOutputDecoder: io.circe.Decoder[models.UpdateProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.UpdateProvisioningArtifactOutput.apply _)
  }
  final implicit val CreateConstraintInputDecoder: io.circe.Decoder[models.CreateConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[java.lang.String]("Type"), o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("Parameters"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CreateConstraintInput.apply _)
  }
  final implicit val ListConstraintsForPortfolioInputDecoder: io.circe.Decoder[models.ListConstraintsForPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListConstraintsForPortfolioInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val DescribeConstraintOutputDecoder: io.circe.Decoder[models.DescribeConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.DescribeConstraintOutput.apply _)
  }
  final implicit val ProductViewSummaryDecoder: io.circe.Decoder[models.ProductViewSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Distributor"), o.get[scala.Option[java.lang.String]]("SupportUrl"), o.get[scala.Option[java.lang.String]]("SupportDescription"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[scala.Boolean]]("HasDefaultPath"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ShortDescription"), o.get[scala.Option[java.lang.String]]("SupportEmail")).mapN(models.ProductViewSummary.apply _)
  }
  final implicit val SearchProductsInputDecoder: io.circe.Decoder[models.SearchProductsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SortOrder"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filters"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[java.lang.String]]("SortBy"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.SearchProductsInput.apply _)
  }
  final implicit val AssociatePrincipalWithPortfolioOutputDecoder: io.circe.Decoder[models.AssociatePrincipalWithPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(models.AssociatePrincipalWithPortfolioOutput)
  final implicit val TagOptionSummaryDecoder: io.circe.Decoder[models.TagOptionSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(models.TagOptionSummary.apply _)
  }
  final implicit val ListRecordHistorySearchFilterDecoder: io.circe.Decoder[models.ListRecordHistorySearchFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.ListRecordHistorySearchFilter.apply _)
  }
  final implicit val DescribeProductInputDecoder: io.circe.Decoder[models.DescribeProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeProductInput.apply _)
  }
  final implicit val ProvisionProductOutputDecoder: io.circe.Decoder[models.ProvisionProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.RecordDetail]]("RecordDetail").map(models.ProvisionProductOutput.apply _)
  }
  final implicit val CreateProvisioningArtifactOutputDecoder: io.circe.Decoder[models.CreateProvisioningArtifactOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ProvisioningArtifactDetail]]("ProvisioningArtifactDetail"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Info"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.CreateProvisioningArtifactOutput.apply _)
  }
  final implicit val SearchProductsOutputDecoder: io.circe.Decoder[models.SearchProductsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ProductViewSummary]]]("ProductViewSummaries"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.ProductViewAggregationValue]]]]("ProductViewAggregations"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.SearchProductsOutput.apply _)
  }
  final implicit val ListPortfolioAccessInputDecoder: io.circe.Decoder[models.ListPortfolioAccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.ListPortfolioAccessInput.apply _)
  }
  final implicit val CopyProductInputDecoder: io.circe.Decoder[models.CopyProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SourceProductArn"), o.get[java.lang.String]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("TargetProductId"), o.get[scala.Option[java.lang.String]]("TargetProductName"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("SourceProvisioningArtifactIdentifiers"), o.get[scala.Option[scala.List[java.lang.String]]]("CopyOptions"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CopyProductInput.apply _)
  }
  final implicit val DisassociatePrincipalFromPortfolioInputDecoder: io.circe.Decoder[models.DisassociatePrincipalFromPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("PrincipalARN"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DisassociatePrincipalFromPortfolioInput.apply _)
  }
  final implicit val AcceptPortfolioShareInputDecoder: io.circe.Decoder[models.AcceptPortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.AcceptPortfolioShareInput.apply _)
  }
  final implicit val SearchProductsAsAdminOutputDecoder: io.circe.Decoder[models.SearchProductsAsAdminOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ProductViewDetail]]]("ProductViewDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.SearchProductsAsAdminOutput.apply _)
  }
  final implicit val DescribeConstraintInputDecoder: io.circe.Decoder[models.DescribeConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeConstraintInput.apply _)
  }
  final implicit val UpdateProvisionedProductInputDecoder: io.circe.Decoder[models.UpdateProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UpdateToken"), o.get[scala.Option[scala.List[models.UpdateProvisioningParameter]]]("ProvisioningParameters"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName")).mapN(models.UpdateProvisionedProductInput.apply _)
  }
  final implicit val UpdatePortfolioOutputDecoder: io.circe.Decoder[models.UpdatePortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PortfolioDetail]]("PortfolioDetail"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.UpdatePortfolioOutput.apply _)
  }
  final implicit val TerminateProvisionedProductInputDecoder: io.circe.Decoder[models.TerminateProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TerminateToken"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[scala.Boolean]]("IgnoreErrors"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName")).mapN(models.TerminateProvisionedProductInput.apply _)
  }
  final implicit val ScanProvisionedProductsInputDecoder: io.circe.Decoder[models.ScanProvisionedProductsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[models.AccessLevelFilter]]("AccessLevelFilter"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ScanProvisionedProductsInput.apply _)
  }
  final implicit val ResourceDetailDecoder: io.circe.Decoder[models.ResourceDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.lang.String]]("ARN")).mapN(models.ResourceDetail.apply _)
  }
  final implicit val DescribeProvisioningParametersOutputDecoder: io.circe.Decoder[models.DescribeProvisioningParametersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ProvisioningArtifactParameter]]]("ProvisioningArtifactParameters"), o.get[scala.Option[scala.List[models.ConstraintSummary]]]("ConstraintSummaries"), o.get[scala.Option[scala.List[models.UsageInstruction]]]("UsageInstructions"), o.get[scala.Option[scala.List[models.TagOptionSummary]]]("TagOptions")).mapN(models.DescribeProvisioningParametersOutput.apply _)
  }
  final implicit val ScanProvisionedProductsOutputDecoder: io.circe.Decoder[models.ScanProvisionedProductsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ProvisionedProductDetail]]]("ProvisionedProducts"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ScanProvisionedProductsOutput.apply _)
  }
  final implicit val LaunchPathSummaryDecoder: io.circe.Decoder[models.LaunchPathSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[models.ConstraintSummary]]]("ConstraintSummaries"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.LaunchPathSummary.apply _)
  }
  final implicit val DescribeTagOptionInputDecoder: io.circe.Decoder[models.DescribeTagOptionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Id").map(models.DescribeTagOptionInput.apply _)
  }
  final implicit val CreateConstraintOutputDecoder: io.circe.Decoder[models.CreateConstraintOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ConstraintDetail]]("ConstraintDetail"), o.get[scala.Option[java.lang.String]]("ConstraintParameters"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.CreateConstraintOutput.apply _)
  }
  final implicit val UpdateConstraintInputDecoder: io.circe.Decoder[models.UpdateConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.UpdateConstraintInput.apply _)
  }
  final implicit val AssociateTagOptionWithResourceOutputDecoder: io.circe.Decoder[models.AssociateTagOptionWithResourceOutput.type] = io.circe.Decoder.decodeUnit.as(models.AssociateTagOptionWithResourceOutput)
  final implicit val ListPrincipalsForPortfolioOutputDecoder: io.circe.Decoder[models.ListPrincipalsForPortfolioOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Principal]]]("Principals"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListPrincipalsForPortfolioOutput.apply _)
  }
  final implicit val ListProvisioningArtifactsOutputDecoder: io.circe.Decoder[models.ListProvisioningArtifactsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ProvisioningArtifactDetail]]]("ProvisioningArtifactDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListProvisioningArtifactsOutput.apply _)
  }
  final implicit val UpdateProvisioningParameterDecoder: io.circe.Decoder[models.UpdateProvisioningParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("UsePreviousValue")).mapN(models.UpdateProvisioningParameter.apply _)
  }
  final implicit val ProvisioningArtifactDecoder: io.circe.Decoder[models.ProvisioningArtifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(models.ProvisioningArtifact.apply _)
  }
  final implicit val ListPortfoliosInputDecoder: io.circe.Decoder[models.ListPortfoliosInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(models.ListPortfoliosInput.apply _)
  }
  final implicit val CreatePortfolioShareInputDecoder: io.circe.Decoder[models.CreatePortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CreatePortfolioShareInput.apply _)
  }
  final implicit val PrincipalDecoder: io.circe.Decoder[models.Principal] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PrincipalARN"), o.get[scala.Option[java.lang.String]]("PrincipalType")).mapN(models.Principal.apply _)
  }
  final implicit val ListTagOptionsInputDecoder: io.circe.Decoder[models.ListTagOptionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ListTagOptionsFilters]]("Filters"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListTagOptionsInput.apply _)
  }
  final implicit val TerminateProvisionedProductOutputDecoder: io.circe.Decoder[models.TerminateProvisionedProductOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.RecordDetail]]("RecordDetail").map(models.TerminateProvisionedProductOutput.apply _)
  }
  final implicit val RejectPortfolioShareInputDecoder: io.circe.Decoder[models.RejectPortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.RejectPortfolioShareInput.apply _)
  }
  final implicit val DeleteProductOutputDecoder: io.circe.Decoder[models.DeleteProductOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteProductOutput)
  final implicit val RecordDetailDecoder: io.circe.Decoder[models.RecordDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RecordType"), o.get[scala.Option[java.lang.String]]("ProvisionedProductType"), o.get[scala.Option[java.lang.String]]("ProvisionedProductName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ProductId"), o.get[scala.Option[java.lang.String]]("ProvisionedProductId"), o.get[scala.Option[java.lang.String]]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("RecordId"), o.get[scala.Option[scala.List[models.RecordTag]]]("RecordTags"), o.get[scala.Option[java.time.Instant]]("UpdatedTime"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[scala.List[models.RecordError]]]("RecordErrors")).mapN(models.RecordDetail.apply _)
  }
  final implicit val DescribeProvisioningParametersInputDecoder: io.circe.Decoder[models.DescribeProvisioningParametersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("PathId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeProvisioningParametersInput.apply _)
  }
  final implicit val CreatePortfolioInputDecoder: io.circe.Decoder[models.CreatePortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdempotencyToken"), o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("DisplayName"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CreatePortfolioInput.apply _)
  }
  final implicit val CreateProvisioningArtifactInputDecoder: io.circe.Decoder[models.CreateProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[models.ProvisioningArtifactProperties]("Parameters"), o.get[java.lang.String]("IdempotencyToken"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.CreateProvisioningArtifactInput.apply _)
  }
  final implicit val AssociateProductWithPortfolioOutputDecoder: io.circe.Decoder[models.AssociateProductWithPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(models.AssociateProductWithPortfolioOutput)
  final implicit val ListRecordHistoryOutputDecoder: io.circe.Decoder[models.ListRecordHistoryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.RecordDetail]]]("RecordDetails"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListRecordHistoryOutput.apply _)
  }
  final implicit val DisassociateProductFromPortfolioInputDecoder: io.circe.Decoder[models.DisassociateProductFromPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DisassociateProductFromPortfolioInput.apply _)
  }
  final implicit val ListPortfolioAccessOutputDecoder: io.circe.Decoder[models.ListPortfolioAccessOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("AccountIds"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListPortfolioAccessOutput.apply _)
  }
  final implicit val DescribeRecordInputDecoder: io.circe.Decoder[models.DescribeRecordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(models.DescribeRecordInput.apply _)
  }
  final implicit val DeletePortfolioShareOutputDecoder: io.circe.Decoder[models.DeletePortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeletePortfolioShareOutput)
  final implicit val ListPrincipalsForPortfolioInputDecoder: io.circe.Decoder[models.ListPrincipalsForPortfolioInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[scala.Int]]("PageSize"), o.get[scala.Option[java.lang.String]]("PageToken")).mapN(models.ListPrincipalsForPortfolioInput.apply _)
  }
  final implicit val AcceptPortfolioShareOutputDecoder: io.circe.Decoder[models.AcceptPortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(models.AcceptPortfolioShareOutput)
  final implicit val RejectPortfolioShareOutputDecoder: io.circe.Decoder[models.RejectPortfolioShareOutput.type] = io.circe.Decoder.decodeUnit.as(models.RejectPortfolioShareOutput)
  final implicit val ListAcceptedPortfolioSharesInputDecoder: io.circe.Decoder[models.ListAcceptedPortfolioSharesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AcceptLanguage"), o.get[scala.Option[java.lang.String]]("PageToken"), o.get[scala.Option[scala.Int]]("PageSize")).mapN(models.ListAcceptedPortfolioSharesInput.apply _)
  }
  final implicit val DisassociatePrincipalFromPortfolioOutputDecoder: io.circe.Decoder[models.DisassociatePrincipalFromPortfolioOutput.type] = io.circe.Decoder.decodeUnit.as(models.DisassociatePrincipalFromPortfolioOutput)
  final implicit val AccessLevelFilterDecoder: io.circe.Decoder[models.AccessLevelFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.AccessLevelFilter.apply _)
  }
  final implicit val DeleteConstraintInputDecoder: io.circe.Decoder[models.DeleteConstraintInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DeleteConstraintInput.apply _)
  }
  final implicit val ConstraintSummaryDecoder: io.circe.Decoder[models.ConstraintSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.ConstraintSummary.apply _)
  }
  final implicit val DescribeProvisionedProductInputDecoder: io.circe.Decoder[models.DescribeProvisionedProductInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DescribeProvisionedProductInput.apply _)
  }
  final implicit val DeletePortfolioShareInputDecoder: io.circe.Decoder[models.DeletePortfolioShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PortfolioId"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DeletePortfolioShareInput.apply _)
  }
  final implicit val ListLaunchPathsOutputDecoder: io.circe.Decoder[models.ListLaunchPathsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.LaunchPathSummary]]]("LaunchPathSummaries"), o.get[scala.Option[java.lang.String]]("NextPageToken")).mapN(models.ListLaunchPathsOutput.apply _)
  }
  final implicit val UpdateTagOptionInputDecoder: io.circe.Decoder[models.UpdateTagOptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(models.UpdateTagOptionInput.apply _)
  }
  final implicit val DeleteProvisioningArtifactInputDecoder: io.circe.Decoder[models.DeleteProvisioningArtifactInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductId"), o.get[java.lang.String]("ProvisioningArtifactId"), o.get[scala.Option[java.lang.String]]("AcceptLanguage")).mapN(models.DeleteProvisioningArtifactInput.apply _)
  }
}