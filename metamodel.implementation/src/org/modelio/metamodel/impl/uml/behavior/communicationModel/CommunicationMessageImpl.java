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
    @objid ("bf610819-3714-4b84-a104-6bc2f7bf0954")
    @Override
    public String getArgument() {
        return (String) getAttVal(CommunicationMessageData.Metadata.ArgumentAtt());
    }

    @objid ("2a26fa22-db6b-40a8-9f6b-32cca2d13fc3")
    @Override
    public void setArgument(String value) {
        setAttVal(CommunicationMessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("e26dbf9a-ab76-4473-a783-be3988a63aa9")
    @Override
    public String getSequence() {
        return (String) getAttVal(CommunicationMessageData.Metadata.SequenceAtt());
    }

    @objid ("4b592152-5db1-4237-b131-cce352bf3585")
    @Override
    public void setSequence(String value) {
        setAttVal(CommunicationMessageData.Metadata.SequenceAtt(), value);
    }

    @objid ("aeb927ec-f692-4069-b488-49c23922277b")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("f14f10b4-a9e5-4f54-8e48-16ddeeba4362")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(CommunicationMessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("1215d52a-ea62-48e8-85c4-b89dd7824394")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, CommunicationMessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("9a63eefd-31eb-43f3-93ff-6766e082d590")
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

    @objid ("b2b9f400-8467-4fca-af57-346dbb56ac9d")
    @Override
    public CommunicationChannel getChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.ChannelDep());
    }

    @objid ("414d5527-ccb2-4d7f-8ba1-6e286af5a53a")
    @Override
    public void setChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.ChannelDep(), (SmObjectImpl)value);
    }

    @objid ("3462c048-e610-4aa5-95d9-79d08326c5bf")
    @Override
    public CommunicationChannel getInvertedChannel() {
        return (CommunicationChannel) getDepVal(CommunicationMessageData.Metadata.InvertedChannelDep());
    }

    @objid ("a36a9a64-9f48-495d-a63d-ea87ddbc92e9")
    @Override
    public void setInvertedChannel(CommunicationChannel value) {
        appendDepVal(CommunicationMessageData.Metadata.InvertedChannelDep(), (SmObjectImpl)value);
    }

    @objid ("13da081b-694c-4025-a24d-4524ff811152")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(CommunicationMessageData.Metadata.InvokedDep());
    }

    @objid ("9900926c-336e-4964-a242-4b09a1ceb04d")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(CommunicationMessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("61b72297-271e-43ee-969e-20642d165abb")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(CommunicationMessageData.Metadata.SignalSignatureDep());
    }

    @objid ("795328d8-8561-4603-a365-6defe621f945")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(CommunicationMessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("c8a30013-9c75-4d83-91ac-5a8b76a2540d")
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

    @objid ("1e41d0e9-0c7d-4537-bdac-55e6b80d5514")
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

    @objid ("4b4926c7-ea2d-4b5a-9d7b-942329005a98")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCommunicationMessage(this);
        else
          return null;
    }

}
