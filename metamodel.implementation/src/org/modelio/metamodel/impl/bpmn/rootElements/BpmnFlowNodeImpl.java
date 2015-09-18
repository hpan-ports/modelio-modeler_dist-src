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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0079db46-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowNodeImpl extends BpmnFlowElementImpl implements BpmnFlowNode {
    @objid ("008a70ce-9f14-4632-9bcb-0caef8639d37")
    @Override
    public EList<BpmnSequenceFlow> getOutgoing() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.OutgoingDep());
    }

    @objid ("e9b25ce5-a5e2-48bf-9005-8e2f8a366bff")
    @Override
    public <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlow element : getOutgoing()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b68acc92-3ab4-44be-9cca-2e4c28003237")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.ResourceDep());
    }

    @objid ("cce6007c-907e-4598-afb5-019ac34f6cbe")
    @Override
    public <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnResourceRole element : getResource()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f45daceb-854f-4847-bfd1-0073d970dc0b")
    @Override
    public EList<BpmnSequenceFlow> getIncoming() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.IncomingDep());
    }

    @objid ("3d2a9c3b-3843-4b55-9db5-690d43a527cb")
    @Override
    public <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSequenceFlow element : getIncoming()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f8ee4f45-70b0-4db4-94af-c680485f0c6b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("863c34c9-0d44-4b6e-86da-eb035f3fbc5c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ace72725-3695-4552-86f7-5e7262b742bf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowNode(this);
        else
          return null;
    }

}
