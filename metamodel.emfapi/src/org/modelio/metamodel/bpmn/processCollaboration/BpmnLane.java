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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00746c56-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLane extends BpmnBaseElement {
    @objid ("ad7fd5be-664e-4d2a-a43b-c7784cb3f235")
    BpmnLaneSet getChildLaneSet();

    @objid ("dbf98a42-9910-4feb-be01-eefc84509630")
    void setChildLaneSet(BpmnLaneSet value);

    @objid ("138147e9-8be8-4af2-8415-ad8b86f831e7")
    ModelElement getPartitionElement();

    @objid ("4eead2c0-70c5-433e-a1e1-1d3a4e1d5eb2")
    void setPartitionElement(ModelElement value);

    @objid ("dab52957-b77d-47f3-a8c1-ff1852d44ffe")
    EList<BpmnFlowElement> getFlowElementRef();

    @objid ("ee52c9f5-3089-4241-81a9-b91cc697bc0a")
    <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass);

    @objid ("70a74e17-f636-48b6-b8ad-8ef991d460ab")
    BpmnLaneSet getLaneSet();

    @objid ("4a5f9438-c976-4f6f-b252-f9cfdb46cec6")
    void setLaneSet(BpmnLaneSet value);

}
