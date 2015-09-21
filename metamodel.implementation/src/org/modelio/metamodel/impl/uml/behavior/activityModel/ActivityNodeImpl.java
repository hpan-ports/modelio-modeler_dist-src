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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0028d9f8-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityNodeImpl extends ModelElementImpl implements ActivityNode {
    @objid ("186d5e0d-1108-4503-af3c-854c358a1b49")
    @Override
    public Activity getOwner() {
        Object obj = getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Activity)? (Activity)obj : null;
    }

    @objid ("42b62bd6-5be8-4e9d-87b1-d75c2913e2ff")
    @Override
    public void setOwner(Activity value) {
        appendDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("785c71be-1fb4-4833-89c9-6b250b9056a7")
    @Override
    public ActivityPartition getOwnerPartition() {
        Object obj = getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerPartitionDep());
        return (obj instanceof ActivityPartition)? (ActivityPartition)obj : null;
    }

    @objid ("947fb7a0-5a0d-4a04-b79a-505e2d808a10")
    @Override
    public void setOwnerPartition(ActivityPartition value) {
        appendDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerPartitionDep(), (SmObjectImpl)value);
    }

    @objid ("0929fc5a-bc61-44a1-91ba-4a61f3a416aa")
    @Override
    public EList<ActivityEdge> getIncoming() {
        return new SmList<>(this, ((ActivityNodeSmClass)getClassOf()).getIncomingDep());
    }

    @objid ("51ff25ea-f41e-49dd-a4b7-64eb58ecd33c")
    @Override
    public <T extends ActivityEdge> List<T> getIncoming(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityEdge element : getIncoming()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("83b16c35-57bd-45a8-87e6-cedc4f305064")
    @Override
    public Clause getOwnerClause() {
        Object obj = getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerClauseDep());
        return (obj instanceof Clause)? (Clause)obj : null;
    }

    @objid ("ea5600e2-8b7e-4bd0-b35a-c8c4551320a6")
    @Override
    public void setOwnerClause(Clause value) {
        appendDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerClauseDep(), (SmObjectImpl)value);
    }

    @objid ("16e2db02-45a7-43aa-9faa-a5d863a330f2")
    @Override
    public StructuredActivityNode getOwnerNode() {
        Object obj = getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerNodeDep());
        return (obj instanceof StructuredActivityNode)? (StructuredActivityNode)obj : null;
    }

    @objid ("f9f0d46a-d51c-41ec-9b06-90a4eda03429")
    @Override
    public void setOwnerNode(StructuredActivityNode value) {
        appendDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerNodeDep(), (SmObjectImpl)value);
    }

    @objid ("820e1779-7ffb-4ff1-ba86-6544cd19ab53")
    @Override
    public EList<ActivityEdge> getOutgoing() {
        return new SmList<>(this, ((ActivityNodeSmClass)getClassOf()).getOutgoingDep());
    }

    @objid ("c2b8d54b-1b23-41db-afce-995923d8e461")
    @Override
    public <T extends ActivityEdge> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityEdge element : getOutgoing()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb6b4350-6919-4250-9e27-00500951e047")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // OwnerPartition
        obj = (SmObjectImpl)this.getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerPartitionDep());
        if (obj != null)
          return obj;
        // OwnerClause
        obj = (SmObjectImpl)this.getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerClauseDep());
        if (obj != null)
          return obj;
        // OwnerNode
        obj = (SmObjectImpl)this.getDepVal(((ActivityNodeSmClass)getClassOf()).getOwnerNodeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d0d8351b-cefb-490d-9544-65b51aeb584d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((ActivityNodeSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerPartition
        dep = ((ActivityNodeSmClass)getClassOf()).getOwnerPartitionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerClause
        dep = ((ActivityNodeSmClass)getClassOf()).getOwnerClauseDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerNode
        dep = ((ActivityNodeSmClass)getClassOf()).getOwnerNodeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("f548cb01-b39f-495e-b52b-7386184272f9")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivityNode(this);
        else
          return null;
    }

}
