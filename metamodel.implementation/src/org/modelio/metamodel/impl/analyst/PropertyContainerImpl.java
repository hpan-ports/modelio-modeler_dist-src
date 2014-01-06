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
    @objid ("c79597ea-ee6c-494d-9cb3-6f60070975fa")
    @Override
    public EList<PropertyTableDefinition> getDefinedTable() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTableDep());
    }

    @objid ("8b5f5783-7041-4b96-bba4-0bc6191f30e1")
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

    @objid ("6059756b-6ac1-4808-b9ae-bbee4313fd7e")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("5e10f125-1319-453e-b1e5-bcb33de5f90a")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("62d47276-c887-40e4-969b-1efdcc7a8628")
    @Override
    public EList<PropertyType> getDefinedType() {
        return new SmList<>(this, PropertyContainerData.Metadata.DefinedTypeDep());
    }

    @objid ("b037c657-800e-4074-9ba0-791e1999e9e6")
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

    @objid ("9431ea61-8b2f-46ce-92b8-22152ca7e57f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4f6b4f72-07e2-4f0c-ab53-59522c1d9214")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(PropertyContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(PropertyContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2cbdbf18-9162-43a8-99ee-5b529d33fff0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitPropertyContainer(this);
        else
          return null;
    }

}
