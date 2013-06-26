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
    @objid ("4e3bcda5-ca8d-4bdf-8073-66c111e25465")
    @Override
    public BpmnGatewayDirection getGatewayDirection() {
        return (BpmnGatewayDirection) getAttVal(BpmnGatewayData.Metadata.GatewayDirectionAtt());
    }

    @objid ("d3e8eb8f-08ec-47bd-8f98-b062c6c9ffd0")
    @Override
    public void setGatewayDirection(BpmnGatewayDirection value) {
        setAttVal(BpmnGatewayData.Metadata.GatewayDirectionAtt(), value);
    }

    @objid ("e50d0e21-24b9-4a87-9ba4-34e5406cc02a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1ae42e42-22b6-47b5-8098-007fb52469b9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("91dc0887-0a64-47dd-b5d1-4ee31532cb17")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnGateway(this);
        else
          return null;
    }

}
