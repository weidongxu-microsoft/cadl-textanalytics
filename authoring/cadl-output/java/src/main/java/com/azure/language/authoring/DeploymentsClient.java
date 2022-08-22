// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.language.authoring;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous MicrosoftCognitiveLanguageServiceAnalyzeTextAuthoringClient type. */
@ServiceClient(builder = DeploymentsClientBuilder.class)
public final class DeploymentsClient {
    @Generated private final DeploymentsAsyncClient client;

    /**
     * Initializes an instance of DeploymentsClient class.
     *
     * @param client the async client.
     */
    @Generated
    DeploymentsClient(DeploymentsAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets the details of a deployment.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the details of a deployment along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getDeploymentWithResponse(
            String projectName, String deploymentName, RequestOptions requestOptions) {
        return this.client.getDeploymentWithResponse(projectName, deploymentName, requestOptions).block();
    }

    /**
     * Creates a new deployment or replaces an existing one.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deployProjectWithResponse(
            String projectName, String deploymentName, RequestOptions requestOptions) {
        return this.client.deployProjectWithResponse(projectName, deploymentName, requestOptions).block();
    }

    /**
     * Deletes a project deployment.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> deleteDeploymentWithResponse(
            String projectName, String deploymentName, RequestOptions requestOptions) {
        return this.client.deleteDeploymentWithResponse(projectName, deploymentName, requestOptions).block();
    }

    /**
     * Lists the existing deployments.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             name: String (Required)
     *         }
     *     ]
     *     nextLink: String (Optional)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Deployment items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String projectName, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(projectName, requestOptions));
    }

    /**
     * Swaps two existing deployments with each other.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     firstDeploymentName: String (Required)
     *     secondDeploymentName: String (Required)
     * }
     * }</pre>
     *
     * @param projectName The projectName parameter.
     * @param body The body schema of the operation.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> swapDeploymentsWithResponse(
            String projectName, BinaryData body, RequestOptions requestOptions) {
        return this.client.swapDeploymentsWithResponse(projectName, body, requestOptions).block();
    }
}