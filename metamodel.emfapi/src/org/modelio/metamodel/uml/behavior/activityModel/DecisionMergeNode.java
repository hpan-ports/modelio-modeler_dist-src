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
import org.modelio.metamodel.uml.behavior.activityModel.DecisionNodeKind;

/**
 * DecisionMergeNode v0.0.9054
 * 
 * 
 * A decision node is a control node that chooses between outgoing flows.
 * 
 * A merge node is a control node that brings together multiple alternate flows. It is not used to synchronize concurrent flows but to accept one among several alternate flows.
 * 
 * Modelio specific:
 * The functionality of merge node and decision node can be combined by using the same node. This case maps to a model containing a merge node with all the incoming edges and one outgoing edge to a decision node that has all the outgoing edges.
 */
@objid ("002fbdcc-c4bf-1fd8-97fe-001ec947cd2a")
public interface DecisionMergeNode extends ControlNode {
    @objid ("ad836993-645b-4e07-81d1-54c3eaa43cf7")
    public static final String MNAME = "DecisionMergeNode";

    /**
     * Getter for attribute 'DecisionMergeNode.DecisionKind'
     * 
     * Metamodel description:
     * <i>BPMN decision kind.</i>
     */
    @objid ("3516e4b1-be4b-420f-974e-ed30e1a740bd")
    DecisionNodeKind getDecisionKind();

    /**
     * Setter for attribute 'DecisionMergeNode.DecisionKind'
     * 
     * Metamodel description:
     * <i>BPMN decision kind.</i>
     */
    @objid ("9c8abde0-4fdd-4456-9a71-85cc332c8751")
    void setDecisionKind(DecisionNodeKind value);

    /**
     * Getter for attribute 'DecisionMergeNode.DecisionInputBehavior'
     * 
     * Metamodel description:
     * <i>Provides input to guard specifications on edges outgoing from the decision node.</i>
     */
    @objid ("f8adf9dd-9367-48e6-aa81-28f15850811b")
    String getDecisionInputBehavior();

    /**
     * Setter for attribute 'DecisionMergeNode.DecisionInputBehavior'
     * 
     * Metamodel description:
     * <i>Provides input to guard specifications on edges outgoing from the decision node.</i>
     */
    @objid ("0c5c351c-929b-4881-8068-b4ac950341f2")
    void setDecisionInputBehavior(String value);

}
