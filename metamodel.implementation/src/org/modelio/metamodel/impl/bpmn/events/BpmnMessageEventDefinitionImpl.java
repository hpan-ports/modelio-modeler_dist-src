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
    @objid ("b028c317-8727-404d-9046-243e5f3f20d2")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep());
    }

    @objid ("e4612a08-1b24-4960-ae2b-649e51ac2577")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("13507752-22a0-424d-ab57-dd8b71b2d95c")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep());
    }

    @objid ("5bbcdda6-cdf8-45e7-8079-f659b838e0f5")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("ade70069-d33c-4218-b66a-0c9bb8fb3a5d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("fcc59206-5009-466a-851b-6b797a4ecfcc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("30a66782-127b-4295-b571-b55605927766")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageEventDefinition(this);
        else
          return null;
    }

}
