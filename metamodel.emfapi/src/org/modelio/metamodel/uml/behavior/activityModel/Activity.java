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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

/**
 * Activity v0.0.9054
 * 
 * 
 * An activity specifies the coordination of executions of subordinate behaviors, using a control and data flow model. The subordinate behaviors coordinated by these models may be initiated because other behaviors in the model finish executing, because objects and data become available, or because events occur outside the flow. The flow of execution is modeled as activity nodes connected by activity edges. A node can be the execution of a subordinate behavior, such as an arithmetic computation, a call to an operation, or manipulation of object contents. Activity nodes also include flow-of-control constructs, such as synchronization, decision, and concurrency control. 
 * 
 * Activities may form invocation hierarchies invoking other activities, ultimately resolving to individual actions. 
 * 
 * In an object-oriented model, activities are usually invoked indirectly as methods bound to operations that are directly invoked. Activities may describe procedural computation. In this context, they are the methods corresponding to operations on classes. 
 * 
 * Activities may be applied to organizational modeling for business process engineering and workflow. In this context, events often originate inside the system, such as the finishing of a task, but also outside the system, such as a customer call. Activities can also be used for information system modeling to specify system level processes.
 * 
 * In Modelio, an activity can be owned by a NameSpace or an operation. It can also be owned by a structured activity node, but in this case, the activity is "hidden" (visually merged with the ActivityNode).
 */
@objid ("0026094e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Activity extends Behavior {
    @objid ("83bf3763-af1e-48cd-9620-0f0a4addbf14")
    public static final String MNAME = "Activity";

    /**
     * Getter for attribute 'Activity.IsSingleExecution'
     * 
     * Metamodel description:
     * <i>If true, all invocations of the activity are handled by the same execution.</i>
     */
    @objid ("7e38760d-7792-4495-ae10-7d33a5d34f76")
    boolean isIsSingleExecution();

    /**
     * Setter for attribute 'Activity.IsSingleExecution'
     * 
     * Metamodel description:
     * <i>If true, all invocations of the activity are handled by the same execution.</i>
     */
    @objid ("499692ac-999d-4834-8885-a419921469c6")
    void setIsSingleExecution(boolean value);

    /**
     * Getter for attribute 'Activity.IsReadOnly'
     * 
     * Metamodel description:
     * <i>If true, this activity must not make any changes to variables outside the activity or to objects. This is an assertion, not an executable property.</i>
     */
    @objid ("a111dd3a-f5fe-4356-b683-22b80c738ade")
    boolean isIsReadOnly();

    /**
     * Setter for attribute 'Activity.IsReadOnly'
     * 
     * Metamodel description:
     * <i>If true, this activity must not make any changes to variables outside the activity or to objects. This is an assertion, not an executable property.</i>
     */
    @objid ("97569e1f-feb4-4d2d-a75d-038d36319e81")
    void setIsReadOnly(boolean value);

    /**
     * Getter for relation 'Activity->OwnedGroup'
     * 
     * Metamodel description:
     * <i>Top-level groups in the activity. </i>
     */
    @objid ("31137e2f-af9a-460c-943a-1db50b98ba24")
    EList<ActivityGroup> getOwnedGroup();

    /**
     * Filtered Getter for relation 'Activity->OwnedGroup'
     * 
     * Metamodel description:
     * <i>Top-level groups in the activity. </i>
     */
    @objid ("782d5fb5-c04c-46fb-a84d-3fd31903e1fe")
    <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Activity->OwnedNode'
     * 
     * Metamodel description:
     * <i>Nodes coordinated by the activity.</i>
     */
    @objid ("fa394ce3-47f0-4db7-8e96-0ea27d412d21")
    EList<ActivityNode> getOwnedNode();

    /**
     * Filtered Getter for relation 'Activity->OwnedNode'
     * 
     * Metamodel description:
     * <i>Nodes coordinated by the activity.</i>
     */
    @objid ("0625cdb5-3119-4fdc-b1bd-004275e78cd6")
    <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass);

}
