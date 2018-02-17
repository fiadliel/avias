# avias
## Functional AWS API implementation for Scala

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
