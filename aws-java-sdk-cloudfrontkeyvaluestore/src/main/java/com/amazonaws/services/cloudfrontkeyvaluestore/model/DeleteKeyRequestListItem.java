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
package com.amazonaws.services.cloudfrontkeyvaluestore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List item for keys to delete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DeleteKeyRequestListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyRequestListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key of the key value pair to be deleted.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The key of the key value pair to be deleted.
     * </p>
     * 
     * @param key
     *        The key of the key value pair to be deleted.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the key value pair to be deleted.
     * </p>
     * 
     * @return The key of the key value pair to be deleted.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the key value pair to be deleted.
     * </p>
     * 
     * @param key
     *        The key of the key value pair to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequestListItem withKey(String key) {
        setKey(key);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyRequestListItem == false)
            return false;
        DeleteKeyRequestListItem other = (DeleteKeyRequestListItem) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyRequestListItem clone() {
        try {
            return (DeleteKeyRequestListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudfrontkeyvaluestore.model.transform.DeleteKeyRequestListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
