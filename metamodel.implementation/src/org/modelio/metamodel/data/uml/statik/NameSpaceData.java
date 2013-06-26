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
    @objid ("bcc9038b-66c0-4a67-bf3f-8e3122ed0cc1")
    @SmaMetaAttribute(metaName="IsAbstract", type=Boolean.class, smAttributeClass=Metadata.IsAbstractSmAttribute.class)
     Object mIsAbstract = false;

    @objid ("4673156a-6b79-453a-84f2-d8a4ec97ec43")
    @SmaMetaAttribute(metaName="IsLeaf", type=Boolean.class, smAttributeClass=Metadata.IsLeafSmAttribute.class)
     Object mIsLeaf = false;

    @objid ("0e85a6c4-eb52-441f-82ce-1b0eea442b86")
    @SmaMetaAttribute(metaName="IsRoot", type=Boolean.class, smAttributeClass=Metadata.IsRootSmAttribute.class)
     Object mIsRoot = false;

    @objid ("20394aca-9292-495b-9c9e-f1dba8a0a1b8")
    @SmaMetaAttribute(metaName="Visibility", type=VisibilityMode.class, smAttributeClass=Metadata.VisibilitySmAttribute.class)
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("1ce75d73-9fb6-491b-bd7b-58e5fa3e1ff2")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.ParentSmDependency.class, component = true)
     List<SmObjectImpl> mParent = null;

    @objid ("4ee07ba4-52b3-448c-b5d3-e87e0f875c3b")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("972bd433-e4a4-40c8-8983-055d354ec5f6")
    @SmaMetaAssociation(metaName="Representing", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mRepresenting = null;

    @objid ("2cf8ebb4-2ec9-4ff4-91e7-948a50a0678b")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("08178c94-8e68-493d-99c5-033477da502f")
    @SmaMetaAssociation(metaName="Received", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mReceived = null;

    @objid ("5f830719-1feb-4323-8ad5-66726004e4f9")
    @SmaMetaAssociation(metaName="UsedNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UsedNsuSmDependency.class)
     List<SmObjectImpl> mUsedNsu = null;

    @objid ("704b0dd3-4db7-4471-a315-c6c6a767d24f")
    @SmaMetaAssociation(metaName="OwnedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedInformationFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedInformationFlow = null;

    @objid ("5e32ce1b-a61f-45b5-8f5b-859e05fe32bf")
    @SmaMetaAssociation(metaName="Importing", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.ImportingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mImporting = null;

    @objid ("8363feee-904a-4846-8c6e-18598cbee0f1")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mSent = null;

    @objid ("86197e70-c80e-4a18-a80f-81d2d10daf41")
    @SmaMetaAssociation(metaName="OwnedDataFlow", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDataFlowSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDataFlow = null;

    @objid ("7be3fac0-39d8-4385-9f29-9dddc3040a25")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("d97c1221-d4f8-40d6-9d0b-7cd1f4b2f2d4")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("9f22ce58-7902-420d-bf65-d0c5a215b563")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("e30977d5-9d78-4a95-8603-b08466933978")
    @SmaMetaAssociation(metaName="Specialization", typeDataClass=GeneralizationData.class, min=0, max=-1, smAssociationClass=Metadata.SpecializationSmDependency.class, istodelete = true)
     List<SmObjectImpl> mSpecialization = null;

    @objid ("cc9776e1-b799-44f5-afa0-83e6a1b2bf02")
    @SmaMetaAssociation(metaName="Realized", typeDataClass=InterfaceRealizationData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedSmDependency.class, component = true)
     List<SmObjectImpl> mRealized = null;

    @objid ("cb4c58a7-e2bc-4fb4-9ec5-cac1a957a038")
    @SmaMetaAssociation(metaName="Declared", typeDataClass=InstanceData.class, min=0, max=-1, smAssociationClass=Metadata.DeclaredSmDependency.class, component = true)
     List<SmObjectImpl> mDeclared = null;

    @objid ("33893065-0718-4bec-a386-a566334c9e8a")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("d146f954-35de-4fa3-a470-b5ac6da83594")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("2f4b8498-59a4-424e-a2b6-7726833b6a13")
    @SmaMetaAssociation(metaName="UserNsu", typeDataClass=NamespaceUseData.class, min=0, max=-1, smAssociationClass=Metadata.UserNsuSmDependency.class)
     List<SmObjectImpl> mUserNsu = null;

    @objid ("4c438a94-a611-43b3-aa8c-58510b20cc75")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00948996-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f13de30a-d08c-4d4a-875c-27d5ab256033")
        private static SmClass smClass = null;

        @objid ("428a899c-277b-49c7-b4e4-fe72ff7337b5")
        private static SmAttribute IsAbstractAtt = null;

        @objid ("b641ccd7-3501-45c2-a658-08dcaa588304")
        private static SmAttribute IsLeafAtt = null;

        @objid ("262408cc-f9a3-416d-96fa-0109126cdb95")
        private static SmAttribute IsRootAtt = null;

        @objid ("18de96fe-f8a1-4aed-bd6d-df0086a9f9f7")
        private static SmAttribute VisibilityAtt = null;

        @objid ("92d1436a-4756-4aee-b892-686df3eba2d1")
        private static SmDependency ParentDep = null;

        @objid ("68cf2ae9-e586-4ff2-8adb-8400274bb0b5")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("3edbe1a5-5e1e-4575-95c4-5e38cba4aa1c")
        private static SmDependency RepresentingDep = null;

        @objid ("1add26a5-ac60-4c0f-8653-2baf663c4594")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("9f277731-647c-443a-94d0-d9e305667920")
        private static SmDependency ReceivedDep = null;

        @objid ("fc1b674f-d26a-429e-b60e-02e4aa8a0b44")
        private static SmDependency UsedNsuDep = null;

        @objid ("8b054d6d-507f-4a2e-828b-e007051322ca")
        private static SmDependency OwnedInformationFlowDep = null;

        @objid ("e3a612ad-d2c1-4493-9a86-194fb165eecc")
        private static SmDependency ImportingDep = null;

        @objid ("eab56a42-cc66-4615-930b-e9c4c5b69f7a")
        private static SmDependency SentDep = null;

        @objid ("97d48f78-d453-463b-87cc-64589181bcda")
        private static SmDependency OwnedDataFlowDep = null;

        @objid ("830e7c82-4cd4-4983-879e-4d859caa3119")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("c9e1a271-21dc-4575-b202-6804571d5b15")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("404260f3-9260-46ed-9ae5-9e631aa5e60a")
        private static SmDependency TemplateDep = null;

        @objid ("0418251c-d43e-49a0-a52e-dbc0b2734881")
        private static SmDependency SpecializationDep = null;

        @objid ("58bd337a-faa4-402f-b299-cf7ad22e97a2")
        private static SmDependency RealizedDep = null;

        @objid ("e3590801-33a4-43fb-b571-33e149e137dc")
        private static SmDependency DeclaredDep = null;

        @objid ("2fa6c718-f780-4dd9-b713-f359608438ed")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("fffe7040-4c00-4716-bd6b-03325f46d8a9")
        private static SmDependency OwnedImportDep = null;

        @objid ("30d808a3-e230-4c61-b96b-4d9b42765516")
        private static SmDependency UserNsuDep = null;

        @objid ("0388eb93-5879-4fca-bd8b-fd24a3c0774a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NameSpaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bbef775e-2dc1-493f-89d9-a7b630388f14")
        public static SmAttribute IsAbstractAtt() {
            if (IsAbstractAtt == null) {
            	IsAbstractAtt = classof().getAttributeDef("IsAbstract");
            }
            return IsAbstractAtt;
        }

        @objid ("a6fecf33-4d27-47a8-9957-ebc1158c8808")
        public static SmAttribute IsLeafAtt() {
            if (IsLeafAtt == null) {
            	IsLeafAtt = classof().getAttributeDef("IsLeaf");
            }
            return IsLeafAtt;
        }

        @objid ("29a8383a-53a5-4e0e-b210-026890af4128")
        public static SmAttribute IsRootAtt() {
            if (IsRootAtt == null) {
            	IsRootAtt = classof().getAttributeDef("IsRoot");
            }
            return IsRootAtt;
        }

        @objid ("0970a689-16bb-4418-bfb9-33aca8868449")
        public static SmAttribute VisibilityAtt() {
            if (VisibilityAtt == null) {
            	VisibilityAtt = classof().getAttributeDef("Visibility");
            }
            return VisibilityAtt;
        }

        @objid ("fbe3a390-6565-4291-bb8c-db3cca990d67")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("324947b9-8a93-475d-814e-dbda3e1645f2")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("c7e69ae4-bdf1-4a2a-8a09-34643b777f1a")
        public static SmDependency RepresentingDep() {
            if (RepresentingDep == null) {
            	RepresentingDep = classof().getDependencyDef("Representing");
            }
            return RepresentingDep;
        }

        @objid ("36d06a9e-6566-4157-80e4-7da7d47e6bf7")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("a24846f4-0353-4bfe-82c4-392920b907f1")
        public static SmDependency ReceivedDep() {
            if (ReceivedDep == null) {
            	ReceivedDep = classof().getDependencyDef("Received");
            }
            return ReceivedDep;
        }

        @objid ("b9ccc587-729f-49b5-8f92-4a110239fc5f")
        public static SmDependency UsedNsuDep() {
            if (UsedNsuDep == null) {
            	UsedNsuDep = classof().getDependencyDef("UsedNsu");
            }
            return UsedNsuDep;
        }

        @objid ("8bd94bd2-1b0e-4fdf-855e-63d87193d882")
        public static SmDependency OwnedInformationFlowDep() {
            if (OwnedInformationFlowDep == null) {
            	OwnedInformationFlowDep = classof().getDependencyDef("OwnedInformationFlow");
            }
            return OwnedInformationFlowDep;
        }

        @objid ("ddf821eb-b05d-467c-85f6-fb3205e90925")
        public static SmDependency ImportingDep() {
            if (ImportingDep == null) {
            	ImportingDep = classof().getDependencyDef("Importing");
            }
            return ImportingDep;
        }

        @objid ("df877833-14d3-43de-acd8-3cf448aba4e5")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("7dbee66a-22b8-47f2-bb3c-6dcc45c557a5")
        public static SmDependency OwnedDataFlowDep() {
            if (OwnedDataFlowDep == null) {
            	OwnedDataFlowDep = classof().getDependencyDef("OwnedDataFlow");
            }
            return OwnedDataFlowDep;
        }

        @objid ("e83f1df5-63ab-4213-91aa-673587020053")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("0d53eaee-5eee-4994-8aff-85f4e6041d64")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("ba6a373e-3ab4-4815-9723-5e3de8d8dc0f")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("3bfd0baf-f771-44f5-877c-82e37de93df5")
        public static SmDependency SpecializationDep() {
            if (SpecializationDep == null) {
            	SpecializationDep = classof().getDependencyDef("Specialization");
            }
            return SpecializationDep;
        }

        @objid ("36974016-84ba-4865-92f1-6c2e226af747")
        public static SmDependency RealizedDep() {
            if (RealizedDep == null) {
            	RealizedDep = classof().getDependencyDef("Realized");
            }
            return RealizedDep;
        }

        @objid ("e3f3a979-4d64-4cd4-94bc-76188a64e86c")
        public static SmDependency DeclaredDep() {
            if (DeclaredDep == null) {
            	DeclaredDep = classof().getDependencyDef("Declared");
            }
            return DeclaredDep;
        }

        @objid ("b6261b9a-d75b-4a0f-9651-392eb6d9d362")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("6c4b2986-ab04-4848-b75a-c5eecad6c306")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("a731900c-ef76-4085-b4a7-3250c0da11c0")
        public static SmDependency UserNsuDep() {
            if (UserNsuDep == null) {
            	UserNsuDep = classof().getDependencyDef("UserNsu");
            }
            return UserNsuDep;
        }

        @objid ("01b7f9d3-7713-4c4d-a588-06596009af4a")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("85a5fd2c-1ba9-4802-abd0-5ba7681ead25")
        public static SmDependency getDeclaredDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DeclaredDep;
        }

        @objid ("e1265b51-cb4a-489d-aad1-9eb3a142add0")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("b65e8d28-c489-4e8b-883c-e8c83bc0a085")
        public static SmDependency getUsedNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsedNsuDep;
        }

        @objid ("8739337b-5676-49df-8466-ea17bbee7259")
        public static SmDependency getImportingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImportingDep;
        }

        @objid ("502cee6e-f5a7-4716-8b21-271516bad6ad")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("736cde8c-3bc4-40cc-9258-eef1b5c423fc")
        public static SmDependency getOwnedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedInformationFlowDep;
        }

        @objid ("e1136be4-1c4b-41b2-b9f1-5bfc53b20241")
        public static SmAttribute getIsAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsAbstractAtt;
        }

        @objid ("5df12a65-5e1d-43cb-a1bc-56be818b15b9")
        public static SmDependency getOwnedDataFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDataFlowDep;
        }

        @objid ("dd97bcc3-947d-4134-af5f-efcaa0660a17")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("3bfeb8a2-201a-45ca-80d5-fcdcee50aa05")
        public static SmAttribute getVisibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VisibilityAtt;
        }

        @objid ("bb1e7850-fe68-4d1a-9cd5-11859f9ad155")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3cdf3b3c-2e45-49cb-88bd-6c6eb90b6816")
        public static SmDependency getRepresentingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingDep;
        }

        @objid ("52270713-f29e-4ced-bd92-c365c034517a")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("45c33e5d-998e-4e46-94e4-21ec2b8f1aee")
        public static SmAttribute getIsRootAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsRootAtt;
        }

        @objid ("a88448f2-c0db-44ea-82fc-01a5985b86ca")
        public static SmDependency getReceivedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedDep;
        }

        @objid ("3887a2ae-04e9-4adf-bb81-3d415d0dec17")
        public static SmAttribute getIsLeafAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsLeafAtt;
        }

        @objid ("376d94bf-310b-4faa-84bb-f941e20b4080")
        public static SmDependency getSpecializationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SpecializationDep;
        }

        @objid ("aefd1605-bd9b-45ca-956a-b76bbae71c1f")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("a276c4a7-0efc-46ad-a098-c1cf2bf9c471")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("379d9a0a-3d8b-44b1-ac24-4b4d56a8cb77")
        public static SmDependency getRealizedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedDep;
        }

        @objid ("46ab59af-08d8-49d8-a99c-0bd64c615752")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("481385a2-8da3-4caf-816c-68eab883fd01")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("2bf1e1b0-7069-469a-923c-e1f7cee693e6")
        public static SmDependency getUserNsuDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UserNsuDep;
        }

        @objid ("0094c9ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1679fb1-db80-4f38-9395-cfad3f70c5b5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("63ede019-e5aa-49ea-9e97-8dacf1a3a7ae")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00952bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsAbstractSmAttribute extends SmAttribute {
            @objid ("66633729-389e-46c7-bbb5-54033906f963")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsAbstract;
            }

            @objid ("4f0b5419-71de-4db1-900a-f0216d078509")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsAbstract = value;
            }

        }

        @objid ("00958c88-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsLeafSmAttribute extends SmAttribute {
            @objid ("204c0bbd-9de7-4388-8626-b75a655694e8")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsLeaf;
            }

            @objid ("89b7fbac-ece5-4e3b-8d67-e9887814208b")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsLeaf = value;
            }

        }

        @objid ("0095ece6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsRootSmAttribute extends SmAttribute {
            @objid ("4a73081e-f0d7-4d81-9223-51c03378e3df")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mIsRoot;
            }

            @objid ("13ac998b-ebfa-41e1-805e-1bfe2f7cbd21")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mIsRoot = value;
            }

        }

        @objid ("00964fb0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class VisibilitySmAttribute extends SmAttribute {
            @objid ("6ab3c13f-217d-4e00-aa5d-4b74610d2210")
            public Object getValue(ISmObjectData data) {
                return ((NameSpaceData) data).mVisibility;
            }

            @objid ("785fa799-b72b-4a31-ab9d-a7af1277a6c8")
            public void setValue(ISmObjectData data, Object value) {
                ((NameSpaceData) data).mVisibility = value;
            }

        }

        @objid ("0096b702-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("a898973f-e033-4444-917e-314bcd0935ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedCollaborationUse != null)? ((NameSpaceData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("9aa44e12-4b00-4b69-b485-84431a6046aa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedCollaborationUse;
            }

            @objid ("46316f5c-4e34-48ba-aea8-1c98bd56c27f")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.NRepresentedDep();
            }

        }

        @objid ("00971efe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceivedSmDependency extends SmMultipleDependency {
            @objid ("f36e2b0b-9e3b-4b0b-b235-8b15a06bdf01")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mReceived != null)? ((NameSpaceData)data).mReceived:SmMultipleDependency.EMPTY;
            }

            @objid ("42fc19d8-0534-45ad-a03b-701a1673459c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mReceived = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mReceived;
            }

            @objid ("31d00c7a-b760-47fc-9fe9-6cededcbc95c")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.DestinationDep();
            }

        }

        @objid ("009783ee-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("2d106360-6024-4909-a0be-754a5de45f08")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSent != null)? ((NameSpaceData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("80b43918-cdb6-4877-9028-c7003847347d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSent;
            }

            @objid ("4419daf1-6f92-4fdc-a171-e3b6f4c2d6c6")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OriginDep();
            }

        }

        @objid ("0097e8b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedDataFlowSmDependency extends SmMultipleDependency {
            @objid ("e4af2628-d6f4-4567-aafb-f57c0972a785")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedDataFlow != null)? ((NameSpaceData)data).mOwnedDataFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("525aaa12-697c-4827-87f1-9cea96d92a52")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedDataFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedDataFlow;
            }

            @objid ("bd01244b-fc55-4234-8232-d734442f1145")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.OwnerDep();
            }

        }

        @objid ("00984de2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImportingSmDependency extends SmMultipleDependency {
            @objid ("71164a43-7ad6-46d0-94eb-65d41493d431")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mImporting != null)? ((NameSpaceData)data).mImporting:SmMultipleDependency.EMPTY;
            }

            @objid ("6b2bbe60-0330-45f5-8d3a-4e82eab1f745")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mImporting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mImporting;
            }

            @objid ("c7b8958e-6f67-4c65-852d-0bf407e3d39d")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportedElementDep();
            }

        }

        @objid ("0000df20-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("c5bb7a34-6134-468b-8a77-6f37142c7e3a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedImport != null)? ((NameSpaceData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("f7fc6d4a-bd84-48c8-a7f5-c8b6f92f2fdf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedImport;
            }

            @objid ("677a92b1-9e42-4c9c-9d6c-0f4b28a0ea2d")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("000157d4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SpecializationSmDependency extends SmMultipleDependency {
            @objid ("8c14c3b1-866d-496e-8a41-741b057a897a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mSpecialization != null)? ((NameSpaceData)data).mSpecialization:SmMultipleDependency.EMPTY;
            }

            @objid ("b8af7f5b-84e3-421e-a45a-edfcc65ac6de")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mSpecialization = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mSpecialization;
            }

            @objid ("23c3ba4e-aa09-4f7d-90bf-497f34351ed8")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SuperTypeDep();
            }

        }

        @objid ("0001c052-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmMultipleDependency {
            @objid ("cb0e2cfd-661c-4bcb-9735-f3899d953380")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mParent != null)? ((NameSpaceData)data).mParent:SmMultipleDependency.EMPTY;
            }

            @objid ("5ee5ef88-bc74-4a31-a7bf-73038240e820")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mParent = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mParent;
            }

            @objid ("7b970b88-3604-486c-bc6e-19a58919a146")
            @Override
            public SmDependency getSymetric() {
                return GeneralizationData.Metadata.SubTypeDep();
            }

        }

        @objid ("000228d0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentingSmDependency extends SmMultipleDependency {
            @objid ("d4314b55-4220-43b2-9d7b-7f0bf30d96e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRepresenting != null)? ((NameSpaceData)data).mRepresenting:SmMultipleDependency.EMPTY;
            }

            @objid ("c14a6125-5184-4c3a-8484-0de31a89660e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRepresenting = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRepresenting;
            }

            @objid ("a527f794-b570-4098-932e-d4dfd6fa8934")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.BaseDep();
            }

        }

        @objid ("00029216-c4c6-1fd8-97fe-001ec947cd2a")
        public static class DeclaredSmDependency extends SmMultipleDependency {
            @objid ("73002819-5262-442e-b2a0-02ab0b630283")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mDeclared != null)? ((NameSpaceData)data).mDeclared:SmMultipleDependency.EMPTY;
            }

            @objid ("b9672c68-0d32-4a37-a360-28293173ac2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mDeclared = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mDeclared;
            }

            @objid ("f6dd3394-b9f3-4181-93e5-c555d23a5bfd")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.OwnerDep();
            }

        }

        @objid ("0002fb2a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("fcccd1db-637d-45fe-aad0-3439b8910348")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedBehavior != null)? ((NameSpaceData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("c32ade16-77dc-42ce-be46-fb9902c713b2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedBehavior;
            }

            @objid ("bce9aed7-d855-4c20-9b95-75f4ec45d0d8")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerDep();
            }

        }

        @objid ("00036592-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RealizedSmDependency extends SmMultipleDependency {
            @objid ("7dc767e9-faa7-4efc-890e-7f5d71c96dcf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mRealized != null)? ((NameSpaceData)data).mRealized:SmMultipleDependency.EMPTY;
            }

            @objid ("bcba93f1-7e16-4cc5-b738-d952af1f059c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mRealized = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mRealized;
            }

            @objid ("ec055c49-e6a0-4f29-b875-227ee31358c1")
            @Override
            public SmDependency getSymetric() {
                return InterfaceRealizationData.Metadata.ImplementerDep();
            }

        }

        @objid ("0003d022-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("87c8855b-fe48-40e3-8c37-b33a6bdd5fa4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplate != null)? ((NameSpaceData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("1d0e7919-13f6-43c2-af73-7d4ba621fb93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplate;
            }

            @objid ("5699d79b-0c5a-4867-8ca6-803a140d3df8")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedDep();
            }

        }

        @objid ("00043ac6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("5f9ea5f2-8d79-451c-bcac-9416d845d882")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mInstanciatingBinding != null)? ((NameSpaceData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("e97153e4-70c6-4327-93d7-462bcbe1e883")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mInstanciatingBinding;
            }

            @objid ("6e345801-d3d4-4de3-b3c4-7cf575777064")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateDep();
            }

        }

        @objid ("0004a650-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("0b26fe9b-d545-4742-9920-eb1b02d18b3c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedPackageImport != null)? ((NameSpaceData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("9ac0f11e-0107-4ae3-83b1-74cca246a8c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedPackageImport;
            }

            @objid ("1b49dd33-ef6f-4de6-91cc-95cb70cf43a4")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingNameSpaceDep();
            }

        }

        @objid ("00051310-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("7fb42613-390c-412c-bd39-2b64e6fab508")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mTemplateInstanciation != null)? ((NameSpaceData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("f8763d2a-236c-47fc-878c-2cc7bf035b65")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mTemplateInstanciation;
            }

            @objid ("e9c223cd-8de6-4e05-8c27-52cd49cb0f77")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundElementDep();
            }

        }

        @objid ("00057f80-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UserNsuSmDependency extends SmMultipleDependency {
            @objid ("b7693039-a857-4a73-9978-00cfa321fd6c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUserNsu != null)? ((NameSpaceData)data).mUserNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("3fddbd72-9020-4270-af45-b788abfc1355")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUserNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUserNsu;
            }

            @objid ("67cba86f-7b23-47ee-ab16-571a42eab89a")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UsedDep();
            }

        }

        @objid ("0005ecd6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UsedNsuSmDependency extends SmMultipleDependency {
            @objid ("0734fa1f-b16c-479f-8b27-eff39fb1ca5e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mUsedNsu != null)? ((NameSpaceData)data).mUsedNsu:SmMultipleDependency.EMPTY;
            }

            @objid ("b29729ab-e9ad-4dbe-8991-c161a4e276bf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mUsedNsu = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mUsedNsu;
            }

            @objid ("24398561-9a57-4d97-9caf-1b8b9133d09f")
            @Override
            public SmDependency getSymetric() {
                return NamespaceUseData.Metadata.UserDep();
            }

        }

        @objid ("00065af4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OwnedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("baf1ade4-b3f1-4cf4-bb56-fc9dc0030dce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NameSpaceData)data).mOwnedInformationFlow != null)? ((NameSpaceData)data).mOwnedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("90f75f78-2396-4a5d-8543-f29becd3a80a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NameSpaceData) data).mOwnedInformationFlow = new ArrayList<>(initialCapacity);
                return ((NameSpaceData) data).mOwnedInformationFlow;
            }

            @objid ("78daa3ce-b10d-4dcd-89b3-fabd7a4a0918")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.OwnerDep();
            }

        }

    }

}
