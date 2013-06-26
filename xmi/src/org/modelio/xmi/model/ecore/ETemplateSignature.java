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
                                    

package org.modelio.xmi.model.ecore;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("c564792d-5160-424c-bb5a-53ca0befb1a6")
public class ETemplateSignature extends EElement implements IEElement {
    @objid ("0eb36f44-055b-4bd3-9d91-f64081703927")
    private org.eclipse.uml2.uml.TemplateSignature ecoreElement;

    @objid ("280ed59f-a602-46ba-96f5-77b551ff8648")
    public Element createObjingElt() {
        if (ObjingEAnnotation.isDeleted(ecoreElement)){
            return null;
        }else{
            org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
            Object objingOwner =  ReverseProperties.getInstance().getMappedElement(ecoreOwner);
            if ((objingOwner instanceof Classifier)  && !(objingOwner instanceof Enumeration)){
                Operation result = Modelio.getInstance().getModelingSession().getModel().createOperation();
        
                    result.getExtension().add(Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                            IModelerModuleStereotypes.UML2TEMPLATESIGNATURE, result.getMClass()));
        
                
                return result;
            }
            return null;
        }
    }

    @objid ("3aadecd8-a551-4b9f-a38f-a7247d60d739")
    public ETemplateSignature(org.eclipse.uml2.uml.TemplateSignature element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("6b3fcfa4-f069-4db9-b437-221c7cc89f62")
    public void attach(Element objingElt) {
    }

    @objid ("e1ad28b2-ddf8-406b-a4b8-af2c5db53b38")
    public void attach(List<Object> objingElts) {
    }

    @objid ("f692bb22-f3ef-4984-8dfc-407ebf159438")
    public void setProperties(Element objingElt) {
    }

}
