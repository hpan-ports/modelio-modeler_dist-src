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
    @objid ("930f2c05-ac7c-4d3a-a771-cee6c3a11069")
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) getAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt());
    }

    @objid ("a6cee15d-8843-4d17-b26d-4cc148bb6a13")
    @Override
    public void setOrdering(AdHocOrdering value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.OrderingAtt(), value);
    }

    @objid ("614c74e8-a1cd-4546-b83d-93deaf836444")
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) getAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt());
    }

    @objid ("cbebe31f-938c-42da-93d9-38269fb8c843")
    @Override
    public void setCancelRemainingInstances(boolean value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CancelRemainingInstancesAtt(), value);
    }

    @objid ("763959f7-7cc1-4c08-839c-857588e8e764")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt());
    }

    @objid ("b81795ab-d2b4-47e5-b6f9-91ba57c80331")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(BpmnAdHocSubProcessData.Metadata.CompletionConditionAtt(), value);
    }

    @objid ("f1b8cce5-2784-4697-b1e1-0eeb2930bf3d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("50ae8730-efc5-4901-b22c-581b83b26eea")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c518c63e-6b02-4d2c-ab13-3da5ac7337fa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAdHocSubProcess(this);
        else
          return null;
    }

}
