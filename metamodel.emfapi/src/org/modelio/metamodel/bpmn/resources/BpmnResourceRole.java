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
package org.modelio.metamodel.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

@objid ("000a8606-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnResourceRole extends BpmnBaseElement {
    @objid ("c114ca9c-ae47-406d-9928-513fe45d2661")
    BpmnResource getResourceRef();

    @objid ("e290436b-47d0-432c-a8c7-919686f913fb")
    void setResourceRef(BpmnResource value);

    @objid ("c0451357-677f-463b-bbba-2b513868a3c8")
    BpmnFlowNode getAnnotated();

    @objid ("d347ce63-1309-42f1-ab5a-d06c3ae7f2a4")
    void setAnnotated(BpmnFlowNode value);

    @objid ("796a0d33-3aee-4c23-9860-ccf6486e790e")
    EList<BpmnResourceParameterBinding> getResourceParameterBinding();

    @objid ("f06a9114-5db8-436a-8d64-069ddeaa6ee8")
    <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass);

    @objid ("7fcf12bb-d0f3-45a8-beec-5c9d39f8eada")
    BpmnProcess getProcess();

    @objid ("5447de7d-b77c-4b83-8e0b-98472803857a")
    void setProcess(BpmnProcess value);

}
