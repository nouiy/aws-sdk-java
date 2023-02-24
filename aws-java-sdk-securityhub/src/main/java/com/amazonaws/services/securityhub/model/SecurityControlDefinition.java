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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides metadata for a security control, including its unique standard-agnostic identifier, title, description,
 * severity, availability in Amazon Web Services Regions, and a link to remediation steps.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControlDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     */
    private String securityControlId;
    /**
     * <p>
     * The title of a security control.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     */
    private String remediationUrl;
    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     */
    private String severityRating;
    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     */
    private String currentRegionAvailability;

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *        <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *        ARN references the security control ID (for example,
     *        arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @return The unique identifier of a security control across standards. Values for this field typically consist of
     *         an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *         <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *         ARN references the security control ID (for example,
     *         arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The unique identifier of a security control across standards. Values for this field typically consist of an
     * Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     * <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The ARN
     * references the security control ID (for example,
     * arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * </p>
     * 
     * @param securityControlId
     *        The unique identifier of a security control across standards. Values for this field typically consist of
     *        an Amazon Web Service name and a number (for example, APIGateway.3). This parameter differs from
     *        <code>SecurityControlArn</code>, which is a unique Amazon Resource Name (ARN) assigned to a control. The
     *        ARN references the security control ID (for example,
     *        arn:aws:securityhub:eu-central-1:123456789012:security-control/APIGateway.3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
        return this;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @param title
     *        The title of a security control.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @return The title of a security control.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of a security control.
     * </p>
     * 
     * @param title
     *        The title of a security control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @param description
     *        The description of a security control across standards. This typically summarizes how Security Hub
     *        evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *        reference a specific standard.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @return The description of a security control across standards. This typically summarizes how Security Hub
     *         evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *         reference a specific standard.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a security control across standards. This typically summarizes how Security Hub evaluates the
     * control and the conditions under which it produces a failed finding. This parameter doesn't reference a specific
     * standard.
     * </p>
     * 
     * @param description
     *        The description of a security control across standards. This typically summarizes how Security Hub
     *        evaluates the control and the conditions under which it produces a failed finding. This parameter doesn't
     *        reference a specific standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @param remediationUrl
     *        A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *        control.
     */

    public void setRemediationUrl(String remediationUrl) {
        this.remediationUrl = remediationUrl;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @return A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *         control.
     */

    public String getRemediationUrl() {
        return this.remediationUrl;
    }

    /**
     * <p>
     * A link to Security Hub documentation that explains how to remediate a failed finding for a security control.
     * </p>
     * 
     * @param remediationUrl
     *        A link to Security Hub documentation that explains how to remediate a failed finding for a security
     *        control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlDefinition withRemediationUrl(String remediationUrl) {
        setRemediationUrl(remediationUrl);
        return this;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @see SeverityRating
     */

    public void setSeverityRating(String severityRating) {
        this.severityRating = severityRating;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @return The severity of a security control. For more information about how Security Hub determines control
     *         severity, see <a href=
     *         "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *         >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @see SeverityRating
     */

    public String getSeverityRating() {
        return this.severityRating;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public SecurityControlDefinition withSeverityRating(String severityRating) {
        setSeverityRating(severityRating);
        return this;
    }

    /**
     * <p>
     * The severity of a security control. For more information about how Security Hub determines control severity, see
     * <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     * >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param severityRating
     *        The severity of a security control. For more information about how Security Hub determines control
     *        severity, see <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/controls-findings-create-update.html#control-findings-severity"
     *        >Assigning severity to control findings</a> in the <i>Security Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SeverityRating
     */

    public SecurityControlDefinition withSeverityRating(SeverityRating severityRating) {
        this.severityRating = severityRating.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @see RegionAvailabilityStatus
     */

    public void setCurrentRegionAvailability(String currentRegionAvailability) {
        this.currentRegionAvailability = currentRegionAvailability;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @return Specifies whether a security control is available in the current Amazon Web Services Region.
     * @see RegionAvailabilityStatus
     */

    public String getCurrentRegionAvailability() {
        return this.currentRegionAvailability;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionAvailabilityStatus
     */

    public SecurityControlDefinition withCurrentRegionAvailability(String currentRegionAvailability) {
        setCurrentRegionAvailability(currentRegionAvailability);
        return this;
    }

    /**
     * <p>
     * Specifies whether a security control is available in the current Amazon Web Services Region.
     * </p>
     * 
     * @param currentRegionAvailability
     *        Specifies whether a security control is available in the current Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionAvailabilityStatus
     */

    public SecurityControlDefinition withCurrentRegionAvailability(RegionAvailabilityStatus currentRegionAvailability) {
        this.currentRegionAvailability = currentRegionAvailability.toString();
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRemediationUrl() != null)
            sb.append("RemediationUrl: ").append(getRemediationUrl()).append(",");
        if (getSeverityRating() != null)
            sb.append("SeverityRating: ").append(getSeverityRating()).append(",");
        if (getCurrentRegionAvailability() != null)
            sb.append("CurrentRegionAvailability: ").append(getCurrentRegionAvailability());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControlDefinition == false)
            return false;
        SecurityControlDefinition other = (SecurityControlDefinition) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRemediationUrl() == null ^ this.getRemediationUrl() == null)
            return false;
        if (other.getRemediationUrl() != null && other.getRemediationUrl().equals(this.getRemediationUrl()) == false)
            return false;
        if (other.getSeverityRating() == null ^ this.getSeverityRating() == null)
            return false;
        if (other.getSeverityRating() != null && other.getSeverityRating().equals(this.getSeverityRating()) == false)
            return false;
        if (other.getCurrentRegionAvailability() == null ^ this.getCurrentRegionAvailability() == null)
            return false;
        if (other.getCurrentRegionAvailability() != null && other.getCurrentRegionAvailability().equals(this.getCurrentRegionAvailability()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRemediationUrl() == null) ? 0 : getRemediationUrl().hashCode());
        hashCode = prime * hashCode + ((getSeverityRating() == null) ? 0 : getSeverityRating().hashCode());
        hashCode = prime * hashCode + ((getCurrentRegionAvailability() == null) ? 0 : getCurrentRegionAvailability().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControlDefinition clone() {
        try {
            return (SecurityControlDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
