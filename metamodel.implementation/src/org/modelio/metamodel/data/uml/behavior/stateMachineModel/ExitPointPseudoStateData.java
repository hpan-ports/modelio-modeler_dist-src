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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
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

@objid ("00501928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExitPointPseudoState.class, factory=ExitPointPseudoStateData.Metadata.ObjectFactory.class)
public class ExitPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("316e6d8d-84d7-4cae-a90c-41e4f3269b31")
    @SmaMetaAssociation(metaName="ExitOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfSmDependency.class)
     SmObjectImpl mExitOf;

    @objid ("b8fad96f-f751-4d85-a51a-2bdd4ee200e4")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("dbe144b2-e779-49ae-ac9d-b372ade7e464")
    @SmaMetaAssociation(metaName="ExitOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfMachineSmDependency.class)
     SmObjectImpl mExitOfMachine;

    @objid ("b7a6d7fd-077a-4051-994a-16831f88b882")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00886fbc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c1a1069e-ea71-4998-af55-2f0d2ff648d4")
        private static SmClass smClass = null;

        @objid ("5ffa0f5f-bf68-432d-b396-215b57c8f9c2")
        private static SmDependency ExitOfDep = null;

        @objid ("9b19cabf-98a1-41f7-933c-62ab78d4a42e")
        private static SmDependency ConnectionDep = null;

        @objid ("c139ea44-c81f-4e52-aa78-2824f64089c3")
        private static SmDependency ExitOfMachineDep = null;

        @objid ("c9b68b89-fee4-4e31-8cfa-9db7b0447030")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExitPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e319c8f2-659c-4b9f-89ab-663d4c027526")
        public static SmDependency ExitOfDep() {
            if (ExitOfDep == null) {
            	ExitOfDep = classof().getDependencyDef("ExitOf");
            }
            return ExitOfDep;
        }

        @objid ("a0ce35be-22ec-455e-8fbb-3dd20dabdbec")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("c57a03bc-647f-4bf9-b10e-004535ee5fd9")
        public static SmDependency ExitOfMachineDep() {
            if (ExitOfMachineDep == null) {
            	ExitOfMachineDep = classof().getDependencyDef("ExitOfMachine");
            }
            return ExitOfMachineDep;
        }

        @objid ("1e1de706-f30d-4c04-9d37-73fb1b0dc7a9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e163e134-af8c-47de-8bd6-ae763d3604ee")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("5c75eea7-cdbc-4f40-8b7c-785d70f7e86d")
        public static SmDependency getExitOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfMachineDep;
        }

        @objid ("8ae76395-b1a0-4c29-b3cf-e772e4853f79")
        public static SmDependency getExitOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfDep;
        }

        @objid ("0088c160-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e19b2c83-5b2b-42c1-b341-7fda81874ce9")
            public ISmObjectData createData() {
                return new ExitPointPseudoStateData();
            }

            @objid ("a79fa465-482b-487b-8e73-afc4c7f2a6ab")
            public SmObjectImpl createImpl() {
                return new ExitPointPseudoStateImpl();
            }

        }

        @objid ("00893618-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("84424363-3fc5-4fcd-b378-b6b1361d98c9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExitPointPseudoStateData)data).mConnection != null)? ((ExitPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("66cbf1f7-dd4b-44a0-bf73-30f49e09bbf3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExitPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((ExitPointPseudoStateData) data).mConnection;
            }

            @objid ("3be34d3f-30f2-4e38-bef3-174a59436e63")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.ExitDep();
            }

        }

        @objid ("0089aaf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfSmDependency extends SmSingleDependency {
            @objid ("1a189c7f-1fff-48dd-b584-c045218a2479")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOf;
            }

            @objid ("69149d82-caf1-43d5-aaa9-d8c991e36798")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOf = value;
            }

            @objid ("c4adffa9-54ec-44de-8412-cf8b13cd8ae6")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ExitPointDep();
            }

        }

        @objid ("008a33a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfMachineSmDependency extends SmSingleDependency {
            @objid ("841f906b-8c59-4519-b15a-d1bbf82e2dea")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOfMachine;
            }

            @objid ("2da97da4-04ec-4379-aa0f-cd25d4063b44")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOfMachine = value;
            }

            @objid ("14356e48-1c3d-4239-addf-c2f41ca71a32")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.ExitPointDep();
            }

        }

    }

}
