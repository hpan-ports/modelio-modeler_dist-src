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
import org.modelio.metamodel.data.uml.infrastructure.properties.TypedPropertyTableData;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("006b097c-ec87-1098-b22e-001ec947cd2a")
public class TypedPropertyTableImpl extends PropertyTableImpl implements TypedPropertyTable {
    @objid ("26b2c38d-2834-11e2-bf07-001ec947ccaf")
    @Override
    public String getProperty(PropertyDefinition prop) {
        // assert the property definition belongs to the table type
        assert (getType() != null && prop.getOwner().equals(getType())) : prop+" does not belong to "+getType();
        return getProperty(prop.getName());
    }

    @objid ("26b2c393-2834-11e2-bf07-001ec947ccaf")
    @Override
    public void setProperty(PropertyDefinition prop, String value) {
        // assert the property definition belongs to the table type
        assert (getType() != null && prop.getOwner().equals(getType())) : prop+" does not belong to "+getType();
        
        setProperty(prop.getName(), value);
    }

    @objid ("949cc78d-f4f7-4b8a-9a16-5b439b6dc58f")
    @Override
    public PropertyTableDefinition getType() {
        return (PropertyTableDefinition) getDepVal(TypedPropertyTableData.Metadata.TypeDep());
    }

    @objid ("218c7b08-d5bd-40b9-aa2f-7d29f776af35")
    @Override
    public void setType(PropertyTableDefinition value) {
        appendDepVal(TypedPropertyTableData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("aeb823f3-0079-491c-9e86-2fbd0210089c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cae01bc3-2af8-44a5-803a-5e0c9c88a0c8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("21c37a7f-1548-466d-b6ff-fd606d4b45e9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTypedPropertyTable(this);
        else
          return null;
    }

}
