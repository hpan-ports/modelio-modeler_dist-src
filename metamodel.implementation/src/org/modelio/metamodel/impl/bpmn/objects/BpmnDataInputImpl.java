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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00068a7e-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataInputImpl extends BpmnItemAwareElementImpl implements BpmnDataInput {
    @objid ("7e349c22-c87d-481b-b225-b8825ac5c1ea")
    @Override
    public Parameter getRepresentedParameter() {
        Object obj = getDepVal(((BpmnDataInputSmClass)getClassOf()).getRepresentedParameterDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("cc71456b-c348-4983-936d-fbe99e5fa9fc")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(((BpmnDataInputSmClass)getClassOf()).getRepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("2c6ec87b-16ef-47e5-bd8f-c6fb86f9571c")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        Object obj = getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep());
        return (obj instanceof BpmnMultiInstanceLoopCharacteristics)? (BpmnMultiInstanceLoopCharacteristics)obj : null;
    }

    @objid ("8bc774ee-6d41-4850-b775-dda14324f68e")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("e1a60c16-a0ca-415a-88cf-55c5e9f6a91e")
    @Override
    public BpmnActivity getOwnerActivity() {
        Object obj = getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerActivityDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("725213fd-4941-4180-ae17-ccfb382138b4")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("cc1a708e-10d6-48f4-a22e-01d3ff5f4295")
    @Override
    public BpmnThrowEvent getOwnerThrowEvent() {
        Object obj = getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerThrowEventDep());
        return (obj instanceof BpmnThrowEvent)? (BpmnThrowEvent)obj : null;
    }

    @objid ("cd26c4c9-9100-447b-bb2b-663ee0992c2a")
    @Override
    public void setOwnerThrowEvent(BpmnThrowEvent value) {
        appendDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerThrowEventDep(), (SmObjectImpl)value);
    }

    @objid ("f0eaacda-9675-47a1-814f-bd6c77b86100")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerLoopCharacteristics
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        // OwnerActivity
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerActivityDep());
        if (obj != null)
          return obj;
        // OwnerThrowEvent
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataInputSmClass)getClassOf()).getOwnerThrowEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d5fbbf6d-564b-435b-86cb-f15418112e31")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerLoopCharacteristics
        dep = ((BpmnDataInputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerActivity
        dep = ((BpmnDataInputSmClass)getClassOf()).getOwnerActivityDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerThrowEvent
        dep = ((BpmnDataInputSmClass)getClassOf()).getOwnerThrowEventDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("560e0071-1d61-48a5-97f8-82115e6baacc")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataInput(this);
        else
          return null;
    }

}
