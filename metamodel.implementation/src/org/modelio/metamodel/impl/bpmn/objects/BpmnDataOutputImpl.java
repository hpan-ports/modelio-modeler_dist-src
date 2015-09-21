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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputData;
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

@objid ("0005e9a2-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataOutputImpl extends BpmnItemAwareElementImpl implements BpmnDataOutput {
    @objid ("126eff51-d836-4769-b01f-1e1dc7801896")
    @Override
    public Parameter getRepresentedParameter() {
        Object obj = getDepVal(((BpmnDataOutputSmClass)getClassOf()).getRepresentedParameterDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("07f02b36-cba4-4f32-8017-6edade4811e8")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(((BpmnDataOutputSmClass)getClassOf()).getRepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("1ae1b54c-28cc-42a3-b038-c3b4111aa50a")
    @Override
    public BpmnActivity getOwnerActivity() {
        Object obj = getDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerActivityDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("b45a1cf1-09c3-4e19-a277-f5c3ae3bb15b")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("949ecad4-f421-4a6f-b94c-21b286dd0801")
    @Override
    public BpmnCatchEvent getCatched() {
        Object obj = getDepVal(((BpmnDataOutputSmClass)getClassOf()).getCatchedDep());
        return (obj instanceof BpmnCatchEvent)? (BpmnCatchEvent)obj : null;
    }

    @objid ("96629c88-9535-4b54-b114-f16e38550d93")
    @Override
    public void setCatched(BpmnCatchEvent value) {
        appendDepVal(((BpmnDataOutputSmClass)getClassOf()).getCatchedDep(), (SmObjectImpl)value);
    }

    @objid ("cbd148ac-3eda-4809-8fb9-d8ceab137621")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        Object obj = getDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep());
        return (obj instanceof BpmnMultiInstanceLoopCharacteristics)? (BpmnMultiInstanceLoopCharacteristics)obj : null;
    }

    @objid ("8a39628e-5c0c-492f-83c3-dcc50497cd0a")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("f8a4071f-7582-4f31-aae8-4e3a560807cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerActivity
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerActivityDep());
        if (obj != null)
          return obj;
        // Catched
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataOutputSmClass)getClassOf()).getCatchedDep());
        if (obj != null)
          return obj;
        // OwnerLoopCharacteristics
        obj = (SmObjectImpl)this.getDepVal(((BpmnDataOutputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fa9c6a5c-65a3-4854-bc81-152fb5d575be")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerActivity
        dep = ((BpmnDataOutputSmClass)getClassOf()).getOwnerActivityDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Catched
        dep = ((BpmnDataOutputSmClass)getClassOf()).getCatchedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerLoopCharacteristics
        dep = ((BpmnDataOutputSmClass)getClassOf()).getOwnerLoopCharacteristicsDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("dd67d4fe-9bd3-42f2-95cd-0e0e7dc421e7")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataOutput(this);
        else
          return null;
    }

}
