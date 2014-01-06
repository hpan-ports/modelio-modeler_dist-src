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
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.data.bpmn.events.BpmnTimerEventDefinitionData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00969aa6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnTimerEventDefinitionImpl extends BpmnEventDefinitionImpl implements BpmnTimerEventDefinition {
    @objid ("d8889aaf-174a-493f-bf16-ae7f5135698c")
    @Override
    public String getTimeCycle() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt());
    }

    @objid ("66ad86cf-91e7-4cf8-b794-33e5e0c59d88")
    @Override
    public void setTimeCycle(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt(), value);
    }

    @objid ("e7e09e61-2a58-42e7-846b-a4d4c833b3c8")
    @Override
    public String getTimeD() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt());
    }

    @objid ("9c8d47e3-4944-4509-b3be-e8c85aa17ec2")
    @Override
    public void setTimeD(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt(), value);
    }

    @objid ("d0df10f7-443f-48a9-acf8-7c194e797168")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a7233ef4-d8db-4ae4-a3f3-dd3d821d8c0a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("555913fd-da02-4df3-a7a7-c41a7eb66ce9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTimerEventDefinition(this);
        else
          return null;
    }

}
