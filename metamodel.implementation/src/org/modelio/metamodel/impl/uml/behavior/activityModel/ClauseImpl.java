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
    @objid ("56c977fc-218d-4929-96f1-84d97afa1cfb")
    @Override
    public String getTest() {
        return (String) getAttVal(ClauseData.Metadata.TestAtt());
    }

    @objid ("b618e533-3402-49a8-9a1d-7d60fc43af3a")
    @Override
    public void setTest(String value) {
        setAttVal(ClauseData.Metadata.TestAtt(), value);
    }

    @objid ("5d28149c-e143-4d4e-9020-c1f15746522e")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, ClauseData.Metadata.BodyDep());
    }

    @objid ("551fe983-940a-4071-86b1-ddfc7cbcb024")
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

    @objid ("db1985d0-2946-43c6-945e-daad54dc0d3e")
    @Override
    public ConditionalNode getOwner() {
        return (ConditionalNode) getDepVal(ClauseData.Metadata.OwnerDep());
    }

    @objid ("90fcddfa-1bb4-41fd-8fa0-9f3b2ba877ba")
    @Override
    public void setOwner(ConditionalNode value) {
        appendDepVal(ClauseData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e5f3b422-00f0-44ec-9b1a-216b6d444306")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0b8cc98f-23bf-44d0-a6f9-2943e5f28c3d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ClauseData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ClauseData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b3fdd9a8-7e21-4b7f-9194-6e76f29ca7cb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClause(this);
        else
          return null;
    }

}
