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
package com.amazonaws.services.bedrockruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A document to include in a message when sending a <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_Converse.html">Converse</a> or <a
 * href="https://docs.aws.amazon.com/bedrock/latest/APIReference/API_runtime_ConverseStream.html">ConverseStream</a>
 * request. You can include up to 5 documents in a request. The maximum document size is 50 MB.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-runtime-2023-09-30/DocumentBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The format of a document, or its extension.
     * </p>
     */
    private String format;
    /**
     * <p>
     * A name for the document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Contains the content of the document.
     * </p>
     */
    private DocumentSource source;

    /**
     * <p>
     * The format of a document, or its extension.
     * </p>
     * 
     * @param format
     *        The format of a document, or its extension.
     * @see DocumentFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of a document, or its extension.
     * </p>
     * 
     * @return The format of a document, or its extension.
     * @see DocumentFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of a document, or its extension.
     * </p>
     * 
     * @param format
     *        The format of a document, or its extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public DocumentBlock withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of a document, or its extension.
     * </p>
     * 
     * @param format
     *        The format of a document, or its extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentFormat
     */

    public DocumentBlock withFormat(DocumentFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * A name for the document.
     * </p>
     * 
     * @param name
     *        A name for the document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the document.
     * </p>
     * 
     * @return A name for the document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the document.
     * </p>
     * 
     * @param name
     *        A name for the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentBlock withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Contains the content of the document.
     * </p>
     * 
     * @param source
     *        Contains the content of the document.
     */

    public void setSource(DocumentSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Contains the content of the document.
     * </p>
     * 
     * @return Contains the content of the document.
     */

    public DocumentSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Contains the content of the document.
     * </p>
     * 
     * @param source
     *        Contains the content of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentBlock withSource(DocumentSource source) {
        setSource(source);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentBlock == false)
            return false;
        DocumentBlock other = (DocumentBlock) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public DocumentBlock clone() {
        try {
            return (DocumentBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockruntime.model.transform.DocumentBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
