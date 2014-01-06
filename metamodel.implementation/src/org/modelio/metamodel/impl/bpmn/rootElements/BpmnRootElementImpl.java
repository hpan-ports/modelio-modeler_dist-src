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
    @objid ("db6cbdb1-dbad-4448-9c87-803b40ad7807")
    @Override
    public BpmnBehavior getOwner() {
        return (BpmnBehavior) getDepVal(BpmnRootElementData.Metadata.OwnerDep());
    }

    @objid ("ee02874d-e529-42c9-a2b9-928a645352f1")
    @Override
    public void setOwner(BpmnBehavior value) {
        appendDepVal(BpmnRootElementData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("ea67c089-f41c-4eab-be75-8c8817bc63c4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3d20d3f2-7d21-46b4-b430-5cae8e5bb24d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnRootElementData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BpmnRootElementData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7ddaaa37-e09c-4ee9-9636-038edd618dc6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnRootElement(this);
        else
          return null;
    }

}
