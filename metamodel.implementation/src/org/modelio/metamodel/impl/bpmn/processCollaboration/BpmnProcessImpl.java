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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0076549e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnProcessImpl extends BpmnRootElementImpl implements BpmnProcess {
    @objid ("e77e094f-fef7-485c-9769-3d47e0a682ed")
    @Override
    public BpmnProcessType getProcessType() {
        return (BpmnProcessType) getAttVal(BpmnProcessData.Metadata.ProcessTypeAtt());
    }

    @objid ("a517d353-d890-42b5-a0f0-9bbb5a4751ce")
    @Override
    public void setProcessType(BpmnProcessType value) {
        setAttVal(BpmnProcessData.Metadata.ProcessTypeAtt(), value);
    }

    @objid ("805b3c95-cbe7-4716-917b-91b09d7b9bd4")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnProcessData.Metadata.IsClosedAtt());
    }

    @objid ("51c40400-1c26-48c7-b74c-329dfc652ae7")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnProcessData.Metadata.IsClosedAtt(), value);
    }

    @objid ("88a80f54-cc79-4e52-ae71-9510266a2395")
    @Override
    public OptionalBoolean getIsExecutable() {
        return (OptionalBoolean) getAttVal(BpmnProcessData.Metadata.IsExecutableAtt());
    }

    @objid ("3cebbb15-77d9-433a-8e5f-d92f9122fa8c")
    @Override
    public void setIsExecutable(OptionalBoolean value) {
        setAttVal(BpmnProcessData.Metadata.IsExecutableAtt(), value);
    }

    @objid ("5440245e-a20e-4d08-8c46-466002764a19")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnProcessData.Metadata.CallerDep());
    }

    @objid ("2046c9e0-e0b8-4362-8c70-d36ffee32726")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8dbcca81-ba73-4670-a004-a69799e3e9f5")
    @Override
    public EList<BpmnProcess> getSupports() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportsDep());
    }

    @objid ("6db28a5c-ba29-4d3f-bdb1-d5eb7edbe5cd")
    @Override
    public <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnProcess element : getSupports()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ed6e37f9-1963-4868-b30f-4bab343dec1b")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnProcessData.Metadata.ArtifactDep());
    }

    @objid ("015e2eb0-f88e-4a27-aa8e-bb47f164cebb")
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

    @objid ("dbea5717-387a-49fa-aebe-4327f75cd6f1")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnProcessData.Metadata.LaneSetDep());
    }

    @objid ("b383850a-c70d-4056-8798-a922fcd39195")
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

    @objid ("ab5ac062-e4cd-4c28-b2cf-d9598300c1a5")
    @Override
    public EList<BpmnProcess> getSupported() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportedDep());
    }

    @objid ("bcf4b0ab-c06f-471f-8242-ec7bc8e7aba0")
    @Override
    public <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnProcess element : getSupported()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af1f839f-476b-4532-9a6b-289146b704e4")
    @Override
    public BpmnParticipant getParticipant() {
        return (BpmnParticipant) getDepVal(BpmnProcessData.Metadata.ParticipantDep());
    }

    @objid ("3ad4e8bc-4602-41ff-8994-64c956b5b0e4")
    @Override
    public void setParticipant(BpmnParticipant value) {
        appendDepVal(BpmnProcessData.Metadata.ParticipantDep(), (SmObjectImpl)value);
    }

    @objid ("47f32402-ff02-4356-b61b-c8824843e9df")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnProcessData.Metadata.FlowElementDep());
    }

    @objid ("4e2f7131-a2e0-4adc-984b-d987682ae689")
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

    @objid ("7020da39-82b3-4994-bde3-c9baad4660bc")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnProcessData.Metadata.ResourceDep());
    }

    @objid ("3abd55de-e4b6-4f6c-bce1-f97c1227dae1")
    @Override
    public <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceRole element : getResource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("431e6c14-ec76-49bc-bb76-cc31b0e3d472")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3599e315-68c7-4159-bd81-ae3d7a24504c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("55c9ea77-c816-4bc8-8495-307442137388")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnProcess(this);
        else
          return null;
    }

}
