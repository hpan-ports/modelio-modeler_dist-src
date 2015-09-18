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
package org.modelio.metamodel.impl.bpmn.gateways;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGatewayDirection;
import org.modelio.metamodel.data.bpmn.gateways.BpmnGatewayData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00012282-c4c0-1fd8-97fe-001ec947cd2a")
public abstract class BpmnGatewayImpl extends BpmnFlowNodeImpl implements BpmnGateway {
    @objid ("6964c70d-8863-4230-a918-dd0780a720aa")
    @Override
    public BpmnGatewayDirection getGatewayDirection() {
        return (BpmnGatewayDirection) getAttVal(BpmnGatewayData.Metadata.GatewayDirectionAtt());
    }

    @objid ("fe36bdce-9860-4031-9f48-2bd20872ebe6")
    @Override
    public void setGatewayDirection(BpmnGatewayDirection value) {
        setAttVal(BpmnGatewayData.Metadata.GatewayDirectionAtt(), value);
    }

    @objid ("3caf1384-3ea9-43cb-b531-60d15668d2ca")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f6d0105c-2aa0-4b97-a975-2ef6f9be9dc8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5cbd1822-a21e-455d-8c3f-0dc593badc37")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnGateway(this);
        else
          return null;
    }

}
