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
package com.amazonaws.services.kinesisvideowebrtcstorage;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisvideowebrtcstorage.model.*;

/**
 * Interface for accessing Amazon Kinesis Video WebRTC Storage.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisvideowebrtcstorage.AbstractAmazonKinesisVideoWebRTCStorage} instead.
 * </p>
 * <p>
 * <p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisVideoWebRTCStorage {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisvideo";

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a video producing device for an input
     * channel. If there’s no existing session for the channel, a new streaming session needs to be created, and the
     * Amazon Resource Name (ARN) of the signaling channel must be provided.
     * </p>
     * <p>
     * Currently for the <code>SINGLE_MASTER</code> type, a video producing device is able to ingest both audio and
     * video media into a stream, while viewers can only ingest audio. Both a video producing device and viewers can
     * join the session first, and wait for other participants.
     * </p>
     * <p>
     * While participants are having peer to peer conversations through webRTC, the ingested media session will be
     * stored into the Kinesis Video Stream. Multiple viewers are able to playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like <code>HLS</code> or <code>DASH</code>
     * playback, Image generation, and more with ingested WebRTC media.
     * </p>
     * <note>
     * <p>
     * Assume that only one video producing device client can be associated with a session for the channel. If more than
     * one client joins the session of a specific channel as a video producing device, the most recent client request
     * takes precedence.
     * </p>
     * </note>
     * 
     * @param joinStorageSessionRequest
     * @return Result of the JoinStorageSession operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         <li>
     *         <p>
     *         The value for this input parameter is invalid.
     *         </p>
     *         </li> </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         Additional details may <b>not</b>be returned.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         <li>
     *         <p>
     *         You do not have required permissions to perform this operation
     *         </p>
     *         </li>
     *         </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>AccessDeniedException</code> can be thrown for operation access as well as tokens or resource
     *         access
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         <li>
     *         <p>
     *         The specified resource is not found
     *         </p>
     *         </li>
     *         </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         You have not specified a channel in this API call.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideoWebRTCStorage.JoinStorageSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSession"
     *      target="_top">AWS API Documentation</a>
     */
    JoinStorageSessionResult joinStorageSession(JoinStorageSessionRequest joinStorageSessionRequest);

    /**
     * <p>
     * Join the ongoing one way-video and/or multi-way audio WebRTC session as a viewer for an input channel. If there’s
     * no existing session for the channel, create a new streaming session and provide the Amazon Resource Name (ARN) of
     * the signaling channel (<code>channelArn</code>) and client id (<code>clientId</code>).
     * </p>
     * <p>
     * Currently for <code>SINGLE_MASTER</code> type, a video producing device is able to ingest both audio and video
     * media into a stream, while viewers can only ingest audio. Both a video producing device and viewers can join a
     * session first and wait for other participants. While participants are having peer to peer conversations through
     * webRTC, the ingested media session will be stored into the Kinesis Video Stream. Multiple viewers are able to
     * playback real-time media.
     * </p>
     * <p>
     * Customers can also use existing Kinesis Video Streams features like <code>HLS</code> or <code>DASH</code>
     * playback, Image generation, and more with ingested WebRTC media. If there’s an existing session with the same
     * <code>clientId</code> that's found in the join session request, the new request takes precedence.
     * </p>
     * 
     * @param joinStorageSessionAsViewerRequest
     * @return Result of the JoinStorageSessionAsViewer operation returned by the service.
     * @throws ClientLimitExceededException
     *         Kinesis Video Streams has throttled the request because you have exceeded the limit of allowed client
     *         calls. Try making the call later.
     * @throws InvalidArgumentException
     *         <li>
     *         <p>
     *         The value for this input parameter is invalid.
     *         </p>
     *         </li> </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         Additional details may <b>not</b>be returned.
     *         </p>
     *         </li>
     * @throws AccessDeniedException
     *         <li>
     *         <p>
     *         You do not have required permissions to perform this operation
     *         </p>
     *         </li>
     *         </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         The <code>AccessDeniedException</code> can be thrown for operation access as well as tokens or resource
     *         access
     *         </p>
     *         </li>
     * @throws ResourceNotFoundException
     *         <li>
     *         <p>
     *         The specified resource is not found
     *         </p>
     *         </li>
     *         </ol>
     *         <ol>
     *         <li>
     *         <p>
     *         You have not specified a channel in this API call.
     *         </p>
     *         </li>
     * @sample AmazonKinesisVideoWebRTCStorage.JoinStorageSessionAsViewer
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSessionAsViewer"
     *      target="_top">AWS API Documentation</a>
     */
    JoinStorageSessionAsViewerResult joinStorageSessionAsViewer(JoinStorageSessionAsViewerRequest joinStorageSessionAsViewerRequest);

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
