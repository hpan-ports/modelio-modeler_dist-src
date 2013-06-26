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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.data.analyst.PropertyContainerData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("00630880-c4bf-1fd8-97fe-001ec947cd2a")
public class PropertyContainerImpl extends ModelElementImpl implements PropertyContainer {
    @objid ("b8341bbd-e31f-4dd8-857e-1a09f2f7bc12")
    @Override
    public EList<PropertyTableDefinition> getDefinedTable() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTableDep());
    }

    @objid ("18982cf8-a4f6-4205-9d84-f8edca6093e7")
    @Override
    public <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyTableDefinition element : getDefinedTable()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e924ff6b-f20a-47d6-b9b9-1f10a06a87a6")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("7c1ac64f-a396-4998-a006-5567ed240800")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("084d853a-1dcc-41ea-baad-cc20ce6a8c72")
    @Override
    public EList<PropertyType> getDefinedType() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTypeDep());
    }

    @objid ("d8ba19ae-3dea-4412-a5ee-a6f62de3f24d")
    @Override
    public <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyType element : getDefinedType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e49d193f-e1ab-4d8c-8e4a-03dffa83b9ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b699a921-2281-4c4e-a8e3-fe09da8a878c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("60c6c527-32d8-43e6-bf3f-84225d17d0b3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyContainer(this);
        else
          return null;
    }

}
