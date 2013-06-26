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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
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

@objid ("004e9526-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ConnectionPointReference.class, factory=ConnectionPointReferenceData.Metadata.ObjectFactory.class)
public class ConnectionPointReferenceData extends StateVertexData {
    @objid ("822ab001-f187-4d9f-89e8-98962a586d2f")
    @SmaMetaAssociation(metaName="Exit", typeDataClass=ExitPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.ExitSmDependency.class, partof = true)
     SmObjectImpl mExit;

    @objid ("57340de4-0fe7-452b-8118-ff0217f0de87")
    @SmaMetaAssociation(metaName="Entry", typeDataClass=EntryPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.EntrySmDependency.class, partof = true)
     SmObjectImpl mEntry;

    @objid ("20550800-7ae1-4229-98d3-5e7ff2e4ea2d")
    @SmaMetaAssociation(metaName="OwnerState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStateSmDependency.class)
     SmObjectImpl mOwnerState;

    @objid ("c6904fcf-9b11-4158-b5a7-f41421f3bd47")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0094ba38-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ca359aa9-dde9-4941-985d-5fed291c9fd5")
        private static SmClass smClass = null;

        @objid ("143bd649-1310-4c5c-944b-dec3a2c10dea")
        private static SmDependency ExitDep = null;

        @objid ("40148b9e-fc07-40dd-ac99-baa4f385773b")
        private static SmDependency EntryDep = null;

        @objid ("bb351308-e690-4f8c-828d-72e67597ef4b")
        private static SmDependency OwnerStateDep = null;

        @objid ("ed392dd7-4bcd-4a0f-8fd8-bc994eab282e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectionPointReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8e743723-ddda-4cc4-948b-ed94a79f2786")
        public static SmDependency ExitDep() {
            if (ExitDep == null) {
            	ExitDep = classof().getDependencyDef("Exit");
            }
            return ExitDep;
        }

        @objid ("7d90d7cc-8261-454b-a2d8-9e09561f7756")
        public static SmDependency EntryDep() {
            if (EntryDep == null) {
            	EntryDep = classof().getDependencyDef("Entry");
            }
            return EntryDep;
        }

        @objid ("b5f3bafa-5ce1-4c86-9456-c197fa9d257d")
        public static SmDependency OwnerStateDep() {
            if (OwnerStateDep == null) {
            	OwnerStateDep = classof().getDependencyDef("OwnerState");
            }
            return OwnerStateDep;
        }

        @objid ("79d7aac4-88b0-407f-9b5f-dcad409e313f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7ea1b4f-cfd5-47d0-8348-ac9ff378fda7")
        public static SmDependency getEntryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryDep;
        }

        @objid ("69d3cb83-2573-4b86-b5b2-31328b7ab6c8")
        public static SmDependency getExitDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitDep;
        }

        @objid ("4021c410-9a9c-4bf1-add2-395b457fddaa")
        public static SmDependency getOwnerStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStateDep;
        }

        @objid ("0095112c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("51bd3526-12de-462d-8ed4-f04047a5daba")
            public ISmObjectData createData() {
                return new ConnectionPointReferenceData();
            }

            @objid ("1c18b8f8-a354-49e0-bfcd-d59b52ef64d5")
            public SmObjectImpl createImpl() {
                return new ConnectionPointReferenceImpl();
            }

        }

        @objid ("00958b70-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntrySmDependency extends SmSingleDependency {
            @objid ("34294c55-1a5e-47e1-a071-6ab479294fe6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mEntry;
            }

            @objid ("c2d199e3-6a69-49cf-9a0e-2b527b7a5a7f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mEntry = value;
            }

            @objid ("869ccbd4-c169-4918-82b0-c838b4c0f221")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("00961d2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitSmDependency extends SmSingleDependency {
            @objid ("773df208-49c1-471d-bfb4-e4d5e6a618a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mExit;
            }

            @objid ("af445dcc-f41d-4b86-8641-e24593071463")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mExit = value;
            }

            @objid ("54c14315-b48f-4d4f-a98a-4894cb73e93f")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("0096ac4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStateSmDependency extends SmSingleDependency {
            @objid ("e65c52d5-6b8a-4ce5-821c-a281a26d5bcd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mOwnerState;
            }

            @objid ("05a3a38c-68fd-4249-867e-134ef1e7e391")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mOwnerState = value;
            }

            @objid ("e0a0534a-9b29-410e-8806-e977f1bde45a")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ConnectionDep();
            }

        }

    }

}
