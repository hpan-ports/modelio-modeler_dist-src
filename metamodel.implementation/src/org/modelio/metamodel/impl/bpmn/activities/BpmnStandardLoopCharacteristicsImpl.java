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
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.impl.bpmn.activities.BpmnStandardLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0083ce8a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnStandardLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnStandardLoopCharacteristics {
    @objid ("299eddbf-7848-4a77-8645-f9280353d31c")
    @Override
    public boolean isTestBefore() {
        return (Boolean) getAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getTestBeforeAtt());
    }

    @objid ("5c3ddee8-36c2-4e59-8c0a-24f2442b2500")
    @Override
    public void setTestBefore(boolean value) {
        setAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getTestBeforeAtt(), value);
    }

    @objid ("bb75888b-7a17-40a8-a156-1c702fbe0d2b")
    @Override
    public String getLoopCondition() {
        return (String) getAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getLoopConditionAtt());
    }

    @objid ("bb51a64a-39f5-4c8f-b202-3fc0d5181578")
    @Override
    public void setLoopCondition(String value) {
        setAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getLoopConditionAtt(), value);
    }

    @objid ("8d9eed56-f0e8-4443-8a59-795fa5fc9b93")
    @Override
    public String getLoopMaximum() {
        return (String) getAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getLoopMaximumAtt());
    }

    @objid ("6809e898-ff89-482f-a24e-669b1aa1af2b")
    @Override
    public void setLoopMaximum(String value) {
        setAttVal(((BpmnStandardLoopCharacteristicsSmClass)getClassOf()).getLoopMaximumAtt(), value);
    }

    @objid ("10035701-abec-4e60-874b-a7994812f8af")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f3322fa2-07cd-4c71-b660-1a9c58e643bd")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("aed39c6e-44a1-4ca6-9745-893043d6f443")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStandardLoopCharacteristics(this);
        else
          return null;
    }

}
