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
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0054c0ea-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class StateVertexImpl extends ModelElementImpl implements StateVertex {
    @objid ("e91cf104-8f34-43c2-8421-b9318d9d8213")
    @Override
    public EList<Transition> getOutGoing() {
        return new SmList<>(this, StateVertexData.Metadata.OutGoingDep());
    }

    @objid ("f95ff1f8-b3fe-48c6-8655-2184530c1965")
    @Override
    public <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getOutGoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("650ff57b-ec4f-4d50-a4c9-f623b82f1442")
    @Override
    public EList<Transition> getIncoming() {
        return new SmList<>(this, StateVertexData.Metadata.IncomingDep());
    }

    @objid ("e9bc5915-f2c0-42a8-91b4-d0dc8568cf69")
    @Override
    public <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("51cb7e95-ddf9-45a7-9c00-f0f3128c41a1")
    @Override
    public Region getParent() {
        return (Region) getDepVal(StateVertexData.Metadata.ParentDep());
    }

    @objid ("62c7abc1-e203-4225-8639-fb7eeb3f3109")
    @Override
    public void setParent(Region value) {
        appendDepVal(StateVertexData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("f1069bde-2686-4843-8ba4-f979f0c5a4fc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("eb1f6a3d-340b-45dd-8600-dfcf842fe945")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(StateVertexData.Metadata.ParentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("41fb20b3-60b3-4efc-8ccb-f2644a9d156c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateVertex(this);
        else
          return null;
    }

}
