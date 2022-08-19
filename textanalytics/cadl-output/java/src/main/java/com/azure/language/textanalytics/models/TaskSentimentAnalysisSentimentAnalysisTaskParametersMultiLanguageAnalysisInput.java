// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput.class)
@JsonTypeName("SentimentAnalysis")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AnalyzeTextSentimentAnalysisInput", value = AnalyzeTextSentimentAnalysisInput.class)
})
@Fluent
public class TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput extends AnalyzeTextTask {
    /*
     * The analysisInput property.
     */
    @JsonProperty(value = "analysisInput")
    private MultiLanguageAnalysisInput analysisInput;

    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private SentimentAnalysisTaskParameters parameters;

    /**
     * Get the analysisInput property: The analysisInput property.
     *
     * @return the analysisInput value.
     */
    public MultiLanguageAnalysisInput getAnalysisInput() {
        return this.analysisInput;
    }

    /**
     * Set the analysisInput property: The analysisInput property.
     *
     * @param analysisInput the analysisInput value to set.
     * @return the TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput object itself.
     */
    public TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput setAnalysisInput(
            MultiLanguageAnalysisInput analysisInput) {
        this.analysisInput = analysisInput;
        return this;
    }

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public SentimentAnalysisTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput object itself.
     */
    public TaskSentimentAnalysisSentimentAnalysisTaskParametersMultiLanguageAnalysisInput setParameters(
            SentimentAnalysisTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
