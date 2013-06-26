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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnEscalationEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008c1a7c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEscalationEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnEscalationEventDefinition {
    @objid ("a257b862-2497-43d0-81b1-863e84bb10ba")
    @Override
    public String getEscalationCode() {
        return (String) getAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt());
    }

    @objid ("e026509e-4d30-49f4-948f-dd6ba2795c93")
    @Override
    public void setEscalationCode(String value) {
        setAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt(), value);
    }

    @objid ("9b73290c-127c-4461-8aa1-d05e42115fe2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f33e5cfd-f8a2-435c-8bd1-52ef2df41d3a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("73b5a0ad-bb91-48a2-9033-003d85c8c71e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEscalationEventDefinition(this);
        else
          return null;
    }

}
