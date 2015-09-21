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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0079514e-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowElementImpl extends BpmnBaseElementImpl implements BpmnFlowElement {
    @objid ("2428c3c6-14f9-400c-896d-11d6b1988a11")
    @Override
    public EList<BpmnGroup> getGroups() {
        return new SmList<>(this, ((BpmnFlowElementSmClass)getClassOf()).getGroupsDep());
    }

    @objid ("08313942-e842-47ca-bfd9-3628565d32dc")
    @Override
    public <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnGroup element : getGroups()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ce086aae-1f33-4e95-aa07-6d8015c8b94e")
    @Override
    public BpmnSubProcess getSubProcess() {
        Object obj = getDepVal(((BpmnFlowElementSmClass)getClassOf()).getSubProcessDep());
        return (obj instanceof BpmnSubProcess)? (BpmnSubProcess)obj : null;
    }

    @objid ("0cf0ba47-c16f-4d04-9d9c-1b03b382207a")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(((BpmnFlowElementSmClass)getClassOf()).getSubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("ed39a752-1599-4b8f-ad0d-d85e9980711d")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, ((BpmnFlowElementSmClass)getClassOf()).getLaneDep());
    }

    @objid ("06a32616-c4d9-4ada-b5a1-918f951773ad")
    @Override
    public <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnLane element : getLane()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e2998360-fb9e-4607-ac6b-6045b2d3f2a1")
    @Override
    public BpmnProcess getContainer() {
        Object obj = getDepVal(((BpmnFlowElementSmClass)getClassOf()).getContainerDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("0c620ec8-6e37-450a-87b6-b6a669fa71e8")
    @Override
    public void setContainer(BpmnProcess value) {
        appendDepVal(((BpmnFlowElementSmClass)getClassOf()).getContainerDep(), (SmObjectImpl)value);
    }

    @objid ("3064c19a-d198-40a9-a434-413086cac7ff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SubProcess
        obj = (SmObjectImpl)this.getDepVal(((BpmnFlowElementSmClass)getClassOf()).getSubProcessDep());
        if (obj != null)
          return obj;
        // Container
        obj = (SmObjectImpl)this.getDepVal(((BpmnFlowElementSmClass)getClassOf()).getContainerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fd12206d-9d81-40b3-9005-42b465dd274a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SubProcess
        dep = ((BpmnFlowElementSmClass)getClassOf()).getSubProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Container
        dep = ((BpmnFlowElementSmClass)getClassOf()).getContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("829cacb2-a6f2-42a5-8df3-b44707614034")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowElement(this);
        else
          return null;
    }

}
