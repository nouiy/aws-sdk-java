/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivschat;

import javax.annotation.Generated;

import com.amazonaws.services.ivschat.model.*;

/**
 * Interface for accessing ivschat asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.ivschat.AbstractAmazonivschatAsync} instead.
 * </p>
 * <p>
 * <p>
 * <b>Introduction</b>
 * </p>
 * <p>
 * The Amazon IVS Chat control-plane API enables you to create and manage Amazon IVS Chat resources. You also need to
 * integrate with the <a href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html">
 * Amazon IVS Chat Messaging API</a>, to enable users to interact with chat rooms in real time.
 * </p>
 * <p>
 * The API is an AWS regional service. For a list of supported regions and Amazon IVS Chat HTTPS service endpoints, see
 * the Amazon IVS Chat information on the <a href="https://docs.aws.amazon.com/general/latest/gr/ivs.html">Amazon IVS
 * page</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Notes on terminology:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * You create service applications using the Amazon IVS Chat API. We refer to these as <i>applications</i>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You create front-end client applications (browser and Android/iOS apps) using the Amazon IVS Chat Messaging API. We
 * refer to these as <i>clients</i>.
 * </p>
 * </li>
 * </ul>
 * 
 * <pre>
 * <code> &lt;p&gt; &lt;b&gt;Resources&lt;/b&gt; &lt;/p&gt; &lt;p&gt;The following resource is part of Amazon IVS Chat:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Room&lt;/b&gt; — The central Amazon IVS Chat resource through which clients connect to and exchange chat messages. See the Room endpoints for more information.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;API Access Security&lt;/b&gt; &lt;/p&gt; &lt;p&gt;Your Amazon IVS Chat applications (service applications and clients) must be authenticated and authorized to access Amazon IVS Chat resources. Note the differences between these concepts:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt;Authentication&lt;/i&gt; is about verifying identity. Requests to the Amazon IVS Chat API must be signed to verify your identity.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt;Authorization&lt;/i&gt; is about granting permissions. Your IAM roles need to have permissions for Amazon IVS Chat API requests.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;Users (viewers) connect to a room using secure access tokens that you create using the &lt;a&gt;CreateChatToken&lt;/a&gt; endpoint through the AWS SDK. You call CreateChatToken for every user’s chat session, passing identity and authorization information about the user.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Signing API Requests&lt;/b&gt; &lt;/p&gt; &lt;p&gt;HTTP API requests must be signed with an AWS SigV4 signature using your AWS security credentials. The AWS Command Line Interface (CLI) and the AWS SDKs take care of signing the underlying API calls for you. However, if your application calls the Amazon IVS Chat HTTP API directly, it’s your responsibility to sign the requests.&lt;/p&gt; &lt;p&gt;You generate a signature using valid AWS credentials for an IAM role that has permission to perform the requested action. For example, DeleteMessage requests must be made using an IAM role that has the &lt;code&gt;ivschat:DeleteMessage&lt;/code&gt; permission.&lt;/p&gt; &lt;p&gt;For more information:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Authentication and generating signatures — See &lt;a href=&quot;https://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html&quot;&gt;Authenticating Requests (Amazon Web Services Signature Version 4)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Managing Amazon IVS permissions — See &lt;a href=&quot;https://docs.aws.amazon.com/ivs/latest/userguide/security-iam.html&quot;&gt;Identity and Access Management&lt;/a&gt; on the Security page of the &lt;i&gt;Amazon IVS User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Messaging Endpoints&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;DeleteMessage&lt;/a&gt; — Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from view and delete it from the client’s chat history. This event’s &lt;code&gt;EventName&lt;/code&gt; is &lt;code&gt;aws:DELETE_MESSAGE&lt;/code&gt;. This replicates the &lt;a href=&quot;https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html&quot;&gt; DeleteMessage&lt;/a&gt; WebSocket operation in the Amazon IVS Chat Messaging API.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;DisconnectUser&lt;/a&gt; — Disconnects all connections using a specified user ID from a room. This replicates the &lt;a href=&quot;https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html&quot;&gt; DisconnectUser&lt;/a&gt; WebSocket operation in the Amazon IVS Chat Messaging API.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;SendEvent&lt;/a&gt; — Sends an event to a room. Use this within your application’s business logic to send events to clients of a room; e.g., to notify clients to change the way the chat UI is rendered.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Chat Token Endpoint&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;CreateChatToken&lt;/a&gt; — Creates an encrypted token that is used to establish an individual WebSocket connection to a room. The token is valid for one minute, and a connection (session) established with the token is valid for the specified duration.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Room Endpoints&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;CreateRoom&lt;/a&gt; — Creates a room that allows clients to connect and pass messages.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;DeleteRoom&lt;/a&gt; — Deletes the specified room.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;GetRoom&lt;/a&gt; — Gets the specified room.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;ListRooms&lt;/a&gt; — Gets summary information about all your rooms in the AWS region where the API request is processed. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;UpdateRoom&lt;/a&gt; — Updates a room’s configuration.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt; &lt;b&gt;Tags Endpoints&lt;/b&gt; &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;ListTagsForResource&lt;/a&gt; — Gets information about AWS tags for the specified ARN.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;TagResource&lt;/a&gt; — Adds or updates tags for the AWS resource with the specified ARN.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;a&gt;UntagResource&lt;/a&gt; — Removes tags from the resource with the specified ARN.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;All the above are HTTP operations. There is a separate &lt;i&gt;messaging&lt;/i&gt; API for managing Chat resources; see the &lt;a href=&quot;https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/chat-messaging-api.html&quot;&gt; Amazon IVS Chat Messaging API Reference&lt;/a&gt;.&lt;/p&gt; </code>
 * </pre>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonivschatAsync extends Amazonivschat {

    /**
     * <p>
     * Creates an encrypted token that is used to establish an individual WebSocket connection to a room. The token is
     * valid for one minute, and a connection (session) established with the token is valid for the specified duration.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
     * </p>
     * 
     * @param createChatTokenRequest
     * @return A Java Future containing the result of the CreateChatToken operation returned by the service.
     * @sample AmazonivschatAsync.CreateChatToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest createChatTokenRequest);

    /**
     * <p>
     * Creates an encrypted token that is used to establish an individual WebSocket connection to a room. The token is
     * valid for one minute, and a connection (session) established with the token is valid for the specified duration.
     * </p>
     * <p>
     * Encryption keys are owned by Amazon IVS Chat and never used directly by your application.
     * </p>
     * 
     * @param createChatTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChatToken operation returned by the service.
     * @sample AmazonivschatAsyncHandler.CreateChatToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateChatToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateChatTokenResult> createChatTokenAsync(CreateChatTokenRequest createChatTokenRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChatTokenRequest, CreateChatTokenResult> asyncHandler);

    /**
     * <p>
     * Creates a room that allows clients to connect and pass messages.
     * </p>
     * 
     * @param createRoomRequest
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonivschatAsync.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest);

    /**
     * <p>
     * Creates a room that allows clients to connect and pass messages.
     * </p>
     * 
     * @param createRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.CreateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/CreateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRoomResult> createRoomAsync(CreateRoomRequest createRoomRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoomRequest, CreateRoomResult> asyncHandler);

    /**
     * <p>
     * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from
     * view and delete it from the client’s chat history. This event’s <code>EventName</code> is
     * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
     * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param deleteMessageRequest
     * @return A Java Future containing the result of the DeleteMessage operation returned by the service.
     * @sample AmazonivschatAsync.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest);

    /**
     * <p>
     * Sends an event to a specific room which directs clients to delete a specific message; that is, unrender it from
     * view and delete it from the client’s chat history. This event’s <code>EventName</code> is
     * <code>aws:DELETE_MESSAGE</code>. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-deletemessage-publish.html">
     * DeleteMessage</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param deleteMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMessage operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DeleteMessage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteMessage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMessageResult> deleteMessageAsync(DeleteMessageRequest deleteMessageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, DeleteMessageResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified room.
     * </p>
     * 
     * @param deleteRoomRequest
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonivschatAsync.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest);

    /**
     * <p>
     * Deletes the specified room.
     * </p>
     * 
     * @param deleteRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DeleteRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DeleteRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRoomResult> deleteRoomAsync(DeleteRoomRequest deleteRoomRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoomRequest, DeleteRoomResult> asyncHandler);

    /**
     * <p>
     * Disconnects all connections using a specified user ID from a room. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
     * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param disconnectUserRequest
     * @return A Java Future containing the result of the DisconnectUser operation returned by the service.
     * @sample AmazonivschatAsync.DisconnectUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest disconnectUserRequest);

    /**
     * <p>
     * Disconnects all connections using a specified user ID from a room. This replicates the <a
     * href="https://docs.aws.amazon.com/ivs/latest/chatmsgapireference/actions-disconnectuser-publish.html">
     * DisconnectUser</a> WebSocket operation in the Amazon IVS Chat Messaging API.
     * </p>
     * 
     * @param disconnectUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectUser operation returned by the service.
     * @sample AmazonivschatAsyncHandler.DisconnectUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/DisconnectUser" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisconnectUserResult> disconnectUserAsync(DisconnectUserRequest disconnectUserRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectUserRequest, DisconnectUserResult> asyncHandler);

    /**
     * <p>
     * Gets the specified room.
     * </p>
     * 
     * @param getRoomRequest
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonivschatAsync.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest);

    /**
     * <p>
     * Gets the specified room.
     * </p>
     * 
     * @param getRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.GetRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/GetRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRoomResult> getRoomAsync(GetRoomRequest getRoomRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoomRequest, GetRoomResult> asyncHandler);

    /**
     * <p>
     * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are
     * sorted in descending order of <code>updateTime</code>.
     * </p>
     * 
     * @param listRoomsRequest
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonivschatAsync.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest);

    /**
     * <p>
     * Gets summary information about all your rooms in the AWS region where the API request is processed. Results are
     * sorted in descending order of <code>updateTime</code>.
     * </p>
     * 
     * @param listRoomsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRooms operation returned by the service.
     * @sample AmazonivschatAsyncHandler.ListRooms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRoomsResult> listRoomsAsync(ListRoomsRequest listRoomsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRoomsRequest, ListRoomsResult> asyncHandler);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonivschatAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about AWS tags for the specified ARN.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room;
     * e.g., to notify clients to change the way the chat UI is rendered.
     * </p>
     * 
     * @param sendEventRequest
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonivschatAsync.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest);

    /**
     * <p>
     * Sends an event to a room. Use this within your application’s business logic to send events to clients of a room;
     * e.g., to notify clients to change the way the chat UI is rendered.
     * </p>
     * 
     * @param sendEventRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendEvent operation returned by the service.
     * @sample AmazonivschatAsyncHandler.SendEvent
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/SendEvent" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest sendEventRequest,
            com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonivschatAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for the AWS resource with the specified ARN.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonivschatAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from the resource with the specified ARN.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonivschatAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a room’s configuration.
     * </p>
     * 
     * @param updateRoomRequest
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonivschatAsync.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest);

    /**
     * <p>
     * Updates a room’s configuration.
     * </p>
     * 
     * @param updateRoomRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRoom operation returned by the service.
     * @sample AmazonivschatAsyncHandler.UpdateRoom
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/UpdateRoom" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRoomResult> updateRoomAsync(UpdateRoomRequest updateRoomRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRoomRequest, UpdateRoomResult> asyncHandler);

}
