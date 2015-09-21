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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00814890-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMultiInstanceLoopCharacteristicsData extends BpmnLoopCharacteristicsData {
    @objid ("d0e6efc4-378a-4719-a7bc-32f36676da82")
     Object mIsSequencial = false;

    @objid ("0cdab7e6-c3e9-4ac5-becf-1f9577555864")
     Object mBehavior = MultiInstanceBehavior.ALLBEHAVIOR;

    @objid ("d3fb2543-a2cb-4fef-b9da-63d1dbce285c")
     Object mLoopCardinality = "";

    @objid ("c067dece-015e-4526-a38a-84dc4ab45388")
     Object mCompletionCondition = "";

    @objid ("5a728702-0bff-4b7d-8430-3f8e41eade4f")
     SmObjectImpl mLoopDataInput;

    @objid ("c4c9a3a1-ff94-48e5-aaa4-d101ed1e58b6")
     SmObjectImpl mLoopDataOutputRef;

    @objid ("2c37ba87-c6d1-40af-b671-406990dfd41d")
     SmObjectImpl mCompletionEventRef;

    @objid ("e4fb611e-9782-4b52-bccd-d3ec83f1dad0")
     List<SmObjectImpl> mComplexBehaviorDefinition = null;

    @objid ("3cabc7b6-d5c1-4632-8a52-d22ca1bd0ad3")
    public BpmnMultiInstanceLoopCharacteristicsData(BpmnMultiInstanceLoopCharacteristicsSmClass smClass) {
        super(smClass);
    }

}
