/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.impl.bpmn.events.BpmnBoundaryEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("008790d8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnBoundaryEventImpl extends BpmnCatchEventImpl implements BpmnBoundaryEvent {
    @objid ("b353ab57-5077-47b9-95c2-9c67ec7034fe")
    @Override
    public boolean isCancelActivity() {
        return (Boolean) getAttVal(((BpmnBoundaryEventSmClass)getClassOf()).getCancelActivityAtt());
    }

    @objid ("c66cf20d-2c73-48fb-a299-a2c04ff2bf65")
    @Override
    public void setCancelActivity(boolean value) {
        setAttVal(((BpmnBoundaryEventSmClass)getClassOf()).getCancelActivityAtt(), value);
    }

    @objid ("91958135-7b21-4bdb-94a9-1ac3639801f1")
    @Override
    public BpmnActivity getAttachedToRef() {
        Object obj = getDepVal(((BpmnBoundaryEventSmClass)getClassOf()).getAttachedToRefDep());
        return (obj instanceof BpmnActivity)? (BpmnActivity)obj : null;
    }

    @objid ("98ab957e-66a6-45d9-a277-b2ad312d941b")
    @Override
    public void setAttachedToRef(BpmnActivity value) {
        appendDepVal(((BpmnBoundaryEventSmClass)getClassOf()).getAttachedToRefDep(), (SmObjectImpl)value);
    }

    @objid ("b321e3aa-a3f9-4ac8-b389-a26db44b0292")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("40bdad56-c656-4eeb-a810-cccd2bd7715c")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("197a41e9-05e1-4823-8bfe-df0f67b51522")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBoundaryEvent(this);
        else
          return null;
    }

}
