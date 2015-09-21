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
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
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

@objid ("46b3c1cb-358b-4685-a2d7-9c6dec17dc81")
public class GoalContainerSmClass extends AnalystContainerSmClass {
    @objid ("462f9273-fa65-4fd5-8822-1b30229c15f6")
    private SmDependency ownedGoalDep;

    @objid ("1d95319d-c8d1-46f8-8107-49688255e080")
    private SmDependency ownerContainerDep;

    @objid ("899dd06b-30dd-4f7d-90bb-7931eb188255")
    private SmDependency ownedContainerDep;

    @objid ("ca770b17-6a21-4ab6-bae9-53826b3316e6")
    private SmDependency ownerProjectDep;

    @objid ("97fc7592-a728-415b-9c79-b502bef95b6c")
    public GoalContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("16f477c1-457d-4b08-a1a2-d5d2a3ffabf0")
    @Override
    public String getName() {
        return "GoalContainer";
    }

    @objid ("ed535d49-2f79-42ce-aa5e-8850c52e4bcb")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("4afadea0-5789-4977-bfcc-46864c6cc37d")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return GoalContainer.class;
    }

    @objid ("3b944c0b-3656-4423-8ee5-13e01d02b142")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("9791bc2b-a37e-4a61-998b-666c6f3f52df")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("95dfc5aa-77a7-46a8-a4c9-dd5acb962819")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new GoalContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedGoalDep = new OwnedGoalSmDependency();
        this.ownedGoalDep.init("OwnedGoal", this, metamodel.getMClass("Goal"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedGoalDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("GoalContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.ownedContainerDep = new OwnedContainerSmDependency();
        this.ownedContainerDep.init("OwnedContainer", this, metamodel.getMClass("GoalContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedContainerDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
    }

    @objid ("3c3d0ac0-0e30-4252-98f5-893a8139b4ca")
    public SmDependency getOwnedGoalDep() {
        if (this.ownedGoalDep == null) {
        	this.ownedGoalDep = this.getDependencyDef("OwnedGoal");
        }
        return this.ownedGoalDep;
    }

    @objid ("a5a0dca7-75af-42cd-b5d1-89df5b64dd06")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("95161432-b735-4123-b4e1-e2912bf92732")
    public SmDependency getOwnedContainerDep() {
        if (this.ownedContainerDep == null) {
        	this.ownedContainerDep = this.getDependencyDef("OwnedContainer");
        }
        return this.ownedContainerDep;
    }

    @objid ("cd2531cb-c9b3-420e-ade5-30230e642ff4")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("440fc1e9-bf02-43c3-81b1-b4809daacc62")
    private static class GoalContainerObjectFactory implements ISmObjectFactory {
        @objid ("9575562d-d6a5-47d3-beab-8be75ad41651")
        private GoalContainerSmClass smClass;

        @objid ("5b169d48-21ee-4207-8edb-b5cc2bc853fa")
        public GoalContainerObjectFactory(GoalContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("93bc863f-8562-4e2d-ae80-4ab0f77df66b")
        @Override
        public ISmObjectData createData() {
            return new GoalContainerData(this.smClass);
        }

        @objid ("776bfbc0-63e2-46d8-ab05-71f2a05f2441")
        @Override
        public SmObjectImpl createImpl() {
            return new GoalContainerImpl();
        }

    }

    @objid ("7667269e-36b7-47c6-8ba1-b317f5f20ca4")
    public static class OwnedGoalSmDependency extends SmMultipleDependency {
        @objid ("37228c07-f900-4e84-ba3f-b7ce6c52ea99")
        private SmDependency symetricDep;

        @objid ("40eb6413-20c1-4852-b98e-9314b05d882d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GoalContainerData)data).mOwnedGoal != null)? ((GoalContainerData)data).mOwnedGoal:SmMultipleDependency.EMPTY;
        }

        @objid ("c56232ee-80bb-494f-bc67-494c805d6f1c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GoalContainerData) data).mOwnedGoal = values;
        }

        @objid ("f1f7bd02-e8f1-4d15-8690-5b493c8e2206")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d25777e2-37bf-44d4-bdf8-56547535f7e4")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("8aed3efa-8cc1-487e-9895-5f9a62a6524a")
        private SmDependency symetricDep;

        @objid ("a83076ad-8225-4646-9f84-d11f5b108d30")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GoalContainerData) data).mOwnerContainer;
        }

        @objid ("d5bd6306-ed7d-4c75-8d0f-90bece85a713")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GoalContainerData) data).mOwnerContainer = value;
        }

        @objid ("819b9159-dfab-4f45-9e80-9beb6b17ea36")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalContainerSmClass)this.getTarget()).getOwnedContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("17e5fe9d-5080-4c0b-a430-b1b772fb8009")
    public static class OwnedContainerSmDependency extends SmMultipleDependency {
        @objid ("b8370726-c40f-4e5a-b16c-ceee8bf8a178")
        private SmDependency symetricDep;

        @objid ("55947976-9efd-44a5-9e32-3ee712af584b")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((GoalContainerData)data).mOwnedContainer != null)? ((GoalContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
        }

        @objid ("ce605fd6-87f7-4c9d-a9c8-a4a764bdf034")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((GoalContainerData) data).mOwnedContainer = values;
        }

        @objid ("abe1758e-ece5-486b-b4ed-5d3fae6c0f13")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GoalContainerSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("71ce4dc0-195b-4356-af0f-60d6c1f1e929")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("062a691f-1da5-48bf-a931-3918443ab081")
        private SmDependency symetricDep;

        @objid ("bb90be20-1e76-4655-9268-3aabf48adfb7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((GoalContainerData) data).mOwnerProject;
        }

        @objid ("30343644-66f7-46c6-8c98-ffcd18e42492")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((GoalContainerData) data).mOwnerProject = value;
        }

        @objid ("c2de1176-3369-4277-aa2d-453dd587cfb0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getGoalRootDep();
            }
            return this.symetricDep;
        }

    }

}
