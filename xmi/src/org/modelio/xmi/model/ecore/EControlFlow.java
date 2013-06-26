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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("e4736a5b-9bb4-497f-8f57-b96d20d926fa")
public class EControlFlow extends EActivityEdge implements IEElement {
    @objid ("557ee55d-7f55-425e-bbb4-388d5fd96efd")
    private ReverseProperties revProp = ReverseProperties.getInstance();

    @objid ("4aff3546-0533-474a-ac76-a6ffc0180140")
    private org.eclipse.uml2.uml.ControlFlow ecoreElement;

    @objid ("b200bd92-7ed4-430c-834d-f5acfdab8a25")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.ActivityNode ecoreSource = ecoreElement.getSource();
        org.eclipse.uml2.uml.ActivityNode ecoreTarget = ecoreElement.getTarget();
                if ((ecoreSource != null) && (ecoreTarget != null)) {
           Object objingSource = revProp.getMappedElement(ecoreSource);
           if ((objingSource != null) &&  (objingSource instanceof ActivityNode))
           return Modelio.getInstance().getModelingSession().getModel()
                   .createControlFlow();
                
                }
        return null;
    }

    @objid ("5e6149a4-37a8-4e66-ba8e-2ee2b1aedf25")
    public EControlFlow(org.eclipse.uml2.uml.ControlFlow element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("2149b5df-39d1-4be0-b6c1-bbdbbf16d40b")
    public void attach(Element objingElt) {
        // Attachment is done when setting the Source of the Edge.
    }

    @objid ("cef5b448-4808-45f8-9392-5d75e9b7974a")
    public void attach(List<Object> objingElts) {
    }

    @objid ("e7f37a39-8a24-4b83-9fa9-b26446e592ac")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
    }

}
