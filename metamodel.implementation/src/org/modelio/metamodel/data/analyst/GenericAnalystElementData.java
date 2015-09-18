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
@SmaMetaClass(mmClass=GenericAnalystElement.class, factory=GenericAnalystElementData.Metadata.ObjectFactory.class, cmsnode=true)
public class GenericAnalystElementData extends AnalystElementData {
    @objid ("1160fee1-4fab-4338-8944-0052e9cc0741")
    @SmaMetaAssociation(metaName="SubElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.SubElementSmDependency.class, component = true)
     List<SmObjectImpl> mSubElement = null;

    @objid ("8c35aa9e-eac8-4d5a-a8bc-0120a769567c")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("1b308138-eaa1-4efc-8cc6-56994f51aeef")
    @SmaMetaAssociation(metaName="ParentElement", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.ParentElementSmDependency.class)
     SmObjectImpl mParentElement;

    @objid ("de97e156-2f20-4001-bc44-4d4457ce13c4")
    @SmaMetaAssociation(metaName="LastElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=1, smAssociationClass=Metadata.LastElementVersionSmDependency.class)
     SmObjectImpl mLastElementVersion;

    @objid ("d9c81030-11f6-4109-b5be-7ef9cf8c2954")
    @SmaMetaAssociation(metaName="ArchivedElementVersion", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedElementVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedElementVersion = null;

    @objid ("d8aa5836-c356-4acb-b4cc-9ddff0c62c3b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("d5741ea9-0633-4aae-88e4-b33548a7bdb5")
    public static class Metadata {
        @objid ("fad5ad61-ed6c-456d-af42-938856176a77")
        private static SmClass smClass = null;

        @objid ("5533dda8-2464-492c-9f3a-a5cb3851d585")
        private static SmDependency SubElementDep = null;

        @objid ("29dfb26e-c349-4512-9df0-5cea8737fb1b")
        private static SmDependency OwnerContainerDep = null;

        @objid ("f0b7c82c-6996-4e3d-81a2-ec73c11b57d2")
        private static SmDependency ParentElementDep = null;

        @objid ("c788ad55-cbdf-42a5-83e6-de8047f4e579")
        private static SmDependency LastElementVersionDep = null;

        @objid ("205accca-c125-4fd6-8f20-dc168f3914ab")
        private static SmDependency ArchivedElementVersionDep = null;

        @objid ("ee2e982c-99b8-4a72-9363-3da58c282967")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d585f9b-88e4-4590-8221-2ea3ac618bb4")
        public static SmDependency SubElementDep() {
            if (SubElementDep == null) {
            	SubElementDep = classof().getDependencyDef("SubElement");
            }
            return SubElementDep;
        }

        @objid ("7ff85762-fce8-4e41-b66a-6446314380b8")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("7276afe6-4881-4b81-ae56-1ed09c5c54f6")
        public static SmDependency ParentElementDep() {
            if (ParentElementDep == null) {
            	ParentElementDep = classof().getDependencyDef("ParentElement");
            }
            return ParentElementDep;
        }

        @objid ("2728492b-edf5-449e-bfbf-a5834fddc6ad")
        public static SmDependency LastElementVersionDep() {
            if (LastElementVersionDep == null) {
            	LastElementVersionDep = classof().getDependencyDef("LastElementVersion");
            }
            return LastElementVersionDep;
        }

        @objid ("a9730561-ba4b-498e-bb53-4a164484d70f")
        public static SmDependency ArchivedElementVersionDep() {
            if (ArchivedElementVersionDep == null) {
            	ArchivedElementVersionDep = classof().getDependencyDef("ArchivedElementVersion");
            }
            return ArchivedElementVersionDep;
        }

        @objid ("ef38d844-3702-4a91-b039-c03c843a53c3")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("8c3bb78d-2bb8-43aa-b8fb-85b7a773c08b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e8ebfe24-4645-4757-8988-4df1cd5b8071")
        public static SmDependency getArchivedElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedElementVersionDep;
        }

        @objid ("e70e1a3c-f7ad-4bf3-81b3-3755f166fb2f")
        public static SmDependency getLastElementVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastElementVersionDep;
        }

        @objid ("40bc3482-d861-4487-87dd-7a5e185608c5")
        public static SmDependency getParentElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentElementDep;
        }

        @objid ("fc34ce5e-ab0a-4d0a-a9a6-bf6254820e8c")
        public static SmDependency getSubElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubElementDep;
        }

        @objid ("cc1ce53d-0f1b-43c2-9c59-dcd9e04d69c7")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("55775321-8a3f-4b3d-95da-5cc163af5677")
            public ISmObjectData createData() {
                return new GenericAnalystElementData();
            }

            @objid ("cfff98f1-32a7-428f-a32a-b3dcf5e0e36c")
            public SmObjectImpl createImpl() {
                return new GenericAnalystElementImpl();
            }

        }

        @objid ("cea8b035-ed3b-494e-a32d-368ef075b1db")
        public static class SubElementSmDependency extends SmMultipleDependency {
            @objid ("9bcf364d-97ec-4160-b03b-68f7bd656534")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mSubElement != null)? ((GenericAnalystElementData)data).mSubElement:SmMultipleDependency.EMPTY;
            }

            @objid ("c312f109-3625-4bce-832b-06b4bc28289e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mSubElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mSubElement;
            }

            @objid ("6b9a2b9d-03d4-4633-9f37-038d6148a32b")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ParentElementDep();
            }

        }

        @objid ("8e30e4ba-172d-4cea-8352-de8b6d58661c")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("4b2648ce-1f44-4026-b43e-6536b304cd64")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mOwnerContainer;
            }

            @objid ("4508db95-5f70-4433-b964-c4ed24cdfdd7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mOwnerContainer = value;
            }

            @objid ("48edae69-b57f-490a-b6e0-17a9fbaa8a23")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedElementDep();
            }

        }

        @objid ("736a5f2b-71ab-4258-8737-9d9e5687c9d1")
        public static class ParentElementSmDependency extends SmSingleDependency {
            @objid ("b4646794-c5aa-4754-be05-9e951e763281")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mParentElement;
            }

            @objid ("44372b76-e841-4d8e-86eb-642476fabed2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mParentElement = value;
            }

            @objid ("5799f11c-c75f-4923-bba2-ac0ddb89f668")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.SubElementDep();
            }

        }

        @objid ("1e706646-429b-4798-8d27-7429d6326ca3")
        public static class LastElementVersionSmDependency extends SmSingleDependency {
            @objid ("f065414b-a35a-4ac4-b8f2-99405473171a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystElementData) data).mLastElementVersion;
            }

            @objid ("ec3c5f59-96b0-4edb-aec0-b5f9096530f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystElementData) data).mLastElementVersion = value;
            }

            @objid ("c86a2cb9-25ad-4ffe-b1a4-03257b4b3841")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.ArchivedElementVersionDep();
            }

        }

        @objid ("ca7a2736-8b29-4dfc-8232-5be80f7ed531")
        public static class ArchivedElementVersionSmDependency extends SmMultipleDependency {
            @objid ("544331dd-6bd4-4692-849e-5ce3e47c80f7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystElementData)data).mArchivedElementVersion != null)? ((GenericAnalystElementData)data).mArchivedElementVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("fcebf045-fd17-49f3-a2fe-4fac3d275675")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystElementData) data).mArchivedElementVersion = new ArrayList<>(initialCapacity);
                return ((GenericAnalystElementData) data).mArchivedElementVersion;
            }

            @objid ("b6f499af-53fb-4662-a24a-88cb2b8d2317")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.LastElementVersionDep();
            }

        }

    }

}
