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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyDefinitionData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0064a19a-ec87-1098-b22e-001ec947cd2a")
public class PropertyDefinitionImpl extends ModelElementImpl implements PropertyDefinition {
    @objid ("209e63f4-c716-485d-9100-097afd5db3d6")
    @Override
    public boolean isIsEditable() {
        return (Boolean) getAttVal(((PropertyDefinitionSmClass)getClassOf()).getIsEditableAtt());
    }

    @objid ("c474a7be-3b56-454a-bf38-b0a853b7c3d0")
    @Override
    public void setIsEditable(boolean value) {
        setAttVal(((PropertyDefinitionSmClass)getClassOf()).getIsEditableAtt(), value);
    }

    @objid ("272aa13b-b9bc-4413-baa7-575c05194ba5")
    @Override
    public String getDefaultValue() {
        return (String) getAttVal(((PropertyDefinitionSmClass)getClassOf()).getDefaultValueAtt());
    }

    @objid ("16fd4fbc-4d97-456b-8502-120f0099efac")
    @Override
    public void setDefaultValue(String value) {
        setAttVal(((PropertyDefinitionSmClass)getClassOf()).getDefaultValueAtt(), value);
    }

    @objid ("8c26ba4a-07ec-4ad3-95bd-327efc8032a0")
    @Override
    public PropertyType getType() {
        Object obj = getDepVal(((PropertyDefinitionSmClass)getClassOf()).getTypeDep());
        return (obj instanceof PropertyType)? (PropertyType)obj : null;
    }

    @objid ("4cbb6e68-d84a-473c-a4ac-3df2240317ef")
    @Override
    public void setType(PropertyType value) {
        appendDepVal(((PropertyDefinitionSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("cefe52aa-a8c8-4d75-b12d-e573adfd7eec")
    @Override
    public PropertyTableDefinition getOwner() {
        Object obj = getDepVal(((PropertyDefinitionSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof PropertyTableDefinition)? (PropertyTableDefinition)obj : null;
    }

    @objid ("4a815f4f-1704-442d-ab88-b4c90d0e47d3")
    @Override
    public void setOwner(PropertyTableDefinition value) {
        appendDepVal(((PropertyDefinitionSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("219d7af1-3114-4c94-ad3d-89af71fd5b16")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((PropertyDefinitionSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1728a738-6ea4-4108-91a4-a1ca6a4af49a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((PropertyDefinitionSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("0f8f5f6c-1367-4b01-b678-16d30e86bc10")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyDefinition(this);
        else
          return null;
    }

}
