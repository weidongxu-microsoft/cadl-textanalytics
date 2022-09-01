// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SentenceSentiment model. */
@Fluent
public final class SentenceSentiment {
    /*
     * The sentence text.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * The predicted sentiment for the sentence.
     */
    @JsonProperty(value = "sentiment", required = true)
    private SentenceSentimentValue sentiment;

    /*
     * The sentiment confidence score between 0 and 1 for the sentence for all classes.
     */
    @JsonProperty(value = "confidenceScores", required = true)
    private SentimentConfidenceScorePerLabel confidenceScores;

    /*
     * The sentence offset from the start of the document.
     */
    @JsonProperty(value = "offset", required = true)
    private long offset;

    /*
     * The length of the sentence.
     */
    @JsonProperty(value = "length", required = true)
    private long length;

    /*
     * The array of sentence targets for the sentence.
     */
    @JsonProperty(value = "targets")
    private List<SentenceTarget> targets;

    /*
     * The array of assessments for the sentence.
     */
    @JsonProperty(value = "assessements")
    private List<SentenceAssessment> assessements;

    /**
     * Creates an instance of SentenceSentiment class.
     *
     * @param text the text value to set.
     * @param sentiment the sentiment value to set.
     * @param confidenceScores the confidenceScores value to set.
     * @param offset the offset value to set.
     * @param length the length value to set.
     */
    @JsonCreator
    public SentenceSentiment(
            @JsonProperty(value = "text", required = true) String text,
            @JsonProperty(value = "sentiment", required = true) SentenceSentimentValue sentiment,
            @JsonProperty(value = "confidenceScores", required = true)
                    SentimentConfidenceScorePerLabel confidenceScores,
            @JsonProperty(value = "offset", required = true) long offset,
            @JsonProperty(value = "length", required = true) long length) {
        this.text = text;
        this.sentiment = sentiment;
        this.confidenceScores = confidenceScores;
        this.offset = offset;
        this.length = length;
    }

    /**
     * Get the text property: The sentence text.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Get the sentiment property: The predicted sentiment for the sentence.
     *
     * @return the sentiment value.
     */
    public SentenceSentimentValue getSentiment() {
        return this.sentiment;
    }

    /**
     * Get the confidenceScores property: The sentiment confidence score between 0 and 1 for the sentence for all
     * classes.
     *
     * @return the confidenceScores value.
     */
    public SentimentConfidenceScorePerLabel getConfidenceScores() {
        return this.confidenceScores;
    }

    /**
     * Get the offset property: The sentence offset from the start of the document.
     *
     * @return the offset value.
     */
    public long getOffset() {
        return this.offset;
    }

    /**
     * Get the length property: The length of the sentence.
     *
     * @return the length value.
     */
    public long getLength() {
        return this.length;
    }

    /**
     * Get the targets property: The array of sentence targets for the sentence.
     *
     * @return the targets value.
     */
    public List<SentenceTarget> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The array of sentence targets for the sentence.
     *
     * @param targets the targets value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setTargets(List<SentenceTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the assessements property: The array of assessments for the sentence.
     *
     * @return the assessements value.
     */
    public List<SentenceAssessment> getAssessements() {
        return this.assessements;
    }

    /**
     * Set the assessements property: The array of assessments for the sentence.
     *
     * @param assessements the assessements value to set.
     * @return the SentenceSentiment object itself.
     */
    public SentenceSentiment setAssessements(List<SentenceAssessment> assessements) {
        this.assessements = assessements;
        return this;
    }
}