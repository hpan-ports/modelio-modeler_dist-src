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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00749e92-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneImpl extends BpmnBaseElementImpl implements BpmnLane {
    @objid ("0fa8731c-c1ba-47e0-9123-a7bd3ba88cc0")
    @Override
    public BpmnLaneSet getChildLaneSet() {
        Object obj = getDepVal(((BpmnLaneSmClass)getClassOf()).getChildLaneSetDep());
        return (obj instanceof BpmnLaneSet)? (BpmnLaneSet)obj : null;
    }

    @objid ("de527288-23f0-48ca-833f-af6bd02e2fd3")
    @Override
    public void setChildLaneSet(BpmnLaneSet value) {
        appendDepVal(((BpmnLaneSmClass)getClassOf()).getChildLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("3ef23aae-a945-4a13-ba2d-de74a8614be0")
    @Override
    public ModelElement getPartitionElement() {
        Object obj = getDepVal(((BpmnLaneSmClass)getClassOf()).getPartitionElementDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("85d23fa3-a85a-4c36-8596-d66340d8e058")
    @Override
    public void setPartitionElement(ModelElement value) {
        appendDepVal(((BpmnLaneSmClass)getClassOf()).getPartitionElementDep(), (SmObjectImpl)value);
    }

    @objid ("08a80fd7-a161-4d65-b096-1a2f3160c1cf")
    @Override
    public EList<BpmnFlowElement> getFlowElementRef() {
        return new SmList<>(this, ((BpmnLaneSmClass)getClassOf()).getFlowElementRefDep());
    }

    @objid ("6eeec611-ee2a-4020-b25a-30dd5ddf191f")
    @Override
    public <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnFlowElement element : getFlowElementRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4ab5c3fe-7b5c-485b-8899-2a16ad97619c")
    @Override
    public BpmnLaneSet getLaneSet() {
        Object obj = getDepVal(((BpmnLaneSmClass)getClassOf()).getLaneSetDep());
        return (obj instanceof BpmnLaneSet)? (BpmnLaneSet)obj : null;
    }

    @objid ("b3c40d30-e04d-4819-ba51-bdc3899953ac")
    @Override
    public void setLaneSet(BpmnLaneSet value) {
        appendDepVal(((BpmnLaneSmClass)getClassOf()).getLaneSetDep(), (SmObjectImpl)value);
    }

    @objid ("f1ba3cc1-1e19-4e95-9e09-297e7429504f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // LaneSet
        obj = (SmObjectImpl)this.getDepVal(((BpmnLaneSmClass)getClassOf()).getLaneSetDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ae383aa3-d6ea-4e51-880d-6bf267a9296c")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // LaneSet
        dep = ((BpmnLaneSmClass)getClassOf()).getLaneSetDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("1d5e0a91-3a3b-4e5a-a25b-aefb34b39595")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLane(this);
        else
          return null;
    }

}
