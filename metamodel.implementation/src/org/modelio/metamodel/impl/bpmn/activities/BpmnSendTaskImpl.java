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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0082b734-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSendTaskImpl extends BpmnTaskImpl implements BpmnSendTask {
    @objid ("5db69b91-5ae1-465d-bc44-b3e68b78530c")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnSendTaskData.Metadata.ImplementationAtt());
    }

    @objid ("6c0046c4-62f0-48f9-973f-9ae1c46da4bf")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnSendTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("ecebfd3a-2a89-4fbb-a1b0-07ba7c9cac64")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnSendTaskData.Metadata.MessageRefDep());
    }

    @objid ("02fcf23a-69ee-45ed-b3a2-1d3592442db0")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnSendTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("910e3e4f-eef1-412b-b267-b4901fcf2976")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnSendTaskData.Metadata.OperationRefDep());
    }

    @objid ("f3a24532-bd5e-4014-8fc8-521042b90039")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnSendTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("339b3fca-9f4c-4d84-899a-c70b15753a36")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnSendTaskData.Metadata.CalledOperationDep());
    }

    @objid ("b569dba7-b883-4b23-852d-5c75a0f90dd3")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnSendTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("7692c7f4-ea61-453c-8670-02668a8d6ea0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("68a429e1-e2ae-472c-ab8b-5ce8deee0f83")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8f2c00c0-a673-4190-ad53-9143edfcf672")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSendTask(this);
        else
          return null;
    }

}
