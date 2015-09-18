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
    @objid ("e6ad0053-bf0f-4750-b0e1-c5a9489e9706")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt());
    }

    @objid ("5ca16231-e7e1-43a8-a576-7fd22b560c9d")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnReceiveTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("b045f588-b565-44ee-895e-acf303614d86")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt());
    }

    @objid ("cb600191-328c-4af2-9dc7-eccfad80f78a")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnReceiveTaskData.Metadata.InstanciateAtt(), value);
    }

    @objid ("d60e8ffd-0f85-4e69-8881-828feb8e2221")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep());
    }

    @objid ("c11d9d56-330d-491a-a6fb-f4fbbd5a7c93")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("bbc755dd-4feb-43d4-9154-3f96aa0bc8e4")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep());
    }

    @objid ("8ee1fb19-ca0f-4db8-bac3-b2eff641b69f")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("709fdf99-6355-46b0-a540-91783331172e")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep());
    }

    @objid ("7336134e-e753-4d9c-bc64-45d18946c285")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnReceiveTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("0ec12461-5d65-4ed1-b75a-1a8030a87905")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("347a4fde-9e94-4ab8-af08-c38455c3767e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b5290c56-73e3-4c33-87e4-b8d4668d739e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnReceiveTask(this);
        else
          return null;
    }

}
