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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.impl.uml.statik.GeneralClassImpl;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0042379a-c4bf-1fd8-97fe-001ec947cd2a")
public class SignalImpl extends GeneralClassImpl implements Signal {
    @objid ("0e49523a-56b8-4a91-9365-0e6857fc8545")
    @Override
    public boolean isIsEvent() {
        return (Boolean) getAttVal(SignalData.Metadata.IsEventAtt());
    }

    @objid ("ae1d6bda-97e2-4da1-b85f-ccf9bea3e5b7")
    @Override
    public void setIsEvent(boolean value) {
        setAttVal(SignalData.Metadata.IsEventAtt(), value);
    }

    @objid ("03b3159e-1479-48b6-84a3-dcb04fc33536")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(SignalData.Metadata.IsExceptionAtt());
    }

    @objid ("5958b4bc-9be0-492e-a8f6-30a04c29a3c2")
    @Override
    public void setIsException(boolean value) {
        setAttVal(SignalData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("53e678ac-3e68-4e88-864d-e9a9dcf8fe33")
    @Override
    public EList<SendSignalAction> getSender() {
        return new SmList<>(this, SignalData.Metadata.SenderDep());
    }

    @objid ("62795d85-3ef2-44a7-b510-375263c8f413")
    @Override
    public <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final SendSignalAction element : getSender()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e826e668-b185-4b09-804d-d710a899a2d1")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, SignalData.Metadata.UsageDep());
    }

    @objid ("2dcee7d1-eba6-4d2d-bf78-13aca1b8d880")
    @Override
    public <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Message element : getUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af89053f-be03-49da-b999-fca55eb58aaa")
    @Override
    public EList<Transition> getSends() {
        return new SmList<>(this, SignalData.Metadata.SendsDep());
    }

    @objid ("cf1ef012-3c34-4815-bdaa-3836fd66a40f")
    @Override
    public <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getSends()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f2077e35-8e5c-4958-b111-6be60ba8ff8c")
    @Override
    public Parameter getPBase() {
        return (Parameter) getDepVal(SignalData.Metadata.PBaseDep());
    }

    @objid ("1ea78a06-5633-487f-8eb7-0cf905ebfdcf")
    @Override
    public void setPBase(Parameter value) {
        appendDepVal(SignalData.Metadata.PBaseDep(), (SmObjectImpl)value);
    }

    @objid ("8c4efd5f-4d0f-416e-a791-e6874f05abca")
    @Override
    public Operation getOBase() {
        return (Operation) getDepVal(SignalData.Metadata.OBaseDep());
    }

    @objid ("4bb10f2e-0ce8-4ab8-accc-0aa4c9b0cbed")
    @Override
    public void setOBase(Operation value) {
        appendDepVal(SignalData.Metadata.OBaseDep(), (SmObjectImpl)value);
    }

    @objid ("52087cc0-b9d6-401d-9e7e-5cb311433b87")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, SignalData.Metadata.CommunicationUsageDep());
    }

    @objid ("58a0418e-c5b0-4b60-8501-02430fcc3c18")
    @Override
    public <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getCommunicationUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4f424c4a-f1e6-4643-9377-e84dddb0c434")
    @Override
    public EList<DataFlow> getDOccurence() {
        return new SmList<>(this, SignalData.Metadata.DOccurenceDep());
    }

    @objid ("fc4f8d01-522e-4dda-a348-032146eb74c2")
    @Override
    public <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final DataFlow element : getDOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1c92bac0-c7a1-4e1e-bb21-6c466010139b")
    @Override
    public EList<Event> getEOccurence() {
        return new SmList<>(this, SignalData.Metadata.EOccurenceDep());
    }

    @objid ("dba7b4b7-7741-4689-8089-403ab20bdcec")
    @Override
    public <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getEOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d55c02a0-7323-4eb2-a494-d83a4ca7e93c")
    @Override
    public GeneralClass getBase() {
        return (GeneralClass) getDepVal(SignalData.Metadata.BaseDep());
    }

    @objid ("494e868c-548c-42f5-8023-db5db53eebd3")
    @Override
    public void setBase(GeneralClass value) {
        appendDepVal(SignalData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("5864c147-85a6-45fd-9dd7-e38d5ad499c5")
    @Override
    public EList<AcceptSignalAction> getReceiver() {
        return new SmList<>(this, SignalData.Metadata.ReceiverDep());
    }

    @objid ("985872d0-f01c-46ea-9843-8ef1490048b0")
    @Override
    public <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AcceptSignalAction element : getReceiver()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d0a238da-d706-4b3c-bf89-be1d13383227")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3bf91f26-5ecb-4e34-9972-10a7ac3a3007")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("77c87dea-a166-47fe-bf59-d746dbfc5cef")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSignal(this);
        else
          return null;
    }

}
