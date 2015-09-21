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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0054c0ea-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class StateVertexImpl extends ModelElementImpl implements StateVertex {
    @objid ("7029f98b-bece-4269-a9c2-0c73a5902957")
    @Override
    public EList<Transition> getOutGoing() {
        return new SmList<>(this, ((StateVertexSmClass)getClassOf()).getOutGoingDep());
    }

    @objid ("a9577c31-e3cf-4a96-9978-e4e2a6e275ae")
    @Override
    public <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getOutGoing()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7b1d948f-687a-4ec4-8976-6075d64d99ec")
    @Override
    public EList<Transition> getIncoming() {
        return new SmList<>(this, ((StateVertexSmClass)getClassOf()).getIncomingDep());
    }

    @objid ("8b67b633-1469-4fed-ab39-fa157351837f")
    @Override
    public <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getIncoming()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("65198c9f-9c35-46dc-be07-fd817e32a039")
    @Override
    public Region getParent() {
        Object obj = getDepVal(((StateVertexSmClass)getClassOf()).getParentDep());
        return (obj instanceof Region)? (Region)obj : null;
    }

    @objid ("77bb665a-ba49-4118-8657-a57ce5d4d600")
    @Override
    public void setParent(Region value) {
        appendDepVal(((StateVertexSmClass)getClassOf()).getParentDep(), (SmObjectImpl)value);
    }

    @objid ("92cce006-ba71-48d4-a04f-dd19751a6845")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Parent
        obj = (SmObjectImpl)this.getDepVal(((StateVertexSmClass)getClassOf()).getParentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ae8e4b8d-9ae5-4311-a03d-680a3f115c73")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Parent
        dep = ((StateVertexSmClass)getClassOf()).getParentDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("23eb966e-e0f6-44cc-9916-c6b9b219a34a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateVertex(this);
        else
          return null;
    }

}
