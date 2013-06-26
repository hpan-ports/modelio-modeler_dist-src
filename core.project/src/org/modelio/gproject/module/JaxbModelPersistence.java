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
                                    

package org.modelio.gproject.module;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.jaxbmodel.JxbModule;

/**
 * Service class to load or save a module JAXB model to a file.
 */
@objid ("60b7d124-f1fc-11e1-8543-001ec947ccaf")
public class JaxbModelPersistence {
    /**
     * Load a JAXB model
     * @param moduleXmlFile the module.xml file path
     * @return the JAXB module
     * @throws java.io.IOException in case of failure.
     */
    @objid ("b38b2cc5-f27f-11e1-8543-001ec947ccaf")
    public static JxbModule loadJaxbModel(final Path moduleXmlFile) throws IOException {
        try (InputStream inputStream = Files.newInputStream(moduleXmlFile)){
            String packageName = JxbModule.class.getPackage().getName();
            JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            
            return (JxbModule) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            throw new IOException(e);
        }
    }

    /**
     * Save the JAXB model to a file.
     * @param module the JAXB module model to save.
     * @param moduleXmlFile the module.xml file path
     * @throws java.io.IOException in case of failure.
     */
    @objid ("82033481-f366-11e1-85f6-002564c97630")
    public static void saveJaxbModel(final JxbModule module, final Path moduleXmlFile) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(moduleXmlFile)){
            String packageName = JxbModule.class.getPackage().getName();
            JAXBContext jaxbContext = JAXBContext.newInstance(packageName);
            Marshaller marshaller = jaxbContext.createMarshaller();
            
            marshaller.marshal(module, outputStream);
        } catch (JAXBException e) {
            throw new IOException(e);
        }
    }

}
