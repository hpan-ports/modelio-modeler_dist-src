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
    @objid ("f4931a0c-512f-4deb-9549-4ee1de07231f")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateBindingData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("d394245a-8a25-4759-ae42-ffc2c5ef4176")
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

    @objid ("2166dc38-53ea-45b1-a669-4d7bd7e5f548")
    @Override
    public Operation getBoundOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
    }

    @objid ("2c1a59bd-c325-4045-b6b4-f8afc3e4add6")
    @Override
    public void setBoundOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.BoundOperationDep(), (SmObjectImpl)value);
    }

    @objid ("38f7a41f-424a-4e88-b719-a50734a139f0")
    @Override
    public Operation getInstanciatedTemplateOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep());
    }

    @objid ("c1b804ad-d913-4dea-8b99-716b08bf4172")
    @Override
    public void setInstanciatedTemplateOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep(), (SmObjectImpl)value);
    }

    @objid ("62724d33-664a-42b7-8c0b-a0104874b1fa")
    @Override
    public NameSpace getInstanciatedTemplate() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep());
    }

    @objid ("8298dfe3-c7d5-41cb-a8b6-8c5afe1e3187")
    @Override
    public void setInstanciatedTemplate(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep(), (SmObjectImpl)value);
    }

    @objid ("8868a918-db3f-446a-bd96-36f4d876f6ae")
    @Override
    public NameSpace getBoundElement() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.BoundElementDep());
    }

    @objid ("840d5ed3-39e7-4c2e-a9ec-9caf468fcd91")
    @Override
    public void setBoundElement(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.BoundElementDep(), (SmObjectImpl)value);
    }

    @objid ("2f1efa35-f8b8-4bf1-a17c-d457a4001782")
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

    @objid ("192be2b7-7533-447d-aa68-cc42a3887364")
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

    @objid ("ee430982-edc0-4b41-bd32-fc86addc1140")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateBinding(this);
        else
          return null;
    }

}
