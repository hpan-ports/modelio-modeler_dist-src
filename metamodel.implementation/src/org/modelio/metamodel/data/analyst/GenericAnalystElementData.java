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
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.impl.analyst.GenericAnalystElementImpl;
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

@objid ("efe46dc4-941a-4fc9-9c1b-e10b1c1e8cea")
@SmaMetaClass(mmClass=GenericAnalystElement.class, factory=GenericAnalystElementData.Metadata.ObjectFactory.class)
public class GenericAnalystElementData extends AnalystElementData {
    @objid ("40901a61-8a63-4c6a-b640-375ab5e8179e")
    @SmaMetaAssociation(metaName="SubElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.SubElementSmDependency.class, component = true)
     List<SmObjectImpl> mSubElement = null;

    @objid ("c852161d-862a-43c5-8abb-1125cb085417")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("165e3b92-ddad-4413-be73-1ffb00f930b1")
    @SmaMetaAssociation(metaName="ParentElement", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.ParentElementSmDependency.class)
     SmObjectImpl mParentElement;

    @objid ("93394503-da6c-462e-8f1d-e7c8db93d91e")
    @SmaMetaAssociation(metaName="LastElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.LastElementVersionSmDependency.class)
     SmObjectImpl mLastElementVersion;

    @objid ("777e5744-f066-4b55-a620-892beb267214")
    @SmaMetaAssociation(metaName="ArchivedElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedElementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedElementVersion = null;

    @objid ("666f9012-5205-4500-a2b6-3d30f42318d9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("d5741ea9-0633-4aae-88e4-b33548a7bdb5")
    public static class Metadata {
        @objid ("297355fd-79cd-4ecd-b16d-9ee73df740d9")
        private static SmClass smClass = null;

        @objid ("4e3904f5-25ae-4b41-92b8-c9bdc7f1753d")
        private static SmDependency SubElementDep = null;

        @objid ("33567382-372d-412d-9a33-72d5a28ab42c")
        private static SmDependency OwnerContainerDep = null;

        @objid ("e58f3d8b-4b5c-4ec9-88ec-399157fe61c6")
        private static SmDependency ParentElementDep = null;

        @objid ("3ae6e853-ef39-44c3-b19c-7376fb7322ad")
        private static SmDependency LastElementVersionDep = null;

        @objid ("195d9971-683c-485d-930c-390ef3f4aca7")
        private static SmDependency ArchivedElementVersionDep = null;

        @objid ("642bb1af-f89b-4471-b82a-7947c7373703")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2e0841c8-9244-424e-a66b-ab0bcdd668cf")
        public static SmDependency SubElementDep() {
            if (SubElementDep == null) {
            	SubElementDep = classof().getDependencyDef("SubElement");
            }
            return SubElementDep;
        }

        @objid ("be940669-0cb8-48dd-849f-a4a4be54a768")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("c35d402c-a2e6-4ca6-b9ac-f94659dcb3c4")
        public static SmDependency ParentElementDep() {
            if (ParentElementDep == null) {
            	ParentElementDep = classof().getDependencyDef("ParentElement");
            }
            return ParentElementDep;
        }

        @objid ("fc5c51b8-a4b0-4783-b7da-cec9ac4aefc4")
        public static SmDependency LastElementVersionDep() {
            if (LastElementVersionDep == null) {
            	LastElementVersionDep = classof().getDependencyDef("LastElementVersion");
            }
            return LastElementVersionDep;
        }

        @objid ("6f337d44-5bfa-41ad-a64e-56839f50e23b")
        public static SmDependency ArchivedElementVersionDep() {
            if (ArchivedElementVersionDep == null) {
            	ArchivedElementVersionDep = classof().getDependencyDef("ArchivedElementVersion");
            }
            return ArchivedElementVersionDep;
        }

        @objid ("fa1759a4-e5a2-4fe3-8c0c-d856d38df1ed")
        public static SmDependency getLastElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastElementVersionDep;
        }

        @objid ("abbd7ef9-3053-4def-ba1b-0b4b09cdab3c")
        public static SmDependency getSubElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubElementDep;
        }

        @objid ("51e521c0-19d5-47fe-b138-24c0f49dd940")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("3dd0427f-7e09-415c-bee8-ccbd34fbef44")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9a9d1f27-a4de-4f5d-a7a7-ab7ec4052078")
        public static SmDependency getArchivedElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedElementVersionDep;
        }

        @objid ("0a207458-18f0-4db7-b8bb-96da74377264")
        public static SmDependency getParentElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentElementDep;
        }

        @objid ("cc1ce53d-0f1b-43c2-9c59-dcd9e04d69c7")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e03b5f29-7075-4c05-94a1-fe3a2f39b69c")
            public ISmObjectData createData() {
                return new GenericAnalystElementData();
            }

            @objid ("ed794062-9bbb-4b2c-a7ca-105f4a4d8a06")
            public SmObjectImpl createImpl() {
                return new GenericAnalystElementImpl();
            }

        }

        @objid ("cea8b035-ed3b-494e-a32d-368ef075b1db")
        public static class SubElementSmDependency extends SmMultipleDependency {
            @objid ("2ac2cbe3-2852-4348-9fca-02786cbda293")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mSubElement != null)? ((GenericAnalystElementData)data).mSubElement:SmMultipleDependency.EMPTY;
            }

            @objid ("fc1710a0-1d7b-4940-a6cd-100b31029b3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mSubElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mSubElement;
            }

            @objid ("6cf6e08f-0dbd-4f2d-a620-ddc5cde2eed2")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ParentElementDep();
            }

        }

        @objid ("8e30e4ba-172d-4cea-8352-de8b6d58661c")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("d13402bf-ff64-4286-88bf-8674d5df7f1a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mOwnerContainer;
            }

            @objid ("c0270c8a-f75f-4882-8165-95c48d8a040a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mOwnerContainer = value;
            }

            @objid ("76fb1d71-d583-4ca6-97d7-9326019a6729")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedElementDep();
            }

        }

        @objid ("736a5f2b-71ab-4258-8737-9d9e5687c9d1")
        public static class ParentElementSmDependency extends SmSingleDependency {
            @objid ("188f1d58-4719-4f5d-8ff3-7a4107d60653")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mParentElement;
            }

            @objid ("5c13d214-8355-444d-9947-82c5ea5eaa59")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mParentElement = value;
            }

            @objid ("86f33f63-bfe8-4757-9757-db199fe1042e")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.SubElementDep();
            }

        }

        @objid ("1e706646-429b-4798-8d27-7429d6326ca3")
        public static class LastElementVersionSmDependency extends SmSingleDependency {
            @objid ("c8d99f85-d90a-4955-8738-6d370015ad51")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mLastElementVersion;
            }

            @objid ("a6d485e0-639e-4ba8-a9a2-8b929f2c5a47")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mLastElementVersion = value;
            }

            @objid ("188a356a-c8d3-4347-835b-0ab4c81b01f5")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ArchivedElementVersionDep();
            }

        }

        @objid ("ca7a2736-8b29-4dfc-8232-5be80f7ed531")
        public static class ArchivedElementVersionSmDependency extends SmMultipleDependency {
            @objid ("6757008e-8b27-4ae7-ae87-e9de88f9cd74")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mArchivedElementVersion != null)? ((GenericAnalystElementData)data).mArchivedElementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("09346765-ddad-4bf5-9ddc-20ba047eeba2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mArchivedElementVersion = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mArchivedElementVersion;
            }

            @objid ("8a386735-ef0f-48be-83dd-d5bae9699dfc")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.LastElementVersionDep();
            }

        }

    }

}
