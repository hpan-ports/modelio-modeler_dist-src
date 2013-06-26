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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.reverse.PartialImportMap;
import org.modelio.xmi.reverse.TotalImportMap;
import org.modelio.xmi.util.IModelerModuleStereotypes;
import org.modelio.xmi.util.ReverseProperties;

@objid ("76672489-f872-456a-8b03-95d3eb23180a")
public class EReception extends EBehavioralFeature implements IEElement {
    @objid ("7903628f-4cd5-4cf5-b2b1-f85fe31c25e2")
    public Element createObjingElt() {
        Operation operation = Modelio.getInstance().getModelingSession().getModel().createOperation();
        
        Stereotype ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(
                IModelerModuleStereotypes.UML2RECEPTION, operation.getMClass());
        operation.getExtension().add(ster);
        return operation;
    }

    @objid ("c14d5829-b582-4ac4-bd63-e6f51fb0a031")
    public EReception(org.eclipse.uml2.uml.Reception element) {
        super(element);
    }

    @objid ("2268bed0-cb95-4452-8be0-91fa80ebdca4")
    @Override
    public void attach(Element objingElt) {
        //        if (objingElt != null) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        org.eclipse.uml2.uml.Reception ecoreElement =  (org.eclipse.uml2.uml.Reception) getEcoreElement();
        org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
        Element objingOwner = (Element) revProp
                .getMappedElement(ecoreOwner);
        
        if ((objingOwner instanceof Classifier)  && !(objingOwner instanceof Enumeration))
            ((Operation) objingElt).setOwner((Classifier) objingOwner);
        
        else {
            PartialImportMap.getInstance().remove(ecoreElement);
            TotalImportMap.getInstance().remove(ecoreElement);
            objingElt.delete();
        }
        //        }
    }

    @objid ("9bb8e602-0324-4056-9fef-3e77f15c3518")
    public void attach(List<Object> objingElts) {
    }

    @objid ("b264e5a3-3bbc-44bc-a082-d05a17cf48dc")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setSignal((Operation) objingElt);
    }

    @objid ("443d3281-5d3b-4575-a6de-fe12968df304")
    private void setSignal(Operation objingElt) {
        org.eclipse.uml2.uml.Signal ecoreSignal = ( (org.eclipse.uml2.uml.Reception) getEcoreElement()).getSignal();
        if (ecoreSignal != null){
            Element objSignal = (Element) ReverseProperties.getInstance().getMappedElement(ecoreSignal);
            if ((objSignal != null) && (objSignal instanceof Signal)){
                objingElt.getSRepresentation().add((Signal)objSignal);
            }
        }
    }

}
