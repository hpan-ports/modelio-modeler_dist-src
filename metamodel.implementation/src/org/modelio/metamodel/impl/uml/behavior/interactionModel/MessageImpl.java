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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
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

@objid ("00496c04-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageImpl extends ModelElementImpl implements Message {
    @objid ("1a8c92b5-4ccd-4f8f-90af-86f12f425a06")
    @Override
    public String getArgument() {
        return (String) getAttVal(MessageData.Metadata.ArgumentAtt());
    }

    @objid ("519b240a-659d-4d5d-b18d-0c2987861cec")
    @Override
    public void setArgument(String value) {
        setAttVal(MessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("16d559e6-d25a-4737-b444-98cdb3d74b1d")
    @Override
    public MessageKind getKindOfMessage() {
        return (MessageKind) getAttVal(MessageData.Metadata.KindOfMessageAtt());
    }

    @objid ("54861ccd-1bbc-4345-88ab-5380b32bd701")
    @Override
    public void setKindOfMessage(MessageKind value) {
        setAttVal(MessageData.Metadata.KindOfMessageAtt(), value);
    }

    @objid ("7ae42cba-f576-4cf8-b042-ac9175191ba2")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(MessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("e444ab8e-bb4d-4a43-b783-b8f9eb61d812")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(MessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("606556c3-061b-4ee0-9589-384bf33a65bd")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(MessageData.Metadata.SignalSignatureDep());
    }

    @objid ("7f5bc28b-c0b6-4dbb-9c07-56b843c909e6")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(MessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("872d54cf-587b-4148-b039-d12042729897")
    @Override
    public MessageEnd getReceiveEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.ReceiveEventDep());
    }

    @objid ("8753c03e-fe0f-4185-b3a7-0ee1ea360537")
    @Override
    public void setReceiveEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.ReceiveEventDep(), (SmObjectImpl)value);
    }

    @objid ("7d92bd78-296b-49aa-b85e-bfeed09d1cf4")
    @Override
    public MessageEnd getSendEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.SendEventDep());
    }

    @objid ("87bbb8c1-8a08-44eb-a697-369bb93962ef")
    @Override
    public void setSendEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.SendEventDep(), (SmObjectImpl)value);
    }

    @objid ("6254c62a-b287-41e9-8624-ab9841a8bc21")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(MessageData.Metadata.InvokedDep());
    }

    @objid ("de8fbdd5-8d6b-4504-a0d8-b5dad14f9809")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(MessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("bdbf1b01-5644-4aa4-b0ad-bb69f1606d20")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, MessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("98e9a056-1260-4495-ac8e-b25dca9153e2")
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

    @objid ("66220d83-069b-4f4e-8aec-7898ed43623b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fdb4bb87-dede-4ab7-8616-8c15dba9e041")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return new SmDepVal(MessageData.Metadata.SendEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("be914c4e-9965-4505-b844-dd4815539a7a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessage(this);
        else
          return null;
    }

}
