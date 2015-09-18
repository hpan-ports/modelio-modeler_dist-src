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
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00828728-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSendTask extends BpmnTask {
    @objid ("cc8bfc2c-41fc-4ba3-8e82-944845c6676b")
    String getImplementation();

    @objid ("d8d6af8f-171a-4102-970a-e09024646aa8")
    void setImplementation(String value);

    @objid ("8de92953-3895-4241-b48b-48ad598698c4")
    BpmnMessage getMessageRef();

    @objid ("dc519374-3c6d-4152-ae0e-11e2b4b3cb9f")
    void setMessageRef(BpmnMessage value);

    @objid ("8f288ff4-9f50-4773-84d2-cb12bf3438a1")
    BpmnOperation getOperationRef();

    @objid ("d712eebf-1a5d-480c-8320-c40875340a04")
    void setOperationRef(BpmnOperation value);

    @objid ("8471226e-83c8-49df-917f-069659329294")
    Operation getCalledOperation();

    @objid ("a1e896ea-62b5-4fab-a05d-665706e4974b")
    void setCalledOperation(Operation value);

}
