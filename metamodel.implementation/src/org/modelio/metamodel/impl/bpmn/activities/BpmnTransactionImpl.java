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
    @objid ("975573ae-a307-4d64-8a0c-9e9eb25d4f72")
    @Override
    public String getProtocol() {
        return (String) getAttVal(BpmnTransactionData.Metadata.ProtocolAtt());
    }

    @objid ("dabdc6d1-3b63-48a5-972e-cf383c55fc2b")
    @Override
    public void setProtocol(String value) {
        setAttVal(BpmnTransactionData.Metadata.ProtocolAtt(), value);
    }

    @objid ("8d1c6a34-33e0-46e1-b288-d9606f21d210")
    @Override
    public TransactionMethod getMethod() {
        return (TransactionMethod) getAttVal(BpmnTransactionData.Metadata.MethodAtt());
    }

    @objid ("285508e3-727a-4ba6-8232-b8c00982cd75")
    @Override
    public void setMethod(TransactionMethod value) {
        setAttVal(BpmnTransactionData.Metadata.MethodAtt(), value);
    }

    @objid ("47e1a6b5-378e-4d72-965e-a8e4260cb9d4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b61a7a34-2a38-4e4f-bcc0-a555ed92bb94")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("7cbfa25b-bd1a-4b6c-a034-49133dab5602")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTransaction(this);
        else
          return null;
    }

}
