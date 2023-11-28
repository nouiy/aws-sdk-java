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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKnowledgeBaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientToken;

    private String name;

    private String description;

    private String roleArn;

    private KnowledgeBaseConfiguration knowledgeBaseConfiguration;

    private StorageConfiguration storageConfiguration;

    private java.util.Map<String, String> tags;

    /**
     * @param clientToken
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * @return
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @param clientToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withName(String name) {
        setName(name);
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

    public CreateKnowledgeBaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param roleArn
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * @return
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @param roleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param knowledgeBaseConfiguration
     */

    public void setKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        this.knowledgeBaseConfiguration = knowledgeBaseConfiguration;
    }

    /**
     * @return
     */

    public KnowledgeBaseConfiguration getKnowledgeBaseConfiguration() {
        return this.knowledgeBaseConfiguration;
    }

    /**
     * @param knowledgeBaseConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        setKnowledgeBaseConfiguration(knowledgeBaseConfiguration);
        return this;
    }

    /**
     * @param storageConfiguration
     */

    public void setStorageConfiguration(StorageConfiguration storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * @return
     */

    public StorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * @param storageConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withStorageConfiguration(StorageConfiguration storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKnowledgeBaseRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKnowledgeBaseConfiguration() != null)
            sb.append("KnowledgeBaseConfiguration: ").append(getKnowledgeBaseConfiguration()).append(",");
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKnowledgeBaseRequest == false)
            return false;
        CreateKnowledgeBaseRequest other = (CreateKnowledgeBaseRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKnowledgeBaseConfiguration() == null ^ this.getKnowledgeBaseConfiguration() == null)
            return false;
        if (other.getKnowledgeBaseConfiguration() != null && other.getKnowledgeBaseConfiguration().equals(this.getKnowledgeBaseConfiguration()) == false)
            return false;
        if (other.getStorageConfiguration() == null ^ this.getStorageConfiguration() == null)
            return false;
        if (other.getStorageConfiguration() != null && other.getStorageConfiguration().equals(this.getStorageConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseConfiguration() == null) ? 0 : getKnowledgeBaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKnowledgeBaseRequest clone() {
        return (CreateKnowledgeBaseRequest) super.clone();
    }

}
