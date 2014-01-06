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
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceParameterData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.resources.BpmnResourceImpl;
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

@objid ("0009a7d6-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnResource.class, factory=BpmnResourceData.Metadata.ObjectFactory.class)
public class BpmnResourceData extends BpmnRootElementData {
    @objid ("b78847ac-640c-4cc1-bb3d-b496ec1b4787")
    @SmaMetaAssociation(metaName="ResourceroleRefs", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceroleRefsSmDependency.class)
     List<SmObjectImpl> mResourceroleRefs = null;

    @objid ("cc68980b-f96c-4d36-a81f-083d2029d3d0")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("ffca5db5-8c21-4b12-8d33-13cea9c46d7a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007c39ae-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ddfaf8d5-affb-45d8-b381-e2cce78dab49")
        private static SmClass smClass = null;

        @objid ("af5c7883-9efd-433f-bc39-c80d5aa172bb")
        private static SmDependency ResourceroleRefsDep = null;

        @objid ("da9a097f-b7a0-4d8f-bbb5-22d79548323b")
        private static SmDependency ParameterDep = null;

        @objid ("ba21c7f9-756d-4551-ac99-6bcc49dc2fdd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b417f524-3076-45d1-9dfa-0239950afc4c")
        public static SmDependency ResourceroleRefsDep() {
            if (ResourceroleRefsDep == null) {
            	ResourceroleRefsDep = classof().getDependencyDef("ResourceroleRefs");
            }
            return ResourceroleRefsDep;
        }

        @objid ("d396fd73-47df-4014-be94-703f21d4cda6")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("6f3274c3-bb32-45f9-b34b-6c6dfdb588c3")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("8fe9c1f5-0a22-49fc-a776-76982d2a6292")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3d0e381b-2e64-44f7-b25b-e13d5d2484bd")
        public static SmDependency getResourceroleRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceroleRefsDep;
        }

        @objid ("007c7ac2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5430dce6-6cb5-4924-b8b0-82ae365722f2")
            public ISmObjectData createData() {
                return new BpmnResourceData();
            }

            @objid ("14dfe573-aef1-4ce2-9c38-48ed0efc295a")
            public SmObjectImpl createImpl() {
                return new BpmnResourceImpl();
            }

        }

        @objid ("007cdca6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("599b1672-101a-431c-bb51-622057baf40a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mParameter != null)? ((BpmnResourceData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("bc642e31-26ff-44d9-babc-1846e02331b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mParameter;
            }

            @objid ("680127bc-bdf8-4ea2-b8ca-2610b21556ae")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ResourceDep();
            }

        }

        @objid ("007d3f8e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceroleRefsSmDependency extends SmMultipleDependency {
            @objid ("69ed860a-2d4b-408b-b76d-9a60bb12554d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mResourceroleRefs != null)? ((BpmnResourceData)data).mResourceroleRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("18bd5d56-8449-4d54-96fe-ed37e0e44360")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mResourceroleRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mResourceroleRefs;
            }

            @objid ("6550b2a0-4be8-48bc-bf84-38ec3484f289")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceRefDep();
            }

        }

    }

}
