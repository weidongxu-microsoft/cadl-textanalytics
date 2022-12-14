// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MultiLanguageAnalysisInput model. */
@Immutable
public final class MultiLanguageAnalysisInput {
    /*
     * Collection of documents to analyze.
     */
    @JsonProperty(value = "documents", required = true)
    private List<MultiLanguageInput> documents;

    /**
     * Creates an instance of MultiLanguageAnalysisInput class.
     *
     * @param documents the documents value to set.
     */
    @JsonCreator
    public MultiLanguageAnalysisInput(
            @JsonProperty(value = "documents", required = true) List<MultiLanguageInput> documents) {
        this.documents = documents;
    }

    /**
     * Get the documents property: Collection of documents to analyze.
     *
     * @return the documents value.
     */
    public List<MultiLanguageInput> getDocuments() {
        return this.documents;
    }
}
