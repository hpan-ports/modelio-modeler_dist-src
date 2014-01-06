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
package org.modelio.metamodel.data.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnEndPointData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.PackageData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnParticipantImpl;
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

@objid ("0075e3f6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnParticipant.class, factory=BpmnParticipantData.Metadata.ObjectFactory.class)
public class BpmnParticipantData extends BpmnBaseElementData {
    @objid ("e4e05ee5-e09f-4503-848b-823d165c8e80")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=Integer.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = 0;

    @objid ("3ec06bac-e1a0-4fee-a37c-7d8aeb132aa3")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=Integer.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = 0;

    @objid ("0e7c76ef-272c-43d7-9458-56c6c6fab024")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class, partof = true)
     SmObjectImpl mProcess;

    @objid ("943d7806-17dc-455a-8ac6-04ade00a5a10")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("ec0804ab-6520-480d-9808-67e73a521b69")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("bbe4234e-a4d7-4200-9593-46503a4ac421")
    @SmaMetaAssociation(metaName="EndPointRefs", typeDataClass=BpmnEndPointData.class, min=0, max=-1, smAssociationClass=Metadata.EndPointRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mEndPointRefs = null;

    @objid ("3096c49f-72d8-4513-8e93-2b472fda5ab0")
    @SmaMetaAssociation(metaName="InterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.InterfaceRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mInterfaceRefs = null;

    @objid ("24ca4232-3991-4d9a-a9c5-4a5ef94b6412")
    @SmaMetaAssociation(metaName="PackageRef", typeDataClass=PackageData.class, min=0, max=1, smAssociationClass=Metadata.PackageRefSmDependency.class, partof = true)
     SmObjectImpl mPackageRef;

    @objid ("7de73ec1-c72e-449d-b620-9568cfe98ca4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001a41a4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("399ba725-d708-4528-9fb4-6d0770556bc2")
        private static SmClass smClass = null;

        @objid ("3c59279b-cf85-4f98-9302-71cc375c972b")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("872375f5-b993-4fe8-b707-3a4e76f0e9fe")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("a0f8c2e5-1e41-4220-9118-4ceb52ee0ea7")
        private static SmDependency ProcessDep = null;

        @objid ("586aacd6-376d-44ac-93f5-2c708c7cf1cf")
        private static SmDependency ContainerDep = null;

        @objid ("e3f7149b-e7a5-40f5-a71d-94af23120771")
        private static SmDependency TypeDep = null;

        @objid ("a593cf12-27b6-4ccd-8ece-50bb548f1166")
        private static SmDependency EndPointRefsDep = null;

        @objid ("6a9a1c14-38b8-4d7c-b60f-2a4daf11d8fd")
        private static SmDependency InterfaceRefsDep = null;

        @objid ("9f0a97fa-c27f-49cf-a091-d51a138a667d")
        private static SmDependency PackageRefDep = null;

        @objid ("d21029ea-2386-4eca-93c8-451a3ea234e0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParticipantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("26eb1f2e-f4c1-4f71-ae4c-e18949ca271c")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("619787a9-29e5-4494-a747-b4cb84adfcb3")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("0b54b992-802b-47ca-96e8-a31bd9d6be7f")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("0e261853-710c-452d-a535-c639fea22535")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("6b9d311d-8ab5-41d5-bbb4-53a0643f1861")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("645d7393-852a-4101-aee9-f8997724d129")
        public static SmDependency EndPointRefsDep() {
            if (EndPointRefsDep == null) {
            	EndPointRefsDep = classof().getDependencyDef("EndPointRefs");
            }
            return EndPointRefsDep;
        }

        @objid ("5f4f5d82-dd5f-47d9-8e6a-543cb8b0cada")
        public static SmDependency InterfaceRefsDep() {
            if (InterfaceRefsDep == null) {
            	InterfaceRefsDep = classof().getDependencyDef("InterfaceRefs");
            }
            return InterfaceRefsDep;
        }

        @objid ("bc3c4ee5-1e41-4857-956e-5cf5565bc172")
        public static SmDependency PackageRefDep() {
            if (PackageRefDep == null) {
            	PackageRefDep = classof().getDependencyDef("PackageRef");
            }
            return PackageRefDep;
        }

        @objid ("60fb4b10-8b63-41c5-b457-8396ffb0155f")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("b607b514-eb36-4520-a412-3faa9a1c6f4c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("43086a7e-9e09-45f7-95a5-773e55abdf6f")
        public static SmDependency getPackageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageRefDep;
        }

        @objid ("1d516750-c037-442c-b206-a8b05ff8b11c")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("f5378339-03bb-47ce-8f0d-5c66bd9e65ac")
        public static SmDependency getEndPointRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndPointRefsDep;
        }

        @objid ("e54f4cc5-5ac6-4d7e-acea-cb8f7dfe6bd3")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("91959d3f-b130-48e6-8390-e09560e94ed6")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("4cb304b4-ea43-477a-91a6-de8be731cda4")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("fc13976e-a61c-432c-84a4-7b83bd4f000a")
        public static SmDependency getInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterfaceRefsDep;
        }

        @objid ("001a8286-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2686e9c8-0332-444c-ae82-92b500985b23")
            public ISmObjectData createData() {
                return new BpmnParticipantData();
            }

            @objid ("8f66315f-8e88-4542-9595-3c5b097e65a8")
            public SmObjectImpl createImpl() {
                return new BpmnParticipantImpl();
            }

        }

        @objid ("001aee7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("3d4dafd1-b1d9-4a34-bcf8-a36e60b287df")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMin;
            }

            @objid ("c8831693-d2f4-4e71-a1d7-fecfdd47652f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMin = value;
            }

        }

        @objid ("001b50ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("e180ac71-063a-433f-9912-7c615371ea4e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMax;
            }

            @objid ("bcfefd5a-f8eb-42f4-a66c-eacdbea6dc46")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMax = value;
            }

        }

        @objid ("001bb598-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("0f7b4074-9b0c-418b-97cb-6030c3463005")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mType;
            }

            @objid ("861b3d39-2cbb-47ce-b093-edbebb1d0df8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mType = value;
            }

            @objid ("bca1b20a-26bb-4e54-97d1-78e2370631f3")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001c2b9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageRefSmDependency extends SmSingleDependency {
            @objid ("442f8601-9160-4049-a289-eed65d44d0cd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mPackageRef;
            }

            @objid ("35f890c7-c116-4de9-ad1d-409358809568")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mPackageRef = value;
            }

            @objid ("8b3b6c03-eb53-4621-9637-9c53ee838bea")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001ca1d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("43b54d21-a678-409f-ad51-7b6d5d18dd5b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mProcess;
            }

            @objid ("e5168511-805b-44e1-ac76-af1a1ad131fd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mProcess = value;
            }

            @objid ("04ef6aa2-7d97-4dc0-9535-51ea3d7d44f5")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ParticipantDep();
            }

        }

        @objid ("001d18f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("7007bc9c-be66-4c06-8d11-f682a4a3bea1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mInterfaceRefs != null)? ((BpmnParticipantData)data).mInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a12ae811-72a9-4b49-81ea-eb3c2f188b09")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mInterfaceRefs;
            }

            @objid ("f927281d-e012-4e3a-898e-27a0a0ad43d8")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ParticipantRefDep();
            }

        }

        @objid ("001d8170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EndPointRefsSmDependency extends SmMultipleDependency {
            @objid ("1497d874-20b3-4b73-9610-55efe79ae41d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mEndPointRefs != null)? ((BpmnParticipantData)data).mEndPointRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("3cdc1221-b1e1-4d18-b0e8-0a3ed4e22eea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mEndPointRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mEndPointRefs;
            }

            @objid ("f2f8e928-1220-4904-ac1d-4dfc21fec149")
            @Override
            public SmDependency getSymetric() {
                return BpmnEndPointData.Metadata.ParticipantRefsDep();
            }

        }

        @objid ("001de836-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("bb1b9ef5-7098-4847-920c-55da7104e7a4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mContainer;
            }

            @objid ("86234d2c-2bce-4f82-99a6-dc631c32f347")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mContainer = value;
            }

            @objid ("29d73cf1-69e5-4c8d-948e-4cccdc44e09b")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ParticipantsDep();
            }

        }

    }

}
