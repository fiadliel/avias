package org.lyranthe.araethura.marketplaceentitlement
trait Amazonmarketplaceentitlement[F[_]] { def getEntitlements(input: models.GetEntitlementsRequest): F[models.GetEntitlementsResult] }