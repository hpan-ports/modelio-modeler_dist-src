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
    @objid ("1221beeb-138c-46a6-a425-69c541089f75")
    @SmaMetaAssociation(metaName="RequiredElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredElementSmDependency.class, partof = true)
     List<SmObjectImpl> mRequiredElement = null;

    @objid ("38eebbf4-0700-473a-8503-fac615736cb2")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mProvider = null;

    @objid ("426aef50-e588-497e-955a-2dcf8c75bda4")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.RequiringSmDependency.class)
     SmObjectImpl mRequiring;

    @objid ("40b184e2-db93-4b8d-85b2-90961a5f5c5e")
    @SmaMetaAssociation(metaName="NaryProvider", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryProvider = null;

    @objid ("6e9b7228-0fe6-4d3f-9136-51bc7830c8d5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009297a8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1c6c2288-5788-45b0-ba2b-7fe6a7cd40c1")
        private static SmClass smClass = null;

        @objid ("c5ed6a3f-8c67-4ff0-b7ca-2ab1b0bda584")
        private static SmDependency RequiredElementDep = null;

        @objid ("fa9acf6b-9bd6-416e-919c-34ec3b1ec40c")
        private static SmDependency ProviderDep = null;

        @objid ("ee7cf98e-3d90-4ee1-82f7-00c31d9a70f4")
        private static SmDependency RequiringDep = null;

        @objid ("ba12654b-d384-4d15-9ed0-d21f9cb54a02")
        private static SmDependency NaryProviderDep = null;

        @objid ("07f59cc1-f8d2-46bb-8df9-4b9f3e024408")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequiredInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c131f587-6525-44f1-bbed-578f29f2c62b")
        public static SmDependency RequiredElementDep() {
            if (RequiredElementDep == null) {
            	RequiredElementDep = classof().getDependencyDef("RequiredElement");
            }
            return RequiredElementDep;
        }

        @objid ("02644c0a-4fa6-45f6-8837-57cbdb085e85")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("a2652ff4-d809-464f-9e82-208269df01e3")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("f8bdded4-59bf-44bc-a6f4-291fd4889673")
        public static SmDependency NaryProviderDep() {
            if (NaryProviderDep == null) {
            	NaryProviderDep = classof().getDependencyDef("NaryProvider");
            }
            return NaryProviderDep;
        }

        @objid ("a288d12a-e8d6-431e-8ebe-326077b60a9b")
        public static SmDependency getRequiredElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredElementDep;
        }

        @objid ("b814963c-abc2-4abb-9357-776ff5287d78")
        public static SmDependency getNaryProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryProviderDep;
        }

        @objid ("272a3a04-09a9-4daf-9265-718a9f9de987")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("f49b0d22-e069-42c7-9d08-cd71033e556d")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("dad9ae80-b5a8-4d81-8229-b12cb91cb28d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0092e532-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("37490b18-22f9-4cd1-bd36-69aab2c59094")
            public ISmObjectData createData() {
                return new RequiredInterfaceData();
            }

            @objid ("3dfeaccb-f59f-43be-b8cf-7b68b8687a78")
            public SmObjectImpl createImpl() {
                return new RequiredInterfaceImpl();
            }

        }

        @objid ("00935a6c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredElementSmDependency extends SmMultipleDependency {
            @objid ("b6cb966a-bda1-45f5-85af-54aceada04d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mRequiredElement != null)? ((RequiredInterfaceData)data).mRequiredElement:SmMultipleDependency.EMPTY;
            }

            @objid ("f0ee828a-fb04-48ac-b2d1-16172dcacb00")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mRequiredElement = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mRequiredElement;
            }

            @objid ("4e0d41a6-4671-4412-b528-02eced5fe1de")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("0093c97a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmMultipleDependency {
            @objid ("7fa43eba-a88d-4557-af82-824fdaaef7a3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mProvider != null)? ((RequiredInterfaceData)data).mProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("42c9f3e5-30e8-4679-b065-aad8d66dedf9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mProvider;
            }

            @objid ("a86bc2c6-3e5f-4f1c-bb44-983eb88230b2")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ConsumerDep();
            }

        }

        @objid ("00943b8a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmSingleDependency {
            @objid ("66321faf-3d0a-4233-9a56-4ca68e16f7a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequiredInterfaceData) data).mRequiring;
            }

            @objid ("f3a509e5-a355-4d33-bae7-52d010e4b117")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequiredInterfaceData) data).mRequiring = value;
            }

            @objid ("4a3f9dde-41bc-4def-bddc-0e2653559bd7")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.RequiredDep();
            }

        }

        @objid ("006a9a14-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryProviderSmDependency extends SmMultipleDependency {
            @objid ("ed985f80-2c33-419c-8a15-26d2c8e66069")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mNaryProvider != null)? ((RequiredInterfaceData)data).mNaryProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("e397a2d3-a045-4e61-a2bc-abe63640a9fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mNaryProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mNaryProvider;
            }

            @objid ("df76e2c7-cc9e-42fd-871c-2fe1feb5894f")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ConsumerDep();
            }

        }

    }

}
