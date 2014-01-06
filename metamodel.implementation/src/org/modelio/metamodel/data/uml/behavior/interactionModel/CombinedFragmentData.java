/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.CombinedFragmentImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0043a60c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CombinedFragment.class, factory=CombinedFragmentData.Metadata.ObjectFactory.class)
public class CombinedFragmentData extends InteractionFragmentData {
    @objid ("4cec9901-cb52-4860-9edf-e36cebd823d1")
    @SmaMetaAttribute(metaName="Operator", type=InteractionOperator.class, smAttributeClass=Metadata.OperatorSmAttribute.class)
     Object mOperator = InteractionOperator.SEQOP;

    @objid ("0348ba9d-5621-434a-b3ca-c1787951c106")
    @SmaMetaAssociation(metaName="Operand", typeDataClass=InteractionOperandData.class, min=1, max=-1, smAssociationClass=Metadata.OperandSmDependency.class, component = true)
     List<SmObjectImpl> mOperand = null;

    @objid ("cb5459ee-61b8-4ffa-8fbf-609333b68548")
    @SmaMetaAssociation(metaName="FragmentGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentGateSmDependency.class, component = true)
     List<SmObjectImpl> mFragmentGate = null;

    @objid ("1682cb1c-4afd-43f9-94dd-f2321ab9abc2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073515e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("94133131-4877-42f2-a0b3-9d1203a465ff")
        private static SmClass smClass = null;

        @objid ("3101fc21-c5e0-461d-a619-a76177cff5de")
        private static SmAttribute OperatorAtt = null;

        @objid ("03ddcaa3-bcb9-40f5-8e84-bc4f43d1aab5")
        private static SmDependency OperandDep = null;

        @objid ("e03f94df-6b7f-47e0-a609-c77e663e2231")
        private static SmDependency FragmentGateDep = null;

        @objid ("c5d60880-7777-4225-9533-97ac9385748a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CombinedFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a08fe712-0bfa-48e1-9d11-902bfa09b76d")
        public static SmAttribute OperatorAtt() {
            if (OperatorAtt == null) {
            	OperatorAtt = classof().getAttributeDef("Operator");
            }
            return OperatorAtt;
        }

        @objid ("a05da221-023a-4b7a-b6d9-be7523edce18")
        public static SmDependency OperandDep() {
            if (OperandDep == null) {
            	OperandDep = classof().getDependencyDef("Operand");
            }
            return OperandDep;
        }

        @objid ("5a25457a-cd53-4113-a5f8-0614414fc88f")
        public static SmDependency FragmentGateDep() {
            if (FragmentGateDep == null) {
            	FragmentGateDep = classof().getDependencyDef("FragmentGate");
            }
            return FragmentGateDep;
        }

        @objid ("47bf18cd-63f1-4af8-aa70-c39f61fd6ef3")
        public static SmAttribute getOperatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperatorAtt;
        }

        @objid ("248f377d-909a-432b-b46d-0829cc76c4d2")
        public static SmDependency getOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperandDep;
        }

        @objid ("0a8f30dc-4b3e-4ad7-9840-15abf8c60a4d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("19b66140-e143-466b-a429-c7fc21191247")
        public static SmDependency getFragmentGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentGateDep;
        }

        @objid ("0073940c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79e0e942-1038-4b9d-b011-6df34e6f590a")
            public ISmObjectData createData() {
                return new CombinedFragmentData();
            }

            @objid ("d6cd4483-5e0c-4280-892b-67a851622ed9")
            public SmObjectImpl createImpl() {
                return new CombinedFragmentImpl();
            }

        }

        @objid ("00740b62-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperatorSmAttribute extends SmAttribute {
            @objid ("04c584b7-ed06-4f08-853a-0cbace8b708e")
            public Object getValue(ISmObjectData data) {
                return ((CombinedFragmentData) data).mOperator;
            }

            @objid ("3775060c-426c-4892-828c-f26e833d3fc9")
            public void setValue(ISmObjectData data, Object value) {
                ((CombinedFragmentData) data).mOperator = value;
            }

        }

        @objid ("007473f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FragmentGateSmDependency extends SmMultipleDependency {
            @objid ("47574ff5-3fbd-4355-baac-81460dc7799f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mFragmentGate != null)? ((CombinedFragmentData)data).mFragmentGate:SmMultipleDependency.EMPTY;
            }

            @objid ("1cf74e8b-a08c-4738-a753-16acb2f30404")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mFragmentGate = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mFragmentGate;
            }

            @objid ("9b7f28bf-bb29-4aa0-a659-f088b730f5c5")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerFragmentDep();
            }

        }

        @objid ("0074d880-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperandSmDependency extends SmMultipleDependency {
            @objid ("d8721f52-cf1d-4897-a61d-68c1591f59ed")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mOperand != null)? ((CombinedFragmentData)data).mOperand:SmMultipleDependency.EMPTY;
            }

            @objid ("77106132-595c-438a-8b41-13bb2edecc42")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mOperand = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mOperand;
            }

            @objid ("796113b2-ea47-444a-b1f5-15125e69b827")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.OwnerFragmentDep();
            }

        }

    }

}
