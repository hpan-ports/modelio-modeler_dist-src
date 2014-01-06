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
    @objid ("933641ea-7b99-454e-8d57-6d999c191645")
    @Override
    public ModelElement getAnnoted() {
        return (ModelElement) getDepVal(TaggedValueData.Metadata.AnnotedDep());
    }

    @objid ("9de18f91-6c82-4db8-b422-deafcf960d94")
    @Override
    public void setAnnoted(ModelElement value) {
        appendDepVal(TaggedValueData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("42fbffad-fdc2-431c-aac1-1db7f3839b4d")
    @Override
    public EList<TagParameter> getActual() {
        return new SmList<>(this, TaggedValueData.Metadata.ActualDep());
    }

    @objid ("4c668516-7ce9-43e5-ae92-f878061a2b19")
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

    @objid ("7cdf4b01-f2c4-4704-8033-6ff969f82698")
    @Override
    public TagParameter getQualifier() {
        return (TagParameter) getDepVal(TaggedValueData.Metadata.QualifierDep());
    }

    @objid ("4b81b07e-9fe3-4185-946c-f24653bb4b72")
    @Override
    public void setQualifier(TagParameter value) {
        appendDepVal(TaggedValueData.Metadata.QualifierDep(), (SmObjectImpl)value);
    }

    @objid ("4d8a02b1-9055-42d2-975d-95572fa9fd4c")
    @Override
    public TagType getDefinition() {
        return (TagType) getDepVal(TaggedValueData.Metadata.DefinitionDep());
    }

    @objid ("bcce3676-1773-400f-80e0-4fb5c940b851")
    @Override
    public void setDefinition(TagType value) {
        appendDepVal(TaggedValueData.Metadata.DefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("39f4e5ee-04f1-4ce2-a3a8-44bc67ae8464")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("419cc132-c04b-4b71-aa9e-85b3a14a3689")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TaggedValueData.Metadata.AnnotedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5383c920-c906-4b24-9c8b-c74a80c2dda5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTaggedValue(this);
        else
          return null;
    }

}
