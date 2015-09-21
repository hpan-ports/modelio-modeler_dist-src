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
import org.modelio.metamodel.impl.uml.behavior.usecaseModel.UseCaseSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
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

@objid ("c0c422fc-6fa7-44af-bc45-b6db86732826")
public class UseCaseDependencySmClass extends ModelElementSmClass {
    @objid ("8e21f006-6e6f-42c1-ba79-80bce1e88e59")
    private SmDependency originDep;

    @objid ("27f0ec1d-ebc0-42d4-9a83-b77ff4890c05")
    private SmDependency extensionLocationDep;

    @objid ("e5c7be35-0085-4f8c-aa49-d819f1526674")
    private SmDependency targetDep;

    @objid ("4d91dcce-1922-4902-95b1-eea16a2918a4")
    public UseCaseDependencySmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("78ea6dee-c73e-43a4-8abb-a1e0c972ed21")
    @Override
    public String getName() {
        return "UseCaseDependency";
    }

    @objid ("e30b2c6c-03b6-476c-bb4e-dc5aeb0c6677")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("8a89db21-7a3f-4cd0-9447-353e51e4b8bb")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return UseCaseDependency.class;
    }

    @objid ("612d2f96-7b03-4ec1-9e17-7f0e3a53782c")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("69e62a1c-6b89-4289-b324-6cfdf08c3572")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("59ba6805-2f28-49db-ac4e-283adc9477c7")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new UseCaseDependencyObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.originDep = new OriginSmDependency();
        this.originDep.init("Origin", this, metamodel.getMClass("UseCase"), 1, 1 );
        registerDependency(this.originDep);
        
        this.extensionLocationDep = new ExtensionLocationSmDependency();
        this.extensionLocationDep.init("ExtensionLocation", this, metamodel.getMClass("ExtensionPoint"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.extensionLocationDep);
        
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("UseCase"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
    }

    @objid ("1262cad5-87c4-45e1-8a1f-4de75d4ec352")
    public SmDependency getOriginDep() {
        if (this.originDep == null) {
        	this.originDep = this.getDependencyDef("Origin");
        }
        return this.originDep;
    }

    @objid ("556c3d7e-7556-4019-b474-3c208af0f0fa")
    public SmDependency getExtensionLocationDep() {
        if (this.extensionLocationDep == null) {
        	this.extensionLocationDep = this.getDependencyDef("ExtensionLocation");
        }
        return this.extensionLocationDep;
    }

    @objid ("2ed23656-fd2c-4ff0-a6df-68b4a67efc8d")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("53da7787-d272-4107-9db9-1402aed3a9eb")
    private static class UseCaseDependencyObjectFactory implements ISmObjectFactory {
        @objid ("bf69e9da-6860-476b-86b8-ddcce619574a")
        private UseCaseDependencySmClass smClass;

        @objid ("def0f031-85bd-419a-a452-4dc4c7ab1eb5")
        public UseCaseDependencyObjectFactory(UseCaseDependencySmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("85fa0eed-5f39-442f-93dd-08fe39cdeb62")
        @Override
        public ISmObjectData createData() {
            return new UseCaseDependencyData(this.smClass);
        }

        @objid ("7dd45d5d-2ad8-428c-8cde-989c477dad67")
        @Override
        public SmObjectImpl createImpl() {
            return new UseCaseDependencyImpl();
        }

    }

    @objid ("4b9f3ec2-4476-457c-960d-30166eeb54fc")
    public static class OriginSmDependency extends SmSingleDependency {
        @objid ("68ee105a-a7b0-4b44-9941-5d2a77ceedb5")
        private SmDependency symetricDep;

        @objid ("89b5e4f1-172d-4848-b42c-686c5d30bc77")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((UseCaseDependencyData) data).mOrigin;
        }

        @objid ("201e6b66-d7b2-46e2-8125-1fa52a39fa67")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((UseCaseDependencyData) data).mOrigin = value;
        }

        @objid ("461df5ba-949b-4a03-b056-d02f8205349b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseSmClass)this.getTarget()).getUsedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e6624f00-7087-4e88-8606-57423c1437ff")
    public static class ExtensionLocationSmDependency extends SmMultipleDependency {
        @objid ("22388044-21e8-4df1-a54b-daf87a3f59ae")
        private SmDependency symetricDep;

        @objid ("5913ec91-4a2c-4335-9ca1-d92890f3fcd3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((UseCaseDependencyData)data).mExtensionLocation != null)? ((UseCaseDependencyData)data).mExtensionLocation:SmMultipleDependency.EMPTY;
        }

        @objid ("9a107cf6-e146-4988-afcc-600c61a3bf76")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((UseCaseDependencyData) data).mExtensionLocation = values;
        }

        @objid ("daacd120-f70d-45c7-aecc-6f1cf165d96b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExtensionPointSmClass)this.getTarget()).getExtendedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3d1a72de-6535-45a7-93f9-8db6535bf1de")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("eb17b899-d780-47c1-95fb-8d6f9e6ac470")
        private SmDependency symetricDep;

        @objid ("b6c749a0-6a70-4bf3-8988-b102cb1c145f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((UseCaseDependencyData) data).mTarget;
        }

        @objid ("94d50414-dcf1-48b5-b5de-f95fd024e5d4")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((UseCaseDependencyData) data).mTarget = value;
        }

        @objid ("f15661d7-feb4-4be3-a418-0c2f344524bd")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((UseCaseSmClass)this.getTarget()).getUserDep();
            }
            return this.symetricDep;
        }

    }

}
