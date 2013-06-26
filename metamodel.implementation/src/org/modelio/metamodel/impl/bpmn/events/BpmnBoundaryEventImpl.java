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
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnBoundaryEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008790d8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnBoundaryEventImpl extends BpmnCatchEventImpl implements BpmnBoundaryEvent {
    @objid ("f7bd1a5d-9ed6-427c-bdb2-1f62ff7af994")
    @Override
    public boolean isCancelActivity() {
        return (Boolean) getAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt());
    }

    @objid ("0b5110d8-5066-4396-a121-491af36cde8a")
    @Override
    public void setCancelActivity(boolean value) {
        setAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt(), value);
    }

    @objid ("5670af61-0bad-46ed-a1fc-4f59cb9827af")
    @Override
    public BpmnActivity getAttachedToRef() {
        return (BpmnActivity) getDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep());
    }

    @objid ("3412a4cb-2de4-4e2e-8614-462548ac49a2")
    @Override
    public void setAttachedToRef(BpmnActivity value) {
        appendDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep(), (SmObjectImpl)value);
    }

    @objid ("020230be-6e70-4b76-8216-f11f3746e7ca")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("efad0e67-2ed2-4e44-a58c-f60ad8d39a84")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f21dc03d-7c4e-41e1-bc93-f01bbc81b840")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBoundaryEvent(this);
        else
          return null;
    }

}
