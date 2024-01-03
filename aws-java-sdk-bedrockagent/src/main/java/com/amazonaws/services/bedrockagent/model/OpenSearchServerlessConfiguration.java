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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configurations to use OpenSearch Serverless to store knowledge base data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/OpenSearchServerlessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenSearchServerlessConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String collectionArn;

    private String vectorIndexName;

    private OpenSearchServerlessFieldMapping fieldMapping;

    /**
     * @param collectionArn
     */

    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * @return
     */

    public String getCollectionArn() {
        return this.collectionArn;
    }

    /**
     * @param collectionArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withCollectionArn(String collectionArn) {
        setCollectionArn(collectionArn);
        return this;
    }

    /**
     * @param vectorIndexName
     */

    public void setVectorIndexName(String vectorIndexName) {
        this.vectorIndexName = vectorIndexName;
    }

    /**
     * @return
     */

    public String getVectorIndexName() {
        return this.vectorIndexName;
    }

    /**
     * @param vectorIndexName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withVectorIndexName(String vectorIndexName) {
        setVectorIndexName(vectorIndexName);
        return this;
    }

    /**
     * @param fieldMapping
     */

    public void setFieldMapping(OpenSearchServerlessFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * @return
     */

    public OpenSearchServerlessFieldMapping getFieldMapping() {
        return this.fieldMapping;
    }

    /**
     * @param fieldMapping
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenSearchServerlessConfiguration withFieldMapping(OpenSearchServerlessFieldMapping fieldMapping) {
        setFieldMapping(fieldMapping);
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: ").append(getCollectionArn()).append(",");
        if (getVectorIndexName() != null)
            sb.append("VectorIndexName: ").append(getVectorIndexName()).append(",");
        if (getFieldMapping() != null)
            sb.append("FieldMapping: ").append(getFieldMapping());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenSearchServerlessConfiguration == false)
            return false;
        OpenSearchServerlessConfiguration other = (OpenSearchServerlessConfiguration) obj;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getVectorIndexName() == null ^ this.getVectorIndexName() == null)
            return false;
        if (other.getVectorIndexName() != null && other.getVectorIndexName().equals(this.getVectorIndexName()) == false)
            return false;
        if (other.getFieldMapping() == null ^ this.getFieldMapping() == null)
            return false;
        if (other.getFieldMapping() != null && other.getFieldMapping().equals(this.getFieldMapping()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getVectorIndexName() == null) ? 0 : getVectorIndexName().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        return hashCode;
    }

    @Override
    public OpenSearchServerlessConfiguration clone() {
        try {
            return (OpenSearchServerlessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.OpenSearchServerlessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
