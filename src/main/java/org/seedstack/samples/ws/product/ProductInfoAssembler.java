/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ws.product;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.seedstack.business.api.interfaces.assembler.ModelMapperAssembler;
import org.seedstack.samples.ecommerce.domain.product.Product;

public class ProductInfoAssembler extends ModelMapperAssembler<Product, ProductInfo> {

    @Override
    protected void configureAssembly(ModelMapper modelMapper) {
        modelMapper.addMappings(new PropertyMap<Product, ProductInfo>() {
            @Override
            protected void configure() {
                map().setId(source.getEntityId()); // Required due to the ambiguity with the categoryId field
            }
        });
    }

    @Override
    protected void configureMerge(ModelMapper modelMapper) {
    }

}
