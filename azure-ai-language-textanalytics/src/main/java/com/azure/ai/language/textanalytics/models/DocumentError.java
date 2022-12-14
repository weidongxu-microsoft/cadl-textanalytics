// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentError model. */
@Immutable
public final class DocumentError {
    /*
     * Document id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Document error.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Creates an instance of DocumentError class.
     *
     * @param id the id value to set.
     * @param error the error value to set.
     */
    @JsonCreator
    public DocumentError(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "error", required = true) Error error) {
        this.id = id;
        this.error = error;
    }

    /**
     * Get the id property: Document id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the error property: Document error.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }
}
