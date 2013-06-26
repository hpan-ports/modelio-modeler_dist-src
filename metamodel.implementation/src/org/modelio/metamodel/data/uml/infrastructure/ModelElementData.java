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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.diagrams.AbstractDiagramData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityPartitionData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ConstraintData;
import org.modelio.metamodel.data.uml.infrastructure.DependencyData;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.data.uml.infrastructure.LocalNoteData;
import org.modelio.metamodel.data.uml.infrastructure.LocalTaggedValueData;
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.data.uml.infrastructure.properties.LocalPropertyTableData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.data.uml.statik.ManifestationData;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterSubstitutionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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

@objid ("0088dbfa-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModelElement.class, factory=ModelElementData.Metadata.ObjectFactory.class)
public abstract class ModelElementData extends ElementData {
    @objid ("0b1f8e48-5328-46fb-92f3-de34c1363e92")
    @SmaMetaAttribute(metaName="Name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("bcbde700-d4c3-432c-bb25-521a2102ccad")
    @SmaMetaAssociation(metaName="LocalProperties", typeDataClass=LocalPropertyTableData.class, min=0, max=1, smAssociationClass=Metadata.LocalPropertiesSmDependency.class, istodelete = true)
     SmObjectImpl mLocalProperties;

    @objid ("62f9b8d9-5276-41f4-ba93-e756b291191d")
    @SmaMetaAssociation(metaName="TemplateSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSubstitutionSmDependency.class)
     List<SmObjectImpl> mTemplateSubstitution = null;

    @objid ("c55bbdbd-9272-40bf-8d0b-df048aa7a02d")
    @SmaMetaAssociation(metaName="BpmnLaneRefs", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnLaneRefsSmDependency.class)
     List<SmObjectImpl> mBpmnLaneRefs = null;

    @objid ("69955d3b-70ff-4e2c-87a7-312b6c189741")
    @SmaMetaAssociation(metaName="Extension", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionSmDependency.class, partof = true)
     List<SmObjectImpl> mExtension = null;

    @objid ("4ee20947-c00f-488b-9858-3f0633050b44")
    @SmaMetaAssociation(metaName="LocalTag", typeDataClass=LocalTaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.LocalTagSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mLocalTag = null;

    @objid ("ba4cbfe9-fc02-4d23-94e5-454af2b420f7")
    @SmaMetaAssociation(metaName="DependsOnDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnDependencySmDependency.class, component = true)
     List<SmObjectImpl> mDependsOnDependency = null;

    @objid ("482501e9-ed7b-46b2-8d12-feb6defbe829")
    @SmaMetaAssociation(metaName="DefaultParametering", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.DefaultParameteringSmDependency.class)
     List<SmObjectImpl> mDefaultParametering = null;

    @objid ("da2c64c1-d296-4e23-912f-fca9223ab9c5")
    @SmaMetaAssociation(metaName="Represents", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentsSmDependency.class)
     List<SmObjectImpl> mRepresents = null;

    @objid ("0366d402-8a54-4246-87e0-3a389dce6e6e")
    @SmaMetaAssociation(metaName="Document", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.DocumentSmDependency.class, component = true)
     List<SmObjectImpl> mDocument = null;

    @objid ("bfab05d0-405d-4c69-9773-6a1d12977fa1")
    @SmaMetaAssociation(metaName="Tag", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagSmDependency.class, component = true)
     List<SmObjectImpl> mTag = null;

    @objid ("79aae42d-dbbb-43dd-9ab9-3b58c21510fb")
    @SmaMetaAssociation(metaName="OwnerTemplateParameter", typeDataClass=TemplateParameterData.class, min=0, max=1, smAssociationClass=Metadata.OwnerTemplateParameterSmDependency.class)
     SmObjectImpl mOwnerTemplateParameter;

    @objid ("dab18339-3568-44c2-848d-d38a2fa02818")
    @SmaMetaAssociation(metaName="LocalDescriptor", typeDataClass=LocalNoteData.class, min=0, max=-1, smAssociationClass=Metadata.LocalDescriptorSmDependency.class, component = true, istodelete = true)
     List<SmObjectImpl> mLocalDescriptor = null;

    @objid ("8342380d-e169-45d5-991d-3ce7c18c07c9")
    @SmaMetaAssociation(metaName="ImpactedDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedDependencySmDependency.class, istodelete = true)
     List<SmObjectImpl> mImpactedDependency = null;

    @objid ("a2f85f80-76bd-4007-9f11-24402af607c8")
    @SmaMetaAssociation(metaName="RepresentingEnd", typeDataClass=ConnectorEndData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingEndSmDependency.class)
     List<SmObjectImpl> mRepresentingEnd = null;

    @objid ("c84be127-440f-486a-929e-cec6658509a7")
    @SmaMetaAssociation(metaName="RepresentingPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingPartitionSmDependency.class)
     List<SmObjectImpl> mRepresentingPartition = null;

    @objid ("121dfc03-c5ba-4981-82c6-9a7e55d0d0a5")
    @SmaMetaAssociation(metaName="ConstraintDefinition", typeDataClass=ConstraintData.class, min=0, max=-1, smAssociationClass=Metadata.ConstraintDefinitionSmDependency.class, sharedComponent = true, istodelete = true)
     List<SmObjectImpl> mConstraintDefinition = null;

    @objid ("6cf53e26-c58a-4be4-9265-ad22c395e4cc")
    @SmaMetaAssociation(metaName="TypingParameter", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypingParameterSmDependency.class)
     List<SmObjectImpl> mTypingParameter = null;

    @objid ("ca9faf1d-5daa-4ed0-9466-1a039d7c1a9e")
    @SmaMetaAssociation(metaName="Manifesting", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.ManifestingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mManifesting = null;

    @objid ("3c6870f3-4976-4632-8cad-0bce9e76f5a2")
    @SmaMetaAssociation(metaName="Properties", typeDataClass=PropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.PropertiesSmDependency.class, component = true)
     List<SmObjectImpl> mProperties = null;

    @objid ("29bab511-3c51-4b1a-809a-63d534f51efa")
    @SmaMetaAssociation(metaName="Product", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ProductSmDependency.class, component = true)
     List<SmObjectImpl> mProduct = null;

    @objid ("92f502fd-d915-46b2-a9de-708930e6632e")
    @SmaMetaAssociation(metaName="RepresentingInstance", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingInstanceSmDependency.class)
     List<SmObjectImpl> mRepresentingInstance = null;

    @objid ("98134159-3ba1-43f0-8a1e-03da2dc94892")
    @SmaMetaAssociation(metaName="ReceivedInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedInfoSmDependency.class)
     List<SmObjectImpl> mReceivedInfo = null;

    @objid ("3aa34f90-9436-4f71-8ee0-c6097dbe31fe")
    @SmaMetaAssociation(metaName="SentInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentInfoSmDependency.class)
     List<SmObjectImpl> mSentInfo = null;

    @objid ("4109cdd5-741c-443a-bd55-259b017e15a8")
    @SmaMetaAssociation(metaName="Descriptor", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.DescriptorSmDependency.class, component = true)
     List<SmObjectImpl> mDescriptor = null;

    @objid ("1529c49d-3457-43e2-932b-c7ac15069444")
    @SmaMetaAssociation(metaName="RepresentingConnector", typeDataClass=NaryConnectorData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingConnectorSmDependency.class)
     List<SmObjectImpl> mRepresentingConnector = null;

    @objid ("8eb60d49-e70d-4bae-ae8e-7019742d289a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0027fe8e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a8f77e84-4080-404d-a843-a4c46f2593b6")
        private static SmClass smClass = null;

        @objid ("42fd1175-c890-4a65-855c-1ae191fe1e57")
        private static SmAttribute NameAtt = null;

        @objid ("7c5c9e21-646f-4dfd-bf17-3482353f4b27")
        private static SmDependency LocalPropertiesDep = null;

        @objid ("e1deb471-d9de-4229-b098-ed91345c71f5")
        private static SmDependency TemplateSubstitutionDep = null;

        @objid ("5aae993e-62c2-4bec-bf0c-7895cbdb8303")
        private static SmDependency BpmnLaneRefsDep = null;

        @objid ("6f21fbc0-beae-44c2-8a1d-2bcdc273d723")
        private static SmDependency ExtensionDep = null;

        @objid ("6e40a819-fa18-4c4d-8685-3399b0d240b1")
        private static SmDependency LocalTagDep = null;

        @objid ("f3088b7f-a1f8-47de-84f6-10a979e9a0ff")
        private static SmDependency DependsOnDependencyDep = null;

        @objid ("00b1a0fd-deb1-4b7c-91a3-9d637720a031")
        private static SmDependency DefaultParameteringDep = null;

        @objid ("aa93cb5c-c492-4111-9d38-b2deca2ea1c3")
        private static SmDependency RepresentsDep = null;

        @objid ("4e024924-a122-4db8-afa7-80759e8743dd")
        private static SmDependency DocumentDep = null;

        @objid ("4585d588-dc54-47a3-bbfc-0aec5276a661")
        private static SmDependency TagDep = null;

        @objid ("315c5ec8-d67a-4536-a09b-dfcd4b6ef012")
        private static SmDependency OwnerTemplateParameterDep = null;

        @objid ("64abbc11-1571-4e93-8950-f187caefe1e4")
        private static SmDependency LocalDescriptorDep = null;

        @objid ("a9de97d4-229f-4b21-b9dc-dd757b123b63")
        private static SmDependency ImpactedDependencyDep = null;

        @objid ("4a99e06c-2efc-4b5b-8495-f7fb9d4d8567")
        private static SmDependency RepresentingEndDep = null;

        @objid ("7d2494f3-0ddb-4fd6-a9f1-12e0d124d422")
        private static SmDependency RepresentingPartitionDep = null;

        @objid ("6373ba41-b0bf-4987-af56-a172ffbb26c3")
        private static SmDependency ConstraintDefinitionDep = null;

        @objid ("83397b69-dda0-4b04-a5c9-c76d63468a58")
        private static SmDependency TypingParameterDep = null;

        @objid ("3b7fefdd-1d65-4c3f-b55a-391cf050d71e")
        private static SmDependency ManifestingDep = null;

        @objid ("068c30d9-d9fd-4e2c-aa22-7c6ebfee7bcf")
        private static SmDependency PropertiesDep = null;

        @objid ("3510a2a1-f301-449d-b120-bbf70ebfe1f4")
        private static SmDependency ProductDep = null;

        @objid ("07e2bb7a-69a8-47fc-bc01-0a64b33701f6")
        private static SmDependency RepresentingInstanceDep = null;

        @objid ("825cd092-238f-4cc8-89f8-6807cb2fdf09")
        private static SmDependency ReceivedInfoDep = null;

        @objid ("21706729-1862-4bdd-896a-e3598ababcb6")
        private static SmDependency SentInfoDep = null;

        @objid ("62fb7bcc-84a4-4f55-a5da-57d3330a378c")
        private static SmDependency DescriptorDep = null;

        @objid ("3145cb81-0a3f-457b-9dce-acaacbac92a1")
        private static SmDependency RepresentingConnectorDep = null;

        @objid ("54d92972-ce45-4eaf-aace-286779774301")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2c18145e-5697-4b4d-a0f1-9621394d2111")
        public static SmAttribute NameAtt() {
            if (NameAtt == null) {
            	NameAtt = classof().getAttributeDef("Name");
            }
            return NameAtt;
        }

        @objid ("b7ac6d4f-8908-4b9d-a775-517b354ebebf")
        public static SmDependency LocalPropertiesDep() {
            if (LocalPropertiesDep == null) {
            	LocalPropertiesDep = classof().getDependencyDef("LocalProperties");
            }
            return LocalPropertiesDep;
        }

        @objid ("b6ddae82-81b4-491e-b646-5bef837966b9")
        public static SmDependency TemplateSubstitutionDep() {
            if (TemplateSubstitutionDep == null) {
            	TemplateSubstitutionDep = classof().getDependencyDef("TemplateSubstitution");
            }
            return TemplateSubstitutionDep;
        }

        @objid ("95b94bb6-9815-4856-8d87-574cad0f2eb8")
        public static SmDependency BpmnLaneRefsDep() {
            if (BpmnLaneRefsDep == null) {
            	BpmnLaneRefsDep = classof().getDependencyDef("BpmnLaneRefs");
            }
            return BpmnLaneRefsDep;
        }

        @objid ("87a9e653-68a5-44f6-9819-3cb5b4f60602")
        public static SmDependency ExtensionDep() {
            if (ExtensionDep == null) {
            	ExtensionDep = classof().getDependencyDef("Extension");
            }
            return ExtensionDep;
        }

        @objid ("e574fa35-a466-4c15-bd8c-6fee98ba0b41")
        public static SmDependency LocalTagDep() {
            if (LocalTagDep == null) {
            	LocalTagDep = classof().getDependencyDef("LocalTag");
            }
            return LocalTagDep;
        }

        @objid ("a5326930-f5eb-411b-8c6b-dcff031cbea3")
        public static SmDependency DependsOnDependencyDep() {
            if (DependsOnDependencyDep == null) {
            	DependsOnDependencyDep = classof().getDependencyDef("DependsOnDependency");
            }
            return DependsOnDependencyDep;
        }

        @objid ("1ca32e4e-492d-4a5f-912c-aec836c97f6b")
        public static SmDependency DefaultParameteringDep() {
            if (DefaultParameteringDep == null) {
            	DefaultParameteringDep = classof().getDependencyDef("DefaultParametering");
            }
            return DefaultParameteringDep;
        }

        @objid ("9a80271d-d053-444b-bb80-20fa5119d183")
        public static SmDependency RepresentsDep() {
            if (RepresentsDep == null) {
            	RepresentsDep = classof().getDependencyDef("Represents");
            }
            return RepresentsDep;
        }

        @objid ("8c1b1869-7ba8-4562-a93b-38dcc5b7b263")
        public static SmDependency DocumentDep() {
            if (DocumentDep == null) {
            	DocumentDep = classof().getDependencyDef("Document");
            }
            return DocumentDep;
        }

        @objid ("064ebf85-fa77-467a-b0c5-d0894f7c5b98")
        public static SmDependency TagDep() {
            if (TagDep == null) {
            	TagDep = classof().getDependencyDef("Tag");
            }
            return TagDep;
        }

        @objid ("d03f79ec-3555-4353-b508-b9d3844664ca")
        public static SmDependency OwnerTemplateParameterDep() {
            if (OwnerTemplateParameterDep == null) {
            	OwnerTemplateParameterDep = classof().getDependencyDef("OwnerTemplateParameter");
            }
            return OwnerTemplateParameterDep;
        }

        @objid ("d7e23179-1e93-445e-b8d3-6cabd40f1f10")
        public static SmDependency LocalDescriptorDep() {
            if (LocalDescriptorDep == null) {
            	LocalDescriptorDep = classof().getDependencyDef("LocalDescriptor");
            }
            return LocalDescriptorDep;
        }

        @objid ("1ed55ea3-9f8b-406e-a178-47bd04241312")
        public static SmDependency ImpactedDependencyDep() {
            if (ImpactedDependencyDep == null) {
            	ImpactedDependencyDep = classof().getDependencyDef("ImpactedDependency");
            }
            return ImpactedDependencyDep;
        }

        @objid ("c3256d66-6607-4efb-ab76-7803977beafa")
        public static SmDependency RepresentingEndDep() {
            if (RepresentingEndDep == null) {
            	RepresentingEndDep = classof().getDependencyDef("RepresentingEnd");
            }
            return RepresentingEndDep;
        }

        @objid ("63d4dc41-ba71-4242-b89a-9ece4a5c3757")
        public static SmDependency RepresentingPartitionDep() {
            if (RepresentingPartitionDep == null) {
            	RepresentingPartitionDep = classof().getDependencyDef("RepresentingPartition");
            }
            return RepresentingPartitionDep;
        }

        @objid ("ab4805c4-053a-4a12-bef0-bbbabfba7bfc")
        public static SmDependency ConstraintDefinitionDep() {
            if (ConstraintDefinitionDep == null) {
            	ConstraintDefinitionDep = classof().getDependencyDef("ConstraintDefinition");
            }
            return ConstraintDefinitionDep;
        }

        @objid ("68c50a84-5b9e-44b3-9608-a9a937976190")
        public static SmDependency TypingParameterDep() {
            if (TypingParameterDep == null) {
            	TypingParameterDep = classof().getDependencyDef("TypingParameter");
            }
            return TypingParameterDep;
        }

        @objid ("7871495c-4e01-4854-84b6-bd913d723507")
        public static SmDependency ManifestingDep() {
            if (ManifestingDep == null) {
            	ManifestingDep = classof().getDependencyDef("Manifesting");
            }
            return ManifestingDep;
        }

        @objid ("9b56a460-fc2d-4ad3-8b44-01751c394b6b")
        public static SmDependency PropertiesDep() {
            if (PropertiesDep == null) {
            	PropertiesDep = classof().getDependencyDef("Properties");
            }
            return PropertiesDep;
        }

        @objid ("8991b1a1-3aee-4536-9b9f-a51264dca31f")
        public static SmDependency ProductDep() {
            if (ProductDep == null) {
            	ProductDep = classof().getDependencyDef("Product");
            }
            return ProductDep;
        }

        @objid ("c4f48f43-12d3-4102-887a-3b872b1b59ff")
        public static SmDependency RepresentingInstanceDep() {
            if (RepresentingInstanceDep == null) {
            	RepresentingInstanceDep = classof().getDependencyDef("RepresentingInstance");
            }
            return RepresentingInstanceDep;
        }

        @objid ("a9b7ef33-ab92-4522-af3c-29baa4487da1")
        public static SmDependency ReceivedInfoDep() {
            if (ReceivedInfoDep == null) {
            	ReceivedInfoDep = classof().getDependencyDef("ReceivedInfo");
            }
            return ReceivedInfoDep;
        }

        @objid ("2eb1af18-b520-4861-98bd-4c6d6fb08bd1")
        public static SmDependency SentInfoDep() {
            if (SentInfoDep == null) {
            	SentInfoDep = classof().getDependencyDef("SentInfo");
            }
            return SentInfoDep;
        }

        @objid ("d62f708a-22e8-497f-8c58-89cab5772177")
        public static SmDependency DescriptorDep() {
            if (DescriptorDep == null) {
            	DescriptorDep = classof().getDependencyDef("Descriptor");
            }
            return DescriptorDep;
        }

        @objid ("33c76e71-96bc-47a4-a976-21af2770e9b9")
        public static SmDependency RepresentingConnectorDep() {
            if (RepresentingConnectorDep == null) {
            	RepresentingConnectorDep = classof().getDependencyDef("RepresentingConnector");
            }
            return RepresentingConnectorDep;
        }

        @objid ("ae22780f-c365-4234-b0a3-77a313d7bddc")
        public static SmDependency getRepresentingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingEndDep;
        }

        @objid ("640402e2-d08c-407d-9059-7c53b95f9db3")
        public static SmDependency getImpactedDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDependencyDep;
        }

        @objid ("cb02e29a-648a-4df6-9e7c-ea83120d8a7a")
        public static SmDependency getDefaultParameteringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultParameteringDep;
        }

        @objid ("de84088c-d3c1-4f4b-9edb-03023825ff80")
        public static SmDependency getRepresentingInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingInstanceDep;
        }

        @objid ("318b5422-fdca-49f2-b882-aedc96ece9a5")
        public static SmDependency getTypingParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypingParameterDep;
        }

        @objid ("6b4d8167-48bf-4597-a476-74904830a699")
        public static SmDependency getSentInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentInfoDep;
        }

        @objid ("b59f9da4-f413-4d3a-a3ac-02dd21ce8d75")
        public static SmDependency getLocalPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalPropertiesDep;
        }

        @objid ("da49ea2f-02a7-4af8-8187-af57ffe872d1")
        public static SmDependency getLocalDescriptorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalDescriptorDep;
        }

        @objid ("199633ae-3055-437b-88ab-11989e3a568a")
        public static SmDependency getDocumentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DocumentDep;
        }

        @objid ("c45d3fb2-7e59-4a81-bb9f-ed3f712738e7")
        public static SmDependency getTagDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagDep;
        }

        @objid ("8aae3450-99eb-42a1-8338-b0921b6d6292")
        public static SmDependency getDescriptorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DescriptorDep;
        }

        @objid ("ec7cd3ab-c723-49f0-93ee-b66d847f80f3")
        public static SmDependency getProductDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProductDep;
        }

        @objid ("4fc5e508-a0bd-488b-8d3c-0b7aa7d4fa77")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ecdb7ad-302a-478c-8ce1-ed4d6c171a62")
        public static SmDependency getRepresentingPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingPartitionDep;
        }

        @objid ("84e1f862-683c-4b7e-9d10-29fc4c6cca03")
        public static SmDependency getRepresentingConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingConnectorDep;
        }

        @objid ("6614baeb-569e-41d5-a510-1583005a0d32")
        public static SmDependency getReceivedInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedInfoDep;
        }

        @objid ("3b2be030-3f15-40fa-8f54-3c07600f65da")
        public static SmDependency getOwnerTemplateParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerTemplateParameterDep;
        }

        @objid ("a0222d4b-c794-4cde-ae7c-89cd2db9cbc4")
        public static SmDependency getBpmnLaneRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnLaneRefsDep;
        }

        @objid ("62740eab-a13e-4cef-84b6-d13b19932154")
        public static SmDependency getConstraintDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstraintDefinitionDep;
        }

        @objid ("b6120b70-a883-4448-acf5-45966e61be61")
        public static SmDependency getExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionDep;
        }

        @objid ("44f3993a-faf3-4be9-be81-5dd4446c3e69")
        public static SmDependency getDependsOnDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDependencyDep;
        }

        @objid ("69e983fd-0f78-415a-b46c-2f3aec1bc5cc")
        public static SmDependency getManifestingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ManifestingDep;
        }

        @objid ("e1e215c1-49e8-4c8b-b401-8fbae8e14211")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NameAtt;
        }

        @objid ("5a98bcb3-3d67-41d3-81db-1c4d0e6f96bc")
        public static SmDependency getLocalTagDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalTagDep;
        }

        @objid ("aff95977-660d-4962-8e4d-aa496aca3ec2")
        public static SmDependency getPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertiesDep;
        }

        @objid ("2e443fbe-83c1-40df-93a7-c39d744bf1a7")
        public static SmDependency getRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentsDep;
        }

        @objid ("b18be879-300f-4376-a786-cd14cf8ade24")
        public static SmDependency getTemplateSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateSubstitutionDep;
        }

        @objid ("00284a10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ef7aeac3-db3b-47a9-8bde-502a72d8ac4c")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("7cd671aa-0efd-4976-b467-7b6ccca4a7cd")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0028abf4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("35f70d94-a5b4-4d52-b6b8-813029ab159f")
            public Object getValue(ISmObjectData data) {
                return ((ModelElementData) data).mName;
            }

            @objid ("67499101-f2e4-4bc4-8dad-68a2bfe626a3")
            public void setValue(ISmObjectData data, Object value) {
                ((ModelElementData) data).mName = value;
            }

        }

        @objid ("00291256-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentsSmDependency extends SmMultipleDependency {
            @objid ("4b2cff79-5514-4a30-9145-ed379c507cee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresents != null)? ((ModelElementData)data).mRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("df81c57e-fd2e-4aa7-a9bd-b560a22ff77d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresents = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresents;
            }

            @objid ("3fcadf96-62b1-4682-97af-b99abd088108")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00297476-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConstraintDefinitionSmDependency extends SmMultipleDependency {
            @objid ("4af88dd2-3257-48b8-a197-825fb0fffa7c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mConstraintDefinition != null)? ((ModelElementData)data).mConstraintDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("dd0bd7c7-c3c7-46bb-8515-14e96d6878e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mConstraintDefinition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mConstraintDefinition;
            }

            @objid ("246e4630-096b-44f2-8e22-0cfadda12d17")
            @Override
            public SmDependency getSymetric() {
                return ConstraintData.Metadata.ConstrainedElementDep();
            }

        }

        @objid ("0029d98e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnDependencySmDependency extends SmMultipleDependency {
            @objid ("8b49e38a-ac29-469d-a34a-dbb18fa8af69")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDependsOnDependency != null)? ((ModelElementData)data).mDependsOnDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("a352e926-3abf-4fa8-8796-e7fe47bf1c98")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDependsOnDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDependsOnDependency;
            }

            @objid ("6ff7f7cc-279a-471b-b2c7-cd993c793978")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.ImpactedDep();
            }

        }

        @objid ("002a3d3e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedDependencySmDependency extends SmMultipleDependency {
            @objid ("00bd9e89-33c6-48bb-a021-2f58c2db4162")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mImpactedDependency != null)? ((ModelElementData)data).mImpactedDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("573c8c2d-af8a-4ad8-85b5-13ae872fa413")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mImpactedDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mImpactedDependency;
            }

            @objid ("281886aa-fcf3-4baa-bc38-28d49ab877a0")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.DependsOnDep();
            }

        }

        @objid ("002aa0b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProductSmDependency extends SmMultipleDependency {
            @objid ("84581dda-96e7-4450-8177-5044a213247c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProduct != null)? ((ModelElementData)data).mProduct:SmMultipleDependency.EMPTY;
            }

            @objid ("392c2f49-ba61-44cd-a680-d819c2c4a08b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProduct = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProduct;
            }

            @objid ("da2f52cb-596c-43fd-9f1e-b1ba2e2cb157")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.OriginDep();
            }

        }

        @objid ("002b076e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LocalDescriptorSmDependency extends SmMultipleDependency {
            @objid ("c87436f2-8010-48a5-b46f-deb4e813b821")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mLocalDescriptor != null)? ((ModelElementData)data).mLocalDescriptor:SmMultipleDependency.EMPTY;
            }

            @objid ("d4348845-335a-454b-9994-0c987120e1d9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mLocalDescriptor = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mLocalDescriptor;
            }

            @objid ("72a3c0a0-2c19-424a-a8ac-7d7d866d00ed")
            @Override
            public SmDependency getSymetric() {
                return LocalNoteData.Metadata.LocalSubjectDep();
            }

        }

        @objid ("002b6cea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LocalTagSmDependency extends SmMultipleDependency {
            @objid ("ae6e4efa-af2f-447b-9da9-316aca6f59a7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mLocalTag != null)? ((ModelElementData)data).mLocalTag:SmMultipleDependency.EMPTY;
            }

            @objid ("a27cbeb3-3c1a-4ac2-9e41-9b65a733aeb4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mLocalTag = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mLocalTag;
            }

            @objid ("870b14ef-cbb5-408e-b642-c5e8bc37faf5")
            @Override
            public SmDependency getSymetric() {
                return LocalTaggedValueData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("002bd220-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ManifestingSmDependency extends SmMultipleDependency {
            @objid ("2aeb55ce-327a-4ecb-a490-9dd296a28070")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mManifesting != null)? ((ModelElementData)data).mManifesting:SmMultipleDependency.EMPTY;
            }

            @objid ("ddcdc3cb-6890-4810-909b-0ecbcb9ed390")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mManifesting = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mManifesting;
            }

            @objid ("f17fc3bf-0b0a-42a5-9b39-41aa16e21fc6")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.UtilizedElementDep();
            }

        }

        @objid ("002c3986-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultParameteringSmDependency extends SmMultipleDependency {
            @objid ("aa61a586-808d-440b-a82a-2eb54961e86c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDefaultParametering != null)? ((ModelElementData)data).mDefaultParametering:SmMultipleDependency.EMPTY;
            }

            @objid ("db48804b-cf2d-4486-ac90-407d3bd950ea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDefaultParametering = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDefaultParametering;
            }

            @objid ("fd14f82b-0cbb-4b11-b7d8-002a679c78c1")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.DefaultTypeDep();
            }

        }

        @objid ("002ca196-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerTemplateParameterSmDependency extends SmSingleDependency {
            @objid ("3fe4359b-fce4-41d4-92e0-15f6847262ef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mOwnerTemplateParameter;
            }

            @objid ("89119ec8-ddeb-4463-bbc8-cf524d95eeb5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mOwnerTemplateParameter = value;
            }

            @objid ("340a9b92-20db-49be-8b45-eb71834d65aa")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.OwnedParameterElementDep();
            }

        }

        @objid ("002d1a54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DescriptorSmDependency extends SmMultipleDependency {
            @objid ("20290f15-4373-42ec-8696-9e7e7772e4b6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDescriptor != null)? ((ModelElementData)data).mDescriptor:SmMultipleDependency.EMPTY;
            }

            @objid ("7c11234f-8edf-4279-9c50-c5833fc986a2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDescriptor = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDescriptor;
            }

            @objid ("a98d7102-273c-4a9b-83d6-c1fe2ffd1c12")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.SubjectDep();
            }

        }

        @objid ("002d88fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtensionSmDependency extends SmMultipleDependency {
            @objid ("ec596670-7ffb-4a6d-bb2e-60f5795f5b31")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mExtension != null)? ((ModelElementData)data).mExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("041968f9-a549-4841-bcd8-8d57a54735e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mExtension = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mExtension;
            }

            @objid ("9e26291d-e234-41b3-978b-42122cd12317")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ExtendedElementDep();
            }

        }

        @objid ("002df21c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TagSmDependency extends SmMultipleDependency {
            @objid ("7a7f979f-92cf-4d2b-bfe3-7e186d8b3ff7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTag != null)? ((ModelElementData)data).mTag:SmMultipleDependency.EMPTY;
            }

            @objid ("0131cec4-3317-402c-b8c7-b9a25f01a89b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTag = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTag;
            }

            @objid ("f782c867-971c-466a-8233-96c10dbd674d")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.AnnotedDep();
            }

        }

        @objid ("002e5acc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DocumentSmDependency extends SmMultipleDependency {
            @objid ("b06df91f-f5e0-4d71-b073-93e7460962de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDocument != null)? ((ModelElementData)data).mDocument:SmMultipleDependency.EMPTY;
            }

            @objid ("7d8b8fc4-6381-4c47-ac59-69c39f1aa6a3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDocument = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDocument;
            }

            @objid ("272762f5-ea80-4456-a85b-60cde875c4cb")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.SubjectDep();
            }

        }

        @objid ("002ec6f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TemplateSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("e6a2abb6-bbcc-4dd8-b70b-3b786ce4d08b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTemplateSubstitution != null)? ((ModelElementData)data).mTemplateSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("8bc7ebdc-803a-472f-bc62-371713ec5483")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTemplateSubstitution = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTemplateSubstitution;
            }

            @objid ("ff4569a6-f6d1-4963-8713-a10dab927977")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.ActualDep();
            }

        }

        @objid ("002f3208-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypingParameterSmDependency extends SmMultipleDependency {
            @objid ("1ea47756-3447-478a-86c2-d209cbdaeb5f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTypingParameter != null)? ((ModelElementData)data).mTypingParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("02cc38e7-0f19-406d-b298-d00dab359ddb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTypingParameter = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTypingParameter;
            }

            @objid ("d8aa9d3a-8717-4c27-ba3f-a899d9967a19")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.TypeDep();
            }

        }

        @objid ("002f9d92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingInstanceSmDependency extends SmMultipleDependency {
            @objid ("ca0364b0-e11e-4fc8-bfac-429bb5581885")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingInstance != null)? ((ModelElementData)data).mRepresentingInstance:SmMultipleDependency.EMPTY;
            }

            @objid ("f1992746-6dd1-4614-96f4-bcae0d34032a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingInstance = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingInstance;
            }

            @objid ("24a658f0-e1bc-430e-b36d-4860e7ddb930")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030195c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingConnectorSmDependency extends SmMultipleDependency {
            @objid ("896cf871-07ee-422b-a018-962a60511f1e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingConnector != null)? ((ModelElementData)data).mRepresentingConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("298b271f-268a-4ca0-a8af-48cba54b0ff8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingConnector = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingConnector;
            }

            @objid ("421afc0b-a006-45a7-a542-3a0128fb35bd")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00308ee6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingEndSmDependency extends SmMultipleDependency {
            @objid ("1aaf8c31-b4aa-4397-bd77-5883e15147e9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingEnd != null)? ((ModelElementData)data).mRepresentingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("8fe990ce-176f-42cc-9b41-a678ab8e5d83")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingEnd = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingEnd;
            }

            @objid ("a65c9266-e21b-4625-8f1c-32ed33a9b025")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030fe80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingPartitionSmDependency extends SmMultipleDependency {
            @objid ("756ff8c4-b6c8-4c34-8085-d4560e34acb2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingPartition != null)? ((ModelElementData)data).mRepresentingPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("b50dad06-b5fa-499d-923f-ab2525234b03")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingPartition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingPartition;
            }

            @objid ("4d673416-be40-4413-be3a-9107632b56de")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.RepresentedDep();
            }

        }

        @objid ("00317496-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedInfoSmDependency extends SmMultipleDependency {
            @objid ("9946aa1f-9433-4a40-ab1b-210204a24cbe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mReceivedInfo != null)? ((ModelElementData)data).mReceivedInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("ace34435-cfa2-42d0-a3cd-4ca31351408d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mReceivedInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mReceivedInfo;
            }

            @objid ("cac379dd-7bdf-4f36-a393-3f7d6a0a1246")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationTargetDep();
            }

        }

        @objid ("0031e23c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentInfoSmDependency extends SmMultipleDependency {
            @objid ("cc427762-954a-422b-b4ac-1d8e4bbcbf32")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mSentInfo != null)? ((ModelElementData)data).mSentInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("bde09017-9446-4622-adfa-78d411af238e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mSentInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mSentInfo;
            }

            @objid ("3a0d7ffa-2580-41a0-b3b0-83b0262f801d")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationSourceDep();
            }

        }

        @objid ("0032573a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnLaneRefsSmDependency extends SmMultipleDependency {
            @objid ("0c23f281-8a93-4ff5-9a2c-3d091da67684")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mBpmnLaneRefs != null)? ((ModelElementData)data).mBpmnLaneRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a2f36dd3-ad80-48e5-98c5-15bb6ecbcebc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mBpmnLaneRefs = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mBpmnLaneRefs;
            }

            @objid ("04377a32-c303-49ae-9974-47cf4266b9a3")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.PartitionElementDep();
            }

        }

        @objid ("0061ca56-ec98-1098-b22e-001ec947cd2a")
        public static class LocalPropertiesSmDependency extends SmSingleDependency {
            @objid ("9fe88ed7-d16a-40e2-ba12-b86de3d72fce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mLocalProperties;
            }

            @objid ("9d32f886-f194-4823-ab3c-1114d064558b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mLocalProperties = value;
            }

            @objid ("52e3dc68-0f0f-45c9-9dde-d1058b338a40")
            @Override
            public SmDependency getSymetric() {
                return LocalPropertyTableData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("006a066c-ec98-1098-b22e-001ec947cd2a")
        public static class PropertiesSmDependency extends SmMultipleDependency {
            @objid ("2b001ed6-7fcb-442a-bafe-0192b7825ae1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProperties != null)? ((ModelElementData)data).mProperties:SmMultipleDependency.EMPTY;
            }

            @objid ("ea312f66-51e4-4f2b-b782-e3a1cc549433")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProperties = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProperties;
            }

            @objid ("f181450c-53bf-44a7-82d3-a968f3578577")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerDep();
            }

        }

    }

}
