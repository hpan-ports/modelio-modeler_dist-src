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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.data.bpmn.activities.BpmnAdHocSubProcessData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007e160c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAdHocSubProcessImpl extends BpmnSubProcessImpl implements BpmnAdHocSubProcess {
    @objid ("de4c64aa-eac9-4d9d-830c-90bae4ab6ac4")
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) getAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt());
    }

    @objid ("6b89cacb-c7a5-4a4e-b22a-e5e70b78229b")
    @Override
    public void setOrdering(AdHocOrdering value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt(), value);
    }

    @objid ("b86899ae-761f-4cd4-8c72-8b089a5e3509")
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) getAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt());
    }

    @objid ("ab1f4c77-a7e5-42d8-8c22-03fdff048cd5")
    @Override
    public void setCancelRemainingInstances(boolean value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt(), value);
    }

    @objid ("c0412ad6-0598-4273-b664-ca1148e74af4")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt());
    }

    @objid ("8646a8b1-140f-4b7d-98eb-623b31e6921f")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("4c4b9221-50b7-4998-9350-2f1695b3e1c6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b8d60900-3755-45fb-b6fb-bd0f60836862")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d485feee-1477-44b1-aad1-740c9732dded")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAdHocSubProcess(this);
        else
          return null;
    }

}
