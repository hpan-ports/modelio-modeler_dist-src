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

    @objid ("ea6a7c0e-939b-4e38-a81c-e56cf630787e")
    @Override
    public String getParamNumber() {
        return (String) getAttVal(TagTypeData.Metadata.ParamNumberAtt());
    }

    @objid ("8d87cfd0-d72c-4444-9e8e-8afc015a0f82")
    @Override
    public void setParamNumber(String value) {
        setAttVal(TagTypeData.Metadata.ParamNumberAtt(), value);
    }

    @objid ("d444719b-994f-4652-8a34-55d6bdfc1038")
    @Override
    public boolean isIsQualified() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsQualifiedAtt());
    }

    @objid ("9eef3272-4f3b-4516-a8d4-b843f64bbe2d")
    @Override
    public void setIsQualified(boolean value) {
        setAttVal(TagTypeData.Metadata.IsQualifiedAtt(), value);
    }

    @objid ("b19da076-ae41-420b-be95-fca837c5e314")
    @Override
    public boolean isBelongToPrototype() {
        return (Boolean) getAttVal(TagTypeData.Metadata.BelongToPrototypeAtt());
    }

    @objid ("3a8e9b90-fe6e-40d2-81e4-e759ddec7746")
    @Override
    public void setBelongToPrototype(boolean value) {
        setAttVal(TagTypeData.Metadata.BelongToPrototypeAtt(), value);
    }

    @objid ("0f6fc2c0-b076-4215-93c9-9e849d5843ee")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("a6907e5a-73b9-42e7-a35c-64583673afac")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(TagTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("38dc6a7b-1e96-471a-85b0-6665dcecef4c")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(TagTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("0e21e449-34f2-4a5b-a5e5-9df0f93b328a")
    @Override
    public void setLabelKey(String value) {
        setAttVal(TagTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("e5bcfe65-f366-4e43-9e9c-6594cd381a07")
    @Override
    public EList<TaggedValue> getTagOccurence() {
        return new SmList<>(this, TagTypeData.Metadata.TagOccurenceDep());
    }

    @objid ("0ff73fc8-fbac-43cb-9eef-6f0329f144de")
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

    @objid ("dff2c010-e222-4033-9ae6-41cf6a0494ac")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("fba8a610-bdd1-43f0-8b72-92b0a717ef0a")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("490580bd-b2ba-4498-9748-30b4605e5fa3")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("4a1245e5-ed54-45f8-9c78-fa90d6c0c8bf")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(TagTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("3f01952c-1890-46b5-abcc-b0ded85b5717")
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

    @objid ("43ccf714-a3e5-407f-8e3b-85670fa51992")
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

    @objid ("6cf70648-e4f4-4b8e-938f-787f4e8b9fef")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagType(this);
        else
          return null;
    }

}
