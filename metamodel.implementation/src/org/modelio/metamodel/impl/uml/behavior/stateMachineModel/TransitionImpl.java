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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
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

@objid ("0055e47a-c4bf-1fd8-97fe-001ec947cd2a")
public class TransitionImpl extends ModelElementImpl implements Transition {
    @objid ("e9d9a025-4186-40bf-b291-5b12d2a45055")
    @Override
    public String getEffect() {
        return (String) getAttVal(TransitionData.Metadata.EffectAtt());
    }

    @objid ("82f06521-9d45-4ba1-be1e-f5d07ea90bff")
    @Override
    public void setEffect(String value) {
        setAttVal(TransitionData.Metadata.EffectAtt(), value);
    }

    @objid ("a91f0d80-651e-4428-8804-14914b6ff6b7")
    @Override
    public String getReceivedEvents() {
        return (String) getAttVal(TransitionData.Metadata.ReceivedEventsAtt());
    }

    @objid ("72748568-cbf0-4923-a522-968b1e85a3d8")
    @Override
    public void setReceivedEvents(String value) {
        setAttVal(TransitionData.Metadata.ReceivedEventsAtt(), value);
    }

    @objid ("c13e96d3-9e66-47a8-9436-b0da86e12f04")
    @Override
    public String getSentEvents() {
        return (String) getAttVal(TransitionData.Metadata.SentEventsAtt());
    }

    @objid ("5e13acb4-08c9-44de-9395-0d57dc0e4150")
    @Override
    public void setSentEvents(String value) {
        setAttVal(TransitionData.Metadata.SentEventsAtt(), value);
    }

    @objid ("21ba9127-962f-44f1-9b80-3db1b3241663")
    @Override
    public String getGuard() {
        return (String) getAttVal(TransitionData.Metadata.GuardAtt());
    }

    @objid ("833d9b27-1377-4bbb-8ec5-2a51110fbed8")
    @Override
    public void setGuard(String value) {
        setAttVal(TransitionData.Metadata.GuardAtt(), value);
    }

    @objid ("63a62b2c-560a-4399-b021-676347569e0c")
    @Override
    public String getPostCondition() {
        return (String) getAttVal(TransitionData.Metadata.PostConditionAtt());
    }

    @objid ("d34f7080-58bf-49d7-acbf-59f4aaa4478c")
    @Override
    public void setPostCondition(String value) {
        setAttVal(TransitionData.Metadata.PostConditionAtt(), value);
    }

    @objid ("ab05edcf-22f0-402a-8302-12a7a60c85ed")
    @Override
    public Operation getProcessed() {
        return (Operation) getDepVal(TransitionData.Metadata.ProcessedDep());
    }

    @objid ("da3da8ca-dcc3-4fca-ad35-93d2e69ffe8b")
    @Override
    public void setProcessed(Operation value) {
        appendDepVal(TransitionData.Metadata.ProcessedDep(), (SmObjectImpl)value);
    }

    @objid ("83466937-2325-4200-b66c-df4ed2fc330f")
    @Override
    public Event getTrigger() {
        return (Event) getDepVal(TransitionData.Metadata.TriggerDep());
    }

    @objid ("18a352d4-985f-4e62-830c-313197c1c1eb")
    @Override
    public void setTrigger(Event value) {
        appendDepVal(TransitionData.Metadata.TriggerDep(), (SmObjectImpl)value);
    }

    @objid ("f5865d1b-9107-4545-8c4f-3b795b2a81e3")
    @Override
    public Behavior getBehaviorEffect() {
        return (Behavior) getDepVal(TransitionData.Metadata.BehaviorEffectDep());
    }

    @objid ("61cdcff7-103d-439d-8fa3-b09c6c313020")
    @Override
    public void setBehaviorEffect(Behavior value) {
        appendDepVal(TransitionData.Metadata.BehaviorEffectDep(), (SmObjectImpl)value);
    }

    @objid ("6ba643c9-f461-439a-8486-b5fba2a7c302")
    @Override
    public StateVertex getTarget() {
        return (StateVertex) getDepVal(TransitionData.Metadata.TargetDep());
    }

    @objid ("bbc078e9-5ed3-4c6b-8e72-f63259964431")
    @Override
    public void setTarget(StateVertex value) {
        appendDepVal(TransitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("8da90c21-7f2c-4615-b9ec-2800f6e1fb4a")
    @Override
    public StateVertex getSource() {
        return (StateVertex) getDepVal(TransitionData.Metadata.SourceDep());
    }

    @objid ("19d3f226-d138-4116-a7ee-f5db4904317d")
    @Override
    public void setSource(StateVertex value) {
        appendDepVal(TransitionData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("4c0b2b45-d7dd-4fc7-8772-82e3696ec41a")
    @Override
    public Signal getEffects() {
        return (Signal) getDepVal(TransitionData.Metadata.EffectsDep());
    }

    @objid ("f26bad1b-7d7b-48d3-9052-4bbeca037156")
    @Override
    public void setEffects(Signal value) {
        appendDepVal(TransitionData.Metadata.EffectsDep(), (SmObjectImpl)value);
    }

    @objid ("24d19b65-8f3c-406f-95f3-b7c35a155000")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9744ac20-d3f0-4f52-b064-1f76a0121bb0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(TransitionData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f62ea72d-6d60-4719-966d-30475e85c2a7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTransition(this);
        else
          return null;
    }

}
