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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.xmi.util.ReverseProperties;

@objid ("3b1b7af7-4297-4594-a3f9-da6d2d40cc9e")
public class EInterfaceRealization extends ENamedElement implements IEElement {
    @objid ("184aa42a-8951-4e19-a376-dfa0d28a09b4")
    private org.eclipse.uml2.uml.InterfaceRealization ecoreElement;

    @objid ("f549897f-4674-4a03-a333-0c6ad5d96746")
    public Element createObjingElt() {
        if ((ecoreElement.getClients().size() > 0) && (ecoreElement.getClients().get(0) instanceof org.eclipse.uml2.uml.Port))
            return Modelio.getInstance().getModelingSession().getModel().createProvidedInterface();
        else if (((ecoreElement.getClients().size() > 0) && (ecoreElement.getClients().get(0) instanceof Interface))
                || (ecoreElement.getContract() != null))
            return  Modelio.getInstance().getModelingSession().getModel().createInterfaceRealization();
        else 
            return null;
    }

    @objid ("266b5e3b-8a9a-492e-8b73-6acc8272ce7d")
    public EInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("4985b7f6-8122-451e-b72b-7308055900d9")
    public void attach(Element objingElt) {
        //  take the ecore Imported and Importing
        org.eclipse.uml2.uml.Interface ecoreContract = ecoreElement.getContract();
        org.eclipse.uml2.uml. BehavioredClassifier ecoreClassifier = ecoreElement
        .getImplementingClassifier();
        
        boolean attached = false;
        if (ecoreContract != null && ecoreClassifier != null) {
            Interface objingContract = (Interface) ReverseProperties.getInstance()
            .getMappedElement(ecoreContract);
            NameSpace objingClassifier = (NameSpace) ReverseProperties.getInstance()
            .getMappedElement(ecoreClassifier);
        
            //  set to the objingElt Imported Importing previousely find
            if (objingContract != null && objingClassifier != null) {
                InterfaceRealization objingRImport = (InterfaceRealization) objingElt;
                objingRImport.setImplementer(objingClassifier);
                objingRImport.setImplemented(objingContract);
                attached = true;
            }
        }
        
        if ((ecoreElement.getClients().get(0) instanceof org.eclipse.uml2.uml.Port)){
            Port objPort = (Port) ReverseProperties.getInstance().getMappedElement(ecoreElement.getClients().get(0));
            objPort.getProvided().add((ProvidedInterface)objingElt);
            ((ProvidedInterface)objingElt).setProviding(objPort);
            for (org.eclipse.uml2.uml.NamedElement element : ecoreElement.getSuppliers()){
                Object obj =  ReverseProperties.getInstance().getMappedElement(element);
                if (obj instanceof Interface){
                    ((ProvidedInterface)objingElt).getProvidedElement().add((Interface)obj);
                }
            }
            attached = true;
        }
        
        if ((!attached)  && (ecoreElement.getSuppliers().get(0) instanceof org.eclipse.uml2.uml.Interface)
                && (ecoreElement.getClients().get(0) instanceof org.eclipse.uml2.uml. BehavioredClassifier)){
            ecoreContract = (org.eclipse.uml2.uml.Interface) ecoreElement.getSuppliers().get(0);
            ecoreClassifier = (org.eclipse.uml2.uml.BehavioredClassifier) ecoreElement.getClients().get(0);
        
            Interface objingContract = (Interface) ReverseProperties.getInstance()
            .getMappedElement(ecoreContract);
            NameSpace objingClassifier = (NameSpace) ReverseProperties.getInstance()
            .getMappedElement(ecoreClassifier);
        
            //  set to the objingElt Imported Importing previousely find
            if (objingContract != null && objingClassifier != null) {
                InterfaceRealization objingRImport = (InterfaceRealization) objingElt;
                objingRImport.setImplementer(objingClassifier);
                objingRImport.setImplemented(objingContract);
            }
        }
    }

    @objid ("d3c867e6-9bc6-4c9a-97e9-68739eed9759")
    public void attach(List<Object> objingElts) {
    }

    @objid ("4cd1478c-7ac8-4459-a8a6-fa5b4495c473")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
