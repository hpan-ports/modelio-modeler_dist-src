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
    @objid ("97d2e853-294a-46b7-a2a4-a55ac6efbed9")
    @Override
    public Activity getOwner() {
        return (Activity) getDepVal(ActivityNodeData.Metadata.OwnerDep());
    }

    @objid ("fcd22870-81ca-4288-876c-13d6d49d57b7")
    @Override
    public void setOwner(Activity value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("848f1a72-6468-482d-83b6-48b17e81f52b")
    @Override
    public ActivityPartition getOwnerPartition() {
        return (ActivityPartition) getDepVal(ActivityNodeData.Metadata.OwnerPartitionDep());
    }

    @objid ("02558fc7-3164-4684-aacf-0ae17427e5e1")
    @Override
    public void setOwnerPartition(ActivityPartition value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("84180d2c-07a5-42dc-b2f7-7ca066968ec8")
    @Override
    public EList<ActivityEdge> getIncoming() {
        return new SmList<>(this, ActivityNodeData.Metadata.IncomingDep());
    }

    @objid ("caaf4b21-9858-4167-9625-92091c5b0858")
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

    @objid ("14443d23-0953-4912-b100-892bb58aead7")
    @Override
    public Clause getOwnerClause() {
        return (Clause) getDepVal(ActivityNodeData.Metadata.OwnerClauseDep());
    }

    @objid ("b2b8285e-0105-40d0-9a06-291448580048")
    @Override
    public void setOwnerClause(Clause value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerClauseDep(), (SmObjectImpl)value);
    }

    @objid ("04daa095-0be4-4ec8-9303-82c39a24ac6f")
    @Override
    public StructuredActivityNode getOwnerNode() {
        return (StructuredActivityNode) getDepVal(ActivityNodeData.Metadata.OwnerNodeDep());
    }

    @objid ("8890ab4c-9d8b-4130-8adc-db37ea44a037")
    @Override
    public void setOwnerNode(StructuredActivityNode value) {
        appendDepVal(ActivityNodeData.Metadata.OwnerNodeDep(), (SmObjectImpl)value);
    }

    @objid ("109e8636-a363-48ba-aa62-3dcdfe5bf013")
    @Override
    public EList<ActivityEdge> getOutgoing() {
        return new SmList<>(this, ActivityNodeData.Metadata.OutgoingDep());
    }

    @objid ("d3e5630d-86b1-4d16-ad17-51be220e9b6c")
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

    @objid ("0a53af8e-d7ae-4871-828a-529534961610")
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

    @objid ("75c2fefe-25b1-48ba-93ca-b03d77255369")
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

    @objid ("1af3dd43-cd23-433e-accc-85bf9f6c8362")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityNode(this);
        else
          return null;
    }

}
