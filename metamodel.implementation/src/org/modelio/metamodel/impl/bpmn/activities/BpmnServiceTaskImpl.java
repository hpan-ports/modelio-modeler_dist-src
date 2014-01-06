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
    @objid ("91a69d81-c426-44f7-8170-048f86baa2f7")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt());
    }

    @objid ("6c8f2eac-3b14-47d6-9616-a6a3db9afdb1")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("01b2369d-53d6-49e5-894c-246018b0724e")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep());
    }

    @objid ("cd489969-4ce2-4056-b8e7-2a0590f3a4bd")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("f9ddcf6c-44f8-4d26-bc1b-8770e9a2215d")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnServiceTaskData.Metadata.OperationRefDep());
    }

    @objid ("1aca6a5c-33b3-47b2-ba20-89cbe0494017")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("8544712e-be32-463f-9f4d-40336babf0d7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8df0de64-0bfd-4616-9512-abcadc020d8a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("206ae69c-aa1e-4d02-bd3a-4f4f29f6696e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnServiceTask(this);
        else
          return null;
    }

}
