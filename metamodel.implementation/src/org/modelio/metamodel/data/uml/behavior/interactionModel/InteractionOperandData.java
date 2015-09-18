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
    @objid ("bb192051-0aec-41b3-a52b-fe470bac7b30")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("4d40baa5-966c-4c06-a316-975128073775")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("23f79b54-4e1b-4fbb-8cb8-0870d35639ba")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("e8f9d0ab-e861-426a-b7de-fb5e74eedfb9")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("9cc41121-07f7-4c12-b4ed-db44d8569460")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00473d80-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a68a0425-6a03-434c-b056-8105170fb2fa")
        private static SmClass smClass = null;

        @objid ("42956819-e024-4d5b-88de-4114488dbf25")
        private static SmAttribute GuardAtt = null;

        @objid ("c04953ac-2d09-4cea-9f8d-1a7fc08a5ab9")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("32d01f02-e731-43d8-88b9-14e8329ecf22")
        private static SmDependency FragmentDep = null;

        @objid ("d1680ba2-9fee-4569-9ca4-d6ca9edec9b2")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("005c73fc-7e10-4e2d-9759-689dffbcb3ed")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionOperandData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d5252faa-66d7-452d-b9fa-4b98aba2a207")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("34983b38-ee1f-4491-97b0-e21301e65e04")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("ecdc9d80-2ea0-4038-b2e6-8a9f3ac53a98")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("ab818e61-88b1-438d-9b41-8431f55e14f6")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("04efb695-70e7-4b57-9d75-f44f855770e3")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("6aa44da0-6691-47da-8659-b9d8dd4ce543")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("cf2397af-9b77-4d86-b2f4-409c6cec8eb7")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("794bbc1d-0c88-4dec-8383-2f0b594d31b0")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("d907066c-b860-4e03-b94f-11613537c54c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00477e94-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("132f3f5c-0ee9-4314-9863-0307a0fc84b9")
            public ISmObjectData createData() {
                return new InteractionOperandData();
            }

            @objid ("09f8e8c6-440e-4aaa-b500-52024d44d29e")
            public SmObjectImpl createImpl() {
                return new InteractionOperandImpl();
            }

        }

        @objid ("0047e032-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("b5b802fa-e7d2-45aa-a786-e5321ad7e4fa")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mGuard;
            }

            @objid ("fc33adbd-4691-4077-84f7-b81e37def46e")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mGuard = value;
            }

        }

        @objid ("004849c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("a8b07487-957e-4833-802a-734a67f4f0c5")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mEndLineNumber;
            }

            @objid ("e2c4230c-f59d-4f98-a9ca-d27c207fb708")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mEndLineNumber = value;
            }

        }

        @objid ("0048add2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("9736c186-b47a-4de3-ad8c-81754c5c9d15")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mOwnerFragment;
            }

            @objid ("ccb49146-a525-4c26-a0aa-04275e10c9fd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionOperandData) data).mOwnerFragment = value;
            }

            @objid ("b8729b45-d608-40d0-a6d4-1b141aed52a8")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.OperandDep();
            }

        }

        @objid ("00492398-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("70f210d1-da49-42f3-b5c7-d34739def712")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionOperandData)data).mFragment != null)? ((InteractionOperandData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("92884498-904e-4ed0-8ce6-270ae003f9f9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionOperandData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionOperandData) data).mFragment;
            }

            @objid ("871befbc-cc3e-4a64-a261-59f7f57c5cfe")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingOperandDep();
            }

        }

    }

}
