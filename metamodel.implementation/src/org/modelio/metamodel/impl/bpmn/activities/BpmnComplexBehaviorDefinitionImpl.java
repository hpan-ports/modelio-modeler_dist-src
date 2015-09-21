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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.impl.bpmn.activities.BpmnComplexBehaviorDefinitionData;
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

@objid ("007fa21a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnComplexBehaviorDefinitionImpl extends BpmnBaseElementImpl implements BpmnComplexBehaviorDefinition {
    @objid ("be33ae54-4e6b-46ca-bd0b-cd4df064369f")
    @Override
    public String getCondition() {
        return (String) getAttVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getConditionAtt());
    }

    @objid ("d4c4028f-a6dd-48d3-9e7d-5e8ce8fc6aa5")
    @Override
    public void setCondition(String value) {
        setAttVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getConditionAtt(), value);
    }

    @objid ("d5ad2ce9-0e6f-42ce-9a1f-edb29eedd796")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwner() {
        Object obj = getDepVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof BpmnMultiInstanceLoopCharacteristics)? (BpmnMultiInstanceLoopCharacteristics)obj : null;
    }

    @objid ("11fec838-2b5f-4165-a591-3cb981331e7c")
    @Override
    public void setOwner(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("44e2d9a0-3c20-445e-a129-4b33b694fdac")
    @Override
    public BpmnImplicitThrowEvent getEvent() {
        Object obj = getDepVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getEventDep());
        return (obj instanceof BpmnImplicitThrowEvent)? (BpmnImplicitThrowEvent)obj : null;
    }

    @objid ("7a791cb6-bfc6-4c9f-b20c-b1679703cf12")
    @Override
    public void setEvent(BpmnImplicitThrowEvent value) {
        appendDepVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getEventDep(), (SmObjectImpl)value);
    }

    @objid ("70811f6e-111c-49d7-8f1c-023f2ef50f9e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("947dcf2f-3353-48ff-bf51-53bf0a64137f")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((BpmnComplexBehaviorDefinitionSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c0a8f6f8-3210-4273-a54e-07a7a97dbf94")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexBehaviorDefinition(this);
        else
          return null;
    }

}
