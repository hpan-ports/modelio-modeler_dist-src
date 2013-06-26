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
    @objid ("840586cd-aae7-41b3-ae1e-902b8ea17af0")
    @SmaMetaAssociation(metaName="CalledGlobalTask", typeDataClass=BpmnTaskData.class, min=0, max=1, smAssociationClass=Metadata.CalledGlobalTaskSmDependency.class, partof = true)
     SmObjectImpl mCalledGlobalTask;

    @objid ("f8e17651-c3fb-4d98-b64e-738f9305d4d0")
    @SmaMetaAssociation(metaName="CalledProcess", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.CalledProcessSmDependency.class, partof = true)
     SmObjectImpl mCalledProcess;

    @objid ("0d2e51ad-1cbb-414c-a625-146c0c1919af")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("f13be5a9-5122-40a6-b791-568cdbdfb0df")
    @SmaMetaAssociation(metaName="CalledBehavior", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.CalledBehaviorSmDependency.class, partof = true)
     SmObjectImpl mCalledBehavior;

    @objid ("6ab264e2-3f9b-458e-8396-70379390f057")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0001e758-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("587ff564-bddf-414c-aae4-4dd44baae59c")
        private static SmClass smClass = null;

        @objid ("a4c5fd36-cbad-4538-a0c4-e91bc2d365e3")
        private static SmDependency CalledGlobalTaskDep = null;

        @objid ("5d9397f5-23e4-4d5c-91f6-722082216a2b")
        private static SmDependency CalledProcessDep = null;

        @objid ("ac5088dd-d07d-470c-b9cd-4ab083ef2bc4")
        private static SmDependency CalledOperationDep = null;

        @objid ("7adc7882-8996-491c-b2dd-00e943ea0a74")
        private static SmDependency CalledBehaviorDep = null;

        @objid ("5fc003d9-879f-4014-a1ca-23fab1a7f9af")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCallActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9d06bcfc-de48-4f0d-af07-79e298485291")
        public static SmDependency CalledGlobalTaskDep() {
            if (CalledGlobalTaskDep == null) {
            	CalledGlobalTaskDep = classof().getDependencyDef("CalledGlobalTask");
            }
            return CalledGlobalTaskDep;
        }

        @objid ("5526d0bd-ccde-4cc8-9a20-8fd29bc0eee9")
        public static SmDependency CalledProcessDep() {
            if (CalledProcessDep == null) {
            	CalledProcessDep = classof().getDependencyDef("CalledProcess");
            }
            return CalledProcessDep;
        }

        @objid ("31a8237b-cc86-437a-a72b-f21bc8a35192")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("f25759ee-c089-4ecf-b6fe-3eace3a5ed06")
        public static SmDependency CalledBehaviorDep() {
            if (CalledBehaviorDep == null) {
            	CalledBehaviorDep = classof().getDependencyDef("CalledBehavior");
            }
            return CalledBehaviorDep;
        }

        @objid ("e8ea54db-1458-47f4-acf9-f9866b5aee48")
        public static SmDependency getCalledProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledProcessDep;
        }

        @objid ("4152ea21-5a3e-436e-9f48-fbdaae1f6be4")
        public static SmDependency getCalledGlobalTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledGlobalTaskDep;
        }

        @objid ("dea37c8e-bf78-45b3-8473-c8fa4e1e9cdc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("57d32ca2-ee73-4d25-bd3e-27b083625cbd")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("a5fe21d8-5b01-486d-a87b-2025124a0970")
        public static SmDependency getCalledBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledBehaviorDep;
        }

        @objid ("0002284e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("70b99da2-f0bf-42da-b3a3-1fe9f98bbfe1")
            public ISmObjectData createData() {
                return new BpmnCallActivityData();
            }

            @objid ("e2861810-042a-4949-b830-c2b51a5c0dbe")
            public SmObjectImpl createImpl() {
                return new BpmnCallActivityImpl();
            }

        }

        @objid ("00028e06-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledGlobalTaskSmDependency extends SmSingleDependency {
            @objid ("bc3a7bc5-bdc7-4b9a-80ea-0bcaaa2a13e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledGlobalTask;
            }

            @objid ("44891278-bb1f-473e-af9c-78f836abda37")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledGlobalTask = value;
            }

            @objid ("1c72b184-8ab4-4107-af87-ee4b24c4a384")
            @Override
            public SmDependency getSymetric() {
                return BpmnTaskData.Metadata.CallerDep();
            }

        }

        @objid ("0003043a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledProcessSmDependency extends SmSingleDependency {
            @objid ("1421927f-98c4-4137-8f4f-ea459a08ee8c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledProcess;
            }

            @objid ("1e3749a2-3e9e-4f75-b3dc-4c2578d96272")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledProcess = value;
            }

            @objid ("e86bf3b7-a769-4287-b65f-f744b1b08460")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.CallerDep();
            }

        }

        @objid ("0003797e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("016a4ec4-8ea6-4493-8bf5-e1f2aed9a0b6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledOperation;
            }

            @objid ("a2581818-4068-4549-801a-9fbab7978a3b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledOperation = value;
            }

            @objid ("5fa073d9-1e46-4cfc-8d25-2449f5541711")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerDep();
            }

        }

        @objid ("0003f0f2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledBehaviorSmDependency extends SmSingleDependency {
            @objid ("52daa222-7f8f-4b4f-82e4-6523285f909f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnCallActivityData) data).mCalledBehavior;
            }

            @objid ("edeb0fc3-0956-4796-b204-0750b184c741")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnCallActivityData) data).mCalledBehavior = value;
            }

            @objid ("c0eb5619-f86e-492d-ab9a-e7c797bbb987")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.BpmnCallerDep();
            }

        }

    }

}
