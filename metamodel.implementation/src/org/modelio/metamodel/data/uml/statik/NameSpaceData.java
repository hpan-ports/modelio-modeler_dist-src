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
    @objid ("5a516425-ab8d-4d32-b7e5-1454fea67e0d")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("702370ee-d743-42a1-b5ee-a95e5af0f330")
    @SmaMetaAttribute(metaName="IsLeaf", type=Boolean.class, smAttributeClass=Metadata.IsLeafSmAttribute.class)
     Object mIsLeaf = false;

    @objid ("38f7f8bf-5c1d-4175-a9f5-d68a4a1e7cb4")
    @SmaMetaAttribute(metaName="IsRoot", type=Boolean.class, smAttributeClass=Metadata.IsRootSmAttribute.class)
     Object mIsRoot = false;

    @objid ("3cfdb8c1-0dfc-4944-93ba-8f381b30db2e")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("93fd3738-5157-4af6-b571-e9f0d6c614bf")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.ParentSmDependency.class, component = true)
     List<SmObjectImpl> mParent = null;

    @objid ("1825ed23-a31d-489c-b223-d5cc1233d60a")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("0dde6573-fb24-49c9-b5d6-a40cf41a2e20")
    @SmaMetaAssociation(metaName="Representing", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mRepresenting = null;

    @objid ("cd5555c1-0eaa-41b8-9b84-ba258be9b704")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("8743e672-c5be-4fc2-8281-5c77365f53ce")
    @SmaMetaAssociation(metaName="Received", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mReceived = null;

    @objid ("f66f5c38-3261-47c8-8058-3ba71e262cd3")
    @SmaMetaAssociation(metaName="UsedNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UsedNsuSmDependency.class)
     List<SmObjectImpl> mUsedNsu = null;

    @objid ("2fd72c9e-583f-4695-a98a-8a5d7db31c98")
    @SmaMetaAssociation(metaName="OwnedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedInformationFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedInformationFlow = null;

    @objid ("2ef90f95-e7c6-4237-bd8c-3fe58c1752e6")
    @SmaMetaAssociation(metaName="Importing", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.ImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mImporting = null;

    @objid ("94337f18-f9f5-407b-b307-5f9d6a1d9557")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mSent = null;

    @objid ("99072e3c-3f68-46af-ae07-4e339da992a7")
    @SmaMetaAssociation(metaName="OwnedDataFlow", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDataFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDataFlow = null;

    @objid ("2dddabc9-7ad3-40dc-bfe7-717edfe8e688")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("bb11c265-53c3-4429-9056-f0149c61899d")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("cc01dabd-42a3-4fa3-b23d-d4273cee1aa7")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("4f60ff00-acbe-4c87-b864-345876559ec7")
    @SmaMetaAssociation(metaName="Specialization", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.SpecializationSmDependency.class, istodelete = true)
     List<SmObjectImpl> mSpecialization = null;

    @objid ("2fef24b3-8673-475d-aa76-57f4033b7507")
    @SmaMetaAssociation(metaName="Realized", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedSmDependency.class, component = true)
     List<SmObjectImpl> mRealized = null;

    @objid ("e85c84b3-c0e9-480b-af32-bea389723537")
    @SmaMetaAssociation(metaName="Declared", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.DeclaredSmDependency.class, component = true)
     List<SmObjectImpl> mDeclared = null;

    @objid ("4843505b-9085-4f68-9cb4-653e88ee0598")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("a75a455b-63c1-4c02-8a38-11c72e3078c3")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("7e5fe597-2733-4878-8e78-1487fac57869")
    @SmaMetaAssociation(metaName="UserNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UserNsuSmDependency.class)
     List<SmObjectImpl> mUserNsu = null;

    @objid ("ea05d82d-dd9d-4210-b49e-16ad106b32f5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00948996-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ba92b8dd-6c52-444c-8f4b-e0fa5bd20a00")
        private static SmClass smClass = null;

        @objid ("f8f3f40d-b404-46a4-b8a3-df119cd64fa0")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("ad1ab521-cb11-42b2-99ec-8ac4d8c049a9")
        private static SmAttribute IsLeafAtt = null;

        @objid ("9c30528a-7111-4c32-b492-3f637f4d9009")
        private static SmAttribute IsRootAtt = null;

        @objid ("26427341-b6d3-4a01-9338-2970db753d10")
        private static SmAttribute VisibilityAtt = null;

        @objid ("809fc854-788a-4e37-ac52-63cb756baaff")
        private static SmDependency ParentDep = null;

        @objid ("6f9506d6-4250-416c-86bb-3e2e43d94889")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("da55ec8c-48f7-4a9d-a2e6-a59d659a51c9")
        private static SmDependency RepresentingDep = null;

        @objid ("866bf3de-1fc7-4615-ad46-693c635abbf7")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("3b9770e4-2ad0-423f-bfde-1d1910810046")
        private static SmDependency ReceivedDep = null;

        @objid ("6edae2d6-5ae1-4447-bb73-1701a9914499")
        private static SmDependency UsedNsuDep = null;

        @objid ("ea5f117d-f60f-4afd-a276-c8bf7ff449a4")
        private static SmDependency OwnedInformationFlowDep = null;

        @objid ("30ed95bc-796d-4413-8bca-88fda743bef6")
        private static SmDependency ImportingDep = null;

        @objid ("06dae4e1-9cbb-49ea-bef8-53bd553370e0")
        private static SmDependency SentDep = null;

        @objid ("52323f34-494c-41ac-962f-9dd52dcecb17")
        private static SmDependency OwnedDataFlowDep = null;

        @objid ("f207d9b3-77ce-432f-b7b4-44b26feef944")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("a2c7e40d-daec-4550-ad0a-3832bc53d2b3")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("d38f6326-4747-4b0d-84d1-ec73cadfc534")
        private static SmDependency TemplateDep = null;

        @objid ("f52b7df1-eced-4664-ade7-45dd1fc7edc7")
        private static SmDependency SpecializationDep = null;

        @objid ("17bc818b-da39-4936-a7f5-c92c7d07e972")
        private static SmDependency RealizedDep = null;

        @objid ("a9aad56b-574b-45df-8b3c-b26dad029c95")
        private static SmDependency DeclaredDep = null;

        @objid ("ec2beb14-041e-4d20-8fad-c2504fa05175")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("bbf18906-9625-4bb2-8015-d33b02e91c03")
        private static SmDependency OwnedImportDep = null;

        @objid ("c09849ad-78cb-4738-ab40-c3917afcbe35")
        private static SmDependency UserNsuDep = null;

        @objid ("e959305c-ea67-4931-b7d8-f6d69c6ff97a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NameSpaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2c30938c-871e-4589-8c17-98213f9b63ab")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("3f488f73-f6bb-4c6b-9444-5d546b374e1f")
        public static SmAttribute IsLeafAtt() {
            if (IsLeafAtt == null) {
            	IsLeafAtt = classof().getAttributeDef("IsLeaf");
            }
            return IsLeafAtt;
        }

        @objid ("b1678e5a-7566-4038-ba7e-bf797d8c31c0")
        public static SmAttribute IsRootAtt() {
            if (IsRootAtt == null) {
            	IsRootAtt = classof().getAttributeDef("IsRoot");
            }
            return IsRootAtt;
        }

        @objid ("aa1b0944-4b0c-462b-8f19-91822ba37fa4")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("f46054b7-18fa-4222-a049-b26e55e5906e")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("c47a4b59-141a-4f76-8fc7-4cf6050eb093")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("4d2beca1-8e8f-470e-b97b-26e13d2584e8")
        public static SmDependency RepresentingDep() {
            if (RepresentingDep == null) {
            	RepresentingDep = classof().getDependencyDef("Representing");
            }
            return RepresentingDep;
        }

        @objid ("fb36f8de-fa04-48d6-923e-d844e4daab2e")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("0b25dad4-b86c-4ede-b1e4-1189e7be18ec")
        public static SmDependency ReceivedDep() {
            if (ReceivedDep == null) {
            	ReceivedDep = classof().getDependencyDef("Received");
            }
            return ReceivedDep;
        }

        @objid ("e059c55c-81fd-4961-80ff-611104ce6380")
        public static SmDependency UsedNsuDep() {
            if (UsedNsuDep == null) {
            	UsedNsuDep = classof().getDependencyDef("UsedNsu");
            }
            return UsedNsuDep;
        }

        @objid ("1664d642-6163-4e63-a48e-c044ce3930db")
        public static SmDependency OwnedInformationFlowDep() {
            if (OwnedInformationFlowDep == null) {
            	OwnedInformationFlowDep = classof().getDependencyDef("OwnedInformationFlow");
            }
            return OwnedInformationFlowDep;
        }

        @objid ("70d0bc39-691c-48ef-b586-9c03248dce94")
        public static SmDependency ImportingDep() {
            if (ImportingDep == null) {
            	ImportingDep = classof().getDependencyDef("Importing");
            }
            return ImportingDep;
        }

        @objid ("816a5b83-9248-4224-a31d-1c570989c206")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("101e708b-0efb-40dc-8ca6-a59bbe962704")
        public static SmDependency OwnedDataFlowDep() {
            if (OwnedDataFlowDep == null) {
            	OwnedDataFlowDep = classof().getDependencyDef("OwnedDataFlow");
            }
            return OwnedDataFlowDep;
        }

        @objid ("67eb40c1-6b81-48f8-8579-a3353e06d55b")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("67b9e865-8041-45ab-a17d-ce61f6be9800")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("181d7335-001b-4b9b-b8c7-ff5ff193eeca")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("6aac9b8f-02c0-4611-b9ea-3059ec428a85")
        public static SmDependency SpecializationDep() {
            if (SpecializationDep == null) {
            	SpecializationDep = classof().getDependencyDef("Specialization");
            }
            return SpecializationDep;
        }

        @objid ("0c150182-1bab-4960-ac85-2a6e5490c194")
        public static SmDependency RealizedDep() {
            if (RealizedDep == null) {
            	RealizedDep = classof().getDependencyDef("Realized");
            }
            return RealizedDep;
        }

        @objid ("eca0818d-e1ee-46ff-a368-a4d5d4621f9b")
        public static SmDependency DeclaredDep() {
            if (DeclaredDep == null) {
            	DeclaredDep = classof().getDependencyDef("Declared");
            }
            return DeclaredDep;
        }

        @objid ("dbfccb79-14c0-4458-b492-1ce86261f193")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("32eebd7c-2584-416a-9073-8ac26c404385")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("36b5bd40-792b-47a4-84fa-ad899e014647")
        public static SmDependency UserNsuDep() {
            if (UserNsuDep == null) {
            	UserNsuDep = classof().getDependencyDef("UserNsu");
            }
            return UserNsuDep;
        }

        @objid ("5c98c4aa-0b49-40a1-a587-dd732672c610")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2df48e16-d074-4905-9dd1-0f28f3203108")
        public static SmDependency getRealizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedDep;
        }

        @objid ("06e5cebf-83d5-4545-9757-cdf021f9f061")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("029144f4-661c-47e6-a6a5-819d8f9cb313")
        public static SmDependency getSpecializationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SpecializationDep;
        }

        @objid ("8af91c72-016e-4931-b7bd-62983dd37d04")
        public static SmDependency getRepresentingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingDep;
        }

        @objid ("1b2f5826-f4ca-484e-bc9a-e4de9c2ce716")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("ad237dfc-de00-4395-b495-4ef2fa864786")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("d21bf7f1-cfd6-4ee7-bbcb-47b0c4a6e80c")
        public static SmDependency getUsedNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedNsuDep;
        }

        @objid ("79087a0a-023f-4068-b92e-c8c2992e8dc5")
        public static SmDependency getDeclaredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeclaredDep;
        }

        @objid ("3abf837d-5fec-486f-a9d3-20a595164dd0")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("21ca0578-49b0-4ac7-b1a3-49415fdc2f7e")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("6f42d3db-d62a-4589-8580-dd30378ed932")
        public static SmAttribute getIsRootAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRootAtt;
        }

        @objid ("904f13f6-7009-411b-8d6d-9419d05c6f4d")
        public static SmDependency getUserNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserNsuDep;
        }

        @objid ("6ff2cfd5-f94e-496b-a287-1554d09affa3")
        public static SmDependency getImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingDep;
        }

        @objid ("469b7f71-0282-42e1-9f24-36149449f72e")
        public static SmDependency getOwnedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedInformationFlowDep;
        }

        @objid ("f821578e-7af8-40f0-8252-497bb740377d")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("6612a5ba-2b43-4bcb-8738-d190abeaca4e")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("c846861a-fed2-474f-9b1f-edc437d979b5")
        public static SmDependency getReceivedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedDep;
        }

        @objid ("b36eb3d8-d6ae-496a-b75d-efb3b522b5f3")
        public static SmDependency getOwnedDataFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDataFlowDep;
        }

        @objid ("1464f27d-3b49-470c-8812-7ebd0e046db3")
        public static SmAttribute getIsLeafAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsLeafAtt;
        }

        @objid ("4d00e051-943e-4c08-9079-6b126f66af29")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("e309b580-e3b0-47a6-ac5e-1579ee88aa35")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("19e1180f-7439-4451-bd6b-6bd3a5068768")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("5cf8c049-aaef-47da-98ae-7e4de18c1278")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("0094c9ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a89dca4c-f597-448d-8b9b-f156a2a39e64")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("75da2c7b-3325-47c2-a521-60bdecacf1cb")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00952bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("fcd37644-c285-41bd-ae53-07df01d94213")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsAbstract;
            }

            @objid ("f97d1de1-da21-4362-a492-fed746581b97")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsAbstract = value;
            }

        }

        @objid ("00958c88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsLeafSmAttribute extends SmAttribute {
            @objid ("c467f7e7-cd6b-47f3-8eea-155e53b298fe")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsLeaf;
            }

            @objid ("a686887e-8be6-41f2-a106-b2dcc0adc5a3")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsLeaf = value;
            }

        }

        @objid ("0095ece6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRootSmAttribute extends SmAttribute {
            @objid ("ae32aa08-76f5-4aab-8cb7-7b9455935cb4")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsRoot;
            }

            @objid ("842de191-0c79-4a33-abdf-347ac134812e")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsRoot = value;
            }

        }

        @objid ("00964fb0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("31039048-98b8-4188-8ea7-8a4a9ab9f11c")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mVisibility;
            }

            @objid ("99ed9682-1638-47a3-a49f-096b3490ea50")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mVisibility = value;
            }

        }

        @objid ("0096b702-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("24a33ba3-f032-4a5f-876b-a7a021bedc45")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedCollaborationUse != null)? ((NameSpaceData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("11ac6231-89c8-4091-bdbf-e6b43c58c9fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedCollaborationUse;
            }

            @objid ("5509fdbe-f882-4c3f-8f80-d3db3ee9fff9")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.NRepresentedDep();
            }

        }

        @objid ("00971efe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceivedSmDependency extends SmMultipleDependency {
            @objid ("67020d7f-ae51-4432-8cfd-a39017481693")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mReceived != null)? ((NameSpaceData)data).mReceived:SmMultipleDependency.EMPTY;
            }

            @objid ("d266e9a6-35ab-4146-94d0-4b8c593f41fe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mReceived = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mReceived;
            }

            @objid ("2f5c3f92-617c-4692-9f7b-9794e601bb47")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.DestinationDep();
            }

        }

        @objid ("009783ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("dd85447a-4e89-4c80-953c-b3f706429d30")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSent != null)? ((NameSpaceData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("0e810d5d-150d-47c8-b5a5-745b2a2cc522")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSent;
            }

            @objid ("c8af8c4d-0161-4703-8b2d-8e3cf287a3d0")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OriginDep();
            }

        }

        @objid ("0097e8b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedDataFlowSmDependency extends SmMultipleDependency {
            @objid ("74d71378-762f-4b9b-9ad4-fbbc7ace5fd0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedDataFlow != null)? ((NameSpaceData)data).mOwnedDataFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("dfc2ec1c-c049-4441-a2eb-db7f75191898")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedDataFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedDataFlow;
            }

            @objid ("1af91973-dc5f-497a-9d86-c7dfb8ed88e3")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OwnerDep();
            }

        }

        @objid ("00984de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingSmDependency extends SmMultipleDependency {
            @objid ("da721068-ac5b-465c-bb52-972f10160481")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mImporting != null)? ((NameSpaceData)data).mImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("d5d26e93-18b1-462b-9375-1994f520de6e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mImporting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mImporting;
            }

            @objid ("93c10f59-c5d4-4e76-bfa1-c402b1cd441c")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportedElementDep();
            }

        }

        @objid ("0000df20-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("380c4973-e1d3-43a7-998f-3ccd5cf566bc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedImport != null)? ((NameSpaceData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("f496b68e-be38-4c6a-9a95-41023023e692")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedImport;
            }

            @objid ("93dddd1f-df51-48d2-8e05-f717a268b3aa")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("000157d4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SpecializationSmDependency extends SmMultipleDependency {
            @objid ("7742a2c2-8d3f-4dc9-a980-f97642c24962")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSpecialization != null)? ((NameSpaceData)data).mSpecialization:SmMultipleDependency.EMPTY;
            }

            @objid ("4de2c472-0a45-4c42-ae1a-26aff457df8a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSpecialization = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSpecialization;
            }

            @objid ("89eda7a1-0995-4c0c-92a5-97d1a0798708")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SuperTypeDep();
            }

        }

        @objid ("0001c052-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmMultipleDependency {
            @objid ("19ad5e9c-4e25-4ace-be9e-5bca85c67cef")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mParent != null)? ((NameSpaceData)data).mParent:SmMultipleDependency.EMPTY;
            }

            @objid ("3e5c4cbc-aec8-47b5-81bc-dd9a9bfe334d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mParent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mParent;
            }

            @objid ("21c76b13-1a01-413a-afcf-a796efe9ceb3")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SubTypeDep();
            }

        }

        @objid ("000228d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentingSmDependency extends SmMultipleDependency {
            @objid ("f836005e-5ba8-49a2-b247-09857039dbd0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRepresenting != null)? ((NameSpaceData)data).mRepresenting:SmMultipleDependency.EMPTY;
            }

            @objid ("fdd70b39-7b5b-4a3b-97b7-82d165550e28")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRepresenting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRepresenting;
            }

            @objid ("758fcdb8-d7b9-439c-bad5-d87531b2011a")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.BaseDep();
            }

        }

        @objid ("00029216-c4c6-1fd8-97fe-001ec947cd2a")
        public static class DeclaredSmDependency extends SmMultipleDependency {
            @objid ("d2ba1ece-9199-4b95-b47c-802ebd93d4e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mDeclared != null)? ((NameSpaceData)data).mDeclared:SmMultipleDependency.EMPTY;
            }

            @objid ("b02019d8-959d-423f-99f1-5e4a1d5b57da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mDeclared = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mDeclared;
            }

            @objid ("246e7eec-4cdd-4d72-9f3d-ef22495a320d")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnerDep();
            }

        }

        @objid ("0002fb2a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("71d5086b-6b26-45fa-81ba-ba4d1dd45506")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedBehavior != null)? ((NameSpaceData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("5bbf0456-efc2-4f7b-ae1f-6ac394b45392")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedBehavior;
            }

            @objid ("fe720f1a-a958-4bdf-bf6b-85f635657984")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerDep();
            }

        }

        @objid ("00036592-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RealizedSmDependency extends SmMultipleDependency {
            @objid ("c461cfce-56d3-4679-8c6e-ab6fd39af499")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRealized != null)? ((NameSpaceData)data).mRealized:SmMultipleDependency.EMPTY;
            }

            @objid ("8607bd9c-23da-4fbe-b7ff-f45a72b748ce")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRealized = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRealized;
            }

            @objid ("5416ef24-2496-4a3a-9234-7c28fe57ed77")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementerDep();
            }

        }

        @objid ("0003d022-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("d226df56-94b6-482a-a7ff-ad66d653549a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplate != null)? ((NameSpaceData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("87df8f35-f364-4ac1-8dec-4021c692176f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplate;
            }

            @objid ("60203604-2e1b-40f4-a86a-e90ef9dc40f5")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedDep();
            }

        }

        @objid ("00043ac6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("c499c4dd-be24-4559-8d7b-a2cf907d77fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mInstanciatingBinding != null)? ((NameSpaceData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("cba899be-5192-4b7d-8e03-1326ebf26728")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mInstanciatingBinding;
            }

            @objid ("6edb4a59-7720-4ec2-bc3d-b631276d2064")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateDep();
            }

        }

        @objid ("0004a650-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("cff81464-f893-45d2-a406-4bbd6e01b690")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedPackageImport != null)? ((NameSpaceData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("a1401194-7aa0-4118-a43b-796dd324331a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedPackageImport;
            }

            @objid ("db0c4e5d-149a-47c9-a282-8acfae1caea2")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("00051310-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("afed9001-cb02-4d19-954c-298e7724679a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplateInstanciation != null)? ((NameSpaceData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("3f054c4b-18ee-44a9-bcfa-685ce7b574a3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplateInstanciation;
            }

            @objid ("32df08cb-7511-46e2-ab2e-552157088f66")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundElementDep();
            }

        }

        @objid ("00057f80-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UserNsuSmDependency extends SmMultipleDependency {
            @objid ("3bb89448-c0ad-4bb5-9dbc-34ca004d47d2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUserNsu != null)? ((NameSpaceData)data).mUserNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("aadfa9b4-f30e-4a13-b87a-af12380f46cb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUserNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUserNsu;
            }

            @objid ("7035a762-cd8d-4ecc-90cd-6ba967cd8ca6")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UsedDep();
            }

        }

        @objid ("0005ecd6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UsedNsuSmDependency extends SmMultipleDependency {
            @objid ("66e66c1a-620b-4754-bff3-2b30e2876440")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUsedNsu != null)? ((NameSpaceData)data).mUsedNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("8e882842-e8a8-4f3a-b368-efb3d8ccebf2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUsedNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUsedNsu;
            }

            @objid ("6a6a6acd-c116-4738-ac93-613e655ef7ec")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UserDep();
            }

        }

        @objid ("00065af4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("bc42b707-f3a9-46a1-a154-3f06bd3985b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedInformationFlow != null)? ((NameSpaceData)data).mOwnedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("aa1dddca-7361-4217-9a0e-1a7ce6563b47")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedInformationFlow;
            }

            @objid ("a4e02f5a-0da2-4e3b-aa30-8d4cba65c55b")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.OwnerDep();
            }

        }

    }

}
