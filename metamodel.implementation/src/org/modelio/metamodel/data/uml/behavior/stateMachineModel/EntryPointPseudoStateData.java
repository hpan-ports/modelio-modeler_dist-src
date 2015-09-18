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
    @objid ("9b000ba4-7dba-4ec9-aa0b-afea7d66c31f")
    @SmaMetaAssociation(metaName="EntryOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfSmDependency.class)
     SmObjectImpl mEntryOf;

    @objid ("fe4da394-618c-4552-9806-11d46811a554")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("953ecd89-4813-4da2-bd04-a2d426afddfe")
    @SmaMetaAssociation(metaName="EntryOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.EntryOfMachineSmDependency.class)
     SmObjectImpl mEntryOfMachine;

    @objid ("0ac92e93-f22d-4069-a660-4b417a9ee9a4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002f1e76-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("07488347-8a86-45f1-8a16-0288339bc42d")
        private static SmClass smClass = null;

        @objid ("83bb9f76-41ad-4c90-adf5-f1f93c3132ae")
        private static SmDependency EntryOfDep = null;

        @objid ("39b7b09e-73c8-4d5e-ae2e-31c2d7a335cb")
        private static SmDependency ConnectionDep = null;

        @objid ("56ee13f9-3e77-4fdb-8a79-6101b0be7c3f")
        private static SmDependency EntryOfMachineDep = null;

        @objid ("525ecfff-573b-4397-bf36-f9324243ba66")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(EntryPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e4be2e70-f5fb-4df9-9404-9706a4e1ac52")
        public static SmDependency EntryOfDep() {
            if (EntryOfDep == null) {
            	EntryOfDep = classof().getDependencyDef("EntryOf");
            }
            return EntryOfDep;
        }

        @objid ("1fc71169-8dd8-4aa1-8899-ba577bf2928d")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("2147f0da-e907-4e3d-a7b9-2f2da8b9cf6a")
        public static SmDependency EntryOfMachineDep() {
            if (EntryOfMachineDep == null) {
            	EntryOfMachineDep = classof().getDependencyDef("EntryOfMachine");
            }
            return EntryOfMachineDep;
        }

        @objid ("3c8f22aa-a229-4f72-9665-513fd2e4f430")
        public static SmDependency getEntryOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfMachineDep;
        }

        @objid ("d066ef6c-6f5a-4b5f-943b-c67a8cfa057b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8446095f-3873-4b1d-adfc-385b413188fb")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("b91aa6f8-9293-499b-837f-8fe31b5207dd")
        public static SmDependency getEntryOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryOfDep;
        }

        @objid ("002f5f44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("62f43710-b89d-4b33-955d-ff8aa5663773")
            public ISmObjectData createData() {
                return new EntryPointPseudoStateData();
            }

            @objid ("5616cc62-56e3-4976-b45d-bc5f6e2632c0")
            public SmObjectImpl createImpl() {
                return new EntryPointPseudoStateImpl();
            }

        }

        @objid ("002fc362-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("0c03e023-768e-4ebf-a451-ec239797b39e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((EntryPointPseudoStateData)data).mConnection != null)? ((EntryPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("409d3b4f-3163-44ce-8f2a-3d2c8baad1b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((EntryPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((EntryPointPseudoStateData) data).mConnection;
            }

            @objid ("7769a2b0-a0c6-4a2a-8ce1-66b444ce9494")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.EntryDep();
            }

        }

        @objid ("0030279e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfSmDependency extends SmSingleDependency {
            @objid ("96c3944a-b593-49bc-822c-9990bc79070e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOf;
            }

            @objid ("81bb911d-4169-47bc-b156-4f4cc0cdd4ad")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOf = value;
            }

            @objid ("70fa0208-7491-48f8-950e-b3d80b9ea9ab")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.EntryPointDep();
            }

        }

        @objid ("00309eb8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryOfMachineSmDependency extends SmSingleDependency {
            @objid ("1f137639-6422-4c2e-b7a2-a5c53ba0c9e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((EntryPointPseudoStateData) data).mEntryOfMachine;
            }

            @objid ("fb599bce-f916-4bb2-8762-2fd98e9b9788")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((EntryPointPseudoStateData) data).mEntryOfMachine = value;
            }

            @objid ("9ac27ffb-f784-4fb4-bf78-4798877cc34c")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.EntryPointDep();
            }

        }

    }

}
