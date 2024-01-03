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
 * Configures chunking strategy
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ChunkingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChunkingConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String chunkingStrategy;

    private FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration;

    /**
     * @param chunkingStrategy
     * @see ChunkingStrategy
     */

    public void setChunkingStrategy(String chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
     * @return
     * @see ChunkingStrategy
     */

    public String getChunkingStrategy() {
        return this.chunkingStrategy;
    }

    /**
     * @param chunkingStrategy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChunkingStrategy
     */

    public ChunkingConfiguration withChunkingStrategy(String chunkingStrategy) {
        setChunkingStrategy(chunkingStrategy);
        return this;
    }

    /**
     * @param chunkingStrategy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChunkingStrategy
     */

    public ChunkingConfiguration withChunkingStrategy(ChunkingStrategy chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy.toString();
        return this;
    }

    /**
     * @param fixedSizeChunkingConfiguration
     */

    public void setFixedSizeChunkingConfiguration(FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration) {
        this.fixedSizeChunkingConfiguration = fixedSizeChunkingConfiguration;
    }

    /**
     * @return
     */

    public FixedSizeChunkingConfiguration getFixedSizeChunkingConfiguration() {
        return this.fixedSizeChunkingConfiguration;
    }

    /**
     * @param fixedSizeChunkingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChunkingConfiguration withFixedSizeChunkingConfiguration(FixedSizeChunkingConfiguration fixedSizeChunkingConfiguration) {
        setFixedSizeChunkingConfiguration(fixedSizeChunkingConfiguration);
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
        if (getChunkingStrategy() != null)
            sb.append("ChunkingStrategy: ").append(getChunkingStrategy()).append(",");
        if (getFixedSizeChunkingConfiguration() != null)
            sb.append("FixedSizeChunkingConfiguration: ").append(getFixedSizeChunkingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChunkingConfiguration == false)
            return false;
        ChunkingConfiguration other = (ChunkingConfiguration) obj;
        if (other.getChunkingStrategy() == null ^ this.getChunkingStrategy() == null)
            return false;
        if (other.getChunkingStrategy() != null && other.getChunkingStrategy().equals(this.getChunkingStrategy()) == false)
            return false;
        if (other.getFixedSizeChunkingConfiguration() == null ^ this.getFixedSizeChunkingConfiguration() == null)
            return false;
        if (other.getFixedSizeChunkingConfiguration() != null
                && other.getFixedSizeChunkingConfiguration().equals(this.getFixedSizeChunkingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChunkingStrategy() == null) ? 0 : getChunkingStrategy().hashCode());
        hashCode = prime * hashCode + ((getFixedSizeChunkingConfiguration() == null) ? 0 : getFixedSizeChunkingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ChunkingConfiguration clone() {
        try {
            return (ChunkingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ChunkingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
