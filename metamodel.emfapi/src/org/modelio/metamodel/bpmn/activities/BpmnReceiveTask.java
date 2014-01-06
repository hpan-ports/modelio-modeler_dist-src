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

@objid ("008180d0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnReceiveTask extends BpmnTask {
    @objid ("3f59aee1-d922-49a1-b536-ff10e0cef9c0")
    String getImplementation();

    @objid ("9bbc8163-f82b-4be0-852a-3b9b957f5a84")
    void setImplementation(String value);

    @objid ("a064c7a6-e7af-4ff1-8624-21968aaace21")
    boolean isInstanciate();

    @objid ("cb9ad704-1481-4b18-bd9b-f3534d02f6d5")
    void setInstanciate(boolean value);

    @objid ("713afd65-e1a3-45e6-aefb-5a0e29431fdc")
    BpmnMessage getMessageRef();

    @objid ("c80800c5-0eaf-467c-8805-228fb8716476")
    void setMessageRef(BpmnMessage value);

    @objid ("d8325595-cc66-425c-8d45-4c0d6a5c5056")
    BpmnOperation getOperationRef();

    @objid ("906f18ee-b5a2-4370-8bea-e569f0989529")
    void setOperationRef(BpmnOperation value);

    @objid ("00aa4f27-cd21-41fd-892d-69a980d9b1c2")
    Operation getCalledOperation();

    @objid ("00bc742e-959e-466b-a32e-eaeaa2434565")
    void setCalledOperation(Operation value);

}
