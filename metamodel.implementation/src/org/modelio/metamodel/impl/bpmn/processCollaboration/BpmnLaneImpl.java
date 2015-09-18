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
    @objid ("61d09166-2e6d-4234-979d-cd003a3aaf2b")
    @Override
    public BpmnLaneSet getChildLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.ChildLaneSetDep());
    }

    @objid ("2db1da2e-2566-40ea-836f-4e6e645dd355")
    @Override
    public void setChildLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.ChildLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("143a336b-1f5b-411a-82e4-bba7d57be19c")
    @Override
    public ModelElement getPartitionElement() {
        return (ModelElement) getDepVal(BpmnLaneData.Metadata.PartitionElementDep());
    }

    @objid ("1c83eac6-1d37-4760-8b55-40b91b25ae49")
    @Override
    public void setPartitionElement(ModelElement value) {
        appendDepVal(BpmnLaneData.Metadata.PartitionElementDep(), (SmObjectImpl)value);
    }

    @objid ("effb9a65-5d34-4fdd-b8b3-4866e82bff26")
    @Override
    public EList<BpmnFlowElement> getFlowElementRef() {
        return new SmList<>(this, BpmnLaneData.Metadata.FlowElementRefDep());
    }

    @objid ("17a53dd3-7402-4cbf-8059-6511e7af35d6")
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

    @objid ("88bc72b3-344a-4ebf-b80b-e44063b93dae")
    @Override
    public BpmnLaneSet getLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.LaneSetDep());
    }

    @objid ("64871efd-5d53-4b8a-a15d-c9c638512347")
    @Override
    public void setLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.LaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("ea1e108a-957b-48d8-82bc-0dea05d96d2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6bcde5ce-781f-411b-8659-c5b4882e822b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneData.Metadata.LaneSetDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ca5db68c-4bcf-4592-b3e9-40826749abd6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLane(this);
        else
          return null;
    }

}
