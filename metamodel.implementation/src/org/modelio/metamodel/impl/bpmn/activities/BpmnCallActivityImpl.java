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
    @objid ("32e2a691-414c-4f09-94fc-3c46058ede36")
    @Override
    public BpmnTask getCalledGlobalTask() {
        return (BpmnTask) getDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep());
    }

    @objid ("8eea8bea-d433-4308-80e1-88456d77bcd0")
    @Override
    public void setCalledGlobalTask(BpmnTask value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep(), (SmObjectImpl)value);
    }

    @objid ("843bfbca-732d-409d-8c8b-d6e011d4075a")
    @Override
    public BpmnProcess getCalledProcess() {
        return (BpmnProcess) getDepVal(BpmnCallActivityData.Metadata.CalledProcessDep());
    }

    @objid ("9016a099-1a50-4825-af37-4f6cf92555fc")
    @Override
    public void setCalledProcess(BpmnProcess value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledProcessDep(), (SmObjectImpl)value);
    }

    @objid ("8844be9f-149a-48c6-b40e-eb5b825b3d44")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnCallActivityData.Metadata.CalledOperationDep());
    }

    @objid ("cdfa529b-6d40-40f5-aefe-6ed3e7c3a89d")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("cb13ae5b-bf94-4b82-bb68-814ac6522034")
    @Override
    public Behavior getCalledBehavior() {
        return (Behavior) getDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep());
    }

    @objid ("8b34b6ce-a578-4fe4-b7f3-da68dd12ae4f")
    @Override
    public void setCalledBehavior(Behavior value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep(), (SmObjectImpl)value);
    }

    @objid ("08a16b08-952f-4722-874b-1539fcfb96a1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e21cd264-00f2-4d59-bbb3-d19d0a6a73cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("329fab7c-f4d0-41ff-aa2b-2516fe7d76e1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCallActivity(this);
        else
          return null;
    }

}
