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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Update Agent Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateAgent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     */
    private String agentId;

    private String agentName;

    private String instruction;

    private String foundationModel;

    private String description;

    private Integer idleSessionTTLInSeconds;

    private String agentResourceRoleArn;

    private String customerEncryptionKeyArn;

    private PromptOverrideConfiguration promptOverrideConfiguration;

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     * 
     * @param agentId
     *        Id generated at the server side when an Agent is created
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     * 
     * @return Id generated at the server side when an Agent is created
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     * 
     * @param agentId
     *        Id generated at the server side when an Agent is created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * @param agentName
     */

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * @return
     */

    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @param agentName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withAgentName(String agentName) {
        setAgentName(agentName);
        return this;
    }

    /**
     * @param instruction
     */

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * @return
     */

    public String getInstruction() {
        return this.instruction;
    }

    /**
     * @param instruction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withInstruction(String instruction) {
        setInstruction(instruction);
        return this;
    }

    /**
     * @param foundationModel
     */

    public void setFoundationModel(String foundationModel) {
        this.foundationModel = foundationModel;
    }

    /**
     * @return
     */

    public String getFoundationModel() {
        return this.foundationModel;
    }

    /**
     * @param foundationModel
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withFoundationModel(String foundationModel) {
        setFoundationModel(foundationModel);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param idleSessionTTLInSeconds
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * @return
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * @param idleSessionTTLInSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * @param agentResourceRoleArn
     */

    public void setAgentResourceRoleArn(String agentResourceRoleArn) {
        this.agentResourceRoleArn = agentResourceRoleArn;
    }

    /**
     * @return
     */

    public String getAgentResourceRoleArn() {
        return this.agentResourceRoleArn;
    }

    /**
     * @param agentResourceRoleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withAgentResourceRoleArn(String agentResourceRoleArn) {
        setAgentResourceRoleArn(agentResourceRoleArn);
        return this;
    }

    /**
     * @param customerEncryptionKeyArn
     */

    public void setCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        this.customerEncryptionKeyArn = customerEncryptionKeyArn;
    }

    /**
     * @return
     */

    public String getCustomerEncryptionKeyArn() {
        return this.customerEncryptionKeyArn;
    }

    /**
     * @param customerEncryptionKeyArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withCustomerEncryptionKeyArn(String customerEncryptionKeyArn) {
        setCustomerEncryptionKeyArn(customerEncryptionKeyArn);
        return this;
    }

    /**
     * @param promptOverrideConfiguration
     */

    public void setPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        this.promptOverrideConfiguration = promptOverrideConfiguration;
    }

    /**
     * @return
     */

    public PromptOverrideConfiguration getPromptOverrideConfiguration() {
        return this.promptOverrideConfiguration;
    }

    /**
     * @param promptOverrideConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentRequest withPromptOverrideConfiguration(PromptOverrideConfiguration promptOverrideConfiguration) {
        setPromptOverrideConfiguration(promptOverrideConfiguration);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAgentName() != null)
            sb.append("AgentName: ").append(getAgentName()).append(",");
        if (getInstruction() != null)
            sb.append("Instruction: ").append("***Sensitive Data Redacted***").append(",");
        if (getFoundationModel() != null)
            sb.append("FoundationModel: ").append(getFoundationModel()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getAgentResourceRoleArn() != null)
            sb.append("AgentResourceRoleArn: ").append(getAgentResourceRoleArn()).append(",");
        if (getCustomerEncryptionKeyArn() != null)
            sb.append("CustomerEncryptionKeyArn: ").append(getCustomerEncryptionKeyArn()).append(",");
        if (getPromptOverrideConfiguration() != null)
            sb.append("PromptOverrideConfiguration: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentRequest == false)
            return false;
        UpdateAgentRequest other = (UpdateAgentRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentName() == null ^ this.getAgentName() == null)
            return false;
        if (other.getAgentName() != null && other.getAgentName().equals(this.getAgentName()) == false)
            return false;
        if (other.getInstruction() == null ^ this.getInstruction() == null)
            return false;
        if (other.getInstruction() != null && other.getInstruction().equals(this.getInstruction()) == false)
            return false;
        if (other.getFoundationModel() == null ^ this.getFoundationModel() == null)
            return false;
        if (other.getFoundationModel() != null && other.getFoundationModel().equals(this.getFoundationModel()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getAgentResourceRoleArn() == null ^ this.getAgentResourceRoleArn() == null)
            return false;
        if (other.getAgentResourceRoleArn() != null && other.getAgentResourceRoleArn().equals(this.getAgentResourceRoleArn()) == false)
            return false;
        if (other.getCustomerEncryptionKeyArn() == null ^ this.getCustomerEncryptionKeyArn() == null)
            return false;
        if (other.getCustomerEncryptionKeyArn() != null && other.getCustomerEncryptionKeyArn().equals(this.getCustomerEncryptionKeyArn()) == false)
            return false;
        if (other.getPromptOverrideConfiguration() == null ^ this.getPromptOverrideConfiguration() == null)
            return false;
        if (other.getPromptOverrideConfiguration() != null && other.getPromptOverrideConfiguration().equals(this.getPromptOverrideConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        hashCode = prime * hashCode + ((getInstruction() == null) ? 0 : getInstruction().hashCode());
        hashCode = prime * hashCode + ((getFoundationModel() == null) ? 0 : getFoundationModel().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAgentResourceRoleArn() == null) ? 0 : getAgentResourceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerEncryptionKeyArn() == null) ? 0 : getCustomerEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getPromptOverrideConfiguration() == null) ? 0 : getPromptOverrideConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentRequest clone() {
        return (UpdateAgentRequest) super.clone();
    }

}
