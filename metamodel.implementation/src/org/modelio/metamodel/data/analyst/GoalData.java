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
@SmaMetaClass(mmClass=Goal.class, factory=GoalData.Metadata.ObjectFactory.class)
public class GoalData extends AnalystElementData {
    @objid ("f524ea88-c90c-4c6f-8556-29f636c99311")
    @SmaMetaAttribute(metaName="Version", type=Integer.class, smAttributeClass=Metadata.VersionSmAttribute.class)
     Object mVersion = 0;

    @objid ("b6daaebe-2dcb-43b5-98d9-31c2d6f6a6bd")
    @SmaMetaAssociation(metaName="SubGoal", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.SubGoalSmDependency.class, component = true)
     List<SmObjectImpl> mSubGoal = null;

    @objid ("0fc09f0a-4882-4455-b9cc-ea69d627403e")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GoalContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("119faf55-7934-495e-84ef-4300b18a9e6f")
    @SmaMetaAssociation(metaName="ParentGoal", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.ParentGoalSmDependency.class)
     SmObjectImpl mParentGoal;

    @objid ("e836f4e3-cad8-4554-a40f-2a39ee0d4b27")
    @SmaMetaAssociation(metaName="LastGoalVersion", typeDataClass=GoalData.class, min=0, max=1, smAssociationClass=Metadata.LastGoalVersionSmDependency.class)
     SmObjectImpl mLastGoalVersion;

    @objid ("6702f9a2-96c5-4f02-b664-49a32c1e6a17")
    @SmaMetaAssociation(metaName="ArchivedGoalVersion", typeDataClass=GoalData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedGoalVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedGoalVersion = null;

    @objid ("98e7bab2-6c83-4555-825c-097895aa3fd2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("5e744ed9-032b-413d-9224-56a38b7d43ef")
    public static class Metadata {
        @objid ("d7ca8696-c4cf-4f74-8468-091dc56b23bf")
        private static SmClass smClass = null;

        @objid ("317a0967-2292-4857-8c60-3ab9fa09b73f")
        private static SmAttribute VersionAtt = null;

        @objid ("3942670d-9465-47da-9ca7-a1ff9cc0bf95")
        private static SmDependency SubGoalDep = null;

        @objid ("38cf162d-a596-4831-b33f-729d6e0d4a7b")
        private static SmDependency OwnerContainerDep = null;

        @objid ("26c44c42-bc08-41ec-8b52-9c5b73a7a867")
        private static SmDependency ParentGoalDep = null;

        @objid ("dd939a23-259d-40f3-8ec8-6cb85cb309b6")
        private static SmDependency LastGoalVersionDep = null;

        @objid ("d252d980-4201-4a1d-a5bd-809278cfbff5")
        private static SmDependency ArchivedGoalVersionDep = null;

        @objid ("0c354fa7-f308-4c89-8e6a-79eeefb5973f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GoalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("958bbb3b-127c-4159-85e9-08e6fb1b4c07")
        public static SmAttribute VersionAtt() {
            if (VersionAtt == null) {
            	VersionAtt = classof().getAttributeDef("Version");
            }
            return VersionAtt;
        }

        @objid ("ad663098-2387-48e1-a5b9-ad4ae6f65f10")
        public static SmDependency SubGoalDep() {
            if (SubGoalDep == null) {
            	SubGoalDep = classof().getDependencyDef("SubGoal");
            }
            return SubGoalDep;
        }

        @objid ("86db7a31-0758-4dda-a847-bff4d341a23d")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("b3d26fce-27e4-474f-bb5e-c3d61fffa406")
        public static SmDependency ParentGoalDep() {
            if (ParentGoalDep == null) {
            	ParentGoalDep = classof().getDependencyDef("ParentGoal");
            }
            return ParentGoalDep;
        }

        @objid ("9cd1d57b-de1e-45e3-9d8a-2fef6312c5dc")
        public static SmDependency LastGoalVersionDep() {
            if (LastGoalVersionDep == null) {
            	LastGoalVersionDep = classof().getDependencyDef("LastGoalVersion");
            }
            return LastGoalVersionDep;
        }

        @objid ("666a072d-5d8e-4f8e-96c3-81fad6dd4f55")
        public static SmDependency ArchivedGoalVersionDep() {
            if (ArchivedGoalVersionDep == null) {
            	ArchivedGoalVersionDep = classof().getDependencyDef("ArchivedGoalVersion");
            }
            return ArchivedGoalVersionDep;
        }

        @objid ("88b07588-185c-4ecf-b36f-441b0eb07e77")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("7c84152d-fbdf-4014-9079-230128e0e86b")
        public static SmDependency getArchivedGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedGoalVersionDep;
        }

        @objid ("1a368539-8b2e-4473-95dc-5b9ec5fe72bf")
        public static SmDependency getSubGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubGoalDep;
        }

        @objid ("cda53a87-01c1-4ce3-9293-04dcd1299663")
        public static SmDependency getLastGoalVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastGoalVersionDep;
        }

        @objid ("e13ce5a5-1331-4d3d-9843-d692d4820065")
        public static SmAttribute getVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VersionAtt;
        }

        @objid ("385d6ad9-f2ee-4d4b-9075-46da377fb63f")
        public static SmDependency getParentGoalDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentGoalDep;
        }

        @objid ("a440f7bb-7474-4d95-a735-8fc2ba992be0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0acdee9a-9cd3-4b6f-8c85-ffd3bad19cdb")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8d759e13-1045-4071-89d4-c762424d25d0")
            public ISmObjectData createData() {
                return new GoalData();
            }

            @objid ("6167a1a9-9def-4031-b014-a78300c32426")
            public SmObjectImpl createImpl() {
                return new GoalImpl();
            }

        }

        @objid ("92a1be87-c6ac-45f9-8990-1f178ac7aaac")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("e756fb9e-a3fa-4545-9832-1027f3e4858b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mOwnerContainer;
            }

            @objid ("93d92c5a-811a-4cd0-89e1-32b2f879302b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mOwnerContainer = value;
            }

            @objid ("e1244c43-7041-45d5-be37-8381220a98ff")
            @Override
            public SmDependency getSymetric() {
                return GoalContainerData.Metadata.OwnedGoalDep();
            }

        }

        @objid ("d84c6795-9fc0-43be-97fc-a4fba6b4738b")
        public static class ParentGoalSmDependency extends SmSingleDependency {
            @objid ("186e0ec7-75b5-4c99-9d6c-8379dbd21cb2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mParentGoal;
            }

            @objid ("aa6abb78-11a0-4144-9d24-198b66135610")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mParentGoal = value;
            }

            @objid ("77fd65a4-9b1a-4599-b76a-7408c5ec197c")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.SubGoalDep();
            }

        }

        @objid ("0f92e307-bc8c-401e-9d37-ab23d953326a")
        public static class SubGoalSmDependency extends SmMultipleDependency {
            @objid ("fe524a62-174f-4278-b4f9-0e18cfc60a0f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mSubGoal != null)? ((GoalData)data).mSubGoal:SmMultipleDependency.EMPTY;
            }

            @objid ("d80dee65-0cc8-4d4d-bb58-b6970b13fba4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mSubGoal = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mSubGoal;
            }

            @objid ("78b998fd-da4a-413a-9eee-273108853020")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ParentGoalDep();
            }

        }

        @objid ("a3fe3630-1211-45d3-b196-a6732929abef")
        public static class VersionSmAttribute extends SmAttribute {
            @objid ("62099245-9caa-410f-bb40-f02b948a5b49")
            public Object getValue(ISmObjectData data) {
                return ((GoalData) data).mVersion;
            }

            @objid ("e0091ea8-b4bb-415d-91a3-ccb73502eaee")
            public void setValue(ISmObjectData data, Object value) {
                ((GoalData) data).mVersion = value;
            }

        }

        @objid ("9e4bdc62-c678-47ae-afc5-5b8e36fece04")
        public static class LastGoalVersionSmDependency extends SmSingleDependency {
            @objid ("f446043d-4ac3-4463-9b13-f03e8086efc9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GoalData) data).mLastGoalVersion;
            }

            @objid ("5d7cfecd-730e-418c-bb0e-af8c89f30dba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GoalData) data).mLastGoalVersion = value;
            }

            @objid ("681faf0c-3b94-4d2a-8f0e-ed8e2f2c610e")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.ArchivedGoalVersionDep();
            }

        }

        @objid ("f6dd9f71-3798-482a-947b-1a05165b1f7e")
        public static class ArchivedGoalVersionSmDependency extends SmMultipleDependency {
            @objid ("cc4ac3c4-cf55-407c-881d-32a70c61d869")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GoalData)data).mArchivedGoalVersion != null)? ((GoalData)data).mArchivedGoalVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("eeadbf3d-8d77-4ee8-85fe-0e1ba145ac1d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GoalData) data).mArchivedGoalVersion = new ArrayList<>(initialCapacity);
                return ((GoalData) data).mArchivedGoalVersion;
            }

            @objid ("8f257733-e294-42b0-8ba9-53efca136891")
            @Override
            public SmDependency getSymetric() {
                return GoalData.Metadata.LastGoalVersionDep();
            }

        }

    }

}
