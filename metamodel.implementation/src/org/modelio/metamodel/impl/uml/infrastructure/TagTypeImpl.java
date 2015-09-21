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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("a2b9c4e2-6167-4542-bd68-af7c5e81c493")
    @Override
    public String getParamNumber() {
        return (String) getAttVal(((TagTypeSmClass)getClassOf()).getParamNumberAtt());
    }

    @objid ("f432fba5-d0b8-4f66-9166-c8fbc2f8a80d")
    @Override
    public void setParamNumber(String value) {
        setAttVal(((TagTypeSmClass)getClassOf()).getParamNumberAtt(), value);
    }

    @objid ("2be7fce8-da1a-4cc9-9853-95d0634dcdbc")
    @Override
    public boolean isIsQualified() {
        return (Boolean) getAttVal(((TagTypeSmClass)getClassOf()).getIsQualifiedAtt());
    }

    @objid ("69623d51-b9f2-4b25-8f73-ae9d8678c722")
    @Override
    public void setIsQualified(boolean value) {
        setAttVal(((TagTypeSmClass)getClassOf()).getIsQualifiedAtt(), value);
    }

    @objid ("34d1c867-cf03-41bf-990f-fade30209a1e")
    @Override
    public boolean isBelongToPrototype() {
        return (Boolean) getAttVal(((TagTypeSmClass)getClassOf()).getBelongToPrototypeAtt());
    }

    @objid ("1e4bffe3-4f1c-4d9d-858e-1b84fa16168b")
    @Override
    public void setBelongToPrototype(boolean value) {
        setAttVal(((TagTypeSmClass)getClassOf()).getBelongToPrototypeAtt(), value);
    }

    @objid ("0b9c29be-15f8-4335-97eb-5947e00bcada")
    @Override
    public boolean isIsHidden() {
        return (Boolean) getAttVal(((TagTypeSmClass)getClassOf()).getIsHiddenAtt());
    }

    @objid ("0b891b55-e289-4f9a-87e1-371fd35c0b6d")
    @Override
    public void setIsHidden(boolean value) {
        setAttVal(((TagTypeSmClass)getClassOf()).getIsHiddenAtt(), value);
    }

    @objid ("915237c3-ee75-40c2-8da7-8a210b8ed0a3")
    @Override
    public String getLabelKey() {
        return (String) getAttVal(((TagTypeSmClass)getClassOf()).getLabelKeyAtt());
    }

    @objid ("eba2469b-d1a0-4063-ae5a-17061ac00e95")
    @Override
    public void setLabelKey(String value) {
        setAttVal(((TagTypeSmClass)getClassOf()).getLabelKeyAtt(), value);
    }

    @objid ("134be68d-7b1a-4cb1-ad7e-c02f72bc2356")
    @Override
    public EList<TaggedValue> getTagOccurence() {
        return new SmList<>(this, ((TagTypeSmClass)getClassOf()).getTagOccurenceDep());
    }

    @objid ("04232e6d-6747-422c-919f-d10d0434d4bb")
    @Override
    public <T extends TaggedValue> List<T> getTagOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TaggedValue element : getTagOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b294b832-fb9d-4517-a63e-2953a5a38c7c")
    @Override
    public Stereotype getOwnerStereotype() {
        Object obj = getDepVal(((TagTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        return (obj instanceof Stereotype)? (Stereotype)obj : null;
    }

    @objid ("e25aacfe-3255-417c-9495-341f715ba7f0")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(((TagTypeSmClass)getClassOf()).getOwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("182723b5-4315-4817-a3b1-d424510d911b")
    @Override
    public MetaclassReference getOwnerReference() {
        Object obj = getDepVal(((TagTypeSmClass)getClassOf()).getOwnerReferenceDep());
        return (obj instanceof MetaclassReference)? (MetaclassReference)obj : null;
    }

    @objid ("e4c9e81d-4c8c-43cc-9bcd-5e392ee3467d")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(((TagTypeSmClass)getClassOf()).getOwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("3f2a5237-7388-4f74-bcad-37497ec673af")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerStereotype
        obj = (SmObjectImpl)this.getDepVal(((TagTypeSmClass)getClassOf()).getOwnerStereotypeDep());
        if (obj != null)
          return obj;
        // OwnerReference
        obj = (SmObjectImpl)this.getDepVal(((TagTypeSmClass)getClassOf()).getOwnerReferenceDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c71e7369-5b92-4c43-9e42-7a4dcac2ef25")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerStereotype
        dep = ((TagTypeSmClass)getClassOf()).getOwnerStereotypeDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerReference
        dep = ((TagTypeSmClass)getClassOf()).getOwnerReferenceDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("dc141e92-15b5-4798-b250-b9c85e001922")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTagType(this);
        else
          return null;
    }

}
