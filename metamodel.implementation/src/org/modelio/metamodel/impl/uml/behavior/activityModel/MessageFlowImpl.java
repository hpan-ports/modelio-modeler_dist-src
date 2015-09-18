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
    @objid ("dd7ee74c-d532-4578-8ca3-7a29d36ffa81")
    @Override
    public ActivityPartition getTargetPartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.TargetPartitionDep());
    }

    @objid ("9301ed36-799d-4a92-99ca-74af5c7ae640")
    @Override
    public void setTargetPartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.TargetPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("895bd692-fbcb-4574-a079-069533e3e77e")
    @Override
    public ActivityPartition getSourcePartition() {
        return (ActivityPartition) getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
    }

    @objid ("db4df072-3dc5-4f25-8a53-47251f137a5f")
    @Override
    public void setSourcePartition(ActivityPartition value) {
        appendDepVal(MessageFlowData.Metadata.SourcePartitionDep(), (SmObjectImpl)value);
    }

    @objid ("8b827f82-9de7-4c1f-b999-39a07a91687c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("89749f29-ce8f-4e48-9f86-365c86228e0b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(MessageFlowData.Metadata.SourcePartitionDep());
        if (obj != null)
          return new SmDepVal(MessageFlowData.Metadata.SourcePartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("33332fdf-7580-4e14-8dcb-7e6160d57910")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitMessageFlow(this);
        else
          return null;
    }

}
