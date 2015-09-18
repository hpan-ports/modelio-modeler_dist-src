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
    @objid ("1e85c049-85e5-45fd-b2fb-401710e7af4a")
    @SmaMetaAttribute(metaName="ParameterPassing", type=PassingMode.class, smAttributeClass=Metadata.ParameterPassingSmAttribute.class)
     Object mParameterPassing = PassingMode.IN;

    @objid ("782ff9a0-04d1-4289-8c5a-d9c27d8fea70")
    @SmaMetaAttribute(metaName="MultiplicityMin", type=String.class, smAttributeClass=Metadata.MultiplicityMinSmAttribute.class)
     Object mMultiplicityMin = "1";

    @objid ("ac8d1cde-33a6-4bd5-be18-d91fa48469c1")
    @SmaMetaAttribute(metaName="MultiplicityMax", type=String.class, smAttributeClass=Metadata.MultiplicityMaxSmAttribute.class)
     Object mMultiplicityMax = "1";

    @objid ("da9d6c98-ebc0-4f03-b285-306958f968df")
    @SmaMetaAttribute(metaName="TypeConstraint", type=String.class, smAttributeClass=Metadata.TypeConstraintSmAttribute.class)
     Object mTypeConstraint = "";

    @objid ("6477bf8f-9471-4595-850f-db190efa05ee")
    @SmaMetaAttribute(metaName="DefaultValue", type=String.class, smAttributeClass=Metadata.DefaultValueSmAttribute.class)
     Object mDefaultValue = "";

    @objid ("abd0329e-1f04-4327-8c55-dbbeb9ac1709")
    @SmaMetaAttribute(metaName="IsOrdered", type=Boolean.class, smAttributeClass=Metadata.IsOrderedSmAttribute.class)
     Object mIsOrdered = false;

    @objid ("8a9cd2a6-5644-45cd-b79b-717c69ea1dac")
    @SmaMetaAttribute(metaName="IsUnique", type=Boolean.class, smAttributeClass=Metadata.IsUniqueSmAttribute.class)
     Object mIsUnique = false;

    @objid ("5fd2064b-4993-4d97-9990-fba69ac660c1")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("9d0e99fc-10f6-4e7f-95c2-e30428b873dd")
    @SmaMetaAttribute(metaName="IsStream", type=Boolean.class, smAttributeClass=Metadata.IsStreamSmAttribute.class)
     Object mIsStream = false;

    @objid ("8ac6081a-b1d7-4395-8bd7-7e9f6c9440ac")
    @SmaMetaAttribute(metaName="Effect", type=ParameterEffectKind.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = ParameterEffectKind.READEFFECT;

    @objid ("1e3e6c01-24a8-4af4-a551-2cfa4beada9a")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataInputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataInput = null;

    @objid ("81de8b9b-9717-41c3-97e9-8cf204a9fde2")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("b686b219-846c-44cf-b2c9-20ea9458e237")
    @SmaMetaAssociation(metaName="Composed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ComposedSmDependency.class)
     SmObjectImpl mComposed;

    @objid ("794d070f-614f-4798-a9cf-1ef1dadcb72e")
    @SmaMetaAssociation(metaName="Matching", typeDataClass=PinData.class, min=0, max=-1, smAssociationClass=Metadata.MatchingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mMatching = null;

    @objid ("f69002ab-17f1-4d40-bc9d-70ec4ce31d8f")
    @SmaMetaAssociation(metaName="BpmnRepresentingDataOutput", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnRepresentingDataOutputSmDependency.class)
     List<SmObjectImpl> mBpmnRepresentingDataOutput = null;

    @objid ("98ff400f-a5ab-4860-964d-5b9063863795")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("2a729a4f-888a-4594-8b5d-c13cd04f253a")
    @SmaMetaAssociation(metaName="Returned", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ReturnedSmDependency.class)
     SmObjectImpl mReturned;

    @objid ("e64db72b-c2c8-499e-a275-726bfb61fddd")
    @SmaMetaAssociation(metaName="BehaviorParam", typeDataClass=BehaviorParameterData.class, min=0, max=-1, smAssociationClass=Metadata.BehaviorParamSmDependency.class, istodelete = true)
     List<SmObjectImpl> mBehaviorParam = null;

    @objid ("a796fec2-b70b-42af-851a-45babb669025")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00834ec4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("63bd2b6a-3e41-4670-a04d-f833b8662d8d")
        private static SmClass smClass = null;

        @objid ("3c3c1704-c5d7-40b1-a054-8d360508103b")
        private static SmAttribute ParameterPassingAtt = null;

        @objid ("1260bfec-645b-4d22-abc6-bcb09fc06606")
        private static SmAttribute MultiplicityMinAtt = null;

        @objid ("2d87db41-1944-41ae-8a3f-1e6bd3507850")
        private static SmAttribute MultiplicityMaxAtt = null;

        @objid ("c60075ef-ea29-479d-82bc-f343bbc36c7c")
        private static SmAttribute TypeConstraintAtt = null;

        @objid ("8778695a-63ad-486f-a2ed-96e4453af5c3")
        private static SmAttribute DefaultValueAtt = null;

        @objid ("a4c1473a-b987-4358-9b35-d0494bc4edde")
        private static SmAttribute IsOrderedAtt = null;

        @objid ("85157658-af98-4399-9b34-824e9e8f51a2")
        private static SmAttribute IsUniqueAtt = null;

        @objid ("92690b7f-4108-4857-877d-ed9e51ee37e8")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("6ab5af76-eed6-4b4e-a5fe-da4cf5de9ac2")
        private static SmAttribute IsStreamAtt = null;

        @objid ("670a10d1-4888-448a-8a9c-c46425881397")
        private static SmAttribute EffectAtt = null;

        @objid ("dd8dd947-3e6e-46ff-9108-77353b5c383c")
        private static SmDependency BpmnRepresentingDataInputDep = null;

        @objid ("0e746a86-e059-4c18-9ba8-646382ff04dd")
        private static SmDependency TypeDep = null;

        @objid ("d7da6806-4594-4f37-9d15-8d94944a02c5")
        private static SmDependency ComposedDep = null;

        @objid ("4b8a8ccc-6fe6-4cb8-ad25-e35d340dca47")
        private static SmDependency MatchingDep = null;

        @objid ("cb3d6e63-529a-48c9-aebc-43053753a30e")
        private static SmDependency BpmnRepresentingDataOutputDep = null;

        @objid ("7abedd90-e9e4-4033-9d7f-d00af80cb1d8")
        private static SmDependency SRepresentationDep = null;

        @objid ("f37b232a-23ff-4fc4-a6bd-f6aa42062df4")
        private static SmDependency ReturnedDep = null;

        @objid ("5b506d04-cbab-4de2-8ec4-3cd70c76bf7c")
        private static SmDependency BehaviorParamDep = null;

        @objid ("ccc9c4c0-bf2a-4c73-a0dd-63bf75350918")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b01a2e87-e473-4184-892f-ba70cf41a3f3")
        public static SmAttribute ParameterPassingAtt() {
            if (ParameterPassingAtt == null) {
            	ParameterPassingAtt = classof().getAttributeDef("ParameterPassing");
            }
            return ParameterPassingAtt;
        }

        @objid ("60d67e47-42e3-415f-9f49-d43aa9b0e2c8")
        public static SmAttribute MultiplicityMinAtt() {
            if (MultiplicityMinAtt == null) {
            	MultiplicityMinAtt = classof().getAttributeDef("MultiplicityMin");
            }
            return MultiplicityMinAtt;
        }

        @objid ("2e3c9add-50aa-4d16-91e6-b5b146ca9914")
        public static SmAttribute MultiplicityMaxAtt() {
            if (MultiplicityMaxAtt == null) {
            	MultiplicityMaxAtt = classof().getAttributeDef("MultiplicityMax");
            }
            return MultiplicityMaxAtt;
        }

        @objid ("4a4568e0-e9b0-48d3-bfa5-9aeb127d30bf")
        public static SmAttribute TypeConstraintAtt() {
            if (TypeConstraintAtt == null) {
            	TypeConstraintAtt = classof().getAttributeDef("TypeConstraint");
            }
            return TypeConstraintAtt;
        }

        @objid ("6d389bbc-ec93-454e-b0d9-97a9ecbe876e")
        public static SmAttribute DefaultValueAtt() {
            if (DefaultValueAtt == null) {
            	DefaultValueAtt = classof().getAttributeDef("DefaultValue");
            }
            return DefaultValueAtt;
        }

        @objid ("4068cc2b-030c-47b5-8932-cb247dcf45f5")
        public static SmAttribute IsOrderedAtt() {
            if (IsOrderedAtt == null) {
            	IsOrderedAtt = classof().getAttributeDef("IsOrdered");
            }
            return IsOrderedAtt;
        }

        @objid ("41396155-45c8-491a-b53f-4be8821954aa")
        public static SmAttribute IsUniqueAtt() {
            if (IsUniqueAtt == null) {
            	IsUniqueAtt = classof().getAttributeDef("IsUnique");
            }
            return IsUniqueAtt;
        }

        @objid ("a1d5286f-4464-4b73-8cc5-285d64cb8e90")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("227b78da-2e4c-4fba-80d9-a08d4cc1ce37")
        public static SmAttribute IsStreamAtt() {
            if (IsStreamAtt == null) {
            	IsStreamAtt = classof().getAttributeDef("IsStream");
            }
            return IsStreamAtt;
        }

        @objid ("04d69c5e-2411-4039-92b8-396d49593dea")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("c435f1d9-6b60-43be-9b13-335a1149a7de")
        public static SmDependency BpmnRepresentingDataInputDep() {
            if (BpmnRepresentingDataInputDep == null) {
            	BpmnRepresentingDataInputDep = classof().getDependencyDef("BpmnRepresentingDataInput");
            }
            return BpmnRepresentingDataInputDep;
        }

        @objid ("db9eb5e8-0a0a-4977-ab41-fc74224449e6")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("759cae4a-01ea-4841-bfd5-704a88ae4a69")
        public static SmDependency ComposedDep() {
            if (ComposedDep == null) {
            	ComposedDep = classof().getDependencyDef("Composed");
            }
            return ComposedDep;
        }

        @objid ("01b7a961-c935-4d37-acd0-50dd38fa79e0")
        public static SmDependency MatchingDep() {
            if (MatchingDep == null) {
            	MatchingDep = classof().getDependencyDef("Matching");
            }
            return MatchingDep;
        }

        @objid ("b8177cc2-e8a6-45a3-8d8d-46244c1334ef")
        public static SmDependency BpmnRepresentingDataOutputDep() {
            if (BpmnRepresentingDataOutputDep == null) {
            	BpmnRepresentingDataOutputDep = classof().getDependencyDef("BpmnRepresentingDataOutput");
            }
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("6b2f6899-f866-495b-a8ab-ff1b2bdb1224")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("f4b0a845-5cef-4ec6-a155-bee531c696fb")
        public static SmDependency ReturnedDep() {
            if (ReturnedDep == null) {
            	ReturnedDep = classof().getDependencyDef("Returned");
            }
            return ReturnedDep;
        }

        @objid ("c7ef7ac9-b1ee-468c-aec8-c200158597a0")
        public static SmDependency BehaviorParamDep() {
            if (BehaviorParamDep == null) {
            	BehaviorParamDep = classof().getDependencyDef("BehaviorParam");
            }
            return BehaviorParamDep;
        }

        @objid ("f232f73f-0c88-41e4-96aa-679f9cbef363")
        public static SmAttribute getMultiplicityMaxAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMaxAtt;
        }

        @objid ("57330174-9e7f-4f18-958c-2516ea22d9d3")
        public static SmDependency getReturnedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnedDep;
        }

        @objid ("3cf58d19-2b1e-4083-8f42-cc573f0bf31e")
        public static SmAttribute getIsUniqueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUniqueAtt;
        }

        @objid ("8407f1ea-1cbf-4a34-99ed-834e9d76c7bf")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("d3bb1658-93fd-4c9b-bc4c-4198f7c93f18")
        public static SmAttribute getTypeConstraintAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeConstraintAtt;
        }

        @objid ("accebfd4-7ea1-4866-a16e-fc7e5fccdd48")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("9c44cb10-fa35-4912-a85f-206b8809bd2a")
        public static SmAttribute getDefaultValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultValueAtt;
        }

        @objid ("b6b27dc7-ed90-4d3d-a88f-43f25ef98909")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("08d0a89b-3955-4d19-bab2-f9266cc657e6")
        public static SmAttribute getParameterPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterPassingAtt;
        }

        @objid ("73153ff1-186f-436c-aca7-cc0f2dfcea7d")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("41b7e7ed-cdca-4575-9423-3cfe02a18a0f")
        public static SmDependency getMatchingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatchingDep;
        }

        @objid ("f9335467-cb49-4486-9e55-ffda79880c6c")
        public static SmAttribute getIsOrderedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsOrderedAtt;
        }

        @objid ("726ee9c1-a952-4180-b28b-61819b987eae")
        public static SmAttribute getMultiplicityMinAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MultiplicityMinAtt;
        }

        @objid ("420a458d-c8f1-45b2-a5d3-8ef567ae46be")
        public static SmDependency getBehaviorParamDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorParamDep;
        }

        @objid ("6e9cfcad-a06a-45bf-ac6f-369c3dd0bd19")
        public static SmDependency getBpmnRepresentingDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataInputDep;
        }

        @objid ("76c19bee-14ad-423c-8d10-e06a74b82652")
        public static SmDependency getBpmnRepresentingDataOutputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnRepresentingDataOutputDep;
        }

        @objid ("fe6e962f-3f0b-4aa3-a34a-38cfb4288f91")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0facaf68-7022-45e4-be93-346f0e7f8a73")
        public static SmDependency getComposedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComposedDep;
        }

        @objid ("36cb98b0-6642-4807-8be3-7e3adbe86b10")
        public static SmAttribute getIsStreamAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsStreamAtt;
        }

        @objid ("00839032-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("20ff6c97-d0a0-4850-9fb3-8324a3a14470")
            public ISmObjectData createData() {
                return new ParameterData();
            }

            @objid ("63c00684-1c76-4ba2-ad01-2f2c5def441b")
            public SmObjectImpl createImpl() {
                return new ParameterImpl();
            }

        }

        @objid ("0083f360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ParameterPassingSmAttribute extends SmAttribute {
            @objid ("bda54112-9af9-4f51-825e-bee4564e4d2f")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mParameterPassing;
            }

            @objid ("8921edf6-6683-4b1a-952a-4b5a5111680b")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mParameterPassing = value;
            }

        }

        @objid ("008454d6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMinSmAttribute extends SmAttribute {
            @objid ("99b29141-1bbf-4346-9f57-dc3eaf54ac98")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMin;
            }

            @objid ("7dce4282-b3b5-4602-871c-1e7f8b02b310")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMin = value;
            }

        }

        @objid ("0084b660-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MultiplicityMaxSmAttribute extends SmAttribute {
            @objid ("3ac135c3-1090-4111-b6b7-8a0e04dabc4e")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mMultiplicityMax;
            }

            @objid ("3e2acc38-a8b1-4e2e-8ca0-499e210a7882")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mMultiplicityMax = value;
            }

        }

        @objid ("00852528-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeConstraintSmAttribute extends SmAttribute {
            @objid ("03133369-e177-428e-bb53-54d719264715")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mTypeConstraint;
            }

            @objid ("fe0201a7-795b-45ea-bdc7-584e33604c39")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mTypeConstraint = value;
            }

        }

        @objid ("008589f0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DefaultValueSmAttribute extends SmAttribute {
            @objid ("554a6854-05ee-480d-91f9-a69043744cc2")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mDefaultValue;
            }

            @objid ("9cd95cc7-3756-4e54-bcca-ab4e36de8963")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mDefaultValue = value;
            }

        }

        @objid ("0085ed64-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsOrderedSmAttribute extends SmAttribute {
            @objid ("63803221-4031-4f0b-aa7b-2c2a55118e6f")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsOrdered;
            }

            @objid ("172135b8-4d41-4245-a834-f6c79a76b881")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsOrdered = value;
            }

        }

        @objid ("008658d0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsUniqueSmAttribute extends SmAttribute {
            @objid ("64d3cb57-aca8-4569-a312-a94b6162ccba")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsUnique;
            }

            @objid ("cf319ce9-94bd-4407-9400-c9b786a63168")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsUnique = value;
            }

        }

        @objid ("0086beec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("dd3570b3-8751-4162-81ad-6eff055b14bd")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsException;
            }

            @objid ("43bc26e3-4db7-444c-89c2-6c940cb6c3a1")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsException = value;
            }

        }

        @objid ("00872436-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsStreamSmAttribute extends SmAttribute {
            @objid ("5e072a8a-5d7e-4fe1-9512-88135a23efc7")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mIsStream;
            }

            @objid ("f1e0ffe4-c156-4afe-a1f3-c97f75efcc65")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mIsStream = value;
            }

        }

        @objid ("008790d8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("7e7ff7fc-e194-4ee9-99c7-778a9c44bbbc")
            public Object getValue(ISmObjectData data) {
                return ((ParameterData) data).mEffect;
            }

            @objid ("0d640330-3104-494f-9e55-09843af9fe2f")
            public void setValue(ISmObjectData data, Object value) {
                ((ParameterData) data).mEffect = value;
            }

        }

        @objid ("0087fba4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MatchingSmDependency extends SmMultipleDependency {
            @objid ("f6907ee0-e6b9-40c7-baef-5f8c87877aa1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mMatching != null)? ((ParameterData)data).mMatching:SmMultipleDependency.EMPTY;
            }

            @objid ("6ab3e899-8fb1-4091-846f-fdbd7de4d76b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mMatching = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mMatching;
            }

            @objid ("71404ae7-7c90-48b2-b401-57f10a01c83d")
            @Override
            public SmDependency getSymetric() {
                return PinData.Metadata.MatchedDep();
            }

        }

        @objid ("00886512-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("fd5035b3-6dba-4177-8d3f-e3a317277903")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mSRepresentation != null)? ((ParameterData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("527cd747-5c11-4916-86ac-9b8700517099")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mSRepresentation;
            }

            @objid ("ad64bd77-773e-4243-9b0f-5bb55a279b8c")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.PBaseDep();
            }

        }

        @objid ("0088cee4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("e0dba969-ecc1-477d-9256-8213a5c9c638")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mType;
            }

            @objid ("cbe4b72a-14c0-4db0-87f9-a11ff5d49ade")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mType = value;
            }

            @objid ("13d8f0d9-02a7-4d75-9d90-7f8cffad02e1")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceDep();
            }

        }

        @objid ("00894b12-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorParamSmDependency extends SmMultipleDependency {
            @objid ("eb7a5992-bfad-4e2f-b01d-3103c984aeed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBehaviorParam != null)? ((ParameterData)data).mBehaviorParam:SmMultipleDependency.EMPTY;
            }

            @objid ("63c535e3-f5e5-4991-b9fd-028a7794d1e0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBehaviorParam = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBehaviorParam;
            }

            @objid ("a7f3e60d-daa1-419e-9923-cae7349ac697")
            @Override
            public SmDependency getSymetric() {
                return BehaviorParameterData.Metadata.MappedDep();
            }

        }

        @objid ("0089b516-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ComposedSmDependency extends SmSingleDependency {
            @objid ("bf229b5a-d9e3-412a-bcfa-60c0f405fae9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mComposed;
            }

            @objid ("35f38cb1-8ce4-4273-9265-c38a68b4dbfc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mComposed = value;
            }

            @objid ("d3dd5fcd-a77d-42bd-af4b-ba20c24e109f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.IODep();
            }

        }

        @objid ("008a3360-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReturnedSmDependency extends SmSingleDependency {
            @objid ("bfd86202-71cb-4da4-977d-124e7ef2d093")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ParameterData) data).mReturned;
            }

            @objid ("e3ab0ccd-3099-43c9-9766-576d8f8c89dc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ParameterData) data).mReturned = value;
            }

            @objid ("e2a295ec-80a2-4d67-885c-af20c12b8344")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ReturnDep();
            }

        }

        @objid ("008ab18c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataOutputSmDependency extends SmMultipleDependency {
            @objid ("765efaa8-cf30-439b-9ad3-96dabdd7afd1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataOutput != null)? ((ParameterData)data).mBpmnRepresentingDataOutput:SmMultipleDependency.EMPTY;
            }

            @objid ("f21e16ee-1be0-4ed0-b38d-5588f09bb78b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataOutput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataOutput;
            }

            @objid ("f58bd72f-4e28-4ac0-bd0d-81878f123092")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.RepresentedParameterDep();
            }

        }

        @objid ("008b1dc0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BpmnRepresentingDataInputSmDependency extends SmMultipleDependency {
            @objid ("bb99b1ba-dd23-45a9-a983-e1f24fee68bc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ParameterData)data).mBpmnRepresentingDataInput != null)? ((ParameterData)data).mBpmnRepresentingDataInput:SmMultipleDependency.EMPTY;
            }

            @objid ("c119541e-1e63-40b0-94d5-e21ec2e6f1cc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ParameterData) data).mBpmnRepresentingDataInput = new ArrayList<>(initialCapacity);
                return ((ParameterData) data).mBpmnRepresentingDataInput;
            }

            @objid ("5d00a622-2ce6-4682-b991-d9e66e50dd7c")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.RepresentedParameterDep();
            }

        }

    }

}
