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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("1187e5ac-e015-46f2-8d33-a6dfab618f3e")
public class ESignalEvent extends ENamedElement implements IEElement {
    @objid ("8806c259-8add-415a-bfdd-22fdce259c2d")
    private org.eclipse.uml2.uml.SignalEvent ecoreElement;

    @objid ("4c19f350-db51-49fb-8bc3-ca5cdda6a6cc")
    public Element createObjingElt() {
        org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
        if (ecoreOwner instanceof  org.eclipse.uml2.uml.Transition){
            Event result = Modelio.getInstance().getModelingSession().getModel().createEvent();
            result.setKind(EventType.SIGNALEVENT);
            return result;
        }
        return null;
    }

    @objid ("ec7e81c6-daf3-4288-87b0-cf3e6c9f5cca")
    public ESignalEvent(org.eclipse.uml2.uml.SignalEvent element) {
        super(element);
        ecoreElement = element;
    }

    @objid ("0ed035e3-ca6d-4e38-8814-f447ddb488fc")
    public void attach(Element objingElt) {
        if (((Event) objingElt).getComposed() == null){
            org.eclipse.uml2.uml.Element ecoreOwner = ecoreElement.getOwner();
            if (ecoreOwner instanceof  org.eclipse.uml2.uml.Transition){
                StateMachine sm = (StateMachine) ReverseProperties.getInstance().getMappedElement(( (org.eclipse.uml2.uml.Transition) ecoreOwner).getContainer().getStateMachine());
                sm.getEComponent().add((Event)objingElt);
            }else{
                objingElt.delete();
            }
        }
    }

    @objid ("2c47fd8e-6b04-4ebb-be8e-101ccdf4d86b")
    public void attach(List<Object> objingElts) {
    }

    @objid ("ebee2227-141d-4e85-8a5c-545a7cc9db97")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setSignal((Event)objingElt);
    }

    @objid ("0b27fe9e-d44c-4858-a258-68575a08bc39")
    private void setSignal(Event objingElt) {
        org.eclipse.uml2.uml.Signal signal =    ecoreElement.getSignal();
        if (signal != null){
            Element objSignal = (Element) ReverseProperties.getInstance().getMappedElement(signal);
            if (objSignal instanceof Signal){
                objingElt.setModel((Signal) objSignal);
            }
        }
    }

}
