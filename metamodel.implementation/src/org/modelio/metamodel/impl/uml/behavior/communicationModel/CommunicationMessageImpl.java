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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("005b2ef8-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationMessageImpl extends ModelElementImpl implements CommunicationMessage {
    @objid ("cea52177-18a4-4d07-bfe0-ea889863fc41")
    @Override
    public String getArgument() {
        return (String) getAttVal(CommunicationMessageData.Metadata.ArgumentAtt());
    }

    @objid ("1ec87207-c7d8-4bd7-b59c-00f271bcee31")
    @Override
    public void setArgument(String value) {
        setAttVal(CommunicationMessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("f235bebe-7873-4242-adb4-538f5d627883")
    @Override
    public String getSequence() {
        return (String) getAttVal(CommunicationMessageData.Metadata.SequenceAtt());
    }

    @objid ("14a57f50-db8a-4ea4-807a-b3bfe5fe9319")
    @Override
    public void setSequence(String value) {
        setAttVal(CommunicationMessageData.Metadata.SequenceAtt(), value);
    }

    @objid ("4df7f355-ab13-4323-99d5-3eeac7e1dcc4")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("d2898ce6-b172-49b1-9a78-6123e9246467")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("ef53d5d7-1b46-4ae2-bcac-792864606ec0")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, CommunicationMessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("58eca893-bdc2-40c0-92fe-97daccd92693")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getRealizedInformationFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7cd8e018-5b2f-409b-b814-86fc9e81317f")
    @Override
    public CommunicationChannel getChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.ChannelDep());
    }

    @objid ("d8cad038-f967-42ef-ae35-0c3179d6cf98")
    @Override
    public void setChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("094ce1b1-a466-438b-a4e1-813d24441c8c")
    @Override
    public CommunicationChannel getInvertedChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
    }

    @objid ("c2aebb20-9249-4bfc-b9b8-60085472261b")
    @Override
    public void setInvertedChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), (SmObjectImpl)value);
    }

    @objid ("f8f57e9e-28b1-4eea-a3f7-f1b6e476158d")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(CommunicationMessageData.Metadata.InvokedDep());
    }

    @objid ("60f3d13f-7662-4c59-a798-f32f0fb09114")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(CommunicationMessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("efca6409-ee4a-49a4-8ecb-3e6353a9bac0")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(CommunicationMessageData.Metadata.SignalSignatureDep());
    }

    @objid ("c71d7622-a0cd-4f99-9762-75f52495237d")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(CommunicationMessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("25e5aaf9-a485-4b38-8324-4d356eb8981e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.ChannelDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2cdf34fc-9b4e-4873-83ae-23048e9a77cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.ChannelDep());
        if (obj != null)
          return new SmDepVal(CommunicationMessageData.Metadata.ChannelDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
        if (obj != null)
          return new SmDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("6f20bdcd-2f46-4108-8f8a-07a5d0de8d1c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationMessage(this);
        else
          return null;
    }

}
