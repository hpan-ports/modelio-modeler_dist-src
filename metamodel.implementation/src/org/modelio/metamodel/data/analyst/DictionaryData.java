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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.TermData;
import org.modelio.metamodel.impl.analyst.DictionaryImpl;
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

@objid ("005be7bc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Dictionary.class, factory=DictionaryData.Metadata.ObjectFactory.class, cmsnode=true)
public class DictionaryData extends AnalystContainerData {
    @objid ("751cf6b0-c5f1-4134-afef-9e4a9a510b59")
    @SmaMetaAssociation(metaName="OwnedDictionary", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDictionarySmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDictionary = null;

    @objid ("d57d743d-0d7a-49d4-9d0b-9b4651683eed")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("e9f49a63-982a-4015-8e9e-f896421a7142")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("6e372440-20ea-4a7f-b82a-2e5c93f6fd15")
    @SmaMetaAssociation(metaName="OwnedTerm", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedTermSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedTerm = null;

    @objid ("f0e0d45c-236c-42b3-8d62-6533761e6a2d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0081b7f8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("04657621-6ad7-43b0-afe6-1d3ec34a4a61")
        private static SmClass smClass = null;

        @objid ("1a4150e8-1e21-4c21-9d3d-afd927c3653f")
        private static SmDependency OwnedDictionaryDep = null;

        @objid ("bf8fba28-3894-4e41-af70-4130fcc246d9")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("1a3225ee-2d45-4cbd-a56b-34797fe34f93")
        private static SmDependency OwnerProjectDep = null;

        @objid ("a6d3cfc0-a455-4347-94ea-d74e78e6c537")
        private static SmDependency OwnedTermDep = null;

        @objid ("ae3ee875-bd86-4445-bd2d-9e52f557ad6d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DictionaryData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fa930bbe-5632-4a2c-9074-2c2f36d1c9da")
        public static SmDependency OwnedDictionaryDep() {
            if (OwnedDictionaryDep == null) {
            	OwnedDictionaryDep = classof().getDependencyDef("OwnedDictionary");
            }
            return OwnedDictionaryDep;
        }

        @objid ("80afbc40-68e3-4d5b-8330-f6d01e3adb81")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("d931b50a-362d-4bab-a128-4e485e17b289")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("87c5ff6c-d414-49ed-8a6f-90f422464f87")
        public static SmDependency OwnedTermDep() {
            if (OwnedTermDep == null) {
            	OwnedTermDep = classof().getDependencyDef("OwnedTerm");
            }
            return OwnedTermDep;
        }

        @objid ("11a51882-9389-49a6-a071-6c5bb6b99999")
        public static SmDependency getOwnedDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDictionaryDep;
        }

        @objid ("3defdf47-5e91-4d44-bfcd-cbefb6f2ba1b")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("d3853013-bf26-4d4c-8a0b-8e9a2633f298")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a48747d3-00a6-40c5-a205-f7b955128498")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("2da62988-74c2-43f4-b27b-1366ab48641a")
        public static SmDependency getOwnedTermDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedTermDep;
        }

        @objid ("0081f84e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0c42cf7d-f656-4fbf-8e98-052151dabe94")
            public ISmObjectData createData() {
                return new DictionaryData();
            }

            @objid ("5c78c968-59cf-4250-a45d-90c4fe5e6335")
            public SmObjectImpl createImpl() {
                return new DictionaryImpl();
            }

        }

        @objid ("08c7dafc-6d39-439b-ad42-f68c1a95b402")
        public static class OwnedDictionarySmDependency extends SmMultipleDependency {
            @objid ("cee4eee9-3a49-494f-b767-b448fed8d0b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedDictionary != null)? ((DictionaryData)data).mOwnedDictionary:SmMultipleDependency.EMPTY;
            }

            @objid ("b6b11267-beb9-49d9-86e8-f53763c0b170")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedDictionary = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedDictionary;
            }

            @objid ("87b523bd-2b40-4a24-8ed7-b18282e3ae9f")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("a1fb7aa6-9ccc-4afb-a391-41088931d3bb")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("78adddb9-f48c-4c01-9ebf-c47fd1d61246")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerDictionary;
            }

            @objid ("36440563-7486-452f-88a9-0aabddc9b410")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerDictionary = value;
            }

            @objid ("062d3cbe-9fcf-42d0-b082-84c73eb98892")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedDictionaryDep();
            }

        }

        @objid ("d76aebd1-35ee-4bd6-b519-b941b14b33b5")
        public static class OwnedTermSmDependency extends SmMultipleDependency {
            @objid ("0135c8e4-5c54-4c97-b726-93148035b7d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedTerm != null)? ((DictionaryData)data).mOwnedTerm:SmMultipleDependency.EMPTY;
            }

            @objid ("1a44d501-cc74-4a6d-90f2-255b86310470")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedTerm = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedTerm;
            }

            @objid ("7f939f0c-b2b5-415e-9e30-43dd4f60466b")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("be55b810-47b3-4534-b494-ef9bca486e4d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("caf5dff1-bce8-4970-94fd-2f479f624900")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerProject;
            }

            @objid ("612e8047-dfdc-42e4-ac5c-1cd242fa127f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerProject = value;
            }

            @objid ("baf050ef-85ca-4b94-9246-7ae116a13b17")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.DictionaryRootDep();
            }

        }

    }

}
