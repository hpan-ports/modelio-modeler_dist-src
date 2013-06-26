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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.xmi.util.ReverseProperties;

@objid ("84c1f37a-41d8-4ec0-b87f-b977cdb92979")
public class ENode extends ENamedElement implements IEElement {
    @objid ("e7e06035-3c13-447f-bab0-c647377b3f81")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession()
        .getModel().createNode();
    }

    @objid ("7183726e-68d8-4d7c-abf9-fc9cd393029d")
    public ENode(org.eclipse.uml2.uml.Node element) {
        super(element);
    }

    @objid ("e93b81aa-95a4-4763-81fa-399070b550f0")
    public void attach(Element objingElt) {
        ReverseProperties revProp = ReverseProperties.getInstance();
        
        org.eclipse.uml2.uml.Element ecoreOwner = getEcoreElement().getOwner();
        
        ModelElement objingOwner = (ModelElement) revProp
        .getMappedElement(ecoreOwner);
        Node objingCollab = (Node) objingElt;
        
        if (objingOwner instanceof Profile) {
            objingCollab.setOwner(revProp.getExternalPackage());
        } else if (objingOwner instanceof ModelTree) {
            objingCollab.setOwner((ModelTree) objingOwner);
        } else {
            objingCollab.setOwner(revProp.getExternalPackage());
        }
    }

    @objid ("589a603e-2457-4e64-baa2-7e135d8be491")
    public void attach(List<Object> objingElts) {
    }

    @objid ("5b71eae5-3340-49b8-99a0-37c3ae690a09")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
