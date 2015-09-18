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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
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

@objid ("0042b3fa-c4bf-1fd8-97fe-001ec947cd2a")
public class EventImpl extends ModelElementImpl implements Event {
    @objid ("46d0d24e-fe4f-4d85-814c-69556a288531")
    @Override
    public String getExpression() {
        return (String) getAttVal(EventData.Metadata.ExpressionAtt());
    }

    @objid ("849e842b-ebbe-401c-bb17-441e585480c7")
    @Override
    public void setExpression(String value) {
        setAttVal(EventData.Metadata.ExpressionAtt(), value);
    }

    @objid ("8e3af849-357b-4f90-9456-326ec6cea904")
    @Override
    public EventType getKind() {
        return (EventType) getAttVal(EventData.Metadata.KindAtt());
    }

    @objid ("4a96e0ce-8b12-407d-b4a7-b1c03a21205c")
    @Override
    public void setKind(EventType value) {
        setAttVal(EventData.Metadata.KindAtt(), value);
    }

    @objid ("d6cee948-4fc1-467a-8d88-d93e48b4e494")
    @Override
    public EList<Transition> getTriggered() {
        return new SmList<>(this, EventData.Metadata.TriggeredDep());
    }

    @objid ("d3847d67-a61c-4f86-a792-ec9f7462d8ae")
    @Override
    public <T extends Transition> List<T> getTriggered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getTriggered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("537bc2ae-6816-490c-93fe-5c84b16c9155")
    @Override
    public Signal getModel() {
        return (Signal) getDepVal(EventData.Metadata.ModelDep());
    }

    @objid ("1f839649-8ed8-4226-8819-5e3a9d0e884d")
    @Override
    public void setModel(Signal value) {
        appendDepVal(EventData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("f092050c-8f74-44ac-84a8-50d4059d2acc")
    @Override
    public EList<State> getOrigin() {
        return new SmList<>(this, EventData.Metadata.OriginDep());
    }

    @objid ("4b777332-d9ec-4093-9be5-ffa0344eaa33")
    @Override
    public <T extends State> List<T> getOrigin(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final State element : getOrigin()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("216b20c8-3d8f-4727-8592-d93f20de05d6")
    @Override
    public Operation getCalled() {
        return (Operation) getDepVal(EventData.Metadata.CalledDep());
    }

    @objid ("d9d722fe-9399-437a-a3ac-23495c609948")
    @Override
    public void setCalled(Operation value) {
        appendDepVal(EventData.Metadata.CalledDep(), (SmObjectImpl)value);
    }

    @objid ("4f41e44c-fc3d-4250-ab30-6c905c4cbeaa")
    @Override
    public Behavior getComposed() {
        return (Behavior) getDepVal(EventData.Metadata.ComposedDep());
    }

    @objid ("2bf76844-4ba6-4266-b2dd-2fb77677f942")
    @Override
    public void setComposed(Behavior value) {
        appendDepVal(EventData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("4c5b200a-da8b-450f-80b2-54ef3c15dc07")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ffd20f83-8479-45d9-81bb-9a329dfe83ea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(EventData.Metadata.ComposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b6f8af4e-6a42-48a9-8ed5-0edc7474532c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEvent(this);
        else
          return null;
    }

}
