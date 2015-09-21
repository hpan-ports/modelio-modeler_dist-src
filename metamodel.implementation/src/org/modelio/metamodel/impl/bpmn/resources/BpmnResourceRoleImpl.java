/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
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
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000ab8a6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceRoleImpl extends BpmnBaseElementImpl implements BpmnResourceRole {
    @objid ("f1af4122-ffa2-4b19-8ed8-54d4213ae780")
    @Override
    public BpmnResource getResourceRef() {
        Object obj = getDepVal(((BpmnResourceRoleSmClass)getClassOf()).getResourceRefDep());
        return (obj instanceof BpmnResource)? (BpmnResource)obj : null;
    }

    @objid ("f57599bb-d60a-4959-9d02-bea697d801b0")
    @Override
    public void setResourceRef(BpmnResource value) {
        appendDepVal(((BpmnResourceRoleSmClass)getClassOf()).getResourceRefDep(), (SmObjectImpl)value);
    }

    @objid ("91d78edf-84a3-4bf1-86ca-dc547e14c2a2")
    @Override
    public BpmnFlowNode getAnnotated() {
        Object obj = getDepVal(((BpmnResourceRoleSmClass)getClassOf()).getAnnotatedDep());
        return (obj instanceof BpmnFlowNode)? (BpmnFlowNode)obj : null;
    }

    @objid ("9b96a74c-9c65-4c6a-8bac-2da598a4d9dd")
    @Override
    public void setAnnotated(BpmnFlowNode value) {
        appendDepVal(((BpmnResourceRoleSmClass)getClassOf()).getAnnotatedDep(), (SmObjectImpl)value);
    }

    @objid ("daa8a73b-3c8c-4bc5-aacc-a35d5692ca48")
    @Override
    public EList<BpmnResourceParameterBinding> getResourceParameterBinding() {
        return new SmList<>(this, ((BpmnResourceRoleSmClass)getClassOf()).getResourceParameterBindingDep());
    }

    @objid ("2b97fd8c-e12e-4b25-a742-3c4ee127fdf6")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getResourceParameterBinding(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnResourceParameterBinding element : getResourceParameterBinding()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb6a42b1-0649-4b6f-b3dd-f316ab5ce3e2")
    @Override
    public BpmnProcess getProcess() {
        Object obj = getDepVal(((BpmnResourceRoleSmClass)getClassOf()).getProcessDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("455e88de-dd8f-42e6-abf8-4c5de7941ffd")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(((BpmnResourceRoleSmClass)getClassOf()).getProcessDep(), (SmObjectImpl)value);
    }

    @objid ("a6d62a45-36f6-4b59-908f-f9bbdf541f49")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Annotated
        obj = (SmObjectImpl)this.getDepVal(((BpmnResourceRoleSmClass)getClassOf()).getAnnotatedDep());
        if (obj != null)
          return obj;
        // Process
        obj = (SmObjectImpl)this.getDepVal(((BpmnResourceRoleSmClass)getClassOf()).getProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("67cd8c63-56db-4654-8822-8464265ad37f")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Annotated
        dep = ((BpmnResourceRoleSmClass)getClassOf()).getAnnotatedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Process
        dep = ((BpmnResourceRoleSmClass)getClassOf()).getProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("aa85d835-82dd-4a3e-9d52-d93d7f9e05c3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceRole(this);
        else
          return null;
    }

}
