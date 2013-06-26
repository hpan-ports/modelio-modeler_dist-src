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
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnEndEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008ac2c6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEndEventImpl extends BpmnThrowEventImpl implements BpmnEndEvent {
    @objid ("70d46201-7564-47ae-8934-53ed4f168286")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("89e334ee-9b84-4f3e-97a4-34fc5f4cc023")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fdb9d1ed-ed09-479a-9ded-8f623e1a755a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnEndEvent(this);
        else
          return null;
    }

}
