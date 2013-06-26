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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0078aed8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnArtifactImpl extends BpmnBaseElementImpl implements BpmnArtifact {
    @objid ("1d2d4a29-0396-46d9-a98a-931cbe3881f1")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
    }

    @objid ("c628cfd9-fc60-4fb4-a95b-9d4d48f385dc")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("5ecb835e-3b4d-4e2c-9743-d7b9772a04a5")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
    }

    @objid ("74030361-9513-4ed2-869c-a76b4f4bfcc1")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnArtifactData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("049f85f0-2449-4b5d-a7c2-9b63c59524b8")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnArtifactData.Metadata.ProcessDep());
    }

    @objid ("c51c3a99-e192-4339-835c-0db697c5dc1e")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("2bc43f62-cd63-4192-9827-79afe75b8d59")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("27a286c7-8e30-44e8-853d-f9747a10880f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.SubProcessDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.CollaborationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnArtifactData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnArtifactData.Metadata.ProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e453b811-0814-4669-ba91-26cedfa1fe13")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnArtifact(this);
        else
          return null;
    }

}
