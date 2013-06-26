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
import org.modelio.metamodel.data.uml.statik.ClassAssociationData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationEndData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.statik.NaryAssociationImpl;
import org.modelio.metamodel.uml.statik.NaryAssociation;
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

@objid ("0021f11a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NaryAssociation.class, factory=NaryAssociationData.Metadata.ObjectFactory.class)
public class NaryAssociationData extends ModelElementData {
    @objid ("edab7666-74a2-4450-86dd-28896b9b0f4b")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("2fade280-ddc4-4432-8e4c-733ef9b0213d")
    @SmaMetaAssociation(metaName="NaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryEnd = null;

    @objid ("a3fad3f1-fb62-4044-8312-7a45bf245f89")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("a21be3d8-4b92-4d2b-96c2-bc5046057392")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd1f6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b2ec663f-5e31-4840-8f2f-1cf3574b4eb2")
        private static SmClass smClass = null;

        @objid ("6acaed0d-41e8-4542-a360-74f982633d50")
        private static SmDependency OccurenceDep = null;

        @objid ("da6a170c-b5b1-4ac7-ba2d-eed3969e69c8")
        private static SmDependency NaryEndDep = null;

        @objid ("24643087-c647-4b47-81c5-108a70ea5e30")
        private static SmDependency LinkToClassDep = null;

        @objid ("0191d8b5-dbc5-41e6-9517-ad3ade270fdb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7fea2fcf-9957-4ec4-a656-7fe588c49e53")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("bf0e335c-8b4d-433b-b7c9-9e535cf8e5a8")
        public static SmDependency NaryEndDep() {
            if (NaryEndDep == null) {
            	NaryEndDep = classof().getDependencyDef("NaryEnd");
            }
            return NaryEndDep;
        }

        @objid ("4cca3394-71ed-405b-bb0c-50755c45aa58")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("c05cd285-6912-4532-9a06-25baf3c156a8")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("085208e2-89a9-41ad-a627-df3268ae6b57")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d9c0ad69-0661-4df6-b01c-54b858307677")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("73541e85-b34b-452f-8892-65f9eef7d447")
        public static SmDependency getNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryEndDep;
        }

        @objid ("003d185a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2b0e3f0c-292f-4213-961e-e20c6df4fd3f")
            public ISmObjectData createData() {
                return new NaryAssociationData();
            }

            @objid ("3e422e6d-9c85-4d28-b0cd-9576b94181eb")
            public SmObjectImpl createImpl() {
                return new NaryAssociationImpl();
            }

        }

        @objid ("003d7c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryEndSmDependency extends SmMultipleDependency {
            @objid ("30edb75c-6387-4bf9-bcaa-462606b6ce18")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mNaryEnd != null)? ((NaryAssociationData)data).mNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("cb86bc87-6359-4ce1-a5e2-581877689361")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mNaryEnd = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mNaryEnd;
            }

            @objid ("08547f49-b49f-4c05-bfcd-07be5aea259a")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.NaryAssociationDep();
            }

        }

        @objid ("003dde2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("aa272b7a-ff32-43c5-8d79-3665a464d0b0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mOccurence != null)? ((NaryAssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("835d50f6-81c0-49ec-97be-083a914a8044")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mOccurence;
            }

            @objid ("d37fed9e-4a3b-4271-bea8-7041760387d7")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.ModelDep();
            }

        }

        @objid ("003e405e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("db5f7fe5-1f48-463b-9692-c6a52ad6ee01")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationData) data).mLinkToClass;
            }

            @objid ("9eb7b982-7da7-4a49-b9d2-1cc03d959482")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationData) data).mLinkToClass = value;
            }

            @objid ("535b629f-3b73-45d3-928a-48f657b55869")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.NaryAssociationPartDep();
            }

        }

    }

}
