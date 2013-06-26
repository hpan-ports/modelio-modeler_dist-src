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
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataStateData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.bpmn.objects.BpmnItemAwareElementImpl;
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

@objid ("000765a2-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnItemAwareElement.class, factory=BpmnItemAwareElementData.Metadata.ObjectFactory.class)
public abstract class BpmnItemAwareElementData extends BpmnFlowElementData {
    @objid ("3c76330f-a5cb-43ed-a250-b722e8d5fd26")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("697c0998-4dd0-4d2f-beb8-5a37c30e5ab9")
    @SmaMetaAssociation(metaName="TargetOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.TargetOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mTargetOfDataAssociation = null;

    @objid ("aec301bd-83f0-4900-85dd-97d1b6f2dfb7")
    @SmaMetaAssociation(metaName="ItemSubjectRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemSubjectRefSmDependency.class, partof = true)
     SmObjectImpl mItemSubjectRef;

    @objid ("9e968c71-9b44-4500-8a78-32b987cac381")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("1ae33171-407a-4da0-af6b-01a588100405")
    @SmaMetaAssociation(metaName="RepresentedAssociationEnd", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAssociationEndSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAssociationEnd;

    @objid ("e0b3015a-57b2-4cd0-a540-504e15b09512")
    @SmaMetaAssociation(metaName="DataState", typeDataClass=BpmnDataStateData.class, min=0, max=1, smAssociationClass=Metadata.DataStateSmDependency.class, component = true)
     SmObjectImpl mDataState;

    @objid ("e20450ad-1887-4a9f-a9d0-69b3b69ecdad")
    @SmaMetaAssociation(metaName="SourceOfDataAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.SourceOfDataAssociationSmDependency.class)
     List<SmObjectImpl> mSourceOfDataAssociation = null;

    @objid ("f2277d4b-8b96-4a6d-ae23-c4332059f899")
    @SmaMetaAssociation(metaName="RepresentedAttribute", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedAttributeSmDependency.class, partof = true)
     SmObjectImpl mRepresentedAttribute;

    @objid ("87511f73-25af-4dd0-8b18-caa956d5d8c9")
    @SmaMetaAssociation(metaName="RepresentedInstance", typeDataClass=InstanceData.class, min=0, max=1, smAssociationClass=Metadata.RepresentedInstanceSmDependency.class, partof = true)
     SmObjectImpl mRepresentedInstance;

    @objid ("e87d34b9-e2f6-494f-a50d-b37b7ba71f38")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00342ba0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("dc0de4e4-f6e9-421e-81b4-034f7f1fe4bc")
        private static SmClass smClass = null;

        @objid ("a90d46fc-7823-44e4-a3d8-95d962289a70")
        private static SmDependency TypeDep = null;

        @objid ("279dab55-c285-4040-8634-4c786bf5361e")
        private static SmDependency TargetOfDataAssociationDep = null;

        @objid ("f2b7a23d-d0dc-43e3-88bc-e8543dbbe9cd")
        private static SmDependency ItemSubjectRefDep = null;

        @objid ("bd4b6018-fbcc-4fcb-9def-8253ed0a5e78")
        private static SmDependency InStateDep = null;

        @objid ("8abb7703-0a5e-4514-aa29-9d28b014ec71")
        private static SmDependency RepresentedAssociationEndDep = null;

        @objid ("f449fb97-5c0c-4c18-afb4-f227d86aaee5")
        private static SmDependency DataStateDep = null;

        @objid ("7e90d505-2fe5-4865-8822-7a050c04fb82")
        private static SmDependency SourceOfDataAssociationDep = null;

        @objid ("685ce67c-045f-4901-9da8-1c5d9f77ca79")
        private static SmDependency RepresentedAttributeDep = null;

        @objid ("e2f14ff0-c964-47c5-9bd3-db6111f61774")
        private static SmDependency RepresentedInstanceDep = null;

        @objid ("35166f7c-e691-4153-b025-65a8f90b3ea5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnItemAwareElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("cbd7d100-32f2-4955-bc49-fe9f7b16a3ea")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d776f555-be9c-4ee0-a7a9-13d928b5f668")
        public static SmDependency TargetOfDataAssociationDep() {
            if (TargetOfDataAssociationDep == null) {
            	TargetOfDataAssociationDep = classof().getDependencyDef("TargetOfDataAssociation");
            }
            return TargetOfDataAssociationDep;
        }

        @objid ("15c48324-6980-4c3f-a4fb-da02c4753c31")
        public static SmDependency ItemSubjectRefDep() {
            if (ItemSubjectRefDep == null) {
            	ItemSubjectRefDep = classof().getDependencyDef("ItemSubjectRef");
            }
            return ItemSubjectRefDep;
        }

        @objid ("ef3a123b-ab2b-40e4-ab5c-1696c5f0ca00")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("3a66b9bc-a385-4db0-a7c5-93524abfcbe6")
        public static SmDependency RepresentedAssociationEndDep() {
            if (RepresentedAssociationEndDep == null) {
            	RepresentedAssociationEndDep = classof().getDependencyDef("RepresentedAssociationEnd");
            }
            return RepresentedAssociationEndDep;
        }

        @objid ("036fc96d-8fa1-4bd5-ae1f-1b54d22e5dfd")
        public static SmDependency DataStateDep() {
            if (DataStateDep == null) {
            	DataStateDep = classof().getDependencyDef("DataState");
            }
            return DataStateDep;
        }

        @objid ("3789d0a7-eb0a-4e5b-999c-038da6603f51")
        public static SmDependency SourceOfDataAssociationDep() {
            if (SourceOfDataAssociationDep == null) {
            	SourceOfDataAssociationDep = classof().getDependencyDef("SourceOfDataAssociation");
            }
            return SourceOfDataAssociationDep;
        }

        @objid ("ba9e557c-692b-45f7-8dd1-bb842ca2c110")
        public static SmDependency RepresentedAttributeDep() {
            if (RepresentedAttributeDep == null) {
            	RepresentedAttributeDep = classof().getDependencyDef("RepresentedAttribute");
            }
            return RepresentedAttributeDep;
        }

        @objid ("d3c8df52-90bf-41c7-a311-c08f8126f932")
        public static SmDependency RepresentedInstanceDep() {
            if (RepresentedInstanceDep == null) {
            	RepresentedInstanceDep = classof().getDependencyDef("RepresentedInstance");
            }
            return RepresentedInstanceDep;
        }

        @objid ("3d068ddc-5818-4d88-b6e8-f615c996206d")
        public static SmDependency getDataStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataStateDep;
        }

        @objid ("51731237-5e1b-4a98-a73c-be4add3f042e")
        public static SmDependency getRepresentedInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedInstanceDep;
        }

        @objid ("01aaf666-ddd8-492a-a07a-eefd9722ca9f")
        public static SmDependency getRepresentedAttributeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAttributeDep;
        }

        @objid ("14e88680-9ff3-4ced-bb1f-aaee55d7e8af")
        public static SmDependency getTargetOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetOfDataAssociationDep;
        }

        @objid ("fbb7ba94-9df6-4407-822f-bbf1c248e945")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("ad8601a7-7aab-4302-9f20-435f0d7493d5")
        public static SmDependency getItemSubjectRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemSubjectRefDep;
        }

        @objid ("e2e43566-e9ad-44cf-b67d-2bce6c1526ee")
        public static SmDependency getRepresentedAssociationEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedAssociationEndDep;
        }

        @objid ("8a2c7e3d-ac88-4a1f-9487-6c15dc93a886")
        public static SmDependency getSourceOfDataAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceOfDataAssociationDep;
        }

        @objid ("c8dfff9d-024e-49e6-89ab-f563bdcd01b0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dbdeb5ab-aad6-44fb-a3f2-04e889725b30")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("00346c78-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cea93616-6f55-47d8-8d95-bb9dd51016b8")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("20a3f9a4-97bb-4fa7-b5f9-3964adb6666b")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0034d352-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemSubjectRefSmDependency extends SmSingleDependency {
            @objid ("15eebdac-e9b9-43e0-96e6-13d5f86e8a68")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mItemSubjectRef;
            }

            @objid ("b42ddca5-7b5a-41a9-abdc-51686165b135")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mItemSubjectRef = value;
            }

            @objid ("86996bf7-6c69-44c9-8a20-54fe41a402df")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedItemDep();
            }

        }

        @objid ("00354864-c4c3-1fd8-97fe-001ec947cd2a")
        public static class DataStateSmDependency extends SmSingleDependency {
            @objid ("3b8de15e-bf65-4343-83de-6191bf534eb0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mDataState;
            }

            @objid ("dd74f632-96d5-44a0-bde8-e4f9e645ee12")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mDataState = value;
            }

            @objid ("7070508d-5c26-4228-ade3-7efb9e3d7e7d")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataStateData.Metadata.ItemDep();
            }

        }

        @objid ("0035c7a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAttributeSmDependency extends SmSingleDependency {
            @objid ("7ba198fb-c698-420e-9b98-7b51f47cc039")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAttribute;
            }

            @objid ("c7554f1b-6e09-45c4-87e2-a8cbd7aa4b9f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAttribute = value;
            }

            @objid ("acf068ce-58e1-4856-b83c-81df8c54884f")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00363e9a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedAssociationEndSmDependency extends SmSingleDependency {
            @objid ("8bb0e89c-d197-46cf-8b3b-b8551cc78ca4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd;
            }

            @objid ("b1fae58a-9628-4911-9045-e079375fc3f3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedAssociationEnd = value;
            }

            @objid ("82d750bc-035a-4653-a2ef-1522abb3e514")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("0036b4ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RepresentedInstanceSmDependency extends SmSingleDependency {
            @objid ("bb348821-7001-42cb-bca5-c8d29d5d9c38")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mRepresentedInstance;
            }

            @objid ("944ce4d6-f46e-4a36-a9b5-db8f3d2dd6cf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mRepresentedInstance = value;
            }

            @objid ("3d58ec7e-ff0c-4a1b-af6f-4e72538222a7")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.RepresentingItemDep();
            }

        }

        @objid ("00372d1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("14cbbf60-d925-4e96-acc5-ee2f55f24059")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mSourceOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mSourceOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("03596cc9-12af-4485-a8a5-d7a7d9498046")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mSourceOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mSourceOfDataAssociation;
            }

            @objid ("e49c388e-8eb7-4cb6-ad80-c05bc9668c26")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("0037939e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetOfDataAssociationSmDependency extends SmMultipleDependency {
            @objid ("13f51fc0-df6a-409a-a271-fa2b0ebd2864")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnItemAwareElementData)data).mTargetOfDataAssociation != null)? ((BpmnItemAwareElementData)data).mTargetOfDataAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("b5157d07-1b7f-497f-a63c-8902a6d2c723")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnItemAwareElementData) data).mTargetOfDataAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnItemAwareElementData) data).mTargetOfDataAssociation;
            }

            @objid ("7e92fa3f-7267-4a7e-943f-64859ea89446")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("0037f974-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("0c680d3f-14fd-48fc-a56d-958685f77f9a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mType;
            }

            @objid ("4458e49b-27fc-4b07-af26-8045a42d9eff")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mType = value;
            }

            @objid ("36271dc7-36b0-4ff0-89c9-31bdcdb83c44")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnItemAwareRefsDep();
            }

        }

        @objid ("00387444-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("c35f2cf6-50b6-46b1-be2e-d55459ea17c9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnItemAwareElementData) data).mInState;
            }

            @objid ("36d3a80b-df0e-4378-8036-060ffbd98e6a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnItemAwareElementData) data).mInState = value;
            }

            @objid ("cb77bf1c-bd57-490c-9684-52d5220f168c")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnItemDep();
            }

        }

    }

}
