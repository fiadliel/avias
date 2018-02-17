# avias
## Functional AWS API implementation for Scala

[![Join the chat at https://gitter.im/scala-avias/Lobby](https://badges.gitter.im/scala-avias/Lobby.svg)](https://gitter.im/scala-avias/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This library will implement most Amazon APIs with a from-scratch reimplementation,
based on the underlying service metadata provided by Amazon.

There are currently three main modules per-API:

 - core: Trait (tagless final) and classes representing the API
 - circe: Encoders and decoders for any JSON objects used in the API
 - http4s: An implementation using the http4s HTTP client
 
 # To do:
 
  - Implement protocols other than "json"
  - Add an FS2 module
  - Implement sources for credential data
    - Environment variables
    - .aws directory
    - AWS metadata service
    - ECS metadata
  - Change class encoding to avoid binary incompatibility issues (contraband or similar is possible)
  - Think about retry strategies
  - Add enums
  - Think about refined or other strategies for validating input parameters
