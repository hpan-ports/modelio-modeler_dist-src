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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("f704f22e-5482-4727-bb11-964cb2a65d6a")
    @Override
    public BpmnTask getCalledGlobalTask() {
        return (BpmnTask) getDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep());
    }

    @objid ("19199a42-8839-4a19-805d-1573d3a6a657")
    @Override
    public void setCalledGlobalTask(BpmnTask value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledGlobalTaskDep(), (SmObjectImpl)value);
    }

    @objid ("31bb74a3-b317-4d6c-b944-024e623a2089")
    @Override
    public BpmnProcess getCalledProcess() {
        return (BpmnProcess) getDepVal(BpmnCallActivityData.Metadata.CalledProcessDep());
    }

    @objid ("110735fc-00ec-47c4-bf46-bdc468153fd9")
    @Override
    public void setCalledProcess(BpmnProcess value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledProcessDep(), (SmObjectImpl)value);
    }

    @objid ("23ff3456-b9a2-4d3f-8baf-0af177bf2657")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnCallActivityData.Metadata.CalledOperationDep());
    }

    @objid ("0b5f3e09-05d0-4160-9242-d1bef7c7d5b3")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("e4743ff4-4476-4aad-be35-012a6b442e21")
    @Override
    public Behavior getCalledBehavior() {
        return (Behavior) getDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep());
    }

    @objid ("40504fd8-ae38-41d6-85c1-25ab776857a2")
    @Override
    public void setCalledBehavior(Behavior value) {
        appendDepVal(BpmnCallActivityData.Metadata.CalledBehaviorDep(), (SmObjectImpl)value);
    }

    @objid ("bc8e7dc8-5003-4cbd-be2c-d00b215843b4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("8e2dc8f3-cd52-448d-97a3-3289792deddd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4fd781f8-de65-4bc5-a111-ac67dddf44a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCallActivity(this);
        else
          return null;
    }

}
