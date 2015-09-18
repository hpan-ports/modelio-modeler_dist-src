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
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("008f82a2-c4be-1fd8-97fe-001ec947cd2a")
public class TagTypeImpl extends ModelElementImpl implements TagType {
    @objid ("4f878b82-ac7e-4905-8a2e-40fc613813ee")
    @Override
    public ModuleComponent getModule() {
        MetaclassReference ref = getOwnerReference();
        Stereotype st = getOwnerStereotype();
        
        if (ref != null && ref.getOwnerProfile() != null) {
            return ref.getOwnerProfile().getOwnerModule();
        } else if (st != null && st.getOwner() != null) {
            return st.getOwner().getOwnerModule();
        } else
            return null;
    }

    @objid ("abb2a454-9127-42e0-876d-c44bbbf2192a")
    @Override
    public String getParamNumber() {
        return (String) getAttVal(TagTypeData.Metadata.ParamNumberAtt());
    }

    @objid ("68da3dc2-192b-4554-b765-a16ab42c3558")
    @Override
    public void setParamNumber(String value) {
        setAttVal(TagTypeData.Metadata.ParamNumberAtt(), value);
    }

    @objid ("3394b07a-9fab-45bb-83d5-3a839214cc25")
    @Override
    public boolean isIsQualified() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsQualifiedAtt());
    }

    @objid ("7b42e4d4-045a-4354-a272-fcf95f02b144")
    @Override
    public void setIsQualified(boolean value) {
        setAttVal(TagTypeData.Metadata.IsQualifiedAtt(), value);
    }

    @objid ("db01be33-3759-464d-a579-f803f3d30146")
    @Override
    public boolean isBelongToPrototype() {
        return (Boolean) getAttVal(TagTypeData.Metadata.BelongToPrototypeAtt());
    }

    @objid ("bbed9178-f5b7-44b0-931a-97fccca4c553")
    @Override
    public void setBelongToPrototype(boolean value) {
        setAttVal(TagTypeData.Metadata.BelongToPrototypeAtt(), value);
    }

    @objid ("fa5c819b-d60f-4648-bce2-0b9406b62fa8")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("a79a788b-a773-45e1-8e7b-96b7440610ef")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(TagTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("a7e80756-581c-4298-8148-7be5bbda1150")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(TagTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("9101b0f4-0a5f-41d3-be37-b1e39aa4e603")
    @Override
    public void setLabelKey(String value) {
        setAttVal(TagTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("a6aff2ab-dc20-44e3-91a1-cbcf1d057b1b")
    @Override
    public EList<TaggedValue> getTagOccurence() {
        return new SmList<>(this, TagTypeData.Metadata.TagOccurenceDep());
    }

    @objid ("4392e0b9-e7a7-4cc7-bfe7-ab7b899ea7ff")
    @Override
    public <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TaggedValue element : getTagOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b8fd0a29-5dce-4c89-8adf-4572d829e043")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("5aabdec1-757c-4784-ad4f-7be8be3e8b6c")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("639b84ab-05b5-47aa-bd21-c78fedf58c4b")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("b770cb70-d91e-444b-ade8-a2e2ffa38594")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(TagTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("a422b1b8-f9fe-4bd9-8fff-c05dfeaf09cb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("aa906839-5312-4707-9d11-6ed1a221bcbc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(TagTypeData.Metadata.OwnerReferenceDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("557a33a6-6464-43a5-91e1-680d6eb7383f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagType(this);
        else
          return null;
    }

}
