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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The media capabilities of an attendee, including audio, video and content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/AttendeeCapabilities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttendeeCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The audio capability assigned to an attendee.
     * </p>
     */
    private String audio;
    /**
     * <p>
     * The video capability assigned to an attendee.
     * </p>
     */
    private String video;
    /**
     * <p>
     * The content capability assigned to an attendee.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The audio capability assigned to an attendee.
     * </p>
     * 
     * @param audio
     *        The audio capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * <p>
     * The audio capability assigned to an attendee.
     * </p>
     * 
     * @return The audio capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public String getAudio() {
        return this.audio;
    }

    /**
     * <p>
     * The audio capability assigned to an attendee.
     * </p>
     * 
     * @param audio
     *        The audio capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withAudio(String audio) {
        setAudio(audio);
        return this;
    }

    /**
     * <p>
     * The audio capability assigned to an attendee.
     * </p>
     * 
     * @param audio
     *        The audio capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withAudio(MediaCapabilities audio) {
        this.audio = audio.toString();
        return this;
    }

    /**
     * <p>
     * The video capability assigned to an attendee.
     * </p>
     * 
     * @param video
     *        The video capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * <p>
     * The video capability assigned to an attendee.
     * </p>
     * 
     * @return The video capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public String getVideo() {
        return this.video;
    }

    /**
     * <p>
     * The video capability assigned to an attendee.
     * </p>
     * 
     * @param video
     *        The video capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withVideo(String video) {
        setVideo(video);
        return this;
    }

    /**
     * <p>
     * The video capability assigned to an attendee.
     * </p>
     * 
     * @param video
     *        The video capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withVideo(MediaCapabilities video) {
        this.video = video.toString();
        return this;
    }

    /**
     * <p>
     * The content capability assigned to an attendee.
     * </p>
     * 
     * @param content
     *        The content capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content capability assigned to an attendee.
     * </p>
     * 
     * @return The content capability assigned to an attendee.
     * @see MediaCapabilities
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content capability assigned to an attendee.
     * </p>
     * 
     * @param content
     *        The content capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The content capability assigned to an attendee.
     * </p>
     * 
     * @param content
     *        The content capability assigned to an attendee.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaCapabilities
     */

    public AttendeeCapabilities withContent(MediaCapabilities content) {
        this.content = content.toString();
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
        if (getAudio() != null)
            sb.append("Audio: ").append(getAudio()).append(",");
        if (getVideo() != null)
            sb.append("Video: ").append(getVideo()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttendeeCapabilities == false)
            return false;
        AttendeeCapabilities other = (AttendeeCapabilities) obj;
        if (other.getAudio() == null ^ this.getAudio() == null)
            return false;
        if (other.getAudio() != null && other.getAudio().equals(this.getAudio()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudio() == null) ? 0 : getAudio().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public AttendeeCapabilities clone() {
        try {
            return (AttendeeCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.AttendeeCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
