// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged collection of SupportedLanguage items. */
@Immutable
public final class PagedSupportedLanguage {
    /*
     * The SupportedLanguage items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<SupportedLanguage> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of PagedSupportedLanguage class.
     *
     * @param value the value value to set.
     */
    @JsonCreator
    private PagedSupportedLanguage(@JsonProperty(value = "value", required = true) List<SupportedLanguage> value) {
        this.value = value;
    }

    /**
     * Get the value property: The SupportedLanguage items on this page.
     *
     * @return the value value.
     */
    public List<SupportedLanguage> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}