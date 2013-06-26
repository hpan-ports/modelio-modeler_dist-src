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
    @objid ("75c20fe6-f2a0-4742-862e-c1883ff3aef3")
    @Override
    public boolean isTriggeredByEvent() {
        return (Boolean) getAttVal(BpmnSubProcessData.Metadata.TriggeredByEventAtt());
    }

    @objid ("2fec55ff-e3e9-4728-8a49-2a16ed9d3baf")
    @Override
    public void setTriggeredByEvent(boolean value) {
        setAttVal(BpmnSubProcessData.Metadata.TriggeredByEventAtt(), value);
    }

    @objid ("4a595b28-4ae7-4796-9dc5-6aea19a45b49")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.ArtifactDep());
    }

    @objid ("83976b66-93b5-48b8-974b-409d0d9221fd")
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

    @objid ("d960378a-d174-4804-9456-57452aaae80d")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.FlowElementDep());
    }

    @objid ("246c225c-29e9-4cd7-9bd4-158e812d8521")
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

    @objid ("996fb470-c0f1-4ac6-93d8-ddd591f2608d")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnSubProcessData.Metadata.LaneSetDep());
    }

    @objid ("52d50b53-4389-450d-a9e4-b464d9df8a9d")
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

    @objid ("ff982e9d-4580-49fe-9286-f7bc902bec72")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bc7f50d6-bb0a-498a-a10c-9472ea98f751")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("25bd2578-448b-46b1-a72b-2f74115827b6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSubProcess(this);
        else
          return null;
    }

}
