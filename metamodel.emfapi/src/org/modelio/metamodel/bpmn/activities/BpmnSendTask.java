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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00828728-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSendTask extends BpmnTask {
    @objid ("1e7dca75-2f83-490a-8d78-537e5c93d5e1")
    String getImplementation();

    @objid ("b79bf5ef-fe26-4449-ae86-5756d653c6eb")
    void setImplementation(String value);

    @objid ("23223a35-4327-4436-b84a-20d2d89d9e64")
    BpmnMessage getMessageRef();

    @objid ("717b9dac-3f81-48e0-9edc-03e83063e2c6")
    void setMessageRef(BpmnMessage value);

    @objid ("d7c89183-51a3-4fed-93b1-4313fa7c63e2")
    BpmnOperation getOperationRef();

    @objid ("246d6aed-6a36-43ff-8bd9-add1b7b4e278")
    void setOperationRef(BpmnOperation value);

    @objid ("99de9df4-d249-412c-ab72-941d608b8d9d")
    Operation getCalledOperation();

    @objid ("81eab915-aaf5-4985-bd37-11851162da64")
    void setCalledOperation(Operation value);

}
