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
    @objid ("13696773-4fbf-45a2-ae6c-3074665f6aab")
    @Override
    public Parameter getRepresentedParameter() {
        return (Parameter) getDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep());
    }

    @objid ("11deee5c-d41d-4d4f-8e7a-f07628d0b152")
    @Override
    public void setRepresentedParameter(Parameter value) {
        appendDepVal(BpmnDataOutputData.Metadata.RepresentedParameterDep(), (SmObjectImpl)value);
    }

    @objid ("01e99040-29de-40ce-816b-626115099d33")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep());
    }

    @objid ("1c97ac7c-ea1b-4ab0-b440-581732903a2b")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("783ce10c-0dcc-479a-a125-0f12804f238b")
    @Override
    public BpmnCatchEvent getCatched() {
        return (BpmnCatchEvent) getDepVal(BpmnDataOutputData.Metadata.CatchedDep());
    }

    @objid ("6d536b60-576e-43dd-8527-d9822d092a75")
    @Override
    public void setCatched(BpmnCatchEvent value) {
        appendDepVal(BpmnDataOutputData.Metadata.CatchedDep(), (SmObjectImpl)value);
    }

    @objid ("0d7da346-6099-4f71-bf9e-d62d0b8fceef")
    @Override
    public BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics() {
        return (BpmnMultiInstanceLoopCharacteristics) getDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep());
    }

    @objid ("3cc13536-962d-4a19-91f5-ef505df15531")
    @Override
    public void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value) {
        appendDepVal(BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep(), (SmObjectImpl)value);
    }

    @objid ("53604a0f-9c29-4437-839b-c63bd7ecf0a0")
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

    @objid ("69e298ba-b6c9-4df0-b9a9-ee2eec5fbdb0")
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

    @objid ("0a8eb98a-09e5-46cb-b5f5-02d625d128d4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataOutput(this);
        else
          return null;
    }

}
