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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00068a7e-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataInputImpl extends BpmnItemAwareElementImpl implements BpmnDataInput {
    @objid ("d3f432f3-4040-4a32-a6e4-0df56f8136b7")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep());
    }

    @objid ("96d71661-ab2c-4ee5-ba36-2b70cac48e8f")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("4429a8cb-a488-4d79-8cd1-e24d0da3976a")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("ae2cc3dd-d59e-4728-8981-126b59afce2d")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("eb465d71-7fb9-46e6-b967-9a1b3e620189")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
    }

    @objid ("49bcceac-b529-49fc-9ae2-401acf5e394f")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("caa7524e-0c8e-4bef-af06-8ee6159d8289")
    @Override
    public BpmnThrowEvent getOwnerThrowEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
    }

    @objid ("8a9c94c2-db53-4cb1-8050-a1b6360faf0c")
    @Override
    public void setOwnerThrowEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), (SmObjectImpl)value);
    }

    @objid ("e730e358-5b8f-4a2f-b8e7-825f50091004")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d4391750-1506-4f78-b232-328acbd7bee4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
        if (obj != null)
          return new SmDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("9489e8bd-3974-48b4-9f63-222f2e5a1d54")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataInput(this);
        else
          return null;
    }

}
