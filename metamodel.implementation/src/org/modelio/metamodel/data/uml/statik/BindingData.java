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
    @objid ("095d7452-6ff7-4442-8960-bf9a2d724436")
    @SmaMetaAssociation(metaName="ConnectorEndRole", typeDataClass=ConnectorEndData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorEndRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorEndRole;

    @objid ("65c25f40-fdd8-476c-add6-61933ee245e6")
    @SmaMetaAssociation(metaName="ConnectorRole", typeDataClass=NaryConnectorData.class, min=0, max=1, smAssociationClass=Metadata.ConnectorRoleSmDependency.class, partof = true)
     SmObjectImpl mConnectorRole;

    @objid ("ebdaa302-98f8-4f55-b9f1-e5b985886efe")
    @SmaMetaAssociation(metaName="Role", typeDataClass=BindableInstanceData.class, min=0, max=1, smAssociationClass=Metadata.RoleSmDependency.class, partof = true)
     SmObjectImpl mRole;

    @objid ("432d6dcb-191f-40c1-ab3c-5f8b4f35adb7")
    @SmaMetaAssociation(metaName="RepresentedFeature", typeDataClass=ModelElementData.class, min=1, max=1, smAssociationClass=Metadata.RepresentedFeatureSmDependency.class, partof = true)
     SmObjectImpl mRepresentedFeature;

    @objid ("8ade7b48-e406-452a-8d49-921634340bd3")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=CollaborationUseData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("1390a5c1-f680-42fd-bc18-c6cbccfab57d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0068f63c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d735fc65-5bf3-4f74-8a85-4463bcd4862e")
        private static SmClass smClass = null;

        @objid ("f8a7e0bf-e828-4f3d-adf2-ec59bdd78239")
        private static SmDependency ConnectorEndRoleDep = null;

        @objid ("2111f297-5689-41d4-8883-38dd259059d1")
        private static SmDependency ConnectorRoleDep = null;

        @objid ("d647987c-6036-4652-b3b8-88b44034de8a")
        private static SmDependency RoleDep = null;

        @objid ("589eeb1b-234a-41fc-983e-934296b5dca8")
        private static SmDependency RepresentedFeatureDep = null;

        @objid ("729ff1d2-6c2e-4dc6-8db2-c4e030c3363c")
        private static SmDependency OwnerDep = null;

        @objid ("7a3f2370-1f4f-4be6-915e-6d62b157ee1d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BindingData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d2a72c6b-9e44-40c3-8a5c-ca2f16a9f661")
        public static SmDependency ConnectorEndRoleDep() {
            if (ConnectorEndRoleDep == null) {
            	ConnectorEndRoleDep = classof().getDependencyDef("ConnectorEndRole");
            }
            return ConnectorEndRoleDep;
        }

        @objid ("0777f2a5-70fa-4c00-afd6-f8914c38d8ab")
        public static SmDependency ConnectorRoleDep() {
            if (ConnectorRoleDep == null) {
            	ConnectorRoleDep = classof().getDependencyDef("ConnectorRole");
            }
            return ConnectorRoleDep;
        }

        @objid ("868b8dfc-a0af-47f3-8b0f-799afb7c85f5")
        public static SmDependency RoleDep() {
            if (RoleDep == null) {
            	RoleDep = classof().getDependencyDef("Role");
            }
            return RoleDep;
        }

        @objid ("0bfad9ee-48e7-4a69-8808-f641ae504572")
        public static SmDependency RepresentedFeatureDep() {
            if (RepresentedFeatureDep == null) {
            	RepresentedFeatureDep = classof().getDependencyDef("RepresentedFeature");
            }
            return RepresentedFeatureDep;
        }

        @objid ("ccf9978c-d723-4c1e-abf7-0cdb4fbd6a83")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("79bde89c-54bf-459b-9e97-bceb23344476")
        public static SmDependency getRepresentedFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedFeatureDep;
        }

        @objid ("d14d50dd-6dd5-47de-89af-82bc1534940f")
        public static SmDependency getConnectorRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorRoleDep;
        }

        @objid ("7678b9e4-af7b-4d7c-b042-4c11d5375f23")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("e48d61b9-0b6a-4266-808e-b22bd7070aa9")
        public static SmDependency getRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleDep;
        }

        @objid ("f9222fb5-56a3-4d76-b552-d7962d15b0d2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d41d60d0-adba-44a3-9fbb-475710f53b21")
        public static SmDependency getConnectorEndRoleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorEndRoleDep;
        }

        @objid ("00693750-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("88815901-8d8b-4bc3-998c-4ee3f427ace4")
            public ISmObjectData createData() {
                return new BindingData();
            }

            @objid ("d8262cb9-64f4-43fe-a00f-3ca13d6459ce")
            public SmObjectImpl createImpl() {
                return new BindingImpl();
            }

        }

        @objid ("006999b6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RepresentedFeatureSmDependency extends SmSingleDependency {
            @objid ("c4ad196e-a11c-46eb-aa4b-bd2c1aab571b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRepresentedFeature;
            }

            @objid ("7aa4cc71-e14e-4724-94bd-2d7bc7498627")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRepresentedFeature = value;
            }

            @objid ("0b8978f3-8178-4403-86e8-eb9a7c6f6b9b")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.RepresentsDep();
            }

        }

        @objid ("006a0dba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("c95a9fca-cce3-40d8-a433-54dfd937be6e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mOwner;
            }

            @objid ("6f4b469c-e55b-4dbe-9d1b-687752a2bcb7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mOwner = value;
            }

            @objid ("03272959-59a1-4846-81b0-5e0e89a139cb")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.RoleBindingDep();
            }

        }

        @objid ("006a825e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorRoleSmDependency extends SmSingleDependency {
            @objid ("4d313d46-707e-4410-acba-c7c82dd92ab2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorRole;
            }

            @objid ("1895f8cb-56a2-44ce-ba8c-90127d47ca6f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorRole = value;
            }

            @objid ("cb42a45d-4dfe-4c3e-a059-4100c8f98396")
            @Override
            public SmDependency getSymetric() {
                return NaryConnectorData.Metadata.RepresentationDep();
            }

        }

        @objid ("006af75c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class RoleSmDependency extends SmSingleDependency {
            @objid ("dc78fa04-76c7-499a-a434-4b89ffc285a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mRole;
            }

            @objid ("e3dd4dec-6d03-4307-903c-c302e31f55e6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mRole = value;
            }

            @objid ("8ea26d4a-863f-4db2-b34c-e044953ed88d")
            @Override
            public SmDependency getSymetric() {
                return BindableInstanceData.Metadata.RepresentationDep();
            }

        }

        @objid ("006b6fe8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ConnectorEndRoleSmDependency extends SmSingleDependency {
            @objid ("74e251b0-cd70-44ba-a21f-e532807ff3b6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BindingData) data).mConnectorEndRole;
            }

            @objid ("61d6cd83-5ef6-451a-8246-fd48c55013d2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BindingData) data).mConnectorEndRole = value;
            }

            @objid ("91240d91-0446-478b-8889-9d9ee49c9780")
            @Override
            public SmDependency getSymetric() {
                return ConnectorEndData.Metadata.RepresentationDep();
            }

        }

    }

}
