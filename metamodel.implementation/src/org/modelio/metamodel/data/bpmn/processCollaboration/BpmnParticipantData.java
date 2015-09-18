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
    @objid ("5791429b-1b80-400a-b864-79c408381ae0")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=Integer.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = 0;

    @objid ("ea95367f-8f07-41ab-ad9a-04331d4e793c")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=Integer.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = 0;

    @objid ("a0264c7f-ce14-4c14-94d8-afeb492ba8cb")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class, partof = true)
     SmObjectImpl mProcess;

    @objid ("7792672f-28cf-41e9-8291-470b19f2ddfe")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("92ac426f-f518-42c6-a4d6-c16089bb4e45")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("93f1cfac-b024-4ca3-983f-3fdf7c7c37e1")
    @SmaMetaAssociation(metaName="EndPointRefs", typeDataClass=BpmnEndPointData.class, min=0, max=-1, smAssociationClass=Metadata.EndPointRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mEndPointRefs = null;

    @objid ("a462580e-578e-4165-a856-f3ed0e629fb5")
    @SmaMetaAssociation(metaName="InterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.InterfaceRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mInterfaceRefs = null;

    @objid ("cb9a7de7-0a4e-40ae-a06f-56132e891a38")
    @SmaMetaAssociation(metaName="PackageRef", typeDataClass=PackageData.class, min=0, max=1, smAssociationClass=Metadata.PackageRefSmDependency.class, partof = true)
     SmObjectImpl mPackageRef;

    @objid ("e7d41c04-c97a-41be-8770-9a5c08bb3972")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001a41a4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b13794ad-3ffb-4eac-b937-5f59c6e95303")
        private static SmClass smClass = null;

        @objid ("397ceed5-47df-41c3-b6a5-7964858db9aa")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("156fc073-6478-4372-8d1d-c89bd4985c53")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("8fd1e735-6139-4409-aa0b-276232f3a7e4")
        private static SmDependency ProcessDep = null;

        @objid ("a53c5d0a-a9ee-4227-b8d5-071d4562dc0f")
        private static SmDependency ContainerDep = null;

        @objid ("d6fd680d-6c22-4a60-ae9d-8b4bf8b16b48")
        private static SmDependency TypeDep = null;

        @objid ("4bda85fa-d17e-463e-ba66-a41f320705d2")
        private static SmDependency EndPointRefsDep = null;

        @objid ("f6e90769-c85c-4a7f-b034-b3526840899f")
        private static SmDependency InterfaceRefsDep = null;

        @objid ("6fbd48af-d85a-4be0-9268-1f4289ceaad2")
        private static SmDependency PackageRefDep = null;

        @objid ("73bbf09b-3c09-4a3d-8bed-682310557bde")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParticipantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ee88ec6a-3ef4-45ac-8c25-1345a0ad79c1")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("799e25ba-c223-4944-8b98-feff469e25de")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("c429b0a9-b7d7-427c-bcfd-7ce10394bcfb")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("799a5208-fed2-4472-a237-1cc7cb2119b4")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("89685ad8-001e-4f65-841b-0443f5941c49")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("4368bab9-5f21-4a7d-a546-32a33584dbde")
        public static SmDependency EndPointRefsDep() {
            if (EndPointRefsDep == null) {
            	EndPointRefsDep = classof().getDependencyDef("EndPointRefs");
            }
            return EndPointRefsDep;
        }

        @objid ("cf929512-e3be-473f-9711-7dd9755a6908")
        public static SmDependency InterfaceRefsDep() {
            if (InterfaceRefsDep == null) {
            	InterfaceRefsDep = classof().getDependencyDef("InterfaceRefs");
            }
            return InterfaceRefsDep;
        }

        @objid ("e7aaba97-162e-4f9e-b100-79fb24d93897")
        public static SmDependency PackageRefDep() {
            if (PackageRefDep == null) {
            	PackageRefDep = classof().getDependencyDef("PackageRef");
            }
            return PackageRefDep;
        }

        @objid ("6e516f47-e40b-42a7-994a-3852e1c5579d")
        public static SmDependency getPackageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageRefDep;
        }

        @objid ("76b3ce1a-5f2a-43bd-b922-6a9de34433e2")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("0b2be053-562c-4301-8732-6d6a3471735e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("acf0decb-6298-4a1e-af8d-b115debc0b22")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("7ab80915-6aa2-4cb4-b27e-42fe677eea6e")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("14bec49d-285e-455d-8ce6-d695d1b82df5")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("5a5ee930-c18a-4fa9-9b5d-a214745994f4")
        public static SmDependency getInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterfaceRefsDep;
        }

        @objid ("bf5a0aa1-2929-4c1f-98f9-e7071f94c7b8")
        public static SmDependency getEndPointRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndPointRefsDep;
        }

        @objid ("7c148b2e-4193-4b0d-8ef0-b246f284731c")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("001a8286-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90f3ac32-58ba-4d28-b7cb-21c3ead1166a")
            public ISmObjectData createData() {
                return new BpmnParticipantData();
            }

            @objid ("a15b4050-6b5c-490d-84d3-0ad40fec7f83")
            public SmObjectImpl createImpl() {
                return new BpmnParticipantImpl();
            }

        }

        @objid ("001aee7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("18d123d5-c5b1-4181-a7e0-d7e5989516b8")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMin;
            }

            @objid ("9ab67564-6900-47a8-a0ac-f388c3803b4a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMin = value;
            }

        }

        @objid ("001b50ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("60e9af74-61d9-405b-9acb-3349bd7919de")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMax;
            }

            @objid ("a9c4ad1b-d831-40a8-8cc0-0a003558e2a2")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMax = value;
            }

        }

        @objid ("001bb598-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("b9ed77a3-e7b7-4f6b-b18c-c49cb2c9c78a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mType;
            }

            @objid ("d211f645-6a78-425a-9375-2d1ea07c7c5e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mType = value;
            }

            @objid ("8637a4a5-32cc-44eb-ab69-8e056f0464e7")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001c2b9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageRefSmDependency extends SmSingleDependency {
            @objid ("89a24b03-6db0-43b2-8f3d-2ba5f06e8fe4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mPackageRef;
            }

            @objid ("b4e1b324-f9f6-45f1-976c-b8f7f5a9a25e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mPackageRef = value;
            }

            @objid ("c5250a17-fb21-4a96-b2d1-3544c4d47b66")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001ca1d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("130fa35c-74d6-4313-a681-cbc7d4fac65e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mProcess;
            }

            @objid ("ee52377e-8d87-40e2-85a8-e316ef4ac12f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mProcess = value;
            }

            @objid ("096f5725-4209-474f-a80e-69e462e16cb4")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ParticipantDep();
            }

        }

        @objid ("001d18f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("cba8a268-25b3-43ed-948a-465a2f2e0a52")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mInterfaceRefs != null)? ((BpmnParticipantData)data).mInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("64e02bc6-eb34-4a80-85a3-f7ee56aef453")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mInterfaceRefs;
            }

            @objid ("5ce216be-2ada-429d-9117-c8475e3d8075")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ParticipantRefDep();
            }

        }

        @objid ("001d8170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EndPointRefsSmDependency extends SmMultipleDependency {
            @objid ("0146590a-1b2f-4053-b75c-94f41e840852")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mEndPointRefs != null)? ((BpmnParticipantData)data).mEndPointRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("298a9c0b-1a8a-4d3f-b193-977bade4411c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mEndPointRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mEndPointRefs;
            }

            @objid ("5aaffdac-56c4-4601-91b7-e7a7ab5e08e7")
            @Override
            public SmDependency getSymetric() {
                return BpmnEndPointData.Metadata.ParticipantRefsDep();
            }

        }

        @objid ("001de836-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("a5ef097d-5780-4747-954a-a1709634b1f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mContainer;
            }

            @objid ("644eff18-8f99-49e7-ab00-48bda86c5f44")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mContainer = value;
            }

            @objid ("a55486f1-58da-4e8d-b80f-27e211c4d028")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ParticipantsDep();
            }

        }

    }

}
