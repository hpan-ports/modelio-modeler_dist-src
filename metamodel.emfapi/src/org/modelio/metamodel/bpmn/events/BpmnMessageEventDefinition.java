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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;

@objid ("0090c6e4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageEventDefinition extends BpmnEventDefinition {
    @objid ("d267ecc5-3499-49bd-aaa2-aafa0e20ea91")
    BpmnMessage getMessageRef();

    @objid ("f9583f4f-38fc-45dc-9c1b-334ab9f722b7")
    void setMessageRef(BpmnMessage value);

    @objid ("597f3662-85e8-4622-84a7-450317cbd62a")
    BpmnOperation getOperationRef();

    @objid ("b641c528-9ab2-4f25-8e25-e2815faa75f8")
    void setOperationRef(BpmnOperation value);

}
