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
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0078058c-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnBaseElementImpl extends ModelElementImpl implements BpmnBaseElement {
    @objid ("2ccfdee9-e403-4849-bafe-6d3559097add")
    @Override
    public EList<BpmnAssociation> getOutgoingAssoc() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.OutgoingAssocDep());
    }

    @objid ("e6de8812-2821-4233-8ffd-43722564d7bc")
    @Override
    public <T extends BpmnAssociation> List<T> getOutgoingAssoc(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnAssociation element : getOutgoingAssoc()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2394cc12-c2af-465f-8c6e-6e21dc03004d")
    @Override
    public EList<BpmnAssociation> getIncomingAssoc() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.IncomingAssocDep());
    }

    @objid ("fa809696-4b7f-4d41-b1ea-cc800843d6a1")
    @Override
    public <T extends BpmnAssociation> List<T> getIncomingAssoc(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnAssociation element : getIncomingAssoc()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8d0b8627-9974-4ed4-a74f-aad431477fe1")
    @Override
    public EList<BpmnMessageFlow> getIncomingFlow() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.IncomingFlowDep());
    }

    @objid ("bf2368ad-6d0c-40df-ac9b-838985b2a558")
    @Override
    public <T extends BpmnMessageFlow> List<T> getIncomingFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageFlow element : getIncomingFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("81723132-f0a2-4086-99c8-e134cc911197")
    @Override
    public EList<BpmnMessageFlow> getOutgoingFlow() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.OutgoingFlowDep());
    }

    @objid ("cebc42c7-c5dd-41f9-a849-6e11a8d68959")
    @Override
    public <T extends BpmnMessageFlow> List<T> getOutgoingFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageFlow element : getOutgoingFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6ee14ea3-644d-4948-8861-595eb4e62553")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cf39e495-e846-4429-b9e9-06a149dd092a")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("5c541f66-4d56-415d-b6b1-9fc78923d1cc")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBaseElement(this);
        else
          return null;
    }

}
