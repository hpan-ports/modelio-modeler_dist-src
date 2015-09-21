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
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.statik.NameSpaceSmClass;
import org.modelio.metamodel.uml.statik.NamespaceUse;
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

@objid ("47e6c35c-2f27-41bf-91e2-d7e489a4b0e7")
public class NamespaceUseSmClass extends ElementSmClass {
    @objid ("ccdbc161-6fc7-471a-a1f0-ec5e550f7d07")
    private SmDependency userDep;

    @objid ("3be887a4-7974-4fd3-b3e2-088029f5965e")
    private SmDependency usedDep;

    @objid ("d6ac3d62-e7d7-433a-8df7-e992698472a5")
    private SmDependency causeDep;

    @objid ("b6e1125f-79d8-4c54-ac80-0f0c8139c551")
    public NamespaceUseSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("150acc45-4650-4e93-86c0-be228d35283d")
    @Override
    public String getName() {
        return "NamespaceUse";
    }

    @objid ("f079bd25-f3ef-42bf-9706-be0823a19d88")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7b58b454-e395-43bc-9fff-de0bb22c1430")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return NamespaceUse.class;
    }

    @objid ("2326f038-3310-4049-bc81-6957e7868812")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("79eef729-2f13-44f1-83dd-dd826cfa7c09")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("eae5fae9-c063-432b-8509-e60ede0194e4")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new NamespaceUseObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.userDep = new UserSmDependency();
        this.userDep.init("User", this, metamodel.getMClass("NameSpace"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.userDep);
        
        this.usedDep = new UsedSmDependency();
        this.usedDep.init("Used", this, metamodel.getMClass("NameSpace"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.usedDep);
        
        this.causeDep = new CauseSmDependency();
        this.causeDep.init("Cause", this, metamodel.getMClass("Element"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.causeDep);
    }

    @objid ("47b76104-1405-42f4-a5a6-489d4e6a98ef")
    public SmDependency getUserDep() {
        if (this.userDep == null) {
        	this.userDep = this.getDependencyDef("User");
        }
        return this.userDep;
    }

    @objid ("1b8dcd52-8129-4cb9-9b26-3539772e8090")
    public SmDependency getUsedDep() {
        if (this.usedDep == null) {
        	this.usedDep = this.getDependencyDef("Used");
        }
        return this.usedDep;
    }

    @objid ("7a422225-2233-4de7-9392-2a1d76914647")
    public SmDependency getCauseDep() {
        if (this.causeDep == null) {
        	this.causeDep = this.getDependencyDef("Cause");
        }
        return this.causeDep;
    }

    @objid ("8713c67b-5382-443f-bad1-87ca5109600b")
    private static class NamespaceUseObjectFactory implements ISmObjectFactory {
        @objid ("bd47424c-3366-4dd7-baac-3242830152cc")
        private NamespaceUseSmClass smClass;

        @objid ("fdfcd7df-36fe-44d2-8ff7-3d2f4b116905")
        public NamespaceUseObjectFactory(NamespaceUseSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d8af0dde-a56e-41e4-864b-54f378cfe939")
        @Override
        public ISmObjectData createData() {
            return new NamespaceUseData(this.smClass);
        }

        @objid ("f4758b68-821e-47b0-a608-8851bfa568fa")
        @Override
        public SmObjectImpl createImpl() {
            return new NamespaceUseImpl();
        }

    }

    @objid ("f5e90366-ecb9-409f-942d-641ce80dddfd")
    public static class UserSmDependency extends SmSingleDependency {
        @objid ("fd4ceb68-4b41-431e-99b9-57b63a1ef6e8")
        private SmDependency symetricDep;

        @objid ("aa3d3214-89f5-4226-b8a5-190df2bf8c38")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NamespaceUseData) data).mUser;
        }

        @objid ("220ae371-7f4d-4ee7-ba34-9705f34f0036")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NamespaceUseData) data).mUser = value;
        }

        @objid ("edf314e9-f67a-45d2-824a-357669914318")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getUsedNsuDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("918863b2-bc45-4b5e-bf3d-5d12d8449dd2")
    public static class UsedSmDependency extends SmSingleDependency {
        @objid ("7b41efc7-4cd3-4aa1-a281-f49c3e735a93")
        private SmDependency symetricDep;

        @objid ("4a844afd-f087-40b5-9b25-5584d0dd39f9")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((NamespaceUseData) data).mUsed;
        }

        @objid ("38015d57-fd63-41ba-859a-ad0b44fe88fe")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((NamespaceUseData) data).mUsed = value;
        }

        @objid ("16488f68-ad7b-4bbf-8a45-1193d4950d91")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NameSpaceSmClass)this.getTarget()).getUserNsuDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("dd58ee45-64a0-4112-a291-4af9e28db991")
    public static class CauseSmDependency extends SmMultipleDependency {
        @objid ("ca194f43-fb25-4b39-a845-5faf399365e6")
        private SmDependency symetricDep;

        @objid ("52461b45-8486-4cc0-865b-574371b8a6f5")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((NamespaceUseData)data).mCause != null)? ((NamespaceUseData)data).mCause:SmMultipleDependency.EMPTY;
        }

        @objid ("4c8c54be-616b-443c-a10c-6e04e075a863")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((NamespaceUseData) data).mCause = values;
        }

        @objid ("17e4ccdf-0be1-4cff-a4f3-a7fc68d00c7f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementSmClass)this.getTarget()).getCausingDep();
            }
            return this.symetricDep;
        }

    }

}
