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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Parameter;

/**
 * BehaviorParameter v0.0.9054
 * 
 * 
 * BehaviorParameter is a Parameter extended to add support for streaming, exceptions and parameter sets.
 * 
 * A BehaviorParameter is owned only by a Behavior : Activities, Interactions, State machines or OpaqueBehaviors.
 * 
 * Behaviors that are owned by Operations have their BehaviorParameter linked to the corresponding operation Parameter.
 * 
 * isException applies to output parameters. An output posted to an exception excludes outputs from being posted to other data and control outputs of the behavior. A token arriving at an exception output parameter of an activity aborts all flows in the activity. Any objects previously posted to non-stream outputs never leave the activity. Streaming outputs posted before any exception are not affected. Use exception parameters on activities only if it is desired to abort all flows in the activity.
 * 
 * Streaming parameters give action access to tokens passed from its invoker while the action is executing. Values for streaming parameters may arrive anytime during the execution of the action, not just at the beginning. 
 * 
 * The effect of a parameter is a declaration of the modeler�??s intent, and does not have execution semantics. The modeler must ensure that the owner of the parameter has the stated effect.
 */
@objid ("004119be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BehaviorParameter extends Parameter {
    @objid ("5a255d3a-3765-4590-9654-cef0abedc996")
    public static final String MNAME = "BehaviorParameter";

    /**
     * Getter for relation 'BehaviorParameter->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("71a19351-daa0-41fd-9022-58ca826e49c5")
    EList<ObjectNode> getRepresentingObjectNode();

    /**
     * Filtered Getter for relation 'BehaviorParameter->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d197b42e-87c8-4f38-add0-a49129e7769f")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BehaviorParameter->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1407d158-e6d1-45b9-82e4-e4c6459a297a")
    Behavior getOwner();

    /**
     * Setter for relation 'BehaviorParameter->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d1244a34-2ed0-42ab-bbd5-9c159360bbb1")
    void setOwner(Behavior value);

    /**
     * Getter for relation 'BehaviorParameter->Mapped'
     * 
     * Metamodel description:
     * <i>Designates the operation parameter this behavior parameter maps.</i>
     */
    @objid ("80c12639-202e-46f2-93bd-75f9c6151159")
    Parameter getMapped();

    /**
     * Setter for relation 'BehaviorParameter->Mapped'
     * 
     * Metamodel description:
     * <i>Designates the operation parameter this behavior parameter maps.</i>
     */
    @objid ("2e6a9378-1d2b-45a7-be0c-acf9cc4f2ccf")
    void setMapped(Parameter value);

}
