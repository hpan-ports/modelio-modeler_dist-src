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
    @objid ("dded3f48-872a-45e6-b647-d09b2c5f7752")
    @Override
    public boolean isIsDimension() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsDimensionAtt());
    }

    @objid ("38d35691-e728-4847-ac81-311937f46bf6")
    @Override
    public void setIsDimension(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsDimensionAtt(), value);
    }

    @objid ("ba439d12-e14c-42c1-afe6-904a525eda5d")
    @Override
    public boolean isIsExternal() {
        return (Boolean) getAttVal(ActivityPartitionData.Metadata.IsExternalAtt());
    }

    @objid ("729e9ef7-7872-423e-ad3c-0a7d84502285")
    @Override
    public void setIsExternal(boolean value) {
        setAttVal(ActivityPartitionData.Metadata.IsExternalAtt(), value);
    }

    @objid ("586e0778-a3b7-4b68-955c-be919129a057")
    @Override
    public ModelElement getRepresented() {
        return (ModelElement) getDepVal(ActivityPartitionData.Metadata.RepresentedDep());
    }

    @objid ("a8390973-a12c-4a8b-b0bd-3764b1eec6e1")
    @Override
    public void setRepresented(ModelElement value) {
        appendDepVal(ActivityPartitionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("06fdb430-df8c-4685-86da-3328fcc50452")
    @Override
    public EList<ActivityNode> getContainedNode() {
        return new SmList<>(this, ActivityPartitionData.Metadata.ContainedNodeDep());
    }

    @objid ("5c381030-aeac-4178-bdf4-ab2fcecb8fa4")
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

    @objid ("5ed5bc5c-3fde-47cf-b476-61166e3af13e")
    @Override
    public EList<MessageFlow> getOutgoing() {
        return new SmList<>(this, ActivityPartitionData.Metadata.OutgoingDep());
    }

    @objid ("ab66e10b-eed9-45a9-af98-6d8e6b2c9121")
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

    @objid ("e3a603fb-01ec-450b-9cfe-cace8322e282")
    @Override
    public ActivityPartition getSuperPartition() {
        return (ActivityPartition) getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
    }

    @objid ("1cec61bc-5727-479b-9531-0b72f596d75e")
    @Override
    public void setSuperPartition(ActivityPartition value) {
        appendDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("a7699610-e9ee-4be7-bf4a-15a80e1b94f8")
    @Override
    public EList<ActivityPartition> getSubPartition() {
        return new SmList<>(this, ActivityPartitionData.Metadata.SubPartitionDep());
    }

    @objid ("c655a0cf-3244-495a-9658-e22378254927")
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

    @objid ("cc3ed22d-e794-46d6-a871-f615a0754f65")
    @Override
    public EList<MessageFlow> getIncoming() {
        return new SmList<>(this, ActivityPartitionData.Metadata.IncomingDep());
    }

    @objid ("a5f84531-38fb-4d60-86aa-15df49c650dd")
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

    @objid ("c9fbe3d6-9c64-459e-bebc-f628b67379b6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c18c6c94-8edf-4560-8418-790760a5e76f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ActivityPartitionData.Metadata.SuperPartitionDep());
        if (obj != null)
          return new SmDepVal(ActivityPartitionData.Metadata.SuperPartitionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("168fb870-86f6-485b-ab56-005f8e3584b0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityPartition(this);
        else
          return null;
    }

}
