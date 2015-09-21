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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
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

@objid ("0042b3fa-c4bf-1fd8-97fe-001ec947cd2a")
public class EventImpl extends ModelElementImpl implements Event {
    @objid ("cb42c0e3-4941-4f67-8450-823a7775c526")
    @Override
    public String getExpression() {
        return (String) getAttVal(((EventSmClass)getClassOf()).getExpressionAtt());
    }

    @objid ("3525de0f-0d96-41ed-8b0e-0d5a3e38af21")
    @Override
    public void setExpression(String value) {
        setAttVal(((EventSmClass)getClassOf()).getExpressionAtt(), value);
    }

    @objid ("3ab86412-cea8-4455-9be1-d364c4b00132")
    @Override
    public EventType getKind() {
        return (EventType) getAttVal(((EventSmClass)getClassOf()).getKindAtt());
    }

    @objid ("dc23481c-aa10-4317-aa64-d802e461226c")
    @Override
    public void setKind(EventType value) {
        setAttVal(((EventSmClass)getClassOf()).getKindAtt(), value);
    }

    @objid ("8809ba86-a902-4c4e-9bd9-c6e9fb52b4ad")
    @Override
    public EList<Transition> getTriggered() {
        return new SmList<>(this, ((EventSmClass)getClassOf()).getTriggeredDep());
    }

    @objid ("6e167292-ac79-4d92-aac8-9184d52e3ca0")
    @Override
    public <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getTriggered()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3d6809da-5973-40e7-ae36-8b53dfb06c65")
    @Override
    public Signal getModel() {
        Object obj = getDepVal(((EventSmClass)getClassOf()).getModelDep());
        return (obj instanceof Signal)? (Signal)obj : null;
    }

    @objid ("0c347bbc-a6f4-4c7a-a3ed-d4a86c64c7ab")
    @Override
    public void setModel(Signal value) {
        appendDepVal(((EventSmClass)getClassOf()).getModelDep(), (SmObjectImpl)value);
    }

    @objid ("97fb5311-62ed-48cf-9ace-e527facd64a1")
    @Override
    public EList<State> getOrigin() {
        return new SmList<>(this, ((EventSmClass)getClassOf()).getOriginDep());
    }

    @objid ("492632a1-b8f1-45a0-a3b9-8245252f24e6")
    @Override
    public <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final State element : getOrigin()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("10c1b68d-373b-421f-b7fe-164c4583b2fe")
    @Override
    public Operation getCalled() {
        Object obj = getDepVal(((EventSmClass)getClassOf()).getCalledDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("e821fd1c-77c2-4ef5-addd-a232eaca4355")
    @Override
    public void setCalled(Operation value) {
        appendDepVal(((EventSmClass)getClassOf()).getCalledDep(), (SmObjectImpl)value);
    }

    @objid ("f3200827-dfb7-474d-ba54-a25f754bded1")
    @Override
    public Behavior getComposed() {
        Object obj = getDepVal(((EventSmClass)getClassOf()).getComposedDep());
        return (obj instanceof Behavior)? (Behavior)obj : null;
    }

    @objid ("31821e71-392b-4b7a-840d-52d05ba54999")
    @Override
    public void setComposed(Behavior value) {
        appendDepVal(((EventSmClass)getClassOf()).getComposedDep(), (SmObjectImpl)value);
    }

    @objid ("47f4431c-6778-4b18-9f25-ce9c62e98df8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Composed
        obj = (SmObjectImpl)this.getDepVal(((EventSmClass)getClassOf()).getComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e1511dea-dde4-4077-b4c1-08ff27569768")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Composed
        dep = ((EventSmClass)getClassOf()).getComposedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("b10ba2a1-5b74-4f9f-92ee-34428f8352f1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEvent(this);
        else
          return null;
    }

}
