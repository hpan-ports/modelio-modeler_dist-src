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
    @objid ("55a33cb0-a5da-433b-a0c6-b26b9c0d7344")
    @Override
    public String getArgument() {
        return (String) getAttVal(CommunicationMessageData.Metadata.ArgumentAtt());
    }

    @objid ("c1446f8a-f7d6-4080-a281-8346b32b6df1")
    @Override
    public void setArgument(String value) {
        setAttVal(CommunicationMessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("b7ce9ba8-d662-49d1-8bf5-d7458588dd66")
    @Override
    public String getSequence() {
        return (String) getAttVal(CommunicationMessageData.Metadata.SequenceAtt());
    }

    @objid ("a5b823a2-7dd1-4502-a450-c4bb9ec09541")
    @Override
    public void setSequence(String value) {
        setAttVal(CommunicationMessageData.Metadata.SequenceAtt(), value);
    }

    @objid ("206052af-c3ac-48ee-899d-91a416b16a26")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("2c4666a0-f70c-4946-a887-2ed4ded7014e")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("4932184e-3c42-43c5-9a70-cb43eb3defb4")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, CommunicationMessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("84b71ac6-d7a2-441e-847e-ad61b9976bca")
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

    @objid ("decc953e-ff92-41b0-8e68-c0039148b4fd")
    @Override
    public CommunicationChannel getChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.ChannelDep());
    }

    @objid ("70fc60e9-4133-4bbf-94ee-0c420958c9bd")
    @Override
    public void setChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("99b37443-4a2e-4baa-a724-9ab6500acbf3")
    @Override
    public CommunicationChannel getInvertedChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
    }

    @objid ("82362dac-e234-4fa7-82a4-f3001a1cfd99")
    @Override
    public void setInvertedChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), (SmObjectImpl)value);
    }

    @objid ("6a4e9cc8-c19f-40f9-b807-a0fc18b7870a")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(CommunicationMessageData.Metadata.InvokedDep());
    }

    @objid ("82714ba8-fb5c-4602-8eb3-f2aef60fa73a")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(CommunicationMessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("30199045-a31a-4713-a275-132a6d7a51fe")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(CommunicationMessageData.Metadata.SignalSignatureDep());
    }

    @objid ("c1ba62a1-63ce-4c6e-aeff-26d3e98ee0eb")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(CommunicationMessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("69a23e45-189b-4aa1-8e18-b4b15e905aec")
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

    @objid ("bd6df492-7511-4214-ad61-af43e1adb7ca")
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

    @objid ("e1dd9bdb-5079-4dce-b8e9-d3d67a3c9aad")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationMessage(this);
        else
          return null;
    }

}
