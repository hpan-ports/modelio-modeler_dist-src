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
    @objid ("f6c72d60-2eaf-4f15-9341-4b3cc3e70519")
    @Override
    public GeneralClass getImplementationRef() {
        return (GeneralClass) getDepVal(BpmnInterfaceData.Metadata.ImplementationRefDep());
    }

    @objid ("cbd35db2-1270-401b-ab9b-eda56a85c888")
    @Override
    public void setImplementationRef(GeneralClass value) {
        appendDepVal(BpmnInterfaceData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("b0609275-4927-4380-9b74-0104c0632139")
    @Override
    public EList<BpmnOperation> getOperation() {
        return new SmList<>(this, BpmnInterfaceData.Metadata.OperationDep());
    }

    @objid ("39540464-052c-497e-a0f2-6a43893c40de")
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

    @objid ("ca14bda1-1b12-4018-9ac0-132d50efd298")
    @Override
    public EList<BpmnParticipant> getParticipantRef() {
        return new SmList<>(this, BpmnInterfaceData.Metadata.ParticipantRefDep());
    }

    @objid ("088057cf-65a1-4403-bc75-dae78cad5991")
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

    @objid ("92e9f9ec-1332-4955-8e44-55bcdbc7655e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8fb18a47-c4d2-4fb9-8ccf-97ec8f3f4c08")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c73a4012-97f4-4607-82f8-cf3f35e12d93")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnInterface(this);
        else
          return null;
    }

}
