// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.authoring;

import com.azure.ai.language.authoring.implementation.ProjectsImpl;
import com.azure.ai.language.authoring.models.Project;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollerFlux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous AuthoringClient type. */
@ServiceClient(builder = ProjectsClientBuilder.class, isAsync = true)
public final class ProjectsAsyncClient {
    @Generated private final ProjectsImpl serviceClient;

    /**
     * Initializes an instance of ProjectsAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ProjectsAsyncClient(ProjectsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a new project or updates an existing one.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     projectKind: String(CustomSingleLabelClassification/CustomMultiLabelClassification/CustomEntityRecognition) (Optional)
     *     storageInputContainerName: String (Optional)
     *     settings (Optional): {
     *         String: String (Optional)
     *     }
     *     multilingual: Boolean (Optional)
     *     description: String (Optional)
     *     language: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     projectName: String (Required)
     *     projectKind: String(CustomSingleLabelClassification/CustomMultiLabelClassification/CustomEntityRecognition) (Required)
     *     storageInputContainerName: String (Required)
     *     settings (Optional): {
     *         String: String (Optional)
     *     }
     *     multilingual: Boolean (Optional)
     *     description: String (Optional)
     *     language: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     lastModifiedDateTime: OffsetDateTime (Required)
     *     lastTrainedDateTime: OffsetDateTime (Required)
     *     lastDeployedDateTime: OffsetDateTime (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param optionalProperties The template for adding optional properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginCreateOrUpdate(
            String projectName, BinaryData optionalProperties, RequestOptions requestOptions) {
        return this.serviceClient.beginCreateOrUpdateAsync(projectName, optionalProperties, requestOptions);
    }

    /**
     * Gets the details of a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     projectName: String (Required)
     *     projectKind: String(CustomSingleLabelClassification/CustomMultiLabelClassification/CustomEntityRecognition) (Required)
     *     storageInputContainerName: String (Required)
     *     settings (Optional): {
     *         String: String (Optional)
     *     }
     *     multilingual: Boolean (Optional)
     *     description: String (Optional)
     *     language: String (Required)
     *     createdDateTime: OffsetDateTime (Required)
     *     lastModifiedDateTime: OffsetDateTime (Required)
     *     lastTrainedDateTime: OffsetDateTime (Required)
     *     lastDeployedDateTime: OffsetDateTime (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the details of a project along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(projectName, requestOptions);
    }

    /**
     * Deletes a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     status: String(InProgress/Succeeded/Failed/Canceled) (Required)
     *     error: ResponseError (Optional)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of status monitor resource for long running operations.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginDelete(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.beginDeleteAsync(projectName, requestOptions);
    }

    /**
     * Lists the existing projects.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Long</td><td>No</td><td>The top parameter</td></tr>
     *     <tr><td>skip</td><td>Long</td><td>No</td><td>The skip parameter</td></tr>
     *     <tr><td>maxpagesize</td><td>Long</td><td>No</td><td>The maxPageSize parameter</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             projectName: String (Required)
     *             projectKind: String(CustomSingleLabelClassification/CustomMultiLabelClassification/CustomEntityRecognition) (Required)
     *             storageInputContainerName: String (Required)
     *             settings (Optional): {
     *                 String: String (Optional)
     *             }
     *             multilingual: Boolean (Optional)
     *             description: String (Optional)
     *             language: String (Required)
     *             createdDateTime: OffsetDateTime (Required)
     *             lastModifiedDateTime: OffsetDateTime (Required)
     *             lastTrainedDateTime: OffsetDateTime (Required)
     *             lastDeployedDateTime: OffsetDateTime (Required)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Project items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> list(RequestOptions requestOptions) {
        return this.serviceClient.listAsync(requestOptions);
    }

    /**
     * Triggers a job to export a project's data.
     *
     * @param projectName The projectName parameter.
     * @param projectFileVersion The projectFileVersion parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginExport(
            String projectName, String projectFileVersion, RequestOptions requestOptions) {
        return this.serviceClient.beginExportAsync(projectName, projectFileVersion, requestOptions);
    }

    /**
     * Triggers a job to export a project's data.
     *
     * @param projectName The projectName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginImportx(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.beginImportxAsync(projectName, requestOptions);
    }

    /**
     * Triggers a training job for a project.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     modelLabel: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param body Training job parameters.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginTrain(
            String projectName, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.beginTrainAsync(projectName, body, requestOptions);
    }

    /**
     * Gets the details of a project.
     *
     * @param projectName The projectName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a project on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Project> get(String projectName) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(projectName, requestOptions)
                .map(Response::getValue)
                .map(protocolMethodData -> protocolMethodData.toObject(Project.class));
    }
}