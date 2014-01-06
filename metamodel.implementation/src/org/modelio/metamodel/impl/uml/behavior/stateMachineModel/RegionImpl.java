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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0057164c-c4bf-1fd8-97fe-001ec947cd2a")
public class RegionImpl extends ModelElementImpl implements Region {
    @objid ("18e2cad4-6ba4-4b7d-aaf3-9b6ea95f029a")
    @Override
    public State getParent() {
        return (State) getDepVal(RegionData.Metadata.ParentDep());
    }

    @objid ("0347783a-0a72-4daa-b96b-8e293884b579")
    @Override
    public void setParent(State value) {
        appendDepVal(RegionData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("fa666ced-9b13-4e4c-84e5-de85513ebe5c")
    @Override
    public StateMachine getRepresented() {
        return (StateMachine) getDepVal(RegionData.Metadata.RepresentedDep());
    }

    @objid ("15205f64-35a7-4c4f-bc84-26ff97c4a4b4")
    @Override
    public void setRepresented(StateMachine value) {
        appendDepVal(RegionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("cf97334a-aed3-4af2-8a66-e3968b4027ec")
    @Override
    public EList<StateVertex> getSub() {
        return new SmList<>(this, RegionData.Metadata.SubDep());
    }

    @objid ("e79ca346-0d3f-4730-8e08-f16ae8c10ab3")
    @Override
    public <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final StateVertex element : getSub()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9331d01c-5f30-472d-8298-182035cc4141")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.RepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e0da667f-c0d6-4d4b-8726-f5b25b86a283")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(RegionData.Metadata.ParentDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RegionData.Metadata.RepresentedDep());
        if (obj != null)
          return new SmDepVal(RegionData.Metadata.RepresentedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("fc919117-6c68-4f45-a2d2-ac63965df7a1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRegion(this);
        else
          return null;
    }

}
