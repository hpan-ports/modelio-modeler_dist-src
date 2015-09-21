/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * BpmnBaseElement v0.0.9054
 * 
 * 
 * BaseElement is the abstract super class for most BPMN elements. 
 */
@objid ("0077d2a6-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBaseElement extends ModelElement {
    @objid ("63f12bdc-47c2-4355-9791-341babd16c4d")
    public static final String MNAME = "BpmnBaseElement";

    /**
     * Getter for relation 'BpmnBaseElement->OutgoingAssoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("91c20870-d502-430b-a397-f3e555d537af")
    EList<BpmnAssociation> getOutgoingAssoc();

    /**
     * Filtered Getter for relation 'BpmnBaseElement->OutgoingAssoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fa339a29-2dea-4e9e-87e3-4882743e7ab4")
    <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnBaseElement->IncomingAssoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1045f992-5bd8-4e57-a449-d7de2888c475")
    EList<BpmnAssociation> getIncomingAssoc();

    /**
     * Filtered Getter for relation 'BpmnBaseElement->IncomingAssoc'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("71d94cbf-8c10-4f98-92b8-d40d6643dd0f")
    <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnBaseElement->IncomingFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("386331b0-ed7a-4e32-8368-7d242b8d8550")
    EList<BpmnMessageFlow> getIncomingFlow();

    /**
     * Filtered Getter for relation 'BpmnBaseElement->IncomingFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6bdb228e-c639-489c-9026-06c096edd276")
    <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnBaseElement->OutgoingFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3690019f-db35-48bd-a920-db8f8d9c3fcc")
    EList<BpmnMessageFlow> getOutgoingFlow();

    /**
     * Filtered Getter for relation 'BpmnBaseElement->OutgoingFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4d139f4b-e887-442f-b149-b17daecf5c33")
    <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass);

}
