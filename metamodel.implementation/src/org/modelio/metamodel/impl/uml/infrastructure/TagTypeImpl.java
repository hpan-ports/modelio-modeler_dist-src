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

    @objid ("4fc9d71d-f807-4527-8794-ecce56d08517")
    @Override
    public String getParamNumber() {
        return (String) getAttVal(TagTypeData.Metadata.ParamNumberAtt());
    }

    @objid ("daa85e76-cf95-4c59-b8c1-63bb3f7f98c4")
    @Override
    public void setParamNumber(String value) {
        setAttVal(TagTypeData.Metadata.ParamNumberAtt(), value);
    }

    @objid ("8fc21f89-2c05-446a-9ffb-72bc1e9f5859")
    @Override
    public boolean isIsQualified() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsQualifiedAtt());
    }

    @objid ("ac5d42bb-1410-4145-a672-4d898abad07a")
    @Override
    public void setIsQualified(boolean value) {
        setAttVal(TagTypeData.Metadata.IsQualifiedAtt(), value);
    }

    @objid ("3cad4cc4-cc8c-4d5e-8a7c-ea966ba444ec")
    @Override
    public boolean isBelongToPrototype() {
        return (Boolean) getAttVal(TagTypeData.Metadata.BelongToPrototypeAtt());
    }

    @objid ("01029fa2-cf28-4bb3-8be6-170d035fb2bc")
    @Override
    public void setBelongToPrototype(boolean value) {
        setAttVal(TagTypeData.Metadata.BelongToPrototypeAtt(), value);
    }

    @objid ("48aa7fac-f9c4-4834-a9d1-de37392d621d")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(TagTypeData.Metadata.IsHiddenAtt());
    }

    @objid ("189c6927-9be4-48ae-9e83-2dd2a3fc9edb")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(TagTypeData.Metadata.IsHiddenAtt(), value);
    }

    @objid ("2d286eb7-4c43-4832-8355-6c174a6175a3")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(TagTypeData.Metadata.LabelKeyAtt());
    }

    @objid ("84acc99a-145d-4385-8688-fd41989e9d5e")
    @Override
    public void setLabelKey(String value) {
        setAttVal(TagTypeData.Metadata.LabelKeyAtt(), value);
    }

    @objid ("ac1f9faf-2a04-4c8d-8ced-9069c10d86f0")
    @Override
    public EList<TaggedValue> getTagOccurence() {
        return new SmList<>(this, TagTypeData.Metadata.TagOccurenceDep());
    }

    @objid ("e0713d46-b94f-4375-b3a8-94f46ba589c4")
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

    @objid ("b07258fa-ed73-4b25-ae2e-1e72f9eecec2")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(TagTypeData.Metadata.OwnerStereotypeDep());
    }

    @objid ("9be2451e-a361-42d8-b3e5-cf7512854dec")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(TagTypeData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("def94fa7-ede9-4fac-867e-74805b33b05a")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(TagTypeData.Metadata.OwnerReferenceDep());
    }

    @objid ("d36f087c-298b-4cf7-9cfa-5f4671e89b76")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(TagTypeData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("a1f9383c-a7a9-411a-b119-ae6f15feeab5")
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

    @objid ("f77fee75-f76c-4a28-8d2d-e263b74b3871")
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

    @objid ("fa392288-65ce-4cdc-9694-cc033c2c10b1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagType(this);
        else
          return null;
    }

}
