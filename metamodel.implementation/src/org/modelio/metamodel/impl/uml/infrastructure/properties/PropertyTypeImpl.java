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
    @objid ("3c689bbf-9ec8-49f0-bf70-cd9bdf7b0c98")
    @Override
    public PropertyBaseType getBaseType() {
        return (PropertyBaseType) getAttVal(PropertyTypeData.Metadata.BaseTypeAtt());
    }

    @objid ("b221f48e-119a-45e6-ad03-8c27a6ab37cd")
    @Override
    public void setBaseType(PropertyBaseType value) {
        setAttVal(PropertyTypeData.Metadata.BaseTypeAtt(), value);
    }

    @objid ("75a0bb19-553b-4094-bc2a-84102068aebb")
    @Override
    public PropertyContainer getAnalystOwner() {
        return (PropertyContainer) getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
    }

    @objid ("97f8116e-7611-4914-ab6e-13f95825d33b")
    @Override
    public void setAnalystOwner(PropertyContainer value) {
        appendDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("8f3a3ee3-5c35-4b3e-8b61-1a202e172b93")
    @Override
    public EList<PropertyDefinition> getTyped() {
        return new SmList<>(this, PropertyTypeData.Metadata.TypedDep());
    }

    @objid ("2a217569-121b-4889-8809-eca2d9a8da17")
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

    @objid ("0cce9db0-ae15-4b34-be59-fb0d3a891b3f")
    @Override
    public ModuleComponent getModuleOwner() {
        return (ModuleComponent) getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
    }

    @objid ("be070a20-aa4e-4485-85ef-5f270b6a5cdb")
    @Override
    public void setModuleOwner(ModuleComponent value) {
        appendDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("75a0830c-247f-483c-8662-43774d0e1848")
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

    @objid ("098718bc-7edf-4c3d-98c6-adc6a6ce8e35")
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

    @objid ("bb090a3f-d075-4e44-811d-0a0389a017af")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyType(this);
        else
          return null;
    }

}
