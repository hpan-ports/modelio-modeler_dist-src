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
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.impl.analyst.AnalystContainerSmClass;
import org.modelio.metamodel.impl.analyst.AnalystProjectSmClass;
import org.modelio.metamodel.impl.analyst.RiskContainerSmClass;
import org.modelio.metamodel.impl.analyst.RiskSmClass;
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

@objid ("c767bbe6-883c-4db4-a38e-54e026923a67")
public class RiskContainerSmClass extends AnalystContainerSmClass {
    @objid ("90ef23a6-7b6a-45b8-8d37-a81a947abdb4")
    private SmDependency ownedRiskDep;

    @objid ("53a6f177-73de-47f6-89dc-03f916141dab")
    private SmDependency ownerContainerDep;

    @objid ("8dfb6b6a-f483-424a-9e94-024ce3d370d4")
    private SmDependency ownedContainerDep;

    @objid ("45eb3203-d980-4621-8bed-3a583211e124")
    private SmDependency ownerProjectDep;

    @objid ("016787fd-86c3-4cdc-812a-446a8fc0a00d")
    public RiskContainerSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5539b85f-a040-4fee-9443-701aee792f73")
    @Override
    public String getName() {
        return "RiskContainer";
    }

    @objid ("384c821e-b95c-4040-9bf1-68d68ea97e1d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9055");
    }

    @objid ("019e2bbb-cdfd-4162-96d9-0de1d94e06ee")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return RiskContainer.class;
    }

    @objid ("585bc619-c7f9-459b-8e63-29dc716c1ecd")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("de03e8ba-1943-4ba5-b462-ce9ae84d7b15")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("a7bf84bf-8807-40cc-9a9f-bc23233f7024")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("AnalystContainer");
        this.registerFactory(new RiskContainerObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.ownedRiskDep = new OwnedRiskSmDependency();
        this.ownedRiskDep.init("OwnedRisk", this, metamodel.getMClass("Risk"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedRiskDep);
        
        this.ownerContainerDep = new OwnerContainerSmDependency();
        this.ownerContainerDep.init("OwnerContainer", this, metamodel.getMClass("RiskContainer"), 0, 1 );
        registerDependency(this.ownerContainerDep);
        
        this.ownedContainerDep = new OwnedContainerSmDependency();
        this.ownedContainerDep.init("OwnedContainer", this, metamodel.getMClass("RiskContainer"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedContainerDep);
        
        this.ownerProjectDep = new OwnerProjectSmDependency();
        this.ownerProjectDep.init("OwnerProject", this, metamodel.getMClass("AnalystProject"), 0, 1 );
        registerDependency(this.ownerProjectDep);
    }

    @objid ("3b0c019f-3ecb-42d6-b681-0f9495c0b4f0")
    public SmDependency getOwnedRiskDep() {
        if (this.ownedRiskDep == null) {
        	this.ownedRiskDep = this.getDependencyDef("OwnedRisk");
        }
        return this.ownedRiskDep;
    }

    @objid ("4e2041c2-d0da-4620-a060-69d100b5faa8")
    public SmDependency getOwnerContainerDep() {
        if (this.ownerContainerDep == null) {
        	this.ownerContainerDep = this.getDependencyDef("OwnerContainer");
        }
        return this.ownerContainerDep;
    }

    @objid ("c987afb6-0204-44a2-83f9-1b923dae9c9e")
    public SmDependency getOwnedContainerDep() {
        if (this.ownedContainerDep == null) {
        	this.ownedContainerDep = this.getDependencyDef("OwnedContainer");
        }
        return this.ownedContainerDep;
    }

    @objid ("4f740204-77bd-4b2a-9cd4-9023d9539f67")
    public SmDependency getOwnerProjectDep() {
        if (this.ownerProjectDep == null) {
        	this.ownerProjectDep = this.getDependencyDef("OwnerProject");
        }
        return this.ownerProjectDep;
    }

    @objid ("386719ef-f55d-443a-8724-2cf99482d319")
    private static class RiskContainerObjectFactory implements ISmObjectFactory {
        @objid ("3c1d9b00-7ec2-41b4-ba34-e71ab4b1be69")
        private RiskContainerSmClass smClass;

        @objid ("5b81d722-d9b8-4e0c-8154-34d9dd164ce8")
        public RiskContainerObjectFactory(RiskContainerSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("1b268bae-ea74-4060-a0b3-f0e4688ea8e5")
        @Override
        public ISmObjectData createData() {
            return new RiskContainerData(this.smClass);
        }

        @objid ("e96e23b2-830c-4057-a986-78e2cac2ffa0")
        @Override
        public SmObjectImpl createImpl() {
            return new RiskContainerImpl();
        }

    }

    @objid ("94e7208c-ac71-4f04-adb0-fea8a7eb1469")
    public static class OwnedRiskSmDependency extends SmMultipleDependency {
        @objid ("f2a90122-f450-454b-a36d-ed8e6686fc41")
        private SmDependency symetricDep;

        @objid ("ff490543-1c64-43ca-bb95-75c12a6db657")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RiskContainerData)data).mOwnedRisk != null)? ((RiskContainerData)data).mOwnedRisk:SmMultipleDependency.EMPTY;
        }

        @objid ("eb029cd0-5080-4894-8aed-fb1a5b6b4a88")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RiskContainerData) data).mOwnedRisk = values;
        }

        @objid ("c31b972b-797f-415b-b83b-7d1e9dde83ee")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f48ae35b-288b-4ad0-914b-ae11b39a49ea")
    public static class OwnerContainerSmDependency extends SmSingleDependency {
        @objid ("ec279250-490c-4f34-82c6-96f38d4d3ec5")
        private SmDependency symetricDep;

        @objid ("f7607553-62ec-4b4c-8a7e-8b5c6bd5b76e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RiskContainerData) data).mOwnerContainer;
        }

        @objid ("505a9062-c0e1-46f6-9922-3e000336d6f1")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RiskContainerData) data).mOwnerContainer = value;
        }

        @objid ("521be1b7-2cfd-4ecc-aa72-1ae507c95191")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskContainerSmClass)this.getTarget()).getOwnedContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a38e1e53-a350-4ff8-9765-714f0ab5d562")
    public static class OwnedContainerSmDependency extends SmMultipleDependency {
        @objid ("0aaef311-2d97-45f8-9215-f365b20f8c3a")
        private SmDependency symetricDep;

        @objid ("b2362e8c-c8f5-4562-b4ec-c103d4ed0538")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((RiskContainerData)data).mOwnedContainer != null)? ((RiskContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
        }

        @objid ("73764221-feac-44cf-82f4-fee3224d69a0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((RiskContainerData) data).mOwnedContainer = values;
        }

        @objid ("c96358f0-b0f0-400e-882b-688c5b43a0b4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RiskContainerSmClass)this.getTarget()).getOwnerContainerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ae617176-5287-4c6f-aa97-0e3765b6afff")
    public static class OwnerProjectSmDependency extends SmSingleDependency {
        @objid ("bc64e416-1d08-4ff5-887f-ccd429fe6b63")
        private SmDependency symetricDep;

        @objid ("3c192c99-36e7-445d-abb2-f223a9feeece")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((RiskContainerData) data).mOwnerProject;
        }

        @objid ("da5fb562-4417-417d-abc6-f0829becc08a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((RiskContainerData) data).mOwnerProject = value;
        }

        @objid ("2c107a24-9b75-41b5-adfd-38f9f0719221")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AnalystProjectSmClass)this.getTarget()).getRiskRootDep();
            }
            return this.symetricDep;
        }

    }

}
