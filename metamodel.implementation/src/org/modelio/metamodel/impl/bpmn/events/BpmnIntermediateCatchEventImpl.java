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
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnIntermediateCatchEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008edbae-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnIntermediateCatchEventImpl extends BpmnCatchEventImpl implements BpmnIntermediateCatchEvent {
    @objid ("5c25584c-2459-4157-9ced-c1830e934665")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("76630afc-e7fb-471d-ae42-2590891730ae")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("484f2ce7-1bfb-4ea6-bf37-661d177bd78e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnIntermediateCatchEvent(this);
        else
          return null;
    }

}
