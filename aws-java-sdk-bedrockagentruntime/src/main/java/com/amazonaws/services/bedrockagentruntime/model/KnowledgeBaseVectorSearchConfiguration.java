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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configurations for how to carry out the search.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/KnowledgeBaseVectorSearchConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBaseVectorSearchConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of results to return.
     * </p>
     * <note>
     * <p>
     * The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>. Don't
     * include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     * </p>
     * </note>
     */
    private Integer numberOfResults;
    /**
     * <p>
     * By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch Serverless
     * vector store that contains a filterable text field, you can specify whether to query the knowledge base with a
     * <code>HYBRID</code> search using both vector embeddings and raw text, or <code>SEMANTIC</code> search using only
     * vector embeddings. For other vector store configurations, only <code>SEMANTIC</code> search is available. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge base</a>.
     * </p>
     */
    private String overrideSearchType;

    /**
     * <p>
     * The number of results to return.
     * </p>
     * <note>
     * <p>
     * The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>. Don't
     * include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     * </p>
     * </note>
     * 
     * @param numberOfResults
     *        The number of results to return.</p> <note>
     *        <p>
     *        The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>.
     *        Don't include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     *        </p>
     */

    public void setNumberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    /**
     * <p>
     * The number of results to return.
     * </p>
     * <note>
     * <p>
     * The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>. Don't
     * include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     * </p>
     * </note>
     * 
     * @return The number of results to return.</p> <note>
     *         <p>
     *         The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>.
     *         Don't include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     *         </p>
     */

    public Integer getNumberOfResults() {
        return this.numberOfResults;
    }

    /**
     * <p>
     * The number of results to return.
     * </p>
     * <note>
     * <p>
     * The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>. Don't
     * include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     * </p>
     * </note>
     * 
     * @param numberOfResults
     *        The number of results to return.</p> <note>
     *        <p>
     *        The <code>numberOfResults</code> field is currently unsupported for <code>RetrieveAndGenerate</code>.
     *        Don't include it in this field if you are sending a <code>RetrieveAndGenerate</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBaseVectorSearchConfiguration withNumberOfResults(Integer numberOfResults) {
        setNumberOfResults(numberOfResults);
        return this;
    }

    /**
     * <p>
     * By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch Serverless
     * vector store that contains a filterable text field, you can specify whether to query the knowledge base with a
     * <code>HYBRID</code> search using both vector embeddings and raw text, or <code>SEMANTIC</code> search using only
     * vector embeddings. For other vector store configurations, only <code>SEMANTIC</code> search is available. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge base</a>.
     * </p>
     * 
     * @param overrideSearchType
     *        By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch
     *        Serverless vector store that contains a filterable text field, you can specify whether to query the
     *        knowledge base with a <code>HYBRID</code> search using both vector embeddings and raw text, or
     *        <code>SEMANTIC</code> search using only vector embeddings. For other vector store configurations, only
     *        <code>SEMANTIC</code> search is available. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge
     *        base</a>.
     * @see SearchType
     */

    public void setOverrideSearchType(String overrideSearchType) {
        this.overrideSearchType = overrideSearchType;
    }

    /**
     * <p>
     * By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch Serverless
     * vector store that contains a filterable text field, you can specify whether to query the knowledge base with a
     * <code>HYBRID</code> search using both vector embeddings and raw text, or <code>SEMANTIC</code> search using only
     * vector embeddings. For other vector store configurations, only <code>SEMANTIC</code> search is available. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge base</a>.
     * </p>
     * 
     * @return By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch
     *         Serverless vector store that contains a filterable text field, you can specify whether to query the
     *         knowledge base with a <code>HYBRID</code> search using both vector embeddings and raw text, or
     *         <code>SEMANTIC</code> search using only vector embeddings. For other vector store configurations, only
     *         <code>SEMANTIC</code> search is available. For more information, see <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge
     *         base</a>.
     * @see SearchType
     */

    public String getOverrideSearchType() {
        return this.overrideSearchType;
    }

    /**
     * <p>
     * By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch Serverless
     * vector store that contains a filterable text field, you can specify whether to query the knowledge base with a
     * <code>HYBRID</code> search using both vector embeddings and raw text, or <code>SEMANTIC</code> search using only
     * vector embeddings. For other vector store configurations, only <code>SEMANTIC</code> search is available. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge base</a>.
     * </p>
     * 
     * @param overrideSearchType
     *        By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch
     *        Serverless vector store that contains a filterable text field, you can specify whether to query the
     *        knowledge base with a <code>HYBRID</code> search using both vector embeddings and raw text, or
     *        <code>SEMANTIC</code> search using only vector embeddings. For other vector store configurations, only
     *        <code>SEMANTIC</code> search is available. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge
     *        base</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchType
     */

    public KnowledgeBaseVectorSearchConfiguration withOverrideSearchType(String overrideSearchType) {
        setOverrideSearchType(overrideSearchType);
        return this;
    }

    /**
     * <p>
     * By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch Serverless
     * vector store that contains a filterable text field, you can specify whether to query the knowledge base with a
     * <code>HYBRID</code> search using both vector embeddings and raw text, or <code>SEMANTIC</code> search using only
     * vector embeddings. For other vector store configurations, only <code>SEMANTIC</code> search is available. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge base</a>.
     * </p>
     * 
     * @param overrideSearchType
     *        By default, Amazon Bedrock decides a search strategy for you. If you're using an Amazon OpenSearch
     *        Serverless vector store that contains a filterable text field, you can specify whether to query the
     *        knowledge base with a <code>HYBRID</code> search using both vector embeddings and raw text, or
     *        <code>SEMANTIC</code> search using only vector embeddings. For other vector store configurations, only
     *        <code>SEMANTIC</code> search is available. For more information, see <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base-test.html">Test a knowledge
     *        base</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchType
     */

    public KnowledgeBaseVectorSearchConfiguration withOverrideSearchType(SearchType overrideSearchType) {
        this.overrideSearchType = overrideSearchType.toString();
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
        if (getNumberOfResults() != null)
            sb.append("NumberOfResults: ").append(getNumberOfResults()).append(",");
        if (getOverrideSearchType() != null)
            sb.append("OverrideSearchType: ").append(getOverrideSearchType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KnowledgeBaseVectorSearchConfiguration == false)
            return false;
        KnowledgeBaseVectorSearchConfiguration other = (KnowledgeBaseVectorSearchConfiguration) obj;
        if (other.getNumberOfResults() == null ^ this.getNumberOfResults() == null)
            return false;
        if (other.getNumberOfResults() != null && other.getNumberOfResults().equals(this.getNumberOfResults()) == false)
            return false;
        if (other.getOverrideSearchType() == null ^ this.getOverrideSearchType() == null)
            return false;
        if (other.getOverrideSearchType() != null && other.getOverrideSearchType().equals(this.getOverrideSearchType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfResults() == null) ? 0 : getNumberOfResults().hashCode());
        hashCode = prime * hashCode + ((getOverrideSearchType() == null) ? 0 : getOverrideSearchType().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBaseVectorSearchConfiguration clone() {
        try {
            return (KnowledgeBaseVectorSearchConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.KnowledgeBaseVectorSearchConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
