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
    @objid ("0c997c2d-10ca-43c7-8a7d-e80ff36ea756")
    @SmaMetaAttribute(metaName="Assignment", type=String.class, smAttributeClass=Metadata.AssignmentSmAttribute.class)
     Object mAssignment = "";

    @objid ("c472bfc6-6dc5-451d-bd32-f4968a72372b")
    @SmaMetaAttribute(metaName="Transfomation", type=String.class, smAttributeClass=Metadata.TransfomationSmAttribute.class)
     Object mTransfomation = "";

    @objid ("01b56af0-81a5-4b46-b4ab-f6caebc14251")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("419c715e-5712-4a42-91a3-ebfcd61321f0")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     List<SmObjectImpl> mSourceRef = null;

    @objid ("390f71b6-964f-4e49-85bb-625c3bcfdd4a")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("6557c748-635a-4215-ba6c-137ea877ed9a")
    @SmaMetaAssociation(metaName="EndingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.EndingActivitySmDependency.class)
     SmObjectImpl mEndingActivity;

    @objid ("1684fd44-52cc-4141-9205-45565c101f2b")
    @SmaMetaAssociation(metaName="StartingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.StartingActivitySmDependency.class)
     SmObjectImpl mStartingActivity;

    @objid ("0d6cf31c-7795-4b8c-a34c-e3b8d814f04d")
    @SmaMetaAssociation(metaName="StartingEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.StartingEventSmDependency.class)
     SmObjectImpl mStartingEvent;

    @objid ("15d9bfe7-9e02-4fd1-9ca0-31e8cc56f9f9")
    @SmaMetaAssociation(metaName="VisualShortCut", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.VisualShortCutSmDependency.class)
     List<SmObjectImpl> mVisualShortCut = null;

    @objid ("58d923dc-1678-479d-a99f-a0930f0f9d49")
    @SmaMetaAssociation(metaName="EndingEvent", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.EndingEventSmDependency.class)
     SmObjectImpl mEndingEvent;

    @objid ("73f7d81d-9848-41a6-84fc-b8a316b65f86")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071e6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("af8a7186-ef41-4ebe-aae0-b13d930f43b1")
        private static SmClass smClass = null;

        @objid ("8e1e3cb7-5f54-43d8-89bd-a59e06dfdc42")
        private static SmAttribute AssignmentAtt = null;

        @objid ("2adff799-6c91-427b-b51a-e80c8fb24061")
        private static SmAttribute TransfomationAtt = null;

        @objid ("d62b30a5-19da-480d-b70e-f211562d952b")
        private static SmAttribute LanguageAtt = null;

        @objid ("3bc1c754-6bc0-46c8-be31-4c0824ba183b")
        private static SmDependency SourceRefDep = null;

        @objid ("18e954dc-e4af-44b5-ab44-7126a5411bc3")
        private static SmDependency TargetRefDep = null;

        @objid ("0ee562d4-a15d-4572-82b0-918531087039")
        private static SmDependency EndingActivityDep = null;

        @objid ("6b4d73db-5ecf-4752-ba51-e37b202feebe")
        private static SmDependency StartingActivityDep = null;

        @objid ("50d7f01f-7915-4303-b08c-ab9e7a396801")
        private static SmDependency StartingEventDep = null;

        @objid ("a0300bd7-7166-4f16-81d9-f80b5d7741de")
        private static SmDependency VisualShortCutDep = null;

        @objid ("c145055d-bcf8-43cc-a988-22b30b71e561")
        private static SmDependency EndingEventDep = null;

        @objid ("d307c16c-30ee-4e4f-9c9e-ddeef4e0c341")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9410acd3-8ace-4057-a648-4d4350a7564e")
        public static SmAttribute AssignmentAtt() {
            if (AssignmentAtt == null) {
            	AssignmentAtt = classof().getAttributeDef("Assignment");
            }
            return AssignmentAtt;
        }

        @objid ("7938786e-5a94-4740-a057-e7608ca1c707")
        public static SmAttribute TransfomationAtt() {
            if (TransfomationAtt == null) {
            	TransfomationAtt = classof().getAttributeDef("Transfomation");
            }
            return TransfomationAtt;
        }

        @objid ("5c261950-8026-4444-90ff-80464a8c83d8")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("0c4e37e1-2749-49c6-8645-20de6bc79211")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("ac9a931f-df97-46eb-9cbf-9aaafa28555c")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("e73a5b62-14d6-40b4-b274-39fbf040622a")
        public static SmDependency EndingActivityDep() {
            if (EndingActivityDep == null) {
            	EndingActivityDep = classof().getDependencyDef("EndingActivity");
            }
            return EndingActivityDep;
        }

        @objid ("3edca85e-25fe-4d7e-90be-2fe0e3a99778")
        public static SmDependency StartingActivityDep() {
            if (StartingActivityDep == null) {
            	StartingActivityDep = classof().getDependencyDef("StartingActivity");
            }
            return StartingActivityDep;
        }

        @objid ("684910bd-4416-4ec9-9e69-25b2122a9963")
        public static SmDependency StartingEventDep() {
            if (StartingEventDep == null) {
            	StartingEventDep = classof().getDependencyDef("StartingEvent");
            }
            return StartingEventDep;
        }

        @objid ("700bc907-53ad-41a5-bfda-83e1a91d9bf4")
        public static SmDependency VisualShortCutDep() {
            if (VisualShortCutDep == null) {
            	VisualShortCutDep = classof().getDependencyDef("VisualShortCut");
            }
            return VisualShortCutDep;
        }

        @objid ("2292a1d3-fb51-4f10-b6a9-14ca190c2a94")
        public static SmDependency EndingEventDep() {
            if (EndingEventDep == null) {
            	EndingEventDep = classof().getDependencyDef("EndingEvent");
            }
            return EndingEventDep;
        }

        @objid ("112e9616-28f8-4711-9e3b-c0f29142d730")
        public static SmDependency getEndingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingActivityDep;
        }

        @objid ("c23a687d-f12a-4727-b406-6478743f2a6d")
        public static SmDependency getStartingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingActivityDep;
        }

        @objid ("347705ca-f14f-4ec2-855b-161327b58e5a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f10586a7-2b59-466e-8ac3-d79d1c85fcaa")
        public static SmAttribute getTransfomationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransfomationAtt;
        }

        @objid ("135ae805-e9a7-4eb2-bbbd-ee1989e566ca")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("0e5f2ebc-d7b0-40b7-9b9b-5acbbf3647cd")
        public static SmAttribute getAssignmentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssignmentAtt;
        }

        @objid ("7aee0321-0fc8-4379-bcc3-9bbfa6794532")
        public static SmDependency getEndingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingEventDep;
        }

        @objid ("2ec16ebf-593e-403a-a7c8-7db4ec02729c")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("62dc971d-aa67-4b48-b85b-0f54aaf6c9df")
        public static SmDependency getVisualShortCutDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisualShortCutDep;
        }

        @objid ("adf50f11-4f92-4bd2-a646-406f52dfafb2")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("a00d74d7-3b1f-4384-b338-38e5f1c363e5")
        public static SmDependency getStartingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingEventDep;
        }

        @objid ("00722784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b6c6c9e8-196c-42d4-b7e5-1b379d195a35")
            public ISmObjectData createData() {
                return new BpmnDataAssociationData();
            }

            @objid ("fc797b88-1859-44eb-a7b3-7955a885fa2a")
            public SmObjectImpl createImpl() {
                return new BpmnDataAssociationImpl();
            }

        }

        @objid ("00728d5a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AssignmentSmAttribute extends SmAttribute {
            @objid ("983ed499-d49c-4a4b-ac18-b00969ecd9b4")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mAssignment;
            }

            @objid ("3744b3b2-cef1-45bf-8f60-3e15f72f8a24")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mAssignment = value;
            }

        }

        @objid ("0072ed90-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TransfomationSmAttribute extends SmAttribute {
            @objid ("bfda168d-37b6-42de-a875-36621f34eb63")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTransfomation;
            }

            @objid ("b2d3737f-411b-458c-af64-6e4ea0ab5f66")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mTransfomation = value;
            }

        }

        @objid ("00734d62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("c67e45bd-0a07-4af1-a422-0b0d11287a76")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mLanguage;
            }

            @objid ("62763cef-5b7f-4cca-90f4-3d1bc1fb5a3f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mLanguage = value;
            }

        }

        @objid ("0073b0ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmMultipleDependency {
            @objid ("32a6421e-1f5d-4c71-ae39-f651bc6ade68")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mSourceRef != null)? ((BpmnDataAssociationData)data).mSourceRef:SmMultipleDependency.EMPTY;
            }

            @objid ("27d056d3-769f-41b4-95c8-2380ca410050")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mSourceRef = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mSourceRef;
            }

            @objid ("62dd1e17-6d26-4021-ac72-2fcfc7e4c0e2")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep();
            }

        }

        @objid ("00741418-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("aad2343a-ee77-46d2-b03e-8ff5b2b6f9fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTargetRef;
            }

            @objid ("7337f5f4-e5e8-4b90-bc51-0c2a597fa62b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mTargetRef = value;
            }

            @objid ("778a0837-b25c-411f-adcd-66a058ba3f31")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep();
            }

        }

        @objid ("007488f8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisualShortCutSmDependency extends SmMultipleDependency {
            @objid ("e8d4c7f5-2604-401b-998e-93aef2596b04")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mVisualShortCut != null)? ((BpmnDataAssociationData)data).mVisualShortCut:SmMultipleDependency.EMPTY;
            }

            @objid ("9377d62b-70a9-4522-b720-58d82395c292")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mVisualShortCut = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mVisualShortCut;
            }

            @objid ("877a2399-f0c9-488c-8e4d-36e5762154ba")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep();
            }

        }

        @objid ("0074ed98-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingActivitySmDependency extends SmSingleDependency {
            @objid ("baac31a9-e475-4464-bde7-14eb108a9e5f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingActivity;
            }

            @objid ("8bf8fd49-7ba0-4b40-816c-8b9be5ada935")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingActivity = value;
            }

            @objid ("639a6d4c-c1d2-40ca-9d08-01718f1bd3cf")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("007564c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingEventSmDependency extends SmSingleDependency {
            @objid ("239b286a-119e-4aae-bbff-adda104c6ef5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingEvent;
            }

            @objid ("fa123cd5-2341-46d7-81dc-72c23760ab61")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingEvent = value;
            }

            @objid ("ab8815ba-6e90-4bf1-88d5-fc04328d6552")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("0075dc80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingActivitySmDependency extends SmSingleDependency {
            @objid ("0fc76351-7e10-4e6b-99ce-e6e540fd54d0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingActivity;
            }

            @objid ("40d17d84-4a82-4231-97e6-e2219ad820e2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingActivity = value;
            }

            @objid ("3875feff-bc3b-480b-ab05-c1dfcd2936cf")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataOutputAssociationDep();
            }

        }

        @objid ("00765412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingEventSmDependency extends SmSingleDependency {
            @objid ("343ba387-15ab-49d2-8e72-31fe249e2253")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingEvent;
            }

            @objid ("9f984598-f1b2-49e7-a62f-cab2e242619f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingEvent = value;
            }

            @objid ("564465ea-bb87-4e6f-9b1e-0c36e094f1f5")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputAssociationDep();
            }

        }

    }

}
