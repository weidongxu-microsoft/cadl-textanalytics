// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AnalyzeTextTask model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = AnalyzeTextTask.class)
@JsonTypeName("AnalyzeTextTask")
@JsonSubTypes({
    @JsonSubTypes.Type(
            name = "EntityRecognition",
            value = TaskEntityRecognitionEntitiesTaskParametersMultiLanguageAnalysisInput.class),
    @JsonSubTypes.Type(
            name = "EntityLinking",
            value = TaskEntityLinkingEntityLinkingTaskParametersMultiLanguageAnalysisInput.class),
    @JsonSubTypes.Type(
            name = "KeyPhraseExtraction",
            value = TaskKeyPhraseExtractionKeyPhraseTaskParametersMultiLanguageAnalysisInput.class),
    @JsonSubTypes.Type(
            name = "LanguageDetection",
            value = TaskLanguageDetectionLanguageDetectionTaskParametersLanguageDetectionAnalysisInput.class),
    @JsonSubTypes.Type(
            name = "PiiEntityRecognition",
            value = TaskPiiEntityRecognitionPiiTaskParametersMultiLanguageAnalysisInput.class),
    @JsonSubTypes.Type(
            name = "SentimentAnalysis",
            value = TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput.class)
})
@Immutable
public class AnalyzeTextTask {}
