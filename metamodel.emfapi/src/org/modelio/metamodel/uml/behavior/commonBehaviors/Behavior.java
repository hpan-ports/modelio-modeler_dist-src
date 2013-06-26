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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("01677bcf-cb6d-4b05-8197-ba78271677a7")
    boolean isIsReentrant();

    @objid ("579093e6-146c-40c1-ba3a-969631c1886d")
    void setIsReentrant(boolean value);

    @objid ("8a9847b6-de8f-4ab1-8210-b30ee3813290")
    EList<BpmnCallActivity> getBpmnCaller();

    @objid ("10ecc55f-9589-42e9-8c06-ad2e61ba303a")
    <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass);

    @objid ("b16e40ad-f223-4c8d-bf2d-beee5834728e")
    NameSpace getOwner();

    @objid ("7dee76ce-81cc-4276-8ef7-cf51e78c124e")
    void setOwner(NameSpace value);

    @objid ("56cfc2ca-4dd0-4a2c-ac6d-2c46ee18ff2a")
    EList<BehaviorParameter> getParameter();

    @objid ("969f849c-1366-4566-bf48-a6fada0db650")
    <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass);

    @objid ("f84658fa-d31c-491c-a336-861205561c2c")
    Operation getOwnerOperation();

    @objid ("615d32a0-d326-4ffc-b9cb-7528ae444214")
    void setOwnerOperation(Operation value);

    @objid ("ee65fdfd-492e-4daf-b18e-a8201641f433")
    EList<Collaboration> getOwnedCollaboration();

    @objid ("0154e1b2-ea57-4ed9-b423-14190727be0e")
    <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass);

    @objid ("9a739ec6-f598-4881-a620-9cd005a6587e")
    EList<CallBehaviorAction> getCaller();

    @objid ("3ac1d4ee-aafa-4877-b6b7-de1a7cb6cf18")
    <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("ac638dce-95ce-43bb-8f17-a5cbf6ba00a0")
    EList<Event> getEComponent();

    @objid ("187663a3-79aa-452f-9de8-9e02fbc97859")
    <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass);

    @objid ("fe97701d-08a4-4ff2-87da-7acd2e8a2ba4")
    EList<Transition> getEffectOf();

    @objid ("1d141c63-2afa-4737-a52a-73cccecc4fbb")
    <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass);

}
