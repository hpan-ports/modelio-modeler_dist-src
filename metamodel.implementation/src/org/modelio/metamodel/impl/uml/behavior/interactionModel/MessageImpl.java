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
    @objid ("8472070d-9202-4810-85b3-42dec719d5ce")
    @Override
    public String getArgument() {
        return (String) getAttVal(MessageData.Metadata.ArgumentAtt());
    }

    @objid ("f5694378-9523-4e9c-9495-e534f64d8389")
    @Override
    public void setArgument(String value) {
        setAttVal(MessageData.Metadata.ArgumentAtt(), value);
    }

    @objid ("2fc5f51c-9cfe-42ec-89e6-77458885b72b")
    @Override
    public MessageKind getKindOfMessage() {
        return (MessageKind) getAttVal(MessageData.Metadata.KindOfMessageAtt());
    }

    @objid ("c6e105af-11f3-4ad0-aefc-dbfff23a8d34")
    @Override
    public void setKindOfMessage(MessageKind value) {
        setAttVal(MessageData.Metadata.KindOfMessageAtt(), value);
    }

    @objid ("dd897ad1-d30a-49d4-b224-33cac3ce888f")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(MessageData.Metadata.SortOfMessageAtt());
    }

    @objid ("0133b3a5-0113-4b2a-b4a4-727327e1f44d")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(MessageData.Metadata.SortOfMessageAtt(), value);
    }

    @objid ("17e60d89-2f4b-4a91-b362-a2351a7951bd")
    @Override
    public Signal getSignalSignature() {
        return (Signal) getDepVal(MessageData.Metadata.SignalSignatureDep());
    }

    @objid ("bfc07bef-e509-424a-997e-12a71ec5b174")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(MessageData.Metadata.SignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("7d5259a8-74cc-41c3-8a13-9b1d41237635")
    @Override
    public MessageEnd getReceiveEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.ReceiveEventDep());
    }

    @objid ("d31123c2-0c7a-44d1-85d7-def7f6cd20da")
    @Override
    public void setReceiveEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.ReceiveEventDep(), (SmObjectImpl)value);
    }

    @objid ("e429e42a-fead-4169-9d85-a729d7684ec4")
    @Override
    public MessageEnd getSendEvent() {
        return (MessageEnd) getDepVal(MessageData.Metadata.SendEventDep());
    }

    @objid ("cdd089a1-59e6-4bee-a74b-7288d93d7855")
    @Override
    public void setSendEvent(MessageEnd value) {
        appendDepVal(MessageData.Metadata.SendEventDep(), (SmObjectImpl)value);
    }

    @objid ("4620dd12-d0f3-472b-b6d4-38a313519a25")
    @Override
    public Operation getInvoked() {
        return (Operation) getDepVal(MessageData.Metadata.InvokedDep());
    }

    @objid ("6efc13b1-f5f5-477a-b8bd-dbf46d5ed4eb")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(MessageData.Metadata.InvokedDep(), (SmObjectImpl)value);
    }

    @objid ("d4089f0f-2247-4749-9011-581c7c450ce7")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, MessageData.Metadata.RealizedInformationFlowDep());
    }

    @objid ("63401280-6843-4a28-a1d2-afd986b2a7a9")
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

    @objid ("7510db1d-3c3d-4da5-aa6a-302de945ce48")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f47ee59d-a4c2-453a-bf7d-97f8ae7c4659")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageData.Metadata.SendEventDep());
        if (obj != null)
          return new SmDepVal(MessageData.Metadata.SendEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d5c909e9-935c-49ad-9e29-548c7d21e58b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessage(this);
        else
          return null;
    }

}
