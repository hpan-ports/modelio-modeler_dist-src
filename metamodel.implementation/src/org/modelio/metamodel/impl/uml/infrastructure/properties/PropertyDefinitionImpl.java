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
    @objid ("efba4a29-6a4f-4897-9acd-a71ea3afb054")
    @Override
    public boolean isIsEditable() {
        return (Boolean) getAttVal(PropertyDefinitionData.Metadata.IsEditableAtt());
    }

    @objid ("882e61f7-d64f-4972-ba2f-67973ac657e1")
    @Override
    public void setIsEditable(boolean value) {
        setAttVal(PropertyDefinitionData.Metadata.IsEditableAtt(), value);
    }

    @objid ("4306e7c8-c164-425d-9032-e2fc98eedec9")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt());
    }

    @objid ("04c115c9-7f15-41a1-b5d8-dcfa66c852f5")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("769fa704-66b0-4784-959d-b32796d7c50b")
    @Override
    public PropertyType getType() {
        return (PropertyType) getDepVal(PropertyDefinitionData.Metadata.TypeDep());
    }

    @objid ("1912ddfe-9ac2-418a-b79e-977ec4cfdf0c")
    @Override
    public void setType(PropertyType value) {
        appendDepVal(PropertyDefinitionData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("425a925c-fff9-4762-9ee2-1aec8dc3f2c1")
    @Override
    public PropertyTableDefinition getOwner() {
        return (PropertyTableDefinition) getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
    }

    @objid ("abf5af57-57b4-43b4-bf9e-48ea166678a2")
    @Override
    public void setOwner(PropertyTableDefinition value) {
        appendDepVal(PropertyDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("b10a09cf-c4ee-411f-b941-9a5bcb9fc993")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c81ad7a9-908d-4716-b184-4cae852deb5b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7a2f1b58-7178-4d2a-8cd6-1da9714ed844")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyDefinition(this);
        else
          return null;
    }

}
