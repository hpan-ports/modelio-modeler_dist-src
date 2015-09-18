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
    @objid ("9c1ab6d4-4122-407d-a6d0-64ee31f1c685")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelTreeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("904011a2-3e5d-4dc5-9f55-6b35f0bb08f9")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=ModelTreeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("a82609b3-f7ca-4dd3-a4fd-f57371097597")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002aecb6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9b7eaca1-ceb5-4948-bb32-efe8aed28311")
        private static SmClass smClass = null;

        @objid ("de0d1aaa-ae67-43e3-92c7-d7fcffc52aef")
        private static SmDependency OwnerDep = null;

        @objid ("3aa9698b-d08f-4786-a6b4-95597e7d6f25")
        private static SmDependency OwnedElementDep = null;

        @objid ("999d7f7e-6794-43c2-922c-c3e78293dffa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelTreeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d0be4c6-ce9c-4286-bd0b-022c5dca514d")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("8201f8fe-073e-44de-955b-9fe0391e0300")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("647a038c-478c-4bcd-8ee7-14ef70f3c7f7")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("80a4b86a-a4b7-4155-bd5f-73b34dc1663a")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("c521ac44-3d38-4eec-a5e7-e21b6f1baa6c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002b2e74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("45c346bb-e5f9-4bda-b11f-b3bd226a32b1")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("85640e80-9381-447c-88b0-1e0b63693ccf")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("002b9062-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("2a138e7f-c77b-4bab-877f-ca6dec3b8ed1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelTreeData)data).mOwnedElement != null)? ((ModelTreeData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("1eafdcc8-7c9e-4b76-ad55-1351843d258a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelTreeData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((ModelTreeData) data).mOwnedElement;
            }

            @objid ("bb681e7f-3614-4846-a93d-93563bc501bf")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnerDep();
            }

        }

        @objid ("002bff3e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a3d6bf00-0226-4555-b398-d4299cae4cf8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelTreeData) data).mOwner;
            }

            @objid ("5a1ed554-43b7-4edf-8209-9eddc9599994")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelTreeData) data).mOwner = value;
            }

            @objid ("787c27f0-21a3-457b-b015-7bb2f53f091a")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnedElementDep();
            }

        }

    }

}
