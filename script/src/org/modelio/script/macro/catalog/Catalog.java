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
                                    

package org.modelio.script.macro.catalog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.script.plugin.Script;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Represents a catalog of macros.
 * <p>
 * There are 3 available catalogs for a given project:
 * <ul>
 * <li>The project catalog, stored in the <i>/.config/macro</i> directory. It is available and modifiable only in the opened
 * project.</li>
 * <li>The workspace catalog available and modifiable for all the projects</li>
 * <li>The Modelio catalog, non modifiable but available for all projects.</li>
 * </ul>
 */
@objid ("008f9166-b6e0-106a-bf4f-001ec947cd2a")
public class Catalog {
    /**
     * Catalog name.
     */
    @mdl.prop
    @objid ("0035502a-ead5-106a-bf4f-001ec947cd2a")
    private final String name;

    @objid ("008f9404-b6e0-106a-bf4f-001ec947cd2a")
    private final List<ScriptMacro> macros = new ArrayList<ScriptMacro>();

    /**
     * The base location of all scripts. Must be a directory.
     */
    @mdl.prop
    @objid ("008f953a-b6e0-106a-bf4f-001ec947cd2a")
    private Path path = null;

    @objid ("008f9b3e-b6e0-106a-bf4f-001ec947cd2a")
    public Catalog(String name, Path aPath) {
        this.name = name;
        this.path = aPath;
        
        CatalogReader reader = new CatalogReader();
        
        try {
            reader.loadCatalog(aPath, this);
        } catch (IOException e) {
            Script.LOG.error(e);
        }
    }

    /**
     * Add a macro to the catalog.
     * @param macro the macro to add.
     */
    @objid ("008f9850-b6e0-106a-bf4f-001ec947cd2a")
    public void addMacro(ScriptMacro macro) {
        this.macros.add(macro);
    }

    /**
     * Get the macros in the catalog.
     * @return the stored macros.
     */
    @objid ("008f9792-b6e0-106a-bf4f-001ec947cd2a")
    public List<ScriptMacro> getMacros() {
        return Collections.unmodifiableList(this.macros);
    }

    /**
     * Get the catalog name.
     * @return the name
     */
    @objid ("008f9986-b6e0-106a-bf4f-001ec947cd2a")
    public String getName() {
        return this.name;
    }

    /**
     * Get the catalog base path. The base path is the location where all macros should be stored.
     * @return the catalog base path.
     */
    @objid ("008f9bd4-b6e0-106a-bf4f-001ec947cd2a")
    public Path getPath() {
        return this.path;
    }

    /**
     * The catalog is modifiable if the file is modifiable or can be created.
     * @return whether the catalog is modifiable.
     */
    @objid ("008f9aa8-b6e0-106a-bf4f-001ec947cd2a")
    public boolean isModifiable() {
        if (this.path == null) {
            return true;
        }
        
        try {
            File aPath = this.path.toFile();
            if (aPath.isFile()) {
                return aPath.canWrite();
            } else {
                File dir = null;
                for (dir = aPath.getParentFile(); dir != null && !dir.isDirectory(); dir = dir.getParentFile()) {
                    ;
                }
                return dir == null || dir.canWrite();
        
            }
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    @objid ("002e1c6a-ead5-106a-bf4f-001ec947cd2a")
    public void save() {
        CatalogWriter catalogWriter = new CatalogWriter();
        try {
            catalogWriter.writeCatalog(this);
        } catch (XMLStreamException e) {
            Script.LOG.error(e);
        } catch (IOException e) {
            Script.LOG.error(e);
        }
    }

    @objid ("0026032c-fb5e-106b-bf4f-001ec947cd2a")
    private static Path getLocalMacroFile(Catalog catalog, ScriptMacro macro) {
        return catalog.getPath().resolve(macro.getRelativePath().getFileName());
    }

    /**
     * Remove the macro from the catalog.
     * @param macro a macro owned by the catalog.
     */
    @objid ("00269ada-fb5e-106b-bf4f-001ec947cd2a")
    public void removeMacro(ScriptMacro macro) {
        this.macros.remove(macro);
    }

    @objid ("0010ac98-e6fb-106a-bf4f-001ec947cd2a")
    private static class CatalogReader {
        @objid ("0010be18-e6fb-106a-bf4f-001ec947cd2a")
        private Path path;

        @objid ("0010c49e-e6fb-106a-bf4f-001ec947cd2a")
        private File catalogFile;

        @objid ("0010cb7e-e6fb-106a-bf4f-001ec947cd2a")
        private Catalog catalog;

        @objid ("0010d150-e6fb-106a-bf4f-001ec947cd2a")
        public CatalogReader() {
        }

        @objid ("0010df06-e6fb-106a-bf4f-001ec947cd2a")
        public void loadCatalog(Path path, Catalog catalog) throws IOException {
            // catalog path and file
            this.path = path;
            this.catalogFile = new File(this.path.toFile(), ".catalog");
            this.catalog = catalog;
            
            if (!this.catalogFile.exists()) {
                return;
            }
            
            try {
                DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
                DocumentBuilder b = f.newDocumentBuilder();
                Document doc = b.parse(this.catalogFile);
            
                readCatalog(doc.getDocumentElement());
            
            } catch (SAXParseException e) {
                throw new IOException(Script.I18N.getMessage("Catalog.Error.SAXParseException", String.valueOf(e.getLineNumber()),
                        String.valueOf(e.getColumnNumber()), e.getLocalizedMessage()), e);
            } catch (SAXException e) {
                throw new IOException(e.getLocalizedMessage(), e);
            } catch (ParserConfigurationException e) {
                throw new IOException(e.getLocalizedMessage(), e);
            }
        }

        @objid ("0010f6e4-e6fb-106a-bf4f-001ec947cd2a")
        private void readCatalog(Element domElement) {
            NodeList childs = domElement.getChildNodes();
            for (int i = 0, nb = childs.getLength(); i < nb; i++) {
                Node node = childs.item(i);
                if (node.getNodeName().equals("script")) {
                    this.catalog.addMacro(readMacro(this.catalog, (Element) node));
                }
            }
        }

        @objid ("00110972-e6fb-106a-bf4f-001ec947cd2a")
        private ScriptMacro readMacro(Catalog cat, Element domElement) {
            ScriptMacro macro = new ScriptMacro(cat);
            macro.setName(domElement.getAttribute("name"));
            macro.setRelativePath(Paths.get(domElement.getAttribute("path")));
            
            macro.setShowInContextualMenu(Boolean.parseBoolean(domElement.getAttribute("show-menu")));
            macro.setShowInToolbar(Boolean.parseBoolean(domElement.getAttribute("show-toolbar")));
            
            final String s = domElement.getAttribute("icon-path");
            if (s == null || s.isEmpty()) {
                macro.setIconRelativePath(null);
            } else {
                macro.setIconRelativePath(Paths.get(s));
            }
            
            NodeList childs = domElement.getChildNodes();
            for (int i = 0, nb = childs.getLength(); i < nb; i++) {
                Node node = childs.item(i);
                if (node.getNodeName().equals("description")) {
                    // System.out.println(" description='"+String.valueOf(node.getTextContent())+"'");
                    String content = node.getTextContent();
                    if (content != null) {
                        macro.setDescription(content);
                    }
                } else if (node.getNodeName().equals("metaclass")) {
                    final String classname = ((Element) node).getAttribute("name");
                    macro.addMetaclass(classname);
                }
            }
            return macro;
        }

    }

    @objid ("0002e25c-eae6-106a-bf4f-001ec947cd2a")
    public class CatalogWriter {
        @objid ("0002e3d8-eae6-106a-bf4f-001ec947cd2a")
         OutputStream output;

        @objid ("0002e568-eae6-106a-bf4f-001ec947cd2a")
         Catalog catalog;

        @objid ("0002e69e-eae6-106a-bf4f-001ec947cd2a")
        public CatalogWriter() {
        }

        @objid ("0002e770-eae6-106a-bf4f-001ec947cd2a")
        public void writeCatalog(Catalog aCatalog) throws XMLStreamException, IOException {
            this.catalog = aCatalog;
            
            try {
                Path catalogFile = this.catalog.getPath().resolve(".catalog");
            
                if (!Files.exists(catalogFile.getParent())) {
                    Files.createDirectories(catalogFile.getParent());
                }
            
                if (!Files.exists(catalogFile)) {
                    Files.createFile(catalogFile);
                }
            
                try (OutputStream stream = new FileOutputStream(catalogFile.toFile())) {
                    XMLOutputFactory of = XMLOutputFactory.newInstance();
                    XMLStreamWriter writer = of.createXMLStreamWriter(stream);
                    writer.writeStartDocument();
                    writeCatalog(this.catalog, writer);
                    writer.writeEndDocument();
                    writer.close();
                }
            
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @objid ("0002e806-eae6-106a-bf4f-001ec947cd2a")
        private void writeCatalog(Catalog c, XMLStreamWriter writer) throws XMLStreamException {
            writer.writeStartElement("catalog");
            writer.writeCharacters("\n");
            
            for (ScriptMacro s : c.getMacros()) {
                writer.writeStartElement("script");
                writer.writeAttribute("name", s.getName());
                writer.writeAttribute("path", s.getRelativePath().toString());
                writer.writeAttribute("icon-path", getIconRelativePath(s));
                writer.writeAttribute("show-menu", String.valueOf(s.shownInContextualMenu()));
                writer.writeAttribute("show-toolbar", String.valueOf(s.shownInToolbar()));
            
                writer.writeCharacters("\n");
            
                writer.writeStartElement("description");
                if (s.getDescription() != null) {
                    writer.writeCharacters(s.getDescription());
                }
                writer.writeEndElement();
                writer.writeCharacters("\n");
            
                for (String metaclass : s.getMetaclasses()) {
                    writer.writeStartElement("metaclass");
                    writer.writeAttribute("name", metaclass);
                    writer.writeEndElement();
                    writer.writeCharacters("\n");
                }
            
                writer.writeEndElement();
                writer.writeCharacters("\n");
            
            }
            
            writer.writeEndElement();
        }

        @objid ("0002e8b0-eae6-106a-bf4f-001ec947cd2a")
        private String getIconRelativePath(ScriptMacro s) {
            Path p = s.getIconRelativePath();
            if (p == null) {
                return "";
            } else {
                return p.toString();
            }
        }

    }

}
