/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.services.cloudfrontkeyvaluestore.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon CloudFront KeyValueStore asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon CloudFront KeyValueStore Service to View and Update Data in a KVS Resource
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCloudFrontKeyValueStoreAsyncClient extends AmazonCloudFrontKeyValueStoreClient implements AmazonCloudFrontKeyValueStoreAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCloudFrontKeyValueStoreAsyncClientBuilder asyncBuilder() {
        return AmazonCloudFrontKeyValueStoreAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudFront KeyValueStore using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCloudFrontKeyValueStoreAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon CloudFront KeyValueStore using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AmazonCloudFrontKeyValueStoreAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request) {

        return deleteKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(final DeleteKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler) {
        final DeleteKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteKeyResult>() {
            @Override
            public DeleteKeyResult call() throws Exception {
                DeleteKeyResult result = null;

                try {
                    result = executeDeleteKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(DescribeKeyValueStoreRequest request) {

        return describeKeyValueStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(final DescribeKeyValueStoreRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeyValueStoreRequest, DescribeKeyValueStoreResult> asyncHandler) {
        final DescribeKeyValueStoreRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeKeyValueStoreResult>() {
            @Override
            public DescribeKeyValueStoreResult call() throws Exception {
                DescribeKeyValueStoreResult result = null;

                try {
                    result = executeDescribeKeyValueStore(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request) {

        return getKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(final GetKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler) {
        final GetKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetKeyResult>() {
            @Override
            public GetKeyResult call() throws Exception {
                GetKeyResult result = null;

                try {
                    result = executeGetKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(final ListKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {
        final ListKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListKeysResult>() {
            @Override
            public ListKeysResult call() throws Exception {
                ListKeysResult result = null;

                try {
                    result = executeListKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutKeyResult> putKeyAsync(PutKeyRequest request) {

        return putKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeyResult> putKeyAsync(final PutKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKeyRequest, PutKeyResult> asyncHandler) {
        final PutKeyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutKeyResult>() {
            @Override
            public PutKeyResult call() throws Exception {
                PutKeyResult result = null;

                try {
                    result = executePutKey(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(UpdateKeysRequest request) {

        return updateKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(final UpdateKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKeysRequest, UpdateKeysResult> asyncHandler) {
        final UpdateKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateKeysResult>() {
            @Override
            public UpdateKeysResult call() throws Exception {
                UpdateKeysResult result = null;

                try {
                    result = executeUpdateKeys(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
