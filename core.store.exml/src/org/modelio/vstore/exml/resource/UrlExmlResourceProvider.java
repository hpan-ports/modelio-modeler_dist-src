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
                                    

package org.modelio.vstore.exml.resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.files.CloseOnFail;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vbasic.progress.IModelioProgress;
import org.modelio.vcore.Log;
import org.modelio.vcore.session.api.blob.IBlobInfo;
import org.modelio.vcore.session.api.repository.BlobServices;
import org.modelio.vstore.exml.common.index.IndexOutdatedException;
import org.modelio.vstore.exml.common.model.ObjId;

/**
 * Resource provider for repositories stored on an HTTP server,
 * or any {@link URL} for which {@link URL#openConnection()} will work.
 */
@objid ("a21ed4ef-0326-11e2-b5bf-001ec947ccaf")
public class UrlExmlResourceProvider implements IExmlResourceProvider {
    @objid ("e56cf358-37d7-11e2-920a-001ec947ccaf")
    private String auth;

    @objid ("c8a7c974-2827-4a4b-ba26-24acf628f7e9")
    private String name;

    @objid ("cf2a52c0-03e4-11e2-b5bf-001ec947ccaf")
    private URL url;

    @objid ("cf2a52c1-03e4-11e2-b5bf-001ec947ccaf")
    private URL modelUrl;

    @objid ("cf2a52c2-03e4-11e2-b5bf-001ec947ccaf")
    private Path localIndexDir;

    @objid ("4ecdca97-dd48-4c89-8d5a-5be7dc406ef9")
    private URL stampUrl;

    @objid ("32f3c5fd-b2cf-4c53-9498-c7a119427d82")
    private Path localIndexStampPath;

    /**
     * Compute HTTP authentification request property.
     * <p>
     * Look for user and password in the 'user' and 'pass' parameters.
     * If they are not filled, look at the URL itself.
     * @param url the URL to open
     * @param user the user login, may be null
     * @param pass the password, may be null
     * @return the HTTP authentification request property.
     */
    @objid ("e531590c-37d7-11e2-920a-001ec947ccaf")
    private static String computeHttpAuth(URL url, String user, String pass) {
        if (user != null && !user.isEmpty()) {
            String userInfo = user + ":" + (pass==null ? "" : pass);
            return "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(userInfo.getBytes());
        } else if (url.getUserInfo() != null) {
            return "Basic " + javax.xml.bind.DatatypeConverter.printBase64Binary(url.getUserInfo().getBytes());
        } else
            return null;
    }

    /**
     * Initialize the resource provider.
     * @param url the URL of the repository.
     * @param localDir a local directory to store the index.
     * @param user user name (optional)
     * @param passwd password (optional)
     */
    @objid ("bed4ba70-03f0-11e2-a7da-001ec947ccaf")
    public UrlExmlResourceProvider(URL url, Path localDir, String user, String passwd) {
        try {
            this.url = url;
            this.name = url.getFile();
        
            this.modelUrl = new URL(url.toString()+ "/"+IExmlRepositoryGeometry.MODEL_DIRNAME);
            this.stampUrl = new URL(url.toString()+ "/"+IStampGeometry.STAMP_DIR_NAME+"/"+IStampGeometry.STAMP_FILE_NAME);
        
            this.localIndexDir = localDir.resolve(IExmlRepositoryGeometry.INDEX_DIRNAME);
            this.localIndexStampPath = localDir.resolve(IStampGeometry.LOCAL_INDEX_STAMP_FILE);
            
            if (url.getUserInfo() != null || (user != null && !user.isEmpty()))
                this.auth = computeHttpAuth(url, user, passwd);
            
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @objid ("cf2cb503-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void buildIndexes(IModelioProgress monitor) throws IOException {
        try {
            checkLocalIndex();
        } catch (IndexOutdatedException e) {
            Log.trace(e);
        
            String msg = "Retrieving '"+getName()+"' indexes from '"+this.url+"' ...";
            
            Log.trace(msg);
            monitor.subTask(msg);
            
            boolean isLocalDir = Files.isDirectory(this.localIndexDir);
            if (isLocalDir)
                FileUtils.delete(this.localIndexDir);
        
            Files.createDirectories(this.localIndexDir);
        
            // Hard coded list of all files of a JDBM index
            final String[] files = new String[]{
                    "index.dbf.0", "index.dbf.t","index.dbr.0","index.dbr.t","index.idf.0","index.idf.t",
                    "index.idr.0", "index.idr.t"
            };
        
            Files.createDirectories(this.localIndexDir);
        
            for (String f : files) {
                // Assume the indexes are stored in the repository directory.
                URL indexUrl = new URL(this.url,IExmlRepositoryGeometry.INDEX_DIRNAME+"/"+f);
                try (InputStream is = openURL(indexUrl).getInputStream()) {
                    Path target = this.localIndexDir.resolve(f);
                    Files.copy(is, target, StandardCopyOption.REPLACE_EXISTING );
                }
            }
            
            Files.write(this.localIndexStampPath, getStamp().getBytes(StandardCharsets.UTF_8));
        }
    }

    @objid ("cf2cb50d-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void close() throws IOException {
        // nothing to do
    }

    @objid ("cf2cb510-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void commit() throws IOException {
        // nothing to do
    }

    @objid ("cf2cb52c-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public void createRepository() throws IOException {
        throw new AccessDeniedException(this.url.toString());
    }

    @objid ("cf2cb513-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public Collection<ExmlResource> getAllResources(IModelioProgress aMonitor) throws IOException {
        throw new AccessDeniedException(this.modelUrl.toString(),null, "Impossible to browse a distant repository.");
    }

    @objid ("97902339-12de-11e2-816a-001ec947ccaf")
    @Override
    public ExmlResource getLocalResource(ObjId cmsNodeId) {
        return new UrlResource(getLocalUrl(cmsNodeId), this.auth);
    }

    @objid ("cf2a52c7-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public ExmlResource getResource(ObjId id) throws IOException {
        return new UrlResource(getUrl(id), this.auth);
    }

    @objid ("cf2f1754-03e4-11e2-b5bf-001ec947ccaf")
    @Override
    public URI getURI() {
        try {
            return this.url.toURI();
        } catch (URISyntaxException e) {
            throw new Error(e);
        }
    }

    @objid ("5a6632a1-0724-11e2-9eb7-001ec947ccaf")
    @Override
    public boolean isWriteable() {
        return false;
    }

    @objid ("45d981a0-316f-4caa-9396-ae8778242722")
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @param name the repository name
     */
    @objid ("cb34844c-7cca-4431-b038-3e9f59e53ad6")
    public void setName(String name) {
        this.name = name;
    }

    @objid ("55ec3008-195d-47e5-9e86-071952f1e2ff")
    @Override
    public String getStamp() throws IOException {
        try (InputStream is = this.stampUrl.openStream()){
            return FileUtils.readWhole(is, "UTF-8");
        } catch (FileNotFoundException | NoSuchFileException e) {
            return "";
        }
    }

    @objid ("13465cbd-b804-446b-a0d7-94934c14776c")
    @Override
    public File getIndexAccessPath() {
        return this.localIndexDir.toFile();
    }

    @objid ("96bde3a2-7dd2-4198-8bb7-236387ff53de")
    @Override
    public void writeStamp() throws IOException {
        throw new AccessDeniedException(this.stampUrl.toString());
    }

    @objid ("2e6af0dd-04d2-4739-98bc-d889c4384e20")
    @Override
    public InputStream readBlob(String key) throws IOException {
        InputStream is = new UrlResource(getBlobUri(key), this.auth).read();
        try (CloseOnFail c = new CloseOnFail(is)) {
            // Read and discard blob info
            @SuppressWarnings("unused")
            IBlobInfo unused = BlobServices.readBlobInfo(is);
            c.success();
        }
        return is;
    }

    @objid ("9c8319ed-c716-46d8-ac05-42424b4cc35c")
    @Override
    public OutputStream writeBlob(IBlobInfo info) throws IOException {
        OutputStream os = new UrlResource(getBlobUri(info.getKey()), this.auth).write();
        try (CloseOnFail c = new CloseOnFail(os)) {
            BlobServices.write(info, os);
            c.success();
        }
        return os;
    }

    @objid ("16848dbd-38de-4942-8b63-2e57a7a484c0")
    private void checkLocalIndex() throws IndexOutdatedException {
        boolean islocalDir = Files.isDirectory(this.localIndexDir);
        if (! islocalDir)
            throw new IndexOutdatedException(this.getName()+" indexes not yet copied in '"+this.localIndexDir+"'.");
        
        try {
            String localStamp = readLocalStamp();
            if (! localStamp.equals(getStamp()))
                throw new IndexOutdatedException(getName()+" local index stamp outdated:\n"+
                        " - local index stamp: "+localStamp+"\n"+
                        " - remote repository stamp: "+getStamp());
        } catch (java.nio.file.NoSuchFileException e) {
            throw new IndexOutdatedException("No '"+this.localIndexStampPath+"' stamp file yet.");
        } catch (IOException e) {
            throw new IndexOutdatedException("Failed reading '"+this.localIndexStampPath+"': "+e.toString(), e);
        }
    }

    @objid ("9790233f-12de-11e2-816a-001ec947ccaf")
    private URL getLocalUrl(ObjId id) {
        try {
            return new URL(this.modelUrl.toString()+"/"+ id.classof.getName()+"/"+id.id+IExmlRepositoryGeometry.EXT_LOCAL_EXML);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @objid ("cf2cb4ff-03e4-11e2-b5bf-001ec947ccaf")
    private URL getUrl(ObjId id) {
        try {
            return new URL(this.modelUrl.toString()+"/"+ id.classof.getName()+"/"+id.id+IExmlRepositoryGeometry.EXT_EXML);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @objid ("e5315907-37d7-11e2-920a-001ec947ccaf")
    private URLConnection openURL(URL anUrl) throws IOException {
        URLConnection connection = anUrl.openConnection();
        if (this.auth != null && connection instanceof HttpURLConnection)
            connection.setRequestProperty("Authorization", this.auth);
        return connection;
    }

    @objid ("31b958cc-6395-4eb0-a41c-c1a0471f5f83")
    private String readLocalStamp() throws IOException, FileSystemException {
        try {
            return FileUtils.readWhole(this.localIndexStampPath, "UTF-8");
        } catch (NoSuchFileException e) {
            //TODO Compat with old stamp path, to remove later
            Path old = this.localIndexStampPath.getParent().resolve("index_stamp.conf");
            try {
                return FileUtils.readWhole(old, "UTF-8");
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    @objid ("12e34595-7548-4b51-864e-684d644265dc")
    private URL getBlobUri(String key) {
        try {
            return new URL(this.url.toString() + "/"+ BlobGeometry.getBlobPath(key));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @objid ("a5c7eb1b-fe18-4c60-92d5-8136313d3a7d")
    @Override
    public void deleteBlob(String blob) throws IOException {
        new UrlResource(getBlobUri(blob), this.auth).delete();
    }

    @objid ("281689db-1bb8-45a2-acb4-d2d63fd196d9")
    @Override
    public IBlobInfo readBlobInfo(String key) throws IOException {
        try (InputStream is = new UrlResource(getBlobUri(key), this.auth).read()) {
            return BlobServices.readBlobInfo(is);
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    /**
     * URL based resource.
     */
    @objid ("cf2cb51a-03e4-11e2-b5bf-001ec947ccaf")
    static class UrlResource implements ExmlResource {
        @objid ("e571b7fc-37d7-11e2-920a-001ec947ccaf")
        private String auth;

        @objid ("cf2cb51d-03e4-11e2-b5bf-001ec947ccaf")
        private URL url;

        @objid ("cf2cb51e-03e4-11e2-b5bf-001ec947ccaf")
        public UrlResource(URL url, String auth) {
            this.url = url;
            this.auth = auth;
        }

        @objid ("cf2cb521-03e4-11e2-b5bf-001ec947ccaf")
        @Override
        public InputStream read() throws IOException {
            try {
                return openURL().getInputStream();
            } catch (FileNotFoundException e) {
                Log.warning(e.toString());
                return null;
            }
        }

        /**
         * Returns an output stream that writes to this resource.
         * @return an output stream that writes to this resource.
         * @exception  IOException              if an I/O error occurs while
         * creating the output stream.
         * @exception  UnknownServiceException  if the protocol does not support
         * output.
         */
        @objid ("cf2cb526-03e4-11e2-b5bf-001ec947ccaf")
        @Override
        public OutputStream write() throws IOException {
            URLConnection conn = openURL();
            conn.setDoOutput(true);
            return conn.getOutputStream();
        }

        @objid ("97902345-12de-11e2-816a-001ec947ccaf")
        @Override
        public void delete() throws IOException {
            throw new AccessDeniedException(this.url.toString());
        }

        @objid ("92b17235-2cd2-11e2-81f1-001ec947ccaf")
        @Override
        public String getPublicLocation() {
            return this.url.toString();
        }

        @objid ("e533bb61-37d7-11e2-920a-001ec947ccaf")
        private URLConnection openURL() throws IOException {
            URLConnection connection = this.url.openConnection();
            if (this.auth != null && connection instanceof HttpURLConnection)
                connection.setRequestProperty("Authorization", this.auth);
            return connection;
        }

    }

}
