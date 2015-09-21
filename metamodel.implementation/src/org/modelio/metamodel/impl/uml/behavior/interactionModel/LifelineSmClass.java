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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.PartDecompositionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.InstanceSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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

@objid ("21ee1855-80e2-44cf-9070-e41222bd7696")
public class LifelineSmClass extends ModelElementSmClass {
    @objid ("6258cb3d-0b6e-42f6-afbb-94d966381cb2")
    private SmAttribute selectorAtt;

    @objid ("586c7a24-843d-4a36-b076-845f83f316c3")
    private SmDependency coveredByDep;

    @objid ("2e8d928f-d4ab-4ef0-92f6-557574739c77")
    private SmDependency decomposedAsDep;

    @objid ("792e57c3-41a7-4db4-9e80-8870a3489d64")
    private SmDependency ownerDep;

    @objid ("fc3b2478-c63c-4372-9a77-949314330a32")
    private SmDependency representedDep;

    @objid ("a9b4b98d-2cd3-48ed-9113-c2907859c176")
    public LifelineSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("ea0b5157-fd7b-4de3-bb03-de094dcb7a5b")
    @Override
    public String getName() {
        return "Lifeline";
    }

    @objid ("27288da8-56a8-4075-843d-e2a0d800c2ee")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("a1b866e8-0e0e-49d4-9a9a-3d80121cde01")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Lifeline.class;
    }

    @objid ("4a0efe0a-9386-432a-816c-6eca2fe0afae")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("24e27320-73ca-483c-9b83-f4b08f4177d9")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("85780093-5e8c-4c27-aaff-b4278c38d7ee")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new LifelineObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.selectorAtt = new SelectorSmAttribute();
        this.selectorAtt.init("Selector", this, String.class );
        registerAttribute(this.selectorAtt);
        
        
        // Initialize and register the SmDependency
        this.coveredByDep = new CoveredBySmDependency();
        this.coveredByDep.init("CoveredBy", this, metamodel.getMClass("InteractionFragment"), 0, -1 );
        registerDependency(this.coveredByDep);
        
        this.decomposedAsDep = new DecomposedAsSmDependency();
        this.decomposedAsDep.init("DecomposedAs", this, metamodel.getMClass("PartDecomposition"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.decomposedAsDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Interaction"), 0, 1 );
        registerDependency(this.ownerDep);
        
        this.representedDep = new RepresentedSmDependency();
        this.representedDep.init("Represented", this, metamodel.getMClass("Instance"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.representedDep);
    }

    @objid ("a3183f61-287f-4fc6-9240-66d786cb950b")
    public SmAttribute getSelectorAtt() {
        if (this.selectorAtt == null) {
        	this.selectorAtt = this.getAttributeDef("Selector");
        }
        return this.selectorAtt;
    }

    @objid ("ba1c6843-988c-4c6d-bc06-3ee974e5db4e")
    public SmDependency getCoveredByDep() {
        if (this.coveredByDep == null) {
        	this.coveredByDep = this.getDependencyDef("CoveredBy");
        }
        return this.coveredByDep;
    }

    @objid ("a48c4095-10ff-4c42-bc36-afb2882f4873")
    public SmDependency getDecomposedAsDep() {
        if (this.decomposedAsDep == null) {
        	this.decomposedAsDep = this.getDependencyDef("DecomposedAs");
        }
        return this.decomposedAsDep;
    }

    @objid ("2bf06421-2113-481a-a5ff-58d04b6ceace")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("b10c8d14-bcaf-484a-ab27-8c37e4d281e1")
    public SmDependency getRepresentedDep() {
        if (this.representedDep == null) {
        	this.representedDep = this.getDependencyDef("Represented");
        }
        return this.representedDep;
    }

    @objid ("4981fb18-0862-4b4c-b798-be29b661bdce")
    private static class LifelineObjectFactory implements ISmObjectFactory {
        @objid ("f5bf66b2-5cd8-4ac9-80ea-360d56e59aff")
        private LifelineSmClass smClass;

        @objid ("54215eed-c9bc-49d2-afe4-32fc979a1a37")
        public LifelineObjectFactory(LifelineSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("cffa5433-ae07-4f19-9b1b-1911126124bb")
        @Override
        public ISmObjectData createData() {
            return new LifelineData(this.smClass);
        }

        @objid ("32e498f2-fe09-4da7-bf60-2bc8f4233176")
        @Override
        public SmObjectImpl createImpl() {
            return new LifelineImpl();
        }

    }

    @objid ("9cf6af02-8f2d-49b9-8a58-eec9ab086e6a")
    public static class SelectorSmAttribute extends SmAttribute {
        @objid ("1d96b0f6-dbe1-411b-ac88-a11c9b8a65de")
        public Object getValue(ISmObjectData data) {
            return ((LifelineData) data).mSelector;
        }

        @objid ("31443665-f949-4093-a3f7-ee44f99a692b")
        public void setValue(ISmObjectData data, Object value) {
            ((LifelineData) data).mSelector = value;
        }

    }

    @objid ("d3f770aa-d891-430b-a0c7-978e2f48af48")
    public static class CoveredBySmDependency extends SmMultipleDependency {
        @objid ("977e3dfe-403b-44ec-8c85-24bbeeb2b05f")
        private SmDependency symetricDep;

        @objid ("1aa32b77-fe00-4def-83cc-2f5a3e860a0c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((LifelineData)data).mCoveredBy != null)? ((LifelineData)data).mCoveredBy:SmMultipleDependency.EMPTY;
        }

        @objid ("faa9ccf3-8ccf-4a7a-a8e8-226920f24a4c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((LifelineData) data).mCoveredBy = values;
        }

        @objid ("b92d4026-9780-4280-a314-56c910d70e17")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionFragmentSmClass)this.getTarget()).getCoveredDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("cd2a8e87-9aff-48f4-9b26-bed520f62dad")
    public static class DecomposedAsSmDependency extends SmSingleDependency {
        @objid ("e46fb190-644e-43f3-b578-bf74c22c33fb")
        private SmDependency symetricDep;

        @objid ("b1e98b77-76cf-4139-a104-047032183a02")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LifelineData) data).mDecomposedAs;
        }

        @objid ("da27f545-c3f6-4aa6-a07e-24ec837d5724")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LifelineData) data).mDecomposedAs = value;
        }

        @objid ("4bf100e5-8f52-4832-b0eb-5723256ec656")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PartDecompositionSmClass)this.getTarget()).getDecomposedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5f6502f7-a785-45d9-80ce-bb0e6235402c")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("7777a85f-a0d9-41ca-bb8c-d356cf88601b")
        private SmDependency symetricDep;

        @objid ("cd7c37c5-1a3f-4c58-9330-6662e02cde47")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LifelineData) data).mOwner;
        }

        @objid ("7d954572-f861-4e9f-af2a-3a522903f8f8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LifelineData) data).mOwner = value;
        }

        @objid ("6ad0d185-0475-4605-9430-953c032e8083")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionSmClass)this.getTarget()).getOwnedLineDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("82c7e5a2-0ece-4f0b-aa1c-84fa7c8b818a")
    public static class RepresentedSmDependency extends SmSingleDependency {
        @objid ("0e5a2b8a-4401-4b9f-be4f-e0e2719e6227")
        private SmDependency symetricDep;

        @objid ("4ee8bb76-bd9e-4250-9abd-d9b2aa782394")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((LifelineData) data).mRepresented;
        }

        @objid ("cde5c496-18cf-4b71-a327-a9abcf4734ac")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((LifelineData) data).mRepresented = value;
        }

        @objid ("ae265fd8-2a65-4337-a620-616666bbc71d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InstanceSmClass)this.getTarget()).getRepresentedLifeLineDep();
            }
            return this.symetricDep;
        }

    }

}
