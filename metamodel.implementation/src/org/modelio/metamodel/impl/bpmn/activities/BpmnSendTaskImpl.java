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
    @objid ("7f390228-1955-4fff-8bdb-4c6563baa625")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnSendTaskData.Metadata.ImplementationAtt());
    }

    @objid ("416dc564-42e6-436a-90ca-996f6de98e29")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnSendTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("4fd0912e-e54c-4763-a24f-49f768399624")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnSendTaskData.Metadata.MessageRefDep());
    }

    @objid ("72219684-3923-4fed-baaa-6038a9f6c0cb")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnSendTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("de7d5893-06f0-4f56-9ee1-74dd62095b71")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnSendTaskData.Metadata.OperationRefDep());
    }

    @objid ("8c628139-22f9-49f3-a6bb-b1ccedc7b108")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnSendTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("0322425f-c1c7-4be7-9407-534432f27fcd")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnSendTaskData.Metadata.CalledOperationDep());
    }

    @objid ("8d77cb9c-3d21-405c-b6e1-90b3d3129754")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnSendTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("914ddc83-92f0-4779-8f93-db1d77fff912")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("22893b15-5331-4e4f-960d-f3a145323c3a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4ff4f5c4-5518-4877-af45-792c6a77a9bf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSendTask(this);
        else
          return null;
    }

}
