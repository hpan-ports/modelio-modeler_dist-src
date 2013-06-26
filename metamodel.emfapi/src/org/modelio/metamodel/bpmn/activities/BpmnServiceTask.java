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
import org.modelio.metamodel.uml.statik.Operation;

@objid ("008313be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnServiceTask extends BpmnTask {
    @objid ("c281143a-1556-42b4-8c3e-a774eae21ba1")
    String getImplementation();

    @objid ("9fe799c7-a47a-4a38-b98c-ef0de8408fc8")
    void setImplementation(String value);

    @objid ("89ce89dc-3515-45bd-868c-119860991f7d")
    Operation getCalledOperation();

    @objid ("d424f242-7653-4024-8335-92e0ae076ea7")
    void setCalledOperation(Operation value);

    @objid ("333d2905-d2c8-4a71-aa8d-182c05a23a93")
    BpmnOperation getOperationRef();

    @objid ("144ca1ae-4697-4131-a18f-ebb0972dbf71")
    void setOperationRef(BpmnOperation value);

}
