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
    @objid ("645ac745-e987-4d24-96e6-ab1e9e564e5b")
    @Override
    public BpmnMessage getMessageRef() {
        return (BpmnMessage) getDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep());
    }

    @objid ("7a7c5790-16d4-4f1b-a213-4d1ce03eeb8e")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.MessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("414c15da-5e2c-44bd-a785-93663ad8ed69")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep());
    }

    @objid ("21f5dac4-2c8c-4fc2-8534-e38cdced61e1")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnMessageEventDefinitionData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("6da454c5-03c4-4cca-b96f-68d8828d8878")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("936265c5-72c0-4ab5-a4c6-bbb388276b66")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("18428d86-1fc1-4d1d-bec1-ec9ae3c19804")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageEventDefinition(this);
        else
          return null;
    }

}
