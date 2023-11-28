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
 * BasePromptConfiguration per Prompt Type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/PromptConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String promptType;

    private String promptCreationMode;

    private String promptState;

    private String basePromptTemplate;

    private InferenceConfiguration inferenceConfiguration;

    private String parserMode;

    /**
     * @param promptType
     * @see PromptType
     */

    public void setPromptType(String promptType) {
        this.promptType = promptType;
    }

    /**
     * @return
     * @see PromptType
     */

    public String getPromptType() {
        return this.promptType;
    }

    /**
     * @param promptType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptType
     */

    public PromptConfiguration withPromptType(String promptType) {
        setPromptType(promptType);
        return this;
    }

    /**
     * @param promptType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptType
     */

    public PromptConfiguration withPromptType(PromptType promptType) {
        this.promptType = promptType.toString();
        return this;
    }

    /**
     * @param promptCreationMode
     * @see CreationMode
     */

    public void setPromptCreationMode(String promptCreationMode) {
        this.promptCreationMode = promptCreationMode;
    }

    /**
     * @return
     * @see CreationMode
     */

    public String getPromptCreationMode() {
        return this.promptCreationMode;
    }

    /**
     * @param promptCreationMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withPromptCreationMode(String promptCreationMode) {
        setPromptCreationMode(promptCreationMode);
        return this;
    }

    /**
     * @param promptCreationMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withPromptCreationMode(CreationMode promptCreationMode) {
        this.promptCreationMode = promptCreationMode.toString();
        return this;
    }

    /**
     * @param promptState
     * @see PromptState
     */

    public void setPromptState(String promptState) {
        this.promptState = promptState;
    }

    /**
     * @return
     * @see PromptState
     */

    public String getPromptState() {
        return this.promptState;
    }

    /**
     * @param promptState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptState
     */

    public PromptConfiguration withPromptState(String promptState) {
        setPromptState(promptState);
        return this;
    }

    /**
     * @param promptState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PromptState
     */

    public PromptConfiguration withPromptState(PromptState promptState) {
        this.promptState = promptState.toString();
        return this;
    }

    /**
     * @param basePromptTemplate
     */

    public void setBasePromptTemplate(String basePromptTemplate) {
        this.basePromptTemplate = basePromptTemplate;
    }

    /**
     * @return
     */

    public String getBasePromptTemplate() {
        return this.basePromptTemplate;
    }

    /**
     * @param basePromptTemplate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptConfiguration withBasePromptTemplate(String basePromptTemplate) {
        setBasePromptTemplate(basePromptTemplate);
        return this;
    }

    /**
     * @param inferenceConfiguration
     */

    public void setInferenceConfiguration(InferenceConfiguration inferenceConfiguration) {
        this.inferenceConfiguration = inferenceConfiguration;
    }

    /**
     * @return
     */

    public InferenceConfiguration getInferenceConfiguration() {
        return this.inferenceConfiguration;
    }

    /**
     * @param inferenceConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptConfiguration withInferenceConfiguration(InferenceConfiguration inferenceConfiguration) {
        setInferenceConfiguration(inferenceConfiguration);
        return this;
    }

    /**
     * @param parserMode
     * @see CreationMode
     */

    public void setParserMode(String parserMode) {
        this.parserMode = parserMode;
    }

    /**
     * @return
     * @see CreationMode
     */

    public String getParserMode() {
        return this.parserMode;
    }

    /**
     * @param parserMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withParserMode(String parserMode) {
        setParserMode(parserMode);
        return this;
    }

    /**
     * @param parserMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CreationMode
     */

    public PromptConfiguration withParserMode(CreationMode parserMode) {
        this.parserMode = parserMode.toString();
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
        if (getPromptType() != null)
            sb.append("PromptType: ").append(getPromptType()).append(",");
        if (getPromptCreationMode() != null)
            sb.append("PromptCreationMode: ").append(getPromptCreationMode()).append(",");
        if (getPromptState() != null)
            sb.append("PromptState: ").append(getPromptState()).append(",");
        if (getBasePromptTemplate() != null)
            sb.append("BasePromptTemplate: ").append(getBasePromptTemplate()).append(",");
        if (getInferenceConfiguration() != null)
            sb.append("InferenceConfiguration: ").append(getInferenceConfiguration()).append(",");
        if (getParserMode() != null)
            sb.append("ParserMode: ").append(getParserMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptConfiguration == false)
            return false;
        PromptConfiguration other = (PromptConfiguration) obj;
        if (other.getPromptType() == null ^ this.getPromptType() == null)
            return false;
        if (other.getPromptType() != null && other.getPromptType().equals(this.getPromptType()) == false)
            return false;
        if (other.getPromptCreationMode() == null ^ this.getPromptCreationMode() == null)
            return false;
        if (other.getPromptCreationMode() != null && other.getPromptCreationMode().equals(this.getPromptCreationMode()) == false)
            return false;
        if (other.getPromptState() == null ^ this.getPromptState() == null)
            return false;
        if (other.getPromptState() != null && other.getPromptState().equals(this.getPromptState()) == false)
            return false;
        if (other.getBasePromptTemplate() == null ^ this.getBasePromptTemplate() == null)
            return false;
        if (other.getBasePromptTemplate() != null && other.getBasePromptTemplate().equals(this.getBasePromptTemplate()) == false)
            return false;
        if (other.getInferenceConfiguration() == null ^ this.getInferenceConfiguration() == null)
            return false;
        if (other.getInferenceConfiguration() != null && other.getInferenceConfiguration().equals(this.getInferenceConfiguration()) == false)
            return false;
        if (other.getParserMode() == null ^ this.getParserMode() == null)
            return false;
        if (other.getParserMode() != null && other.getParserMode().equals(this.getParserMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptType() == null) ? 0 : getPromptType().hashCode());
        hashCode = prime * hashCode + ((getPromptCreationMode() == null) ? 0 : getPromptCreationMode().hashCode());
        hashCode = prime * hashCode + ((getPromptState() == null) ? 0 : getPromptState().hashCode());
        hashCode = prime * hashCode + ((getBasePromptTemplate() == null) ? 0 : getBasePromptTemplate().hashCode());
        hashCode = prime * hashCode + ((getInferenceConfiguration() == null) ? 0 : getInferenceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getParserMode() == null) ? 0 : getParserMode().hashCode());
        return hashCode;
    }

    @Override
    public PromptConfiguration clone() {
        try {
            return (PromptConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.PromptConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
