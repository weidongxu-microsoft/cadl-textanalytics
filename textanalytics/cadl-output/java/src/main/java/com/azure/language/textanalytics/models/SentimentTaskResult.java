// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The SentimentTaskResult model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("SentimentTaskResult")
@Fluent
public final class SentimentTaskResult extends TaskResultSentimentAnalysisResultsSentimentResponse {
    /**
     * Creates an instance of SentimentTaskResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public SentimentTaskResult(@JsonProperty(value = "results", required = true) SentimentResponse results) {
        super(results);
    }
}
