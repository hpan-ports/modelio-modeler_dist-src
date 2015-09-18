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
    @objid ("cd900eca-fe5f-45a1-aaaf-5a10000c68ce")
    @Override
    public boolean isIsDimension() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsDimensionAtt());
    }

    @objid ("7d8ce5fe-d66f-48a7-82ee-6ce87a455471")
    @Override
    public void setIsDimension(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsDimensionAtt(), value);
    }

    @objid ("4296d155-19a3-4d31-a792-14c41d9f0c2c")
    @Override
    public boolean isIsExternal() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsExternalAtt());
    }

    @objid ("ac9c6b26-9915-4c20-be28-ddf701a23055")
    @Override
    public void setIsExternal(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsExternalAtt(), value);
    }

    @objid ("71395f3d-6ec2-4243-8326-6f1252000b93")
    @Override
    public ModelElement getRepresented() {
        return (ModelElement) getDepVal(ActivityPartitionData.Metadata.RepresentedDep());
    }

    @objid ("da6154a7-ef7f-4463-9678-e4038a8cb173")
    @Override
    public void setRepresented(ModelElement value) {
        appendDepVal(ActivityPartitionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("7c4b7967-24c0-45fe-a9da-77017102a431")
    @Override
    public EList<ActivityNode> getContainedNode() {
        return new SmList<>(this, ActivityPartitionData.Metadata.ContainedNodeDep());
    }

    @objid ("31598f0f-284d-4071-a496-9a17f011b98f")
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

    @objid ("88767b04-ed17-4144-b546-f280b093228e")
    @Override
    public EList<MessageFlow> getOutgoing() {
        return new SmList<>(this, ActivityPartitionData.Metadata.OutgoingDep());
    }

    @objid ("7d547766-7f7b-4fed-b6b8-33ff4fef0145")
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

    @objid ("6f381b8f-0607-4b42-8f2f-076db57c26ef")
    @Override
    public ActivityPartition getSuperPartition() {
        return (ActivityPartition) getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
    }

    @objid ("4cbfaf64-a85f-4e2f-81bd-abe5d016b90c")
    @Override
    public void setSuperPartition(ActivityPartition value) {
        appendDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("741c4888-38aa-428a-96a4-403227643441")
    @Override
    public EList<ActivityPartition> getSubPartition() {
        return new SmList<>(this, ActivityPartitionData.Metadata.SubPartitionDep());
    }

    @objid ("941bc11e-50bc-45c8-823e-db4278366452")
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

    @objid ("8a64dd4a-c411-4bfa-a77a-c3c29838445d")
    @Override
    public EList<MessageFlow> getIncoming() {
        return new SmList<>(this, ActivityPartitionData.Metadata.IncomingDep());
    }

    @objid ("f137cd93-8b72-41f8-97d4-22de753e0c54")
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

    @objid ("befd85d8-4967-4e3b-ae61-4d75151f76c4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ab557f22-5ea0-453a-87d3-bd2fe69436a8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c853d8fa-7348-43ac-95cd-0b6cea8b963d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityPartition(this);
        else
          return null;
    }

}
