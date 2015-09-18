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
    @objid ("e68e60ce-e645-4528-9c93-569fe81a9e25")
    @Override
    public EList<TemplateParameterSubstitution> getParameterSubstitution() {
        return new SmList<>(this, TemplateBindingData.Metadata.ParameterSubstitutionDep());
    }

    @objid ("75a57352-215a-4e30-b3b3-244aaad7cfcb")
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

    @objid ("8177581c-0219-4c6b-a08e-aa95f5a59591")
    @Override
    public Operation getBoundOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.BoundOperationDep());
    }

    @objid ("70924c9c-72f9-4c63-9020-ec24b74bdc6e")
    @Override
    public void setBoundOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.BoundOperationDep(), (SmObjectImpl)value);
    }

    @objid ("dcb9d66a-1137-4ebb-a7a4-2b9a74188c14")
    @Override
    public Operation getInstanciatedTemplateOperation() {
        return (Operation) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep());
    }

    @objid ("5f04e78c-6af6-406a-b1a4-3789d44c5ca5")
    @Override
    public void setInstanciatedTemplateOperation(Operation value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateOperationDep(), (SmObjectImpl)value);
    }

    @objid ("a5ab22c4-37ce-4970-953d-ac037c63fc2b")
    @Override
    public NameSpace getInstanciatedTemplate() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep());
    }

    @objid ("042ce9d7-0a2c-4141-8ac4-18e0e7605353")
    @Override
    public void setInstanciatedTemplate(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.InstanciatedTemplateDep(), (SmObjectImpl)value);
    }

    @objid ("cc16b77c-739b-4d05-aaf8-68f03208b6ee")
    @Override
    public NameSpace getBoundElement() {
        return (NameSpace) getDepVal(TemplateBindingData.Metadata.BoundElementDep());
    }

    @objid ("d3a80bfd-1866-4ff9-be44-ec303dbe9517")
    @Override
    public void setBoundElement(NameSpace value) {
        appendDepVal(TemplateBindingData.Metadata.BoundElementDep(), (SmObjectImpl)value);
    }

    @objid ("02fb4c51-410d-4449-b028-43338d102526")
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

    @objid ("dcebd59a-93cb-45b7-9188-78a05c7d0807")
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

    @objid ("c0397b15-7690-4fad-8d1b-157309225672")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTemplateBinding(this);
        else
          return null;
    }

}
