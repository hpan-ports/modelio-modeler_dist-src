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
    @objid ("16d2a640-9660-4281-ba3b-28a57634ba4d")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("67032002-c4b1-421b-a4fd-a037add7fbe2")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=0, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("188db527-ce34-4592-8ec7-f2a971afa1f0")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("80eefb55-66a5-4231-b5dd-b06f1e7053f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00752ab0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("35872c9e-6f9d-4ded-ad89-c4445d307f7d")
        private static SmClass smClass = null;

        @objid ("b45ad248-ac5b-49fd-ae4a-37a7fcbdc95e")
        private static SmDependency SubProcessDep = null;

        @objid ("5acb891e-1b3e-4082-96a1-2ede07ec1481")
        private static SmDependency CollaborationDep = null;

        @objid ("d24b29cc-2665-4ac5-8961-feaa7fac31fb")
        private static SmDependency ProcessDep = null;

        @objid ("823f97c9-9ad7-4b2f-ad4d-891257f0f51e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnArtifactData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c3ad8a86-03af-4f2f-8465-a300a0829412")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("94e5cf22-bdc1-4a78-8120-06a71bfecacf")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("ef192bd7-cfb3-4258-a1c3-55e03be81bd3")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("9d44105b-4606-49a2-b237-02aa6c30117f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b67c281a-6f08-4e10-b38c-1693632dd50d")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("bd1dcc9d-e646-4056-b65b-46b31e68ee18")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("75c69a34-7c92-435d-8dbc-4d80a61082fb")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("00756c1e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0a378455-6b40-4a32-ac78-920064d35e17")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5ec63df1-cca8-4d43-8876-e8383c455896")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0075cf10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("380108d6-3349-4be2-aba9-bed62febdf90")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mCollaboration;
            }

            @objid ("91222ca6-f2fa-435b-8d88-01c10976fbfd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mCollaboration = value;
            }

            @objid ("1563524d-581f-4f04-95c7-a84bac9b3b19")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076444a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("aa1b6f70-2448-4216-b7d5-6386653ad9c8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mSubProcess;
            }

            @objid ("5d704522-187e-4c91-80f1-879d513b8dec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mSubProcess = value;
            }

            @objid ("ec7c3dca-9438-43a1-a69f-e53a8148d642")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.ArtifactDep();
            }

        }

        @objid ("0076bf6a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("293a49b7-678b-490d-a4aa-9dc31b700d3f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnArtifactData) data).mProcess;
            }

            @objid ("a95843ec-a083-4afd-9615-73f95c4f258e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnArtifactData) data).mProcess = value;
            }

            @objid ("5baffbe0-4c65-4709-81f5-24ee0bb3d1dc")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ArtifactDep();
            }

        }

    }

}
