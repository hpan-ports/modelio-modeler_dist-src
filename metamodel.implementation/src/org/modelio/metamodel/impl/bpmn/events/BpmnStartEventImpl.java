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
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnStartEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00928268-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnStartEventImpl extends BpmnCatchEventImpl implements BpmnStartEvent {
    @objid ("317ec137-a51f-41c7-9808-90268ad23458")
    @Override
    public boolean isIsInterrupting() {
        return (Boolean) getAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt());
    }

    @objid ("0a75ac5e-cbf3-422e-a19f-836be8329808")
    @Override
    public void setIsInterrupting(boolean value) {
        setAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt(), value);
    }

    @objid ("862a819f-fcc2-4dbc-96bc-4a33259e2153")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cd8649d3-88c8-4b5e-8145-4aa7cccd76ae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1b04e009-cae3-4d05-ad1f-d2670c67e822")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStartEvent(this);
        else
          return null;
    }

}
