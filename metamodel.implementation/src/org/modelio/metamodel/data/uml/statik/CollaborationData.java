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
    @objid ("a4f936c9-6e27-405f-a941-2500d81846dd")
    @SmaMetaAttribute(metaName="IsConcurrent", type=Boolean.class, smAttributeClass=Metadata.IsConcurrentSmAttribute.class)
     Object mIsConcurrent = false;

    @objid ("faecaad7-826d-477c-a896-78ba9bd54227")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("bd9553da-b995-443a-bfc1-8b18681f6698")
    @SmaMetaAssociation(metaName="BRepresented", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BRepresentedSmDependency.class)
     SmObjectImpl mBRepresented;

    @objid ("72f90745-869b-4650-8b8d-17eb039738eb")
    @SmaMetaAssociation(metaName="Occurrence", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OccurrenceSmDependency.class)
     List<SmObjectImpl> mOccurrence = null;

    @objid ("f778efad-e86f-4e51-9d21-27fa3cb35262")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0052d76c-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("1c0853be-57eb-4d44-8871-68d9f3116c32")
        private static SmClass smClass = null;

        @objid ("4073a747-3683-4f32-ae9a-0c165d31f72b")
        private static SmAttribute IsConcurrentAtt = null;

        @objid ("8645bdb4-e645-42d4-a901-daca42f54b2e")
        private static SmDependency ORepresentedDep = null;

        @objid ("ceeb65e2-aef4-48fa-b4bd-9b3a74c1037a")
        private static SmDependency BRepresentedDep = null;

        @objid ("5e3e2a25-773e-4d3f-8fbd-439db91e5d7d")
        private static SmDependency OccurrenceDep = null;

        @objid ("1a56e7e0-fd6f-45a7-aa2a-107f539fd23a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("446a9bc3-95da-4b30-80d8-3a37329f354a")
        public static SmAttribute IsConcurrentAtt() {
            if (IsConcurrentAtt == null) {
            	IsConcurrentAtt = classof().getAttributeDef("IsConcurrent");
            }
            return IsConcurrentAtt;
        }

        @objid ("1b92781e-cb67-45b3-afe7-e8b62a45717c")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("7594393b-a202-4160-a067-63e208f62e0b")
        public static SmDependency BRepresentedDep() {
            if (BRepresentedDep == null) {
            	BRepresentedDep = classof().getDependencyDef("BRepresented");
            }
            return BRepresentedDep;
        }

        @objid ("60a344ac-a599-403a-ae19-9d775a89545b")
        public static SmDependency OccurrenceDep() {
            if (OccurrenceDep == null) {
            	OccurrenceDep = classof().getDependencyDef("Occurrence");
            }
            return OccurrenceDep;
        }

        @objid ("e3f0ca90-b0db-4c11-b880-57b0e8394233")
        public static SmDependency getOccurrenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurrenceDep;
        }

        @objid ("94936104-a2a1-4629-8660-b079d652f23c")
        public static SmDependency getBRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BRepresentedDep;
        }

        @objid ("67b0916d-5971-4121-84d5-b3694b7fdd80")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a9266eda-e2ab-4e27-96b9-a9dc4fb969f0")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("883c2271-b579-4600-a85d-bc2b3d062261")
        public static SmAttribute getIsConcurrentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsConcurrentAtt;
        }

        @objid ("00532122-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e1a66f64-d985-403a-af31-17d2d3b1e3fd")
            public ISmObjectData createData() {
                return new CollaborationData();
            }

            @objid ("d6ce35b0-be3b-45c0-8c9d-1f217c70540d")
            public SmObjectImpl createImpl() {
                return new CollaborationImpl();
            }

        }

        @objid ("00538338-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsConcurrentSmAttribute extends SmAttribute {
            @objid ("341446ab-5c14-4f9f-b491-a3a3cf35c550")
            public Object getValue(ISmObjectData data) {
                return ((CollaborationData) data).mIsConcurrent;
            }

            @objid ("4fd8909b-9b13-4d54-9f0c-8250a6de1172")
            public void setValue(ISmObjectData data, Object value) {
                ((CollaborationData) data).mIsConcurrent = value;
            }

        }

        @objid ("0053e56c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BRepresentedSmDependency extends SmSingleDependency {
            @objid ("c7188985-10da-4d23-b065-2811c261a7b6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mBRepresented;
            }

            @objid ("070c6ce1-c0fe-4a21-8b47-e04ce12ba615")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mBRepresented = value;
            }

            @objid ("fea79611-f86b-424d-a1b1-dd0621c3da93")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnedCollaborationDep();
            }

        }

        @objid ("00546230-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("8e7c3c1b-2f90-48e1-8325-9073dda948b1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationData) data).mORepresented;
            }

            @objid ("2be69797-b507-4676-b33f-1b1d25ddf1f7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationData) data).mORepresented = value;
            }

            @objid ("50c1305a-54e7-4e55-a7db-85f28db37a41")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.ExampleDep();
            }

        }

        @objid ("0054d83c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurrenceSmDependency extends SmMultipleDependency {
            @objid ("c0f79242-0eff-4ffa-826c-a0bd491e140f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationData)data).mOccurrence != null)? ((CollaborationData)data).mOccurrence:SmMultipleDependency.EMPTY;
            }

            @objid ("33c46a6b-5934-4985-82a7-29b15874a1fa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationData) data).mOccurrence = new ArrayList<>(initialCapacity);
                return ((CollaborationData) data).mOccurrence;
            }

            @objid ("8f9b4d64-1c49-4b52-976c-9ab76cac35f7")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.TypeDep();
            }

        }

    }

}
