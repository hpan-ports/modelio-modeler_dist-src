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
    @objid ("2b77ed4f-162d-49d8-a5e1-ee1693ae352d")
    @Override
    public boolean isCancelActivity() {
        return (Boolean) getAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt());
    }

    @objid ("92a630b6-9f76-467c-95b7-8c4e7d9b2784")
    @Override
    public void setCancelActivity(boolean value) {
        setAttVal(BpmnBoundaryEventData.Metadata.CancelActivityAtt(), value);
    }

    @objid ("2d394892-cf71-4d9a-b6bc-15e54317c561")
    @Override
    public BpmnActivity getAttachedToRef() {
        return (BpmnActivity) getDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep());
    }

    @objid ("17476b53-6a85-436e-9fdb-b219791c1d27")
    @Override
    public void setAttachedToRef(BpmnActivity value) {
        appendDepVal(BpmnBoundaryEventData.Metadata.AttachedToRefDep(), (SmObjectImpl)value);
    }

    @objid ("c5ac5db9-6fb6-4466-b3b5-b95df1dd506d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("566137ea-b13e-4958-9119-498d9180f778")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("87674f40-9568-48ff-8ee3-ec884a869118")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBoundaryEvent(this);
        else
          return null;
    }

}
