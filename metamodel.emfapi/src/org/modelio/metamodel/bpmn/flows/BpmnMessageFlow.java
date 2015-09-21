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
package org.modelio.metamodel.bpmn.flows;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnMessageFlow v0.0.9054
 * 
 * 
 * A Message Flow is used to show the flow of Messages between two Participants that are prepared to send and receive them.
 * 
 * ownership
 * a MessageFlow belongs to a collaboration
 */
@objid ("007c58ee-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageFlow extends BpmnBaseElement {
    @objid ("3d06bdd5-fed0-46d2-8d61-c52c3a6f8212")
    public static final String MNAME = "BpmnMessageFlow";

    /**
     * Getter for relation 'BpmnMessageFlow->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e69463c2-9701-4d39-8022-faaf057d427b")
    BpmnMessage getMessageRef();

    /**
     * Setter for relation 'BpmnMessageFlow->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("70718f3b-1ca4-4941-aa94-fde450c18bb7")
    void setMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnMessageFlow->SourceRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting from.
     * 
     * The source can only be:
     * - a Participant,
     * - an Event,
     * - or a Task
     * </i>
     */
    @objid ("1689184c-c581-4ffe-b8b9-50db15377f4c")
    BpmnBaseElement getSourceRef();

    /**
     * Setter for relation 'BpmnMessageFlow->SourceRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting from.
     * 
     * The source can only be:
     * - a Participant,
     * - an Event,
     * - or a Task
     * </i>
     */
    @objid ("ac107164-15c5-4676-800a-1d578b97831d")
    void setSourceRef(BpmnBaseElement value);

    /**
     * Getter for relation 'BpmnMessageFlow->TargetRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting to.
     * 
     * The target can only be:
     * - a Participant,
     * - an Event,
     * - or a Task.
     * </i>
     */
    @objid ("99696df4-0c3e-4bfe-b6f0-60f922478c8a")
    BpmnBaseElement getTargetRef();

    /**
     * Setter for relation 'BpmnMessageFlow->TargetRef'
     * 
     * Metamodel description:
     * <i>The BaseElement that the Association is connecting to.
     * 
     * The target can only be:
     * - a Participant,
     * - an Event,
     * - or a Task.
     * </i>
     */
    @objid ("31ae3b77-e207-4665-90b3-13f6631708cc")
    void setTargetRef(BpmnBaseElement value);

    /**
     * Getter for relation 'BpmnMessageFlow->Collaboration'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("737c6517-0fcf-4cfc-b6a3-cda4775119c7")
    BpmnCollaboration getCollaboration();

    /**
     * Setter for relation 'BpmnMessageFlow->Collaboration'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6eb217e6-7abe-4a69-89e7-3dc790090d64")
    void setCollaboration(BpmnCollaboration value);

}
