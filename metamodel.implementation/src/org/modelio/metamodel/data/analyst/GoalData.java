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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.impl.analyst.GoalImpl;
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

@objid ("e8d12951-1ab0-47fa-a43b-bfbe216ceb44")
@SmaMetaClass(mmClass=Goal.class, factory=GoalData.Metadata.ObjectFactory.class, cmsnode=true)
public class GoalData extends AnalystElementData {
    @objid ("22b88013-9d04-48f0-87f2-9546d34784ff")
    @SmaMetaAssociation(metaName="SubGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.SubGoalSmDependency.class, component = true)
     List<SmObjectImpl> mSubGoal = null;

    @objid ("07157393-c7e7-44d0-baa6-8325656b5442")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("9fa4de7f-b28a-4e4a-b056-1cfe2ba7c7a6")
    @SmaMetaAssociation(metaName="ParentGoal", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.ParentGoalSmDependency.class)
     SmObjectImpl mParentGoal;

    @objid ("f4849ae7-b5d8-40bc-ba50-f9e9fc587bf5")
    @SmaMetaAssociation(metaName="LastGoalVersion", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.LastGoalVersionSmDependency.class)
     SmObjectImpl mLastGoalVersion;

    @objid ("035d1a5e-a263-45cf-9bd4-77fc80f1abc4")
    @SmaMetaAssociation(metaName="ArchivedGoalVersion", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedGoalVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedGoalVersion = null;

    @objid ("e49a4330-9702-4163-af2d-9889c0e4437f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("5e744ed9-032b-413d-9224-56a38b7d43ef")
    public static class Metadata {
        @objid ("5389ddae-318b-4d4d-bf2f-76aeba3d225d")
        private static SmClass smClass = null;

        @objid ("583c7c1a-5d19-481c-a329-8946b98659a5")
        private static SmDependency SubGoalDep = null;

        @objid ("08f8297a-2128-4c7e-8848-5ef50b2434b3")
        private static SmDependency OwnerContainerDep = null;

        @objid ("2bcfd801-6536-404c-8650-afb53f2d00bf")
        private static SmDependency ParentGoalDep = null;

        @objid ("600abb7c-c393-4b2c-9721-eada14778385")
        private static SmDependency LastGoalVersionDep = null;

        @objid ("93afac88-15c1-4bae-8990-0a673063bb49")
        private static SmDependency ArchivedGoalVersionDep = null;

        @objid ("f711188f-1d63-445e-8f2e-63709721593e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("532b27c7-3f27-40cf-a86f-ffddf49139b8")
        public static SmDependency SubGoalDep() {
            if (SubGoalDep == null) {
            	SubGoalDep = classof().getDependencyDef("SubGoal");
            }
            return SubGoalDep;
        }

        @objid ("503327ce-8201-4cb5-bcc8-dd45665517f4")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("b10cff25-2005-4c08-b21f-4b388b29a3d7")
        public static SmDependency ParentGoalDep() {
            if (ParentGoalDep == null) {
            	ParentGoalDep = classof().getDependencyDef("ParentGoal");
            }
            return ParentGoalDep;
        }

        @objid ("7c435f12-e343-45b6-bade-cd59ac237a80")
        public static SmDependency LastGoalVersionDep() {
            if (LastGoalVersionDep == null) {
            	LastGoalVersionDep = classof().getDependencyDef("LastGoalVersion");
            }
            return LastGoalVersionDep;
        }

        @objid ("988e2c5b-046c-4c62-b9dd-c5328909e9e6")
        public static SmDependency ArchivedGoalVersionDep() {
            if (ArchivedGoalVersionDep == null) {
            	ArchivedGoalVersionDep = classof().getDependencyDef("ArchivedGoalVersion");
            }
            return ArchivedGoalVersionDep;
        }

        @objid ("030be51b-80c6-4908-9b26-414d0f13ef57")
        public static SmDependency getLastGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastGoalVersionDep;
        }

        @objid ("0110122c-95a3-4ecf-9921-70aefe8b0f23")
        public static SmDependency getArchivedGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedGoalVersionDep;
        }

        @objid ("7333cf93-a72e-4132-9e88-4847385b12bb")
        public static SmDependency getParentGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentGoalDep;
        }

        @objid ("f823ebf6-539e-4baf-b139-428fcc33ce85")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("8b77c5da-78e1-4d12-9381-28dcd0363e09")
        public static SmDependency getSubGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubGoalDep;
        }

        @objid ("4489651c-326b-43ee-abfc-21c426c4428f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0acdee9a-9cd3-4b6f-8c85-ffd3bad19cdb")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a85125f0-e8e8-4611-a538-c59980dd2734")
            public ISmObjectData createData() {
                return new GoalData();
            }

            @objid ("20536f3c-0c28-4e0d-a43e-a4908bb471c9")
            public SmObjectImpl createImpl() {
                return new GoalImpl();
            }

        }

        @objid ("92a1be87-c6ac-45f9-8990-1f178ac7aaac")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("e24ba2d1-a80d-47cb-b54b-6b5346b05f67")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mOwnerContainer;
            }

            @objid ("7a3bbc98-beb8-48a6-ae7b-e9dc2fa373b2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mOwnerContainer = value;
            }

            @objid ("2211fd96-3c57-4a66-bc89-56b85e2d50cc")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedGoalDep();
            }

        }

        @objid ("d84c6795-9fc0-43be-97fc-a4fba6b4738b")
        public static class ParentGoalSmDependency extends SmSingleDependency {
            @objid ("3b263d2f-3b66-49fc-91e8-8ee3f647922a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mParentGoal;
            }

            @objid ("d8fd9dba-6b9a-44d0-a6be-e15649251b09")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mParentGoal = value;
            }

            @objid ("6f1fa261-8124-4cd7-8b5c-bf758d4e013b")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.SubGoalDep();
            }

        }

        @objid ("0f92e307-bc8c-401e-9d37-ab23d953326a")
        public static class SubGoalSmDependency extends SmMultipleDependency {
            @objid ("f50558b1-35f7-44c6-a327-5f3531180cb4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mSubGoal != null)? ((GoalData)data).mSubGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("43f20ef3-10ce-4f24-b370-50558468c042")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mSubGoal = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mSubGoal;
            }

            @objid ("c974981b-8208-4268-b1b2-a480949a4cfc")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ParentGoalDep();
            }

        }

        @objid ("9e4bdc62-c678-47ae-afc5-5b8e36fece04")
        public static class LastGoalVersionSmDependency extends SmSingleDependency {
            @objid ("92dd559f-8502-4c7e-842e-8aa45451f700")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mLastGoalVersion;
            }

            @objid ("6048079d-ddf4-4816-a147-dacce40bf366")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mLastGoalVersion = value;
            }

            @objid ("115b0e58-4c49-4c89-b76a-6af5ed263c9e")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ArchivedGoalVersionDep();
            }

        }

        @objid ("f6dd9f71-3798-482a-947b-1a05165b1f7e")
        public static class ArchivedGoalVersionSmDependency extends SmMultipleDependency {
            @objid ("15c4b30c-3b6a-4883-90d7-b7b0215bef51")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mArchivedGoalVersion != null)? ((GoalData)data).mArchivedGoalVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("a43703d5-7c4a-440f-a36a-20b45ce4995a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mArchivedGoalVersion = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mArchivedGoalVersion;
            }

            @objid ("86791439-1b2c-4817-ad6e-2c2a16e2eac3")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.LastGoalVersionDep();
            }

        }

    }

}
