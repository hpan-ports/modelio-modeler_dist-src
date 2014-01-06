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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("001c7c58-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateBindingImpl extends ModelElementImpl implements TemplateBinding {
    @objid ("d7b086ab-e970-48b0-a8f5-54f3feb30d64")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateBindingData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("af3c4c30-6d2c-434b-ae19-e01c95a31ece")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getParameterSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getParameterSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6323cae6-57be-41db-a6c5-a9ad1fba7872")
    @Override
    public Operation getBoundOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
    }

    @objid ("76d4174a-0f07-4806-b364-0a53bb8bcb9d")
    @Override
    public void setBoundOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.BoundOperationDep(), (SmObjectImpl)value);
    }

    @objid ("e7847355-044d-47ef-ac11-1415b4349bc8")
    @Override
    public Operation getInstanciatedTemplateOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep());
    }

    @objid ("9b9fd390-f4bf-45eb-9dd6-572a7d3e6dc7")
    @Override
    public void setInstanciatedTemplateOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep(), (SmObjectImpl)value);
    }

    @objid ("42298af3-3ab4-4190-9f9e-4496bf31770b")
    @Override
    public NameSpace getInstanciatedTemplate() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep());
    }

    @objid ("e594b6e3-0971-48d3-98e9-60fa164a1cbc")
    @Override
    public void setInstanciatedTemplate(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep(), (SmObjectImpl)value);
    }

    @objid ("7b3fcb24-fedb-4ed0-b085-49a6909c5d33")
    @Override
    public NameSpace getBoundElement() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.BoundElementDep());
    }

    @objid ("0854fc61-e4bf-4427-971e-0647d02de3b5")
    @Override
    public void setBoundElement(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.BoundElementDep(), (SmObjectImpl)value);
    }

    @objid ("0d85c98e-71dd-4142-929f-a0ced229862c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundElementDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("62534733-ca60-46bb-9c02-7b75a3a44c70")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
        if (obj != null)
          return new SmDepVal(TemplateBindingData.Metadata.BoundOperationDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TemplateBindingData.Metadata.BoundElementDep());
        if (obj != null)
          return new SmDepVal(TemplateBindingData.Metadata.BoundElementDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("adaff86a-b032-4965-a4ea-fa2f56f3e48f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateBinding(this);
        else
          return null;
    }

}
