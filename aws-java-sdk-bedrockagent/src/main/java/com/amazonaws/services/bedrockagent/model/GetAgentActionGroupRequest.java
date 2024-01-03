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
 * Get Action Group Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/GetAgentActionGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgentActionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Id generated at the server side when an Agent is created
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Version number generated when a version is created
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * Id generated at the server side when an Agent Action Group is created
     * </p>
     */
    private String actionGroupId;

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

    public GetAgentActionGroupRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Version number generated when a version is created
     * </p>
     * 
     * @param agentVersion
     *        Version number generated when a version is created
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * Version number generated when a version is created
     * </p>
     * 
     * @return Version number generated when a version is created
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * Version number generated when a version is created
     * </p>
     * 
     * @param agentVersion
     *        Version number generated when a version is created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupRequest withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * Id generated at the server side when an Agent Action Group is created
     * </p>
     * 
     * @param actionGroupId
     *        Id generated at the server side when an Agent Action Group is created
     */

    public void setActionGroupId(String actionGroupId) {
        this.actionGroupId = actionGroupId;
    }

    /**
     * <p>
     * Id generated at the server side when an Agent Action Group is created
     * </p>
     * 
     * @return Id generated at the server side when an Agent Action Group is created
     */

    public String getActionGroupId() {
        return this.actionGroupId;
    }

    /**
     * <p>
     * Id generated at the server side when an Agent Action Group is created
     * </p>
     * 
     * @param actionGroupId
     *        Id generated at the server side when an Agent Action Group is created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgentActionGroupRequest withActionGroupId(String actionGroupId) {
        setActionGroupId(actionGroupId);
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
            sb.append("ActionGroupId: ").append(getActionGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAgentActionGroupRequest == false)
            return false;
        GetAgentActionGroupRequest other = (GetAgentActionGroupRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getActionGroupId() == null) ? 0 : getActionGroupId().hashCode());
        return hashCode;
    }

    @Override
    public GetAgentActionGroupRequest clone() {
        return (GetAgentActionGroupRequest) super.clone();
    }

}
