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
    @objid ("2bd1b1f3-7f26-4828-8830-2d28f9c2fed6")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep());
    }

    @objid ("12c06f99-d428-4746-99ef-48b42b44a828")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("0190d3d8-0329-4c03-9c67-b68c05267679")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
    }

    @objid ("d2396df9-228c-4158-b216-7246ad9c25e7")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("caa99029-9db9-48f0-aa34-0c80e202107d")
    @Override
    public BpmnCatchEvent getCatched() {
        return (BpmnCatchEvent) getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
    }

    @objid ("58283078-ac12-4d53-990d-a63356ec7a76")
    @Override
    public void setCatched(BpmnCatchEvent value) {
        appendDepVal(BpmnDataOutputData.Metadata.CatchedDep(), (SmObjectImpl)value);
    }

    @objid ("cdcab03d-297c-4808-8978-2825cc93fc8f")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("8a64e058-5feb-46db-bf9f-401976f177d6")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("539531db-36c2-4f07-80b7-b82516e2860c")
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

    @objid ("70d4fe59-394c-40b5-bf0a-b40c7f9d943c")
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

    @objid ("286c86ce-f5b7-436e-85fe-fe70ee362945")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataOutput(this);
        else
          return null;
    }

}
