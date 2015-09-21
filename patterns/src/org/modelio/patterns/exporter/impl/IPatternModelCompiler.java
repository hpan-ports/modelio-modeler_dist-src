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


package org.modelio.patterns.exporter.impl;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.patterns.model.RuntimePattern;

@objid ("0cdd9c0b-6a9a-4412-b48f-3225487ef9af")
public interface IPatternModelCompiler {
    @objid ("273ebdb9-98ed-4aad-b3ee-382ef2a4d0f4")
    void exportPattern(RuntimePattern pattern) throws IOException, JAXBException;

}
