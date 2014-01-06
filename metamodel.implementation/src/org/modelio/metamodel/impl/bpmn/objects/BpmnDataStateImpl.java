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
    @objid ("a8880f18-f181-4a00-a497-2d269719a089")
    @Override
    public BpmnItemAwareElement getItem() {
        return (BpmnItemAwareElement) getDepVal(BpmnDataStateData.Metadata.ItemDep());
    }

    @objid ("0b53367f-8a7c-4f88-971a-732bf89277c6")
    @Override
    public void setItem(BpmnItemAwareElement value) {
        appendDepVal(BpmnDataStateData.Metadata.ItemDep(), (SmObjectImpl)value);
    }

    @objid ("177bdd9a-919d-4ccc-8d6c-56061b7f706e")
    @Override
    public State getUmlState() {
        return (State) getDepVal(BpmnDataStateData.Metadata.UmlStateDep());
    }

    @objid ("1211db9b-113b-405f-a1a5-886a9345ad0d")
    @Override
    public void setUmlState(State value) {
        appendDepVal(BpmnDataStateData.Metadata.UmlStateDep(), (SmObjectImpl)value);
    }

    @objid ("6cc5f9ad-b454-4eea-b653-264e702e3163")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("48ccdf74-7eed-47f2-a904-6f8f08dd1a8a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnDataStateData.Metadata.ItemDep());
        if (obj != null)
          return new SmDepVal(BpmnDataStateData.Metadata.ItemDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("f1837010-a092-4bed-846f-3d73ed956ccc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnDataState(this);
        else
          return null;
    }

}
