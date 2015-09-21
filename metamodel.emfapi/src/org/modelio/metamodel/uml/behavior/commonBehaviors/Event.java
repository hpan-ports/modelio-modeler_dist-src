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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * Event v0.0.9054
 * 
 * 
 * An Event is the specification of a specific occurrence at a specific point in space and time.  An instance of an Event can lead to the activation of a behavioral Feature in an object. 
 * 
 * An Event can be either an occurrence of a Signal, a message occurrence, a time or a change expression occurrence.  
 * 
 * In Modelio, an Event belongs to a State Machine.
 */
@objid ("00428d1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface Event extends ModelElement {
    @objid ("a50ebc67-a866-43a3-9669-ed48a2782bd3")
    public static final String MNAME = "Event";

    /**
     * Getter for attribute 'Event.Expression'
     * 
     * Metamodel description:
     * <i>Expression initiating the Event. This can be a time expression or a triggering condition, and can contain parameter values in the case of operation call event, and so on.</i>
     */
    @objid ("89da695d-7038-41de-85dd-a40b7e535444")
    String getExpression();

    /**
     * Setter for attribute 'Event.Expression'
     * 
     * Metamodel description:
     * <i>Expression initiating the Event. This can be a time expression or a triggering condition, and can contain parameter values in the case of operation call event, and so on.</i>
     */
    @objid ("62682d7f-8c93-4e0f-8d7f-f83ce47cdab4")
    void setExpression(String value);

    /**
     * Getter for attribute 'Event.Kind'
     * 
     * Metamodel description:
     * <i>Defines the nature of the event (Time, Signal occurrence, and so on.)</i>
     */
    @objid ("b93e4555-d61d-43b7-9309-7ea1839ba9c9")
    EventType getKind();

    /**
     * Setter for attribute 'Event.Kind'
     * 
     * Metamodel description:
     * <i>Defines the nature of the event (Time, Signal occurrence, and so on.)</i>
     */
    @objid ("094f0b42-ecb5-4d45-8a5b-156eccdd41fd")
    void setKind(EventType value);

    /**
     * Getter for relation 'Event->Triggered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ba72ed5b-313c-452f-ade8-0195730c4978")
    EList<Transition> getTriggered();

    /**
     * Filtered Getter for relation 'Event->Triggered'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("92641326-3346-40d2-82e1-c4adaff7e1df")
    <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Event->Model'
     * 
     * Metamodel description:
     * <i>Signal of which the Event is an occurrence.</i>
     */
    @objid ("d07742b0-beeb-4ec9-9369-c4ca4c6b6ada")
    Signal getModel();

    /**
     * Setter for relation 'Event->Model'
     * 
     * Metamodel description:
     * <i>Signal of which the Event is an occurrence.</i>
     */
    @objid ("b8aeb48f-9ff6-435b-8a8c-15b7c2f6d121")
    void setModel(Signal value);

    /**
     * Getter for relation 'Event->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8178aa80-05da-4252-9b27-70c82299e86e")
    EList<State> getOrigin();

    /**
     * Filtered Getter for relation 'Event->Origin'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0dbb9349-1e40-46ad-8bd6-55f09b119899")
    <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Event->Called'
     * 
     * Metamodel description:
     * <i>Direct link to an Operation in case of a call Event.</i>
     */
    @objid ("d14da9b8-1b57-421a-a9eb-83fa82757a94")
    Operation getCalled();

    /**
     * Setter for relation 'Event->Called'
     * 
     * Metamodel description:
     * <i>Direct link to an Operation in case of a call Event.</i>
     */
    @objid ("7d519858-4b6a-4e36-bff3-9a07f39f90ed")
    void setCalled(Operation value);

    /**
     * Getter for relation 'Event->Composed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bf5ac16a-b27e-4316-a66f-8f69ef91e185")
    Behavior getComposed();

    /**
     * Setter for relation 'Event->Composed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c22558a5-9660-42b3-8c52-908cfdeb26e4")
    void setComposed(Behavior value);

}
