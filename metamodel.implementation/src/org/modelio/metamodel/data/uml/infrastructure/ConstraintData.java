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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintImpl;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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

@objid ("00859e2c-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Constraint.class, factory=ConstraintData.Metadata.ObjectFactory.class)
public class ConstraintData extends ModelElementData {
    @objid ("5b49d325-6ff6-42d2-b67a-27e98fb2e9cd")
    @SmaMetaAttribute(metaName="BaseClass", type=String.class, smAttributeClass=Metadata.BaseClassSmAttribute.class)
     Object mBaseClass = "";

    @objid ("304f188d-4569-4a68-9982-28e2cad733b7")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("cfdd73b9-370b-444a-975a-fb38bfd6ff13")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("9b51d8da-a193-4734-ad2a-1cab2d726215")
    @SmaMetaAssociation(metaName="ConstrainedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ConstrainedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mConstrainedElement = null;

    @objid ("3aba2548-5324-4479-9cca-1edf37851542")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00982a7e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2192ea84-4c4f-476e-977d-9ccd84c6d798")
        private static SmClass smClass = null;

        @objid ("15c1563a-50bd-45c9-9ffb-3939fda3c8dc")
        private static SmAttribute BaseClassAtt = null;

        @objid ("8038e113-7a95-42bb-9644-6bc7d31e6875")
        private static SmAttribute BodyAtt = null;

        @objid ("409b7391-e31a-48dd-af6e-97353ac9516d")
        private static SmAttribute LanguageAtt = null;

        @objid ("67246691-3be3-4dab-be18-cf7b1724ea47")
        private static SmDependency ConstrainedElementDep = null;

        @objid ("66bea0c6-1a6e-4aa7-8334-e1b1ab82c201")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e3af0a9a-9e50-474c-836c-d4586b5a067c")
        public static SmAttribute BaseClassAtt() {
            if (BaseClassAtt == null) {
            	BaseClassAtt = classof().getAttributeDef("BaseClass");
            }
            return BaseClassAtt;
        }

        @objid ("12c03a04-70ba-4853-9c35-fa5bd592bf89")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("ab909c64-0c2a-46f1-b66e-15d8baca73c4")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("33b895ae-83de-4a3e-98e4-23db43b8566a")
        public static SmDependency ConstrainedElementDep() {
            if (ConstrainedElementDep == null) {
            	ConstrainedElementDep = classof().getDependencyDef("ConstrainedElement");
            }
            return ConstrainedElementDep;
        }

        @objid ("853c78f7-d65a-46a1-a6b9-ddbf34c7f3a4")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("0da8705c-ed83-41bf-9d69-280b867cdc6e")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("12f032e4-55c9-48c0-b9de-0bebce991331")
        public static SmDependency getConstrainedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstrainedElementDep;
        }

        @objid ("4838b033-0e43-4c0b-b959-b666c0947edf")
        public static SmAttribute getBaseClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassAtt;
        }

        @objid ("bb300a13-99b7-4d4d-bf88-4d1bddc6a2fc")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00986bec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d732e715-2bde-4e3c-9a85-f6c382f0a5f5")
            public ISmObjectData createData() {
                return new ConstraintData();
            }

            @objid ("3829a919-6e9d-4755-aada-b506f76fd596")
            public SmObjectImpl createImpl() {
                return new ConstraintImpl();
            }

        }

        @objid ("00003b10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BaseClassSmAttribute extends SmAttribute {
            @objid ("1ac0ea98-b811-483b-b7af-9f055e25c099")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBaseClass;
            }

            @objid ("00971add-3adf-4b49-a605-eab7b8ed88dc")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBaseClass = value;
            }

        }

        @objid ("00009cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("17a2e9eb-a0ed-433d-b6ef-51cf07f9778a")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBody;
            }

            @objid ("89032494-51e7-4563-8014-3a785738cf6f")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBody = value;
            }

        }

        @objid ("0000fd98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("ac631f5d-b27f-4470-a828-48ebb152dab2")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mLanguage;
            }

            @objid ("37156bc9-0010-4ea3-85c2-493ac7df09d2")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mLanguage = value;
            }

        }

        @objid ("00016238-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConstrainedElementSmDependency extends SmMultipleDependency {
            @objid ("6ba5aa26-eaaa-4787-9a03-ed065a125206")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConstraintData)data).mConstrainedElement != null)? ((ConstraintData)data).mConstrainedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("0315a123-4050-4551-8056-81e96b4c306b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConstraintData) data).mConstrainedElement = new ArrayList<>(initialCapacity);
                return ((ConstraintData) data).mConstrainedElement;
            }

            @objid ("fe316cfe-887d-4f7d-b4f6-828fb437b9f8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ConstraintDefinitionDep();
            }

        }

    }

}
