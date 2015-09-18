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
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.data.bpmn.events.BpmnThrowEventData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0095d2e2-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnThrowEventImpl extends BpmnEventImpl implements BpmnThrowEvent {
    @objid ("5e9f0835-0c51-4592-a8f6-bbf457a43e3b")
    @Override
    public EList<BpmnDataAssociation> getDataInputAssociation() {
        return new SmList<>(this, BpmnThrowEventData.Metadata.DataInputAssociationDep());
    }

    @objid ("a5cb319c-53b4-49bf-8b32-e3aa8031e87e")
    @Override
    public <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnDataAssociation element : getDataInputAssociation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cedff99b-bc64-4b76-bfa6-3924ad2fdfb2")
    @Override
    public BpmnDataInput getDataInput() {
        return (BpmnDataInput) getDepVal(BpmnThrowEventData.Metadata.DataInputDep());
    }

    @objid ("f249b2a1-b8db-4838-9a16-2ecf7f89af15")
    @Override
    public void setDataInput(BpmnDataInput value) {
        appendDepVal(BpmnThrowEventData.Metadata.DataInputDep(), (SmObjectImpl)value);
    }

    @objid ("04ddf6a2-7fbf-42ab-a47a-8d5e1c83c3d2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("32666c19-8863-4266-a0d4-4ca9d64fe7b4")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4408476a-5746-4af2-a25e-c6ca030343b9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnThrowEvent(this);
        else
          return null;
    }

}
