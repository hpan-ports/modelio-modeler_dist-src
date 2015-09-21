/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnInterfaceData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000e1c26-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnInterfaceImpl extends BpmnRootElementImpl implements BpmnInterface {
    @objid ("9b9ef8de-2a12-44da-95ed-2dfb255716b8")
    @Override
    public GeneralClass getImplementationRef() {
        Object obj = getDepVal(((BpmnInterfaceSmClass)getClassOf()).getImplementationRefDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("ac2172c5-c38f-4428-8503-01c1c27b47d2")
    @Override
    public void setImplementationRef(GeneralClass value) {
        appendDepVal(((BpmnInterfaceSmClass)getClassOf()).getImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("686232fc-f5af-459a-9593-bb1723d2fe17")
    @Override
    public EList<BpmnOperation> getOperation() {
        return new SmList<>(this, ((BpmnInterfaceSmClass)getClassOf()).getOperationDep());
    }

    @objid ("494d716a-aaa6-4046-8b7e-b464989bb30e")
    @Override
    public <T extends BpmnOperation> List<T> getOperation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnOperation element : getOperation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("417095c1-295c-4fc7-8f86-a098d10f936b")
    @Override
    public EList<BpmnParticipant> getParticipantRef() {
        return new SmList<>(this, ((BpmnInterfaceSmClass)getClassOf()).getParticipantRefDep());
    }

    @objid ("8ee547ca-a843-46fc-b002-5148048ad487")
    @Override
    public <T extends BpmnParticipant> List<T> getParticipantRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnParticipant element : getParticipantRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e467041c-0027-4d3a-9dac-061f87f1410a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("88a5015f-7071-485b-a9a3-56151bae8f76")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("87f92dcf-15b8-4e58-9506-0bd5c0e68708")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnInterface(this);
        else
          return null;
    }

}
