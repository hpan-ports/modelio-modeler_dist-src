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
    @objid ("71872f5e-6ec3-4609-bc9c-30b5695dda15")
    @SmaMetaAttribute(metaName="ParameterPassing", type=PassingMode.class, smAttributeClass=Metadata.ParameterPassingSmAttribute.class)
     Object mParameterPassing = PassingMode.IN;

    @objid ("ef3f6c02-f054-40f7-ac0d-10ce3fdc8bd3")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("0ac4828d-4465-4c16-a391-838bc877314f")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("8ca67a44-6825-4064-b629-7ecc491a8fca")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("54cd428e-50b6-4dc0-9910-26ca7509ced5")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("bf5ed591-4eed-4dc2-aec0-f35295fdde3c")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("84c9dab7-2d81-4848-a065-2ae076df955b")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("16301b5f-bfc5-40aa-9423-679738973a83")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("25b914ea-581c-49b1-be33-e19dd564a947")
    @SmaMetaAttribute(metaName="IsStream", type=Boolean.class, smAttributeClass=Metadata.IsStreamSmAttribute.class)
     Object mIsStream = false;

    @objid ("67b43328-2bba-4408-825b-227aaf09b524")
    @SmaMetaAttribute(metaName="Effect", type=ParameterEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ParameterEffectKind.READEFFECT;

    @objid ("4e453ee7-7897-4415-bd66-727072e1b3d0")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataInputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataInput = null;

    @objid ("5566ec34-0a9d-4577-99d1-b119aa59e000")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("652505b6-1016-4025-afd9-9468aa31a8ec")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("a4908805-d2e2-44b2-a5c9-da0ca4ba0380")
    @SmaMetaAssociation(metaName="Matching", typeDataClass=PinData.class, min=0, max=-1, smAssociationClass=Metadata.MatchingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mMatching = null;

    @objid ("79e34a24-a3e5-44b8-9dd2-68f2f901164b")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataOutputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataOutput = null;

    @objid ("c1eba245-1acb-4049-b56d-1a6ee6d92e46")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("658d564b-cf81-459f-b4d6-376c49739b28")
    @SmaMetaAssociation(metaName="Returned", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ReturnedSmDependency.class)
     SmObjectImpl mReturned;

    @objid ("8140d7f9-0f59-4890-a0b8-0f304a70b0ad")
    @SmaMetaAssociation(metaName="BehaviorParam", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.BehaviorParamSmDependency.class, istodelete = true)
     List<SmObjectImpl> mBehaviorParam = null;

    @objid ("309699d1-a1da-4a47-8a43-e33acbea5170")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00834ec4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("74a509df-b24d-46d7-9f38-ceb9daa5ccd4")
        private static SmClass smClass = null;

        @objid ("2d4bee56-3124-4f0e-9f2d-d5d890012cb3")
        private static SmAttribute ParameterPassingAtt = null;

        @objid ("456af6b1-4c7b-44d0-b763-1e1214ab3ddf")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("bcc35cd0-46a8-400f-8502-4bf091eb3c7b")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("8c45583e-8444-45f3-8ed4-9d71677aaf8b")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("e83e2315-bee7-4f0d-8c8b-9a8e3d59c4b4")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("87620ef6-38ac-4cb7-a266-cc0682b766ac")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("8205dcb3-d774-4841-919b-7b1ea5d3f932")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("0b0fd99d-a586-4958-86f9-e74d64bce891")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("81ad9b3c-0a37-4bf3-9338-ac6369e305bb")
        private static SmAttribute IsStreamAtt = null;

        @objid ("63385e1c-fedd-4e27-9331-4f5b1577aaf7")
        private static SmAttribute EffectAtt = null;

        @objid ("12338ad5-faa3-4394-b4b7-5688b1c9a754")
        private static SmDependency BpmnRepresentingDataInputDep = null;

        @objid ("c59ab875-a77c-4231-81c6-d3d35aabb7c0")
        private static SmDependency TypeDep = null;

        @objid ("31871919-b5ba-4742-a335-fd243a5c9bb2")
        private static SmDependency ComposedDep = null;

        @objid ("fa6cc073-0f34-4b90-9122-8aa75ee68c10")
        private static SmDependency MatchingDep = null;

        @objid ("d6ad7262-5dbb-484a-b0ce-4b52d60d7342")
        private static SmDependency BpmnRepresentingDataOutputDep = null;

        @objid ("6e2ed827-c620-4e74-bc6b-a7e102597a1f")
        private static SmDependency SRepresentationDep = null;

        @objid ("039e8010-ad94-4aa8-9d04-be50fac85b6d")
        private static SmDependency ReturnedDep = null;

        @objid ("95e57709-bb77-4058-bba3-b96ca92386d9")
        private static SmDependency BehaviorParamDep = null;

        @objid ("952b38d9-fa5e-46a4-9946-24323f793f7f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e8fd3220-3b77-4677-bab1-9d12ad3642b5")
        public static SmAttribute ParameterPassingAtt() {
            if (ParameterPassingAtt == null) {
            	ParameterPassingAtt = classof().getAttributeDef("ParameterPassing");
            }
            return ParameterPassingAtt;
        }

        @objid ("32250123-b114-432a-a671-22b230cc13c0")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("2e4488db-192f-4268-9d2b-ca14e63967bd")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("3740679f-8e96-40d4-b5a9-38cc33ec2488")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("07f23198-589e-4869-b700-b988e9e0910b")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("9976a296-0432-4a3a-bf94-8d9578128c24")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("b095be02-225b-4122-a710-29c6e691aae8")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("0ae5002c-a97b-46c2-abbf-8c774e336194")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("5676a83f-12d0-402b-ba9f-75d576701859")
        public static SmAttribute IsStreamAtt() {
            if (IsStreamAtt == null) {
            	IsStreamAtt = classof().getAttributeDef("IsStream");
            }
            return IsStreamAtt;
        }

        @objid ("b1b1cb6e-7cc2-4673-b51c-1e531759798c")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("962c0cb4-f158-4197-9e6e-c4edef66c9c2")
        public static SmDependency BpmnRepresentingDataInputDep() {
            if (BpmnRepresentingDataInputDep == null) {
            	BpmnRepresentingDataInputDep = classof().getDependencyDef("BpmnRepresentingDataInput");
            }
            return BpmnRepresentingDataInputDep;
        }

        @objid ("36e34888-a9ac-471f-b69b-ae95c0d53c3a")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("c7a125cd-0115-4932-a1f1-bf6a4e36cc3b")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("007e8de1-5d07-4e21-b04c-b2f4d1b087f9")
        public static SmDependency MatchingDep() {
            if (MatchingDep == null) {
            	MatchingDep = classof().getDependencyDef("Matching");
            }
            return MatchingDep;
        }

        @objid ("cd00374e-845b-4ed3-83f8-08c7eb6faeec")
        public static SmDependency BpmnRepresentingDataOutputDep() {
            if (BpmnRepresentingDataOutputDep == null) {
            	BpmnRepresentingDataOutputDep = classof().getDependencyDef("BpmnRepresentingDataOutput");
            }
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("f38d7081-aa2b-4cfb-ba17-c1d70bb7bc4f")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("2c354737-da7c-49a5-9d9d-c11fb7a8dd37")
        public static SmDependency ReturnedDep() {
            if (ReturnedDep == null) {
            	ReturnedDep = classof().getDependencyDef("Returned");
            }
            return ReturnedDep;
        }

        @objid ("cb80c67c-db97-470a-b784-5f5ea85c727b")
        public static SmDependency BehaviorParamDep() {
            if (BehaviorParamDep == null) {
            	BehaviorParamDep = classof().getDependencyDef("BehaviorParam");
            }
            return BehaviorParamDep;
        }

        @objid ("3985860c-177d-49a7-b774-5c9e9be5a666")
        public static SmAttribute getIsStreamAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsStreamAtt;
        }

        @objid ("35b3038c-6731-407f-9a20-f26558303aab")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("2fd615ae-e454-4b10-993c-d45233f7ff5f")
        public static SmDependency getBpmnRepresentingDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataInputDep;
        }

        @objid ("db8dec26-f753-4726-8247-f25225bb8f6d")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("02ea27a2-3944-4238-85e3-de50c3c120c6")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("3456c64d-6692-41ff-b5af-66729ef7edd1")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("bb2970de-a899-4b45-a30c-d87a4dbec2b1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1b1d2ace-6e9f-4ca2-9f0f-812974d54d4f")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("fc133db2-4eca-48e7-9553-7e63ae4cc4fa")
        public static SmDependency getReturnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnedDep;
        }

        @objid ("83078044-58c7-4eab-a123-cb2c9c65fbcb")
        public static SmAttribute getParameterPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterPassingAtt;
        }

        @objid ("5885983a-13b0-4e62-8da6-e869531fd0fa")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("56e87082-5901-47cc-9a5c-f1225c9715cc")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("b32684f9-79a1-469f-ac54-8a2e2103d648")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("f8f53f59-14fa-4026-b93b-1d65d9c23735")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("c526cf37-34f7-4cd3-abed-64ed17f0b02c")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("218dc4a0-6a0b-41b2-8d5e-2d3426383a8f")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("52696045-f1d5-4ef0-a7c5-1b44fcde04ec")
        public static SmDependency getMatchingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchingDep;
        }

        @objid ("717e6f55-679d-4ecf-a030-4a54a2c9a5fc")
        public static SmDependency getBpmnRepresentingDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("7794f002-a3cd-43f9-8150-e41940d08688")
        public static SmDependency getBehaviorParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorParamDep;
        }

        @objid ("00839032-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("03a2dd8d-b6d0-4158-a74b-34f51bb8947c")
            public ISmObjectData createData() {
                return new ParameterData();
            }

            @objid ("5e11423e-b552-4917-8d5c-47f0f85fe252")
            public SmObjectImpl createImpl() {
                return new ParameterImpl();
            }

        }

        @objid ("0083f360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterPassingSmAttribute extends SmAttribute {
            @objid ("8b7e81fc-ebfc-43ea-87e5-854ce8b8b18d")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mParameterPassing;
            }

            @objid ("6ae71b89-932c-4db9-afe9-f350b28be5c0")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mParameterPassing = value;
            }

        }

        @objid ("008454d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("560a72b8-70c6-4655-bf5c-c44b0116cd02")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMin;
            }

            @objid ("a3ee7b82-b277-4fdb-a3c0-d4f0d63d5d78")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0084b660-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("c45167e9-fd12-4014-9fe5-c4c2880d079a")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMax;
            }

            @objid ("7d4fde6c-b16e-46fc-ac27-b95de042da28")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMax = value;
            }

        }

        @objid ("00852528-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("50ba7aff-ff16-4b30-8e07-7f6b75c99dbc")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mTypeConstraint;
            }

            @objid ("aeda46d6-fb90-4e27-a5b7-c37acc11a430")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mTypeConstraint = value;
            }

        }

        @objid ("008589f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("02f920a4-9de4-4397-900d-94c2caac97c0")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mDefaultValue;
            }

            @objid ("edbdd251-ef93-459e-89b4-1f82c84e98b5")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("0085ed64-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("0b64f58e-453a-4688-83a2-5270c7dd5f78")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsOrdered;
            }

            @objid ("7bf92020-73a7-48d1-8112-f7856a2bba89")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsOrdered = value;
            }

        }

        @objid ("008658d0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("818e246f-d921-4869-be5d-2fc715f53fb3")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsUnique;
            }

            @objid ("ae5fb955-f8da-424f-bda8-0ffd02c2e9cd")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsUnique = value;
            }

        }

        @objid ("0086beec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("86fa9279-351d-4222-91ba-572f9138ffb5")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsException;
            }

            @objid ("2fa73a0e-25b4-413e-8cd0-8adef600015a")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsException = value;
            }

        }

        @objid ("00872436-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsStreamSmAttribute extends SmAttribute {
            @objid ("f2ead7dc-16af-4040-b5f8-33be8910d870")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsStream;
            }

            @objid ("6c20d0ef-083a-4e4e-a624-381a8e91c09d")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsStream = value;
            }

        }

        @objid ("008790d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("5a66bab2-647d-42c6-bcfe-a4c91500a9bc")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mEffect;
            }

            @objid ("816544b9-1140-452c-bce5-3421e1406183")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mEffect = value;
            }

        }

        @objid ("0087fba4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchingSmDependency extends SmMultipleDependency {
            @objid ("7bdbecf0-2ed4-46e2-b9f0-a95c00ba3c40")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mMatching != null)? ((ParameterData)data).mMatching:SmMultipleDependency.EMPTY;
            }

            @objid ("9714ee2a-8ca1-4466-9539-646cd7847786")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mMatching = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mMatching;
            }

            @objid ("6d6f5c96-481f-461f-9602-7efb78573ad6")
            @Override
            public SmDependency getSymetric() {
                return PinData.Metadata.MatchedDep();
            }

        }

        @objid ("00886512-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("7bb7c980-4975-4062-a148-52244fa310e4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mSRepresentation != null)? ((ParameterData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("6a68dfc0-948d-4711-aae5-cf6090726a3c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mSRepresentation;
            }

            @objid ("6de1e4f6-ce98-4744-8be9-d653685cf64d")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.PBaseDep();
            }

        }

        @objid ("0088cee4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("730c9176-35a1-4182-877f-232478105580")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mType;
            }

            @objid ("7bc8100e-82f6-4506-bbdc-c57056f4173b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mType = value;
            }

            @objid ("bf9518ab-12fc-42ca-b17a-498041209636")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceDep();
            }

        }

        @objid ("00894b12-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorParamSmDependency extends SmMultipleDependency {
            @objid ("ea572c74-3a75-4bea-bb41-eeb99a61cb30")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBehaviorParam != null)? ((ParameterData)data).mBehaviorParam:SmMultipleDependency.EMPTY;
            }

            @objid ("f6dfd29d-d52e-442a-bf15-98f3c939e276")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBehaviorParam = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBehaviorParam;
            }

            @objid ("c5d3ef09-2c8e-4868-915d-5835f23eb536")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.MappedDep();
            }

        }

        @objid ("0089b516-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("bad2336c-be4f-4d46-91cf-bba3eed6a79e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mComposed;
            }

            @objid ("d7de8bbc-070d-42ea-990c-9604e4f84ed9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mComposed = value;
            }

            @objid ("a6f6ed76-a227-449f-96be-4a93dbcb97df")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.IODep();
            }

        }

        @objid ("008a3360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReturnedSmDependency extends SmSingleDependency {
            @objid ("46c43d11-e5ee-44ac-9640-d422634df248")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mReturned;
            }

            @objid ("7caf6420-5357-4261-afc6-a42c0a1ab1d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mReturned = value;
            }

            @objid ("01253892-2d82-4085-9c96-854e322d185b")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ReturnDep();
            }

        }

        @objid ("008ab18c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataOutputSmDependency extends SmMultipleDependency {
            @objid ("1a9779d0-49eb-4d8b-862f-34ba6d3f1ca9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataOutput != null)? ((ParameterData)data).mBpmnRepresentingDataOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("567b3304-d792-4716-b83b-9592af43eeff")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataOutput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataOutput;
            }

            @objid ("7c90e0eb-6d7a-42cc-9900-ef08b0166783")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.RepresentedParameterDep();
            }

        }

        @objid ("008b1dc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataInputSmDependency extends SmMultipleDependency {
            @objid ("d4ab1dc5-70ff-4f94-a128-7ccf81ef4778")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataInput != null)? ((ParameterData)data).mBpmnRepresentingDataInput:SmMultipleDependency.EMPTY;
            }

            @objid ("1f1be1cf-8468-4bca-8913-0d4117d938b3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataInput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataInput;
            }

            @objid ("c3cc165d-a043-42ac-867e-4cce4e895eca")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.RepresentedParameterDep();
            }

        }

    }

}
