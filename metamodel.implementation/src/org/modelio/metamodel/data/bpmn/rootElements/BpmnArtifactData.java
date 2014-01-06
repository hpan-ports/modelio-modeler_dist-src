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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnArtifactImpl;
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

@objid ("0078e650-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnArtifact.class, factory=BpmnArtifactData.Metadata.ObjectFactory.class)
public abstract class BpmnArtifactData extends BpmnBaseElementData {
    @objid ("a1be4747-51bc-4c1e-bf3c-cd6319c11dff")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("43e55c72-6eb8-43e5-8bec-fb8623c6a2cf")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=0, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("6bd7a716-ed65-487b-842b-5535c4abf4d7")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("934b3cd4-7f85-42ee-9062-9aa96b2e4085")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00752ab0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e4451379-c58b-4bb2-984f-be0d498c2832")
        private static SmClass smClass = null;

        @objid ("a02a970e-8d28-411b-8249-b058e0014518")
        private static SmDependency SubProcessDep = null;

        @objid ("6b4068ac-4c43-4a74-91e3-01cb91b796e3")
        private static SmDependency CollaborationDep = null;

        @objid ("2562fc2c-ab2d-416f-9f37-e2a43c3e993e")
        private static SmDependency ProcessDep = null;

        @objid ("6dc349d3-a098-445e-93b1-4ec9d155fb4d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d61ac44-a82d-4ce8-9122-2baa0754d3ff")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("7deb86ad-dde8-4a06-bfdb-14d5ab78e165")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("4f023f4d-bc76-4ca6-8575-e8520c631717")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("354cfaf6-adc8-42f8-93c3-aa6a6b5d562d")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("735afc7e-3322-4323-963d-4cb3e254298f")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("8b4f954f-ed39-43f9-8431-0f57ed773acf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e52d7893-b74a-439b-b914-b12e37893e98")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("00756c1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fa212371-0c48-496c-8f4f-143146c4f0e9")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("089c7ffe-d376-4aee-9765-79c27cc02fc9")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0075cf10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("5811b522-c418-4eae-a587-76a8ddae08ed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mCollaboration;
            }

            @objid ("a2519280-b5a8-46c4-bab2-26be7b151c06")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mCollaboration = value;
            }

            @objid ("6f7a19d5-4ad2-4718-ae35-98ff2103a09a")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076444a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("275f04be-9a83-4101-bfd7-f4635511a744")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mSubProcess;
            }

            @objid ("aa3f7df3-686f-4900-9ba2-a8b363d701da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mSubProcess = value;
            }

            @objid ("6f6111e6-2e03-4a7f-afa1-745f20be883f")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076bf6a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("218269d7-64a7-4870-854c-618a758d89e0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mProcess;
            }

            @objid ("e58150fd-6794-45ec-8886-f280e57505f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mProcess = value;
            }

            @objid ("4f52839e-9b8d-4fee-9344-47158ce8bac6")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ArtifactDep();
            }

        }

    }

}
