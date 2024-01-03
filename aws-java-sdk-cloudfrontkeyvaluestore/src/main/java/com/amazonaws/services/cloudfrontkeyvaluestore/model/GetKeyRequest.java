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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/GetKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     */
    private String kvsARN;
    /**
     * <p>
     * The key to get.
     * </p>
     */
    private String key;

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

    public GetKeyRequest withKvsARN(String kvsARN) {
        setKvsARN(kvsARN);
        return this;
    }

    /**
     * <p>
     * The key to get.
     * </p>
     * 
     * @param key
     *        The key to get.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key to get.
     * </p>
     * 
     * @return The key to get.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key to get.
     * </p>
     * 
     * @param key
     *        The key to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRequest withKey(String key) {
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
        if (getKvsARN() != null)
            sb.append("KvsARN: ").append(getKvsARN()).append(",");
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

        if (obj instanceof GetKeyRequest == false)
            return false;
        GetKeyRequest other = (GetKeyRequest) obj;
        if (other.getKvsARN() == null ^ this.getKvsARN() == null)
            return false;
        if (other.getKvsARN() != null && other.getKvsARN().equals(this.getKvsARN()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getKvsARN() == null) ? 0 : getKvsARN().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyRequest clone() {
        return (GetKeyRequest) super.clone();
    }

}
