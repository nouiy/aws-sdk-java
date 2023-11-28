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
 * ActionGroup Summary
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ActionGroupSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionGroupSummary implements Serializable, Cloneable, StructuredPojo {

    private String actionGroupId;

    private String actionGroupName;

    private String actionGroupState;

    private String description;

    private java.util.Date updatedAt;

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

    public ActionGroupSummary withActionGroupId(String actionGroupId) {
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

    public ActionGroupSummary withActionGroupName(String actionGroupName) {
        setActionGroupName(actionGroupName);
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

    public ActionGroupSummary withActionGroupState(String actionGroupState) {
        setActionGroupState(actionGroupState);
        return this;
    }

    /**
     * @param actionGroupState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionGroupState
     */

    public ActionGroupSummary withActionGroupState(ActionGroupState actionGroupState) {
        this.actionGroupState = actionGroupState.toString();
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

    public ActionGroupSummary withDescription(String description) {
        setDescription(description);
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

    public ActionGroupSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getActionGroupId() != null)
            sb.append("ActionGroupId: ").append(getActionGroupId()).append(",");
        if (getActionGroupName() != null)
            sb.append("ActionGroupName: ").append(getActionGroupName()).append(",");
        if (getActionGroupState() != null)
            sb.append("ActionGroupState: ").append(getActionGroupState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionGroupSummary == false)
            return false;
        ActionGroupSummary other = (ActionGroupSummary) obj;
        if (other.getActionGroupId() == null ^ this.getActionGroupId() == null)
            return false;
        if (other.getActionGroupId() != null && other.getActionGroupId().equals(this.getActionGroupId()) == false)
            return false;
        if (other.getActionGroupName() == null ^ this.getActionGroupName() == null)
            return false;
        if (other.getActionGroupName() != null && other.getActionGroupName().equals(this.getActionGroupName()) == false)
            return false;
        if (other.getActionGroupState() == null ^ this.getActionGroupState() == null)
            return false;
        if (other.getActionGroupState() != null && other.getActionGroupState().equals(this.getActionGroupState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionGroupId() == null) ? 0 : getActionGroupId().hashCode());
        hashCode = prime * hashCode + ((getActionGroupName() == null) ? 0 : getActionGroupName().hashCode());
        hashCode = prime * hashCode + ((getActionGroupState() == null) ? 0 : getActionGroupState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ActionGroupSummary clone() {
        try {
            return (ActionGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ActionGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
