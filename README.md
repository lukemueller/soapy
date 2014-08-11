# Soapy
 
Simple Spring 4 app that talks SOAP. Request mapper classes are auto generated with jaxb. 

[![Build Status](https://travis-ci.org/lukemueller/soapy.svg?branch=master)](https://travis-ci.org/lukemueller/soapy)

## Build
mvn package

## Deploy

cf push soapy -p target/soapy-0.1.0.jar -b https://github.com/cloudfoundry/java-buildpack.gi