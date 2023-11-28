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
package com.amazonaws.services.bedrockagent;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.bedrockagent.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagent.AbstractAWSBedrockAgent} instead.
 * </p>
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgent {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "bedrock-agent";

    /**
     * <p>
     * Associate a Knowledge Base to an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     *        Associate Agent Knowledge Base Request
     * @return Result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateAgentKnowledgeBaseResult associateAgentKnowledgeBase(AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Creates an Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentRequest
     *        Create Agent Request
     * @return Result of the CreateAgent operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAgentResult createAgent(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an Action Group for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentActionGroupRequest
     *        Create Action Group Request
     * @return Result of the CreateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    CreateAgentActionGroupResult createAgentActionGroup(CreateAgentActionGroupRequest createAgentActionGroupRequest);

    /**
     * <p>
     * Creates an Alias for an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentAliasRequest
     *        Create Agent Alias Request
     * @return Result of the CreateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    CreateAgentAliasResult createAgentAlias(CreateAgentAliasRequest createAgentAliasRequest);

    /**
     * <p>
     * Create a new data source
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Create a new knowledge base
     * </p>
     * 
     * @param createKnowledgeBaseRequest
     * @return Result of the CreateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    CreateKnowledgeBaseResult createKnowledgeBase(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Deletes an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentRequest
     *        Delete Agent Request
     * @return Result of the DeleteAgent operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAgentResult deleteAgent(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes an Action Group for existing Amazon Bedrock Agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     *        Delete Action Group Request
     * @return Result of the DeleteAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAgentActionGroupResult deleteAgentActionGroup(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest);

    /**
     * <p>
     * Deletes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentAliasRequest
     *        Delete Agent Alias Request
     * @return Result of the DeleteAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteAgentAliasResult deleteAgentAlias(DeleteAgentAliasRequest deleteAgentAliasRequest);

    /**
     * <p>
     * Deletes an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentVersionRequest
     *        Delete Agent Version Request
     * @return Result of the DeleteAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteAgentVersionResult deleteAgentVersion(DeleteAgentVersionRequest deleteAgentVersionRequest);

    /**
     * <p>
     * Delete an existing data source
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Delete an existing knowledge base
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return Result of the DeleteKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteKnowledgeBaseResult deleteKnowledgeBase(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Disassociate an existing Knowledge Base from an Amazon Bedrock Agent
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     *        Disassociate Agent Knowledge Base Request
     * @return Result of the DisassociateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateAgentKnowledgeBaseResult disassociateAgentKnowledgeBase(DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentRequest
     *        Get Agent Request
     * @return Result of the GetAgent operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    GetAgentResult getAgent(GetAgentRequest getAgentRequest);

    /**
     * <p>
     * Gets an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentActionGroupRequest
     *        Get Action Group Request
     * @return Result of the GetAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    GetAgentActionGroupResult getAgentActionGroup(GetAgentActionGroupRequest getAgentActionGroupRequest);

    /**
     * <p>
     * Describes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentAliasRequest
     *        Get Agent Alias Request
     * @return Result of the GetAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    GetAgentAliasResult getAgentAlias(GetAgentAliasRequest getAgentAliasRequest);

    /**
     * <p>
     * Gets a knowledge base associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     *        Get Agent Knowledge Base Request
     * @return Result of the GetAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    GetAgentKnowledgeBaseResult getAgentKnowledgeBase(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentVersionRequest
     *        Get Agent Version Request
     * @return Result of the GetAgentVersion operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetAgentVersionResult getAgentVersion(GetAgentVersionRequest getAgentVersionRequest);

    /**
     * <p>
     * Get an existing data source
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Get an ingestion job
     * </p>
     * 
     * @param getIngestionJobRequest
     * @return Result of the GetIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetIngestionJobResult getIngestionJob(GetIngestionJobRequest getIngestionJobRequest);

    /**
     * <p>
     * Get an existing knowledge base
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return Result of the GetKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    GetKnowledgeBaseResult getKnowledgeBase(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Lists an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     *        List Action Groups Request
     * @return Result of the ListAgentActionGroups operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentActionGroupsResult listAgentActionGroups(ListAgentActionGroupsRequest listAgentActionGroupsRequest);

    /**
     * <p>
     * Lists all the Aliases for an Amazon Bedrock Agent
     * </p>
     * 
     * @param listAgentAliasesRequest
     *        List Agent Aliases Request
     * @return Result of the ListAgentAliases operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    ListAgentAliasesResult listAgentAliases(ListAgentAliasesRequest listAgentAliasesRequest);

    /**
     * <p>
     * List of Knowledge Bases associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     *        List Agent Knowledge Bases Request
     * @return Result of the ListAgentKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentKnowledgeBasesResult listAgentKnowledgeBases(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest);

    /**
     * <p>
     * Lists Agent Versions
     * </p>
     * 
     * @param listAgentVersionsRequest
     *        List Agent Versions Request
     * @return Result of the ListAgentVersions operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAgentVersionsResult listAgentVersions(ListAgentVersionsRequest listAgentVersionsRequest);

    /**
     * <p>
     * Lists Agents
     * </p>
     * 
     * @param listAgentsRequest
     *        List Agent Request
     * @return Result of the ListAgents operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @sample AWSBedrockAgent.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    ListAgentsResult listAgents(ListAgentsRequest listAgentsRequest);

    /**
     * <p>
     * List data sources
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * List ingestion jobs
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @return Result of the ListIngestionJobs operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListIngestionJobsResult listIngestionJobs(ListIngestionJobsRequest listIngestionJobsRequest);

    /**
     * <p>
     * List Knowledge Bases
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return Result of the ListKnowledgeBases operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @sample AWSBedrockAgent.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    ListKnowledgeBasesResult listKnowledgeBases(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * List tags for a resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Prepares an existing Amazon Bedrock Agent to receive runtime requests
     * </p>
     * 
     * @param prepareAgentRequest
     *        PrepareAgent Request
     * @return Result of the PrepareAgent operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    PrepareAgentResult prepareAgent(PrepareAgentRequest prepareAgentRequest);

    /**
     * <p>
     * Start a new ingestion job
     * </p>
     * 
     * @param startIngestionJobRequest
     * @return Result of the StartIngestionJob operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartIngestionJobResult startIngestionJob(StartIngestionJobRequest startIngestionJobRequest);

    /**
     * <p>
     * Tag a resource
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untag a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @sample AWSBedrockAgent.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentRequest
     *        Update Agent Request
     * @return Result of the UpdateAgent operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAgentResult updateAgent(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates an existing Action Group for Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     *        Update Action Group Request
     * @return Result of the UpdateAgentActionGroup operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAgentActionGroupResult updateAgentActionGroup(UpdateAgentActionGroupRequest updateAgentActionGroupRequest);

    /**
     * <p>
     * Updates an existing Alias for an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentAliasRequest
     *        Update Agent Alias Request
     * @return Result of the UpdateAgentAlias operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @throws ServiceQuotaExceededException
     *         This exception is thrown when a request is made beyond the service quota
     * @sample AWSBedrockAgent.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateAgentAliasResult updateAgentAlias(UpdateAgentAliasRequest updateAgentAliasRequest);

    /**
     * <p>
     * Updates an existing Knowledge Base associated to an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     *        Update Agent Knowledge Base Request
     * @return Result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAgentKnowledgeBaseResult updateAgentKnowledgeBase(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Update an existing data source
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Update an existing knowledge base
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @return Result of the UpdateKnowledgeBase operation returned by the service.
     * @throws ThrottlingException
     *         This exception is thrown when the number of requests exceeds the limit
     * @throws AccessDeniedException
     *         This exception is thrown when a request is denied per access permissions
     * @throws ValidationException
     *         This exception is thrown when the request's input validation fails
     * @throws InternalServerException
     *         This exception is thrown if there was an unexpected error during processing of request
     * @throws ResourceNotFoundException
     *         This exception is thrown when a resource referenced by the operation does not exist
     * @throws ConflictException
     *         This exception is thrown when there is a conflict performing an operation
     * @sample AWSBedrockAgent.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateKnowledgeBaseResult updateKnowledgeBase(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest);

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
