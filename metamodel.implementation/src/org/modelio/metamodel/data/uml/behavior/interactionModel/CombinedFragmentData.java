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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("87bf0442-4d16-4701-8589-9d6c58887eba")
    @SmaMetaAttribute(metaName="Operator", type=InteractionOperator.class, smAttributeClass=Metadata.OperatorSmAttribute.class)
     Object mOperator = InteractionOperator.SEQOP;

    @objid ("5984ee78-18a9-48e0-bde1-787c2e039416")
    @SmaMetaAssociation(metaName="Operand", typeDataClass=InteractionOperandData.class, min=1, max=-1, smAssociationClass=Metadata.OperandSmDependency.class, component = true)
     List<SmObjectImpl> mOperand = null;

    @objid ("0a7290bf-7aa3-48bf-b032-d612ae7cd757")
    @SmaMetaAssociation(metaName="FragmentGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentGateSmDependency.class, component = true)
     List<SmObjectImpl> mFragmentGate = null;

    @objid ("a0d08647-7045-4c2d-8b05-07259f05d0f7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073515e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("67601ed2-bc63-49ee-8048-0386ffb27c32")
        private static SmClass smClass = null;

        @objid ("62215ad7-c28e-4e6a-ba12-b39ac3cd6ea8")
        private static SmAttribute OperatorAtt = null;

        @objid ("e132310f-b267-4e3c-b10c-531a468ed734")
        private static SmDependency OperandDep = null;

        @objid ("24091522-40cf-4121-8d03-1e57db2adba0")
        private static SmDependency FragmentGateDep = null;

        @objid ("89b055b2-d877-4ddb-a604-2177766a22de")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CombinedFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ad044159-d05e-47a0-ba30-c0ece90a7397")
        public static SmAttribute OperatorAtt() {
            if (OperatorAtt == null) {
            	OperatorAtt = classof().getAttributeDef("Operator");
            }
            return OperatorAtt;
        }

        @objid ("610f1efa-056c-41d5-ba15-fcf13d44883f")
        public static SmDependency OperandDep() {
            if (OperandDep == null) {
            	OperandDep = classof().getDependencyDef("Operand");
            }
            return OperandDep;
        }

        @objid ("703c843d-b02f-45a7-b8e2-b3bf437c3702")
        public static SmDependency FragmentGateDep() {
            if (FragmentGateDep == null) {
            	FragmentGateDep = classof().getDependencyDef("FragmentGate");
            }
            return FragmentGateDep;
        }

        @objid ("89fac859-f805-4c9c-80dd-08430ac188ed")
        public static SmDependency getFragmentGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentGateDep;
        }

        @objid ("88796a8e-c3ea-4190-bdd9-14964b4711d4")
        public static SmAttribute getOperatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperatorAtt;
        }

        @objid ("1e41f7a8-ec40-4788-9143-3ab5803f97ca")
        public static SmDependency getOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperandDep;
        }

        @objid ("870aa6b2-26e3-4a79-8a15-29ad6c35d4d2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0073940c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e75f91d0-fdb0-4eec-a071-120f5a5b546f")
            public ISmObjectData createData() {
                return new CombinedFragmentData();
            }

            @objid ("314c07b1-0ae4-4591-9f3c-d47debdd607c")
            public SmObjectImpl createImpl() {
                return new CombinedFragmentImpl();
            }

        }

        @objid ("00740b62-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperatorSmAttribute extends SmAttribute {
            @objid ("e93af0a7-9029-4970-b6a8-921cc1d7a93c")
            public Object getValue(ISmObjectData data) {
                return ((CombinedFragmentData) data).mOperator;
            }

            @objid ("6ba2ac25-2890-4978-9ffd-c1ef2ed1374d")
            public void setValue(ISmObjectData data, Object value) {
                ((CombinedFragmentData) data).mOperator = value;
            }

        }

        @objid ("007473f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FragmentGateSmDependency extends SmMultipleDependency {
            @objid ("edcc5adc-5a90-4505-a436-b4e5026a099d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mFragmentGate != null)? ((CombinedFragmentData)data).mFragmentGate:SmMultipleDependency.EMPTY;
            }

            @objid ("ec8c4564-65b4-4079-8a21-e8a6a5a66c4a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mFragmentGate = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mFragmentGate;
            }

            @objid ("87dca936-6749-4197-a583-a06640707b88")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerFragmentDep();
            }

        }

        @objid ("0074d880-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperandSmDependency extends SmMultipleDependency {
            @objid ("0b717f3a-1a45-4376-bdbd-8891121e0e08")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mOperand != null)? ((CombinedFragmentData)data).mOperand:SmMultipleDependency.EMPTY;
            }

            @objid ("f3a55dc7-310e-47a1-8402-7a6e89469280")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mOperand = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mOperand;
            }

            @objid ("a30e1280-9723-4090-8b65-2620832981ec")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.OwnerFragmentDep();
            }

        }

    }

}
