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
    @objid ("7c5f0696-dcb1-44f9-8041-a43538b73ec1")
    @Override
    public EList<ObjectNode> getRepresentingObjectNode() {
        return new SmList<>(this, BehaviorParameterData.Metadata.RepresentingObjectNodeDep());
    }

    @objid ("43a96d09-cff6-4666-9438-8d0ed1344625")
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

    @objid ("d85abd63-c0dc-4e52-9abb-b91e1829e1f6")
    @Override
    public Behavior getOwner() {
        return (Behavior) getDepVal(BehaviorParameterData.Metadata.OwnerDep());
    }

    @objid ("fd8009ec-eb71-4a1e-bf37-21e6b14dbf4c")
    @Override
    public void setOwner(Behavior value) {
        appendDepVal(BehaviorParameterData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("12258775-c815-4468-83d6-bd809d5556e1")
    @Override
    public Parameter getMapped() {
        return (Parameter) getDepVal(BehaviorParameterData.Metadata.MappedDep());
    }

    @objid ("2b09ffca-aea6-421e-bb32-536fd57f0370")
    @Override
    public void setMapped(Parameter value) {
        appendDepVal(BehaviorParameterData.Metadata.MappedDep(), (SmObjectImpl)value);
    }

    @objid ("e0db26f5-9dde-4e67-b8df-3006d76348cb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("379964da-6b86-435a-a00a-389ae78632d8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorParameterData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorParameterData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d9e3f480-954d-44f2-b65e-c1be1fa6c153")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehaviorParameter(this);
        else
          return null;
    }

}
