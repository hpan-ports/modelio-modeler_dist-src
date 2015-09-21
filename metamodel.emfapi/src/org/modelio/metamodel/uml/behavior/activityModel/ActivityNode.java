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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * ActivityNode v0.0.9054
 * 
 * 
 * The execution of an action represents some transformation or processing in the modeled
 * system, be it a computer system or otherwise.
 * 
 * An action may have sets of incoming and outgoing activity edges that specify control flow and data flow to and from other nodes. An action will not begin execution until all of its input conditions are satisfied. The completion of the execution of an action may enable the execution of a set  of successor nodes and actions that take their inputs from the outputs of the action.
 * 
 * Action can have pre- and postconditions (using constraints).
 */
@objid ("0028adde-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityNode extends ModelElement {
    @objid ("ee5f7c3a-ea4e-47db-8989-ee08ed3b5b44")
    public static final String MNAME = "ActivityNode";

    /**
     * Getter for relation 'ActivityNode->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c66be1e3-9d8f-4d9c-8607-863292b851de")
    Activity getOwner();

    /**
     * Setter for relation 'ActivityNode->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("25a3b10a-5f1c-40c6-855f-a2021c4bea8e")
    void setOwner(Activity value);

    /**
     * Getter for relation 'ActivityNode->OwnerPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78f295ff-f39b-4da7-96d6-8e0cddfce51f")
    ActivityPartition getOwnerPartition();

    /**
     * Setter for relation 'ActivityNode->OwnerPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e43f5a56-7dd5-45bf-ab7d-a6b491d55523")
    void setOwnerPartition(ActivityPartition value);

    /**
     * Getter for relation 'ActivityNode->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("701c356d-2852-4ffb-9701-dd2aff0012bf")
    EList<ActivityEdge> getIncoming();

    /**
     * Filtered Getter for relation 'ActivityNode->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bd3dc1f6-0585-4096-a45c-d804de6aa52d")
    <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ActivityNode->OwnerClause'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d6d9d4e9-8194-4c90-ba37-3e05c4bf3462")
    Clause getOwnerClause();

    /**
     * Setter for relation 'ActivityNode->OwnerClause'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e7b50e3a-43ba-4adf-9b80-6ef66c7cab6c")
    void setOwnerClause(Clause value);

    /**
     * Getter for relation 'ActivityNode->OwnerNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("31119d94-74d4-4ebd-b505-038872402fea")
    StructuredActivityNode getOwnerNode();

    /**
     * Setter for relation 'ActivityNode->OwnerNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ca02cba5-cbb3-4c87-94a0-558391ed1dfd")
    void setOwnerNode(StructuredActivityNode value);

    /**
     * Getter for relation 'ActivityNode->Outgoing'
     * 
     * Metamodel description:
     * <i>Edges that have the node as source.</i>
     */
    @objid ("5f2a96c4-1dcf-4fa5-af8f-d335c58166da")
    EList<ActivityEdge> getOutgoing();

    /**
     * Filtered Getter for relation 'ActivityNode->Outgoing'
     * 
     * Metamodel description:
     * <i>Edges that have the node as source.</i>
     */
    @objid ("94525999-b4b7-4a9c-8cef-81b804071c2d")
    <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass);

}
