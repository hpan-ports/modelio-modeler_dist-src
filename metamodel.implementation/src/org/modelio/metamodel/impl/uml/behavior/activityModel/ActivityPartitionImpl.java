/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("002a04ae-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
    @objid ("9ac4256e-75ee-4962-9bc0-50be1e6da0a1")
    @Override
    public boolean isIsDimension() {
        return (Boolean) getAttVal(((ActivityPartitionSmClass)getClassOf()).getIsDimensionAtt());
    }

    @objid ("cb050a36-8d02-416a-ae92-9fc894b284ec")
    @Override
    public void setIsDimension(boolean value) {
        setAttVal(((ActivityPartitionSmClass)getClassOf()).getIsDimensionAtt(), value);
    }

    @objid ("6d43a7fb-dd2d-4a6d-9b38-2c9e2e64cd9b")
    @Override
    public boolean isIsExternal() {
        return (Boolean) getAttVal(((ActivityPartitionSmClass)getClassOf()).getIsExternalAtt());
    }

    @objid ("46daa258-8021-4676-be59-f16c6abb2fe9")
    @Override
    public void setIsExternal(boolean value) {
        setAttVal(((ActivityPartitionSmClass)getClassOf()).getIsExternalAtt(), value);
    }

    @objid ("0e7dbc74-e9de-491c-9237-ab64ea4b4751")
    @Override
    public ModelElement getRepresented() {
        Object obj = getDepVal(((ActivityPartitionSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof ModelElement)? (ModelElement)obj : null;
    }

    @objid ("18875326-1a65-4093-9abe-69f64f1b0cb0")
    @Override
    public void setRepresented(ModelElement value) {
        appendDepVal(((ActivityPartitionSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("2f32be0a-dfb1-4590-9cec-19a539f9eac4")
    @Override
    public EList<ActivityNode> getContainedNode() {
        return new SmList<>(this, ((ActivityPartitionSmClass)getClassOf()).getContainedNodeDep());
    }

    @objid ("20cf199e-641c-4e1d-9014-1e78b7677793")
    @Override
    public <T extends ActivityNode> List<T> getContainedNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityNode element : getContainedNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9590c560-8622-438a-97fc-36747740a767")
    @Override
    public EList<MessageFlow> getOutgoing() {
        return new SmList<>(this, ((ActivityPartitionSmClass)getClassOf()).getOutgoingDep());
    }

    @objid ("f9962edd-1f0d-4f48-9f0e-3455066a8eea")
    @Override
    public <T extends MessageFlow> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final MessageFlow element : getOutgoing()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a366e8e4-02fc-4fed-9faf-4de1a2065592")
    @Override
    public ActivityPartition getSuperPartition() {
        Object obj = getDepVal(((ActivityPartitionSmClass)getClassOf()).getSuperPartitionDep());
        return (obj instanceof ActivityPartition)? (ActivityPartition)obj : null;
    }

    @objid ("d45a3830-6546-4766-b470-dbd8b50c8268")
    @Override
    public void setSuperPartition(ActivityPartition value) {
        appendDepVal(((ActivityPartitionSmClass)getClassOf()).getSuperPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("ddc25eaa-fc6b-4e57-99d0-1413772319e8")
    @Override
    public EList<ActivityPartition> getSubPartition() {
        return new SmList<>(this, ((ActivityPartitionSmClass)getClassOf()).getSubPartitionDep());
    }

    @objid ("1c14d0c4-d6ac-45a0-bd1e-709fcfc7d49b")
    @Override
    public <T extends ActivityPartition> List<T> getSubPartition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityPartition element : getSubPartition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c65748e-26e0-46bc-9bec-5b97ece97d33")
    @Override
    public EList<MessageFlow> getIncoming() {
        return new SmList<>(this, ((ActivityPartitionSmClass)getClassOf()).getIncomingDep());
    }

    @objid ("c2284d58-3104-4adb-8bc7-76292fb4b2e5")
    @Override
    public <T extends MessageFlow> List<T> getIncoming(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final MessageFlow element : getIncoming()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5e8817cc-edc7-42f9-aade-7b81217919e2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // SuperPartition
        obj = (SmObjectImpl)this.getDepVal(((ActivityPartitionSmClass)getClassOf()).getSuperPartitionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ca6f3754-62be-424b-8556-d2ab97ceafc5")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // SuperPartition
        dep = ((ActivityPartitionSmClass)getClassOf()).getSuperPartitionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("27d9d1fc-c8cf-4589-aefa-93066d457357")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityPartition(this);
        else
          return null;
    }

}
