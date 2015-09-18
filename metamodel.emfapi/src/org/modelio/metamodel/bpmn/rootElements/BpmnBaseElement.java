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
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0077d2a6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBaseElement extends ModelElement {
    @objid ("ee7a01aa-6612-4685-bd49-7adc4e8603dd")
    EList<BpmnAssociation> getOutgoingAssoc();

    @objid ("b1dd476f-bcd6-4087-89b2-1e208828031f")
    <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass);

    @objid ("febd2cc6-475d-4a02-8bc3-23dd7eb5bf78")
    EList<BpmnAssociation> getIncomingAssoc();

    @objid ("cd21cf8f-55a1-472e-a62b-034ce529c706")
    <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass);

    @objid ("6bdf02ca-2b1d-4a3b-95ca-f5be9b7f805f")
    EList<BpmnMessageFlow> getIncomingFlow();

    @objid ("6d81fc2d-c7f7-4d3f-8685-c59a9626705c")
    <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass);

    @objid ("59527ecc-1f6b-4804-bc15-35ec54aad0d5")
    EList<BpmnMessageFlow> getOutgoingFlow();

    @objid ("5b1569e4-b605-453f-ac21-ea45b80c1341")
    <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass);

}
