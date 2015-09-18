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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007fa21a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnComplexBehaviorDefinitionImpl extends BpmnBaseElementImpl implements BpmnComplexBehaviorDefinition {
    @objid ("7c9918a2-11e3-4019-98d2-3921db688b04")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("1b24ce0b-e0cb-4cec-b90b-4c27c51947ec")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("dacce329-b37f-4cbb-92b3-b127c641a415")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwner() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
    }

    @objid ("494cded5-e5d7-408c-b98a-0431a69cd9e7")
    @Override
    public void setOwner(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("4beecf2c-7963-42b6-bec9-1dfe22642f4e")
    @Override
    public BpmnImplicitThrowEvent getEvent() {
        return (BpmnImplicitThrowEvent) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep());
    }

    @objid ("28c4feb4-2183-4f0a-ad76-3f66edf9a8fc")
    @Override
    public void setEvent(BpmnImplicitThrowEvent value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep(), (SmObjectImpl)value);
    }

    @objid ("d00efb9c-d8ec-40b4-b81d-cef953383f7d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e9daa18a-96b9-405e-ab9e-6cc56ee6c990")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("de546f13-385a-41a2-8eec-33ea766d9a5a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexBehaviorDefinition(this);
        else
          return null;
    }

}
