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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;

@objid ("0079b594-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowNode extends BpmnFlowElement {
    @objid ("07ea701c-f29c-4114-8780-76cf426e308e")
    EList<BpmnSequenceFlow> getOutgoing();

    @objid ("74915e35-8eec-4c86-8974-eb44514e4557")
    <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("dcbf82e6-83b2-4d1e-8155-40cc1a3f06ec")
    EList<BpmnResourceRole> getResource();

    @objid ("9b918c64-e66b-4338-8eb4-978c22935220")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

    @objid ("07d34283-32fe-498b-aec3-7cef5e758dca")
    EList<BpmnSequenceFlow> getIncoming();

    @objid ("a5fa5ef1-2c27-42de-a526-d8d6391544cc")
    <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
