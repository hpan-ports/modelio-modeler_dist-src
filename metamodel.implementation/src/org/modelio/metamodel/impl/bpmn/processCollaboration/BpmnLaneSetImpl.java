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
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0075254c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneSetImpl extends BpmnBaseElementImpl implements BpmnLaneSet {
    @objid ("94a266c2-7966-446e-af1a-2911d6b0be25")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnLaneSetData.Metadata.LaneDep());
    }

    @objid ("dd07c9a0-2401-4665-94ad-6d78b49ae622")
    @Override
    public <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLane element : getLane()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6113f301-da64-4053-9a6b-5d26874563e0")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
    }

    @objid ("a560b629-2e93-46aa-a5df-28de6f92b3fc")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("d2f9e094-64d5-4a20-a15a-c9060423ef33")
    @Override
    public BpmnLane getParentLane() {
        return (BpmnLane) getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
    }

    @objid ("f853ab30-5d9d-420e-9d3c-f7c274dea092")
    @Override
    public void setParentLane(BpmnLane value) {
        appendDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), (SmObjectImpl)value);
    }

    @objid ("bddc1ab7-c8fe-4b87-9fff-972e03480ceb")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
    }

    @objid ("86510b8b-a550-4bc8-9116-176c5c532114")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("8d5af7db-2bef-474f-8df1-8f00ff012f15")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2d39cdf7-bea0-4631-8cd7-8345082e710d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.ProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1bf0f47c-1d7b-4e7c-81ef-5ed3b4ec1d9b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLaneSet(this);
        else
          return null;
    }

}
