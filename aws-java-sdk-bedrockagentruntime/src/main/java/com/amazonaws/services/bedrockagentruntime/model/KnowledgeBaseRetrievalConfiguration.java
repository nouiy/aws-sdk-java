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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Search parameters for retrieving from knowledge base.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/KnowledgeBaseRetrievalConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseRetrievalConfiguration implements Serializable, Cloneable, StructuredPojo {

    private KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration;

    /**
     * @param vectorSearchConfiguration
     */

    public void setVectorSearchConfiguration(KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration) {
        this.vectorSearchConfiguration = vectorSearchConfiguration;
    }

    /**
     * @return
     */

    public KnowledgeBaseVectorSearchConfiguration getVectorSearchConfiguration() {
        return this.vectorSearchConfiguration;
    }

    /**
     * @param vectorSearchConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseRetrievalConfiguration withVectorSearchConfiguration(KnowledgeBaseVectorSearchConfiguration vectorSearchConfiguration) {
        setVectorSearchConfiguration(vectorSearchConfiguration);
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
        if (getVectorSearchConfiguration() != null)
            sb.append("VectorSearchConfiguration: ").append(getVectorSearchConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseRetrievalConfiguration == false)
            return false;
        KnowledgeBaseRetrievalConfiguration other = (KnowledgeBaseRetrievalConfiguration) obj;
        if (other.getVectorSearchConfiguration() == null ^ this.getVectorSearchConfiguration() == null)
            return false;
        if (other.getVectorSearchConfiguration() != null && other.getVectorSearchConfiguration().equals(this.getVectorSearchConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVectorSearchConfiguration() == null) ? 0 : getVectorSearchConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseRetrievalConfiguration clone() {
        try {
            return (KnowledgeBaseRetrievalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.KnowledgeBaseRetrievalConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
