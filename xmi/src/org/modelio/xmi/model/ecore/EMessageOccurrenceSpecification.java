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
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.xmi.util.ReverseProperties;

@objid ("3d3e7fe2-486d-4d0f-b2ca-d1bc83a1705d")
public class EMessageOccurrenceSpecification extends EOccurrenceSpecification implements IEElement {
    @objid ("8c13a9b6-44cf-4147-8653-3ca0cabb6999")
    public Element createObjingElt() {
        return Modelio.getInstance().getModelingSession().getModel()
                .createExecutionOccurenceSpecification();
    }

    @objid ("e0fce75b-0015-432d-880a-5889053c87bc")
    public EMessageOccurrenceSpecification(org.eclipse.uml2.uml.MessageOccurrenceSpecification element) {
        super(element);
    }

    @objid ("3a67b693-95a3-4335-af79-c14e228a0478")
    public void attach(Element objingElt) {
        super.attach(objingElt);
    }

    @objid ("b5f3e797-09ed-4688-aa29-fa4e6e049bdd")
    public void attach(List<Object> objingElts) {
    }

    @objid ("a8eb54c7-a84b-4f75-8708-f261fcf904ab")
    public void setProperties(Element objingElt) {
        super.setProperties(objingElt);
        setStartOrEnd(objingElt);
    }

    @objid ("bbf5febf-a345-4540-aad5-c9d1b8e7673a")
    private void setStartOrEnd(Element objingElt) {
        org.eclipse.uml2.uml.MessageOccurrenceSpecification ecoreElt = (org.eclipse.uml2.uml.MessageOccurrenceSpecification) getEcoreElement();
        org.eclipse.uml2.uml.Message ecoreMessage = ecoreElt.getMessage(); 
        Object objMessage = ReverseProperties.getInstance().getMappedElement(ecoreMessage);
        
        if ((ecoreMessage != null)
                && (objMessage != null)
                && (objMessage instanceof Message)
                && (objingElt instanceof MessageEnd)){
            
            if (ecoreMessage.getSendEvent().equals(ecoreElt)){
                ((Message) objMessage).setSendEvent((MessageEnd) objingElt);
            }else{
                ((Message) objMessage).setReceiveEvent((MessageEnd) objingElt);
            }
            
        }
    }

}
