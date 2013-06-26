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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("d6627747-0747-4f4d-b5c2-07c93db591df")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("2a313e88-d0a6-44bd-afe9-35b391fa2f0e")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnComplexBehaviorDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("2da3911e-f367-45a5-b52d-e1227d34fe95")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwner() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
    }

    @objid ("147248c3-734b-4581-8cdb-c37ba6b1d2e2")
    @Override
    public void setOwner(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("bb806d46-25b3-43cf-bd6b-5337fd8db0d8")
    @Override
    public BpmnImplicitThrowEvent getEvent() {
        return (BpmnImplicitThrowEvent) getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep());
    }

    @objid ("953a6714-21ba-4389-a85d-d8b400a3d4e7")
    @Override
    public void setEvent(BpmnImplicitThrowEvent value) {
        appendDepVal(BpmnComplexBehaviorDefinitionData.Metadata.EventDep(), (SmObjectImpl)value);
    }

    @objid ("64057784-037c-4869-abf3-9c8caf6ed957")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("83afa749-6742-48eb-b114-20fc6e4231fe")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("968d2d53-8abf-4753-82bf-db6382ed2978")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexBehaviorDefinition(this);
        else
          return null;
    }

}
