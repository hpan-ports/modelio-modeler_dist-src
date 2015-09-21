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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
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

@objid ("8b9c51b8-449b-4b09-a6f6-60d9ca787f80")
public class StateMachineSmClass extends BehaviorSmClass {
    @objid ("d1e643c1-3f50-479e-903b-ecaffd00ebf3")
    private SmAttribute kindAtt;

    @objid ("f546e92b-667b-4fa2-9361-c13d9c71db8c")
    private SmDependency topDep;

    @objid ("b0fbc739-7316-4add-a59f-aaa901648fc3")
    private SmDependency submachineStateDep;

    @objid ("f7ec7e8a-ece8-4402-a407-350450d9d244")
    private SmDependency entryPointDep;

    @objid ("12045b40-9104-468f-a425-8243eae1a01f")
    private SmDependency exitPointDep;

    @objid ("5bbd9fef-cbdf-4f07-be8a-449af9dd846a")
    public StateMachineSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3086ba03-99be-4c88-adf3-6522fa8c0f45")
    @Override
    public String getName() {
        return "StateMachine";
    }

    @objid ("d915024b-6b6a-4110-97a8-509e47742a6e")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ac8f76ad-94c8-47d8-b4cd-fa21f7ea67f7")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return StateMachine.class;
    }

    @objid ("b528ecb7-3892-4f62-b710-0c018abfbcad")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("53ef30fb-96ca-463b-b9bc-0c5bbe889323")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("283b5509-8a81-4eff-bcec-2f03c5cf8239")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Behavior");
        this.registerFactory(new StateMachineObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.kindAtt = new KindSmAttribute();
        this.kindAtt.init("Kind", this, KindOfStateMachine.class );
        registerAttribute(this.kindAtt);
        
        
        // Initialize and register the SmDependency
        this.topDep = new TopSmDependency();
        this.topDep.init("Top", this, metamodel.getMClass("Region"), 1, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.topDep);
        
        this.submachineStateDep = new SubmachineStateSmDependency();
        this.submachineStateDep.init("SubmachineState", this, metamodel.getMClass("State"), 0, -1 );
        registerDependency(this.submachineStateDep);
        
        this.entryPointDep = new EntryPointSmDependency();
        this.entryPointDep.init("EntryPoint", this, metamodel.getMClass("EntryPointPseudoState"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.entryPointDep);
        
        this.exitPointDep = new ExitPointSmDependency();
        this.exitPointDep.init("ExitPoint", this, metamodel.getMClass("ExitPointPseudoState"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.exitPointDep);
    }

    @objid ("dc054aa7-801e-4ad9-ba8c-e63afd5ffa0b")
    public SmAttribute getKindAtt() {
        if (this.kindAtt == null) {
        	this.kindAtt = this.getAttributeDef("Kind");
        }
        return this.kindAtt;
    }

    @objid ("e0b1d1b1-f8c7-44b6-b96e-9d36d0510d7a")
    public SmDependency getTopDep() {
        if (this.topDep == null) {
        	this.topDep = this.getDependencyDef("Top");
        }
        return this.topDep;
    }

    @objid ("3987fc77-6a51-4ff0-a0bd-83541f63cc45")
    public SmDependency getSubmachineStateDep() {
        if (this.submachineStateDep == null) {
        	this.submachineStateDep = this.getDependencyDef("SubmachineState");
        }
        return this.submachineStateDep;
    }

    @objid ("5444cc8c-4c63-4fb2-844a-140df3aa23b2")
    public SmDependency getEntryPointDep() {
        if (this.entryPointDep == null) {
        	this.entryPointDep = this.getDependencyDef("EntryPoint");
        }
        return this.entryPointDep;
    }

    @objid ("61f8220c-ebf0-4fd4-bca5-98552d961484")
    public SmDependency getExitPointDep() {
        if (this.exitPointDep == null) {
        	this.exitPointDep = this.getDependencyDef("ExitPoint");
        }
        return this.exitPointDep;
    }

    @objid ("fb5a849d-7d3b-4e14-8360-2ac2d5ddbdee")
    private static class StateMachineObjectFactory implements ISmObjectFactory {
        @objid ("22c65421-28cf-43db-87a9-f138aea8a68e")
        private StateMachineSmClass smClass;

        @objid ("acd9f808-17e6-4fca-a718-57b8820fbff8")
        public StateMachineObjectFactory(StateMachineSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9dc6525a-9e87-4559-8ff3-79ca2343156f")
        @Override
        public ISmObjectData createData() {
            return new StateMachineData(this.smClass);
        }

        @objid ("20f1cda9-30e5-48ff-8fa0-f16d2b329a53")
        @Override
        public SmObjectImpl createImpl() {
            return new StateMachineImpl();
        }

    }

    @objid ("7e346ba2-4fd9-447d-93cd-4b5f3c9ea38f")
    public static class KindSmAttribute extends SmAttribute {
        @objid ("8cfad134-8ffd-4162-baf7-09ee28a19ab5")
        public Object getValue(ISmObjectData data) {
            return ((StateMachineData) data).mKind;
        }

        @objid ("4e43a4b9-6606-43c3-9905-37d99fad8ab8")
        public void setValue(ISmObjectData data, Object value) {
            ((StateMachineData) data).mKind = value;
        }

    }

    @objid ("60557fd7-c04f-4060-a11d-14d7713b5114")
    public static class TopSmDependency extends SmSingleDependency {
        @objid ("6180a761-7cde-4a2c-bfde-c101f673a07f")
        private SmDependency symetricDep;

        @objid ("9e6530f2-bd45-4dbc-b0da-cbd29f05496c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((StateMachineData) data).mTop;
        }

        @objid ("affb1751-7e64-4f1e-bd43-9a952daabee1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((StateMachineData) data).mTop = value;
        }

        @objid ("b9db2ad7-8a33-4efd-b64e-6756356a1ae7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RegionSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2844cfa6-a73a-4991-84d7-068b05c828e4")
    public static class SubmachineStateSmDependency extends SmMultipleDependency {
        @objid ("80c1fc81-a13c-4587-8722-63fc45c30178")
        private SmDependency symetricDep;

        @objid ("8b20fb01-a93a-4163-afaa-963dd91e3d48")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateMachineData)data).mSubmachineState != null)? ((StateMachineData)data).mSubmachineState:SmMultipleDependency.EMPTY;
        }

        @objid ("699d3755-7901-4cbb-ad0f-b40f28ee790c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateMachineData) data).mSubmachineState = values;
        }

        @objid ("4ec5fa37-2cba-4762-83af-e024bc4b65ee")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateSmClass)this.getTarget()).getSubMachineDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d7f201f1-4e78-45d4-944e-4f2a9a810e4e")
    public static class EntryPointSmDependency extends SmMultipleDependency {
        @objid ("ed21c051-06b3-4159-8c58-c37f89890b53")
        private SmDependency symetricDep;

        @objid ("a14ec329-aedc-4771-82c8-1db908a04b10")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateMachineData)data).mEntryPoint != null)? ((StateMachineData)data).mEntryPoint:SmMultipleDependency.EMPTY;
        }

        @objid ("f13d9f38-cdb6-47d3-a352-89566fbcd8e8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateMachineData) data).mEntryPoint = values;
        }

        @objid ("fdb8e03f-69bd-48cf-a210-30aea6675d04")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EntryPointPseudoStateSmClass)this.getTarget()).getEntryOfMachineDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f086e527-0d41-480d-91a0-e3287260ea0c")
    public static class ExitPointSmDependency extends SmMultipleDependency {
        @objid ("04eae2f1-f5da-4708-9492-aaeb8b2944ef")
        private SmDependency symetricDep;

        @objid ("ee3828b6-4aa5-45de-9235-1e8b2052ea49")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((StateMachineData)data).mExitPoint != null)? ((StateMachineData)data).mExitPoint:SmMultipleDependency.EMPTY;
        }

        @objid ("48729ca5-5bdc-4242-bca7-35fa684c64aa")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((StateMachineData) data).mExitPoint = values;
        }

        @objid ("307e7cea-41ee-47a7-861a-5874fe594429")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExitPointPseudoStateSmClass)this.getTarget()).getExitOfMachineDep();
            }
            return this.symetricDep;
        }

    }

}
