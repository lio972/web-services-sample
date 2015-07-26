# Simple Web-Service sample

A simple Web-Service exposing product information, based on the e-commerce domain model.

# Run it

If you have [Maven 3](http://maven.apache.org/) installed, you can clone the repository and run it locally with the maven Jetty plugin:

    git clone https://github.com/seedstack/simple-ws-sample.git
    cd simple-ws-sample
    mvn clean install && mvn jetty:run

Or you can just deploy it on your own Heroku account by clicking this button:

[![Deploy](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)
 
# Use it

Add the following URL in your favorite WS client:

    http://localhost:8080/product-info?wsdl

Generate a sample request for the productInfoByID operation and use a product id between 0 and 49.

# Copyright and license

This source code is copyrighted by [The SeedStack Authors](https://github.com/seedstack/seedstack/blob/master/AUTHORS) and
released under the terms of the [Mozilla Public License 2.0](https://www.mozilla.org/MPL/2.0/). 
