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
    @objid ("2e47bfc7-d63a-4ca0-a2ee-0c382c8c1538")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt());
    }

    @objid ("0c12b40d-14fe-4490-a808-952110415bf7")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt(), value);
    }

    @objid ("fd251bb3-37c5-454b-be6d-5e70e14fa72f")
    @Override
    public BpmnEventBasedGatewayType getEventGatewayType() {
        return (BpmnEventBasedGatewayType) getAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt());
    }

    @objid ("902d60b0-6842-4d28-b7bd-1d76b76a1496")
    @Override
    public void setEventGatewayType(BpmnEventBasedGatewayType value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt(), value);
    }

    @objid ("83ddb942-46d3-468e-ab3e-e586cfbeea67")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("aa753244-ac35-438d-b061-e89654735f19")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("8155ec34-b641-43c7-bf86-ec1c241bb930")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventBasedGateway(this);
        else
          return null;
    }

}
