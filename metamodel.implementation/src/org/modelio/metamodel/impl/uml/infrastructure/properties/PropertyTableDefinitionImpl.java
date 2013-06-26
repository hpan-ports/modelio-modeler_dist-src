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
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("0067251e-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableDefinitionImpl extends ModelElementImpl implements PropertyTableDefinition {
    @objid ("e7acb422-9628-4ae0-8bea-f05db4c4bee7")
    @Override
    public PropertyContainer getOwner() {
        return (PropertyContainer) getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
    }

    @objid ("780634ab-3132-41d0-ae3d-8aea799c5015")
    @Override
    public void setOwner(PropertyContainer value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("4df13e06-e882-40d0-95ca-ae0566799c5f")
    @Override
    public EList<TypedPropertyTable> getTypedTable() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.TypedTableDep());
    }

    @objid ("5b3eb8ad-9d8a-4d0e-9a8e-2674f20f4f4f")
    @Override
    public <T extends TypedPropertyTable> List<T> getTypedTable(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TypedPropertyTable element : getTypedTable()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("db0e7321-6a97-4c1c-a7c9-86b4f5c1e567")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
    }

    @objid ("44dfe0ec-78b0-43e6-ae31-06969b9d1b20")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("8836b6c1-3041-47f1-9dea-574164ee3007")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
    }

    @objid ("ff6f8e98-1c25-466c-907a-0c1c56da9f51")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("2059e914-d639-457e-9094-528129921699")
    @Override
    public EList<PropertyDefinition> getOwned() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.OwnedDep());
    }

    @objid ("8982bfd5-2d8d-4665-aedd-bea08cf80848")
    @Override
    public <T extends PropertyDefinition> List<T> getOwned(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyDefinition element : getOwned()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dc445cf6-ee63-4d2c-99e8-af539d61f27d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("282897c0-c7b5-4922-9b9b-cc2e73d2f88e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
        if (obj != null)
          return new SmDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f42b4d96-7031-48b2-b37e-ea24d9509234")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTableDefinition(this);
        else
          return null;
    }

}
