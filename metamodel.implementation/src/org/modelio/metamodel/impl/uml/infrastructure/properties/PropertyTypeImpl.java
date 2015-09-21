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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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

@objid ("006ef8c0-ec87-1098-b22e-001ec947cd2a")
public class PropertyTypeImpl extends ModelElementImpl implements PropertyType {
    @objid ("818523c6-b8e4-439e-a14d-4ade10557bb2")
    @Override
    public PropertyBaseType getBaseType() {
        return (PropertyBaseType) getAttVal(((PropertyTypeSmClass)getClassOf()).getBaseTypeAtt());
    }

    @objid ("993d3938-b47a-4a98-997c-771507ae56f4")
    @Override
    public void setBaseType(PropertyBaseType value) {
        setAttVal(((PropertyTypeSmClass)getClassOf()).getBaseTypeAtt(), value);
    }

    @objid ("7469eabb-5d74-4378-907e-18621a6a883a")
    @Override
    public PropertyContainer getAnalystOwner() {
        Object obj = getDepVal(((PropertyTypeSmClass)getClassOf()).getAnalystOwnerDep());
        return (obj instanceof PropertyContainer)? (PropertyContainer)obj : null;
    }

    @objid ("fe265fe7-507f-4022-bc5d-3d4defa4bbd9")
    @Override
    public void setAnalystOwner(PropertyContainer value) {
        appendDepVal(((PropertyTypeSmClass)getClassOf()).getAnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("6a163837-11e5-4def-b605-2eac66d2495d")
    @Override
    public EList<PropertyDefinition> getTyped() {
        return new SmList<>(this, ((PropertyTypeSmClass)getClassOf()).getTypedDep());
    }

    @objid ("ce9852e0-0fcd-4778-b9fc-dd2bccc54e9b")
    @Override
    public <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PropertyDefinition element : getTyped()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e340b51d-8dce-4938-8606-2bf782207ded")
    @Override
    public ModuleComponent getModuleOwner() {
        Object obj = getDepVal(((PropertyTypeSmClass)getClassOf()).getModuleOwnerDep());
        return (obj instanceof ModuleComponent)? (ModuleComponent)obj : null;
    }

    @objid ("ba989782-d528-41d9-9379-ddf703e2aed1")
    @Override
    public void setModuleOwner(ModuleComponent value) {
        appendDepVal(((PropertyTypeSmClass)getClassOf()).getModuleOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("2a9858c0-fee9-490a-9b2d-dcba924f949c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // AnalystOwner
        obj = (SmObjectImpl)this.getDepVal(((PropertyTypeSmClass)getClassOf()).getAnalystOwnerDep());
        if (obj != null)
          return obj;
        // ModuleOwner
        obj = (SmObjectImpl)this.getDepVal(((PropertyTypeSmClass)getClassOf()).getModuleOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("2a77ba9d-f3a0-457d-8cb1-17d0b4f6d573")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // AnalystOwner
        dep = ((PropertyTypeSmClass)getClassOf()).getAnalystOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ModuleOwner
        dep = ((PropertyTypeSmClass)getClassOf()).getModuleOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("47070184-41d8-4cfc-9329-2c978d73895f")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyType(this);
        else
          return null;
    }

}
