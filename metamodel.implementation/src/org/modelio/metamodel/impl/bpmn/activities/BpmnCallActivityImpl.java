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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
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

@objid ("007f281c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCallActivityImpl extends BpmnActivityImpl implements BpmnCallActivity {
    @objid ("000868f3-c824-4271-b639-d1cdf3a92cb9")
    @Override
    public BpmnTask getCalledGlobalTask() {
        return (BpmnTask) getDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep());
    }

    @objid ("fad2c1ac-b2be-4b91-9038-b4a6b8458fde")
    @Override
    public void setCalledGlobalTask(BpmnTask value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep(), (SmObjectImpl)value);
    }

    @objid ("8355c49a-0589-4ff7-9e76-b220991d94a3")
    @Override
    public BpmnProcess getCalledProcess() {
        return (BpmnProcess) getDepVal(BpmnCallActivityData.Metadata.CalledProcessDep());
    }

    @objid ("aff0f052-8e65-49c7-b3ee-a27c5db1e137")
    @Override
    public void setCalledProcess(BpmnProcess value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledProcessDep(), (SmObjectImpl)value);
    }

    @objid ("8e14f58f-597a-4d46-ab8e-69281be60081")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnCallActivityData.Metadata.CalledOperationDep());
    }

    @objid ("7dcded7f-a5cd-44e3-9b9e-493c367b9e2f")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("238c6076-d583-448b-a16d-17d712983b22")
    @Override
    public Behavior getCalledBehavior() {
        return (Behavior) getDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep());
    }

    @objid ("92b140ff-ad3e-42fe-9f2c-b7c5ec25641e")
    @Override
    public void setCalledBehavior(Behavior value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep(), (SmObjectImpl)value);
    }

    @objid ("4637cc9d-35f5-4c02-ab09-85812e4f8a6c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("adc37025-9e54-40f6-9bf2-2f2fbd6abff8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5c4342ec-542b-48c6-8286-0c8951a0eb40")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCallActivity(this);
        else
          return null;
    }

}
