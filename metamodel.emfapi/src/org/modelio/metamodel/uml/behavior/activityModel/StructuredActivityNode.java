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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;

/**
 * StructuredActivityNode v0.0.9054
 * 
 * 
 * A structured activity node represents a structured portion of the activity that is not shared with any other structured node, except for nesting. It may have control edges connected to it and pins. 
 * The execution of any embedded actions may not begin until the structured activity node has received its object and control tokens. The availability of output tokens from the structured activity node does not occur until all embedded actions have completed execution.
 * 
 * In order to avoid race conditions or other concurrency-related  problems, it is sometimes necessary to isolate the effects of a group of actions from the effects of actions outside the group. This may be indicated by setting the mustIsolate attribute to true on a structured activity node. In this case, any object used by an action within the node cannot be accessed by any action outside the node until the structured activity node as a whole completes. 
 */
@objid ("003df874-c4bf-1fd8-97fe-001ec947cd2a")
public interface StructuredActivityNode extends ActivityAction {
    @objid ("7b47a238-d86c-45a2-aeba-2925bb3ec0ad")
    public static final String MNAME = "StructuredActivityNode";

    /**
     * Getter for attribute 'StructuredActivityNode.MustIsolate'
     * 
     * Metamodel description:
     * <i>If true, then the actions in the node execute in isolation from actions outside the node. 
     * Default value is false.
     * 
     * Because of the concurrent nature of the execution of actions within and across activities, it can be difficult to guarantee 
     * the consistent access and modification of object memory. In order to avoid race conditions or other concurrency-related 
     * problems, it is sometimes necessary to isolate the effects of a group of actions from the effects of actions outside the 
     * true on a structured activity node. If a structured 
     * group. This may be indicated by setting the mustIsolate attribute to 
     * activity node is 'isolated',  then any object used by an action within the node cannot be accessed by any action outside the 
     * node until the structured activity node as a whole completes. Any concurrent actions that would result in accessing such 
     * objects are required to have their execution deferred until the completion of the node.
     * UML Superstructure Specification, v2.1        425
     * 
     * Note : Any required isolation may be achieved using a locking mechanism, or it may simply sequentialize execution to avoid 
     * concurrency conflicts. Isolation is different from the property of 'atomicity',  which is the guarantee that a group of actions 
     * either all complete successfully or have no effect at all. Atomicity generally requires a rollback mechanism to prevent 
     * committing partial results. </i>
     */
    @objid ("b48ceafe-5bb9-4053-b993-66463324c61f")
    boolean isMustIsolate();

    /**
     * Setter for attribute 'StructuredActivityNode.MustIsolate'
     * 
     * Metamodel description:
     * <i>If true, then the actions in the node execute in isolation from actions outside the node. 
     * Default value is false.
     * 
     * Because of the concurrent nature of the execution of actions within and across activities, it can be difficult to guarantee 
     * the consistent access and modification of object memory. In order to avoid race conditions or other concurrency-related 
     * problems, it is sometimes necessary to isolate the effects of a group of actions from the effects of actions outside the 
     * true on a structured activity node. If a structured 
     * group. This may be indicated by setting the mustIsolate attribute to 
     * activity node is 'isolated',  then any object used by an action within the node cannot be accessed by any action outside the 
     * node until the structured activity node as a whole completes. Any concurrent actions that would result in accessing such 
     * objects are required to have their execution deferred until the completion of the node.
     * UML Superstructure Specification, v2.1        425
     * 
     * Note : Any required isolation may be achieved using a locking mechanism, or it may simply sequentialize execution to avoid 
     * concurrency conflicts. Isolation is different from the property of 'atomicity',  which is the guarantee that a group of actions 
     * either all complete successfully or have no effect at all. Atomicity generally requires a rollback mechanism to prevent 
     * committing partial results. </i>
     */
    @objid ("f9215d5f-f994-4fe7-92ac-1010dbd72177")
    void setMustIsolate(boolean value);

    /**
     * Getter for relation 'StructuredActivityNode->Body'
     * 
     * Metamodel description:
     * <i>Implementation of the structured activity node.</i>
     */
    @objid ("740eb9db-0be7-4073-8763-15a3c6bfa03c")
    EList<ActivityNode> getBody();

    /**
     * Filtered Getter for relation 'StructuredActivityNode->Body'
     * 
     * Metamodel description:
     * <i>Implementation of the structured activity node.</i>
     */
    @objid ("72df5796-49e5-44d9-9467-28bfdba28f9c")
    <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass);

}
