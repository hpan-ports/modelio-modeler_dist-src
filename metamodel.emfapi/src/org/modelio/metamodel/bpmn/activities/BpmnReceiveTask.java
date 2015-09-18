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

@objid ("008180d0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnReceiveTask extends BpmnTask {
    @objid ("d6f40ebe-a329-4a2e-bdc1-560907a47981")
    String getImplementation();

    @objid ("591b0e60-9c66-495b-bc69-d33000ac58fb")
    void setImplementation(String value);

    @objid ("d546fff6-9add-4ab1-8b95-2cc9f68d96de")
    boolean isInstanciate();

    @objid ("066f00aa-c504-456a-8229-99bd01f8702d")
    void setInstanciate(boolean value);

    @objid ("02642fd5-51e7-4ac2-81cd-3c70bc781292")
    BpmnMessage getMessageRef();

    @objid ("69330d20-391d-4a16-9a13-fc079cf3f02a")
    void setMessageRef(BpmnMessage value);

    @objid ("8c13ebc0-74a1-4dc9-95c7-96fe6af3629d")
    BpmnOperation getOperationRef();

    @objid ("8e7f18b2-6264-4c93-8009-7a85b67ad0db")
    void setOperationRef(BpmnOperation value);

    @objid ("e8a442a4-b1f6-492e-bae0-7822889c045f")
    Operation getCalledOperation();

    @objid ("17503628-7904-4c22-9c31-3d8f765d294a")
    void setCalledOperation(Operation value);

}
