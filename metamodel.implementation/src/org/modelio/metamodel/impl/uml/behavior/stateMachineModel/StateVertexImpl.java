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
    @objid ("6d53dac9-c610-4b5e-a2a7-39fd8eb9c944")
    @Override
    public EList<Transition> getOutGoing() {
        return new SmList<>(this, StateVertexData.Metadata.OutGoingDep());
    }

    @objid ("06f12ae1-93b5-4d69-b83b-494dbfb2b310")
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

    @objid ("cdf34c72-c10d-4483-8eea-6236e478c97c")
    @Override
    public EList<Transition> getIncoming() {
        return new SmList<>(this, StateVertexData.Metadata.IncomingDep());
    }

    @objid ("1f85ebbb-d45e-42d5-afe3-4ea2a995e65f")
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

    @objid ("b1445183-5b2a-40d7-9c2a-27af612adb23")
    @Override
    public Region getParent() {
        return (Region) getDepVal(StateVertexData.Metadata.ParentDep());
    }

    @objid ("12734704-fb5f-41f6-ae21-404a3481789d")
    @Override
    public void setParent(Region value) {
        appendDepVal(StateVertexData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("0231905d-8474-4e98-a723-11d315d248f0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e2a0738c-b923-4576-ab79-a868e471f486")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(StateVertexData.Metadata.ParentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("df978c07-3336-49ca-9e53-192a5d3ee6b6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateVertex(this);
        else
          return null;
    }

}
