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
    @objid ("262f2d74-a7ff-4779-b5fe-df0ac669d963")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("754da072-2125-4ed0-a0a4-1b4a6b081dc5")
    @SmaMetaAttribute(metaName="EndLineNumber", type=Integer.class, smAttributeClass=Metadata.EndLineNumberSmAttribute.class)
     Object mEndLineNumber = 0;

    @objid ("497c365f-5bac-413d-bc19-7079721f7705")
    @SmaMetaAssociation(metaName="Fragment", typeDataClass=InteractionFragmentData.class, min=0, max=-1, smAssociationClass=Metadata.FragmentSmDependency.class, component = true)
     List<SmObjectImpl> mFragment = null;

    @objid ("3e09bea9-103d-48f4-8155-775fc789475c")
    @SmaMetaAssociation(metaName="OwnerFragment", typeDataClass=CombinedFragmentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerFragmentSmDependency.class)
     SmObjectImpl mOwnerFragment;

    @objid ("a7d5dc8d-c2a2-4ec9-bd6e-41c3b6bffb68")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00473d80-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8a5be8e1-ec33-47d7-86ce-d1c6de046a4f")
        private static SmClass smClass = null;

        @objid ("a0a11f29-ad47-4b4c-a644-8d4bf22f08a2")
        private static SmAttribute GuardAtt = null;

        @objid ("17d51b07-f373-401f-bbee-c124c48eb8ec")
        private static SmAttribute EndLineNumberAtt = null;

        @objid ("0e6dce0e-9c41-4bd6-bbba-7ebad2372891")
        private static SmDependency FragmentDep = null;

        @objid ("af628e03-6406-415d-b9e3-81707448ddaa")
        private static SmDependency OwnerFragmentDep = null;

        @objid ("4dee9977-8965-4ccc-b573-a746f821a5b1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InteractionOperandData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ed4653d5-0d44-4c51-9d5e-5c56afacecdd")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("0254a9b1-e99c-4b15-828e-e0a76feac141")
        public static SmAttribute EndLineNumberAtt() {
            if (EndLineNumberAtt == null) {
            	EndLineNumberAtt = classof().getAttributeDef("EndLineNumber");
            }
            return EndLineNumberAtt;
        }

        @objid ("515f563f-c44c-4572-a916-80f0fa3b8295")
        public static SmDependency FragmentDep() {
            if (FragmentDep == null) {
            	FragmentDep = classof().getDependencyDef("Fragment");
            }
            return FragmentDep;
        }

        @objid ("0aa9b249-f79f-4ba5-95fa-aed3709f24c3")
        public static SmDependency OwnerFragmentDep() {
            if (OwnerFragmentDep == null) {
            	OwnerFragmentDep = classof().getDependencyDef("OwnerFragment");
            }
            return OwnerFragmentDep;
        }

        @objid ("85b48372-c090-4643-b6ad-901a8a43b352")
        public static SmDependency getOwnerFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerFragmentDep;
        }

        @objid ("4844c3ea-dd67-493c-9ce7-9645fc9ab626")
        public static SmDependency getFragmentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FragmentDep;
        }

        @objid ("f55b2891-e262-4026-af06-7a936feda725")
        public static SmAttribute getEndLineNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndLineNumberAtt;
        }

        @objid ("c040ae33-2074-4057-a473-676ca581da55")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6479f484-82a8-421b-85c3-440fa26353c5")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("00477e94-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6027e25b-c28f-4220-813a-60d2908f3de1")
            public ISmObjectData createData() {
                return new InteractionOperandData();
            }

            @objid ("cc1d3e9a-474c-47e5-adeb-96dc2cfd5364")
            public SmObjectImpl createImpl() {
                return new InteractionOperandImpl();
            }

        }

        @objid ("0047e032-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("3e9ec5eb-e5db-4da6-8b00-c79b326e733e")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mGuard;
            }

            @objid ("3bc72753-e2a2-4c86-9d0d-2a19f899f44c")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mGuard = value;
            }

        }

        @objid ("004849c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EndLineNumberSmAttribute extends SmAttribute {
            @objid ("6c8a1795-0794-4ac2-99ff-c13d919869c9")
            public Object getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mEndLineNumber;
            }

            @objid ("2eab43ed-827c-46ec-8700-9515f0e228bc")
            public void setValue(ISmObjectData data, Object value) {
                ((InteractionOperandData) data).mEndLineNumber = value;
            }

        }

        @objid ("0048add2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerFragmentSmDependency extends SmSingleDependency {
            @objid ("0053a5d4-95e3-4494-9d23-179263c04dd1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InteractionOperandData) data).mOwnerFragment;
            }

            @objid ("b89b1660-3c69-4545-9a93-0385cbeb5952")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InteractionOperandData) data).mOwnerFragment = value;
            }

            @objid ("79dda47c-4133-4ca8-a2ed-79f968c48c32")
            @Override
            public SmDependency getSymetric() {
                return CombinedFragmentData.Metadata.OperandDep();
            }

        }

        @objid ("00492398-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FragmentSmDependency extends SmMultipleDependency {
            @objid ("5d26ea33-453a-42b4-8dac-d8c4204ca612")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InteractionOperandData)data).mFragment != null)? ((InteractionOperandData)data).mFragment:SmMultipleDependency.EMPTY;
            }

            @objid ("760a08b0-531b-4234-aaf2-8b61713ba1bf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InteractionOperandData) data).mFragment = new ArrayList<>(initialCapacity);
                return ((InteractionOperandData) data).mFragment;
            }

            @objid ("ca592d68-62cb-4ee6-b916-8c436d69e609")
            @Override
            public SmDependency getSymetric() {
                return InteractionFragmentData.Metadata.EnclosingOperandDep();
            }

        }

    }

}
