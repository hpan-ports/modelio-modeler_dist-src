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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("008313be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnServiceTask extends BpmnTask {
    @objid ("29c220da-39a3-4c1a-886a-9569ca101167")
    String getImplementation();

    @objid ("e6864a90-31a5-453f-82f4-04187de83537")
    void setImplementation(String value);

    @objid ("2108c904-c27e-42ff-b181-af2ae5cc411e")
    Operation getCalledOperation();

    @objid ("683f8d8a-546d-4c70-abd0-75954e4ed75a")
    void setCalledOperation(Operation value);

    @objid ("7d4968a3-e564-4919-9daf-1c6893ab7566")
    BpmnOperation getOperationRef();

    @objid ("0ed19e6e-c1c0-43bf-8e45-03adb92fa19a")
    void setOperationRef(BpmnOperation value);

}
