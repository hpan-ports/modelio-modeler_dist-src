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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionOperandSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.LifelineSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
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

@objid ("a59b98cb-268c-4bfd-b2e2-971cbd7c6ee9")
public class InteractionFragmentSmClass extends ModelElementSmClass {
    @objid ("be38e385-9fbc-4e22-aa14-164290e05394")
    private SmAttribute lineNumberAtt;

    @objid ("f8b57b8b-1e98-48b0-a88d-d8c85c193a2d")
    private SmDependency enclosingOperandDep;

    @objid ("e5be65a0-164d-463f-9317-f211ea1d4976")
    private SmDependency enclosingInteractionDep;

    @objid ("5e6bb391-f01d-4ea4-9d5f-5d9d47c3ad16")
    private SmDependency coveredDep;

    @objid ("8b9299b0-c322-44fb-aa78-0a8243803069")
    public InteractionFragmentSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("61512bfd-b6d2-46a0-93c4-0f72cf748dac")
    @Override
    public String getName() {
        return "InteractionFragment";
    }

    @objid ("44cacc99-e254-486e-a013-4daf8f795c8f")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("479d54e2-3623-450e-acf9-e8051c69d820")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return InteractionFragment.class;
    }

    @objid ("3450c7df-43f8-4747-9280-94ef152c6011")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("245d6164-ed6b-4b88-9a0f-56b5e2993f63")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("179a008b-99a6-4abb-b1de-9917fcefb85b")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new InteractionFragmentObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.lineNumberAtt = new LineNumberSmAttribute();
        this.lineNumberAtt.init("LineNumber", this, Integer.class );
        registerAttribute(this.lineNumberAtt);
        
        
        // Initialize and register the SmDependency
        this.enclosingOperandDep = new EnclosingOperandSmDependency();
        this.enclosingOperandDep.init("EnclosingOperand", this, metamodel.getMClass("InteractionOperand"), 0, 1 );
        registerDependency(this.enclosingOperandDep);
        
        this.enclosingInteractionDep = new EnclosingInteractionSmDependency();
        this.enclosingInteractionDep.init("EnclosingInteraction", this, metamodel.getMClass("Interaction"), 0, 1 );
        registerDependency(this.enclosingInteractionDep);
        
        this.coveredDep = new CoveredSmDependency();
        this.coveredDep.init("Covered", this, metamodel.getMClass("Lifeline"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.coveredDep);
    }

    @objid ("d4d26488-6ac8-4064-90d0-be0ceaed8a38")
    public SmAttribute getLineNumberAtt() {
        if (this.lineNumberAtt == null) {
        	this.lineNumberAtt = this.getAttributeDef("LineNumber");
        }
        return this.lineNumberAtt;
    }

    @objid ("2a86536d-19c5-4cbd-aaf0-6148637595a6")
    public SmDependency getEnclosingOperandDep() {
        if (this.enclosingOperandDep == null) {
        	this.enclosingOperandDep = this.getDependencyDef("EnclosingOperand");
        }
        return this.enclosingOperandDep;
    }

    @objid ("94d1736e-c9a3-4e63-abf2-289f4baa78c8")
    public SmDependency getEnclosingInteractionDep() {
        if (this.enclosingInteractionDep == null) {
        	this.enclosingInteractionDep = this.getDependencyDef("EnclosingInteraction");
        }
        return this.enclosingInteractionDep;
    }

    @objid ("dbe33b37-3af3-4807-bfca-72b429d5ea14")
    public SmDependency getCoveredDep() {
        if (this.coveredDep == null) {
        	this.coveredDep = this.getDependencyDef("Covered");
        }
        return this.coveredDep;
    }

    @objid ("dde6b7ef-cb6e-4e3f-b86c-c895c26f1b4e")
    private static class InteractionFragmentObjectFactory implements ISmObjectFactory {
        @objid ("9fdacd23-4281-495a-8782-274f2283e0f7")
        private InteractionFragmentSmClass smClass;

        @objid ("7613ad66-685e-4259-ad8c-8201cb5388e0")
        public InteractionFragmentObjectFactory(InteractionFragmentSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c396a31c-df87-47cd-acf6-14b461248405")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("e1b578df-d851-4336-8590-0e9c85808637")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("c1bfc055-032c-4458-a5c9-94066db1c4ca")
    public static class LineNumberSmAttribute extends SmAttribute {
        @objid ("69788f2d-7736-46c5-8d1e-b5696580a785")
        public Object getValue(ISmObjectData data) {
            return ((InteractionFragmentData) data).mLineNumber;
        }

        @objid ("23818c1a-6b9c-4672-89ab-dff89d76fe35")
        public void setValue(ISmObjectData data, Object value) {
            ((InteractionFragmentData) data).mLineNumber = value;
        }

    }

    @objid ("1cacd495-972e-4652-ba48-bf1d30b3ca7a")
    public static class EnclosingOperandSmDependency extends SmSingleDependency {
        @objid ("3a5febb9-953f-410f-9549-b14f1fc21db0")
        private SmDependency symetricDep;

        @objid ("c6847d86-5b60-42f2-a9d1-75776514e1ed")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InteractionFragmentData) data).mEnclosingOperand;
        }

        @objid ("e4293d0d-b7e1-46b1-8784-3757d9813e91")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InteractionFragmentData) data).mEnclosingOperand = value;
        }

        @objid ("b8743071-b8bf-4f0a-80ce-f4c64fb9ff3a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionOperandSmClass)this.getTarget()).getFragmentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("10a3a98a-77a5-4750-a2b6-e1fa2b1652a6")
    public static class EnclosingInteractionSmDependency extends SmSingleDependency {
        @objid ("6a55032b-eb21-447d-85a7-956d106bef2c")
        private SmDependency symetricDep;

        @objid ("a9f4d259-0e06-46ac-a25a-8c45143a339f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((InteractionFragmentData) data).mEnclosingInteraction;
        }

        @objid ("8b83cde5-2659-417a-ae96-cca19c86707b")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((InteractionFragmentData) data).mEnclosingInteraction = value;
        }

        @objid ("15ac501c-5636-48c1-9184-6f7f356b829d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionSmClass)this.getTarget()).getFragmentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("86192b6d-d8c1-494c-a80c-c01d782418c2")
    public static class CoveredSmDependency extends SmMultipleDependency {
        @objid ("943c4b33-4375-44c0-b430-ac4447156837")
        private SmDependency symetricDep;

        @objid ("f2118140-8898-49f5-b64d-24413129258f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((InteractionFragmentData)data).mCovered != null)? ((InteractionFragmentData)data).mCovered:SmMultipleDependency.EMPTY;
        }

        @objid ("47be227f-f9f2-40b0-871e-1ab4d7357940")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((InteractionFragmentData) data).mCovered = values;
        }

        @objid ("0ba4e6f7-c964-4fba-baa8-df31c3082e0a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LifelineSmClass)this.getTarget()).getCoveredByDep();
            }
            return this.symetricDep;
        }

    }

}
