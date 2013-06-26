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
    @objid ("79e41e5a-e530-44ef-9cad-308f7fb2b4a7")
    @Override
    public ModelTree getOwner() {
        return (ModelTree) getDepVal(ModelTreeData.Metadata.OwnerDep());
    }

    @objid ("ce890687-f9f6-428c-bae4-71aeddb0fdf2")
    @Override
    public void setOwner(ModelTree value) {
        appendDepVal(ModelTreeData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("7da8a8f5-cc4c-4930-8023-e6f9429fc79d")
    @Override
    public EList<ModelTree> getOwnedElement() {
        return new SmList<>(this, ModelTreeData.Metadata.OwnedElementDep());
    }

    @objid ("d1b5eafa-86db-499e-b84f-3e02898b5d69")
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

    @objid ("51baea98-e6c1-4609-91ab-c557800e1744")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("29e95833-8bff-4685-afa2-6f94b0538310")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelTreeData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(ModelTreeData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ee7951b3-cb92-42e2-b32f-7e90abdd1d4d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelTree(this);
        else
          return null;
    }

}
