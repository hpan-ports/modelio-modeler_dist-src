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
    @objid ("44ae4927-3164-497e-8df9-b16e180f4dc1")
    @Override
    public BpmnActivity getOwnerActivity() {
        return (BpmnActivity) getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
    }

    @objid ("7a44dc04-3117-48b5-90e2-68a58ab599fb")
    @Override
    public void setOwnerActivity(BpmnActivity value) {
        appendDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep(), (SmObjectImpl)value);
    }

    @objid ("c6911e41-74f1-4a44-ae39-acbc048021e1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c96324c4-b499-40a6-ac67-79379b8faf4e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep());
        if (obj != null)
          return new SmDepVal(BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f1d133b7-7016-4cb0-8382-427a909de30b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnLoopCharacteristics(this);
        else
          return null;
    }

}
