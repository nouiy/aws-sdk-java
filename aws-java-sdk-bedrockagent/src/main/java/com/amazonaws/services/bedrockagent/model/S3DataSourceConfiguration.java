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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures an S3 data source location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/S3DataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    private String bucketArn;

    private java.util.List<String> inclusionPrefixes;

    /**
     * @param bucketArn
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * @return
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * @param bucketArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getInclusionPrefixes() {
        return inclusionPrefixes;
    }

    /**
     * @param inclusionPrefixes
     */

    public void setInclusionPrefixes(java.util.Collection<String> inclusionPrefixes) {
        if (inclusionPrefixes == null) {
            this.inclusionPrefixes = null;
            return;
        }

        this.inclusionPrefixes = new java.util.ArrayList<String>(inclusionPrefixes);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclusionPrefixes(java.util.Collection)} or {@link #withInclusionPrefixes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param inclusionPrefixes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withInclusionPrefixes(String... inclusionPrefixes) {
        if (this.inclusionPrefixes == null) {
            setInclusionPrefixes(new java.util.ArrayList<String>(inclusionPrefixes.length));
        }
        for (String ele : inclusionPrefixes) {
            this.inclusionPrefixes.add(ele);
        }
        return this;
    }

    /**
     * @param inclusionPrefixes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DataSourceConfiguration withInclusionPrefixes(java.util.Collection<String> inclusionPrefixes) {
        setInclusionPrefixes(inclusionPrefixes);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getInclusionPrefixes() != null)
            sb.append("InclusionPrefixes: ").append(getInclusionPrefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSourceConfiguration == false)
            return false;
        S3DataSourceConfiguration other = (S3DataSourceConfiguration) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getInclusionPrefixes() == null ^ this.getInclusionPrefixes() == null)
            return false;
        if (other.getInclusionPrefixes() != null && other.getInclusionPrefixes().equals(this.getInclusionPrefixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getInclusionPrefixes() == null) ? 0 : getInclusionPrefixes().hashCode());
        return hashCode;
    }

    @Override
    public S3DataSourceConfiguration clone() {
        try {
            return (S3DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.S3DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
