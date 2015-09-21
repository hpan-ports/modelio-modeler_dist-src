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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseSmClass;
import org.modelio.metamodel.impl.uml.statik.ConnectorEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryConnectorSmClass;
import org.modelio.metamodel.uml.statik.Binding;
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

@objid ("3652073c-5639-419d-bc73-dfae88421d53")
public class BindingSmClass extends ModelElementSmClass {
    @objid ("4c62b65e-92d7-4d40-ac81-ddbe41b39448")
    private SmDependency connectorEndRoleDep;

    @objid ("d75c30ee-6bd7-4d96-8128-f69564a95a06")
    private SmDependency connectorRoleDep;

    @objid ("6bdc6df6-fe9e-4e0e-b0b7-72b0862dab58")
    private SmDependency roleDep;

    @objid ("e8487dca-f735-4bb9-ba7c-c48143fff2d9")
    private SmDependency representedFeatureDep;

    @objid ("0c476980-d299-409c-b6b1-dc2a1032864a")
    private SmDependency ownerDep;

    @objid ("e72d926d-50a9-4303-914f-ccff4db68c92")
    public BindingSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("82304808-c9fc-42c1-9ac9-c4ca1ce0d999")
    @Override
    public String getName() {
        return "Binding";
    }

    @objid ("62089616-8976-455d-a4e3-5e8e76065c2a")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4b616d12-88d5-459f-b0c2-2475fe86d5e1")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Binding.class;
    }

    @objid ("99bc42da-1b20-4ce9-9a0c-ce84b9388be5")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("e9d00eee-f009-4e08-9b5d-751a11583d61")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("0dedbec0-4764-4e25-8224-681f90bca917")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new BindingObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.connectorEndRoleDep = new ConnectorEndRoleSmDependency();
        this.connectorEndRoleDep.init("ConnectorEndRole", this, metamodel.getMClass("ConnectorEnd"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.connectorEndRoleDep);
        
        this.connectorRoleDep = new ConnectorRoleSmDependency();
        this.connectorRoleDep.init("ConnectorRole", this, metamodel.getMClass("NaryConnector"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.connectorRoleDep);
        
        this.roleDep = new RoleSmDependency();
        this.roleDep.init("Role", this, metamodel.getMClass("BindableInstance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.roleDep);
        
        this.representedFeatureDep = new RepresentedFeatureSmDependency();
        this.representedFeatureDep.init("RepresentedFeature", this, metamodel.getMClass("ModelElement"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedFeatureDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("CollaborationUse"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("fa04e0e0-d8cb-4d1c-a5eb-673e449eaa2f")
    public SmDependency getConnectorEndRoleDep() {
        if (this.connectorEndRoleDep == null) {
        	this.connectorEndRoleDep = this.getDependencyDef("ConnectorEndRole");
        }
        return this.connectorEndRoleDep;
    }

    @objid ("f321831d-6163-4285-964e-7422af8e8eda")
    public SmDependency getConnectorRoleDep() {
        if (this.connectorRoleDep == null) {
        	this.connectorRoleDep = this.getDependencyDef("ConnectorRole");
        }
        return this.connectorRoleDep;
    }

    @objid ("febb9a3c-ca37-40d5-b85d-80cf3c1490e1")
    public SmDependency getRoleDep() {
        if (this.roleDep == null) {
        	this.roleDep = this.getDependencyDef("Role");
        }
        return this.roleDep;
    }

    @objid ("7f7e748a-a086-4a34-9b7d-548f56d174c8")
    public SmDependency getRepresentedFeatureDep() {
        if (this.representedFeatureDep == null) {
        	this.representedFeatureDep = this.getDependencyDef("RepresentedFeature");
        }
        return this.representedFeatureDep;
    }

    @objid ("3cdfce8d-2c65-448a-a083-84d3f9015a33")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("14994a27-a7eb-4015-acef-e13dee33317b")
    private static class BindingObjectFactory implements ISmObjectFactory {
        @objid ("a47f5698-dfba-4039-a3c7-fb89408ec1b5")
        private BindingSmClass smClass;

        @objid ("66557830-b8dd-4b55-b798-066375e4db4a")
        public BindingObjectFactory(BindingSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("e6d22c56-51c8-49a1-9d3e-34f65ea5291c")
        @Override
        public ISmObjectData createData() {
            return new BindingData(this.smClass);
        }

        @objid ("fc82419c-de4c-4e46-a6fa-e7139bbd1971")
        @Override
        public SmObjectImpl createImpl() {
            return new BindingImpl();
        }

    }

    @objid ("290051bf-d3c1-4699-8721-8d04b13676dd")
    public static class ConnectorEndRoleSmDependency extends SmSingleDependency {
        @objid ("929f20ed-38ad-4e63-913d-24d1029e393c")
        private SmDependency symetricDep;

        @objid ("eb31ec88-462e-49f2-9d99-1a268e744bf4")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindingData) data).mConnectorEndRole;
        }

        @objid ("70866562-08e0-4a0f-b4c8-e4edf26e1c94")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindingData) data).mConnectorEndRole = value;
        }

        @objid ("f84de1ff-950e-4008-8f95-0ec8c0226bd8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConnectorEndSmClass)this.getTarget()).getRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8fb90c53-7833-4cfb-8c1d-a107c2bea2c6")
    public static class ConnectorRoleSmDependency extends SmSingleDependency {
        @objid ("3f7f2c2b-e253-48f9-adf1-c06193d31da6")
        private SmDependency symetricDep;

        @objid ("1b8a962e-7f7d-4aaa-803f-2058a27ee654")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindingData) data).mConnectorRole;
        }

        @objid ("b6ae82ab-55f5-4481-b4eb-b730983d28cd")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindingData) data).mConnectorRole = value;
        }

        @objid ("89a118cc-ddc0-43dd-a269-4c9a1f26dc36")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryConnectorSmClass)this.getTarget()).getRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("95fc1caa-8c8c-43a6-b5ef-13c6cb21368e")
    public static class RoleSmDependency extends SmSingleDependency {
        @objid ("e56b4b12-8104-4f9f-b185-1d7baf843875")
        private SmDependency symetricDep;

        @objid ("4b96d658-a442-48e5-90ad-659c8db9f85f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindingData) data).mRole;
        }

        @objid ("d07f730d-597b-449f-a6fc-c00bd9707939")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindingData) data).mRole = value;
        }

        @objid ("fb6eab03-9940-423d-b782-29b4a88e43d8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindableInstanceSmClass)this.getTarget()).getRepresentationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("44802f4a-e18d-4d2f-b22c-dc2119f829db")
    public static class RepresentedFeatureSmDependency extends SmSingleDependency {
        @objid ("bb668cb6-a4eb-4e08-8c58-c7e1c685d192")
        private SmDependency symetricDep;

        @objid ("e9b64753-33bc-4a51-9e1b-450fd3646f1c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindingData) data).mRepresentedFeature;
        }

        @objid ("81e1d9e1-5c64-4d8c-8927-535505c70788")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindingData) data).mRepresentedFeature = value;
        }

        @objid ("22eb3740-b81e-46c3-8383-92fc93a10ff1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getRepresentsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ff131c14-d684-4aba-a21e-127024129a2f")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("91a6d051-e6d3-4117-93d3-da0224835465")
        private SmDependency symetricDep;

        @objid ("8500f69b-9a0f-4bc2-934f-19b6d6db4569")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindingData) data).mOwner;
        }

        @objid ("87fe3644-c6a2-492c-b2a2-51c46f62f997")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindingData) data).mOwner = value;
        }

        @objid ("828ea9a9-18b1-4eda-8540-56a2bc5c6cea")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationUseSmClass)this.getTarget()).getRoleBindingDep();
            }
            return this.symetricDep;
        }

    }

}
