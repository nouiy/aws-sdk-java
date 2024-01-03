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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DescribeKeyValueStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyValueStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Number of key value pairs in the Key Value Store.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * Total size of the Key Value Store in bytes.
     * </p>
     */
    private Long totalSizeInBytes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     */
    private String kvsARN;
    /**
     * <p>
     * Date and time when the Key Value Store was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The version identifier for the current version of the Key Value Store.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * Date and time when the key value pairs in the Key Value Store was last modified.
     * </p>
     */
    private java.util.Date lastModified;

    /**
     * <p>
     * Number of key value pairs in the Key Value Store.
     * </p>
     * 
     * @param itemCount
     *        Number of key value pairs in the Key Value Store.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Number of key value pairs in the Key Value Store.
     * </p>
     * 
     * @return Number of key value pairs in the Key Value Store.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * Number of key value pairs in the Key Value Store.
     * </p>
     * 
     * @param itemCount
     *        Number of key value pairs in the Key Value Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * Total size of the Key Value Store in bytes.
     * </p>
     * 
     * @param totalSizeInBytes
     *        Total size of the Key Value Store in bytes.
     */

    public void setTotalSizeInBytes(Long totalSizeInBytes) {
        this.totalSizeInBytes = totalSizeInBytes;
    }

    /**
     * <p>
     * Total size of the Key Value Store in bytes.
     * </p>
     * 
     * @return Total size of the Key Value Store in bytes.
     */

    public Long getTotalSizeInBytes() {
        return this.totalSizeInBytes;
    }

    /**
     * <p>
     * Total size of the Key Value Store in bytes.
     * </p>
     * 
     * @param totalSizeInBytes
     *        Total size of the Key Value Store in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withTotalSizeInBytes(Long totalSizeInBytes) {
        setTotalSizeInBytes(totalSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     * 
     * @param kvsARN
     *        The Amazon Resource Name (ARN) of the Key Value Store.
     */

    public void setKvsARN(String kvsARN) {
        this.kvsARN = kvsARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Key Value Store.
     */

    public String getKvsARN() {
        return this.kvsARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     * 
     * @param kvsARN
     *        The Amazon Resource Name (ARN) of the Key Value Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withKvsARN(String kvsARN) {
        setKvsARN(kvsARN);
        return this;
    }

    /**
     * <p>
     * Date and time when the Key Value Store was created.
     * </p>
     * 
     * @param created
     *        Date and time when the Key Value Store was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * Date and time when the Key Value Store was created.
     * </p>
     * 
     * @return Date and time when the Key Value Store was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * Date and time when the Key Value Store was created.
     * </p>
     * 
     * @param created
     *        Date and time when the Key Value Store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The version identifier for the current version of the Key Value Store.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the Key Value Store.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the Key Value Store.
     * </p>
     * 
     * @return The version identifier for the current version of the Key Value Store.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The version identifier for the current version of the Key Value Store.
     * </p>
     * 
     * @param eTag
     *        The version identifier for the current version of the Key Value Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * Date and time when the key value pairs in the Key Value Store was last modified.
     * </p>
     * 
     * @param lastModified
     *        Date and time when the key value pairs in the Key Value Store was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * Date and time when the key value pairs in the Key Value Store was last modified.
     * </p>
     * 
     * @return Date and time when the key value pairs in the Key Value Store was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * Date and time when the key value pairs in the Key Value Store was last modified.
     * </p>
     * 
     * @param lastModified
     *        Date and time when the key value pairs in the Key Value Store was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyValueStoreResult withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
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
        if (getKvsARN() != null)
            sb.append("KvsARN: ").append(getKvsARN()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyValueStoreResult == false)
            return false;
        DescribeKeyValueStoreResult other = (DescribeKeyValueStoreResult) obj;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getTotalSizeInBytes() == null ^ this.getTotalSizeInBytes() == null)
            return false;
        if (other.getTotalSizeInBytes() != null && other.getTotalSizeInBytes().equals(this.getTotalSizeInBytes()) == false)
            return false;
        if (other.getKvsARN() == null ^ this.getKvsARN() == null)
            return false;
        if (other.getKvsARN() != null && other.getKvsARN().equals(this.getKvsARN()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeInBytes() == null) ? 0 : getTotalSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getKvsARN() == null) ? 0 : getKvsARN().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyValueStoreResult clone() {
        try {
            return (DescribeKeyValueStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
