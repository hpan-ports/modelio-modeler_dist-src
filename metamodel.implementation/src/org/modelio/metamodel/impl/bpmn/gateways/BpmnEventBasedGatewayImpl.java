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
    @objid ("a390cf36-dc0a-4ab3-bbc9-5f0c4b643eae")
    @Override
    public boolean isInstanciate() {
        return (Boolean) getAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt());
    }

    @objid ("f1ebed1e-5175-4abe-99b5-6a58cafb8d68")
    @Override
    public void setInstanciate(boolean value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.InstanciateAtt(), value);
    }

    @objid ("8ea85334-7ade-43fb-afb7-8e01f27eba2d")
    @Override
    public BpmnEventBasedGatewayType getEventGatewayType() {
        return (BpmnEventBasedGatewayType) getAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt());
    }

    @objid ("c3607a05-be1e-40c4-b93d-29c4fd709e11")
    @Override
    public void setEventGatewayType(BpmnEventBasedGatewayType value) {
        setAttVal(BpmnEventBasedGatewayData.Metadata.EventGatewayTypeAtt(), value);
    }

    @objid ("ece22eac-85ce-47eb-a356-3f215cbf0c5d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6c2150e2-6740-4244-a896-543b1f44ec30")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("81026c28-6449-455b-b17c-c4e3e8858a34")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEventBasedGateway(this);
        else
          return null;
    }

}
