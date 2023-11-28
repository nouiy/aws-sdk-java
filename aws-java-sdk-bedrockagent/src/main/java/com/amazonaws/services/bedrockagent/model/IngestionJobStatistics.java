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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The document level statistics of an ingestion job
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/IngestionJobStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionJobStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of scanned documents
     * </p>
     */
    private Long numberOfDocumentsScanned;
    /**
     * <p>
     * Number of indexed documents
     * </p>
     */
    private Long numberOfNewDocumentsIndexed;
    /**
     * <p>
     * Number of modified documents indexed
     * </p>
     */
    private Long numberOfModifiedDocumentsIndexed;
    /**
     * <p>
     * Number of deleted documents
     * </p>
     */
    private Long numberOfDocumentsDeleted;
    /**
     * <p>
     * Number of failed documents
     * </p>
     */
    private Long numberOfDocumentsFailed;

    /**
     * <p>
     * Number of scanned documents
     * </p>
     * 
     * @param numberOfDocumentsScanned
     *        Number of scanned documents
     */

    public void setNumberOfDocumentsScanned(Long numberOfDocumentsScanned) {
        this.numberOfDocumentsScanned = numberOfDocumentsScanned;
    }

    /**
     * <p>
     * Number of scanned documents
     * </p>
     * 
     * @return Number of scanned documents
     */

    public Long getNumberOfDocumentsScanned() {
        return this.numberOfDocumentsScanned;
    }

    /**
     * <p>
     * Number of scanned documents
     * </p>
     * 
     * @param numberOfDocumentsScanned
     *        Number of scanned documents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsScanned(Long numberOfDocumentsScanned) {
        setNumberOfDocumentsScanned(numberOfDocumentsScanned);
        return this;
    }

    /**
     * <p>
     * Number of indexed documents
     * </p>
     * 
     * @param numberOfNewDocumentsIndexed
     *        Number of indexed documents
     */

    public void setNumberOfNewDocumentsIndexed(Long numberOfNewDocumentsIndexed) {
        this.numberOfNewDocumentsIndexed = numberOfNewDocumentsIndexed;
    }

    /**
     * <p>
     * Number of indexed documents
     * </p>
     * 
     * @return Number of indexed documents
     */

    public Long getNumberOfNewDocumentsIndexed() {
        return this.numberOfNewDocumentsIndexed;
    }

    /**
     * <p>
     * Number of indexed documents
     * </p>
     * 
     * @param numberOfNewDocumentsIndexed
     *        Number of indexed documents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfNewDocumentsIndexed(Long numberOfNewDocumentsIndexed) {
        setNumberOfNewDocumentsIndexed(numberOfNewDocumentsIndexed);
        return this;
    }

    /**
     * <p>
     * Number of modified documents indexed
     * </p>
     * 
     * @param numberOfModifiedDocumentsIndexed
     *        Number of modified documents indexed
     */

    public void setNumberOfModifiedDocumentsIndexed(Long numberOfModifiedDocumentsIndexed) {
        this.numberOfModifiedDocumentsIndexed = numberOfModifiedDocumentsIndexed;
    }

    /**
     * <p>
     * Number of modified documents indexed
     * </p>
     * 
     * @return Number of modified documents indexed
     */

    public Long getNumberOfModifiedDocumentsIndexed() {
        return this.numberOfModifiedDocumentsIndexed;
    }

    /**
     * <p>
     * Number of modified documents indexed
     * </p>
     * 
     * @param numberOfModifiedDocumentsIndexed
     *        Number of modified documents indexed
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfModifiedDocumentsIndexed(Long numberOfModifiedDocumentsIndexed) {
        setNumberOfModifiedDocumentsIndexed(numberOfModifiedDocumentsIndexed);
        return this;
    }

    /**
     * <p>
     * Number of deleted documents
     * </p>
     * 
     * @param numberOfDocumentsDeleted
     *        Number of deleted documents
     */

    public void setNumberOfDocumentsDeleted(Long numberOfDocumentsDeleted) {
        this.numberOfDocumentsDeleted = numberOfDocumentsDeleted;
    }

    /**
     * <p>
     * Number of deleted documents
     * </p>
     * 
     * @return Number of deleted documents
     */

    public Long getNumberOfDocumentsDeleted() {
        return this.numberOfDocumentsDeleted;
    }

    /**
     * <p>
     * Number of deleted documents
     * </p>
     * 
     * @param numberOfDocumentsDeleted
     *        Number of deleted documents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsDeleted(Long numberOfDocumentsDeleted) {
        setNumberOfDocumentsDeleted(numberOfDocumentsDeleted);
        return this;
    }

    /**
     * <p>
     * Number of failed documents
     * </p>
     * 
     * @param numberOfDocumentsFailed
     *        Number of failed documents
     */

    public void setNumberOfDocumentsFailed(Long numberOfDocumentsFailed) {
        this.numberOfDocumentsFailed = numberOfDocumentsFailed;
    }

    /**
     * <p>
     * Number of failed documents
     * </p>
     * 
     * @return Number of failed documents
     */

    public Long getNumberOfDocumentsFailed() {
        return this.numberOfDocumentsFailed;
    }

    /**
     * <p>
     * Number of failed documents
     * </p>
     * 
     * @param numberOfDocumentsFailed
     *        Number of failed documents
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobStatistics withNumberOfDocumentsFailed(Long numberOfDocumentsFailed) {
        setNumberOfDocumentsFailed(numberOfDocumentsFailed);
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
        if (getNumberOfDocumentsScanned() != null)
            sb.append("NumberOfDocumentsScanned: ").append(getNumberOfDocumentsScanned()).append(",");
        if (getNumberOfNewDocumentsIndexed() != null)
            sb.append("NumberOfNewDocumentsIndexed: ").append(getNumberOfNewDocumentsIndexed()).append(",");
        if (getNumberOfModifiedDocumentsIndexed() != null)
            sb.append("NumberOfModifiedDocumentsIndexed: ").append(getNumberOfModifiedDocumentsIndexed()).append(",");
        if (getNumberOfDocumentsDeleted() != null)
            sb.append("NumberOfDocumentsDeleted: ").append(getNumberOfDocumentsDeleted()).append(",");
        if (getNumberOfDocumentsFailed() != null)
            sb.append("NumberOfDocumentsFailed: ").append(getNumberOfDocumentsFailed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionJobStatistics == false)
            return false;
        IngestionJobStatistics other = (IngestionJobStatistics) obj;
        if (other.getNumberOfDocumentsScanned() == null ^ this.getNumberOfDocumentsScanned() == null)
            return false;
        if (other.getNumberOfDocumentsScanned() != null && other.getNumberOfDocumentsScanned().equals(this.getNumberOfDocumentsScanned()) == false)
            return false;
        if (other.getNumberOfNewDocumentsIndexed() == null ^ this.getNumberOfNewDocumentsIndexed() == null)
            return false;
        if (other.getNumberOfNewDocumentsIndexed() != null && other.getNumberOfNewDocumentsIndexed().equals(this.getNumberOfNewDocumentsIndexed()) == false)
            return false;
        if (other.getNumberOfModifiedDocumentsIndexed() == null ^ this.getNumberOfModifiedDocumentsIndexed() == null)
            return false;
        if (other.getNumberOfModifiedDocumentsIndexed() != null
                && other.getNumberOfModifiedDocumentsIndexed().equals(this.getNumberOfModifiedDocumentsIndexed()) == false)
            return false;
        if (other.getNumberOfDocumentsDeleted() == null ^ this.getNumberOfDocumentsDeleted() == null)
            return false;
        if (other.getNumberOfDocumentsDeleted() != null && other.getNumberOfDocumentsDeleted().equals(this.getNumberOfDocumentsDeleted()) == false)
            return false;
        if (other.getNumberOfDocumentsFailed() == null ^ this.getNumberOfDocumentsFailed() == null)
            return false;
        if (other.getNumberOfDocumentsFailed() != null && other.getNumberOfDocumentsFailed().equals(this.getNumberOfDocumentsFailed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfDocumentsScanned() == null) ? 0 : getNumberOfDocumentsScanned().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNewDocumentsIndexed() == null) ? 0 : getNumberOfNewDocumentsIndexed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfModifiedDocumentsIndexed() == null) ? 0 : getNumberOfModifiedDocumentsIndexed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDocumentsDeleted() == null) ? 0 : getNumberOfDocumentsDeleted().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDocumentsFailed() == null) ? 0 : getNumberOfDocumentsFailed().hashCode());
        return hashCode;
    }

    @Override
    public IngestionJobStatistics clone() {
        try {
            return (IngestionJobStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.IngestionJobStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
