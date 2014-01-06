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
    @objid ("82dfa024-27e8-4bee-a6c1-02d305d2fee0")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("ec34995b-5146-4425-8920-22cd25dac280")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("9bbe428b-97fc-425b-9ecd-071e2fc41077")
    @SmaMetaAssociation(metaName="Element", typeDataClass=NoteData.class, min=0, max=-1, smAssociationClass=Metadata.ElementSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mElement = null;

    @objid ("f7ca0443-269a-4cb6-8952-06fadbed78b4")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("65849f75-f88b-482e-acc8-e4f0f92aef2d")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("ab4570a9-050c-4a78-94d0-4cb4b8caa9af")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0038da56-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("50f31dea-50f1-4540-b79d-e7f431bd604c")
        private static SmClass smClass = null;

        @objid ("0372e03c-01f0-4aa2-88c0-9e240aa77444")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("ee3da11d-4a3b-4ef9-9335-cee8a5748d4c")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("7633a03e-ec3b-4c75-86a8-b51dbd3291cd")
        private static SmDependency ElementDep = null;

        @objid ("aeb43dba-2d3c-47db-ac1a-aab05b425c1d")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("41d4f6a6-3b12-4b19-9a86-61df2bd720c3")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("4829a3e3-0fda-49e4-bfa2-df0e060fbcfe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a7733618-c239-4ec6-bb28-960a680ce34d")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("99c40d10-a328-4d0b-af99-a357ab53477f")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("040049b3-628a-4db7-92e4-96f5b5e10ad7")
        public static SmDependency ElementDep() {
            if (ElementDep == null) {
            	ElementDep = classof().getDependencyDef("Element");
            }
            return ElementDep;
        }

        @objid ("889cbe9f-b583-4fbc-978c-d60222251ec2")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("fd6b697a-324f-4db9-b49b-9a4ece871d1b")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("a1056bb7-8108-400c-8257-7b63fe8a012b")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("b6727e36-70c3-4847-984b-f7da39cf7f3c")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("8228a0c6-58a6-425e-bf0a-c4f28a762e22")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f5fd92de-4cc8-4de0-aff7-24dfc90a7eb9")
        public static SmDependency getElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ElementDep;
        }

        @objid ("c578fd16-5ade-455c-9da2-4913bb4b292a")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("b5216898-9599-41ce-83d3-88018ff8fda0")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("00391b74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1a35607b-63aa-43b3-8072-dcde18b23db9")
            public ISmObjectData createData() {
                return new NoteTypeData();
            }

            @objid ("fcb84d18-a7a4-4857-860b-1b7496436650")
            public SmObjectImpl createImpl() {
                return new NoteTypeImpl();
            }

        }

        @objid ("00397f74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("df027f1c-fd8d-4c13-a3ba-a32614ce0d51")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mIsHidden;
            }

            @objid ("41a08d3e-8a5e-4d03-83b3-b95bd1ea9e7b")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mIsHidden = value;
            }

        }

        @objid ("003a44f4-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ElementSmDependency extends SmMultipleDependency {
            @objid ("92f8faa2-c9f4-4384-946b-8f80b5ecee82")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((NoteTypeData)data).mElement != null)? ((NoteTypeData)data).mElement:SmMultipleDependency.EMPTY;
            }

            @objid ("bad5d563-c8e2-451d-a4c7-f856f3484566")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((NoteTypeData) data).mElement = new ArrayList<>(initialCapacity);
                return ((NoteTypeData) data).mElement;
            }

            @objid ("3186b409-e2e4-4431-b0c9-1966eb5e0dc4")
            @Override
            public SmDependency getSymetric() {
                return NoteData.Metadata.ModelDep();
            }

        }

        @objid ("003b0f7e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("082ce303-42de-456d-9fc4-723f5911bc0b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerStereotype;
            }

            @objid ("61ac79ea-2084-49aa-8aba-86f953fdfc5a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerStereotype = value;
            }

            @objid ("fad5bc1a-7378-42a7-8f30-82dbbf44bf17")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("003b8f30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("865abaff-0c5f-49d4-9668-b7e3bc442ed1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mOwnerReference;
            }

            @objid ("d8eca4aa-5e84-40bb-87e0-9ae4f9a85cca")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteTypeData) data).mOwnerReference = value;
            }

            @objid ("f2abec46-354a-4203-a5dc-8cebedef380d")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedNoteTypeDep();
            }

        }

        @objid ("c390fed3-62cb-4e00-a1f6-4531f4b32172")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("f6491046-dfd9-4fc4-9e3f-6404b6f38025")
            public Object getValue(ISmObjectData data) {
                return ((NoteTypeData) data).mLabelKey;
            }

            @objid ("00005b32-9d7b-43ec-b450-eacf2f199ecd")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteTypeData) data).mLabelKey = value;
            }

        }

    }

}
