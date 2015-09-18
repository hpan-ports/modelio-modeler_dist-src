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
    @objid ("df89ce82-8543-4537-b3ed-28a2a58bf596")
    @Override
    public BpmnResource getResourceRef() {
        return (BpmnResource) getDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep());
    }

    @objid ("56f491f4-bfbc-4201-b8ad-157506db829e")
    @Override
    public void setResourceRef(BpmnResource value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ResourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("779f238e-4b40-447a-afe3-be660adb3b4e")
    @Override
    public BpmnFlowNode getAnnotated() {
        return (BpmnFlowNode) getDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep());
    }

    @objid ("edd11ce0-702a-43d5-9de0-b4f2854a6433")
    @Override
    public void setAnnotated(BpmnFlowNode value) {
        appendDepVal(BpmnResourceRoleData.Metadata.AnnotatedDep(), (SmObjectImpl)value);
    }

    @objid ("6236d299-71a0-4284-a0fe-a558beaf2e8b")
    @Override
    public EList<BpmnResourceParameterBinding> getResourceParameterBinding() {
        return new SmList<>(this, BpmnResourceRoleData.Metadata.ResourceParameterBindingDep());
    }

    @objid ("18a29c84-3f70-48d6-b465-47ad321881f1")
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

    @objid ("4d4f25d7-75ab-44e3-9044-e9002e52ae3e")
    @Override
    public BpmnProcess getProcess() {
        return (BpmnProcess) getDepVal(BpmnResourceRoleData.Metadata.ProcessDep());
    }

    @objid ("70c27724-93d2-4146-a90c-7428d8ff8493")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(BpmnResourceRoleData.Metadata.ProcessDep(), (SmObjectImpl)value);
    }

    @objid ("4f958486-6454-4d23-b62e-d764d845eebd")
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

    @objid ("1dfdfe41-237d-44d4-882b-afcb09b465f9")
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

    @objid ("f0f6fa28-ac42-4b95-8fcc-c45565d75b04")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceRole(this);
        else
          return null;
    }

}
