// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The EntitiesTaskResult model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("EntityRecognitionResults")
@Immutable
public final class EntitiesTaskResult extends AnalyzeTextTaskResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private EntitiesResult results;

    /**
     * Creates an instance of EntitiesTaskResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public EntitiesTaskResult(@JsonProperty(value = "results", required = true) EntitiesResult results) {
        this.results = results;
    }

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public EntitiesResult getResults() {
        return this.results;
    }
}