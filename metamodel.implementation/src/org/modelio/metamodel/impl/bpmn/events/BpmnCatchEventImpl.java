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
    @objid ("6c1aa767-6f66-4c5b-88e4-5ee0a7cdc901")
    @Override
    public boolean isParallelMultiple() {
        return (Boolean) getAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt());
    }

    @objid ("18038560-d521-4337-a80a-20ec839022d4")
    @Override
    public void setParallelMultiple(boolean value) {
        setAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt(), value);
    }

    @objid ("901f1708-be7e-4e4d-9a47-d49f3e974d09")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnCatchEventData.Metadata.DataOutputAssociationDep());
    }

    @objid ("20adbec8-72d3-4fee-86e8-268f5125d41c")
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

    @objid ("a396bffb-8509-4eaf-90e9-b831bb8536b5")
    @Override
    public BpmnDataOutput getDataOutput() {
        return (BpmnDataOutput) getDepVal(BpmnCatchEventData.Metadata.DataOutputDep());
    }

    @objid ("411aa1d1-c63f-4680-95af-a051d7e77ee7")
    @Override
    public void setDataOutput(BpmnDataOutput value) {
        appendDepVal(BpmnCatchEventData.Metadata.DataOutputDep(), (SmObjectImpl)value);
    }

    @objid ("572e50b2-3de3-4239-a0dc-8da233319505")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9a750287-106d-4de8-9b4a-519813e50fd8")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("1285dbf7-2ef9-4ea6-b790-f616c78c9a1e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCatchEvent(this);
        else
          return null;
    }

}
