// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentRequestStatistics model. */
@Immutable
public final class DocumentRequestStatistics {
    /*
     * Number of documents submitted in the request.
     */
    @JsonProperty(value = "documentsCount", required = true)
    private int documentsCount;

    /*
     * Number of valid documents. This excludes empty, over-size limit or non-supported languages documents.
     */
    @JsonProperty(value = "validDocumentsCount", required = true)
    private int validDocumentsCount;

    /*
     * Number of invalid documents. This includes empty, over-size limit or non-supported languages documents.
     */
    @JsonProperty(value = "erroneousDocumentsCount", required = true)
    private int erroneousDocumentsCount;

    /*
     * Number of transactions for the request.
     */
    @JsonProperty(value = "transactionsCount", required = true)
    private long transactionsCount;

    /**
     * Creates an instance of DocumentRequestStatistics class.
     *
     * @param documentsCount the documentsCount value to set.
     * @param validDocumentsCount the validDocumentsCount value to set.
     * @param erroneousDocumentsCount the erroneousDocumentsCount value to set.
     * @param transactionsCount the transactionsCount value to set.
     */
    @JsonCreator
    public DocumentRequestStatistics(
            @JsonProperty(value = "documentsCount", required = true) int documentsCount,
            @JsonProperty(value = "validDocumentsCount", required = true) int validDocumentsCount,
            @JsonProperty(value = "erroneousDocumentsCount", required = true) int erroneousDocumentsCount,
            @JsonProperty(value = "transactionsCount", required = true) long transactionsCount) {
        this.documentsCount = documentsCount;
        this.validDocumentsCount = validDocumentsCount;
        this.erroneousDocumentsCount = erroneousDocumentsCount;
        this.transactionsCount = transactionsCount;
    }

    /**
     * Get the documentsCount property: Number of documents submitted in the request.
     *
     * @return the documentsCount value.
     */
    public int getDocumentsCount() {
        return this.documentsCount;
    }

    /**
     * Get the validDocumentsCount property: Number of valid documents. This excludes empty, over-size limit or
     * non-supported languages documents.
     *
     * @return the validDocumentsCount value.
     */
    public int getValidDocumentsCount() {
        return this.validDocumentsCount;
    }

    /**
     * Get the erroneousDocumentsCount property: Number of invalid documents. This includes empty, over-size limit or
     * non-supported languages documents.
     *
     * @return the erroneousDocumentsCount value.
     */
    public int getErroneousDocumentsCount() {
        return this.erroneousDocumentsCount;
    }

    /**
     * Get the transactionsCount property: Number of transactions for the request.
     *
     * @return the transactionsCount value.
     */
    public long getTransactionsCount() {
        return this.transactionsCount;
    }
}
