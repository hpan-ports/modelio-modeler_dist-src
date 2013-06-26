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
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.xmi.util.ReverseProperties;

@objid ("f498a70d-d18a-4381-bf63-24990024e467")
public class ESubstitution extends ENamedElement implements IEElement {
    @objid ("5c52bf95-fb0f-4487-acf4-5eff29a3b7fb")
    private org.eclipse.uml2.uml.Substitution ecoreElement;

    @objid ("252823a6-6fb5-416b-a96b-f9e1ad83beb6")
    public Element createObjingElt() {
        return Modelio.getInstance()
                .getModelingSession().getModel().createSubstitution();
    }

    @objid ("d91e6b6e-d32e-4644-ba0d-2d1c031a0cfe")
    public ESubstitution(org.eclipse.uml2.uml.Substitution element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("c3943c80-b94e-401b-88d4-01bbe4d40f2b")
    public void attach(Element objingElt) {
        //  take the model map
        ReverseProperties revProp = ReverseProperties.getInstance();
                
        //  take the ecore Imported and Importing
        org.eclipse.uml2.uml.Classifier ecoreContract = ecoreElement.getContract();
        org.eclipse.uml2.uml.Classifier ecoreClassifier =  (org.eclipse.uml2.uml.Classifier) ecoreElement.getClients()
                .get(0);
                
        Classifier objingContract = (Classifier) revProp
                .getMappedElement(ecoreContract);
        Classifier objingClassifier = (Classifier) revProp
                .getMappedElement(ecoreClassifier);
                
        //  set to the objingElt Imported Importing previousely find
        if (objingContract != null && objingClassifier != null) {
            Substitution objingRImport = (Substitution) objingElt;
            objingRImport.setContract(objingContract);
            objingRImport.setSubstitutingClassifier(objingClassifier);
        }
    }

    @objid ("18e5cfd3-4f52-47ef-b552-d23d951b0857")
    public void attach(List<Object> objingElts) {
    }

    @objid ("49f0aaef-b5b2-4795-858d-ec2a41a9c885")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
