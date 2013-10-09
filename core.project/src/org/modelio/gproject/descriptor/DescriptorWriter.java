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
                                    

package org.modelio.gproject.descriptor;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.fragment.IProjectFragment;
import org.modelio.gproject.gproject.GProject;
import org.modelio.gproject.gproject.ProjectType;
import org.modelio.vbasic.xml.CloseableXMLStreamWriter;

/**
 * Serialize a {@link GProject}, a {@link IProjectFragment} or a project
 * descriptor in a XML file.
 */
@objid ("5ce5d428-b006-4b5e-9d44-bbb936e1de46")
public class DescriptorWriter {
    @objid ("6de7ed36-6d2c-48d0-91f7-13363e54e8de")
    private boolean withScope = true;

    @objid ("f5fc95ef-d84d-45c5-9888-e9a796eda3a7")
    private XMLStreamWriter out;

    @objid ("d7dbaec3-197b-4add-8cda-4f085d5e0e8c")
    private Path projectFilePath = null;

    /**
     * Save the project descriptor to a file.
     * @param d the descriptor to save
     * @param projectFile the project configuration file.
     * @throws java.io.IOException in case of failure.
     */
    @objid ("73827892-75e0-433d-82ef-37263bd86eaf")
    public void write(final ProjectDescriptor d, final Path projectFile) throws IOException {
        this.projectFilePath = projectFile;
        
        try (OutputStream fileWriter = new BufferedOutputStream(Files.newOutputStream(projectFile));
                CloseableXMLStreamWriter cout = new CloseableXMLStreamWriter(fileWriter, true)) {
            this.out = cout.getW();
            this.out.writeStartDocument();
            this.out.writeComment("GENERATED FILE, PLEASE DO NOT EDIT!!!");
        
            write(d);
        
            this.out.writeEndDocument();
        
        } catch (FactoryConfigurationError e) {
            throw new IOException(e);
        } catch (XMLStreamException e) {
            throw new IOException(e);
        } finally {
            this.out = null;
            this.projectFilePath = null;
        }
    }

    /**
     * Set whether the scope is saved.
     * <p>
     * The scope is saved by default.
     * @param withScope <code>true</code> to save the scope, <code>false</code> to ignore it.
     */
    @objid ("1bd19cb5-e4e5-48fb-82a6-397cb1736606")
    public void setWithScope(boolean withScope) {
        this.withScope = withScope;
    }

    @objid ("e720b3df-4e64-4aec-bbbd-04d5da3baad6")
    private void writeFragmentDescriptor(final FragmentDescriptor f) throws XMLStreamException {
        this.out.writeStartElement("fragment");
        this.out.writeAttribute("id", f.getId());
        if (f.getScope() != null) {
            URI uri = getRelativeUri(f.getUri());
            this.out.writeAttribute("uri", uri == null ? "" : uri.toString());
            this.out.writeAttribute("type", f.getType().toString());
            writeScope(f.getScope());
        }
        
        writeAuth(f.getAuthDescriptor());        
        writeProperties(f.getProperties());
        
        this.out.writeEndElement();
    }

    @objid ("21e3cece-e523-4837-afa5-eb1639c0a26f")
    private void writeProperties(final GProperties gProperties) throws XMLStreamException {
        this.out.writeStartElement("properties");
        
        ArrayList<String> keys = new ArrayList<>(gProperties.keys());
        Collections.sort(keys);
        
        for (String key : keys) {
            GProperties.Entry e = gProperties.getProperty(key);
            this.out.writeEmptyElement("prop");
            this.out.writeAttribute("name", e.getName());
            this.out.writeAttribute("value", e.getValue());
            writeScope(e.getScope());
        }
        this.out.writeEndElement();
    }

    @objid ("d5e40bff-7e46-46e4-ae6e-c8083bd2dd36")
    private void write(final ProjectDescriptor projectDescriptor) throws XMLStreamException {
        this.out.writeStartElement("project");
        this.out.writeAttribute("name", projectDescriptor.getName());
        this.out.writeAttribute("version", String.valueOf(ProjectDescriptor.serialVersionUID));
        this.out.writeAttribute("type", String.valueOf(projectDescriptor.getType()));
        
        // If the project path does not contain the project configuration file path,
        // store the project path.
        if (! projectDescriptor.getPath().startsWith(this.projectFilePath.getParent())) {
            this.out.writeAttribute("path", projectDescriptor.getPath().toString());
        }
        
        if (!ProjectType.LOCAL.toString().equals(projectDescriptor.getType())) {
            // Write remote location
            this.out.writeAttribute("remote", projectDescriptor.getRemoteLocation());
        }
        
        // Write authentication data
        writeAuth(projectDescriptor.getAuthDescriptor());
        
        // Write fragments
        for (FragmentDescriptor f : projectDescriptor.getFragments()) {
            writeFragmentDescriptor(f);
        }
        
        for (ModuleDescriptor m : projectDescriptor.getModules()) {
            writeModuleDescriptor(m);
        }
        
        writeProperties(projectDescriptor.getProperties());
        
        this.out.writeEndElement();
    }

    @objid ("c537d568-cc07-4145-8a7d-7bae14178ed6")
    private void writeModuleDescriptor(final ModuleDescriptor m) throws XMLStreamException {
        this.out.writeStartElement("module");
        this.out.writeAttribute("name", m.getName());
        if (m.getScope() != null) {
            this.out.writeAttribute("version", m.getVersion().toString());
            this.out.writeAttribute("archive", m.getArchiveLocation().toString());
            this.out.writeAttribute("activated", Boolean.toString(m.isActivated()));
            writeScope(m.getScope());
        }
        
        writeAuth(m.getAuthDescriptor());
        writeProperties(m.getParameters());
        
        this.out.writeEndElement();
    }

    @objid ("fc5486c9-8e48-4a9d-b91e-2aaa8de26a38")
    private void writeScope(DefinitionScope scope) throws XMLStreamException {
        if (this.withScope && scope != null)
            this.out.writeAttribute("scope", scope.name());
    }

    @objid ("98991996-84be-43d6-b0c7-bbe3093dafc7")
    private URI getRelativeUri(URI uri) {
        if (uri == null)
            return null;
        else
            return this.projectFilePath.getParent().toUri().relativize(uri);
    }

    @objid ("83854f76-02cb-4f26-b008-ea3fe1fe5d0c")
    private void writeAuth(AuthDescriptor auth) throws XMLStreamException {
        if (auth != null && auth.getScheme()!=null) {
            this.out.writeStartElement("auth");
            this.out.writeAttribute("scheme", auth.getScheme());
            writeScope(auth.getScope());
            
            for (Entry<String, String> e : auth.getData().serialize().entrySet()) {
                this.out.writeEmptyElement("prop");
                this.out.writeAttribute("name", e.getKey());
                this.out.writeAttribute("value", e.getValue());
            }
            
            this.out.writeEndElement();
        }
    }

}
