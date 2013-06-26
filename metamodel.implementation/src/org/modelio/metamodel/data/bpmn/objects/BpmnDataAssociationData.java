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
package org.modelio.metamodel.data.bpmn.objects;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.events.BpmnCatchEventData;
import org.modelio.metamodel.data.bpmn.events.BpmnThrowEventData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataAssociationImpl;
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

@objid ("0004de90-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnDataAssociation.class, factory=BpmnDataAssociationData.Metadata.ObjectFactory.class)
public class BpmnDataAssociationData extends BpmnBaseElementData {
    @objid ("cd98e9d9-e5d3-4294-b160-275a94af2194")
    @SmaMetaAttribute(metaName="Assignment", type=String.class, smAttributeClass=Metadata.AssignmentSmAttribute.class)
     Object mAssignment = "";

    @objid ("fb6357db-109c-4fde-9b3a-1ead40fe989a")
    @SmaMetaAttribute(metaName="Transfomation", type=String.class, smAttributeClass=Metadata.TransfomationSmAttribute.class)
     Object mTransfomation = "";

    @objid ("83c76019-db12-4732-bbae-5d4dd595fd48")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("d8d1602f-3bbf-4f5a-9888-10070c91b225")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     List<SmObjectImpl> mSourceRef = null;

    @objid ("2b179792-c653-486e-b444-374d2887f417")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("0a6313b7-cb1b-4412-b1ab-9d56b3bad09a")
    @SmaMetaAssociation(metaName="EndingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.EndingActivitySmDependency.class)
     SmObjectImpl mEndingActivity;

    @objid ("59f1eb85-eae5-4a7e-968c-6a0f92698d06")
    @SmaMetaAssociation(metaName="StartingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.StartingActivitySmDependency.class)
     SmObjectImpl mStartingActivity;

    @objid ("61cd8866-41ee-4f3b-b9a8-50b6ff750472")
    @SmaMetaAssociation(metaName="StartingEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.StartingEventSmDependency.class)
     SmObjectImpl mStartingEvent;

    @objid ("036b4b73-91f0-4aec-98e9-3886873eaa17")
    @SmaMetaAssociation(metaName="VisualShortCut", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.VisualShortCutSmDependency.class)
     List<SmObjectImpl> mVisualShortCut = null;

    @objid ("e80f03f0-2e4b-48f2-86e2-09a6ec880dbd")
    @SmaMetaAssociation(metaName="EndingEvent", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.EndingEventSmDependency.class)
     SmObjectImpl mEndingEvent;

    @objid ("6737e4b4-6f03-443b-b1bc-fa531c110d6f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071e6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a0a54f39-e355-457d-b227-b8856d9c76b0")
        private static SmClass smClass = null;

        @objid ("fa171761-c4aa-4b3a-9559-989e0613fa67")
        private static SmAttribute AssignmentAtt = null;

        @objid ("a890c2e9-3842-4ed2-ac70-ce9ef455d8bb")
        private static SmAttribute TransfomationAtt = null;

        @objid ("f80b661f-b11f-4be4-a68e-fbe994b4aebb")
        private static SmAttribute LanguageAtt = null;

        @objid ("c775e3ae-8f91-4b2b-b892-dc6545f65775")
        private static SmDependency SourceRefDep = null;

        @objid ("18eaa5d1-5b5c-4538-b022-638d0834f1b6")
        private static SmDependency TargetRefDep = null;

        @objid ("fbefa340-83a0-44bb-ae56-2eb25fc11f55")
        private static SmDependency EndingActivityDep = null;

        @objid ("a1f536ac-27f8-4f6c-b9c8-a6a710589052")
        private static SmDependency StartingActivityDep = null;

        @objid ("8a656016-ad53-4503-8c98-c91a39123090")
        private static SmDependency StartingEventDep = null;

        @objid ("a7da1080-67ad-4034-bc1e-ff9b27234fb6")
        private static SmDependency VisualShortCutDep = null;

        @objid ("b2dc323d-e68e-44a5-8690-f48c94e90840")
        private static SmDependency EndingEventDep = null;

        @objid ("89f1214b-37e6-4d33-8097-74ad82229d9f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5fab041e-89da-4130-9423-f43e22fb09e4")
        public static SmAttribute AssignmentAtt() {
            if (AssignmentAtt == null) {
            	AssignmentAtt = classof().getAttributeDef("Assignment");
            }
            return AssignmentAtt;
        }

        @objid ("77628fb9-72aa-4f67-8b09-8ffba39cf3c8")
        public static SmAttribute TransfomationAtt() {
            if (TransfomationAtt == null) {
            	TransfomationAtt = classof().getAttributeDef("Transfomation");
            }
            return TransfomationAtt;
        }

        @objid ("72b44954-63c7-4b3f-86f1-95308e2e352c")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("d6c0e0e8-c51a-4f49-9e1a-a1aa1ee1918d")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("52e58422-6c53-4855-853b-230bdf987aaf")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("7ef85ffd-8837-4c9d-baf3-70b02d0567cd")
        public static SmDependency EndingActivityDep() {
            if (EndingActivityDep == null) {
            	EndingActivityDep = classof().getDependencyDef("EndingActivity");
            }
            return EndingActivityDep;
        }

        @objid ("ecc452df-f4a5-43d8-8aef-2b5cb0f41592")
        public static SmDependency StartingActivityDep() {
            if (StartingActivityDep == null) {
            	StartingActivityDep = classof().getDependencyDef("StartingActivity");
            }
            return StartingActivityDep;
        }

        @objid ("b1784c6e-c576-4023-93fe-a407f8f38d32")
        public static SmDependency StartingEventDep() {
            if (StartingEventDep == null) {
            	StartingEventDep = classof().getDependencyDef("StartingEvent");
            }
            return StartingEventDep;
        }

        @objid ("07f0729f-0154-4196-8dc6-6f5316d052fc")
        public static SmDependency VisualShortCutDep() {
            if (VisualShortCutDep == null) {
            	VisualShortCutDep = classof().getDependencyDef("VisualShortCut");
            }
            return VisualShortCutDep;
        }

        @objid ("d26c5edf-01b6-4356-b12f-c299aa90ba8a")
        public static SmDependency EndingEventDep() {
            if (EndingEventDep == null) {
            	EndingEventDep = classof().getDependencyDef("EndingEvent");
            }
            return EndingEventDep;
        }

        @objid ("44daa7c6-9bd3-40d5-9990-6a71ec83a0ed")
        public static SmDependency getVisualShortCutDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisualShortCutDep;
        }

        @objid ("02f75b6a-9d9e-42af-92db-2891593d1962")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("89143d7e-ea7a-4ced-958e-a4218f85840e")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("1d2e5d37-547a-4d9c-a616-8a971687557e")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("9d38cd2f-0a70-4df5-b7c3-b42d9d3a5408")
        public static SmDependency getStartingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingActivityDep;
        }

        @objid ("8d3e72a3-e183-4e34-a0aa-fbff1eb5fe67")
        public static SmDependency getStartingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingEventDep;
        }

        @objid ("7c7581af-7d4d-4ee1-af1a-fbb5f814bbc8")
        public static SmDependency getEndingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingEventDep;
        }

        @objid ("8dccf4bc-bb0e-4182-a803-8a8a4c1bd5e1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0bfa5f5e-84ab-40ac-9acc-30cd8424096d")
        public static SmAttribute getTransfomationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransfomationAtt;
        }

        @objid ("630d52ff-e16e-425e-825c-ea60c6ddc3b4")
        public static SmDependency getEndingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingActivityDep;
        }

        @objid ("14b3263e-e80c-4c58-a628-eb676ce37d84")
        public static SmAttribute getAssignmentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssignmentAtt;
        }

        @objid ("00722784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74c80009-e178-4418-b88b-96a28426cb28")
            public ISmObjectData createData() {
                return new BpmnDataAssociationData();
            }

            @objid ("bcda878d-43c9-4a4c-af4b-39e33f71e741")
            public SmObjectImpl createImpl() {
                return new BpmnDataAssociationImpl();
            }

        }

        @objid ("00728d5a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AssignmentSmAttribute extends SmAttribute {
            @objid ("17a27721-665f-4b52-b94b-3c47f2273525")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mAssignment;
            }

            @objid ("b6f17b7b-ae14-4af1-8659-42413c5613cb")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mAssignment = value;
            }

        }

        @objid ("0072ed90-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TransfomationSmAttribute extends SmAttribute {
            @objid ("2ea2fb54-2ed5-462e-a783-32a4f5ceed31")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTransfomation;
            }

            @objid ("6f88949e-165b-4e94-9b15-eff2ee5c82f4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mTransfomation = value;
            }

        }

        @objid ("00734d62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("58f14a91-65da-4b22-8791-72c5210bd951")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mLanguage;
            }

            @objid ("6f3bf011-2026-4ce2-a366-5dcda1103a15")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mLanguage = value;
            }

        }

        @objid ("0073b0ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmMultipleDependency {
            @objid ("b67b6745-51aa-400c-8310-8393b3886e7f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mSourceRef != null)? ((BpmnDataAssociationData)data).mSourceRef:SmMultipleDependency.EMPTY;
            }

            @objid ("eb039241-7aa6-4225-9432-52665398cb1c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mSourceRef = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mSourceRef;
            }

            @objid ("d1b41cfc-c9d4-4abb-b66b-81ca3d21b264")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep();
            }

        }

        @objid ("00741418-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("addc2413-13d8-4032-98c9-6003e9db4b33")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTargetRef;
            }

            @objid ("ccc2d15d-d8fd-4694-9495-a0d38a9a64b2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mTargetRef = value;
            }

            @objid ("d30f7fd0-86ce-4923-8c4c-7311e70e6c42")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep();
            }

        }

        @objid ("007488f8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisualShortCutSmDependency extends SmMultipleDependency {
            @objid ("2de3942b-cd2f-4a73-891f-e15cedf49c5c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mVisualShortCut != null)? ((BpmnDataAssociationData)data).mVisualShortCut:SmMultipleDependency.EMPTY;
            }

            @objid ("97aa444e-294e-495d-ac8a-9203965ff6d2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mVisualShortCut = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mVisualShortCut;
            }

            @objid ("329cfa2a-76eb-423e-a4ff-a5e0cbedd1b0")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep();
            }

        }

        @objid ("0074ed98-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingActivitySmDependency extends SmSingleDependency {
            @objid ("59706039-126a-47ab-8721-afe3c471be75")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingActivity;
            }

            @objid ("cf641a69-d27e-4365-bf6e-d953a1ea9549")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingActivity = value;
            }

            @objid ("9b954f32-713b-42a1-9587-e456dd90b3e8")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("007564c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingEventSmDependency extends SmSingleDependency {
            @objid ("45d9b2b5-df0e-44bc-ae04-c52a01d00369")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingEvent;
            }

            @objid ("d48fd559-c3c0-460f-ba35-419b9c0d1cab")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingEvent = value;
            }

            @objid ("36b1c137-02c3-488a-91ef-5f5c90f8599f")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("0075dc80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingActivitySmDependency extends SmSingleDependency {
            @objid ("784ce492-161b-442f-a86d-520832d59c5d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingActivity;
            }

            @objid ("06b077c6-42de-415b-bf92-39f58e885bdf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingActivity = value;
            }

            @objid ("d1aae37d-2b63-421b-954f-ebcb9960849d")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataOutputAssociationDep();
            }

        }

        @objid ("00765412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingEventSmDependency extends SmSingleDependency {
            @objid ("bcad173f-cef3-45c4-9c5c-803995364efe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingEvent;
            }

            @objid ("de278dbf-af9e-4192-b346-ee7d490abfb6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingEvent = value;
            }

            @objid ("83f94a10-18be-49dd-bacf-8d5093323672")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputAssociationDep();
            }

        }

    }

}
