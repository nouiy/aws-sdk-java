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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-keyvaluestore-2022-07-26/ListKeys" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If nextToken is returned in the response, there are more results available. Make the next call using the returned
     * token to retrieve the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Key value pairs
     * </p>
     */
    private java.util.List<ListKeysResponseListItem> items;

    /**
     * <p>
     * If nextToken is returned in the response, there are more results available. Make the next call using the returned
     * token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned in the response, there are more results available. Make the next call using the
     *        returned token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned in the response, there are more results available. Make the next call using the returned
     * token to retrieve the next page.
     * </p>
     * 
     * @return If nextToken is returned in the response, there are more results available. Make the next call using the
     *         returned token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If nextToken is returned in the response, there are more results available. Make the next call using the returned
     * token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If nextToken is returned in the response, there are more results available. Make the next call using the
     *        returned token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Key value pairs
     * </p>
     * 
     * @return Key value pairs
     */

    public java.util.List<ListKeysResponseListItem> getItems() {
        return items;
    }

    /**
     * <p>
     * Key value pairs
     * </p>
     * 
     * @param items
     *        Key value pairs
     */

    public void setItems(java.util.Collection<ListKeysResponseListItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ListKeysResponseListItem>(items);
    }

    /**
     * <p>
     * Key value pairs
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Key value pairs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withItems(ListKeysResponseListItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ListKeysResponseListItem>(items.length));
        }
        for (ListKeysResponseListItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key value pairs
     * </p>
     * 
     * @param items
     *        Key value pairs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeysResult withItems(java.util.Collection<ListKeysResponseListItem> items) {
        setItems(items);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeysResult == false)
            return false;
        ListKeysResult other = (ListKeysResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public ListKeysResult clone() {
        try {
            return (ListKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
