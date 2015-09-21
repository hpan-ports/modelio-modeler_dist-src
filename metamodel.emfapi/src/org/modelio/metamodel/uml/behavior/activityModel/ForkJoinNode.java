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

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * ForkJoinNode v0.0.9054
 * 
 * 
 * A fork node has one incoming edge and multiple outgoing edges. A fork node is a control node that splits a flow into multiple concurrent flows.
 * 
 * A join node has multiple incoming edges and one outgoing edge. Join nodes have a boolean specification using the names of the incoming edges to specify the conditions under which the join will emit a token.
 * 
 * Modelio extension:
 * The functionality of join node and fork node can be combined by using the same node. 
 * This case maps to a model containing a join node with all the incoming edges shown in the diagram and one outgoing edge to a fork node that has all the outgoing edges shown in the diagram.
 */
@objid ("0033b2ec-c4bf-1fd8-97fe-001ec947cd2a")
public interface ForkJoinNode extends ControlNode {
    @objid ("38246fc0-a391-4299-bcd4-c363df48a4a0")
    public static final String MNAME = "ForkJoinNode";

    /**
     * Getter for attribute 'ForkJoinNode.IsCombineDuplicate'
     * 
     * Metamodel description:
     * <i>Indicates whether tokens with objects with the same identity are combined into one by the join. The default value is true.</i>
     */
    @objid ("a21b8b42-0e6c-4b22-bd23-75216abbc867")
    boolean isIsCombineDuplicate();

    /**
     * Setter for attribute 'ForkJoinNode.IsCombineDuplicate'
     * 
     * Metamodel description:
     * <i>Indicates whether tokens with objects with the same identity are combined into one by the join. The default value is true.</i>
     */
    @objid ("32df5666-89eb-47da-a3d8-9a2498730c55")
    void setIsCombineDuplicate(boolean value);

    /**
     * Getter for attribute 'ForkJoinNode.JoinSpec'
     * 
     * Metamodel description:
     * <i>A specification giving the conditions under which the join will emit a 
     * token. The default value is �??and.</i>
     */
    @objid ("e04c7c3f-216f-4ad1-bb8c-cf0fc4b9c2f6")
    String getJoinSpec();

    /**
     * Setter for attribute 'ForkJoinNode.JoinSpec'
     * 
     * Metamodel description:
     * <i>A specification giving the conditions under which the join will emit a 
     * token. The default value is �??and.</i>
     */
    @objid ("2994900c-7f5d-494d-af4e-24aa988e4a1d")
    void setJoinSpec(String value);

}
