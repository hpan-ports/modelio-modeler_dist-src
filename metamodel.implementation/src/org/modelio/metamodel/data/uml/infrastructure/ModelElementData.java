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
    @objid ("f674a0dd-5e98-4cfd-8eae-8043ca14b8cf")
    @SmaMetaAttribute(metaName="Name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("83d4a197-0b37-4650-aaa5-8b68e62402cc")
    @SmaMetaAssociation(metaName="LocalProperties", typeDataClass=LocalPropertyTableData.class, min=0, max=1, smAssociationClass=Metadata.LocalPropertiesSmDependency.class, istodelete = true)
     SmObjectImpl mLocalProperties;

    @objid ("3b6c812a-ece4-43e3-85b2-71646c36af9b")
    @SmaMetaAssociation(metaName="TemplateSubstitution", typeDataClass=TemplateParameterSubstitutionData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSubstitutionSmDependency.class)
     List<SmObjectImpl> mTemplateSubstitution = null;

    @objid ("48b1316b-febe-40b3-9792-8b5d213cf0ff")
    @SmaMetaAssociation(metaName="BpmnLaneRefs", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnLaneRefsSmDependency.class)
     List<SmObjectImpl> mBpmnLaneRefs = null;

    @objid ("6d458239-4288-4a24-a4e9-b39192df10cb")
    @SmaMetaAssociation(metaName="Extension", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ExtensionSmDependency.class, partof = true)
     List<SmObjectImpl> mExtension = null;

    @objid ("60c04e1a-e424-4bd2-9e3a-c4f050e74a0b")
    @SmaMetaAssociation(metaName="DependsOnDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnDependencySmDependency.class, component = true)
     List<SmObjectImpl> mDependsOnDependency = null;

    @objid ("400cf388-53a8-4465-95b5-b532b191a247")
    @SmaMetaAssociation(metaName="DefaultParametering", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.DefaultParameteringSmDependency.class)
     List<SmObjectImpl> mDefaultParametering = null;

    @objid ("cda0aeb8-b71f-4908-8a51-6bd43ce9a487")
    @SmaMetaAssociation(metaName="Represents", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentsSmDependency.class)
     List<SmObjectImpl> mRepresents = null;

    @objid ("7038cfe7-893c-44f7-a7ff-7f4344200159")
    @SmaMetaAssociation(metaName="Document", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.DocumentSmDependency.class, component = true)
     List<SmObjectImpl> mDocument = null;

    @objid ("81276fde-e04a-47da-9f7b-9f88770ed58b")
    @SmaMetaAssociation(metaName="Tag", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagSmDependency.class, component = true)
     List<SmObjectImpl> mTag = null;

    @objid ("15184645-1839-4ed8-af84-35472515e764")
    @SmaMetaAssociation(metaName="OwnerTemplateParameter", typeDataClass=TemplateParameterData.class, min=0, max=1, smAssociationClass=Metadata.OwnerTemplateParameterSmDependency.class)
     SmObjectImpl mOwnerTemplateParameter;

    @objid ("25eb88e0-b22c-4f6c-885a-b43aa69267e7")
    @SmaMetaAssociation(metaName="ImpactedDependency", typeDataClass=DependencyData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedDependencySmDependency.class, istodelete = true)
     List<SmObjectImpl> mImpactedDependency = null;

    @objid ("8aaca891-4741-447e-9bcb-470e68e64649")
    @SmaMetaAssociation(metaName="RepresentingEnd", typeDataClass=ConnectorEndData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingEndSmDependency.class)
     List<SmObjectImpl> mRepresentingEnd = null;

    @objid ("7035d400-96c0-40cb-80a2-157a74596d7d")
    @SmaMetaAssociation(metaName="RepresentingPartition", typeDataClass=ActivityPartitionData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingPartitionSmDependency.class)
     List<SmObjectImpl> mRepresentingPartition = null;

    @objid ("26353a32-a04a-483f-af2b-70449d3ca5a8")
    @SmaMetaAssociation(metaName="ConstraintDefinition", typeDataClass=ConstraintData.class, min=0, max=-1, smAssociationClass=Metadata.ConstraintDefinitionSmDependency.class, sharedComponent = true, istodelete = true)
     List<SmObjectImpl> mConstraintDefinition = null;

    @objid ("d98dccf9-299d-458d-bee7-04c13d61f4dc")
    @SmaMetaAssociation(metaName="TypingParameter", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TypingParameterSmDependency.class)
     List<SmObjectImpl> mTypingParameter = null;

    @objid ("6fc487e1-f20a-4185-b77e-335fa97a01c1")
    @SmaMetaAssociation(metaName="Manifesting", typeDataClass=ManifestationData.class, min=0, max=-1, smAssociationClass=Metadata.ManifestingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mManifesting = null;

    @objid ("c56ee12c-42f5-41ed-8361-fc674ca8f803")
    @SmaMetaAssociation(metaName="Properties", typeDataClass=PropertyTableData.class, min=0, max=-1, smAssociationClass=Metadata.PropertiesSmDependency.class, component = true)
     List<SmObjectImpl> mProperties = null;

    @objid ("98814cf8-3986-4ce0-8995-deb63d7257f6")
    @SmaMetaAssociation(metaName="Product", typeDataClass=AbstractDiagramData.class, min=0, max=-1, smAssociationClass=Metadata.ProductSmDependency.class, component = true)
     List<SmObjectImpl> mProduct = null;

    @objid ("3e1002eb-0090-4950-8fb4-3b5e395d3d58")
    @SmaMetaAssociation(metaName="RepresentingInstance", typeDataClass=BindableInstanceData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingInstanceSmDependency.class)
     List<SmObjectImpl> mRepresentingInstance = null;

    @objid ("d60e7e55-f536-45af-ba18-76105ef8af47")
    @SmaMetaAssociation(metaName="ReceivedInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.ReceivedInfoSmDependency.class)
     List<SmObjectImpl> mReceivedInfo = null;

    @objid ("0e01f48d-0d09-482c-902c-6e261abdbbd5")
    @SmaMetaAssociation(metaName="SentInfo", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentInfoSmDependency.class)
     List<SmObjectImpl> mSentInfo = null;

    @objid ("07bc4724-d17f-4eb9-8458-ed0ae7dd27b8")
    @SmaMetaAssociation(metaName="Descriptor", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.DescriptorSmDependency.class, component = true)
     List<SmObjectImpl> mDescriptor = null;

    @objid ("1958fae2-54da-446e-8914-e1756bd82117")
    @SmaMetaAssociation(metaName="RepresentingConnector", typeDataClass=NaryConnectorData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingConnectorSmDependency.class)
     List<SmObjectImpl> mRepresentingConnector = null;

    @objid ("e7a6484c-f6c1-4cca-a283-b5aeb49d5883")
    @SmaMetaAssociation(metaName="Matrix", typeDataClass=MatrixDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.MatrixSmDependency.class, component = true)
     List<SmObjectImpl> mMatrix = null;

    @objid ("e1de215b-d82d-4ac9-ba25-2c9b7e70b237")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0027fe8e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8dc6a2ee-ee79-427c-8ae3-0ea4222215ca")
        private static SmClass smClass = null;

        @objid ("48b8b6d2-09c6-43c7-a8ac-4cd2a34ce1d0")
        private static SmAttribute NameAtt = null;

        @objid ("89c5431a-e18a-4f77-931a-8b4efb06ad72")
        private static SmDependency LocalPropertiesDep = null;

        @objid ("7d842a8c-b448-4fd5-8f2d-2e700000582b")
        private static SmDependency TemplateSubstitutionDep = null;

        @objid ("ba99b120-49f8-459c-bc68-7ba65fabc88b")
        private static SmDependency BpmnLaneRefsDep = null;

        @objid ("ba6f2386-4eaa-423c-b680-f86cde35f904")
        private static SmDependency ExtensionDep = null;

        @objid ("ce3daab6-279e-4093-8d3d-0320269b24f3")
        private static SmDependency DependsOnDependencyDep = null;

        @objid ("ae6a9b54-7ba8-499b-a2c9-b742ecf0ee97")
        private static SmDependency DefaultParameteringDep = null;

        @objid ("3a811dcb-467d-4431-8e31-8f8c843188c1")
        private static SmDependency RepresentsDep = null;

        @objid ("de37c23f-f87d-4d55-89a4-3a93e636228a")
        private static SmDependency DocumentDep = null;

        @objid ("81496ec3-b013-42e8-984e-a78e4abbc9b3")
        private static SmDependency TagDep = null;

        @objid ("3ca7a8e9-4fc5-4025-9384-4e05951b1c6b")
        private static SmDependency OwnerTemplateParameterDep = null;

        @objid ("c4594714-42e8-42a4-b8fc-cbc03711d382")
        private static SmDependency ImpactedDependencyDep = null;

        @objid ("ee937465-4519-4abd-a43a-a8c7dd08af34")
        private static SmDependency RepresentingEndDep = null;

        @objid ("e51ff5fc-96d3-4054-a0a4-a9b786357a22")
        private static SmDependency RepresentingPartitionDep = null;

        @objid ("e468aa22-0ed2-4be8-9ab1-b8dff7cd738c")
        private static SmDependency ConstraintDefinitionDep = null;

        @objid ("7c026227-616a-49cd-a0c7-2ce8191c2ab8")
        private static SmDependency TypingParameterDep = null;

        @objid ("0007f479-50b7-47ab-bbf6-b924474e210d")
        private static SmDependency ManifestingDep = null;

        @objid ("ad24dcc7-025c-40c7-be33-97ec8a05ef72")
        private static SmDependency PropertiesDep = null;

        @objid ("8a3a72f0-e4bb-4567-9b88-5784a2d57043")
        private static SmDependency ProductDep = null;

        @objid ("6c4c799b-e61a-49c2-9e67-9ee59460402b")
        private static SmDependency RepresentingInstanceDep = null;

        @objid ("822231e1-fc37-4bda-a3f6-5cf5c2af3487")
        private static SmDependency ReceivedInfoDep = null;

        @objid ("21ea2a63-1c91-45cb-8d6e-5bfd4d25b2a2")
        private static SmDependency SentInfoDep = null;

        @objid ("d35bfc7e-6958-424e-a97c-818e5b54ff68")
        private static SmDependency DescriptorDep = null;

        @objid ("f5eff659-c6e1-48af-aa9a-1910c9e06cbd")
        private static SmDependency RepresentingConnectorDep = null;

        @objid ("add39942-45c4-404e-a0e8-97c371e29f81")
        private static SmDependency MatrixDep = null;

        @objid ("42bfa698-debe-4446-990c-b5dd362af121")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("af52f841-c6f4-4a81-b259-b557cc5aa3f9")
        public static SmAttribute NameAtt() {
            if (NameAtt == null) {
            	NameAtt = classof().getAttributeDef("Name");
            }
            return NameAtt;
        }

        @objid ("de83d6dc-74ae-48ca-9d8f-5a1c3df972a1")
        public static SmDependency LocalPropertiesDep() {
            if (LocalPropertiesDep == null) {
            	LocalPropertiesDep = classof().getDependencyDef("LocalProperties");
            }
            return LocalPropertiesDep;
        }

        @objid ("92acd764-81aa-49ff-bf31-63b1a3a6d7fd")
        public static SmDependency TemplateSubstitutionDep() {
            if (TemplateSubstitutionDep == null) {
            	TemplateSubstitutionDep = classof().getDependencyDef("TemplateSubstitution");
            }
            return TemplateSubstitutionDep;
        }

        @objid ("5e55f8b0-6df2-4f03-8476-1ca66075070e")
        public static SmDependency BpmnLaneRefsDep() {
            if (BpmnLaneRefsDep == null) {
            	BpmnLaneRefsDep = classof().getDependencyDef("BpmnLaneRefs");
            }
            return BpmnLaneRefsDep;
        }

        @objid ("f9bfb743-1537-417d-8044-6568b9ee9f75")
        public static SmDependency ExtensionDep() {
            if (ExtensionDep == null) {
            	ExtensionDep = classof().getDependencyDef("Extension");
            }
            return ExtensionDep;
        }

        @objid ("4417e7a4-c33b-4fd2-acc9-78e0a306665e")
        public static SmDependency DependsOnDependencyDep() {
            if (DependsOnDependencyDep == null) {
            	DependsOnDependencyDep = classof().getDependencyDef("DependsOnDependency");
            }
            return DependsOnDependencyDep;
        }

        @objid ("fd085f35-dabb-4c63-9526-1b411ce87b44")
        public static SmDependency DefaultParameteringDep() {
            if (DefaultParameteringDep == null) {
            	DefaultParameteringDep = classof().getDependencyDef("DefaultParametering");
            }
            return DefaultParameteringDep;
        }

        @objid ("e51ff4d6-ed97-4cea-9017-fbbac079cfd2")
        public static SmDependency RepresentsDep() {
            if (RepresentsDep == null) {
            	RepresentsDep = classof().getDependencyDef("Represents");
            }
            return RepresentsDep;
        }

        @objid ("1e35b289-786b-4f23-a529-d319d987e785")
        public static SmDependency DocumentDep() {
            if (DocumentDep == null) {
            	DocumentDep = classof().getDependencyDef("Document");
            }
            return DocumentDep;
        }

        @objid ("b7652de7-e091-481d-938e-5b637e17a5a5")
        public static SmDependency TagDep() {
            if (TagDep == null) {
            	TagDep = classof().getDependencyDef("Tag");
            }
            return TagDep;
        }

        @objid ("cb035fb1-1ad3-4206-8dd4-dc4038491800")
        public static SmDependency OwnerTemplateParameterDep() {
            if (OwnerTemplateParameterDep == null) {
            	OwnerTemplateParameterDep = classof().getDependencyDef("OwnerTemplateParameter");
            }
            return OwnerTemplateParameterDep;
        }

        @objid ("71c773c4-28bc-4799-8399-a8016fe74f3d")
        public static SmDependency ImpactedDependencyDep() {
            if (ImpactedDependencyDep == null) {
            	ImpactedDependencyDep = classof().getDependencyDef("ImpactedDependency");
            }
            return ImpactedDependencyDep;
        }

        @objid ("f0ba7f68-6a0f-470f-b5b9-452536639b53")
        public static SmDependency RepresentingEndDep() {
            if (RepresentingEndDep == null) {
            	RepresentingEndDep = classof().getDependencyDef("RepresentingEnd");
            }
            return RepresentingEndDep;
        }

        @objid ("a0f334e1-042a-4d2a-ac03-3ab73dd1e81a")
        public static SmDependency RepresentingPartitionDep() {
            if (RepresentingPartitionDep == null) {
            	RepresentingPartitionDep = classof().getDependencyDef("RepresentingPartition");
            }
            return RepresentingPartitionDep;
        }

        @objid ("384470ee-4451-47ee-830b-b8ffd5e2160a")
        public static SmDependency ConstraintDefinitionDep() {
            if (ConstraintDefinitionDep == null) {
            	ConstraintDefinitionDep = classof().getDependencyDef("ConstraintDefinition");
            }
            return ConstraintDefinitionDep;
        }

        @objid ("118eee35-da15-4537-bf38-da841ff8d580")
        public static SmDependency TypingParameterDep() {
            if (TypingParameterDep == null) {
            	TypingParameterDep = classof().getDependencyDef("TypingParameter");
            }
            return TypingParameterDep;
        }

        @objid ("3f269584-09a1-452c-a9a7-232ab984e426")
        public static SmDependency ManifestingDep() {
            if (ManifestingDep == null) {
            	ManifestingDep = classof().getDependencyDef("Manifesting");
            }
            return ManifestingDep;
        }

        @objid ("7f958316-1c57-43e2-a1da-a3b98e4af1ca")
        public static SmDependency PropertiesDep() {
            if (PropertiesDep == null) {
            	PropertiesDep = classof().getDependencyDef("Properties");
            }
            return PropertiesDep;
        }

        @objid ("80e0027b-6563-4461-9549-e38eed6c0897")
        public static SmDependency ProductDep() {
            if (ProductDep == null) {
            	ProductDep = classof().getDependencyDef("Product");
            }
            return ProductDep;
        }

        @objid ("4a59e5da-5e78-4fda-a5cb-97664236b159")
        public static SmDependency RepresentingInstanceDep() {
            if (RepresentingInstanceDep == null) {
            	RepresentingInstanceDep = classof().getDependencyDef("RepresentingInstance");
            }
            return RepresentingInstanceDep;
        }

        @objid ("5a9fb298-01b3-4160-9221-85b7e57b8cf5")
        public static SmDependency ReceivedInfoDep() {
            if (ReceivedInfoDep == null) {
            	ReceivedInfoDep = classof().getDependencyDef("ReceivedInfo");
            }
            return ReceivedInfoDep;
        }

        @objid ("b91e12c8-1948-462c-892f-d07726be9cac")
        public static SmDependency SentInfoDep() {
            if (SentInfoDep == null) {
            	SentInfoDep = classof().getDependencyDef("SentInfo");
            }
            return SentInfoDep;
        }

        @objid ("acaab810-1d94-4d7d-812d-5890e75e46ab")
        public static SmDependency DescriptorDep() {
            if (DescriptorDep == null) {
            	DescriptorDep = classof().getDependencyDef("Descriptor");
            }
            return DescriptorDep;
        }

        @objid ("41112eba-22a8-43c9-95f8-c1ed4ed17ce4")
        public static SmDependency RepresentingConnectorDep() {
            if (RepresentingConnectorDep == null) {
            	RepresentingConnectorDep = classof().getDependencyDef("RepresentingConnector");
            }
            return RepresentingConnectorDep;
        }

        @objid ("336fc8c8-a7ca-48c2-a715-fc6dea6c4587")
        public static SmDependency MatrixDep() {
            if (MatrixDep == null) {
            	MatrixDep = classof().getDependencyDef("Matrix");
            }
            return MatrixDep;
        }

        @objid ("e3b04dc7-ac0c-4c8d-aef6-6a2b437c18ae")
        public static SmDependency getRepresentingInstanceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingInstanceDep;
        }

        @objid ("da641553-e2a2-46bc-965f-88db81b0cf3d")
        public static SmDependency getBpmnLaneRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnLaneRefsDep;
        }

        @objid ("bc3d1730-930e-43c9-80fb-ca564c1f4521")
        public static SmDependency getRepresentingConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingConnectorDep;
        }

        @objid ("aeb60f5c-3c9b-4ca7-a35d-e83668f69998")
        public static SmDependency getRepresentingPartitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingPartitionDep;
        }

        @objid ("d8b2c4b6-5d6b-4a65-9675-4959fb51adf5")
        public static SmDependency getDocumentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DocumentDep;
        }

        @objid ("1cec0f72-bbd3-490d-a81d-fac20a73dcd5")
        public static SmDependency getRepresentsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentsDep;
        }

        @objid ("53927262-bffe-4a2a-b049-17d213a1a33c")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NameAtt;
        }

        @objid ("cd6855f6-543e-4910-8287-62298c1c79d4")
        public static SmDependency getRepresentingEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingEndDep;
        }

        @objid ("5e403211-ec50-499b-b872-5c0dd1f58e6d")
        public static SmDependency getConstraintDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstraintDefinitionDep;
        }

        @objid ("fcc1f7bb-ff68-47c0-9e8f-3406d251c593")
        public static SmDependency getProductDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProductDep;
        }

        @objid ("451057c0-85b4-4702-b004-1a813763d115")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8e34d659-42e6-4c8b-899e-80e3ac08d75f")
        public static SmDependency getDescriptorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DescriptorDep;
        }

        @objid ("7954fca0-5f14-4bc6-89ae-cab27a80559d")
        public static SmDependency getReceivedInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedInfoDep;
        }

        @objid ("57313b7f-3c0e-4cfd-a7fa-6edba0c83a32")
        public static SmDependency getMatrixDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MatrixDep;
        }

        @objid ("81c5e698-1ba5-4601-98be-0eb3a2f93e0d")
        public static SmDependency getTypingParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypingParameterDep;
        }

        @objid ("7607f367-f648-4132-91ab-375682fde8b0")
        public static SmDependency getDefaultParameteringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultParameteringDep;
        }

        @objid ("718b08e4-ed39-4520-9299-8b8a54ddd45b")
        public static SmDependency getLocalPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalPropertiesDep;
        }

        @objid ("b8cb684d-3feb-400b-a755-0ffeb2f3ae85")
        public static SmDependency getPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PropertiesDep;
        }

        @objid ("257da6d7-921b-4f2e-94ab-1cd2766a16e5")
        public static SmDependency getManifestingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ManifestingDep;
        }

        @objid ("feb60345-0f2d-47ff-b19a-62b030fb5f01")
        public static SmDependency getImpactedDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDependencyDep;
        }

        @objid ("586228f9-2e11-402e-a15f-8624ce0ab869")
        public static SmDependency getExtensionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtensionDep;
        }

        @objid ("75cc287c-cbef-49f1-8136-3d9ba6ba496b")
        public static SmDependency getOwnerTemplateParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerTemplateParameterDep;
        }

        @objid ("668f6243-7502-4c2f-8d75-328f3e03a1cf")
        public static SmDependency getSentInfoDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentInfoDep;
        }

        @objid ("05055d3d-8f1f-4b82-8a33-f254a207db7b")
        public static SmDependency getDependsOnDependencyDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDependencyDep;
        }

        @objid ("c920cb36-a6e2-49f6-a20c-c0e767c00597")
        public static SmDependency getTemplateSubstitutionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateSubstitutionDep;
        }

        @objid ("3c5f674f-5ada-4793-a9da-852052cad024")
        public static SmDependency getTagDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagDep;
        }

        @objid ("00284a10-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("64f3812e-d06f-42f1-98e4-0030a87b02c2")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5be8f210-b1ed-4f12-b47a-2a8e2efd30fb")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0028abf4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("0f9880a4-0c79-4744-9549-56234ba108b3")
            public Object getValue(ISmObjectData data) {
                return ((ModelElementData) data).mName;
            }

            @objid ("85f4b62f-a9e6-43bc-b377-5c8ae7c491ea")
            public void setValue(ISmObjectData data, Object value) {
                ((ModelElementData) data).mName = value;
            }

        }

        @objid ("00291256-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentsSmDependency extends SmMultipleDependency {
            @objid ("2ac6d973-0fc6-482c-8439-0fbbdbef9300")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresents != null)? ((ModelElementData)data).mRepresents:SmMultipleDependency.EMPTY;
            }

            @objid ("0a29c922-236a-44ea-b408-7419e731c304")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresents = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresents;
            }

            @objid ("9a7b8770-d671-416e-a0ef-602d9fcfeec6")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00297476-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConstraintDefinitionSmDependency extends SmMultipleDependency {
            @objid ("3f46b219-925a-4e7b-99e4-ad445eb533db")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mConstraintDefinition != null)? ((ModelElementData)data).mConstraintDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("89bbacd6-eba9-436e-9880-827972a43d86")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mConstraintDefinition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mConstraintDefinition;
            }

            @objid ("d07f5742-d13b-47ba-96d3-075001416a31")
            @Override
            public SmDependency getSymetric() {
                return ConstraintData.Metadata.ConstrainedElementDep();
            }

        }

        @objid ("0029d98e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnDependencySmDependency extends SmMultipleDependency {
            @objid ("2c0b86a3-9683-43d9-a990-23e848ec8f62")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDependsOnDependency != null)? ((ModelElementData)data).mDependsOnDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("dd92fbba-6066-4c76-8751-76ff0b1551e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDependsOnDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDependsOnDependency;
            }

            @objid ("55266461-f60d-4def-bfdb-7a6a2d5df149")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.ImpactedDep();
            }

        }

        @objid ("002a3d3e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedDependencySmDependency extends SmMultipleDependency {
            @objid ("4250ace5-ab29-431a-959e-37379f0b58aa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mImpactedDependency != null)? ((ModelElementData)data).mImpactedDependency:SmMultipleDependency.EMPTY;
            }

            @objid ("a822d19e-515a-4a7e-9881-83e3ea215fb8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mImpactedDependency = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mImpactedDependency;
            }

            @objid ("c43ad14a-31bc-4865-81b3-328da76ea445")
            @Override
            public SmDependency getSymetric() {
                return DependencyData.Metadata.DependsOnDep();
            }

        }

        @objid ("002aa0b2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProductSmDependency extends SmMultipleDependency {
            @objid ("d875b83a-78ee-4f9e-bb79-055059977322")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProduct != null)? ((ModelElementData)data).mProduct:SmMultipleDependency.EMPTY;
            }

            @objid ("6b1a58fb-822a-4571-b864-d83d654f823f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProduct = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProduct;
            }

            @objid ("d29c7608-b101-4482-8843-4343d4330448")
            @Override
            public SmDependency getSymetric() {
                return AbstractDiagramData.Metadata.OriginDep();
            }

        }

        @objid ("002bd220-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ManifestingSmDependency extends SmMultipleDependency {
            @objid ("61e7eab4-d9bc-4a50-b832-bbf74cac4349")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mManifesting != null)? ((ModelElementData)data).mManifesting:SmMultipleDependency.EMPTY;
            }

            @objid ("3e10c873-6947-4ca1-91bb-dc0fda564dab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mManifesting = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mManifesting;
            }

            @objid ("6af894e3-e8b2-42e3-8af8-82414e7052e8")
            @Override
            public SmDependency getSymetric() {
                return ManifestationData.Metadata.UtilizedElementDep();
            }

        }

        @objid ("002c3986-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefaultParameteringSmDependency extends SmMultipleDependency {
            @objid ("3779808f-48a0-4ba0-8d92-d092e8b01f3f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDefaultParametering != null)? ((ModelElementData)data).mDefaultParametering:SmMultipleDependency.EMPTY;
            }

            @objid ("a38593b4-7ce1-42c2-997b-f8e26ecd6515")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDefaultParametering = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDefaultParametering;
            }

            @objid ("ecd1a4c0-b323-4219-8c70-161023d6bc9f")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.DefaultTypeDep();
            }

        }

        @objid ("002ca196-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerTemplateParameterSmDependency extends SmSingleDependency {
            @objid ("5e7461a1-24cd-4ef3-b392-017f5a4172ed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mOwnerTemplateParameter;
            }

            @objid ("00abfff5-3a50-4e3a-bcf8-12a247d35ea8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mOwnerTemplateParameter = value;
            }

            @objid ("edef8193-71df-495f-96e8-ddc874624e80")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.OwnedParameterElementDep();
            }

        }

        @objid ("002d1a54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DescriptorSmDependency extends SmMultipleDependency {
            @objid ("711ea95f-09da-495a-b206-9a3afecd592c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDescriptor != null)? ((ModelElementData)data).mDescriptor:SmMultipleDependency.EMPTY;
            }

            @objid ("ca77ba8d-f155-418c-b353-a81bb021499c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDescriptor = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDescriptor;
            }

            @objid ("b42635df-c013-44a3-8ce7-d4899b9498e6")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.SubjectDep();
            }

        }

        @objid ("002d88fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtensionSmDependency extends SmMultipleDependency {
            @objid ("066be079-1eec-4b4d-9bca-6398efe0ff7a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mExtension != null)? ((ModelElementData)data).mExtension:SmMultipleDependency.EMPTY;
            }

            @objid ("a189c0f7-6e78-4cbb-a77b-772e4a2f52c8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mExtension = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mExtension;
            }

            @objid ("94bfeece-7bed-4920-8f8e-d17c023c704b")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ExtendedElementDep();
            }

        }

        @objid ("002df21c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TagSmDependency extends SmMultipleDependency {
            @objid ("8fc6715b-1e3d-4784-a198-8abdb46cc8a2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTag != null)? ((ModelElementData)data).mTag:SmMultipleDependency.EMPTY;
            }

            @objid ("b663b9bf-47be-44b6-bab9-6ddbbcd2ca79")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTag = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTag;
            }

            @objid ("61b4a7fb-e293-483c-9251-89ecb5b635d7")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.AnnotedDep();
            }

        }

        @objid ("002e5acc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DocumentSmDependency extends SmMultipleDependency {
            @objid ("b52a097a-ef8a-4a24-ad88-f739f5cf23d0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mDocument != null)? ((ModelElementData)data).mDocument:SmMultipleDependency.EMPTY;
            }

            @objid ("ca23a96f-409c-45b5-a1b7-a234c0111a5d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mDocument = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mDocument;
            }

            @objid ("5ee43932-4414-4f23-ba40-bbd0611d14bb")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.SubjectDep();
            }

        }

        @objid ("002ec6f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TemplateSubstitutionSmDependency extends SmMultipleDependency {
            @objid ("5172ed01-a976-4a53-b990-eea2dabf106f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTemplateSubstitution != null)? ((ModelElementData)data).mTemplateSubstitution:SmMultipleDependency.EMPTY;
            }

            @objid ("721f65c4-3ae8-497d-a6da-cd3c1eceff87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTemplateSubstitution = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTemplateSubstitution;
            }

            @objid ("d29717e9-d1d4-4beb-8aae-2dc4194f634e")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterSubstitutionData.Metadata.ActualDep();
            }

        }

        @objid ("002f3208-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypingParameterSmDependency extends SmMultipleDependency {
            @objid ("c06da6dc-6a02-4d1b-86a2-ed4d3edc3713")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mTypingParameter != null)? ((ModelElementData)data).mTypingParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("3f373963-9c32-45b1-a7d8-e543f4bf11ca")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mTypingParameter = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mTypingParameter;
            }

            @objid ("3016231e-30c4-4b20-9af5-91647c2129f9")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.TypeDep();
            }

        }

        @objid ("002f9d92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingInstanceSmDependency extends SmMultipleDependency {
            @objid ("078a7944-4d62-4feb-94d3-c1631f93fbbf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingInstance != null)? ((ModelElementData)data).mRepresentingInstance:SmMultipleDependency.EMPTY;
            }

            @objid ("3b741153-b199-4771-ad5c-ef9ff625e321")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingInstance = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingInstance;
            }

            @objid ("f943d634-f75c-4c37-b1b1-fa9640f6f36a")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030195c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingConnectorSmDependency extends SmMultipleDependency {
            @objid ("aeef7037-56b0-46aa-af8a-89974ee763fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingConnector != null)? ((ModelElementData)data).mRepresentingConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("77b7bb97-2e84-4b17-b6c9-fba3aba2a75f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingConnector = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingConnector;
            }

            @objid ("1cf382d2-ebcc-4526-bbbd-6b80e92e7f95")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("00308ee6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingEndSmDependency extends SmMultipleDependency {
            @objid ("35df4899-ab93-464a-824f-c0db9e05c46d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingEnd != null)? ((ModelElementData)data).mRepresentingEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("4e632e24-2906-47e4-8456-970f3fc5b594")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingEnd = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingEnd;
            }

            @objid ("82fbfe1f-2342-4cc6-ac4b-4c7dc073a3d3")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentedFeatureDep();
            }

        }

        @objid ("0030fe80-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RepresentingPartitionSmDependency extends SmMultipleDependency {
            @objid ("641e0495-9240-443a-bc78-2c17ab1599b0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mRepresentingPartition != null)? ((ModelElementData)data).mRepresentingPartition:SmMultipleDependency.EMPTY;
            }

            @objid ("0fb06bb5-1fc7-4bb7-9a0b-476260bf2751")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mRepresentingPartition = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mRepresentingPartition;
            }

            @objid ("a31e07ca-2c36-4001-9d38-f675a8fc271c")
            @Override
            public SmDependency getSymetric() {
                return ActivityPartitionData.Metadata.RepresentedDep();
            }

        }

        @objid ("00317496-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceivedInfoSmDependency extends SmMultipleDependency {
            @objid ("2530ab3c-c777-4129-8d43-ac52eeb48fa9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mReceivedInfo != null)? ((ModelElementData)data).mReceivedInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("8f316b8c-8b33-4a82-9b32-544f0fac4902")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mReceivedInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mReceivedInfo;
            }

            @objid ("056edfcd-d091-43fe-9431-9e9efe6b61bc")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationTargetDep();
            }

        }

        @objid ("0031e23c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SentInfoSmDependency extends SmMultipleDependency {
            @objid ("3e4c5b94-1e59-40b9-a89e-1bd3efd50df5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mSentInfo != null)? ((ModelElementData)data).mSentInfo:SmMultipleDependency.EMPTY;
            }

            @objid ("632bfd2b-6366-4b69-b819-62e85808cf5a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mSentInfo = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mSentInfo;
            }

            @objid ("8877e922-25f2-44a6-8c86-a4c6a998c046")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.InformationSourceDep();
            }

        }

        @objid ("0032573a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BpmnLaneRefsSmDependency extends SmMultipleDependency {
            @objid ("fb2f39ba-38d2-4536-9ae9-ddc4a0c65d58")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mBpmnLaneRefs != null)? ((ModelElementData)data).mBpmnLaneRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("de31634f-27dc-49b5-bb0c-1112cf3255fc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mBpmnLaneRefs = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mBpmnLaneRefs;
            }

            @objid ("39994b61-5471-4305-af26-197da5f3bfbc")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.PartitionElementDep();
            }

        }

        @objid ("0061ca56-ec98-1098-b22e-001ec947cd2a")
        public static class LocalPropertiesSmDependency extends SmSingleDependency {
            @objid ("53fe9b81-fd26-4cbf-b3b4-8a783d2d2c5f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelElementData) data).mLocalProperties;
            }

            @objid ("f7592e47-d769-4c53-8b1c-d5b9dbe1ba8d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelElementData) data).mLocalProperties = value;
            }

            @objid ("fbe64ac2-6254-45d8-9f77-a3102a4c17bb")
            @Override
            public SmDependency getSymetric() {
                return LocalPropertyTableData.Metadata.LocalAnnotedDep();
            }

        }

        @objid ("006a066c-ec98-1098-b22e-001ec947cd2a")
        public static class PropertiesSmDependency extends SmMultipleDependency {
            @objid ("e7a8c447-8c3c-4818-b228-6fb40c452f63")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mProperties != null)? ((ModelElementData)data).mProperties:SmMultipleDependency.EMPTY;
            }

            @objid ("82477343-3bcc-4226-a4e9-fab060aa5edf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mProperties = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mProperties;
            }

            @objid ("dd33b3eb-7714-41c8-9e2c-fe562bf0664f")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableData.Metadata.OwnerDep();
            }

        }

        @objid ("637e21a6-97ca-432b-9e33-a1ea619eecf0")
        public static class MatrixSmDependency extends SmMultipleDependency {
            @objid ("cee9c36c-40b2-425c-ba0a-0299e1fbda48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelElementData)data).mMatrix != null)? ((ModelElementData)data).mMatrix:SmMultipleDependency.EMPTY;
            }

            @objid ("deb83804-8cb4-4990-8ca6-1c6f0ef820dc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelElementData) data).mMatrix = new ArrayList<>(initialCapacity);
                return ((ModelElementData) data).mMatrix;
            }

            @objid ("b69be681-9d23-4085-ad82-888ab01daeaa")
            @Override
            public SmDependency getSymetric() {
                return MatrixDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
