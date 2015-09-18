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
    @objid ("dcee7d4a-5dd7-4652-af35-2cf5252b9011")
    @SmaMetaAttribute(metaName="IsElementary", type=Boolean.class, smAttributeClass=Metadata.IsElementarySmAttribute.class)
     Object mIsElementary = false;

    @objid ("0ee6a944-f437-49c2-be6e-ac4304d21ef0")
    @SmaMetaAssociation(metaName="BpmnInterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnInterfaceRefsSmDependency.class)
     List<SmObjectImpl> mBpmnInterfaceRefs = null;

    @objid ("2e3cfe14-4e47-4276-92da-09729b3d0f9d")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurence = null;

    @objid ("2a80cc6c-61e6-4265-9de0-75cc5003f45b")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=ExceptionHandlerData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class)
     SmObjectImpl mExceptionInput;

    @objid ("f8e52fd9-45a9-43a0-8780-a1fecab29d13")
    @SmaMetaAssociation(metaName="Object", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.ObjectSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mObject = null;

    @objid ("ee2d6818-2a80-457c-adb6-7a54f325afae")
    @SmaMetaAssociation(metaName="BpmnMessageRefs", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnMessageRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnMessageRefs = null;

    @objid ("00bb9223-59d6-476e-8c4b-80116c51e46c")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("0e594b0c-af75-4c0a-a783-38391a02a575")
    @SmaMetaAssociation(metaName="BpmnItemDefinitionRefs", typeDataClass=BpmnItemDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemDefinitionRefsSmDependency.class)
     List<SmObjectImpl> mBpmnItemDefinitionRefs = null;

    @objid ("b6bf0e48-69ed-498c-869d-f1865aea5f2a")
    @SmaMetaAssociation(metaName="OccurenceObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceObjectNodeSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceObjectNode = null;

    @objid ("08a7f8ec-0ba3-4f6a-9205-1ad2534c88b3")
    @SmaMetaAssociation(metaName="BpmnItemAwareRefs", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemAwareRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnItemAwareRefs = null;

    @objid ("9a1fd576-3fd6-4923-b0fa-6bc0abe2bb94")
    @SmaMetaAssociation(metaName="OccurenceConfigParam", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceConfigParamSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceConfigParam = null;

    @objid ("3b38df85-3553-404f-8354-4a826989b5fe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00598ce2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e8709179-c58a-4362-ab97-d4ec763cbf47")
        private static SmClass smClass = null;

        @objid ("874f1e85-0945-4503-99ff-d96fdb074472")
        private static SmAttribute IsElementaryAtt = null;

        @objid ("169a0d7f-8261-4643-897a-70d88a6ef19d")
        private static SmDependency BpmnInterfaceRefsDep = null;

        @objid ("7cae405c-d1f1-4217-a0cb-24cf5e0af6f8")
        private static SmDependency OccurenceDep = null;

        @objid ("966afd3b-a061-4210-b500-a5913ce8bcc8")
        private static SmDependency ExceptionInputDep = null;

        @objid ("d3c6546f-d18a-4847-8f0a-d6881802deff")
        private static SmDependency ObjectDep = null;

        @objid ("07f0f3ab-0a78-48ba-999a-043549b37bb1")
        private static SmDependency BpmnMessageRefsDep = null;

        @objid ("ff661cf7-8e61-4c0a-9118-33510d9ad61c")
        private static SmDependency SRepresentationDep = null;

        @objid ("530e077c-733c-458c-b53e-2a44a1571b36")
        private static SmDependency BpmnItemDefinitionRefsDep = null;

        @objid ("0253710c-8b2e-4e6d-a3b0-52f45a690530")
        private static SmDependency OccurenceObjectNodeDep = null;

        @objid ("d9b6b249-6e1b-4ccb-9cb1-41729e22f534")
        private static SmDependency BpmnItemAwareRefsDep = null;

        @objid ("0e03c9c3-b69e-4bcf-b760-75f18cd9dea9")
        private static SmDependency OccurenceConfigParamDep = null;

        @objid ("86472f7e-20d3-43bb-977f-74c50d7d2e85")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("72839ac3-e192-482a-9051-32d2e5e31020")
        public static SmAttribute IsElementaryAtt() {
            if (IsElementaryAtt == null) {
            	IsElementaryAtt = classof().getAttributeDef("IsElementary");
            }
            return IsElementaryAtt;
        }

        @objid ("598e5686-6f61-4be5-bcee-6c21d06b18bd")
        public static SmDependency BpmnInterfaceRefsDep() {
            if (BpmnInterfaceRefsDep == null) {
            	BpmnInterfaceRefsDep = classof().getDependencyDef("BpmnInterfaceRefs");
            }
            return BpmnInterfaceRefsDep;
        }

        @objid ("3eee5a09-2056-4aef-802f-97852133629f")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("b5d884a2-7eee-419d-98ab-85ba7c8d94c9")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("72d36a22-a0ba-47b3-afe7-977f0f55773c")
        public static SmDependency ObjectDep() {
            if (ObjectDep == null) {
            	ObjectDep = classof().getDependencyDef("Object");
            }
            return ObjectDep;
        }

        @objid ("8a1aa717-66d0-4a77-9c31-2b9621ee8e19")
        public static SmDependency BpmnMessageRefsDep() {
            if (BpmnMessageRefsDep == null) {
            	BpmnMessageRefsDep = classof().getDependencyDef("BpmnMessageRefs");
            }
            return BpmnMessageRefsDep;
        }

        @objid ("f0540ef5-52db-4c27-aa6f-6cd7ac419643")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("df40aa40-2a5d-4009-b2da-ed61bff70a8e")
        public static SmDependency BpmnItemDefinitionRefsDep() {
            if (BpmnItemDefinitionRefsDep == null) {
            	BpmnItemDefinitionRefsDep = classof().getDependencyDef("BpmnItemDefinitionRefs");
            }
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("5dc31715-1d82-4bc8-b9f4-7ff65dcca533")
        public static SmDependency OccurenceObjectNodeDep() {
            if (OccurenceObjectNodeDep == null) {
            	OccurenceObjectNodeDep = classof().getDependencyDef("OccurenceObjectNode");
            }
            return OccurenceObjectNodeDep;
        }

        @objid ("e28bbd7c-5f9a-43a6-b186-4f19ed061375")
        public static SmDependency BpmnItemAwareRefsDep() {
            if (BpmnItemAwareRefsDep == null) {
            	BpmnItemAwareRefsDep = classof().getDependencyDef("BpmnItemAwareRefs");
            }
            return BpmnItemAwareRefsDep;
        }

        @objid ("d9abd2f2-cf47-4e6c-b337-e1890a2eac64")
        public static SmDependency OccurenceConfigParamDep() {
            if (OccurenceConfigParamDep == null) {
            	OccurenceConfigParamDep = classof().getDependencyDef("OccurenceConfigParam");
            }
            return OccurenceConfigParamDep;
        }

        @objid ("9b55447a-813e-48cb-94ab-067614c9ef2b")
        public static SmDependency getBpmnItemAwareRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemAwareRefsDep;
        }

        @objid ("56852c31-332f-4559-8209-44d2a1aaf2e2")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("2b7f8f24-13e7-4d7a-ba26-d18a6d70024c")
        public static SmDependency getObjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ObjectDep;
        }

        @objid ("f526e042-47c8-4f7e-aa7e-5fde36a7571d")
        public static SmAttribute getIsElementaryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsElementaryAtt;
        }

        @objid ("902aacdc-8dda-4076-994c-a428e0cd8d35")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("d119bd1f-786c-4755-9d9a-a4d7ace43dd3")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("5f3af9c9-87f4-4232-a87b-4565736946f3")
        public static SmDependency getBpmnItemDefinitionRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("953bce37-a70c-4d84-99f3-8a8e4927f99f")
        public static SmDependency getBpmnMessageRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnMessageRefsDep;
        }

        @objid ("e7190683-f02e-48f4-9ae0-9738068dcb2f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("faa4024a-5230-46f5-ae68-eac7395e55cc")
        public static SmDependency getOccurenceObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceObjectNodeDep;
        }

        @objid ("8051bd17-4942-4bfb-bde7-d3f450e823d6")
        public static SmDependency getOccurenceConfigParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceConfigParamDep;
        }

        @objid ("6c55cb51-f0f8-49e5-bffd-ec94a59a5583")
        public static SmDependency getBpmnInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefsDep;
        }

        @objid ("0059cd56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("80269b41-b48b-4350-a018-5f617c536744")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("a0c5dabe-361b-4695-9150-7eb4c08ff770")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("005a2f26-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsElementarySmAttribute extends SmAttribute {
            @objid ("b2962bbc-ae44-4c50-bc9e-3796705b738b")
            public Object getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mIsElementary;
            }

            @objid ("5801bb1c-028c-41b2-9cb0-31a54880d127")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralClassData) data).mIsElementary = value;
            }

        }

        @objid ("005a98ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("1915f35d-085f-4443-a7c4-ac79822642f6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurence != null)? ((GeneralClassData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("5109ddac-37bf-4d1e-b5d0-ff5df9df1d3b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurence;
            }

            @objid ("fbd679ba-fc27-49b1-a6d8-4a5b61e2eae9")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005afb22-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectSmDependency extends SmMultipleDependency {
            @objid ("56ac237c-b9b9-4607-8136-c49c03454bba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mObject != null)? ((GeneralClassData)data).mObject:SmMultipleDependency.EMPTY;
            }

            @objid ("5d26d9f5-8a42-485f-a63a-bad4a6ca2346")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mObject = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mObject;
            }

            @objid ("8393aee8-290c-4392-8bf7-1b19360d752d")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.TypeDep();
            }

        }

        @objid ("005b5d9c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("75692d33-29cf-4ff9-8a0d-6a2006ad671d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mSRepresentation != null)? ((GeneralClassData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("2fe6dcd0-dc25-4156-81f8-0ddb56ed8136")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mSRepresentation;
            }

            @objid ("5f8426ec-f51c-41f5-8f9b-f140939c02c3")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.BaseDep();
            }

        }

        @objid ("005bc246-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("60f326fe-9664-4307-8ad4-90ca35604c4f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceObjectNode != null)? ((GeneralClassData)data).mOccurenceObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("d6b6ed8a-f464-49b4-afd0-b19c22d2b12b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceObjectNode = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceObjectNode;
            }

            @objid ("7c2bf914-761a-4bb8-93d5-400215c6aac0")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.TypeDep();
            }

        }

        @objid ("005c2678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceConfigParamSmDependency extends SmMultipleDependency {
            @objid ("4849ec89-ffae-400f-9474-b67d8e0e5859")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceConfigParam != null)? ((GeneralClassData)data).mOccurenceConfigParam:SmMultipleDependency.EMPTY;
            }

            @objid ("a2e5baee-693f-4363-9567-ac0f963eadda")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceConfigParam = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceConfigParam;
            }

            @objid ("09263d74-efa2-4dd8-bd17-74d7a7e33495")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005c8adc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("7d0b3821-ce6c-491f-90d6-d08518555967")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mExceptionInput;
            }

            @objid ("fda1f106-11fd-4ef1-ba0d-c43df483039d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralClassData) data).mExceptionInput = value;
            }

            @objid ("48db28fe-d21b-475f-b078-b11ad32cd48f")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionTypeDep();
            }

        }

        @objid ("005d0296-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemDefinitionRefsSmDependency extends SmMultipleDependency {
            @objid ("10b96d15-3db4-466e-81dc-732bb86a9dc0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemDefinitionRefs != null)? ((GeneralClassData)data).mBpmnItemDefinitionRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a34a68ef-f03e-46be-8268-40c277aebb9c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemDefinitionRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemDefinitionRefs;
            }

            @objid ("9898354b-8ad0-4836-bc4e-fcf49777a7dc")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.StructureRefDep();
            }

        }

        @objid ("005d67fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("15342b87-42b7-4fbd-b99c-cff723267971")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnInterfaceRefs != null)? ((GeneralClassData)data).mBpmnInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("c23f26a7-4c32-49e4-b84a-8de81f26f6bb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnInterfaceRefs;
            }

            @objid ("651232c4-e13e-4229-885c-7ac2930a51ac")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("005dcd84-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemAwareRefsSmDependency extends SmMultipleDependency {
            @objid ("38a5da76-66d3-4a1d-8a33-bb0490ee9679")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemAwareRefs != null)? ((GeneralClassData)data).mBpmnItemAwareRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("e555b07f-4571-45ef-957d-3b1b6de8cd90")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemAwareRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemAwareRefs;
            }

            @objid ("8a3a1a53-1154-460d-83a0-2c17007a6b5d")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TypeDep();
            }

        }

        @objid ("005e360c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnMessageRefsSmDependency extends SmMultipleDependency {
            @objid ("8eef49ee-aead-40f0-8738-bbb83fc8a090")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnMessageRefs != null)? ((GeneralClassData)data).mBpmnMessageRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("0dd1bdc2-edb8-4376-9d4c-74875af34ea0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnMessageRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnMessageRefs;
            }

            @objid ("7167f048-d2b6-40c0-b4d7-ec617920f02a")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.TypeDep();
            }

        }

    }

}
