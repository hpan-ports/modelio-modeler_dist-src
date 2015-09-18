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
    @objid ("958ffa9c-792d-4d48-a1cd-bd0ddecaf20c")
    @Override
    public boolean isIsEvent() {
        return (Boolean) getAttVal(SignalData.Metadata.IsEventAtt());
    }

    @objid ("dbce6403-cafc-4823-85b2-707e5e32f226")
    @Override
    public void setIsEvent(boolean value) {
        setAttVal(SignalData.Metadata.IsEventAtt(), value);
    }

    @objid ("3f82e333-f3dd-43c6-a617-d18e27a3769c")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(SignalData.Metadata.IsExceptionAtt());
    }

    @objid ("db5fac50-59c5-4cba-b8d1-6ba55362e03a")
    @Override
    public void setIsException(boolean value) {
        setAttVal(SignalData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("2ff67719-3ef0-4423-8ae3-cc0de894f4ee")
    @Override
    public EList<SendSignalAction> getSender() {
        return new SmList<>(this, SignalData.Metadata.SenderDep());
    }

    @objid ("a6ba061d-4e84-4fc6-93b1-8aa10610b8ba")
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

    @objid ("c83fd6ee-45e6-4fff-9454-9ceecfb15093")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, SignalData.Metadata.UsageDep());
    }

    @objid ("095e6806-75b9-43c0-ac73-d928ead714d0")
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

    @objid ("9d975aa9-ec15-4b9d-9a0f-89f4633417dc")
    @Override
    public EList<Transition> getSends() {
        return new SmList<>(this, SignalData.Metadata.SendsDep());
    }

    @objid ("0ec83f08-4528-427e-a054-f77a2f547911")
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

    @objid ("7660a576-0147-426f-bc6b-8a351f187bc9")
    @Override
    public Parameter getPBase() {
        return (Parameter) getDepVal(SignalData.Metadata.PBaseDep());
    }

    @objid ("abc2be1b-a101-4ea7-a36e-e58be4331527")
    @Override
    public void setPBase(Parameter value) {
        appendDepVal(SignalData.Metadata.PBaseDep(), (SmObjectImpl)value);
    }

    @objid ("53888bdd-8e93-41d2-8f3d-727abf0f18a1")
    @Override
    public Operation getOBase() {
        return (Operation) getDepVal(SignalData.Metadata.OBaseDep());
    }

    @objid ("cbb83886-6bdc-448c-baf2-2ed9e4e679bb")
    @Override
    public void setOBase(Operation value) {
        appendDepVal(SignalData.Metadata.OBaseDep(), (SmObjectImpl)value);
    }

    @objid ("dee07f51-6993-404c-b3b2-eaa0af014d25")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, SignalData.Metadata.CommunicationUsageDep());
    }

    @objid ("760a102e-49a9-4ef0-abf6-94bb27b631b9")
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

    @objid ("e7ae6a09-7634-411c-8f0d-029b0a56bb25")
    @Override
    public EList<DataFlow> getDOccurence() {
        return new SmList<>(this, SignalData.Metadata.DOccurenceDep());
    }

    @objid ("9d1245c0-e9f3-464b-b304-d2d90a2bf41d")
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

    @objid ("01fbb402-260a-4269-abbd-91f9886d0841")
    @Override
    public EList<Event> getEOccurence() {
        return new SmList<>(this, SignalData.Metadata.EOccurenceDep());
    }

    @objid ("186e79db-3a4d-4cb6-b1a6-b4c7a9da836e")
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

    @objid ("8850d12d-11a0-4ca9-9560-ad9e781b2fab")
    @Override
    public GeneralClass getBase() {
        return (GeneralClass) getDepVal(SignalData.Metadata.BaseDep());
    }

    @objid ("f098247c-4861-4bf8-8a8b-9ac3359dff09")
    @Override
    public void setBase(GeneralClass value) {
        appendDepVal(SignalData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("3af64b79-47e2-4e14-81c2-735761e35fa5")
    @Override
    public EList<AcceptSignalAction> getReceiver() {
        return new SmList<>(this, SignalData.Metadata.ReceiverDep());
    }

    @objid ("7886de1c-a3db-4814-bd7d-2c3eda71319f")
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

    @objid ("d5893ef5-b0de-4304-beed-35f7aff83a79")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a1e30446-f784-4159-a646-f92de557f8bf")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("33480996-f089-43ca-bf4c-9880e2071a79")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSignal(this);
        else
          return null;
    }

}
