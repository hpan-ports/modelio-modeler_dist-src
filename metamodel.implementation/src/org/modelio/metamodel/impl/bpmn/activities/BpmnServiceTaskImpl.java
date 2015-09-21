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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.impl.bpmn.activities.BpmnServiceTaskData;
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

@objid ("00833fec-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnServiceTaskImpl extends BpmnTaskImpl implements BpmnServiceTask {
    @objid ("538e105e-668c-4448-93e8-432065f9d750")
    @Override
    public String getImplementation() {
        return (String) getAttVal(((BpmnServiceTaskSmClass)getClassOf()).getImplementationAtt());
    }

    @objid ("f832a69f-0b4c-463f-b1ab-f73a6c9105c8")
    @Override
    public void setImplementation(String value) {
        setAttVal(((BpmnServiceTaskSmClass)getClassOf()).getImplementationAtt(), value);
    }

    @objid ("57894426-f4d5-43b1-a1b1-775fe50ca604")
    @Override
    public Operation getCalledOperation() {
        Object obj = getDepVal(((BpmnServiceTaskSmClass)getClassOf()).getCalledOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("b54d31bf-93a4-476e-a36e-24c5dc5cc9f1")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(((BpmnServiceTaskSmClass)getClassOf()).getCalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("4e178a96-6085-47c8-9ccc-02eebe318b6a")
    @Override
    public BpmnOperation getOperationRef() {
        Object obj = getDepVal(((BpmnServiceTaskSmClass)getClassOf()).getOperationRefDep());
        return (obj instanceof BpmnOperation)? (BpmnOperation)obj : null;
    }

    @objid ("57f09d07-0d4c-47ba-ac23-dba3af61afef")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(((BpmnServiceTaskSmClass)getClassOf()).getOperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("b14bb8d0-4292-418b-827f-62469190b387")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3618502c-8899-4ab0-8ce3-74b0a47f351d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("58de5ca1-62b2-42dd-b34e-a84835eb99a5")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnServiceTask(this);
        else
          return null;
    }

}
