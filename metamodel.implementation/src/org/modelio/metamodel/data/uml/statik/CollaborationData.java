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
    @objid ("cbf95f28-977d-45aa-af42-16987b119bb5")
    @SmaMetaAttribute(metaName="IsConcurrent", type=Boolean.class, smAttributeClass=Metadata.IsConcurrentSmAttribute.class)
     Object mIsConcurrent = false;

    @objid ("8c7b4819-589b-48c6-b513-a5a42f067689")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("ea05c566-94be-4225-8069-9bf482489f76")
    @SmaMetaAssociation(metaName="BRepresented", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BRepresentedSmDependency.class)
     SmObjectImpl mBRepresented;

    @objid ("21c366a4-2d4d-49ec-821c-7c4b43565918")
    @SmaMetaAssociation(metaName="Occurrence", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OccurrenceSmDependency.class)
     List<SmObjectImpl> mOccurrence = null;

    @objid ("c61f92c2-8b6d-4e3c-9b87-983235d0d3ee")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0052d76c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("cbe78764-f342-4ee9-920a-428c9ff6bbaa")
        private static SmClass smClass = null;

        @objid ("bd94bf3e-ec58-48bf-9c75-2a7153f15069")
        private static SmAttribute IsConcurrentAtt = null;

        @objid ("651f169c-79fe-4bc0-b657-e09cd68c821b")
        private static SmDependency ORepresentedDep = null;

        @objid ("aae21d5a-29d9-4fbd-abd5-c2fdfa121a10")
        private static SmDependency BRepresentedDep = null;

        @objid ("65a2d39a-a280-4669-ab2d-1d383c50de3d")
        private static SmDependency OccurrenceDep = null;

        @objid ("86161e1c-d520-4c3a-8a48-a15de3e180a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4b6a634f-c056-4a3b-8eaf-5f496ed2a6c5")
        public static SmAttribute IsConcurrentAtt() {
            if (IsConcurrentAtt == null) {
            	IsConcurrentAtt = classof().getAttributeDef("IsConcurrent");
            }
            return IsConcurrentAtt;
        }

        @objid ("2147cfec-766e-470f-84d1-3b9f3476e67c")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("2fa1722f-a964-4dac-9560-f466d5991052")
        public static SmDependency BRepresentedDep() {
            if (BRepresentedDep == null) {
            	BRepresentedDep = classof().getDependencyDef("BRepresented");
            }
            return BRepresentedDep;
        }

        @objid ("efdb5d90-c9fa-485a-bf36-45d954023a51")
        public static SmDependency OccurrenceDep() {
            if (OccurrenceDep == null) {
            	OccurrenceDep = classof().getDependencyDef("Occurrence");
            }
            return OccurrenceDep;
        }

        @objid ("0621bc2b-0d00-4324-b72d-b6901134d0ac")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("0ccab123-9062-4f23-97f3-5353090e9493")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d75decdb-6fea-4f97-8652-8255f6162b91")
        public static SmDependency getBRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BRepresentedDep;
        }

        @objid ("092c1fba-1351-4b01-88f3-c69bed89ac03")
        public static SmAttribute getIsConcurrentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConcurrentAtt;
        }

        @objid ("0c1beb6e-edea-4ca5-bcda-4f36b69eac7b")
        public static SmDependency getOccurrenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurrenceDep;
        }

        @objid ("00532122-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e587a10c-7f45-4747-a7e9-10e9f2a24762")
            public ISmObjectData createData() {
                return new CollaborationData();
            }

            @objid ("48008621-77b3-473b-949d-04188ebbcc7a")
            public SmObjectImpl createImpl() {
                return new CollaborationImpl();
            }

        }

        @objid ("00538338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConcurrentSmAttribute extends SmAttribute {
            @objid ("f9a5cd98-f6a6-4cf0-9b39-60ebcf2cc1cc")
            public Object getValue(ISmObjectData data) {
                return ((CollaborationData) data).mIsConcurrent;
            }

            @objid ("d707da53-d9de-48ee-a670-c0646eae347e")
            public void setValue(ISmObjectData data, Object value) {
                ((CollaborationData) data).mIsConcurrent = value;
            }

        }

        @objid ("0053e56c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BRepresentedSmDependency extends SmSingleDependency {
            @objid ("433788c3-ddc5-4f57-bd92-92d1782323d5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mBRepresented;
            }

            @objid ("ced63f9a-a82f-4965-a981-c0866555dfb5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mBRepresented = value;
            }

            @objid ("8ef3a020-088e-43c4-a936-29be9d7bf859")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnedCollaborationDep();
            }

        }

        @objid ("00546230-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("81c61a9b-7270-4587-b2ff-ab0d9d1e112e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mORepresented;
            }

            @objid ("7c68fdf7-47fc-4dce-a915-d5f07f596349")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mORepresented = value;
            }

            @objid ("fc5a99c2-4539-4cd1-ad81-ca6f8d5d5de7")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ExampleDep();
            }

        }

        @objid ("0054d83c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurrenceSmDependency extends SmMultipleDependency {
            @objid ("b3c10d18-0771-42a5-9f65-3244100625ea")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationData)data).mOccurrence != null)? ((CollaborationData)data).mOccurrence:SmMultipleDependency.EMPTY;
            }

            @objid ("19f01884-6a04-4fd8-9584-64a26c3ef910")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationData) data).mOccurrence = new ArrayList<>(initialCapacity);
                return ((CollaborationData) data).mOccurrence;
            }

            @objid ("2805a718-bbc5-4807-9051-37df4b245364")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.TypeDep();
            }

        }

    }

}
