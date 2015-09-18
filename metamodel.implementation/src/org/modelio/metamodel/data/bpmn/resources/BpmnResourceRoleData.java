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
    @objid ("fa6fec45-ace2-4806-89a8-bded1cab2f5c")
    @SmaMetaAssociation(metaName="ResourceRef", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRefSmDependency.class, partof = true)
     SmObjectImpl mResourceRef;

    @objid ("640ed93a-a5ad-447e-b1d2-5f95c49a224f")
    @SmaMetaAssociation(metaName="Annotated", typeDataClass=BpmnFlowNodeData.class, min=0, max=1, smAssociationClass=Metadata.AnnotatedSmDependency.class)
     SmObjectImpl mAnnotated;

    @objid ("f16bfcdc-57d0-4468-8e23-ff268f5983af")
    @SmaMetaAssociation(metaName="ResourceParameterBinding", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceParameterBindingSmDependency.class, component = true)
     List<SmObjectImpl> mResourceParameterBinding = null;

    @objid ("8eb2c00f-db49-43b7-90a7-da863d3a1b1c")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("2f86eab5-bb04-4e19-af23-05ba39dea0da")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0083df92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("785c3dfe-159e-4894-8f07-28b7b82e9578")
        private static SmClass smClass = null;

        @objid ("fbd3228d-db6a-44b0-a212-2ae7f0d71d47")
        private static SmDependency ResourceRefDep = null;

        @objid ("e2ee4131-77b0-46fb-9c52-3b2558e2fa3d")
        private static SmDependency AnnotatedDep = null;

        @objid ("3df03fd9-1968-407b-95b8-c951e8794819")
        private static SmDependency ResourceParameterBindingDep = null;

        @objid ("605537f7-0d1e-4912-ae8e-e8f0605dbe55")
        private static SmDependency ProcessDep = null;

        @objid ("0ab50e1f-029f-47fe-bede-48fbdc22f924")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceRoleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ce4c3cb2-f1ae-4eb3-a35b-3373b778d06a")
        public static SmDependency ResourceRefDep() {
            if (ResourceRefDep == null) {
            	ResourceRefDep = classof().getDependencyDef("ResourceRef");
            }
            return ResourceRefDep;
        }

        @objid ("bd67441a-69f5-4002-8920-194edc02b144")
        public static SmDependency AnnotatedDep() {
            if (AnnotatedDep == null) {
            	AnnotatedDep = classof().getDependencyDef("Annotated");
            }
            return AnnotatedDep;
        }

        @objid ("1a657e80-fc27-4e45-8bf4-6b0b74a81041")
        public static SmDependency ResourceParameterBindingDep() {
            if (ResourceParameterBindingDep == null) {
            	ResourceParameterBindingDep = classof().getDependencyDef("ResourceParameterBinding");
            }
            return ResourceParameterBindingDep;
        }

        @objid ("a0d80d75-7836-46fa-8995-18a28823e263")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("be0f5de6-871f-41c0-ac58-23ba50ee5a3f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("179bfc97-4637-4b8c-bf3b-23411ea90c4d")
        public static SmDependency getResourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRefDep;
        }

        @objid ("062f7b36-1ff6-4e08-b5eb-c01ae01784cc")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("87ad5e0a-9024-4487-8ecc-ee3917b7e4d1")
        public static SmDependency getAnnotatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotatedDep;
        }

        @objid ("160e436e-4028-4e64-80e1-01c52f590e2c")
        public static SmDependency getResourceParameterBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceParameterBindingDep;
        }

        @objid ("008420a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("44ba25f6-f514-408e-a682-a5d7e8c2841b")
            public ISmObjectData createData() {
                return new BpmnResourceRoleData();
            }

            @objid ("b9885b64-6ff1-4efc-9f1a-cd3e1d9d7b3e")
            public SmObjectImpl createImpl() {
                return new BpmnResourceRoleImpl();
            }

        }

        @objid ("008483ca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceParameterBindingSmDependency extends SmMultipleDependency {
            @objid ("c8f52bf8-58b0-4fee-8be6-0f174586d1a2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceRoleData)data).mResourceParameterBinding != null)? ((BpmnResourceRoleData)data).mResourceParameterBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("3c674dc0-ab6c-4242-bac0-9473c3060da8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceRoleData) data).mResourceParameterBinding = new ArrayList<>(initialCapacity);
                return ((BpmnResourceRoleData) data).mResourceParameterBinding;
            }

            @objid ("3b5c16f3-17ea-4b61-aa1b-9594545ce2bc")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ResourceRoleDep();
            }

        }

        @objid ("0084e680-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceRefSmDependency extends SmSingleDependency {
            @objid ("85466c24-a019-4ead-9e63-8a5e67bff99f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mResourceRef;
            }

            @objid ("3d7275e6-b5f1-48f5-8d54-3bcbb4013c73")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mResourceRef = value;
            }

            @objid ("685f4613-6e5a-41b9-a4d3-24de2083b7a7")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ResourceroleRefsDep();
            }

        }

        @objid ("00855b88-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("2f0811a4-9203-4de3-9dec-bc7295d4ffa9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mProcess;
            }

            @objid ("901a2aac-0e2a-4999-8484-f28fe3305cd8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mProcess = value;
            }

            @objid ("954bc447-ccd6-4633-9620-d800c7a1111a")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ResourceDep();
            }

        }

        @objid ("0085d0f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotatedSmDependency extends SmSingleDependency {
            @objid ("2f1f6939-faf7-4de7-9425-f55af0585b19")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mAnnotated;
            }

            @objid ("bc631c75-d3e3-4fe5-a047-8a9092b89015")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mAnnotated = value;
            }

            @objid ("351d36c0-7f2d-4de5-8679-5dbeb34f73a2")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.ResourceDep();
            }

        }

    }

}
