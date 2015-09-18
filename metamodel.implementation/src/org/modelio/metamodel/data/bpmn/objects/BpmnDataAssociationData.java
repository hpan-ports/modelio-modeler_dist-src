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
    @objid ("4315fbcb-d36f-472d-99ef-c310001ce604")
    @SmaMetaAttribute(metaName="Assignment", type=String.class, smAttributeClass=Metadata.AssignmentSmAttribute.class)
     Object mAssignment = "";

    @objid ("f5622024-107e-4b29-b51c-4932ffedaf2d")
    @SmaMetaAttribute(metaName="Transfomation", type=String.class, smAttributeClass=Metadata.TransfomationSmAttribute.class)
     Object mTransfomation = "";

    @objid ("86283dfc-f917-4d87-945a-512b7132688c")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("33de5707-bcc1-447a-9551-675aa9e86334")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     List<SmObjectImpl> mSourceRef = null;

    @objid ("ee971068-d848-48b6-b8a3-5e1e7e822db1")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnItemAwareElementData.class, min=0, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("0e431713-cc69-476d-96ac-489909a6e3cd")
    @SmaMetaAssociation(metaName="EndingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.EndingActivitySmDependency.class)
     SmObjectImpl mEndingActivity;

    @objid ("3b4a7ab2-62dd-4ec4-ae22-5b11ac558720")
    @SmaMetaAssociation(metaName="StartingActivity", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.StartingActivitySmDependency.class)
     SmObjectImpl mStartingActivity;

    @objid ("69c7a69b-9c83-4041-b331-1af2aeb4236e")
    @SmaMetaAssociation(metaName="StartingEvent", typeDataClass=BpmnThrowEventData.class, min=0, max=1, smAssociationClass=Metadata.StartingEventSmDependency.class)
     SmObjectImpl mStartingEvent;

    @objid ("77515789-90e2-4e87-afeb-8ee6d6476412")
    @SmaMetaAssociation(metaName="VisualShortCut", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.VisualShortCutSmDependency.class)
     List<SmObjectImpl> mVisualShortCut = null;

    @objid ("894fe5e2-3a5c-4daa-9ca7-21ee15a64e17")
    @SmaMetaAssociation(metaName="EndingEvent", typeDataClass=BpmnCatchEventData.class, min=0, max=1, smAssociationClass=Metadata.EndingEventSmDependency.class)
     SmObjectImpl mEndingEvent;

    @objid ("485e64f2-2de1-43a0-9e6c-d80b63f31ac7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0071e6de-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6e36d4a6-717e-45ce-bbd9-98835855a90e")
        private static SmClass smClass = null;

        @objid ("4785c34f-bc40-4271-a5e7-654a03e22ba5")
        private static SmAttribute AssignmentAtt = null;

        @objid ("eacaf6f7-2f52-4265-83ef-8af5a0c5f961")
        private static SmAttribute TransfomationAtt = null;

        @objid ("2c2dd073-d98d-428f-9c2a-4b2901025b7e")
        private static SmAttribute LanguageAtt = null;

        @objid ("5dbfb812-586f-4daa-994e-771012fcf36f")
        private static SmDependency SourceRefDep = null;

        @objid ("188ac8a4-865a-45ff-a885-6b5e2d56a258")
        private static SmDependency TargetRefDep = null;

        @objid ("8ec8a87b-cfb7-4648-aa59-75ad2f151da1")
        private static SmDependency EndingActivityDep = null;

        @objid ("eb0df046-4fcf-434f-9ca6-7adddbcab904")
        private static SmDependency StartingActivityDep = null;

        @objid ("9ef015c4-73db-45d9-8051-1891e6ebde89")
        private static SmDependency StartingEventDep = null;

        @objid ("1dc06dc9-2144-402a-95c1-184183879896")
        private static SmDependency VisualShortCutDep = null;

        @objid ("57388360-25f7-4b59-a1c8-d795d3fc9407")
        private static SmDependency EndingEventDep = null;

        @objid ("e1cce27a-05a6-408a-8745-e3dc25b55317")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnDataAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b0d78c83-610b-42a3-a4ca-66a0e60f1b54")
        public static SmAttribute AssignmentAtt() {
            if (AssignmentAtt == null) {
            	AssignmentAtt = classof().getAttributeDef("Assignment");
            }
            return AssignmentAtt;
        }

        @objid ("5f1c6baa-1183-4f59-ba66-47c88a4245a5")
        public static SmAttribute TransfomationAtt() {
            if (TransfomationAtt == null) {
            	TransfomationAtt = classof().getAttributeDef("Transfomation");
            }
            return TransfomationAtt;
        }

        @objid ("26023b65-beb6-4588-8f62-e97fee343a40")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("99034385-4e8e-4464-acb9-9cd650567b96")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("7087a8fc-d2e8-4e13-ac45-460a17f089a2")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("cfbadd88-4364-4f6f-ab98-8e113d20755d")
        public static SmDependency EndingActivityDep() {
            if (EndingActivityDep == null) {
            	EndingActivityDep = classof().getDependencyDef("EndingActivity");
            }
            return EndingActivityDep;
        }

        @objid ("7fcd622e-72d0-4005-a13c-aace16b7ed96")
        public static SmDependency StartingActivityDep() {
            if (StartingActivityDep == null) {
            	StartingActivityDep = classof().getDependencyDef("StartingActivity");
            }
            return StartingActivityDep;
        }

        @objid ("93a3463f-a5c0-4347-bebe-e2e83d8f346a")
        public static SmDependency StartingEventDep() {
            if (StartingEventDep == null) {
            	StartingEventDep = classof().getDependencyDef("StartingEvent");
            }
            return StartingEventDep;
        }

        @objid ("3c0bcdbf-3786-42ed-a3ff-3b53071caea9")
        public static SmDependency VisualShortCutDep() {
            if (VisualShortCutDep == null) {
            	VisualShortCutDep = classof().getDependencyDef("VisualShortCut");
            }
            return VisualShortCutDep;
        }

        @objid ("cc8dd4aa-cc1b-4399-a4ae-cdd06c833da5")
        public static SmDependency EndingEventDep() {
            if (EndingEventDep == null) {
            	EndingEventDep = classof().getDependencyDef("EndingEvent");
            }
            return EndingEventDep;
        }

        @objid ("b017851e-e3bb-43d8-acba-2f2d106b94c7")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("83f9ea85-e64f-4bd3-96c1-e2b82275fd59")
        public static SmAttribute getTransfomationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TransfomationAtt;
        }

        @objid ("3688f029-989c-48fd-905c-4325ed6aa81a")
        public static SmDependency getEndingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingActivityDep;
        }

        @objid ("c96c700f-990b-45c2-990e-853435a090cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("650adb1c-fe1c-4e1f-9c76-e462b32fffa8")
        public static SmDependency getStartingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingEventDep;
        }

        @objid ("81a62d95-1d2e-4101-b5b1-35f7dfd08a03")
        public static SmDependency getEndingEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndingEventDep;
        }

        @objid ("2f075056-f75e-4ebd-84a0-aafd7d5046d7")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("2f513bb8-8893-41dc-8bf6-ce74d11c3c7b")
        public static SmDependency getStartingActivityDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartingActivityDep;
        }

        @objid ("43e154c5-7d8b-4331-b2aa-b84bd0798bef")
        public static SmAttribute getAssignmentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssignmentAtt;
        }

        @objid ("c77d25f1-56c1-42a1-adbc-af2ea08783e2")
        public static SmDependency getVisualShortCutDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisualShortCutDep;
        }

        @objid ("ea21316b-4c01-4fbe-b106-cfd5364d82d5")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("00722784-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f4a4ac55-6eb6-47e8-9e22-ad15c0bd2c17")
            public ISmObjectData createData() {
                return new BpmnDataAssociationData();
            }

            @objid ("c12a03a7-49c9-41d6-96b4-82c900dbc216")
            public SmObjectImpl createImpl() {
                return new BpmnDataAssociationImpl();
            }

        }

        @objid ("00728d5a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class AssignmentSmAttribute extends SmAttribute {
            @objid ("7d518e84-fa30-45f8-aced-29e5145792e5")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mAssignment;
            }

            @objid ("cd6a72ab-0d98-47b2-99c1-cdac4cb56741")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mAssignment = value;
            }

        }

        @objid ("0072ed90-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TransfomationSmAttribute extends SmAttribute {
            @objid ("9689c350-5696-482a-9e16-399936615b69")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTransfomation;
            }

            @objid ("2780b2ed-f790-444f-b8e8-d6137c75fa0b")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mTransfomation = value;
            }

        }

        @objid ("00734d62-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("0ae91e57-a5e8-49eb-a547-b37cc5ff97f2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mLanguage;
            }

            @objid ("a8e7ce56-a6e0-464d-9e00-86b377c62c7e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnDataAssociationData) data).mLanguage = value;
            }

        }

        @objid ("0073b0ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmMultipleDependency {
            @objid ("68b758db-9b57-4498-a87e-78181ce8838f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mSourceRef != null)? ((BpmnDataAssociationData)data).mSourceRef:SmMultipleDependency.EMPTY;
            }

            @objid ("bc7ba0c7-0880-44f0-a4e4-d94619ab49c1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mSourceRef = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mSourceRef;
            }

            @objid ("02cda3fc-80e8-4952-adb1-c5c9cedd6d78")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.SourceOfDataAssociationDep();
            }

        }

        @objid ("00741418-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("c9cd2fad-3eda-4f25-bef0-a864224278cc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mTargetRef;
            }

            @objid ("636c7cca-05ac-4442-a50b-3f0df21445de")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mTargetRef = value;
            }

            @objid ("c026718d-c35c-4b56-8f68-5a3ba23e807c")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.TargetOfDataAssociationDep();
            }

        }

        @objid ("007488f8-c4c4-1fd8-97fe-001ec947cd2a")
        public static class VisualShortCutSmDependency extends SmMultipleDependency {
            @objid ("a698ec36-2038-4e7c-ab3b-283f55feab38")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnDataAssociationData)data).mVisualShortCut != null)? ((BpmnDataAssociationData)data).mVisualShortCut:SmMultipleDependency.EMPTY;
            }

            @objid ("5a1db230-3d43-4024-b2c6-394334d59373")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnDataAssociationData) data).mVisualShortCut = new ArrayList<>(initialCapacity);
                return ((BpmnDataAssociationData) data).mVisualShortCut;
            }

            @objid ("fb0575d6-33f8-4296-8a05-01d123fd8afa")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.DataAssociationDep();
            }

        }

        @objid ("0074ed98-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingActivitySmDependency extends SmSingleDependency {
            @objid ("9d6db9f2-fb7a-4a8c-9609-db96484a7ea9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingActivity;
            }

            @objid ("ffaf5c02-d510-4c07-9c5d-396b744e0c8b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingActivity = value;
            }

            @objid ("d9412769-5223-4ec3-9aff-cdbdec3a8ed3")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("007564c6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StartingEventSmDependency extends SmSingleDependency {
            @objid ("979bfeec-a4e7-463d-b5e9-9b5c169b3d3c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mStartingEvent;
            }

            @objid ("609bb89a-551f-48c3-8da8-2665a1f60ab3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mStartingEvent = value;
            }

            @objid ("de731827-6e02-4595-9302-99f9b0fc8c98")
            @Override
            public SmDependency getSymetric() {
                return BpmnThrowEventData.Metadata.DataInputAssociationDep();
            }

        }

        @objid ("0075dc80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingActivitySmDependency extends SmSingleDependency {
            @objid ("04612830-6d8e-499d-8d8c-e33d2595afcf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingActivity;
            }

            @objid ("d6ce6bb7-f786-4515-ab61-73d82de87ac7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingActivity = value;
            }

            @objid ("65c8cd8a-5e7d-46ba-adf5-8ebcd18f9caf")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DataOutputAssociationDep();
            }

        }

        @objid ("00765412-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EndingEventSmDependency extends SmSingleDependency {
            @objid ("d5d70404-c142-4c8d-9849-692629d07ded")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnDataAssociationData) data).mEndingEvent;
            }

            @objid ("9b9be5b9-63d5-48a1-8208-223559a100a7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnDataAssociationData) data).mEndingEvent = value;
            }

            @objid ("6ebce7da-7fae-4bba-be9e-1838c669817c")
            @Override
            public SmDependency getSymetric() {
                return BpmnCatchEventData.Metadata.DataOutputAssociationDep();
            }

        }

    }

}
