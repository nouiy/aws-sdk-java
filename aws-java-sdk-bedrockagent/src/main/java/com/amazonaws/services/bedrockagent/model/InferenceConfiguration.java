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
 * Configuration for inference in prompt configuration
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/InferenceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Float temperature;

    private Float topP;

    private Integer topK;

    private Integer maximumLength;

    private java.util.List<String> stopSequences;

    /**
     * @param temperature
     */

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * @return
     */

    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @param temperature
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTemperature(Float temperature) {
        setTemperature(temperature);
        return this;
    }

    /**
     * @param topP
     */

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    /**
     * @return
     */

    public Float getTopP() {
        return this.topP;
    }

    /**
     * @param topP
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTopP(Float topP) {
        setTopP(topP);
        return this;
    }

    /**
     * @param topK
     */

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    /**
     * @return
     */

    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @param topK
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTopK(Integer topK) {
        setTopK(topK);
        return this;
    }

    /**
     * @param maximumLength
     */

    public void setMaximumLength(Integer maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * @return
     */

    public Integer getMaximumLength() {
        return this.maximumLength;
    }

    /**
     * @param maximumLength
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withMaximumLength(Integer maximumLength) {
        setMaximumLength(maximumLength);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * @param stopSequences
     */

    public void setStopSequences(java.util.Collection<String> stopSequences) {
        if (stopSequences == null) {
            this.stopSequences = null;
            return;
        }

        this.stopSequences = new java.util.ArrayList<String>(stopSequences);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopSequences(java.util.Collection)} or {@link #withStopSequences(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopSequences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(String... stopSequences) {
        if (this.stopSequences == null) {
            setStopSequences(new java.util.ArrayList<String>(stopSequences.length));
        }
        for (String ele : stopSequences) {
            this.stopSequences.add(ele);
        }
        return this;
    }

    /**
     * @param stopSequences
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(java.util.Collection<String> stopSequences) {
        setStopSequences(stopSequences);
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
        if (getTemperature() != null)
            sb.append("Temperature: ").append(getTemperature()).append(",");
        if (getTopP() != null)
            sb.append("TopP: ").append(getTopP()).append(",");
        if (getTopK() != null)
            sb.append("TopK: ").append(getTopK()).append(",");
        if (getMaximumLength() != null)
            sb.append("MaximumLength: ").append(getMaximumLength()).append(",");
        if (getStopSequences() != null)
            sb.append("StopSequences: ").append(getStopSequences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceConfiguration == false)
            return false;
        InferenceConfiguration other = (InferenceConfiguration) obj;
        if (other.getTemperature() == null ^ this.getTemperature() == null)
            return false;
        if (other.getTemperature() != null && other.getTemperature().equals(this.getTemperature()) == false)
            return false;
        if (other.getTopP() == null ^ this.getTopP() == null)
            return false;
        if (other.getTopP() != null && other.getTopP().equals(this.getTopP()) == false)
            return false;
        if (other.getTopK() == null ^ this.getTopK() == null)
            return false;
        if (other.getTopK() != null && other.getTopK().equals(this.getTopK()) == false)
            return false;
        if (other.getMaximumLength() == null ^ this.getMaximumLength() == null)
            return false;
        if (other.getMaximumLength() != null && other.getMaximumLength().equals(this.getMaximumLength()) == false)
            return false;
        if (other.getStopSequences() == null ^ this.getStopSequences() == null)
            return false;
        if (other.getStopSequences() != null && other.getStopSequences().equals(this.getStopSequences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        hashCode = prime * hashCode + ((getTopP() == null) ? 0 : getTopP().hashCode());
        hashCode = prime * hashCode + ((getTopK() == null) ? 0 : getTopK().hashCode());
        hashCode = prime * hashCode + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode + ((getStopSequences() == null) ? 0 : getStopSequences().hashCode());
        return hashCode;
    }

    @Override
    public InferenceConfiguration clone() {
        try {
            return (InferenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.InferenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
