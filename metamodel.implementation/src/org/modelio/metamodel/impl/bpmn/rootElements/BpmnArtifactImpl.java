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
    @objid ("98f937a0-f6f7-4f4c-816d-6883ee8e3783")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
    }

    @objid ("f5b308ec-5fab-4875-9f14-03e7367354e4")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("24fa9457-6636-4860-bff1-4bfe00164bd9")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
    }

    @objid ("4de02eee-125e-45df-806f-c3889699fda8")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnArtifactData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("a517a8fb-59d2-4834-8366-8e9b92e46bb1")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnArtifactData.Metadata.ProcessDep());
    }

    @objid ("81d94907-3ea2-4a5a-823c-aad23ad0a0a1")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("1df0cadb-9ac7-4c83-8500-a113bf5e639e")
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

    @objid ("1d47dafc-c1f5-428f-a418-8d04085628d9")
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

    @objid ("46d23b5e-7aeb-4e0e-a358-0d6e4006ccad")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnArtifact(this);
        else
          return null;
    }

}
