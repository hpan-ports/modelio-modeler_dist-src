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
    @objid ("761acb21-fa00-49e5-9991-8c207b453295")
    @Override
    public EList<BpmnGroup> getGroups() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.GroupsDep());
    }

    @objid ("abfcd65f-af36-410e-8bae-6927206f9bc2")
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

    @objid ("8792d353-bdc9-46c4-aac4-ba1f9a60c75b")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnFlowElementData.Metadata.SubProcessDep());
    }

    @objid ("a16b71e5-be19-4ae8-9ba6-1649bee1c059")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("8e328b99-fc77-4eba-b6c8-20b44a3748d0")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, BpmnFlowElementData.Metadata.LaneDep());
    }

    @objid ("d7a22c4c-e077-449c-880f-238d353b3533")
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

    @objid ("40b325a4-2ace-4c0c-bde8-564734fe63f3")
    @Override
    public BpmnProcess getContainer() {
        return (BpmnProcess) getDepVal(BpmnFlowElementData.Metadata.ContainerDep());
    }

    @objid ("b6b5e756-b5d5-4016-ad12-99a94ddfec54")
    @Override
    public void setContainer(BpmnProcess value) {
        appendDepVal(BpmnFlowElementData.Metadata.ContainerDep(), (SmObjectImpl)value);
    }

    @objid ("91651167-2933-4b16-ad39-1a35d1b32590")
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

    @objid ("c4d0ff77-e0db-473e-a3a6-7426d6201811")
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

    @objid ("c5b9e363-2b13-4315-af8c-b890d3968e9e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowElement(this);
        else
          return null;
    }

}
