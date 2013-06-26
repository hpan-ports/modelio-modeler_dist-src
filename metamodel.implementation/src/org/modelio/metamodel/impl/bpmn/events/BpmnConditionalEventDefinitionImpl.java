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
    @objid ("d419de2d-b871-450a-9dac-45204cfaee77")
    @Override
    public String getCondition() {
        return (String) getAttVal(BpmnConditionalEventDefinitionData.Metadata.ConditionAtt());
    }

    @objid ("77cbe449-c382-4445-9833-5e881b44af39")
    @Override
    public void setCondition(String value) {
        setAttVal(BpmnConditionalEventDefinitionData.Metadata.ConditionAtt(), value);
    }

    @objid ("c110cf93-f869-4167-9c7e-fb55e2726e4c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d95bac6e-36f5-426b-99e4-a725f9b223f9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("40cb5067-eb1f-4ab5-8635-fc1f7a7a3bbb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnConditionalEventDefinition(this);
        else
          return null;
    }

}
