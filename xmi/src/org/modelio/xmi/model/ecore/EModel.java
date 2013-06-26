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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.xmi.util.ReverseProperties;

@objid ("84d1ae7d-765b-4454-9973-8c9f1d8cbb0d")
public class EModel extends EPackage implements IEElement {
    @objid ("1a0312d0-acf4-4b0b-9908-6dd65a84d662")
    private boolean isRoot = false;

    @objid ("cb7f716d-7cda-495a-a000-ef37faff8d1e")
    private org.eclipse.uml2.uml.Model ecoreElement;

    @objid ("27a141ce-342e-46db-86f8-b1dc784310b9")
    public Element createObjingElt() {
        for (org.eclipse.uml2.uml.Package ecoremodel : ReverseProperties.getInstance().getEcoreModel()){
             if (ecoreElement.equals(ecoremodel)){
                isRoot = true;
        //                return Modelio.getInstance().getModelingSession().getModel().getRoot();
                return Modelio.getInstance().getModelingSession().getModel().createPackage();
               }
        }
        return Modelio.getInstance().getModelingSession().getModel().createPackage();
    }

    @objid ("645fad64-be3f-4838-b299-af84e690d859")
    public EModel(org.eclipse.uml2.uml.Model element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("c143572b-d3d7-47f9-bed8-358eb9ac3dab")
    public void attach(Element objingElt) {
        if (!isRoot){
            ReverseProperties revProp = ReverseProperties.getInstance();
            org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
                
            Element objingOwner = (Element) revProp
            .getMappedElement(ecoreOwner);
                
            if (ecoreOwner instanceof org.eclipse.uml2.uml.Model) {
                Package objingPkg = (Package) objingElt;
                objingPkg.setOwner((Package) objingOwner);
            }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Package) {
                Package objingPkg = (Package) objingElt;
                objingPkg.setOwner((Package) objingOwner);
            }else if (ecoreOwner instanceof org.eclipse.uml2.uml.Component){
                ((Package) objingElt).setOwner((Component) objingOwner);
            }
        }
    }

    @objid ("7c0f5f50-68e5-428b-b2e7-bb8a4d069407")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
