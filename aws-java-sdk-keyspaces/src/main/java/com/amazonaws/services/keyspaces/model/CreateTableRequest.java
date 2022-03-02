/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/CreateTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     */
    private String keyspaceName;
    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>name</code> </i> - The name of the column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     */
    private SchemaDefinition schemaDefinition;
    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     */
    private Comment comment;
    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires <code>readCapacityUnits</code>
     * and <code>writeCapacityUnits</code> as inputs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private CapacitySpecification capacitySpecification;
    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     * </pre>
     */
    private EncryptionSpecification encryptionSpecification;
    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private PointInTimeRecovery pointInTimeRecovery;
    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status:enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status:disabled</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private TimeToLive ttl;
    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private Integer defaultTimeToLive;
    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is going to be created in.
     */

    public void setKeyspaceName(String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @return The name of the keyspace that the table is going to be created in.
     */

    public String getKeyspaceName() {
        return this.keyspaceName;
    }

    /**
     * <p>
     * The name of the keyspace that the table is going to be created in.
     * </p>
     * 
     * @param keyspaceName
     *        The name of the keyspace that the table is going to be created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withKeyspaceName(String keyspaceName) {
        setKeyspaceName(keyspaceName);
        return this;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>name</code> </i> - The name of the column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param schemaDefinition
     *        The <code>schemaDefinition</code> consists of the following parameters.</p>
     *        <p>
     *        For each column to be created:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>name</code> </i> - The name of the column.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     * 
     * <pre><code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public void setSchemaDefinition(SchemaDefinition schemaDefinition) {
        this.schemaDefinition = schemaDefinition;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>name</code> </i> - The name of the column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @return The <code>schemaDefinition</code> consists of the following parameters.</p>
     *         <p>
     *         For each column to be created:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i> <code>name</code> </i> - The name of the column.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *         types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     * 
     * <pre><code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     */

    public SchemaDefinition getSchemaDefinition() {
        return this.schemaDefinition;
    }

    /**
     * <p>
     * The <code>schemaDefinition</code> consists of the following parameters.
     * </p>
     * <p>
     * For each column to be created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>name</code> </i> - The name of the column.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data types</a> in
     * the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param schemaDefinition
     *        The <code>schemaDefinition</code> consists of the following parameters.</p>
     *        <p>
     *        For each column to be created:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>name</code> </i> - The name of the column.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code> <i>type</i> </code> - An Amazon Keyspaces data type. For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types">Data
     *        types</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     * 
     *        <pre>
     * <code> &lt;p&gt;The primary key of the table consists of the following columns:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;partitionKeys&lt;/code&gt; - The partition key can be a single column, or it can be a compound value composed of two or more columns. The partition key portion of the primary key is required and determines how Amazon Keyspaces stores your data.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of each partition key column.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;clusteringKeys&lt;/code&gt; - The optional clustering column portion of your primary key determines how the data is clustered and sorted within each partition.&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the clustering column. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;orderBy&lt;/code&gt; &lt;/i&gt; - Sets the ascendant (&lt;code&gt;ASC&lt;/code&gt;) or descendant (&lt;code&gt;DESC&lt;/code&gt;) order modifier.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;To define a column as static use &lt;code&gt; &lt;i&gt;staticColumns&lt;/i&gt; &lt;/code&gt; - Static columns store values that are shared by all rows in the same partition:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;i&gt; &lt;code&gt;name&lt;/code&gt; &lt;/i&gt; - The name of the column.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt; &lt;i&gt;type&lt;/i&gt; &lt;/code&gt; - An Amazon Keyspaces data type.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withSchemaDefinition(SchemaDefinition schemaDefinition) {
        setSchemaDefinition(schemaDefinition);
        return this;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @param comment
     *        This parameter allows to enter a description of the table.
     */

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @return This parameter allows to enter a description of the table.
     */

    public Comment getComment() {
        return this.comment;
    }

    /**
     * <p>
     * This parameter allows to enter a description of the table.
     * </p>
     * 
     * @param comment
     *        This parameter allows to enter a description of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withComment(Comment comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires <code>readCapacityUnits</code>
     * and <code>writeCapacityUnits</code> as inputs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecification
     *        Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as inputs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setCapacitySpecification(CapacitySpecification capacitySpecification) {
        this.capacitySpecification = capacitySpecification;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires <code>readCapacityUnits</code>
     * and <code>writeCapacityUnits</code> as inputs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>throughputMode:PAY_PER_REQUEST</code> and
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires
     *         <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as inputs.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *         capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public CapacitySpecification getCapacitySpecification() {
        return this.capacitySpecification;
    }

    /**
     * <p>
     * Specifies the read/write throughput capacity mode for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>throughputMode:PAY_PER_REQUEST</code> and
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires <code>readCapacityUnits</code>
     * and <code>writeCapacityUnits</code> as inputs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write capacity
     * modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param capacitySpecification
     *        Specifies the read/write throughput capacity mode for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>throughputMode:PAY_PER_REQUEST</code> and
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>throughputMode:PROVISIONED</code>. The provisioned capacity mode requires
     *        <code>readCapacityUnits</code> and <code>writeCapacityUnits</code> as inputs.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>throughput_mode:PAY_PER_REQUEST</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html">Read/write
     *        capacity modes</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withCapacitySpecification(CapacitySpecification capacitySpecification) {
        setCapacitySpecification(capacitySpecification);
        return this;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param encryptionSpecification
     *        Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *        the following KMS key (KMS key):</p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     */

    public void setEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        this.encryptionSpecification = encryptionSpecification;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @return Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *         the following KMS key (KMS key):</p>
     * 
     * <pre><code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     */

    public EncryptionSpecification getEncryptionSpecification() {
        return this.encryptionSpecification;
    }

    /**
     * <p>
     * Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of the
     * following KMS key (KMS key):
     * </p>
     * 
     * <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param encryptionSpecification
     *        Specifies how the encryption key for encryption at rest is managed for the table. You can choose one of
     *        the following KMS key (KMS key):</p>
     * 
     *        <pre>
     * <code> &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt; - This key is owned by Amazon Keyspaces. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;type:CUSTOMER_MANAGED_KMS_KEY&lt;/code&gt; - This key is stored in your account and is created, owned, and managed by you. This option requires the &lt;code&gt;kms_key_identifier&lt;/code&gt; of the KMS key in Amazon Resource Name (ARN) format as input. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;The default is &lt;code&gt;type:AWS_OWNED_KMS_KEY&lt;/code&gt;. &lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html&quot;&gt;Encryption at rest&lt;/a&gt; in the &lt;i&gt;Amazon Keyspaces Developer Guide&lt;/i&gt;.&lt;/p&gt; </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withEncryptionSpecification(EncryptionSpecification encryptionSpecification) {
        setEncryptionSpecification(encryptionSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If it's not specified, the default is <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setPointInTimeRecovery(PointInTimeRecovery pointInTimeRecovery) {
        this.pointInTimeRecovery = pointInTimeRecovery;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If it's not specified, the default is <code>DISABLED</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *         recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public PointInTimeRecovery getPointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }

    /**
     * <p>
     * Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If it's not specified, the default is <code>DISABLED</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time recovery</a>
     * in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param pointInTimeRecovery
     *        Specifies if <code>pointInTimeRecovery</code> is enabled or disabled for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If it's not specified, the default is <code>DISABLED</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/PointInTimeRecovery.html">Point-in-time
     *        recovery</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withPointInTimeRecovery(PointInTimeRecovery pointInTimeRecovery) {
        setPointInTimeRecovery(pointInTimeRecovery);
        return this;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status:enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status:disabled</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param ttl
     *        Enables Time to Live custom settings for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status:enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status:disabled</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *        the table.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *        Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setTtl(TimeToLive ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status:enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status:disabled</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return Enables Time to Live custom settings for the table. The options are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>status:enabled</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status:disabled</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *         the table.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *         Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public TimeToLive getTtl() {
        return this.ttl;
    }

    /**
     * <p>
     * Enables Time to Live custom settings for the table. The options are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>status:enabled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status:disabled</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for the
     * table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data
     * by using Amazon Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param ttl
     *        Enables Time to Live custom settings for the table. The options are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>status:enabled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status:disabled</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default is <code>status:disabled</code>. After <code>ttl</code> is enabled, you can't disable it for
     *        the table.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL.html">Expiring data by using Amazon
     *        Keyspaces Time to Live (TTL)</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTtl(TimeToLive ttl) {
        setTtl(ttl);
        return this;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live setting in seconds for the table.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *        >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setDefaultTimeToLive(Integer defaultTimeToLive) {
        this.defaultTimeToLive = defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return The default Time to Live setting in seconds for the table.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *         >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public Integer getDefaultTimeToLive() {
        return this.defaultTimeToLive;
    }

    /**
     * <p>
     * The default Time to Live setting in seconds for the table.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     * >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param defaultTimeToLive
     *        The default Time to Live setting in seconds for the table.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl"
     *        >Setting the default TTL value for a table</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withDefaultTimeToLive(Integer defaultTimeToLive) {
        setDefaultTimeToLive(defaultTimeToLive);
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pair tags to be attached to the resource. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and
     *         labels to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pair tags to be attached to the resource.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels to
     * Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pair tags to be attached to the resource. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/tagging-keyspaces.html">Adding tags and labels
     *        to Amazon Keyspaces resources</a> in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTableRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyspaceName() != null)
            sb.append("KeyspaceName: ").append(getKeyspaceName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getSchemaDefinition() != null)
            sb.append("SchemaDefinition: ").append(getSchemaDefinition()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getCapacitySpecification() != null)
            sb.append("CapacitySpecification: ").append(getCapacitySpecification()).append(",");
        if (getEncryptionSpecification() != null)
            sb.append("EncryptionSpecification: ").append(getEncryptionSpecification()).append(",");
        if (getPointInTimeRecovery() != null)
            sb.append("PointInTimeRecovery: ").append(getPointInTimeRecovery()).append(",");
        if (getTtl() != null)
            sb.append("Ttl: ").append(getTtl()).append(",");
        if (getDefaultTimeToLive() != null)
            sb.append("DefaultTimeToLive: ").append(getDefaultTimeToLive()).append(",");
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

        if (obj instanceof CreateTableRequest == false)
            return false;
        CreateTableRequest other = (CreateTableRequest) obj;
        if (other.getKeyspaceName() == null ^ this.getKeyspaceName() == null)
            return false;
        if (other.getKeyspaceName() != null && other.getKeyspaceName().equals(this.getKeyspaceName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getSchemaDefinition() == null ^ this.getSchemaDefinition() == null)
            return false;
        if (other.getSchemaDefinition() != null && other.getSchemaDefinition().equals(this.getSchemaDefinition()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCapacitySpecification() == null ^ this.getCapacitySpecification() == null)
            return false;
        if (other.getCapacitySpecification() != null && other.getCapacitySpecification().equals(this.getCapacitySpecification()) == false)
            return false;
        if (other.getEncryptionSpecification() == null ^ this.getEncryptionSpecification() == null)
            return false;
        if (other.getEncryptionSpecification() != null && other.getEncryptionSpecification().equals(this.getEncryptionSpecification()) == false)
            return false;
        if (other.getPointInTimeRecovery() == null ^ this.getPointInTimeRecovery() == null)
            return false;
        if (other.getPointInTimeRecovery() != null && other.getPointInTimeRecovery().equals(this.getPointInTimeRecovery()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        if (other.getDefaultTimeToLive() == null ^ this.getDefaultTimeToLive() == null)
            return false;
        if (other.getDefaultTimeToLive() != null && other.getDefaultTimeToLive().equals(this.getDefaultTimeToLive()) == false)
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

        hashCode = prime * hashCode + ((getKeyspaceName() == null) ? 0 : getKeyspaceName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getSchemaDefinition() == null) ? 0 : getSchemaDefinition().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCapacitySpecification() == null) ? 0 : getCapacitySpecification().hashCode());
        hashCode = prime * hashCode + ((getEncryptionSpecification() == null) ? 0 : getEncryptionSpecification().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecovery() == null) ? 0 : getPointInTimeRecovery().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        hashCode = prime * hashCode + ((getDefaultTimeToLive() == null) ? 0 : getDefaultTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTableRequest clone() {
        return (CreateTableRequest) super.clone();
    }

}
