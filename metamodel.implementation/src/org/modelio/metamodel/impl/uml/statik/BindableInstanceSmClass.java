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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.BindingSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("929c1766-d895-4a01-9a64-35321250afcc")
public class BindableInstanceSmClass extends InstanceSmClass {
    @objid ("5b25ca5d-3b4e-4ada-bc51-452daae5f4bc")
    private SmDependency clusterDep;

    @objid ("d9726ed6-b643-4dce-9302-c18827d01348")
    private SmDependency internalOwnerDep;

    @objid ("7b0653ea-1bb9-4fe2-90e2-421751eace04")
    private SmDependency representationDep;

    @objid ("5500198b-2b56-4ada-8d41-8acdeab0d84e")
    private SmDependency representedFeatureDep;

    @objid ("af388d76-00c2-4831-b019-d46410f57f38")
    public BindableInstanceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3fdc7949-5027-4a18-8ae6-c2aab61857a2")
    @Override
    public String getName() {
        return "BindableInstance";
    }

    @objid ("f92e7b4d-5639-4499-b550-362d9f71eaf9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("9a68d69a-3a7c-4629-ba67-724c0b516543")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BindableInstance.class;
    }

    @objid ("691ce0f6-7be6-4fbe-82ba-fc03ab60fbd1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("c3692584-3006-435f-b146-c1624c835c41")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("e11efa2e-1522-4313-9be9-6db56750c5f0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Instance");
        this.registerFactory(new BindableInstanceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.clusterDep = new ClusterSmDependency();
        this.clusterDep.init("Cluster", this, metamodel.getMClass("Instance"), 0, 1 );
        registerDependency(this.clusterDep);
        
        this.internalOwnerDep = new InternalOwnerSmDependency();
        this.internalOwnerDep.init("InternalOwner", this, metamodel.getMClass("Classifier"), 0, 1 );
        registerDependency(this.internalOwnerDep);
        
        this.representationDep = new RepresentationSmDependency();
        this.representationDep.init("Representation", this, metamodel.getMClass("Binding"), 0, -1 );
        registerDependency(this.representationDep);
        
        this.representedFeatureDep = new RepresentedFeatureSmDependency();
        this.representedFeatureDep.init("RepresentedFeature", this, metamodel.getMClass("ModelElement"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedFeatureDep);
    }

    @objid ("59a32e61-3a84-4e5e-b336-f4921504eb74")
    public SmDependency getClusterDep() {
        if (this.clusterDep == null) {
        	this.clusterDep = this.getDependencyDef("Cluster");
        }
        return this.clusterDep;
    }

    @objid ("eb6b20b1-0956-474e-b678-5dd429abd961")
    public SmDependency getInternalOwnerDep() {
        if (this.internalOwnerDep == null) {
        	this.internalOwnerDep = this.getDependencyDef("InternalOwner");
        }
        return this.internalOwnerDep;
    }

    @objid ("33590760-a66c-41eb-8237-ce66f5d97162")
    public SmDependency getRepresentationDep() {
        if (this.representationDep == null) {
        	this.representationDep = this.getDependencyDef("Representation");
        }
        return this.representationDep;
    }

    @objid ("548a8a6c-c562-4d71-abc1-c41f73342a84")
    public SmDependency getRepresentedFeatureDep() {
        if (this.representedFeatureDep == null) {
        	this.representedFeatureDep = this.getDependencyDef("RepresentedFeature");
        }
        return this.representedFeatureDep;
    }

    @objid ("6f8a8638-c6f5-4126-916f-fdc853265cf5")
    private static class BindableInstanceObjectFactory implements ISmObjectFactory {
        @objid ("efa3aa2f-5e01-4047-92ab-755060995dca")
        private BindableInstanceSmClass smClass;

        @objid ("8c5e3af9-c5aa-451d-a6e4-87340d058fc8")
        public BindableInstanceObjectFactory(BindableInstanceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bd3b50c9-65e4-46f5-84cd-624ff9efeef8")
        @Override
        public ISmObjectData createData() {
            return new BindableInstanceData(this.smClass);
        }

        @objid ("1d181313-0474-476e-985f-489809076882")
        @Override
        public SmObjectImpl createImpl() {
            return new BindableInstanceImpl();
        }

    }

    @objid ("91e993ae-710e-4084-a0e0-537dabb315e2")
    public static class ClusterSmDependency extends SmSingleDependency {
        @objid ("7e93ff31-47c5-43d7-8fc4-4d8787f12195")
        private SmDependency symetricDep;

        @objid ("98c61da4-b32e-464a-ad12-2aa118c32fc8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindableInstanceData) data).mCluster;
        }

        @objid ("169f2625-b686-4a68-b8f5-126bfb629340")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindableInstanceData) data).mCluster = value;
        }

        @objid ("772dbecf-3edd-4739-83a6-37d27e0dc1a1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getPartDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7869d90d-b971-448e-b84f-9432ac570235")
    public static class InternalOwnerSmDependency extends SmSingleDependency {
        @objid ("1610139e-a442-4842-934b-5be0764b1a3c")
        private SmDependency symetricDep;

        @objid ("af538142-577e-4be9-8ce7-21cb1901eb89")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindableInstanceData) data).mInternalOwner;
        }

        @objid ("7cb0c3bc-0944-4f90-b369-7e3b4a99ee2b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindableInstanceData) data).mInternalOwner = value;
        }

        @objid ("ef3c54d2-069a-4364-a583-e1c5b8e2eb7c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getInternalStructureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b0ffc7e0-b139-47dd-9657-2516b1a008e3")
    public static class RepresentationSmDependency extends SmMultipleDependency {
        @objid ("d6601c9a-4a09-4c74-a01a-6d513271420a")
        private SmDependency symetricDep;

        @objid ("cce6a416-b0c6-476b-abe9-05c46795a871")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BindableInstanceData)data).mRepresentation != null)? ((BindableInstanceData)data).mRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("eda53705-affa-4a4f-b6b6-f6f5e3572d07")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BindableInstanceData) data).mRepresentation = values;
        }

        @objid ("9579b576-9b65-4779-8763-845cf301adb0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindingSmClass)this.getTarget()).getRoleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cd29492d-cf99-420e-b474-5d8b4ebc2df2")
    public static class RepresentedFeatureSmDependency extends SmSingleDependency {
        @objid ("063caef7-f272-4bbd-b11f-42fcb50a1254")
        private SmDependency symetricDep;

        @objid ("1368d38a-9cbc-413f-a9e1-7454c1fc2303")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BindableInstanceData) data).mRepresentedFeature;
        }

        @objid ("f4fe7372-c62e-4e93-94ec-38c94c83c010")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BindableInstanceData) data).mRepresentedFeature = value;
        }

        @objid ("6d3a5245-d371-422b-8d1a-db07186a01ab")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModelElementSmClass)this.getTarget()).getRepresentingInstanceDep();
            }
            return this.symetricDep;
        }

    }

}
