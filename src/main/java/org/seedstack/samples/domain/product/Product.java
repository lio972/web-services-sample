/**
 * Copyright (c) 2013-2015, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.domain.product;

import org.seedstack.business.api.domain.BaseAggregateRoot;

public class Product extends BaseAggregateRoot<Long> {
    private final Long entityId;
    private final String designation;
    private String summary;
    private String details;
    private String picture;
    private Double price;
    private Long categoryId;

    Product(long entityId, String designation) {
        this.entityId = entityId;
        this.designation = designation;
    }

    @Override
    public Long getEntityId() {
        return entityId;
    }

    /**
     * Gets the designation.
     *
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Gets the summary.
     *
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the summary.
     *
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Gets the details.
     *
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the details.
     *
     * @param details the details to set
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * Gets the picture.
     *
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets the picture.
     *
     * @param picture the picture to set
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Gets the price.
     *
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets the categoryId.
     *
     * @return the categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the categoryId.
     *
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


}
