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
    @objid ("397dfd79-ee75-448c-8082-02cd97f99a39")
    @Override
    public String getTimeCycle() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt());
    }

    @objid ("2ef3e60a-9deb-48c8-8578-3f67baeee3b1")
    @Override
    public void setTimeCycle(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeCycleAtt(), value);
    }

    @objid ("1c15ace1-64be-4c1f-b4dc-310b559c35de")
    @Override
    public String getTimeD() {
        return (String) getAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt());
    }

    @objid ("2a09aa0c-9e7b-4729-9a82-b549bced5e77")
    @Override
    public void setTimeD(String value) {
        setAttVal(BpmnTimerEventDefinitionData.Metadata.TimeDAtt(), value);
    }

    @objid ("347e5053-46e1-480a-8137-f8bba4de4411")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("edd90895-c120-45f5-b050-af050acbbf77")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e23e3a19-1380-4129-9ad3-d6e4d935f3e4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnTimerEventDefinition(this);
        else
          return null;
    }

}
