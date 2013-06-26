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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00749e92-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneImpl extends BpmnBaseElementImpl implements BpmnLane {
    @objid ("589b3cdf-10e6-4c30-ad8f-c7ceba1e26e5")
    @Override
    public BpmnLaneSet getChildLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.ChildLaneSetDep());
    }

    @objid ("8bdad829-e1bd-4ff9-8174-dc9043553ac6")
    @Override
    public void setChildLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.ChildLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("35520ef6-f751-425d-b5b0-173866d2290e")
    @Override
    public ModelElement getPartitionElement() {
        return (ModelElement) getDepVal(BpmnLaneData.Metadata.PartitionElementDep());
    }

    @objid ("2b3b9ebd-c80e-4437-804d-dd7c9f3ed5f7")
    @Override
    public void setPartitionElement(ModelElement value) {
        appendDepVal(BpmnLaneData.Metadata.PartitionElementDep(), (SmObjectImpl)value);
    }

    @objid ("7ecfd3e2-db65-418e-9a78-cef825b19f95")
    @Override
    public EList<BpmnFlowElement> getFlowElementRef() {
        return new SmList<>(this, BpmnLaneData.Metadata.FlowElementRefDep());
    }

    @objid ("8aded6ba-12df-46ef-8463-d176e0005e43")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnFlowElement element : getFlowElementRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5fb79ec2-76c1-459b-8175-fad010ed764d")
    @Override
    public BpmnLaneSet getLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.LaneSetDep());
    }

    @objid ("a111f92c-d838-4082-8898-eab23ea34d19")
    @Override
    public void setLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.LaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("1ce02634-1a5e-442e-b186-7169f2dc06a2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4329889c-1167-43c4-9433-341c9d392b16")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneData.Metadata.LaneSetDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("399a109e-7e84-4056-bf35-ee2786d55f02")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLane(this);
        else
          return null;
    }

}
