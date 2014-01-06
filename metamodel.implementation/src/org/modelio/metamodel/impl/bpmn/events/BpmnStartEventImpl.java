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
    @objid ("58f58619-1bb0-4fbb-a2b3-f3bb8f12242b")
    @Override
    public boolean isIsInterrupting() {
        return (Boolean) getAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt());
    }

    @objid ("a3b2c418-5b23-45ca-9d8a-2c1620980423")
    @Override
    public void setIsInterrupting(boolean value) {
        setAttVal(BpmnStartEventData.Metadata.IsInterruptingAtt(), value);
    }

    @objid ("065edde6-eefe-4b26-aac9-921ab09cdd6e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b4fb5b15-72e6-46ed-8180-65697d90e00c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("194ef3d4-6918-4060-b106-23e7ecaef103")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStartEvent(this);
        else
          return null;
    }

}
