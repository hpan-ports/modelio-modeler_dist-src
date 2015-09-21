/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationSmClass;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a0fecca7-2a0e-44e5-9042-68ec6e233e00")
public class BpmnArtifactSmClass extends BpmnBaseElementSmClass {
    @objid ("212883ee-711f-42a0-8120-39744e56ac03")
    private SmDependency subProcessDep;

    @objid ("871fa3b9-e36e-4e03-9413-1e7ad6b5a1f3")
    private SmDependency collaborationDep;

    @objid ("abdb1c38-a330-4052-9a4e-86ac4305674f")
    private SmDependency processDep;

    @objid ("c0a595d9-d041-4128-8bdf-88c22484588b")
    public BpmnArtifactSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("21f215cf-6bf7-4585-89f1-205f06e3c793")
    @Override
    public String getName() {
        return "BpmnArtifact";
    }

    @objid ("cd830176-969f-453f-b1a7-3e2e6af1a2b5")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8d38e005-696c-4806-a987-586c92d2d9ee")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnArtifact.class;
    }

    @objid ("33123106-5fb3-40b1-9e66-0b640ab48e83")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("d8a3a8ab-d6ab-40cb-b732-cde0255a0881")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("c7b65980-abcd-4a44-9af2-7324fe87678f")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnBaseElement");
        this.registerFactory(new BpmnArtifactObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subProcessDep = new SubProcessSmDependency();
        this.subProcessDep.init("SubProcess", this, metamodel.getMClass("BpmnSubProcess"), 0, 1 );
        registerDependency(this.subProcessDep);
        
        this.collaborationDep = new CollaborationSmDependency();
        this.collaborationDep.init("Collaboration", this, metamodel.getMClass("BpmnCollaboration"), 0, 1 );
        registerDependency(this.collaborationDep);
        
        this.processDep = new ProcessSmDependency();
        this.processDep.init("Process", this, metamodel.getMClass("BpmnProcess"), 0, 1 );
        registerDependency(this.processDep);
    }

    @objid ("e41db59f-b023-45c2-b2a5-3920482d51fb")
    public SmDependency getSubProcessDep() {
        if (this.subProcessDep == null) {
        	this.subProcessDep = this.getDependencyDef("SubProcess");
        }
        return this.subProcessDep;
    }

    @objid ("7ad13de8-6269-48d9-8f46-0ffc63305a86")
    public SmDependency getCollaborationDep() {
        if (this.collaborationDep == null) {
        	this.collaborationDep = this.getDependencyDef("Collaboration");
        }
        return this.collaborationDep;
    }

    @objid ("dd241cf8-5596-4501-93c7-372d202199fc")
    public SmDependency getProcessDep() {
        if (this.processDep == null) {
        	this.processDep = this.getDependencyDef("Process");
        }
        return this.processDep;
    }

    @objid ("0c5f92f3-91b5-4711-a627-e71977e4bd2b")
    private static class BpmnArtifactObjectFactory implements ISmObjectFactory {
        @objid ("46db2ea3-d7f6-483a-a004-1cc1e753b80a")
        private BpmnArtifactSmClass smClass;

        @objid ("a4907775-db76-403b-a4e2-857080aaf08b")
        public BpmnArtifactObjectFactory(BpmnArtifactSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("53e98db5-8ca9-49da-8892-972a31224178")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("1777cf87-d345-4a9d-9e33-157a84bd0bca")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("59ae7e2e-248f-4a7e-b75a-454487b795dc")
    public static class SubProcessSmDependency extends SmSingleDependency {
        @objid ("e3a7d945-4827-4ee1-8e6b-8023ac91105d")
        private SmDependency symetricDep;

        @objid ("3ae556c1-9f9c-424c-8060-3ee94d5538d1")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnArtifactData) data).mSubProcess;
        }

        @objid ("71506657-4090-4296-9502-f47c83207e36")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnArtifactData) data).mSubProcess = value;
        }

        @objid ("ce6a89d6-cf14-4074-9c63-f6e850ba1175")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSubProcessSmClass)this.getTarget()).getArtifactDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c7c7db6b-ca3b-4ad8-a09d-753e82b6105e")
    public static class CollaborationSmDependency extends SmSingleDependency {
        @objid ("69924113-bf1f-43f3-b3de-f8d8cdd3872c")
        private SmDependency symetricDep;

        @objid ("80e0eba4-0fea-487a-b763-2e3c9a22111f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnArtifactData) data).mCollaboration;
        }

        @objid ("d525e585-46fb-4dee-a237-c235fc687add")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnArtifactData) data).mCollaboration = value;
        }

        @objid ("2e11c2cb-86a6-4caa-9998-177152bb01d6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCollaborationSmClass)this.getTarget()).getArtifactDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7fa04e3d-a730-4e52-adf8-3f0d7dfbbf0f")
    public static class ProcessSmDependency extends SmSingleDependency {
        @objid ("d5afef76-96a4-4b15-a07d-231a04e3e95d")
        private SmDependency symetricDep;

        @objid ("203b43b4-cf83-42d1-b0a5-bb2e3a872525")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnArtifactData) data).mProcess;
        }

        @objid ("2e9a0aa2-72bc-443a-856a-2b3b8b1bbe41")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnArtifactData) data).mProcess = value;
        }

        @objid ("3b1aaf77-030c-4162-83b7-8058d7fad99d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnProcessSmClass)this.getTarget()).getArtifactDep();
            }
            return this.symetricDep;
        }

    }

}
