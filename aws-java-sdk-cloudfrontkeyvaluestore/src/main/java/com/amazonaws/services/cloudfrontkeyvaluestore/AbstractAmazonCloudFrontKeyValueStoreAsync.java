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
 * Abstract implementation of {@code AmazonCloudFrontKeyValueStoreAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudFrontKeyValueStoreAsync extends AbstractAmazonCloudFrontKeyValueStore implements AmazonCloudFrontKeyValueStoreAsync {

    protected AbstractAmazonCloudFrontKeyValueStoreAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request) {

        return deleteKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(DescribeKeyValueStoreRequest request) {

        return describeKeyValueStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyValueStoreResult> describeKeyValueStoreAsync(DescribeKeyValueStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyValueStoreRequest, DescribeKeyValueStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request) {

        return getKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutKeyResult> putKeyAsync(PutKeyRequest request) {

        return putKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutKeyResult> putKeyAsync(PutKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutKeyRequest, PutKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(UpdateKeysRequest request) {

        return updateKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateKeysResult> updateKeysAsync(UpdateKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateKeysRequest, UpdateKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
