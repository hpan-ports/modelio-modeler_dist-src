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
    @objid ("ae8b8179-aaea-4e6f-adee-5e13e6a694b8")
    @SmaMetaAssociation(metaName="OwnedDictionary", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDictionarySmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDictionary = null;

    @objid ("b1e96119-d1c9-49c1-82ed-2bd3952a8098")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("24ffb36b-e732-40c1-a3fd-125f77c0f165")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("e87b9d4c-e8ac-48ba-9c12-34146036b84e")
    @SmaMetaAssociation(metaName="OwnedTerm", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedTermSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedTerm = null;

    @objid ("914ce067-4502-4e40-8a60-bbaa50ad3f3f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0081b7f8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d57650c4-6ad3-476e-bfec-9f22709ec265")
        private static SmClass smClass = null;

        @objid ("33efbf0d-8c1e-4815-a175-ad87c1a24db4")
        private static SmDependency OwnedDictionaryDep = null;

        @objid ("375a6961-1c14-4ba0-ae2d-0533167cb66c")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("522cff32-23ef-484c-a306-9dfaa3ff3005")
        private static SmDependency OwnerProjectDep = null;

        @objid ("619e5183-b49b-4dd0-b9a7-34d172ade86a")
        private static SmDependency OwnedTermDep = null;

        @objid ("470bc19d-42a9-45b2-849b-e016a5ec6515")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DictionaryData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8a694935-0ce9-493f-926e-191f3dccdbcc")
        public static SmDependency OwnedDictionaryDep() {
            if (OwnedDictionaryDep == null) {
            	OwnedDictionaryDep = classof().getDependencyDef("OwnedDictionary");
            }
            return OwnedDictionaryDep;
        }

        @objid ("6d7eb6fe-d614-4984-9368-ef295acd83d9")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("b20ea60c-ceeb-4eff-a42d-1a3a37f9fe21")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("57ad26c3-992f-4c9c-9f60-3eda0e662de4")
        public static SmDependency OwnedTermDep() {
            if (OwnedTermDep == null) {
            	OwnedTermDep = classof().getDependencyDef("OwnedTerm");
            }
            return OwnedTermDep;
        }

        @objid ("1253f314-4e79-438b-a651-e9367e84770f")
        public static SmDependency getOwnedTermDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedTermDep;
        }

        @objid ("cbce9957-0280-4d5d-a19b-fbbd7f16f16d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a18fde67-8ce5-4711-adb1-399e4b51e355")
        public static SmDependency getOwnedDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDictionaryDep;
        }

        @objid ("cd4a898c-125f-4721-b515-4dd1becca53c")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("66144475-2649-42e6-a73e-57ecad65280b")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("0081f84e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3b753849-105f-4c97-93d8-56110c3cd2e1")
            public ISmObjectData createData() {
                return new DictionaryData();
            }

            @objid ("bdf6338a-1b4f-4d3d-9dd0-ea8961dcda55")
            public SmObjectImpl createImpl() {
                return new DictionaryImpl();
            }

        }

        @objid ("08c7dafc-6d39-439b-ad42-f68c1a95b402")
        public static class OwnedDictionarySmDependency extends SmMultipleDependency {
            @objid ("05abba75-34ea-45c0-a298-e3e29fa4f968")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedDictionary != null)? ((DictionaryData)data).mOwnedDictionary:SmMultipleDependency.EMPTY;
            }

            @objid ("40d6dd82-0240-4d48-809c-aa200cfc66f2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedDictionary = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedDictionary;
            }

            @objid ("a0016df4-c87b-4951-b767-f7cf6d540084")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("a1fb7aa6-9ccc-4afb-a391-41088931d3bb")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("65ce1e3a-3602-4fb1-94e0-afd2e0ff1d88")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerDictionary;
            }

            @objid ("41ea4dcd-b7f7-418e-81a6-18b9c761adb9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerDictionary = value;
            }

            @objid ("e9a64a14-4789-4f98-b35e-7baec8708447")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedDictionaryDep();
            }

        }

        @objid ("d76aebd1-35ee-4bd6-b519-b941b14b33b5")
        public static class OwnedTermSmDependency extends SmMultipleDependency {
            @objid ("0052532b-0f0f-450b-b6bf-c32df5343b83")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedTerm != null)? ((DictionaryData)data).mOwnedTerm:SmMultipleDependency.EMPTY;
            }

            @objid ("5ed0de5c-43d0-40e0-8e3c-3dc548441b2a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedTerm = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedTerm;
            }

            @objid ("8197a698-bd78-4481-8db6-2888ddbc41a0")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("be55b810-47b3-4534-b494-ef9bca486e4d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("27a8f867-0409-40bf-952a-39b2a075cf61")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerProject;
            }

            @objid ("f347ab17-9e0b-426f-a891-95009b163f81")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerProject = value;
            }

            @objid ("537bbfc6-cae7-4d3c-84c4-5159e493aaf9")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.DictionaryRootDep();
            }

        }

    }

}
