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
    @objid ("b3d54fd0-0fc4-4057-8a89-5c1aa937e857")
    @Override
    public BpmnItemAwareElement getItem() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataStateData.Metadata.ItemDep());
    }

    @objid ("4dfecaae-f13f-496c-bff6-3a70b77d5ae5")
    @Override
    public void setItem(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataStateData.Metadata.ItemDep(), (SmObjectImpl)value);
    }

    @objid ("06aef3a5-4dbb-4536-83f6-361b5a60014e")
    @Override
    public State getUmlState() {
        return (State) getDepVal(BpmnDataStateData.Metadata.UmlStateDep());
    }

    @objid ("1c3ea64c-112e-48a3-bd4a-8c6fb889657b")
    @Override
    public void setUmlState(State value) {
        appendDepVal(BpmnDataStateData.Metadata.UmlStateDep(), (SmObjectImpl)value);
    }

    @objid ("d75abf59-176e-4aad-ada2-a6ca1a2db0e2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("de50235a-13ca-4c81-b00d-d8174b53a962")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return new SmDepVal(BpmnDataStateData.Metadata.ItemDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7ece7148-93c8-4d40-9492-b50edfed0768")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataState(this);
        else
          return null;
    }

}
