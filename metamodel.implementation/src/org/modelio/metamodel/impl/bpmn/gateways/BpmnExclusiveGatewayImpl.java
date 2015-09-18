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
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.data.bpmn.gateways.BpmnExclusiveGatewayData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00003f2a-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnExclusiveGatewayImpl extends BpmnGatewayImpl implements BpmnExclusiveGateway {
    @objid ("f09a9ec9-e2df-443c-83cb-26c2584d4735")
    @Override
    public BpmnSequenceFlow getDefaultFlow() {
        return (BpmnSequenceFlow) getDepVal(BpmnExclusiveGatewayData.Metadata.DefaultFlowDep());
    }

    @objid ("cd18d20b-589c-49a6-b45c-c880762df037")
    @Override
    public void setDefaultFlow(BpmnSequenceFlow value) {
        appendDepVal(BpmnExclusiveGatewayData.Metadata.DefaultFlowDep(), (SmObjectImpl)value);
    }

    @objid ("fb95c7fb-1f85-4cb6-8703-5c0d8a278687")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d71d08f3-e317-4681-9ca3-220787df1fbd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("598ce1b6-2047-4a08-81d2-252283b71b80")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnExclusiveGateway(this);
        else
          return null;
    }

}
