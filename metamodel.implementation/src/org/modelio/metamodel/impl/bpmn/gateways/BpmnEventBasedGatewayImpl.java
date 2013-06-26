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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;
import org.modelio.metamodel.data.bpmn.gateways.BpmnEventBasedGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("009813cc-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEventBasedGatewayImpl extends BpmnGatewayImpl implements BpmnEventBasedGateway {
    @objid ("e87526a7-fc22-41c4-9e12-36168111ef47")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt());
    }

    @objid ("eaef43aa-631b-4a3a-bd4c-253596545842")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt(), value);
    }

    @objid ("8f5e86a5-5a43-495c-a1b6-860d677ec718")
    @Override
    public BpmnEventBasedGatewayType getEventGatewayType() {
        return (BpmnEventBasedGatewayType) getAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt());
    }

    @objid ("64017935-408d-4e2a-bcc3-841f143e917a")
    @Override
    public void setEventGatewayType(BpmnEventBasedGatewayType value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt(), value);
    }

    @objid ("f3ddbb0d-f241-42f7-9044-a586cb8cf6f3")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1ef8f09b-35ac-4d60-b636-117c27ba79ec")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("3d94fc48-e731-4467-945f-34acb239bad2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventBasedGateway(this);
        else
          return null;
    }

}
