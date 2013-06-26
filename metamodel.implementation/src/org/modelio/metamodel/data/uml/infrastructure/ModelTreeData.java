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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
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

@objid ("00899130-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModelTree.class, factory=ModelTreeData.Metadata.ObjectFactory.class)
public abstract class ModelTreeData extends ModelElementData {
    @objid ("7e44a767-c8bb-4c65-8bd9-8d31356d95bd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelTreeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("30f6ffc3-3046-4c08-a674-c5142790bb66")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=ModelTreeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("baa93ebf-6140-4f92-b30b-b72a5e085b88")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002aecb6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ecb6ad40-58c4-43a4-bbde-5d5c42392358")
        private static SmClass smClass = null;

        @objid ("66036d7b-c6b7-4bb4-9a71-7526a9028a93")
        private static SmDependency OwnerDep = null;

        @objid ("4340878e-2a19-4198-8093-27856d05d660")
        private static SmDependency OwnedElementDep = null;

        @objid ("1d330c08-a0e8-4fe3-b065-296cca3dbc12")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelTreeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("217315e5-260e-4961-a308-ae44d3c545ce")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("eb8e188a-abf3-4fb4-820e-daa93cf054da")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("2565eaf0-ebac-4007-bb24-7293566e2d84")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("319d7f00-09b0-4f49-8f2d-17619d81a6ef")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7ad206c8-0090-4630-8c78-0f171105dc3f")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("002b2e74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1e3be29-fe6e-43d1-b3be-821a2157b987")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("23b33c56-89e3-4b4f-af79-576d3d847ed5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("002b9062-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("28f92287-0bda-4e72-84dc-a25a3bdeb787")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelTreeData)data).mOwnedElement != null)? ((ModelTreeData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("46cbfd52-98e9-43f8-8a1d-e2a95900aa42")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelTreeData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((ModelTreeData) data).mOwnedElement;
            }

            @objid ("864cf524-e52d-4257-95a1-973e5fc4f6be")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnerDep();
            }

        }

        @objid ("002bff3e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("e364bd8a-d9f6-4abe-9a85-96561f5e3e6f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelTreeData) data).mOwner;
            }

            @objid ("43be551d-0323-4bd2-b4f3-19e0e52fa9de")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelTreeData) data).mOwner = value;
            }

            @objid ("22a31986-f482-4ad4-8dfe-c578b6b1af52")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnedElementDep();
            }

        }

    }

}
