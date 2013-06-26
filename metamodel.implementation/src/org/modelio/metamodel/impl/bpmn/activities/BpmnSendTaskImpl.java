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
    @objid ("93fd3d84-8cc4-423e-b1e6-9b438f935aec")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnSendTaskData.Metadata.ImplementationAtt());
    }

    @objid ("c43f5ad7-7438-4063-8b64-0651f586f095")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnSendTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("ace608a4-b166-4209-bb74-def11953d5d2")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnSendTaskData.Metadata.MessageRefDep());
    }

    @objid ("7c50d3bd-d86e-4f8a-96ed-9d93612abd57")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnSendTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("b36dab63-339c-4dd4-9e6c-7f777d3da58b")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnSendTaskData.Metadata.OperationRefDep());
    }

    @objid ("31c5145d-3ebc-40ab-a489-aad417893ce2")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnSendTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("fe6bc13e-c130-4877-82e1-0b2c2d51a121")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnSendTaskData.Metadata.CalledOperationDep());
    }

    @objid ("532a9b15-02c8-4958-b5a6-865725630a3b")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnSendTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("113d2a96-b348-479a-a88f-9affd8dc3f6c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("0d2897f9-8b91-4fc1-a2cf-96d02ce99b88")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e8d37122-8b6c-466c-bb73-3975b502032e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSendTask(this);
        else
          return null;
    }

}
