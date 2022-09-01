// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The DeploymentJob model. */
@Immutable
public final class DeploymentJob {
    /*
     * The job ID.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * The creation date time of the job.
     */
    @JsonProperty(value = "createdDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The the last date time the job was updated.
     */
    @JsonProperty(value = "lastUpdatedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * The expiration date time of the job.
     */
    @JsonProperty(value = "expirationDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDateTime;

    /*
     * The job status.
     */
    @JsonProperty(value = "status", required = true)
    private JobStatus status;

    /*
     * The warnings that were encountered while executing the job.
     */
    @JsonProperty(value = "warnings", required = true)
    private List<JobWarning> warnings;

    /*
     * The errors encountered while executing the job.
     */
    @JsonProperty(value = "errors", required = true)
    private ResponseError errors;

    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of DeploymentJob class.
     *
     * @param jobId the jobId value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @param expirationDateTime the expirationDateTime value to set.
     * @param status the status value to set.
     * @param warnings the warnings value to set.
     * @param errors the errors value to set.
     * @param id the id value to set.
     */
    @JsonCreator
    public DeploymentJob(
            @JsonProperty(value = "jobId", required = true) String jobId,
            @JsonProperty(value = "createdDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    OffsetDateTime createdDateTime,
            @JsonProperty(value = "lastUpdatedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    OffsetDateTime lastUpdatedDateTime,
            @JsonProperty(value = "expirationDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    OffsetDateTime expirationDateTime,
            @JsonProperty(value = "status", required = true) JobStatus status,
            @JsonProperty(value = "warnings", required = true) List<JobWarning> warnings,
            @JsonProperty(value = "errors", required = true) ResponseError errors,
            @JsonProperty(value = "id", required = true) String id) {
        this.jobId = jobId;
        this.createdDateTime = createdDateTime;
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        this.expirationDateTime = expirationDateTime;
        this.status = status;
        this.warnings = warnings;
        this.errors = errors;
        this.id = id;
    }

    /**
     * Get the jobId property: The job ID.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the createdDateTime property: The creation date time of the job.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the lastUpdatedDateTime property: The the last date time the job was updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Get the expirationDateTime property: The expiration date time of the job.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Get the status property: The job status.
     *
     * @return the status value.
     */
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the warnings property: The warnings that were encountered while executing the job.
     *
     * @return the warnings value.
     */
    public List<JobWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Get the errors property: The errors encountered while executing the job.
     *
     * @return the errors value.
     */
    public ResponseError getErrors() {
        return this.errors;
    }

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }
}