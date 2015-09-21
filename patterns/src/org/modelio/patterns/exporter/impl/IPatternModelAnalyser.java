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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.patterns.exporter.PatternModelAnalysis;

@objid ("f1a25876-e0fb-4565-a3f8-e9a12ff5dc13")
public interface IPatternModelAnalyser {
    @objid ("66d400d2-eb34-44f8-826a-bac5d10b220d")
    PatternModelAnalysis runAnalysis(Package modelPattern) throws IOException;

}
