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
                                    

package org.modelio.app.project.core.creation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Project template.
 * 
 * @author phv
 */
@objid ("00449152-cc35-1ff2-a7f4-001ec947cd2a")
public class ProjectType {
    @objid ("0044c352-cc35-1ff2-a7f4-001ec947cd2a")
    private boolean hasInitModel = false;

    @objid ("0046b950-cc35-1ff2-a7f4-001ec947cd2a")
    private String description = "";

    @objid ("0046ba54-cc35-1ff2-a7f4-001ec947cd2a")
    private String label = null;

    @objid ("0046bb4e-cc35-1ff2-a7f4-001ec947cd2a")
    private String name = null;

    @objid ("0046bc52-cc35-1ff2-a7f4-001ec947cd2a")
    private String summary = "";

    @objid ("0046bd4c-cc35-1ff2-a7f4-001ec947cd2a")
    private List<String> mdacs = new ArrayList<>();

    @objid ("0044dcd4-cc35-1ff2-a7f4-001ec947cd2a")
    private File file = null;

    /**
     * Build a minimalist ProjectType with only a name and a list of modules.
     * Minimalist ProjectType are not suited for GUI purposes but rather for
     * internal programming.
     * @param name Project type name.
     * @param mdacs name of the modules to deploy
     */
    @objid ("004708ce-cc35-1ff2-a7f4-001ec947cd2a")
    public ProjectType(final String name, final String[] mdacs) {
        this.name = name;
        this.description = "";
        this.hasInitModel = false;
        this.file = null;
        this.label = name;
        this.summary = "";
        
        for (String mdacName : mdacs) {
            this.mdacs.add(mdacName);
        }
    }

    /**
     * Build a full ProjectType from a file describing it.
     * <p>
     * The given file must be a zipped file containing a "template.xml" and
     * optionally a "init.ofpx" database containing the initial model. Full
     * ProjectType are well-suited for GUI purposes as they provide label,
     * description and so on.
     * @param file the project type content. Must be a zipped file.
     */
    @objid ("00470964-cc35-1ff2-a7f4-001ec947cd2a")
    public ProjectType(final File file) {
        this.file = file;
        try (ZipFile zipFile = new ZipFile(file);) {
        
            ZipEntry manifestEntry = zipFile.getEntry("template.xml");
            ZipEntry initEntry = zipFile.getEntry("init.ofpx");
        
            try (InputStream input = zipFile.getInputStream(manifestEntry);) {
        
                // Create a DocumentBuilderFactory
                DocumentBuilderFactory dbf = DocumentBuilderFactory
                        .newInstance();
                dbf.setNamespaceAware(true);
                dbf.setXIncludeAware(false);
                // dbf.setSchema(schema);
                dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, false);
        
                // Create a DocumentBuilder
                DocumentBuilder db = dbf.newDocumentBuilder();
        
                // Parse
                // db.setErrorHandler(parserAPIUsage);
                Document xmlDoc = db.parse(input);
        
                // get the Manifest version
                Node projectTypeNode = xmlDoc.getDocumentElement();
        
                Element projectTypeElement = (Element) projectTypeNode;
        
                this.name = projectTypeElement.getAttribute("name");
                this.label = projectTypeElement.getAttribute("label");
                this.summary = projectTypeElement.getAttribute("summary");
                this.hasInitModel = initEntry != null;
        
                // Get description:
                // -----------------
                NodeList descriptionNodes = xmlDoc.getDocumentElement()
                        .getElementsByTagName("description");
                if (descriptionNodes.getLength() == 1) {
                    StringBuffer descriptionBuffer = new StringBuffer();
                    Node descriptionNode = descriptionNodes.item(0);
                    NodeList childrenNodes = descriptionNode.getChildNodes();
                    for (int i = 0; i < childrenNodes.getLength(); i++) {
                        Node item = childrenNodes.item(i);
                        descriptionBuffer.append(item.getNodeValue());
        
                        if (i > 0) {
                            descriptionBuffer.append("\n");
                        }
                    }
                    this.description = descriptionBuffer.toString();
                }
        
                // Get modules:
                // -----------
                NodeList mdacsNodes = xmlDoc.getDocumentElement()
                        .getElementsByTagName("mdac");
                for (int i = 0; i < mdacsNodes.getLength(); i++) {
                    Node mdacNode = mdacsNodes.item(i);
                    if (mdacNode instanceof Element) {
                        Element mdacElement = (Element) mdacNode;
                        String mdacName = mdacElement.getAttribute("name");
                        if (mdacName != null && !mdacName.equals("")) {
                            this.mdacs.add(mdacName);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return the description.
     */
    @objid ("004709fa-cc35-1ff2-a7f4-001ec947cd2a")
    public String getDescription() {
        return this.description;
    }

    /**
     * @return the project content file.
     */
    @objid ("0044d964-cc35-1ff2-a7f4-001ec947cd2a")
    public File getFile() {
        return this.file;
    }

    /**
     * @return the project type label.
     */
    @objid ("0044d9fa-cc35-1ff2-a7f4-001ec947cd2a")
    public String getLabel() {
        return this.label;
    }

    /**
     * @return the modules to deploy
     */
    @objid ("0044d82e-cc35-1ff2-a7f4-001ec947cd2a")
    public List<String> getMdacs() {
        return this.mdacs;
    }

    /**
     * @return The project type name.
     */
    @objid ("0044d8ce-cc35-1ff2-a7f4-001ec947cd2a")
    public String getName() {
        return this.name;
    }

    /**
     * @return the summary.
     */
    @objid ("004732d6-cc35-1ff2-a7f4-001ec947cd2a")
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return true if the project type has an initial model.
     */
    @objid ("0047336c-cc35-1ff2-a7f4-001ec947cd2a")
    public boolean hasInitModel() {
        return this.hasInitModel;
    }

}
