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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.impl.bpmn.activities.BpmnBusinessRuleTaskImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("007ec354-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBusinessRuleTask.class, factory=BpmnBusinessRuleTaskData.Metadata.ObjectFactory.class)
public class BpmnBusinessRuleTaskData extends BpmnTaskData {
    @objid ("75825934-4c18-4368-88f3-b7f956027269")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00218e82-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bf37a957-c159-4f8a-9489-90450ce61f21")
        private static SmClass smClass = null;

        @objid ("ea28cb72-7454-4fcf-811d-87b2eedbb0f5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBusinessRuleTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bc2deafe-5311-4907-a617-9887c1301068")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0022b5dc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("45d0966d-4019-4c51-84ad-2e090a513958")
            public ISmObjectData createData() {
                return new BpmnBusinessRuleTaskData();
            }

            @objid ("01b4d677-8bf9-46b9-a51a-ea0172bd5e57")
            public SmObjectImpl createImpl() {
                return new BpmnBusinessRuleTaskImpl();
            }

        }

    }

}
