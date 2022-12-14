// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LanguageDetectionDocumentResult model. */
@Immutable
public final class LanguageDetectionDocumentResult {
    /*
     * Unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Warnings encountered while processing document.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<DocumentWarning> warnings;

    /*
     * If showStats=true was specified in the request this field will contain information about the document payload.
     */
    @JsonProperty(value = "statistics", required = true)
    private List<DocumentStatistics> statistics;

    /*
     * Detected Language.
     */
    @JsonProperty(value = "detectedLanguage", required = true)
    private List<DetectedLanguage> detectedLanguage;

    /**
     * Creates an instance of LanguageDetectionDocumentResult class.
     *
     * @param id the id value to set.
     * @param warnings the warnings value to set.
     * @param statistics the statistics value to set.
     * @param detectedLanguage the detectedLanguage value to set.
     */
    @JsonCreator
    public LanguageDetectionDocumentResult(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "warnings", required = true) List<DocumentWarning> warnings,
            @JsonProperty(value = "statistics", required = true) List<DocumentStatistics> statistics,
            @JsonProperty(value = "detectedLanguage", required = true) List<DetectedLanguage> detectedLanguage) {
        this.id = id;
        this.warnings = warnings;
        this.statistics = statistics;
        this.detectedLanguage = detectedLanguage;
    }

    /**
     * Get the id property: Unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the warnings property: Warnings encountered while processing document.
     *
     * @return the warnings value.
     */
    public List<DocumentWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Get the statistics property: If showStats=true was specified in the request this field will contain information
     * about the document payload.
     *
     * @return the statistics value.
     */
    public List<DocumentStatistics> getStatistics() {
        return this.statistics;
    }

    /**
     * Get the detectedLanguage property: Detected Language.
     *
     * @return the detectedLanguage value.
     */
    public List<DetectedLanguage> getDetectedLanguage() {
        return this.detectedLanguage;
    }
}
