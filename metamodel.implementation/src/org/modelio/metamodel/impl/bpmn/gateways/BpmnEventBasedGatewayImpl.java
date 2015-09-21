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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnEventBasedGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("009813cc-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEventBasedGatewayImpl extends BpmnGatewayImpl implements BpmnEventBasedGateway {
    @objid ("e8822a42-1a4f-4bb4-a52b-d47eaf8a9d01")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(((BpmnEventBasedGatewaySmClass)getClassOf()).getInstanciateAtt());
    }

    @objid ("38e8dfe2-d6ed-46d8-a793-f0f273145da0")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(((BpmnEventBasedGatewaySmClass)getClassOf()).getInstanciateAtt(), value);
    }

    @objid ("0da86798-a2b5-46cf-97c7-e9be69d7e2a9")
    @Override
    public BpmnEventBasedGatewayType getEventGatewayType() {
        return (BpmnEventBasedGatewayType) getAttVal(((BpmnEventBasedGatewaySmClass)getClassOf()).getEventGatewayTypeAtt());
    }

    @objid ("169b5e12-bfbf-417f-bb33-0ca77d989068")
    @Override
    public void setEventGatewayType(BpmnEventBasedGatewayType value) {
        setAttVal(((BpmnEventBasedGatewaySmClass)getClassOf()).getEventGatewayTypeAtt(), value);
    }

    @objid ("abd374df-158a-40f7-b64a-2dee42192109")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("fa2f00f4-7d54-43ae-8051-bfd1facec24a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("ed9081a8-35e9-4c02-9eee-15a7c3fc349e")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventBasedGateway(this);
        else
          return null;
    }

}
