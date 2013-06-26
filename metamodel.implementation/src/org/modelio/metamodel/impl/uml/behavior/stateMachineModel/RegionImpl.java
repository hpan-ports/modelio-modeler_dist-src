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
    @objid ("9a79a786-0f12-46ae-a1c9-80af6b6517eb")
    @Override
    public State getParent() {
        return (State) getDepVal(RegionData.Metadata.ParentDep());
    }

    @objid ("51a0595e-447b-4990-a1b5-a9926124e193")
    @Override
    public void setParent(State value) {
        appendDepVal(RegionData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("e72521da-77f6-466f-89bb-1c0a1d8dbf2c")
    @Override
    public StateMachine getRepresented() {
        return (StateMachine) getDepVal(RegionData.Metadata.RepresentedDep());
    }

    @objid ("c5bde1d0-49cb-42ae-b9bf-96705fea948c")
    @Override
    public void setRepresented(StateMachine value) {
        appendDepVal(RegionData.Metadata.RepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("8a8b6dda-c691-4b91-810b-868a2df4b10f")
    @Override
    public EList<StateVertex> getSub() {
        return new SmList<>(this, RegionData.Metadata.SubDep());
    }

    @objid ("fe98bd13-e4b8-418c-97a7-2952d3a6a0a8")
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

    @objid ("63d7eff1-c552-4a18-9e61-0ada7027de78")
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

    @objid ("f226ea91-13bb-493c-82ce-4cb1a0da5384")
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

    @objid ("2ea447fb-ce52-4ed7-8d16-de90bb3e5bd2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRegion(this);
        else
          return null;
    }

}
