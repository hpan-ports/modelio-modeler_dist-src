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
    @objid ("8382b9cd-6911-4fa8-8d20-cd9785fece6d")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt());
    }

    @objid ("311294c1-e849-4e3a-b90a-36546bae53de")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("457d6ff8-6cf3-4b04-952f-f3db36207a5e")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt());
    }

    @objid ("623a497d-b88e-42b2-8a89-f754b5f0fc4f")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt(), value);
    }

    @objid ("5b8b9c8f-41c0-4fe7-bfb3-ac9a038198a4")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep());
    }

    @objid ("4e3dfc1f-c993-4ff2-826b-8968934e7b81")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("53f8ef4b-d80f-444e-919c-8ef8ca75e1a0")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep());
    }

    @objid ("fa50c615-0715-4528-82e3-f4d5f213b7fe")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("f21d3dbf-da69-4239-9a24-de7b7dc191c1")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep());
    }

    @objid ("aed4097d-ffd1-4e35-acea-9cc40ffacff5")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("3ce86e40-2baa-4130-8379-5b1460683596")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("160db990-ad68-4238-98fe-7ff11dbbddbc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("21553e60-bce1-4316-8783-6cb3bf618bce")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnReceiveTask(this);
        else
          return null;
    }

}
