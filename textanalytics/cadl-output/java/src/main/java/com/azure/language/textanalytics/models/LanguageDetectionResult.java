// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LanguageDetectionResult model. */
@Fluent
public final class LanguageDetectionResult {
    /*
     * Response by document.
     */
    @JsonProperty(value = "documents", required = true)
    private List<LanguageDetectionDocumentResult> documents;

    /*
     * Errors by document id.
     */
    @JsonProperty(value = "errors", required = true)
    private List<DocumentError> errors;

    /*
     * If showStats=true was specified in the request this field will contain information about the request payload.
     */
    @JsonProperty(value = "statistics")
    private DocumentRequestStatistics statistics;

    /*
     * This field indicates which model is used for scoring.
     */
    @JsonProperty(value = "modelVersion", required = true)
    private String modelVersion;

    /**
     * Creates an instance of LanguageDetectionResult class.
     *
     * @param documents the documents value to set.
     * @param errors the errors value to set.
     * @param modelVersion the modelVersion value to set.
     */
    @JsonCreator
    public LanguageDetectionResult(
            @JsonProperty(value = "documents", required = true) List<LanguageDetectionDocumentResult> documents,
            @JsonProperty(value = "errors", required = true) List<DocumentError> errors,
            @JsonProperty(value = "modelVersion", required = true) String modelVersion) {
        this.documents = documents;
        this.errors = errors;
        this.modelVersion = modelVersion;
    }

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<LanguageDetectionDocumentResult> getDocuments() {
        return this.documents;
    }

    /**
     * Get the errors property: Errors by document id.
     *
     * @return the errors value.
     */
    public List<DocumentError> getErrors() {
        return this.errors;
    }

    /**
     * Get the statistics property: If showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @return the statistics value.
     */
    public DocumentRequestStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: If showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @param statistics the statistics value to set.
     * @return the LanguageDetectionResult object itself.
     */
    public LanguageDetectionResult setStatistics(DocumentRequestStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /**
     * Get the modelVersion property: This field indicates which model is used for scoring.
     *
     * @return the modelVersion value.
     */
    public String getModelVersion() {
        return this.modelVersion;
    }
}
