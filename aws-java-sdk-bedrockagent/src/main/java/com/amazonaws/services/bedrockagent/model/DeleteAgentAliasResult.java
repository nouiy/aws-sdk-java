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

/**
 * <p>
 * Delete Agent Alias Response
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/DeleteAgentAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAgentAliasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String agentId;

    private String agentAliasId;

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

    public DeleteAgentAliasResult withAgentId(String agentId) {
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

    public DeleteAgentAliasResult withAgentAliasId(String agentAliasId) {
        setAgentAliasId(agentAliasId);
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

    public DeleteAgentAliasResult withAgentAliasStatus(String agentAliasStatus) {
        setAgentAliasStatus(agentAliasStatus);
        return this;
    }

    /**
     * @param agentAliasStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAliasStatus
     */

    public DeleteAgentAliasResult withAgentAliasStatus(AgentAliasStatus agentAliasStatus) {
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

        if (obj instanceof DeleteAgentAliasResult == false)
            return false;
        DeleteAgentAliasResult other = (DeleteAgentAliasResult) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAgentAliasId() == null ^ this.getAgentAliasId() == null)
            return false;
        if (other.getAgentAliasId() != null && other.getAgentAliasId().equals(this.getAgentAliasId()) == false)
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
        hashCode = prime * hashCode + ((getAgentAliasStatus() == null) ? 0 : getAgentAliasStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAgentAliasResult clone() {
        try {
            return (DeleteAgentAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
