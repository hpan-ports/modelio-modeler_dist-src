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
    @objid ("bd12ea1f-e031-44b6-9415-8aa05d1d5ed5")
    @SmaMetaAttribute(metaName="UiDataVersion", type=Integer.class, smAttributeClass=Metadata.UiDataVersionSmAttribute.class)
     Object mUiDataVersion = 0;

    @objid ("c566ecdb-ee8a-4a1b-835b-9dd8f4405d11")
    @SmaMetaAttribute(metaName="UiData", type=String.class, smAttributeClass=Metadata.UiDataSmAttribute.class)
     Object mUiData = "";

    @objid ("d3c0e083-dfd5-480b-b480-231c8b022349")
    @SmaMetaAttribute(metaName="PdeProperties", type=String.class, smAttributeClass=Metadata.PdePropertiesSmAttribute.class)
     Object mPdeProperties = "";

    @objid ("510071d9-519a-40f5-b2e6-516bba245c22")
    @SmaMetaAssociation(metaName="Origin", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OriginSmDependency.class, partof = true)
     SmObjectImpl mOrigin;

    @objid ("9bb7d526-753b-4cf5-a695-0d336c14faa3")
    @SmaMetaAssociation(metaName="Represented", typeDataClass=ElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentedSmDependency.class, partof = true)
     List<SmObjectImpl> mRepresented = null;

    @objid ("e48ac14c-bd4a-4b9c-bbbc-6fef50f114ce")
    @SmaMetaAssociation(metaName="ReferencingSet", typeDataClass=DiagramSetData.class, min=0, max=-1, smAssociationClass=Metadata.ReferencingSetSmDependency.class)
     List<SmObjectImpl> mReferencingSet = null;

    @objid ("f88716f4-5434-4890-aeac-1470965b5d12")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("000913f2-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("790055b6-040e-4bc4-96e9-abc4c42cf566")
        private static SmClass smClass = null;

        @objid ("a5d80e45-4780-4822-b9b8-3afdd38af4c2")
        private static SmAttribute UiDataVersionAtt = null;

        @objid ("d5b633fe-1c4d-453b-bf3a-ada44998c159")
        private static SmAttribute UiDataAtt = null;

        @objid ("104fdf27-9319-4b11-b25e-6e98d8b059ad")
        private static SmAttribute PdePropertiesAtt = null;

        @objid ("f94b91dc-833d-4372-b0ec-fdbbc74e4acd")
        private static SmDependency OriginDep = null;

        @objid ("c447453e-7715-4b46-a2ec-cffcb585e080")
        private static SmDependency RepresentedDep = null;

        @objid ("087df803-46ea-4737-b412-01986381c7e0")
        private static SmDependency ReferencingSetDep = null;

        @objid ("c4692c09-d3d4-424b-a6e6-546e41dfacce")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AbstractDiagramData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e98cf547-4356-484e-b2e0-43134b8f8d9d")
        public static SmAttribute UiDataVersionAtt() {
            if (UiDataVersionAtt == null) {
            	UiDataVersionAtt = classof().getAttributeDef("UiDataVersion");
            }
            return UiDataVersionAtt;
        }

        @objid ("038dc21a-62c2-47f8-9de2-7c6c99711d93")
        public static SmAttribute UiDataAtt() {
            if (UiDataAtt == null) {
            	UiDataAtt = classof().getAttributeDef("UiData");
            }
            return UiDataAtt;
        }

        @objid ("a9d36e7b-32e4-4ed8-b095-86300300ec53")
        public static SmAttribute PdePropertiesAtt() {
            if (PdePropertiesAtt == null) {
            	PdePropertiesAtt = classof().getAttributeDef("PdeProperties");
            }
            return PdePropertiesAtt;
        }

        @objid ("13c12b73-f7ea-49b1-a73c-5909ce2974db")
        public static SmDependency OriginDep() {
            if (OriginDep == null) {
            	OriginDep = classof().getDependencyDef("Origin");
            }
            return OriginDep;
        }

        @objid ("afaa3369-0f10-4ea8-9d01-434a76cecd22")
        public static SmDependency RepresentedDep() {
            if (RepresentedDep == null) {
            	RepresentedDep = classof().getDependencyDef("Represented");
            }
            return RepresentedDep;
        }

        @objid ("0d00b0b9-7424-4f1c-aff6-a21ac9c1b44c")
        public static SmDependency ReferencingSetDep() {
            if (ReferencingSetDep == null) {
            	ReferencingSetDep = classof().getDependencyDef("ReferencingSet");
            }
            return ReferencingSetDep;
        }

        @objid ("12afae25-eeed-458f-b271-6d1145766ad3")
        public static SmAttribute getPdePropertiesAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PdePropertiesAtt;
        }

        @objid ("b5f3a067-fa15-453c-9d2e-75cae119f322")
        public static SmDependency getOriginDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OriginDep;
        }

        @objid ("feeae783-d48e-4eaa-87e0-8bfe0e23b40b")
        public static SmDependency getRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentedDep;
        }

        @objid ("b9919a4d-ac06-4310-95fb-485993dbe3ec")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e8e3b7e0-79fb-41be-8005-8dead91fcdf5")
        public static SmDependency getReferencingSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencingSetDep;
        }

        @objid ("e2918e6a-7dad-4adf-909c-979540522980")
        public static SmAttribute getUiDataVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataVersionAtt;
        }

        @objid ("68690f16-6063-492d-b1c2-0f13e92eaf19")
        public static SmAttribute getUiDataAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UiDataAtt;
        }

        @objid ("000952d6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6c32abf8-996f-4c29-819c-de20625a9d0d")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("eddcd532-1d63-4f04-8a50-86c436fb3c25")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("0009b280-c4c6-1fd8-97fe-001ec947cd2a")
        public static class UiDataSmAttribute extends SmAttribute {
            @objid ("6ab5b1b0-d677-409f-88d7-e00289f7c477")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiData;
            }

            @objid ("131c28cc-0d98-4d41-8cfc-30d518b3733e")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiData = value;
            }

        }

        @objid ("000a11e4-c4c6-1fd8-97fe-001ec947cd2a")
        public static class PdePropertiesSmAttribute extends SmAttribute {
            @objid ("581d25bf-fbe8-4510-8a5a-6de28a3b86bb")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mPdeProperties;
            }

            @objid ("af687d34-919f-4e4c-add6-a7118f2b85f4")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mPdeProperties = value;
            }

        }

        @objid ("000a740e-c4c6-1fd8-97fe-001ec947cd2a")
        public static class RepresentedSmDependency extends SmMultipleDependency {
            @objid ("f0a48752-dc28-44f1-b45b-74d15e26a474")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mRepresented != null)? ((AbstractDiagramData)data).mRepresented:SmMultipleDependency.EMPTY;
            }

            @objid ("d3b9283e-b845-4159-bf7c-f09622ee3632")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mRepresented = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mRepresented;
            }

            @objid ("6d81b779-bef7-4dd8-b0e3-9ada3888ddce")
            @Override
            public SmDependency getSymetric() {
                return ElementData.Metadata.DiagramElementDep();
            }

        }

        @objid ("000ad5b6-c4c6-1fd8-97fe-001ec947cd2a")
        public static class OriginSmDependency extends SmSingleDependency {
            @objid ("958c2799-7d4f-4ad5-980e-30c4f3112d66")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mOrigin;
            }

            @objid ("f7a20fab-0e36-49b0-ac15-78f0421b059c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AbstractDiagramData) data).mOrigin = value;
            }

            @objid ("97afbb79-a032-45e6-b095-24780ef1bb84")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ProductDep();
            }

        }

        @objid ("000bbfd0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ReferencingSetSmDependency extends SmMultipleDependency {
            @objid ("b136d64e-d42b-4f2f-b003-360243aeb0b1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AbstractDiagramData)data).mReferencingSet != null)? ((AbstractDiagramData)data).mReferencingSet:SmMultipleDependency.EMPTY;
            }

            @objid ("35e3c2d9-23b7-47a8-bef2-a2a2f1d237a6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AbstractDiagramData) data).mReferencingSet = new ArrayList<>(initialCapacity);
                return ((AbstractDiagramData) data).mReferencingSet;
            }

            @objid ("ce16790e-98d3-4fbe-af2a-3cbc7ad625c4")
            @Override
            public SmDependency getSymetric() {
                return DiagramSetData.Metadata.ReferencedDiagramDep();
            }

        }

        @objid ("e9904bc6-c5d6-4d5e-ab2a-92df477da72e")
        public static class UiDataVersionSmAttribute extends SmAttribute {
            @objid ("831ef712-7e1b-404b-9bd3-af45d482ba0d")
            public Object getValue(ISmObjectData data) {
                return ((AbstractDiagramData) data).mUiDataVersion;
            }

            @objid ("c5a00aea-4aac-4b82-a401-effdeb9a27d6")
            public void setValue(ISmObjectData data, Object value) {
                ((AbstractDiagramData) data).mUiDataVersion = value;
            }

        }

    }

}
