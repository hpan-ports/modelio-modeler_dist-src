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
    @objid ("bb169885-9222-4b1f-9159-672af0cec6a8")
    @Override
    public String getEffect() {
        return (String) getAttVal(TransitionData.Metadata.EffectAtt());
    }

    @objid ("435ec0fa-9626-434e-b923-3c06e4582e37")
    @Override
    public void setEffect(String value) {
        setAttVal(TransitionData.Metadata.EffectAtt(), value);
    }

    @objid ("47e951f6-b2c0-4f87-96bb-3746501025f3")
    @Override
    public String getReceivedEvents() {
        return (String) getAttVal(TransitionData.Metadata.ReceivedEventsAtt());
    }

    @objid ("ff3ee9df-18f3-449c-a0ce-656cd2380f76")
    @Override
    public void setReceivedEvents(String value) {
        setAttVal(TransitionData.Metadata.ReceivedEventsAtt(), value);
    }

    @objid ("685b7410-fb9e-4548-be99-b532901b92fe")
    @Override
    public String getSentEvents() {
        return (String) getAttVal(TransitionData.Metadata.SentEventsAtt());
    }

    @objid ("9270612c-a8e0-4eb9-a501-62d298c14365")
    @Override
    public void setSentEvents(String value) {
        setAttVal(TransitionData.Metadata.SentEventsAtt(), value);
    }

    @objid ("a24cf9cb-84c0-447a-95d9-6349e275f9a7")
    @Override
    public String getGuard() {
        return (String) getAttVal(TransitionData.Metadata.GuardAtt());
    }

    @objid ("997a49eb-02b1-4f05-a131-bd481940c196")
    @Override
    public void setGuard(String value) {
        setAttVal(TransitionData.Metadata.GuardAtt(), value);
    }

    @objid ("cba23d04-f2b3-409c-bae3-2a3027ec7c03")
    @Override
    public String getPostCondition() {
        return (String) getAttVal(TransitionData.Metadata.PostConditionAtt());
    }

    @objid ("07be5cfd-0151-4c4c-9bb9-11ceaf39daf8")
    @Override
    public void setPostCondition(String value) {
        setAttVal(TransitionData.Metadata.PostConditionAtt(), value);
    }

    @objid ("c333650c-4462-4335-b049-ab36206869a9")
    @Override
    public Operation getProcessed() {
        return (Operation) getDepVal(TransitionData.Metadata.ProcessedDep());
    }

    @objid ("086b31ee-6d9b-41d1-bd3f-27fa08c6b5db")
    @Override
    public void setProcessed(Operation value) {
        appendDepVal(TransitionData.Metadata.ProcessedDep(), (SmObjectImpl)value);
    }

    @objid ("281272a3-68f1-46a9-a161-4b8fc4df4618")
    @Override
    public Event getTrigger() {
        return (Event) getDepVal(TransitionData.Metadata.TriggerDep());
    }

    @objid ("31d7a687-3f30-470a-b9e4-668a1e25c63d")
    @Override
    public void setTrigger(Event value) {
        appendDepVal(TransitionData.Metadata.TriggerDep(), (SmObjectImpl)value);
    }

    @objid ("362d0ca1-2e76-4ae2-b5ee-f984f4f56e4d")
    @Override
    public Behavior getBehaviorEffect() {
        return (Behavior) getDepVal(TransitionData.Metadata.BehaviorEffectDep());
    }

    @objid ("fc0bbf0a-9e45-4445-9d4b-a6d3c646adae")
    @Override
    public void setBehaviorEffect(Behavior value) {
        appendDepVal(TransitionData.Metadata.BehaviorEffectDep(), (SmObjectImpl)value);
    }

    @objid ("2dcdc14f-f9a4-4a56-8bad-8eeb48cdbe81")
    @Override
    public StateVertex getTarget() {
        return (StateVertex) getDepVal(TransitionData.Metadata.TargetDep());
    }

    @objid ("54c34965-9b5e-4db9-9429-552083f3b7f9")
    @Override
    public void setTarget(StateVertex value) {
        appendDepVal(TransitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("09b1ac0d-8524-48b6-ad0a-123d496399a1")
    @Override
    public StateVertex getSource() {
        return (StateVertex) getDepVal(TransitionData.Metadata.SourceDep());
    }

    @objid ("fc2c92e7-51dc-43f1-b770-6a72ba3ccea7")
    @Override
    public void setSource(StateVertex value) {
        appendDepVal(TransitionData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("9850969f-34f1-41ce-9919-b30129e14135")
    @Override
    public Signal getEffects() {
        return (Signal) getDepVal(TransitionData.Metadata.EffectsDep());
    }

    @objid ("5c0980f7-a17b-4e75-a27e-2e765d28e0fb")
    @Override
    public void setEffects(Signal value) {
        appendDepVal(TransitionData.Metadata.EffectsDep(), (SmObjectImpl)value);
    }

    @objid ("849334f5-9427-4668-9b19-45567c4a168d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ebf8fef0-c786-4241-bcb0-52d2037f7f21")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(TransitionData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("09c27e02-de74-4fae-9ef2-75e66a4ca70f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTransition(this);
        else
          return null;
    }

}
