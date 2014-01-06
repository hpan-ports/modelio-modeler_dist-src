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
    @objid ("24298b43-116a-487f-87cf-c5d5958c575f")
    @SmaMetaAssociation(metaName="EntryOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfSmDependency.class)
     SmObjectImpl mEntryOf;

    @objid ("a664b37f-3724-43cc-8212-bc4da2d95814")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("06e0c793-33d5-4afc-b794-a2ba102ec205")
    @SmaMetaAssociation(metaName="EntryOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfMachineSmDependency.class)
     SmObjectImpl mEntryOfMachine;

    @objid ("83672135-33c7-4853-841b-eae07e444138")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002f1e76-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c5355518-0c95-40cc-8b98-8669bd4bdf94")
        private static SmClass smClass = null;

        @objid ("ab984c42-0d7d-4e1c-9c1e-e5eece708fcd")
        private static SmDependency EntryOfDep = null;

        @objid ("16c3dfbf-ab79-42e2-86a8-7d2911254c5a")
        private static SmDependency ConnectionDep = null;

        @objid ("eb38ff94-758f-4a6e-92dc-c0060a694f3a")
        private static SmDependency EntryOfMachineDep = null;

        @objid ("b9a3cbd6-3fba-4dce-b025-fa2312835518")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EntryPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("718461aa-a319-48ca-bd63-42e99243ec9e")
        public static SmDependency EntryOfDep() {
            if (EntryOfDep == null) {
            	EntryOfDep = classof().getDependencyDef("EntryOf");
            }
            return EntryOfDep;
        }

        @objid ("78f88a92-2eb7-4234-a1ef-02a6c108d8df")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("09f4eb6f-cf38-4bac-bcf6-5326b9fff28c")
        public static SmDependency EntryOfMachineDep() {
            if (EntryOfMachineDep == null) {
            	EntryOfMachineDep = classof().getDependencyDef("EntryOfMachine");
            }
            return EntryOfMachineDep;
        }

        @objid ("1b31d562-7542-4907-823c-0cf4047b68a0")
        public static SmDependency getEntryOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfDep;
        }

        @objid ("154fd8b5-de0c-4ac2-82be-e47856663da8")
        public static SmDependency getEntryOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfMachineDep;
        }

        @objid ("f0935e17-089c-465f-b0ff-9f46c28d2332")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("80bab222-0734-48d5-a4d3-9fa098d91887")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002f5f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a3807679-b064-4258-ac49-1b7abbbf338f")
            public ISmObjectData createData() {
                return new EntryPointPseudoStateData();
            }

            @objid ("a0d17fb6-8ed8-4244-bed0-1f9ad60e9ccf")
            public SmObjectImpl createImpl() {
                return new EntryPointPseudoStateImpl();
            }

        }

        @objid ("002fc362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("6e1f3e72-526b-46a5-923c-634d3de3b95e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EntryPointPseudoStateData)data).mConnection != null)? ((EntryPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("da72229b-3341-4e70-96d9-129257e8da0b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EntryPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((EntryPointPseudoStateData) data).mConnection;
            }

            @objid ("bee07978-71d9-429e-aafd-7b1e9ec755f6")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.EntryDep();
            }

        }

        @objid ("0030279e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfSmDependency extends SmSingleDependency {
            @objid ("85b95edf-a243-4c26-a2ef-0599fa8b0577")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOf;
            }

            @objid ("5d6b10c9-e996-476d-90cd-b8db5a7c668e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOf = value;
            }

            @objid ("bfb0a341-e70d-40bf-a89b-f3c8be1b9333")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.EntryPointDep();
            }

        }

        @objid ("00309eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfMachineSmDependency extends SmSingleDependency {
            @objid ("c9a9a7a8-59f2-47c2-ae52-6462f9675352")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOfMachine;
            }

            @objid ("278a1139-4871-45c3-b4b8-fbed231b725e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOfMachine = value;
            }

            @objid ("18eb0365-427a-409e-a91b-4f95bd615ad0")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.EntryPointDep();
            }

        }

    }

}
