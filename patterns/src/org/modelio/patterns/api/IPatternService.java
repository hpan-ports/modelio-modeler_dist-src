/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.api;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.patterns.model.RuntimePattern;

/**
 * Defines services offered by the Patterns plugin.
 */
@objid ("6cff23d5-b25d-4b03-91fd-00cd4b7711e1")
public interface IPatternService {
    /**
     * Export a pattern.
     * @param pattern the pattern to export.
     * @throws javax.xml.bind.JAXBException when the pattern metadatas are invalid.
     * @throws java.io.IOException when the pattern can't be read.
     */
    @objid ("196087f9-a115-4c62-b919-6733aae3e06b")
    void exportPattern(RuntimePattern pattern) throws IOException, JAXBException;

    /**
     * Get the project's pattern catalog.
     * @return the pattern catalog. Should be <code>null</code> when no project is opened.
     */
    @objid ("b21e3d18-54cf-4992-8c9e-f81720eea83e")
    IPatternRepository getCatalog();

}
