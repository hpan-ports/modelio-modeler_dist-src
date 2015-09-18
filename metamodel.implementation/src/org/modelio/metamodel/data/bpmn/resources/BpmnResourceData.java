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
    @objid ("c2b39459-90e1-41b0-96e1-784540bb11ec")
    @SmaMetaAssociation(metaName="ResourceroleRefs", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceroleRefsSmDependency.class)
     List<SmObjectImpl> mResourceroleRefs = null;

    @objid ("d11d8d4e-98f5-4814-a46f-31f8450ba200")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("23216fe4-d4ab-4ed0-8176-59535d2c7162")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007c39ae-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d7e81f4c-489c-43e0-a748-df9d9cc0a9a8")
        private static SmClass smClass = null;

        @objid ("f7fb2ad3-2af4-4c07-ba36-ad9bb7094da4")
        private static SmDependency ResourceroleRefsDep = null;

        @objid ("7f4e49ee-0a54-4203-98c8-c7b8de96d42b")
        private static SmDependency ParameterDep = null;

        @objid ("97b6ea29-af3c-485f-9fb0-f0b3996cf211")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8523c6da-5e34-40e1-aa96-0b35a2e40d33")
        public static SmDependency ResourceroleRefsDep() {
            if (ResourceroleRefsDep == null) {
            	ResourceroleRefsDep = classof().getDependencyDef("ResourceroleRefs");
            }
            return ResourceroleRefsDep;
        }

        @objid ("6a4d7763-5f94-47de-a401-02a4b6103d8d")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("dea09c68-000d-4249-b823-cb5c79a445a8")
        public static SmDependency getResourceroleRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceroleRefsDep;
        }

        @objid ("2a510b68-c29d-46c3-80a1-f6024b92650e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d8246c7b-1e01-4dc9-a260-afbc3e25147d")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("007c7ac2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f9cbacde-d98e-4ccb-abcf-b3439cbd057c")
            public ISmObjectData createData() {
                return new BpmnResourceData();
            }

            @objid ("7044d7b7-8215-4a45-926b-000f03aec20d")
            public SmObjectImpl createImpl() {
                return new BpmnResourceImpl();
            }

        }

        @objid ("007cdca6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("7853c5a8-e752-460c-8fae-52fabbba9f02")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mParameter != null)? ((BpmnResourceData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("9812ebb4-7193-4f79-b2ac-865864241a25")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mParameter;
            }

            @objid ("9ea2e658-da8e-492a-a548-04df88ac20a5")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ResourceDep();
            }

        }

        @objid ("007d3f8e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceroleRefsSmDependency extends SmMultipleDependency {
            @objid ("695f4595-ce92-4ec7-9775-0c8e18d70762")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mResourceroleRefs != null)? ((BpmnResourceData)data).mResourceroleRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("210a749b-3213-481f-9ea4-bb6e41c2ed36")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mResourceroleRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mResourceroleRefs;
            }

            @objid ("146aed5e-8c9c-44e4-b7b3-dd6b847d670e")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceRefDep();
            }

        }

    }

}
