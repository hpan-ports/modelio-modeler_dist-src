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
    @objid ("655f856b-cae6-4a00-86b7-54d7638a84fa")
    @Override
    public String getEscalationCode() {
        return (String) getAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt());
    }

    @objid ("ce0d614c-57b2-4d30-b7f8-c1883c186742")
    @Override
    public void setEscalationCode(String value) {
        setAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt(), value);
    }

    @objid ("5c9489bc-37b8-45cd-ae37-450e5def9522")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("bcd3c587-2321-4986-aef6-0f912370bd1a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("2f53dacb-d921-4579-845d-a635ba8df785")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEscalationEventDefinition(this);
        else
          return null;
    }

}
