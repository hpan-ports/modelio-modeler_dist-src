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
    @objid ("ac3d41ea-a4e0-44d1-abfd-f21f50790a9a")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=Integer.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = 0;

    @objid ("b6d2402e-3549-49ca-8ad3-268d59cd8e2e")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=Integer.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = 0;

    @objid ("92b8b5a7-c7f8-4c41-ac59-2c3304ca04c8")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class, partof = true)
     SmObjectImpl mProcess;

    @objid ("eac7a0f8-f09d-48b9-9d57-221acab7dd48")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("e4bbf263-8d4a-4d83-b623-65061d579dd4")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("4ff37213-7da2-4b7c-8fd7-9b8efbebc054")
    @SmaMetaAssociation(metaName="EndPointRefs", typeDataClass=BpmnEndPointData.class, min=0, max=-1, smAssociationClass=Metadata.EndPointRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mEndPointRefs = null;

    @objid ("907e31da-3de8-40a9-ae91-7d1b3027e9a3")
    @SmaMetaAssociation(metaName="InterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.InterfaceRefsSmDependency.class, partof = true)
     List<SmObjectImpl> mInterfaceRefs = null;

    @objid ("4fa4cbdf-2325-4649-a0fb-be22146cbcc5")
    @SmaMetaAssociation(metaName="PackageRef", typeDataClass=PackageData.class, min=0, max=1, smAssociationClass=Metadata.PackageRefSmDependency.class, partof = true)
     SmObjectImpl mPackageRef;

    @objid ("3e0fe710-69d3-4565-8b14-d54df62d2bee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001a41a4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dbecfe22-7ffb-4709-babb-d80479849c14")
        private static SmClass smClass = null;

        @objid ("fb16a61c-5133-4c48-910e-52245f6f53e2")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("060fe2c3-61f7-42d3-b72b-2f95b8b60159")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("3ae92cdb-3f0c-4849-9e5e-355b603cff30")
        private static SmDependency ProcessDep = null;

        @objid ("ec023c33-ec06-4544-bc66-d852e7511e7b")
        private static SmDependency ContainerDep = null;

        @objid ("2bc26d2f-03cd-4d47-9cd1-6357668aded8")
        private static SmDependency TypeDep = null;

        @objid ("59a9a48e-aa8f-40a6-884c-240d813446d3")
        private static SmDependency EndPointRefsDep = null;

        @objid ("e46ec457-a9de-4ffd-80e8-b04e90b422ae")
        private static SmDependency InterfaceRefsDep = null;

        @objid ("2ad662b9-d583-470d-a88a-6356b4750b05")
        private static SmDependency PackageRefDep = null;

        @objid ("0a8c6015-45b9-444d-8209-c0e8eb7a20b4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnParticipantData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("189a59cc-a2d3-4b80-9a28-8078f6df46fa")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("9504de47-93ec-4c10-a33d-5a663b4c9022")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("cc7cabd2-ecda-4055-a3d4-a76489d2379b")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("8bca112e-7eb2-475c-8eef-15dc0d3d2b34")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("4a65af8b-5c91-4c5c-aec5-410752458145")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("17f710ff-a5de-4b99-82f8-4a4a0578306e")
        public static SmDependency EndPointRefsDep() {
            if (EndPointRefsDep == null) {
            	EndPointRefsDep = classof().getDependencyDef("EndPointRefs");
            }
            return EndPointRefsDep;
        }

        @objid ("92916552-9dc0-4f4e-9dc9-e8a02bf69252")
        public static SmDependency InterfaceRefsDep() {
            if (InterfaceRefsDep == null) {
            	InterfaceRefsDep = classof().getDependencyDef("InterfaceRefs");
            }
            return InterfaceRefsDep;
        }

        @objid ("0a390bd2-b9af-4bb9-80d0-39455e498b1d")
        public static SmDependency PackageRefDep() {
            if (PackageRefDep == null) {
            	PackageRefDep = classof().getDependencyDef("PackageRef");
            }
            return PackageRefDep;
        }

        @objid ("7959877d-11fb-4336-beb9-626ac5fda538")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("f21e6041-d2fe-4273-a8af-8163e41815e8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f1868322-775f-4d01-b631-b141e2fbb978")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("d9516498-0bf9-4c7b-9617-dc8e72e973f4")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("b8c47fdf-be55-424d-8252-48c6a949bb3c")
        public static SmDependency getEndPointRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndPointRefsDep;
        }

        @objid ("2fadf172-9502-4cee-8c1d-4fb4705e5697")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("4f928a78-e304-4856-9eb8-25daee703590")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("9e83e1b7-e015-4a9f-8360-8c7cedddf05d")
        public static SmDependency getPackageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PackageRefDep;
        }

        @objid ("524e2d1a-fc5c-41b8-ae55-339e148c8c3d")
        public static SmDependency getInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InterfaceRefsDep;
        }

        @objid ("001a8286-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("65c15923-4a98-46dc-b151-ec40fdf9ce47")
            public ISmObjectData createData() {
                return new BpmnParticipantData();
            }

            @objid ("4e88a6e6-5ec5-4fad-a1fa-91e0636e046f")
            public SmObjectImpl createImpl() {
                return new BpmnParticipantImpl();
            }

        }

        @objid ("001aee7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("9258a98d-7573-4a5d-89c7-e0da17441aa4")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMin;
            }

            @objid ("736fe339-e9d3-40dc-a696-82f6ee2280cf")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMin = value;
            }

        }

        @objid ("001b50ee-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("0aee59f0-1aaa-4c58-a3b3-44321a505210")
            public Object getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mMultiplicityMax;
            }

            @objid ("c90a6263-b0ee-41e3-9696-5b734c6e24ae")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnParticipantData) data).mMultiplicityMax = value;
            }

        }

        @objid ("001bb598-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("8405da14-d722-445b-b9cc-ce8a792c7757")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mType;
            }

            @objid ("89651f2e-82c0-4870-9b3e-489f5a8d27f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mType = value;
            }

            @objid ("f7bb062d-b33a-4145-9207-cb85066254ed")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001c2b9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PackageRefSmDependency extends SmSingleDependency {
            @objid ("ba4504c3-cc2f-4e9d-b53c-68e850f3a005")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mPackageRef;
            }

            @objid ("73931c1d-fa3e-40e9-b794-f4c033f46ce2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mPackageRef = value;
            }

            @objid ("9a2b64a0-24bd-433c-97f1-3e7d0ecad3c1")
            @Override
            public SmDependency getSymetric() {
                return PackageData.Metadata.BpmnRepresentsDep();
            }

        }

        @objid ("001ca1d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("58464a1d-ce88-4aad-b186-b5013fdb67dd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mProcess;
            }

            @objid ("469831e3-d1d6-47d2-a2db-35bae42a0078")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mProcess = value;
            }

            @objid ("299377a9-7a49-4d20-bd06-8b161f97b9fd")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ParticipantDep();
            }

        }

        @objid ("001d18f2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("95614f7c-ba4d-4c47-ac6f-aa247740dc32")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mInterfaceRefs != null)? ((BpmnParticipantData)data).mInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("c631423f-19da-454e-98f8-d1e140837d7d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mInterfaceRefs;
            }

            @objid ("64b0b67e-45a0-4c49-88b8-4754c3fe1abd")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ParticipantRefDep();
            }

        }

        @objid ("001d8170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EndPointRefsSmDependency extends SmMultipleDependency {
            @objid ("4df18578-4ca4-495e-88ca-22a726022d1e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnParticipantData)data).mEndPointRefs != null)? ((BpmnParticipantData)data).mEndPointRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a62f8cbb-0bd5-4b08-9ad7-be048afb6c80")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnParticipantData) data).mEndPointRefs = new ArrayList<>(initialCapacity);
                return ((BpmnParticipantData) data).mEndPointRefs;
            }

            @objid ("24441868-1989-47f5-9205-324e821677bf")
            @Override
            public SmDependency getSymetric() {
                return BpmnEndPointData.Metadata.ParticipantRefsDep();
            }

        }

        @objid ("001de836-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("50946700-9ff8-4e9b-a059-f7ed51004abc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnParticipantData) data).mContainer;
            }

            @objid ("5db23536-1835-49ba-8abf-fccb471ebc8b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnParticipantData) data).mContainer = value;
            }

            @objid ("e8dd1f64-e8b5-492c-acfd-9d81c05a6a4f")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ParticipantsDep();
            }

        }

    }

}
