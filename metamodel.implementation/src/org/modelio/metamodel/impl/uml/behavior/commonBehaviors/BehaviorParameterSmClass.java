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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ObjectNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
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

@objid ("46048f4c-2fa7-4169-baf7-3fc00502e63d")
public class BehaviorParameterSmClass extends ParameterSmClass {
    @objid ("03ba0df9-adec-440f-a90d-b7e1296010ca")
    private SmDependency representingObjectNodeDep;

    @objid ("fb08a15f-ec99-42ae-ae4e-936ac10b195d")
    private SmDependency ownerDep;

    @objid ("3c52109e-2bcc-4888-86bf-b7c724c15e3a")
    private SmDependency mappedDep;

    @objid ("2a673870-1ab6-45e3-aad3-c603bccfab07")
    public BehaviorParameterSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("0192cd5d-c48c-4bc9-9150-cd48d1fd68e8")
    @Override
    public String getName() {
        return "BehaviorParameter";
    }

    @objid ("55c3601a-bef4-4fda-b95c-bbe06fb25cdf")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("aa17e11e-c007-4b30-b487-deac05a9d8ce")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BehaviorParameter.class;
    }

    @objid ("b4c52b0d-bace-4867-8e36-0ee22d97032c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a70bb118-7d15-44e7-ba4d-1725756b3e2f")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("76a8126e-32ef-49a0-86b6-574cb1c06cfc")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Parameter");
        this.registerFactory(new BehaviorParameterObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.representingObjectNodeDep = new RepresentingObjectNodeSmDependency();
        this.representingObjectNodeDep.init("RepresentingObjectNode", this, metamodel.getMClass("ObjectNode"), 0, -1 );
        registerDependency(this.representingObjectNodeDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Behavior"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.mappedDep = new MappedSmDependency();
        this.mappedDep.init("Mapped", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.mappedDep);
    }

    @objid ("59faa712-530d-474c-9c59-1026d0f65ad3")
    public SmDependency getRepresentingObjectNodeDep() {
        if (this.representingObjectNodeDep == null) {
        	this.representingObjectNodeDep = this.getDependencyDef("RepresentingObjectNode");
        }
        return this.representingObjectNodeDep;
    }

    @objid ("35660129-f7b4-48f1-8e0d-e89c943527cc")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("e2750489-efe2-409f-ab56-6c23bac36a67")
    public SmDependency getMappedDep() {
        if (this.mappedDep == null) {
        	this.mappedDep = this.getDependencyDef("Mapped");
        }
        return this.mappedDep;
    }

    @objid ("623268bd-665f-4228-a79b-30255c472e1f")
    private static class BehaviorParameterObjectFactory implements ISmObjectFactory {
        @objid ("3e5287ee-8cac-4ca3-b301-b95a86843313")
        private BehaviorParameterSmClass smClass;

        @objid ("48241a84-d9c5-409c-95f4-3876fab0cc47")
        public BehaviorParameterObjectFactory(BehaviorParameterSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("97004ace-0b3d-4ec2-b6d9-6cd47064625c")
        @Override
        public ISmObjectData createData() {
            return new BehaviorParameterData(this.smClass);
        }

        @objid ("707c05af-2413-45eb-86f5-5227ad941014")
        @Override
        public SmObjectImpl createImpl() {
            return new BehaviorParameterImpl();
        }

    }

    @objid ("7d156ca9-e7d9-4d7b-ab23-eb6610482589")
    public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
        @objid ("fb62e188-13b1-49e7-b331-dfb20f79b8b3")
        private SmDependency symetricDep;

        @objid ("cb260e6f-60fe-4c41-8614-5a2809ebc219")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BehaviorParameterData)data).mRepresentingObjectNode != null)? ((BehaviorParameterData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
        }

        @objid ("9c64e03b-2d3f-4287-a356-de8474b403c3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BehaviorParameterData) data).mRepresentingObjectNode = values;
        }

        @objid ("209fbde2-4da0-4bfb-91c3-317dae7a36de")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ObjectNodeSmClass)this.getTarget()).getRepresentedRealParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ac5d72aa-383c-421c-b276-bd7e2d05cca8")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("e7826ed5-1f52-4ebd-83a9-77620aaf9675")
        private SmDependency symetricDep;

        @objid ("9cb8a6b2-ed9f-4130-b0bb-0407b55fdd68")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BehaviorParameterData) data).mOwner;
        }

        @objid ("b933d195-e615-4ffc-b9ce-6738a7e763fa")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BehaviorParameterData) data).mOwner = value;
        }

        @objid ("3ec04578-0235-4898-83f7-466145a4aef5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getParameterDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d3e34df7-e1ce-4e87-98ff-d6b57e5163c2")
    public static class MappedSmDependency extends SmSingleDependency {
        @objid ("aab65ac0-c9ce-46fe-ab66-a7c69778a22c")
        private SmDependency symetricDep;

        @objid ("d3f5ca98-dda1-4d50-a05f-04b788a74320")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BehaviorParameterData) data).mMapped;
        }

        @objid ("e207a4fa-0b4d-42db-aa28-65dd27ac0ff6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BehaviorParameterData) data).mMapped = value;
        }

        @objid ("728a50fc-6a95-41f0-9678-7e16db5b3c39")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getBehaviorParamDep();
            }
            return this.symetricDep;
        }

    }

}
