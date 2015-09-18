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
    @objid ("e23a64aa-58e1-4848-bd6b-f5de7ac51ac2")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("3239071e-4080-4463-80a1-14b87cf7e33e")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=0, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("cddb2acd-d26c-40c4-8868-befef7db997b")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("d7bf1c5d-cf29-4a9c-92f2-c12cf5e5cdb3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00752ab0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("48ceb8bf-76a0-4e09-ab41-733c69744c72")
        private static SmClass smClass = null;

        @objid ("0dda2856-7e1c-4311-a76c-e45a2964f6e9")
        private static SmDependency SubProcessDep = null;

        @objid ("4e70dd99-903f-4923-be27-c5e91b3b0a4f")
        private static SmDependency CollaborationDep = null;

        @objid ("5d389ec0-e5f2-4923-9530-ce0e86612e4d")
        private static SmDependency ProcessDep = null;

        @objid ("a6681431-597a-438f-a6cc-8aa535921c7e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0431010d-30d4-4da5-93af-b9c253f3a68b")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("8deb52e0-5b8d-46c8-b4f8-479155afa67e")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("41aec33a-e35a-42df-8fbd-455043549542")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("6e865863-02f8-4017-bf5c-2c28fa1414b8")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("d9f3bd73-af1b-408d-9fec-acffda1e613e")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("60d33802-8383-4339-a27e-7b14d4436ab9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("823cba0f-e898-47ad-aa86-40a1f096f927")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("00756c1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0ae64084-6e27-4095-b628-81e494a60f34")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("1e6c08bb-e4ce-45a0-8645-c98b671358c5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0075cf10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("82b7dd70-5f90-46e7-8a3e-7b05404dec74")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mCollaboration;
            }

            @objid ("a6b39e08-3bb1-4124-9362-faa30129bcba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mCollaboration = value;
            }

            @objid ("f0291f61-693c-4ecd-9976-92c863811531")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076444a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("7edf6196-5442-4126-8cae-0f5dad4586fe")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mSubProcess;
            }

            @objid ("c91a0f7b-750a-46cf-87c7-f1f2ac173ca6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mSubProcess = value;
            }

            @objid ("c56d0599-1f79-46ca-895a-566f33fe234f")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076bf6a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("d1f4fe03-bd81-479d-a22b-c7fc1b6665ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mProcess;
            }

            @objid ("52f31a43-0384-495a-8c5d-baa9640d24c0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mProcess = value;
            }

            @objid ("422e2108-5a0d-43a6-bc63-d7dbd06d8b27")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ArtifactDep();
            }

        }

    }

}
