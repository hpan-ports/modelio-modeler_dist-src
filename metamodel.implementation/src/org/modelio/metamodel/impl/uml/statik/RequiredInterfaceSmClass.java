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
import org.modelio.metamodel.impl.uml.statik.InterfaceSmClass;
import org.modelio.metamodel.impl.uml.statik.LinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryLinkEndSmClass;
import org.modelio.metamodel.impl.uml.statik.PortSmClass;
import org.modelio.metamodel.uml.statik.RequiredInterface;
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

@objid ("b4edbdaa-c246-435a-bcdc-03ed72b8aa7d")
public class RequiredInterfaceSmClass extends ModelElementSmClass {
    @objid ("61644799-a9e9-48fc-b0e0-a244a3f8d99f")
    private SmDependency requiredElementDep;

    @objid ("cb56a48b-c857-4ba6-a7aa-6a72b4766738")
    private SmDependency providerDep;

    @objid ("c43b350f-badc-4589-87d3-2acda81c568b")
    private SmDependency requiringDep;

    @objid ("ecff9619-4ee1-40eb-a2c9-ef4ce21acb0c")
    private SmDependency naryProviderDep;

    @objid ("226aa0f9-d978-40a7-90c0-0b4e43d246a2")
    public RequiredInterfaceSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("59728d92-6372-4d2d-a27f-ad87e5fce74d")
    @Override
    public String getName() {
        return "RequiredInterface";
    }

    @objid ("c3608c3c-fe4e-496b-ab83-ee88dfb217ca")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("663223d6-36bc-4d94-9539-8db731cb39df")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return RequiredInterface.class;
    }

    @objid ("04046f15-fa6f-4af0-9b7a-62026f233ad1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("6d7b3262-c560-47e0-8e8e-620225fd734d")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("86b8530b-78c3-475e-9d2d-66bfaa163869")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new RequiredInterfaceObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.requiredElementDep = new RequiredElementSmDependency();
        this.requiredElementDep.init("RequiredElement", this, metamodel.getMClass("Interface"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.requiredElementDep);
        
        this.providerDep = new ProviderSmDependency();
        this.providerDep.init("Provider", this, metamodel.getMClass("LinkEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.providerDep);
        
        this.requiringDep = new RequiringSmDependency();
        this.requiringDep.init("Requiring", this, metamodel.getMClass("Port"), 1, 1 );
        registerDependency(this.requiringDep);
        
        this.naryProviderDep = new NaryProviderSmDependency();
        this.naryProviderDep.init("NaryProvider", this, metamodel.getMClass("NaryLinkEnd"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.naryProviderDep);
    }

    @objid ("5edf5226-ac87-4cbd-9d0e-6ff676d39945")
    public SmDependency getRequiredElementDep() {
        if (this.requiredElementDep == null) {
        	this.requiredElementDep = this.getDependencyDef("RequiredElement");
        }
        return this.requiredElementDep;
    }

    @objid ("29961e3a-9c7c-4708-b7f5-ce1b4b361a1a")
    public SmDependency getProviderDep() {
        if (this.providerDep == null) {
        	this.providerDep = this.getDependencyDef("Provider");
        }
        return this.providerDep;
    }

    @objid ("341dabe4-ee0a-4dec-b56c-be54c2811a2c")
    public SmDependency getRequiringDep() {
        if (this.requiringDep == null) {
        	this.requiringDep = this.getDependencyDef("Requiring");
        }
        return this.requiringDep;
    }

    @objid ("6da4ffde-4881-445c-b1be-c8b4adff0dfd")
    public SmDependency getNaryProviderDep() {
        if (this.naryProviderDep == null) {
        	this.naryProviderDep = this.getDependencyDef("NaryProvider");
        }
        return this.naryProviderDep;
    }

    @objid ("641a0c1e-0f2b-4f2f-8a2e-ba1361f8b851")
    private static class RequiredInterfaceObjectFactory implements ISmObjectFactory {
        @objid ("40837dfe-823a-492f-a0ea-967ba18bb6df")
        private RequiredInterfaceSmClass smClass;

        @objid ("9a3ae217-e181-4cf4-af76-ff5f402b6e61")
        public RequiredInterfaceObjectFactory(RequiredInterfaceSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("61d944a0-9d68-45f0-abe5-63343abe90a6")
        @Override
        public ISmObjectData createData() {
            return new RequiredInterfaceData(this.smClass);
        }

        @objid ("c4d1076c-1400-4a3a-a1c3-92d4c72a017a")
        @Override
        public SmObjectImpl createImpl() {
            return new RequiredInterfaceImpl();
        }

    }

    @objid ("f3813a3b-6229-43dd-95c8-359f71ef6370")
    public static class RequiredElementSmDependency extends SmMultipleDependency {
        @objid ("54a0a013-c9c7-4dbc-a7de-004271762823")
        private SmDependency symetricDep;

        @objid ("cd38d5f5-5f8f-49de-b88f-1efc89966b79")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequiredInterfaceData)data).mRequiredElement != null)? ((RequiredInterfaceData)data).mRequiredElement:SmMultipleDependency.EMPTY;
        }

        @objid ("25eb978a-ca2c-4877-a6a6-63a32d992e4c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequiredInterfaceData) data).mRequiredElement = values;
        }

        @objid ("6e9ec444-404e-41d4-8d2e-551b20d5a97d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InterfaceSmClass)this.getTarget()).getRequiringDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e977e634-4a03-4081-a1d3-29798ff51d4c")
    public static class ProviderSmDependency extends SmMultipleDependency {
        @objid ("46dfab53-df09-4317-b2f4-ed75d5a00a71")
        private SmDependency symetricDep;

        @objid ("d5e22f91-ef95-4cbf-9f16-6a8bf9b33457")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequiredInterfaceData)data).mProvider != null)? ((RequiredInterfaceData)data).mProvider:SmMultipleDependency.EMPTY;
        }

        @objid ("b510e1a3-37fc-4a9d-b7b6-bd5c67f5f00b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequiredInterfaceData) data).mProvider = values;
        }

        @objid ("5cb3cf5e-6fc7-4d2b-a6f8-bd0b95c7d350")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LinkEndSmClass)this.getTarget()).getConsumerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("70982bbe-6a08-4243-814b-9bbca0242144")
    public static class RequiringSmDependency extends SmSingleDependency {
        @objid ("2201a9d5-cb37-431e-baf5-c6610336a5b7")
        private SmDependency symetricDep;

        @objid ("c3909b5f-1ad9-4921-b7d7-cec99bd356af")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RequiredInterfaceData) data).mRequiring;
        }

        @objid ("41f76372-9de7-419b-8fde-0ae751bc8b32")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RequiredInterfaceData) data).mRequiring = value;
        }

        @objid ("72027bfe-766a-4c7c-b18c-b804fb667080")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PortSmClass)this.getTarget()).getRequiredDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("60c879a7-5a44-42b3-8d9f-4019d965fcd7")
    public static class NaryProviderSmDependency extends SmMultipleDependency {
        @objid ("322cd467-90c3-434c-889e-3ba97c9654f0")
        private SmDependency symetricDep;

        @objid ("89c39c16-1b4d-4251-92bc-36885ba8a91f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RequiredInterfaceData)data).mNaryProvider != null)? ((RequiredInterfaceData)data).mNaryProvider:SmMultipleDependency.EMPTY;
        }

        @objid ("6c6c9afc-1b37-49ad-b167-81aed0245582")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RequiredInterfaceData) data).mNaryProvider = values;
        }

        @objid ("f7ade167-645c-4fc9-82c8-48166b1763d4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryLinkEndSmClass)this.getTarget()).getConsumerDep();
            }
            return this.symetricDep;
        }

    }

}
