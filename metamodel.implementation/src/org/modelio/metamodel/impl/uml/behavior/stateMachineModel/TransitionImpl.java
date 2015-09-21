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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0055e47a-c4bf-1fd8-97fe-001ec947cd2a")
public class TransitionImpl extends ModelElementImpl implements Transition {
    @objid ("18947626-2d06-4ae9-9c11-1a64db7fdba3")
    @Override
    public String getEffect() {
        return (String) getAttVal(((TransitionSmClass)getClassOf()).getEffectAtt());
    }

    @objid ("8a099ed7-a86b-4362-ac46-730cbf746730")
    @Override
    public void setEffect(String value) {
        setAttVal(((TransitionSmClass)getClassOf()).getEffectAtt(), value);
    }

    @objid ("9b3e780c-2e6a-4e79-8b6b-30f86fb4532c")
    @Override
    public String getReceivedEvents() {
        return (String) getAttVal(((TransitionSmClass)getClassOf()).getReceivedEventsAtt());
    }

    @objid ("2753204b-7dd7-4661-8a11-605ed8482b37")
    @Override
    public void setReceivedEvents(String value) {
        setAttVal(((TransitionSmClass)getClassOf()).getReceivedEventsAtt(), value);
    }

    @objid ("f71357e6-c7e6-400d-9810-4c24bfbc0f14")
    @Override
    public String getSentEvents() {
        return (String) getAttVal(((TransitionSmClass)getClassOf()).getSentEventsAtt());
    }

    @objid ("3b0d0d28-2499-4750-bb1f-d2e3d3576785")
    @Override
    public void setSentEvents(String value) {
        setAttVal(((TransitionSmClass)getClassOf()).getSentEventsAtt(), value);
    }

    @objid ("37961bf2-cf1a-480f-8d2c-d2f2a7c2de3a")
    @Override
    public String getGuard() {
        return (String) getAttVal(((TransitionSmClass)getClassOf()).getGuardAtt());
    }

    @objid ("77c185e6-8c26-4bd8-a6cf-42d8a1841586")
    @Override
    public void setGuard(String value) {
        setAttVal(((TransitionSmClass)getClassOf()).getGuardAtt(), value);
    }

    @objid ("41065c2b-1312-4d1d-bd27-19a6c9024741")
    @Override
    public String getPostCondition() {
        return (String) getAttVal(((TransitionSmClass)getClassOf()).getPostConditionAtt());
    }

    @objid ("86ca281d-8f48-461f-8497-03b0c7a8e883")
    @Override
    public void setPostCondition(String value) {
        setAttVal(((TransitionSmClass)getClassOf()).getPostConditionAtt(), value);
    }

    @objid ("baf57cea-216d-4849-9da0-aa168620e9bd")
    @Override
    public Operation getProcessed() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getProcessedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("58dd44d5-02bb-49ce-88d6-c00f21a5c8bb")
    @Override
    public void setProcessed(Operation value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getProcessedDep(), (SmObjectImpl)value);
    }

    @objid ("be8c4222-8bcc-49e8-ae65-51de9832930d")
    @Override
    public Event getTrigger() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getTriggerDep());
        return (obj instanceof Event)? (Event)obj : null;
    }

    @objid ("8cf10e91-4733-4938-b818-4350d005e7b0")
    @Override
    public void setTrigger(Event value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getTriggerDep(), (SmObjectImpl)value);
    }

    @objid ("2cc3dfc4-10c4-4213-9584-2ff7cf81347b")
    @Override
    public Behavior getBehaviorEffect() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getBehaviorEffectDep());
        return (obj instanceof Behavior)? (Behavior)obj : null;
    }

    @objid ("2e154a1d-9baf-47d4-8009-723d1c477147")
    @Override
    public void setBehaviorEffect(Behavior value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getBehaviorEffectDep(), (SmObjectImpl)value);
    }

    @objid ("8bd58778-2c4c-4b37-a16d-367eb8a5342d")
    @Override
    public StateVertex getTarget() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getTargetDep());
        return (obj instanceof StateVertex)? (StateVertex)obj : null;
    }

    @objid ("627ace7d-49e0-4c24-911b-7c618077b67a")
    @Override
    public void setTarget(StateVertex value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getTargetDep(), (SmObjectImpl)value);
    }

    @objid ("e0fc6274-7e12-43c6-b930-be98ae5007d6")
    @Override
    public StateVertex getSource() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getSourceDep());
        return (obj instanceof StateVertex)? (StateVertex)obj : null;
    }

    @objid ("2ab7a57c-2a3f-4d59-a30c-ca8132f3b2d9")
    @Override
    public void setSource(StateVertex value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getSourceDep(), (SmObjectImpl)value);
    }

    @objid ("8d3cfbcb-ff1b-46a0-baaf-785cc4605740")
    @Override
    public Signal getEffects() {
        Object obj = getDepVal(((TransitionSmClass)getClassOf()).getEffectsDep());
        return (obj instanceof Signal)? (Signal)obj : null;
    }

    @objid ("753366bb-45c2-4817-a631-1a87e672f68c")
    @Override
    public void setEffects(Signal value) {
        appendDepVal(((TransitionSmClass)getClassOf()).getEffectsDep(), (SmObjectImpl)value);
    }

    @objid ("825225a6-6ebc-4620-9305-895f714731ff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Source
        obj = (SmObjectImpl)this.getDepVal(((TransitionSmClass)getClassOf()).getSourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a1c5c09a-c17c-48b4-ba29-c753c0278601")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Source
        dep = ((TransitionSmClass)getClassOf()).getSourceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("1dbaa4b0-aea7-4df8-be65-b382f5dbf74f")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTransition(this);
        else
          return null;
    }

}
