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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.ExtensionPointSmClass;
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseDependencySmClass;
import org.modelio.metamodel.impl.uml.statik.GeneralClassSmClass;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("a769982c-8238-414b-a66c-83aaf9c76b10")
public class UseCaseSmClass extends GeneralClassSmClass {
    @objid ("d3af6eba-ef6f-4742-9fd4-1b9dd30f5f28")
    private SmDependency usedDep;

    @objid ("edaa02cf-275e-4562-a83d-9775abc99738")
    private SmDependency ownedExtensionDep;

    @objid ("e96cd987-84a1-4098-840a-b81375cf0591")
    private SmDependency userDep;

    @objid ("45b25c68-7d64-4203-ac87-d8d9511d8a1c")
    public UseCaseSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("3df669f0-2d24-4160-b81e-c4e9190adaf4")
    @Override
    public String getName() {
        return "UseCase";
    }

    @objid ("cb556152-e6f3-47d5-aa09-a98f2c202ca4")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("10cf3549-4845-452a-a9b2-62e2ddbb8f36")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return UseCase.class;
    }

    @objid ("5ea4cfd3-1415-4ae0-805b-2c7c0e1c5c85")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("f1945b2e-c5ce-4b60-aaef-a70677f60aaf")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("ac83246e-7edf-404e-b916-e20881827703")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("GeneralClass");
        this.registerFactory(new UseCaseObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.usedDep = new UsedSmDependency();
        this.usedDep.init("Used", this, metamodel.getMClass("UseCaseDependency"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.usedDep);
        
        this.ownedExtensionDep = new OwnedExtensionSmDependency();
        this.ownedExtensionDep.init("OwnedExtension", this, metamodel.getMClass("ExtensionPoint"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedExtensionDep);
        
        this.userDep = new UserSmDependency();
        this.userDep.init("User", this, metamodel.getMClass("UseCaseDependency"), 0, -1 , SmDirective.SMCDDYNAMIC, SmDirective.SMCDTODELETE);
        registerDependency(this.userDep);
    }

    @objid ("6b5f2c90-2579-4165-a71e-a88c7a7a0968")
    public SmDependency getUsedDep() {
        if (this.usedDep == null) {
        	this.usedDep = this.getDependencyDef("Used");
        }
        return this.usedDep;
    }

    @objid ("9debe827-2aaa-417d-8b3e-3af42af13ecc")
    public SmDependency getOwnedExtensionDep() {
        if (this.ownedExtensionDep == null) {
        	this.ownedExtensionDep = this.getDependencyDef("OwnedExtension");
        }
        return this.ownedExtensionDep;
    }

    @objid ("959aba25-8f9f-4247-a729-625fb663a86d")
    public SmDependency getUserDep() {
        if (this.userDep == null) {
        	this.userDep = this.getDependencyDef("User");
        }
        return this.userDep;
    }

    @objid ("f0fc8a29-fb32-4f4d-bc31-708bca70f439")
    private static class UseCaseObjectFactory implements ISmObjectFactory {
        @objid ("99c81798-095c-4b31-b66e-f296af2719d9")
        private UseCaseSmClass smClass;

        @objid ("63e7f0ea-6891-41e6-9bc8-792bd8d05c37")
        public UseCaseObjectFactory(UseCaseSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9d28d519-1d8e-4073-8b95-e1c5cde9771b")
        @Override
        public ISmObjectData createData() {
            return new UseCaseData(this.smClass);
        }

        @objid ("9ba9f345-369e-4be3-8f58-19498695c400")
        @Override
        public SmObjectImpl createImpl() {
            return new UseCaseImpl();
        }

    }

    @objid ("1dac55bd-7ce4-40ab-8c60-bcd3f7d5d253")
    public static class UsedSmDependency extends SmMultipleDependency {
        @objid ("d87f4ce7-b3d7-42e6-aabf-f8867e97cd5d")
        private SmDependency symetricDep;

        @objid ("e19f8548-fddd-4277-a540-94191c862c76")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((UseCaseData)data).mUsed != null)? ((UseCaseData)data).mUsed:SmMultipleDependency.EMPTY;
        }

        @objid ("411a7bc7-dd47-4b88-a91f-637a5e598656")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((UseCaseData) data).mUsed = values;
        }

        @objid ("3ba2ad9a-9825-4495-9dbf-27f22e31f3e7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseDependencySmClass)this.getTarget()).getOriginDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5f046845-a693-4db5-9858-f5ce7ff6f1fa")
    public static class OwnedExtensionSmDependency extends SmMultipleDependency {
        @objid ("129ef8b2-08bf-4dce-b441-0e3e1d7349ed")
        private SmDependency symetricDep;

        @objid ("f0ff5827-e0e9-4b82-b52a-c588a40c392e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((UseCaseData)data).mOwnedExtension != null)? ((UseCaseData)data).mOwnedExtension:SmMultipleDependency.EMPTY;
        }

        @objid ("9394efe6-a1e0-41f0-a1ef-7e6a0c1da4e3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((UseCaseData) data).mOwnedExtension = values;
        }

        @objid ("9cb07569-672a-401a-94cd-c6fa1e014387")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExtensionPointSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("faab2e5c-78e5-4711-8269-0e8839abd001")
    public static class UserSmDependency extends SmMultipleDependency {
        @objid ("833c0acb-afe8-47d8-937c-480d73751375")
        private SmDependency symetricDep;

        @objid ("1edc2d7d-712a-4c89-af1c-c4052c29f1a5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((UseCaseData)data).mUser != null)? ((UseCaseData)data).mUser:SmMultipleDependency.EMPTY;
        }

        @objid ("24e9fae7-5522-40d1-b5c5-9dcacc576d39")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((UseCaseData) data).mUser = values;
        }

        @objid ("840f57a1-7b76-4f1a-8507-29f14e9030db")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseDependencySmClass)this.getTarget()).getTargetDep();
            }
            return this.symetricDep;
        }

    }

}
