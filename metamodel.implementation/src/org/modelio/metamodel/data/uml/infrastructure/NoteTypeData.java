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
import org.modelio.metamodel.data.uml.infrastructure.LocalNoteData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.NoteData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.impl.uml.infrastructure.NoteTypeImpl;
import org.modelio.metamodel.uml.infrastructure.NoteType;
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

@objid ("008c3692-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=NoteType.class, factory=NoteTypeData.Metadata.ObjectFactory.class)
public class NoteTypeData extends ModelElementData {
    @objid ("a26d592d-d684-4299-af12-b0d7eaf56b90")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("2b07c055-e4f2-4bb4-adc9-63764f0b006b")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("992eadcd-7658-49a4-9048-ef54b07e7de2")
    @SmaMetaAssociation(metaName="Element", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.ElementSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mElement = null;

    @objid ("83e2a290-b63d-4a7f-9de7-9e267aceb5d9")
    @SmaMetaAssociation(metaName="LocalElement", typeDataClass=LocalNoteData.class, min=0, max=-1, smAssociationClass=Metadata.LocalElementSmDependency.class, performanceRisk = true)
     List<SmObjectImpl> mLocalElement = null;

    @objid ("1b6b8b58-13d4-43fc-a854-63e8c2a259f7")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("623af384-de4d-4158-8bba-e52878f9c45a")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("2ae4169a-8195-469b-85c9-6711f5bf93c7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038da56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4b84eda4-ec4e-4c94-9693-7af713e31288")
        private static SmClass smClass = null;

        @objid ("c6cdfd74-880e-4156-9c6c-52c0862e2075")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("987f251b-ec42-49bd-bd49-8806695d5136")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("7db3a30f-6eed-4334-94a5-c201bbb635f1")
        private static SmDependency ElementDep = null;

        @objid ("37f52148-6f7d-4b46-b634-264bf3cfe7fb")
        private static SmDependency LocalElementDep = null;

        @objid ("6243d042-03d5-4a2f-95d9-22c10319b613")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("f8b9400e-fcb7-4cc2-a889-9ffb87a10913")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("a4e4cc64-b1f4-46d0-98f0-ba9be1331dbe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ce3d7b9-7079-463a-9529-0132038ae65a")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("09cc0b73-8c5b-4867-8482-70ea6d3a18f6")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("c86b3e39-af12-453f-bf6e-4d2412b17cef")
        public static SmDependency ElementDep() {
            if (ElementDep == null) {
            	ElementDep = classof().getDependencyDef("Element");
            }
            return ElementDep;
        }

        @objid ("284c1b74-09a9-4c31-9ac8-aa09252c94a0")
        public static SmDependency LocalElementDep() {
            if (LocalElementDep == null) {
            	LocalElementDep = classof().getDependencyDef("LocalElement");
            }
            return LocalElementDep;
        }

        @objid ("859147f1-910f-4d42-8a62-87531c239748")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("a23ea410-85e2-4b54-be75-208fc0424d46")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("b8ed38b6-16dd-40f2-8e68-1da63d2f6b3a")
        public static SmDependency getLocalElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalElementDep;
        }

        @objid ("117df253-0bcc-4ff7-b2d8-5915ad76482c")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("0f35fde2-b64c-4ab7-8cef-c2c20dc5829e")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("3f8cffbd-1aa6-44a0-81a2-43392a979546")
        public static SmDependency getElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ElementDep;
        }

        @objid ("81d99c17-0b25-467f-9e84-bf0caf695546")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("6c087e33-45e1-4d91-9b04-058f234ec17b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("30b6c9a5-b39d-49c9-be15-e02f2405ba38")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("00391b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fce46f65-5a9d-4baf-99d7-b37901dc208d")
            public ISmObjectData createData() {
                return new NoteTypeData();
            }

            @objid ("f3353202-3a59-4178-920a-7c6412b333b2")
            public SmObjectImpl createImpl() {
                return new NoteTypeImpl();
            }

        }

        @objid ("00397f74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("ebdaa63e-30f3-43e7-b1d3-11dd638cd333")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mIsHidden;
            }

            @objid ("a0315828-c13f-4731-bc2e-eff8ca0ce0a2")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mIsHidden = value;
            }

        }

        @objid ("003a44f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ElementSmDependency extends SmMultipleDependency {
            @objid ("86a9d4a7-38d8-4d3b-836e-6b9978ca0187")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NoteTypeData)data).mElement != null)? ((NoteTypeData)data).mElement:SmMultipleDependency.EMPTY;
            }

            @objid ("df11dc64-130a-4602-9cb8-4a3f1100d91c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NoteTypeData) data).mElement = new ArrayList<>(initialCapacity);
                return ((NoteTypeData) data).mElement;
            }

            @objid ("55ddea28-2cda-4cb1-94a7-15574df09dc9")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.ModelDep();
            }

        }

        @objid ("003aaa02-c4c3-1fd8-97fe-001ec947cd2a")
        public static class LocalElementSmDependency extends SmMultipleDependency {
            @objid ("ff709d93-82f1-4700-922f-cea7da2da7e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NoteTypeData)data).mLocalElement != null)? ((NoteTypeData)data).mLocalElement:SmMultipleDependency.EMPTY;
            }

            @objid ("cdd3b218-d089-48f0-b055-197ca30b76c7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NoteTypeData) data).mLocalElement = new ArrayList<>(initialCapacity);
                return ((NoteTypeData) data).mLocalElement;
            }

            @objid ("f6688828-75c8-4b02-b088-91dbf4bc90c6")
            @Override
            public SmDependency getSymetric() {
                return LocalNoteData.Metadata.LocalModelDep();
            }

        }

        @objid ("003b0f7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("719d2b79-679c-4b41-ad8d-91bb63f0d57a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerStereotype;
            }

            @objid ("0ce01d53-e0a2-4872-9623-ea418eedff3f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerStereotype = value;
            }

            @objid ("790fa615-3e9b-495f-a71e-021b2a44522c")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("003b8f30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("c24e36ed-7bf0-4125-8869-b92739cb0757")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerReference;
            }

            @objid ("4000c65e-c0d0-49ce-87ea-2ec609e38a46")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerReference = value;
            }

            @objid ("aab35f09-1518-4d07-a560-073ebc02d131")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("c390fed3-62cb-4e00-a1f6-4531f4b32172")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("67d58f93-22e2-46f1-9f6a-a08236567c53")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mLabelKey;
            }

            @objid ("2db4f71f-2af7-4753-9cb6-0b0f3eee3712")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mLabelKey = value;
            }

        }

    }

}
