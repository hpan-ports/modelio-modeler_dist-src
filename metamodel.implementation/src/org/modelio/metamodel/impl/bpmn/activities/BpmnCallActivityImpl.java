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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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

@objid ("007f281c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCallActivityImpl extends BpmnActivityImpl implements BpmnCallActivity {
    @objid ("340f4f72-bc23-4aa0-9cf8-35dcb8a29b40")
    @Override
    public BpmnTask getCalledGlobalTask() {
        Object obj = getDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledGlobalTaskDep());
        return (obj instanceof BpmnTask)? (BpmnTask)obj : null;
    }

    @objid ("8579aa7b-44c4-406e-ba04-2e349773194c")
    @Override
    public void setCalledGlobalTask(BpmnTask value) {
        appendDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledGlobalTaskDep(), (SmObjectImpl)value);
    }

    @objid ("3f3e8f7b-5d5f-470a-bfc7-e9cb29e4f7d3")
    @Override
    public BpmnProcess getCalledProcess() {
        Object obj = getDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledProcessDep());
        return (obj instanceof BpmnProcess)? (BpmnProcess)obj : null;
    }

    @objid ("b8296aa9-dee2-41ba-bac0-64f73bfcccc4")
    @Override
    public void setCalledProcess(BpmnProcess value) {
        appendDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledProcessDep(), (SmObjectImpl)value);
    }

    @objid ("52834db1-b083-48d8-9704-10ba64c421a3")
    @Override
    public Operation getCalledOperation() {
        Object obj = getDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("82636cb2-be9c-42f2-8652-25a59bbac8fe")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("d1d5f009-3d55-4009-bbb2-91395376c93d")
    @Override
    public Behavior getCalledBehavior() {
        Object obj = getDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledBehaviorDep());
        return (obj instanceof Behavior)? (Behavior)obj : null;
    }

    @objid ("ad11cda2-7224-444e-95e5-c8eeaed5e7ee")
    @Override
    public void setCalledBehavior(Behavior value) {
        appendDepVal(((BpmnCallActivitySmClass)getClassOf()).getCalledBehaviorDep(), (SmObjectImpl)value);
    }

    @objid ("08bc71ec-6a2f-4c45-8d31-4ee85804c4b4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("7ed69b82-44fc-47af-b962-7ff79313ef07")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("014e2162-e3ea-42fe-898a-b0798e4496e3")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCallActivity(this);
        else
          return null;
    }

}
