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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.impl.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("009101a4-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnMessageEventDefinition {
    @objid ("4ee9d282-1b9f-43db-aff6-76610532d32a")
    @Override
    public BpmnMessage getMessageRef() {
        Object obj = getDepVal(((BpmnMessageEventDefinitionSmClass)getClassOf()).getMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("cc065a24-c77c-4125-b667-02b143b12efc")
    @Override
    public void setMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnMessageEventDefinitionSmClass)getClassOf()).getMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("0d685d9c-ad29-4562-bd35-6fe05faa75e0")
    @Override
    public BpmnOperation getOperationRef() {
        Object obj = getDepVal(((BpmnMessageEventDefinitionSmClass)getClassOf()).getOperationRefDep());
        return (obj instanceof BpmnOperation)? (BpmnOperation)obj : null;
    }

    @objid ("f0f2f027-7034-429d-acb5-32e10cd4a121")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(((BpmnMessageEventDefinitionSmClass)getClassOf()).getOperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("44928578-e4d0-4030-bf33-9b79d8c24619")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("264754da-bd51-422e-9546-720b85790128")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("edb3e6d2-250d-46c0-9220-a40a3dda5da0")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessageEventDefinition(this);
        else
          return null;
    }

}
