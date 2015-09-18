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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007ad76c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnRootElementImpl extends BpmnBaseElementImpl implements BpmnRootElement {
    @objid ("d3fd86fe-af8a-4733-8c93-e690a7d29d1c")
    @Override
    public BpmnBehavior getOwner() {
        return (BpmnBehavior) getDepVal(BpmnRootElementData.Metadata.OwnerDep());
    }

    @objid ("27b5757d-98f0-48ce-bd90-218acbf2744e")
    @Override
    public void setOwner(BpmnBehavior value) {
        appendDepVal(BpmnRootElementData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("49ce1056-3154-4f50-a5da-831ddd689715")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("7e600dd6-4edf-4fdb-9571-9e8dae8a3bdb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnRootElementData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("161abe16-2d40-44a5-88a8-5f844559055a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnRootElement(this);
        else
          return null;
    }

}
