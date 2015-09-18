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
    @objid ("9fe5567e-e55e-420f-a5eb-8a2f7ca0048c")
    @Override
    public boolean isIsClosed() {
        return (Boolean) getAttVal(BpmnCollaborationData.Metadata.IsClosedAtt());
    }

    @objid ("b56c95fe-25cc-489e-a238-69d0ab9b8faf")
    @Override
    public void setIsClosed(boolean value) {
        setAttVal(BpmnCollaborationData.Metadata.IsClosedAtt(), value);
    }

    @objid ("103e4e39-5f9d-4d56-be3f-e24ebabf8393")
    @Override
    public EList<BpmnArtifact> getArtifact() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.ArtifactDep());
    }

    @objid ("a9da06dd-fd27-45cf-98ed-1931063130e5")
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

    @objid ("6eb17abe-4e66-4a34-a8df-07d39d11032b")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.MessageFlowDep());
    }

    @objid ("9a8c3d7f-3b26-4294-b64e-f3fc1149b275")
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

    @objid ("691a98d4-b740-4c50-818a-273221d9e720")
    @Override
    public EList<BpmnParticipant> getParticipants() {
        return new SmList<>(this, BpmnCollaborationData.Metadata.ParticipantsDep());
    }

    @objid ("7e47fb33-0104-44ec-9c09-6176e61813bf")
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

    @objid ("23b925d1-7e2c-48ce-ac7d-c0c50ca493d4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6ffd36c7-a566-46b9-bdc8-f1eacbcd2398")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("300b8aa8-b29e-440b-9d97-bc3b86cecae6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCollaboration(this);
        else
          return null;
    }

}
