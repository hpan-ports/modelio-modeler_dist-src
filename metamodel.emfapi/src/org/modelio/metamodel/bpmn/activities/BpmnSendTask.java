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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00828728-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSendTask extends BpmnTask {
    @objid ("e81ce58f-cde4-45a8-bd20-b73caeb4bfaa")
    String getImplementation();

    @objid ("ce2b621c-0619-49f8-96be-8f567eeca720")
    void setImplementation(String value);

    @objid ("71eb3f9b-a0e6-4e85-a504-940a059f90c2")
    BpmnMessage getMessageRef();

    @objid ("2c422774-6475-4683-8103-b0dd7025c907")
    void setMessageRef(BpmnMessage value);

    @objid ("cac631d1-d5ee-42f9-9881-a739106c0e7a")
    BpmnOperation getOperationRef();

    @objid ("143c1544-bb3e-468b-b90b-ad54339db424")
    void setOperationRef(BpmnOperation value);

    @objid ("98c40166-caed-42f5-ac8d-f097c5ce2d96")
    Operation getCalledOperation();

    @objid ("c743747d-5caa-477f-a6d6-68f012fa41d6")
    void setCalledOperation(Operation value);

}
