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
package org.modelio.metamodel.data.bpmn.resources;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterBindingData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceRoleImpl;
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

@objid ("000aeda8-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResourceRole.class, factory=BpmnResourceRoleData.Metadata.ObjectFactory.class)
public class BpmnResourceRoleData extends BpmnBaseElementData {
    @objid ("1d7857c8-03df-4faf-a96a-8f760e9ba200")
    @SmaMetaAssociation(metaName="ResourceRef", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRefSmDependency.class, partof = true)
     SmObjectImpl mResourceRef;

    @objid ("fd5a047f-a26b-43b0-abd1-1b2f8f319887")
    @SmaMetaAssociation(metaName="Annotated", typeDataClass=BpmnFlowNodeData.class, min=0, max=1, smAssociationClass=Metadata.AnnotatedSmDependency.class)
     SmObjectImpl mAnnotated;

    @objid ("829e20a2-b23e-4702-9702-459c10443a6a")
    @SmaMetaAssociation(metaName="ResourceParameterBinding", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceParameterBindingSmDependency.class, component = true)
     List<SmObjectImpl> mResourceParameterBinding = null;

    @objid ("689666d8-87ce-43da-86af-f338136c5d8c")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("104f2ced-7778-4882-a274-7f8a2dc3b457")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0083df92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cf2d3df7-18f3-4610-838a-e2a744615d6e")
        private static SmClass smClass = null;

        @objid ("e63680ec-4cc8-4558-8d0a-833c317d0243")
        private static SmDependency ResourceRefDep = null;

        @objid ("eb1b5cd6-6aac-4bfe-bc84-6829c5439380")
        private static SmDependency AnnotatedDep = null;

        @objid ("b9236a86-b782-4245-aafb-8693301fdddd")
        private static SmDependency ResourceParameterBindingDep = null;

        @objid ("0248580d-561e-47a9-9f20-aaea97579ae2")
        private static SmDependency ProcessDep = null;

        @objid ("00fe71f7-cf95-4033-9e24-a75b3f289ee7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceRoleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2fcd5af5-7299-412b-869b-4766da574799")
        public static SmDependency ResourceRefDep() {
            if (ResourceRefDep == null) {
            	ResourceRefDep = classof().getDependencyDef("ResourceRef");
            }
            return ResourceRefDep;
        }

        @objid ("38c3da9e-ecf3-42fb-ac75-cf514d85ad54")
        public static SmDependency AnnotatedDep() {
            if (AnnotatedDep == null) {
            	AnnotatedDep = classof().getDependencyDef("Annotated");
            }
            return AnnotatedDep;
        }

        @objid ("063c0807-9cf8-48f4-b405-884683405bd7")
        public static SmDependency ResourceParameterBindingDep() {
            if (ResourceParameterBindingDep == null) {
            	ResourceParameterBindingDep = classof().getDependencyDef("ResourceParameterBinding");
            }
            return ResourceParameterBindingDep;
        }

        @objid ("6d7addf7-13c0-4d00-ba6d-f51683de8a7f")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("253ce04e-8795-40f0-a23c-9d03ae4dd515")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("31faa4ff-4d4c-4799-aab9-9b43606190a9")
        public static SmDependency getResourceParameterBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceParameterBindingDep;
        }

        @objid ("befda74e-abad-4c4b-bee8-8a3ac1e1166b")
        public static SmDependency getAnnotatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotatedDep;
        }

        @objid ("81770e57-4546-4717-97f6-cb5a07c380d3")
        public static SmDependency getResourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRefDep;
        }

        @objid ("c6c1dc15-d6da-408c-9b84-be5ca7ead243")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("008420a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("04bc613b-10e2-4b18-8a14-68341a48795f")
            public ISmObjectData createData() {
                return new BpmnResourceRoleData();
            }

            @objid ("4629b287-b4de-4a57-be6f-0a05eb2e64f8")
            public SmObjectImpl createImpl() {
                return new BpmnResourceRoleImpl();
            }

        }

        @objid ("008483ca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceParameterBindingSmDependency extends SmMultipleDependency {
            @objid ("37b14633-7ad0-4e46-9cca-890d0863c1fd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceRoleData)data).mResourceParameterBinding != null)? ((BpmnResourceRoleData)data).mResourceParameterBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("f715bdd0-7706-4b41-bff3-346bd2cb2ae5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceRoleData) data).mResourceParameterBinding = new ArrayList<>(initialCapacity);
                return ((BpmnResourceRoleData) data).mResourceParameterBinding;
            }

            @objid ("53461611-91bd-42fa-a93d-9f1b6dd852e4")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ResourceRoleDep();
            }

        }

        @objid ("0084e680-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceRefSmDependency extends SmSingleDependency {
            @objid ("644f23e3-86d3-4cd6-ab81-6d0a47b5c294")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mResourceRef;
            }

            @objid ("e5430293-90de-4549-b9fa-7eecdb517f13")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mResourceRef = value;
            }

            @objid ("d24c26ac-f69b-4316-9c92-b7a6226654a6")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ResourceroleRefsDep();
            }

        }

        @objid ("00855b88-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("62595047-8898-48a8-81e5-7f423b2e3f00")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mProcess;
            }

            @objid ("380fb69c-7c1b-4f81-a53a-abcbb5f2d6d5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mProcess = value;
            }

            @objid ("8719a76f-bca5-4c17-b2fa-f177a2cc7e26")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ResourceDep();
            }

        }

        @objid ("0085d0f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotatedSmDependency extends SmSingleDependency {
            @objid ("bcc33a53-1a3d-4ac4-9227-df5a8acf837a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mAnnotated;
            }

            @objid ("b1a622cf-d7ba-4f2d-afa0-9c50fb7534f4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mAnnotated = value;
            }

            @objid ("327ceab8-afa2-46d8-bedf-1548c2b23bbe")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.ResourceDep();
            }

        }

    }

}
