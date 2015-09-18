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
    @objid ("dc4d11b3-09aa-47ed-9d65-a8ee74671c4d")
    BpmnResource getResourceRef();

    @objid ("ac610fed-6d89-45d2-a4e5-61951bc1c7f8")
    void setResourceRef(BpmnResource value);

    @objid ("86302c92-f510-403e-a8e5-686a5f92bd02")
    BpmnFlowNode getAnnotated();

    @objid ("9fdcdb8d-f392-4083-9161-3725f86ffbdd")
    void setAnnotated(BpmnFlowNode value);

    @objid ("ce9c494e-ad44-4577-a668-3b824448d9af")
    EList<BpmnResourceParameterBinding> getResourceParameterBinding();

    @objid ("386fa33e-1817-46d2-b988-0fbb7fd390c9")
    <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass);

    @objid ("fa53fceb-b13e-4398-b866-23c810808037")
    BpmnProcess getProcess();

    @objid ("c0349614-2cb1-4518-be54-83e040fcf543")
    void setProcess(BpmnProcess value);

}
