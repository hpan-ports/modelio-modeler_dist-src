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
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("7b5534d8-28e9-4f0c-8260-0f7e48a2e912")
public class EExtensionPoint extends ENamedElement implements IEElement {
    @objid ("f5a5b432-acff-4675-8440-d26a112549b3")
    private org.eclipse.uml2.uml.ExtensionPoint ecoreElement;

    @objid ("f974ceb0-c485-4d34-bc2e-784ecc70536a")
    public Element createObjingElt() {
        return Modelio.getInstance()
                .getModelingSession().getModel().createExtensionPoint();
    }

    @objid ("8350fdb9-5b91-4bff-9545-2c999b37aaa9")
    public EExtensionPoint(org.eclipse.uml2.uml.ExtensionPoint element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("e2459a24-bbb4-4336-95ff-314b276d370a")
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
                
        ExtensionPoint currentObjingElt = (ExtensionPoint) objingElt;
                
        org.eclipse.uml2.uml.UseCase ecoreOwner = (org.eclipse.uml2.uml.UseCase) ecoreElement.getOwner();
                
        UseCase objingOwner = (UseCase) revProp
                .getMappedElement(ecoreOwner);
                
        if (objingOwner != null) {
            currentObjingElt.setOwner(objingOwner);
        }
    }

    @objid ("5d3f32fb-6358-4ca4-8124-b537ee39c105")
    public void attach(List<Object> objingElts) {
    }

    @objid ("3d7e1c9d-ec0f-477e-bf47-15ace26cb85d")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setVisibility((ExtensionPoint) objingElt);
    }

    @objid ("f4f3805a-eca9-4882-876c-3427b77835c3")
    public void setVisibility(ExtensionPoint objingElt) {
        switch (ecoreElement.getVisibility().getValue()) {
        case org.eclipse.uml2.uml.VisibilityKind.PUBLIC:
            objingElt.setVisibility(VisibilityMode.PUBLIC);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PRIVATE:
            objingElt.setVisibility(VisibilityMode.PRIVATE);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PACKAGE:
            objingElt.setVisibility(VisibilityMode.PACKAGEVISIBILITY);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PROTECTED:
            objingElt.setVisibility(VisibilityMode.PROTECTED);
            break;
        default:
            objingElt.setVisibility(VisibilityMode.PUBLIC);
        }
        
        if (ObjingEAnnotation.isUndefined(ecoreElement))
            objingElt
            .setVisibility(VisibilityMode.VISIBILITYUNDEFINED);
    }

}
