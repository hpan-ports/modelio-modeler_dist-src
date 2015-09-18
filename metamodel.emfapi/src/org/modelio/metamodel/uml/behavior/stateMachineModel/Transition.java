/*
 * Copyright 2013 Modeliosoft
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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("0055b6a8-c4bf-1fd8-97fe-001ec947cd2a")
public interface Transition extends ModelElement {
    @objid ("76e967ef-e3e0-4daf-9138-9a20e18b15e4")
    String getEffect();

    @objid ("b2516372-8d0e-44c5-b799-4e1b1bb7b2f6")
    void setEffect(String value);

    @objid ("d24d89b1-7bc8-4286-b511-a4138c0aec41")
    String getReceivedEvents();

    @objid ("e17c351b-5179-4183-9f1a-0e3f4d329bd1")
    void setReceivedEvents(String value);

    @objid ("6c861714-256c-4d6e-af30-5b96c409df99")
    String getSentEvents();

    @objid ("5cf988c1-0857-45c5-b4b0-eaeabadcc6c8")
    void setSentEvents(String value);

    @objid ("c7be3c88-6f89-440b-b534-29cd28ef2920")
    String getGuard();

    @objid ("95122cee-928d-49f5-90d6-6a12e7423060")
    void setGuard(String value);

    @objid ("2e7294ac-2283-4ab6-9979-b0b7a9ccf53f")
    String getPostCondition();

    @objid ("bb192169-c9fe-4274-b04b-5fb398df4a6f")
    void setPostCondition(String value);

    @objid ("9846a6f5-0ed4-45c3-a39c-eceb0e1d57f3")
    Operation getProcessed();

    @objid ("e7e0cfe0-1d22-4c8b-b107-6de6dc088aeb")
    void setProcessed(Operation value);

    @objid ("2f8d7099-bc12-4472-9831-0876536477a1")
    Event getTrigger();

    @objid ("fba7a156-81e7-48d1-a360-c609276958a4")
    void setTrigger(Event value);

    @objid ("bc4e0c74-24c2-4bcb-9ab9-d7736f900cdd")
    Behavior getBehaviorEffect();

    @objid ("60386c2b-df82-477e-9ed9-5104380c22c9")
    void setBehaviorEffect(Behavior value);

    @objid ("d000c2cd-64b9-4bc2-8386-a4884f3243b3")
    StateVertex getTarget();

    @objid ("cfc6f3e7-e567-4386-8be7-8d240a1e77d6")
    void setTarget(StateVertex value);

    @objid ("8343ed64-746a-4011-9ca4-4b4c60622f18")
    StateVertex getSource();

    @objid ("5e5ffa61-e54f-4ab6-98cf-84aeb4748f18")
    void setSource(StateVertex value);

    @objid ("804489e0-e562-4ac7-b611-7f3728d4e619")
    Signal getEffects();

    @objid ("504ded1b-a72e-4123-bd63-a55ce5e87cee")
    void setEffects(Signal value);

}
