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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00496c04-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageImpl extends ModelElementImpl implements Message {
    @objid ("b101cec7-b3d3-481e-acaf-84769d30a95c")
    @Override
    public String getArgument() {
        return (String) getAttVal(((MessageSmClass)getClassOf()).getArgumentAtt());
    }

    @objid ("c2467143-aff9-407f-83d5-b8df2d9e35ef")
    @Override
    public void setArgument(String value) {
        setAttVal(((MessageSmClass)getClassOf()).getArgumentAtt(), value);
    }

    @objid ("ca0dd94f-3e0b-4e3a-b94a-739223ca4b2d")
    @Override
    public MessageKind getKindOfMessage() {
        return (MessageKind) getAttVal(((MessageSmClass)getClassOf()).getKindOfMessageAtt());
    }

    @objid ("5fbb4716-8e88-4536-a747-3e412811a990")
    @Override
    public void setKindOfMessage(MessageKind value) {
        setAttVal(((MessageSmClass)getClassOf()).getKindOfMessageAtt(), value);
    }

    @objid ("53c6775c-430c-44c7-947c-34e103365f74")
    @Override
    public MessageSort getSortOfMessage() {
        return (MessageSort) getAttVal(((MessageSmClass)getClassOf()).getSortOfMessageAtt());
    }

    @objid ("c00429b2-2423-49b2-b6f8-1f4099c146e8")
    @Override
    public void setSortOfMessage(MessageSort value) {
        setAttVal(((MessageSmClass)getClassOf()).getSortOfMessageAtt(), value);
    }

    @objid ("de2fa662-141a-463e-8521-54f854940018")
    @Override
    public Signal getSignalSignature() {
        Object obj = getDepVal(((MessageSmClass)getClassOf()).getSignalSignatureDep());
        return (obj instanceof Signal)? (Signal)obj : null;
    }

    @objid ("5ca73fc2-7515-4393-b5b2-7175750f3f51")
    @Override
    public void setSignalSignature(Signal value) {
        appendDepVal(((MessageSmClass)getClassOf()).getSignalSignatureDep(), (SmObjectImpl)value);
    }

    @objid ("ab6bba27-b516-4939-ab90-9cba54d765ab")
    @Override
    public MessageEnd getReceiveEvent() {
        Object obj = getDepVal(((MessageSmClass)getClassOf()).getReceiveEventDep());
        return (obj instanceof MessageEnd)? (MessageEnd)obj : null;
    }

    @objid ("6b8d4a72-1a1f-4599-a2e9-59f813d10eb3")
    @Override
    public void setReceiveEvent(MessageEnd value) {
        appendDepVal(((MessageSmClass)getClassOf()).getReceiveEventDep(), (SmObjectImpl)value);
    }

    @objid ("94db404a-cd4a-4979-aad1-7b10f9701c9a")
    @Override
    public MessageEnd getSendEvent() {
        Object obj = getDepVal(((MessageSmClass)getClassOf()).getSendEventDep());
        return (obj instanceof MessageEnd)? (MessageEnd)obj : null;
    }

    @objid ("39b8883f-98a5-4a06-9cce-0919103bafd2")
    @Override
    public void setSendEvent(MessageEnd value) {
        appendDepVal(((MessageSmClass)getClassOf()).getSendEventDep(), (SmObjectImpl)value);
    }

    @objid ("9fae0aea-dd03-473d-83ab-6f579337b6e3")
    @Override
    public Operation getInvoked() {
        Object obj = getDepVal(((MessageSmClass)getClassOf()).getInvokedDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("7a645fac-171d-41cf-9e1a-ebadddd48503")
    @Override
    public void setInvoked(Operation value) {
        appendDepVal(((MessageSmClass)getClassOf()).getInvokedDep(), (SmObjectImpl)value);
    }

    @objid ("70ea6188-b623-412b-9337-eb87a410b304")
    @Override
    public EList<InformationFlow> getRealizedInformationFlow() {
        return new SmList<>(this, ((MessageSmClass)getClassOf()).getRealizedInformationFlowDep());
    }

    @objid ("aa28ea21-a818-461d-ac37-f382738df047")
    @Override
    public <T extends InformationFlow> List<T> getRealizedInformationFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getRealizedInformationFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8a9d6498-1e96-4507-9469-daed26ed7a97")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SendEvent
        obj = (SmObjectImpl)this.getDepVal(((MessageSmClass)getClassOf()).getSendEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a535c0a8-1b59-4f02-9c8c-f3ef8a3bff91")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SendEvent
        dep = ((MessageSmClass)getClassOf()).getSendEventDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("5e4b6480-aa86-44a7-b1f4-0f7c155bc542")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessage(this);
        else
          return null;
    }

}
