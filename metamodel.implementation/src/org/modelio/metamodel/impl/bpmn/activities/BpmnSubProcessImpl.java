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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00845b16-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSubProcessImpl extends BpmnActivityImpl implements BpmnSubProcess {
    @objid ("e12b2d7a-f02c-4e1c-be37-fcba5671f573")
    @Override
    public boolean isTriggeredByEvent() {
        return (Boolean) getAttVal(BpmnSubProcessData.Metadata.TriggeredByEventAtt());
    }

    @objid ("37bf71f5-dafd-408a-9a4b-9e30343a122a")
    @Override
    public void setTriggeredByEvent(boolean value) {
        setAttVal(BpmnSubProcessData.Metadata.TriggeredByEventAtt(), value);
    }

    @objid ("31611cce-95f5-46c2-9681-905308cd3da4")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.ArtifactDep());
    }

    @objid ("da756b3f-e080-429d-8f67-92810e5cc044")
    @Override
    public <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnArtifact element : getArtifact()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9c082b42-0154-4dfc-8dfb-665da73d1aaa")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.FlowElementDep());
    }

    @objid ("fb657612-29ba-46f2-8c35-1f8f6ab6aa09")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnFlowElement element : getFlowElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a35f5208-9c74-4c8f-ad54-e25d36443f64")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.LaneSetDep());
    }

    @objid ("9fd4b90f-8f91-4632-9f8d-9c408adb8150")
    @Override
    public <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLaneSet element : getLaneSet()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("267e39c0-de50-4b18-a8cf-c24a0df6fa15")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ce1961ed-4099-43ad-b68d-ebb1baf3f887")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("712e15d6-4050-4ba3-8556-337f60ae4943")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSubProcess(this);
        else
          return null;
    }

}
