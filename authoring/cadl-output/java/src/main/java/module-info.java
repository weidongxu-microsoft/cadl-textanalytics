// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.language.authoring {
    requires transitive com.azure.core;

    exports com.azure.language.authoring;
    exports com.azure.language.authoring.models;

    opens com.azure.language.authoring.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}