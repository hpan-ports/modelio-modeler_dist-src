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
    @objid ("b4ff0750-6e67-43db-9ee6-f0a52fcf6769")
    @Override
    public PropertyBaseType getBaseType() {
        return (PropertyBaseType) getAttVal(PropertyTypeData.Metadata.BaseTypeAtt());
    }

    @objid ("37e22448-7a67-49d1-9438-59d8ca60ddff")
    @Override
    public void setBaseType(PropertyBaseType value) {
        setAttVal(PropertyTypeData.Metadata.BaseTypeAtt(), value);
    }

    @objid ("431c70d2-c1a0-4e5b-8b60-052a88efffe3")
    @Override
    public PropertyContainer getAnalystOwner() {
        return (PropertyContainer) getDepVal(PropertyTypeData.Metadata.AnalystOwnerDep());
    }

    @objid ("834d107d-ae93-47da-af16-a07bca85344e")
    @Override
    public void setAnalystOwner(PropertyContainer value) {
        appendDepVal(PropertyTypeData.Metadata.AnalystOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a8ae122a-340a-4624-a1d7-4f128fb35bd4")
    @Override
    public EList<PropertyDefinition> getTyped() {
        return new SmList<>(this, PropertyTypeData.Metadata.TypedDep());
    }

    @objid ("d633ac1e-857e-477a-a578-a218d0c12278")
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

    @objid ("b61f640b-c708-474e-ba56-73dcc249f0fa")
    @Override
    public ModuleComponent getModuleOwner() {
        return (ModuleComponent) getDepVal(PropertyTypeData.Metadata.ModuleOwnerDep());
    }

    @objid ("6a7acdba-c41a-4d66-a5c4-400fc2eb0376")
    @Override
    public void setModuleOwner(ModuleComponent value) {
        appendDepVal(PropertyTypeData.Metadata.ModuleOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("ec47903e-34f0-46af-9371-596e363ca5ff")
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

    @objid ("84bddc70-2509-4547-9b7f-0a33c5384f43")
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

    @objid ("b0d5b57a-e78e-401e-a7e9-b512c8524cb3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyType(this);
        else
          return null;
    }

}
