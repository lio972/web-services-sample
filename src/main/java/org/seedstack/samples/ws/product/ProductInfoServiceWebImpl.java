/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
/*
 * 
 */
package org.seedstack.samples.ws.product;

import org.seedstack.business.domain.Factory;
import org.seedstack.business.assembler.FluentAssembler;

import javax.inject.Inject;
import javax.jws.WebService;

@WebService(endpointInterface = "org.seedstack.samples.ws.product.ProductInfoWS", targetNamespace = "http://seedstack.org/samples/ws/product", serviceName = "ProductInfoWSService", portName = "ProductInfoWSPort")
public class ProductInfoServiceWebImpl implements ProductInfoWS {

    @Inject
    FluentAssembler fluentAssembler;

    @Inject
    Factory<Product> productFactory;

    @Override
    public ProductInfo productInfoByID(long idProduct) throws BadProductRequestException {
        if (idProduct <= 0) {
            throw new BadProductRequestException("Error retrieving product", buildBadProductFaultInfo("Product identifier cannot be negative or 0", idProduct));
        }

        Product product = productFactory.create(idProduct, "Product #" + idProduct);

        if (product == null) {
            throw new BadProductRequestException("Error retrieving product", buildBadProductFaultInfo("Product not found", idProduct));
        }

        return fluentAssembler.assemble(product).to(ProductInfo.class);
    }

    private BadProductRequest buildBadProductFaultInfo(String message, long idProduct) {
        BadProductRequest faultInfo = new BadProductRequest();
        faultInfo.setMessage(message);
        faultInfo.setRequestedProduct(idProduct);
        return faultInfo;
    }

}
