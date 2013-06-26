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
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.xmi.util.GenerationProperties;
import org.modelio.xmi.util.IModelerModuleStereotypes;

@objid ("a0560fda-cda9-4908-b2e5-d2e437e9bd70")
public class OSendSignalAction extends OActivityNode implements IOElement {
    @objid ("e1f5efdb-2525-48da-a243-e52f2329546e")
    private SendSignalAction objingElement;

    @objid ("6bdf1311-857d-4378-bbfc-fad3e5914463")
    private GenerationProperties genProp = GenerationProperties.getInstance();

    @objid ("2184cea3-a920-4277-8169-8f027e6ce025")
    public org.eclipse.uml2.uml.Element createEcoreElt() {
        if (objingElement.getExtension().contains(IModelerModuleStereotypes.UML2BROADCASTSIGNALACTION))
            return UMLFactory.eINSTANCE.createSendSignalAction();
        else
            return UMLFactory.eINSTANCE.createSendSignalAction();
    }

    @objid ("162e6c88-2eea-4d10-a9ef-9682a09b7191")
    public OSendSignalAction(SendSignalAction element) {
        super(element);
        objingElement = element;
    }

    @objid ("a9a1f3be-d49b-4185-ba57-398acb91a100")
    public void attach(org.eclipse.uml2.uml.Element ecoreElt) {
        super.attach(ecoreElt);
    }

    @objid ("121a53e8-d4bb-4b03-b6bb-fb24199c3c00")
    public void setProperties(org.eclipse.uml2.uml.Element ecoreElt) {
        super.setProperties(ecoreElt);
        setSignal((org.eclipse.uml2.uml.SendSignalAction) ecoreElt);
    }

    @objid ("0ec05a23-eb4b-46ea-a6a8-f73a2a1b3826")
    private void setSignal(org.eclipse.uml2.uml.SendSignalAction action) {
        Signal objingSignal = objingElement.getSent();
        
        if (objingSignal != null) {
            org.eclipse.uml2.uml.Element ecoreSignal = genProp.getMappedElement(objingSignal);
            if (ecoreSignal instanceof  org.eclipse.uml2.uml.Signal)
                action.setSignal( (org.eclipse.uml2.uml.Signal) ecoreSignal);
        }
    }

}
