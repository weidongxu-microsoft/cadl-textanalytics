// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a supported language. */
@Immutable
public final class SupportedLanguage {
    /*
     * The language name.
     */
    @JsonProperty(value = "languageName", required = true)
    private String languageName;

    /*
     * The language code. This is BCP-47 representation of a language. For example, "en" for English, "en-gb" for
     * English (UK), "es" for Spanish etc.
     */
    @JsonProperty(value = "languageCode", required = true)
    private String languageCode;

    /**
     * Creates an instance of SupportedLanguage class.
     *
     * @param languageName the languageName value to set.
     * @param languageCode the languageCode value to set.
     */
    @JsonCreator
    private SupportedLanguage(
            @JsonProperty(value = "languageName", required = true) String languageName,
            @JsonProperty(value = "languageCode", required = true) String languageCode) {
        this.languageName = languageName;
        this.languageCode = languageCode;
    }

    /**
     * Get the languageName property: The language name.
     *
     * @return the languageName value.
     */
    public String getLanguageName() {
        return this.languageName;
    }

    /**
     * Get the languageCode property: The language code. This is BCP-47 representation of a language. For example, "en"
     * for English, "en-gb" for English (UK), "es" for Spanish etc.
     *
     * @return the languageCode value.
     */
    public String getLanguageCode() {
        return this.languageCode;
    }
}