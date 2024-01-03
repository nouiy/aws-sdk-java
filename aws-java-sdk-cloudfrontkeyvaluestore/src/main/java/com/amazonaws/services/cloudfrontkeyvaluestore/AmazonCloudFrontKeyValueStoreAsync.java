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

/**
 * Interface for accessing Amazon CloudFront KeyValueStore asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudfrontkeyvaluestore.AbstractAmazonCloudFrontKeyValueStoreAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudFront KeyValueStore Service to View and Update Data in a KVS Resource
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudFrontKeyValueStoreAsync extends AmazonCloudFrontKeyValueStore {

    /**
     * <p>
     * Deletes the key value pair specified by the key.
     * </p>
     * 
     * @param deleteKeyRequest
     * @return A Java Future containing the result of the DeleteKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.DeleteKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DeleteKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest deleteKeyRequest);

    /**
     * <p>
     * Deletes the key value pair specified by the key.
     * </p>
     * 
     * @param deleteKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.DeleteKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DeleteKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest deleteKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler);

    /**
     * <p>
     * Returns metadata information about Key Value Store.
     * </p>
     * 
     * @param describeKeyValueStoreRequest
     * @return A Java Future containing the result of the DescribeKeyValueStore operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.DescribeKeyValueStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DescribeKeyValueStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(DescribeKeyValueStoreRequest describeKeyValueStoreRequest);

    /**
     * <p>
     * Returns metadata information about Key Value Store.
     * </p>
     * 
     * @param describeKeyValueStoreRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeKeyValueStore operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.DescribeKeyValueStore
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DescribeKeyValueStore"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(DescribeKeyValueStoreRequest describeKeyValueStoreRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyValueStoreRequest, DescribeKeyValueStoreResult> asyncHandler);

    /**
     * <p>
     * Returns a key value pair.
     * </p>
     * 
     * @param getKeyRequest
     * @return A Java Future containing the result of the GetKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.GetKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/GetKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest getKeyRequest);

    /**
     * <p>
     * Returns a key value pair.
     * </p>
     * 
     * @param getKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.GetKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/GetKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest getKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler);

    /**
     * <p>
     * Returns a list of key value pairs.
     * </p>
     * 
     * @param listKeysRequest
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/ListKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest);

    /**
     * <p>
     * Returns a list of key value pairs.
     * </p>
     * 
     * @param listKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/ListKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * <p>
     * Creates a new key value pair or replaces the value of an existing key.
     * </p>
     * 
     * @param putKeyRequest
     *        A key value pair.
     * @return A Java Future containing the result of the PutKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.PutKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/PutKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKeyResult> putKeyAsync(PutKeyRequest putKeyRequest);

    /**
     * <p>
     * Creates a new key value pair or replaces the value of an existing key.
     * </p>
     * 
     * @param putKeyRequest
     *        A key value pair.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutKey operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.PutKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/PutKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutKeyResult> putKeyAsync(PutKeyRequest putKeyRequest,
            com.amazonaws.handlers.AsyncHandler<PutKeyRequest, PutKeyResult> asyncHandler);

    /**
     * <p>
     * Puts or Deletes multiple key value pairs in a single, all-or-nothing operation.
     * </p>
     * 
     * @param updateKeysRequest
     * @return A Java Future containing the result of the UpdateKeys operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsync.UpdateKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/UpdateKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(UpdateKeysRequest updateKeysRequest);

    /**
     * <p>
     * Puts or Deletes multiple key value pairs in a single, all-or-nothing operation.
     * </p>
     * 
     * @param updateKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKeys operation returned by the service.
     * @sample AmazonCloudFrontKeyValueStoreAsyncHandler.UpdateKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/UpdateKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(UpdateKeysRequest updateKeysRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKeysRequest, UpdateKeysResult> asyncHandler);

}
