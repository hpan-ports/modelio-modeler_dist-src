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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("00084846-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataState extends BpmnBaseElement {
    @objid ("9ec51a76-e71f-4d44-a617-d0148a6f2153")
    BpmnItemAwareElement getItem();

    @objid ("0c74856d-46ce-401c-8bf7-ea937f204dbe")
    void setItem(BpmnItemAwareElement value);

    @objid ("179bd0e6-225d-448e-b8ca-9943ed3fb3ec")
    State getUmlState();

    @objid ("26bd3396-8227-4e3a-a9b4-b0fcf48ee0bd")
    void setUmlState(State value);

}
