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
    @objid ("3d18c0c6-a516-4c4e-9a43-2c50a87740f7")
    @Override
    public String getEscalationCode() {
        return (String) getAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt());
    }

    @objid ("71dc5942-9cf3-49ce-b591-574afca4fc58")
    @Override
    public void setEscalationCode(String value) {
        setAttVal(BpmnEscalationEventDefinitionData.Metadata.EscalationCodeAtt(), value);
    }

    @objid ("34e2e315-6741-474b-a15a-f45061444264")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("57fd369c-6bac-49ad-8184-479a5eb3759d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ffa2897a-82a0-4aed-8ff4-59e456a3ec5f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEscalationEventDefinition(this);
        else
          return null;
    }

}
