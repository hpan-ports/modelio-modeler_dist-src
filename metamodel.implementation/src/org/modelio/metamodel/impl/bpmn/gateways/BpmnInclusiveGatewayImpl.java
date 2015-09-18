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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.data.bpmn.gateways.BpmnInclusiveGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0001d7d6-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnInclusiveGatewayImpl extends BpmnGatewayImpl implements BpmnInclusiveGateway {
    @objid ("0dd3927b-2504-45d4-bdef-af6552caecb9")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnInclusiveGatewayData.Metadata.DefaultFlowDep());
    }

    @objid ("356c5028-c250-4b8e-bfee-dcb5211adbd3")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnInclusiveGatewayData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("0c4a6bca-300b-4f25-9c8d-7948a659a070")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("7c257b67-470b-4d39-82f3-763bddc34590")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("52024cd4-ffce-45a7-b01c-e1b9a5b1a9da")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnInclusiveGateway(this);
        else
          return null;
    }

}
