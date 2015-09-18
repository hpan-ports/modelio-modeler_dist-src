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
    @objid ("f283e53d-59ce-4037-9254-6a3605f049c1")
    @SmaMetaAssociation(metaName="ExitOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfSmDependency.class)
     SmObjectImpl mExitOf;

    @objid ("28a3dd44-43c6-47c3-9d2f-6ae620ff1669")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("5fd9cb44-39a8-4c18-9f7b-9d2c10044d8d")
    @SmaMetaAssociation(metaName="ExitOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfMachineSmDependency.class)
     SmObjectImpl mExitOfMachine;

    @objid ("1bb56772-b88a-4219-83db-8e421f8982e8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00886fbc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44af2ad0-8c2f-43b6-9a11-c170ae1bb794")
        private static SmClass smClass = null;

        @objid ("52927fbc-2e5a-420e-b161-35a9cb1ea75c")
        private static SmDependency ExitOfDep = null;

        @objid ("727e7571-0979-4cec-a296-b7ee42f449e6")
        private static SmDependency ConnectionDep = null;

        @objid ("7da2b46e-41db-4ce4-9b3f-a23b66f73aaa")
        private static SmDependency ExitOfMachineDep = null;

        @objid ("f0a03db3-486b-41c3-8874-f5c8f100a1be")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExitPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d9a04307-d548-4192-8850-8de503c55028")
        public static SmDependency ExitOfDep() {
            if (ExitOfDep == null) {
            	ExitOfDep = classof().getDependencyDef("ExitOf");
            }
            return ExitOfDep;
        }

        @objid ("f0d16184-327b-467c-8646-e6e2f67c8518")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("c6fe2897-88ca-48c8-9652-28239ddd0344")
        public static SmDependency ExitOfMachineDep() {
            if (ExitOfMachineDep == null) {
            	ExitOfMachineDep = classof().getDependencyDef("ExitOfMachine");
            }
            return ExitOfMachineDep;
        }

        @objid ("b7776fbb-bc19-440d-abc8-8724c0e3239c")
        public static SmDependency getExitOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfDep;
        }

        @objid ("4d8d62bb-d7e7-4a2b-aa8a-6a4b40abd1be")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("24582569-27b0-4b36-aafd-94976cbeeac6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("abe3bbfc-5286-4cff-bd4b-40d5510c7c66")
        public static SmDependency getExitOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfMachineDep;
        }

        @objid ("0088c160-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("36111a31-0134-479c-9e10-7619682e36c5")
            public ISmObjectData createData() {
                return new ExitPointPseudoStateData();
            }

            @objid ("34ebb35c-01b4-4f3f-b55e-dc5c05886422")
            public SmObjectImpl createImpl() {
                return new ExitPointPseudoStateImpl();
            }

        }

        @objid ("00893618-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("16df2d33-d39d-4b96-a193-ab1307e2e855")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExitPointPseudoStateData)data).mConnection != null)? ((ExitPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("c9cc55aa-c0b0-4ddd-9580-c49c0a763a91")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExitPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((ExitPointPseudoStateData) data).mConnection;
            }

            @objid ("a8ad2c16-b824-429e-b999-c81ad97301b8")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.ExitDep();
            }

        }

        @objid ("0089aaf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfSmDependency extends SmSingleDependency {
            @objid ("b5ae4260-64ea-4cbd-add7-0941e3cc0750")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOf;
            }

            @objid ("455dc8d1-5496-44f9-b479-086b81686c62")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOf = value;
            }

            @objid ("33e48866-abbe-4313-bf79-d2a7f010fb62")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ExitPointDep();
            }

        }

        @objid ("008a33a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfMachineSmDependency extends SmSingleDependency {
            @objid ("6376ee8c-0ab3-455e-bc2b-9f6f5239dda3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOfMachine;
            }

            @objid ("90bf3258-3096-4d80-95c3-2bd334f4a39e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOfMachine = value;
            }

            @objid ("03c61248-a555-4a65-887b-947b70dcc31a")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.ExitPointDep();
            }

        }

    }

}
