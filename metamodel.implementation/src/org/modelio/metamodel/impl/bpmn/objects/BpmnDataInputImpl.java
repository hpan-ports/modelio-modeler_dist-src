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
    @objid ("31bbc25b-ac39-4b84-9877-d0dc2cb7ba25")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep());
    }

    @objid ("6cfe0eca-2c89-43b0-927c-dd07e934e1e8")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("50a49015-1adb-4e13-bd6c-793cf8420992")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("bec68d21-fc63-4ac5-922a-198b3b656262")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("0ac70090-d2a9-49d8-bf97-41138d6694f4")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
    }

    @objid ("e8380347-b441-4775-ba1a-8469e5f2f64e")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("9f0cf70a-f39c-4c3b-a32f-7bb383f080b6")
    @Override
    public BpmnThrowEvent getOwnerThrowEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
    }

    @objid ("ebb0bbee-1f7f-4a3f-8928-ad609e836766")
    @Override
    public void setOwnerThrowEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), (SmObjectImpl)value);
    }

    @objid ("c1d30e5e-f7a9-4451-adc8-e4a706fa2da6")
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

    @objid ("e899efd3-4173-4c40-beb4-cb6c3fa68117")
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

    @objid ("ba9a7320-0f61-48f8-a986-d4bfb6f47bde")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataInput(this);
        else
          return null;
    }

}
