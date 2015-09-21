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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0081a92a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnReceiveTaskImpl extends BpmnTaskImpl implements BpmnReceiveTask {
    @objid ("a64813d1-5deb-4395-a3d3-1de809a8c1a0")
    @Override
    public String getImplementation() {
        return (String) getAttVal(((BpmnReceiveTaskSmClass)getClassOf()).getImplementationAtt());
    }

    @objid ("e362a60c-640a-42ca-b5ea-a9ce4a4c3c89")
    @Override
    public void setImplementation(String value) {
        setAttVal(((BpmnReceiveTaskSmClass)getClassOf()).getImplementationAtt(), value);
    }

    @objid ("457f315f-7fac-4470-bb82-d5a497798e03")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(((BpmnReceiveTaskSmClass)getClassOf()).getInstanciateAtt());
    }

    @objid ("e3627a88-ee00-417d-b51b-80974e1b0836")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(((BpmnReceiveTaskSmClass)getClassOf()).getInstanciateAtt(), value);
    }

    @objid ("cfc8d165-c29f-4280-a5d1-ac1fef966870")
    @Override
    public BpmnMessage getMessageRef() {
        Object obj = getDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("1a7f7efa-8ae5-43f0-97ac-930c482e2739")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("acc554e2-a720-43ea-8434-10657367b39a")
    @Override
    public BpmnOperation getOperationRef() {
        Object obj = getDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getOperationRefDep());
        return (obj instanceof BpmnOperation)? (BpmnOperation)obj : null;
    }

    @objid ("95935af0-836b-40ea-9ba3-4cf4be6d48fd")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getOperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("6051d563-cbf5-4631-befb-a7cd92ea7452")
    @Override
    public Operation getCalledOperation() {
        Object obj = getDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getCalledOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("ea417b12-e1b1-41f1-bbb6-8a971d45b8b4")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(((BpmnReceiveTaskSmClass)getClassOf()).getCalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("ab29a01c-6562-4710-b3ab-754e471b3ded")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3558c059-0495-477a-a086-dc375e5b65b4")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("be8c14d2-97d4-400b-8e94-39e2a366aa74")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnReceiveTask(this);
        else
          return null;
    }

}
