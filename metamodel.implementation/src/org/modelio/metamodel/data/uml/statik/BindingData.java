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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindableInstanceData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ConnectorEndData;
import org.modelio.metamodel.data.uml.statik.NaryConnectorData;
import org.modelio.metamodel.impl.uml.statik.BindingImpl;
import org.modelio.metamodel.uml.statik.Binding;
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

@objid ("0001ce8a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Binding.class, factory=BindingData.Metadata.ObjectFactory.class)
public class BindingData extends ModelElementData {
    @objid ("9aa45a69-6c6f-488e-a1b4-44c3a810817e")
    @SmaMetaAssociation(metaName="ConnectorEndRole", typeDataClass=ConnectorEndData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorEndRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorEndRole;

    @objid ("0ea955c2-4906-45f0-8a1d-dea3006a2d6d")
    @SmaMetaAssociation(metaName="ConnectorRole", typeDataClass=NaryConnectorData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorRole;

    @objid ("d350f3b0-4117-48f5-ba89-47bf3f18626a")
    @SmaMetaAssociation(metaName="Role", typeDataClass=BindableInstanceData.class, min=0, max=1, smAssociationClass=Metadata.RoleSmDependency.class, partof = true)
     SmObjectImpl mRole;

    @objid ("96e40a75-b99b-44ae-b27e-34afa107558f")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("d5945aa1-f9e5-4b9a-8902-190dd2db6403")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CollaborationUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("920d3740-42ab-481c-8722-da0bf065204e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068f63c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("250a56b8-b232-4b60-936d-30df33b34655")
        private static SmClass smClass = null;

        @objid ("190039ff-4593-48b8-8ec2-c7dfa802bfd3")
        private static SmDependency ConnectorEndRoleDep = null;

        @objid ("2194c820-bf79-4400-84be-835f9884b385")
        private static SmDependency ConnectorRoleDep = null;

        @objid ("1b3e2830-4029-412e-b1ef-1961f3d8a754")
        private static SmDependency RoleDep = null;

        @objid ("ec33967c-4d2a-4774-94b8-cef6f20b537f")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("63548fa2-9780-4222-936a-f227c78c8b51")
        private static SmDependency OwnerDep = null;

        @objid ("7be97f89-8fcb-4d30-8f39-90110c73e1c9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("64b48771-4b52-4403-bed3-438a5abd3eea")
        public static SmDependency ConnectorEndRoleDep() {
            if (ConnectorEndRoleDep == null) {
            	ConnectorEndRoleDep = classof().getDependencyDef("ConnectorEndRole");
            }
            return ConnectorEndRoleDep;
        }

        @objid ("e52318c6-0e9b-47d6-8f88-3d8d11c1abef")
        public static SmDependency ConnectorRoleDep() {
            if (ConnectorRoleDep == null) {
            	ConnectorRoleDep = classof().getDependencyDef("ConnectorRole");
            }
            return ConnectorRoleDep;
        }

        @objid ("6b7064e3-87a8-45f5-99d4-fc253b75cbf2")
        public static SmDependency RoleDep() {
            if (RoleDep == null) {
            	RoleDep = classof().getDependencyDef("Role");
            }
            return RoleDep;
        }

        @objid ("e16828d5-5a27-45dd-9695-d8d18dd0cc9d")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("ca9813aa-2fbd-424c-8a83-9aab8ba6d3f8")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("b67a531a-79e9-4e20-90bb-7cbe1766fa1c")
        public static SmDependency getConnectorEndRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorEndRoleDep;
        }

        @objid ("2811067e-a99e-4cc0-9be2-4cc6b9124b98")
        public static SmDependency getRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleDep;
        }

        @objid ("926f1d83-8687-4d48-87cb-2f0e2c83c3ef")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("7baed60d-94c7-4f49-beb7-6bc7b7bde316")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("03479a8f-00f7-4231-aea7-da8536c58db4")
        public static SmDependency getConnectorRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorRoleDep;
        }

        @objid ("79cd498d-978c-48bb-8621-0e86a5e3e6e8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00693750-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("443f6f44-8149-424c-ac3e-5ea07b163dd0")
            public ISmObjectData createData() {
                return new BindingData();
            }

            @objid ("faa1d7c2-ee15-47ba-ae67-7395eaed0aa3")
            public SmObjectImpl createImpl() {
                return new BindingImpl();
            }

        }

        @objid ("006999b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("daccb163-5387-49e2-abff-0cab0ab88551")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRepresentedFeature;
            }

            @objid ("9ea9d63c-27f7-4734-b0c1-a06785f87a06")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRepresentedFeature = value;
            }

            @objid ("ab63490d-081b-4b17-8abf-9f028a8b3594")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentsDep();
            }

        }

        @objid ("006a0dba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("af0e131a-0810-49cb-8811-cc931938f894")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mOwner;
            }

            @objid ("3128dd15-53b6-4853-9165-60f4bfadbd56")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mOwner = value;
            }

            @objid ("0131df4e-d68d-42d3-88ff-0b611d973292")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.RoleBindingDep();
            }

        }

        @objid ("006a825e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorRoleSmDependency extends SmSingleDependency {
            @objid ("da2f020b-554a-4855-b87e-ae159aa92143")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorRole;
            }

            @objid ("6542cc27-e075-4bc4-9090-c484273a7463")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorRole = value;
            }

            @objid ("de7819e0-922a-41c3-9aa2-99304e501faa")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentationDep();
            }

        }

        @objid ("006af75c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RoleSmDependency extends SmSingleDependency {
            @objid ("d8ee6aba-99d0-430b-8962-1df3511aeb6a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRole;
            }

            @objid ("27865564-dd9b-4ab8-ab15-b523b134daf6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRole = value;
            }

            @objid ("388eef00-f97d-41f9-b930-3ee279d36d95")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentationDep();
            }

        }

        @objid ("006b6fe8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorEndRoleSmDependency extends SmSingleDependency {
            @objid ("cfe8c888-0ed9-45eb-9650-00f57f17964d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorEndRole;
            }

            @objid ("8414870c-4f21-4030-9d61-79a53fc514a9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorEndRole = value;
            }

            @objid ("bf79e09f-97e5-4ea8-b80c-b909b6079218")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentationDep();
            }

        }

    }

}
