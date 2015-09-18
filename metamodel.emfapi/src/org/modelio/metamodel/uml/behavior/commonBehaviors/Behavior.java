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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("00409570-c4bf-1fd8-97fe-001ec947cd2a")
public interface Behavior extends ModelElement {
    @objid ("7132645a-b808-42fe-983b-fc365a77aebd")
    boolean isIsReentrant();

    @objid ("8edd177c-1811-4b53-9c42-63da4ed0591f")
    void setIsReentrant(boolean value);

    @objid ("2ad380f3-8bff-40b9-85df-93cc25581af1")
    EList<BpmnCallActivity> getBpmnCaller();

    @objid ("436fc485-87ed-4ce5-8ff3-bc462cc5040f")
    <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass);

    @objid ("5fd5f309-db18-4e14-9563-939f4d61e425")
    NameSpace getOwner();

    @objid ("0e75739b-4f49-4305-a73f-838bf0f1f57a")
    void setOwner(NameSpace value);

    @objid ("588888ce-8605-4e07-b11e-f8c405521fc8")
    EList<BehaviorParameter> getParameter();

    @objid ("14a4e4e1-1489-4b16-98ce-a956481030f7")
    <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass);

    @objid ("308ce1f5-5e33-4d53-a9e6-a9d1cf4ddf0f")
    Operation getOwnerOperation();

    @objid ("b3dc231a-8d46-4c73-90c5-b1a6d28abbd6")
    void setOwnerOperation(Operation value);

    @objid ("cc53b723-899e-467b-8e66-3d72515ab208")
    EList<Collaboration> getOwnedCollaboration();

    @objid ("56dec807-63d7-4712-8704-3fb1b11ddb76")
    <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass);

    @objid ("5a00130c-9183-4e2e-bebe-8436a1e4480d")
    EList<CallBehaviorAction> getCaller();

    @objid ("e0868661-bfde-4d6e-9891-6dce46b237b4")
    <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("f9ced1b6-a789-401f-9d44-f1fd231c8eba")
    EList<Event> getEComponent();

    @objid ("9ef6355b-7cc4-48d1-937a-f8a4256e77f3")
    <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass);

    @objid ("16d6e089-f667-41f9-9750-f0cbdbd25d97")
    EList<Transition> getEffectOf();

    @objid ("0e6ada9b-cab6-4e54-b16d-0129449d698a")
    <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass);

}
