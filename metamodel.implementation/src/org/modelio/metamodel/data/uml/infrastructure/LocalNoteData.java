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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.LocalNoteImpl;
import org.modelio.metamodel.uml.infrastructure.LocalNote;
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

@objid ("00878a7a-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=LocalNote.class, factory=LocalNoteData.Metadata.ObjectFactory.class)
public class LocalNoteData extends ElementData {
    @objid ("2b777b41-d519-4e6b-aa5b-97f8016b5eb9")
    @SmaMetaAttribute(metaName="Name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("716daaed-83c7-4c2d-9a0e-308f3178f518")
    @SmaMetaAttribute(metaName="Content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("027f04d6-27a6-4078-b4e3-1c1e96d57caf")
    @SmaMetaAttribute(metaName="IsVisible", type=Boolean.class, smAttributeClass=Metadata.IsVisibleSmAttribute.class)
     Object mIsVisible = false;

    @objid ("14740fb4-53a4-40b3-9a9e-e42cb334e4e9")
    @SmaMetaAssociation(metaName="LocalModel", typeDataClass=NoteTypeData.class, min=1, max=1, smAssociationClass=Metadata.LocalModelSmDependency.class, partof = true)
     SmObjectImpl mLocalModel;

    @objid ("0c83d8d7-c30b-4b83-92fa-2918529916ef")
    @SmaMetaAssociation(metaName="LocalSubject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.LocalSubjectSmDependency.class, partof = true)
     SmObjectImpl mLocalSubject;

    @objid ("cb31ca04-1e64-4883-9d47-fae8b5181d54")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0054ef0c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f7836834-523d-44d6-8bc6-70b216ed2b28")
        private static SmClass smClass = null;

        @objid ("7d3ad139-1fb8-4169-9ffc-16b089ef1dc9")
        private static SmAttribute NameAtt = null;

        @objid ("077ad157-19e8-4e37-8321-e840dac993f2")
        private static SmAttribute ContentAtt = null;

        @objid ("f08bbb76-2ef2-4ac1-af3b-8bcf888fcf91")
        private static SmAttribute IsVisibleAtt = null;

        @objid ("a46de957-67cb-45f2-927c-70d6aa639c4d")
        private static SmDependency LocalModelDep = null;

        @objid ("c9ec9463-4e88-4024-8494-dcb9263aa175")
        private static SmDependency LocalSubjectDep = null;

        @objid ("f1f9b503-a88e-487e-b6f5-97b3427be93c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LocalNoteData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08f18072-548e-4307-bab3-64232d733cce")
        public static SmAttribute NameAtt() {
            if (NameAtt == null) {
            	NameAtt = classof().getAttributeDef("Name");
            }
            return NameAtt;
        }

        @objid ("351792a1-7506-443b-bfc7-70b73ff95e23")
        public static SmAttribute ContentAtt() {
            if (ContentAtt == null) {
            	ContentAtt = classof().getAttributeDef("Content");
            }
            return ContentAtt;
        }

        @objid ("a22fff92-edec-4dab-8612-26cd31a446e3")
        public static SmAttribute IsVisibleAtt() {
            if (IsVisibleAtt == null) {
            	IsVisibleAtt = classof().getAttributeDef("IsVisible");
            }
            return IsVisibleAtt;
        }

        @objid ("8f95fdeb-7231-465a-b867-5ad45ff0c7a7")
        public static SmDependency LocalModelDep() {
            if (LocalModelDep == null) {
            	LocalModelDep = classof().getDependencyDef("LocalModel");
            }
            return LocalModelDep;
        }

        @objid ("1207c00e-a0ad-470e-be5a-6762143d370e")
        public static SmDependency LocalSubjectDep() {
            if (LocalSubjectDep == null) {
            	LocalSubjectDep = classof().getDependencyDef("LocalSubject");
            }
            return LocalSubjectDep;
        }

        @objid ("5bce5ffa-1854-4ec3-9e53-7a9f483f48dc")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NameAtt;
        }

        @objid ("87566bf1-562e-49f6-9b67-d960a2db049d")
        public static SmDependency getLocalSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalSubjectDep;
        }

        @objid ("37ad1191-e08a-4e98-8572-3bc061ebb21f")
        public static SmAttribute getIsVisibleAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsVisibleAtt;
        }

        @objid ("8ca5e4d0-7a4c-4be8-98e9-85d192964596")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dc346fd2-f078-4298-955b-60c32d40ef37")
        public static SmDependency getLocalModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalModelDep;
        }

        @objid ("cfd68e07-d8ae-48b3-bdfc-6ec2db064853")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContentAtt;
        }

        @objid ("00553070-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cbc263bb-9838-4845-b608-65c1b917aa7e")
            public ISmObjectData createData() {
                return new LocalNoteData();
            }

            @objid ("f1137e76-61ca-412a-b690-fa9ae28feb78")
            public SmObjectImpl createImpl() {
                return new LocalNoteImpl();
            }

        }

        @objid ("00559376-c4c4-1fd8-97fe-001ec947cd2a")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("4e230887-6922-4c74-907c-db2657453c0f")
            public Object getValue(ISmObjectData data) {
                return ((LocalNoteData) data).mName;
            }

            @objid ("a4c644a1-c2af-4c35-8347-2af9803f83ab")
            public void setValue(ISmObjectData data, Object value) {
                ((LocalNoteData) data).mName = value;
            }

        }

        @objid ("0055f410-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("d5555499-a28a-418d-a9f7-74c0ae1b826a")
            public Object getValue(ISmObjectData data) {
                return ((LocalNoteData) data).mContent;
            }

            @objid ("4e7fc8b2-275c-4d85-9f04-439ee16b961a")
            public void setValue(ISmObjectData data, Object value) {
                ((LocalNoteData) data).mContent = value;
            }

        }

        @objid ("005653e2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsVisibleSmAttribute extends SmAttribute {
            @objid ("e229a4af-94f4-45f2-b0e9-d17a88ead14a")
            public Object getValue(ISmObjectData data) {
                return ((LocalNoteData) data).mIsVisible;
            }

            @objid ("dc10f81a-55bc-44d6-9fb4-d40149c8107a")
            public void setValue(ISmObjectData data, Object value) {
                ((LocalNoteData) data).mIsVisible = value;
            }

        }

        @objid ("0056c020-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LocalSubjectSmDependency extends SmSingleDependency {
            @objid ("1b0bd9d2-d699-4ba4-9333-ec5f63825aa8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalNoteData) data).mLocalSubject;
            }

            @objid ("e8ca3ccb-4e4d-418e-8acc-2458ca646629")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalNoteData) data).mLocalSubject = value;
            }

            @objid ("21c37677-d47c-4856-93ea-97948ab29329")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.LocalDescriptorDep();
            }

        }

        @objid ("00573668-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LocalModelSmDependency extends SmSingleDependency {
            @objid ("649888e5-6c46-452c-8fb9-0d60bed2de32")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LocalNoteData) data).mLocalModel;
            }

            @objid ("341cc893-66c2-4b72-b1e7-b0272ba25600")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LocalNoteData) data).mLocalModel = value;
            }

            @objid ("465e5d0e-6e1c-4e2e-a02a-9e26a91345e7")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.LocalElementDep();
            }

        }

    }

}
