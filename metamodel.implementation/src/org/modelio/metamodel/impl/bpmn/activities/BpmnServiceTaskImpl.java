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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00833fec-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnServiceTaskImpl extends BpmnTaskImpl implements BpmnServiceTask {
    @objid ("03c82b5c-57f5-41a7-bc10-a23beeed179c")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt());
    }

    @objid ("4b9f1d71-396e-4249-bff6-eaec315f08c0")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("e3904ea2-93fd-44d0-99d5-2fa80b22d4f0")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep());
    }

    @objid ("d8b4ab9f-0ab0-427c-872e-846c89267129")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("4a0d692e-d33b-46ef-ba76-2a9c1b3dd9fc")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnServiceTaskData.Metadata.OperationRefDep());
    }

    @objid ("dd9f66c6-4368-425e-b3a6-629aa5aa6d28")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("561cc92a-6a63-4d1d-9151-e6f62b771d74")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f87fe053-c7dd-4821-a29e-fd1f1146d5fa")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2f6bc295-cfcc-4d21-8002-16e3b313e477")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnServiceTask(this);
        else
          return null;
    }

}
