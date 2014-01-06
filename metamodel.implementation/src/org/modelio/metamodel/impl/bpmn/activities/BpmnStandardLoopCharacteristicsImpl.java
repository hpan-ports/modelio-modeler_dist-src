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
    @objid ("e8054804-58e9-4841-baf9-394c85bd6e4c")
    @Override
    public boolean isTestBefore() {
        return (Boolean) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt());
    }

    @objid ("fc1e79ea-fddd-411c-a53e-b1365bafd739")
    @Override
    public void setTestBefore(boolean value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt(), value);
    }

    @objid ("546590f1-51c5-4a1e-a64c-0034d2ed65bd")
    @Override
    public String getLoopCondition() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt());
    }

    @objid ("9e456e2f-56ec-4865-bd61-82a3a8d29abd")
    @Override
    public void setLoopCondition(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt(), value);
    }

    @objid ("36871f6e-ff4b-427f-9876-b59fd0644eb6")
    @Override
    public String getLoopMaximum() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt());
    }

    @objid ("28845973-3171-44c9-8224-4e23bec699e7")
    @Override
    public void setLoopMaximum(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt(), value);
    }

    @objid ("0f80e930-fc4e-409f-b764-30258eff230a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("10159238-7d6b-4892-8dbd-efed9842e7d6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("892f4d68-3dd6-4b65-a6f4-d4cb0c273730")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStandardLoopCharacteristics(this);
        else
          return null;
    }

}
