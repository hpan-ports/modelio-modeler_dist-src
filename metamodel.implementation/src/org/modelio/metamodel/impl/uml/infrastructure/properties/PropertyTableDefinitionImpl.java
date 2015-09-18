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
    @objid ("7b8e850f-49a5-46fe-8074-4574a3b23b72")
    @Override
    public PropertyContainer getOwner() {
        return (PropertyContainer) getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
    }

    @objid ("0099916f-e9c2-4057-84ec-b20a97e1e74c")
    @Override
    public void setOwner(PropertyContainer value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("378ee51e-2582-4960-9a75-4c1fee7bdc1b")
    @Override
    public EList<TypedPropertyTable> getTypedTable() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.TypedTableDep());
    }

    @objid ("83873cd6-dc45-43e8-9cdf-8289842a9915")
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

    @objid ("0a13e7d3-8293-4d9d-bf6a-4904c0f0a109")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
    }

    @objid ("26afeff2-1830-4235-8e0c-664ffac9678d")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("238cf80e-a23e-4d2e-81ea-300521b44760")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
    }

    @objid ("e1715175-8be8-4509-9a30-f8a0ea2578c8")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("254d1df0-f8d2-4722-bdea-24a9704f4384")
    @Override
    public EList<PropertyDefinition> getOwned() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.OwnedDep());
    }

    @objid ("1b276bde-45c9-498d-b2bc-da2c50b72e04")
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

    @objid ("fc08ccbf-6af0-419b-b8e2-ae0a7a4ebb6c")
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

    @objid ("4ae76d81-2bc2-416d-8002-ad73bd6f5951")
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

    @objid ("021924d5-e0fe-4ff3-a58d-e7c56f97fc16")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTableDefinition(this);
        else
          return null;
    }

}
