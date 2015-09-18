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
    @objid ("1d3b4dc5-a84b-4522-ad9c-e2d9c77e5385")
    @Override
    public boolean isIsSingleExecution() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsSingleExecutionAtt());
    }

    @objid ("531bf044-9b12-41e8-8060-a7e9fea529ca")
    @Override
    public void setIsSingleExecution(boolean value) {
        setAttVal(ActivityData.Metadata.IsSingleExecutionAtt(), value);
    }

    @objid ("bd918676-3e6f-4000-adbd-624368e783d4")
    @Override
    public boolean isIsReadOnly() {
        return (Boolean) getAttVal(ActivityData.Metadata.IsReadOnlyAtt());
    }

    @objid ("e6488c7f-b8f8-423c-939d-ab218b1f17c4")
    @Override
    public void setIsReadOnly(boolean value) {
        setAttVal(ActivityData.Metadata.IsReadOnlyAtt(), value);
    }

    @objid ("49d4668e-bc82-4c5d-b926-4f160aa43072")
    @Override
    public EList<ActivityGroup> getOwnedGroup() {
        return new SmList<>(this, ActivityData.Metadata.OwnedGroupDep());
    }

    @objid ("63329d59-655a-489f-a0f5-41583a550e30")
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

    @objid ("9a2debc3-e5f6-40bc-b662-eb6d5a900543")
    @Override
    public EList<ActivityNode> getOwnedNode() {
        return new SmList<>(this, ActivityData.Metadata.OwnedNodeDep());
    }

    @objid ("83c8af5e-30cc-446d-97f1-863374c00da2")
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

    @objid ("da010570-3aa6-4f76-86eb-c8aa263b0e55")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2dcc07eb-3b10-4723-8dce-f8560ae51689")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("83886185-a713-407f-ad56-da1421f7b47a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitActivity(this);
        else
          return null;
    }

}
