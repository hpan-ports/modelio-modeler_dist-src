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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0005e9a2-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataOutputImpl extends BpmnItemAwareElementImpl implements BpmnDataOutput {
    @objid ("fd656b71-7c46-4098-8069-a3c586c0be0a")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep());
    }

    @objid ("bf194e09-dae6-4268-ae4d-bd18d135c52a")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("b6538bf5-e9e2-481a-b11c-96a243d68033")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
    }

    @objid ("ef5a51c6-0283-4583-b7c8-852e0679bc54")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("93895899-b6e9-4544-82fd-1884f2e184a7")
    @Override
    public BpmnCatchEvent getCatched() {
        return (BpmnCatchEvent) getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
    }

    @objid ("d47a4289-0d39-491d-aef2-2a47cecbd271")
    @Override
    public void setCatched(BpmnCatchEvent value) {
        appendDepVal(BpmnDataOutputData.Metadata.CatchedDep(), (SmObjectImpl)value);
    }

    @objid ("a5a8fe6b-7bec-4f68-92fd-1c71dcb7dc2c")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("5386da65-da84-4feb-9df8-54a0c0e8fd5b")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("9807394e-1707-45c9-a772-29e008c24877")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("da239e7d-ffaf-4fb7-9ff8-81ab95e91877")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.CatchedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
        if (obj != null)
          return new SmDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("66de4bf8-235b-4411-a7b0-1ccedc0e841e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataOutput(this);
        else
          return null;
    }

}
