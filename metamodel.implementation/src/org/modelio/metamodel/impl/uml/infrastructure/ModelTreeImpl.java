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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ModelTreeData;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0089574c-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ModelTreeImpl extends ModelElementImpl implements ModelTree {
    @objid ("b789cdd5-f3f5-4723-8db6-8d1b5ef2e6ef")
    @Override
    public ModelTree getOwner() {
        return (ModelTree) getDepVal(ModelTreeData.Metadata.OwnerDep());
    }

    @objid ("904e7926-e850-4b18-ae96-ae2bd54ca438")
    @Override
    public void setOwner(ModelTree value) {
        appendDepVal(ModelTreeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7420d24d-5acb-4f02-a5e0-f70f21d2cc78")
    @Override
    public EList<ModelTree> getOwnedElement() {
        return new SmList<>(this, ModelTreeData.Metadata.OwnedElementDep());
    }

    @objid ("5cb0f512-d73d-4ba7-98b7-67d518c67c17")
    @Override
    public <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModelTree element : getOwnedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8d063dd-f2a0-4983-8162-9918071b4391")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8431011f-5eed-44e7-a453-4744247dcede")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModelTreeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("81c7cdf5-2072-4314-ba55-eb6f6d2970d8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelTree(this);
        else
          return null;
    }

}
