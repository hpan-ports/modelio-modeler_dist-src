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
    @objid ("b389780e-6e7a-4c35-81fd-5f2028f46d17")
    @SmaMetaAssociation(metaName="ExitOf", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfSmDependency.class)
     SmObjectImpl mExitOf;

    @objid ("2cf8e9f4-447f-4ea1-846f-707ccfd98b09")
    @SmaMetaAssociation(metaName="Connection", typeDataClass=ConnectionPointReferenceData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectionSmDependency.class)
     List<SmObjectImpl> mConnection = null;

    @objid ("270855c4-974c-4c86-bb37-5c07d36ea5a7")
    @SmaMetaAssociation(metaName="ExitOfMachine", typeDataClass=StateMachineData.class, min=0, max=1, smAssociationClass=Metadata.ExitOfMachineSmDependency.class)
     SmObjectImpl mExitOfMachine;

    @objid ("dd38a60c-f83f-4745-b156-35ab73c60a59")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00886fbc-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("127f4451-7a1e-413a-985e-4f22355791b6")
        private static SmClass smClass = null;

        @objid ("9da0d57e-b2da-4e56-8ae4-2fc54a77bf58")
        private static SmDependency ExitOfDep = null;

        @objid ("d0930d22-f8bf-4e8a-a9ef-c4dba49a651c")
        private static SmDependency ConnectionDep = null;

        @objid ("b5f41de7-45ee-409c-a58c-c2c193d45754")
        private static SmDependency ExitOfMachineDep = null;

        @objid ("b51d987b-fed9-4f1c-ad1e-286cda08f6a3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExitPointPseudoStateData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("15a2e49c-63c4-4be8-ae73-fa31f646118b")
        public static SmDependency ExitOfDep() {
            if (ExitOfDep == null) {
            	ExitOfDep = classof().getDependencyDef("ExitOf");
            }
            return ExitOfDep;
        }

        @objid ("632010ee-4b57-4356-bd0f-5ba2e606aed8")
        public static SmDependency ConnectionDep() {
            if (ConnectionDep == null) {
            	ConnectionDep = classof().getDependencyDef("Connection");
            }
            return ConnectionDep;
        }

        @objid ("c8a11dc8-46d8-4c52-b67d-55bf54b0dd69")
        public static SmDependency ExitOfMachineDep() {
            if (ExitOfMachineDep == null) {
            	ExitOfMachineDep = classof().getDependencyDef("ExitOfMachine");
            }
            return ExitOfMachineDep;
        }

        @objid ("d824d9f4-8acc-4583-bd72-04ec0f9774a3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("11adda2d-49a0-43c0-ae67-77b0a4a8ab79")
        public static SmDependency getExitOfDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfDep;
        }

        @objid ("5282dba0-9c68-43d5-88e6-fe96a0fca9f1")
        public static SmDependency getConnectionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectionDep;
        }

        @objid ("91b6ea59-0b1f-4ea9-9cfa-1b202f315b88")
        public static SmDependency getExitOfMachineDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitOfMachineDep;
        }

        @objid ("0088c160-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aa81082d-895b-4863-9dc8-fb6e39e58c23")
            public ISmObjectData createData() {
                return new ExitPointPseudoStateData();
            }

            @objid ("b37ba028-aa01-4503-8e35-62caa61cc21d")
            public SmObjectImpl createImpl() {
                return new ExitPointPseudoStateImpl();
            }

        }

        @objid ("00893618-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectionSmDependency extends SmMultipleDependency {
            @objid ("ff4fad28-96a3-4650-9977-47071283f587")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExitPointPseudoStateData)data).mConnection != null)? ((ExitPointPseudoStateData)data).mConnection:SmMultipleDependency.EMPTY;
            }

            @objid ("56b91457-d5dd-4f7f-81f2-1c7409050526")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExitPointPseudoStateData) data).mConnection = new ArrayList<>(initialCapacity);
                return ((ExitPointPseudoStateData) data).mConnection;
            }

            @objid ("c226bdcb-a3d4-4db2-a299-c2e5a3f5ba67")
            @Override
            public SmDependency getSymetric() {
                return ConnectionPointReferenceData.Metadata.ExitDep();
            }

        }

        @objid ("0089aaf8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfSmDependency extends SmSingleDependency {
            @objid ("0a59c02b-125c-4f21-84a2-dc7e45f937b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOf;
            }

            @objid ("8bc6a01d-acf6-448a-994d-ab9394ce7093")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOf = value;
            }

            @objid ("5d83c6db-c6ae-4f79-a419-649c178e3088")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ExitPointDep();
            }

        }

        @objid ("008a33a6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExitOfMachineSmDependency extends SmSingleDependency {
            @objid ("b51992ac-5fb9-405e-8684-5efcb1c342d8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExitPointPseudoStateData) data).mExitOfMachine;
            }

            @objid ("b8fab02d-8da1-494b-85e4-9299484f056a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExitPointPseudoStateData) data).mExitOfMachine = value;
            }

            @objid ("884b4387-940f-45f3-ae82-de161df87c68")
            @Override
            public SmDependency getSymetric() {
                return StateMachineData.Metadata.ExitPointDep();
            }

        }

    }

}
