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
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnConditionalEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008a1e34-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnConditionalEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnConditionalEventDefinition {
    @objid ("06d5a136-0fb3-48c9-88ad-8a35f4b46680")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnConditionalEventDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("08b0af24-e3d2-4a17-bc48-44dcd517efe7")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnConditionalEventDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("bb76e93a-f184-4828-acc5-64e345268f24")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("1c9e5208-f3af-49b2-ad16-639f5778e2cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("aa6672bb-84a9-4895-b882-8e407fd36949")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnConditionalEventDefinition(this);
        else
          return null;
    }

}
