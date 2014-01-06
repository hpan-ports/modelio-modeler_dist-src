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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("00084846-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataState extends BpmnBaseElement {
    @objid ("665dcbc1-15ef-4263-ac92-d0d0c7399952")
    BpmnItemAwareElement getItem();

    @objid ("e0008525-507b-4d8a-9d2e-7aaea66d8498")
    void setItem(BpmnItemAwareElement value);

    @objid ("eae6622c-82e3-448a-b006-a870281a39ef")
    State getUmlState();

    @objid ("92b2512f-5a99-4112-9f55-446863f97d4e")
    void setUmlState(State value);

}
