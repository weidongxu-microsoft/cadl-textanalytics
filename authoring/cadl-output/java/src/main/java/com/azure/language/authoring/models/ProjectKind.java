// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.authoring.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Represents the project kind. */
public final class ProjectKind extends ExpandableStringEnum<ProjectKind> {
    /** Static value CustomSingleLabelClassification for ProjectKind. */
    public static final ProjectKind CUSTOM_SINGLE_LABEL_CLASSIFICATION = fromString("CustomSingleLabelClassification");

    /** Static value CustomMultiLabelClassification for ProjectKind. */
    public static final ProjectKind CUSTOM_MULTI_LABEL_CLASSIFICATION = fromString("CustomMultiLabelClassification");

    /** Static value CustomEntityRecognition for ProjectKind. */
    public static final ProjectKind CUSTOM_ENTITY_RECOGNITION = fromString("CustomEntityRecognition");

    /**
     * Creates or finds a ProjectKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProjectKind.
     */
    @JsonCreator
    public static ProjectKind fromString(String name) {
        return fromString(name, ProjectKind.class);
    }

    /**
     * Gets known ProjectKind values.
     *
     * @return known ProjectKind values.
     */
    public static Collection<ProjectKind> values() {
        return values(ProjectKind.class);
    }
}
