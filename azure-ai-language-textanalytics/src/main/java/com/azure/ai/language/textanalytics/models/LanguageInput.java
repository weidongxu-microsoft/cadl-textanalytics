// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LanguageInput model. */
@Fluent
public final class LanguageInput {
    /*
     * A unique, non-empty document identifier.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The input text to process.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * This is the 2 letter ISO 639-1 representation of a language.
     *
     * For example, use "en" for English; "es" for Spanish etc. z,an
     * If not set, use "en" for English as default."
     */
    @JsonProperty(value = "countryHint")
    private String countryHint;

    /**
     * Creates an instance of LanguageInput class.
     *
     * @param id the id value to set.
     * @param text the text value to set.
     */
    @JsonCreator
    public LanguageInput(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "text", required = true) String text) {
        this.id = id;
        this.text = text;
    }

    /**
     * Get the id property: A unique, non-empty document identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the text property: The input text to process.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the countryHint property: This is the 2 letter ISO 639-1 representation of a language.
     *
     * <p>For example, use "en" for English; "es" for Spanish etc. z,an If not set, use "en" for English as default.".
     *
     * @return the countryHint value.
     */
    public String getCountryHint() {
        return this.countryHint;
    }

    /**
     * Set the countryHint property: This is the 2 letter ISO 639-1 representation of a language.
     *
     * <p>For example, use "en" for English; "es" for Spanish etc. z,an If not set, use "en" for English as default.".
     *
     * @param countryHint the countryHint value to set.
     * @return the LanguageInput object itself.
     */
    public LanguageInput setCountryHint(String countryHint) {
        this.countryHint = countryHint;
        return this;
    }
}
