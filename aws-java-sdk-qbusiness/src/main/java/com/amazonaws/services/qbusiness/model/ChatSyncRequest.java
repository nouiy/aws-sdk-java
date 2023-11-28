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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q application linked to the Amazon Q conversation.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * </p>
     */
    private java.util.List<AttachmentInput> attachments;
    /**
     * <p>
     * Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     * </p>
     */
    private AttributeFilter attributeFilter;
    /**
     * <p>
     * A token that you provide to identify a chat request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the Amazon Q conversation.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The identifier of the previous end user text input message in a conversation.
     * </p>
     */
    private String parentMessageId;
    /**
     * <p>
     * The groups that a user associated with the chat input belongs to.
     * </p>
     */
    private java.util.List<String> userGroups;
    /**
     * <p>
     * The identifier of the user attached to the chat input.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * A end user message in a conversation.
     * </p>
     */
    private String userMessage;

    /**
     * <p>
     * The identifier of the Amazon Q application linked to the Amazon Q conversation.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q application linked to the Amazon Q conversation.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q application linked to the Amazon Q conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q application linked to the Amazon Q conversation.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q application linked to the Amazon Q conversation.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q application linked to the Amazon Q conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * </p>
     * 
     * @return A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     */

    public java.util.List<AttachmentInput> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * </p>
     * 
     * @param attachments
     *        A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     */

    public void setAttachments(java.util.Collection<AttachmentInput> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AttachmentInput>(attachments);
    }

    /**
     * <p>
     * A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withAttachments(AttachmentInput... attachments) {
        if (this.attachments == null) {
            setAttachments(new java.util.ArrayList<AttachmentInput>(attachments.length));
        }
        for (AttachmentInput ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * </p>
     * 
     * @param attachments
     *        A list of files uploaded directly during chat. You can upload a maximum of 5 files of upto 10 MB each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withAttachments(java.util.Collection<AttachmentInput> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     */

    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     * </p>
     * 
     * @return Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     */

    public AttributeFilter getAttributeFilter() {
        return this.attributeFilter;
    }

    /**
     * <p>
     * Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtering of Amazon Q web experience responses based on document attributes or metadata fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withAttributeFilter(AttributeFilter attributeFilter) {
        setAttributeFilter(attributeFilter);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify a chat request.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify a chat request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify a chat request.
     * </p>
     * 
     * @return A token that you provide to identify a chat request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify a chat request.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify a chat request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q conversation.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q conversation.
     * </p>
     * 
     * @return The identifier of the Amazon Q conversation.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q conversation.
     * </p>
     * 
     * @param conversationId
     *        The identifier of the Amazon Q conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the previous end user text input message in a conversation.
     * </p>
     * 
     * @param parentMessageId
     *        The identifier of the previous end user text input message in a conversation.
     */

    public void setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    /**
     * <p>
     * The identifier of the previous end user text input message in a conversation.
     * </p>
     * 
     * @return The identifier of the previous end user text input message in a conversation.
     */

    public String getParentMessageId() {
        return this.parentMessageId;
    }

    /**
     * <p>
     * The identifier of the previous end user text input message in a conversation.
     * </p>
     * 
     * @param parentMessageId
     *        The identifier of the previous end user text input message in a conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withParentMessageId(String parentMessageId) {
        setParentMessageId(parentMessageId);
        return this;
    }

    /**
     * <p>
     * The groups that a user associated with the chat input belongs to.
     * </p>
     * 
     * @return The groups that a user associated with the chat input belongs to.
     */

    public java.util.List<String> getUserGroups() {
        return userGroups;
    }

    /**
     * <p>
     * The groups that a user associated with the chat input belongs to.
     * </p>
     * 
     * @param userGroups
     *        The groups that a user associated with the chat input belongs to.
     */

    public void setUserGroups(java.util.Collection<String> userGroups) {
        if (userGroups == null) {
            this.userGroups = null;
            return;
        }

        this.userGroups = new java.util.ArrayList<String>(userGroups);
    }

    /**
     * <p>
     * The groups that a user associated with the chat input belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserGroups(java.util.Collection)} or {@link #withUserGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param userGroups
     *        The groups that a user associated with the chat input belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withUserGroups(String... userGroups) {
        if (this.userGroups == null) {
            setUserGroups(new java.util.ArrayList<String>(userGroups.length));
        }
        for (String ele : userGroups) {
            this.userGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that a user associated with the chat input belongs to.
     * </p>
     * 
     * @param userGroups
     *        The groups that a user associated with the chat input belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withUserGroups(java.util.Collection<String> userGroups) {
        setUserGroups(userGroups);
        return this;
    }

    /**
     * <p>
     * The identifier of the user attached to the chat input.
     * </p>
     * 
     * @param userId
     *        The identifier of the user attached to the chat input.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier of the user attached to the chat input.
     * </p>
     * 
     * @return The identifier of the user attached to the chat input.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier of the user attached to the chat input.
     * </p>
     * 
     * @param userId
     *        The identifier of the user attached to the chat input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * A end user message in a conversation.
     * </p>
     * 
     * @param userMessage
     *        A end user message in a conversation.
     */

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }

    /**
     * <p>
     * A end user message in a conversation.
     * </p>
     * 
     * @return A end user message in a conversation.
     */

    public String getUserMessage() {
        return this.userMessage;
    }

    /**
     * <p>
     * A end user message in a conversation.
     * </p>
     * 
     * @param userMessage
     *        A end user message in a conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatSyncRequest withUserMessage(String userMessage) {
        setUserMessage(userMessage);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getAttributeFilter() != null)
            sb.append("AttributeFilter: ").append(getAttributeFilter()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getParentMessageId() != null)
            sb.append("ParentMessageId: ").append(getParentMessageId()).append(",");
        if (getUserGroups() != null)
            sb.append("UserGroups: ").append(getUserGroups()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getUserMessage() != null)
            sb.append("UserMessage: ").append(getUserMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatSyncRequest == false)
            return false;
        ChatSyncRequest other = (ChatSyncRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAttributeFilter() == null ^ this.getAttributeFilter() == null)
            return false;
        if (other.getAttributeFilter() != null && other.getAttributeFilter().equals(this.getAttributeFilter()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getParentMessageId() == null ^ this.getParentMessageId() == null)
            return false;
        if (other.getParentMessageId() != null && other.getParentMessageId().equals(this.getParentMessageId()) == false)
            return false;
        if (other.getUserGroups() == null ^ this.getUserGroups() == null)
            return false;
        if (other.getUserGroups() != null && other.getUserGroups().equals(this.getUserGroups()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserMessage() == null ^ this.getUserMessage() == null)
            return false;
        if (other.getUserMessage() != null && other.getUserMessage().equals(this.getUserMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getAttributeFilter() == null) ? 0 : getAttributeFilter().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getParentMessageId() == null) ? 0 : getParentMessageId().hashCode());
        hashCode = prime * hashCode + ((getUserGroups() == null) ? 0 : getUserGroups().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserMessage() == null) ? 0 : getUserMessage().hashCode());
        return hashCode;
    }

    @Override
    public ChatSyncRequest clone() {
        return (ChatSyncRequest) super.clone();
    }

}
