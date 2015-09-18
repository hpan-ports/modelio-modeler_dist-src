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
    @objid ("64fb1cbf-2d81-43d4-8c27-a87717203356")
    @SmaMetaAssociation(metaName="RequiredElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.RequiredElementSmDependency.class, partof = true)
     List<SmObjectImpl> mRequiredElement = null;

    @objid ("432a7c37-c5cb-4bba-9a25-18e6aa0dcb02")
    @SmaMetaAssociation(metaName="Provider", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mProvider = null;

    @objid ("3ed5f87d-39fc-49f0-9832-f31b8eecfd09")
    @SmaMetaAssociation(metaName="Requiring", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.RequiringSmDependency.class)
     SmObjectImpl mRequiring;

    @objid ("2de23a74-d7ba-4d55-ada5-e939969182a8")
    @SmaMetaAssociation(metaName="NaryProvider", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryProviderSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryProvider = null;

    @objid ("3bed6dfa-ac40-4c2b-835b-4823cde55376")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009297a8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("732cfdb1-9abb-4d75-8f45-bbb9366ce1f9")
        private static SmClass smClass = null;

        @objid ("f0a78dcf-125d-4027-a86c-7e7e1ba3c155")
        private static SmDependency RequiredElementDep = null;

        @objid ("42dfb95e-0b01-406d-b017-e51cc7028906")
        private static SmDependency ProviderDep = null;

        @objid ("c09bc0b7-e264-4b93-8f72-29e48e757e52")
        private static SmDependency RequiringDep = null;

        @objid ("e9a50202-94c5-43cc-bd06-1ab6c1e80ae2")
        private static SmDependency NaryProviderDep = null;

        @objid ("cf036401-57df-4b1b-8258-f5d037db1a90")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(RequiredInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("59e52c40-e79e-409d-9a14-b8798aae880b")
        public static SmDependency RequiredElementDep() {
            if (RequiredElementDep == null) {
            	RequiredElementDep = classof().getDependencyDef("RequiredElement");
            }
            return RequiredElementDep;
        }

        @objid ("f213ce6f-fd9e-483e-84e9-763a67a3292e")
        public static SmDependency ProviderDep() {
            if (ProviderDep == null) {
            	ProviderDep = classof().getDependencyDef("Provider");
            }
            return ProviderDep;
        }

        @objid ("295c5b36-dd5e-47a7-afb1-48294cdf66c8")
        public static SmDependency RequiringDep() {
            if (RequiringDep == null) {
            	RequiringDep = classof().getDependencyDef("Requiring");
            }
            return RequiringDep;
        }

        @objid ("683a213f-3b02-4300-aa26-21c112a52d35")
        public static SmDependency NaryProviderDep() {
            if (NaryProviderDep == null) {
            	NaryProviderDep = classof().getDependencyDef("NaryProvider");
            }
            return NaryProviderDep;
        }

        @objid ("c4875019-7e23-4fd9-82a1-3e029081730e")
        public static SmDependency getProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProviderDep;
        }

        @objid ("978edc58-67ba-42f4-bb0f-a05f3a0d30eb")
        public static SmDependency getRequiringDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiringDep;
        }

        @objid ("81e967e3-4b76-42e1-b7e6-5e6e5ec2cd09")
        public static SmDependency getNaryProviderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryProviderDep;
        }

        @objid ("9b3db348-ff73-4eba-81f6-3580d03024d8")
        public static SmDependency getRequiredElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RequiredElementDep;
        }

        @objid ("adc833cc-5e24-4a75-a3c5-08f153d9a75b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0092e532-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("db59bb27-783f-418f-8660-0f0dcf051d77")
            public ISmObjectData createData() {
                return new RequiredInterfaceData();
            }

            @objid ("8660e958-fe1d-4894-8f1c-1dffbdd62e5f")
            public SmObjectImpl createImpl() {
                return new RequiredInterfaceImpl();
            }

        }

        @objid ("00935a6c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiredElementSmDependency extends SmMultipleDependency {
            @objid ("f7754938-d4d5-49b5-97a8-9195b23092e9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mRequiredElement != null)? ((RequiredInterfaceData)data).mRequiredElement:SmMultipleDependency.EMPTY;
            }

            @objid ("fdb6ba2e-06d2-42a1-b876-b0ec966d2142")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mRequiredElement = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mRequiredElement;
            }

            @objid ("de908450-a34e-4ec1-ac1e-02cf154213ea")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.RequiringDep();
            }

        }

        @objid ("0093c97a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProviderSmDependency extends SmMultipleDependency {
            @objid ("3027ef54-f822-40a2-9950-84f05f5737bf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mProvider != null)? ((RequiredInterfaceData)data).mProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("dd69de2a-bdf3-43ef-8c93-f71aea6de1fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mProvider;
            }

            @objid ("b43b5a8d-5398-4f32-bf4c-a25fda61939f")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ConsumerDep();
            }

        }

        @objid ("00943b8a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RequiringSmDependency extends SmSingleDependency {
            @objid ("fa80e8b4-e971-4bc7-ad89-6f959b784325")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((RequiredInterfaceData) data).mRequiring;
            }

            @objid ("1c5e1db1-4479-4e67-9950-3ad8a83b840e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((RequiredInterfaceData) data).mRequiring = value;
            }

            @objid ("dcad9899-c1ec-40f5-9349-747cebaafc30")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.RequiredDep();
            }

        }

        @objid ("006a9a14-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryProviderSmDependency extends SmMultipleDependency {
            @objid ("6ec3524e-7a72-4650-acdb-b2e774366868")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((RequiredInterfaceData)data).mNaryProvider != null)? ((RequiredInterfaceData)data).mNaryProvider:SmMultipleDependency.EMPTY;
            }

            @objid ("43ffe709-6bca-41c7-a60c-fd3fdf4ca1b6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((RequiredInterfaceData) data).mNaryProvider = new ArrayList<>(initialCapacity);
                return ((RequiredInterfaceData) data).mNaryProvider;
            }

            @objid ("ab7c10fd-7ab2-45ba-bcec-d718c4e2ed14")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ConsumerDep();
            }

        }

    }

}
