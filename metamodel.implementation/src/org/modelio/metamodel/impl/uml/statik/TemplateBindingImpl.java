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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingData;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001c7c58-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateBindingImpl extends ModelElementImpl implements TemplateBinding {
    @objid ("38dc769d-7ee1-4103-beb4-6d674a7fce2c")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, ((TemplateBindingSmClass)getClassOf()).getParameterSubstitutionDep());
    }

    @objid ("3199dc71-a9f7-4393-b64e-80984435dab2")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c7a3740-7b27-428f-afc8-571de87a5103")
    @Override
    public Operation getBoundOperation() {
        Object obj = getDepVal(((TemplateBindingSmClass)getClassOf()).getBoundOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("0ce4e10d-5732-4185-96f3-d9f8bae4993b")
    @Override
    public void setBoundOperation(Operation value) {
        appendDepVal(((TemplateBindingSmClass)getClassOf()).getBoundOperationDep(), (SmObjectImpl)value);
    }

    @objid ("6a388481-40db-4730-8e8c-39fb270f4690")
    @Override
    public Operation getInstanciatedTemplateOperation() {
        Object obj = getDepVal(((TemplateBindingSmClass)getClassOf()).getInstanciatedTemplateOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("2f2da4a3-c318-4ed8-96d2-db6af436522b")
    @Override
    public void setInstanciatedTemplateOperation(Operation value) {
        appendDepVal(((TemplateBindingSmClass)getClassOf()).getInstanciatedTemplateOperationDep(), (SmObjectImpl)value);
    }

    @objid ("aed2ce84-b758-489a-b159-52c2168a6433")
    @Override
    public NameSpace getInstanciatedTemplate() {
        Object obj = getDepVal(((TemplateBindingSmClass)getClassOf()).getInstanciatedTemplateDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("2a54356a-0bd9-4aec-8cdf-b1e400743d50")
    @Override
    public void setInstanciatedTemplate(NameSpace value) {
        appendDepVal(((TemplateBindingSmClass)getClassOf()).getInstanciatedTemplateDep(), (SmObjectImpl)value);
    }

    @objid ("42aef131-665a-4501-96ac-7459a6b78020")
    @Override
    public NameSpace getBoundElement() {
        Object obj = getDepVal(((TemplateBindingSmClass)getClassOf()).getBoundElementDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("06d274b7-b067-4eec-8719-54327282c445")
    @Override
    public void setBoundElement(NameSpace value) {
        appendDepVal(((TemplateBindingSmClass)getClassOf()).getBoundElementDep(), (SmObjectImpl)value);
    }

    @objid ("6081e2c4-a5fc-41fe-afcd-4b6e43f995a0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // BoundOperation
        obj = (SmObjectImpl)this.getDepVal(((TemplateBindingSmClass)getClassOf()).getBoundOperationDep());
        if (obj != null)
          return obj;
        // BoundElement
        obj = (SmObjectImpl)this.getDepVal(((TemplateBindingSmClass)getClassOf()).getBoundElementDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fa1b89f0-4803-4a7d-bc52-4d12d5e56817")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // BoundOperation
        dep = ((TemplateBindingSmClass)getClassOf()).getBoundOperationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // BoundElement
        dep = ((TemplateBindingSmClass)getClassOf()).getBoundElementDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c616ec4e-a068-47ae-b435-5ea5cb2bc800")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateBinding(this);
        else
          return null;
    }

}
