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
    @objid ("34973c77-6d20-416b-b8d5-c438e09b42c1")
    @Override
    public PropertyContainer getOwner() {
        return (PropertyContainer) getDepVal(PropertyTableDefinitionData.Metadata.OwnerDep());
    }

    @objid ("30a103fc-6e5e-4068-83b7-79681863d451")
    @Override
    public void setOwner(PropertyContainer value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("c1f8dcd3-11cd-4c10-aa6d-3650342f760a")
    @Override
    public EList<TypedPropertyTable> getTypedTable() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.TypedTableDep());
    }

    @objid ("813986c7-1257-4785-982c-9ebacd028e6f")
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

    @objid ("d8f3686b-c8b4-4316-887c-4fbd9cc87311")
    @Override
    public MetaclassReference getOwnerReference() {
        return (MetaclassReference) getDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep());
    }

    @objid ("9f5e9ea1-2911-4bc0-b3df-3c7551389cee")
    @Override
    public void setOwnerReference(MetaclassReference value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerReferenceDep(), (SmObjectImpl)value);
    }

    @objid ("7071eb4a-c696-4409-952f-06385ab73740")
    @Override
    public Stereotype getOwnerStereotype() {
        return (Stereotype) getDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep());
    }

    @objid ("decbd21f-a004-4977-87ff-0af5339ac6f6")
    @Override
    public void setOwnerStereotype(Stereotype value) {
        appendDepVal(PropertyTableDefinitionData.Metadata.OwnerStereotypeDep(), (SmObjectImpl)value);
    }

    @objid ("0ba2beb5-bcdc-4e7e-86b0-4bfe98f9a385")
    @Override
    public EList<PropertyDefinition> getOwned() {
        return new SmList<>(this, PropertyTableDefinitionData.Metadata.OwnedDep());
    }

    @objid ("6c24e127-0d69-4389-a8bc-fe2b64a4f23a")
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

    @objid ("c1fc2083-f3b0-4f6e-8c98-31562a5da3a5")
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

    @objid ("1f8cb20d-d160-43da-8e4a-54e69db8c5f8")
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

    @objid ("b159c2b7-a5c5-47ee-ad0a-995f5737b4ed")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyTableDefinition(this);
        else
          return null;
    }

}
