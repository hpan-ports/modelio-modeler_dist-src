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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0064a19a-ec87-1098-b22e-001ec947cd2a")
public class PropertyDefinitionImpl extends ModelElementImpl implements PropertyDefinition {
    @objid ("208a582e-a9ef-4ee9-8f02-d25b627c3ff6")
    @Override
    public boolean isIsEditable() {
        return (Boolean) getAttVal(PropertyDefinitionData.Metadata.IsEditableAtt());
    }

    @objid ("f973e0dd-6b72-479a-be18-43a608d96808")
    @Override
    public void setIsEditable(boolean value) {
        setAttVal(PropertyDefinitionData.Metadata.IsEditableAtt(), value);
    }

    @objid ("e2be8087-d097-4c1e-a7e2-a2311d8bf8dd")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt());
    }

    @objid ("4513957e-99a6-4107-a04d-87195f78ff1d")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("7cc959c7-c84e-4cce-9f55-ef3523a00f7c")
    @Override
    public PropertyType getType() {
        return (PropertyType) getDepVal(PropertyDefinitionData.Metadata.TypeDep());
    }

    @objid ("19c6eb88-8f89-44b8-8711-ea481d4aa0b4")
    @Override
    public void setType(PropertyType value) {
        appendDepVal(PropertyDefinitionData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("e3bdeeba-d158-4e71-bb46-5fb5d264d93e")
    @Override
    public PropertyTableDefinition getOwner() {
        return (PropertyTableDefinition) getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
    }

    @objid ("0da0c408-72e2-4617-b3e3-188a89c52009")
    @Override
    public void setOwner(PropertyTableDefinition value) {
        appendDepVal(PropertyDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("88f2ad99-a732-45cc-b286-23493915bd2a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("29cf0477-ca83-4834-94b8-2e8f94ccab4e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b4ffcaf5-7290-458b-af31-3ed8af13bad6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyDefinition(this);
        else
          return null;
    }

}
