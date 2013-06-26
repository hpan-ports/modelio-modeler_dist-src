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
    @objid ("1c696ab1-d164-4c8c-8543-cf4d528c9eab")
    @SmaMetaAssociation(metaName="ActivityRef", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.ActivityRefSmDependency.class, partof = true)
     SmObjectImpl mActivityRef;

    @objid ("18e62a7f-5ba8-4df7-86ba-d5b285e1fea1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008e31a4-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("94eb1fe0-448d-4668-806e-5b727c869683")
        private static SmClass smClass = null;

        @objid ("30f525f1-0196-475c-9f9c-f63ea4760bc0")
        private static SmDependency ActivityRefDep = null;

        @objid ("3470078d-2731-4318-8519-5377a56578ca")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCompensateEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6fc62d2b-d97c-4aed-be3d-0f630d48be3d")
        public static SmDependency ActivityRefDep() {
            if (ActivityRefDep == null) {
            	ActivityRefDep = classof().getDependencyDef("ActivityRef");
            }
            return ActivityRefDep;
        }

        @objid ("695d87c0-2000-41e6-8415-0d16ed7f77b2")
        public static SmDependency getActivityRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ActivityRefDep;
        }

        @objid ("49a6c2ab-5672-4727-9192-1ae6fd10d2d2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008e74e8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("39e2abea-a5ee-4bbb-8dbf-3ddb71820db0")
            public ISmObjectData createData() {
                return new BpmnCompensateEventDefinitionData();
            }

            @objid ("e1f97f14-6c99-499e-b407-7761184c8bc7")
            public SmObjectImpl createImpl() {
                return new BpmnCompensateEventDefinitionImpl();
            }

        }

        @objid ("008edb7c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ActivityRefSmDependency extends SmSingleDependency {
            @objid ("bab75a83-7767-47c1-baee-d0802325d159")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCompensateEventDefinitionData) data).mActivityRef;
            }

            @objid ("13b2547e-4ea7-443e-bbea-901d2f280de4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCompensateEventDefinitionData) data).mActivityRef = value;
            }

            @objid ("5f335f49-f1d2-40e8-815b-97b6f5c3c833")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.CompensateEventDefinitionsDep();
            }

        }

    }

}
