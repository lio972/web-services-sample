/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ws.product;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.seedstack.business.assembler.modelmapper.ModelMapperAssembler;

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
