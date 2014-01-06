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
    @objid ("5fe6a25f-6d5a-4881-bec4-3145ed78b795")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("d5a4e71e-5de8-46d0-9262-40c20272dd1c")
    @SmaMetaAssociation(metaName="NaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryEnd = null;

    @objid ("35c02de6-9733-433c-9d56-1420066c9ccc")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("f4793221-3a2b-4af0-9adb-e28d3daa2a27")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd1f6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7db4b845-e589-4d6c-827e-405715125f27")
        private static SmClass smClass = null;

        @objid ("b18d1233-d8ba-47e1-8aef-43e65c4c67ba")
        private static SmDependency OccurenceDep = null;

        @objid ("926418ba-7c6c-45c0-a6de-ce692a157bc6")
        private static SmDependency NaryEndDep = null;

        @objid ("f38e5b0b-20b0-46be-9bc1-eda7df3752e7")
        private static SmDependency LinkToClassDep = null;

        @objid ("c1fc39dd-491a-43a7-829f-c963edb32e55")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("95a93bd9-2424-4620-b4c4-7896a4d6587f")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("e0abbe83-cb5d-4076-bf51-7379eb58ad84")
        public static SmDependency NaryEndDep() {
            if (NaryEndDep == null) {
            	NaryEndDep = classof().getDependencyDef("NaryEnd");
            }
            return NaryEndDep;
        }

        @objid ("f7782199-8f8b-4b44-b599-6d93ed303b7b")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("8123a658-c1ca-498a-9b48-c0293b385295")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("46b66dbf-de81-4037-ada0-b6a5b36fa0fd")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("2b94aa9f-79f9-484c-9fa7-3ec4fcbfb0a0")
        public static SmDependency getNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryEndDep;
        }

        @objid ("d08b5044-b1eb-4350-ae4f-753a86c9656d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003d185a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7b13aa7c-d24a-4334-8a4b-dd75beac93f6")
            public ISmObjectData createData() {
                return new NaryAssociationData();
            }

            @objid ("3606ed3b-39be-472a-aa65-bbbd1e7e489d")
            public SmObjectImpl createImpl() {
                return new NaryAssociationImpl();
            }

        }

        @objid ("003d7c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryEndSmDependency extends SmMultipleDependency {
            @objid ("d5fb745e-aad5-4140-89ba-f24fd64a3d86")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mNaryEnd != null)? ((NaryAssociationData)data).mNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("b1b45b3c-5f01-4eac-bedf-f8fb2aa9f349")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mNaryEnd = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mNaryEnd;
            }

            @objid ("d4b88a85-ab56-4aff-9e60-1b56b415999d")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.NaryAssociationDep();
            }

        }

        @objid ("003dde2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("e8d422b8-8888-4ce5-9854-e39f547dbddf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mOccurence != null)? ((NaryAssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("35d25c6b-f831-478e-a403-22f0b46380d7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mOccurence;
            }

            @objid ("a32bee7b-b721-4236-b7ff-e82721a152c2")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.ModelDep();
            }

        }

        @objid ("003e405e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("108304ef-f8e8-4721-8f3c-da9faea0cbd0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationData) data).mLinkToClass;
            }

            @objid ("55e8a159-3571-47b8-8aa5-a5af1b47e821")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationData) data).mLinkToClass = value;
            }

            @objid ("a4fcee7d-f1b8-41de-b6c3-bd785871fb83")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.NaryAssociationPartDep();
            }

        }

    }

}
