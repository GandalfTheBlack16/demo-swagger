# Swagger UI demo project bug demo

This is project is meant to show a bug into Swagger-UI v4.10.3 (packaged as WebJar by `Springdoc-openapi` )

## Explanation

Bug is reproducible using an api object with bean-validation @Pattern annotation. If none `example` attribute is specified into `@Schema` annotation, Swagger-UI will render a huge value into that api object param (inside 'Parameters' tab of `Try it out` view).

In this demo, field Email have an example value but field Confirm Email does not. 

## Possible cause

This unexpected behaviour would be existing from v4.6.2. PR: #7829

It's not being taking into account that example field can be null and Swagger-ui is trying to conform "string" type to the regex pattern.