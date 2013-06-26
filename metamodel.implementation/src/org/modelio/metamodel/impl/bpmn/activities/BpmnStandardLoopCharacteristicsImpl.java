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
    @objid ("31a2bced-cf70-4eaa-b657-e3c150690695")
    @Override
    public boolean isTestBefore() {
        return (Boolean) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt());
    }

    @objid ("8e2cb4aa-d87b-481a-95be-f4570febb0ed")
    @Override
    public void setTestBefore(boolean value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.TestBeforeAtt(), value);
    }

    @objid ("ed30c005-fed6-46b6-b8a1-4088ad06503c")
    @Override
    public String getLoopCondition() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt());
    }

    @objid ("d5140e96-6378-44d1-acc1-b0032f35ca08")
    @Override
    public void setLoopCondition(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopConditionAtt(), value);
    }

    @objid ("e093d83a-4bda-4cbf-8c02-7ba10c4ceded")
    @Override
    public String getLoopMaximum() {
        return (String) getAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt());
    }

    @objid ("3ee7652b-2dc4-426f-95ee-e428a99590be")
    @Override
    public void setLoopMaximum(String value) {
        setAttVal(BpmnStandardLoopCharacteristicsData.Metadata.LoopMaximumAtt(), value);
    }

    @objid ("b2a4f502-3751-4b1e-a38d-3e34da76bc5f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5464b996-a630-4cae-8684-1fa0a3349768")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("08c5def5-8511-4dd7-ac47-c055e4bc0638")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnStandardLoopCharacteristics(this);
        else
          return null;
    }

}
