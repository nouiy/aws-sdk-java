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
 * Contains the information of an agent alias
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/AgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentAlias implements Serializable, Cloneable, StructuredPojo {

    private String agentId;

    private String agentAliasId;

    private String agentAliasName;

    private String agentAliasArn;

    private String clientToken;

    private String description;

    private java.util.List<AgentAliasRoutingConfigurationListItem> routingConfiguration;

    private java.util.Date createdAt;

    private java.util.Date updatedAt;

    private java.util.List<AgentAliasHistoryEvent> agentAliasHistoryEvents;

    private String agentAliasStatus;

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

    public AgentAlias withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * @param agentAliasId
     */

    public void setAgentAliasId(String agentAliasId) {
        this.agentAliasId = agentAliasId;
    }

    /**
     * @return
     */

    public String getAgentAliasId() {
        return this.agentAliasId;
    }

    /**
     * @param agentAliasId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
        return this;
    }

    /**
     * @param agentAliasName
     */

    public void setAgentAliasName(String agentAliasName) {
        this.agentAliasName = agentAliasName;
    }

    /**
     * @return
     */

    public String getAgentAliasName() {
        return this.agentAliasName;
    }

    /**
     * @param agentAliasName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasName(String agentAliasName) {
        setAgentAliasName(agentAliasName);
        return this;
    }

    /**
     * @param agentAliasArn
     */

    public void setAgentAliasArn(String agentAliasArn) {
        this.agentAliasArn = agentAliasArn;
    }

    /**
     * @return
     */

    public String getAgentAliasArn() {
        return this.agentAliasArn;
    }

    /**
     * @param agentAliasArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasArn(String agentAliasArn) {
        setAgentAliasArn(agentAliasArn);
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

    public AgentAlias withClientToken(String clientToken) {
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

    public AgentAlias withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AgentAliasRoutingConfigurationListItem> getRoutingConfiguration() {
        return routingConfiguration;
    }

    /**
     * @param routingConfiguration
     */

    public void setRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        if (routingConfiguration == null) {
            this.routingConfiguration = null;
            return;
        }

        this.routingConfiguration = new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingConfiguration(java.util.Collection)} or {@link #withRoutingConfiguration(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param routingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withRoutingConfiguration(AgentAliasRoutingConfigurationListItem... routingConfiguration) {
        if (this.routingConfiguration == null) {
            setRoutingConfiguration(new java.util.ArrayList<AgentAliasRoutingConfigurationListItem>(routingConfiguration.length));
        }
        for (AgentAliasRoutingConfigurationListItem ele : routingConfiguration) {
            this.routingConfiguration.add(ele);
        }
        return this;
    }

    /**
     * @param routingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withRoutingConfiguration(java.util.Collection<AgentAliasRoutingConfigurationListItem> routingConfiguration) {
        setRoutingConfiguration(routingConfiguration);
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

    public AgentAlias withCreatedAt(java.util.Date createdAt) {
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

    public AgentAlias withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AgentAliasHistoryEvent> getAgentAliasHistoryEvents() {
        return agentAliasHistoryEvents;
    }

    /**
     * @param agentAliasHistoryEvents
     */

    public void setAgentAliasHistoryEvents(java.util.Collection<AgentAliasHistoryEvent> agentAliasHistoryEvents) {
        if (agentAliasHistoryEvents == null) {
            this.agentAliasHistoryEvents = null;
            return;
        }

        this.agentAliasHistoryEvents = new java.util.ArrayList<AgentAliasHistoryEvent>(agentAliasHistoryEvents);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentAliasHistoryEvents(java.util.Collection)} or
     * {@link #withAgentAliasHistoryEvents(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agentAliasHistoryEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasHistoryEvents(AgentAliasHistoryEvent... agentAliasHistoryEvents) {
        if (this.agentAliasHistoryEvents == null) {
            setAgentAliasHistoryEvents(new java.util.ArrayList<AgentAliasHistoryEvent>(agentAliasHistoryEvents.length));
        }
        for (AgentAliasHistoryEvent ele : agentAliasHistoryEvents) {
            this.agentAliasHistoryEvents.add(ele);
        }
        return this;
    }

    /**
     * @param agentAliasHistoryEvents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentAlias withAgentAliasHistoryEvents(java.util.Collection<AgentAliasHistoryEvent> agentAliasHistoryEvents) {
        setAgentAliasHistoryEvents(agentAliasHistoryEvents);
        return this;
    }

    /**
     * @param agentAliasStatus
     * @see AgentAliasStatus
     */

    public void setAgentAliasStatus(String agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus;
    }

    /**
     * @return
     * @see AgentAliasStatus
     */

    public String getAgentAliasStatus() {
        return this.agentAliasStatus;
    }

    /**
     * @param agentAliasStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAlias withAgentAliasStatus(String agentAliasStatus) {
        setAgentAliasStatus(agentAliasStatus);
        return this;
    }

    /**
     * @param agentAliasStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public AgentAlias withAgentAliasStatus(AgentAliasStatus agentAliasStatus) {
        this.agentAliasStatus = agentAliasStatus.toString();
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
        if (getAgentAliasId() != null)
            sb.append("AgentAliasId: ").append(getAgentAliasId()).append(",");
        if (getAgentAliasName() != null)
            sb.append("AgentAliasName: ").append(getAgentAliasName()).append(",");
        if (getAgentAliasArn() != null)
            sb.append("AgentAliasArn: ").append(getAgentAliasArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoutingConfiguration() != null)
            sb.append("RoutingConfiguration: ").append(getRoutingConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getAgentAliasHistoryEvents() != null)
            sb.append("AgentAliasHistoryEvents: ").append(getAgentAliasHistoryEvents()).append(",");
        if (getAgentAliasStatus() != null)
            sb.append("AgentAliasStatus: ").append(getAgentAliasStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentAlias == false)
            return false;
        AgentAlias other = (AgentAlias) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
            return false;
        if (other.getAgentAliasName() == null ^ this.getAgentAliasName() == null)
            return false;
        if (other.getAgentAliasName() != null && other.getAgentAliasName().equals(this.getAgentAliasName()) == false)
            return false;
        if (other.getAgentAliasArn() == null ^ this.getAgentAliasArn() == null)
            return false;
        if (other.getAgentAliasArn() != null && other.getAgentAliasArn().equals(this.getAgentAliasArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoutingConfiguration() == null ^ this.getRoutingConfiguration() == null)
            return false;
        if (other.getRoutingConfiguration() != null && other.getRoutingConfiguration().equals(this.getRoutingConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getAgentAliasHistoryEvents() == null ^ this.getAgentAliasHistoryEvents() == null)
            return false;
        if (other.getAgentAliasHistoryEvents() != null && other.getAgentAliasHistoryEvents().equals(this.getAgentAliasHistoryEvents()) == false)
            return false;
        if (other.getAgentAliasStatus() == null ^ this.getAgentAliasStatus() == null)
            return false;
        if (other.getAgentAliasStatus() != null && other.getAgentAliasStatus().equals(this.getAgentAliasStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasId() == null) ? 0 : getAgentAliasId().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasName() == null) ? 0 : getAgentAliasName().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasArn() == null) ? 0 : getAgentAliasArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfiguration() == null) ? 0 : getRoutingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasHistoryEvents() == null) ? 0 : getAgentAliasHistoryEvents().hashCode());
        hashCode = prime * hashCode + ((getAgentAliasStatus() == null) ? 0 : getAgentAliasStatus().hashCode());
        return hashCode;
    }

    @Override
    public AgentAlias clone() {
        try {
            return (AgentAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.AgentAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
