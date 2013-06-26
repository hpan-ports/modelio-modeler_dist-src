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
    @objid ("83c594ca-36f1-45d2-9e18-d791b44a85d7")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnLaneSetData.Metadata.LaneDep());
    }

    @objid ("4c5160ad-45b2-469c-b3a6-efbe9dc04905")
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

    @objid ("0c8f19f6-daad-49e7-b866-750da6f31a8a")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnLaneSetData.Metadata.ProcessDep());
    }

    @objid ("3b67fe54-3da4-4614-94f5-aaae34de3215")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("15909af8-0e82-4dda-aa17-ba53abb3e206")
    @Override
    public BpmnLane getParentLane() {
        return (BpmnLane) getDepVal(BpmnLaneSetData.Metadata.ParentLaneDep());
    }

    @objid ("37c26db9-db91-4624-ae86-c9a9ac3a5da7")
    @Override
    public void setParentLane(BpmnLane value) {
        appendDepVal(BpmnLaneSetData.Metadata.ParentLaneDep(), (SmObjectImpl)value);
    }

    @objid ("33a62aaf-d61c-4489-a654-01119ed4adc5")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnLaneSetData.Metadata.SubProcessDep());
    }

    @objid ("4673ec1c-60b2-4d01-9887-bac84dab7ec3")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnLaneSetData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("da4b157f-1337-43fc-868c-fd0ad9c4601d")
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

    @objid ("f9f79438-eee2-476c-8027-ccd1f3b360dd")
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

    @objid ("f7917240-1d6e-4c85-9e31-7b441575d073")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLaneSet(this);
        else
          return null;
    }

}
