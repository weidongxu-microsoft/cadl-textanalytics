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
import com.azure.core.http.rest.ResponseBase;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.language.authoring.models.Deployment;
import com.azure.language.authoring.models.DeploymentsDeleteDeploymentHeaders;
import com.azure.language.authoring.models.DeploymentsDeployProjectHeaders;
import com.azure.language.authoring.models.DeploymentsSwapDeploymentsHeaders;
import com.azure.language.authoring.models.SwapDeploymentsOptions;

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

    /*
     * Generated convenience method for getDeploymentWithResponse
     */
    /**
     * Gets the details of a deployment.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a deployment.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Deployment getDeployment(String projectName, String deploymentName) {
        RequestOptions requestOptions = new RequestOptions();
        return getDeploymentWithResponse(projectName, deploymentName, requestOptions)
                .getValue()
                .toObject(Deployment.class);
    }

    /*
     * Generated convenience method for getDeploymentWithResponse
     */
    /**
     * Gets the details of a deployment.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of a deployment along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Deployment> getDeploymentWithResponse(String projectName, String deploymentName, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                getDeploymentWithResponse(projectName, deploymentName, requestOptions);
        return new SimpleResponse<>(
                protocolMethodResponse, protocolMethodResponse.getValue().toObject(Deployment.class));
    }

    /*
     * Generated convenience method for deployProjectWithResponse
     */
    /**
     * Creates a new deployment or replaces an existing one.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Deployment deployProject(String projectName, String deploymentName) {
        RequestOptions requestOptions = new RequestOptions();
        return deployProjectWithResponse(projectName, deploymentName, requestOptions)
                .getValue()
                .toObject(Deployment.class);
    }

    /*
     * Generated convenience method for deployProjectWithResponse
     */
    /**
     * Creates a new deployment or replaces an existing one.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link ResponseBase}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<DeploymentsDeployProjectHeaders, Deployment> deployProjectWithResponse(
            String projectName, String deploymentName, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                deployProjectWithResponse(projectName, deploymentName, requestOptions);
        return new ResponseBase<>(
                protocolMethodResponse.getRequest(),
                protocolMethodResponse.getStatusCode(),
                protocolMethodResponse.getHeaders(),
                protocolMethodResponse.getValue().toObject(Deployment.class),
                new DeploymentsDeployProjectHeaders(protocolMethodResponse.getHeaders()));
    }

    /*
     * Generated convenience method for deleteDeploymentWithResponse
     */
    /**
     * Deletes a project deployment.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Deployment deleteDeployment(String projectName, String deploymentName) {
        RequestOptions requestOptions = new RequestOptions();
        return deleteDeploymentWithResponse(projectName, deploymentName, requestOptions)
                .getValue()
                .toObject(Deployment.class);
    }

    /*
     * Generated convenience method for deleteDeploymentWithResponse
     */
    /**
     * Deletes a project deployment.
     *
     * @param projectName The projectName parameter.
     * @param deploymentName The deploymentName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link ResponseBase}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<DeploymentsDeleteDeploymentHeaders, Deployment> deleteDeploymentWithResponse(
            String projectName, String deploymentName, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                deleteDeploymentWithResponse(projectName, deploymentName, requestOptions);
        return new ResponseBase<>(
                protocolMethodResponse.getRequest(),
                protocolMethodResponse.getStatusCode(),
                protocolMethodResponse.getHeaders(),
                protocolMethodResponse.getValue().toObject(Deployment.class),
                new DeploymentsDeleteDeploymentHeaders(protocolMethodResponse.getHeaders()));
    }

    /*
     * Generated convenience method for swapDeploymentsWithResponse
     */
    /**
     * Swaps two existing deployments with each other.
     *
     * @param projectName The projectName parameter.
     * @param body The body schema of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void swapDeployments(String projectName, SwapDeploymentsOptions body) {
        RequestOptions requestOptions = new RequestOptions();
        swapDeploymentsWithResponse(projectName, BinaryData.fromObject(body), requestOptions).getValue();
    }

    /*
     * Generated convenience method for swapDeploymentsWithResponse
     */
    /**
     * Swaps two existing deployments with each other.
     *
     * @param projectName The projectName parameter.
     * @param body The body schema of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link ResponseBase}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResponseBase<DeploymentsSwapDeploymentsHeaders, Void> swapDeploymentsWithResponse(
            String projectName, SwapDeploymentsOptions body, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<Void> protocolMethodResponse =
                swapDeploymentsWithResponse(projectName, BinaryData.fromObject(body), requestOptions);
        return new ResponseBase<>(
                protocolMethodResponse.getRequest(),
                protocolMethodResponse.getStatusCode(),
                protocolMethodResponse.getHeaders(),
                null,
                new DeploymentsSwapDeploymentsHeaders(protocolMethodResponse.getHeaders()));
    }
}
