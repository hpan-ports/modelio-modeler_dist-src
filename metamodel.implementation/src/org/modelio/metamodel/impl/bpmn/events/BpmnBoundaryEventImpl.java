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
    @objid ("d06d6b02-12e2-40e3-9bda-37f9d232cf68")
    @Override
    public boolean isCancelActivity() {
        return (Boolean) getAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt());
    }

    @objid ("72c263c5-b37e-4a6a-916b-ad0c57e61ce5")
    @Override
    public void setCancelActivity(boolean value) {
        setAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt(), value);
    }

    @objid ("f81e6516-1014-433d-b78d-117d6ebb633f")
    @Override
    public BpmnActivity getAttachedToRef() {
        return (BpmnActivity) getDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep());
    }

    @objid ("46977b23-a4b5-4081-a8a6-cc2930333c5d")
    @Override
    public void setAttachedToRef(BpmnActivity value) {
        appendDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep(), (SmObjectImpl)value);
    }

    @objid ("2d1545d4-83cf-4963-bc57-d07509b429ce")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("44d3cc44-4559-4ee5-9618-faa119e14f54")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("08fe8c4d-2be7-4560-a9f4-7c29f0855799")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBoundaryEvent(this);
        else
          return null;
    }

}
