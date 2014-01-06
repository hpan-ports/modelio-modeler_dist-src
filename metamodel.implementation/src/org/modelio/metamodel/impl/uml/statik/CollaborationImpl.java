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
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00041fdc-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationImpl extends NameSpaceImpl implements Collaboration {
    @objid ("fe6335aa-bed0-4e8d-8e44-3cd0c2ac5eaf")
    @Override
    public boolean isIsConcurrent() {
        return (Boolean) getAttVal(CollaborationData.Metadata.IsConcurrentAtt());
    }

    @objid ("5c7d045e-51f3-400a-8e8c-4c5e726e932a")
    @Override
    public void setIsConcurrent(boolean value) {
        setAttVal(CollaborationData.Metadata.IsConcurrentAtt(), value);
    }

    @objid ("543c43ca-405a-4067-9ff6-ca3579f4d5c6")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationData.Metadata.ORepresentedDep());
    }

    @objid ("a24149ed-ab88-4412-a4d7-181374f6c503")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("291d1b0f-6d77-47e7-bfc9-2d63162f7da7")
    @Override
    public Behavior getBRepresented() {
        return (Behavior) getDepVal(CollaborationData.Metadata.BRepresentedDep());
    }

    @objid ("d65d6f08-6db0-4fc2-ac84-54b1f91c8756")
    @Override
    public void setBRepresented(Behavior value) {
        appendDepVal(CollaborationData.Metadata.BRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("2941d1cf-95eb-4fa3-bc6f-48c26d749fb0")
    @Override
    public EList<CollaborationUse> getOccurrence() {
        return new SmList<>(this, CollaborationData.Metadata.OccurrenceDep());
    }

    @objid ("b529e083-9c21-49bf-9baa-039f746b6e4b")
    @Override
    public <T extends CollaborationUse> List<T> getOccurrence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOccurrence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6227514c-9bff-4f41-8977-e69729697b00")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.ORepresentedDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.BRepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ee364646-0603-4b10-b946-bf48a7fcc67e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.ORepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationData.Metadata.ORepresentedDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(CollaborationData.Metadata.BRepresentedDep());
        if (obj != null)
          return new SmDepVal(CollaborationData.Metadata.BRepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("72a60426-bf4f-42e0-a32e-b1ba5669703c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaboration(this);
        else
          return null;
    }

}
