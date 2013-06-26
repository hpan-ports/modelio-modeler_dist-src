/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.app.project.conf.dialog.libraries.distant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

@objid ("c28a2855-6027-4d52-b459-db9dcac2f5d1")
public class ServerCertManager {
    /**
     * Initialize server certificate truster.
     */
    @objid ("734dfcf6-9136-4421-98d0-4040ae5e6b22")
    public static void init() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            final List<X509TrustManager> defTrustManagers = new ArrayList<>();
            final ArrayList<X509Certificate> accepted = new ArrayList<>();
        
            trustManagerFactory.init((KeyStore)null);
        
            for (TrustManager tm : trustManagerFactory.getTrustManagers()) {
                if (tm instanceof X509TrustManager) {
                    X509TrustManager xtm = (X509TrustManager) tm;
                    defTrustManagers.add(xtm);
        
                    for (X509Certificate iss : xtm.getAcceptedIssuers())
                        accepted.add(iss);
                }
            }
            final X509Certificate[] acceptedArray = accepted.toArray(new X509Certificate[accepted.size()]);
        
        
            SSLContext sc = SSLContext.getInstance("TLS");
            TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManagerImplementation(defTrustManagers, acceptedArray) };
        
            sc.init(null, trustAllCerts, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (KeyManagementException e) {
            e.printStackTrace();
            throw new Error(e);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new Error(e);
        } catch (KeyStoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new Error(e);
        }
    }

    @objid ("606851a9-c597-4b9e-bcda-d33063e3ff9f")
    private static final class X509TrustManagerImplementation implements X509TrustManager {
        @objid ("316825d0-89a2-4db4-a866-69b1a29f61ed")
        private final List<X509TrustManager> defTrustManagers;

        @objid ("938f5393-9af0-4299-be79-5b885f19cfd7")
        private final X509Certificate[] acceptedArray;

        @objid ("d1af1504-53a4-40fb-9c6b-559bea3d2af2")
         KeyStore trustStore;

        @objid ("1290481d-3de2-47ea-98f6-143e56e476f5")
         Path trustStoreFile;

        @objid ("87590a52-18bb-4771-b98a-096864f53f97")
        X509TrustManagerImplementation(List<X509TrustManager> defTrustManagers, X509Certificate[] acceptedArray) {
            this.defTrustManagers = defTrustManagers;
            this.acceptedArray = acceptedArray;
            try {
                this.trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            } catch (KeyStoreException e) {
                throw new Error(e);
            }
        }

        @objid ("2e21782b-924d-4c2d-9c00-f72944c191e5")
        public void init(Path trustStoreFile) throws IOException {
            try (InputStream is = new BufferedInputStream(Files.newInputStream(trustStoreFile));) {
                this.trustStore.load(is, null);
                this.trustStoreFile = trustStoreFile;
            } catch (NoSuchAlgorithmException | CertificateException e) {
                throw new IOException(e);
            }
        }

        @objid ("454d4586-a422-45fc-a22c-425f293a2812")
        public void addCert(Path certFile) throws IOException {
            try {
                CertificateFactory cf = CertificateFactory.getInstance("X509");
                try (InputStream is = new BufferedInputStream(Files.newInputStream(certFile));) {
            
                    X509Certificate cert = (X509Certificate) cf.generateCertificate(is);
                    String alias = hashName(cert);
                    this.trustStore.setCertificateEntry(alias, cert);
                }
            } catch (CertificateException | KeyStoreException e) {
                throw new IOException(e);
            }
        }

        @objid ("2ed4e9bc-04c7-4175-803f-24ca99251b6f")
        public void addCertificate(X509Certificate cert) throws KeyStoreException {
            String alias = hashName(cert);
            this.trustStore.setCertificateEntry(alias, cert);
        }

        @objid ("383bb443-7e71-472c-a069-bd59c4878b87")
        public void save() throws IOException {
            if (this.trustStoreFile!= null) {
                try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(this.trustStoreFile))) {
                    this.trustStore.store(os, null);
                } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                    throw new IOException(e.getLocalizedMessage(),e);
                }
            }
        }

        @objid ("b1bf1e53-a50a-4587-836b-3b122c7d265f")
        private String hashName(X509Certificate cert) {
            return cert.getIssuerX500Principal().getName()+cert.getSerialNumber().toString(36);
        }

        @objid ("0d274811-6240-4dbd-9ab0-4c67f304b6cd")
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return this.acceptedArray;
        }

        @objid ("1f343735-b1b9-45b4-9abc-0cd131719ade")
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            for (X509TrustManager i : this.defTrustManagers ) 
                i.checkClientTrusted(chain, authType);
        }

        @objid ("8b84d523-65b9-43ef-b6d0-934145f0eb28")
        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            if (this.trustStore != null) for (X509Certificate cert : chain) {
                try {
                    if (this.trustStore.getCertificateAlias(cert) != null)
                        return;
                } catch (KeyStoreException e) {
                    throw new CertificateException(e.getLocalizedMessage(), e);
                }
            }
            
            List<CertificateException> errors = new ArrayList<>(2);
            for (X509TrustManager i : this.defTrustManagers ) 
                try {
                    i.checkServerTrusted(chain, authType);
                } catch (CertificateException e) {
                    errors.add(e);
                }
            
            if (! errors.isEmpty()) {
                final StringBuilder msg = new StringBuilder();
                msg.append("The following server certificate is invalid:");
                for (X509Certificate c : chain) {
                msg.append(c.toString());
                msg.append("\n");
                }
            
                msg.append("The errors are:");
                for (CertificateException e : errors) {
                    e.printStackTrace();
                    msg.append(e.getLocalizedMessage());
                    msg.append("\n");
                }
                
                msg.append("\nDo you want to accept the certificate anyway?");
            
                final boolean[] answer = new boolean[]{false};
            
                Display.getDefault().syncExec(new Runnable() {
                    @Override
                    public void run() {
                        answer[0] = MessageDialog.openConfirm(null, "Server certif invalid", msg.toString());
            
                    }
                });
            
                if (!answer[0]) {
                    CertificateException firstError = errors.get(1);
            
                    if (errors.size() > 1) for (CertificateException e : errors) {
                        if (e != firstError)
                            firstError.addSuppressed(e);
            
                    }
            
                    throw firstError;
            
                }
            
                if (this.trustStore != null) try {
                    addCertificate(chain[0]);
                    save();
                } catch (IOException | KeyStoreException e) {
                    throw new CertificateException(e.getLocalizedMessage(), e);
                }
            }
        }

    }

}
