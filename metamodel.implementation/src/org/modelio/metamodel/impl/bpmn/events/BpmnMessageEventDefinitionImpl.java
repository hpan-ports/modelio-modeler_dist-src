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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("009101a4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnMessageEventDefinition {
    @objid ("a8948b23-2252-4ca2-bd6e-1d9f14087d7b")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep());
    }

    @objid ("87d5f237-6965-42b0-9b74-91086f08bcec")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("8418f154-d320-49c1-82b9-8ff3e3b0083c")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep());
    }

    @objid ("6b7834fe-bee9-4e73-ad73-1a5b33236825")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("3c13cb8a-34fe-4793-8d4a-b02db0000c3e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("13272fd3-2230-4935-a265-e8ba443b259c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8f60c377-c38d-46e7-b695-0e02c528ae9f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageEventDefinition(this);
        else
          return null;
    }

}
