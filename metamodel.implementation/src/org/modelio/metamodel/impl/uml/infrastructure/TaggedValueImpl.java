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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00903bfc-c4be-1fd8-97fe-001ec947cd2a")
public class TaggedValueImpl extends ModelElementImpl implements TaggedValue {
    @objid ("bfcb61b7-0f21-402f-957f-6e7b402adfee")
    @Override
    public ModelElement getAnnoted() {
        return (ModelElement) getDepVal(TaggedValueData.Metadata.AnnotedDep());
    }

    @objid ("761de4af-420c-4126-9d39-ad3e65a72651")
    @Override
    public void setAnnoted(ModelElement value) {
        appendDepVal(TaggedValueData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("bcb5757d-d225-4f3b-bf82-5feb3c2311ca")
    @Override
    public EList<TagParameter> getActual() {
        return new SmList<>(this, TaggedValueData.Metadata.ActualDep());
    }

    @objid ("ebe9600e-e64d-43b5-a414-c483e52525d9")
    @Override
    public <T extends TagParameter> List<T> getActual(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TagParameter element : getActual()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("55a681d9-c7eb-4816-8504-cd4372e4fad3")
    @Override
    public TagParameter getQualifier() {
        return (TagParameter) getDepVal(TaggedValueData.Metadata.QualifierDep());
    }

    @objid ("36da9af3-c262-4295-b80c-0bb334523687")
    @Override
    public void setQualifier(TagParameter value) {
        appendDepVal(TaggedValueData.Metadata.QualifierDep(), (SmObjectImpl)value);
    }

    @objid ("de12da73-816a-4948-8ecc-d8d7491d22e7")
    @Override
    public TagType getDefinition() {
        return (TagType) getDepVal(TaggedValueData.Metadata.DefinitionDep());
    }

    @objid ("6cbcf98e-0704-44c9-bcf8-3e11449251d0")
    @Override
    public void setDefinition(TagType value) {
        appendDepVal(TaggedValueData.Metadata.DefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("0a1bbd13-9d0a-4c55-9cc6-bd0046d2e9ac")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c960a9a5-1e50-4f3e-a997-166d051791ae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TaggedValueData.Metadata.AnnotedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("38502a01-3f0d-43f3-947e-43dfd776b060")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTaggedValue(this);
        else
          return null;
    }

}
