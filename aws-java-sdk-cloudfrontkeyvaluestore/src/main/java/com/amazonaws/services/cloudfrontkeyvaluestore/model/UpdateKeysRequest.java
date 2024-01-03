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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/UpdateKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Value Store.
     * </p>
     */
    private String kvsARN;
    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     * DescribeKeyValueStore.
     * </p>
     */
    private String ifMatch;
    /**
     * <p>
     * List of key value pairs to put.
     * </p>
     */
    private java.util.List<PutKeyRequestListItem> puts;
    /**
     * <p>
     * List of keys to delete.
     * </p>
     */
    private java.util.List<DeleteKeyRequestListItem> deletes;

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

    public UpdateKeysRequest withKvsARN(String kvsARN) {
        setKvsARN(kvsARN);
        return this;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @param ifMatch
     *        The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     *        DescribeKeyValueStore.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @return The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     *         DescribeKeyValueStore.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     * DescribeKeyValueStore.
     * </p>
     * 
     * @param ifMatch
     *        The current version (ETag) of the Key Value Store that you are updating keys of, which you can get using
     *        DescribeKeyValueStore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
        return this;
    }

    /**
     * <p>
     * List of key value pairs to put.
     * </p>
     * 
     * @return List of key value pairs to put.
     */

    public java.util.List<PutKeyRequestListItem> getPuts() {
        return puts;
    }

    /**
     * <p>
     * List of key value pairs to put.
     * </p>
     * 
     * @param puts
     *        List of key value pairs to put.
     */

    public void setPuts(java.util.Collection<PutKeyRequestListItem> puts) {
        if (puts == null) {
            this.puts = null;
            return;
        }

        this.puts = new java.util.ArrayList<PutKeyRequestListItem>(puts);
    }

    /**
     * <p>
     * List of key value pairs to put.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPuts(java.util.Collection)} or {@link #withPuts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param puts
     *        List of key value pairs to put.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysRequest withPuts(PutKeyRequestListItem... puts) {
        if (this.puts == null) {
            setPuts(new java.util.ArrayList<PutKeyRequestListItem>(puts.length));
        }
        for (PutKeyRequestListItem ele : puts) {
            this.puts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of key value pairs to put.
     * </p>
     * 
     * @param puts
     *        List of key value pairs to put.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysRequest withPuts(java.util.Collection<PutKeyRequestListItem> puts) {
        setPuts(puts);
        return this;
    }

    /**
     * <p>
     * List of keys to delete.
     * </p>
     * 
     * @return List of keys to delete.
     */

    public java.util.List<DeleteKeyRequestListItem> getDeletes() {
        return deletes;
    }

    /**
     * <p>
     * List of keys to delete.
     * </p>
     * 
     * @param deletes
     *        List of keys to delete.
     */

    public void setDeletes(java.util.Collection<DeleteKeyRequestListItem> deletes) {
        if (deletes == null) {
            this.deletes = null;
            return;
        }

        this.deletes = new java.util.ArrayList<DeleteKeyRequestListItem>(deletes);
    }

    /**
     * <p>
     * List of keys to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletes(java.util.Collection)} or {@link #withDeletes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param deletes
     *        List of keys to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysRequest withDeletes(DeleteKeyRequestListItem... deletes) {
        if (this.deletes == null) {
            setDeletes(new java.util.ArrayList<DeleteKeyRequestListItem>(deletes.length));
        }
        for (DeleteKeyRequestListItem ele : deletes) {
            this.deletes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of keys to delete.
     * </p>
     * 
     * @param deletes
     *        List of keys to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeysRequest withDeletes(java.util.Collection<DeleteKeyRequestListItem> deletes) {
        setDeletes(deletes);
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
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch()).append(",");
        if (getPuts() != null)
            sb.append("Puts: ").append(getPuts()).append(",");
        if (getDeletes() != null)
            sb.append("Deletes: ").append(getDeletes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeysRequest == false)
            return false;
        UpdateKeysRequest other = (UpdateKeysRequest) obj;
        if (other.getKvsARN() == null ^ this.getKvsARN() == null)
            return false;
        if (other.getKvsARN() != null && other.getKvsARN().equals(this.getKvsARN()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        if (other.getPuts() == null ^ this.getPuts() == null)
            return false;
        if (other.getPuts() != null && other.getPuts().equals(this.getPuts()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKvsARN() == null) ? 0 : getKvsARN().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        hashCode = prime * hashCode + ((getPuts() == null) ? 0 : getPuts().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeysRequest clone() {
        return (UpdateKeysRequest) super.clone();
    }

}
