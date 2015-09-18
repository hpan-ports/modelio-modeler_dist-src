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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.impl.uml.statik.ParameterImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00413f3e-c4bf-1fd8-97fe-001ec947cd2a")
public class BehaviorParameterImpl extends ParameterImpl implements BehaviorParameter {
    @objid ("889c434d-99e7-4e11-a58c-8e5ae766ada9")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, BehaviorParameterData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("36b32880-9e55-4664-99f6-fd10988a793d")
    @Override
    public <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ObjectNode element : getRepresentingObjectNode()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("46ca65d8-4285-4e4a-b013-10c83ec0d08b")
    @Override
    public Behavior getOwner() {
        return (Behavior) getDepVal(BehaviorParameterData.Metadata.OwnerDep());
    }

    @objid ("dcc23318-a18d-4cb0-8087-2e8d88401dd2")
    @Override
    public void setOwner(Behavior value) {
        appendDepVal(BehaviorParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a2392008-0091-4451-89da-fd40906597c9")
    @Override
    public Parameter getMapped() {
        return (Parameter) getDepVal(BehaviorParameterData.Metadata.MappedDep());
    }

    @objid ("18272678-6e8f-4fc3-92c4-638f03194094")
    @Override
    public void setMapped(Parameter value) {
        appendDepVal(BehaviorParameterData.Metadata.MappedDep(), (SmObjectImpl)value);
    }

    @objid ("7cdfa860-a5f9-4159-87a6-3a68bc2b8ae9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("13b8547a-97f5-40af-af65-f83e870771cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("ad921983-ff76-4fb9-9d3c-010d74381c1d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehaviorParameter(this);
        else
          return null;
    }

}
