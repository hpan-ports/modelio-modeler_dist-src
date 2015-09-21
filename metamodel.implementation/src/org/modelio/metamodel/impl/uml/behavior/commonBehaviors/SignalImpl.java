/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0042379a-c4bf-1fd8-97fe-001ec947cd2a")
public class SignalImpl extends GeneralClassImpl implements Signal {
    @objid ("138de8bb-c1fb-40cf-aa2c-b6d089efd60a")
    @Override
    public boolean isIsEvent() {
        return (Boolean) getAttVal(((SignalSmClass)getClassOf()).getIsEventAtt());
    }

    @objid ("43863961-3bf2-456d-8b40-0c55870e9436")
    @Override
    public void setIsEvent(boolean value) {
        setAttVal(((SignalSmClass)getClassOf()).getIsEventAtt(), value);
    }

    @objid ("8ba3d91a-e0f8-4b7c-ac22-2b0330f3c70d")
    @Override
    public boolean isIsException() {
        return (Boolean) getAttVal(((SignalSmClass)getClassOf()).getIsExceptionAtt());
    }

    @objid ("aa83e618-ba12-47b6-826f-4f8a22e0fd83")
    @Override
    public void setIsException(boolean value) {
        setAttVal(((SignalSmClass)getClassOf()).getIsExceptionAtt(), value);
    }

    @objid ("da105b1d-c7c2-427d-8bba-6c5393998d6f")
    @Override
    public EList<SendSignalAction> getSender() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getSenderDep());
    }

    @objid ("680ec1b1-e236-4e09-b928-2d2a1700e31c")
    @Override
    public <T extends SendSignalAction> List<T> getSender(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final SendSignalAction element : getSender()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ca9dcf89-bb96-4a99-8d35-5fb866b75593")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getUsageDep());
    }

    @objid ("d722673f-2307-43a1-a34f-d5a172956c62")
    @Override
    public <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Message element : getUsage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("035bf9cb-8869-4374-8b78-9428ab9a339f")
    @Override
    public EList<Transition> getSends() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getSendsDep());
    }

    @objid ("c7ab4795-b6f2-41c6-9c01-fca509b1516a")
    @Override
    public <T extends Transition> List<T> getSends(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getSends()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b6d98edd-e85f-45c0-ae34-09b6a862a219")
    @Override
    public Parameter getPBase() {
        Object obj = getDepVal(((SignalSmClass)getClassOf()).getPBaseDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("fd319e0b-0725-4ae0-803c-121e5ce7544c")
    @Override
    public void setPBase(Parameter value) {
        appendDepVal(((SignalSmClass)getClassOf()).getPBaseDep(), (SmObjectImpl)value);
    }

    @objid ("152f2406-6a6c-4071-9ce8-4cecea1d59f8")
    @Override
    public Operation getOBase() {
        Object obj = getDepVal(((SignalSmClass)getClassOf()).getOBaseDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("783c31a3-c233-4de2-a945-32298ac2ab51")
    @Override
    public void setOBase(Operation value) {
        appendDepVal(((SignalSmClass)getClassOf()).getOBaseDep(), (SmObjectImpl)value);
    }

    @objid ("a259ac70-21e9-4a92-b02b-1b85e1efe232")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getCommunicationUsageDep());
    }

    @objid ("b3233fc6-c56b-4a11-aaa5-a9c64753b5a6")
    @Override
    public <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationMessage element : getCommunicationUsage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bcebad91-64af-4b56-9e9f-6d9f4dace0ae")
    @Override
    public EList<DataFlow> getDOccurence() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getDOccurenceDep());
    }

    @objid ("6682d8fd-9290-4281-902e-08deb72e73d2")
    @Override
    public <T extends DataFlow> List<T> getDOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final DataFlow element : getDOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f1ab3f82-8523-4a7b-8d8a-1642fa2f0a73")
    @Override
    public EList<Event> getEOccurence() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getEOccurenceDep());
    }

    @objid ("f12fb9ff-9092-4913-b282-c4e04345ff4c")
    @Override
    public <T extends Event> List<T> getEOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Event element : getEOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb4e9e14-4090-4224-90d6-963821b00859")
    @Override
    public GeneralClass getBase() {
        Object obj = getDepVal(((SignalSmClass)getClassOf()).getBaseDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("697e6579-9386-4954-9825-ea431820420d")
    @Override
    public void setBase(GeneralClass value) {
        appendDepVal(((SignalSmClass)getClassOf()).getBaseDep(), (SmObjectImpl)value);
    }

    @objid ("72e7492f-4ba7-4092-ac84-319530cf3ccc")
    @Override
    public EList<AcceptSignalAction> getReceiver() {
        return new SmList<>(this, ((SignalSmClass)getClassOf()).getReceiverDep());
    }

    @objid ("103a92ec-1c0c-4675-92bb-103574f9cce4")
    @Override
    public <T extends AcceptSignalAction> List<T> getReceiver(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AcceptSignalAction element : getReceiver()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cc4537f2-1798-49f0-8173-14230625b8c2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("27fa2a0d-b07b-4ff5-bcd7-fa7ce6ad2e93")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("b7d51a91-804e-45cd-b147-4f8e6f90ebe9")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitSignal(this);
        else
          return null;
    }

}
