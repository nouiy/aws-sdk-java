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
 * A mapping of Bedrock Knowledge Base fields to Redis Cloud field names
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/RedisEnterpriseCloudFieldMapping"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedisEnterpriseCloudFieldMapping implements Serializable, Cloneable, StructuredPojo {

    private String vectorField;

    private String textField;

    private String metadataField;

    /**
     * @param vectorField
     */

    public void setVectorField(String vectorField) {
        this.vectorField = vectorField;
    }

    /**
     * @return
     */

    public String getVectorField() {
        return this.vectorField;
    }

    /**
     * @param vectorField
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudFieldMapping withVectorField(String vectorField) {
        setVectorField(vectorField);
        return this;
    }

    /**
     * @param textField
     */

    public void setTextField(String textField) {
        this.textField = textField;
    }

    /**
     * @return
     */

    public String getTextField() {
        return this.textField;
    }

    /**
     * @param textField
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudFieldMapping withTextField(String textField) {
        setTextField(textField);
        return this;
    }

    /**
     * @param metadataField
     */

    public void setMetadataField(String metadataField) {
        this.metadataField = metadataField;
    }

    /**
     * @return
     */

    public String getMetadataField() {
        return this.metadataField;
    }

    /**
     * @param metadataField
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedisEnterpriseCloudFieldMapping withMetadataField(String metadataField) {
        setMetadataField(metadataField);
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
        if (getVectorField() != null)
            sb.append("VectorField: ").append(getVectorField()).append(",");
        if (getTextField() != null)
            sb.append("TextField: ").append(getTextField()).append(",");
        if (getMetadataField() != null)
            sb.append("MetadataField: ").append(getMetadataField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedisEnterpriseCloudFieldMapping == false)
            return false;
        RedisEnterpriseCloudFieldMapping other = (RedisEnterpriseCloudFieldMapping) obj;
        if (other.getVectorField() == null ^ this.getVectorField() == null)
            return false;
        if (other.getVectorField() != null && other.getVectorField().equals(this.getVectorField()) == false)
            return false;
        if (other.getTextField() == null ^ this.getTextField() == null)
            return false;
        if (other.getTextField() != null && other.getTextField().equals(this.getTextField()) == false)
            return false;
        if (other.getMetadataField() == null ^ this.getMetadataField() == null)
            return false;
        if (other.getMetadataField() != null && other.getMetadataField().equals(this.getMetadataField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorField() == null) ? 0 : getVectorField().hashCode());
        hashCode = prime * hashCode + ((getTextField() == null) ? 0 : getTextField().hashCode());
        hashCode = prime * hashCode + ((getMetadataField() == null) ? 0 : getMetadataField().hashCode());
        return hashCode;
    }

    @Override
    public RedisEnterpriseCloudFieldMapping clone() {
        try {
            return (RedisEnterpriseCloudFieldMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.RedisEnterpriseCloudFieldMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
