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
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0073fd98-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCollaborationImpl extends BpmnRootElementImpl implements BpmnCollaboration {
    @objid ("337e19b7-b715-47a8-a256-0aa096922546")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnCollaborationData.Metadata.IsClosedAtt());
    }

    @objid ("685bf9b4-4e5f-4c11-b090-e6639f3caaad")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnCollaborationData.Metadata.IsClosedAtt(), value);
    }

    @objid ("2967f95b-6c59-4b1f-b69e-d40f41f078be")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.ArtifactDep());
    }

    @objid ("b14b590b-b19e-4aab-8731-c5ae8b7de11a")
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

    @objid ("618592d8-7c71-4796-81e9-4a03f53d337a")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.MessageFlowDep());
    }

    @objid ("e39a5dde-0bc2-4a1e-94cc-bee498c227f2")
    @Override
    public <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageFlow element : getMessageFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("00c523e7-5364-48cd-bf82-c4cba95a7d6e")
    @Override
    public EList<BpmnParticipant> getParticipants() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.ParticipantsDep());
    }

    @objid ("1161288d-c6cf-4c78-ba11-cf24d17b387a")
    @Override
    public <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getParticipants()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("63ccd307-d293-4ee9-bac5-3e5b9add82a6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("09866cc4-49e7-4af8-976a-4697c014aecd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("82bc418c-1aae-4030-b21e-1e31daca477b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCollaboration(this);
        else
          return null;
    }

}
