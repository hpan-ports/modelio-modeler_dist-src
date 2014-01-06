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
    @objid ("72fc2203-7930-4c61-b68c-1882843f166d")
    @Override
    public Collaboration getType() {
        return (Collaboration) getDepVal(CollaborationUseData.Metadata.TypeDep());
    }

    @objid ("54867a28-1133-46ef-82c2-8fede7530ae1")
    @Override
    public void setType(Collaboration value) {
        appendDepVal(CollaborationUseData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("a658b606-1368-47cb-b013-9e2bfd0b5347")
    @Override
    public NameSpace getNRepresented() {
        return (NameSpace) getDepVal(CollaborationUseData.Metadata.NRepresentedDep());
    }

    @objid ("5ff7e7f5-2628-4a5b-9ee2-832ac0c1f041")
    @Override
    public void setNRepresented(NameSpace value) {
        appendDepVal(CollaborationUseData.Metadata.NRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("cd2d4163-b554-4f6d-bbad-c84efea9c734")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationUseData.Metadata.ORepresentedDep());
    }

    @objid ("ac08d4d8-2e01-418d-b83e-e6017a9516d0")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationUseData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("ce06bf09-fe55-415a-80b3-fe21aa8dbdd6")
    @Override
    public EList<Binding> getRoleBinding() {
        return new SmList<>(this, CollaborationUseData.Metadata.RoleBindingDep());
    }

    @objid ("bb85360f-380a-4286-906e-b447fda58f36")
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

    @objid ("9655efec-4b96-407a-baf8-deca2597449a")
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

    @objid ("a28ac551-80b4-4b12-93f6-a41e6bcb3f83")
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

    @objid ("87262ba3-a2ff-4f86-a560-d7f57844221d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaborationUse(this);
        else
          return null;
    }

}
