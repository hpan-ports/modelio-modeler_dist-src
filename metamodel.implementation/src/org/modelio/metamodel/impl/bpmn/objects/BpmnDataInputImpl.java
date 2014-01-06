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
    @objid ("e3236a27-919f-4387-9568-c62e5a24725f")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep());
    }

    @objid ("cc262dbb-741a-4227-a2eb-6aabb427babb")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataInputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("5bd6db86-74a7-4d1a-9609-4f082105e45a")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("74c75f75-3c46-4623-a597-5a013f7a2f2c")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("d21b3b90-d316-44eb-a785-5cc08ddbfc39")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataInputData.Metadata.OwnerActivityDep());
    }

    @objid ("fba155fa-d1a8-4eee-b196-81658b251293")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("af95cd7f-0eeb-4011-b99e-92a0ad08e346")
    @Override
    public BpmnThrowEvent getOwnerThrowEvent() {
        return (BpmnThrowEvent) getDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep());
    }

    @objid ("a8382416-7f7b-4a17-8fdb-5cf7545ccdeb")
    @Override
    public void setOwnerThrowEvent(BpmnThrowEvent value) {
        appendDepVal(BpmnDataInputData.Metadata.OwnerThrowEventDep(), (SmObjectImpl)value);
    }

    @objid ("09d858cf-f23b-46bf-91e2-c7369199afd9")
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

    @objid ("88ad30ae-ae91-436e-b607-9b38477b63ed")
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

    @objid ("7a9bac9b-f896-48c0-8533-d3804907b2a3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataInput(this);
        else
          return null;
    }

}
