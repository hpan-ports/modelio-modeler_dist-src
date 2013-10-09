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
    @objid ("992eadcd-7658-49a4-9048-ef54b07e7de2")
    @SmaMetaAssociation(metaName="Element", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.ElementSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mElement = null;

    @objid ("1b6b8b58-13d4-43fc-a854-63e8c2a259f7")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("623af384-de4d-4158-8bba-e52878f9c45a")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("e2a33e12-c46a-4f74-9690-3f2e9ceb2741")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("c409a55f-db0f-47f7-9972-0d50fbebb55d")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("2ae4169a-8195-469b-85c9-6711f5bf93c7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038da56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bc4b3689-2905-48c6-a258-7e1531d80f2c")
        private static SmClass smClass = null;

        @objid ("4d9ed528-d727-4efc-9307-b781239acd0a")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("698cc396-87db-4f89-8f88-f9c162ac2cc3")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("3094b384-62a4-43d1-b6a8-d10146c804e6")
        private static SmDependency ElementDep = null;

        @objid ("dc28ef85-2a96-47ea-8019-c6d400edc548")
        private static SmDependency LocalElementDep = null;

        @objid ("fd4ee0d7-8740-479b-ac41-74c220c12ca4")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("554a868f-c586-4bca-bf26-9dbda7eade05")
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
