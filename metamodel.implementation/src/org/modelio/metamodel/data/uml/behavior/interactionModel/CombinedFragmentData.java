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
/*   Metamodel version: 9022              */
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
    @objid ("98920ce7-baf8-4f98-ae5f-1a2ee7f8db40")
    @SmaMetaAttribute(metaName="Operator", type=InteractionOperator.class, smAttributeClass=Metadata.OperatorSmAttribute.class)
     Object mOperator = InteractionOperator.SEQOP;

    @objid ("82a24edf-7a4b-4f3b-8d37-5954d88b15ac")
    @SmaMetaAssociation(metaName="Operand", typeDataClass=InteractionOperandData.class, min=1, max=-1, smAssociationClass=Metadata.OperandSmDependency.class, component = true)
     List<SmObjectImpl> mOperand = null;

    @objid ("52cacb6f-b18a-4406-8aa6-137d3230c1cb")
    @SmaMetaAssociation(metaName="FragmentGate", typeDataClass=GateData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentGateSmDependency.class, component = true)
     List<SmObjectImpl> mFragmentGate = null;

    @objid ("0255cf89-52ff-40e7-a159-1b0e8968f8f3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0073515e-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("413ead40-4bdd-42f0-8229-93ff6a9e1edb")
        private static SmClass smClass = null;

        @objid ("b9872bc6-f7bb-44cd-bfa0-38cb4f75e24d")
        private static SmAttribute OperatorAtt = null;

        @objid ("8907cd6e-179a-4232-bf13-09b7dca291ca")
        private static SmDependency OperandDep = null;

        @objid ("ed3cf521-d4f8-4d2d-a61d-1f01c6154744")
        private static SmDependency FragmentGateDep = null;

        @objid ("4f12b04c-f4b6-415f-9077-2937684b0c2a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CombinedFragmentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e2521d35-487a-425d-8bc9-567573559156")
        public static SmAttribute OperatorAtt() {
            if (OperatorAtt == null) {
            	OperatorAtt = classof().getAttributeDef("Operator");
            }
            return OperatorAtt;
        }

        @objid ("372d0eba-724e-4ad2-b8fd-95efcc211a74")
        public static SmDependency OperandDep() {
            if (OperandDep == null) {
            	OperandDep = classof().getDependencyDef("Operand");
            }
            return OperandDep;
        }

        @objid ("80d4b056-57f7-4ec4-ba34-93975b31397f")
        public static SmDependency FragmentGateDep() {
            if (FragmentGateDep == null) {
            	FragmentGateDep = classof().getDependencyDef("FragmentGate");
            }
            return FragmentGateDep;
        }

        @objid ("c5a454c7-fb6f-4e6e-b0bb-41fecb03fba8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("73a68edf-dae4-4c29-8a24-7a7b4ba78f2e")
        public static SmDependency getFragmentGateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentGateDep;
        }

        @objid ("42635f63-92a4-4f41-abb6-fa77f341fbf0")
        public static SmDependency getOperandDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperandDep;
        }

        @objid ("f0d8355f-7e0a-4b33-befb-cb600f2cbe11")
        public static SmAttribute getOperatorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperatorAtt;
        }

        @objid ("0073940c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a589e04a-e112-4dff-993e-25b8921d84cf")
            public ISmObjectData createData() {
                return new CombinedFragmentData();
            }

            @objid ("79d25143-ad89-4ed1-9ce1-c63fa25df4be")
            public SmObjectImpl createImpl() {
                return new CombinedFragmentImpl();
            }

        }

        @objid ("00740b62-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperatorSmAttribute extends SmAttribute {
            @objid ("d33f5391-fcc4-4b71-adbe-2e3b286f1596")
            public Object getValue(ISmObjectData data) {
                return ((CombinedFragmentData) data).mOperator;
            }

            @objid ("e9bd84af-08ed-4388-b59a-54fde501e57c")
            public void setValue(ISmObjectData data, Object value) {
                ((CombinedFragmentData) data).mOperator = value;
            }

        }

        @objid ("007473f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class FragmentGateSmDependency extends SmMultipleDependency {
            @objid ("d67c7725-d146-435b-ac1d-0f806fdf9c45")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mFragmentGate != null)? ((CombinedFragmentData)data).mFragmentGate:SmMultipleDependency.EMPTY;
            }

            @objid ("be66a02d-109f-44bc-b3dd-6e6e84b57a2c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mFragmentGate = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mFragmentGate;
            }

            @objid ("fd77affd-7aed-4c00-9e5b-e6d2288f91de")
            @Override
            public SmDependency getSymetric() {
                return GateData.Metadata.OwnerFragmentDep();
            }

        }

        @objid ("0074d880-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperandSmDependency extends SmMultipleDependency {
            @objid ("a79f9ae7-0d4c-43b5-b4cd-9e73df94ebd7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CombinedFragmentData)data).mOperand != null)? ((CombinedFragmentData)data).mOperand:SmMultipleDependency.EMPTY;
            }

            @objid ("e03298dc-8554-4c2c-ab34-fd93b04aecef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CombinedFragmentData) data).mOperand = new ArrayList<>(initialCapacity);
                return ((CombinedFragmentData) data).mOperand;
            }

            @objid ("f20cb7ef-b830-4b80-b5ae-490a863e599e")
            @Override
            public SmDependency getSymetric() {
                return InteractionOperandData.Metadata.OwnerFragmentDep();
            }

        }

    }

}
