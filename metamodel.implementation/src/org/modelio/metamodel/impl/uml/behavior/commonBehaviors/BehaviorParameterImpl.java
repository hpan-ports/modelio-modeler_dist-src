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
    @objid ("296f9fdc-9ab6-46e7-b6c0-8c9e1d6c0dc7")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, BehaviorParameterData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("25f70a31-43d1-4be0-ba7f-523f85404366")
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

    @objid ("a6193956-dab8-4190-ab3c-25283ddb2ad2")
    @Override
    public Behavior getOwner() {
        return (Behavior) getDepVal(BehaviorParameterData.Metadata.OwnerDep());
    }

    @objid ("dae602be-fedc-4c65-b224-1ca647afc834")
    @Override
    public void setOwner(Behavior value) {
        appendDepVal(BehaviorParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("39529b5a-c815-4065-a55d-8f0e52655179")
    @Override
    public Parameter getMapped() {
        return (Parameter) getDepVal(BehaviorParameterData.Metadata.MappedDep());
    }

    @objid ("93d0113c-6abf-4ac9-add3-8163705fee60")
    @Override
    public void setMapped(Parameter value) {
        appendDepVal(BehaviorParameterData.Metadata.MappedDep(), (SmObjectImpl)value);
    }

    @objid ("eb70dbc2-5893-43eb-90c5-87e30e052d65")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7a622bc6-9e58-4de3-9486-976e567883f1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5314dd09-357c-4d5c-8ffd-008def2e09c0")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehaviorParameter(this);
        else
          return null;
    }

}
