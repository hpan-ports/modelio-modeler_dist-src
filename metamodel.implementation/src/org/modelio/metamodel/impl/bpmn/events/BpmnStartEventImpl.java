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
    @objid ("452591d1-82c4-4930-a373-d49fd2260ff8")
    @Override
    public boolean isIsInterrupting() {
        return (Boolean) getAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt());
    }

    @objid ("8c3e7f8a-2ea1-42de-b65d-1ca81a4d5e61")
    @Override
    public void setIsInterrupting(boolean value) {
        setAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt(), value);
    }

    @objid ("8fc24d2a-7117-48b7-940e-7afed66bf94b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("7a8dd13b-8e34-4ca8-a60e-2a7ce844b345")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bdaaa685-032c-4365-a8b7-d7e862d84dba")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStartEvent(this);
        else
          return null;
    }

}
