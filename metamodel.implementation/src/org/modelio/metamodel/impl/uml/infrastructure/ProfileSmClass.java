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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.mda.ModuleComponentSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageSmClass;
import org.modelio.metamodel.uml.infrastructure.Profile;
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

@objid ("8062fd8e-8258-4289-a68a-5b061a57688c")
public class ProfileSmClass extends PackageSmClass {
    @objid ("f3443f43-b68d-4617-9d7f-e75000eac029")
    private SmAttribute jCodeAtt;

    @objid ("412e0211-565f-42ea-9bfe-11f5f134037e")
    private SmDependency definedStereotypeDep;

    @objid ("b16e506a-eced-40e8-8927-c358fe85f9e5")
    private SmDependency ownerModuleDep;

    @objid ("7e6113a7-edc8-4f61-82f2-b4a4ea2f31f0")
    private SmDependency ownedReferenceDep;

    @objid ("177c95a3-1ce8-45be-8e85-699da60de057")
    public ProfileSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7051c04c-4299-4b4f-aad9-83c441553047")
    @Override
    public String getName() {
        return "Profile";
    }

    @objid ("92583611-a0af-44c7-89a5-e5e80dfc98a9")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("169f7bdd-5511-4afa-8356-61785fb52297")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Profile.class;
    }

    @objid ("eed4d006-140e-46bd-be3d-7daa107a2879")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("a4d8b528-2849-4740-b092-a11721eb84c0")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("480b33f3-c0ef-43bb-bec6-a18513d3a366")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Package");
        this.registerFactory(new ProfileObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.jCodeAtt = new JCodeSmAttribute();
        this.jCodeAtt.init("JCode", this, String.class );
        registerAttribute(this.jCodeAtt);
        
        
        // Initialize and register the SmDependency
        this.definedStereotypeDep = new DefinedStereotypeSmDependency();
        this.definedStereotypeDep.init("DefinedStereotype", this, metamodel.getMClass("Stereotype"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedStereotypeDep);
        
        this.ownerModuleDep = new OwnerModuleSmDependency();
        this.ownerModuleDep.init("OwnerModule", this, metamodel.getMClass("ModuleComponent"), 0, 1 );
        registerDependency(this.ownerModuleDep);
        
        this.ownedReferenceDep = new OwnedReferenceSmDependency();
        this.ownedReferenceDep.init("OwnedReference", this, metamodel.getMClass("MetaclassReference"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedReferenceDep);
    }

    @objid ("fd3d7114-f677-4293-86ae-4716ba2a3f1e")
    public SmAttribute getJCodeAtt() {
        if (this.jCodeAtt == null) {
        	this.jCodeAtt = this.getAttributeDef("JCode");
        }
        return this.jCodeAtt;
    }

    @objid ("dde08c35-745a-4b87-9b70-4111bb73eefc")
    public SmDependency getDefinedStereotypeDep() {
        if (this.definedStereotypeDep == null) {
        	this.definedStereotypeDep = this.getDependencyDef("DefinedStereotype");
        }
        return this.definedStereotypeDep;
    }

    @objid ("4543568b-7f66-4250-aafc-02ecfbffd4a6")
    public SmDependency getOwnerModuleDep() {
        if (this.ownerModuleDep == null) {
        	this.ownerModuleDep = this.getDependencyDef("OwnerModule");
        }
        return this.ownerModuleDep;
    }

    @objid ("77f03171-915b-4954-aa45-244232d38986")
    public SmDependency getOwnedReferenceDep() {
        if (this.ownedReferenceDep == null) {
        	this.ownedReferenceDep = this.getDependencyDef("OwnedReference");
        }
        return this.ownedReferenceDep;
    }

    @objid ("ce78e16c-a4ce-4a16-aeab-cabbcba9a06f")
    private static class ProfileObjectFactory implements ISmObjectFactory {
        @objid ("88a835fd-64d4-4d7c-8cb9-78eee240d1d8")
        private ProfileSmClass smClass;

        @objid ("ea7c99dc-3488-4236-91bb-ee7d998e464f")
        public ProfileObjectFactory(ProfileSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("0d23b460-0ca8-4320-87ed-062a61204352")
        @Override
        public ISmObjectData createData() {
            return new ProfileData(this.smClass);
        }

        @objid ("f6841201-d0db-49c7-b145-3dc82e62eea2")
        @Override
        public SmObjectImpl createImpl() {
            return new ProfileImpl();
        }

    }

    @objid ("21542d28-62c5-4f87-a384-aabfe0ef09a8")
    public static class JCodeSmAttribute extends SmAttribute {
        @objid ("336fc3e3-2a10-4ebe-8dbc-7c4a21be9969")
        public Object getValue(ISmObjectData data) {
            return ((ProfileData) data).mJCode;
        }

        @objid ("2983901e-af4d-412c-b931-28bef9fc878f")
        public void setValue(ISmObjectData data, Object value) {
            ((ProfileData) data).mJCode = value;
        }

    }

    @objid ("bae808c2-58dd-44a4-ac8f-4d443efd0143")
    public static class DefinedStereotypeSmDependency extends SmMultipleDependency {
        @objid ("e2c57d4b-445d-4d0f-9fb4-ac5a37088966")
        private SmDependency symetricDep;

        @objid ("96b3f82d-7a16-4698-8dbf-170bd5984ed6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ProfileData)data).mDefinedStereotype != null)? ((ProfileData)data).mDefinedStereotype:SmMultipleDependency.EMPTY;
        }

        @objid ("8c4141a7-2208-44f2-bd49-35e97f517695")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ProfileData) data).mDefinedStereotype = values;
        }

        @objid ("ca87c470-12f7-4fb5-bdfb-ec1638ba0107")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cf815a3d-3079-4a7d-b4cf-5eec371fedde")
    public static class OwnerModuleSmDependency extends SmSingleDependency {
        @objid ("8e3599db-c81d-4fbb-9074-7a4dc294da3d")
        private SmDependency symetricDep;

        @objid ("02dde133-922d-4c74-bb1a-0285a406c9cc")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ProfileData) data).mOwnerModule;
        }

        @objid ("54e5bc47-9cff-41d1-b87a-f44f53550da4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ProfileData) data).mOwnerModule = value;
        }

        @objid ("4055827c-f84d-4ebb-817d-5915ed10a99f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleComponentSmClass)this.getTarget()).getOwnedProfileDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8422b4ea-d67c-4405-9583-c26589ba74a9")
    public static class OwnedReferenceSmDependency extends SmMultipleDependency {
        @objid ("23ab3af6-40c4-4f33-9143-ec22678952af")
        private SmDependency symetricDep;

        @objid ("cf1090ff-5d12-43d3-8b3b-5df6688b0adc")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ProfileData)data).mOwnedReference != null)? ((ProfileData)data).mOwnedReference:SmMultipleDependency.EMPTY;
        }

        @objid ("dd6898b0-089f-4d50-97fd-1c4c603b0127")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ProfileData) data).mOwnedReference = values;
        }

        @objid ("ba243ec1-9cdf-45eb-bfcd-8d645daf2959")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MetaclassReferenceSmClass)this.getTarget()).getOwnerProfileDep();
            }
            return this.symetricDep;
        }

    }

}
