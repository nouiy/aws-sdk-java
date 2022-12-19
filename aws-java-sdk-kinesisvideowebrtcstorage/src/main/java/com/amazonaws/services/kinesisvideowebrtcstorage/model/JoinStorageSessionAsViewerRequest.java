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
package com.amazonaws.services.kinesisvideowebrtcstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-webrtc-storage-2018-05-10/JoinStorageSessionAsViewer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JoinStorageSessionAsViewerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of the signaling channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the signaling channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signaling channel.
     * </p>
     * 
     * @param channelArn
     *        The Amazon Resource Name (ARN) of the signaling channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinStorageSessionAsViewerRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @param clientId
     *        The unique identifier for the sender client.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @return The unique identifier for the sender client.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The unique identifier for the sender client.
     * </p>
     * 
     * @param clientId
     *        The unique identifier for the sender client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JoinStorageSessionAsViewerRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinStorageSessionAsViewerRequest == false)
            return false;
        JoinStorageSessionAsViewerRequest other = (JoinStorageSessionAsViewerRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public JoinStorageSessionAsViewerRequest clone() {
        return (JoinStorageSessionAsViewerRequest) super.clone();
    }

}
