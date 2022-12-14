// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Error model. */
@Fluent
public final class Error {
    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private ErrorCode code;

    /*
     * Error details.
     */
    @JsonProperty(value = "details")
    private Map<String, String> details;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Inner error contains more specific information.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * Creates an instance of Error class.
     *
     * @param message the message value to set.
     * @param code the code value to set.
     */
    @JsonCreator
    public Error(
            @JsonProperty(value = "message", required = true) String message,
            @JsonProperty(value = "code", required = true) ErrorCode code) {
        this.message = message;
        this.code = code;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public ErrorCode getCode() {
        return this.code;
    }

    /**
     * Get the details property: Error details.
     *
     * @return the details value.
     */
    public Map<String, String> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Error details.
     *
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error setDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     *
     * @param target the target value to set.
     * @return the Error object itself.
     */
    public Error setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the innererror property: Inner error contains more specific information.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: Inner error contains more specific information.
     *
     * @param innererror the innererror value to set.
     * @return the Error object itself.
     */
    public Error setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }
}
