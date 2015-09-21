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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00263040-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityImpl extends BehaviorImpl implements Activity {
    @objid ("80211946-0de7-4b82-b424-6d0e6362f8a2")
    @Override
    public boolean isIsSingleExecution() {
        return (Boolean) getAttVal(((ActivitySmClass)getClassOf()).getIsSingleExecutionAtt());
    }

    @objid ("b3fdbfa4-d794-4537-bf42-95b7e0c6fd66")
    @Override
    public void setIsSingleExecution(boolean value) {
        setAttVal(((ActivitySmClass)getClassOf()).getIsSingleExecutionAtt(), value);
    }

    @objid ("d34ce69b-4a96-4f90-a841-75542de5fc90")
    @Override
    public boolean isIsReadOnly() {
        return (Boolean) getAttVal(((ActivitySmClass)getClassOf()).getIsReadOnlyAtt());
    }

    @objid ("ed931239-1ef0-40c2-a30b-fb0e309a38a5")
    @Override
    public void setIsReadOnly(boolean value) {
        setAttVal(((ActivitySmClass)getClassOf()).getIsReadOnlyAtt(), value);
    }

    @objid ("a2c99d3c-2ae2-48e3-9091-f7daa9328866")
    @Override
    public EList<ActivityGroup> getOwnedGroup() {
        return new SmList<>(this, ((ActivitySmClass)getClassOf()).getOwnedGroupDep());
    }

    @objid ("7599f3f7-4bea-421d-96ae-5b97255d68d2")
    @Override
    public <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityGroup element : getOwnedGroup()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("115c2d88-a506-476c-9319-112e0f665fa7")
    @Override
    public EList<ActivityNode> getOwnedNode() {
        return new SmList<>(this, ((ActivitySmClass)getClassOf()).getOwnedNodeDep());
    }

    @objid ("0bf115d2-a45e-4647-a213-90bb76062d9d")
    @Override
    public <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityNode element : getOwnedNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7277c6f3-4b62-427e-9ebe-b9ea29b54de3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("27ff57ad-4427-47e4-88f7-b7af5509f241")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("e8cfcabd-4d57-403e-8092-335749720aa5")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivity(this);
        else
          return null;
    }

}
