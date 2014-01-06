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
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityData;
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

@objid ("00263040-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityImpl extends BehaviorImpl implements Activity {
    @objid ("15717dc6-9e1a-4acc-a004-44680277a6f4")
    @Override
    public boolean isIsSingleExecution() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsSingleExecutionAtt());
    }

    @objid ("7a490579-7dad-4d7c-9ec0-3206338c9595")
    @Override
    public void setIsSingleExecution(boolean value) {
        setAttVal(ActivityData.Metadata.IsSingleExecutionAtt(), value);
    }

    @objid ("e5ac5151-b084-413d-84b3-704207cb2d90")
    @Override
    public boolean isIsReadOnly() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsReadOnlyAtt());
    }

    @objid ("5bd06797-51b4-42e8-a659-52dd1ae54574")
    @Override
    public void setIsReadOnly(boolean value) {
        setAttVal(ActivityData.Metadata.IsReadOnlyAtt(), value);
    }

    @objid ("381c11ee-c0c4-4553-99ef-c0181f80bda9")
    @Override
    public EList<ActivityGroup> getOwnedGroup() {
        return new SmList<>(this, ActivityData.Metadata.OwnedGroupDep());
    }

    @objid ("87dc9081-1163-4974-b626-80a04f74491e")
    @Override
    public <T extends ActivityGroup> List<T> getOwnedGroup(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityGroup element : getOwnedGroup()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ac9c4069-05ac-41d5-b70b-71f31502c441")
    @Override
    public EList<ActivityNode> getOwnedNode() {
        return new SmList<>(this, ActivityData.Metadata.OwnedNodeDep());
    }

    @objid ("a6d051da-a315-4a19-be05-8984868967cb")
    @Override
    public <T extends ActivityNode> List<T> getOwnedNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getOwnedNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8d8d311b-2b71-44ce-b1e2-62aa05f80a8d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d10b39f5-b3ee-40d0-a68b-5ba6167d774f")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("708a8914-6a35-4760-9979-4b2b583e10a5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivity(this);
        else
          return null;
    }

}
