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
    @objid ("a5d39d26-7ce6-4627-b592-aeb348cabb42")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("f601964f-6fa5-47b2-bb7a-eaa11b96c22c")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("ae557780-8f03-40c6-8f56-ddcccb2575fe")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("202b28ae-50f0-4000-99ff-70363458e158")
    @SmaMetaAssociation(metaName="Element", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.ElementSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mElement = null;

    @objid ("d28244df-afd7-426b-85f9-739b3870795c")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("c53bc2ab-5261-473e-8b9b-a2c786069472")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("48bf55e8-a70c-46fc-bad4-26489f715ae8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038da56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ef468101-a0f2-4277-9a1b-f0b4bebc5144")
        private static SmClass smClass = null;

        @objid ("5a860acf-b461-445b-9076-2b09778b0fff")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("0725f1b4-6cd7-4d0d-b117-71b7ede6efd9")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("bc22da5a-641f-47ec-b91a-c409fd1bf3ea")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("36fb15c0-ecaa-4a4b-9dd0-5673efe68ac2")
        private static SmDependency ElementDep = null;

        @objid ("4ad0081b-b2e3-470d-9a83-739b04dc308a")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("1e14d1eb-7f18-42c1-99f6-6ff99bc1a098")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("a2083697-d146-447c-85c7-576e3aaa2a85")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("66d7997a-3c2e-4175-8edd-3e2771cca9d8")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("01bfccfa-ae39-4669-ba91-2d558d333691")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("54f4f1c6-396b-4d66-8dee-88e68b936363")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("4df12127-deac-4ee0-acf7-5487bbbd41b1")
        public static SmDependency ElementDep() {
            if (ElementDep == null) {
            	ElementDep = classof().getDependencyDef("Element");
            }
            return ElementDep;
        }

        @objid ("410b1231-c6b7-4d51-bfa1-bf56368379d7")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("2b43ec12-62c3-4fb9-86d7-008399967e0a")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("e131c6cf-1ff5-4c8c-8683-991d2b4593d9")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("e318ddd3-3973-4314-9ae9-e8f729f12840")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("a1ef0661-f92f-42e6-9103-18a3e77b48b8")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("dfd98409-1c86-4a0d-844c-020a98f27417")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("7a64c3a1-260a-452b-85d2-87c9cb76256d")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("ec3c1114-30be-4c8a-af34-163906ba98a4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c57d042d-83ca-4ffe-a8dc-2b8d2ca00b9d")
        public static SmDependency getElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ElementDep;
        }

        @objid ("00391b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8dfa2afa-d73d-4fa5-a7f5-09376915239a")
            public ISmObjectData createData() {
                return new NoteTypeData();
            }

            @objid ("012ce056-3238-4320-bece-5a42fdc2fbf5")
            public SmObjectImpl createImpl() {
                return new NoteTypeImpl();
            }

        }

        @objid ("00397f74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("68511506-7d21-41d2-a2ac-122ab5b17108")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mIsHidden;
            }

            @objid ("94474f06-30db-46db-a5f9-3571fe22cb0f")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mIsHidden = value;
            }

        }

        @objid ("003a44f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ElementSmDependency extends SmMultipleDependency {
            @objid ("9c25fcde-e1f8-46d2-8520-2894ed18e7dd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NoteTypeData)data).mElement != null)? ((NoteTypeData)data).mElement:SmMultipleDependency.EMPTY;
            }

            @objid ("9670f159-2bec-4d58-9489-bbd22e1b1f2c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NoteTypeData) data).mElement = new ArrayList<>(initialCapacity);
                return ((NoteTypeData) data).mElement;
            }

            @objid ("c782e221-787b-4bf3-8042-835f0a9c4001")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.ModelDep();
            }

        }

        @objid ("003b0f7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("b8939b15-b0f7-4347-a9cb-0ab14e3b9a4c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerStereotype;
            }

            @objid ("3217ace6-12cf-49d1-8e08-f00768d9bd32")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerStereotype = value;
            }

            @objid ("4a6e032b-ab2c-4858-b8f7-f5947df77e18")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("003b8f30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("5405f1f1-939a-41ad-bfe2-01e461ff53b8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerReference;
            }

            @objid ("b46cf147-891d-4f94-91b8-8515df6be4b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerReference = value;
            }

            @objid ("34d78e99-f083-4cdf-b5a2-2deb1aaa6997")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("c390fed3-62cb-4e00-a1f6-4531f4b32172")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("e6cf8c7a-b15d-495e-9f28-6c67adae8989")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mLabelKey;
            }

            @objid ("2540e4c5-b17e-49ee-a477-d01d0fb11b4f")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mLabelKey = value;
            }

        }

        @objid ("d3b69813-78de-4f13-94fd-14251d21ddb7")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("50114609-5d54-4bf0-ac3a-2fe2657f97b4")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mMimeType;
            }

            @objid ("286954b4-818f-4f2c-bbf9-f241801fa582")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mMimeType = value;
            }

        }

    }

}
