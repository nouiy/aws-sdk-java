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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/AgentDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Current agent version.
     * </p>
     */
    private String agentVersion;
    /**
     * <p>
     * List of versions being used by agent components.
     * </p>
     */
    private java.util.List<ComponentVersion> componentVersions;
    /**
     * <p>
     * ID of EC2 instance agent is running on.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Type of EC2 instance agent is running on.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Number of Cpu cores reserved for agent.
     * </p>
     */
    private java.util.List<Integer> reservedCpuCores;

    /**
     * <p>
     * Current agent version.
     * </p>
     * 
     * @param agentVersion
     *        Current agent version.
     */

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    /**
     * <p>
     * Current agent version.
     * </p>
     * 
     * @return Current agent version.
     */

    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * <p>
     * Current agent version.
     * </p>
     * 
     * @param agentVersion
     *        Current agent version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withAgentVersion(String agentVersion) {
        setAgentVersion(agentVersion);
        return this;
    }

    /**
     * <p>
     * List of versions being used by agent components.
     * </p>
     * 
     * @return List of versions being used by agent components.
     */

    public java.util.List<ComponentVersion> getComponentVersions() {
        return componentVersions;
    }

    /**
     * <p>
     * List of versions being used by agent components.
     * </p>
     * 
     * @param componentVersions
     *        List of versions being used by agent components.
     */

    public void setComponentVersions(java.util.Collection<ComponentVersion> componentVersions) {
        if (componentVersions == null) {
            this.componentVersions = null;
            return;
        }

        this.componentVersions = new java.util.ArrayList<ComponentVersion>(componentVersions);
    }

    /**
     * <p>
     * List of versions being used by agent components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentVersions(java.util.Collection)} or {@link #withComponentVersions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param componentVersions
     *        List of versions being used by agent components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withComponentVersions(ComponentVersion... componentVersions) {
        if (this.componentVersions == null) {
            setComponentVersions(new java.util.ArrayList<ComponentVersion>(componentVersions.length));
        }
        for (ComponentVersion ele : componentVersions) {
            this.componentVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of versions being used by agent components.
     * </p>
     * 
     * @param componentVersions
     *        List of versions being used by agent components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withComponentVersions(java.util.Collection<ComponentVersion> componentVersions) {
        setComponentVersions(componentVersions);
        return this;
    }

    /**
     * <p>
     * ID of EC2 instance agent is running on.
     * </p>
     * 
     * @param instanceId
     *        ID of EC2 instance agent is running on.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * ID of EC2 instance agent is running on.
     * </p>
     * 
     * @return ID of EC2 instance agent is running on.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * ID of EC2 instance agent is running on.
     * </p>
     * 
     * @param instanceId
     *        ID of EC2 instance agent is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Type of EC2 instance agent is running on.
     * </p>
     * 
     * @param instanceType
     *        Type of EC2 instance agent is running on.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Type of EC2 instance agent is running on.
     * </p>
     * 
     * @return Type of EC2 instance agent is running on.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Type of EC2 instance agent is running on.
     * </p>
     * 
     * @param instanceType
     *        Type of EC2 instance agent is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Number of Cpu cores reserved for agent.
     * </p>
     * 
     * @return Number of Cpu cores reserved for agent.
     */

    public java.util.List<Integer> getReservedCpuCores() {
        return reservedCpuCores;
    }

    /**
     * <p>
     * Number of Cpu cores reserved for agent.
     * </p>
     * 
     * @param reservedCpuCores
     *        Number of Cpu cores reserved for agent.
     */

    public void setReservedCpuCores(java.util.Collection<Integer> reservedCpuCores) {
        if (reservedCpuCores == null) {
            this.reservedCpuCores = null;
            return;
        }

        this.reservedCpuCores = new java.util.ArrayList<Integer>(reservedCpuCores);
    }

    /**
     * <p>
     * Number of Cpu cores reserved for agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedCpuCores(java.util.Collection)} or {@link #withReservedCpuCores(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param reservedCpuCores
     *        Number of Cpu cores reserved for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withReservedCpuCores(Integer... reservedCpuCores) {
        if (this.reservedCpuCores == null) {
            setReservedCpuCores(new java.util.ArrayList<Integer>(reservedCpuCores.length));
        }
        for (Integer ele : reservedCpuCores) {
            this.reservedCpuCores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Number of Cpu cores reserved for agent.
     * </p>
     * 
     * @param reservedCpuCores
     *        Number of Cpu cores reserved for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentDetails withReservedCpuCores(java.util.Collection<Integer> reservedCpuCores) {
        setReservedCpuCores(reservedCpuCores);
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
        if (getAgentVersion() != null)
            sb.append("AgentVersion: ").append(getAgentVersion()).append(",");
        if (getComponentVersions() != null)
            sb.append("ComponentVersions: ").append(getComponentVersions()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getReservedCpuCores() != null)
            sb.append("ReservedCpuCores: ").append(getReservedCpuCores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentDetails == false)
            return false;
        AgentDetails other = (AgentDetails) obj;
        if (other.getAgentVersion() == null ^ this.getAgentVersion() == null)
            return false;
        if (other.getAgentVersion() != null && other.getAgentVersion().equals(this.getAgentVersion()) == false)
            return false;
        if (other.getComponentVersions() == null ^ this.getComponentVersions() == null)
            return false;
        if (other.getComponentVersions() != null && other.getComponentVersions().equals(this.getComponentVersions()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getReservedCpuCores() == null ^ this.getReservedCpuCores() == null)
            return false;
        if (other.getReservedCpuCores() != null && other.getReservedCpuCores().equals(this.getReservedCpuCores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentVersion() == null) ? 0 : getAgentVersion().hashCode());
        hashCode = prime * hashCode + ((getComponentVersions() == null) ? 0 : getComponentVersions().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getReservedCpuCores() == null) ? 0 : getReservedCpuCores().hashCode());
        return hashCode;
    }

    @Override
    public AgentDetails clone() {
        try {
            return (AgentDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.AgentDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
