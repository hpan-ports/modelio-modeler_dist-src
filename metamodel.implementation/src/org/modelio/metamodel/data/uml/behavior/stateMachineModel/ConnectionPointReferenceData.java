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
    @objid ("a2bc5b09-63c3-4199-a592-d78b782f93bd")
    @SmaMetaAssociation(metaName="Exit", typeDataClass=ExitPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.ExitSmDependency.class, partof = true)
     SmObjectImpl mExit;

    @objid ("348b0297-1206-4583-9cb3-14cb36cfe83c")
    @SmaMetaAssociation(metaName="Entry", typeDataClass=EntryPointPseudoStateData.class, min=0, max=1, smAssociationClass=Metadata.EntrySmDependency.class, partof = true)
     SmObjectImpl mEntry;

    @objid ("4ac14947-f646-4813-be62-426b230a15e4")
    @SmaMetaAssociation(metaName="OwnerState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStateSmDependency.class)
     SmObjectImpl mOwnerState;

    @objid ("3b247ff7-c054-4db0-b75e-ebb54e2259f9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0094ba38-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c5e40b9d-d390-4eff-9f45-1e967a03ead8")
        private static SmClass smClass = null;

        @objid ("f3a8b2b6-d02c-4287-bd71-7e1d92776cec")
        private static SmDependency ExitDep = null;

        @objid ("6ab4c05a-1d3e-40c0-833d-8b13cca6cba5")
        private static SmDependency EntryDep = null;

        @objid ("d02d4427-2871-4142-bdce-7ada8d1665d3")
        private static SmDependency OwnerStateDep = null;

        @objid ("2008e094-4aed-4fdb-9861-a0741b04cc83")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConnectionPointReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e16f559-ba1c-4d53-81de-3618aad91a42")
        public static SmDependency ExitDep() {
            if (ExitDep == null) {
            	ExitDep = classof().getDependencyDef("Exit");
            }
            return ExitDep;
        }

        @objid ("5480c80a-4148-406d-a8cd-553e0cb8362a")
        public static SmDependency EntryDep() {
            if (EntryDep == null) {
            	EntryDep = classof().getDependencyDef("Entry");
            }
            return EntryDep;
        }

        @objid ("545be9b9-8ab6-4388-b41f-b0c4bd1b8792")
        public static SmDependency OwnerStateDep() {
            if (OwnerStateDep == null) {
            	OwnerStateDep = classof().getDependencyDef("OwnerState");
            }
            return OwnerStateDep;
        }

        @objid ("ac6f6595-d3fe-4cb3-8ed8-a030d4b32a07")
        public static SmDependency getExitDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExitDep;
        }

        @objid ("57e2a281-a042-4812-8898-eaeb5620e9f7")
        public static SmDependency getOwnerStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStateDep;
        }

        @objid ("f7fcf75e-5b90-4d90-b100-1fa804aa3b60")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7b355e32-88b7-4b14-9b91-82f56acad6cf")
        public static SmDependency getEntryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryDep;
        }

        @objid ("0095112c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("143d86db-8e1f-4203-b92c-7a91718e57d3")
            public ISmObjectData createData() {
                return new ConnectionPointReferenceData();
            }

            @objid ("338ba405-3244-40d8-8a9a-50ac278e96c4")
            public SmObjectImpl createImpl() {
                return new ConnectionPointReferenceImpl();
            }

        }

        @objid ("00958b70-c4c4-1fd8-97fe-001ec947cd2a")
        public static class EntrySmDependency extends SmSingleDependency {
            @objid ("8f58ad0f-6abe-40ce-928b-13a69c5c9331")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mEntry;
            }

            @objid ("a3812127-7e90-44fe-8561-46b4bb3480a1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mEntry = value;
            }

            @objid ("40c7d4e7-f2a8-44cc-a331-50c1d19e6480")
            @Override
            public SmDependency getSymetric() {
                return EntryPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("00961d2e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExitSmDependency extends SmSingleDependency {
            @objid ("a3f83e33-3986-45db-b6bd-74d4eff904d5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mExit;
            }

            @objid ("48e4f41b-3440-406c-8a77-5e737184ddb0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mExit = value;
            }

            @objid ("9ef30bda-472e-4b1a-8e49-02ce0e7fdaee")
            @Override
            public SmDependency getSymetric() {
                return ExitPointPseudoStateData.Metadata.ConnectionDep();
            }

        }

        @objid ("0096ac4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStateSmDependency extends SmSingleDependency {
            @objid ("d8fb4486-f086-4bc5-93d4-1069833b620c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ConnectionPointReferenceData) data).mOwnerState;
            }

            @objid ("222c5d14-6856-4166-9678-503bad5311ae")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ConnectionPointReferenceData) data).mOwnerState = value;
            }

            @objid ("451d05e1-2e52-4f15-af6c-52052b0341b8")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.ConnectionDep();
            }

        }

    }

}
