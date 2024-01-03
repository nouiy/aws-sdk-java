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
package com.amazonaws.services.bedrockagent;

import javax.annotation.Generated;

import com.amazonaws.services.bedrockagent.model.*;

/**
 * Interface for accessing Agents for Amazon Bedrock asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.bedrockagent.AbstractAWSBedrockAgentAsync} instead.
 * </p>
 * <p>
 * <p>
 * An example service, deployed with the Octane Service creator, which will echo the string
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBedrockAgentAsync extends AWSBedrockAgent {

    /**
     * <p>
     * Associate a Knowledge Base to an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     *        Associate Agent Knowledge Base Request
     * @return A Java Future containing the result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(
            AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Associate a Knowledge Base to an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param associateAgentKnowledgeBaseRequest
     *        Associate Agent Knowledge Base Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.AssociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AssociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAgentKnowledgeBaseResult> associateAgentKnowledgeBaseAsync(
            AssociateAgentKnowledgeBaseRequest associateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAgentKnowledgeBaseRequest, AssociateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentRequest
     *        Create Agent Request
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest);

    /**
     * <p>
     * Creates an Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentRequest
     *        Create Agent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentResult> createAgentAsync(CreateAgentRequest createAgentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentRequest, CreateAgentResult> asyncHandler);

    /**
     * <p>
     * Creates an Action Group for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentActionGroupRequest
     *        Create Action Group Request
     * @return A Java Future containing the result of the CreateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(CreateAgentActionGroupRequest createAgentActionGroupRequest);

    /**
     * <p>
     * Creates an Action Group for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentActionGroupRequest
     *        Create Action Group Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentActionGroupResult> createAgentActionGroupAsync(CreateAgentActionGroupRequest createAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentActionGroupRequest, CreateAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Creates an Alias for an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentAliasRequest
     *        Create Agent Alias Request
     * @return A Java Future containing the result of the CreateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(CreateAgentAliasRequest createAgentAliasRequest);

    /**
     * <p>
     * Creates an Alias for an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param createAgentAliasRequest
     *        Create Agent Alias Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAgentAliasResult> createAgentAliasAsync(CreateAgentAliasRequest createAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAgentAliasRequest, CreateAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Create a new data source
     * </p>
     * 
     * @param createDataSourceRequest
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Create a new data source
     * </p>
     * 
     * @param createDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataSourceResult> createDataSourceAsync(CreateDataSourceRequest createDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceRequest, CreateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Create a new knowledge base
     * </p>
     * 
     * @param createKnowledgeBaseRequest
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest);

    /**
     * <p>
     * Create a new knowledge base
     * </p>
     * 
     * @param createKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.CreateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateKnowledgeBaseResult> createKnowledgeBaseAsync(CreateKnowledgeBaseRequest createKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKnowledgeBaseRequest, CreateKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Deletes an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentRequest
     *        Delete Agent Request
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest);

    /**
     * <p>
     * Deletes an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentRequest
     *        Delete Agent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentResult> deleteAgentAsync(DeleteAgentRequest deleteAgentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentRequest, DeleteAgentResult> asyncHandler);

    /**
     * <p>
     * Deletes an Action Group for existing Amazon Bedrock Agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     *        Delete Action Group Request
     * @return A Java Future containing the result of the DeleteAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest);

    /**
     * <p>
     * Deletes an Action Group for existing Amazon Bedrock Agent.
     * </p>
     * 
     * @param deleteAgentActionGroupRequest
     *        Delete Action Group Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentActionGroupResult> deleteAgentActionGroupAsync(DeleteAgentActionGroupRequest deleteAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentActionGroupRequest, DeleteAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentAliasRequest
     *        Delete Agent Alias Request
     * @return A Java Future containing the result of the DeleteAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(DeleteAgentAliasRequest deleteAgentAliasRequest);

    /**
     * <p>
     * Deletes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentAliasRequest
     *        Delete Agent Alias Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentAliasResult> deleteAgentAliasAsync(DeleteAgentAliasRequest deleteAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentAliasRequest, DeleteAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentVersionRequest
     *        Delete Agent Version Request
     * @return A Java Future containing the result of the DeleteAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(DeleteAgentVersionRequest deleteAgentVersionRequest);

    /**
     * <p>
     * Deletes an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param deleteAgentVersionRequest
     *        Delete Agent Version Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAgentVersionResult> deleteAgentVersionAsync(DeleteAgentVersionRequest deleteAgentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAgentVersionRequest, DeleteAgentVersionResult> asyncHandler);

    /**
     * <p>
     * Delete an existing data source
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Delete an existing data source
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

    /**
     * <p>
     * Delete an existing knowledge base
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest);

    /**
     * <p>
     * Delete an existing knowledge base
     * </p>
     * 
     * @param deleteKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.DeleteKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKnowledgeBaseResult> deleteKnowledgeBaseAsync(DeleteKnowledgeBaseRequest deleteKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKnowledgeBaseRequest, DeleteKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Disassociate an existing Knowledge Base from an Amazon Bedrock Agent
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     *        Disassociate Agent Knowledge Base Request
     * @return A Java Future containing the result of the DisassociateAgentKnowledgeBase operation returned by the
     *         service.
     * @sample AWSBedrockAgentAsync.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(
            DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Disassociate an existing Knowledge Base from an Amazon Bedrock Agent
     * </p>
     * 
     * @param disassociateAgentKnowledgeBaseRequest
     *        Disassociate Agent Knowledge Base Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAgentKnowledgeBase operation returned by the
     *         service.
     * @sample AWSBedrockAgentAsyncHandler.DisassociateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DisassociateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAgentKnowledgeBaseResult> disassociateAgentKnowledgeBaseAsync(
            DisassociateAgentKnowledgeBaseRequest disassociateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAgentKnowledgeBaseRequest, DisassociateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Gets an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentRequest
     *        Get Agent Request
     * @return A Java Future containing the result of the GetAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAgentResult> getAgentAsync(GetAgentRequest getAgentRequest);

    /**
     * <p>
     * Gets an Agent for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentRequest
     *        Get Agent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAgentResult> getAgentAsync(GetAgentRequest getAgentRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentRequest, GetAgentResult> asyncHandler);

    /**
     * <p>
     * Gets an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentActionGroupRequest
     *        Get Action Group Request
     * @return A Java Future containing the result of the GetAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(GetAgentActionGroupRequest getAgentActionGroupRequest);

    /**
     * <p>
     * Gets an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentActionGroupRequest
     *        Get Action Group Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentActionGroupResult> getAgentActionGroupAsync(GetAgentActionGroupRequest getAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentActionGroupRequest, GetAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Describes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentAliasRequest
     *        Get Agent Alias Request
     * @return A Java Future containing the result of the GetAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(GetAgentAliasRequest getAgentAliasRequest);

    /**
     * <p>
     * Describes an Alias for a Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentAliasRequest
     *        Get Agent Alias Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentAliasResult> getAgentAliasAsync(GetAgentAliasRequest getAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentAliasRequest, GetAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Gets a knowledge base associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     *        Get Agent Knowledge Base Request
     * @return A Java Future containing the result of the GetAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Gets a knowledge base associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param getAgentKnowledgeBaseRequest
     *        Get Agent Knowledge Base Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentKnowledgeBaseResult> getAgentKnowledgeBaseAsync(GetAgentKnowledgeBaseRequest getAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentKnowledgeBaseRequest, GetAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Gets an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentVersionRequest
     *        Get Agent Version Request
     * @return A Java Future containing the result of the GetAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(GetAgentVersionRequest getAgentVersionRequest);

    /**
     * <p>
     * Gets an Agent version for existing Amazon Bedrock Agent
     * </p>
     * 
     * @param getAgentVersionRequest
     *        Get Agent Version Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAgentVersion operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetAgentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAgentVersionResult> getAgentVersionAsync(GetAgentVersionRequest getAgentVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetAgentVersionRequest, GetAgentVersionResult> asyncHandler);

    /**
     * <p>
     * Get an existing data source
     * </p>
     * 
     * @param getDataSourceRequest
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Get an existing data source
     * </p>
     * 
     * @param getDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Get an ingestion job
     * </p>
     * 
     * @param getIngestionJobRequest
     * @return A Java Future containing the result of the GetIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(GetIngestionJobRequest getIngestionJobRequest);

    /**
     * <p>
     * Get an ingestion job
     * </p>
     * 
     * @param getIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetIngestionJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetIngestionJobResult> getIngestionJobAsync(GetIngestionJobRequest getIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetIngestionJobRequest, GetIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Get an existing knowledge base
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest);

    /**
     * <p>
     * Get an existing knowledge base
     * </p>
     * 
     * @param getKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.GetKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetKnowledgeBase" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKnowledgeBaseResult> getKnowledgeBaseAsync(GetKnowledgeBaseRequest getKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<GetKnowledgeBaseRequest, GetKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Lists an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     *        List Action Groups Request
     * @return A Java Future containing the result of the ListAgentActionGroups operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(ListAgentActionGroupsRequest listAgentActionGroupsRequest);

    /**
     * <p>
     * Lists an Action Group for existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentActionGroupsRequest
     *        List Action Groups Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentActionGroups operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentActionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentActionGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentActionGroupsResult> listAgentActionGroupsAsync(ListAgentActionGroupsRequest listAgentActionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentActionGroupsRequest, ListAgentActionGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists all the Aliases for an Amazon Bedrock Agent
     * </p>
     * 
     * @param listAgentAliasesRequest
     *        List Agent Aliases Request
     * @return A Java Future containing the result of the ListAgentAliases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(ListAgentAliasesRequest listAgentAliasesRequest);

    /**
     * <p>
     * Lists all the Aliases for an Amazon Bedrock Agent
     * </p>
     * 
     * @param listAgentAliasesRequest
     *        List Agent Aliases Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentAliases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentAliases" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentAliasesResult> listAgentAliasesAsync(ListAgentAliasesRequest listAgentAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentAliasesRequest, ListAgentAliasesResult> asyncHandler);

    /**
     * <p>
     * List of Knowledge Bases associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     *        List Agent Knowledge Bases Request
     * @return A Java Future containing the result of the ListAgentKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest);

    /**
     * <p>
     * List of Knowledge Bases associated to an existing Amazon Bedrock Agent Version
     * </p>
     * 
     * @param listAgentKnowledgeBasesRequest
     *        List Agent Knowledge Bases Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentKnowledgeBasesResult> listAgentKnowledgeBasesAsync(ListAgentKnowledgeBasesRequest listAgentKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentKnowledgeBasesRequest, ListAgentKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * Lists Agent Versions
     * </p>
     * 
     * @param listAgentVersionsRequest
     *        List Agent Versions Request
     * @return A Java Future containing the result of the ListAgentVersions operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(ListAgentVersionsRequest listAgentVersionsRequest);

    /**
     * <p>
     * Lists Agent Versions
     * </p>
     * 
     * @param listAgentVersionsRequest
     *        List Agent Versions Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgentVersions operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgentVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAgentVersionsResult> listAgentVersionsAsync(ListAgentVersionsRequest listAgentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentVersionsRequest, ListAgentVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists Agents
     * </p>
     * 
     * @param listAgentsRequest
     *        List Agent Request
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest);

    /**
     * <p>
     * Lists Agents
     * </p>
     * 
     * @param listAgentsRequest
     *        List Agent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAgents operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListAgents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListAgents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAgentsResult> listAgentsAsync(ListAgentsRequest listAgentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAgentsRequest, ListAgentsResult> asyncHandler);

    /**
     * <p>
     * List data sources
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * List data sources
     * </p>
     * 
     * @param listDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataSources operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListDataSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDataSourcesResult> listDataSourcesAsync(ListDataSourcesRequest listDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataSourcesRequest, ListDataSourcesResult> asyncHandler);

    /**
     * <p>
     * List ingestion jobs
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @return A Java Future containing the result of the ListIngestionJobs operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(ListIngestionJobsRequest listIngestionJobsRequest);

    /**
     * <p>
     * List ingestion jobs
     * </p>
     * 
     * @param listIngestionJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIngestionJobs operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListIngestionJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListIngestionJobsResult> listIngestionJobsAsync(ListIngestionJobsRequest listIngestionJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIngestionJobsRequest, ListIngestionJobsResult> asyncHandler);

    /**
     * <p>
     * List Knowledge Bases
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest);

    /**
     * <p>
     * List Knowledge Bases
     * </p>
     * 
     * @param listKnowledgeBasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKnowledgeBases operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListKnowledgeBases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListKnowledgeBases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListKnowledgeBasesResult> listKnowledgeBasesAsync(ListKnowledgeBasesRequest listKnowledgeBasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListKnowledgeBasesRequest, ListKnowledgeBasesResult> asyncHandler);

    /**
     * <p>
     * List tags for a resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags for a resource
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Prepares an existing Amazon Bedrock Agent to receive runtime requests
     * </p>
     * 
     * @param prepareAgentRequest
     *        PrepareAgent Request
     * @return A Java Future containing the result of the PrepareAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(PrepareAgentRequest prepareAgentRequest);

    /**
     * <p>
     * Prepares an existing Amazon Bedrock Agent to receive runtime requests
     * </p>
     * 
     * @param prepareAgentRequest
     *        PrepareAgent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PrepareAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.PrepareAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PrepareAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PrepareAgentResult> prepareAgentAsync(PrepareAgentRequest prepareAgentRequest,
            com.amazonaws.handlers.AsyncHandler<PrepareAgentRequest, PrepareAgentResult> asyncHandler);

    /**
     * <p>
     * Start a new ingestion job
     * </p>
     * 
     * @param startIngestionJobRequest
     * @return A Java Future containing the result of the StartIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsync.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(StartIngestionJobRequest startIngestionJobRequest);

    /**
     * <p>
     * Start a new ingestion job
     * </p>
     * 
     * @param startIngestionJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartIngestionJob operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.StartIngestionJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/StartIngestionJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartIngestionJobResult> startIngestionJobAsync(StartIngestionJobRequest startIngestionJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartIngestionJobRequest, StartIngestionJobResult> asyncHandler);

    /**
     * <p>
     * Tag a resource
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tag a resource
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Untag a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBedrockAgentAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Untag a resource
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentRequest
     *        Update Agent Request
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest);

    /**
     * <p>
     * Updates an existing Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentRequest
     *        Update Agent Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgent operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentResult> updateAgentAsync(UpdateAgentRequest updateAgentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentRequest, UpdateAgentResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Action Group for Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     *        Update Action Group Request
     * @return A Java Future containing the result of the UpdateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(UpdateAgentActionGroupRequest updateAgentActionGroupRequest);

    /**
     * <p>
     * Updates an existing Action Group for Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentActionGroupRequest
     *        Update Action Group Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentActionGroup operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentActionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentActionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentActionGroupResult> updateAgentActionGroupAsync(UpdateAgentActionGroupRequest updateAgentActionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentActionGroupRequest, UpdateAgentActionGroupResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Alias for an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentAliasRequest
     *        Update Agent Alias Request
     * @return A Java Future containing the result of the UpdateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(UpdateAgentAliasRequest updateAgentAliasRequest);

    /**
     * <p>
     * Updates an existing Alias for an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentAliasRequest
     *        Update Agent Alias Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentAlias operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentAliasResult> updateAgentAliasAsync(UpdateAgentAliasRequest updateAgentAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentAliasRequest, UpdateAgentAliasResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Knowledge Base associated to an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     *        Update Agent Knowledge Base Request
     * @return A Java Future containing the result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest);

    /**
     * <p>
     * Updates an existing Knowledge Base associated to an Amazon Bedrock Agent
     * </p>
     * 
     * @param updateAgentKnowledgeBaseRequest
     *        Update Agent Knowledge Base Request
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAgentKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateAgentKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgentKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAgentKnowledgeBaseResult> updateAgentKnowledgeBaseAsync(UpdateAgentKnowledgeBaseRequest updateAgentKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAgentKnowledgeBaseRequest, UpdateAgentKnowledgeBaseResult> asyncHandler);

    /**
     * <p>
     * Update an existing data source
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Update an existing data source
     * </p>
     * 
     * @param updateDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateDataSource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

    /**
     * <p>
     * Update an existing knowledge base
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @return A Java Future containing the result of the UpdateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsync.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest);

    /**
     * <p>
     * Update an existing knowledge base
     * </p>
     * 
     * @param updateKnowledgeBaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateKnowledgeBase operation returned by the service.
     * @sample AWSBedrockAgentAsyncHandler.UpdateKnowledgeBase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateKnowledgeBaseResult> updateKnowledgeBaseAsync(UpdateKnowledgeBaseRequest updateKnowledgeBaseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateKnowledgeBaseRequest, UpdateKnowledgeBaseResult> asyncHandler);

}
