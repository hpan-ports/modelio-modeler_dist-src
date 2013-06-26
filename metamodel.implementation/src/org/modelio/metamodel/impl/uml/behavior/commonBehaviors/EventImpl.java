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
    @objid ("79fb7b5d-b72b-4673-a514-fb826a1e6739")
    @Override
    public String getExpression() {
        return (String) getAttVal(EventData.Metadata.ExpressionAtt());
    }

    @objid ("cb727ccc-3733-4935-be69-483ef5ba643c")
    @Override
    public void setExpression(String value) {
        setAttVal(EventData.Metadata.ExpressionAtt(), value);
    }

    @objid ("aab43f38-f84e-4c50-928a-3e781e97f966")
    @Override
    public EventType getKind() {
        return (EventType) getAttVal(EventData.Metadata.KindAtt());
    }

    @objid ("dee9e0f8-7805-4254-8f6b-58516beb085f")
    @Override
    public void setKind(EventType value) {
        setAttVal(EventData.Metadata.KindAtt(), value);
    }

    @objid ("62a34f36-fcc3-42d2-a9c2-631425cc006a")
    @Override
    public EList<Transition> getTriggered() {
        return new SmList<>(this, EventData.Metadata.TriggeredDep());
    }

    @objid ("64464a61-e9c2-42c0-a9ee-aca9ff6eb8b1")
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

    @objid ("dda25426-08ed-4958-acf1-77cb6bf44366")
    @Override
    public Signal getModel() {
        return (Signal) getDepVal(EventData.Metadata.ModelDep());
    }

    @objid ("101a4e14-4778-41d6-832e-b6d452ed4919")
    @Override
    public void setModel(Signal value) {
        appendDepVal(EventData.Metadata.ModelDep(), (SmObjectImpl)value);
    }

    @objid ("19304448-f789-4268-aea6-cd86784237ed")
    @Override
    public EList<State> getOrigin() {
        return new SmList<>(this, EventData.Metadata.OriginDep());
    }

    @objid ("135e0a00-68cd-46dd-8306-fb2f827bf469")
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

    @objid ("235e9165-d531-4de6-842a-73e96bd77954")
    @Override
    public Operation getCalled() {
        return (Operation) getDepVal(EventData.Metadata.CalledDep());
    }

    @objid ("4e9b6949-3e61-4598-8f6a-b689eef2d28f")
    @Override
    public void setCalled(Operation value) {
        appendDepVal(EventData.Metadata.CalledDep(), (SmObjectImpl)value);
    }

    @objid ("bc106625-a644-4025-be24-4210be040728")
    @Override
    public Behavior getComposed() {
        return (Behavior) getDepVal(EventData.Metadata.ComposedDep());
    }

    @objid ("cd70e976-b7b2-4e91-92b0-b8ff6837ec9b")
    @Override
    public void setComposed(Behavior value) {
        appendDepVal(EventData.Metadata.ComposedDep(), (SmObjectImpl)value);
    }

    @objid ("d5d4d07b-e8ce-425c-b29a-82f80fd8d5ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2aa1eef2-25dd-4ea6-9122-64864324fed1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EventData.Metadata.ComposedDep());
        if (obj != null)
          return new SmDepVal(EventData.Metadata.ComposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8b7a7ec1-ea43-4426-8500-8eac53ef574d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEvent(this);
        else
          return null;
    }

}
