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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000e1c26-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnInterfaceImpl extends BpmnRootElementImpl implements BpmnInterface {
    @objid ("9f186d88-e50f-41ff-8ff5-4afe5689779d")
    @Override
    public GeneralClass getImplementationRef() {
        return (GeneralClass) getDepVal(BpmnInterfaceData.Metadata.ImplementationRefDep());
    }

    @objid ("1ef60ae5-f406-4bb0-bbdc-3cfca51e604b")
    @Override
    public void setImplementationRef(GeneralClass value) {
        appendDepVal(BpmnInterfaceData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("14d547cd-43d3-44cd-a63b-fc5065427fab")
    @Override
    public EList<BpmnOperation> getOperation() {
        return new SmList<>(this, BpmnInterfaceData.Metadata.OperationDep());
    }

    @objid ("9f226357-9eb4-4731-9330-66c3e9cfd961")
    @Override
    public <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getOperation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8d693254-1557-4c06-a496-09563a1d1162")
    @Override
    public EList<BpmnParticipant> getParticipantRef() {
        return new SmList<>(this, BpmnInterfaceData.Metadata.ParticipantRefDep());
    }

    @objid ("fa3f90b1-994e-4f07-bc51-89014f785e5b")
    @Override
    public <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnParticipant element : getParticipantRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fdb9cc72-5657-425d-ac6e-de6125b475f8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("93676906-e830-46a8-93d6-41d43dbe2c35")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1b88ab2d-dcfb-479f-94a6-e0b0f11f0c55")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnInterface(this);
        else
          return null;
    }

}
