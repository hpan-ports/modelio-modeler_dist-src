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
    @objid ("081eb19d-fb53-46ad-846f-8e6da2901958")
    @Override
    public Collaboration getType() {
        return (Collaboration) getDepVal(CollaborationUseData.Metadata.TypeDep());
    }

    @objid ("6d326b14-a4a5-4fba-8b4a-d836980c2bb6")
    @Override
    public void setType(Collaboration value) {
        appendDepVal(CollaborationUseData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("3379d521-cba4-4a38-82f6-979f5de9e135")
    @Override
    public NameSpace getNRepresented() {
        return (NameSpace) getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
    }

    @objid ("a66b0136-ad63-46f2-82a5-91335ff8bf2b")
    @Override
    public void setNRepresented(NameSpace value) {
        appendDepVal(CollaborationUseData.Metadata.NRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("2aa144a1-122d-411d-94b5-a608e31b14d0")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
    }

    @objid ("cb0a69fa-b8f2-402e-8a1f-4b4153ef9ff1")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationUseData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("515a5f09-e5a5-4c97-bb5e-d89dcabba073")
    @Override
    public EList<Binding> getRoleBinding() {
        return new SmList<>(this, CollaborationUseData.Metadata.RoleBindingDep());
    }

    @objid ("ece05f15-eccc-4a99-9155-9c0ffa91ff22")
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

    @objid ("bde772ee-6521-4a2b-bd74-0086024ef335")
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

    @objid ("30ece433-ffdd-41c4-8800-1c5d8b99587d")
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

    @objid ("667a3b19-d088-4c2e-a0ba-ad28fc8406c5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaborationUse(this);
        else
          return null;
    }

}
