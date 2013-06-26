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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.MessageFlowData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00381364-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageFlowImpl extends ActivityEdgeImpl implements MessageFlow {
    @objid ("bbe0e5f8-9e14-4b17-ba5e-54d4d64c8976")
    @Override
    public ActivityPartition getTargetPartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.TargetPartitionDep());
    }

    @objid ("02f995c4-c28b-48c1-b3d5-d1be0aa88ac7")
    @Override
    public void setTargetPartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.TargetPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("8331f06e-2a20-4fd1-8dee-88cc29839a7b")
    @Override
    public ActivityPartition getSourcePartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
    }

    @objid ("5ca977e2-28f9-4ba9-9485-5550559b75f5")
    @Override
    public void setSourcePartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.SourcePartitionDep(), (SmObjectImpl)value);
    }

    @objid ("b8878f4e-cd8f-4b88-934d-7c886b90d03a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d6f6268a-294e-4041-aa35-9a2d3b4d95d0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return new SmDepVal(MessageFlowData.Metadata.SourcePartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("28371fc0-9a31-4b1b-af0b-f32d8d55cf4f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageFlow(this);
        else
          return null;
    }

}
