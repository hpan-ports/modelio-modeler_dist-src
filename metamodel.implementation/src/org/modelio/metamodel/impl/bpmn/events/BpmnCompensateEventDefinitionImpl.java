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
    @objid ("32e3b7b5-dbc5-48f8-9fc8-e0a25955a110")
    @Override
    public BpmnActivity getActivityRef() {
        return (BpmnActivity) getDepVal(BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep());
    }

    @objid ("43731350-be12-496c-8ac5-e80667e3a710")
    @Override
    public void setActivityRef(BpmnActivity value) {
        appendDepVal(BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep(), (SmObjectImpl)value);
    }

    @objid ("f01c473e-79ca-4a23-aa09-623ea9294b39")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d3d3e0ca-ba92-4efc-b944-c5e33822820e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("46daba36-f3fc-42d9-8645-51e252b89627")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCompensateEventDefinition(this);
        else
          return null;
    }

}
