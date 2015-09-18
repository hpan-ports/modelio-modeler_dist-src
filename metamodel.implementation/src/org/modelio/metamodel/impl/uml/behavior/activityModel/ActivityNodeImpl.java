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
    @objid ("751693a1-e768-4885-b5db-b1f007b14a08")
    @Override
    public Activity getOwner() {
        return (Activity) getDepVal(ActivityNodeData.Metadata.OwnerDep());
    }

    @objid ("06ffc8f4-a158-47e4-afce-4120c3c9b540")
    @Override
    public void setOwner(Activity value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7edb193f-f4aa-4d69-a005-6fa15b18f76e")
    @Override
    public ActivityPartition getOwnerPartition() {
        return (ActivityPartition) getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
    }

    @objid ("2b35ca51-7258-40c6-b488-8ecf8a6a4ae7")
    @Override
    public void setOwnerPartition(ActivityPartition value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("14a79606-002e-47c8-9d52-477854d20d8b")
    @Override
    public EList<ActivityEdge> getIncoming() {
        return new SmList<>(this, ActivityNodeData.Metadata.IncomingDep());
    }

    @objid ("71fe1b7e-83fc-408e-b6cc-06a1f4efd71b")
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

    @objid ("4ce481d8-6521-4b01-999c-9f7ba7663bec")
    @Override
    public Clause getOwnerClause() {
        return (Clause) getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
    }

    @objid ("61938d6d-e970-42a6-90df-35adcf3d9a34")
    @Override
    public void setOwnerClause(Clause value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), (SmObjectImpl)value);
    }

    @objid ("8608f2bb-f864-4330-9021-e8af25f77fc3")
    @Override
    public StructuredActivityNode getOwnerNode() {
        return (StructuredActivityNode) getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
    }

    @objid ("d978f257-bd32-4381-8ee5-441ffdadff3c")
    @Override
    public void setOwnerNode(StructuredActivityNode value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), (SmObjectImpl)value);
    }

    @objid ("562e15a1-ba82-4656-9089-e819dc4edd4c")
    @Override
    public EList<ActivityEdge> getOutgoing() {
        return new SmList<>(this, ActivityNodeData.Metadata.OutgoingDep());
    }

    @objid ("c6bd6aec-71b0-4f5a-9544-c7712f3a2ee6")
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

    @objid ("9ce09ccd-f220-4033-9505-4595e68d3816")
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

    @objid ("b4da25c0-3097-4f65-a022-1d78651d4272")
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

    @objid ("d80cf6c2-de1f-4ba8-8116-6a4b922f9613")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityNode(this);
        else
          return null;
    }

}
