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
@SmaMetaClass(mmClass=Term.class, factory=TermData.Metadata.ObjectFactory.class, cmsnode=true)
public class TermData extends AnalystElementData {
    @objid ("7776e013-1d99-4214-a741-babee0996237")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("24f50dbb-c0d7-4b7f-b00b-631ef9f2e6b6")
    @SmaMetaAssociation(metaName="ArchivedTermVersion", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.ArchivedTermVersionSmDependency.class, component = true)
     List<SmObjectImpl> mArchivedTermVersion = null;

    @objid ("0a407026-0ded-49c8-b14a-219ef980854d")
    @SmaMetaAssociation(metaName="LastTermVersion", typeDataClass=TermData.class, min=0, max=1, smAssociationClass=Metadata.LastTermVersionSmDependency.class)
     SmObjectImpl mLastTermVersion;

    @objid ("2854f467-bb2b-40b4-965c-99831cd2a4f9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078ee66-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7cb846f2-0816-4f1a-aa1b-a1b3615869e6")
        private static SmClass smClass = null;

        @objid ("b146e80c-d754-45bb-ae88-a4e7b4cc8df2")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("ac37c812-014b-4699-b8b2-29a93ac88eca")
        private static SmDependency ArchivedTermVersionDep = null;

        @objid ("091a2ac8-59f3-4e00-a43e-9515dda21839")
        private static SmDependency LastTermVersionDep = null;

        @objid ("9451be15-6824-4a6e-8224-c5776bcd773c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TermData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f90631bf-6d6e-4206-a726-471fc390ff5a")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("abcf20b1-ac4d-4a6a-b66a-ab9c4d3b4423")
        public static SmDependency ArchivedTermVersionDep() {
            if (ArchivedTermVersionDep == null) {
            	ArchivedTermVersionDep = classof().getDependencyDef("ArchivedTermVersion");
            }
            return ArchivedTermVersionDep;
        }

        @objid ("0743ee6f-64a0-4ea4-9762-a864024915d4")
        public static SmDependency LastTermVersionDep() {
            if (LastTermVersionDep == null) {
            	LastTermVersionDep = classof().getDependencyDef("LastTermVersion");
            }
            return LastTermVersionDep;
        }

        @objid ("72dfefbf-a774-4da0-918a-2fdbd1533424")
        public static SmDependency getLastTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LastTermVersionDep;
        }

        @objid ("ed2d9e87-5635-439d-ae4a-806f29308177")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1df369e3-234a-4891-ad59-3cbfbb732163")
        public static SmDependency getArchivedTermVersionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArchivedTermVersionDep;
        }

        @objid ("48e69cd1-78b8-497d-af92-c8def5cc7321")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("00792ef8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("52913e71-2f58-474e-bd5e-73bd2018490d")
            public ISmObjectData createData() {
                return new TermData();
            }

            @objid ("c4d931c5-46c5-4eb1-8b55-822a8b660331")
            public SmObjectImpl createImpl() {
                return new TermImpl();
            }

        }

        @objid ("18a5e5d5-88af-42b2-bba3-87f60b5b8886")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("912ef1c9-ec41-4b7e-a07d-47d5e7d0d8eb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mOwnerDictionary;
            }

            @objid ("55f24b64-a305-4036-85ad-37e412b90bee")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mOwnerDictionary = value;
            }

            @objid ("519f39cf-d5a9-46cc-814a-9fd66150a71c")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedTermDep();
            }

        }

        @objid ("f2695892-cb3d-40cb-941f-6cde079025c0")
        public static class ArchivedTermVersionSmDependency extends SmMultipleDependency {
            @objid ("f2e3d559-7823-4192-9c1b-a3c57908aecf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TermData)data).mArchivedTermVersion != null)? ((TermData)data).mArchivedTermVersion:SmMultipleDependency.EMPTY;
            }

            @objid ("a0477beb-7c2f-4644-865f-eba36a4ea673")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TermData) data).mArchivedTermVersion = new ArrayList<>(initialCapacity);
                return ((TermData) data).mArchivedTermVersion;
            }

            @objid ("98f0219e-b1c8-4c7c-b070-52d392f07108")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.LastTermVersionDep();
            }

        }

        @objid ("9c016646-3a75-447e-b074-7a3517958d82")
        public static class LastTermVersionSmDependency extends SmSingleDependency {
            @objid ("a9327610-031a-4a29-9ebc-256d4f673c33")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TermData) data).mLastTermVersion;
            }

            @objid ("715b1eec-364f-4545-bcaf-87a736a0215a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TermData) data).mLastTermVersion = value;
            }

            @objid ("195441bf-4d56-4f21-8225-55abfee4291a")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.ArchivedTermVersionDep();
            }

        }

    }

}
