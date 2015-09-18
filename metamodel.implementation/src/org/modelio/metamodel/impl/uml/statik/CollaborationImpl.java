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
    @objid ("0f71f8fe-cdbf-4a7a-8370-25cda3ce4fa3")
    @Override
    public boolean isIsConcurrent() {
        return (Boolean) getAttVal(CollaborationData.Metadata.IsConcurrentAtt());
    }

    @objid ("c991cd35-c8fa-4546-ae24-53dc52042080")
    @Override
    public void setIsConcurrent(boolean value) {
        setAttVal(CollaborationData.Metadata.IsConcurrentAtt(), value);
    }

    @objid ("af6c9a90-2101-4906-8551-b041c85f3922")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationData.Metadata.ORepresentedDep());
    }

    @objid ("a27a7796-1975-41da-b077-069ae14ab92d")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("af709020-23eb-4ad4-aa2b-ae6fcb5bb25c")
    @Override
    public Behavior getBRepresented() {
        return (Behavior) getDepVal(CollaborationData.Metadata.BRepresentedDep());
    }

    @objid ("322511d7-6fa3-468b-bf63-690fba843c6b")
    @Override
    public void setBRepresented(Behavior value) {
        appendDepVal(CollaborationData.Metadata.BRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("1bbe5534-3e50-41db-ac42-1642956317c5")
    @Override
    public EList<CollaborationUse> getOccurrence() {
        return new SmList<>(this, CollaborationData.Metadata.OccurrenceDep());
    }

    @objid ("2e597705-909f-4dfd-b565-8428c2ca0b35")
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

    @objid ("be00568d-24fd-4b8f-a3bf-32dcad77041b")
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

    @objid ("aefa9d6c-b1e7-444a-8237-816add820d69")
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

    @objid ("9c5fe7bf-5cc7-4884-9fc9-3c25df6da239")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaboration(this);
        else
          return null;
    }

}
