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
    @objid ("72b31d28-98c5-4cc2-82f4-c3375265cf79")
    @SmaMetaAssociation(metaName="ResourceroleRefs", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceroleRefsSmDependency.class)
     List<SmObjectImpl> mResourceroleRefs = null;

    @objid ("8d3cf690-728c-4116-b561-30b71c07f44d")
    @SmaMetaAssociation(metaName="Parameter", typeDataClass=BpmnResourceParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ParameterSmDependency.class, component = true)
     List<SmObjectImpl> mParameter = null;

    @objid ("c7bfa548-cd17-4493-a703-ccf0fcd6c3e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("007c39ae-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("913a8969-b193-4a41-ab75-1c42683dc827")
        private static SmClass smClass = null;

        @objid ("f7ca3be7-a940-42b7-b30e-cec5d171e29e")
        private static SmDependency ResourceroleRefsDep = null;

        @objid ("cc0e9c1c-a8ae-46af-93d2-d9b4551cb282")
        private static SmDependency ParameterDep = null;

        @objid ("5261f0ac-fc45-4ab6-a58e-e87265ed5aee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnResourceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5b4bb0de-211f-4aba-aa0a-f8008e24bbcf")
        public static SmDependency ResourceroleRefsDep() {
            if (ResourceroleRefsDep == null) {
            	ResourceroleRefsDep = classof().getDependencyDef("ResourceroleRefs");
            }
            return ResourceroleRefsDep;
        }

        @objid ("8dd33347-b909-4796-9b6a-850590ac7141")
        public static SmDependency ParameterDep() {
            if (ParameterDep == null) {
            	ParameterDep = classof().getDependencyDef("Parameter");
            }
            return ParameterDep;
        }

        @objid ("aaaa16a6-186b-40c8-bdb9-e2bd5c883add")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2db87610-e1c9-4daf-bbce-d35e0df7dae4")
        public static SmDependency getParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParameterDep;
        }

        @objid ("3bd3377b-32e8-4d08-b4e7-83022cb8634b")
        public static SmDependency getResourceroleRefsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceroleRefsDep;
        }

        @objid ("007c7ac2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("822cf325-b030-4db4-a60b-fbe16d09b38f")
            public ISmObjectData createData() {
                return new BpmnResourceData();
            }

            @objid ("bcf490fe-889c-440f-b78b-5820357f7a1d")
            public SmObjectImpl createImpl() {
                return new BpmnResourceImpl();
            }

        }

        @objid ("007cdca6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParameterSmDependency extends SmMultipleDependency {
            @objid ("750a6760-56e9-4a51-83f4-be2b1b94814b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mParameter != null)? ((BpmnResourceData)data).mParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("ee4f5a4a-4df5-4c68-91f7-8b85a7419c50")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mParameter = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mParameter;
            }

            @objid ("1b9ef599-cc8a-4493-ab5b-ce69db5ca416")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceParameterData.Metadata.ResourceDep();
            }

        }

        @objid ("007d3f8e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceroleRefsSmDependency extends SmMultipleDependency {
            @objid ("124b20a1-c7e3-4fa4-bfcc-1938986aef6a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnResourceData)data).mResourceroleRefs != null)? ((BpmnResourceData)data).mResourceroleRefs:SmMultipleDependency.EMPTY;
            }

            @objid ("a7eb9f3f-582a-459d-9b70-80102b5883b9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnResourceData) data).mResourceroleRefs = new ArrayList<>(initialCapacity);
                return ((BpmnResourceData) data).mResourceroleRefs;
            }

            @objid ("38fe7782-8bab-4bf8-af39-d9a043bb2809")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ResourceRefDep();
            }

        }

    }

}
