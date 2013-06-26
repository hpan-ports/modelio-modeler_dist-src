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
    @objid ("f8f6c365-b7c5-4f07-a9d4-69e968257035")
    @SmaMetaAttribute(metaName="IsElementary", type=Boolean.class, smAttributeClass=Metadata.IsElementarySmAttribute.class)
     Object mIsElementary = false;

    @objid ("1b25f804-8a09-4f21-ac4e-e28d8eff6208")
    @SmaMetaAssociation(metaName="BpmnInterfaceRefs", typeDataClass=BpmnInterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnInterfaceRefsSmDependency.class)
     List<SmObjectImpl> mBpmnInterfaceRefs = null;

    @objid ("76ea2700-63ac-45a4-bce2-69b23003f871")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurence = null;

    @objid ("7231d681-307d-4655-b0cd-389321422b1d")
    @SmaMetaAssociation(metaName="ExceptionInput", typeDataClass=ExceptionHandlerData.class, min=1, max=1, smAssociationClass=Metadata.ExceptionInputSmDependency.class)
     SmObjectImpl mExceptionInput;

    @objid ("84904061-bbd6-46ad-bacb-02d51e5410de")
    @SmaMetaAssociation(metaName="Object", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.ObjectSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mObject = null;

    @objid ("51167a65-b2c9-4a21-b1ed-479232abdfa1")
    @SmaMetaAssociation(metaName="BpmnMessageRefs", typeDataClass=BpmnMessageData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnMessageRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnMessageRefs = null;

    @objid ("79fd46c3-20d6-40a3-9787-0f85a585b59b")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("9d203216-7e8f-4ea5-bbca-acc374ef55b3")
    @SmaMetaAssociation(metaName="BpmnItemDefinitionRefs", typeDataClass=BpmnItemDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemDefinitionRefsSmDependency.class)
     List<SmObjectImpl> mBpmnItemDefinitionRefs = null;

    @objid ("dd0a5aa1-d194-4d41-8993-2cbaee37ffc3")
    @SmaMetaAssociation(metaName="OccurenceObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceObjectNodeSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceObjectNode = null;

    @objid ("4a507d64-a779-468f-ab3b-f66b4ba8a6e7")
    @SmaMetaAssociation(metaName="BpmnItemAwareRefs", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnItemAwareRefsSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mBpmnItemAwareRefs = null;

    @objid ("856e9edb-52e6-410a-8131-56e7856b51e2")
    @SmaMetaAssociation(metaName="OccurenceConfigParam", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceConfigParamSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mOccurenceConfigParam = null;

    @objid ("ae01434c-4c1c-4be2-a013-d50658c6102b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00598ce2-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8da331bd-1ca2-47fd-815c-b6505f1799eb")
        private static SmClass smClass = null;

        @objid ("15761112-35f5-4855-97db-de9c77424932")
        private static SmAttribute IsElementaryAtt = null;

        @objid ("84890914-9017-46ab-83c2-0effbe9ff61e")
        private static SmDependency BpmnInterfaceRefsDep = null;

        @objid ("59b54eba-e676-41ba-93e5-0dd50453d2cf")
        private static SmDependency OccurenceDep = null;

        @objid ("dab42a2b-892a-46b6-ac41-b9f7a1ba2424")
        private static SmDependency ExceptionInputDep = null;

        @objid ("e4c2e198-2da2-4447-92bb-7e794c4815b9")
        private static SmDependency ObjectDep = null;

        @objid ("2eff25c4-4e37-4307-bbac-4d939a1ca9be")
        private static SmDependency BpmnMessageRefsDep = null;

        @objid ("ecbbf364-a22f-4ba3-97d8-6bb4cfeb4e6c")
        private static SmDependency SRepresentationDep = null;

        @objid ("5acba113-3d76-4673-9176-e98e1fde7220")
        private static SmDependency BpmnItemDefinitionRefsDep = null;

        @objid ("8033ef09-9f04-4fc6-ae8f-103ef80ed534")
        private static SmDependency OccurenceObjectNodeDep = null;

        @objid ("daff2197-9938-496f-b0ea-03602827cb87")
        private static SmDependency BpmnItemAwareRefsDep = null;

        @objid ("d509a363-d196-4353-897f-b917d3b701f3")
        private static SmDependency OccurenceConfigParamDep = null;

        @objid ("8d93bcb6-cb0a-4607-b190-b1a572ebe742")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GeneralClassData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6a6c8201-e1ae-498a-836e-c48e1d3f2f46")
        public static SmAttribute IsElementaryAtt() {
            if (IsElementaryAtt == null) {
            	IsElementaryAtt = classof().getAttributeDef("IsElementary");
            }
            return IsElementaryAtt;
        }

        @objid ("4f79da53-f806-417a-8538-521903f2f330")
        public static SmDependency BpmnInterfaceRefsDep() {
            if (BpmnInterfaceRefsDep == null) {
            	BpmnInterfaceRefsDep = classof().getDependencyDef("BpmnInterfaceRefs");
            }
            return BpmnInterfaceRefsDep;
        }

        @objid ("57f40ce0-6335-497d-9e6e-e2b98b511e4d")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("abd72d03-0ab8-4e21-8edb-a9d6315e4fa9")
        public static SmDependency ExceptionInputDep() {
            if (ExceptionInputDep == null) {
            	ExceptionInputDep = classof().getDependencyDef("ExceptionInput");
            }
            return ExceptionInputDep;
        }

        @objid ("9c600c8f-2723-4761-96db-b95fd42a00f8")
        public static SmDependency ObjectDep() {
            if (ObjectDep == null) {
            	ObjectDep = classof().getDependencyDef("Object");
            }
            return ObjectDep;
        }

        @objid ("993c2147-0a28-4ebd-8afe-0f053f2f8816")
        public static SmDependency BpmnMessageRefsDep() {
            if (BpmnMessageRefsDep == null) {
            	BpmnMessageRefsDep = classof().getDependencyDef("BpmnMessageRefs");
            }
            return BpmnMessageRefsDep;
        }

        @objid ("e19eb873-ea88-4dec-88c8-e4204ab96856")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("21c4056f-32fd-4b67-ae51-01063ce7d43f")
        public static SmDependency BpmnItemDefinitionRefsDep() {
            if (BpmnItemDefinitionRefsDep == null) {
            	BpmnItemDefinitionRefsDep = classof().getDependencyDef("BpmnItemDefinitionRefs");
            }
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("c04db4a0-3cd8-471b-b953-b10aeb5efbea")
        public static SmDependency OccurenceObjectNodeDep() {
            if (OccurenceObjectNodeDep == null) {
            	OccurenceObjectNodeDep = classof().getDependencyDef("OccurenceObjectNode");
            }
            return OccurenceObjectNodeDep;
        }

        @objid ("a1f89a08-c1b9-477a-8ca5-8b1ccd858a2b")
        public static SmDependency BpmnItemAwareRefsDep() {
            if (BpmnItemAwareRefsDep == null) {
            	BpmnItemAwareRefsDep = classof().getDependencyDef("BpmnItemAwareRefs");
            }
            return BpmnItemAwareRefsDep;
        }

        @objid ("6dcd3f28-34cc-47a9-a2ac-a1c30807241e")
        public static SmDependency OccurenceConfigParamDep() {
            if (OccurenceConfigParamDep == null) {
            	OccurenceConfigParamDep = classof().getDependencyDef("OccurenceConfigParam");
            }
            return OccurenceConfigParamDep;
        }

        @objid ("a7e5f69e-a62f-47c4-bd1d-17d0df537dff")
        public static SmDependency getOccurenceObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceObjectNodeDep;
        }

        @objid ("050fda1f-8b33-4e1e-bed8-e688ba448fc8")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("5e4b66aa-b1eb-4ebb-806e-43b85d6a1987")
        public static SmAttribute getIsElementaryAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsElementaryAtt;
        }

        @objid ("5aaccd04-5804-45b0-a7b0-0d25f45798db")
        public static SmDependency getBpmnItemAwareRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemAwareRefsDep;
        }

        @objid ("9d7ae252-ff1a-4e0f-8f74-199a8bc29694")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fbf2c718-b23f-4d17-b030-1c842cb4eb50")
        public static SmDependency getOccurenceConfigParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceConfigParamDep;
        }

        @objid ("838df456-c689-4d04-8d50-924c7c8225e1")
        public static SmDependency getBpmnItemDefinitionRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnItemDefinitionRefsDep;
        }

        @objid ("4b3337cd-fcd1-443f-adaa-002c95a7bd54")
        public static SmDependency getExceptionInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExceptionInputDep;
        }

        @objid ("864d10af-f84a-430d-b223-adc364fbc474")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("2bff450a-ec43-4673-a0d5-20c150b67c07")
        public static SmDependency getObjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ObjectDep;
        }

        @objid ("7c036836-53df-44b5-ab2b-8a2a796fbb91")
        public static SmDependency getBpmnInterfaceRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefsDep;
        }

        @objid ("47f05eb6-7889-4d0f-b197-8f96c0a40751")
        public static SmDependency getBpmnMessageRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnMessageRefsDep;
        }

        @objid ("0059cd56-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("77e0d918-143c-477b-b1e3-eb9860752e7a")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("f48eb057-dbcc-4668-8c59-86fac795c521")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("005a2f26-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsElementarySmAttribute extends SmAttribute {
            @objid ("6fa4b5b1-ba85-4927-8a94-aed59b9d10d4")
            public Object getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mIsElementary;
            }

            @objid ("79803d89-9079-4b32-8ee6-8f4b623ae481")
            public void setValue(ISmObjectData data, Object value) {
                ((GeneralClassData) data).mIsElementary = value;
            }

        }

        @objid ("005a98ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("8536a700-8e25-479f-8ae8-ea6cfa812d2b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurence != null)? ((GeneralClassData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("770d8259-7fc7-42ed-a010-8422c9ec931d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurence;
            }

            @objid ("a2b9abe8-71e0-49c0-8701-74f147b69727")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005afb22-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectSmDependency extends SmMultipleDependency {
            @objid ("a9930791-7ed7-45e7-aa92-f9ef39d978a5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mObject != null)? ((GeneralClassData)data).mObject:SmMultipleDependency.EMPTY;
            }

            @objid ("bfe95e41-133f-4fd6-8fb3-5ddcd58e323f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mObject = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mObject;
            }

            @objid ("96da1893-8f2e-4a9e-9582-e55aef043c92")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.TypeDep();
            }

        }

        @objid ("005b5d9c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("4381414e-3345-4b66-90b7-839bad418d92")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mSRepresentation != null)? ((GeneralClassData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("f2405467-7b1d-4d2e-818d-040c19b85219")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mSRepresentation;
            }

            @objid ("64703754-5857-4f6d-a20a-3166b40ec414")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.BaseDep();
            }

        }

        @objid ("005bc246-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("2ab2316b-b6f9-410e-865e-cf146cfd50f8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceObjectNode != null)? ((GeneralClassData)data).mOccurenceObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("f973fb0f-ee0e-4738-b69b-51b68ce631c2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceObjectNode = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceObjectNode;
            }

            @objid ("2594d3df-c209-48b1-9b61-dd721546fc2e")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.TypeDep();
            }

        }

        @objid ("005c2678-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OccurenceConfigParamSmDependency extends SmMultipleDependency {
            @objid ("45bfaa1d-1dd1-49b7-81c7-60365d47e58e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mOccurenceConfigParam != null)? ((GeneralClassData)data).mOccurenceConfigParam:SmMultipleDependency.EMPTY;
            }

            @objid ("3e00e442-8305-4a28-96c1-658e91beadae")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mOccurenceConfigParam = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mOccurenceConfigParam;
            }

            @objid ("2f6a21a3-81d0-4793-9181-c45334818e5e")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.TypeDep();
            }

        }

        @objid ("005c8adc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExceptionInputSmDependency extends SmSingleDependency {
            @objid ("ca090cc6-5c22-4aa2-85aa-f3432dd385fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GeneralClassData) data).mExceptionInput;
            }

            @objid ("1cb4704c-f6d0-4515-8794-4076252aab67")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GeneralClassData) data).mExceptionInput = value;
            }

            @objid ("d416adb7-bd37-4d28-847f-616c2cdc834e")
            @Override
            public SmDependency getSymetric() {
                return ExceptionHandlerData.Metadata.ExceptionTypeDep();
            }

        }

        @objid ("005d0296-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemDefinitionRefsSmDependency extends SmMultipleDependency {
            @objid ("59e6a8b6-2e53-4450-937f-ea418e3902a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemDefinitionRefs != null)? ((GeneralClassData)data).mBpmnItemDefinitionRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("49bfec10-cf32-4261-a5f5-cd5ce9a13ade")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemDefinitionRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemDefinitionRefs;
            }

            @objid ("4e7b0dff-d5f2-4a2a-ab2c-126030c21441")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.StructureRefDep();
            }

        }

        @objid ("005d67fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefsSmDependency extends SmMultipleDependency {
            @objid ("cf139aa8-2a68-488b-8574-e7b38c72aea1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnInterfaceRefs != null)? ((GeneralClassData)data).mBpmnInterfaceRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("00bcf1ee-e9ae-463d-883d-ca9668348ac4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnInterfaceRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnInterfaceRefs;
            }

            @objid ("7d5eb870-717f-438a-bfb5-abb844516b2c")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("005dcd84-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnItemAwareRefsSmDependency extends SmMultipleDependency {
            @objid ("5c66b190-7edc-4e8f-b367-7c450d300121")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnItemAwareRefs != null)? ((GeneralClassData)data).mBpmnItemAwareRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("ff4d7d16-c5a4-4b99-ba0c-844670a42477")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnItemAwareRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnItemAwareRefs;
            }

            @objid ("3f006567-b268-4a7b-901e-6a12405e7a96")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TypeDep();
            }

        }

        @objid ("005e360c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnMessageRefsSmDependency extends SmMultipleDependency {
            @objid ("5b3690f9-5fe8-4811-a7a0-615c456d4abf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GeneralClassData)data).mBpmnMessageRefs != null)? ((GeneralClassData)data).mBpmnMessageRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("e67a57cf-a4cd-481d-b9b2-856cde42d029")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GeneralClassData) data).mBpmnMessageRefs = new ArrayList<>(initialCapacity);
                return ((GeneralClassData) data).mBpmnMessageRefs;
            }

            @objid ("a74421a7-3b4f-49d6-ac9a-1263ec03ceeb")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.TypeDep();
            }

        }

    }

}
