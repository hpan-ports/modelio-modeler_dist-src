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
    @objid ("575033cb-4061-453d-b987-0f44bd839eca")
    @Override
    public String getTimeCycle() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt());
    }

    @objid ("c376e7ae-8d5c-4919-b33f-fafab99f5626")
    @Override
    public void setTimeCycle(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt(), value);
    }

    @objid ("0a576c35-676b-43ba-9ef6-e29080e0810a")
    @Override
    public String getTimeD() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt());
    }

    @objid ("ed75bfd2-87d1-4cbf-b439-cbb0a1d4314e")
    @Override
    public void setTimeD(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt(), value);
    }

    @objid ("fb2d08a9-d919-4249-b23d-fe982f03d3d1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b092bb36-edbe-4712-95a1-9373aab2fa01")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("54adf576-cb18-4bca-aa6f-80a21d3c8a98")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTimerEventDefinition(this);
        else
          return null;
    }

}
