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
/*   Metamodel version: 9019              */
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
    @objid ("2bfad591-c6f4-4538-8bf6-7dafb370b50c")
    boolean isIsReentrant();

    @objid ("afdd2c9c-6778-4021-9e7f-f83e32a6cfcf")
    void setIsReentrant(boolean value);

    @objid ("38185a35-6345-4f5b-8a88-5fd4700fab17")
    EList<BpmnCallActivity> getBpmnCaller();

    @objid ("e712202f-b173-430a-9f33-3442dbae16c7")
    <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass);

    @objid ("4b913b47-33a5-4011-93b9-ac9c50daeaf3")
    NameSpace getOwner();

    @objid ("5492ffba-c25a-4328-aace-01817dbe8cb7")
    void setOwner(NameSpace value);

    @objid ("1147fa2d-8775-43fa-92eb-e852e4b0e9b9")
    EList<BehaviorParameter> getParameter();

    @objid ("198c36dd-55dc-4ee5-bb1a-c3b18a2c47fb")
    <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass);

    @objid ("4883f946-dc08-4bcd-aae6-cb4a5a719037")
    Operation getOwnerOperation();

    @objid ("47538ed6-4998-4ac9-a8be-ce62ffe5fb64")
    void setOwnerOperation(Operation value);

    @objid ("4bb50f7b-d10a-4cfd-9a50-448e09f7b4ca")
    EList<Collaboration> getOwnedCollaboration();

    @objid ("8b639f5e-e969-4792-a673-350eb25ab810")
    <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass);

    @objid ("1fa3445c-005c-45cf-bf71-92142ca9d91a")
    EList<CallBehaviorAction> getCaller();

    @objid ("f9bff6e5-68f1-460f-a89b-bef73e832895")
    <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("c31c57e4-1628-44d8-8d18-78503e220374")
    EList<Event> getEComponent();

    @objid ("e87cd278-6dc7-420b-96e1-4b3e345a113a")
    <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass);

    @objid ("13ea7751-c35f-4a30-8760-5898efece387")
    EList<Transition> getEffectOf();

    @objid ("e214f70c-037e-4329-ba7c-a37bf7d5e53f")
    <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass);

}
