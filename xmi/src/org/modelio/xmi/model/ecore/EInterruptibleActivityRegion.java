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
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ObjingEAnnotation;
import org.modelio.xmi.util.ReverseProperties;

@objid ("89078259-8a9f-48ca-b5bf-951975b12de1")
public class EInterruptibleActivityRegion extends EElement implements IEElement {
    @objid ("cf1305d0-25d7-4ea2-9648-137744382a5e")
    private org.eclipse.uml2.uml.InterruptibleActivityRegion ecoreElement;

    @objid ("d6be723e-c0c0-4c47-9270-10a9f2d093f1")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createInterruptibleActivityRegion();
    }

    @objid ("e4e7f45f-fe18-4ceb-a0bb-3ea23933a995")
    public EInterruptibleActivityRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("7ef0e2e1-bb6a-4052-86fb-164072fb831e")
    public void attach(Element objingElt) {
        org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
                
        if (ecoreOwner != null) {
            Object objingOwner = ReverseProperties.getInstance().getMappedElement(ecoreOwner);
                
            if (objingOwner instanceof Activity)
                ((InterruptibleActivityRegion) objingElt)
                        .setInActivity((Activity) objingOwner);
        }
    }

    @objid ("b27b803c-ede3-43b0-9907-6654b31d1877")
    public void attach(List<Object> objingElts) {
    }

    @objid ("61eeb31f-88fd-4f9a-b077-3f9e99ae44d8")
    public void setProperties(Element objingElt) {
        setInterrupts((InterruptibleActivityRegion) objingElt);
        setName((InterruptibleActivityRegion) objingElt);
        
        super.setProperties(objingElt);
    }

    @objid ("243c50fc-4d3d-455f-bea0-ad21eb8c0a17")
    private void setInterrupts(InterruptibleActivityRegion region) {
        for (Object ecoreInterruptingEdge : ecoreElement.getInterruptingEdges()) {
            Object objingInterruptingEdge = ReverseProperties.getInstance()
                    .getMappedElement((org.eclipse.uml2.uml.ActivityEdge) ecoreInterruptingEdge);
            if (objingInterruptingEdge instanceof ActivityEdge)
                ((ActivityEdge) objingInterruptingEdge).setInterrupts(region);
        }
    }

    @objid ("758e80cf-a955-477e-83eb-627f96b0726d")
    private void setName(InterruptibleActivityRegion region) {
        if (ReverseProperties.getInstance().isRoundtripEnabled())
        region.setName(ObjingEAnnotation.getName(ecoreElement));
    }

}
