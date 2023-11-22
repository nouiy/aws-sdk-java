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

/**
 * <p>
 * A key value pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/GetKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The key of the key value pair.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value of the key value pair.
     * </p>
     */
    private String value;
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
     * The key of the key value pair.
     * </p>
     * 
     * @param key
     *        The key of the key value pair.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the key value pair.
     * </p>
     * 
     * @return The key of the key value pair.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the key value pair.
     * </p>
     * 
     * @param key
     *        The key of the key value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyResult withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the key value pair.
     * </p>
     * 
     * @param value
     *        The value of the key value pair.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the key value pair.
     * </p>
     * 
     * @return The value of the key value pair.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the key value pair.
     * </p>
     * 
     * @param value
     *        The value of the key value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyResult withValue(String value) {
        setValue(value);
        return this;
    }

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

    public GetKeyResult withItemCount(Integer itemCount) {
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

    public GetKeyResult withTotalSizeInBytes(Long totalSizeInBytes) {
        setTotalSizeInBytes(totalSizeInBytes);
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
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append("***Sensitive Data Redacted***").append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getTotalSizeInBytes() != null)
            sb.append("TotalSizeInBytes: ").append(getTotalSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyResult == false)
            return false;
        GetKeyResult other = (GetKeyResult) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getTotalSizeInBytes() == null ^ this.getTotalSizeInBytes() == null)
            return false;
        if (other.getTotalSizeInBytes() != null && other.getTotalSizeInBytes().equals(this.getTotalSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getTotalSizeInBytes() == null) ? 0 : getTotalSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyResult clone() {
        try {
            return (GetKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
