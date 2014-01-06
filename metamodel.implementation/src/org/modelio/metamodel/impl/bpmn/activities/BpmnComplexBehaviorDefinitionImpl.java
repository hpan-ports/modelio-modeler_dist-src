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
/*   Metamodel version: 9019              */
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
    @objid ("1ea54b03-2dc5-4053-a2b8-9fbbf5a6e746")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("275b216b-4ce9-4bd3-a2e9-05576526ba5b")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("9468343c-6a3a-4046-a16b-f5332278a9bf")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwner() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
    }

    @objid ("aff755c2-6358-4919-a986-fdd589d55de0")
    @Override
    public void setOwner(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f73daeda-5743-4ce6-bce6-438884077a81")
    @Override
    public BpmnImplicitThrowEvent getEvent() {
        return (BpmnImplicitThrowEvent) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep());
    }

    @objid ("ebc136c7-55ba-4342-acf7-ba0177239492")
    @Override
    public void setEvent(BpmnImplicitThrowEvent value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep(), (SmObjectImpl)value);
    }

    @objid ("2b945411-0d7e-4410-ae1c-6e89a9f67e69")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a87b53a9-3e21-4469-b804-f3c7e4093fe6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("88832a19-a9e9-456d-ac9c-5216f171d2f9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexBehaviorDefinition(this);
        else
          return null;
    }

}
