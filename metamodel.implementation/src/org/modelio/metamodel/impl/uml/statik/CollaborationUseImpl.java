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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0004a754-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationUseImpl extends ModelElementImpl implements CollaborationUse {
    @objid ("600fdfbe-fe91-481e-b7cf-5b6817d1e750")
    @Override
    public Collaboration getType() {
        return (Collaboration) getDepVal(CollaborationUseData.Metadata.TypeDep());
    }

    @objid ("b6b9ee8c-87e9-40e3-9bfe-7d4d4bc83a51")
    @Override
    public void setType(Collaboration value) {
        appendDepVal(CollaborationUseData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("e857e1d3-d210-4d40-861f-ce1cc9078f9d")
    @Override
    public NameSpace getNRepresented() {
        return (NameSpace) getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
    }

    @objid ("f21acd1d-3210-49fc-af47-55324e3e2501")
    @Override
    public void setNRepresented(NameSpace value) {
        appendDepVal(CollaborationUseData.Metadata.NRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("b33271f8-7955-458b-9079-ff057907e9a7")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
    }

    @objid ("9c36e271-e663-4ccc-a6f0-ae3191c23e67")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationUseData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("7732c8be-4ac9-43aa-8aaf-e7c85d693038")
    @Override
    public EList<Binding> getRoleBinding() {
        return new SmList<>(this, CollaborationUseData.Metadata.RoleBindingDep());
    }

    @objid ("63e38102-35ca-4817-9712-87a3ef6d46b3")
    @Override
    public <T extends Binding> List<T> getRoleBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRoleBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5891460d-de0d-40b6-9b10-c08f5b9c6a98")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("670fa479-ff9a-46bf-8b02-82e97671b98c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationUseData.Metadata.NRepresentedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationUseData.Metadata.ORepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d32f3fae-1164-4e7a-ae17-d9aca09c47a2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaborationUse(this);
        else
          return null;
    }

}
