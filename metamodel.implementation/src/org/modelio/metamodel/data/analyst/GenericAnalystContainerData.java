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
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.GenericAnalystElementData;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerImpl;
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

@objid ("43cf5c62-f20f-4e47-9153-5f4bd63429ba")
@SmaMetaClass(mmClass=GenericAnalystContainer.class, factory=GenericAnalystContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class GenericAnalystContainerData extends AnalystContainerData {
    @objid ("34dd53de-ed07-46da-a8e4-548f2b1182ad")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("250d196c-d696-4a62-b179-236e75fc9124")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("94566af7-27bb-445a-866b-d96954bf66d3")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("72cbe8c9-8f88-467c-acd4-ba96c3000550")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("e342f8fb-3a0f-4fa5-a5a6-6744b9a6d03f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3f50658d-b4c2-4005-a892-25d992f61952")
    public static class Metadata {
        @objid ("4cb21304-d60d-4fb6-9401-1aefaa2f6cae")
        private static SmClass smClass = null;

        @objid ("09bdd43b-8771-48bb-90f6-22dc9e2a58e0")
        private static SmDependency OwnedElementDep = null;

        @objid ("4908d321-c737-47f7-bf97-716d2f9ec5de")
        private static SmDependency OwnerContainerDep = null;

        @objid ("9917d307-b9dc-4ffe-b7f7-30a81a7220c6")
        private static SmDependency OwnedContainerDep = null;

        @objid ("55d386e6-df0f-4e16-9cb4-5eb82e68d558")
        private static SmDependency OwnerProjectDep = null;

        @objid ("29c1902d-e698-4400-a099-0bba9e45e87c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("628fff3d-9b87-46b1-b932-a7a45020f240")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("b4e1f01d-7c9f-41f9-beac-3bf20155e78c")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("8a1e1a83-5afa-4720-8995-b04d9adf7c36")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("3a7f41cc-fb27-4742-855b-1b457af96ce2")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("bd03f759-3df5-4f9e-9e7b-afce4ed75f45")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("2f87dc50-1ca8-4269-85dd-a82cfe3f3d04")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("df0eb052-03cf-42e9-910c-92c340195210")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("135b5e36-09cc-4d81-acc1-e6184ab38551")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("ff53417a-30c3-4a53-b229-b13a6e764e91")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("b3ad03bd-c265-4035-940c-986d2cc05988")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cbc568cb-00f0-4713-92d5-670386466ead")
            public ISmObjectData createData() {
                return new GenericAnalystContainerData();
            }

            @objid ("b7348f15-9312-45d4-9560-13ed7c1152f4")
            public SmObjectImpl createImpl() {
                return new GenericAnalystContainerImpl();
            }

        }

        @objid ("51eec192-d7f1-444b-993b-2abfdf9665b8")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("5900bb2d-8c17-4574-8137-5152fe708f01")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedElement != null)? ((GenericAnalystContainerData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("dc9b6728-2dd4-4ae2-8efe-17c053edb1ae")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedElement;
            }

            @objid ("bdc67eac-1000-482d-a30e-7416dad9baf6")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("4912e901-4e5e-40ee-b39a-02fd11638615")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("45fd368c-4627-4699-aa64-40f781dfc14d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerContainer;
            }

            @objid ("eb8b0851-a7bb-45b7-ad79-cfdef521641e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerContainer = value;
            }

            @objid ("698842e4-73a5-4713-9593-df48c5921ee7")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("aeece048-e7eb-4929-afa8-5365f90209f4")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("cc916833-a5fd-4f3a-9960-b76e27ff117e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedContainer != null)? ((GenericAnalystContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("ea0af6ca-82e4-4bd0-8954-9c5b0c4a3662")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedContainer;
            }

            @objid ("326d98cb-ecd7-443f-bad2-ccc505580efc")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("0932ae70-e3fd-4f73-94fb-ae6c1c77bf0a")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("5d765fad-b006-4112-8467-dfbc3c6cd805")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerProject;
            }

            @objid ("6a82611a-5b0e-4be6-8405-51ebb7f3c423")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerProject = value;
            }

            @objid ("f836ddbb-3f69-4700-b79d-c5d05edfb560")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GenericRootDep();
            }

        }

    }

}
