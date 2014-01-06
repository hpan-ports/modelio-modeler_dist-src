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
package org.modelio.metamodel.data.diagrams;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.diagrams.DiagramSetData;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramImpl;
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

@objid ("00678cde-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AbstractDiagram.class, factory=AbstractDiagramData.Metadata.ObjectFactory.class)
public abstract class AbstractDiagramData extends ModelElementData {
    @objid ("71a3ca83-8d4d-4911-a8df-d1183b4c9b20")
    @SmaMetaAttribute(metaName="UiDataVersion", type=Integer.class, smAttributeClass=Metadata.UiDataVersionSmAttribute.class)
     Object mUiDataVersion = 0;

    @objid ("09ec6253-906b-4f77-a943-19b40a125fec")
    @SmaMetaAttribute(metaName="UiData", type=String.class, smAttributeClass=Metadata.UiDataSmAttribute.class)
     Object mUiData = "";

    @objid ("3648f78a-d529-402e-8a0b-28db27d06e9e")
    @SmaMetaAttribute(metaName="PdeProperties", type=String.class, smAttributeClass=Metadata.PdePropertiesSmAttribute.class)
     Object mPdeProperties = "";

    @objid ("7b4e6674-4863-46c9-bf2e-d1af1cd30feb")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class, partof = true)
     SmObjectImpl mOrigin;

    @objid ("5efd65ff-d296-45f9-a117-b670badd05dd")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("1fd4cd03-52fb-47f0-bd85-fe058a44da3b")
    @SmaMetaAssociation(metaName="ReferencingSet", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencingSetSmDependency.class)
     List<SmObjectImpl> mReferencingSet = null;

    @objid ("30c450c3-fb31-4c04-b9f3-a0eb42849836")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000913f2-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fb6e143e-bad5-4c04-85a5-0ee269dc87e3")
        private static SmClass smClass = null;

        @objid ("a456aac2-b29a-4a44-8545-290d1a781274")
        private static SmAttribute UiDataVersionAtt = null;

        @objid ("fd75d83c-d3a1-4b29-9cbf-7845041da9d5")
        private static SmAttribute UiDataAtt = null;

        @objid ("407c74b3-ba4d-4904-b196-c4b684682f37")
        private static SmAttribute PdePropertiesAtt = null;

        @objid ("03f7fb5b-af7c-4cb6-a180-d89710da96e8")
        private static SmDependency OriginDep = null;

        @objid ("52a3871e-c4c2-4c3a-9d7b-d27e34bdc2bf")
        private static SmDependency RepresentedDep = null;

        @objid ("6850278f-3225-4ec7-81a0-7ee0b847d148")
        private static SmDependency ReferencingSetDep = null;

        @objid ("20c166e4-a6a9-4d9e-a6e9-f4310a9f1230")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("981606e8-b6dc-4afb-90e1-86bd169bcb55")
        public static SmAttribute UiDataVersionAtt() {
            if (UiDataVersionAtt == null) {
            	UiDataVersionAtt = classof().getAttributeDef("UiDataVersion");
            }
            return UiDataVersionAtt;
        }

        @objid ("1476ce2f-5fcd-442f-adbd-713496086233")
        public static SmAttribute UiDataAtt() {
            if (UiDataAtt == null) {
            	UiDataAtt = classof().getAttributeDef("UiData");
            }
            return UiDataAtt;
        }

        @objid ("b88bf00e-75cf-45c2-8aeb-4beb381c932c")
        public static SmAttribute PdePropertiesAtt() {
            if (PdePropertiesAtt == null) {
            	PdePropertiesAtt = classof().getAttributeDef("PdeProperties");
            }
            return PdePropertiesAtt;
        }

        @objid ("a6f81d9f-26aa-44af-8094-9d8bdcdfa06e")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("7c1c83e7-aeb6-4841-baf5-e4c6b9c1fa7c")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("f9fd1a2f-5cd8-4fae-8f09-7c57eed0ec30")
        public static SmDependency ReferencingSetDep() {
            if (ReferencingSetDep == null) {
            	ReferencingSetDep = classof().getDependencyDef("ReferencingSet");
            }
            return ReferencingSetDep;
        }

        @objid ("b2079c90-1cc4-4901-b874-cf56392b15ff")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5b3a18f3-d950-4d01-a241-041e913bdf5e")
        public static SmAttribute getUiDataAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataAtt;
        }

        @objid ("06f6dd43-9b06-49a3-b8eb-0673f9fe0d68")
        public static SmAttribute getUiDataVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataVersionAtt;
        }

        @objid ("d1ea17d8-7b08-4d30-a835-c3cbf8126281")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("0082a4cf-4228-43d5-96af-75369a59d350")
        public static SmAttribute getPdePropertiesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PdePropertiesAtt;
        }

        @objid ("e85682af-7394-47b6-ba03-dde5b7c41915")
        public static SmDependency getReferencingSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencingSetDep;
        }

        @objid ("03ba12f2-2b69-4a34-8cd3-7d00a0660ddd")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("000952d6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2e7fa8a2-ef14-41d2-8d2f-ba85c5be87af")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("6a96214c-5d16-484d-808d-5d137a90e30e")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0009b280-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UiDataSmAttribute extends SmAttribute {
            @objid ("8ded0a08-a9c0-4fe9-913f-cdd8a56e6c2d")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiData;
            }

            @objid ("248c5545-4adf-4751-9a9d-bc3cb53c613d")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiData = value;
            }

        }

        @objid ("000a11e4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class PdePropertiesSmAttribute extends SmAttribute {
            @objid ("1db61337-51ea-4d7a-9bd8-f6619f05695d")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mPdeProperties;
            }

            @objid ("792f7007-eb89-4d5d-9794-d276af0006bb")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mPdeProperties = value;
            }

        }

        @objid ("000a740e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("97d1dd43-32bc-41ac-8410-308d146b6e38")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mRepresented != null)? ((AbstractDiagramData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("9a3bf217-958a-49cb-9501-60b5c10ef3fe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mRepresented;
            }

            @objid ("9f67a920-e4eb-454f-abab-4af832a35095")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.DiagramElementDep();
            }

        }

        @objid ("000ad5b6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("7cbb2e31-ecfb-444b-a6d4-895bb5ed6394")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mOrigin;
            }

            @objid ("c48ca38a-a756-46cd-a35a-7adf55028d5d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AbstractDiagramData) data).mOrigin = value;
            }

            @objid ("16d49129-8faa-4077-94fb-747740237cf3")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ProductDep();
            }

        }

        @objid ("000bbfd0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ReferencingSetSmDependency extends SmMultipleDependency {
            @objid ("eb27ee5a-7f9c-43e9-a2c4-a48ca407da29")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mReferencingSet != null)? ((AbstractDiagramData)data).mReferencingSet:SmMultipleDependency.EMPTY;
            }

            @objid ("6981c23f-6ed4-46a8-97b6-71a3ba8778b0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mReferencingSet = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mReferencingSet;
            }

            @objid ("cb6d5149-2ea2-4f78-a846-d5b27a9783a2")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ReferencedDiagramDep();
            }

        }

        @objid ("e9904bc6-c5d6-4d5e-ab2a-92df477da72e")
        public static class UiDataVersionSmAttribute extends SmAttribute {
            @objid ("f808349d-8c4a-4e14-8120-5c9dd0cfb6ed")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiDataVersion;
            }

            @objid ("81cb6ae0-2940-4d23-adc3-975bfa68459c")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiDataVersion = value;
            }

        }

    }

}
