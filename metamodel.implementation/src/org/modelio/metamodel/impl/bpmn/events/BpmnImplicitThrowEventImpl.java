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
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.data.bpmn.events.BpmnImplicitThrowEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008e2808-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnImplicitThrowEventImpl extends BpmnThrowEventImpl implements BpmnImplicitThrowEvent {
    @objid ("ae9b5dce-0b2f-4252-bcc4-e56c2d9c6df6")
    @Override
    public BpmnComplexBehaviorDefinition getOwner() {
        return (BpmnComplexBehaviorDefinition) getDepVal(BpmnImplicitThrowEventData.Metadata.OwnerDep());
    }

    @objid ("2314c601-f43e-4cd1-83a7-aa3dd249acd4")
    @Override
    public void setOwner(BpmnComplexBehaviorDefinition value) {
        appendDepVal(BpmnImplicitThrowEventData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("a279530f-680b-4849-adfb-17fe18e034d0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnImplicitThrowEventData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c84fd471-c3a2-4a17-b1c8-7168de480a18")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnImplicitThrowEventData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnImplicitThrowEventData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0868c2d2-adee-47b5-b70e-9f4393baccc3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnImplicitThrowEvent(this);
        else
          return null;
    }

}
