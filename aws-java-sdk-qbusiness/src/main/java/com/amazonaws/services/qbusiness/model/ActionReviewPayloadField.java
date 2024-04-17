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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A user input field in an plugin action review payload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ActionReviewPayloadField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionReviewPayloadField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q Business
     * to perform the requested plugin action.
     * </p>
     */
    private java.util.List<ActionReviewPayloadFieldAllowedValue> allowedValues;
    /**
     * <p>
     * The name of the field.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The display order of fields in a payload.
     * </p>
     */
    private Integer displayOrder;
    /**
     * <p>
     * Information about whether the field is required.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The type of field.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q Business
     * to perform the requested plugin action.
     * </p>
     * 
     * @return Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q
     *         Business to perform the requested plugin action.
     */

    public java.util.List<ActionReviewPayloadFieldAllowedValue> getAllowedValues() {
        return allowedValues;
    }

    /**
     * <p>
     * Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q Business
     * to perform the requested plugin action.
     * </p>
     * 
     * @param allowedValues
     *        Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q
     *        Business to perform the requested plugin action.
     */

    public void setAllowedValues(java.util.Collection<ActionReviewPayloadFieldAllowedValue> allowedValues) {
        if (allowedValues == null) {
            this.allowedValues = null;
            return;
        }

        this.allowedValues = new java.util.ArrayList<ActionReviewPayloadFieldAllowedValue>(allowedValues);
    }

    /**
     * <p>
     * Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q Business
     * to perform the requested plugin action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedValues(java.util.Collection)} or {@link #withAllowedValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedValues
     *        Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q
     *        Business to perform the requested plugin action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReviewPayloadField withAllowedValues(ActionReviewPayloadFieldAllowedValue... allowedValues) {
        if (this.allowedValues == null) {
            setAllowedValues(new java.util.ArrayList<ActionReviewPayloadFieldAllowedValue>(allowedValues.length));
        }
        for (ActionReviewPayloadFieldAllowedValue ele : allowedValues) {
            this.allowedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q Business
     * to perform the requested plugin action.
     * </p>
     * 
     * @param allowedValues
     *        Information about the field values that an end user can use to provide to Amazon Q Business for Amazon Q
     *        Business to perform the requested plugin action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReviewPayloadField withAllowedValues(java.util.Collection<ActionReviewPayloadFieldAllowedValue> allowedValues) {
        setAllowedValues(allowedValues);
        return this;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param displayName
     *        The name of the field.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @return The name of the field.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the field.
     * </p>
     * 
     * @param displayName
     *        The name of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReviewPayloadField withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The display order of fields in a payload.
     * </p>
     * 
     * @param displayOrder
     *        The display order of fields in a payload.
     */

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * <p>
     * The display order of fields in a payload.
     * </p>
     * 
     * @return The display order of fields in a payload.
     */

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * <p>
     * The display order of fields in a payload.
     * </p>
     * 
     * @param displayOrder
     *        The display order of fields in a payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReviewPayloadField withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    /**
     * <p>
     * Information about whether the field is required.
     * </p>
     * 
     * @param required
     *        Information about whether the field is required.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Information about whether the field is required.
     * </p>
     * 
     * @return Information about whether the field is required.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Information about whether the field is required.
     * </p>
     * 
     * @param required
     *        Information about whether the field is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionReviewPayloadField withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Information about whether the field is required.
     * </p>
     * 
     * @return Information about whether the field is required.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param type
     *        The type of field.
     * @see ActionPayloadFieldType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @return The type of field.
     * @see ActionPayloadFieldType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param type
     *        The type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionPayloadFieldType
     */

    public ActionReviewPayloadField withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of field.
     * </p>
     * 
     * @param type
     *        The type of field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionPayloadFieldType
     */

    public ActionReviewPayloadField withType(ActionPayloadFieldType type) {
        this.type = type.toString();
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
        if (getAllowedValues() != null)
            sb.append("AllowedValues: ").append(getAllowedValues()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: ").append(getDisplayOrder()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionReviewPayloadField == false)
            return false;
        ActionReviewPayloadField other = (ActionReviewPayloadField) obj;
        if (other.getAllowedValues() == null ^ this.getAllowedValues() == null)
            return false;
        if (other.getAllowedValues() != null && other.getAllowedValues().equals(this.getAllowedValues()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedValues() == null) ? 0 : getAllowedValues().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ActionReviewPayloadField clone() {
        try {
            return (ActionReviewPayloadField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.ActionReviewPayloadFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
