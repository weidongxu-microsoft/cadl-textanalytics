// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PiiDomain. */
public final class PiiDomain extends ExpandableStringEnum<PiiDomain> {
    /** Static value phi for PiiDomain. */
    public static final PiiDomain PHI = fromString("phi");

    /** Static value none for PiiDomain. */
    public static final PiiDomain NONE = fromString("none");

    /**
     * Creates or finds a PiiDomain from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PiiDomain.
     */
    @JsonCreator
    public static PiiDomain fromString(String name) {
        return fromString(name, PiiDomain.class);
    }

    /**
     * Gets known PiiDomain values.
     *
     * @return known PiiDomain values.
     */
    public static Collection<PiiDomain> values() {
        return values(PiiDomain.class);
    }
}
