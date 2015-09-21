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


package org.modelio.patterns.catalog.gui;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.patterns.api.IPatternRepository;
import org.modelio.patterns.model.RuntimePattern;

@objid ("efa5ce22-9066-4361-ae6d-e518cac9f642")
public class PatternCatalogData {
    @objid ("42354ccf-0965-49e9-b953-07b4328efc98")
    private RuntimePattern selectedPattern;

    @objid ("1bdb1ad0-5c2d-4a6e-b005-7865f1dd244f")
    private IPatternRepository repository;

    @objid ("5f4aab61-49d8-4ea1-979f-58741f06604b")
    public PatternCatalogData(IPatternRepository repository) {
        this.selectedPattern = null;
        
        this.repository = repository;
    }

    @objid ("3cb242a3-e755-4322-bcf2-bc91848cb375")
    public RuntimePattern getSelectedPattern() {
        return this.selectedPattern;
    }

    @objid ("e52e38d7-f8f9-4232-892d-d9ea2f3985cb")
    public void setSelectedPattern(RuntimePattern selectedPattern) {
        this.selectedPattern = selectedPattern;
    }

    @objid ("d3462826-acfd-461b-9791-5921647a55ef")
    public IPatternRepository getRepository() {
        return this.repository;
    }

}
