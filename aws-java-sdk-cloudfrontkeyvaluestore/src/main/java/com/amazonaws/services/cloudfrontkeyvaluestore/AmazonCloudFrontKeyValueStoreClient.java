/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudfrontkeyvaluestore;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.cloudfrontkeyvaluestore.AmazonCloudFrontKeyValueStoreClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.cloudfrontkeyvaluestore.model.*;

import com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.*;

/**
 * Client for accessing Amazon CloudFront KeyValueStore. All service calls made using this client are blocking, and will
 * not return until the service call completes.
 * <p>
 * <p>
 * Amazon CloudFront KeyValueStore Service to View and Update Data in a KVS Resource
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontKeyValueStoreClient extends AmazonWebServiceClient implements AmazonCloudFrontKeyValueStore {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonCloudFrontKeyValueStore.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudfront-keyvaluestore";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .withContentTypeOverride("application/json")
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.AccessDeniedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ValidationException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.ValidationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ConflictException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.ConflictExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.InternalServerExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceQuotaExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.ServiceQuotaExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.cloudfrontkeyvaluestore.model.AmazonCloudFrontKeyValueStoreException.class));

    public static AmazonCloudFrontKeyValueStoreClientBuilder builder() {
        return AmazonCloudFrontKeyValueStoreClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudFront KeyValueStore using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontKeyValueStoreClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon CloudFront KeyValueStore using the specified
     * parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontKeyValueStoreClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloudfront-keyvaluestore.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/cloudfrontkeyvaluestore/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/cloudfrontkeyvaluestore/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Deletes the key value pair specified by the key.
     * </p>
     * 
     * @param deleteKeyRequest
     * @return Result of the DeleteKey operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws ValidationException
     *         Validation failed.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Limit exceeded.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.DeleteKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DeleteKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteKeyResult deleteKey(DeleteKeyRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKey(request);
    }

    @SdkInternalApi
    final DeleteKeyResult executeDeleteKey(DeleteKeyRequest deleteKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyRequest> request = null;
        Response<DeleteKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns metadata information about Key Value Store.
     * </p>
     * 
     * @param describeKeyValueStoreRequest
     * @return Result of the DescribeKeyValueStore operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.DescribeKeyValueStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DescribeKeyValueStore"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeKeyValueStoreResult describeKeyValueStore(DescribeKeyValueStoreRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeKeyValueStore(request);
    }

    @SdkInternalApi
    final DescribeKeyValueStoreResult executeDescribeKeyValueStore(DescribeKeyValueStoreRequest describeKeyValueStoreRequest) {

        ExecutionContext executionContext = createExecutionContext(describeKeyValueStoreRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeKeyValueStoreRequest> request = null;
        Response<DescribeKeyValueStoreResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeKeyValueStoreRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeKeyValueStoreRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeKeyValueStore");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeKeyValueStoreResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeKeyValueStoreResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a key value pair.
     * </p>
     * 
     * @param getKeyRequest
     * @return Result of the GetKey operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.GetKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/GetKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetKeyResult getKey(GetKeyRequest request) {
        request = beforeClientExecution(request);
        return executeGetKey(request);
    }

    @SdkInternalApi
    final GetKeyResult executeGetKey(GetKeyRequest getKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyRequest> request = null;
        Response<GetKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of key value pairs.
     * </p>
     * 
     * @param listKeysRequest
     * @return Result of the ListKeys operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws ValidationException
     *         Validation failed.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/ListKeys"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListKeysResult listKeys(ListKeysRequest request) {
        request = beforeClientExecution(request);
        return executeListKeys(request);
    }

    @SdkInternalApi
    final ListKeysResult executeListKeys(ListKeysRequest listKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(listKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListKeysRequest> request = null;
        Response<ListKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new key value pair or replaces the value of an existing key.
     * </p>
     * 
     * @param putKeyRequest
     *        A key value pair.
     * @return Result of the PutKey operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws ValidationException
     *         Validation failed.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Limit exceeded.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.PutKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/PutKey"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutKeyResult putKey(PutKeyRequest request) {
        request = beforeClientExecution(request);
        return executePutKey(request);
    }

    @SdkInternalApi
    final PutKeyResult executePutKey(PutKeyRequest putKeyRequest) {

        ExecutionContext executionContext = createExecutionContext(putKeyRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutKeyRequest> request = null;
        Response<PutKeyResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutKeyRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putKeyRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutKey");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutKeyResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PutKeyResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Puts or Deletes multiple key value pairs in a single, all-or-nothing operation.
     * </p>
     * 
     * @param updateKeysRequest
     * @return Result of the UpdateKeys operation returned by the service.
     * @throws ConflictException
     *         Resource is not in expected state.
     * @throws ValidationException
     *         Validation failed.
     * @throws InternalServerException
     *         Internal server error.
     * @throws ServiceQuotaExceededException
     *         Limit exceeded.
     * @throws ResourceNotFoundException
     *         Resource was not found.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFrontKeyValueStore.UpdateKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/UpdateKeys"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateKeysResult updateKeys(UpdateKeysRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateKeys(request);
    }

    @SdkInternalApi
    final UpdateKeysResult executeUpdateKeys(UpdateKeysRequest updateKeysRequest) {

        ExecutionContext executionContext = createExecutionContext(updateKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateKeysRequest> request = null;
        Response<UpdateKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateKeysRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "CloudFront KeyValueStore");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateKeys");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateKeysResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateKeysResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
