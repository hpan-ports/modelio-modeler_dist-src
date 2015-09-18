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
    @objid ("adbef968-1748-42fc-adfb-47a6b9f0585e")
    @Override
    public ModelElement getAnnoted() {
        return (ModelElement) getDepVal(TaggedValueData.Metadata.AnnotedDep());
    }

    @objid ("6a4017bd-9def-45e9-86ee-c5bb72a356c0")
    @Override
    public void setAnnoted(ModelElement value) {
        appendDepVal(TaggedValueData.Metadata.AnnotedDep(), (SmObjectImpl)value);
    }

    @objid ("f7ae5b64-92df-4e11-83b6-92411636361e")
    @Override
    public EList<TagParameter> getActual() {
        return new SmList<>(this, TaggedValueData.Metadata.ActualDep());
    }

    @objid ("85772064-f75b-4e9c-868f-466d5f17c78b")
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

    @objid ("63f20f34-8d8b-49c1-9338-ebf361da8a6b")
    @Override
    public TagParameter getQualifier() {
        return (TagParameter) getDepVal(TaggedValueData.Metadata.QualifierDep());
    }

    @objid ("e4f2ba8d-11b2-4b85-a2f1-794a479a0b83")
    @Override
    public void setQualifier(TagParameter value) {
        appendDepVal(TaggedValueData.Metadata.QualifierDep(), (SmObjectImpl)value);
    }

    @objid ("3737e3e1-30e8-42bd-b144-f7deb1f9a877")
    @Override
    public TagType getDefinition() {
        return (TagType) getDepVal(TaggedValueData.Metadata.DefinitionDep());
    }

    @objid ("b610b651-5097-428e-a7d5-d99f6b5de9ab")
    @Override
    public void setDefinition(TagType value) {
        appendDepVal(TaggedValueData.Metadata.DefinitionDep(), (SmObjectImpl)value);
    }

    @objid ("e99eb34f-edf2-4740-ab8f-2f4f5bce36e6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("10bd9eea-9cb2-4ce8-bd14-856c6d6e36b2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TaggedValueData.Metadata.AnnotedDep());
        if (obj != null)
          return new SmDepVal(TaggedValueData.Metadata.AnnotedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("47ad8362-4f11-4d80-a731-c0b298f8cfb9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTaggedValue(this);
        else
          return null;
    }

}
