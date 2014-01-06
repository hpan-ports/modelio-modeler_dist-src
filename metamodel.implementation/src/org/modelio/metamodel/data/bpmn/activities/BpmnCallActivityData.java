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
    @objid ("1230999f-666b-46e4-adf8-0f788583ab3b")
    @SmaMetaAssociation(metaName="CalledGlobalTask", typeDataClass=BpmnTaskData.class, min=0, max=1, smAssociationClass=Metadata.CalledGlobalTaskSmDependency.class, partof = true)
     SmObjectImpl mCalledGlobalTask;

    @objid ("c5123a8c-47ff-4950-ab78-3219a270f23e")
    @SmaMetaAssociation(metaName="CalledProcess", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.CalledProcessSmDependency.class, partof = true)
     SmObjectImpl mCalledProcess;

    @objid ("9ef29641-e5f7-4d21-bb56-a6f8ce746040")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("6ed9cc7c-8376-403c-b161-e354632ef495")
    @SmaMetaAssociation(metaName="CalledBehavior", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.CalledBehaviorSmDependency.class, partof = true)
     SmObjectImpl mCalledBehavior;

    @objid ("79d82c9c-3881-4a70-bd04-f9d7ac6ce644")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001e758-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("931e4e59-e7e8-45c6-b8da-c1e436e99084")
        private static SmClass smClass = null;

        @objid ("cf19661c-1716-4aab-aeea-ba610f1acf62")
        private static SmDependency CalledGlobalTaskDep = null;

        @objid ("fcf04267-1750-4930-b256-acc4e33367ea")
        private static SmDependency CalledProcessDep = null;

        @objid ("24827980-1e78-4782-bae0-3e6625c06c70")
        private static SmDependency CalledOperationDep = null;

        @objid ("5c5ce6d4-460b-4527-b239-700e24b2ffbc")
        private static SmDependency CalledBehaviorDep = null;

        @objid ("9a7a0fe6-2f6f-4c30-8714-fee54505bbed")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCallActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("059db41b-573a-4f7d-8936-dcb00060b687")
        public static SmDependency CalledGlobalTaskDep() {
            if (CalledGlobalTaskDep == null) {
            	CalledGlobalTaskDep = classof().getDependencyDef("CalledGlobalTask");
            }
            return CalledGlobalTaskDep;
        }

        @objid ("babb3d3b-693e-4e03-988e-3c3dac31f43d")
        public static SmDependency CalledProcessDep() {
            if (CalledProcessDep == null) {
            	CalledProcessDep = classof().getDependencyDef("CalledProcess");
            }
            return CalledProcessDep;
        }

        @objid ("3bc14bd8-c5cf-4700-80b4-d199aba4f200")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("ee8ff9fa-fbac-478d-b3fc-229a2e738786")
        public static SmDependency CalledBehaviorDep() {
            if (CalledBehaviorDep == null) {
            	CalledBehaviorDep = classof().getDependencyDef("CalledBehavior");
            }
            return CalledBehaviorDep;
        }

        @objid ("a8e044f4-2185-44c2-a8af-9c0b373674eb")
        public static SmDependency getCalledBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledBehaviorDep;
        }

        @objid ("713d7e97-9d70-4c6b-b51a-6873514a78db")
        public static SmDependency getCalledProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledProcessDep;
        }

        @objid ("ab069d02-fa1e-45c1-8c40-ac956573fc17")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("bf790cf9-4a3d-4c30-a535-6a5388e5008f")
        public static SmDependency getCalledGlobalTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledGlobalTaskDep;
        }

        @objid ("604c4d5c-aa0b-43d5-946f-37570292abac")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0002284e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("898b9633-4acc-42ce-819c-64dd7b730b73")
            public ISmObjectData createData() {
                return new BpmnCallActivityData();
            }

            @objid ("dc81e8ba-e9bb-4275-93f6-376550f5ff2f")
            public SmObjectImpl createImpl() {
                return new BpmnCallActivityImpl();
            }

        }

        @objid ("00028e06-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledGlobalTaskSmDependency extends SmSingleDependency {
            @objid ("3af281a1-c879-43c7-aadc-32cd40db2985")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledGlobalTask;
            }

            @objid ("1cf20cd5-8631-412e-861f-473567d94a75")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledGlobalTask = value;
            }

            @objid ("d923d0ff-cb1a-477a-9857-d6ab1384607a")
            @Override
            public SmDependency getSymetric() {
                return BpmnTaskData.Metadata.CallerDep();
            }

        }

        @objid ("0003043a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledProcessSmDependency extends SmSingleDependency {
            @objid ("e448fe8e-becf-407b-a0cc-d8dea3721e10")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledProcess;
            }

            @objid ("e4a92e96-0eae-4e74-9de1-a0a63a91f395")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledProcess = value;
            }

            @objid ("0858b825-4084-4006-b579-ea2b9cdb23d1")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.CallerDep();
            }

        }

        @objid ("0003797e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("c1dc3c43-13a6-4c6b-a2af-eee7b360f34e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledOperation;
            }

            @objid ("57d2da2b-b7ee-4cab-ba4e-59be90c6b76e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledOperation = value;
            }

            @objid ("660c0c7e-761f-427c-ac5e-3da5db310dd8")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerDep();
            }

        }

        @objid ("0003f0f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledBehaviorSmDependency extends SmSingleDependency {
            @objid ("b33c8568-d337-46c5-aa51-2612f78b22aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledBehavior;
            }

            @objid ("46e2523a-e23e-44d4-9c1a-2dde55435dd8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledBehavior = value;
            }

            @objid ("71d8adf9-4ca7-4aae-a2ac-12a2a922b46a")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.BpmnCallerDep();
            }

        }

    }

}
