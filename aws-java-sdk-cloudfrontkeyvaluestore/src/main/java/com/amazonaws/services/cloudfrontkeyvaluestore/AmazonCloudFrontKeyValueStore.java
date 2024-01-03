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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudfrontkeyvaluestore.model.*;

/**
 * Interface for accessing Amazon CloudFront KeyValueStore.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudfrontkeyvaluestore.AbstractAmazonCloudFrontKeyValueStore} instead.
 * </p>
 * <p>
 * <p>
 * Amazon CloudFront KeyValueStore Service to View and Update Data in a KVS Resource
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCloudFrontKeyValueStore {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudfront-keyvaluestore";

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
    DeleteKeyResult deleteKey(DeleteKeyRequest deleteKeyRequest);

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
    DescribeKeyValueStoreResult describeKeyValueStore(DescribeKeyValueStoreRequest describeKeyValueStoreRequest);

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
    GetKeyResult getKey(GetKeyRequest getKeyRequest);

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
    ListKeysResult listKeys(ListKeysRequest listKeysRequest);

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
    PutKeyResult putKey(PutKeyRequest putKeyRequest);

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
    UpdateKeysResult updateKeys(UpdateKeysRequest updateKeysRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
