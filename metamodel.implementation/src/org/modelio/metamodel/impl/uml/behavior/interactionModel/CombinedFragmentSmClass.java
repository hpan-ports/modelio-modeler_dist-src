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
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionFragmentSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionOperandSmClass;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
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
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("3f397821-349f-4e2d-ae6b-17b4abaddfb2")
public class CombinedFragmentSmClass extends InteractionFragmentSmClass {
    @objid ("331a00e5-7394-4ed9-9690-7062d89c3540")
    private SmAttribute operatorAtt;

    @objid ("4a201743-cfec-4ffe-8d28-142df392217a")
    private SmDependency operandDep;

    @objid ("4dded95c-5d72-48cc-9125-6cf0a8433510")
    private SmDependency fragmentGateDep;

    @objid ("34d991a9-98b7-471a-ae27-39b5cefd981a")
    public CombinedFragmentSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("b6b373a6-be0a-4b50-9726-14673874e865")
    @Override
    public String getName() {
        return "CombinedFragment";
    }

    @objid ("661e485d-3c5b-4a4a-bfda-ead7f375f467")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("5c7a6cd7-cc45-4dba-bfe5-a10b0516d05a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return CombinedFragment.class;
    }

    @objid ("40775d69-e9e3-44d1-a843-04b204d49022")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("a675b127-8d36-4464-8643-312bfb5b8f58")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("f4b7f629-9e3b-4062-94c3-617bd8f9e7c3")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("InteractionFragment");
        this.registerFactory(new CombinedFragmentObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.operatorAtt = new OperatorSmAttribute();
        this.operatorAtt.init("Operator", this, InteractionOperator.class );
        registerAttribute(this.operatorAtt);
        
        
        // Initialize and register the SmDependency
        this.operandDep = new OperandSmDependency();
        this.operandDep.init("Operand", this, metamodel.getMClass("InteractionOperand"), 1, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.operandDep);
        
        this.fragmentGateDep = new FragmentGateSmDependency();
        this.fragmentGateDep.init("FragmentGate", this, metamodel.getMClass("Gate"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.fragmentGateDep);
    }

    @objid ("5903742c-811f-4f73-b4a2-f9a7c9ad9652")
    public SmAttribute getOperatorAtt() {
        if (this.operatorAtt == null) {
        	this.operatorAtt = this.getAttributeDef("Operator");
        }
        return this.operatorAtt;
    }

    @objid ("ea98382a-c619-43bb-bb05-ff996b2217af")
    public SmDependency getOperandDep() {
        if (this.operandDep == null) {
        	this.operandDep = this.getDependencyDef("Operand");
        }
        return this.operandDep;
    }

    @objid ("8118643b-b84a-4d70-8800-cc509bb6956f")
    public SmDependency getFragmentGateDep() {
        if (this.fragmentGateDep == null) {
        	this.fragmentGateDep = this.getDependencyDef("FragmentGate");
        }
        return this.fragmentGateDep;
    }

    @objid ("b07c119b-715d-4118-9959-2827cb727308")
    private static class CombinedFragmentObjectFactory implements ISmObjectFactory {
        @objid ("e77bb0c2-b542-4eb2-a4ba-4e932e518199")
        private CombinedFragmentSmClass smClass;

        @objid ("a32967ac-cb4d-4ca0-bbb4-a1413883fef6")
        public CombinedFragmentObjectFactory(CombinedFragmentSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("d2a1c571-13cb-47b5-a414-85302557bc17")
        @Override
        public ISmObjectData createData() {
            return new CombinedFragmentData(this.smClass);
        }

        @objid ("b6393dbe-b07a-4a82-a16c-e47e9cb5b118")
        @Override
        public SmObjectImpl createImpl() {
            return new CombinedFragmentImpl();
        }

    }

    @objid ("163f065b-78ed-42e8-9806-42ee66b2a0c8")
    public static class OperatorSmAttribute extends SmAttribute {
        @objid ("972102f6-3845-4c25-9217-0a3ce6e61716")
        public Object getValue(ISmObjectData data) {
            return ((CombinedFragmentData) data).mOperator;
        }

        @objid ("8de51a7b-2b73-4245-b797-d1937d27528b")
        public void setValue(ISmObjectData data, Object value) {
            ((CombinedFragmentData) data).mOperator = value;
        }

    }

    @objid ("c0f0a5dc-6877-4862-8ce7-13945f8cebef")
    public static class OperandSmDependency extends SmMultipleDependency {
        @objid ("cb834eea-19f3-466c-aceb-5b9eec9d751d")
        private SmDependency symetricDep;

        @objid ("929a7b57-60c9-4740-98ce-77e5683ea2f4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CombinedFragmentData)data).mOperand != null)? ((CombinedFragmentData)data).mOperand:SmMultipleDependency.EMPTY;
        }

        @objid ("64d3d224-ed25-4ec7-ba09-28f1b2aaa85b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CombinedFragmentData) data).mOperand = values;
        }

        @objid ("cc790593-cc30-417a-a4ff-0f2dfad88d02")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InteractionOperandSmClass)this.getTarget()).getOwnerFragmentDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("37a15144-1167-4ea2-ba7b-cad82afe54d9")
    public static class FragmentGateSmDependency extends SmMultipleDependency {
        @objid ("de9317ce-952c-4779-b8e0-c803d104c8af")
        private SmDependency symetricDep;

        @objid ("20bc040c-afc2-4830-922f-fb3e0ba0913e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((CombinedFragmentData)data).mFragmentGate != null)? ((CombinedFragmentData)data).mFragmentGate:SmMultipleDependency.EMPTY;
        }

        @objid ("2cbb78d8-75c2-493d-9275-a63b2fe2e833")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((CombinedFragmentData) data).mFragmentGate = values;
        }

        @objid ("c13960a0-cc8d-4173-aa00-2dc1b30194fb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((GateSmClass)this.getTarget()).getOwnerFragmentDep();
            }
            return this.symetricDep;
        }

    }

}
