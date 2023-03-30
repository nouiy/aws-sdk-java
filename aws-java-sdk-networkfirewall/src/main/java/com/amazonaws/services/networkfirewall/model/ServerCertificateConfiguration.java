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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the associated Certificate Manager Secure Sockets Layer/Transport Layer Security (SSL/TLS) server
 * certificates and scope settings Network Firewall uses to decrypt traffic in a <a>TLSInspectionConfiguration</a>. For
 * information about working with SSL/TLS certificates for TLS inspection, see <a href=
 * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html">
 * Requirements for using SSL/TLS server certficiates with TLS inspection configurations</a> in the <i>Network Firewall
 * Developer Guide</i>.
 * </p>
 * <note>
 * <p>
 * If a server certificate that's associated with your <a>TLSInspectionConfiguration</a> is revoked, deleted, or expired
 * it can result in client-side TLS errors.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ServerCertificateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * </p>
     */
    private java.util.List<ServerCertificate> serverCertificates;
    /**
     * <p>
     * A list of a server certificate configuration's scopes.
     * </p>
     */
    private java.util.List<ServerCertificateScope> scopes;

    /**
     * <p>
     * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * </p>
     * 
     * @return The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     */

    public java.util.List<ServerCertificate> getServerCertificates() {
        return serverCertificates;
    }

    /**
     * <p>
     * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * </p>
     * 
     * @param serverCertificates
     *        The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     */

    public void setServerCertificates(java.util.Collection<ServerCertificate> serverCertificates) {
        if (serverCertificates == null) {
            this.serverCertificates = null;
            return;
        }

        this.serverCertificates = new java.util.ArrayList<ServerCertificate>(serverCertificates);
    }

    /**
     * <p>
     * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerCertificates(java.util.Collection)} or {@link #withServerCertificates(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serverCertificates
     *        The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withServerCertificates(ServerCertificate... serverCertificates) {
        if (this.serverCertificates == null) {
            setServerCertificates(new java.util.ArrayList<ServerCertificate>(serverCertificates.length));
        }
        for (ServerCertificate ele : serverCertificates) {
            this.serverCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * </p>
     * 
     * @param serverCertificates
     *        The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withServerCertificates(java.util.Collection<ServerCertificate> serverCertificates) {
        setServerCertificates(serverCertificates);
        return this;
    }

    /**
     * <p>
     * A list of a server certificate configuration's scopes.
     * </p>
     * 
     * @return A list of a server certificate configuration's scopes.
     */

    public java.util.List<ServerCertificateScope> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * A list of a server certificate configuration's scopes.
     * </p>
     * 
     * @param scopes
     *        A list of a server certificate configuration's scopes.
     */

    public void setScopes(java.util.Collection<ServerCertificateScope> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<ServerCertificateScope>(scopes);
    }

    /**
     * <p>
     * A list of a server certificate configuration's scopes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        A list of a server certificate configuration's scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withScopes(ServerCertificateScope... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<ServerCertificateScope>(scopes.length));
        }
        for (ServerCertificateScope ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of a server certificate configuration's scopes.
     * </p>
     * 
     * @param scopes
     *        A list of a server certificate configuration's scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withScopes(java.util.Collection<ServerCertificateScope> scopes) {
        setScopes(scopes);
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
        if (getServerCertificates() != null)
            sb.append("ServerCertificates: ").append(getServerCertificates()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateConfiguration == false)
            return false;
        ServerCertificateConfiguration other = (ServerCertificateConfiguration) obj;
        if (other.getServerCertificates() == null ^ this.getServerCertificates() == null)
            return false;
        if (other.getServerCertificates() != null && other.getServerCertificates().equals(this.getServerCertificates()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificates() == null) ? 0 : getServerCertificates().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificateConfiguration clone() {
        try {
            return (ServerCertificateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.ServerCertificateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
