/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.impl.bpmn.activities.BpmnAdHocSubProcessData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("007e160c-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAdHocSubProcessImpl extends BpmnSubProcessImpl implements BpmnAdHocSubProcess {
    @objid ("e6407621-948e-487b-913b-0b80a54d5919")
    @Override
    public AdHocOrdering getOrdering() {
        return (AdHocOrdering) getAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getOrderingAtt());
    }

    @objid ("1562d799-44c0-4bb6-b168-de4da7d5c488")
    @Override
    public void setOrdering(AdHocOrdering value) {
        setAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getOrderingAtt(), value);
    }

    @objid ("6caeab4f-bbc7-433d-86ac-07e1cd70cd7d")
    @Override
    public boolean isCancelRemainingInstances() {
        return (Boolean) getAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getCancelRemainingInstancesAtt());
    }

    @objid ("35aa384a-7174-41d7-9e74-30eada1d13f9")
    @Override
    public void setCancelRemainingInstances(boolean value) {
        setAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getCancelRemainingInstancesAtt(), value);
    }

    @objid ("fb620e8c-0f4c-469b-91d6-8977083402e2")
    @Override
    public String getCompletionCondition() {
        return (String) getAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getCompletionConditionAtt());
    }

    @objid ("6d9b4878-4782-480b-a459-c867f07d4284")
    @Override
    public void setCompletionCondition(String value) {
        setAttVal(((BpmnAdHocSubProcessSmClass)getClassOf()).getCompletionConditionAtt(), value);
    }

    @objid ("4c057a3d-c672-419b-8779-4ba73b1d1e8a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e767131e-0590-44c0-bc2b-2a9f500f2100")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("b00dc193-4ab7-4303-ae36-a80fd333b93d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnAdHocSubProcess(this);
        else
          return null;
    }

}
