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
    @objid ("3cc5b8e7-3a6c-48e2-84e3-6978ed91aee6")
    @Override
    public BpmnProcessType getProcessType() {
        return (BpmnProcessType) getAttVal(BpmnProcessData.Metadata.ProcessTypeAtt());
    }

    @objid ("af16a2ff-df4a-481f-b569-48a9b8a7cd8d")
    @Override
    public void setProcessType(BpmnProcessType value) {
        setAttVal(BpmnProcessData.Metadata.ProcessTypeAtt(), value);
    }

    @objid ("657123b1-23e8-4a28-a5b2-cbdf8ef01b29")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnProcessData.Metadata.IsClosedAtt());
    }

    @objid ("8435b8bf-eb8f-4227-8eeb-2650a14ef549")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnProcessData.Metadata.IsClosedAtt(), value);
    }

    @objid ("2548bc28-e127-49e4-bdf5-34d564db04f6")
    @Override
    public OptionalBoolean getIsExecutable() {
        return (OptionalBoolean) getAttVal(BpmnProcessData.Metadata.IsExecutableAtt());
    }

    @objid ("39190932-166d-45f7-b0dc-7935f859422a")
    @Override
    public void setIsExecutable(OptionalBoolean value) {
        setAttVal(BpmnProcessData.Metadata.IsExecutableAtt(), value);
    }

    @objid ("828b200f-9013-4dff-b4fd-a0770f278148")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnProcessData.Metadata.CallerDep());
    }

    @objid ("a1890933-9d6d-4255-9cc8-9cfa229c7521")
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

    @objid ("14063204-1b8f-492e-b8f3-f3358a35c7d3")
    @Override
    public EList<BpmnProcess> getSupports() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportsDep());
    }

    @objid ("42a57671-6053-429c-9dc7-697b1129127a")
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

    @objid ("2c23effe-473c-448a-a1a4-e1d2825b7b22")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnProcessData.Metadata.ArtifactDep());
    }

    @objid ("a9e29e58-b510-46bd-ae61-6e17bd5a50f6")
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

    @objid ("90b051f9-884d-431b-98f4-3af9f7b9814a")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnProcessData.Metadata.LaneSetDep());
    }

    @objid ("de64ec75-2a89-4566-97bd-67a32965db62")
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

    @objid ("f795af6f-ce7e-43c0-8acc-e7a3e6dc8521")
    @Override
    public EList<BpmnProcess> getSupported() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportedDep());
    }

    @objid ("66fabe26-bece-4ba8-92e4-fbf90ec10647")
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

    @objid ("8563e97e-9f54-4a9d-b52c-967976fd3d3c")
    @Override
    public BpmnParticipant getParticipant() {
        return (BpmnParticipant) getDepVal(BpmnProcessData.Metadata.ParticipantDep());
    }

    @objid ("23ebf97a-7aaa-4d32-a393-e4fd4fbd6cbc")
    @Override
    public void setParticipant(BpmnParticipant value) {
        appendDepVal(BpmnProcessData.Metadata.ParticipantDep(), (SmObjectImpl)value);
    }

    @objid ("74b60e1b-e048-47c0-92b2-6650abef0c30")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnProcessData.Metadata.FlowElementDep());
    }

    @objid ("8262b9bf-b41e-4aa1-aef8-c1f561fc8311")
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

    @objid ("62284bd4-018e-4142-8143-9fb595697cb9")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnProcessData.Metadata.ResourceDep());
    }

    @objid ("fb19de69-e3a3-4535-b2f0-5191fe7f31bb")
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

    @objid ("4636fe16-98d1-4d30-a8ce-435b92a7376d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("630ebae0-4450-4fa7-a328-17be560a61ca")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("238462cb-cd9b-4be4-b896-d32bf56e8614")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnProcess(this);
        else
          return null;
    }

}
