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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ExceptionHandlerData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.statik.GeneralClassImpl;
import org.modelio.metamodel.uml.statik.GeneralClass;
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

@objid ("000c3550-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=GeneralClass.class, factory=GeneralClassData.Metadata.ObjectFactory.class)
public abstract class GeneralClassData extends ClassifierData {
    @objid ("bb356091-57b2-47cc-b97f-b3caf20e6718")
    @SmaMetaAttribute(metaName="IsElementary", type=Boolean.class, smAttributeClass=Metadata.IsElementarySmAttribute.class)
     Object mIsElementary = false;

    @objid ("ca813ae7-cddc-465d-bc94-d5f83878cc3f")
    @SmaMetaAssociation(metaName="BpmnInterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnInterfaceRefsSmDependency.class)
     List<SmObjectImpl> mBpmnInterfaceRefs = null;

    @objid ("426a2295-6c8d-427b-b7b8-70d3226a2419")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurence = null;

    @objid ("8620f002-91e8-43c3-bfc5-6571bb7b6273")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=ExceptionHandlerData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class)
     SmObjectImpl mExceptionInput;

    @objid ("5e357b02-2288-4303-906c-f0eb3488241f")
    @SmaMetaAssociation(metaName="Object", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.ObjectSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mObject = null;

    @objid ("9b000a42-df0f-44c1-bdd5-7a09ea7883e4")
    @SmaMetaAssociation(metaName="BpmnMessageRefs", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnMessageRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnMessageRefs = null;

    @objid ("269553f3-6fa8-4573-a8d4-0566d8fa9ca7")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("e42a4536-4b06-4898-aa72-0eb6ad8e516b")
    @SmaMetaAssociation(metaName="BpmnItemDefinitionRefs", typeDataClass=BpmnItemDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemDefinitionRefsSmDependency.class)
     List<SmObjectImpl> mBpmnItemDefinitionRefs = null;

    @objid ("f58e1b0a-d791-47d8-bc4a-003bee544bcc")
    @SmaMetaAssociation(metaName="OccurenceObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceObjectNodeSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceObjectNode = null;

    @objid ("7aa86c4e-399a-4a12-ba75-42ce61701f14")
    @SmaMetaAssociation(metaName="BpmnItemAwareRefs", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemAwareRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnItemAwareRefs = null;

    @objid ("df23005f-783f-4432-82d4-307e7312a338")
    @SmaMetaAssociation(metaName="OccurenceConfigParam", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceConfigParamSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceConfigParam = null;

    @objid ("181f35b2-cfbc-4d77-9b29-6bfad517a27e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00598ce2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f63715d9-b121-428c-bd97-f4b103f5d73a")
        private static SmClass smClass = null;

        @objid ("fd482719-76a0-4aae-bdb4-6b5e9f447e71")
        private static SmAttribute IsElementaryAtt = null;

        @objid ("7dbd8c57-f9a6-45ee-8101-3578dae89ea0")
        private static SmDependency BpmnInterfaceRefsDep = null;

        @objid ("94a60678-2a9d-4564-9764-431dca890a0e")
        private static SmDependency OccurenceDep = null;

        @objid ("6990f1fd-2aea-4dc6-abe3-9332775b6d96")
        private static SmDependency ExceptionInputDep = null;

        @objid ("1e749d0c-4894-4932-a7c9-d461b55a1d2d")
        private static SmDependency ObjectDep = null;

        @objid ("c44eb700-f259-4602-b3c5-83e8899cd800")
        private static SmDependency BpmnMessageRefsDep = null;

        @objid ("18e4928c-db58-410d-af0c-3a95f9282145")
        private static SmDependency SRepresentationDep = null;

        @objid ("42d5844c-5448-4d7f-8ffd-22d7f48a3339")
        private static SmDependency BpmnItemDefinitionRefsDep = null;

        @objid ("d7f5ac64-3bfb-4302-9b88-414474051c1b")
        private static SmDependency OccurenceObjectNodeDep = null;

        @objid ("62d23c99-e48b-4148-9572-7df0cf72be05")
        private static SmDependency BpmnItemAwareRefsDep = null;

        @objid ("9d23a704-195a-4a15-97ce-1583c28fbd70")
        private static SmDependency OccurenceConfigParamDep = null;

        @objid ("5146d61c-06a3-426a-a437-eb166edc64de")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0eed3ac0-29db-4498-86cc-b8c7a2cbca55")
        public static SmAttribute IsElementaryAtt() {
            if (IsElementaryAtt == null) {
            	IsElementaryAtt = classof().getAttributeDef("IsElementary");
            }
            return IsElementaryAtt;
        }

        @objid ("e77cc58d-9fe2-4c7f-887e-a3641ed5d64b")
        public static SmDependency BpmnInterfaceRefsDep() {
            if (BpmnInterfaceRefsDep == null) {
            	BpmnInterfaceRefsDep = classof().getDependencyDef("BpmnInterfaceRefs");
            }
            return BpmnInterfaceRefsDep;
        }

        @objid ("e6453e48-da27-4d6c-a6a1-5d7b28c2b6c6")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("30533829-5bb5-4fe2-b26e-8f0990ca513c")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("390ab113-a970-42ce-87b7-90a49d24fcf5")
        public static SmDependency ObjectDep() {
            if (ObjectDep == null) {
            	ObjectDep = classof().getDependencyDef("Object");
            }
            return ObjectDep;
        }

        @objid ("9d823e5b-fe32-40ad-9e65-b6c7cb36877a")
        public static SmDependency BpmnMessageRefsDep() {
            if (BpmnMessageRefsDep == null) {
            	BpmnMessageRefsDep = classof().getDependencyDef("BpmnMessageRefs");
            }
            return BpmnMessageRefsDep;
        }

        @objid ("0399d4f2-9d8b-4923-9fb3-0d2363ddb711")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("d72d5b4b-d502-4b89-bb79-1ed97bd3fdd0")
        public static SmDependency BpmnItemDefinitionRefsDep() {
            if (BpmnItemDefinitionRefsDep == null) {
            	BpmnItemDefinitionRefsDep = classof().getDependencyDef("BpmnItemDefinitionRefs");
            }
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("6121b77b-70db-4613-88c4-6142d10eef2a")
        public static SmDependency OccurenceObjectNodeDep() {
            if (OccurenceObjectNodeDep == null) {
            	OccurenceObjectNodeDep = classof().getDependencyDef("OccurenceObjectNode");
            }
            return OccurenceObjectNodeDep;
        }

        @objid ("1de50a2a-b624-47d6-906c-61ab801cfdd8")
        public static SmDependency BpmnItemAwareRefsDep() {
            if (BpmnItemAwareRefsDep == null) {
            	BpmnItemAwareRefsDep = classof().getDependencyDef("BpmnItemAwareRefs");
            }
            return BpmnItemAwareRefsDep;
        }

        @objid ("d8009a4e-6afe-4ec5-a2ca-f7769af42893")
        public static SmDependency OccurenceConfigParamDep() {
            if (OccurenceConfigParamDep == null) {
            	OccurenceConfigParamDep = classof().getDependencyDef("OccurenceConfigParam");
            }
            return OccurenceConfigParamDep;
        }

        @objid ("2e4d4500-2832-45d3-a9f9-84d60dc4bdbc")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("e3aa05aa-6b13-4521-8406-b7bc8000efa2")
        public static SmAttribute getIsElementaryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsElementaryAtt;
        }

        @objid ("abc16bad-34db-4782-9b7e-63983ee14aa6")
        public static SmDependency getBpmnMessageRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnMessageRefsDep;
        }

        @objid ("cc33eddb-d614-45ac-97fe-5c589551d5c1")
        public static SmDependency getBpmnItemDefinitionRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("cf215729-3e6a-475c-acad-70b2373c339b")
        public static SmDependency getOccurenceConfigParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceConfigParamDep;
        }

        @objid ("25c26ff9-a46b-49aa-8952-834a4635cf74")
        public static SmDependency getObjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ObjectDep;
        }

        @objid ("b2182edb-bc11-480a-b894-08a06ecee197")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("a5b4654f-0b1e-4b7e-ad77-866bcd82da11")
        public static SmDependency getBpmnInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefsDep;
        }

        @objid ("5070b34a-84fb-4253-b4fb-13a024a60b56")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("7dc4c78f-6977-47a6-b64a-1ed6e651ac5a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5fea3f17-487d-48ed-bb52-ac8a25fcf1a3")
        public static SmDependency getOccurenceObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceObjectNodeDep;
        }

        @objid ("3c7820c0-a53f-476c-9dee-024cd7358004")
        public static SmDependency getBpmnItemAwareRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemAwareRefsDep;
        }

        @objid ("0059cd56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5ec6fad1-1ea2-4c37-b947-46e713df7236")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("deb8ff43-b909-41ae-9139-5cb83c19fbd5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("005a2f26-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsElementarySmAttribute extends SmAttribute {
            @objid ("8f4e40df-a31a-4898-9f88-1d723450879a")
            public Object getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mIsElementary;
            }

            @objid ("9a2dd8cd-4006-42ef-8a65-a70eb49007c4")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralClassData) data).mIsElementary = value;
            }

        }

        @objid ("005a98ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("43af4a84-dcf1-440c-bba2-b64743b69483")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurence != null)? ((GeneralClassData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("52e1e30c-6013-4cda-8cf7-09bd4793f089")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurence;
            }

            @objid ("03d2a5aa-8295-4d37-acc2-1b0e25e93dfd")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005afb22-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectSmDependency extends SmMultipleDependency {
            @objid ("da29625c-e2ad-4c36-a71f-19cd96de344a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mObject != null)? ((GeneralClassData)data).mObject:SmMultipleDependency.EMPTY;
            }

            @objid ("fd25ee6c-b8f7-40c9-a6f4-8f0feed63a84")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mObject = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mObject;
            }

            @objid ("7f18730c-26c4-450a-8cc1-72484edf6197")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.TypeDep();
            }

        }

        @objid ("005b5d9c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("a10469cf-2c2d-45c7-8ff3-8554366952a8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mSRepresentation != null)? ((GeneralClassData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("949f4b44-f37c-4415-9ce1-3d4cdc94a231")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mSRepresentation;
            }

            @objid ("98002d51-701c-4893-be99-d8b92e5efd6c")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.BaseDep();
            }

        }

        @objid ("005bc246-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("681a8dd3-c77b-4602-bc92-78f60e0cd4f4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceObjectNode != null)? ((GeneralClassData)data).mOccurenceObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("9ce96bd4-bd13-4c30-a59d-30a02108eebe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceObjectNode = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceObjectNode;
            }

            @objid ("76ad5833-aa22-4c3a-8ac2-6c667b7dfed4")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.TypeDep();
            }

        }

        @objid ("005c2678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceConfigParamSmDependency extends SmMultipleDependency {
            @objid ("15ca21bd-ecd6-42b9-bc68-928745c27cdd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceConfigParam != null)? ((GeneralClassData)data).mOccurenceConfigParam:SmMultipleDependency.EMPTY;
            }

            @objid ("e20ba85e-2019-400b-9dc2-e777a9daac20")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceConfigParam = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceConfigParam;
            }

            @objid ("b0c63786-1357-4740-b028-af473433cea9")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005c8adc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("2d5aae80-b993-4f9c-952e-074f7bd20eb0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mExceptionInput;
            }

            @objid ("4df7b00f-6e0a-464a-bb8f-6123aefe696b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralClassData) data).mExceptionInput = value;
            }

            @objid ("2c19abea-c7f2-4f2b-ad89-d05319d1a707")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionTypeDep();
            }

        }

        @objid ("005d0296-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemDefinitionRefsSmDependency extends SmMultipleDependency {
            @objid ("387b2de6-c3a3-4d1f-b2dd-36b527623780")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemDefinitionRefs != null)? ((GeneralClassData)data).mBpmnItemDefinitionRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("77202536-69cb-4cd1-8acb-a237d914cd16")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemDefinitionRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemDefinitionRefs;
            }

            @objid ("d64e0ff5-f581-4693-aefb-91bdbf7b552a")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.StructureRefDep();
            }

        }

        @objid ("005d67fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("15302ae8-a113-448f-9566-a5e1c185b3cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnInterfaceRefs != null)? ((GeneralClassData)data).mBpmnInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("46bdd730-cc31-4a59-b806-8203c6b14701")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnInterfaceRefs;
            }

            @objid ("96978db5-9c58-470f-b5ad-8d7abb24bac9")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("005dcd84-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemAwareRefsSmDependency extends SmMultipleDependency {
            @objid ("c80c5eee-9b4f-48c5-8bbe-ac8fa2f93a0e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemAwareRefs != null)? ((GeneralClassData)data).mBpmnItemAwareRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("544ed90c-e547-4c37-b268-9b4f574aff1f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemAwareRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemAwareRefs;
            }

            @objid ("92c7b5f2-e53f-4b3a-b07f-42d1a159667e")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TypeDep();
            }

        }

        @objid ("005e360c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnMessageRefsSmDependency extends SmMultipleDependency {
            @objid ("5ca9cc20-c6ef-4d8d-a3c6-26bc045df0f9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnMessageRefs != null)? ((GeneralClassData)data).mBpmnMessageRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("93a3bafb-0457-401c-bb81-ca96064fdfc4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnMessageRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnMessageRefs;
            }

            @objid ("e7a638d0-5c10-49f5-8526-fd0e27665a4f")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.TypeDep();
            }

        }

    }

}
