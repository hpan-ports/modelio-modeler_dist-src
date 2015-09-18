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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.flows;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007c58ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageFlow extends BpmnBaseElement {
    @objid ("b11256c6-c6bf-41a2-91f3-c3d748421c7a")
    BpmnMessage getMessageRef();

    @objid ("0481515b-462b-49c4-8e56-718a99a21ef0")
    void setMessageRef(BpmnMessage value);

    @objid ("028ed7e9-775e-4002-9537-c431f5bacce5")
    BpmnBaseElement getSourceRef();

    @objid ("d3327f31-d517-463d-bd9f-05d1f1d69a8a")
    void setSourceRef(BpmnBaseElement value);

    @objid ("699a5134-fa4a-4a5d-ae93-2c883a607e3e")
    BpmnBaseElement getTargetRef();

    @objid ("214f0797-b95c-4bf1-a8fb-16cf093b69b5")
    void setTargetRef(BpmnBaseElement value);

    @objid ("7b6f4819-f0f2-4e96-86dc-1481b7cd5fc1")
    BpmnCollaboration getCollaboration();

    @objid ("c3942f47-cade-4c74-8c1b-d6a19bd31314")
    void setCollaboration(BpmnCollaboration value);

}
