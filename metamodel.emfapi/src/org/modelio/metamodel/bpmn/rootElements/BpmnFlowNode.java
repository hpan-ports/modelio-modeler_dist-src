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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;

@objid ("0079b594-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowNode extends BpmnFlowElement {
    @objid ("4162852c-5d30-4654-b866-94f0e6bc662d")
    EList<BpmnSequenceFlow> getOutgoing();

    @objid ("06921129-3d55-43d9-9bea-88c6e517567a")
    <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("905f0da0-ff3b-4c1d-af66-76d37e2fec1f")
    EList<BpmnResourceRole> getResource();

    @objid ("8c14bfdc-e13c-4ca3-abbc-3b2dfaf8e079")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

    @objid ("bedc6d37-263a-4ff1-b38c-f5b839a4ed01")
    EList<BpmnSequenceFlow> getIncoming();

    @objid ("3989ab5a-2630-4813-9869-c35a95a8d608")
    <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
