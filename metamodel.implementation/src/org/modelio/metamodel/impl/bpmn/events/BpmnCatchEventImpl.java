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
    @objid ("52706d4e-6eaf-4c75-a864-838d9967ce0d")
    @Override
    public boolean isParallelMultiple() {
        return (Boolean) getAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt());
    }

    @objid ("36b367e9-917b-4b98-b79b-da6c2cbb6623")
    @Override
    public void setParallelMultiple(boolean value) {
        setAttVal(BpmnCatchEventData.Metadata.ParallelMultipleAtt(), value);
    }

    @objid ("bb66f725-df56-44e6-95fa-45a5b8cfca47")
    @Override
    public EList<BpmnDataAssociation> getDataOutputAssociation() {
        return new SmList<>(this, BpmnCatchEventData.Metadata.DataOutputAssociationDep());
    }

    @objid ("177f3df2-ff34-43ca-94bb-41f77c8764bb")
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

    @objid ("167d24d6-d736-4b88-b0ef-930a954e8b57")
    @Override
    public BpmnDataOutput getDataOutput() {
        return (BpmnDataOutput) getDepVal(BpmnCatchEventData.Metadata.DataOutputDep());
    }

    @objid ("50887d75-14db-46d1-91c9-1ebad4b50fb8")
    @Override
    public void setDataOutput(BpmnDataOutput value) {
        appendDepVal(BpmnCatchEventData.Metadata.DataOutputDep(), (SmObjectImpl)value);
    }

    @objid ("29ca5637-4ace-41e2-8ddc-91e99e7843d2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a665e6a3-3a09-4298-a5f4-ceb6a8682668")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("478256dd-8294-40d3-953b-2de34c5dfc2a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnCatchEvent(this);
        else
          return null;
    }

}
