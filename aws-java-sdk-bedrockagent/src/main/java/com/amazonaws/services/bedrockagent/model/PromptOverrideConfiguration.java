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
 * Configuration for prompt override.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptOverrideConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptOverrideConfiguration implements Serializable, Cloneable, StructuredPojo {

    private java.util.List<PromptConfiguration> promptConfigurations;

    private String overrideLambda;

    /**
     * @return
     */

    public java.util.List<PromptConfiguration> getPromptConfigurations() {
        return promptConfigurations;
    }

    /**
     * @param promptConfigurations
     */

    public void setPromptConfigurations(java.util.Collection<PromptConfiguration> promptConfigurations) {
        if (promptConfigurations == null) {
            this.promptConfigurations = null;
            return;
        }

        this.promptConfigurations = new java.util.ArrayList<PromptConfiguration>(promptConfigurations);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPromptConfigurations(java.util.Collection)} or {@link #withPromptConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param promptConfigurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withPromptConfigurations(PromptConfiguration... promptConfigurations) {
        if (this.promptConfigurations == null) {
            setPromptConfigurations(new java.util.ArrayList<PromptConfiguration>(promptConfigurations.length));
        }
        for (PromptConfiguration ele : promptConfigurations) {
            this.promptConfigurations.add(ele);
        }
        return this;
    }

    /**
     * @param promptConfigurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withPromptConfigurations(java.util.Collection<PromptConfiguration> promptConfigurations) {
        setPromptConfigurations(promptConfigurations);
        return this;
    }

    /**
     * @param overrideLambda
     */

    public void setOverrideLambda(String overrideLambda) {
        this.overrideLambda = overrideLambda;
    }

    /**
     * @return
     */

    public String getOverrideLambda() {
        return this.overrideLambda;
    }

    /**
     * @param overrideLambda
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptOverrideConfiguration withOverrideLambda(String overrideLambda) {
        setOverrideLambda(overrideLambda);
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
        if (getPromptConfigurations() != null)
            sb.append("PromptConfigurations: ").append(getPromptConfigurations()).append(",");
        if (getOverrideLambda() != null)
            sb.append("OverrideLambda: ").append(getOverrideLambda());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptOverrideConfiguration == false)
            return false;
        PromptOverrideConfiguration other = (PromptOverrideConfiguration) obj;
        if (other.getPromptConfigurations() == null ^ this.getPromptConfigurations() == null)
            return false;
        if (other.getPromptConfigurations() != null && other.getPromptConfigurations().equals(this.getPromptConfigurations()) == false)
            return false;
        if (other.getOverrideLambda() == null ^ this.getOverrideLambda() == null)
            return false;
        if (other.getOverrideLambda() != null && other.getOverrideLambda().equals(this.getOverrideLambda()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptConfigurations() == null) ? 0 : getPromptConfigurations().hashCode());
        hashCode = prime * hashCode + ((getOverrideLambda() == null) ? 0 : getOverrideLambda().hashCode());
        return hashCode;
    }

    @Override
    public PromptOverrideConfiguration clone() {
        try {
            return (PromptOverrideConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptOverrideConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
