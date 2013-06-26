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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ProfileUtils;

@objid ("6848c7be-39c7-4e47-8d27-bee0ca0d6ba1")
public class EProfile extends ENamedElement implements IEElement {
    @objid ("d0e39ab9-a065-462d-9c0e-c36a1014c74e")
    private org.eclipse.uml2.uml.Profile ecoreElement;

    @objid ("32b275b9-fb86-4c32-b5f8-18ba4ffbdb7c")
    public Element createObjingElt() {
        return ProfileUtils.createObjProfile(ecoreElement);
    }

    @objid ("f0384560-15e6-4c5f-b1fb-5b1ba51b276e")
    public EProfile(org.eclipse.uml2.uml.Profile element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("acc56e54-c824-481d-a69a-1343907738d9")
    public void attach(Element objingElt) {
        // TODO Auto-generated method stub
    }

    @objid ("9a1e4536-54cd-43ff-ac64-21ddd8e47e53")
    public void attach(List<Object> objingElts) {
    }

    @objid ("24490f6e-b30c-43a9-af91-ca5776bc3fd1")
    public void setProperties(Element objingElt) {
        if (objingElt instanceof NameSpace)
            setVisibility((NameSpace) objingElt);
    }

    @objid ("e7e0983b-5f12-48d8-98bd-cdaeb9bcbd11")
    private void setVisibility(NameSpace objingElt) {
        org.eclipse.uml2.uml.NamedElement ecoreNamedElt = (org.eclipse.uml2.uml.NamedElement) getEcoreElement();
        
        switch (ecoreNamedElt.getVisibility().getValue()) {
        case org.eclipse.uml2.uml.VisibilityKind.PACKAGE:
            objingElt
            .setVisibility(VisibilityMode.PACKAGEVISIBILITY);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PRIVATE:
            objingElt.setVisibility(VisibilityMode.PRIVATE);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PROTECTED:
            objingElt.setVisibility(VisibilityMode.PROTECTED);
            break;
        case org.eclipse.uml2.uml.VisibilityKind.PUBLIC:
            objingElt.setVisibility(VisibilityMode.PUBLIC);
            break;
        default:
            objingElt.setVisibility(VisibilityMode.PUBLIC);
        }
        
        if (ObjingEAnnotation.isUndefined(ecoreNamedElt))
            objingElt.setVisibility(VisibilityMode.VISIBILITYUNDEFINED);
    }

}
