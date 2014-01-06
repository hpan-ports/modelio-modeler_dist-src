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
    @objid ("d485f607-2731-459d-bc23-4891ed5ad329")
    @SmaMetaAssociation(metaName="OwnedDictionary", typeDataClass=DictionaryData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedDictionarySmDependency.class, component = true)
     List<SmObjectImpl> mOwnedDictionary = null;

    @objid ("bafa0dbe-4955-4274-a949-68444dde7b59")
    @SmaMetaAssociation(metaName="OwnerDictionary", typeDataClass=DictionaryData.class, min=0, max=1, smAssociationClass=Metadata.OwnerDictionarySmDependency.class)
     SmObjectImpl mOwnerDictionary;

    @objid ("38aed818-eec9-4f0b-afd6-ae9cda52c09f")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("97f58cbb-1cfc-444a-9072-30dc56f372ba")
    @SmaMetaAssociation(metaName="OwnedTerm", typeDataClass=TermData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedTermSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedTerm = null;

    @objid ("be54d9bf-f429-4dbf-9d11-73c239327cd3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0081b7f8-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0770505b-0a1f-476e-a138-470275153ac1")
        private static SmClass smClass = null;

        @objid ("6a91b3ba-66ce-439c-a60b-3dca0807dcd2")
        private static SmDependency OwnedDictionaryDep = null;

        @objid ("28c0a193-551b-4077-a6f5-321caf17ba87")
        private static SmDependency OwnerDictionaryDep = null;

        @objid ("5f5cd530-9c83-4555-a668-7a72399d93bc")
        private static SmDependency OwnerProjectDep = null;

        @objid ("0dc080fe-0780-425a-8c5f-0ef62e5b2829")
        private static SmDependency OwnedTermDep = null;

        @objid ("117f6b84-364c-42ea-8ace-d60cfa7ea8f7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(DictionaryData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d869f26f-5afc-4b00-8636-cd3be5793fd2")
        public static SmDependency OwnedDictionaryDep() {
            if (OwnedDictionaryDep == null) {
            	OwnedDictionaryDep = classof().getDependencyDef("OwnedDictionary");
            }
            return OwnedDictionaryDep;
        }

        @objid ("413366b9-d584-4fc1-97b3-423b8542fd86")
        public static SmDependency OwnerDictionaryDep() {
            if (OwnerDictionaryDep == null) {
            	OwnerDictionaryDep = classof().getDependencyDef("OwnerDictionary");
            }
            return OwnerDictionaryDep;
        }

        @objid ("1dbecc85-ca13-492d-b7d0-08fee8acb47a")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("da6a12fe-9403-46c5-955d-c5d17e81f5ca")
        public static SmDependency OwnedTermDep() {
            if (OwnedTermDep == null) {
            	OwnedTermDep = classof().getDependencyDef("OwnedTerm");
            }
            return OwnedTermDep;
        }

        @objid ("33c929ec-c507-4d95-b597-8b3a9872ccde")
        public static SmDependency getOwnedTermDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedTermDep;
        }

        @objid ("4e4fcf6b-b2cc-42d1-b16d-eec25ba97820")
        public static SmDependency getOwnedDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedDictionaryDep;
        }

        @objid ("d77e864e-d607-4b5b-b818-fada3f13c38d")
        public static SmDependency getOwnerDictionaryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDictionaryDep;
        }

        @objid ("e34ee698-4f69-414c-a88b-ba8db5593cb4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("56d28fd8-aaac-45f4-9313-9a582d588917")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("0081f84e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d2135b7b-6a3d-4d57-9cf8-883948f1ad00")
            public ISmObjectData createData() {
                return new DictionaryData();
            }

            @objid ("72980eee-9545-497a-973d-c83e67cc9040")
            public SmObjectImpl createImpl() {
                return new DictionaryImpl();
            }

        }

        @objid ("08c7dafc-6d39-439b-ad42-f68c1a95b402")
        public static class OwnedDictionarySmDependency extends SmMultipleDependency {
            @objid ("6828ee77-be02-4292-90f3-aec86c6ae81b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedDictionary != null)? ((DictionaryData)data).mOwnedDictionary:SmMultipleDependency.EMPTY;
            }

            @objid ("1a621d8f-0d52-46bb-b693-ff743dab4cc5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedDictionary = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedDictionary;
            }

            @objid ("76abd7ae-0c33-441e-93e6-7a7e08fe79aa")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("a1fb7aa6-9ccc-4afb-a391-41088931d3bb")
        public static class OwnerDictionarySmDependency extends SmSingleDependency {
            @objid ("64d2f3cb-9cff-4f91-a7be-5ac6697f49d8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerDictionary;
            }

            @objid ("57efe2eb-ed61-4a99-84f9-b7c43372a2fb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerDictionary = value;
            }

            @objid ("539b0821-4cef-437f-befb-f7d2aa754ae1")
            @Override
            public SmDependency getSymetric() {
                return DictionaryData.Metadata.OwnedDictionaryDep();
            }

        }

        @objid ("d76aebd1-35ee-4bd6-b519-b941b14b33b5")
        public static class OwnedTermSmDependency extends SmMultipleDependency {
            @objid ("c701177f-ec62-4ce5-a48a-d05f9cf5fdea")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((DictionaryData)data).mOwnedTerm != null)? ((DictionaryData)data).mOwnedTerm:SmMultipleDependency.EMPTY;
            }

            @objid ("6432cedd-8607-478f-96c2-9f448135937b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((DictionaryData) data).mOwnedTerm = new ArrayList<>(initialCapacity);
                return ((DictionaryData) data).mOwnedTerm;
            }

            @objid ("3a15f3de-00d1-43e3-9c4d-223691e6778c")
            @Override
            public SmDependency getSymetric() {
                return TermData.Metadata.OwnerDictionaryDep();
            }

        }

        @objid ("be55b810-47b3-4534-b494-ef9bca486e4d")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("63318aa7-9ffc-4d44-b4f0-92941ea71ad3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((DictionaryData) data).mOwnerProject;
            }

            @objid ("e0bb8a6c-0936-4c66-82e8-69e68881dfa7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((DictionaryData) data).mOwnerProject = value;
            }

            @objid ("945fa55f-a189-4d28-8e1e-588029b9fd9d")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.DictionaryRootDep();
            }

        }

    }

}
