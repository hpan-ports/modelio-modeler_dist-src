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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.bpmn.flows;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007c58ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageFlow extends BpmnBaseElement {
    @objid ("b3ada147-effa-4c3d-bb28-3f21db516be1")
    BpmnMessage getMessageRef();

    @objid ("23e9f968-39a6-4099-b71a-f7c55495bcc7")
    void setMessageRef(BpmnMessage value);

    @objid ("142b635f-a662-441d-9dc4-08b172920931")
    BpmnBaseElement getSourceRef();

    @objid ("df977354-bb97-4b7b-a990-3774a0426ad0")
    void setSourceRef(BpmnBaseElement value);

    @objid ("128a311b-37b1-4cb0-be60-cbbb9b7b3e08")
    BpmnBaseElement getTargetRef();

    @objid ("a2fd88b2-db1e-4f14-bf7f-ef207a31795d")
    void setTargetRef(BpmnBaseElement value);

    @objid ("faf71456-2f9f-4fcc-8c9c-0740be766a08")
    BpmnCollaboration getCollaboration();

    @objid ("4d9f468d-2206-4664-ad15-eb2c07f3cb9a")
    void setCollaboration(BpmnCollaboration value);

}
