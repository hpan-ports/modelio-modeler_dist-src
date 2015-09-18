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
    @objid ("2689cfb6-4920-4bd5-94e9-e23cfc48ba05")
    @Override
    public ModelTree getOwner() {
        return (ModelTree) getDepVal(ModelTreeData.Metadata.OwnerDep());
    }

    @objid ("18b8eca7-330b-42e7-b41e-e426975996f6")
    @Override
    public void setOwner(ModelTree value) {
        appendDepVal(ModelTreeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("96009b63-8853-497a-b34c-83f83a80028c")
    @Override
    public EList<ModelTree> getOwnedElement() {
        return new SmList<>(this, ModelTreeData.Metadata.OwnedElementDep());
    }

    @objid ("6d9fc43d-9f7c-4acb-8791-a0ae59ce0a16")
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

    @objid ("3fc476d2-ad43-4e4e-b330-59e0639d2a42")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("696ce8d0-d14b-4f72-bff3-de7d5527c22d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModelTreeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bdf166e4-05a8-4f94-94fc-ea16ea55fe5c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelTree(this);
        else
          return null;
    }

}
