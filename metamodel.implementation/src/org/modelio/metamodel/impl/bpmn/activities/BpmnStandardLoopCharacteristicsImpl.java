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
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.data.bpmn.activities.BpmnStandardLoopCharacteristicsData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0083ce8a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnStandardLoopCharacteristicsImpl extends BpmnLoopCharacteristicsImpl implements BpmnStandardLoopCharacteristics {
    @objid ("3311be0d-7638-4dd6-9ee8-1a810a1ea146")
    @Override
    public boolean isTestBefore() {
        return (Boolean) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt());
    }

    @objid ("ee8e961a-4450-42fc-8cb0-e1eafc002c7b")
    @Override
    public void setTestBefore(boolean value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt(), value);
    }

    @objid ("4950cf1d-2d9a-459b-b244-c34594b8535b")
    @Override
    public String getLoopCondition() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt());
    }

    @objid ("12253ac8-45d0-491f-b39c-d338cee243de")
    @Override
    public void setLoopCondition(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt(), value);
    }

    @objid ("42afca6c-75ac-483d-bc6e-30109990b432")
    @Override
    public String getLoopMaximum() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt());
    }

    @objid ("27c51067-d337-4f8a-bae8-0728eccbd1d1")
    @Override
    public void setLoopMaximum(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt(), value);
    }

    @objid ("c7b09daf-e7b9-4221-b683-0fe490ac5fe2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6812ad90-8fbf-4873-9a0a-a4026d5f0171")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("b09fd7be-0663-495c-91c7-4e81043127bb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStandardLoopCharacteristics(this);
        else
          return null;
    }

}
