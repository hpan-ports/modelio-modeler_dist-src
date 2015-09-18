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
    @objid ("71df79ac-0091-4908-8497-0d5322faeec5")
    @Override
    public String getActivationExpression() {
        return (String) getAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt());
    }

    @objid ("95ce30c6-3af7-495b-ab49-ab994b7bc7e2")
    @Override
    public void setActivationExpression(String value) {
        setAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt(), value);
    }

    @objid ("d0481ffd-3b15-4412-a040-d660daca9e2d")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep());
    }

    @objid ("bb9ef7dc-f384-432d-a36d-6994b9b0af79")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("6da277c9-37b7-4616-abfe-8a7e1e41bd5a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("4b3e1b73-1ed6-4cfd-b7c3-19ea95dd5720")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2e6f3daa-be9f-453e-8d29-ae59c0fe9421")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexGateway(this);
        else
          return null;
    }

}
