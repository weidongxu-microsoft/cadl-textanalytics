// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.language.textanalytics.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Analyzes. */
public final class AnalyzesImpl {
    /** The proxy service used to perform REST calls. */
    private final AnalyzesService service;

    /** The service client containing this operation class. */
    private final TextAnalyticsClientImpl client;

    /**
     * Initializes an instance of AnalyzesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AnalyzesImpl(TextAnalyticsClientImpl client) {
        this.service = RestProxy.create(AnalyzesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftCognitiveLanguageServiceTextAnalyticsAnalyzes to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{Endpoint}/language")
    @ServiceInterface(name = "MicrosoftCognitiveLa")
    private interface AnalyzesService {
        @Post("/:analyze-text")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeText(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Post("/analyze-text/jobs")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> submitJob(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData body,
                RequestOptions requestOptions,
                Context context);

        @Get("/analyze-text/jobs/{jobId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> getJobStatus(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("jobId") String jobId,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Post("/analyze-text/jobs/{jobId}:cancel")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> cancelJob(
                @HostParam("Endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("jobId") String jobId,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Request text analysis over a collection of documents.
     *
     * <p>Submit a collection of text documents for analysis. Specify a single unique task to be executed immediately.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>showStats</td><td>Boolean</td><td>No</td><td>If set to true, response will contain request and document level statistics.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeTextWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.analyzeText(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                accept,
                                body,
                                requestOptions,
                                context));
    }

    /**
     * Request text analysis over a collection of documents.
     *
     * <p>Submit a collection of text documents for analysis. Specify a single unique task to be executed immediately.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>showStats</td><td>Boolean</td><td>No</td><td>If set to true, response will contain request and document level statistics.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     * }
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeTextWithResponse(BinaryData body, RequestOptions requestOptions) {
        return analyzeTextWithResponseAsync(body, requestOptions).block();
    }

    /**
     * Submit text analysis job
     *
     * <p>Submit a collection of text documents for analysis. Specify one or more unique tasks to be executed as a
     * long-running operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     displayName: String (Optional)
     *     analysisInput (Required): {
     *         documents (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 text: String (Required)
     *                 language: String (Optional)
     *             }
     *         ]
     *     }
     *     tasks (Required): [
     *          (Required){
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> submitJobWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.submitJob(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                accept,
                                body,
                                requestOptions,
                                context));
    }

    /**
     * Submit text analysis job
     *
     * <p>Submit a collection of text documents for analysis. Specify one or more unique tasks to be executed as a
     * long-running operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     displayName: String (Optional)
     *     analysisInput (Required): {
     *         documents (Required): [
     *              (Required){
     *                 id: String (Required)
     *                 text: String (Required)
     *                 language: String (Optional)
     *             }
     *         ]
     *     }
     *     tasks (Required): [
     *          (Required){
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> submitJobWithResponse(BinaryData body, RequestOptions requestOptions) {
        return submitJobWithResponseAsync(body, requestOptions).block();
    }

    /**
     * Get analysis status and results
     *
     * Get the status of an analysis job.  A job may consist of one or more tasks.  Once all tasks are succeeded, the job will transition to the succeeded state and results will be available for each task.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the collection.</td></tr>
     *     <tr><td>skip</td><td>Integer</td><td>No</td><td>An offset into the collection of the first resource to be returned.</td></tr>
     *     <tr><td>showStats</td><td>Boolean</td><td>No</td><td>If set to true, response will contain request and document level statistics.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     displayName: String (Optional)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Optional)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     jobId: String (Required)
     *     status: String(notStarted/running/succeeded/partiallySucceeded/failed/cancelled/cancelling) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             message: String (Required)
     *             code: String(InvalidRequest/InvalidArgument/Unauthorized/Forbidden/NotFound/ProjectNotFound/OperationNotFound/AzureCognitiveServiceNotFound/AzureCognitiveSearchIndexNotFound/TooManyRequests/AzureCognitiveSearchThrottling/AzureCognitiveSearchIndexLimitReached/InternalServerError/ServiceUnavailable) (Required)
     *             details (Optional): {
     *                 String: String (Optional)
     *             }
     *             target: String (Optional)
     *             innererror (Optional): {
     *                 message: String (Required)
     *                 code: String(InvalidRequest/InvalidParameterValue/KnowledgeBaseNotFound/AzureCognitiveSearchNotFound/AzureCognitiveSearchThrottling/ExtractionFailure/InvalidRequestBodyFormat/EmptyRequest/MissingInputDocuments/InvalidDocument/ModelVersionIncorrect/InvalidDocumentBatch/UnsupportedLanguageCode/InvalidCountryHint) (Required)
     *                 details (Optional): {
     *                     String: String (Optional)
     *                 }
     *                 target: String (Optional)
     *                 innererror (Optional): (recursive schema, see innererror above)
     *             }
     *         }
     *     ]
     *     @nextLink: String (Required)
     *     tasks (Required): {
     *         completed: int (Required)
     *         failed: int (Required)
     *         inProgress: int (Required)
     *         total: int (Required)
     *         items (Optional): [
     *              (Optional){
     *                 taskName: String (Required)
     *                 lastUpdateDateTime: OffsetDateTime (Required)
     *                 status: String(notStarted/running/succeeded/partiallySucceeded/failed/cancelled/cancelling) (Required)
     *             }
     *         ]
     *     }
     *     statistics (Optional): {
     *         documentsCount: int (Required)
     *         validDocumentsCount: int (Required)
     *         erroneousDocumentsCount: int (Required)
     *         transactionsCount: long (Required)
     *     }
     * }
     * }</pre>
     *
     * @param jobId Job ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status of an analysis job along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getJobStatusWithResponseAsync(String jobId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getJobStatus(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                jobId,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Get analysis status and results
     *
     * Get the status of an analysis job.  A job may consist of one or more tasks.  Once all tasks are succeeded, the job will transition to the succeeded state and results will be available for each task.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the collection.</td></tr>
     *     <tr><td>skip</td><td>Integer</td><td>No</td><td>An offset into the collection of the first resource to be returned.</td></tr>
     *     <tr><td>showStats</td><td>Boolean</td><td>No</td><td>If set to true, response will contain request and document level statistics.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * <pre>{@code
     * {
     *     displayName: String (Optional)
     *     createdDateTime: OffsetDateTime (Required)
     *     expirationDateTime: OffsetDateTime (Optional)
     *     lastUpdateDateTime: OffsetDateTime (Required)
     *     jobId: String (Required)
     *     status: String(notStarted/running/succeeded/partiallySucceeded/failed/cancelled/cancelling) (Required)
     *     errors (Optional): [
     *          (Optional){
     *             message: String (Required)
     *             code: String(InvalidRequest/InvalidArgument/Unauthorized/Forbidden/NotFound/ProjectNotFound/OperationNotFound/AzureCognitiveServiceNotFound/AzureCognitiveSearchIndexNotFound/TooManyRequests/AzureCognitiveSearchThrottling/AzureCognitiveSearchIndexLimitReached/InternalServerError/ServiceUnavailable) (Required)
     *             details (Optional): {
     *                 String: String (Optional)
     *             }
     *             target: String (Optional)
     *             innererror (Optional): {
     *                 message: String (Required)
     *                 code: String(InvalidRequest/InvalidParameterValue/KnowledgeBaseNotFound/AzureCognitiveSearchNotFound/AzureCognitiveSearchThrottling/ExtractionFailure/InvalidRequestBodyFormat/EmptyRequest/MissingInputDocuments/InvalidDocument/ModelVersionIncorrect/InvalidDocumentBatch/UnsupportedLanguageCode/InvalidCountryHint) (Required)
     *                 details (Optional): {
     *                     String: String (Optional)
     *                 }
     *                 target: String (Optional)
     *                 innererror (Optional): (recursive schema, see innererror above)
     *             }
     *         }
     *     ]
     *     @nextLink: String (Required)
     *     tasks (Required): {
     *         completed: int (Required)
     *         failed: int (Required)
     *         inProgress: int (Required)
     *         total: int (Required)
     *         items (Optional): [
     *              (Optional){
     *                 taskName: String (Required)
     *                 lastUpdateDateTime: OffsetDateTime (Required)
     *                 status: String(notStarted/running/succeeded/partiallySucceeded/failed/cancelled/cancelling) (Required)
     *             }
     *         ]
     *     }
     *     statistics (Optional): {
     *         documentsCount: int (Required)
     *         validDocumentsCount: int (Required)
     *         erroneousDocumentsCount: int (Required)
     *         transactionsCount: long (Required)
     *     }
     * }
     * }</pre>
     *
     * @param jobId Job ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the status of an analysis job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getJobStatusWithResponse(String jobId, RequestOptions requestOptions) {
        return getJobStatusWithResponseAsync(jobId, requestOptions).block();
    }

    /**
     * Cancel a long-running Text Analysis job
     *
     * <p>Cancel a long-running Text Analysis job.
     *
     * @param jobId Job ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelJobWithResponseAsync(String jobId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.cancelJob(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                jobId,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Cancel a long-running Text Analysis job
     *
     * <p>Cancel a long-running Text Analysis job.
     *
     * @param jobId Job ID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> cancelJobWithResponse(String jobId, RequestOptions requestOptions) {
        return cancelJobWithResponseAsync(jobId, requestOptions).block();
    }
}
