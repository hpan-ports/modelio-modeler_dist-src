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
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixDefinitionData;
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
    @objid ("1b971f82-adaa-4cdb-bfef-2662a920483a")
    @SmaMetaAttribute(metaName="Name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("025afe26-e4db-4f48-a0cc-d29ee2436852")
    @SmaMetaAssociation(metaName="LocalProperties", typeDataClass=LocalPropertyTableData.class, min=0, max=1, smAssociationClass=Metadata.LocalPropertiesSmDependency.class, istodelete = true)
     SmObjectImpl mLocalProperties;

    @objid ("113f1591-5f2b-413c-b9bd-376624ada2a1")
    @SmaMetaAssociation(metaName="TemplateSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSubstitutionSmDependency.class)
     List<SmObjectImpl> mTemplateSubstitution = null;

    @objid ("a196e6c0-8892-453b-924b-0a52714d8897")
    @SmaMetaAssociation(metaName="BpmnLaneRefs", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnLaneRefsSmDependency.class)
     List<SmObjectImpl> mBpmnLaneRefs = null;

    @objid ("56cbfbb0-9fed-44a5-af66-fd8021adb725")
    @SmaMetaAssociation(metaName="Extension", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionSmDependency.class, partof = true)
     List<SmObjectImpl> mExtension = null;

    @objid ("94e2801f-fd21-42f6-84ef-0d765c50a73e")
    @SmaMetaAssociation(metaName="DependsOnDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnDependencySmDependency.class, component = true)
     List<SmObjectImpl> mDependsOnDependency = null;

    @objid ("2d899a5e-540c-48cc-b7d7-3338813ad6b0")
    @SmaMetaAssociation(metaName="DefaultParametering", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.DefaultParameteringSmDependency.class)
     List<SmObjectImpl> mDefaultParametering = null;

    @objid ("149782b0-dce9-4246-a91e-2d3663719c7c")
    @SmaMetaAssociation(metaName="Represents", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentsSmDependency.class)
     List<SmObjectImpl> mRepresents = null;

    @objid ("65f0e24c-1482-40bc-ac23-7f695bdd7229")
    @SmaMetaAssociation(metaName="Document", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.DocumentSmDependency.class, component = true)
     List<SmObjectImpl> mDocument = null;

    @objid ("f70263b2-91a7-40db-b040-ca3dfad471f8")
    @SmaMetaAssociation(metaName="Tag", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagSmDependency.class, component = true)
     List<SmObjectImpl> mTag = null;

    @objid ("d933013b-d459-42e1-a5f4-4cf98128aebf")
    @SmaMetaAssociation(metaName="OwnerTemplateParameter", typeDataClass=TemplateParameterData.class, min=0, max=1, smAssociationClass=Metadata.OwnerTemplateParameterSmDependency.class)
     SmObjectImpl mOwnerTemplateParameter;

    @objid ("190d9185-75e5-4915-908d-5d8e83ce1f7d")
    @SmaMetaAssociation(metaName="ImpactedDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedDependencySmDependency.class, istodelete = true)
     List<SmObjectImpl> mImpactedDependency = null;

    @objid ("1cf60316-e029-499e-b7b1-78f77fa6b460")
    @SmaMetaAssociation(metaName="RepresentingEnd", typeDataClass=ConnectorEndData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingEndSmDependency.class)
     List<SmObjectImpl> mRepresentingEnd = null;

    @objid ("b28abeda-a055-4bb9-a1a3-69f0b8681585")
    @SmaMetaAssociation(metaName="RepresentingPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingPartitionSmDependency.class)
     List<SmObjectImpl> mRepresentingPartition = null;

    @objid ("cadad8ef-bcd0-4386-9943-c9ce896dfcaa")
    @SmaMetaAssociation(metaName="ConstraintDefinition", typeDataClass=ConstraintData.class, min=0, max=-1, smAssociationClass=Metadata.ConstraintDefinitionSmDependency.class, sharedComponent = true, istodelete = true)
     List<SmObjectImpl> mConstraintDefinition = null;

    @objid ("b0f24843-a1b1-462b-9ba1-d8b066c0eead")
    @SmaMetaAssociation(metaName="TypingParameter", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypingParameterSmDependency.class)
     List<SmObjectImpl> mTypingParameter = null;

    @objid ("c9ab0c7f-e663-480e-a914-d0e531dc34f2")
    @SmaMetaAssociation(metaName="Manifesting", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.ManifestingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mManifesting = null;

    @objid ("0ae45734-1f52-43eb-8534-9b388a30a809")
    @SmaMetaAssociation(metaName="Properties", typeDataClass=PropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.PropertiesSmDependency.class, component = true)
     List<SmObjectImpl> mProperties = null;

    @objid ("9e3b8c62-386b-45bd-85ec-22a3565d15ab")
    @SmaMetaAssociation(metaName="Product", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ProductSmDependency.class, component = true)
     List<SmObjectImpl> mProduct = null;

    @objid ("2ef2096c-a2eb-4b95-b13e-e4225ce9d489")
    @SmaMetaAssociation(metaName="RepresentingInstance", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingInstanceSmDependency.class)
     List<SmObjectImpl> mRepresentingInstance = null;

    @objid ("c6c3e5cd-7882-4846-a046-a7e76122de6c")
    @SmaMetaAssociation(metaName="ReceivedInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedInfoSmDependency.class)
     List<SmObjectImpl> mReceivedInfo = null;

    @objid ("b2bcc49c-c360-4085-8460-1add3b34b554")
    @SmaMetaAssociation(metaName="SentInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentInfoSmDependency.class)
     List<SmObjectImpl> mSentInfo = null;

    @objid ("3c4bf31c-3a7c-4c69-aaca-f36288dabf73")
    @SmaMetaAssociation(metaName="Descriptor", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.DescriptorSmDependency.class, component = true)
     List<SmObjectImpl> mDescriptor = null;

    @objid ("e279cccb-5322-49cd-9657-ccc6bdf64642")
    @SmaMetaAssociation(metaName="RepresentingConnector", typeDataClass=NaryConnectorData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingConnectorSmDependency.class)
     List<SmObjectImpl> mRepresentingConnector = null;

    @objid ("f55b7a6b-4139-4aac-aae2-654383f5e798")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.MatrixSmDependency.class, component = true)
     List<SmObjectImpl> mMatrix = null;

    @objid ("1cfc2483-af1a-4bbe-83d7-7a6a084ee9ba")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0027fe8e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1d633a20-91f7-4f06-9d86-13c78f0a04a2")
        private static SmClass smClass = null;

        @objid ("a5362969-3d2f-4f7c-b63c-a8e2b8280e4c")
        private static SmAttribute NameAtt = null;

        @objid ("3acaf6b8-870e-43ba-8437-ed7f56af3677")
        private static SmDependency LocalPropertiesDep = null;

        @objid ("835e0ef4-5c97-41f3-a886-f9601cfe5a25")
        private static SmDependency TemplateSubstitutionDep = null;

        @objid ("8718d864-0d2b-4472-8925-24510d92b775")
        private static SmDependency BpmnLaneRefsDep = null;

        @objid ("4c1701ad-f882-4d7c-aa2d-8bc24cb91df7")
        private static SmDependency ExtensionDep = null;

        @objid ("093ef21f-85c3-4734-bb20-be76f9d69f11")
        private static SmDependency DependsOnDependencyDep = null;

        @objid ("f73366a6-b1cc-4fc0-a61e-4425c1bd1901")
        private static SmDependency DefaultParameteringDep = null;

        @objid ("2d4eafe5-d9c8-419e-9b17-81494b01c1e0")
        private static SmDependency RepresentsDep = null;

        @objid ("62021d10-046f-41ec-8509-8a30657e744b")
        private static SmDependency DocumentDep = null;

        @objid ("f855a29e-af0b-4613-9809-7cdb5df3c99d")
        private static SmDependency TagDep = null;

        @objid ("e35a488c-984a-4a69-a2d1-05482e31ffa7")
        private static SmDependency OwnerTemplateParameterDep = null;

        @objid ("851d5b46-da64-4f52-8bb1-f79a71416911")
        private static SmDependency ImpactedDependencyDep = null;

        @objid ("d70df31f-1168-4854-984e-1d342f61dc2e")
        private static SmDependency RepresentingEndDep = null;

        @objid ("336e70cb-370c-4d49-bf4e-9f8f135b8470")
        private static SmDependency RepresentingPartitionDep = null;

        @objid ("5c72153a-b3f4-4069-9287-d7380fe0c7d0")
        private static SmDependency ConstraintDefinitionDep = null;

        @objid ("8a24addb-96c1-496c-8958-a7faf82298e3")
        private static SmDependency TypingParameterDep = null;

        @objid ("2f373e7c-215b-44f4-8090-c8655b6347d4")
        private static SmDependency ManifestingDep = null;

        @objid ("160761a2-1892-42dc-ae4b-83e668d0d5e9")
        private static SmDependency PropertiesDep = null;

        @objid ("c465fbd0-dd54-4f01-9f5e-9b3483d26e04")
        private static SmDependency ProductDep = null;

        @objid ("aaf90c40-8e2c-43b7-ac54-26d94eb448f0")
        private static SmDependency RepresentingInstanceDep = null;

        @objid ("2e57a537-a108-4429-8d24-233cb04bc362")
        private static SmDependency ReceivedInfoDep = null;

        @objid ("7ec187d1-53a1-4974-a9d9-97199d20eec7")
        private static SmDependency SentInfoDep = null;

        @objid ("17688593-e6bd-4222-bb8d-58e4c45e99d6")
        private static SmDependency DescriptorDep = null;

        @objid ("7325e572-aed8-43f6-b572-24bb018398ea")
        private static SmDependency RepresentingConnectorDep = null;

        @objid ("3e573fc5-1f14-47ae-bb2f-5b3ae4d28533")
        private static SmDependency MatrixDep = null;

        @objid ("7e29d539-e38b-47b1-af5a-2502adaf3412")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b075e31d-5192-4ae9-9d6e-5b2e1d9ad483")
        public static SmAttribute NameAtt() {
            if (NameAtt == null) {
            	NameAtt = classof().getAttributeDef("Name");
            }
            return NameAtt;
        }

        @objid ("56f032f5-d129-4525-807b-a56316ebe89e")
        public static SmDependency LocalPropertiesDep() {
            if (LocalPropertiesDep == null) {
            	LocalPropertiesDep = classof().getDependencyDef("LocalProperties");
            }
            return LocalPropertiesDep;
        }

        @objid ("dfab7a34-04c8-4baf-af90-7e04d6ea3d0a")
        public static SmDependency TemplateSubstitutionDep() {
            if (TemplateSubstitutionDep == null) {
            	TemplateSubstitutionDep = classof().getDependencyDef("TemplateSubstitution");
            }
            return TemplateSubstitutionDep;
        }

        @objid ("239860a2-755e-4ca5-9302-9759717d933e")
        public static SmDependency BpmnLaneRefsDep() {
            if (BpmnLaneRefsDep == null) {
            	BpmnLaneRefsDep = classof().getDependencyDef("BpmnLaneRefs");
            }
            return BpmnLaneRefsDep;
        }

        @objid ("20d0b1b2-026f-4274-9995-f92c643397d6")
        public static SmDependency ExtensionDep() {
            if (ExtensionDep == null) {
            	ExtensionDep = classof().getDependencyDef("Extension");
            }
            return ExtensionDep;
        }

        @objid ("ced1463a-f5b4-4406-9c20-f2b43de0c0e0")
        public static SmDependency DependsOnDependencyDep() {
            if (DependsOnDependencyDep == null) {
            	DependsOnDependencyDep = classof().getDependencyDef("DependsOnDependency");
            }
            return DependsOnDependencyDep;
        }

        @objid ("f7c7e733-67ca-40ce-ab03-9f9c225cbadc")
        public static SmDependency DefaultParameteringDep() {
            if (DefaultParameteringDep == null) {
            	DefaultParameteringDep = classof().getDependencyDef("DefaultParametering");
            }
            return DefaultParameteringDep;
        }

        @objid ("be1b7a41-e50c-4853-860c-62a64f234bbe")
        public static SmDependency RepresentsDep() {
            if (RepresentsDep == null) {
            	RepresentsDep = classof().getDependencyDef("Represents");
            }
            return RepresentsDep;
        }

        @objid ("e06dae8e-6eba-42ea-a411-1f413ba9a751")
        public static SmDependency DocumentDep() {
            if (DocumentDep == null) {
            	DocumentDep = classof().getDependencyDef("Document");
            }
            return DocumentDep;
        }

        @objid ("40a38638-5e5f-4e9c-bbb5-2e663ec25a4e")
        public static SmDependency TagDep() {
            if (TagDep == null) {
            	TagDep = classof().getDependencyDef("Tag");
            }
            return TagDep;
        }

        @objid ("41c1d71e-3f0f-4066-bc0c-679deb3d4aec")
        public static SmDependency OwnerTemplateParameterDep() {
            if (OwnerTemplateParameterDep == null) {
            	OwnerTemplateParameterDep = classof().getDependencyDef("OwnerTemplateParameter");
            }
            return OwnerTemplateParameterDep;
        }

        @objid ("ccdf732f-dc1a-4d80-b464-0a1e3613a88e")
        public static SmDependency ImpactedDependencyDep() {
            if (ImpactedDependencyDep == null) {
            	ImpactedDependencyDep = classof().getDependencyDef("ImpactedDependency");
            }
            return ImpactedDependencyDep;
        }

        @objid ("42b3b22d-fbf9-4de4-b532-51cf3a2db82c")
        public static SmDependency RepresentingEndDep() {
            if (RepresentingEndDep == null) {
            	RepresentingEndDep = classof().getDependencyDef("RepresentingEnd");
            }
            return RepresentingEndDep;
        }

        @objid ("0f5daa0c-d20c-4f6f-b134-c843b21b906f")
        public static SmDependency RepresentingPartitionDep() {
            if (RepresentingPartitionDep == null) {
            	RepresentingPartitionDep = classof().getDependencyDef("RepresentingPartition");
            }
            return RepresentingPartitionDep;
        }

        @objid ("159ea0b8-66bf-4056-8342-dbd807d1720c")
        public static SmDependency ConstraintDefinitionDep() {
            if (ConstraintDefinitionDep == null) {
            	ConstraintDefinitionDep = classof().getDependencyDef("ConstraintDefinition");
            }
            return ConstraintDefinitionDep;
        }

        @objid ("d904d323-b138-4632-8cb3-6ffa1d25b820")
        public static SmDependency TypingParameterDep() {
            if (TypingParameterDep == null) {
            	TypingParameterDep = classof().getDependencyDef("TypingParameter");
            }
            return TypingParameterDep;
        }

        @objid ("a6cb7b3b-cc3e-43f0-8d7e-19e3398d141d")
        public static SmDependency ManifestingDep() {
            if (ManifestingDep == null) {
            	ManifestingDep = classof().getDependencyDef("Manifesting");
            }
            return ManifestingDep;
        }

        @objid ("c3f097e3-7342-4faa-9b3d-45ff6924d064")
        public static SmDependency PropertiesDep() {
            if (PropertiesDep == null) {
            	PropertiesDep = classof().getDependencyDef("Properties");
            }
            return PropertiesDep;
        }

        @objid ("e899259c-f46b-407c-925c-3987cb283e5e")
        public static SmDependency ProductDep() {
            if (ProductDep == null) {
            	ProductDep = classof().getDependencyDef("Product");
            }
            return ProductDep;
        }

        @objid ("88067cd6-a4c2-46a9-ad63-531257147be2")
        public static SmDependency RepresentingInstanceDep() {
            if (RepresentingInstanceDep == null) {
            	RepresentingInstanceDep = classof().getDependencyDef("RepresentingInstance");
            }
            return RepresentingInstanceDep;
        }

        @objid ("0f262abe-8132-425d-8339-c748e8d2bbd9")
        public static SmDependency ReceivedInfoDep() {
            if (ReceivedInfoDep == null) {
            	ReceivedInfoDep = classof().getDependencyDef("ReceivedInfo");
            }
            return ReceivedInfoDep;
        }

        @objid ("dcb20d6e-19a9-436f-9d68-3ccca6e2c8af")
        public static SmDependency SentInfoDep() {
            if (SentInfoDep == null) {
            	SentInfoDep = classof().getDependencyDef("SentInfo");
            }
            return SentInfoDep;
        }

        @objid ("a963122c-1dba-43eb-83da-b753c45c546d")
        public static SmDependency DescriptorDep() {
            if (DescriptorDep == null) {
            	DescriptorDep = classof().getDependencyDef("Descriptor");
            }
            return DescriptorDep;
        }

        @objid ("8047ceb0-4b04-4ba1-9283-beafa8225c75")
        public static SmDependency RepresentingConnectorDep() {
            if (RepresentingConnectorDep == null) {
            	RepresentingConnectorDep = classof().getDependencyDef("RepresentingConnector");
            }
            return RepresentingConnectorDep;
        }

        @objid ("046dabcb-be40-4f46-b545-2e948d541f19")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("b86617ec-0504-44dd-80b9-955c23559dfc")
        public static SmDependency getTypingParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypingParameterDep;
        }

        @objid ("1f964f75-becf-4e4c-83d2-7f70d1a29f7f")
        public static SmDependency getDescriptorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DescriptorDep;
        }

        @objid ("88a62588-2fd6-418c-9b47-efbfe65064ed")
        public static SmDependency getRepresentingConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingConnectorDep;
        }

        @objid ("f8abdd57-313a-436f-bf7d-1938040dab6a")
        public static SmDependency getDefaultParameteringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultParameteringDep;
        }

        @objid ("4bb0a2e4-4cf5-40fc-9775-f288e4efb303")
        public static SmDependency getManifestingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ManifestingDep;
        }

        @objid ("244da6a4-cc91-4784-a200-0698fd7a4428")
        public static SmDependency getOwnerTemplateParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerTemplateParameterDep;
        }

        @objid ("78bddde7-5aae-4032-a0e9-ffa2e15adab2")
        public static SmDependency getTemplateSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateSubstitutionDep;
        }

        @objid ("6c886d3d-dcfd-45a8-804b-6e0cd996b433")
        public static SmDependency getRepresentingPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingPartitionDep;
        }

        @objid ("eaa39e4b-d75c-40b1-8b4c-db8cff3163dd")
        public static SmDependency getDependsOnDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDependencyDep;
        }

        @objid ("148d77ed-2bb0-4bbe-8db1-4d4b7288544a")
        public static SmDependency getLocalPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalPropertiesDep;
        }

        @objid ("6230f30d-877b-424a-bd28-f0804432e76b")
        public static SmDependency getProductDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProductDep;
        }

        @objid ("41da3219-a97b-46be-99ac-204cf1790974")
        public static SmDependency getRepresentingInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingInstanceDep;
        }

        @objid ("4e8e461f-9333-45a1-8398-a1b39e560011")
        public static SmDependency getBpmnLaneRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnLaneRefsDep;
        }

        @objid ("3ad834c7-1446-47b9-8a38-3c32bd988744")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("ad6148b7-7a54-472a-92d8-f14327d7a15d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("efe3db1e-e7b3-4447-9ba5-58b6718f8f71")
        public static SmDependency getExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionDep;
        }

        @objid ("19e24544-a433-4cac-b56c-c638879111a6")
        public static SmDependency getRepresentingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingEndDep;
        }

        @objid ("3e2629a0-16c5-4226-a01c-82e140b57f76")
        public static SmDependency getImpactedDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDependencyDep;
        }

        @objid ("b9ede807-d2c6-4aa9-a419-e1e431d52ee4")
        public static SmDependency getPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertiesDep;
        }

        @objid ("2a2b2da0-fb8c-41df-9dc4-14b6ff117f7d")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NameAtt;
        }

        @objid ("a3650bc6-8609-44fb-b4d5-0f5ef0c8c711")
        public static SmDependency getSentInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentInfoDep;
        }

        @objid ("effc17bc-3fa0-4a4e-90a2-ffbf702a0c4e")
        public static SmDependency getDocumentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DocumentDep;
        }

        @objid ("553f3fd2-3668-4066-bd44-a4938cf2237d")
        public static SmDependency getTagDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagDep;
        }

        @objid ("0c4e1dcc-9de8-40ae-95b2-55e50c5314a9")
        public static SmDependency getConstraintDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstraintDefinitionDep;
        }

        @objid ("4caf28c4-21c0-4503-b553-7dba265443d2")
        public static SmDependency getRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentsDep;
        }

        @objid ("0381ca09-396b-4d6f-9f2e-1e168add7bfe")
        public static SmDependency getReceivedInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedInfoDep;
        }

        @objid ("00284a10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dc8e4abc-9df9-4c0d-892f-2fbcd415d4fa")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("ccef84f0-a0ca-4e9f-b583-82d253e4f6c1")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0028abf4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("7f8b9d01-1c78-42b1-b07e-2184d0749abb")
            public Object getValue(ISmObjectData data) {
                return ((ModelElementData) data).mName;
            }

            @objid ("66db7c0f-4c75-437e-b818-c07ec14d8f83")
            public void setValue(ISmObjectData data, Object value) {
                ((ModelElementData) data).mName = value;
            }

        }

        @objid ("00291256-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentsSmDependency extends SmMultipleDependency {
            @objid ("2c2a847b-5252-4555-a0f3-3de3fd00f8cd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresents != null)? ((ModelElementData)data).mRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("f033a9f0-97cb-4eb5-9108-2afb14128a83")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresents = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresents;
            }

            @objid ("6c5a673a-6170-4ea7-befc-5f393ab5356c")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00297476-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConstraintDefinitionSmDependency extends SmMultipleDependency {
            @objid ("ee2c406c-6f81-4739-88e8-cfb8731c3b03")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mConstraintDefinition != null)? ((ModelElementData)data).mConstraintDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("2a84af39-1a52-410d-b26d-5ce9d2324007")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mConstraintDefinition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mConstraintDefinition;
            }

            @objid ("f751ac5c-4dde-40ad-be76-4767d41354c2")
            @Override
            public SmDependency getSymetric() {
                return ConstraintData.Metadata.ConstrainedElementDep();
            }

        }

        @objid ("0029d98e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnDependencySmDependency extends SmMultipleDependency {
            @objid ("2597ebde-06de-499a-af7c-40609e9fc866")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDependsOnDependency != null)? ((ModelElementData)data).mDependsOnDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("718b7fac-c569-4d67-a57d-16ddc34bb2e5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDependsOnDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDependsOnDependency;
            }

            @objid ("4821a0fa-077a-4ba1-bf83-16cb8d5d0872")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.ImpactedDep();
            }

        }

        @objid ("002a3d3e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedDependencySmDependency extends SmMultipleDependency {
            @objid ("f81db336-0cdc-4acf-b3ee-89853c802cbd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mImpactedDependency != null)? ((ModelElementData)data).mImpactedDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("d61c9551-ac9e-4de4-8dae-bfd93887d513")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mImpactedDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mImpactedDependency;
            }

            @objid ("b97f8865-2cdc-4fdb-b195-73513de5268d")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.DependsOnDep();
            }

        }

        @objid ("002aa0b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProductSmDependency extends SmMultipleDependency {
            @objid ("9b54b582-4dbd-463c-a487-575ea5077c8a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProduct != null)? ((ModelElementData)data).mProduct:SmMultipleDependency.EMPTY;
            }

            @objid ("060788d3-f2f0-4094-9a75-1fbfc2f79261")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProduct = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProduct;
            }

            @objid ("bd3d13ce-2650-4219-a338-44233796eff0")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.OriginDep();
            }

        }

        @objid ("002bd220-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ManifestingSmDependency extends SmMultipleDependency {
            @objid ("63768705-a86a-4b95-b6f6-eec901b89eeb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mManifesting != null)? ((ModelElementData)data).mManifesting:SmMultipleDependency.EMPTY;
            }

            @objid ("4250fc21-4c0d-45b4-817a-8b90950c6670")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mManifesting = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mManifesting;
            }

            @objid ("2c067c5b-de18-45b9-9fc6-c3e8cb8ee1e2")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.UtilizedElementDep();
            }

        }

        @objid ("002c3986-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultParameteringSmDependency extends SmMultipleDependency {
            @objid ("b4b7cd38-8fc5-4ad5-a458-91f39aff0aeb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDefaultParametering != null)? ((ModelElementData)data).mDefaultParametering:SmMultipleDependency.EMPTY;
            }

            @objid ("18d09cc7-9ec2-46c7-b03f-b80427e4782e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDefaultParametering = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDefaultParametering;
            }

            @objid ("4cc0acba-4fe6-4675-aefc-668b5958dd1e")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.DefaultTypeDep();
            }

        }

        @objid ("002ca196-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerTemplateParameterSmDependency extends SmSingleDependency {
            @objid ("dc93e3ed-b192-4815-b2af-e19039f60dcb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mOwnerTemplateParameter;
            }

            @objid ("265f2c8b-475f-4ec2-a933-ee862b46f358")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mOwnerTemplateParameter = value;
            }

            @objid ("4c9a5d14-ce33-4196-82c5-00951f888b3d")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.OwnedParameterElementDep();
            }

        }

        @objid ("002d1a54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DescriptorSmDependency extends SmMultipleDependency {
            @objid ("2437535b-9631-4e42-a227-eb11f2320991")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDescriptor != null)? ((ModelElementData)data).mDescriptor:SmMultipleDependency.EMPTY;
            }

            @objid ("2f5bce02-60fc-45f7-a769-189a123ea73b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDescriptor = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDescriptor;
            }

            @objid ("d29d84c8-79d3-4946-984c-f4f8f5239c5e")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.SubjectDep();
            }

        }

        @objid ("002d88fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtensionSmDependency extends SmMultipleDependency {
            @objid ("9f503e6e-15fa-40b3-b3c3-ecf7388bd915")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mExtension != null)? ((ModelElementData)data).mExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("f5130f32-363d-484b-bfef-be6f0b171827")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mExtension = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mExtension;
            }

            @objid ("c3a91f61-f4dc-4d48-b716-da3d22be03b2")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ExtendedElementDep();
            }

        }

        @objid ("002df21c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TagSmDependency extends SmMultipleDependency {
            @objid ("5497876e-8dbb-44ec-843f-50fdd21d1798")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTag != null)? ((ModelElementData)data).mTag:SmMultipleDependency.EMPTY;
            }

            @objid ("992c4a07-90f0-4193-bf50-b1e6904805ab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTag = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTag;
            }

            @objid ("a2c4257f-c24b-4b1c-a28b-fa6200343b24")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.AnnotedDep();
            }

        }

        @objid ("002e5acc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DocumentSmDependency extends SmMultipleDependency {
            @objid ("16d9d171-c169-4ba3-824a-f2112ff62885")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDocument != null)? ((ModelElementData)data).mDocument:SmMultipleDependency.EMPTY;
            }

            @objid ("d1cf853a-cf25-4163-88ab-0ea85c2d2d92")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDocument = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDocument;
            }

            @objid ("2543e771-6d73-4b34-b61b-fc0bb671d0f5")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.SubjectDep();
            }

        }

        @objid ("002ec6f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TemplateSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("c118eeb4-11a6-42f1-ba88-4b446def61b7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTemplateSubstitution != null)? ((ModelElementData)data).mTemplateSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("a37732e8-f31a-4825-bb18-8cebe2c5bd77")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTemplateSubstitution = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTemplateSubstitution;
            }

            @objid ("c8da12e3-be22-433a-af89-895ed63f0436")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.ActualDep();
            }

        }

        @objid ("002f3208-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypingParameterSmDependency extends SmMultipleDependency {
            @objid ("daaa6a54-808e-486c-b694-09065b58b395")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTypingParameter != null)? ((ModelElementData)data).mTypingParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("df600728-416c-47b2-97bf-4943a2f88aa5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTypingParameter = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTypingParameter;
            }

            @objid ("c6d66950-85c2-4fed-8c64-7c7c115d23d2")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.TypeDep();
            }

        }

        @objid ("002f9d92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingInstanceSmDependency extends SmMultipleDependency {
            @objid ("17aa5a0c-cc8c-4afb-993a-fa2205716f65")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingInstance != null)? ((ModelElementData)data).mRepresentingInstance:SmMultipleDependency.EMPTY;
            }

            @objid ("ef47f349-1055-4026-b1b0-1b11dc132a0f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingInstance = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingInstance;
            }

            @objid ("a6a7799b-a17f-4e19-aac2-6ac3bb7c3cb2")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030195c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingConnectorSmDependency extends SmMultipleDependency {
            @objid ("19e0b44f-5447-4172-b1e1-dbb4c36a2a42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingConnector != null)? ((ModelElementData)data).mRepresentingConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("ea732dc8-bc7d-4cc7-99df-aa542b66c899")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingConnector = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingConnector;
            }

            @objid ("a4e2ee9e-2b86-4056-bea8-1a4b4eaa5061")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00308ee6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingEndSmDependency extends SmMultipleDependency {
            @objid ("0b9ee33b-d378-4715-89c8-62aa3fb90797")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingEnd != null)? ((ModelElementData)data).mRepresentingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("1580f9c1-9260-4f83-8824-2687edf7298c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingEnd = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingEnd;
            }

            @objid ("03fece71-5d06-4b20-ae82-27daef9221f2")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030fe80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingPartitionSmDependency extends SmMultipleDependency {
            @objid ("8656671c-ac83-4c6b-a7c5-7685f394c452")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingPartition != null)? ((ModelElementData)data).mRepresentingPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("a04e0c4c-6efa-4314-a6c4-8b0af84b81cb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingPartition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingPartition;
            }

            @objid ("546d25ff-999c-4506-84b8-c8b0d2e64b7f")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.RepresentedDep();
            }

        }

        @objid ("00317496-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedInfoSmDependency extends SmMultipleDependency {
            @objid ("4c61796f-f38b-4570-98fc-574b66a553a0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mReceivedInfo != null)? ((ModelElementData)data).mReceivedInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("b22b45f6-5eef-4626-80ee-b3a50d7db10b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mReceivedInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mReceivedInfo;
            }

            @objid ("b7363f74-51cc-4d3a-b9ee-2575791038a8")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationTargetDep();
            }

        }

        @objid ("0031e23c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentInfoSmDependency extends SmMultipleDependency {
            @objid ("78133901-0631-4be0-b00b-acc602f2b6df")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mSentInfo != null)? ((ModelElementData)data).mSentInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("5365a502-532b-4ae8-b421-20b1168e8d3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mSentInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mSentInfo;
            }

            @objid ("ff2c7e6d-1893-453b-b508-6566cc136686")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationSourceDep();
            }

        }

        @objid ("0032573a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnLaneRefsSmDependency extends SmMultipleDependency {
            @objid ("4060cbb1-66ba-48e2-9cdc-2b0adbc6479f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mBpmnLaneRefs != null)? ((ModelElementData)data).mBpmnLaneRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("5f05b050-afbe-48fe-a5fb-8f11ca418059")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mBpmnLaneRefs = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mBpmnLaneRefs;
            }

            @objid ("d718eeb5-7227-46bf-a034-e5893d885f71")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.PartitionElementDep();
            }

        }

        @objid ("0061ca56-ec98-1098-b22e-001ec947cd2a")
        public static class LocalPropertiesSmDependency extends SmSingleDependency {
            @objid ("f2c1f840-0bc8-48be-b46d-ef689191dd5c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mLocalProperties;
            }

            @objid ("96b74e57-1b99-4174-be23-3bc47ffc8c66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mLocalProperties = value;
            }

            @objid ("d11e4548-ebc2-4d27-8ce3-a4aa212119f7")
            @Override
            public SmDependency getSymetric() {
                return LocalPropertyTableData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("006a066c-ec98-1098-b22e-001ec947cd2a")
        public static class PropertiesSmDependency extends SmMultipleDependency {
            @objid ("cbe967ab-924c-4684-b4bc-0a04f61a26ab")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProperties != null)? ((ModelElementData)data).mProperties:SmMultipleDependency.EMPTY;
            }

            @objid ("5a3ec666-5606-4d76-a580-7e42f517671b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProperties = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProperties;
            }

            @objid ("80f5922d-378d-4ed3-bd43-a3e2b484d97c")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerDep();
            }

        }

        @objid ("637e21a6-97ca-432b-9e33-a1ea619eecf0")
        public static class MatrixSmDependency extends SmMultipleDependency {
            @objid ("28490ccc-7b0a-4672-b345-94ea167d7bc7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mMatrix != null)? ((ModelElementData)data).mMatrix:SmMultipleDependency.EMPTY;
            }

            @objid ("f8a0c041-49d3-4f63-affb-b9eaff7a40dd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mMatrix = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mMatrix;
            }

            @objid ("27dd4ae8-6acb-44de-8ce4-ce691b9619e7")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
