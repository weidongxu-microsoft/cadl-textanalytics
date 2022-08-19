// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Entity model. */
@Fluent
public final class Entity {
    /*
     * Entity text as appears in the request.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Entity type.
     */
    @JsonProperty(value = "category", required = true)
    private String category;

    /*
     * Entity sub type.
     */
    @JsonProperty(value = "subcategory")
    private String subcategory;

    /*
     * Start position for the entity text.
     * Use of different 'stringIndexType' values can affect the offset returned.
     */
    @JsonProperty(value = "offset", required = true)
    private long offset;

    /*
     * Length for the entity text.
     * Use of different 'stringIndexType' values can affect the length returned.
     */
    @JsonProperty(value = "length", required = true)
    private long length;

    /*
     * Confidence score between 0 and 1 of the extracted entity.
     */
    @JsonProperty(value = "confidenceScore", required = true)
    private double confidenceScore;

    /**
     * Creates an instance of Entity class.
     *
     * @param text the text value to set.
     * @param category the category value to set.
     * @param offset the offset value to set.
     * @param length the length value to set.
     * @param confidenceScore the confidenceScore value to set.
     */
    @JsonCreator
    public Entity(
            @JsonProperty(value = "text", required = true) String text,
            @JsonProperty(value = "category", required = true) String category,
            @JsonProperty(value = "offset", required = true) long offset,
            @JsonProperty(value = "length", required = true) long length,
            @JsonProperty(value = "confidenceScore", required = true) double confidenceScore) {
        this.text = text;
        this.category = category;
        this.offset = offset;
        this.length = length;
        this.confidenceScore = confidenceScore;
    }

    /**
     * Get the text property: Entity text as appears in the request.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the category property: Entity type.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Get the subcategory property: Entity sub type.
     *
     * @return the subcategory value.
     */
    public String getSubcategory() {
        return this.subcategory;
    }

    /**
     * Set the subcategory property: Entity sub type.
     *
     * @param subcategory the subcategory value to set.
     * @return the Entity object itself.
     */
    public Entity setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    /**
     * Get the offset property: Start position for the entity text. Use of different 'stringIndexType' values can affect
     * the offset returned.
     *
     * @return the offset value.
     */
    public long getOffset() {
        return this.offset;
    }

    /**
     * Get the length property: Length for the entity text. Use of different 'stringIndexType' values can affect the
     * length returned.
     *
     * @return the length value.
     */
    public long getLength() {
        return this.length;
    }

    /**
     * Get the confidenceScore property: Confidence score between 0 and 1 of the extracted entity.
     *
     * @return the confidenceScore value.
     */
    public double getConfidenceScore() {
        return this.confidenceScore;
    }
}
