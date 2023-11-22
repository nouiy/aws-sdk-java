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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/DeleteKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     */
    private String kvsARN;
    /**
     * <p>
     * The key to delete.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     * DescribeKeyValueStore.
     * </p>
     */
    private String ifMatch;

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

    public DeleteKeyRequest withKvsARN(String kvsARN) {
        setKvsARN(kvsARN);
        return this;
    }

    /**
     * <p>
     * The key to delete.
     * </p>
     * 
     * @param key
     *        The key to delete.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key to delete.
     * </p>
     * 
     * @return The key to delete.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key to delete.
     * </p>
     * 
     * @param key
     *        The key to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @param ifMatch
     *        The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     *        DescribeKeyValueStore.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @return The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get
     *         using DescribeKeyValueStore.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @param ifMatch
     *        The current version (ETag) of the Key Value Store that you are deleting keys from, which you can get using
     *        DescribeKeyValueStore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getKvsARN() != null)
            sb.append("KvsARN: ").append(getKvsARN()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyRequest == false)
            return false;
        DeleteKeyRequest other = (DeleteKeyRequest) obj;
        if (other.getKvsARN() == null ^ this.getKvsARN() == null)
            return false;
        if (other.getKvsARN() != null && other.getKvsARN().equals(this.getKvsARN()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKvsARN() == null) ? 0 : getKvsARN().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyRequest clone() {
        return (DeleteKeyRequest) super.clone();
    }

}
