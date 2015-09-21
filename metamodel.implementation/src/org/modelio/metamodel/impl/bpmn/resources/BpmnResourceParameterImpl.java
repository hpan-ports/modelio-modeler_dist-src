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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000a1464-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterImpl extends BpmnBaseElementImpl implements BpmnResourceParameter {
    @objid ("7d416a74-b1b6-4b33-ab48-e64308dc0bfe")
    @Override
    public boolean isIsRequired() {
        return (Boolean) getAttVal(((BpmnResourceParameterSmClass)getClassOf()).getIsRequiredAtt());
    }

    @objid ("26311374-af90-4604-a592-825debcba445")
    @Override
    public void setIsRequired(boolean value) {
        setAttVal(((BpmnResourceParameterSmClass)getClassOf()).getIsRequiredAtt(), value);
    }

    @objid ("fb4e2c4c-7cd1-41d3-84c9-e724dd8b2637")
    @Override
    public BpmnResource getResource() {
        Object obj = getDepVal(((BpmnResourceParameterSmClass)getClassOf()).getResourceDep());
        return (obj instanceof BpmnResource)? (BpmnResource)obj : null;
    }

    @objid ("abf124c7-9e8a-4629-a8cd-65bfb08b6c92")
    @Override
    public void setResource(BpmnResource value) {
        appendDepVal(((BpmnResourceParameterSmClass)getClassOf()).getResourceDep(), (SmObjectImpl)value);
    }

    @objid ("b388ca49-1efa-4fc0-ada5-130cfc939a1a")
    @Override
    public BpmnItemDefinition getType() {
        Object obj = getDepVal(((BpmnResourceParameterSmClass)getClassOf()).getTypeDep());
        return (obj instanceof BpmnItemDefinition)? (BpmnItemDefinition)obj : null;
    }

    @objid ("df297098-9d57-4b62-98a9-b83e1d97706e")
    @Override
    public void setType(BpmnItemDefinition value) {
        appendDepVal(((BpmnResourceParameterSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("2d404e71-c1af-4605-a2f4-92adf44642dd")
    @Override
    public EList<BpmnResourceParameterBinding> getParameterBindingRefs() {
        return new SmList<>(this, ((BpmnResourceParameterSmClass)getClassOf()).getParameterBindingRefsDep());
    }

    @objid ("d5d4b892-ad82-4f55-aa83-a85dc8c92687")
    @Override
    public <T extends BpmnResourceParameterBinding> List<T> getParameterBindingRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnResourceParameterBinding element : getParameterBindingRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("32dd22ed-9e2e-4a35-a546-be2d35883c2c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Resource
        obj = (SmObjectImpl)this.getDepVal(((BpmnResourceParameterSmClass)getClassOf()).getResourceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5aa8e604-370c-482d-9134-b8dafeaf3210")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Resource
        dep = ((BpmnResourceParameterSmClass)getClassOf()).getResourceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("4b6637ee-9ac6-451d-85cf-424d25925435")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnResourceParameter(this);
        else
          return null;
    }

}
