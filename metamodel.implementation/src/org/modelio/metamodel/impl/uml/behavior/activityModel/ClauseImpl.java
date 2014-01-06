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
import org.modelio.metamodel.data.uml.behavior.activityModel.ClauseData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("002cec14-c4bf-1fd8-97fe-001ec947cd2a")
public class ClauseImpl extends ModelElementImpl implements Clause {
    @objid ("eec59412-cf28-4b7a-8272-38908c474303")
    @Override
    public String getTest() {
        return (String) getAttVal(ClauseData.Metadata.TestAtt());
    }

    @objid ("2fe7b4d6-201f-46f1-9b6c-121477c0f791")
    @Override
    public void setTest(String value) {
        setAttVal(ClauseData.Metadata.TestAtt(), value);
    }

    @objid ("37d7efb6-981f-4ea1-a2e6-44a23222cadc")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, ClauseData.Metadata.BodyDep());
    }

    @objid ("49e3daad-fc04-4fb4-8b41-83b866d1da4c")
    @Override
    public <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityNode element : getBody()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8c7c706-d61b-4fd9-abb3-518db3375c03")
    @Override
    public ConditionalNode getOwner() {
        return (ConditionalNode) getDepVal(ClauseData.Metadata.OwnerDep());
    }

    @objid ("2eaa62b6-99a1-4f8a-9423-d56723c037d1")
    @Override
    public void setOwner(ConditionalNode value) {
        appendDepVal(ClauseData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("f8b8817b-5d22-43cf-ac59-f9c756a01aa5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("17318410-35d0-4df1-ae31-378064bd3dda")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ClauseData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0c05ee0f-9102-4656-a2e8-3aa42dabda19")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClause(this);
        else
          return null;
    }

}
