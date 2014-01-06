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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("006ef8c0-ec87-1098-b22e-001ec947cd2a")
public class PropertyTypeImpl extends ModelElementImpl implements PropertyType {
    @objid ("af178a0c-d261-48ba-8e07-81d7c826ec7b")
    @Override
    public PropertyBaseType getBaseType() {
        return (PropertyBaseType) getAttVal(PropertyTypeData.Metadata.BaseTypeAtt());
    }

    @objid ("10320f90-d6fe-4519-a55a-fed621bec1f0")
    @Override
    public void setBaseType(PropertyBaseType value) {
        setAttVal(PropertyTypeData.Metadata.BaseTypeAtt(), value);
    }

    @objid ("df07da66-8cf0-4a3e-9152-6d071e3b225e")
    @Override
    public PropertyContainer getAnalystOwner() {
        return (PropertyContainer) getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
    }

    @objid ("fa7501c8-2726-4c2e-938f-750f96b751b1")
    @Override
    public void setAnalystOwner(PropertyContainer value) {
        appendDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("0598a5a8-a97f-4b7f-88b2-70f4292bc3c2")
    @Override
    public EList<PropertyDefinition> getTyped() {
        return new SmList<>(this, PropertyTypeData.Metadata.TypedDep());
    }

    @objid ("208e1f0a-1c60-4f7a-b2c8-9d3eea99d7b6")
    @Override
    public <T extends PropertyDefinition> List<T> getTyped(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyDefinition element : getTyped()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1f12e661-fc81-4a4d-b370-f3efabb7046b")
    @Override
    public ModuleComponent getModuleOwner() {
        return (ModuleComponent) getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
    }

    @objid ("63f49647-a13a-42db-b52c-1953d54ee0db")
    @Override
    public void setModuleOwner(ModuleComponent value) {
        appendDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("43b4f88b-be0d-4cc0-99c2-70bdd75704e1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("04012c0a-33f2-4f44-8117-620ae34e7c92")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c16b7ad4-f631-48eb-9261-ee3027de21f6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyType(this);
        else
          return null;
    }

}
