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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityNodeSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ConditionalNodeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("915a23ae-4b3c-45d1-84e8-f84a3c43f56e")
public class ClauseSmClass extends ModelElementSmClass {
    @objid ("dca48681-1bac-419a-9d2a-e7915e521dc4")
    private SmAttribute testAtt;

    @objid ("3c53b1fb-e325-45fc-a710-c3bad5fb2ae0")
    private SmDependency bodyDep;

    @objid ("bdf2810a-b576-46af-bd16-2ce86ae02c24")
    private SmDependency ownerDep;

    @objid ("8c7ae870-10f8-4ef6-b9de-621e996c9952")
    public ClauseSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b6b67bff-9729-45f6-a7a9-68385d3f59be")
    @Override
    public String getName() {
        return "Clause";
    }

    @objid ("640d00db-3906-450e-a703-5a2cb04d7fd2")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a0734376-1c13-41d5-8999-0cd87eae3741")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Clause.class;
    }

    @objid ("9bc0e146-c433-4ba5-91bd-d3ed2dd78cdc")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("96d348b8-aafe-44ec-9ebd-7031eab88d92")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("803775b3-8ef6-4333-99dd-f913ab1e13b2")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new ClauseObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.testAtt = new TestSmAttribute();
        this.testAtt.init("Test", this, String.class );
        registerAttribute(this.testAtt);
        
        
        // Initialize and register the SmDependency
        this.bodyDep = new BodySmDependency();
        this.bodyDep.init("Body", this, metamodel.getMClass("ActivityNode"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.bodyDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("ConditionalNode"), 0, 1 );
        registerDependency(this.ownerDep);
    }

    @objid ("934a5413-be93-407d-9562-d74ae81b1f27")
    public SmAttribute getTestAtt() {
        if (this.testAtt == null) {
        	this.testAtt = this.getAttributeDef("Test");
        }
        return this.testAtt;
    }

    @objid ("598c5468-e5f2-44c2-b302-e82d3b453b68")
    public SmDependency getBodyDep() {
        if (this.bodyDep == null) {
        	this.bodyDep = this.getDependencyDef("Body");
        }
        return this.bodyDep;
    }

    @objid ("8c6cc673-e0cb-47ba-98e1-9621791f784c")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("2313f2e4-ecf1-4b1f-ae71-07cb5a62e1a9")
    private static class ClauseObjectFactory implements ISmObjectFactory {
        @objid ("842eb7c7-cc85-44ef-98bc-243107cfe985")
        private ClauseSmClass smClass;

        @objid ("4075de3d-948e-49ff-8609-c5bbb13ae431")
        public ClauseObjectFactory(ClauseSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bdc2613e-0cbd-4dbc-9154-5fd647cccb9e")
        @Override
        public ISmObjectData createData() {
            return new ClauseData(this.smClass);
        }

        @objid ("6b65e560-a2e4-4fbf-bace-dbb8e39f062e")
        @Override
        public SmObjectImpl createImpl() {
            return new ClauseImpl();
        }

    }

    @objid ("073cdf20-5700-4d95-b88e-d1261e7fb133")
    public static class TestSmAttribute extends SmAttribute {
        @objid ("763d0465-efd0-4b34-94dc-aaa9b8b5ad02")
        public Object getValue(ISmObjectData data) {
            return ((ClauseData) data).mTest;
        }

        @objid ("667ccf94-e401-4deb-8c48-74d9e5d5ce5a")
        public void setValue(ISmObjectData data, Object value) {
            ((ClauseData) data).mTest = value;
        }

    }

    @objid ("313a381e-bc5c-40c3-a578-a31c81576a1b")
    public static class BodySmDependency extends SmMultipleDependency {
        @objid ("e3e0e6d9-5a00-427f-85f0-db6cd3569e5c")
        private SmDependency symetricDep;

        @objid ("24e393a6-b277-49db-b384-43591242994d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ClauseData)data).mBody != null)? ((ClauseData)data).mBody:SmMultipleDependency.EMPTY;
        }

        @objid ("c6227433-8753-4587-9c3e-d67ae0f6fe09")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ClauseData) data).mBody = values;
        }

        @objid ("79cb126c-1096-4756-be1c-7626fa85cbdd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityNodeSmClass)this.getTarget()).getOwnerClauseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ae9e503f-6639-4516-a9fa-04c3927a1d9f")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("a8c436b6-1f20-4551-aff4-4773411f3053")
        private SmDependency symetricDep;

        @objid ("18fc773c-da42-4f4a-a3de-7ab2a69a2551")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ClauseData) data).mOwner;
        }

        @objid ("373e6eb1-d8c1-4923-9712-8abefc47ec2d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ClauseData) data).mOwner = value;
        }

        @objid ("c5dcfeb4-2654-4164-8cfe-6dae173a4d17")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConditionalNodeSmClass)this.getTarget()).getOwnedClauseDep();
            }
            return this.symetricDep;
        }

    }

}
