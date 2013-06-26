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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002a04ae-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
    @objid ("2acb2b4a-d3fa-4cda-bb78-d1496a68a45b")
    @Override
    public boolean isIsDimension() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsDimensionAtt());
    }

    @objid ("444ea978-e462-4258-9c2e-07760b1263ad")
    @Override
    public void setIsDimension(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsDimensionAtt(), value);
    }

    @objid ("83d5d9db-749b-49e2-aace-14e2724dfce5")
    @Override
    public boolean isIsExternal() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsExternalAtt());
    }

    @objid ("62dec616-70eb-464b-b703-dd3e6e58b395")
    @Override
    public void setIsExternal(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsExternalAtt(), value);
    }

    @objid ("8fd4be62-8109-4dcd-8710-3cc9e14429e7")
    @Override
    public ModelElement getRepresented() {
        return (ModelElement) getDepVal(ActivityPartitionData.Metadata.RepresentedDep());
    }

    @objid ("351acc85-dcf4-4b2d-a85d-4739c6bf08ed")
    @Override
    public void setRepresented(ModelElement value) {
        appendDepVal(ActivityPartitionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("28a2e5d6-dc7c-437f-88ad-5ce63c2b3dcc")
    @Override
    public EList<ActivityNode> getContainedNode() {
        return new SmList<>(this, ActivityPartitionData.Metadata.ContainedNodeDep());
    }

    @objid ("65a01455-1087-4c34-a851-e813ff90790a")
    @Override
    public <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getContainedNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8b31afff-015c-4106-9782-f026b4aae1f6")
    @Override
    public EList<MessageFlow> getOutgoing() {
        return new SmList<>(this, ActivityPartitionData.Metadata.OutgoingDep());
    }

    @objid ("cc7d4e60-4007-4558-8d5f-841755ca6866")
    @Override
    public <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MessageFlow element : getOutgoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0d7387fb-16f8-4038-848b-b4e9f2bce7b2")
    @Override
    public ActivityPartition getSuperPartition() {
        return (ActivityPartition) getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
    }

    @objid ("019968e5-25c8-4253-803b-9933c3a99132")
    @Override
    public void setSuperPartition(ActivityPartition value) {
        appendDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("09351499-ab67-452c-b7d2-c3c7e3e5d1f2")
    @Override
    public EList<ActivityPartition> getSubPartition() {
        return new SmList<>(this, ActivityPartitionData.Metadata.SubPartitionDep());
    }

    @objid ("fdc8b13b-5f6e-4683-be8c-8638a914cc82")
    @Override
    public <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityPartition element : getSubPartition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8e36084-0741-4312-b589-7ec75004eb24")
    @Override
    public EList<MessageFlow> getIncoming() {
        return new SmList<>(this, ActivityPartitionData.Metadata.IncomingDep());
    }

    @objid ("fb725316-f35a-4ca2-bf06-30f2a284a9bc")
    @Override
    public <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MessageFlow element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6f761a00-ff06-4773-ae4f-ce903383b2bf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("503dc83e-6b61-41dd-9305-4d1ca14aac39")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("473e353d-6390-4050-a179-7ae22da2e71b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityPartition(this);
        else
          return null;
    }

}
