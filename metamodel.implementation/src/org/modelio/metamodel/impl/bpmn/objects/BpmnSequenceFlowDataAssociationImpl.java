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
    @objid ("24ed159d-9296-4fdb-bafe-04d101e24b5e")
    @Override
    public BpmnSequenceFlow getConnected() {
        return (BpmnSequenceFlow) getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
    }

    @objid ("49c18660-72ee-4a76-a3a6-7d7d59ab2553")
    @Override
    public void setConnected(BpmnSequenceFlow value) {
        appendDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), (SmObjectImpl)value);
    }

    @objid ("7d3f2df1-4d55-4dbe-94eb-5e6d890f20e4")
    @Override
    public EList<BpmnDataAssociation> getDataAssociation() {
        return new SmList<>(this, BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep());
    }

    @objid ("518248d8-2d7c-4282-8d75-dc1a83cf44fc")
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

    @objid ("65e7eea5-95c8-436b-9e12-3274a331ec6e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3bba674e-fca1-4e2e-90c8-aa3951fe6ed2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep());
        if (obj != null)
          return new SmDepVal(BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bece6dca-445e-4bad-9b67-37a25644f6f7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnSequenceFlowDataAssociation(this);
        else
          return null;
    }

}
