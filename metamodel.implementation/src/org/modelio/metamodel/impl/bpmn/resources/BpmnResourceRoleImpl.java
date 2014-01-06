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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000ab8a6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceRoleImpl extends BpmnBaseElementImpl implements BpmnResourceRole {
    @objid ("170fc07f-29a4-4b0c-81be-73d18b0ddf40")
    @Override
    public BpmnResource getResourceRef() {
        return (BpmnResource) getDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep());
    }

    @objid ("c6717f14-423e-48ec-af52-8f5cbc9bc2d3")
    @Override
    public void setResourceRef(BpmnResource value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("2dc4c062-cf06-407b-b961-1a985e653725")
    @Override
    public BpmnFlowNode getAnnotated() {
        return (BpmnFlowNode) getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
    }

    @objid ("17e03d5a-f480-4194-898e-b9c6b3b4ed59")
    @Override
    public void setAnnotated(BpmnFlowNode value) {
        appendDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), (SmObjectImpl)value);
    }

    @objid ("5b5b9721-1a29-415e-b26b-ad192a84d79c")
    @Override
    public EList<BpmnResourceParameterBinding> getResourceParameterBinding() {
        return new SmList<>(this, BpmnResourceRoleData.Metadata.ResourceParameterBindingDep());
    }

    @objid ("7d3d5229-e92c-4c42-80d2-7ae6ab8a7d82")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceParameterBinding element : getResourceParameterBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ad0ddba3-a9c7-4b36-bb4b-ee1b445abb54")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
    }

    @objid ("eed6adeb-248c-4200-9558-73f44c736895")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("1ade0c53-ba73-47e4-a4ad-2cf0c0fc575c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("42b28313-55ff-4e87-a118-525c20b27235")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
        if (obj != null)
          return new SmDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d7ec8e66-df88-4150-b8bb-864da898bfbb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceRole(this);
        else
          return null;
    }

}
