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
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.CollaborationImpl;
import org.modelio.metamodel.uml.statik.Collaboration;
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

@objid ("00044bf6-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Collaboration.class, factory=CollaborationData.Metadata.ObjectFactory.class)
public class CollaborationData extends NameSpaceData {
    @objid ("8c7f9778-f4cb-445e-b072-56ce0808e867")
    @SmaMetaAttribute(metaName="IsConcurrent", type=Boolean.class, smAttributeClass=Metadata.IsConcurrentSmAttribute.class)
     Object mIsConcurrent = false;

    @objid ("31c45192-21aa-41fd-8f90-74a2d77fa523")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("4d264f9f-3e08-4422-94d1-9c2b161e4bf5")
    @SmaMetaAssociation(metaName="BRepresented", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BRepresentedSmDependency.class)
     SmObjectImpl mBRepresented;

    @objid ("76475b8c-7c1c-433e-a020-536a850a7172")
    @SmaMetaAssociation(metaName="Occurrence", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OccurrenceSmDependency.class)
     List<SmObjectImpl> mOccurrence = null;

    @objid ("74f64ac4-bfff-4fb6-9f11-91353004f604")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0052d76c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a762d67e-9eb3-4549-9118-432afcc4a453")
        private static SmClass smClass = null;

        @objid ("55987759-ddd8-4838-8454-9a4bd80a8b13")
        private static SmAttribute IsConcurrentAtt = null;

        @objid ("a7a30261-6f60-4e04-991d-6b86f36ceb75")
        private static SmDependency ORepresentedDep = null;

        @objid ("b47b6b7e-34e9-4f23-b5e3-717a5ac60f18")
        private static SmDependency BRepresentedDep = null;

        @objid ("12eb625b-623b-428b-a15f-30a63e480e64")
        private static SmDependency OccurrenceDep = null;

        @objid ("69bc4dae-6f22-44dd-8d35-8407081eea64")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f4200940-c5f9-49ac-8069-ece46ef70cf3")
        public static SmAttribute IsConcurrentAtt() {
            if (IsConcurrentAtt == null) {
            	IsConcurrentAtt = classof().getAttributeDef("IsConcurrent");
            }
            return IsConcurrentAtt;
        }

        @objid ("5486b6bb-1dd4-4da1-a5a8-6c6aed5c0829")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("2d6d0585-3a3b-4978-bb37-ddb835df916c")
        public static SmDependency BRepresentedDep() {
            if (BRepresentedDep == null) {
            	BRepresentedDep = classof().getDependencyDef("BRepresented");
            }
            return BRepresentedDep;
        }

        @objid ("100e395c-4721-43d8-af56-af9f1c5a5c75")
        public static SmDependency OccurrenceDep() {
            if (OccurrenceDep == null) {
            	OccurrenceDep = classof().getDependencyDef("Occurrence");
            }
            return OccurrenceDep;
        }

        @objid ("29f93525-d71e-4af5-9555-d4a21aace655")
        public static SmDependency getBRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BRepresentedDep;
        }

        @objid ("83b2ac2a-5a18-46c5-9acc-84b8c831cfff")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("9bee0e3a-da0a-405b-945b-b0c60acd8463")
        public static SmDependency getOccurrenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurrenceDep;
        }

        @objid ("7da9df71-dee1-42b8-82f5-a60b3feb345d")
        public static SmAttribute getIsConcurrentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConcurrentAtt;
        }

        @objid ("6c8610ed-e1cf-4c4f-9267-d2ecfb91c9dc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00532122-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("908c6f0e-07db-4f5f-9324-1f0c327bb7a5")
            public ISmObjectData createData() {
                return new CollaborationData();
            }

            @objid ("a6975d13-d98c-4de0-891e-0f6b951c5153")
            public SmObjectImpl createImpl() {
                return new CollaborationImpl();
            }

        }

        @objid ("00538338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConcurrentSmAttribute extends SmAttribute {
            @objid ("b8715fec-2a80-4e39-83a4-d10e97c96a7f")
            public Object getValue(ISmObjectData data) {
                return ((CollaborationData) data).mIsConcurrent;
            }

            @objid ("b7d6a85e-e1b0-4c8c-b764-c0e04c0ba227")
            public void setValue(ISmObjectData data, Object value) {
                ((CollaborationData) data).mIsConcurrent = value;
            }

        }

        @objid ("0053e56c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BRepresentedSmDependency extends SmSingleDependency {
            @objid ("4dfea671-df4d-4878-844b-ee9b51665e02")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mBRepresented;
            }

            @objid ("ac72e7b5-e697-49fa-b6ba-06ee763dd144")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mBRepresented = value;
            }

            @objid ("3eeda160-8dbd-42df-a020-d9d7fe69616d")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnedCollaborationDep();
            }

        }

        @objid ("00546230-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("25474880-2513-48fd-adf4-cbcc3eb51275")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mORepresented;
            }

            @objid ("e80772d4-7a27-4719-9483-3f8d11caa63b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mORepresented = value;
            }

            @objid ("ef278cf8-3e3f-43c4-b48a-a2e6073089c1")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ExampleDep();
            }

        }

        @objid ("0054d83c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurrenceSmDependency extends SmMultipleDependency {
            @objid ("48950da3-9384-423d-891a-ec95830cbdcc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationData)data).mOccurrence != null)? ((CollaborationData)data).mOccurrence:SmMultipleDependency.EMPTY;
            }

            @objid ("d4aa236c-72e5-4548-92e0-a836b3c54d62")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationData) data).mOccurrence = new ArrayList<>(initialCapacity);
                return ((CollaborationData) data).mOccurrence;
            }

            @objid ("88fb25a3-e7d9-4833-bbdd-1419aebfe186")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.TypeDep();
            }

        }

    }

}
