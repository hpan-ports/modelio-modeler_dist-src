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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.properties.TypedPropertyTableData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("25b6ec68-524e-4883-afe7-4e7e087c6f82")
    @Override
    public PropertyTableDefinition getType() {
        Object obj = getDepVal(((TypedPropertyTableSmClass)getClassOf()).getTypeDep());
        return (obj instanceof PropertyTableDefinition)? (PropertyTableDefinition)obj : null;
    }

    @objid ("6661aeab-f58d-4d40-8104-b22ae15aa9d1")
    @Override
    public void setType(PropertyTableDefinition value) {
        appendDepVal(((TypedPropertyTableSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("56dd0ff6-e355-4b4d-b34e-dc9de9744b64")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8f84a49a-6633-4226-ae18-bb08c6694854")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("dccbd581-6273-4ce5-80d2-1642c5fc5d3c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitTypedPropertyTable(this);
        else
          return null;
    }

}
