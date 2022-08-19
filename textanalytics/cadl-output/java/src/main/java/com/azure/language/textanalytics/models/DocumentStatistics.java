// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentStatistics model. */
@Fluent
public final class DocumentStatistics {
    /*
     * Number of text elements recognized in the document.
     */
    @JsonProperty(value = "charactersCount", required = true)
    private long charactersCount;

    /*
     * Number of transactions for the document.
     */
    @JsonProperty(value = "transactionsCount", required = true)
    private long transactionsCount;

    /**
     * Creates an instance of DocumentStatistics class.
     *
     * @param charactersCount the charactersCount value to set.
     * @param transactionsCount the transactionsCount value to set.
     */
    @JsonCreator
    public DocumentStatistics(
            @JsonProperty(value = "charactersCount", required = true) long charactersCount,
            @JsonProperty(value = "transactionsCount", required = true) long transactionsCount) {
        this.charactersCount = charactersCount;
        this.transactionsCount = transactionsCount;
    }

    /**
     * Get the charactersCount property: Number of text elements recognized in the document.
     *
     * @return the charactersCount value.
     */
    public long getCharactersCount() {
        return this.charactersCount;
    }

    /**
     * Get the transactionsCount property: Number of transactions for the document.
     *
     * @return the transactionsCount value.
     */
    public long getTransactionsCount() {
        return this.transactionsCount;
    }
}
