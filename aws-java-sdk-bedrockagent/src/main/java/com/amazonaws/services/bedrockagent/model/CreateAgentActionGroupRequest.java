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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create Action Group Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateAgentActionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAgentActionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Draft Version of the Agent.
     * </p>
     */
    private String agentVersion;

    private String actionGroupName;

    private String clientToken;

    private String description;

    private String parentActionGroupSignature;

    private ActionGroupExecutor actionGroupExecutor;

    private APISchema apiSchema;

    private String actionGroupState;

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

    public CreateAgentActionGroupRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Draft Version of the Agent.
     * </p>
     * 
     * @param agentVersion
     *        Draft Version of the Agent.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * Draft Version of the Agent.
     * </p>
     * 
     * @return Draft Version of the Agent.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * Draft Version of the Agent.
     * </p>
     * 
     * @param agentVersion
     *        Draft Version of the Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAgentActionGroupRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
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

    public CreateAgentActionGroupRequest withActionGroupName(String actionGroupName) {
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

    public CreateAgentActionGroupRequest withClientToken(String clientToken) {
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

    public CreateAgentActionGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param parentActionGroupSignature
     * @see ActionGroupSignature
     */

    public void setParentActionGroupSignature(String parentActionGroupSignature) {
        this.parentActionGroupSignature = parentActionGroupSignature;
    }

    /**
     * @return
     * @see ActionGroupSignature
     */

    public String getParentActionGroupSignature() {
        return this.parentActionGroupSignature;
    }

    /**
     * @param parentActionGroupSignature
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public CreateAgentActionGroupRequest withParentActionGroupSignature(String parentActionGroupSignature) {
        setParentActionGroupSignature(parentActionGroupSignature);
        return this;
    }

    /**
     * @param parentActionGroupSignature
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupSignature
     */

    public CreateAgentActionGroupRequest withParentActionGroupSignature(ActionGroupSignature parentActionGroupSignature) {
        this.parentActionGroupSignature = parentActionGroupSignature.toString();
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

    public CreateAgentActionGroupRequest withActionGroupExecutor(ActionGroupExecutor actionGroupExecutor) {
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

    public CreateAgentActionGroupRequest withApiSchema(APISchema apiSchema) {
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

    public CreateAgentActionGroupRequest withActionGroupState(String actionGroupState) {
        setActionGroupState(actionGroupState);
        return this;
    }

    /**
     * @param actionGroupState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public CreateAgentActionGroupRequest withActionGroupState(ActionGroupState actionGroupState) {
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
        if (getActionGroupName() != null)
            sb.append("ActionGroupName: ").append(getActionGroupName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParentActionGroupSignature() != null)
            sb.append("ParentActionGroupSignature: ").append(getParentActionGroupSignature()).append(",");
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

        if (obj instanceof CreateAgentActionGroupRequest == false)
            return false;
        CreateAgentActionGroupRequest other = (CreateAgentActionGroupRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
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
        if (other.getParentActionGroupSignature() == null ^ this.getParentActionGroupSignature() == null)
            return false;
        if (other.getParentActionGroupSignature() != null && other.getParentActionGroupSignature().equals(this.getParentActionGroupSignature()) == false)
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
        hashCode = prime * hashCode + ((getActionGroupName() == null) ? 0 : getActionGroupName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParentActionGroupSignature() == null) ? 0 : getParentActionGroupSignature().hashCode());
        hashCode = prime * hashCode + ((getActionGroupExecutor() == null) ? 0 : getActionGroupExecutor().hashCode());
        hashCode = prime * hashCode + ((getApiSchema() == null) ? 0 : getApiSchema().hashCode());
        hashCode = prime * hashCode + ((getActionGroupState() == null) ? 0 : getActionGroupState().hashCode());
        return hashCode;
    }

    @Override
    public CreateAgentActionGroupRequest clone() {
        return (CreateAgentActionGroupRequest) super.clone();
    }

}
