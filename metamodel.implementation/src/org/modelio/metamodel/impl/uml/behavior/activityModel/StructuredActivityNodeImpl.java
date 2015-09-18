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
import org.modelio.metamodel.data.uml.behavior.activityModel.StructuredActivityNodeData;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("003e347e-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuredActivityNodeImpl extends ActivityActionImpl implements StructuredActivityNode {
    @objid ("22513855-8bb5-4239-935d-50586f29c3dd")
    @Override
    public boolean isMustIsolate() {
        return (Boolean) getAttVal(StructuredActivityNodeData.Metadata.MustIsolateAtt());
    }

    @objid ("cc5a85cb-1bbf-4734-ae56-af8bb3394c0a")
    @Override
    public void setMustIsolate(boolean value) {
        setAttVal(StructuredActivityNodeData.Metadata.MustIsolateAtt(), value);
    }

    @objid ("93b55822-517c-4319-b92b-d4e1516ff2af")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, StructuredActivityNodeData.Metadata.BodyDep());
    }

    @objid ("7fd5e5d4-0366-4bdd-9527-564662e7f053")
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

    @objid ("86b47240-97ee-4635-84a0-aa772c72ab77")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f93bbb03-fcf2-46f1-9d05-588418672f93")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c1f3032f-1f00-46f9-9545-9acdfbabbea4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStructuredActivityNode(this);
        else
          return null;
    }

}
