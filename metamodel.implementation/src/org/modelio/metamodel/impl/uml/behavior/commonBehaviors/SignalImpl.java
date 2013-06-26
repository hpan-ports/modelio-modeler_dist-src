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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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
    @objid ("38e1142b-3d3d-4c4a-aadd-ad98dd1c3e60")
    @Override
    public boolean isIsEvent() {
        return (Boolean) getAttVal(SignalData.Metadata.IsEventAtt());
    }

    @objid ("103e0a7a-195f-441f-b835-14338a6fe3ed")
    @Override
    public void setIsEvent(boolean value) {
        setAttVal(SignalData.Metadata.IsEventAtt(), value);
    }

    @objid ("67ebf7e8-ff77-4917-a734-e95c64c40ea7")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(SignalData.Metadata.IsExceptionAtt());
    }

    @objid ("83b9b1cb-2bb7-4589-be7f-fb61bf4211d6")
    @Override
    public void setIsException(boolean value) {
        setAttVal(SignalData.Metadata.IsExceptionAtt(), value);
    }

    @objid ("9b8f8a48-3500-4aac-a547-2b8e0ff66683")
    @Override
    public EList<SendSignalAction> getSender() {
        return new SmList<>(this, SignalData.Metadata.SenderDep());
    }

    @objid ("8aa4fc22-5114-4b0b-b9b7-fbda2356965b")
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

    @objid ("c4e5df3e-3a0f-4b51-bb4a-ff73004bdc53")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, SignalData.Metadata.UsageDep());
    }

    @objid ("a47f1071-d007-41cb-8926-7adb4ef7111c")
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

    @objid ("dba15828-b65b-4e2a-9774-dbd32c4837ca")
    @Override
    public EList<Transition> getSends() {
        return new SmList<>(this, SignalData.Metadata.SendsDep());
    }

    @objid ("c0766d8c-e9c6-44e3-84f6-33e8b6e7b160")
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

    @objid ("8e5ef557-8368-404b-b6ea-fc63c6eba66f")
    @Override
    public Parameter getPBase() {
        return (Parameter) getDepVal(SignalData.Metadata.PBaseDep());
    }

    @objid ("1cda1ffb-a02c-43d9-bb01-98d4a01c970d")
    @Override
    public void setPBase(Parameter value) {
        appendDepVal(SignalData.Metadata.PBaseDep(), (SmObjectImpl)value);
    }

    @objid ("2cfe8fa3-bbad-464f-a8ea-10e7a2c276a4")
    @Override
    public ModelElement getBrowseBase() {
        return (ModelElement) getDepVal(SignalData.Metadata.BrowseBaseDep());
    }

    @objid ("88b6c55b-cc02-44ac-a348-7dbb841826c1")
    @Override
    public void setBrowseBase(ModelElement value) {
        appendDepVal(SignalData.Metadata.BrowseBaseDep(), (SmObjectImpl)value);
    }

    @objid ("46f78d25-5d15-4a58-95b5-d882e98a0e84")
    @Override
    public Operation getOBase() {
        return (Operation) getDepVal(SignalData.Metadata.OBaseDep());
    }

    @objid ("25fd94de-98e7-4ff5-87a0-349902bb4b35")
    @Override
    public void setOBase(Operation value) {
        appendDepVal(SignalData.Metadata.OBaseDep(), (SmObjectImpl)value);
    }

    @objid ("c13d7814-b2e2-4f25-9282-f4ee048f34a5")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, SignalData.Metadata.CommunicationUsageDep());
    }

    @objid ("effc7fe7-d10f-4f2d-8f15-710bb5fbab7b")
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

    @objid ("354e1b17-6121-4cc8-b7f0-689bd481cdb2")
    @Override
    public EList<DataFlow> getDOccurence() {
        return new SmList<>(this, SignalData.Metadata.DOccurenceDep());
    }

    @objid ("01d61517-2b0f-4d09-908b-838fa630e442")
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

    @objid ("5e4dc1c2-815e-455c-9d9e-6d77137b44d8")
    @Override
    public EList<Event> getEOccurence() {
        return new SmList<>(this, SignalData.Metadata.EOccurenceDep());
    }

    @objid ("40433b4c-893f-4b87-b1c2-909420827a9b")
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

    @objid ("1013eb8b-7369-4dec-bb96-c2b9b62c0318")
    @Override
    public GeneralClass getBase() {
        return (GeneralClass) getDepVal(SignalData.Metadata.BaseDep());
    }

    @objid ("6683d992-0ef1-4d6d-9a8d-d5a442fd543d")
    @Override
    public void setBase(GeneralClass value) {
        appendDepVal(SignalData.Metadata.BaseDep(), (SmObjectImpl)value);
    }

    @objid ("9e385d13-65f4-4019-aeb7-9dc978a0b882")
    @Override
    public EList<AcceptSignalAction> getReceiver() {
        return new SmList<>(this, SignalData.Metadata.ReceiverDep());
    }

    @objid ("8b21d780-de27-4867-8218-8ce803fd6ef2")
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

    @objid ("45b735ba-9b30-4a23-8c9c-233324c08cf0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2c666027-dae7-4ba6-b8df-c2d7ef9b22fd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("cde04cdd-b441-4601-85ba-be0877cee079")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSignal(this);
        else
          return null;
    }

}
