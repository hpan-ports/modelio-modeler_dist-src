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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;

@objid ("0090c6e4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageEventDefinition extends BpmnEventDefinition {
    @objid ("21d07ecb-e4e1-4b22-a23f-7342f59d5c99")
    BpmnMessage getMessageRef();

    @objid ("110a7177-1a3f-4ee4-bed3-d5d90aff2b01")
    void setMessageRef(BpmnMessage value);

    @objid ("a66133d4-07e6-496b-be57-4f76058ff8ed")
    BpmnOperation getOperationRef();

    @objid ("0fbede3a-5316-4cf6-bbd9-8039dc14d111")
    void setOperationRef(BpmnOperation value);

}
