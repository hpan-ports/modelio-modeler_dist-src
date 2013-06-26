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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
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

@objid ("004f999e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=EntryPointPseudoState.class, factory=EntryPointPseudoStateData.Metadata.ObjectFactory.class)
public class EntryPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("dd7084ed-3713-4109-a67b-80f2ecb1e4ee")
    @SmaMetaAssociation(metaName="EntryOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfSmDependency.class)
     SmObjectImpl mEntryOf;

    @objid ("df4e941e-dc4d-4303-a8e2-b6ceb1774226")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("d8c8480a-227b-43e8-b6f7-b1f4ddc4fe8b")
    @SmaMetaAssociation(metaName="EntryOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfMachineSmDependency.class)
     SmObjectImpl mEntryOfMachine;

    @objid ("0f9d9952-557c-463e-84d1-2970da837490")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002f1e76-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ddfcda67-a666-425c-b388-51f572762cdd")
        private static SmClass smClass = null;

        @objid ("1bf679c0-6e2f-4548-8b59-df1f15163bfc")
        private static SmDependency EntryOfDep = null;

        @objid ("23a1db16-1469-4ef2-93e5-9f7e5e175580")
        private static SmDependency ConnectionDep = null;

        @objid ("b2916e72-a736-4bfb-b013-8deab53d48d0")
        private static SmDependency EntryOfMachineDep = null;

        @objid ("020607de-c5a3-4643-82ed-9e9b0de506c0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EntryPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("68d36247-06f6-4a11-b3f8-1c647a7ea03a")
        public static SmDependency EntryOfDep() {
            if (EntryOfDep == null) {
            	EntryOfDep = classof().getDependencyDef("EntryOf");
            }
            return EntryOfDep;
        }

        @objid ("1cd14275-d3c7-4ca8-b84d-fd7cf6285896")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("d74d70de-fa4a-4df8-a6d0-55aed558151d")
        public static SmDependency EntryOfMachineDep() {
            if (EntryOfMachineDep == null) {
            	EntryOfMachineDep = classof().getDependencyDef("EntryOfMachine");
            }
            return EntryOfMachineDep;
        }

        @objid ("1131c3e5-1550-4a5c-86e1-31c6b9065b1d")
        public static SmDependency getEntryOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfDep;
        }

        @objid ("c2a6ee98-c81a-4300-9de1-c1db091565ee")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("45a0091b-6a02-4b13-91cd-60d642d77aa9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("96d4c54c-aa50-46e9-babe-c4ecd185628d")
        public static SmDependency getEntryOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfMachineDep;
        }

        @objid ("002f5f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b251d99e-ba63-4d45-888c-4c10f5e541eb")
            public ISmObjectData createData() {
                return new EntryPointPseudoStateData();
            }

            @objid ("fde69d08-9022-420e-b848-3971cabd72ca")
            public SmObjectImpl createImpl() {
                return new EntryPointPseudoStateImpl();
            }

        }

        @objid ("002fc362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("76f0c7e0-4e5f-4a29-b726-26c1959b0f15")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EntryPointPseudoStateData)data).mConnection != null)? ((EntryPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("02255280-3838-469c-afd4-5cad6834c03d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EntryPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((EntryPointPseudoStateData) data).mConnection;
            }

            @objid ("6b091e71-68ca-474d-a8ad-b6d5d97f2f7b")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.EntryDep();
            }

        }

        @objid ("0030279e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfSmDependency extends SmSingleDependency {
            @objid ("b62b55a6-61ec-43b4-81e7-ce523c7958cf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOf;
            }

            @objid ("2f76fd7a-23a6-459e-a170-6e82864bc0c9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOf = value;
            }

            @objid ("a70e1e42-d025-496c-934a-e0b9cf71327e")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.EntryPointDep();
            }

        }

        @objid ("00309eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfMachineSmDependency extends SmSingleDependency {
            @objid ("12dcb98a-76dc-4f38-b282-4ba09db5236e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOfMachine;
            }

            @objid ("8afef9b5-3eb8-49fb-b7e6-fb2ef0eaae66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOfMachine = value;
            }

            @objid ("311006da-823b-481c-88c2-abaed00e141e")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.EntryPointDep();
            }

        }

    }

}
