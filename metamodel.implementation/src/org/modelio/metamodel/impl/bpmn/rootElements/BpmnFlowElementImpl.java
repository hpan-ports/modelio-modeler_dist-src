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
    @objid ("b20c73a3-d48f-42d4-86f5-42733b5713c4")
    @Override
    public EList<BpmnGroup> getGroups() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.GroupsDep());
    }

    @objid ("5545c398-23f8-4945-933b-8e0a46b22f0a")
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

    @objid ("a36dc752-5d19-4b39-a9f1-0d655c1e6a26")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
    }

    @objid ("42470b98-c929-4c1b-ab34-b93e85794a5a")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("1e1ce1a9-b620-411b-a4c9-02c5fe027ba2")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.LaneDep());
    }

    @objid ("17e303a4-b9cb-4c0a-b266-81d100bdc335")
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

    @objid ("d6d4f87f-7aab-46d6-b664-f2efb6dbf31b")
    @Override
    public BpmnProcess getContainer() {
        return (BpmnProcess) getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
    }

    @objid ("6c70e9bb-1576-43cd-b41f-783ec6efcedd")
    @Override
    public void setContainer(BpmnProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("4f7aaee5-a114-4641-98f1-bc033fbba19d")
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

    @objid ("64a29868-fdff-469a-8ea6-c3aedf019cf4")
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

    @objid ("066ddc1e-11f2-4575-97e9-d58d0bed8f1b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowElement(this);
        else
          return null;
    }

}
