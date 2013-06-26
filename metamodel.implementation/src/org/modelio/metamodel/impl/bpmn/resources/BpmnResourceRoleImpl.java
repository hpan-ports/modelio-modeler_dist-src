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
    @objid ("bf258b7c-6a7f-4ecf-ad8f-99ddba52dbe0")
    @Override
    public BpmnResource getResourceRef() {
        return (BpmnResource) getDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep());
    }

    @objid ("d5761e35-20fe-4785-afa8-df7681705f36")
    @Override
    public void setResourceRef(BpmnResource value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("2de48c41-52b0-41cf-ae5b-9f0cc62ee95a")
    @Override
    public BpmnFlowNode getAnnotated() {
        return (BpmnFlowNode) getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
    }

    @objid ("111531eb-f124-4720-b75e-35addc7c0052")
    @Override
    public void setAnnotated(BpmnFlowNode value) {
        appendDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), (SmObjectImpl)value);
    }

    @objid ("5810ab8b-8daf-468f-b9f3-5a6715b328ad")
    @Override
    public EList<BpmnResourceParameterBinding> getResourceParameterBinding() {
        return new SmList<>(this, BpmnResourceRoleData.Metadata.ResourceParameterBindingDep());
    }

    @objid ("eda639f2-5dc2-4c6d-b03c-1ac35abb856e")
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

    @objid ("020562fb-4756-449a-9fe1-9251d40a7927")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
    }

    @objid ("cbeecda2-8e2b-45b0-9d0a-7077a44aeb4f")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("fe056096-ac4e-49d4-aa61-ea595e890c55")
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

    @objid ("6b33b7cb-ccfc-49d3-94e0-07f4a362345c")
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

    @objid ("58aeb940-0f73-4a24-905d-5aa37583533b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceRole(this);
        else
          return null;
    }

}
