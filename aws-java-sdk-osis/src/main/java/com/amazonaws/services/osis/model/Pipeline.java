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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an existing OpenSearch Ingestion pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/Pipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Pipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     */
    private String pipelineArn;
    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     */
    private Integer minUnits;
    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     */
    private Integer maxUnits;
    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason for the current status of the pipeline.
     * </p>
     */
    private PipelineStatusReason statusReason;
    /**
     * <p>
     * The Data Prepper pipeline configuration in YAML format.
     * </p>
     */
    private String pipelineConfigurationBody;
    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The ingestion endpoints for the pipeline, which you can send data to.
     * </p>
     */
    private java.util.List<String> ingestEndpointUrls;
    /**
     * <p>
     * Key-value pairs that represent log publishing settings.
     * </p>
     */
    private LogPublishingOptions logPublishingOptions;
    /**
     * <p>
     * The VPC interface endpoints that have access to the pipeline.
     * </p>
     */
    private java.util.List<VpcEndpoint> vpcEndpoints;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     */

    public void setPipelineArn(String pipelineArn) {
        this.pipelineArn = pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline.
     */

    public String getPipelineArn() {
        return this.pipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline.
     * </p>
     * 
     * @param pipelineArn
     *        The Amazon Resource Name (ARN) of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withPipelineArn(String pipelineArn) {
        setPipelineArn(pipelineArn);
        return this;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMinUnits(Integer minUnits) {
        this.minUnits = minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMinUnits() {
        return this.minUnits;
    }

    /**
     * <p>
     * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param minUnits
     *        The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withMinUnits(Integer minUnits) {
        setMinUnits(minUnits);
        return this;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public void setMaxUnits(Integer maxUnits) {
        this.maxUnits = maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @return The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     */

    public Integer getMaxUnits() {
        return this.maxUnits;
    }

    /**
     * <p>
     * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * </p>
     * 
     * @param maxUnits
     *        The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withMaxUnits(Integer maxUnits) {
        setMaxUnits(maxUnits);
        return this;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @see PipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @return The current status of the pipeline.
     * @see PipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public Pipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the pipeline.
     * </p>
     * 
     * @param status
     *        The current status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineStatus
     */

    public Pipeline withStatus(PipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the current status of the pipeline.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the pipeline.
     */

    public void setStatusReason(PipelineStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the pipeline.
     * </p>
     * 
     * @return The reason for the current status of the pipeline.
     */

    public PipelineStatusReason getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the current status of the pipeline.
     * </p>
     * 
     * @param statusReason
     *        The reason for the current status of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withStatusReason(PipelineStatusReason statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The Data Prepper pipeline configuration in YAML format.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The Data Prepper pipeline configuration in YAML format.
     */

    public void setPipelineConfigurationBody(String pipelineConfigurationBody) {
        this.pipelineConfigurationBody = pipelineConfigurationBody;
    }

    /**
     * <p>
     * The Data Prepper pipeline configuration in YAML format.
     * </p>
     * 
     * @return The Data Prepper pipeline configuration in YAML format.
     */

    public String getPipelineConfigurationBody() {
        return this.pipelineConfigurationBody;
    }

    /**
     * <p>
     * The Data Prepper pipeline configuration in YAML format.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The Data Prepper pipeline configuration in YAML format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withPipelineConfigurationBody(String pipelineConfigurationBody) {
        setPipelineConfigurationBody(pipelineConfigurationBody);
        return this;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the pipeline was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @return The date and time when the pipeline was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the pipeline was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @return The date and time when the pipeline was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the pipeline was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the pipeline was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The ingestion endpoints for the pipeline, which you can send data to.
     * </p>
     * 
     * @return The ingestion endpoints for the pipeline, which you can send data to.
     */

    public java.util.List<String> getIngestEndpointUrls() {
        return ingestEndpointUrls;
    }

    /**
     * <p>
     * The ingestion endpoints for the pipeline, which you can send data to.
     * </p>
     * 
     * @param ingestEndpointUrls
     *        The ingestion endpoints for the pipeline, which you can send data to.
     */

    public void setIngestEndpointUrls(java.util.Collection<String> ingestEndpointUrls) {
        if (ingestEndpointUrls == null) {
            this.ingestEndpointUrls = null;
            return;
        }

        this.ingestEndpointUrls = new java.util.ArrayList<String>(ingestEndpointUrls);
    }

    /**
     * <p>
     * The ingestion endpoints for the pipeline, which you can send data to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngestEndpointUrls(java.util.Collection)} or {@link #withIngestEndpointUrls(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ingestEndpointUrls
     *        The ingestion endpoints for the pipeline, which you can send data to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withIngestEndpointUrls(String... ingestEndpointUrls) {
        if (this.ingestEndpointUrls == null) {
            setIngestEndpointUrls(new java.util.ArrayList<String>(ingestEndpointUrls.length));
        }
        for (String ele : ingestEndpointUrls) {
            this.ingestEndpointUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ingestion endpoints for the pipeline, which you can send data to.
     * </p>
     * 
     * @param ingestEndpointUrls
     *        The ingestion endpoints for the pipeline, which you can send data to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withIngestEndpointUrls(java.util.Collection<String> ingestEndpointUrls) {
        setIngestEndpointUrls(ingestEndpointUrls);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that represent log publishing settings.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs that represent log publishing settings.
     */

    public void setLogPublishingOptions(LogPublishingOptions logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs that represent log publishing settings.
     * </p>
     * 
     * @return Key-value pairs that represent log publishing settings.
     */

    public LogPublishingOptions getLogPublishingOptions() {
        return this.logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs that represent log publishing settings.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs that represent log publishing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withLogPublishingOptions(LogPublishingOptions logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * The VPC interface endpoints that have access to the pipeline.
     * </p>
     * 
     * @return The VPC interface endpoints that have access to the pipeline.
     */

    public java.util.List<VpcEndpoint> getVpcEndpoints() {
        return vpcEndpoints;
    }

    /**
     * <p>
     * The VPC interface endpoints that have access to the pipeline.
     * </p>
     * 
     * @param vpcEndpoints
     *        The VPC interface endpoints that have access to the pipeline.
     */

    public void setVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        if (vpcEndpoints == null) {
            this.vpcEndpoints = null;
            return;
        }

        this.vpcEndpoints = new java.util.ArrayList<VpcEndpoint>(vpcEndpoints);
    }

    /**
     * <p>
     * The VPC interface endpoints that have access to the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpoints(java.util.Collection)} or {@link #withVpcEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcEndpoints
     *        The VPC interface endpoints that have access to the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withVpcEndpoints(VpcEndpoint... vpcEndpoints) {
        if (this.vpcEndpoints == null) {
            setVpcEndpoints(new java.util.ArrayList<VpcEndpoint>(vpcEndpoints.length));
        }
        for (VpcEndpoint ele : vpcEndpoints) {
            this.vpcEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The VPC interface endpoints that have access to the pipeline.
     * </p>
     * 
     * @param vpcEndpoints
     *        The VPC interface endpoints that have access to the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Pipeline withVpcEndpoints(java.util.Collection<VpcEndpoint> vpcEndpoints) {
        setVpcEndpoints(vpcEndpoints);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineArn() != null)
            sb.append("PipelineArn: ").append(getPipelineArn()).append(",");
        if (getMinUnits() != null)
            sb.append("MinUnits: ").append(getMinUnits()).append(",");
        if (getMaxUnits() != null)
            sb.append("MaxUnits: ").append(getMaxUnits()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getPipelineConfigurationBody() != null)
            sb.append("PipelineConfigurationBody: ").append(getPipelineConfigurationBody()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getIngestEndpointUrls() != null)
            sb.append("IngestEndpointUrls: ").append(getIngestEndpointUrls()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getVpcEndpoints() != null)
            sb.append("VpcEndpoints: ").append(getVpcEndpoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pipeline == false)
            return false;
        Pipeline other = (Pipeline) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineArn() == null ^ this.getPipelineArn() == null)
            return false;
        if (other.getPipelineArn() != null && other.getPipelineArn().equals(this.getPipelineArn()) == false)
            return false;
        if (other.getMinUnits() == null ^ this.getMinUnits() == null)
            return false;
        if (other.getMinUnits() != null && other.getMinUnits().equals(this.getMinUnits()) == false)
            return false;
        if (other.getMaxUnits() == null ^ this.getMaxUnits() == null)
            return false;
        if (other.getMaxUnits() != null && other.getMaxUnits().equals(this.getMaxUnits()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getPipelineConfigurationBody() == null ^ this.getPipelineConfigurationBody() == null)
            return false;
        if (other.getPipelineConfigurationBody() != null && other.getPipelineConfigurationBody().equals(this.getPipelineConfigurationBody()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getIngestEndpointUrls() == null ^ this.getIngestEndpointUrls() == null)
            return false;
        if (other.getIngestEndpointUrls() != null && other.getIngestEndpointUrls().equals(this.getIngestEndpointUrls()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getVpcEndpoints() == null ^ this.getVpcEndpoints() == null)
            return false;
        if (other.getVpcEndpoints() != null && other.getVpcEndpoints().equals(this.getVpcEndpoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineArn() == null) ? 0 : getPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getMinUnits() == null) ? 0 : getMinUnits().hashCode());
        hashCode = prime * hashCode + ((getMaxUnits() == null) ? 0 : getMaxUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getPipelineConfigurationBody() == null) ? 0 : getPipelineConfigurationBody().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getIngestEndpointUrls() == null) ? 0 : getIngestEndpointUrls().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpoints() == null) ? 0 : getVpcEndpoints().hashCode());
        return hashCode;
    }

    @Override
    public Pipeline clone() {
        try {
            return (Pipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.PipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
