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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the configurations to use Pinecone to store knowledge base data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PineconeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PineconeConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String connectionString;

    private String credentialsSecretArn;

    private String namespace;

    private PineconeFieldMapping fieldMapping;

    /**
     * @param connectionString
     */

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * @return
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @param connectionString
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withConnectionString(String connectionString) {
        setConnectionString(connectionString);
        return this;
    }

    /**
     * @param credentialsSecretArn
     */

    public void setCredentialsSecretArn(String credentialsSecretArn) {
        this.credentialsSecretArn = credentialsSecretArn;
    }

    /**
     * @return
     */

    public String getCredentialsSecretArn() {
        return this.credentialsSecretArn;
    }

    /**
     * @param credentialsSecretArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withCredentialsSecretArn(String credentialsSecretArn) {
        setCredentialsSecretArn(credentialsSecretArn);
        return this;
    }

    /**
     * @param namespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * @return
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @param namespace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * @param fieldMapping
     */

    public void setFieldMapping(PineconeFieldMapping fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    /**
     * @return
     */

    public PineconeFieldMapping getFieldMapping() {
        return this.fieldMapping;
    }

    /**
     * @param fieldMapping
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PineconeConfiguration withFieldMapping(PineconeFieldMapping fieldMapping) {
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
        if (getConnectionString() != null)
            sb.append("ConnectionString: ").append(getConnectionString()).append(",");
        if (getCredentialsSecretArn() != null)
            sb.append("CredentialsSecretArn: ").append(getCredentialsSecretArn()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
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

        if (obj instanceof PineconeConfiguration == false)
            return false;
        PineconeConfiguration other = (PineconeConfiguration) obj;
        if (other.getConnectionString() == null ^ this.getConnectionString() == null)
            return false;
        if (other.getConnectionString() != null && other.getConnectionString().equals(this.getConnectionString()) == false)
            return false;
        if (other.getCredentialsSecretArn() == null ^ this.getCredentialsSecretArn() == null)
            return false;
        if (other.getCredentialsSecretArn() != null && other.getCredentialsSecretArn().equals(this.getCredentialsSecretArn()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
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

        hashCode = prime * hashCode + ((getConnectionString() == null) ? 0 : getConnectionString().hashCode());
        hashCode = prime * hashCode + ((getCredentialsSecretArn() == null) ? 0 : getCredentialsSecretArn().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getFieldMapping() == null) ? 0 : getFieldMapping().hashCode());
        return hashCode;
    }

    @Override
    public PineconeConfiguration clone() {
        try {
            return (PineconeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PineconeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
