package org.lyranthe.araethura.common

case class AwsData[F[_]](region: String, accessKeyId: String, secretAccessKey: String, sessionToken: F[Option[String]])
