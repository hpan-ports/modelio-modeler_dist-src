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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
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

@objid ("a16e3d3b-8dda-4d6c-be75-819b122d2f99")
public class RegionSmClass extends ModelElementSmClass {
    @objid ("2973d411-f85c-4719-8870-47d74e65dfb6")
    private SmDependency parentDep;

    @objid ("b5cd92cc-6943-4068-9bfc-8676268e20ad")
    private SmDependency representedDep;

    @objid ("ecd2f357-97b3-48c0-87a3-bc58d085ab6a")
    private SmDependency subDep;

    @objid ("7aeccc60-0189-4e62-8a37-1cd256d6eb74")
    public RegionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("fc18644b-63ba-4c9f-86ef-8feeba188957")
    @Override
    public String getName() {
        return "Region";
    }

    @objid ("76090f2d-5eca-4e8b-b884-3250e2d8f3a9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5beb27c4-7234-423f-af8c-486d10bdf6e7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Region.class;
    }

    @objid ("0899ef40-dacf-4391-bfda-8a7dd40f8cb1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("406bee76-2e5b-4ee4-b08f-c795c11f85df")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("678862a9-0994-4289-9a5e-cfa2c71bfde0")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new RegionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.parentDep = new ParentSmDependency();
        this.parentDep.init("Parent", this, metamodel.getMClass("State"), 0, 1 );
        registerDependency(this.parentDep);
        
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("StateMachine"), 0, 1 );
        registerDependency(this.representedDep);
        
        this.subDep = new SubSmDependency();
        this.subDep.init("Sub", this, metamodel.getMClass("StateVertex"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.subDep);
    }

    @objid ("a5de24f8-d134-4a16-a387-1f13bff8946b")
    public SmDependency getParentDep() {
        if (this.parentDep == null) {
        	this.parentDep = this.getDependencyDef("Parent");
        }
        return this.parentDep;
    }

    @objid ("920a7ca8-bc8d-4927-a2cc-a5190d448013")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("31a74f64-3ab1-4709-9700-7837208cbafa")
    public SmDependency getSubDep() {
        if (this.subDep == null) {
        	this.subDep = this.getDependencyDef("Sub");
        }
        return this.subDep;
    }

    @objid ("3419c2a9-c132-476a-bc5a-2fec6481a4eb")
    private static class RegionObjectFactory implements ISmObjectFactory {
        @objid ("fcec094d-477f-42b6-b485-7811b3757f20")
        private RegionSmClass smClass;

        @objid ("416c1de8-73ed-40e1-bd3e-6f4ee07b8bad")
        public RegionObjectFactory(RegionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("b22c29ab-b0c8-441e-ade9-5068fa4c95ea")
        @Override
        public ISmObjectData createData() {
            return new RegionData(this.smClass);
        }

        @objid ("bacd2bbb-9ead-48cb-a76e-c1220687cd54")
        @Override
        public SmObjectImpl createImpl() {
            return new RegionImpl();
        }

    }

    @objid ("7b1de3f0-d720-4f16-b99b-d7577dc1adaa")
    public static class ParentSmDependency extends SmSingleDependency {
        @objid ("36c0e620-fc2f-4c52-a7a0-5249ad3f27e6")
        private SmDependency symetricDep;

        @objid ("3fb91c6d-9231-4b5b-b2ab-853216195eee")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RegionData) data).mParent;
        }

        @objid ("1c81ad2b-ed6f-45e3-a1c8-139a7d5f7aeb")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RegionData) data).mParent = value;
        }

        @objid ("7fbd8d0c-a614-4417-ad80-5e9a78326b2f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getOwnedRegionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6ba2f1b8-94f8-4445-8a08-d2efc49810d7")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("0359e04b-4e35-4480-b428-1481a3223980")
        private SmDependency symetricDep;

        @objid ("68203d09-e104-49ff-a8d2-8c2d0f9afb4d")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RegionData) data).mRepresented;
        }

        @objid ("bd546cb0-6f3b-4300-9130-ea694989eb62")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RegionData) data).mRepresented = value;
        }

        @objid ("d545164d-0746-4b51-8925-7a566dbeb0ba")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateMachineSmClass)this.getTarget()).getTopDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f2567628-93fd-48ce-81d2-7be18db23096")
    public static class SubSmDependency extends SmMultipleDependency {
        @objid ("4420d53d-5c17-4eb0-86eb-9fc787dd1d55")
        private SmDependency symetricDep;

        @objid ("53dbcd89-b9d2-4bd4-ad7d-f366bbcd54cc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RegionData)data).mSub != null)? ((RegionData)data).mSub:SmMultipleDependency.EMPTY;
        }

        @objid ("8cb9d51c-9b6e-444a-84e7-be8ddb7afa36")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RegionData) data).mSub = values;
        }

        @objid ("f39e397b-cd98-40af-ae08-d22bcc176bdf")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateVertexSmClass)this.getTarget()).getParentDep();
            }
            return this.symetricDep;
        }

    }

}
