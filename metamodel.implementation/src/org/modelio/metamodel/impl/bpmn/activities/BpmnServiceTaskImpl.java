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
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00833fec-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnServiceTaskImpl extends BpmnTaskImpl implements BpmnServiceTask {
    @objid ("e0dce50c-b95a-40ac-ad91-5b9e2ed2e03b")
    @Override
    public String getImplementation() {
        return (String) getAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt());
    }

    @objid ("faa62508-5c15-4962-acb3-a3c51d50d698")
    @Override
    public void setImplementation(String value) {
        setAttVal(BpmnServiceTaskData.Metadata.ImplementationAtt(), value);
    }

    @objid ("bc3ae3ee-de08-4984-999e-4204e8e04984")
    @Override
    public Operation getCalledOperation() {
        return (Operation) getDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep());
    }

    @objid ("1c55bda4-8585-4471-913a-c44ed6ffe5a0")
    @Override
    public void setCalledOperation(Operation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.CalledOperationDep(), (SmObjectImpl)value);
    }

    @objid ("7d2e178f-6424-463f-a066-c5a47bedb694")
    @Override
    public BpmnOperation getOperationRef() {
        return (BpmnOperation) getDepVal(BpmnServiceTaskData.Metadata.OperationRefDep());
    }

    @objid ("1e23b8d4-5da9-417c-af20-4ec33ed80b1d")
    @Override
    public void setOperationRef(BpmnOperation value) {
        appendDepVal(BpmnServiceTaskData.Metadata.OperationRefDep(), (SmObjectImpl)value);
    }

    @objid ("922b1be7-d38c-45fe-8f92-7651e22d7dd6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d017a307-d931-4437-8f09-692b141d01bb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("69302493-442a-4d46-a302-44ff16100ca5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnServiceTask(this);
        else
          return null;
    }

}
