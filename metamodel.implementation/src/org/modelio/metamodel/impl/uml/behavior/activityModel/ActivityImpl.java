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
    @objid ("8c6fe29f-6f9d-4570-b8bd-06a334cc3b3a")
    @Override
    public boolean isIsSingleExecution() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsSingleExecutionAtt());
    }

    @objid ("464bf001-f50d-454e-9e8f-097f712a66b6")
    @Override
    public void setIsSingleExecution(boolean value) {
        setAttVal(ActivityData.Metadata.IsSingleExecutionAtt(), value);
    }

    @objid ("525d653d-4769-4f4b-9f42-29990bb43a4d")
    @Override
    public boolean isIsReadOnly() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsReadOnlyAtt());
    }

    @objid ("2fc3b796-feb8-4a35-b8e0-9741d831e50e")
    @Override
    public void setIsReadOnly(boolean value) {
        setAttVal(ActivityData.Metadata.IsReadOnlyAtt(), value);
    }

    @objid ("d3399322-d415-4ec4-97d9-883e20a0a534")
    @Override
    public EList<ActivityGroup> getOwnedGroup() {
        return new SmList<>(this, ActivityData.Metadata.OwnedGroupDep());
    }

    @objid ("a1518986-cda5-442d-a23c-63590b3d81a5")
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

    @objid ("0276620a-cafe-40fc-9fdc-85428d119ff5")
    @Override
    public EList<ActivityNode> getOwnedNode() {
        return new SmList<>(this, ActivityData.Metadata.OwnedNodeDep());
    }

    @objid ("662092f0-8bc4-400c-86ad-87635c85c2a6")
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

    @objid ("3fbbcf06-1ac9-46ff-b02c-c62caae9528d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2e54184c-a512-4b53-bff9-0f77295b1666")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("575f0097-9317-4fdf-942e-9c3fd2d0b8da")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivity(this);
        else
          return null;
    }

}
