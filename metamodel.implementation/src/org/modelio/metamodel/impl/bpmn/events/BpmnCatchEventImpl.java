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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0088d56a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnCatchEventImpl extends BpmnEventImpl implements BpmnCatchEvent {
    @objid ("6bf589b8-883e-4564-835b-79fd0e0a04fb")
    @Override
    public boolean isParallelMultiple() {
        return (Boolean) getAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt());
    }

    @objid ("e91979b8-9c87-436c-bebe-68ebd69ce246")
    @Override
    public void setParallelMultiple(boolean value) {
        setAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt(), value);
    }

    @objid ("b3433639-fc6f-44d0-9b22-37ab78bcb269")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnCatchEventData.Metadata.DataOutputAssociationDep());
    }

    @objid ("2b47b86b-47ab-4312-9bca-c622e215551e")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataOutputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a019b018-7d0f-46f7-a7b5-9194a095d038")
    @Override
    public BpmnDataOutput getDataOutput() {
        return (BpmnDataOutput) getDepVal(BpmnCatchEventData.Metadata.DataOutputDep());
    }

    @objid ("2c372d92-956c-4d1d-8161-a21d2673a299")
    @Override
    public void setDataOutput(BpmnDataOutput value) {
        appendDepVal(BpmnCatchEventData.Metadata.DataOutputDep(), (SmObjectImpl)value);
    }

    @objid ("b56c0e29-0ae7-4130-bdc4-c4968143e293")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("81564ea3-e3c2-4b34-b94d-65eb99c7a094")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("fc11fd36-d4f2-466a-a79b-69aab604e520")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCatchEvent(this);
        else
          return null;
    }

}
