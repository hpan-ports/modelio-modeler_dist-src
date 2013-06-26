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
    @objid ("c6cc2a91-5208-4b53-a828-40d3713693b9")
    @Override
    public BpmnSequenceFlow getConnected() {
        return (BpmnSequenceFlow) getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
    }

    @objid ("c170c0c3-dcf2-4e8b-9feb-03712f71cc6f")
    @Override
    public void setConnected(BpmnSequenceFlow value) {
        appendDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), (SmObjectImpl)value);
    }

    @objid ("4f4d682c-c94e-498a-a0b7-b7d0b2a6ca88")
    @Override
    public EList<BpmnDataAssociation> getDataAssociation() {
        return new SmList<>(this, BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep());
    }

    @objid ("37b51df2-c7fd-45f2-abc9-f6c4b816b29a")
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

    @objid ("a7f9b957-0358-40ea-9b0b-4b66489095c4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d92c9660-ea93-4434-8412-2386e7ed8b94")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return new SmDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0bd16bf3-e065-4df5-9a88-389124d39a23")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlowDataAssociation(this);
        else
          return null;
    }

}
