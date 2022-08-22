// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.authoring.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Project model. */
@Fluent
public final class Project {
    /*
     * The projectName property.
     */
    @JsonProperty(value = "projectName", required = true)
    private String projectName;

    /*
     * The project kind.
     */
    @JsonProperty(value = "projectKind", required = true)
    private ProjectKind projectKind;

    /*
     * The storage container name.
     */
    @JsonProperty(value = "storageInputContainerName", required = true)
    private String storageInputContainerName;

    /*
     * The project settings.
     */
    @JsonProperty(value = "settings")
    private Map<String, String> settings;

    /*
     * Whether the project would be used for multiple languages or not.
     */
    @JsonProperty(value = "multilingual")
    private Boolean multilingual;

    /*
     * The project description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The project language. This is BCP-47 representation of a language. For example, use "en" for English, "en-gb"
     * for English (UK), "es" for Spanish etc.
     */
    @JsonProperty(value = "language", required = true)
    private String language;

    /*
     * Represents the project creation datetime.
     */
    @JsonProperty(value = "createdDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String createdDateTime;

    /*
     * Represents the project last modification datetime.
     */
    @JsonProperty(value = "lastModifiedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedDateTime;

    /*
     * Represents the project last training datetime.
     */
    @JsonProperty(value = "lastTrainedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String lastTrainedDateTime;

    /*
     * Represents the project last deployment datetime.
     */
    @JsonProperty(value = "lastDeployedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String lastDeployedDateTime;

    /*
     * The location for monitoring the operation state.
     */
    @JsonProperty(value = "operationLocation", required = true)
    private String operationLocation;

    /**
     * Creates an instance of Project class.
     *
     * @param projectName the projectName value to set.
     * @param projectKind the projectKind value to set.
     * @param storageInputContainerName the storageInputContainerName value to set.
     * @param language the language value to set.
     * @param createdDateTime the createdDateTime value to set.
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @param lastTrainedDateTime the lastTrainedDateTime value to set.
     * @param lastDeployedDateTime the lastDeployedDateTime value to set.
     * @param operationLocation the operationLocation value to set.
     */
    @JsonCreator
    public Project(
            @JsonProperty(value = "projectName", required = true) String projectName,
            @JsonProperty(value = "projectKind", required = true) ProjectKind projectKind,
            @JsonProperty(value = "storageInputContainerName", required = true) String storageInputContainerName,
            @JsonProperty(value = "language", required = true) String language,
            @JsonProperty(value = "createdDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    String createdDateTime,
            @JsonProperty(value = "lastModifiedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    String lastModifiedDateTime,
            @JsonProperty(value = "lastTrainedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    String lastTrainedDateTime,
            @JsonProperty(value = "lastDeployedDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    String lastDeployedDateTime,
            @JsonProperty(value = "operationLocation", required = true) String operationLocation) {
        this.projectName = projectName;
        this.projectKind = projectKind;
        this.storageInputContainerName = storageInputContainerName;
        this.language = language;
        this.createdDateTime = createdDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.lastTrainedDateTime = lastTrainedDateTime;
        this.lastDeployedDateTime = lastDeployedDateTime;
        this.operationLocation = operationLocation;
    }

    /**
     * Get the projectName property: The projectName property.
     *
     * @return the projectName value.
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * Get the projectKind property: The project kind.
     *
     * @return the projectKind value.
     */
    public ProjectKind getProjectKind() {
        return this.projectKind;
    }

    /**
     * Get the storageInputContainerName property: The storage container name.
     *
     * @return the storageInputContainerName value.
     */
    public String getStorageInputContainerName() {
        return this.storageInputContainerName;
    }

    /**
     * Get the settings property: The project settings.
     *
     * @return the settings value.
     */
    public Map<String, String> getSettings() {
        return this.settings;
    }

    /**
     * Set the settings property: The project settings.
     *
     * @param settings the settings value to set.
     * @return the Project object itself.
     */
    public Project setSettings(Map<String, String> settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the multilingual property: Whether the project would be used for multiple languages or not.
     *
     * @return the multilingual value.
     */
    public Boolean isMultilingual() {
        return this.multilingual;
    }

    /**
     * Set the multilingual property: Whether the project would be used for multiple languages or not.
     *
     * @param multilingual the multilingual value to set.
     * @return the Project object itself.
     */
    public Project setMultilingual(Boolean multilingual) {
        this.multilingual = multilingual;
        return this;
    }

    /**
     * Get the description property: The project description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The project description.
     *
     * @param description the description value to set.
     * @return the Project object itself.
     */
    public Project setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the language property: The project language. This is BCP-47 representation of a language. For example, use
     * "en" for English, "en-gb" for English (UK), "es" for Spanish etc.
     *
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the createdDateTime property: Represents the project creation datetime.
     *
     * @return the createdDateTime value.
     */
    public String getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the lastModifiedDateTime property: Represents the project last modification datetime.
     *
     * @return the lastModifiedDateTime value.
     */
    public String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastTrainedDateTime property: Represents the project last training datetime.
     *
     * @return the lastTrainedDateTime value.
     */
    public String getLastTrainedDateTime() {
        return this.lastTrainedDateTime;
    }

    /**
     * Get the lastDeployedDateTime property: Represents the project last deployment datetime.
     *
     * @return the lastDeployedDateTime value.
     */
    public String getLastDeployedDateTime() {
        return this.lastDeployedDateTime;
    }

    /**
     * Get the operationLocation property: The location for monitoring the operation state.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }
}
