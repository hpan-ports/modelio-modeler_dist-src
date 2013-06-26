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
    @objid ("316ff0f1-1013-4e08-a8e4-5a6e8eef9438")
    @Override
    public BpmnProcessType getProcessType() {
        return (BpmnProcessType) getAttVal(BpmnProcessData.Metadata.ProcessTypeAtt());
    }

    @objid ("3505c532-6b89-43c4-a229-39faf99bdc38")
    @Override
    public void setProcessType(BpmnProcessType value) {
        setAttVal(BpmnProcessData.Metadata.ProcessTypeAtt(), value);
    }

    @objid ("9bcc3dee-c067-48e1-a71c-c5bafa8b8669")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnProcessData.Metadata.IsClosedAtt());
    }

    @objid ("d7d36f01-0f94-43ce-8a50-9e640a91d7ad")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnProcessData.Metadata.IsClosedAtt(), value);
    }

    @objid ("f380dc9d-0c6c-43c5-811c-ead02ed9770d")
    @Override
    public OptionalBoolean getIsExecutable() {
        return (OptionalBoolean) getAttVal(BpmnProcessData.Metadata.IsExecutableAtt());
    }

    @objid ("ea0e815a-91fc-40af-a44f-26e77b8316b2")
    @Override
    public void setIsExecutable(OptionalBoolean value) {
        setAttVal(BpmnProcessData.Metadata.IsExecutableAtt(), value);
    }

    @objid ("6fd0522b-d83a-4fe8-9f2a-90bc547273c1")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, BpmnProcessData.Metadata.CallerDep());
    }

    @objid ("9c88f92d-dee8-4343-a2fe-909c8d4081e8")
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

    @objid ("c4fd027d-83e5-429d-b9e2-864e05fd2f83")
    @Override
    public EList<BpmnProcess> getSupports() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportsDep());
    }

    @objid ("b1949425-10df-4bbf-a396-c0b9ab958096")
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

    @objid ("79beff3b-5507-4e18-bffb-b9e848dc55a7")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnProcessData.Metadata.ArtifactDep());
    }

    @objid ("447024af-128d-48d8-aeec-30f1956b51fd")
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

    @objid ("91aae341-627a-465e-be5d-7220b14b06be")
    @Override
    public EList<BpmnLaneSet> getLaneSet() {
        return new SmList<>(this, BpmnProcessData.Metadata.LaneSetDep());
    }

    @objid ("8431332f-4031-46c7-aee6-3ba8faf8a77e")
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

    @objid ("c43c7ce4-fb05-454d-affa-efc564109660")
    @Override
    public EList<BpmnProcess> getSupported() {
        return new SmList<>(this, BpmnProcessData.Metadata.SupportedDep());
    }

    @objid ("a4d8d1e4-1d26-4c5d-853f-4fcaa3337352")
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

    @objid ("fad96b14-6295-43de-9e0a-35febb13457b")
    @Override
    public BpmnParticipant getParticipant() {
        return (BpmnParticipant) getDepVal(BpmnProcessData.Metadata.ParticipantDep());
    }

    @objid ("ddeb23ea-1d10-4c65-9a80-bd878e6195e9")
    @Override
    public void setParticipant(BpmnParticipant value) {
        appendDepVal(BpmnProcessData.Metadata.ParticipantDep(), (SmObjectImpl)value);
    }

    @objid ("e9b45915-25af-4768-9781-938f319d585b")
    @Override
    public EList<BpmnFlowElement> getFlowElement() {
        return new SmList<>(this, BpmnProcessData.Metadata.FlowElementDep());
    }

    @objid ("2c120c63-327f-4dea-b792-16b18c3199be")
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

    @objid ("88efd42a-045a-49bb-9fae-1d3a054f20da")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnProcessData.Metadata.ResourceDep());
    }

    @objid ("80a98b82-6617-42d3-b2bb-95345f605eed")
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

    @objid ("9159622c-96af-4822-a4fb-57e03f36893d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("787ebbab-5537-4c22-b58d-557fb5ebb58a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("614ffb99-c37e-4fd8-8355-3cff3128d68f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnProcess(this);
        else
          return null;
    }

}
