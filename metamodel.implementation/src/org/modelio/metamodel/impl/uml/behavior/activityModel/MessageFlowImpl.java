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
    @objid ("ff7d1869-d8db-4413-911c-207314132d7b")
    @Override
    public ActivityPartition getTargetPartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.TargetPartitionDep());
    }

    @objid ("52204202-5f21-4286-9328-d21c09289b81")
    @Override
    public void setTargetPartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.TargetPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("d52fd985-214d-4540-b948-c5447e8b8c01")
    @Override
    public ActivityPartition getSourcePartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
    }

    @objid ("af6e899e-844a-438d-8496-fa929d33bea6")
    @Override
    public void setSourcePartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.SourcePartitionDep(), (SmObjectImpl)value);
    }

    @objid ("fcc050bc-817c-490e-af39-5463370d32df")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2a2daec1-f4df-4829-a141-39eb8a46936e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return new SmDepVal(MessageFlowData.Metadata.SourcePartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c9fe70ab-a120-4e95-ae6e-7c0b98c7e02e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageFlow(this);
        else
          return null;
    }

}
