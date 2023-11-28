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
package com.amazonaws.services.bedrockagentruntime;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrockagentruntime.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock Runtime.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagentruntime.AbstractAWSBedrockAgentRuntime} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Bedrock Agent
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgentRuntime {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock-agent-runtime";

    /**
     * <p>
     * Retrieve from knowledge base.
     * </p>
     * 
     * @param retrieveRequest
     * @return Result of the Retrieve operation returned by the service.
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws DependencyFailedException
     *         This exception is thrown when a request fails due to dependency like Lambda, Bedrock, STS resource due to
     *         a customer fault (i.e. bad configuration)
     * @throws BadGatewayException
     *         This exception is thrown when a request fails due to dependency like Lambda, Bedrock, STS resource
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgentRuntime.Retrieve
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Retrieve" target="_top">AWS
     *      API Documentation</a>
     */
    RetrieveResult retrieve(RetrieveRequest retrieveRequest);

    /**
     * <p>
     * RetrieveAndGenerate API
     * </p>
     * 
     * @param retrieveAndGenerateRequest
     * @return Result of the RetrieveAndGenerate operation returned by the service.
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws DependencyFailedException
     *         This exception is thrown when a request fails due to dependency like Lambda, Bedrock, STS resource due to
     *         a customer fault (i.e. bad configuration)
     * @throws BadGatewayException
     *         This exception is thrown when a request fails due to dependency like Lambda, Bedrock, STS resource
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgentRuntime.RetrieveAndGenerate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
     *      target="_top">AWS API Documentation</a>
     */
    RetrieveAndGenerateResult retrieveAndGenerate(RetrieveAndGenerateRequest retrieveAndGenerateRequest);

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
