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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetData;
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

@objid ("0075254c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneSetImpl extends BpmnBaseElementImpl implements BpmnLaneSet {
    @objid ("7b350fcb-cbe6-47dc-b552-834d3e02840b")
    @Override
    public EList<BpmnLane> getLane() {
        return new SmList<>(this, ((BpmnLaneSetSmClass)getClassOf()).getLaneDep());
    }

    @objid ("96b8e8d5-6148-4560-a828-68837f8e9edc")
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

    @objid ("efa9bdff-f5d1-450f-9c78-f2b32e27acae")
    @Override
    public BpmnProcess getProcess() {
        Object obj = getDepVal(((BpmnLaneSetSmClass)getClassOf()).getProcessDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("2833bdeb-7aea-4f52-a272-38600b435c31")
    @Override
    public void setProcess(BpmnProcess value) {
        appendDepVal(((BpmnLaneSetSmClass)getClassOf()).getProcessDep(), (SmObjectImpl)value);
    }

    @objid ("32821463-17b0-4bbc-91c6-1f16536a058f")
    @Override
    public BpmnLane getParentLane() {
        Object obj = getDepVal(((BpmnLaneSetSmClass)getClassOf()).getParentLaneDep());
        return (obj instanceof BpmnLane)? (BpmnLane)obj : null;
    }

    @objid ("0a912f39-d02e-4ff2-a31e-b7422624df74")
    @Override
    public void setParentLane(BpmnLane value) {
        appendDepVal(((BpmnLaneSetSmClass)getClassOf()).getParentLaneDep(), (SmObjectImpl)value);
    }

    @objid ("833a2c17-5b28-4161-87e1-fe8ba8c64d2b")
    @Override
    public BpmnSubProcess getSubProcess() {
        Object obj = getDepVal(((BpmnLaneSetSmClass)getClassOf()).getSubProcessDep());
        return (obj instanceof BpmnSubProcess)? (BpmnSubProcess)obj : null;
    }

    @objid ("5290cfd5-7054-47e9-bb55-6b33a3d8b191")
    @Override
    public void setSubProcess(BpmnSubProcess value) {
        appendDepVal(((BpmnLaneSetSmClass)getClassOf()).getSubProcessDep(), (SmObjectImpl)value);
    }

    @objid ("0a6a9809-e8d0-4190-ab29-5a27d3e99abf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Process
        obj = (SmObjectImpl)this.getDepVal(((BpmnLaneSetSmClass)getClassOf()).getProcessDep());
        if (obj != null)
          return obj;
        // ParentLane
        obj = (SmObjectImpl)this.getDepVal(((BpmnLaneSetSmClass)getClassOf()).getParentLaneDep());
        if (obj != null)
          return obj;
        // SubProcess
        obj = (SmObjectImpl)this.getDepVal(((BpmnLaneSetSmClass)getClassOf()).getSubProcessDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ed0d2d79-4e9f-4281-9c4f-39b7e12431cc")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Process
        dep = ((BpmnLaneSetSmClass)getClassOf()).getProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentLane
        dep = ((BpmnLaneSetSmClass)getClassOf()).getParentLaneDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // SubProcess
        dep = ((BpmnLaneSetSmClass)getClassOf()).getSubProcessDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("f4ca13c4-1e8e-4d56-aa48-235387231ceb")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLaneSet(this);
        else
          return null;
    }

}
