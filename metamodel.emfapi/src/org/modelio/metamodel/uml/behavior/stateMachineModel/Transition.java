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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * Transition v0.0.9054
 * 
 * 
 * Transitions represent the reaction of an object in a certain State, to a particular Event. 
 * 
 * For protocol state diagrams, Transitions represent the possible paths between States. 
 * 
 * In Modelio, a Transition belongs to its source StateVertex.
 */
@objid ("0055b6a8-c4bf-1fd8-97fe-001ec947cd2a")
public interface Transition extends ModelElement {
    @objid ("164b74cd-b040-4be1-8297-00611c3b27de")
    public static final String MNAME = "Transition";

    /**
     * Getter for attribute 'Transition.Effect'
     * 
     * Metamodel description:
     * <i>Defines the actions triggered by the Transition. This field excludes the ProcessedOperation association that is shorthand for defining a call action.</i>
     */
    @objid ("ebaa6dc6-050a-49be-8bba-ef7887c4b030")
    String getEffect();

    /**
     * Setter for attribute 'Transition.Effect'
     * 
     * Metamodel description:
     * <i>Defines the actions triggered by the Transition. This field excludes the ProcessedOperation association that is shorthand for defining a call action.</i>
     */
    @objid ("51640bd7-54f9-4e3a-a310-ccbb06262e68")
    void setEffect(String value);

    /**
     * Getter for attribute 'Transition.ReceivedEvents'
     * 
     * Metamodel description:
     * <i>Received events that trigger the Transition.</i>
     */
    @objid ("2280c49f-8a67-4059-9b6c-d666de8c878a")
    String getReceivedEvents();

    /**
     * Setter for attribute 'Transition.ReceivedEvents'
     * 
     * Metamodel description:
     * <i>Received events that trigger the Transition.</i>
     */
    @objid ("ce9ff219-91ed-463f-98ef-aea0045f57cb")
    void setReceivedEvents(String value);

    /**
     * Getter for attribute 'Transition.SentEvents'
     * 
     * Metamodel description:
     * <i>Events sent by the Transition once it is triggered.</i>
     */
    @objid ("b028a12d-505c-4654-9226-3883e0517a91")
    String getSentEvents();

    /**
     * Setter for attribute 'Transition.SentEvents'
     * 
     * Metamodel description:
     * <i>Events sent by the Transition once it is triggered.</i>
     */
    @objid ("bb28bf01-68b2-4ee3-8912-8cf3783b083b")
    void setSentEvents(String value);

    /**
     * Getter for attribute 'Transition.Guard'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("edad75f2-d2b9-44a2-809a-32cf39f98f2d")
    String getGuard();

    /**
     * Setter for attribute 'Transition.Guard'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9559ccf3-6335-4387-96f0-468131d903c8")
    void setGuard(String value);

    /**
     * Getter for attribute 'Transition.PostCondition'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("65a733ba-cc62-43ab-a97d-6e018f16e659")
    String getPostCondition();

    /**
     * Setter for attribute 'Transition.PostCondition'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("b017a63b-6abe-431e-8f65-d0d207ced08b")
    void setPostCondition(String value);

    /**
     * Getter for relation 'Transition->Processed'
     * 
     * Metamodel description:
     * <i>The Operation processed once the Transition is triggered. This is shorthand for a call event, and is also useful for defining the operation carried by a Transition in protocol state diagrams.</i>
     */
    @objid ("ddcc19b0-4f68-4ea8-8ee1-091adcb2b20b")
    Operation getProcessed();

    /**
     * Setter for relation 'Transition->Processed'
     * 
     * Metamodel description:
     * <i>The Operation processed once the Transition is triggered. This is shorthand for a call event, and is also useful for defining the operation carried by a Transition in protocol state diagrams.</i>
     */
    @objid ("d2423cc5-1aed-4a43-a7ea-14c9681eaecf")
    void setProcessed(Operation value);

    /**
     * Getter for relation 'Transition->Trigger'
     * 
     * Metamodel description:
     * <i>Events that may trigger the Transition (under initial state and initial Transitions). This association is exclusive from the "ReceivedEvents" string.</i>
     */
    @objid ("05433eb2-7622-44d8-adcc-aacf4b14006f")
    Event getTrigger();

    /**
     * Setter for relation 'Transition->Trigger'
     * 
     * Metamodel description:
     * <i>Events that may trigger the Transition (under initial state and initial Transitions). This association is exclusive from the "ReceivedEvents" string.</i>
     */
    @objid ("4633ac64-cbac-42e9-8ca1-f80b6b84a232")
    void setTrigger(Event value);

    /**
     * Getter for relation 'Transition->BehaviorEffect'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("078c6cc4-6094-4b47-bff2-add9f9c87c2d")
    Behavior getBehaviorEffect();

    /**
     * Setter for relation 'Transition->BehaviorEffect'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("53dd2915-2052-489d-9d04-e5cc46763eac")
    void setBehaviorEffect(Behavior value);

    /**
     * Getter for relation 'Transition->Target'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions entering the vertex.</i>
     */
    @objid ("b12d914c-1abe-4cda-8818-1889679f62b6")
    StateVertex getTarget();

    /**
     * Setter for relation 'Transition->Target'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions entering the vertex.</i>
     */
    @objid ("626ca602-0f84-4e98-ad2b-449fae1df418")
    void setTarget(StateVertex value);

    /**
     * Getter for relation 'Transition->Source'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions departing from the vertex.</i>
     */
    @objid ("161da71e-8303-4477-b97a-b470fc6f3d42")
    StateVertex getSource();

    /**
     * Setter for relation 'Transition->Source'
     * 
     * Metamodel description:
     * <i>Specifies the Transitions departing from the vertex.</i>
     */
    @objid ("671fe60b-531b-477e-b67f-2b011376daf4")
    void setSource(StateVertex value);

    /**
     * Getter for relation 'Transition->Effects'
     * 
     * Metamodel description:
     * <i>When the Transition is accomplished, occurrences of this Signal will be sent.</i>
     */
    @objid ("25fd30fd-fde7-4877-848e-bf3f1b2da91e")
    Signal getEffects();

    /**
     * Setter for relation 'Transition->Effects'
     * 
     * Metamodel description:
     * <i>When the Transition is accomplished, occurrences of this Signal will be sent.</i>
     */
    @objid ("a931e984-a587-4346-9d7e-d246deff3f6d")
    void setEffects(Signal value);

}
