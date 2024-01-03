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
package com.amazonaws.services.cloudfrontkeyvaluestore.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudfrontkeyvaluestore.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeKeyValueStoreResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyValueStoreResultJsonUnmarshaller implements Unmarshaller<DescribeKeyValueStoreResult, JsonUnmarshallerContext> {

    public DescribeKeyValueStoreResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeKeyValueStoreResult describeKeyValueStoreResult = new DescribeKeyValueStoreResult();

        if (context.isStartOfDocument()) {
            if (context.getHeader("ETag") != null) {
                context.setCurrentHeader("ETag");
                describeKeyValueStoreResult.setETag(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeKeyValueStoreResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    describeKeyValueStoreResult.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalSizeInBytes", targetDepth)) {
                    context.nextToken();
                    describeKeyValueStoreResult.setTotalSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("KvsARN", targetDepth)) {
                    context.nextToken();
                    describeKeyValueStoreResult.setKvsARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    describeKeyValueStoreResult.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    context.nextToken();
                    describeKeyValueStoreResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeKeyValueStoreResult;
    }

    private static DescribeKeyValueStoreResultJsonUnmarshaller instance;

    public static DescribeKeyValueStoreResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeKeyValueStoreResultJsonUnmarshaller();
        return instance;
    }
}
