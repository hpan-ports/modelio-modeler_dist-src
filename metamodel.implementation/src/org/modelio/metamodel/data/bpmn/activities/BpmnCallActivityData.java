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
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.data.bpmn.activities.BpmnTaskData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivityImpl;
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

@objid ("007f5012-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCallActivity.class, factory=BpmnCallActivityData.Metadata.ObjectFactory.class)
public class BpmnCallActivityData extends BpmnActivityData {
    @objid ("3d6811d1-89e1-4bd6-828e-d7861ec407b3")
    @SmaMetaAssociation(metaName="CalledGlobalTask", typeDataClass=BpmnTaskData.class, min=0, max=1, smAssociationClass=Metadata.CalledGlobalTaskSmDependency.class, partof = true)
     SmObjectImpl mCalledGlobalTask;

    @objid ("f6ef9c16-b475-4de3-8b29-3b795c8643a4")
    @SmaMetaAssociation(metaName="CalledProcess", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.CalledProcessSmDependency.class, partof = true)
     SmObjectImpl mCalledProcess;

    @objid ("09314d9c-7036-4720-891b-d1a60caae90c")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("3d5078fa-ac5c-44d8-a0e7-ebb219db08e7")
    @SmaMetaAssociation(metaName="CalledBehavior", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.CalledBehaviorSmDependency.class, partof = true)
     SmObjectImpl mCalledBehavior;

    @objid ("18fa59cc-6030-4340-9c3e-ab8104115c64")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001e758-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("18b07bee-4b98-41af-80ba-9a57523b2c00")
        private static SmClass smClass = null;

        @objid ("4ae2a22d-7c14-4be5-ab79-6da7b1642c5f")
        private static SmDependency CalledGlobalTaskDep = null;

        @objid ("bcd1aff2-6d5d-49bc-8f05-6335ab63e34c")
        private static SmDependency CalledProcessDep = null;

        @objid ("d6bfd25d-214b-4f0b-bb5c-662ea62ef9d7")
        private static SmDependency CalledOperationDep = null;

        @objid ("98b588f3-f245-4ec7-abef-f259a33dee60")
        private static SmDependency CalledBehaviorDep = null;

        @objid ("e994c053-2c6e-474e-aa5e-e5b5eb52975f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCallActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("81414a65-0cf3-4a9c-9675-57deacd66169")
        public static SmDependency CalledGlobalTaskDep() {
            if (CalledGlobalTaskDep == null) {
            	CalledGlobalTaskDep = classof().getDependencyDef("CalledGlobalTask");
            }
            return CalledGlobalTaskDep;
        }

        @objid ("e2823fdb-2273-49b8-9169-dc49c7aa1481")
        public static SmDependency CalledProcessDep() {
            if (CalledProcessDep == null) {
            	CalledProcessDep = classof().getDependencyDef("CalledProcess");
            }
            return CalledProcessDep;
        }

        @objid ("9402c2db-7b2f-4542-9539-111a7532e69d")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("554f72bd-6b25-47c3-bf31-6cbe8aa6de6c")
        public static SmDependency CalledBehaviorDep() {
            if (CalledBehaviorDep == null) {
            	CalledBehaviorDep = classof().getDependencyDef("CalledBehavior");
            }
            return CalledBehaviorDep;
        }

        @objid ("4e5023d9-cf88-4c07-b7db-278cb08cd715")
        public static SmDependency getCalledGlobalTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledGlobalTaskDep;
        }

        @objid ("a2bfc5b4-9540-432e-8aad-2096451bdfe1")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("3c301377-1b64-419f-9bdb-f5047c4df4a4")
        public static SmDependency getCalledProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledProcessDep;
        }

        @objid ("78df3033-bdd6-45a3-b60e-8303143e573a")
        public static SmDependency getCalledBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledBehaviorDep;
        }

        @objid ("d0c1ed56-e846-41e8-a7d8-8f818fe906c6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0002284e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5d0f99f6-079a-4342-9b40-8d5ad8f72f66")
            public ISmObjectData createData() {
                return new BpmnCallActivityData();
            }

            @objid ("e22572af-16ae-42a1-8d4e-3d414bc2384f")
            public SmObjectImpl createImpl() {
                return new BpmnCallActivityImpl();
            }

        }

        @objid ("00028e06-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledGlobalTaskSmDependency extends SmSingleDependency {
            @objid ("97d694b9-e538-4a8d-8389-66a6e9dacaf5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledGlobalTask;
            }

            @objid ("f3e42369-5f06-46b8-bbb8-e588ebf72799")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledGlobalTask = value;
            }

            @objid ("5fb4c098-0f1c-4c8f-8b8a-71eeaa38aff9")
            @Override
            public SmDependency getSymetric() {
                return BpmnTaskData.Metadata.CallerDep();
            }

        }

        @objid ("0003043a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledProcessSmDependency extends SmSingleDependency {
            @objid ("bc0c81f1-ad16-4bb4-b817-c365bfe3f333")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledProcess;
            }

            @objid ("4adee7ac-fcb2-489b-9eeb-297e19674b10")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledProcess = value;
            }

            @objid ("42cbc0ed-9f45-4caa-bb6b-465d3d8dc94c")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.CallerDep();
            }

        }

        @objid ("0003797e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("7146aea2-aff0-45bc-a267-3206fc53be82")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledOperation;
            }

            @objid ("1d569743-abc0-45ad-a7fa-1c19a83ac185")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledOperation = value;
            }

            @objid ("5c53604a-27d1-4099-bf1c-0d7db9c29e4f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerDep();
            }

        }

        @objid ("0003f0f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledBehaviorSmDependency extends SmSingleDependency {
            @objid ("0f15aff3-fdd7-448c-a15f-b85964fc1671")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledBehavior;
            }

            @objid ("927d5dbc-fc10-434b-b8de-b7407e31924d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledBehavior = value;
            }

            @objid ("baaa66c4-a8f6-48c6-a10f-edb33767040e")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.BpmnCallerDep();
            }

        }

    }

}
