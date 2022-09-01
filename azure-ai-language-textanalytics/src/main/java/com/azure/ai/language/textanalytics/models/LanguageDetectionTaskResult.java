// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The LanguageDetectionTaskResult model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("LanguageDetectionResults")
@Immutable
public final class LanguageDetectionTaskResult extends AnalyzeTextTaskResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private LanguageDetectionResult results;

    /**
     * Creates an instance of LanguageDetectionTaskResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public LanguageDetectionTaskResult(
            @JsonProperty(value = "results", required = true) LanguageDetectionResult results) {
        this.results = results;
    }

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public LanguageDetectionResult getResults() {
        return this.results;
    }
}