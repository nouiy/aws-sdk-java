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
 * Contains the information of an Agent Action Group
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentActionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentActionGroup implements Serializable, Cloneable, StructuredPojo {

    private String agentId;

    private String agentVersion;

    private String actionGroupId;

    private String actionGroupName;

    private String clientToken;

    private String description;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    private String parentActionSignature;

    private ActionGroupExecutor actionGroupExecutor;

    private APISchema apiSchema;

    private String actionGroupState;

    /**
     * @param agentId
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * @return
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @param agentId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * @param agentVersion
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * @return
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @param agentVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * @param actionGroupId
     */

    public void setActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    /**
     * @return
     */

    public String getActionGroupId() {
        return this.actionGroupId;
    }

    /**
     * @param actionGroupId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupId(String actionGroupId) {
        setActionGroupId(actionGroupId);
        return this;
    }

    /**
     * @param actionGroupName
     */

    public void setActionGroupName(String actionGroupName) {
        this.actionGroupName = actionGroupName;
    }

    /**
     * @return
     */

    public String getActionGroupName() {
        return this.actionGroupName;
    }

    /**
     * @param actionGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupName(String actionGroupName) {
        setActionGroupName(actionGroupName);
        return this;
    }

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public AgentActionGroup withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @param parentActionSignature
     * @see ActionGroupSignature
     */

    public void setParentActionSignature(String parentActionSignature) {
        this.parentActionSignature = parentActionSignature;
    }

    /**
     * @return
     * @see ActionGroupSignature
     */

    public String getParentActionSignature() {
        return this.parentActionSignature;
    }

    /**
     * @param parentActionSignature
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public AgentActionGroup withParentActionSignature(String parentActionSignature) {
        setParentActionSignature(parentActionSignature);
        return this;
    }

    /**
     * @param parentActionSignature
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public AgentActionGroup withParentActionSignature(ActionGroupSignature parentActionSignature) {
        this.parentActionSignature = parentActionSignature.toString();
        return this;
    }

    /**
     * @param actionGroupExecutor
     */

    public void setActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
        this.actionGroupExecutor = actionGroupExecutor;
    }

    /**
     * @return
     */

    public ActionGroupExecutor getActionGroupExecutor() {
        return this.actionGroupExecutor;
    }

    /**
     * @param actionGroupExecutor
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
        setActionGroupExecutor(actionGroupExecutor);
        return this;
    }

    /**
     * @param apiSchema
     */

    public void setApiSchema(APISchema apiSchema) {
        this.apiSchema = apiSchema;
    }

    /**
     * @return
     */

    public APISchema getApiSchema() {
        return this.apiSchema;
    }

    /**
     * @param apiSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentActionGroup withApiSchema(APISchema apiSchema) {
        setApiSchema(apiSchema);
        return this;
    }

    /**
     * @param actionGroupState
     * @see ActionGroupState
     */

    public void setActionGroupState(String actionGroupState) {
        this.actionGroupState = actionGroupState;
    }

    /**
     * @return
     * @see ActionGroupState
     */

    public String getActionGroupState() {
        return this.actionGroupState;
    }

    /**
     * @param actionGroupState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public AgentActionGroup withActionGroupState(String actionGroupState) {
        setActionGroupState(actionGroupState);
        return this;
    }

    /**
     * @param actionGroupState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public AgentActionGroup withActionGroupState(ActionGroupState actionGroupState) {
        this.actionGroupState = actionGroupState.toString();
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getActionGroupId() != null)
            sb.append("ActionGroupId: ").append(getActionGroupId()).append(",");
        if (getActionGroupName() != null)
            sb.append("ActionGroupName: ").append(getActionGroupName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getParentActionSignature() != null)
            sb.append("ParentActionSignature: ").append(getParentActionSignature()).append(",");
        if (getActionGroupExecutor() != null)
            sb.append("ActionGroupExecutor: ").append(getActionGroupExecutor()).append(",");
        if (getApiSchema() != null)
            sb.append("ApiSchema: ").append(getApiSchema()).append(",");
        if (getActionGroupState() != null)
            sb.append("ActionGroupState: ").append(getActionGroupState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentActionGroup == false)
            return false;
        AgentActionGroup other = (AgentActionGroup) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getActionGroupId() == null ^ this.getActionGroupId() == null)
            return false;
        if (other.getActionGroupId() != null && other.getActionGroupId().equals(this.getActionGroupId()) == false)
            return false;
        if (other.getActionGroupName() == null ^ this.getActionGroupName() == null)
            return false;
        if (other.getActionGroupName() != null && other.getActionGroupName().equals(this.getActionGroupName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getParentActionSignature() == null ^ this.getParentActionSignature() == null)
            return false;
        if (other.getParentActionSignature() != null && other.getParentActionSignature().equals(this.getParentActionSignature()) == false)
            return false;
        if (other.getActionGroupExecutor() == null ^ this.getActionGroupExecutor() == null)
            return false;
        if (other.getActionGroupExecutor() != null && other.getActionGroupExecutor().equals(this.getActionGroupExecutor()) == false)
            return false;
        if (other.getApiSchema() == null ^ this.getApiSchema() == null)
            return false;
        if (other.getApiSchema() != null && other.getApiSchema().equals(this.getApiSchema()) == false)
            return false;
        if (other.getActionGroupState() == null ^ this.getActionGroupState() == null)
            return false;
        if (other.getActionGroupState() != null && other.getActionGroupState().equals(this.getActionGroupState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getActionGroupId() == null) ? 0 : getActionGroupId().hashCode());
        hashCode = prime * hashCode + ((getActionGroupName() == null) ? 0 : getActionGroupName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getParentActionSignature() == null) ? 0 : getParentActionSignature().hashCode());
        hashCode = prime * hashCode + ((getActionGroupExecutor() == null) ? 0 : getActionGroupExecutor().hashCode());
        hashCode = prime * hashCode + ((getApiSchema() == null) ? 0 : getApiSchema().hashCode());
        hashCode = prime * hashCode + ((getActionGroupState() == null) ? 0 : getActionGroupState().hashCode());
        return hashCode;
    }

    @Override
    public AgentActionGroup clone() {
        try {
            return (AgentActionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentActionGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
