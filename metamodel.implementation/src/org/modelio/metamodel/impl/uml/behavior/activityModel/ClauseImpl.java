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
    @objid ("ca990fa3-934a-4ed2-8fa9-bd71fe89f437")
    @Override
    public String getTest() {
        return (String) getAttVal(ClauseData.Metadata.TestAtt());
    }

    @objid ("b2d74e34-78fe-4937-bb3f-fef833d75c77")
    @Override
    public void setTest(String value) {
        setAttVal(ClauseData.Metadata.TestAtt(), value);
    }

    @objid ("6bf4c483-0dc2-4e53-bd14-ca5bf1f91feb")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, ClauseData.Metadata.BodyDep());
    }

    @objid ("115b5b84-f9c9-4d56-972d-56274fb1f365")
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

    @objid ("9420b7ae-79c0-4913-b9fe-c47a52394c15")
    @Override
    public ConditionalNode getOwner() {
        return (ConditionalNode) getDepVal(ClauseData.Metadata.OwnerDep());
    }

    @objid ("bc74048c-1f5c-43bb-88c9-44c5c8b29e7b")
    @Override
    public void setOwner(ConditionalNode value) {
        appendDepVal(ClauseData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("8c3f7a3c-1167-40d5-8801-4c1b89636324")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a8ff8ecb-eac3-419c-b6c6-bb46aa77d1c2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ClauseData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8677b1b2-b536-4412-9d70-c3a284960cf6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClause(this);
        else
          return null;
    }

}
