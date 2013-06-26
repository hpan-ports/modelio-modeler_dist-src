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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnCompensateEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00897772-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCompensateEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnCompensateEventDefinition {
    @objid ("965fcc53-a197-41bd-a4d2-b616d01e4cee")
    @Override
    public BpmnActivity getActivityRef() {
        return (BpmnActivity) getDepVal(BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep());
    }

    @objid ("5eaf143a-369f-4d39-9cbb-de6672b7b4ce")
    @Override
    public void setActivityRef(BpmnActivity value) {
        appendDepVal(BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep(), (SmObjectImpl)value);
    }

    @objid ("0da0729e-1563-4384-bedf-257dcbb910e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c96e3c57-4637-4bd4-9439-f0033927090d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("86120341-abcf-4934-b6b5-55b066fe29fd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCompensateEventDefinition(this);
        else
          return null;
    }

}
