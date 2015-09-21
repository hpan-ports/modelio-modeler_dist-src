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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
import org.modelio.metamodel.impl.analyst.RequirementContainerSmClass;
import org.modelio.metamodel.impl.analyst.RequirementSmClass;
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

@objid ("fb840253-53a2-492a-9a4c-f7e2b60db5e9")
public class RequirementSmClass extends AnalystElementSmClass {
    @objid ("2e12a1ba-3143-4191-8fdf-2e212311c03a")
    private SmDependency subRequirementDep;

    @objid ("b217b413-c47e-4056-a30f-2d62c7d782c1")
    private SmDependency ownerContainerDep;

    @objid ("7fed6c8d-abb8-40a3-81d5-8abb75091527")
    private SmDependency parentRequirementDep;

    @objid ("0c1b5f93-09cc-4da2-8645-274fe97820fb")
    private SmDependency archivedRequirementVersionDep;

    @objid ("af4fd11b-3604-478a-a3df-95986c491fc2")
    private SmDependency lastRequirementVersionDep;

    @objid ("fc1f388e-68a4-43ba-9530-30b01bfcdc98")
    public RequirementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("1fd4321e-4664-473d-9cb4-69bb713998d6")
    @Override
    public String getName() {
        return "Requirement";
    }

    @objid ("41dd4b8e-c457-4520-ae18-003fbcaf3ab1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d22e70c9-6ea3-4e0a-a4af-d0847a273539")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Requirement.class;
    }

    @objid ("33b02f04-45a2-439c-b315-96a33b1dd5af")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("c3dd3f77-9d79-4dd0-ba21-df4121903502")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a3ae5eb4-ce71-40e7-b48d-63ae408c7d83")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new RequirementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subRequirementDep = new SubRequirementSmDependency();
        this.subRequirementDep.init("SubRequirement", this, metamodel.getMClass("Requirement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subRequirementDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("RequirementContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.parentRequirementDep = new ParentRequirementSmDependency();
        this.parentRequirementDep.init("ParentRequirement", this, metamodel.getMClass("Requirement"), 0, 1 );
        registerDependency(this.parentRequirementDep);
        
        this.archivedRequirementVersionDep = new ArchivedRequirementVersionSmDependency();
        this.archivedRequirementVersionDep.init("ArchivedRequirementVersion", this, metamodel.getMClass("Requirement"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedRequirementVersionDep);
        
        this.lastRequirementVersionDep = new LastRequirementVersionSmDependency();
        this.lastRequirementVersionDep.init("LastRequirementVersion", this, metamodel.getMClass("Requirement"), 0, 1 );
        registerDependency(this.lastRequirementVersionDep);
    }

    @objid ("44495b10-df5b-4083-852d-711744de93f4")
    public SmDependency getSubRequirementDep() {
        if (this.subRequirementDep == null) {
        	this.subRequirementDep = this.getDependencyDef("SubRequirement");
        }
        return this.subRequirementDep;
    }

    @objid ("459ffaf4-1eb6-4ef9-9201-a6ef1bb19491")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("8a5ac3c4-b207-499e-b1ab-347b660ae20b")
    public SmDependency getParentRequirementDep() {
        if (this.parentRequirementDep == null) {
        	this.parentRequirementDep = this.getDependencyDef("ParentRequirement");
        }
        return this.parentRequirementDep;
    }

    @objid ("ea5bd9ec-b6f3-4ead-ad44-8e70dabdf379")
    public SmDependency getArchivedRequirementVersionDep() {
        if (this.archivedRequirementVersionDep == null) {
        	this.archivedRequirementVersionDep = this.getDependencyDef("ArchivedRequirementVersion");
        }
        return this.archivedRequirementVersionDep;
    }

    @objid ("bcaeb7ae-cabc-4064-8741-d0b180ffe67e")
    public SmDependency getLastRequirementVersionDep() {
        if (this.lastRequirementVersionDep == null) {
        	this.lastRequirementVersionDep = this.getDependencyDef("LastRequirementVersion");
        }
        return this.lastRequirementVersionDep;
    }

    @objid ("180b09e0-df42-419e-a5de-b88b51aa3b99")
    private static class RequirementObjectFactory implements ISmObjectFactory {
        @objid ("36521a11-72a6-4f6d-9045-f10b90545da2")
        private RequirementSmClass smClass;

        @objid ("c6951372-e27e-4e2d-9ac9-f44fdb1a618a")
        public RequirementObjectFactory(RequirementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4bdb0bc1-0d0b-4cdd-8c55-96067a0a6794")
        @Override
        public ISmObjectData createData() {
            return new RequirementData(this.smClass);
        }

        @objid ("78626fd9-2f15-4e35-9239-0f49e0549567")
        @Override
        public SmObjectImpl createImpl() {
            return new RequirementImpl();
        }

    }

    @objid ("2ddae822-5c0b-4ff0-b26e-dde8056a2f0a")
    public static class SubRequirementSmDependency extends SmMultipleDependency {
        @objid ("44a6716b-2b59-415e-9944-c70d4fc4983e")
        private SmDependency symetricDep;

        @objid ("6e72260b-7d0c-4fe8-bedb-7ef9940a82cb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequirementData)data).mSubRequirement != null)? ((RequirementData)data).mSubRequirement:SmMultipleDependency.EMPTY;
        }

        @objid ("b4c06c55-4167-49a5-aae8-b4fb0fde08d4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequirementData) data).mSubRequirement = values;
        }

        @objid ("10e5fc55-a9fd-425b-9b95-65c38a9118a8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementSmClass)this.getTarget()).getParentRequirementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c1a357a8-c839-4f82-9d1c-9ff8d5e7dcfd")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("7f5663c9-dafe-4f08-8dae-4da009a4ee12")
        private SmDependency symetricDep;

        @objid ("8f64592c-7194-49e3-a1c3-a0a3c0dd6a96")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequirementData) data).mOwnerContainer;
        }

        @objid ("7a9b6fb4-acd1-443b-8242-6629dea59133")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequirementData) data).mOwnerContainer = value;
        }

        @objid ("a6d9b14c-9dc5-4cc4-88d3-da2f5b36e196")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementContainerSmClass)this.getTarget()).getOwnedRequirementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("27547cd0-ef82-4585-8bbf-91fd4bc29619")
    public static class ParentRequirementSmDependency extends SmSingleDependency {
        @objid ("332032fa-2de0-4829-8305-c673b0da1758")
        private SmDependency symetricDep;

        @objid ("920cac59-367d-4832-b189-c977edda365a")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequirementData) data).mParentRequirement;
        }

        @objid ("d2afdc5c-f599-44ba-9986-9fd8f5d36f96")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequirementData) data).mParentRequirement = value;
        }

        @objid ("6f13ccba-19b2-4580-a45b-fb6e01ac6b2b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementSmClass)this.getTarget()).getSubRequirementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c1eb9f44-87ee-46a9-9ad9-67548630f1aa")
    public static class ArchivedRequirementVersionSmDependency extends SmMultipleDependency {
        @objid ("ff870470-0afd-4647-97fb-30a8929c00f1")
        private SmDependency symetricDep;

        @objid ("b417c132-b383-452c-bf8f-ba8d7a860a99")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequirementData)data).mArchivedRequirementVersion != null)? ((RequirementData)data).mArchivedRequirementVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("fdf17e32-eae3-41e8-a5d2-17447600aa1f")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequirementData) data).mArchivedRequirementVersion = values;
        }

        @objid ("f75bf0ed-05ce-4ce8-835e-350d04834b08")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementSmClass)this.getTarget()).getLastRequirementVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("27af40b4-ad2c-4089-b225-3e5b8432a3bb")
    public static class LastRequirementVersionSmDependency extends SmSingleDependency {
        @objid ("4d31c7a3-d275-4361-821a-4f6926a21da7")
        private SmDependency symetricDep;

        @objid ("2ea24479-56e1-4ba4-95a7-91c79f8c5219")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequirementData) data).mLastRequirementVersion;
        }

        @objid ("d387a6cf-00af-4bfb-afe6-77cdfc079690")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequirementData) data).mLastRequirementVersion = value;
        }

        @objid ("8739d897-89e2-4031-9820-e7271e1ecb20")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RequirementSmClass)this.getTarget()).getArchivedRequirementVersionDep();
            }
            return this.symetricDep;
        }

    }

}
