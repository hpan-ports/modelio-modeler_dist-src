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
    @objid ("24e06ae5-9321-4195-a426-04431e53eba3")
    @SmaMetaAssociation(metaName="ResourceRef", typeDataClass=BpmnResourceData.class, min=1, max=1, smAssociationClass=Metadata.ResourceRefSmDependency.class, partof = true)
     SmObjectImpl mResourceRef;

    @objid ("4eab0001-4e22-45d7-9826-14e1fdc9c26c")
    @SmaMetaAssociation(metaName="Annotated", typeDataClass=BpmnFlowNodeData.class, min=0, max=1, smAssociationClass=Metadata.AnnotatedSmDependency.class)
     SmObjectImpl mAnnotated;

    @objid ("b9dd52d5-dd95-4e27-970d-0e5b85261dde")
    @SmaMetaAssociation(metaName="ResourceParameterBinding", typeDataClass=BpmnResourceParameterBindingData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceParameterBindingSmDependency.class, component = true)
     List<SmObjectImpl> mResourceParameterBinding = null;

    @objid ("ac238080-f447-4bf7-b489-5c19103fbde9")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("63fc8902-a552-4d3c-9f9d-48cddf680b41")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0083df92-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("58fd16ac-4149-45d9-b836-1667d24f3e0b")
        private static SmClass smClass = null;

        @objid ("3fdc840c-20f5-46d9-b8ef-93d75da88f95")
        private static SmDependency ResourceRefDep = null;

        @objid ("c9c12e41-a00f-4903-bd0e-4c6550fb9aeb")
        private static SmDependency AnnotatedDep = null;

        @objid ("a5980725-1259-4484-8a95-905e107ec1ea")
        private static SmDependency ResourceParameterBindingDep = null;

        @objid ("a5a5f41e-d6df-43e3-97a7-8ec93f19acc3")
        private static SmDependency ProcessDep = null;

        @objid ("594fe297-0835-48e1-9e97-476ff1dd1f6b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceRoleData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ac06f9ae-76e5-4e8d-b21c-10020b5ad29e")
        public static SmDependency ResourceRefDep() {
            if (ResourceRefDep == null) {
            	ResourceRefDep = classof().getDependencyDef("ResourceRef");
            }
            return ResourceRefDep;
        }

        @objid ("b3d4be9c-4700-4432-9b00-2e6338513367")
        public static SmDependency AnnotatedDep() {
            if (AnnotatedDep == null) {
            	AnnotatedDep = classof().getDependencyDef("Annotated");
            }
            return AnnotatedDep;
        }

        @objid ("5c1c9dbb-1d7e-4bf1-bf27-aeba34b535e3")
        public static SmDependency ResourceParameterBindingDep() {
            if (ResourceParameterBindingDep == null) {
            	ResourceParameterBindingDep = classof().getDependencyDef("ResourceParameterBinding");
            }
            return ResourceParameterBindingDep;
        }

        @objid ("09dd1ea8-140b-4a8c-82df-d6b2366597a6")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("b9ab695a-db3d-4e78-858e-cc58591b69c1")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("de6dc297-18a5-4c28-a4cb-e04a15071cef")
        public static SmDependency getResourceParameterBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceParameterBindingDep;
        }

        @objid ("ff7c1d06-9b02-4e95-8709-c97d6a2a24f3")
        public static SmDependency getResourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceRefDep;
        }

        @objid ("88792c51-ea81-4c65-91a7-a3707f96222e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4635ba75-8aca-47ca-85a7-c3341729e8b6")
        public static SmDependency getAnnotatedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnnotatedDep;
        }

        @objid ("008420a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bd8dbcfb-143b-4b1a-aaf0-a431f47b8b65")
            public ISmObjectData createData() {
                return new BpmnResourceRoleData();
            }

            @objid ("46898e11-c514-45c1-a8da-c9d207fd419e")
            public SmObjectImpl createImpl() {
                return new BpmnResourceRoleImpl();
            }

        }

        @objid ("008483ca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceParameterBindingSmDependency extends SmMultipleDependency {
            @objid ("72cfc640-7187-46a6-b3e6-82bb26aebc6d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceRoleData)data).mResourceParameterBinding != null)? ((BpmnResourceRoleData)data).mResourceParameterBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("ee9b9c6c-4b07-417d-94a4-28c904c87da2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceRoleData) data).mResourceParameterBinding = new ArrayList<>(initialCapacity);
                return ((BpmnResourceRoleData) data).mResourceParameterBinding;
            }

            @objid ("adc2eb70-a2d1-495b-b4a8-7f7f30027434")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterBindingData.Metadata.ResourceRoleDep();
            }

        }

        @objid ("0084e680-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceRefSmDependency extends SmSingleDependency {
            @objid ("a5f86d67-98ba-4da2-aecc-7f1d58856ce6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mResourceRef;
            }

            @objid ("7bffa72c-84ef-4190-98a1-46d09be64cf5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mResourceRef = value;
            }

            @objid ("b927091b-4b99-4db9-96e1-7acc513d45ca")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceData.Metadata.ResourceroleRefsDep();
            }

        }

        @objid ("00855b88-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("3ded8180-8a51-452c-9642-6a62798c23aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mProcess;
            }

            @objid ("ad383017-5225-41ad-9490-ebb4e4f53adc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mProcess = value;
            }

            @objid ("625711ed-3008-4555-8663-f95c3e985dd0")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.ResourceDep();
            }

        }

        @objid ("0085d0f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AnnotatedSmDependency extends SmSingleDependency {
            @objid ("33f2d2db-446b-4f30-8215-aa31cbbe6519")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnResourceRoleData) data).mAnnotated;
            }

            @objid ("72ef0be2-2a23-45fe-aa0e-cf318477afff")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnResourceRoleData) data).mAnnotated = value;
            }

            @objid ("5181084d-6ad7-497f-804f-85041f5633b0")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.ResourceDep();
            }

        }

    }

}
