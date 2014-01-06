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
import org.modelio.metamodel.uml.statik.Operation;

@objid ("008313be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnServiceTask extends BpmnTask {
    @objid ("1817246e-c8eb-4e0e-9495-16b09d4899ed")
    String getImplementation();

    @objid ("e6a786ee-5fd9-4741-8903-ae57717c5325")
    void setImplementation(String value);

    @objid ("8fc6fa7a-a97f-4fce-8960-33ff7e5ede1c")
    Operation getCalledOperation();

    @objid ("d0db7861-1e88-45c3-b94b-23f5c86e5c72")
    void setCalledOperation(Operation value);

    @objid ("b89da16a-f916-4b61-a5e5-4aeb45d675cd")
    BpmnOperation getOperationRef();

    @objid ("43d6621b-d068-4de4-85e8-1ddd83c60051")
    void setOperationRef(BpmnOperation value);

}
