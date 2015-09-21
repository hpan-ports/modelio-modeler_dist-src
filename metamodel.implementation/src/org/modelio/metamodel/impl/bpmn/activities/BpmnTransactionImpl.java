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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.TransactionMethod;
import org.modelio.metamodel.impl.bpmn.activities.BpmnTransactionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0085963e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTransactionImpl extends BpmnSubProcessImpl implements BpmnTransaction {
    @objid ("159068c0-12c1-4174-95e1-dd374b01aada")
    @Override
    public String getProtocol() {
        return (String) getAttVal(((BpmnTransactionSmClass)getClassOf()).getProtocolAtt());
    }

    @objid ("51c4b721-faa2-4107-a5fa-c561be7ea461")
    @Override
    public void setProtocol(String value) {
        setAttVal(((BpmnTransactionSmClass)getClassOf()).getProtocolAtt(), value);
    }

    @objid ("9176344f-8bf0-4e6d-b70e-2e4fff5b8202")
    @Override
    public TransactionMethod getMethod() {
        return (TransactionMethod) getAttVal(((BpmnTransactionSmClass)getClassOf()).getMethodAtt());
    }

    @objid ("46305877-9dec-425f-9c75-2cb42afc1b23")
    @Override
    public void setMethod(TransactionMethod value) {
        setAttVal(((BpmnTransactionSmClass)getClassOf()).getMethodAtt(), value);
    }

    @objid ("8d256ede-5d80-4e44-9d97-101f2a2587cf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b9936dc1-3070-4617-8b96-de33782e2edf")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("7491dca9-6e12-48d3-87c4-c540b328a02c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTransaction(this);
        else
          return null;
    }

}
