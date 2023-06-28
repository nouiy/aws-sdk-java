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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for the configuration. Defines the health event threshold percentages, for performance score and
 * availability score. Amazon CloudWatch Internet Monitor creates a health event when there's an internet issue that
 * affects your application end users where a health score percentage is at or below a set threshold. If you don't set a
 * health event threshold, the default value is 95%.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/HealthEventsConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthEventsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     */
    private Double availabilityScoreThreshold;
    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     */
    private Double performanceScoreThreshold;

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @param availabilityScoreThreshold
     *        The health event threshold percentage set for availability scores.
     */

    public void setAvailabilityScoreThreshold(Double availabilityScoreThreshold) {
        this.availabilityScoreThreshold = availabilityScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @return The health event threshold percentage set for availability scores.
     */

    public Double getAvailabilityScoreThreshold() {
        return this.availabilityScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for availability scores.
     * </p>
     * 
     * @param availabilityScoreThreshold
     *        The health event threshold percentage set for availability scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withAvailabilityScoreThreshold(Double availabilityScoreThreshold) {
        setAvailabilityScoreThreshold(availabilityScoreThreshold);
        return this;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @param performanceScoreThreshold
     *        The health event threshold percentage set for performance scores.
     */

    public void setPerformanceScoreThreshold(Double performanceScoreThreshold) {
        this.performanceScoreThreshold = performanceScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @return The health event threshold percentage set for performance scores.
     */

    public Double getPerformanceScoreThreshold() {
        return this.performanceScoreThreshold;
    }

    /**
     * <p>
     * The health event threshold percentage set for performance scores.
     * </p>
     * 
     * @param performanceScoreThreshold
     *        The health event threshold percentage set for performance scores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthEventsConfig withPerformanceScoreThreshold(Double performanceScoreThreshold) {
        setPerformanceScoreThreshold(performanceScoreThreshold);
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
        if (getAvailabilityScoreThreshold() != null)
            sb.append("AvailabilityScoreThreshold: ").append(getAvailabilityScoreThreshold()).append(",");
        if (getPerformanceScoreThreshold() != null)
            sb.append("PerformanceScoreThreshold: ").append(getPerformanceScoreThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthEventsConfig == false)
            return false;
        HealthEventsConfig other = (HealthEventsConfig) obj;
        if (other.getAvailabilityScoreThreshold() == null ^ this.getAvailabilityScoreThreshold() == null)
            return false;
        if (other.getAvailabilityScoreThreshold() != null && other.getAvailabilityScoreThreshold().equals(this.getAvailabilityScoreThreshold()) == false)
            return false;
        if (other.getPerformanceScoreThreshold() == null ^ this.getPerformanceScoreThreshold() == null)
            return false;
        if (other.getPerformanceScoreThreshold() != null && other.getPerformanceScoreThreshold().equals(this.getPerformanceScoreThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityScoreThreshold() == null) ? 0 : getAvailabilityScoreThreshold().hashCode());
        hashCode = prime * hashCode + ((getPerformanceScoreThreshold() == null) ? 0 : getPerformanceScoreThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthEventsConfig clone() {
        try {
            return (HealthEventsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.HealthEventsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
