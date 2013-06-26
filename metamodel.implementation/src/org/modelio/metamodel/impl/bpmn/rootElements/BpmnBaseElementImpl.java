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
    @objid ("c1204f4c-eb6e-4ec4-bd22-5f4a0a9a300a")
    @Override
    public EList<BpmnAssociation> getOutgoingAssoc() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.OutgoingAssocDep());
    }

    @objid ("fddb0487-6d20-42a7-96ab-5b09f0b0855e")
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

    @objid ("c742ec6a-0f1e-4960-9ec0-5dd9d0939346")
    @Override
    public EList<BpmnAssociation> getIncomingAssoc() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.IncomingAssocDep());
    }

    @objid ("e2bf9557-aac3-4890-8379-0d36ee1aeb95")
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

    @objid ("2893f616-9458-425f-a889-caa01d0b8b6f")
    @Override
    public EList<BpmnMessageFlow> getIncomingFlow() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.IncomingFlowDep());
    }

    @objid ("9736691f-7702-4c01-89e1-5bf487e65d91")
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

    @objid ("b0c52ff2-17cc-454b-a188-136e1780e3a9")
    @Override
    public EList<BpmnMessageFlow> getOutgoingFlow() {
        return new SmList<>(this, BpmnBaseElementData.Metadata.OutgoingFlowDep());
    }

    @objid ("58e456d6-61a0-408e-96c4-733f52afb2d3")
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

    @objid ("529dc242-8e09-489d-a617-29c297c98c87")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("391fa429-2426-4985-ad32-8825e5f8f738")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("af82a923-0c43-42a1-86de-b16e3bb2243b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnBaseElement(this);
        else
          return null;
    }

}
