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
package com.amazonaws.services.paymentcryptography;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;

/**
 * Interface for accessing Payment Cryptography Control Plane asynchronously. Each asynchronous method will return a
 * Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.paymentcryptography.AbstractAWSPaymentCryptographyAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Payment Cryptography Control Plane APIs manage encryption keys for use during payment-related
 * cryptographic operations. You can create, import, export, share, manage, and delete keys. You can also manage
 * Identity and Access Management (IAM) policies for keys. For more information, see <a
 * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/security-iam.html">Identity and access
 * management</a> in the <i>Amazon Web Services Payment Cryptography User Guide.</i>
 * </p>
 * <p>
 * To use encryption keys for payment-related transaction processing and associated cryptographic operations, you use
 * the <a href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/Welcome.html">Amazon Web
 * Services Payment Cryptography Data Plane</a>. You can perform actions like encrypt, decrypt, generate, and verify
 * payment-related data.
 * </p>
 * <p>
 * All Amazon Web Services Payment Cryptography API calls must be signed and transmitted using Transport Layer Security
 * (TLS). We recommend you always use the latest supported TLS version for logging API requests.
 * </p>
 * <p>
 * Amazon Web Services Payment Cryptography supports CloudTrail for control plane operations, a service that logs Amazon
 * Web Services API calls and related events for your Amazon Web Services account and delivers them to an Amazon S3
 * bucket you specify. By using the information collected by CloudTrail, you can determine what requests were made to
 * Amazon Web Services Payment Cryptography, who made the request, when it was made, and so on. If you don't conﬁgure a
 * trail, you can still view the most recent events in the CloudTrail console. For more information, see the <a
 * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/">CloudTrail User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPaymentCryptographyAsync extends AWSPaymentCryptography {

    /**
     * <p>
     * Creates an <i>alias</i>, or a friendly name, for an Amazon Web Services Payment Cryptography key. You can use an
     * alias to identify a key in the console and when you call cryptographic operations such as <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_EncryptData.html"
     * >EncryptData</a> or <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_DecryptData.html"
     * >DecryptData</a>.
     * </p>
     * <p>
     * You can associate the alias with any key in the same Amazon Web Services Region. Each alias is associated with
     * only one key at a time, but a key can have multiple aliases. You can't create an alias without a key. The alias
     * must be unique in the account and Amazon Web Services Region, but you can create another alias with the same name
     * in a different Amazon Web Services Region.
     * </p>
     * <p>
     * To change the key that's associated with the alias, call <a>UpdateAlias</a>. To delete the alias, call
     * <a>DeleteAlias</a>. These operations don't affect the underlying key. To get the alias that you created, call
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/CreateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an <i>alias</i>, or a friendly name, for an Amazon Web Services Payment Cryptography key. You can use an
     * alias to identify a key in the console and when you call cryptographic operations such as <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_EncryptData.html"
     * >EncryptData</a> or <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/DataAPIReference/API_DecryptData.html"
     * >DecryptData</a>.
     * </p>
     * <p>
     * You can associate the alias with any key in the same Amazon Web Services Region. Each alias is associated with
     * only one key at a time, but a key can have multiple aliases. You can't create an alias without a key. The alias
     * must be unique in the account and Amazon Web Services Region, but you can create another alias with the same name
     * in a different Amazon Web Services Region.
     * </p>
     * <p>
     * To change the key that's associated with the alias, call <a>UpdateAlias</a>. To delete the alias, call
     * <a>DeleteAlias</a>. These operations don't affect the underlying key. To get the alias that you created, call
     * <a>ListAliases</a>.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/CreateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Web Services Payment Cryptography key, a logical representation of a cryptographic key, that is
     * unique in your account and Amazon Web Services Region. You use keys for cryptographic functions such as
     * encryption and decryption.
     * </p>
     * <p>
     * In addition to the key material used in cryptographic operations, an Amazon Web Services Payment Cryptography key
     * includes metadata such as the key ARN, key usage, key origin, creation date, description, and key state.
     * </p>
     * <p>
     * When you create a key, you specify both immutable and mutable data about the key. The immutable data contains key
     * attributes that define the scope and cryptographic operations that you can perform using the key, for example key
     * class (example: <code>SYMMETRIC_KEY</code>), key algorithm (example: <code>TDES_2KEY</code>), key usage (example:
     * <code>TR31_P0_PIN_ENCRYPTION_KEY</code>) and key modes of use (example: <code>Encrypt</code>). For information
     * about valid combinations of key attributes, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>. The mutable data contained
     * within a key includes usage timestamp and key deletion timestamp and can be modified after creation.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography binds key attributes to keys using key blocks when you store or export
     * them. Amazon Web Services Payment Cryptography stores the key contents wrapped and never stores or transmits them
     * in the clear.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @return A Java Future containing the result of the CreateKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.CreateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/CreateKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest);

    /**
     * <p>
     * Creates an Amazon Web Services Payment Cryptography key, a logical representation of a cryptographic key, that is
     * unique in your account and Amazon Web Services Region. You use keys for cryptographic functions such as
     * encryption and decryption.
     * </p>
     * <p>
     * In addition to the key material used in cryptographic operations, an Amazon Web Services Payment Cryptography key
     * includes metadata such as the key ARN, key usage, key origin, creation date, description, and key state.
     * </p>
     * <p>
     * When you create a key, you specify both immutable and mutable data about the key. The immutable data contains key
     * attributes that define the scope and cryptographic operations that you can perform using the key, for example key
     * class (example: <code>SYMMETRIC_KEY</code>), key algorithm (example: <code>TDES_2KEY</code>), key usage (example:
     * <code>TR31_P0_PIN_ENCRYPTION_KEY</code>) and key modes of use (example: <code>Encrypt</code>). For information
     * about valid combinations of key attributes, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-validattributes.html">Understanding
     * key attributes</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>. The mutable data contained
     * within a key includes usage timestamp and key deletion timestamp and can be modified after creation.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography binds key attributes to keys using key blocks when you store or export
     * them. Amazon Web Services Payment Cryptography stores the key contents wrapped and never stores or transmits them
     * in the clear.
     * </p>
     * <p>
     * <b>Cross-account use</b>: This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.CreateKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/CreateKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateKeyResult> createKeyAsync(CreateKeyRequest createKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler);

    /**
     * <p>
     * Deletes the alias, but doesn't affect the underlying key.
     * </p>
     * <p>
     * Each key can have multiple aliases. To get the aliases of all keys, use the <a>ListAliases</a> operation. To
     * change the alias of a key, first use <a>DeleteAlias</a> to delete the current alias and then use
     * <a>CreateAlias</a> to create a new alias. To associate an existing alias with a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/DeleteAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes the alias, but doesn't affect the underlying key.
     * </p>
     * <p>
     * Each key can have multiple aliases. To get the aliases of all keys, use the <a>ListAliases</a> operation. To
     * change the alias of a key, first use <a>DeleteAlias</a> to delete the current alias and then use
     * <a>CreateAlias</a> to create a new alias. To associate an existing alias with a different key, call
     * <a>UpdateAlias</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/DeleteAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes the key material and metadata associated with Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * Key deletion is irreversible. After a key is deleted, you can't perform cryptographic operations using the key.
     * For example, you can't decrypt data that was encrypted by a deleted Amazon Web Services Payment Cryptography key,
     * and the data may become unrecoverable. Because key deletion is destructive, Amazon Web Services Payment
     * Cryptography has a safety mechanism to prevent accidental deletion of a key. When you call this operation, Amazon
     * Web Services Payment Cryptography disables the specified key but doesn't delete it until after a waiting period
     * set using <code>DeleteKeyInDays</code>. The default waiting period is 7 days. During the waiting period, the
     * <code>KeyState</code> is <code>DELETE_PENDING</code>. After the key is deleted, the <code>KeyState</code> is
     * <code>DELETE_COMPLETE</code>.
     * </p>
     * <p>
     * You should delete a key only when you are sure that you don't need to use it anymore and no other parties are
     * utilizing this key. If you aren't sure, consider deactivating it instead by calling <a>StopKeyUsage</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RestoreKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteKeyRequest
     * @return A Java Future containing the result of the DeleteKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.DeleteKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/DeleteKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest deleteKeyRequest);

    /**
     * <p>
     * Deletes the key material and metadata associated with Amazon Web Services Payment Cryptography key.
     * </p>
     * <p>
     * Key deletion is irreversible. After a key is deleted, you can't perform cryptographic operations using the key.
     * For example, you can't decrypt data that was encrypted by a deleted Amazon Web Services Payment Cryptography key,
     * and the data may become unrecoverable. Because key deletion is destructive, Amazon Web Services Payment
     * Cryptography has a safety mechanism to prevent accidental deletion of a key. When you call this operation, Amazon
     * Web Services Payment Cryptography disables the specified key but doesn't delete it until after a waiting period
     * set using <code>DeleteKeyInDays</code>. The default waiting period is 7 days. During the waiting period, the
     * <code>KeyState</code> is <code>DELETE_PENDING</code>. After the key is deleted, the <code>KeyState</code> is
     * <code>DELETE_COMPLETE</code>.
     * </p>
     * <p>
     * You should delete a key only when you are sure that you don't need to use it anymore and no other parties are
     * utilizing this key. If you aren't sure, consider deactivating it instead by calling <a>StopKeyUsage</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RestoreKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.DeleteKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/DeleteKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteKeyResult> deleteKeyAsync(DeleteKeyRequest deleteKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyRequest, DeleteKeyResult> asyncHandler);

    /**
     * <p>
     * Exports a key from Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography simplifies key exchange by replacing the existing paper-based approach
     * with a modern electronic approach. With <code>ExportKey</code> you can export symmetric keys using either
     * symmetric and asymmetric key exchange mechanisms. Using this operation, you can share your Amazon Web Services
     * Payment Cryptography generated keys with other service partners to perform cryptographic operations outside of
     * Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * For symmetric key exchange, Amazon Web Services Payment Cryptography uses the ANSI X9 TR-31 norm in accordance
     * with PCI PIN guidelines. And for asymmetric key exchange, Amazon Web Services Payment Cryptography supports ANSI
     * X9 TR-34 norm . Asymmetric key exchange methods are typically used to establish bi-directional trust between the
     * two parties exhanging keys and are used for initial key exchange such as Key Encryption Key (KEK). After which
     * you can export working keys using symmetric method to perform various cryptographic operations within Amazon Web
     * Services Payment Cryptography.
     * </p>
     * <p>
     * The TR-34 norm is intended for exchanging 3DES keys only and keys are imported in a WrappedKeyBlock format. Key
     * attributes (such as KeyUsage, KeyAlgorithm, KeyModesOfUse, Exportability) are contained within the key block.
     * </p>
     * <p>
     * You can also use <code>ExportKey</code> functionality to generate and export an IPEK (Initial Pin Encryption Key)
     * from Amazon Web Services Payment Cryptography using either TR-31 or TR-34 export key exchange. IPEK is generated
     * from BDK (Base Derivation Key) and <code>ExportDukptInitialKey</code> attribute KSN (<code>KeySerialNumber</code>
     * ). The generated IPEK does not persist within Amazon Web Services Payment Cryptography and has to be re-generated
     * each time during export.
     * </p>
     * <p>
     * <b>To export KEK or IPEK using TR-34</b>
     * </p>
     * <p>
     * Using this operation, you can export initial key using TR-34 asymmetric key exchange. You can only export KEK
     * generated within Amazon Web Services Payment Cryptography. In TR-34 terminology, the sending party of the key is
     * called Key Distribution Host (KDH) and the receiving party of the key is called Key Receiving Device (KRD).
     * During key export process, KDH is Amazon Web Services Payment Cryptography which initiates key export and KRD is
     * the user receiving the key.
     * </p>
     * <p>
     * To initiate TR-34 key export, the KRD must obtain an export token by calling <a>GetParametersForExport</a>. This
     * operation also generates a key pair for the purpose of key export, signs the key and returns back the signing
     * public key certificate (also known as KDH signing certificate) and root certificate chain. The KDH uses the
     * private key to sign the the export payload and the signing public key certificate is provided to KRD to verify
     * the signature. The KRD can import the root certificate into its Hardware Security Module (HSM), as required. The
     * export token and the associated KDH signing certificate expires after 7 days.
     * </p>
     * <p>
     * Next the KRD generates a key pair for the the purpose of encrypting the KDH key and provides the public key
     * cerificate (also known as KRD wrapping certificate) back to KDH. The KRD will also import the root cerificate
     * chain into Amazon Web Services Payment Cryptography by calling <a>ImportKey</a> for
     * <code>RootCertificatePublicKey</code>. The KDH, Amazon Web Services Payment Cryptography, will use the KRD
     * wrapping cerificate to encrypt (wrap) the key under export and signs it with signing private key to generate a
     * TR-34 WrappedKeyBlock. For more information on TR-34 key export, see section <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-export.html">Exporting symmetric
     * keys</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExportAttributes</code>: Specify export attributes in case of IPEK export. This parameter is optional for
     * KEK export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportKeyIdentifier</code>: The <code>KeyARN</code> of the KEK or BDK (in case of IPEK) under export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr34KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: The <code>KeyARN</code> of the certificate chain that
     * signed the KRD wrapping key certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportToken</code>: Obtained from KDH by calling <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappingKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the KRD
     * wrapping key Amazon Web Services Payment Cryptography uses for encryption of the TR-34 export payload. This
     * certificate must be signed by the root certificate (CertificateAuthorityPublicKeyIdentifier) imported into Amazon
     * Web Services Payment Cryptography.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, Amazon Web Services Payment Cryptography returns the KEK or IPEK as a TR-34
     * WrappedKeyBlock.
     * </p>
     * <p>
     * <b>To export WK (Working Key) or IPEK using TR-31</b>
     * </p>
     * <p>
     * Using this operation, you can export working keys or IPEK using TR-31 symmetric key exchange. In TR-31, you must
     * use an initial key such as KEK to encrypt or wrap the key under export. To establish a KEK, you can use
     * <a>CreateKey</a> or <a>ImportKey</a>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExportAttributes</code>: Specify export attributes in case of IPEK export. This parameter is optional for
     * KEK export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportKeyIdentifier</code>: The <code>KeyARN</code> of the KEK or BDK (in case of IPEK) under export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr31KeyBlock</code> parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, Amazon Web Services Payment Cryptography returns the WK or IPEK as a TR-31
     * WrappedKeyBlock.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetParametersForExport</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportKeyRequest
     * @return A Java Future containing the result of the ExportKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.ExportKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(ExportKeyRequest exportKeyRequest);

    /**
     * <p>
     * Exports a key from Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography simplifies key exchange by replacing the existing paper-based approach
     * with a modern electronic approach. With <code>ExportKey</code> you can export symmetric keys using either
     * symmetric and asymmetric key exchange mechanisms. Using this operation, you can share your Amazon Web Services
     * Payment Cryptography generated keys with other service partners to perform cryptographic operations outside of
     * Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * For symmetric key exchange, Amazon Web Services Payment Cryptography uses the ANSI X9 TR-31 norm in accordance
     * with PCI PIN guidelines. And for asymmetric key exchange, Amazon Web Services Payment Cryptography supports ANSI
     * X9 TR-34 norm . Asymmetric key exchange methods are typically used to establish bi-directional trust between the
     * two parties exhanging keys and are used for initial key exchange such as Key Encryption Key (KEK). After which
     * you can export working keys using symmetric method to perform various cryptographic operations within Amazon Web
     * Services Payment Cryptography.
     * </p>
     * <p>
     * The TR-34 norm is intended for exchanging 3DES keys only and keys are imported in a WrappedKeyBlock format. Key
     * attributes (such as KeyUsage, KeyAlgorithm, KeyModesOfUse, Exportability) are contained within the key block.
     * </p>
     * <p>
     * You can also use <code>ExportKey</code> functionality to generate and export an IPEK (Initial Pin Encryption Key)
     * from Amazon Web Services Payment Cryptography using either TR-31 or TR-34 export key exchange. IPEK is generated
     * from BDK (Base Derivation Key) and <code>ExportDukptInitialKey</code> attribute KSN (<code>KeySerialNumber</code>
     * ). The generated IPEK does not persist within Amazon Web Services Payment Cryptography and has to be re-generated
     * each time during export.
     * </p>
     * <p>
     * <b>To export KEK or IPEK using TR-34</b>
     * </p>
     * <p>
     * Using this operation, you can export initial key using TR-34 asymmetric key exchange. You can only export KEK
     * generated within Amazon Web Services Payment Cryptography. In TR-34 terminology, the sending party of the key is
     * called Key Distribution Host (KDH) and the receiving party of the key is called Key Receiving Device (KRD).
     * During key export process, KDH is Amazon Web Services Payment Cryptography which initiates key export and KRD is
     * the user receiving the key.
     * </p>
     * <p>
     * To initiate TR-34 key export, the KRD must obtain an export token by calling <a>GetParametersForExport</a>. This
     * operation also generates a key pair for the purpose of key export, signs the key and returns back the signing
     * public key certificate (also known as KDH signing certificate) and root certificate chain. The KDH uses the
     * private key to sign the the export payload and the signing public key certificate is provided to KRD to verify
     * the signature. The KRD can import the root certificate into its Hardware Security Module (HSM), as required. The
     * export token and the associated KDH signing certificate expires after 7 days.
     * </p>
     * <p>
     * Next the KRD generates a key pair for the the purpose of encrypting the KDH key and provides the public key
     * cerificate (also known as KRD wrapping certificate) back to KDH. The KRD will also import the root cerificate
     * chain into Amazon Web Services Payment Cryptography by calling <a>ImportKey</a> for
     * <code>RootCertificatePublicKey</code>. The KDH, Amazon Web Services Payment Cryptography, will use the KRD
     * wrapping cerificate to encrypt (wrap) the key under export and signs it with signing private key to generate a
     * TR-34 WrappedKeyBlock. For more information on TR-34 key export, see section <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-export.html">Exporting symmetric
     * keys</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExportAttributes</code>: Specify export attributes in case of IPEK export. This parameter is optional for
     * KEK export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportKeyIdentifier</code>: The <code>KeyARN</code> of the KEK or BDK (in case of IPEK) under export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr34KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: The <code>KeyARN</code> of the certificate chain that
     * signed the KRD wrapping key certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportToken</code>: Obtained from KDH by calling <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappingKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the KRD
     * wrapping key Amazon Web Services Payment Cryptography uses for encryption of the TR-34 export payload. This
     * certificate must be signed by the root certificate (CertificateAuthorityPublicKeyIdentifier) imported into Amazon
     * Web Services Payment Cryptography.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, Amazon Web Services Payment Cryptography returns the KEK or IPEK as a TR-34
     * WrappedKeyBlock.
     * </p>
     * <p>
     * <b>To export WK (Working Key) or IPEK using TR-31</b>
     * </p>
     * <p>
     * Using this operation, you can export working keys or IPEK using TR-31 symmetric key exchange. In TR-31, you must
     * use an initial key such as KEK to encrypt or wrap the key under export. To establish a KEK, you can use
     * <a>CreateKey</a> or <a>ImportKey</a>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExportAttributes</code>: Specify export attributes in case of IPEK export. This parameter is optional for
     * KEK export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ExportKeyIdentifier</code>: The <code>KeyARN</code> of the KEK or BDK (in case of IPEK) under export.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr31KeyBlock</code> parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When this operation is successful, Amazon Web Services Payment Cryptography returns the WK or IPEK as a TR-31
     * WrappedKeyBlock.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetParametersForExport</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.ExportKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ExportKeyResult> exportKeyAsync(ExportKeyRequest exportKeyRequest,
            com.amazonaws.handlers.AsyncHandler<ExportKeyRequest, ExportKeyResult> asyncHandler);

    /**
     * <p>
     * Gets the Amazon Web Services Payment Cryptography key associated with the alias.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAliasRequest
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest);

    /**
     * <p>
     * Gets the Amazon Web Services Payment Cryptography key associated with the alias.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetAlias" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest,
            com.amazonaws.handlers.AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler);

    /**
     * <p>
     * Gets the key material for an Amazon Web Services Payment Cryptography key, including the immutable and mutable
     * data specified when the key was created.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getKeyRequest
     * @return A Java Future containing the result of the GetKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.GetKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest getKeyRequest);

    /**
     * <p>
     * Gets the key material for an Amazon Web Services Payment Cryptography key, including the immutable and mutable
     * data specified when the key was created.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListKeys</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.GetKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetKeyResult> getKeyAsync(GetKeyRequest getKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyRequest, GetKeyResult> asyncHandler);

    /**
     * <p>
     * Gets the export token and the signing key certificate to initiate a TR-34 key export from Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * The signing key certificate signs the wrapped key under export within the TR-34 key payload. The export token and
     * signing key certificate must be in place and operational before calling <a>ExportKey</a>. The export token
     * expires in 7 days. You can use the same export token to export multiple keys from your service account.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ExportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getParametersForExportRequest
     * @return A Java Future containing the result of the GetParametersForExport operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.GetParametersForExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(GetParametersForExportRequest getParametersForExportRequest);

    /**
     * <p>
     * Gets the export token and the signing key certificate to initiate a TR-34 key export from Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * The signing key certificate signs the wrapped key under export within the TR-34 key payload. The export token and
     * signing key certificate must be in place and operational before calling <a>ExportKey</a>. The export token
     * expires in 7 days. You can use the same export token to export multiple keys from your service account.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ExportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getParametersForExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParametersForExport operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.GetParametersForExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForExportResult> getParametersForExportAsync(GetParametersForExportRequest getParametersForExportRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersForExportRequest, GetParametersForExportResult> asyncHandler);

    /**
     * <p>
     * Gets the import token and the wrapping key certificate in PEM format (base64 encoded) to initiate a TR-34
     * WrappedKeyBlock.
     * </p>
     * <p>
     * The wrapping key certificate wraps the key under import. The import token and wrapping key certificate must be in
     * place and operational before calling <a>ImportKey</a>. The import token expires in 7 days. You can use the same
     * import token to import multiple keys into your service account.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetParametersForExport</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getParametersForImportRequest
     * @return A Java Future containing the result of the GetParametersForImport operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.GetParametersForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest getParametersForImportRequest);

    /**
     * <p>
     * Gets the import token and the wrapping key certificate in PEM format (base64 encoded) to initiate a TR-34
     * WrappedKeyBlock.
     * </p>
     * <p>
     * The wrapping key certificate wraps the key under import. The import token and wrapping key certificate must be in
     * place and operational before calling <a>ImportKey</a>. The import token expires in 7 days. You can use the same
     * import token to import multiple keys into your service account.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>GetParametersForExport</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ImportKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getParametersForImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetParametersForImport operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.GetParametersForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetParametersForImportResult> getParametersForImportAsync(GetParametersForImportRequest getParametersForImportRequest,
            com.amazonaws.handlers.AsyncHandler<GetParametersForImportRequest, GetParametersForImportResult> asyncHandler);

    /**
     * <p>
     * Gets the public key certificate of the asymmetric key pair that exists within Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * Unlike the private key of an asymmetric key, which never leaves Amazon Web Services Payment Cryptography
     * unencrypted, callers with <code>GetPublicKeyCertificate</code> permission can download the public key certificate
     * of the asymmetric key. You can share the public key certificate to allow others to encrypt messages and verify
     * signatures outside of Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * 
     * @param getPublicKeyCertificateRequest
     * @return A Java Future containing the result of the GetPublicKeyCertificate operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.GetPublicKeyCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetPublicKeyCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(GetPublicKeyCertificateRequest getPublicKeyCertificateRequest);

    /**
     * <p>
     * Gets the public key certificate of the asymmetric key pair that exists within Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * Unlike the private key of an asymmetric key, which never leaves Amazon Web Services Payment Cryptography
     * unencrypted, callers with <code>GetPublicKeyCertificate</code> permission can download the public key certificate
     * of the asymmetric key. You can share the public key certificate to allow others to encrypt messages and verify
     * signatures outside of Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * 
     * @param getPublicKeyCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPublicKeyCertificate operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.GetPublicKeyCertificate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetPublicKeyCertificate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicKeyCertificateResult> getPublicKeyCertificateAsync(GetPublicKeyCertificateRequest getPublicKeyCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetPublicKeyCertificateRequest, GetPublicKeyCertificateResult> asyncHandler);

    /**
     * <p>
     * Imports symmetric keys and public key certificates in PEM format (base64 encoded) into Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography simplifies key exchange by replacing the existing paper-based approach
     * with a modern electronic approach. With <code>ImportKey</code> you can import symmetric keys using either
     * symmetric and asymmetric key exchange mechanisms.
     * </p>
     * <p>
     * For symmetric key exchange, Amazon Web Services Payment Cryptography uses the ANSI X9 TR-31 norm in accordance
     * with PCI PIN guidelines. And for asymmetric key exchange, Amazon Web Services Payment Cryptography supports ANSI
     * X9 TR-34 norm . Asymmetric key exchange methods are typically used to establish bi-directional trust between the
     * two parties exhanging keys and are used for initial key exchange such as Key Encryption Key (KEK) or Zone Master
     * Key (ZMK). After which you can import working keys using symmetric method to perform various cryptographic
     * operations within Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * The TR-34 norm is intended for exchanging 3DES keys only and keys are imported in a WrappedKeyBlock format. Key
     * attributes (such as KeyUsage, KeyAlgorithm, KeyModesOfUse, Exportability) are contained within the key block.
     * </p>
     * <p>
     * You can also import a <i>root public key certificate</i>, used to sign other public key certificates, or a
     * <i>trusted public key certificate</i> under an already established root public key certificate.
     * </p>
     * <p>
     * <b>To import a public root key certificate</b>
     * </p>
     * <p>
     * You can also import a <i>root public key certificate</i>, used to sign other public key certificates, or a
     * <i>trusted public key certificate</i> under an already established root public key certificate.
     * </p>
     * <p>
     * <b>To import a public root key certificate</b>
     * </p>
     * <p>
     * Using this operation, you can import the public component (in PEM cerificate format) of your private root key.
     * You can use the imported public root key certificate for digital signatures, for example signing wrapping key or
     * signing key in TR-34, within your Amazon Web Services Payment Cryptography account.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: <code>RootCertificatePublicKey</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyClass</code>: <code>PUBLIC_KEY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyModesOfUse</code>: <code>Verify</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyUsage</code>: <code>TR31_S0_ASYMMETRIC_KEY_FOR_DIGITAL_SIGNATURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PublicKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the private root
     * key under import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import a trusted public key certificate</b>
     * </p>
     * <p>
     * The root public key certificate must be in place and operational before you import a trusted public key
     * certificate. Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: <code>TrustedCertificatePublicKey</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: <code>KeyArn</code> of the
     * <code>RootCertificatePublicKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyModesOfUse</code> and <code>KeyUsage</code>: Corresponding to the cryptographic operations such as wrap,
     * sign, or encrypt that you will allow the trusted public key certificate to perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PublicKeyCertificate</code>: The trusted public key certificate in PEM format (base64 encoded) under
     * import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import KEK or ZMK using TR-34</b>
     * </p>
     * <p>
     * Using this operation, you can import initial key using TR-34 asymmetric key exchange. In TR-34 terminology, the
     * sending party of the key is called Key Distribution Host (KDH) and the receiving party of the key is called Key
     * Receiving Device (KRD). During the key import process, KDH is the user who initiates the key import and KRD is
     * Amazon Web Services Payment Cryptography who receives the key.
     * </p>
     * <p>
     * To initiate TR-34 key import, the KDH must obtain an import token by calling <a>GetParametersForImport</a>. This
     * operation generates an encryption keypair for the purpose of key import, signs the key and returns back the
     * wrapping key certificate (also known as KRD wrapping certificate) and the root certificate chain. The KDH must
     * trust and install the KRD wrapping certificate on its HSM and use it to encrypt (wrap) the KDH key during TR-34
     * WrappedKeyBlock generation. The import token and associated KRD wrapping certificate expires after 7 days.
     * </p>
     * <p>
     * Next the KDH generates a key pair for the purpose of signing the encrypted KDH key and provides the public
     * certificate of the signing key to Amazon Web Services Payment Cryptography. The KDH will also need to import the
     * root certificate chain of the KDH signing certificate by calling <code>ImportKey</code> for
     * <code>RootCertificatePublicKey</code>. For more information on TR-34 key import, see section <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-import.html">Importing symmetric
     * keys</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr34KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: The <code>KeyARN</code> of the certificate chain that
     * signed the KDH signing key certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImportToken</code>: Obtained from KRD by calling <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappedKeyBlock</code>: The TR-34 wrapped key material from KDH. It contains the KDH key under import,
     * wrapped with KRD wrapping certificate and signed by KDH signing private key. This TR-34 key block is typically
     * generated by the KDH Hardware Security Module (HSM) outside of Amazon Web Services Payment Cryptography.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SigningKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the KDH signing
     * key generated under the root certificate (CertificateAuthorityPublicKeyIdentifier) imported in Amazon Web
     * Services Payment Cryptography.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import WK (Working Key) using TR-31</b>
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography uses TR-31 symmetric key exchange norm to import working keys. A KEK
     * must be established within Amazon Web Services Payment Cryptography by using TR-34 key import or by using
     * <a>CreateKey</a>. To initiate a TR-31 key import, set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr31KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappedKeyBlock</code>: The TR-31 wrapped key material. It contains the key under import, encrypted using
     * KEK. The TR-31 key block is typically generated by a HSM outside of Amazon Web Services Payment Cryptography.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappingKeyIdentifier</code>: The <code>KeyArn</code> of the KEK that Amazon Web Services Payment
     * Cryptography uses to decrypt or unwrap the key under import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ExportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param importKeyRequest
     * @return A Java Future containing the result of the ImportKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.ImportKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyResult> importKeyAsync(ImportKeyRequest importKeyRequest);

    /**
     * <p>
     * Imports symmetric keys and public key certificates in PEM format (base64 encoded) into Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography simplifies key exchange by replacing the existing paper-based approach
     * with a modern electronic approach. With <code>ImportKey</code> you can import symmetric keys using either
     * symmetric and asymmetric key exchange mechanisms.
     * </p>
     * <p>
     * For symmetric key exchange, Amazon Web Services Payment Cryptography uses the ANSI X9 TR-31 norm in accordance
     * with PCI PIN guidelines. And for asymmetric key exchange, Amazon Web Services Payment Cryptography supports ANSI
     * X9 TR-34 norm . Asymmetric key exchange methods are typically used to establish bi-directional trust between the
     * two parties exhanging keys and are used for initial key exchange such as Key Encryption Key (KEK) or Zone Master
     * Key (ZMK). After which you can import working keys using symmetric method to perform various cryptographic
     * operations within Amazon Web Services Payment Cryptography.
     * </p>
     * <p>
     * The TR-34 norm is intended for exchanging 3DES keys only and keys are imported in a WrappedKeyBlock format. Key
     * attributes (such as KeyUsage, KeyAlgorithm, KeyModesOfUse, Exportability) are contained within the key block.
     * </p>
     * <p>
     * You can also import a <i>root public key certificate</i>, used to sign other public key certificates, or a
     * <i>trusted public key certificate</i> under an already established root public key certificate.
     * </p>
     * <p>
     * <b>To import a public root key certificate</b>
     * </p>
     * <p>
     * You can also import a <i>root public key certificate</i>, used to sign other public key certificates, or a
     * <i>trusted public key certificate</i> under an already established root public key certificate.
     * </p>
     * <p>
     * <b>To import a public root key certificate</b>
     * </p>
     * <p>
     * Using this operation, you can import the public component (in PEM cerificate format) of your private root key.
     * You can use the imported public root key certificate for digital signatures, for example signing wrapping key or
     * signing key in TR-34, within your Amazon Web Services Payment Cryptography account.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: <code>RootCertificatePublicKey</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyClass</code>: <code>PUBLIC_KEY</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyModesOfUse</code>: <code>Verify</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyUsage</code>: <code>TR31_S0_ASYMMETRIC_KEY_FOR_DIGITAL_SIGNATURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PublicKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the private root
     * key under import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import a trusted public key certificate</b>
     * </p>
     * <p>
     * The root public key certificate must be in place and operational before you import a trusted public key
     * certificate. Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: <code>TrustedCertificatePublicKey</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: <code>KeyArn</code> of the
     * <code>RootCertificatePublicKey</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KeyModesOfUse</code> and <code>KeyUsage</code>: Corresponding to the cryptographic operations such as wrap,
     * sign, or encrypt that you will allow the trusted public key certificate to perform.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PublicKeyCertificate</code>: The trusted public key certificate in PEM format (base64 encoded) under
     * import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import KEK or ZMK using TR-34</b>
     * </p>
     * <p>
     * Using this operation, you can import initial key using TR-34 asymmetric key exchange. In TR-34 terminology, the
     * sending party of the key is called Key Distribution Host (KDH) and the receiving party of the key is called Key
     * Receiving Device (KRD). During the key import process, KDH is the user who initiates the key import and KRD is
     * Amazon Web Services Payment Cryptography who receives the key.
     * </p>
     * <p>
     * To initiate TR-34 key import, the KDH must obtain an import token by calling <a>GetParametersForImport</a>. This
     * operation generates an encryption keypair for the purpose of key import, signs the key and returns back the
     * wrapping key certificate (also known as KRD wrapping certificate) and the root certificate chain. The KDH must
     * trust and install the KRD wrapping certificate on its HSM and use it to encrypt (wrap) the KDH key during TR-34
     * WrappedKeyBlock generation. The import token and associated KRD wrapping certificate expires after 7 days.
     * </p>
     * <p>
     * Next the KDH generates a key pair for the purpose of signing the encrypted KDH key and provides the public
     * certificate of the signing key to Amazon Web Services Payment Cryptography. The KDH will also need to import the
     * root certificate chain of the KDH signing certificate by calling <code>ImportKey</code> for
     * <code>RootCertificatePublicKey</code>. For more information on TR-34 key import, see section <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-import.html">Importing symmetric
     * keys</a> in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * Set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr34KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CertificateAuthorityPublicKeyIdentifier</code>: The <code>KeyARN</code> of the certificate chain that
     * signed the KDH signing key certificate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ImportToken</code>: Obtained from KRD by calling <a>GetParametersForImport</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappedKeyBlock</code>: The TR-34 wrapped key material from KDH. It contains the KDH key under import,
     * wrapped with KRD wrapping certificate and signed by KDH signing private key. This TR-34 key block is typically
     * generated by the KDH Hardware Security Module (HSM) outside of Amazon Web Services Payment Cryptography.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SigningKeyCertificate</code>: The public key certificate in PEM format (base64 encoded) of the KDH signing
     * key generated under the root certificate (CertificateAuthorityPublicKeyIdentifier) imported in Amazon Web
     * Services Payment Cryptography.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>To import WK (Working Key) using TR-31</b>
     * </p>
     * <p>
     * Amazon Web Services Payment Cryptography uses TR-31 symmetric key exchange norm to import working keys. A KEK
     * must be established within Amazon Web Services Payment Cryptography by using TR-34 key import or by using
     * <a>CreateKey</a>. To initiate a TR-31 key import, set the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KeyMaterial</code>: Use <code>Tr31KeyBlock</code> parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappedKeyBlock</code>: The TR-31 wrapped key material. It contains the key under import, encrypted using
     * KEK. The TR-31 key block is typically generated by a HSM outside of Amazon Web Services Payment Cryptography.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WrappingKeyIdentifier</code>: The <code>KeyArn</code> of the KEK that Amazon Web Services Payment
     * Cryptography uses to decrypt or unwrap the key under import.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ExportKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetParametersForImport</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param importKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.ImportKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportKey" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ImportKeyResult> importKeyAsync(ImportKeyRequest importKeyRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyRequest, ImportKeyResult> asyncHandler);

    /**
     * <p>
     * Lists the aliases for all keys in the caller's Amazon Web Services account and Amazon Web Services Region. You
     * can filter the list of aliases. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-managealias.html">Using aliases</a>
     * in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the aliases.
     * When the response contains only a subset of aliases, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>ListAliases</code> request to get more aliases. When you receive a response with no
     * NextToken (or an empty or null value), that means there are no more aliases to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Lists the aliases for all keys in the caller's Amazon Web Services account and Amazon Web Services Region. You
     * can filter the list of aliases. For more information, see <a
     * href="https://docs.aws.amazon.com/payment-cryptography/latest/userguide/keys-managealias.html">Using aliases</a>
     * in the <i>Amazon Web Services Payment Cryptography User Guide</i>.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the aliases.
     * When the response contains only a subset of aliases, it includes a <code>NextToken</code> value. Use this value
     * in a subsequent <code>ListAliases</code> request to get more aliases. When you receive a response with no
     * NextToken (or an empty or null value), that means there are no more aliases to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateAlias</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListAliases"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists the keys in the caller's Amazon Web Services account and Amazon Web Services Region. You can filter the
     * list of keys.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the keys. When
     * the response contains only a subset of keys, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListKeys</code> request to get more keys. When you receive a response with no NextToken (or an
     * empty or null value), that means there are no more keys to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listKeysRequest
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest);

    /**
     * <p>
     * Lists the keys in the caller's Amazon Web Services account and Amazon Web Services Region. You can filter the
     * list of keys.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the keys. When
     * the response contains only a subset of keys, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListKeys</code> request to get more keys. When you receive a response with no NextToken (or an
     * empty or null value), that means there are no more keys to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetKey</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListKeys operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.ListKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListKeys" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListKeysResult> listKeysAsync(ListKeysRequest listKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for an Amazon Web Services resource.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTagsForResource</code> request to get more tags. When you receive a response with no
     * NextToken (or an empty or null value), that means there are no more tags to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for an Amazon Web Services resource.
     * </p>
     * <p>
     * This is a paginated operation, which means that each response might contain only a subset of all the tags. When
     * the response contains only a subset of tags, it includes a <code>NextToken</code> value. Use this value in a
     * subsequent <code>ListTagsForResource</code> request to get more tags. When you receive a response with no
     * NextToken (or an empty or null value), that means there are no more tags to get.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Cancels a scheduled key deletion during the waiting period. Use this operation to restore a <code>Key</code> that
     * is scheduled for deletion.
     * </p>
     * <p>
     * During the waiting period, the <code>KeyState</code> is <code>DELETE_PENDING</code> and
     * <code>deletePendingTimestamp</code> contains the date and time after which the <code>Key</code> will be deleted.
     * After <code>Key</code> is restored, the <code>KeyState</code> is <code>CREATE_COMPLETE</code>, and the value for
     * <code>deletePendingTimestamp</code> is removed.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreKeyRequest
     * @return A Java Future containing the result of the RestoreKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.RestoreKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/RestoreKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(RestoreKeyRequest restoreKeyRequest);

    /**
     * <p>
     * Cancels a scheduled key deletion during the waiting period. Use this operation to restore a <code>Key</code> that
     * is scheduled for deletion.
     * </p>
     * <p>
     * During the waiting period, the <code>KeyState</code> is <code>DELETE_PENDING</code> and
     * <code>deletePendingTimestamp</code> contains the date and time after which the <code>Key</code> will be deleted.
     * After <code>Key</code> is restored, the <code>KeyState</code> is <code>CREATE_COMPLETE</code>, and the value for
     * <code>deletePendingTimestamp</code> is removed.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param restoreKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestoreKey operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.RestoreKey
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/RestoreKey"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RestoreKeyResult> restoreKeyAsync(RestoreKeyRequest restoreKeyRequest,
            com.amazonaws.handlers.AsyncHandler<RestoreKeyRequest, RestoreKeyResult> asyncHandler);

    /**
     * <p>
     * Enables an Amazon Web Services Payment Cryptography key, which makes it active for cryptographic operations
     * within Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startKeyUsageRequest
     * @return A Java Future containing the result of the StartKeyUsage operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.StartKeyUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/StartKeyUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(StartKeyUsageRequest startKeyUsageRequest);

    /**
     * <p>
     * Enables an Amazon Web Services Payment Cryptography key, which makes it active for cryptographic operations
     * within Amazon Web Services Payment Cryptography
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>StopKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param startKeyUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartKeyUsage operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.StartKeyUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/StartKeyUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartKeyUsageResult> startKeyUsageAsync(StartKeyUsageRequest startKeyUsageRequest,
            com.amazonaws.handlers.AsyncHandler<StartKeyUsageRequest, StartKeyUsageResult> asyncHandler);

    /**
     * <p>
     * Disables an Amazon Web Services Payment Cryptography key, which makes it inactive within Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * You can use this operation instead of <a>DeleteKey</a> to deactivate a key. You can enable the key in the future
     * by calling <a>StartKeyUsage</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopKeyUsageRequest
     * @return A Java Future containing the result of the StopKeyUsage operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.StopKeyUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/StopKeyUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(StopKeyUsageRequest stopKeyUsageRequest);

    /**
     * <p>
     * Disables an Amazon Web Services Payment Cryptography key, which makes it inactive within Amazon Web Services
     * Payment Cryptography.
     * </p>
     * <p>
     * You can use this operation instead of <a>DeleteKey</a> to deactivate a key. You can enable the key in the future
     * by calling <a>StartKeyUsage</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteKey</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>StartKeyUsage</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopKeyUsageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopKeyUsage operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.StopKeyUsage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/StopKeyUsage"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopKeyUsageResult> stopKeyUsageAsync(StopKeyUsageRequest stopKeyUsageRequest,
            com.amazonaws.handlers.AsyncHandler<StopKeyUsageRequest, StopKeyUsageResult> asyncHandler);

    /**
     * <p>
     * Adds or edits tags on an Amazon Web Services Payment Cryptography key.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * Each tag consists of a tag key and a tag value, both of which are case-sensitive strings. The tag value can be an
     * empty (null) string. To add a tag, specify a new tag key and a tag value. To edit a tag, specify an existing tag
     * key and a new tag value. You can also add tags to an Amazon Web Services Payment Cryptography key when you create
     * it with <a>CreateKey</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListTagsForResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or edits tags on an Amazon Web Services Payment Cryptography key.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * Each tag consists of a tag key and a tag value, both of which are case-sensitive strings. The tag value can be an
     * empty (null) string. To add a tag, specify a new tag key and a tag value. To edit a tag, specify an existing tag
     * key and a new tag value. You can also add tags to an Amazon Web Services Payment Cryptography key when you create
     * it with <a>CreateKey</a>.
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListTagsForResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UntagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a tag from an Amazon Web Services Payment Cryptography key.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListTagsForResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes a tag from an Amazon Web Services Payment Cryptography key.
     * </p>
     * <note>
     * <p>
     * Tagging or untagging an Amazon Web Services Payment Cryptography key can allow or deny permission to the key.
     * </p>
     * </note>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListTagsForResource</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>TagResource</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Associates an existing Amazon Web Services Payment Cryptography alias with a different key. Each alias is
     * associated with only one Amazon Web Services Payment Cryptography key at a time, although a key can have multiple
     * aliases. The alias and the Amazon Web Services Payment Cryptography key must be in the same Amazon Web Services
     * account and Amazon Web Services Region
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/UpdateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Associates an existing Amazon Web Services Payment Cryptography alias with a different key. Each alias is
     * associated with only one Amazon Web Services Payment Cryptography key at a time, although a key can have multiple
     * aliases. The alias and the Amazon Web Services Payment Cryptography key must be in the same Amazon Web Services
     * account and Amazon Web Services Region
     * </p>
     * <p>
     * <b>Cross-account use:</b> This operation can't be used across different Amazon Web Services accounts.
     * </p>
     * <p>
     * <b>Related operations:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>GetAlias</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAliases</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AWSPaymentCryptographyAsyncHandler.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/UpdateAlias"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

}
