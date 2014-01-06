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
    @objid ("d8c0f275-d069-4c7c-b9c3-c50fd0e58427")
    @Override
    public BpmnLaneSet getChildLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.ChildLaneSetDep());
    }

    @objid ("cf37a7ca-9808-4fc4-be3e-8abacf259572")
    @Override
    public void setChildLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.ChildLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("14e46ab6-1ba2-4641-8250-c8d20bd056c8")
    @Override
    public ModelElement getPartitionElement() {
        return (ModelElement) getDepVal(BpmnLaneData.Metadata.PartitionElementDep());
    }

    @objid ("99abbdcd-5879-4f3c-b452-5397a29f94ab")
    @Override
    public void setPartitionElement(ModelElement value) {
        appendDepVal(BpmnLaneData.Metadata.PartitionElementDep(), (SmObjectImpl)value);
    }

    @objid ("db515ba0-b424-49ec-8877-fef393c192d7")
    @Override
    public EList<BpmnFlowElement> getFlowElementRef() {
        return new SmList<>(this, BpmnLaneData.Metadata.FlowElementRefDep());
    }

    @objid ("be19b239-05f7-4148-830d-2123f2b5039b")
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

    @objid ("3c22cdd6-2efe-4026-977f-8aaa57fddcfb")
    @Override
    public BpmnLaneSet getLaneSet() {
        return (BpmnLaneSet) getDepVal(BpmnLaneData.Metadata.LaneSetDep());
    }

    @objid ("61bd202c-004c-4a4b-8dd5-fda9aeda7f1b")
    @Override
    public void setLaneSet(BpmnLaneSet value) {
        appendDepVal(BpmnLaneData.Metadata.LaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("01c5cb23-a00e-4283-aba9-1fa944db4ed3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("24d84985-457c-4a77-9fbb-733e022b2d39")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneData.Metadata.LaneSetDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneData.Metadata.LaneSetDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4dc1f6d9-f27b-474f-b29c-6a74c45f0ca5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLane(this);
        else
          return null;
    }

}
