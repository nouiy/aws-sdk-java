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
package com.amazonaws.services.cloudfrontkeyvaluestore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Metadata information about a Key Value Store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/UpdateKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Number of key value pairs in the Key Value Store after the successful update.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * Total size of the Key Value Store after the successful update, in bytes.
     * </p>
     */
    private Long totalSizeInBytes;
    /**
     * <p>
     * The current version identifier of the Key Value Store after the successful update.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * Number of key value pairs in the Key Value Store after the successful update.
     * </p>
     * 
     * @param itemCount
     *        Number of key value pairs in the Key Value Store after the successful update.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Number of key value pairs in the Key Value Store after the successful update.
     * </p>
     * 
     * @return Number of key value pairs in the Key Value Store after the successful update.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * Number of key value pairs in the Key Value Store after the successful update.
     * </p>
     * 
     * @param itemCount
     *        Number of key value pairs in the Key Value Store after the successful update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysResult withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * Total size of the Key Value Store after the successful update, in bytes.
     * </p>
     * 
     * @param totalSizeInBytes
     *        Total size of the Key Value Store after the successful update, in bytes.
     */

    public void setTotalSizeInBytes(Long totalSizeInBytes) {
        this.totalSizeInBytes = totalSizeInBytes;
    }

    /**
     * <p>
     * Total size of the Key Value Store after the successful update, in bytes.
     * </p>
     * 
     * @return Total size of the Key Value Store after the successful update, in bytes.
     */

    public Long getTotalSizeInBytes() {
        return this.totalSizeInBytes;
    }

    /**
     * <p>
     * Total size of the Key Value Store after the successful update, in bytes.
     * </p>
     * 
     * @param totalSizeInBytes
     *        Total size of the Key Value Store after the successful update, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysResult withTotalSizeInBytes(Long totalSizeInBytes) {
        setTotalSizeInBytes(totalSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The current version identifier of the Key Value Store after the successful update.
     * </p>
     * 
     * @param eTag
     *        The current version identifier of the Key Value Store after the successful update.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version identifier of the Key Value Store after the successful update.
     * </p>
     * 
     * @return The current version identifier of the Key Value Store after the successful update.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version identifier of the Key Value Store after the successful update.
     * </p>
     * 
     * @param eTag
     *        The current version identifier of the Key Value Store after the successful update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysResult withETag(String eTag) {
        setETag(eTag);
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
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getTotalSizeInBytes() != null)
            sb.append("TotalSizeInBytes: ").append(getTotalSizeInBytes()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeysResult == false)
            return false;
        UpdateKeysResult other = (UpdateKeysResult) obj;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getTotalSizeInBytes() == null ^ this.getTotalSizeInBytes() == null)
            return false;
        if (other.getTotalSizeInBytes() != null && other.getTotalSizeInBytes().equals(this.getTotalSizeInBytes()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeInBytes() == null) ? 0 : getTotalSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeysResult clone() {
        try {
            return (UpdateKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
