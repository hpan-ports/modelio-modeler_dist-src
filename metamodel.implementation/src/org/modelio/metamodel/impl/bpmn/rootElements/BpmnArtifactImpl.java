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
    @objid ("8b10a6be-5ba5-40eb-b1d3-43b58e1cca0d")
    @Override
    public BpmnSubProcess getSubProcess() {
        return (BpmnSubProcess) getDepVal(BpmnArtifactData.Metadata.SubProcessDep());
    }

    @objid ("1f9ece1e-6d77-4392-a0f2-9fe5eb472ee2")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.SubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("c05abdf3-2230-496b-a3a5-2658a436ba0d")
    @Override
    public BpmnCollaboration getCollaboration() {
        return (BpmnCollaboration) getDepVal(BpmnArtifactData.Metadata.CollaborationDep());
    }

    @objid ("4bf10635-9eb8-43bd-89b1-ef54467293cd")
    @Override
    public void setCollaboration(BpmnCollaboration value) {
        appendDepVal(BpmnArtifactData.Metadata.CollaborationDep(), (SmObjectImpl)value);
    }

    @objid ("bfd88927-11fe-4cbd-bca0-e3f7d69dff6d")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnArtifactData.Metadata.ProcessDep());
    }

    @objid ("c023577d-06ea-48ab-9df6-f7a6388f8b9e")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnArtifactData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("f40226c5-f709-4592-9d47-68ffdbe648eb")
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

    @objid ("9d12207c-c731-4a9c-bc33-0a6a5775d8e9")
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

    @objid ("5c3c3523-adcd-4885-a4be-183560f1f018")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnArtifact(this);
        else
          return null;
    }

}
