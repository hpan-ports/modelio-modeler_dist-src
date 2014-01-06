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
    @objid ("e53c9af3-a615-41e6-a68f-fedb9a53a711")
    @Override
    public String getExpression() {
        return (String) getAttVal(EventData.Metadata.ExpressionAtt());
    }

    @objid ("20439232-17ec-4b19-86f7-f8cd0d86b92b")
    @Override
    public void setExpression(String value) {
        setAttVal(EventData.Metadata.ExpressionAtt(), value);
    }

    @objid ("20594aaf-c993-4024-bc79-b91da65e5a03")
    @Override
    public EventType getKind() {
        return (EventType) getAttVal(EventData.Metadata.KindAtt());
    }

    @objid ("8c6823c8-fed3-4c68-953d-0e2d12aa6117")
    @Override
    public void setKind(EventType value) {
        setAttVal(EventData.Metadata.KindAtt(), value);
    }

    @objid ("974ea036-e353-4ee8-8e64-bc6ea17aab00")
    @Override
    public EList<Transition> getTriggered() {
        return new SmList<>(this, EventData.Metadata.TriggeredDep());
    }

    @objid ("937ec90d-a0f4-4acd-bcb7-aee3ccacdca4")
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

    @objid ("86d6b7fe-639b-43a3-b5b3-8dd7eee0dbe1")
    @Override
    public Signal getModel() {
        return (Signal) getDepVal(EventData.Metadata.ModelDep());
    }

    @objid ("90950cfd-57fb-452f-b39d-391c7945b075")
    @Override
    public void setModel(Signal value) {
        appendDepVal(EventData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("15c2c34d-94b0-4ac5-b0b1-6d2bee0a92d8")
    @Override
    public EList<State> getOrigin() {
        return new SmList<>(this, EventData.Metadata.OriginDep());
    }

    @objid ("e37e6f67-cb9e-459f-84b4-6536771fd8ec")
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

    @objid ("f66d10b3-c49e-4905-9269-9a29043c80f7")
    @Override
    public Operation getCalled() {
        return (Operation) getDepVal(EventData.Metadata.CalledDep());
    }

    @objid ("69f3646e-b5e5-4c74-8c42-87ec2e754a76")
    @Override
    public void setCalled(Operation value) {
        appendDepVal(EventData.Metadata.CalledDep(), (SmObjectImpl)value);
    }

    @objid ("3d2c8d6f-5a58-4656-82cb-fa568c5412ab")
    @Override
    public Behavior getComposed() {
        return (Behavior) getDepVal(EventData.Metadata.ComposedDep());
    }

    @objid ("6d341a2f-3e11-4cef-bd6d-7457c9325c60")
    @Override
    public void setComposed(Behavior value) {
        appendDepVal(EventData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("4802bba8-74f2-463a-87c3-9619d73dc8ea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("47ad99e5-62d8-46f4-95c7-f9fba8ef58ee")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(EventData.Metadata.ComposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("60559d8f-05be-4295-81a6-23308140de77")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEvent(this);
        else
          return null;
    }

}
