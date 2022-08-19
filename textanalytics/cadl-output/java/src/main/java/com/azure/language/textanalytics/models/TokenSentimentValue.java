// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TokenSentimentValue. */
public enum TokenSentimentValue {
    /** Enum value positive. */
    POSITIVE("positive"),

    /** Enum value neutral. */
    NEUTRAL("neutral"),

    /** Enum value mixed. */
    MIXED("mixed");

    /** The actual serialized value for a TokenSentimentValue instance. */
    private final String value;

    TokenSentimentValue(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TokenSentimentValue instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TokenSentimentValue object, or null if unable to parse.
     */
    @JsonCreator
    public static TokenSentimentValue fromString(String value) {
        if (value == null) {
            return null;
        }
        TokenSentimentValue[] items = TokenSentimentValue.values();
        for (TokenSentimentValue item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
