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
 * Container for information about an OpenSearch Ingestion blueprint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/PipelineBlueprint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineBlueprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String blueprintName;
    /**
     * <p>
     * The YAML configuration of the blueprint.
     * </p>
     */
    private String pipelineConfigurationBody;

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     */

    public void setBlueprintName(String blueprintName) {
        this.blueprintName = blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getBlueprintName() {
        return this.blueprintName;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param blueprintName
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprint withBlueprintName(String blueprintName) {
        setBlueprintName(blueprintName);
        return this;
    }

    /**
     * <p>
     * The YAML configuration of the blueprint.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The YAML configuration of the blueprint.
     */

    public void setPipelineConfigurationBody(String pipelineConfigurationBody) {
        this.pipelineConfigurationBody = pipelineConfigurationBody;
    }

    /**
     * <p>
     * The YAML configuration of the blueprint.
     * </p>
     * 
     * @return The YAML configuration of the blueprint.
     */

    public String getPipelineConfigurationBody() {
        return this.pipelineConfigurationBody;
    }

    /**
     * <p>
     * The YAML configuration of the blueprint.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The YAML configuration of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineBlueprint withPipelineConfigurationBody(String pipelineConfigurationBody) {
        setPipelineConfigurationBody(pipelineConfigurationBody);
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
        if (getBlueprintName() != null)
            sb.append("BlueprintName: ").append(getBlueprintName()).append(",");
        if (getPipelineConfigurationBody() != null)
            sb.append("PipelineConfigurationBody: ").append(getPipelineConfigurationBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineBlueprint == false)
            return false;
        PipelineBlueprint other = (PipelineBlueprint) obj;
        if (other.getBlueprintName() == null ^ this.getBlueprintName() == null)
            return false;
        if (other.getBlueprintName() != null && other.getBlueprintName().equals(this.getBlueprintName()) == false)
            return false;
        if (other.getPipelineConfigurationBody() == null ^ this.getPipelineConfigurationBody() == null)
            return false;
        if (other.getPipelineConfigurationBody() != null && other.getPipelineConfigurationBody().equals(this.getPipelineConfigurationBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintName() == null) ? 0 : getBlueprintName().hashCode());
        hashCode = prime * hashCode + ((getPipelineConfigurationBody() == null) ? 0 : getPipelineConfigurationBody().hashCode());
        return hashCode;
    }

    @Override
    public PipelineBlueprint clone() {
        try {
            return (PipelineBlueprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.osis.model.transform.PipelineBlueprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
