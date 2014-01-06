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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.impl.bpmn.events.BpmnCompensateEventDefinitionImpl;
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

@objid ("0089ac74-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCompensateEventDefinition.class, factory=BpmnCompensateEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnCompensateEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("31994ed9-3b05-4f3a-8a7f-d87ba4664587")
    @SmaMetaAssociation(metaName="ActivityRef", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.ActivityRefSmDependency.class, partof = true)
     SmObjectImpl mActivityRef;

    @objid ("9b9d5f20-3c0f-424f-b51f-8c9b4907c761")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008e31a4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("afd2c24b-1fa8-4d82-82f7-be8a6a2a681c")
        private static SmClass smClass = null;

        @objid ("19db146b-a40a-47f4-8670-12fb356bd219")
        private static SmDependency ActivityRefDep = null;

        @objid ("71b3daf7-d5fe-4eb5-9981-e47fa43d8c36")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCompensateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b3a4e1a-810a-4609-ad70-1b63085e0aca")
        public static SmDependency ActivityRefDep() {
            if (ActivityRefDep == null) {
            	ActivityRefDep = classof().getDependencyDef("ActivityRef");
            }
            return ActivityRefDep;
        }

        @objid ("32c121b2-5f91-41bf-9c6a-34429c63cff0")
        public static SmDependency getActivityRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivityRefDep;
        }

        @objid ("881818f2-b7a6-4fc8-ab1a-39b601ee87d3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008e74e8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("65d7b1ca-fed6-46f0-ab30-273ab51acc97")
            public ISmObjectData createData() {
                return new BpmnCompensateEventDefinitionData();
            }

            @objid ("310caf8e-13da-4208-ad19-61f7f1abaff6")
            public SmObjectImpl createImpl() {
                return new BpmnCompensateEventDefinitionImpl();
            }

        }

        @objid ("008edb7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActivityRefSmDependency extends SmSingleDependency {
            @objid ("6e29cf8a-8f5b-4ddd-a088-d7c7d4519877")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCompensateEventDefinitionData) data).mActivityRef;
            }

            @objid ("edce1263-cd07-4a49-a494-4e68de45609b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCompensateEventDefinitionData) data).mActivityRef = value;
            }

            @objid ("156d4e58-086c-47d5-95c0-d91255f66a36")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.CompensateEventDefinitionsDep();
            }

        }

    }

}
