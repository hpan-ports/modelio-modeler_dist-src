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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.data.bpmn.activities.BpmnLoopCharacteristicsData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00801fec-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnLoopCharacteristicsImpl extends BpmnBaseElementImpl implements BpmnLoopCharacteristics {
    @objid ("baf2c4c2-1ed9-4531-ac73-47a004b63dec")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
    }

    @objid ("fe565286-80ef-47ab-8c5b-fb26f5451579")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("8628daa5-9b8b-4471-8fbc-6421784f5423")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("369d8305-8f7d-4e1a-8bc1-076aa7e2ef61")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a683279e-799e-40e3-8a93-67812c90b45a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLoopCharacteristics(this);
        else
          return null;
    }

}
