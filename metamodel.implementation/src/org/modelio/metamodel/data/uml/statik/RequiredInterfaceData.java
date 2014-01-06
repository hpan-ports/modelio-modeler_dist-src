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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.data.uml.statik.PortData;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceImpl;
import org.modelio.metamodel.uml.statik.RequiredInterface;
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

@objid ("001be5d6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=RequiredInterface.class, factory=RequiredInterfaceData.Metadata.ObjectFactory.class)
public class RequiredInterfaceData extends ModelElementData {
    @objid ("4c3bfb52-0a13-4950-8a1b-25c5b50c3529")
    @SmaMetaAssociation(metaName="RequiredElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredElementSmDependency.class, partof = true)
     List<SmObjectImpl> mRequiredElement = null;

    @objid ("21e0d376-c984-4bf5-af66-7e79636325f8")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mProvider = null;

    @objid ("7c88ea97-9489-4f6b-9602-799b00e93beb")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.RequiringSmDependency.class)
     SmObjectImpl mRequiring;

    @objid ("ee0f3c4f-3a66-4a19-8292-475c251b29ab")
    @SmaMetaAssociation(metaName="NaryProvider", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryProvider = null;

    @objid ("640d3907-f82a-44c0-99e2-c58934be65d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009297a8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("de2ab766-c081-42d3-874b-8dae409739a1")
        private static SmClass smClass = null;

        @objid ("4b1d4692-2484-4e35-9bcf-72f18f391259")
        private static SmDependency RequiredElementDep = null;

        @objid ("fd18be4f-88c6-4cc7-a1a5-b7d3516c1b23")
        private static SmDependency ProviderDep = null;

        @objid ("6b864371-b7e2-48f4-8ce0-cbdfef1193ef")
        private static SmDependency RequiringDep = null;

        @objid ("4d6da144-e442-4024-a207-339179a577d5")
        private static SmDependency NaryProviderDep = null;

        @objid ("1029d166-df4a-495d-abde-53d4b68251ee")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequiredInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("72542449-d9c6-4a04-8e3c-90314425115e")
        public static SmDependency RequiredElementDep() {
            if (RequiredElementDep == null) {
            	RequiredElementDep = classof().getDependencyDef("RequiredElement");
            }
            return RequiredElementDep;
        }

        @objid ("cf0beb13-03a8-4340-bbe7-e80e3d3f8ff8")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("46adbdc0-b69b-461f-9e26-4ddf2dce4b50")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("a620b060-683f-432a-91d5-c7748c45ad72")
        public static SmDependency NaryProviderDep() {
            if (NaryProviderDep == null) {
            	NaryProviderDep = classof().getDependencyDef("NaryProvider");
            }
            return NaryProviderDep;
        }

        @objid ("20cfe89f-73fc-485c-b086-04e2e5e54ee8")
        public static SmDependency getNaryProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryProviderDep;
        }

        @objid ("48519edd-8867-4cb0-a751-3cba444ba369")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("213fc524-5ae1-4ce5-ae11-8fbf2c9bb8de")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("c9e69253-0247-497b-b149-2eaf78857b86")
        public static SmDependency getRequiredElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredElementDep;
        }

        @objid ("a2778781-7297-454b-a94a-e956149e27d4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0092e532-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("52a0712d-3010-42d4-84d5-f5f11994f0f6")
            public ISmObjectData createData() {
                return new RequiredInterfaceData();
            }

            @objid ("fec3759e-2e83-4d63-bd23-706602094919")
            public SmObjectImpl createImpl() {
                return new RequiredInterfaceImpl();
            }

        }

        @objid ("00935a6c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredElementSmDependency extends SmMultipleDependency {
            @objid ("6ddf33af-0d3b-427c-b9d7-b6fe8143dad4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mRequiredElement != null)? ((RequiredInterfaceData)data).mRequiredElement:SmMultipleDependency.EMPTY;
            }

            @objid ("dadb8d8c-09d7-40b9-ab67-932a36edd0a4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mRequiredElement = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mRequiredElement;
            }

            @objid ("a45be708-d711-4f54-84f2-a4b141c707fe")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("0093c97a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmMultipleDependency {
            @objid ("b9090f94-8a7d-4d72-b549-f5bf311056e2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mProvider != null)? ((RequiredInterfaceData)data).mProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("fe7da0e7-7d45-4baf-82e6-4b1658d73be9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mProvider;
            }

            @objid ("b5e2fa8c-262f-408d-b5ad-6b48d9033b4d")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ConsumerDep();
            }

        }

        @objid ("00943b8a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmSingleDependency {
            @objid ("6d2362af-f5bb-4191-be8f-a737c85883f8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequiredInterfaceData) data).mRequiring;
            }

            @objid ("cc283585-526c-452b-b5e7-e2f83224c3d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequiredInterfaceData) data).mRequiring = value;
            }

            @objid ("67c40c53-8132-4dd3-812f-1a910e52de5b")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.RequiredDep();
            }

        }

        @objid ("006a9a14-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryProviderSmDependency extends SmMultipleDependency {
            @objid ("fd61dd5a-ce58-4b98-8021-8b036a213276")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mNaryProvider != null)? ((RequiredInterfaceData)data).mNaryProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("2068a381-cc3a-49fd-aea6-ab3e22b8173b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mNaryProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mNaryProvider;
            }

            @objid ("94049606-a979-40c1-86ab-252b53ad3178")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ConsumerDep();
            }

        }

    }

}
