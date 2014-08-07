# Soapy

Simple Spring 4 app that talks SOAP. Request mapper classes are auto generated with jaxb. 

## Build
mvn package

## Deploy

cf push soapy -p target/soapy-0.1.0.jar -b https://github.com/cloudfoundry/java-buildpack.gi