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
    @objid ("e2494a72-0fcf-44cb-95eb-b2918ee4b058")
    @SmaMetaAssociation(metaName="Exit", typeDataClass=ExitPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.ExitSmDependency.class, partof = true)
     SmObjectImpl mExit;

    @objid ("3dc5be7e-33cd-4853-b48e-3601f46b231e")
    @SmaMetaAssociation(metaName="Entry", typeDataClass=EntryPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.EntrySmDependency.class, partof = true)
     SmObjectImpl mEntry;

    @objid ("74a3a020-cac2-4f40-9934-5f99a4115b1c")
    @SmaMetaAssociation(metaName="OwnerState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStateSmDependency.class)
     SmObjectImpl mOwnerState;

    @objid ("94fd8b6e-23f6-419d-8cb9-4786faeca7f1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0094ba38-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("56f3fcbf-880a-4664-ac9e-031612001f79")
        private static SmClass smClass = null;

        @objid ("43b4974c-c99b-4bea-b9a3-c4ad9372744a")
        private static SmDependency ExitDep = null;

        @objid ("a9e1ab1a-7fe9-4338-b86d-5527428daaca")
        private static SmDependency EntryDep = null;

        @objid ("5c05de3c-6050-4e93-ba59-4856d4c2f8d7")
        private static SmDependency OwnerStateDep = null;

        @objid ("50484f5f-925c-4fdc-af16-6db7eefd8bcc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectionPointReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("133c8345-2689-4b43-85ee-cc8fb3dfb39a")
        public static SmDependency ExitDep() {
            if (ExitDep == null) {
            	ExitDep = classof().getDependencyDef("Exit");
            }
            return ExitDep;
        }

        @objid ("6715fafd-efb1-4dd4-aa3d-fe4fd9e70574")
        public static SmDependency EntryDep() {
            if (EntryDep == null) {
            	EntryDep = classof().getDependencyDef("Entry");
            }
            return EntryDep;
        }

        @objid ("fd59999b-2640-4101-87c8-f1ba896fe4f0")
        public static SmDependency OwnerStateDep() {
            if (OwnerStateDep == null) {
            	OwnerStateDep = classof().getDependencyDef("OwnerState");
            }
            return OwnerStateDep;
        }

        @objid ("8f2046ed-4dca-4bb0-a271-2eabda2f71cd")
        public static SmDependency getOwnerStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStateDep;
        }

        @objid ("26d77162-7761-45a2-b98b-839691f465cd")
        public static SmDependency getEntryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryDep;
        }

        @objid ("4739b8cb-a994-4a13-b49d-91d89931e585")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d8dc914f-8386-4f78-83a8-9629a6adc21c")
        public static SmDependency getExitDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitDep;
        }

        @objid ("0095112c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2c450feb-a33f-4f36-9d65-05c88a811bea")
            public ISmObjectData createData() {
                return new ConnectionPointReferenceData();
            }

            @objid ("ad09242e-cccc-4b5c-b8c8-9b26cc70b8ee")
            public SmObjectImpl createImpl() {
                return new ConnectionPointReferenceImpl();
            }

        }

        @objid ("00958b70-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntrySmDependency extends SmSingleDependency {
            @objid ("94e8364f-82b0-4e6d-a277-f8e557cba8c9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mEntry;
            }

            @objid ("c496e5b5-2b0b-4269-90e1-dc960ff18732")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mEntry = value;
            }

            @objid ("f1203b63-d834-428c-b10c-bea636a5e676")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("00961d2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitSmDependency extends SmSingleDependency {
            @objid ("c9882043-55fe-457c-a579-4c19f45f8cf5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mExit;
            }

            @objid ("732c16c6-5225-4f64-b1fd-d5e986beaf9e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mExit = value;
            }

            @objid ("3edbe667-ee3a-4712-a1cf-869214fec074")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("0096ac4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStateSmDependency extends SmSingleDependency {
            @objid ("33024a75-3039-41df-9fcd-69b16f180e20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mOwnerState;
            }

            @objid ("4ae87869-1fdf-40a2-ab93-7cb842cf724d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mOwnerState = value;
            }

            @objid ("8e4c68e2-5cde-4eae-aa7f-cf44a282313f")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ConnectionDep();
            }

        }

    }

}
