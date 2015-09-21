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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00087bf4-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStateImpl extends BpmnBaseElementImpl implements BpmnDataState {
    @objid ("2dd7feaf-5751-4353-b0d4-5d4a7da184bc")
    @Override
    public BpmnItemAwareElement getItem() {
        Object obj = getDepVal(((BpmnDataStateSmClass)getClassOf()).getItemDep());
        return (obj instanceof BpmnItemAwareElement)? (BpmnItemAwareElement)obj : null;
    }

    @objid ("3fe26d42-10ff-458d-b60c-f3f76c0294ee")
    @Override
    public void setItem(BpmnItemAwareElement value) {
        appendDepVal(((BpmnDataStateSmClass)getClassOf()).getItemDep(), (SmObjectImpl)value);
    }

    @objid ("0f7a0e9c-f612-478a-b505-a435bcb4ba4c")
    @Override
    public State getUmlState() {
        Object obj = getDepVal(((BpmnDataStateSmClass)getClassOf()).getUmlStateDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("ba6a0273-0021-47c0-8bdc-13b36494d182")
    @Override
    public void setUmlState(State value) {
        appendDepVal(((BpmnDataStateSmClass)getClassOf()).getUmlStateDep(), (SmObjectImpl)value);
    }

    @objid ("e606747b-e716-46f8-bb92-3e28a0199156")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Item
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataStateSmClass)getClassOf()).getItemDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3e362b5a-61bc-4589-8075-ad52098f365b")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Item
        dep = ((BpmnDataStateSmClass)getClassOf()).getItemDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c1e06140-61f1-4207-befb-d6f55e5facaa")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataState(this);
        else
          return null;
    }

}
