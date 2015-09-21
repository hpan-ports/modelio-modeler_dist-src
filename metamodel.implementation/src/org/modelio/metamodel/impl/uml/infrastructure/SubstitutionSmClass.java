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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("2023cbd9-0f99-421d-982c-f6ccede2a596")
public class SubstitutionSmClass extends ModelElementSmClass {
    @objid ("c8326980-066a-4d57-9b2e-8f2c14996256")
    private SmDependency contractDep;

    @objid ("9f48f77b-8297-43b0-9118-86836546e909")
    private SmDependency substitutingClassifierDep;

    @objid ("f43d46c3-4644-49df-bd5a-48ba4826ffe4")
    public SubstitutionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("8f838afc-146f-4ac3-a65e-ea14be928cf8")
    @Override
    public String getName() {
        return "Substitution";
    }

    @objid ("ef591262-d3f0-48ad-add2-ea2f94bde69d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("3caf5f59-d87d-4e33-aa52-98f02245dd27")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Substitution.class;
    }

    @objid ("d30cf686-ee5b-4c5f-a3af-ef724a791a71")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("54b1350a-48bf-40d5-a6eb-ff0df05c5aaf")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("74455d52-bd10-49eb-b892-6bcc6c402784")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new SubstitutionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        
        // Initialize and register the SmDependency
        this.contractDep = new ContractSmDependency();
        this.contractDep.init("Contract", this, metamodel.getMClass("Classifier"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.contractDep);
        
        this.substitutingClassifierDep = new SubstitutingClassifierSmDependency();
        this.substitutingClassifierDep.init("SubstitutingClassifier", this, metamodel.getMClass("Classifier"), 0, 1 );
        registerDependency(this.substitutingClassifierDep);
    }

    @objid ("0e322ab8-428e-468f-a103-5f34a792312c")
    public SmDependency getContractDep() {
        if (this.contractDep == null) {
        	this.contractDep = this.getDependencyDef("Contract");
        }
        return this.contractDep;
    }

    @objid ("907a67d9-d3d3-4092-8124-ef42bc5c2920")
    public SmDependency getSubstitutingClassifierDep() {
        if (this.substitutingClassifierDep == null) {
        	this.substitutingClassifierDep = this.getDependencyDef("SubstitutingClassifier");
        }
        return this.substitutingClassifierDep;
    }

    @objid ("2c935a9a-64c6-48de-897c-da1199a2f969")
    private static class SubstitutionObjectFactory implements ISmObjectFactory {
        @objid ("4be3fa24-a0b6-439c-ba69-c106991dc07a")
        private SubstitutionSmClass smClass;

        @objid ("87457d66-2fad-4dd6-979e-120cf0cc6177")
        public SubstitutionObjectFactory(SubstitutionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("9596b505-ad8a-4fa5-929d-d8ea318154c8")
        @Override
        public ISmObjectData createData() {
            return new SubstitutionData(this.smClass);
        }

        @objid ("0131db22-603d-450d-8019-cb453b506609")
        @Override
        public SmObjectImpl createImpl() {
            return new SubstitutionImpl();
        }

    }

    @objid ("23b68184-f87a-4351-9dbd-49963aef23ce")
    public static class ContractSmDependency extends SmSingleDependency {
        @objid ("24444e28-d0e3-4622-ae62-04b3b0424696")
        private SmDependency symetricDep;

        @objid ("5a242939-c812-4ebf-a130-b0180a134ad5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SubstitutionData) data).mContract;
        }

        @objid ("625ca634-84ee-4ca4-9c46-71c3a346b598")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SubstitutionData) data).mContract = value;
        }

        @objid ("56718d2f-9216-40d5-8aa2-23f672a8d466")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getSubstitutingSubstitutionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("643ca8f9-6576-4225-a7c6-a3271c50632b")
    public static class SubstitutingClassifierSmDependency extends SmSingleDependency {
        @objid ("71f697bd-83a6-4c2d-9154-db9b8b6616d4")
        private SmDependency symetricDep;

        @objid ("56bc13e6-4b95-474f-83b2-0eef7c497a4c")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((SubstitutionData) data).mSubstitutingClassifier;
        }

        @objid ("c3123032-d82e-406b-893f-d54e09ee1b81")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((SubstitutionData) data).mSubstitutingClassifier = value;
        }

        @objid ("e815df55-e0e7-408e-9536-a68c929adfd7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getSubstituedDep();
            }
            return this.symetricDep;
        }

    }

}
