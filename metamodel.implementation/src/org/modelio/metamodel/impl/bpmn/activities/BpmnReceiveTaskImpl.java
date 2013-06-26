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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0081a92a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnReceiveTaskImpl extends BpmnTaskImpl implements BpmnReceiveTask {
    @objid ("12e40813-c284-4acf-993e-2e2a27976de9")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt());
    }

    @objid ("7c14eaa5-5af0-40b1-be68-db58a611bf75")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("c33bfe78-9f89-45f7-8583-d1e9d0bd96f5")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt());
    }

    @objid ("70a825e7-e059-4d47-be6e-77c0b5ec4bbb")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt(), value);
    }

    @objid ("c2cdfd11-6de8-4cbc-a823-fcf7415754d9")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep());
    }

    @objid ("6c1fef24-cae4-47f1-bc92-cab07f33a23b")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("24ae5f5d-5530-413f-971e-84a06fd38601")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep());
    }

    @objid ("c2aa56ce-96af-4e2c-9310-3b327e3b3159")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("6cfa00db-8104-4f0c-a873-beeb68509914")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep());
    }

    @objid ("a1ca026d-888a-4819-bed2-a5bc4ac4b37d")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("cab21a8d-e80c-4aff-b432-f01f3b14012a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("66d9169b-9b80-4296-a481-3fc5da356f06")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("02e7ad8e-777d-476e-aff6-06ba9d66c671")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnReceiveTask(this);
        else
          return null;
    }

}
