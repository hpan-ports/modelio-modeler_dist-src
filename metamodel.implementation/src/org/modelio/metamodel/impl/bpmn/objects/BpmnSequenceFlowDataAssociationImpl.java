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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00054970-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowDataAssociationImpl extends BpmnBaseElementImpl implements BpmnSequenceFlowDataAssociation {
    @objid ("dfe6d313-a3de-4a00-b191-630746ced71d")
    @Override
    public BpmnSequenceFlow getConnected() {
        return (BpmnSequenceFlow) getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
    }

    @objid ("9f7e8dd7-52c3-495b-becd-e0854e436020")
    @Override
    public void setConnected(BpmnSequenceFlow value) {
        appendDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), (SmObjectImpl)value);
    }

    @objid ("6ce4b5e8-2ad4-4788-9ec7-eb1a93047fa6")
    @Override
    public EList<BpmnDataAssociation> getDataAssociation() {
        return new SmList<>(this, BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep());
    }

    @objid ("b1015475-a3cc-409a-be7f-ddff9753331b")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("34930a51-adee-4adc-919a-f7d2ce46c394")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a35b2682-f119-4ac9-8263-a8cf387f302e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return new SmDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eb72ba4c-33a9-47e4-bd69-40aa3c7ced67")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlowDataAssociation(this);
        else
          return null;
    }

}
