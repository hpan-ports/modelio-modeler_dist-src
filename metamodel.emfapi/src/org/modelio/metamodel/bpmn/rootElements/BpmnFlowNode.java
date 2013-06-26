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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;

@objid ("0079b594-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowNode extends BpmnFlowElement {
    @objid ("6a791039-f738-41e4-b024-98fce8e9660b")
    EList<BpmnSequenceFlow> getOutgoing();

    @objid ("2b7c2cfe-300d-41d5-8cd4-dc9dd1e685e5")
    <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    @objid ("cf8c0e6b-a00f-4341-a75f-47d67c4ef1a0")
    EList<BpmnResourceRole> getResource();

    @objid ("3f3c328e-0b77-43fb-b1ad-f10b5cfc64b0")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

    @objid ("fac80167-6445-48d5-86cd-a2e2d910878d")
    EList<BpmnSequenceFlow> getIncoming();

    @objid ("a62c421b-ca38-4a4e-972c-c78dfe15382a")
    <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
