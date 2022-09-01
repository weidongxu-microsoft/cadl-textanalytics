// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TargetRelationType. */
public enum TargetRelationType {
    /** Enum value assessment. */
    ASSESSMENT("assessment"),

    /** Enum value target. */
    TARGET("target");

    /** The actual serialized value for a TargetRelationType instance. */
    private final String value;

    TargetRelationType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TargetRelationType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TargetRelationType object, or null if unable to parse.
     */
    @JsonCreator
    public static TargetRelationType fromString(String value) {
        if (value == null) {
            return null;
        }
        TargetRelationType[] items = TargetRelationType.values();
        for (TargetRelationType item : items) {
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