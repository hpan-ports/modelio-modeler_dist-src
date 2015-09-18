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
    @objid ("3f6a468d-c6ab-44a5-8749-2c2bf52f6e08")
    @Override
    public String getArgument() {
        return (String) getAttVal(MessageData.Metadata.ArgumentAtt());
    }

    @objid ("229f6915-4eed-4aa0-9b10-4bd8db1799a8")
    @Override
    public void setArgument(String value) {
        setAttVal(MessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("1188adb6-5f65-4343-849c-c5ba8ac90760")
    @Override
    public MessageKind getKindOfMessage() {
        return (MessageKind) getAttVal(MessageData.Metadata.KindOfMessageAtt());
    }

    @objid ("71b6184a-4202-499c-8b05-79802c174b33")
    @Override
    public void setKindOfMessage(MessageKind value) {
        setAttVal(MessageData.Metadata.KindOfMessageAtt(), value);
    }

    @objid ("ff56efe8-615b-4ac8-8cfd-cb6e22369f94")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(MessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("5a6c8688-1b51-4c55-88fe-af4edd743dd9")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(MessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("ab38836e-cd79-486b-ae6e-2c2a91db81e8")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(MessageData.Metadata.SignalSignatureDep());
    }

    @objid ("522d9988-89ae-4c4b-8dd6-aa7a9b0ca013")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(MessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("07dfdfc9-3320-4c19-a56b-81087569fe6c")
    @Override
    public MessageEnd getReceiveEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.ReceiveEventDep());
    }

    @objid ("0f5b367f-45f6-4f60-a54e-38ba456f644f")
    @Override
    public void setReceiveEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.ReceiveEventDep(), (SmObjectImpl)value);
    }

    @objid ("e68d2bda-351a-46e5-9aae-a4f15e17ed52")
    @Override
    public MessageEnd getSendEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.SendEventDep());
    }

    @objid ("e40f74e6-abe5-416b-957f-32ecd9a4cc7f")
    @Override
    public void setSendEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.SendEventDep(), (SmObjectImpl)value);
    }

    @objid ("a2e22017-8096-4628-999f-0a5e7be1670a")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(MessageData.Metadata.InvokedDep());
    }

    @objid ("8fd3114a-02f2-437c-b067-fc27709b54c0")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(MessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("1e4b0e8e-f087-41bb-a03d-399b6d3f8364")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, MessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("600d9de9-aad6-4a8d-915f-2e1935408e79")
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

    @objid ("361a4ecb-bbd2-42f8-9852-0ca870c95920")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("11b1395c-cc67-4ea8-baed-cd9ef04e08c4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return new SmDepVal(MessageData.Metadata.SendEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e2f7c7d8-0538-42cd-90c2-66474280711c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessage(this);
        else
          return null;
    }

}
