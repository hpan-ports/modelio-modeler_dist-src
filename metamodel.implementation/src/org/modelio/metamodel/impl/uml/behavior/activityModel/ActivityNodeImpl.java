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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityNodeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0028d9f8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityNodeImpl extends ModelElementImpl implements ActivityNode {
    @objid ("e5e0b815-ff90-4504-9c56-9237fb6f17a4")
    @Override
    public Activity getOwner() {
        return (Activity) getDepVal(ActivityNodeData.Metadata.OwnerDep());
    }

    @objid ("21473479-4890-4bf2-9b95-70e4cae16c03")
    @Override
    public void setOwner(Activity value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("794968f0-1929-43d6-bb6d-fbbef910d088")
    @Override
    public ActivityPartition getOwnerPartition() {
        return (ActivityPartition) getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
    }

    @objid ("ca16e121-9325-48ac-880d-a52d904280b1")
    @Override
    public void setOwnerPartition(ActivityPartition value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("8626ae30-ee1d-4b01-b93c-1c50450c6b66")
    @Override
    public EList<ActivityEdge> getIncoming() {
        return new SmList<>(this, ActivityNodeData.Metadata.IncomingDep());
    }

    @objid ("ce1dcecb-ce96-49e7-9fda-868ed15db761")
    @Override
    public <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f5f884af-e2e4-400d-a9c8-e90c08b4191b")
    @Override
    public Clause getOwnerClause() {
        return (Clause) getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
    }

    @objid ("4e3ca1e4-7b76-48b1-b4d8-fd5df4997045")
    @Override
    public void setOwnerClause(Clause value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), (SmObjectImpl)value);
    }

    @objid ("c07ce1f1-5e9e-4b36-b8b3-01ed346129b2")
    @Override
    public StructuredActivityNode getOwnerNode() {
        return (StructuredActivityNode) getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
    }

    @objid ("0c7d78dc-e99b-46ea-b566-7fb86fa85c73")
    @Override
    public void setOwnerNode(StructuredActivityNode value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), (SmObjectImpl)value);
    }

    @objid ("c3aaddc9-bfb6-439f-a1e9-1b7728659b87")
    @Override
    public EList<ActivityEdge> getOutgoing() {
        return new SmList<>(this, ActivityNodeData.Metadata.OutgoingDep());
    }

    @objid ("45542963-f9b4-4543-91c7-ddbf532f23be")
    @Override
    public <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityEdge element : getOutgoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("afec3864-2a99-4543-94dd-7403ccf1f722")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("80cdc3e4-9a17-484d-b883-5c6918cceef4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
        if (obj != null)
          return new SmDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c24503b9-1e56-4625-85cb-cf7f02bbecb8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityNode(this);
        else
          return null;
    }

}
