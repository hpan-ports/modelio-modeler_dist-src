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
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskData;
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

@objid ("0082b734-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSendTaskImpl extends BpmnTaskImpl implements BpmnSendTask {
    @objid ("5ea66910-460f-4633-9caf-a9bd307ebd28")
    @Override
    public String getImplementation() {
        return (String) getAttVal(((BpmnSendTaskSmClass)getClassOf()).getImplementationAtt());
    }

    @objid ("1f483f6d-c88f-4d86-b9c3-dea3b32c0856")
    @Override
    public void setImplementation(String value) {
        setAttVal(((BpmnSendTaskSmClass)getClassOf()).getImplementationAtt(), value);
    }

    @objid ("b264f9ad-79c2-42da-b122-d10e68ff1583")
    @Override
    public BpmnMessage getMessageRef() {
        Object obj = getDepVal(((BpmnSendTaskSmClass)getClassOf()).getMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("1aa510b7-f4a1-4222-90f0-e1839a893481")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnSendTaskSmClass)getClassOf()).getMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("8c60cccd-cd24-4246-9b7b-410b844151fa")
    @Override
    public BpmnOperation getOperationRef() {
        Object obj = getDepVal(((BpmnSendTaskSmClass)getClassOf()).getOperationRefDep());
        return (obj instanceof BpmnOperation)? (BpmnOperation)obj : null;
    }

    @objid ("472e377f-a369-4c23-a210-4372678097d3")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(((BpmnSendTaskSmClass)getClassOf()).getOperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("5ccf7044-d2d2-4b2e-a305-307831ac8830")
    @Override
    public Operation getCalledOperation() {
        Object obj = getDepVal(((BpmnSendTaskSmClass)getClassOf()).getCalledOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("0d79dd5b-9bc3-41c6-a427-26a275b31c92")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(((BpmnSendTaskSmClass)getClassOf()).getCalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("0bd36e2e-97ec-4b09-a486-2766c800d008")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("67455130-fd0d-462b-9127-6ae3d95747b6")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("0e3f1864-6187-4e3a-9ad0-bb08230fd461")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSendTask(this);
        else
          return null;
    }

}
