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
import org.modelio.metamodel.impl.uml.behavior.activityModel.ClauseData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("002cec14-c4bf-1fd8-97fe-001ec947cd2a")
public class ClauseImpl extends ModelElementImpl implements Clause {
    @objid ("f8b9cd8c-cb70-415d-9872-592de1385ac6")
    @Override
    public String getTest() {
        return (String) getAttVal(((ClauseSmClass)getClassOf()).getTestAtt());
    }

    @objid ("c968bb43-90d4-4003-b1d4-9319a0b9003a")
    @Override
    public void setTest(String value) {
        setAttVal(((ClauseSmClass)getClassOf()).getTestAtt(), value);
    }

    @objid ("6aa0fd06-2220-4ac3-9dba-a53c5c1ada11")
    @Override
    public EList<ActivityNode> getBody() {
        return new SmList<>(this, ((ClauseSmClass)getClassOf()).getBodyDep());
    }

    @objid ("f60407c8-fc16-4557-865d-80460bd3c758")
    @Override
    public <T extends ActivityNode> List<T> getBody(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityNode element : getBody()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("257a3220-bcdf-42ab-aae6-4e1a4f54db03")
    @Override
    public ConditionalNode getOwner() {
        Object obj = getDepVal(((ClauseSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof ConditionalNode)? (ConditionalNode)obj : null;
    }

    @objid ("2ad944aa-d13e-487a-bcf0-2721655f9eb8")
    @Override
    public void setOwner(ConditionalNode value) {
        appendDepVal(((ClauseSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("c063e82d-876c-459c-9ed6-8b7c83988751")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((ClauseSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("98cb7b34-876d-4a5a-8ed4-1ea33ccbc914")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((ClauseSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("3e5066c7-4b01-4c52-82bb-54c72f300476")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitClause(this);
        else
          return null;
    }

}
