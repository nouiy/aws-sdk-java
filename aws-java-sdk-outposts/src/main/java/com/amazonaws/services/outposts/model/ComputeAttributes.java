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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about compute hardware assets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ComputeAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host ID of any Dedicated Hosts on the asset.
     * </p>
     */
    private String hostId;

    /**
     * <p>
     * The host ID of any Dedicated Hosts on the asset.
     * </p>
     * 
     * @param hostId
     *        The host ID of any Dedicated Hosts on the asset.
     */

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * <p>
     * The host ID of any Dedicated Hosts on the asset.
     * </p>
     * 
     * @return The host ID of any Dedicated Hosts on the asset.
     */

    public String getHostId() {
        return this.hostId;
    }

    /**
     * <p>
     * The host ID of any Dedicated Hosts on the asset.
     * </p>
     * 
     * @param hostId
     *        The host ID of any Dedicated Hosts on the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeAttributes withHostId(String hostId) {
        setHostId(hostId);
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
        if (getHostId() != null)
            sb.append("HostId: ").append(getHostId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeAttributes == false)
            return false;
        ComputeAttributes other = (ComputeAttributes) obj;
        if (other.getHostId() == null ^ this.getHostId() == null)
            return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode());
        return hashCode;
    }

    @Override
    public ComputeAttributes clone() {
        try {
            return (ComputeAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.ComputeAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
