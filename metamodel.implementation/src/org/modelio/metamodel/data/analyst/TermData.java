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
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.data.analyst.DictionaryData;
import org.modelio.metamodel.impl.analyst.TermImpl;
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

@objid ("0062a7fa-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Term.class, factory=TermData.Metadata.ObjectFactory.class)
public class TermData extends AnalystElementData {
    @objid ("c5c1759f-894e-4238-a103-e069fbfa8ef7")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("d8418270-f31c-4b6e-bf28-b46e0862cc31")
    @SmaMetaAssociation(metaName="ArchivedTermVersion", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedTermVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedTermVersion = null;

    @objid ("b6477cac-4cce-481d-89f9-8ce12e12a938")
    @SmaMetaAssociation(metaName="LastTermVersion", typeDataClass=TermData.class, min=0, max=1, smAssociationClass=Metadata.LastTermVersionSmDependency.class)
     SmObjectImpl mLastTermVersion;

    @objid ("4d760666-40fe-4352-9f95-911766d9b21b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078ee66-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fe6d21ba-7cdd-43f5-95b9-ef54f7650ebb")
        private static SmClass smClass = null;

        @objid ("7f5d5948-fee6-4d7b-b380-55c6f11cc666")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("44234c1d-269a-43e7-8969-e1fdbb95d125")
        private static SmDependency ArchivedTermVersionDep = null;

        @objid ("cc5e0d45-1b5e-4ecd-9ca7-4083cda365b5")
        private static SmDependency LastTermVersionDep = null;

        @objid ("ea31cb0e-072d-457c-ba38-9797f89f30aa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TermData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4ae005aa-4600-4652-95e1-c843e51fdb6b")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("3392345b-8657-42cb-a408-9034b2fbda1d")
        public static SmDependency ArchivedTermVersionDep() {
            if (ArchivedTermVersionDep == null) {
            	ArchivedTermVersionDep = classof().getDependencyDef("ArchivedTermVersion");
            }
            return ArchivedTermVersionDep;
        }

        @objid ("e67e2387-85b8-4970-99dc-050f1247b868")
        public static SmDependency LastTermVersionDep() {
            if (LastTermVersionDep == null) {
            	LastTermVersionDep = classof().getDependencyDef("LastTermVersion");
            }
            return LastTermVersionDep;
        }

        @objid ("a1f53e3d-1233-41a2-b726-668b020d0020")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("558f65de-8be3-4471-8534-5991048e2328")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("456c716a-02d8-4601-b00e-4fd38ae77b85")
        public static SmDependency getLastTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastTermVersionDep;
        }

        @objid ("d5ef3244-1f36-44a7-ae76-90f83b2e465e")
        public static SmDependency getArchivedTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedTermVersionDep;
        }

        @objid ("00792ef8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4f541c65-5510-4748-88e6-bb07c30c861f")
            public ISmObjectData createData() {
                return new TermData();
            }

            @objid ("1f5b8495-2300-4937-ac0a-be38c2f2e16d")
            public SmObjectImpl createImpl() {
                return new TermImpl();
            }

        }

        @objid ("18a5e5d5-88af-42b2-bba3-87f60b5b8886")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("cfa11db3-c99d-464e-8413-9fe1cd309fb3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mOwnerDictionary;
            }

            @objid ("18b429d4-8266-4c2f-ad44-f275dca30675")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mOwnerDictionary = value;
            }

            @objid ("82a96c6c-677a-4ab3-b13a-73ffd797e702")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedTermDep();
            }

        }

        @objid ("f2695892-cb3d-40cb-941f-6cde079025c0")
        public static class ArchivedTermVersionSmDependency extends SmMultipleDependency {
            @objid ("aa974f9d-e7a8-41c1-a999-430e305bac67")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TermData)data).mArchivedTermVersion != null)? ((TermData)data).mArchivedTermVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("3fe27a06-b1e2-4c20-8645-d86244135e50")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TermData) data).mArchivedTermVersion = new ArrayList<>(initialCapacity);
                return ((TermData) data).mArchivedTermVersion;
            }

            @objid ("9dd6ef4c-cc3a-4ad9-b03b-4d62a91e95f7")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.LastTermVersionDep();
            }

        }

        @objid ("9c016646-3a75-447e-b074-7a3517958d82")
        public static class LastTermVersionSmDependency extends SmSingleDependency {
            @objid ("0481a49a-a5b9-4ddf-acee-7e30c9c952e2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mLastTermVersion;
            }

            @objid ("b5191331-f830-48d2-8796-f7bb3c3d466d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mLastTermVersion = value;
            }

            @objid ("cee4aec9-07d4-455f-a3ac-2f7e94802b46")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.ArchivedTermVersionDep();
            }

        }

    }

}
