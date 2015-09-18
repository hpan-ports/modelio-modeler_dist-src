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
    @objid ("41f80074-9c58-4548-813f-d4a4f7f3d096")
    @Override
    public State getParent() {
        return (State) getDepVal(RegionData.Metadata.ParentDep());
    }

    @objid ("9173e033-215a-4b11-8d2d-da540e5f2def")
    @Override
    public void setParent(State value) {
        appendDepVal(RegionData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("1fbd8324-1e70-43f1-bd29-0b2cf256d14d")
    @Override
    public StateMachine getRepresented() {
        return (StateMachine) getDepVal(RegionData.Metadata.RepresentedDep());
    }

    @objid ("55fdcee6-c29c-43e1-a022-fae21aa819ae")
    @Override
    public void setRepresented(StateMachine value) {
        appendDepVal(RegionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("79c70c9d-3d8a-4229-b316-dcad5fcbf002")
    @Override
    public EList<StateVertex> getSub() {
        return new SmList<>(this, RegionData.Metadata.SubDep());
    }

    @objid ("18594ddd-33bc-4afd-84f3-74c5e61aa9e0")
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

    @objid ("ae89a49e-b4ba-452b-b507-df2a77a20f30")
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

    @objid ("8bb3ed7d-13a0-4923-bb66-0a474104260a")
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

    @objid ("ae17cb0a-f8e6-4c84-83a4-71b8c20555a0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRegion(this);
        else
          return null;
    }

}
