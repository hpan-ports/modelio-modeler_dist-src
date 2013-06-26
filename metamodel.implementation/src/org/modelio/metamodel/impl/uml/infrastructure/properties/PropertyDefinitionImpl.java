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
    @objid ("9dc5b37c-c677-4058-acc8-a43b0757611d")
    @Override
    public boolean isIsEditable() {
        return (Boolean) getAttVal(PropertyDefinitionData.Metadata.IsEditableAtt());
    }

    @objid ("63ac9f36-a4e7-4c74-aea4-6ee8b3a56c2d")
    @Override
    public void setIsEditable(boolean value) {
        setAttVal(PropertyDefinitionData.Metadata.IsEditableAtt(), value);
    }

    @objid ("5ac91811-b004-4bd4-af27-31b476ddf89a")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt());
    }

    @objid ("720aafab-3b2d-4882-b7ad-c40ce518465a")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(PropertyDefinitionData.Metadata.DefaultValueAtt(), value);
    }

    @objid ("184a3e7b-6ec8-41ff-ae0d-84367cbaaec8")
    @Override
    public PropertyType getType() {
        return (PropertyType) getDepVal(PropertyDefinitionData.Metadata.TypeDep());
    }

    @objid ("f7b614ab-9c94-454f-a662-db71c317fe5e")
    @Override
    public void setType(PropertyType value) {
        appendDepVal(PropertyDefinitionData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("9e733c29-f18b-484b-a532-a7830aea1b20")
    @Override
    public PropertyTableDefinition getOwner() {
        return (PropertyTableDefinition) getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
    }

    @objid ("3faffa6b-0ba0-4478-b499-e87f1bcac0d9")
    @Override
    public void setOwner(PropertyTableDefinition value) {
        appendDepVal(PropertyDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("94695ef4-a854-472a-9cb9-1120b481afdd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("78c2223c-74c1-4600-99b7-74120fcadbdb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyDefinitionData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a6715dc9-6157-4058-a976-b52b7ee20101")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyDefinition(this);
        else
          return null;
    }

}
