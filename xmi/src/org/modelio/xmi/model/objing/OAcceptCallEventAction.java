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
                                    

package org.modelio.xmi.model.objing;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.uml2.uml.UMLFactory;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.xmi.util.GenerationProperties;

@objid ("ce9ee64c-7e6a-4ead-95f2-33bad6aa2976")
public class OAcceptCallEventAction extends OActivityNode implements IOElement {
    @objid ("16bd0ccb-fa9f-4085-9c3f-d70a5bda83bb")
    private AcceptCallEventAction objingElement = null;

    @objid ("f7092dfc-1f50-45de-8031-4f2a7ee64af8")
    private GenerationProperties genProp = GenerationProperties.getInstance();

    @objid ("d16b800b-fb4e-4269-909c-3229c0224101")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        return UMLFactory.eINSTANCE.createAcceptEventAction();
    }

    @objid ("2ea9c940-e432-4c17-ab94-a2c987dae40c")
    public OAcceptCallEventAction(AcceptCallEventAction element) {
        super(element);
        objingElement = element;
    }

    @objid ("03ea6a70-9935-4da8-80ff-5223a89d540d")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
    }

    @objid ("4bfd6741-1954-409b-9e05-d3a9923aad90")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
        setCalled( (org.eclipse.uml2.uml.AcceptEventAction) ecoreElt);
    }

    @objid ("4cee1025-a3e3-4d98-a9fc-d4b6cfb44435")
    private void setCalled(org.eclipse.uml2.uml.AcceptEventAction action) {
        Operation objingOperation = objingElement.getCalled();
        if (objingOperation != null) {
            org.eclipse.uml2.uml.Element ecoreOperation = genProp.getMappedElement(objingOperation);
            if ((ecoreOperation != null) && (ecoreOperation instanceof  org.eclipse.uml2.uml.Operation)) {
                 org.eclipse.uml2.uml.Trigger trigger = UMLFactory.eINSTANCE.createTrigger();
                 org.eclipse.uml2.uml.CallEvent event = UMLFactory.eINSTANCE
                        .createCallEvent();
                action.getTriggers().add(trigger);
                trigger.setEvent(event);
                event.setOperation( (org.eclipse.uml2.uml.Operation) ecoreOperation);
                
                // Attach the  org.eclipse.uml2.uml.Event to the model via composition relation:
                org.eclipse.uml2.uml.Package nearestPkg = action.getNearestPackage();
                nearestPkg.getPackagedElements().add(event);
            }
        }
    }

}
