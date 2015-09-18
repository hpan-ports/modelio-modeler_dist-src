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
    @objid ("88be7597-f46e-41b2-bbe4-6babcb8f92f9")
    @Override
    public EList<PropertyTableDefinition> getDefinedTable() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTableDep());
    }

    @objid ("92640656-b5cb-49bf-b4d6-daa16d057ead")
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

    @objid ("4fdbc74b-9ae6-404f-b81a-500e3d2c4303")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("4ac3b438-9387-44c4-b092-d331be6ddb5f")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("395fe602-adcc-48c9-bb7f-cebbe76239b4")
    @Override
    public EList<PropertyType> getDefinedType() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTypeDep());
    }

    @objid ("4dabba17-c527-41b7-88b2-bdb040c1abbf")
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

    @objid ("1b50cd3d-9c1b-4121-bf44-51a8b1382418")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d7687ff1-c6eb-4917-bc77-1ab6bad03708")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eb2b95e7-c3c2-427a-b7b2-7da5c2487200")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyContainer(this);
        else
          return null;
    }

}
