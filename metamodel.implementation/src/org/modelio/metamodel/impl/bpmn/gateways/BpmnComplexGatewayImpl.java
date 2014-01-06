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
    @objid ("e3016df2-828d-4bb3-9e00-111919441794")
    @Override
    public String getActivationExpression() {
        return (String) getAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt());
    }

    @objid ("5cca9984-6366-4692-8d97-ccba55c96859")
    @Override
    public void setActivationExpression(String value) {
        setAttVal(BpmnComplexGatewayData.Metadata.ActivationExpressionAtt(), value);
    }

    @objid ("51b6fb9a-76dc-46c3-9ab7-e36c7d304fc8")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep());
    }

    @objid ("b747f845-ae61-4049-9998-93931e72c722")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnComplexGatewayData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("da6f7546-8087-4110-bd05-9c2da4c39211")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("920843d6-39ee-4727-a616-aa56f8f92dce")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5d545dc6-c97b-4838-9a19-7659d8c67e8c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnComplexGateway(this);
        else
          return null;
    }

}
