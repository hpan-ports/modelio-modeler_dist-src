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
    @objid ("7d28e09f-c8b0-4420-8f8c-c1a02eb9d047")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnLaneSetData.Metadata.LaneDep());
    }

    @objid ("db977d7f-2be2-4425-bd80-5f7a5703fac2")
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

    @objid ("fee490d2-6bf9-4987-b83b-0bd7af2d6959")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
    }

    @objid ("f5b3db0b-08a2-457f-8c57-102abd62f217")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("659eb664-40e1-46eb-af18-bbd2dcb86e89")
    @Override
    public BpmnLane getParentLane() {
        return (BpmnLane) getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
    }

    @objid ("98da7d16-d40c-4b25-bc59-15ba6666d918")
    @Override
    public void setParentLane(BpmnLane value) {
        appendDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), (SmObjectImpl)value);
    }

    @objid ("fc47ba01-5bda-4eea-8757-d7f1b532eb14")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
    }

    @objid ("f7c629b9-2cad-4bcd-986d-fefb79bb4f3f")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("bfa9a34e-cf18-48c2-99ca-99545416b108")
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

    @objid ("044b78f1-83d5-4c90-8c67-964992457600")
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

    @objid ("9a4cb8d6-a469-4c21-8a94-c7fb13baf34f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLaneSet(this);
        else
          return null;
    }

}
