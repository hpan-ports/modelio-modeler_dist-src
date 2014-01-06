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
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.InteractionOperandImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
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

@objid ("0047edde-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InteractionOperand.class, factory=InteractionOperandData.Metadata.ObjectFactory.class)
public class InteractionOperandData extends InteractionFragmentData {
    @objid ("eda41bef-6666-48ce-8440-6d3930b9722e")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("90274be2-fe71-432d-9928-0f30f1c819a6")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("e64b475e-4c50-41eb-a87e-d6c988c4fd50")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("1749ce6a-61cc-461c-8b37-35089e033344")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("8e7de43a-1159-4fd8-a305-a0813bf28db5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00473d80-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9f392908-1731-4f42-823d-8b7f7072e056")
        private static SmClass smClass = null;

        @objid ("ba65ca39-f811-4847-a3f4-d5edf752516b")
        private static SmAttribute GuardAtt = null;

        @objid ("d12330fb-9856-46da-86fd-b0475be8d21a")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("7298d77b-4a70-48d1-8ddf-101a1f1f20fa")
        private static SmDependency FragmentDep = null;

        @objid ("7aa4fa6c-5cd5-4593-b567-d528d92f9fc3")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("88b77626-dc7f-4e8d-8472-902c97ba105d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionOperandData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ed32dd9f-5aad-47e9-a3ff-f5c2005226dd")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("9652013c-2ec3-4795-ad45-392a94d27073")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("b38b9710-46ef-4cd6-964d-619a612b6ad7")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("8164bc3f-c8a6-4089-97a3-eb1e1a8e61a5")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("f84d2069-987d-47f4-880a-ecceb0e20c2d")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("bac9d2ff-e854-430b-aad3-155a32107f1d")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("98ffc998-882f-4542-88b4-047bfde09e86")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("e91e90d1-3a36-4e66-b836-d9410d2e60cf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("91486b01-324c-4ee3-a84c-533913a39a89")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("00477e94-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("273ea7d4-a2b6-4960-ba54-2b8910b809c0")
            public ISmObjectData createData() {
                return new InteractionOperandData();
            }

            @objid ("835a41ed-cc0e-4ee1-abb1-5ca8fd695173")
            public SmObjectImpl createImpl() {
                return new InteractionOperandImpl();
            }

        }

        @objid ("0047e032-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("83f1d96b-c505-4f8a-af1a-3327c519930b")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mGuard;
            }

            @objid ("fd456e7a-95b2-4c41-9891-a1a13f92010a")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mGuard = value;
            }

        }

        @objid ("004849c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("42771bf3-579c-457d-ae78-c1cd1fc58ac0")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mEndLineNumber;
            }

            @objid ("4ca74ff1-f291-4352-9e79-07d467d49103")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mEndLineNumber = value;
            }

        }

        @objid ("0048add2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("c678238d-b10d-4673-b030-773241b5c0ea")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mOwnerFragment;
            }

            @objid ("355b9dc6-5743-4239-9e46-cff31a1c665b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionOperandData) data).mOwnerFragment = value;
            }

            @objid ("16ef432e-af7d-4471-bf8d-e9b4e1e69a77")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.OperandDep();
            }

        }

        @objid ("00492398-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("1201e972-8327-410a-8558-2368dc9ccc59")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionOperandData)data).mFragment != null)? ((InteractionOperandData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("cc33f407-f6f5-46b4-b8af-ad69221a956d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionOperandData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionOperandData) data).mFragment;
            }

            @objid ("4365ec09-6331-444a-8373-010f177e0d39")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingOperandDep();
            }

        }

    }

}
