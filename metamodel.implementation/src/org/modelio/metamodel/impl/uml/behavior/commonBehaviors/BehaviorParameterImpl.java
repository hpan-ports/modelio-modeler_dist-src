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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.impl.uml.statik.ParameterImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00413f3e-c4bf-1fd8-97fe-001ec947cd2a")
public class BehaviorParameterImpl extends ParameterImpl implements BehaviorParameter {
    @objid ("721b1d56-03f8-4718-99af-07e83388c0a7")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, ((BehaviorParameterSmClass)getClassOf()).getRepresentingObjectNodeDep());
    }

    @objid ("eef1ce13-218d-4dcc-a72a-c5fa6373dc09")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ObjectNode element : getRepresentingObjectNode()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6e67af1c-8bee-4291-bbba-f35b24d9e4ff")
    @Override
    public Behavior getOwner() {
        Object obj = getDepVal(((BehaviorParameterSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Behavior)? (Behavior)obj : null;
    }

    @objid ("5883b48f-5a55-4bc7-b0f8-94e70a17f318")
    @Override
    public void setOwner(Behavior value) {
        appendDepVal(((BehaviorParameterSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("0f9cd79e-0e59-49b1-82ef-10ade3474ae4")
    @Override
    public Parameter getMapped() {
        Object obj = getDepVal(((BehaviorParameterSmClass)getClassOf()).getMappedDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("e328645b-d971-4e1f-a964-241eaee54ab7")
    @Override
    public void setMapped(Parameter value) {
        appendDepVal(((BehaviorParameterSmClass)getClassOf()).getMappedDep(), (SmObjectImpl)value);
    }

    @objid ("a81c375d-4ce0-464b-8cf3-f3c26a3d60ca")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((BehaviorParameterSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7b8668a3-d276-46b9-9df0-b0cf256d0f36")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((BehaviorParameterSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c4be6123-269f-4200-ab1a-6da996e05fe0")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehaviorParameter(this);
        else
          return null;
    }

}
