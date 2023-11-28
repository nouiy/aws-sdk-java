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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Text response part
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/TextResponsePart"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextResponsePart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Response part in text
     * </p>
     */
    private String text;

    private Span span;

    /**
     * <p>
     * Response part in text
     * </p>
     * 
     * @param text
     *        Response part in text
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Response part in text
     * </p>
     * 
     * @return Response part in text
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Response part in text
     * </p>
     * 
     * @param text
     *        Response part in text
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextResponsePart withText(String text) {
        setText(text);
        return this;
    }

    /**
     * @param span
     */

    public void setSpan(Span span) {
        this.span = span;
    }

    /**
     * @return
     */

    public Span getSpan() {
        return this.span;
    }

    /**
     * @param span
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextResponsePart withSpan(Span span) {
        setSpan(span);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getSpan() != null)
            sb.append("Span: ").append(getSpan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextResponsePart == false)
            return false;
        TextResponsePart other = (TextResponsePart) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getSpan() == null ^ this.getSpan() == null)
            return false;
        if (other.getSpan() != null && other.getSpan().equals(this.getSpan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getSpan() == null) ? 0 : getSpan().hashCode());
        return hashCode;
    }

    @Override
    public TextResponsePart clone() {
        try {
            return (TextResponsePart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.TextResponsePartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
