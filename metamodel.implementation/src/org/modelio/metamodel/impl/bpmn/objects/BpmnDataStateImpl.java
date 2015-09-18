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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00087bf4-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataStateImpl extends BpmnBaseElementImpl implements BpmnDataState {
    @objid ("cba66877-bea8-42d6-9cbb-1177f4d9b7c1")
    @Override
    public BpmnItemAwareElement getItem() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataStateData.Metadata.ItemDep());
    }

    @objid ("508ed418-41b9-4f6c-b0ce-f749092ddd05")
    @Override
    public void setItem(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataStateData.Metadata.ItemDep(), (SmObjectImpl)value);
    }

    @objid ("6b6ef0de-6a1d-489b-8762-2db9041262d1")
    @Override
    public State getUmlState() {
        return (State) getDepVal(BpmnDataStateData.Metadata.UmlStateDep());
    }

    @objid ("1ab16ca4-ec87-457f-a632-05fbd6b70c54")
    @Override
    public void setUmlState(State value) {
        appendDepVal(BpmnDataStateData.Metadata.UmlStateDep(), (SmObjectImpl)value);
    }

    @objid ("ea7e6d1a-6573-44ec-9428-78d7bf3823f8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0b9e0bc9-1b80-4961-a353-d328750d9ed7")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return new SmDepVal(BpmnDataStateData.Metadata.ItemDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3f94b096-6ab8-4a7e-9a44-d15c6a6debac")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataState(this);
        else
          return null;
    }

}
