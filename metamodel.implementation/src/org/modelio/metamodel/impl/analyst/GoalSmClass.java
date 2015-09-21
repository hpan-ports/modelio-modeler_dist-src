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
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.impl.analyst.AnalystElementSmClass;
import org.modelio.metamodel.impl.analyst.GoalContainerSmClass;
import org.modelio.metamodel.impl.analyst.GoalSmClass;
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

@objid ("0f40d75d-eaeb-496b-92c6-e2c7ad3c0af2")
public class GoalSmClass extends AnalystElementSmClass {
    @objid ("948060b7-b9f3-4aa4-b6c8-c91e1592e433")
    private SmDependency subGoalDep;

    @objid ("c627d80b-e684-4518-b814-421fa4169313")
    private SmDependency ownerContainerDep;

    @objid ("9bc88119-cd46-4b47-b5d4-5df1b1a4522e")
    private SmDependency parentGoalDep;

    @objid ("af2d7efc-b3b1-448c-b21b-c774a0aecf73")
    private SmDependency lastGoalVersionDep;

    @objid ("7e89a8fa-40da-4f4a-a9c9-22dc27235b1c")
    private SmDependency archivedGoalVersionDep;

    @objid ("a1daeecc-934e-4367-8f86-51919677bfcd")
    public GoalSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7bac7b89-eadb-43c6-8352-f40f5a31eb40")
    @Override
    public String getName() {
        return "Goal";
    }

    @objid ("781f6644-4598-4f69-8483-880672b40bf3")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("1f3a8f3b-cff6-4af8-8270-4bdb6eda81c6")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Goal.class;
    }

    @objid ("76346ac1-9359-4299-aa66-82c145a1f467")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("a30aaa22-6398-460c-af5d-e9dc4bd48632")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5a9ea3a1-ed36-4529-a643-5ac0fc5827e3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystElement");
        this.registerFactory(new GoalObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.subGoalDep = new SubGoalSmDependency();
        this.subGoalDep.init("SubGoal", this, metamodel.getMClass("Goal"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subGoalDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("GoalContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.parentGoalDep = new ParentGoalSmDependency();
        this.parentGoalDep.init("ParentGoal", this, metamodel.getMClass("Goal"), 0, 1 );
        registerDependency(this.parentGoalDep);
        
        this.lastGoalVersionDep = new LastGoalVersionSmDependency();
        this.lastGoalVersionDep.init("LastGoalVersion", this, metamodel.getMClass("Goal"), 0, 1 );
        registerDependency(this.lastGoalVersionDep);
        
        this.archivedGoalVersionDep = new ArchivedGoalVersionSmDependency();
        this.archivedGoalVersionDep.init("ArchivedGoalVersion", this, metamodel.getMClass("Goal"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.archivedGoalVersionDep);
    }

    @objid ("0760af95-3a40-44fe-bced-0c61e1a6abf7")
    public SmDependency getSubGoalDep() {
        if (this.subGoalDep == null) {
        	this.subGoalDep = this.getDependencyDef("SubGoal");
        }
        return this.subGoalDep;
    }

    @objid ("e7a13f90-5e26-46d7-9f39-ef88b8249bf6")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("2a1dccfc-bcb2-4ec4-9c59-30a4cb1629d0")
    public SmDependency getParentGoalDep() {
        if (this.parentGoalDep == null) {
        	this.parentGoalDep = this.getDependencyDef("ParentGoal");
        }
        return this.parentGoalDep;
    }

    @objid ("e93621e7-598b-49df-9e94-a5b847ac9ec2")
    public SmDependency getLastGoalVersionDep() {
        if (this.lastGoalVersionDep == null) {
        	this.lastGoalVersionDep = this.getDependencyDef("LastGoalVersion");
        }
        return this.lastGoalVersionDep;
    }

    @objid ("981bd5f9-d4e5-4b5d-a581-a51d5e4e3130")
    public SmDependency getArchivedGoalVersionDep() {
        if (this.archivedGoalVersionDep == null) {
        	this.archivedGoalVersionDep = this.getDependencyDef("ArchivedGoalVersion");
        }
        return this.archivedGoalVersionDep;
    }

    @objid ("eea36e17-aadb-479d-98bc-83d6ec277931")
    private static class GoalObjectFactory implements ISmObjectFactory {
        @objid ("8fcb0eb4-b4b6-4c77-aeb3-2c140086f939")
        private GoalSmClass smClass;

        @objid ("fc01b067-76cb-45c4-996c-b832739f83b5")
        public GoalObjectFactory(GoalSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c5af1ab9-dc23-4d91-aef6-24e7de1b7edb")
        @Override
        public ISmObjectData createData() {
            return new GoalData(this.smClass);
        }

        @objid ("cf58fdc5-46e3-4f4e-9a23-b23a7d8c6c35")
        @Override
        public SmObjectImpl createImpl() {
            return new GoalImpl();
        }

    }

    @objid ("cc3f8928-7ffe-4a40-a3ce-5fe39a5b7bab")
    public static class SubGoalSmDependency extends SmMultipleDependency {
        @objid ("481137f1-d76c-450f-8151-a68c5af7c764")
        private SmDependency symetricDep;

        @objid ("cc8a6b4e-f124-4cc6-9f9f-9cbf47845c7d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GoalData)data).mSubGoal != null)? ((GoalData)data).mSubGoal:SmMultipleDependency.EMPTY;
        }

        @objid ("fcf140f6-9dab-4781-aef7-dae6ee6cf455")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GoalData) data).mSubGoal = values;
        }

        @objid ("a10631b0-b99b-43fb-97d2-6e8b5b4a29cf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalSmClass)this.getTarget()).getParentGoalDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0a653170-7032-49e3-827d-6bedb40bcdf1")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("81ff634f-469c-4d8b-a4f7-bae714e1ca12")
        private SmDependency symetricDep;

        @objid ("a14ce3a5-d396-48c7-af4e-bdb37994f79b")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GoalData) data).mOwnerContainer;
        }

        @objid ("e1aafe49-f155-467c-9e8d-7a295ddd9191")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GoalData) data).mOwnerContainer = value;
        }

        @objid ("01e7ef0e-1f84-4726-8491-800d141a5775")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalContainerSmClass)this.getTarget()).getOwnedGoalDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d7ca352d-ddda-43d5-b111-ced9717f2832")
    public static class ParentGoalSmDependency extends SmSingleDependency {
        @objid ("382f57d0-55a6-4b46-802f-fb7703cafc67")
        private SmDependency symetricDep;

        @objid ("7a168942-19b7-477b-8dc5-87b6442984c9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GoalData) data).mParentGoal;
        }

        @objid ("c6e6ac81-fd87-4d89-91f0-eb59f3ed003d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GoalData) data).mParentGoal = value;
        }

        @objid ("f586ab07-cca0-4d71-876a-333de34b20d8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalSmClass)this.getTarget()).getSubGoalDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3e88d1d0-efcd-4619-9e05-642ab368f21a")
    public static class LastGoalVersionSmDependency extends SmSingleDependency {
        @objid ("3851d5c7-74d4-41e6-b4b3-59b592897742")
        private SmDependency symetricDep;

        @objid ("87b4e9a6-02fe-4117-aefe-6af68b1238f8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GoalData) data).mLastGoalVersion;
        }

        @objid ("b60b816a-1ef7-403b-aa94-cfb3abcbb644")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GoalData) data).mLastGoalVersion = value;
        }

        @objid ("eadabf42-8480-43b8-b4cf-c35a9c4b6438")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalSmClass)this.getTarget()).getArchivedGoalVersionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("88295bb1-fc54-4735-b246-1a405df00a85")
    public static class ArchivedGoalVersionSmDependency extends SmMultipleDependency {
        @objid ("6e7e1894-640c-456f-a86a-dcd7a9367511")
        private SmDependency symetricDep;

        @objid ("6918a911-5884-4b51-a22d-68d2cbe1c2dc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GoalData)data).mArchivedGoalVersion != null)? ((GoalData)data).mArchivedGoalVersion:SmMultipleDependency.EMPTY;
        }

        @objid ("36bf7648-97f0-462d-9f50-9859d90b9623")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GoalData) data).mArchivedGoalVersion = values;
        }

        @objid ("44154a57-2d06-41a3-a8d6-e3c25af8ba70")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalSmClass)this.getTarget()).getLastGoalVersionDep();
            }
            return this.symetricDep;
        }

    }

}
