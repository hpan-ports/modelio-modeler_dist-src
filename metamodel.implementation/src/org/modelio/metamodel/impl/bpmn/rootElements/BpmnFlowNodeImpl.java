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
    @objid ("2d6ab878-03f7-4cb1-a7a6-dffc060270aa")
    @Override
    public EList<BpmnSequenceFlow> getOutgoing() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.OutgoingDep());
    }

    @objid ("eebbd432-65b3-4303-af4a-06edf2f73120")
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

    @objid ("1ef039bb-07a8-4215-925c-42543e19ea1d")
    @Override
    public EList<BpmnResourceRole> getResource() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.ResourceDep());
    }

    @objid ("d3588106-83f1-4c24-83e2-b3fa7da33acb")
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

    @objid ("9cfbdb81-4ba5-45c6-9d9b-56ceadc8300f")
    @Override
    public EList<BpmnSequenceFlow> getIncoming() {
        return new SmList<>(this, BpmnFlowNodeData.Metadata.IncomingDep());
    }

    @objid ("5d62ae0f-20a1-46c7-9d37-da2e15d17639")
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

    @objid ("048e390d-1454-42ff-98bc-c6d7f68aaddf")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2c1d70e8-eabc-499b-b5eb-58f9b6673015")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fdd429f7-3763-43cf-876c-b637b14f1fa1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnFlowNode(this);
        else
          return null;
    }

}
