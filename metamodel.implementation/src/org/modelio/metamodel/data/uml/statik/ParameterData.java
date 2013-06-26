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
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.data.uml.behavior.activityModel.PinData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorParameterData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.ParameterImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.PassingMode;
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

@objid ("0018552e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Parameter.class, factory=ParameterData.Metadata.ObjectFactory.class)
public class ParameterData extends ModelElementData {
    @objid ("a6e4c866-9e3c-43b8-9da7-04935ced0d13")
    @SmaMetaAttribute(metaName="ParameterPassing", type=PassingMode.class, smAttributeClass=Metadata.ParameterPassingSmAttribute.class)
     Object mParameterPassing = PassingMode.IN;

    @objid ("76e85e1e-9b3c-4278-9bdf-cb5eeb6e574e")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("5f489d0d-9c5d-4eb6-9567-bc2c071c0ed5")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("3f29c50f-9584-4611-8c2c-a6a1a2242fbe")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("ec7e55e5-f655-4843-a62e-d13fb652c28b")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("084d5e10-84ee-4584-99f3-a06ea8d7fabd")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("9a8920f5-7a9e-4563-85e1-3272ee8294d3")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("8a89faa8-6bd2-447c-8584-3deb42108661")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("4d56b78d-22cc-46c2-8ecf-4536b89226c9")
    @SmaMetaAttribute(metaName="IsStream", type=Boolean.class, smAttributeClass=Metadata.IsStreamSmAttribute.class)
     Object mIsStream = false;

    @objid ("43ba2610-fef6-474a-bd19-af54e2d52f87")
    @SmaMetaAttribute(metaName="Effect", type=ParameterEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ParameterEffectKind.READEFFECT;

    @objid ("39ef460d-d500-4293-aaaf-494afc52f03b")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataInputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataInput = null;

    @objid ("af5d20f5-cbb1-4b13-b6dc-9fda373c5c70")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("0358f41b-d26a-4d82-830c-7dedda62cd79")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("ae250e2b-ec2d-4876-b32e-9bbfbbbf7bfc")
    @SmaMetaAssociation(metaName="Matching", typeDataClass=PinData.class, min=0, max=-1, smAssociationClass=Metadata.MatchingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mMatching = null;

    @objid ("9cc10ae2-bd19-41bb-bf4e-40f2e8405109")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataOutputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataOutput = null;

    @objid ("6c7a1699-7e57-4e8e-830d-63f4c898fd01")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("a5e40a71-31ee-434c-9555-498bb4a90e0a")
    @SmaMetaAssociation(metaName="Returned", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ReturnedSmDependency.class)
     SmObjectImpl mReturned;

    @objid ("e4f36490-72f5-45ca-ae06-c6a60b343aac")
    @SmaMetaAssociation(metaName="BehaviorParam", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.BehaviorParamSmDependency.class, istodelete = true)
     List<SmObjectImpl> mBehaviorParam = null;

    @objid ("327e9a19-2d9c-4805-888a-98b1a524c08f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00834ec4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fb47edc7-2c7a-4023-8631-65c9a57917b3")
        private static SmClass smClass = null;

        @objid ("d842f276-7032-4cb1-ac4f-5355fb38d748")
        private static SmAttribute ParameterPassingAtt = null;

        @objid ("dc776ea9-8aab-4ff8-85e7-8bd63eda9a78")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("858c3c07-e72f-458c-81d5-9c1f76410b5b")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("1827084b-efb9-4898-9ce1-25ec15a0bce5")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("b37969af-ce85-4cd1-af58-42ae283a464c")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("7fdc05f2-0020-446b-985d-eb6529b5b4ed")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("bc37828b-c9dc-4d58-a238-985b41b022cd")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("3191d3ff-4770-4409-a039-0876df4d84cf")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("ec7d300b-799f-4b71-afa2-4fb2c25312a2")
        private static SmAttribute IsStreamAtt = null;

        @objid ("f006dfba-0352-4b2a-b5eb-2f3530979a66")
        private static SmAttribute EffectAtt = null;

        @objid ("4c597d49-468a-49f6-a7da-abd71062fcf3")
        private static SmDependency BpmnRepresentingDataInputDep = null;

        @objid ("75e4d6ef-9d66-44d5-b34a-52d5db3c4bad")
        private static SmDependency TypeDep = null;

        @objid ("8ad203e0-4cff-4de3-b20e-994918671a91")
        private static SmDependency ComposedDep = null;

        @objid ("281845c1-6340-4887-9cc0-a37a6899ea6c")
        private static SmDependency MatchingDep = null;

        @objid ("0005fe72-2fcf-4844-9069-472b00764626")
        private static SmDependency BpmnRepresentingDataOutputDep = null;

        @objid ("8239fc6d-3833-4197-b70f-fef45bbab1e6")
        private static SmDependency SRepresentationDep = null;

        @objid ("abff96fe-cfb0-46eb-b8cc-badf503fa21e")
        private static SmDependency ReturnedDep = null;

        @objid ("c352e7be-c508-48a7-8dc7-679d80489b16")
        private static SmDependency BehaviorParamDep = null;

        @objid ("df1dc510-03ec-47e2-a56d-f1b04d1de540")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("da9970f9-1b9b-4268-a85d-5f9c135219e1")
        public static SmAttribute ParameterPassingAtt() {
            if (ParameterPassingAtt == null) {
            	ParameterPassingAtt = classof().getAttributeDef("ParameterPassing");
            }
            return ParameterPassingAtt;
        }

        @objid ("56c818a1-6b00-415c-99f6-9489127b6395")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("50214931-24b4-4322-b09f-337e0a5e48d2")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("4fdcf51e-4cb1-4abc-a3f1-0c64e22a3484")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("8005657e-0328-4624-a999-7c4191a6f7ad")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("d9b514ad-6674-43ce-8cbb-2b3769d5946b")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("e4790788-5e0b-41a1-9cf2-67091648a921")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("55b03ee9-ea47-40d5-96ab-a0419ec8be9f")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("dbc5eeb1-3435-440f-bd94-9a03ed238ac7")
        public static SmAttribute IsStreamAtt() {
            if (IsStreamAtt == null) {
            	IsStreamAtt = classof().getAttributeDef("IsStream");
            }
            return IsStreamAtt;
        }

        @objid ("b41f7e80-897a-4a0b-888b-194073381752")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("72364449-8482-4f35-b8e7-49ae78d62bee")
        public static SmDependency BpmnRepresentingDataInputDep() {
            if (BpmnRepresentingDataInputDep == null) {
            	BpmnRepresentingDataInputDep = classof().getDependencyDef("BpmnRepresentingDataInput");
            }
            return BpmnRepresentingDataInputDep;
        }

        @objid ("1054baed-2dc7-4c51-a09f-014a8a36f0d0")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("9d5d5471-1a48-45eb-9478-fdab2713124e")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("c6cf0c9c-749a-45ce-af74-a368ca3d01d1")
        public static SmDependency MatchingDep() {
            if (MatchingDep == null) {
            	MatchingDep = classof().getDependencyDef("Matching");
            }
            return MatchingDep;
        }

        @objid ("cf44afa9-ff7b-45a1-8e05-c72c7b2f34a7")
        public static SmDependency BpmnRepresentingDataOutputDep() {
            if (BpmnRepresentingDataOutputDep == null) {
            	BpmnRepresentingDataOutputDep = classof().getDependencyDef("BpmnRepresentingDataOutput");
            }
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("2308c8c6-c211-45d1-b127-9e26223ee7f8")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("36ae3008-6989-470d-a1b4-c289f9970b76")
        public static SmDependency ReturnedDep() {
            if (ReturnedDep == null) {
            	ReturnedDep = classof().getDependencyDef("Returned");
            }
            return ReturnedDep;
        }

        @objid ("aa8bdc44-8a87-4711-b4dd-0ac8e23f570c")
        public static SmDependency BehaviorParamDep() {
            if (BehaviorParamDep == null) {
            	BehaviorParamDep = classof().getDependencyDef("BehaviorParam");
            }
            return BehaviorParamDep;
        }

        @objid ("218dd683-e066-47d2-a7ea-ffe566bffa0d")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("0dc9fdac-5f2f-4996-9ebe-3879ba3581af")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e99e3b17-494e-4cd5-8db2-23fca85b96af")
        public static SmDependency getMatchingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchingDep;
        }

        @objid ("d443d6d5-705d-424a-be01-ea2913f3a46b")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("4a7cc541-3d0e-4886-8e82-4702426d84e7")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("29575be4-74ea-4b12-8c09-ffc35e0601b1")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("d4b1078d-1abd-4a7b-b234-bb10935b6cf8")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("2b2613de-da6a-44c8-b4d7-fdcd261fa904")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("486d22e3-bb31-4133-aeb7-4925c46e1615")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("1cb2feed-1ad9-4d35-a1a0-e217c8f2bedf")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("199beefd-1e22-46d8-ae5a-0535474e8c6c")
        public static SmAttribute getParameterPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterPassingAtt;
        }

        @objid ("b5a6e684-98d8-43cd-805e-631f333f9986")
        public static SmDependency getBpmnRepresentingDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("00c26ce3-2141-4b30-8235-6e00b25cbc7b")
        public static SmDependency getBehaviorParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorParamDep;
        }

        @objid ("8a9c716e-dc9f-4ec7-8105-347e33e92990")
        public static SmDependency getBpmnRepresentingDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataInputDep;
        }

        @objid ("b462070a-7a41-4e14-9105-89a312be5bdd")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("4043d2ab-5b25-48ed-ba98-284e49b54b7c")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("dd979aef-4358-4836-9c4c-b1c53202384d")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("4ec15102-e7e1-459e-b46b-d36b628c3d57")
        public static SmDependency getReturnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnedDep;
        }

        @objid ("49d17857-0ab0-4202-a520-112b9c95fca8")
        public static SmAttribute getIsStreamAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsStreamAtt;
        }

        @objid ("00839032-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("553538f0-b197-49da-b855-cf3e695f833c")
            public ISmObjectData createData() {
                return new ParameterData();
            }

            @objid ("b4352160-4e47-422a-a9ff-b3ff60290acf")
            public SmObjectImpl createImpl() {
                return new ParameterImpl();
            }

        }

        @objid ("0083f360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterPassingSmAttribute extends SmAttribute {
            @objid ("4abc46c9-199b-426e-9417-05389ff4f50a")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mParameterPassing;
            }

            @objid ("0bdd69ba-bf33-48a6-a751-1895091e36a4")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mParameterPassing = value;
            }

        }

        @objid ("008454d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("c26b09ed-ef14-4058-8162-bf56b0fc9e5c")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMin;
            }

            @objid ("bff18d84-5593-43cf-a362-18b6cf2f061b")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0084b660-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("990abb96-fca2-4ed1-a37e-f2f7bca8855a")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMax;
            }

            @objid ("6915f676-eb05-4fac-a939-b7c3818e62f3")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMax = value;
            }

        }

        @objid ("00852528-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("10245cd5-1875-441f-a31b-6301964472ec")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mTypeConstraint;
            }

            @objid ("23adf9b7-3255-468d-ad43-3bd5e019bd9f")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mTypeConstraint = value;
            }

        }

        @objid ("008589f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("b863760a-d0c5-4beb-8010-1588440fb26a")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mDefaultValue;
            }

            @objid ("8341e65b-71b9-4284-a3a5-e081bb9c5997")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("0085ed64-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("a9084ab4-dd55-4922-930b-e22bfc20ef25")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsOrdered;
            }

            @objid ("8a621580-2214-450d-bb33-1e2c6a69aa17")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsOrdered = value;
            }

        }

        @objid ("008658d0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("f962b1bb-b79f-4863-8206-4f8bd6c7ddf3")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsUnique;
            }

            @objid ("8550430c-38f8-4a67-97e6-790906b755ac")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsUnique = value;
            }

        }

        @objid ("0086beec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("e2fd9d8a-b4bc-4a2f-9a62-da5b576e59a5")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsException;
            }

            @objid ("d1ca679c-2816-4d60-b9de-cd5c6a992ec5")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsException = value;
            }

        }

        @objid ("00872436-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsStreamSmAttribute extends SmAttribute {
            @objid ("282a184c-73ff-455f-b969-94c3cad0d033")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsStream;
            }

            @objid ("dac776df-db29-4d61-80f9-070fcdcc176e")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsStream = value;
            }

        }

        @objid ("008790d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("50ece4fd-9409-4bbe-9620-1638f76c9c25")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mEffect;
            }

            @objid ("ae57d2ce-8883-45d2-b983-96e3d033c051")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mEffect = value;
            }

        }

        @objid ("0087fba4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchingSmDependency extends SmMultipleDependency {
            @objid ("074455a6-65e8-401d-88c7-4fde7ac9653f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mMatching != null)? ((ParameterData)data).mMatching:SmMultipleDependency.EMPTY;
            }

            @objid ("c5d81662-9865-4372-83ac-8b1b893393ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mMatching = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mMatching;
            }

            @objid ("b8d7f2f5-213c-4013-bd93-e136d484b79e")
            @Override
            public SmDependency getSymetric() {
                return PinData.Metadata.MatchedDep();
            }

        }

        @objid ("00886512-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("5285596e-f9be-403f-bd69-cfa88b62ab9d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mSRepresentation != null)? ((ParameterData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("7f4be42a-6577-4509-ae49-bc86373e83c3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mSRepresentation;
            }

            @objid ("55a91d74-1670-4ee5-9b15-28a727222030")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.PBaseDep();
            }

        }

        @objid ("0088cee4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("6f76c3e0-2c7e-4cac-be03-81213265d3c8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mType;
            }

            @objid ("7e7eb3da-93d0-401d-89cb-babf22fa17b9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mType = value;
            }

            @objid ("7ac37ad5-b505-40f4-85de-c4e1093c9e59")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceDep();
            }

        }

        @objid ("00894b12-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorParamSmDependency extends SmMultipleDependency {
            @objid ("3bf2b738-00be-4756-94c3-508bcd42d3c3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBehaviorParam != null)? ((ParameterData)data).mBehaviorParam:SmMultipleDependency.EMPTY;
            }

            @objid ("cfe6766c-e759-4749-916d-1479535f628b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBehaviorParam = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBehaviorParam;
            }

            @objid ("42ea7c06-d8c0-4992-a8c5-a0a0f78efc66")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.MappedDep();
            }

        }

        @objid ("0089b516-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("c67a45a4-8b7b-4a2e-8fad-c273b2a9f319")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mComposed;
            }

            @objid ("7d561814-d673-4335-905d-ad8db1034d3d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mComposed = value;
            }

            @objid ("fb4c6e4e-197d-48f4-adb4-c94214ae5265")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.IODep();
            }

        }

        @objid ("008a3360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReturnedSmDependency extends SmSingleDependency {
            @objid ("9df855c0-d108-42c5-b88d-d38cb70e1168")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mReturned;
            }

            @objid ("a5f3bff7-0f4b-4858-8fc4-d8a84173482e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mReturned = value;
            }

            @objid ("f4edee71-a741-4118-b8ce-31bbd15b7f6a")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ReturnDep();
            }

        }

        @objid ("008ab18c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataOutputSmDependency extends SmMultipleDependency {
            @objid ("5c8639d5-205c-41a8-a9f4-284e1971b667")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataOutput != null)? ((ParameterData)data).mBpmnRepresentingDataOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("9eaf6d07-5769-472c-b3f0-06d403da72f5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataOutput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataOutput;
            }

            @objid ("2ba3dc5e-9475-451d-9523-0a5467dab8ce")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.RepresentedParameterDep();
            }

        }

        @objid ("008b1dc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataInputSmDependency extends SmMultipleDependency {
            @objid ("5ec89444-1701-4b3b-a5b4-b07753e4fef3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataInput != null)? ((ParameterData)data).mBpmnRepresentingDataInput:SmMultipleDependency.EMPTY;
            }

            @objid ("71b4e08a-8924-4017-9d7d-77ef83afad13")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataInput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataInput;
            }

            @objid ("ab0f9ba0-7c7e-4cc8-b3f7-c2979bd49718")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.RepresentedParameterDep();
            }

        }

    }

}
