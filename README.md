# Web-Service sample
[![Build status](https://travis-ci.org/seedstack/web-services-sample.svg?branch=master)](https://travis-ci.org/seedstack/web-services-sample)

A project demonstrating features of the [SeedStack Web-Services add-on](http://seedstack.org/addons/web-services).

# Running it

## Locally

If you have [Maven 3](http://maven.apache.org/) installed, you can clone the repository and run it locally:

    mvn seedstack:run

## On Heroku

Or you can just deploy it on your own Heroku account by clicking this button:

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)
 
# Usage

Add the following URL in your favorite WS client:

    http://localhost:8080/product-info?wsdl

Generate a sample request for the productInfoByID operation and use any product identifier. Mock data is generated on-the-fly.

# Copyright and license

This source code is copyrighted by [The SeedStack Authors](https://github.com/seedstack/seedstack/blob/master/AUTHORS) and
released under the terms of the [Mozilla Public License 2.0](https://www.mozilla.org/MPL/2.0/). 
