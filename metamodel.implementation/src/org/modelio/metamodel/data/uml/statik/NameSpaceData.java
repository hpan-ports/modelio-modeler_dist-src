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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelTreeData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.data.uml.statik.GeneralizationData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.data.uml.statik.InterfaceRealizationData;
import org.modelio.metamodel.data.uml.statik.NamespaceUseData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.NameSpaceImpl;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.VisibilityMode;
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

@objid ("0011d8de-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NameSpace.class, factory=NameSpaceData.Metadata.ObjectFactory.class)
public abstract class NameSpaceData extends ModelTreeData {
    @objid ("f869d404-fb93-44f6-bbef-9f9b18e0244a")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("89178e22-7bb3-492e-8ce0-6a28c69e81a2")
    @SmaMetaAttribute(metaName="IsLeaf", type=Boolean.class, smAttributeClass=Metadata.IsLeafSmAttribute.class)
     Object mIsLeaf = false;

    @objid ("2c4719b9-dd83-4867-abe3-76bcb8935c77")
    @SmaMetaAttribute(metaName="IsRoot", type=Boolean.class, smAttributeClass=Metadata.IsRootSmAttribute.class)
     Object mIsRoot = false;

    @objid ("38d3d070-151e-43f6-9eaa-f1ae4aabc01c")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("50dfd65e-653b-4f09-96c4-3d785eff34ae")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.ParentSmDependency.class, component = true)
     List<SmObjectImpl> mParent = null;

    @objid ("46b7d782-c79d-448c-bde8-f867691826aa")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("526d1f3a-e7da-49cf-92ca-cab4b7400253")
    @SmaMetaAssociation(metaName="Representing", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mRepresenting = null;

    @objid ("0dca18fa-ce0a-40f5-8e40-874113e69aae")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("639f3c5c-d48e-4378-a398-e0629112b298")
    @SmaMetaAssociation(metaName="Received", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mReceived = null;

    @objid ("5ad64456-1f40-4079-b3ed-12b0b768ed4b")
    @SmaMetaAssociation(metaName="UsedNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UsedNsuSmDependency.class)
     List<SmObjectImpl> mUsedNsu = null;

    @objid ("32178331-f278-4bbc-8333-7372a4992780")
    @SmaMetaAssociation(metaName="OwnedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedInformationFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedInformationFlow = null;

    @objid ("d85c0c99-395b-4086-bfe6-97549cf27397")
    @SmaMetaAssociation(metaName="Importing", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.ImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mImporting = null;

    @objid ("0fd65e17-3ece-4b30-a5fa-93eab6c3137d")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mSent = null;

    @objid ("5729aa3d-42c6-4638-8715-2ad7c7cdd778")
    @SmaMetaAssociation(metaName="OwnedDataFlow", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDataFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDataFlow = null;

    @objid ("8b226a81-6968-46ff-8dc0-80a32cd5485c")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("e77049b1-8009-4d8c-ba12-5f76b48635b7")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("c0510c2b-bb57-4451-90d1-9f7a46cd89d0")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("64947ab2-d39e-4d97-aac8-a364c134d675")
    @SmaMetaAssociation(metaName="Specialization", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.SpecializationSmDependency.class, istodelete = true)
     List<SmObjectImpl> mSpecialization = null;

    @objid ("6b2c3119-b835-46f5-b91c-4574be24f59e")
    @SmaMetaAssociation(metaName="Realized", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedSmDependency.class, component = true)
     List<SmObjectImpl> mRealized = null;

    @objid ("bb9aa464-f210-436e-bd6d-2f829d43fdf9")
    @SmaMetaAssociation(metaName="Declared", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.DeclaredSmDependency.class, component = true)
     List<SmObjectImpl> mDeclared = null;

    @objid ("bdd7cfbb-1462-4532-8164-2cedb72749db")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("7063eeae-89ab-436b-ba6a-6f8367e88921")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("c833d7c9-a55f-4f93-bacf-3d2e2b6ed44b")
    @SmaMetaAssociation(metaName="UserNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UserNsuSmDependency.class)
     List<SmObjectImpl> mUserNsu = null;

    @objid ("ca339552-2fc0-4b43-b86b-5836201dd855")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00948996-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("beedfc40-b004-4559-a936-4538566c87ae")
        private static SmClass smClass = null;

        @objid ("a0d505f1-c573-465c-a734-8d66a70d66fc")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("5a3f9f66-a033-4574-8807-17e05e8cfdd9")
        private static SmAttribute IsLeafAtt = null;

        @objid ("0f16644d-3498-4331-8cf0-7fbbde20e582")
        private static SmAttribute IsRootAtt = null;

        @objid ("d2d9df8b-33ea-4de2-bbf0-a816ddc9e0fc")
        private static SmAttribute VisibilityAtt = null;

        @objid ("ff073aa5-06fb-4d08-a29a-d28824fd14f0")
        private static SmDependency ParentDep = null;

        @objid ("42abb069-ce1b-4da5-a51f-5c63191dfc25")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("000a4ae5-b0c6-4362-abd3-75d2f8896cb7")
        private static SmDependency RepresentingDep = null;

        @objid ("55b8487e-a0da-4da9-876b-d9e0b42830db")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("ef38e3a7-7138-489e-9953-f64ca03a2a6c")
        private static SmDependency ReceivedDep = null;

        @objid ("305fedbd-5899-47d2-9a4b-4b9d8c38bbd9")
        private static SmDependency UsedNsuDep = null;

        @objid ("ceb1559c-3a98-4d68-8697-8667c4374a44")
        private static SmDependency OwnedInformationFlowDep = null;

        @objid ("e5d3cf99-6f25-4dc0-9b03-52bc209d3e1e")
        private static SmDependency ImportingDep = null;

        @objid ("7cdc7240-ea92-4433-a1ea-ef6937f88c60")
        private static SmDependency SentDep = null;

        @objid ("590f51b9-e916-4c90-86dd-07dbf26617b5")
        private static SmDependency OwnedDataFlowDep = null;

        @objid ("a1bbab09-2805-4a1c-8d7d-a05799121df7")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("1df89f62-4569-43bf-8137-71457dc9ae7f")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("da2df58c-411c-4fe1-9349-a0abe7893d82")
        private static SmDependency TemplateDep = null;

        @objid ("441e3b7c-b63e-4aab-8cef-ce39f9c92b26")
        private static SmDependency SpecializationDep = null;

        @objid ("c533dd63-da50-45e7-a996-03251402adad")
        private static SmDependency RealizedDep = null;

        @objid ("be26bf1a-a9ef-4c1f-a028-c0e2ef97f851")
        private static SmDependency DeclaredDep = null;

        @objid ("36dc74a1-c7db-496a-b5c0-7ccf46f1e4e4")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("a6389629-b522-4a28-8436-281dfa882b4e")
        private static SmDependency OwnedImportDep = null;

        @objid ("660bb2f5-8868-43db-ad40-3f473fa53fc9")
        private static SmDependency UserNsuDep = null;

        @objid ("3ecf7088-9843-4e3e-b7dc-22ecb93ded5c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NameSpaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c17e7d48-2e78-458d-854d-01838320b6e4")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("fac0d16f-a707-46a7-a94c-400319e275ea")
        public static SmAttribute IsLeafAtt() {
            if (IsLeafAtt == null) {
            	IsLeafAtt = classof().getAttributeDef("IsLeaf");
            }
            return IsLeafAtt;
        }

        @objid ("53615ffd-b626-4fb3-b0a5-aa69c889ba76")
        public static SmAttribute IsRootAtt() {
            if (IsRootAtt == null) {
            	IsRootAtt = classof().getAttributeDef("IsRoot");
            }
            return IsRootAtt;
        }

        @objid ("c6f9ffe4-b8c7-4631-9716-7fd5b8bef01d")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("b4ddc1b8-7b0e-47ce-8526-0566a0ef9c43")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("48667865-1853-48ce-b872-e50fa5175e32")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("0a9d473c-3514-4f88-9b0c-2697b8a9b9a3")
        public static SmDependency RepresentingDep() {
            if (RepresentingDep == null) {
            	RepresentingDep = classof().getDependencyDef("Representing");
            }
            return RepresentingDep;
        }

        @objid ("75fd2591-cd67-45e0-84f4-d30e09a6408a")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("74918655-5b6c-443e-a666-12329dd74b97")
        public static SmDependency ReceivedDep() {
            if (ReceivedDep == null) {
            	ReceivedDep = classof().getDependencyDef("Received");
            }
            return ReceivedDep;
        }

        @objid ("dfa93689-1b7e-457d-8c15-eb5cc7b39a71")
        public static SmDependency UsedNsuDep() {
            if (UsedNsuDep == null) {
            	UsedNsuDep = classof().getDependencyDef("UsedNsu");
            }
            return UsedNsuDep;
        }

        @objid ("911dba62-871b-4466-bdb2-719ee100bb61")
        public static SmDependency OwnedInformationFlowDep() {
            if (OwnedInformationFlowDep == null) {
            	OwnedInformationFlowDep = classof().getDependencyDef("OwnedInformationFlow");
            }
            return OwnedInformationFlowDep;
        }

        @objid ("18138327-1f4f-4332-8918-d417fcc9e161")
        public static SmDependency ImportingDep() {
            if (ImportingDep == null) {
            	ImportingDep = classof().getDependencyDef("Importing");
            }
            return ImportingDep;
        }

        @objid ("c04b17d5-3e2e-45b8-b7d2-3669dbbe40c7")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("c3eae6c4-a054-49e1-983b-e0a753836480")
        public static SmDependency OwnedDataFlowDep() {
            if (OwnedDataFlowDep == null) {
            	OwnedDataFlowDep = classof().getDependencyDef("OwnedDataFlow");
            }
            return OwnedDataFlowDep;
        }

        @objid ("105db53f-d0ab-4a8f-ac57-b0c5476c726a")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("be1da1e2-6a06-4cc5-ab82-a37b61dd329c")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("be8bd033-4d4e-49bc-9ae8-1c8e1e01acff")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("a973c4e6-dacb-4ed4-9c30-cf72f5b01ab8")
        public static SmDependency SpecializationDep() {
            if (SpecializationDep == null) {
            	SpecializationDep = classof().getDependencyDef("Specialization");
            }
            return SpecializationDep;
        }

        @objid ("4ee9492d-7499-40c2-ae58-d9c7a49a43e8")
        public static SmDependency RealizedDep() {
            if (RealizedDep == null) {
            	RealizedDep = classof().getDependencyDef("Realized");
            }
            return RealizedDep;
        }

        @objid ("d68d2b73-ab18-4e94-92ea-0a1f0dc1091a")
        public static SmDependency DeclaredDep() {
            if (DeclaredDep == null) {
            	DeclaredDep = classof().getDependencyDef("Declared");
            }
            return DeclaredDep;
        }

        @objid ("c05d2f42-1d4d-45fd-99be-e63445e3f2cb")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("ac67ae0b-d807-44e3-8a12-8313c20e9bca")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("2c3e91e2-f78d-4313-9a62-fc58f64b7596")
        public static SmDependency UserNsuDep() {
            if (UserNsuDep == null) {
            	UserNsuDep = classof().getDependencyDef("UserNsu");
            }
            return UserNsuDep;
        }

        @objid ("7848f7bc-810d-4d76-9942-7a2b44ea7439")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("8112511e-3e5b-484d-ad4f-e485af33bb31")
        public static SmDependency getSpecializationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SpecializationDep;
        }

        @objid ("cf95fc7b-06af-41e9-8cd2-c2bb91692560")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("44229b77-b313-43a4-baab-66a2fc673d94")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("e832b565-2975-43cb-b055-e246a0f96859")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("e85b3f44-90e6-45b9-890e-83367cf4e934")
        public static SmDependency getUserNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserNsuDep;
        }

        @objid ("120cb9e6-8d04-4c5d-9b01-019be2d33a5b")
        public static SmDependency getReceivedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedDep;
        }

        @objid ("b53b5f2a-197c-44d9-a4ef-773500fd1d03")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("b8dddd77-78f9-4940-a9e1-23c74f97baf8")
        public static SmAttribute getIsLeafAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsLeafAtt;
        }

        @objid ("c8f8ac2c-bb19-4df2-adc4-b9392a12b096")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8c2f3054-e318-4875-bfef-87d2ebcac0cb")
        public static SmAttribute getIsRootAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRootAtt;
        }

        @objid ("9f218cf6-1079-4cc0-82c5-1e759b6461d4")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("4e496945-d0b9-43a8-8c25-2c3597fd6638")
        public static SmDependency getRepresentingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingDep;
        }

        @objid ("9845497b-6728-47a2-bf48-ff23ab817d36")
        public static SmDependency getDeclaredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeclaredDep;
        }

        @objid ("6f0e29d9-bb9f-400c-bf8a-abbf4ff447d3")
        public static SmDependency getImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingDep;
        }

        @objid ("4e93a09a-e72e-4afe-b718-1e4d15282603")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("c888fba3-bfea-445c-939b-c6eb7fe51b27")
        public static SmDependency getOwnedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedInformationFlowDep;
        }

        @objid ("00cf3743-7f50-4727-8780-1773653b3c47")
        public static SmDependency getRealizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedDep;
        }

        @objid ("27d0c9ff-087e-42c3-a494-1655fca214e8")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("fb900290-818d-41d8-b6fd-14beccaf974d")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("f87179a9-67bd-466c-890c-43e1c5f295c9")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("8ff44755-93bf-47e2-8a78-fc151748a1a3")
        public static SmDependency getUsedNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedNsuDep;
        }

        @objid ("c6c270be-da31-4cbd-b1dd-f0f3114a628f")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("44c181db-8852-404e-97c9-95450d1b11ef")
        public static SmDependency getOwnedDataFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDataFlowDep;
        }

        @objid ("0094c9ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7b35e634-4453-49a0-8421-540e0c8a9866")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("eeea399b-03b1-4825-9d8c-190999e9a61f")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00952bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("b7398f8a-141a-410a-8d30-6692bf4395d9")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsAbstract;
            }

            @objid ("7a09b952-224e-4beb-a3f1-f7e31e1ad5fe")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsAbstract = value;
            }

        }

        @objid ("00958c88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsLeafSmAttribute extends SmAttribute {
            @objid ("91e1e327-0f59-4dd0-b307-e8fe09916a3d")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsLeaf;
            }

            @objid ("1dcfa965-fc96-427d-b43d-2b9116e40269")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsLeaf = value;
            }

        }

        @objid ("0095ece6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRootSmAttribute extends SmAttribute {
            @objid ("248d9ff5-c25c-420b-9423-41a1e795d8ba")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsRoot;
            }

            @objid ("a0b2a0e3-507e-4db2-8ab1-b65212702623")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsRoot = value;
            }

        }

        @objid ("00964fb0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("cfc048ae-cfe2-4a9d-bfac-0377fcea1116")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mVisibility;
            }

            @objid ("c25cebed-51a7-44a0-9245-c4c325505428")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mVisibility = value;
            }

        }

        @objid ("0096b702-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("7e60e861-4bec-4cae-9520-79cfd2d3c513")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedCollaborationUse != null)? ((NameSpaceData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("bde76641-9273-47fa-b7cf-cced1f731c4a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedCollaborationUse;
            }

            @objid ("14868d87-90dd-4c75-8ba6-6d9f802656e0")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.NRepresentedDep();
            }

        }

        @objid ("00971efe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceivedSmDependency extends SmMultipleDependency {
            @objid ("8844bb44-b364-4b42-a6ba-b0e66ad69f41")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mReceived != null)? ((NameSpaceData)data).mReceived:SmMultipleDependency.EMPTY;
            }

            @objid ("e5782944-c43c-4e6b-a124-3573742dea54")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mReceived = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mReceived;
            }

            @objid ("638818f4-dfb9-4023-8e50-eab15ad01aed")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.DestinationDep();
            }

        }

        @objid ("009783ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("4506fedc-8354-4a92-bc6c-f5efa3a4a65b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSent != null)? ((NameSpaceData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("c0fb61f9-3053-4b97-aa05-e330c099f6ee")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSent;
            }

            @objid ("a5d71a1c-2119-4fa4-9e8c-b113b9517264")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OriginDep();
            }

        }

        @objid ("0097e8b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedDataFlowSmDependency extends SmMultipleDependency {
            @objid ("67eb4236-9c05-4a05-b811-c973ddbe498e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedDataFlow != null)? ((NameSpaceData)data).mOwnedDataFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("79328efe-b131-4bdc-b5f2-8de2e8058e98")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedDataFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedDataFlow;
            }

            @objid ("faea3f81-d3a2-46cb-9d1a-9825d838133f")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OwnerDep();
            }

        }

        @objid ("00984de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingSmDependency extends SmMultipleDependency {
            @objid ("0e93a655-5499-40e4-8d0e-0d48b994493b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mImporting != null)? ((NameSpaceData)data).mImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("436c5a34-60ae-4e97-95c9-61fe69c5442d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mImporting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mImporting;
            }

            @objid ("87b7bd4f-aacd-4614-814b-caf4d1a707cc")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportedElementDep();
            }

        }

        @objid ("0000df20-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("536d7bb3-d349-490f-ba4c-b62a9d97609f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedImport != null)? ((NameSpaceData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("d9fb0e32-59c5-4256-9f2c-46535565471b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedImport;
            }

            @objid ("4e06c271-22c5-4049-a794-997fecdf7109")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("000157d4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SpecializationSmDependency extends SmMultipleDependency {
            @objid ("455aaa6a-75bc-40fe-8cbb-27b02b8e7ac6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSpecialization != null)? ((NameSpaceData)data).mSpecialization:SmMultipleDependency.EMPTY;
            }

            @objid ("67c69e19-066a-4d4c-8653-9ccd7e30c1eb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSpecialization = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSpecialization;
            }

            @objid ("8ce68adb-419a-4595-b8fe-6ab4f4d75e2b")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SuperTypeDep();
            }

        }

        @objid ("0001c052-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmMultipleDependency {
            @objid ("641e1156-b9ef-4cc5-a4a2-f62f394ce2f3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mParent != null)? ((NameSpaceData)data).mParent:SmMultipleDependency.EMPTY;
            }

            @objid ("b32ffb3e-623c-4e38-8d98-e72d0d9524d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mParent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mParent;
            }

            @objid ("68736a35-e561-4e35-a3b6-8adb39d17be2")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SubTypeDep();
            }

        }

        @objid ("000228d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentingSmDependency extends SmMultipleDependency {
            @objid ("ecdbf167-d61d-4acc-8f86-cdfc37b89f71")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRepresenting != null)? ((NameSpaceData)data).mRepresenting:SmMultipleDependency.EMPTY;
            }

            @objid ("5c03bbdc-766e-4f46-8f50-2203d12a2a6e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRepresenting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRepresenting;
            }

            @objid ("792610af-984b-45ae-83df-a52bf025c2b9")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.BaseDep();
            }

        }

        @objid ("00029216-c4c6-1fd8-97fe-001ec947cd2a")
        public static class DeclaredSmDependency extends SmMultipleDependency {
            @objid ("03508a75-8d66-4a9e-b181-f0f1f8feae4f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mDeclared != null)? ((NameSpaceData)data).mDeclared:SmMultipleDependency.EMPTY;
            }

            @objid ("bf6950d8-f21e-48af-bcc3-e2e403e685c1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mDeclared = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mDeclared;
            }

            @objid ("11a2ec77-36ab-49e5-b4c6-c9b094ed26b5")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnerDep();
            }

        }

        @objid ("0002fb2a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("dc69767c-011f-4c49-9a62-ac09a7fb07ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedBehavior != null)? ((NameSpaceData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("1dd3ea5e-9936-44d4-802d-34b6c24a3e90")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedBehavior;
            }

            @objid ("cbda5a8c-948e-4063-849c-c05477d7f41c")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerDep();
            }

        }

        @objid ("00036592-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RealizedSmDependency extends SmMultipleDependency {
            @objid ("75b84c0a-7104-4cdd-8594-5bb8037cbc24")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRealized != null)? ((NameSpaceData)data).mRealized:SmMultipleDependency.EMPTY;
            }

            @objid ("481a65c0-93c9-433c-88b9-738a9da6a8e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRealized = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRealized;
            }

            @objid ("8d653f00-8254-46ee-ba11-4372756a80c8")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementerDep();
            }

        }

        @objid ("0003d022-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("ec14230a-0484-4d60-8d0c-a750d9ce2aa5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplate != null)? ((NameSpaceData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("459d1e80-fca0-45a9-b727-dca0f8cb2ef8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplate;
            }

            @objid ("68ee8525-658b-44a3-9f4d-6005fe3e3fc6")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedDep();
            }

        }

        @objid ("00043ac6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("08824dc3-1300-421f-89f6-40cb822e6c4a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mInstanciatingBinding != null)? ((NameSpaceData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("25b676fe-d7e9-40b5-abca-dd09934fc4bd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mInstanciatingBinding;
            }

            @objid ("2cb8da07-69c1-4911-a565-0d2452e658c5")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateDep();
            }

        }

        @objid ("0004a650-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("2c6367e2-7f2d-467b-8bbf-ba63d7442df4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedPackageImport != null)? ((NameSpaceData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("91d240d0-7fc8-4152-8452-94d376f116cb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedPackageImport;
            }

            @objid ("5e615f12-8954-408a-a1b1-036e787c9c34")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("00051310-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("60776dad-717e-4ed1-bf3e-a1b5f926525c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplateInstanciation != null)? ((NameSpaceData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("e6a9119b-b923-4619-9faa-3e9903f2c8e5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplateInstanciation;
            }

            @objid ("c674218b-d14e-4101-bc6b-45bc57777928")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundElementDep();
            }

        }

        @objid ("00057f80-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UserNsuSmDependency extends SmMultipleDependency {
            @objid ("1d104cc8-870d-4b76-99ef-8197c6e1eaa0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUserNsu != null)? ((NameSpaceData)data).mUserNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("0e3dd3b5-1290-4f8f-9a7c-8a2c8c405fc4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUserNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUserNsu;
            }

            @objid ("6d04a9f2-12ab-4b49-b134-21fc1d97179c")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UsedDep();
            }

        }

        @objid ("0005ecd6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UsedNsuSmDependency extends SmMultipleDependency {
            @objid ("dcb59264-89c8-4092-8934-59edb60bd2a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUsedNsu != null)? ((NameSpaceData)data).mUsedNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("24cee543-00c6-4ebd-87aa-1e2ace71a00d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUsedNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUsedNsu;
            }

            @objid ("460552c0-5a8e-4027-8ae5-c3ef86c94c54")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UserDep();
            }

        }

        @objid ("00065af4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("8e4c951f-267e-49c3-bba9-504c31f5e8d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedInformationFlow != null)? ((NameSpaceData)data).mOwnedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("a0b6e972-10ab-4761-aee6-85c30dc20446")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedInformationFlow;
            }

            @objid ("b816ff85-f566-4e0e-ab13-5f8b8da6b7f0")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.OwnerDep();
            }

        }

    }

}
