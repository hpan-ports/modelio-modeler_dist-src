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
    @objid ("bfb3fe93-9e0c-4886-8cdd-39d31b89950b")
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) getAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt());
    }

    @objid ("20505b69-cd8d-4c82-9a6e-3c6a126747ae")
    @Override
    public void setOrdering(AdHocOrdering value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt(), value);
    }

    @objid ("8709b095-2ae1-442c-94c7-37b7a56236fb")
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) getAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt());
    }

    @objid ("2818511c-446e-454b-8473-d1b5a6302d87")
    @Override
    public void setCancelRemainingInstances(boolean value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt(), value);
    }

    @objid ("cbd340b4-6ce0-4949-937d-79df31f76740")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt());
    }

    @objid ("5805beea-13ca-48a8-84bd-83b4c86bf93a")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("2b7a1d47-bbf0-4001-a6ad-1bb7afd108fb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e59ef9f0-b55c-497f-a33f-22d7eeacdf7e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ab1e37f8-a0cc-48e6-a503-6523294e682e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAdHocSubProcess(this);
        else
          return null;
    }

}
