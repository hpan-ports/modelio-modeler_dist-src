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
    @objid ("b693c51c-98f0-45bc-b42b-b7a9c9bbebc7")
    @Override
    public String getEffect() {
        return (String) getAttVal(TransitionData.Metadata.EffectAtt());
    }

    @objid ("dd6140c9-460a-47f7-8f41-3e3a5c61eba9")
    @Override
    public void setEffect(String value) {
        setAttVal(TransitionData.Metadata.EffectAtt(), value);
    }

    @objid ("8071f5af-faef-4123-bcbc-f67c67ff564d")
    @Override
    public String getReceivedEvents() {
        return (String) getAttVal(TransitionData.Metadata.ReceivedEventsAtt());
    }

    @objid ("2be1527c-74b3-4004-ac85-df035d6f2a33")
    @Override
    public void setReceivedEvents(String value) {
        setAttVal(TransitionData.Metadata.ReceivedEventsAtt(), value);
    }

    @objid ("2ee1bd12-125a-46aa-ba6b-5991be3a9709")
    @Override
    public String getSentEvents() {
        return (String) getAttVal(TransitionData.Metadata.SentEventsAtt());
    }

    @objid ("536a33c8-081e-4cb7-afbb-775f54936283")
    @Override
    public void setSentEvents(String value) {
        setAttVal(TransitionData.Metadata.SentEventsAtt(), value);
    }

    @objid ("1c05b4f6-6717-40e6-a3ed-582b82cac167")
    @Override
    public String getGuard() {
        return (String) getAttVal(TransitionData.Metadata.GuardAtt());
    }

    @objid ("facd02c7-d9d1-41d5-a133-520e5691860d")
    @Override
    public void setGuard(String value) {
        setAttVal(TransitionData.Metadata.GuardAtt(), value);
    }

    @objid ("4c621cd0-6bb7-4757-9121-0d1cba3fa47b")
    @Override
    public String getPostCondition() {
        return (String) getAttVal(TransitionData.Metadata.PostConditionAtt());
    }

    @objid ("b082738b-c7ef-431a-b60a-24b84135fc13")
    @Override
    public void setPostCondition(String value) {
        setAttVal(TransitionData.Metadata.PostConditionAtt(), value);
    }

    @objid ("e5449355-5aac-4e1d-85c7-5edbf3ccf428")
    @Override
    public Operation getProcessed() {
        return (Operation) getDepVal(TransitionData.Metadata.ProcessedDep());
    }

    @objid ("c5a42770-ccbc-47f4-983b-1edb3928f68c")
    @Override
    public void setProcessed(Operation value) {
        appendDepVal(TransitionData.Metadata.ProcessedDep(), (SmObjectImpl)value);
    }

    @objid ("bd939608-81a0-48c7-bf22-df6f37cff61b")
    @Override
    public Event getTrigger() {
        return (Event) getDepVal(TransitionData.Metadata.TriggerDep());
    }

    @objid ("3aec0ce3-e8e0-4a11-8075-8e12cfefeaba")
    @Override
    public void setTrigger(Event value) {
        appendDepVal(TransitionData.Metadata.TriggerDep(), (SmObjectImpl)value);
    }

    @objid ("bbf82d19-b5e2-4b42-93e6-296358ccc6e8")
    @Override
    public Behavior getBehaviorEffect() {
        return (Behavior) getDepVal(TransitionData.Metadata.BehaviorEffectDep());
    }

    @objid ("142c3412-6853-4782-803f-90f0dcb88783")
    @Override
    public void setBehaviorEffect(Behavior value) {
        appendDepVal(TransitionData.Metadata.BehaviorEffectDep(), (SmObjectImpl)value);
    }

    @objid ("7f91f2da-3153-4fa0-9daf-38c8d09849f8")
    @Override
    public StateVertex getTarget() {
        return (StateVertex) getDepVal(TransitionData.Metadata.TargetDep());
    }

    @objid ("00fc8abf-f352-41f9-99c0-fa04ea457402")
    @Override
    public void setTarget(StateVertex value) {
        appendDepVal(TransitionData.Metadata.TargetDep(), (SmObjectImpl)value);
    }

    @objid ("eaacffea-3a9e-4796-88d6-18641b3dc895")
    @Override
    public StateVertex getSource() {
        return (StateVertex) getDepVal(TransitionData.Metadata.SourceDep());
    }

    @objid ("f8a11e6b-0368-412c-9ce5-3b00bb82709c")
    @Override
    public void setSource(StateVertex value) {
        appendDepVal(TransitionData.Metadata.SourceDep(), (SmObjectImpl)value);
    }

    @objid ("2e0aafc3-0ac6-4620-b08c-e0d640b879d5")
    @Override
    public Signal getEffects() {
        return (Signal) getDepVal(TransitionData.Metadata.EffectsDep());
    }

    @objid ("ccad7399-7a12-41d1-b267-4efc99d9f9fc")
    @Override
    public void setEffects(Signal value) {
        appendDepVal(TransitionData.Metadata.EffectsDep(), (SmObjectImpl)value);
    }

    @objid ("11a60965-bb11-497f-a5e9-154752386d32")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c0f98e67-3e05-46b7-8201-b67321a75a44")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TransitionData.Metadata.SourceDep());
        if (obj != null)
          return new SmDepVal(TransitionData.Metadata.SourceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("94fb807d-b07f-4962-a1a4-e8278ede9e17")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTransition(this);
        else
          return null;
    }

}
