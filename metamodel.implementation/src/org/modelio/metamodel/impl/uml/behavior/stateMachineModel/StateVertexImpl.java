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
    @objid ("35f4b3b3-914a-43c2-ba7e-db64b1df84f6")
    @Override
    public EList<Transition> getOutGoing() {
        return new SmList<>(this, StateVertexData.Metadata.OutGoingDep());
    }

    @objid ("8b17f53b-4906-4809-8efe-b66f1bc613f5")
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

    @objid ("03d6b0ed-01f7-49b3-a141-48117e4f40db")
    @Override
    public EList<Transition> getIncoming() {
        return new SmList<>(this, StateVertexData.Metadata.IncomingDep());
    }

    @objid ("8a435044-7241-49c0-9479-8c0288984d9f")
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

    @objid ("70bc88d0-cef0-4380-b4b4-c7d6a34bfa23")
    @Override
    public Region getParent() {
        return (Region) getDepVal(StateVertexData.Metadata.ParentDep());
    }

    @objid ("e1507164-3297-47b5-b63b-1a1d4b0fd1ef")
    @Override
    public void setParent(Region value) {
        appendDepVal(StateVertexData.Metadata.ParentDep(), (SmObjectImpl)value);
    }

    @objid ("0cdeccdb-d972-4e4e-9df5-344d6eb54935")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("39eb6fc5-d5f4-4b98-bdc2-c46fb885ad78")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(StateVertexData.Metadata.ParentDep());
        if (obj != null)
          return new SmDepVal(StateVertexData.Metadata.ParentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b4918fa1-2c6d-4bcc-8f4c-161fac05a25d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateVertex(this);
        else
          return null;
    }

}
