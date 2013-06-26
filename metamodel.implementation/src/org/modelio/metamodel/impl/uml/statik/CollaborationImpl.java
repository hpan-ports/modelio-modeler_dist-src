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
    @objid ("c1f5806f-2e75-40ea-9b88-10218a5e5c66")
    @Override
    public boolean isIsConcurrent() {
        return (Boolean) getAttVal(CollaborationData.Metadata.IsConcurrentAtt());
    }

    @objid ("14833875-4489-4606-afa4-c16fe1d8d356")
    @Override
    public void setIsConcurrent(boolean value) {
        setAttVal(CollaborationData.Metadata.IsConcurrentAtt(), value);
    }

    @objid ("5fe6e5bf-ff7d-4160-b99a-819f7addcd62")
    @Override
    public Operation getORepresented() {
        return (Operation) getDepVal(CollaborationData.Metadata.ORepresentedDep());
    }

    @objid ("a8dd9cea-9054-49e9-9f02-44b96bde2d1d")
    @Override
    public void setORepresented(Operation value) {
        appendDepVal(CollaborationData.Metadata.ORepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("e0adaddb-cdd5-4f51-88e1-df908ac94658")
    @Override
    public Behavior getBRepresented() {
        return (Behavior) getDepVal(CollaborationData.Metadata.BRepresentedDep());
    }

    @objid ("312109bb-25f5-4467-a850-38d205a6026d")
    @Override
    public void setBRepresented(Behavior value) {
        appendDepVal(CollaborationData.Metadata.BRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("1bd7c9cb-2bcf-4f23-b7c6-386324c42c48")
    @Override
    public EList<CollaborationUse> getOccurrence() {
        return new SmList<>(this, CollaborationData.Metadata.OccurrenceDep());
    }

    @objid ("2b5ca512-06ca-45e6-b2a3-f6e0578d532c")
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

    @objid ("bb3eece4-1473-4d4a-bcab-baa4f175d590")
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

    @objid ("e8386875-325e-41cb-a399-07383613f418")
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

    @objid ("c8a41391-5fb0-420a-9eaa-9366176c5a05")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCollaboration(this);
        else
          return null;
    }

}
