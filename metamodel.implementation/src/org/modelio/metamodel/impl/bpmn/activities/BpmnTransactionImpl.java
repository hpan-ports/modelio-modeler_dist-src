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
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.data.bpmn.activities.BpmnTransactionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0085963e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTransactionImpl extends BpmnSubProcessImpl implements BpmnTransaction {
    @objid ("ec5df7d5-d23b-4f1d-b0ef-f4751b9156b3")
    @Override
    public String getProtocol() {
        return (String) getAttVal(BpmnTransactionData.Metadata.ProtocolAtt());
    }

    @objid ("0813e090-cb69-49b9-9fda-665d7d67f2ac")
    @Override
    public void setProtocol(String value) {
        setAttVal(BpmnTransactionData.Metadata.ProtocolAtt(), value);
    }

    @objid ("c9fe5f11-a46c-48b2-8267-618627f37dc9")
    @Override
    public TransactionMethod getMethod() {
        return (TransactionMethod) getAttVal(BpmnTransactionData.Metadata.MethodAtt());
    }

    @objid ("8e8ff3c6-875d-49e1-a875-f3e741cbc02c")
    @Override
    public void setMethod(TransactionMethod value) {
        setAttVal(BpmnTransactionData.Metadata.MethodAtt(), value);
    }

    @objid ("37a3b27f-aa2f-4af4-9782-aaacf60009ea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e49f4887-ba1f-4c42-ae40-ea8ce50698b0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("dd0db089-4710-40ae-939e-73557a319265")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTransaction(this);
        else
          return null;
    }

}
