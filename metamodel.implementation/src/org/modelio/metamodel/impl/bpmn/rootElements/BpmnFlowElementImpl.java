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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0079514e-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowElementImpl extends BpmnBaseElementImpl implements BpmnFlowElement {
    @objid ("acae6cbb-af49-4e9c-a70d-772154593ba8")
    @Override
    public EList<BpmnGroup> getGroups() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.GroupsDep());
    }

    @objid ("0918cf8d-976e-4385-9a59-a37b4526cb1d")
    @Override
    public <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnGroup element : getGroups()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5d317091-e272-4267-8f41-7e6e779ea68b")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
    }

    @objid ("118a889d-ea82-4b28-bad5-219f84f64d86")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("962696ef-7b40-4b3f-90e2-4c14e0905d84")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.LaneDep());
    }

    @objid ("05ecb654-a0a6-4076-afa1-06862c86fdc2")
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

    @objid ("f8e44e52-27eb-4f6d-a694-a66ecdfc16c9")
    @Override
    public BpmnProcess getContainer() {
        return (BpmnProcess) getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
    }

    @objid ("ca9b12a2-1b27-48a2-84d2-31cb2786791a")
    @Override
    public void setContainer(BpmnProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("2dc1ca28-10bf-4e52-b3d8-1bc60b89173c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fbbb41be-81df-4914-8c25-161c49e96ee6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
        if (obj != null)
          return new SmDepVal(BpmnFlowElementData.Metadata.ContainerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3cdcb87c-6c96-4e3c-9117-5d98c38a33d1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowElement(this);
        else
          return null;
    }

}
