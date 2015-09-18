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
    @objid ("b9a09e21-2ad6-4bc2-8674-9f098675d54a")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("42e58a81-2bb9-499d-ba4b-e020f97fa6e0")
    @SmaMetaAssociation(metaName="NaryEnd", typeDataClass=NaryAssociationEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryEndSmDependency.class, sharedComponent = true)
     List<SmObjectImpl> mNaryEnd = null;

    @objid ("1d8e4543-9e23-4691-91b8-626d55cf06ee")
    @SmaMetaAssociation(metaName="LinkToClass", typeDataClass=ClassAssociationData.class, min=0, max=1, smAssociationClass=Metadata.LinkToClassSmDependency.class, component = true)
     SmObjectImpl mLinkToClass;

    @objid ("85cdb69c-89ad-48d4-a84c-cbd191ce3097")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003cd1f6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0dd86944-c542-4632-8045-99081b9adfc8")
        private static SmClass smClass = null;

        @objid ("5f1ccd6b-c7a3-4480-97e7-ffbb347539c8")
        private static SmDependency OccurenceDep = null;

        @objid ("edd4287d-54ac-4e73-967d-ea47f9622de7")
        private static SmDependency NaryEndDep = null;

        @objid ("75393657-ba01-4a52-a612-c2e88a649db1")
        private static SmDependency LinkToClassDep = null;

        @objid ("a8175aca-4f46-429c-92f1-0665d934af71")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NaryAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ce8fa008-660e-4a10-a510-1a8a56663499")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("5c9651c9-1211-47aa-babf-5a53d568f9d7")
        public static SmDependency NaryEndDep() {
            if (NaryEndDep == null) {
            	NaryEndDep = classof().getDependencyDef("NaryEnd");
            }
            return NaryEndDep;
        }

        @objid ("e2a5f05b-f752-453b-8fdb-c8f3f709c1e3")
        public static SmDependency LinkToClassDep() {
            if (LinkToClassDep == null) {
            	LinkToClassDep = classof().getDependencyDef("LinkToClass");
            }
            return LinkToClassDep;
        }

        @objid ("9c187fea-ebc6-484b-b76a-73bf30f9ded0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("057235f6-54f3-4f02-883e-e51acc02c73a")
        public static SmDependency getNaryEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryEndDep;
        }

        @objid ("a2980c8b-296f-450d-889f-c05e5b294c31")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("c4b0f62d-86fd-403a-b2be-0c08743b1c64")
        public static SmDependency getLinkToClassDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkToClassDep;
        }

        @objid ("003d185a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bb4f7b2e-1145-4218-a172-0717499c10bc")
            public ISmObjectData createData() {
                return new NaryAssociationData();
            }

            @objid ("f2075b0b-d761-4d33-94a6-df72fad425ea")
            public SmObjectImpl createImpl() {
                return new NaryAssociationImpl();
            }

        }

        @objid ("003d7c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NaryEndSmDependency extends SmMultipleDependency {
            @objid ("86d5875d-46e5-4ca2-96c2-e3356bdac964")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mNaryEnd != null)? ((NaryAssociationData)data).mNaryEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("cce4638f-cb52-49ad-bd60-e50e0cd379d2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mNaryEnd = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mNaryEnd;
            }

            @objid ("c2135afc-5d2a-448c-a275-8977a7bb8c27")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationEndData.Metadata.NaryAssociationDep();
            }

        }

        @objid ("003dde2a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("c7662ccf-501a-4105-ad21-a0e323b7a1eb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NaryAssociationData)data).mOccurence != null)? ((NaryAssociationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("ebfc8e85-baac-4af7-840e-b932d52f84e0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NaryAssociationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((NaryAssociationData) data).mOccurence;
            }

            @objid ("60afb5b9-c8e9-4194-85bc-3c36500a1c92")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.ModelDep();
            }

        }

        @objid ("003e405e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LinkToClassSmDependency extends SmSingleDependency {
            @objid ("858a241a-01dd-4091-98e6-da0981e1a65c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NaryAssociationData) data).mLinkToClass;
            }

            @objid ("11ae3601-9fd6-467f-805e-038778d75e66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NaryAssociationData) data).mLinkToClass = value;
            }

            @objid ("0aaa2b34-4ed2-43f8-a0cf-2ced5b4e8644")
            @Override
            public SmDependency getSymetric() {
                return ClassAssociationData.Metadata.NaryAssociationPartDep();
            }

        }

    }

}
