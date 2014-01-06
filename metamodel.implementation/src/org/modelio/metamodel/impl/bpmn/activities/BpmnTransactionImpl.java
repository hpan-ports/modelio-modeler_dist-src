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
    @objid ("7ea25d30-e3e2-4f09-8606-44a8ebc1dd3f")
    @Override
    public String getProtocol() {
        return (String) getAttVal(BpmnTransactionData.Metadata.ProtocolAtt());
    }

    @objid ("a4156301-22cd-4199-a5e9-3ffc1f49e333")
    @Override
    public void setProtocol(String value) {
        setAttVal(BpmnTransactionData.Metadata.ProtocolAtt(), value);
    }

    @objid ("f3459065-1a47-4353-a0b1-1cbc87027f09")
    @Override
    public TransactionMethod getMethod() {
        return (TransactionMethod) getAttVal(BpmnTransactionData.Metadata.MethodAtt());
    }

    @objid ("33776c36-e00e-41ef-9375-1f4d836e986f")
    @Override
    public void setMethod(TransactionMethod value) {
        setAttVal(BpmnTransactionData.Metadata.MethodAtt(), value);
    }

    @objid ("b35ecf04-3ab5-4887-8ce9-0e4c66c64769")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5565a8da-1076-4c24-a338-0ce059777897")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("afa89db3-c2fb-4f04-820b-79c97a99e87d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTransaction(this);
        else
          return null;
    }

}
