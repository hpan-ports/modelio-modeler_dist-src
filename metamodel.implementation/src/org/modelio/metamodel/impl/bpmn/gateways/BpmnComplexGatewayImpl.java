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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.data.bpmn.gateways.BpmnComplexGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00976e68-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnComplexGatewayImpl extends BpmnGatewayImpl implements BpmnComplexGateway {
    @objid ("1f6d0106-21b9-4053-be79-131dd627cbc2")
    @Override
    public String getActivationExpression() {
        return (String) getAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt());
    }

    @objid ("f748d45b-069d-45b8-bc59-8c265d69175c")
    @Override
    public void setActivationExpression(String value) {
        setAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt(), value);
    }

    @objid ("8230339e-3325-4520-b865-0dbe20c983eb")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep());
    }

    @objid ("4ec16760-6ce7-4a7a-a491-6bf91e5fc856")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("44d9d642-d3ee-409c-9a6f-cc0fd636730a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("da5093b0-84da-4790-8a2b-f61ed5e0eeb4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bea83f7b-1e17-4f60-b912-e9f9f47de967")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexGateway(this);
        else
          return null;
    }

}
