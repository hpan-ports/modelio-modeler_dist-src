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
    @objid ("b2f83d35-fff2-4a38-abde-e5f365ff5360")
    @SmaMetaAttribute(metaName="BaseClass", type=String.class, smAttributeClass=Metadata.BaseClassSmAttribute.class)
     Object mBaseClass = "";

    @objid ("4994e54c-8a3b-442d-9c61-a584eb0a8bb1")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("1151a626-5046-46c9-8c40-167838371254")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("92341d76-e45b-4c73-a85f-ab7d86e06e4f")
    @SmaMetaAssociation(metaName="ConstrainedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ConstrainedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mConstrainedElement = null;

    @objid ("f6b5bd0f-ab6c-432f-b899-cf1650e297ef")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00982a7e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("85e226a9-bcb0-42a4-bb01-df5bc10ae49d")
        private static SmClass smClass = null;

        @objid ("c00eb899-a5c3-4131-833e-359f1ad43903")
        private static SmAttribute BaseClassAtt = null;

        @objid ("8846f7fc-215c-4253-9e8d-326067347455")
        private static SmAttribute BodyAtt = null;

        @objid ("dd48d0c0-112a-41ad-b616-0e40384a8546")
        private static SmAttribute LanguageAtt = null;

        @objid ("55ca4db7-bfbc-4b63-83f5-ed4414b062cd")
        private static SmDependency ConstrainedElementDep = null;

        @objid ("e56581ab-553a-4d9b-a0ad-e1ac44a71bcc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("602b3290-53b7-49cc-9e61-b61043ece39c")
        public static SmAttribute BaseClassAtt() {
            if (BaseClassAtt == null) {
            	BaseClassAtt = classof().getAttributeDef("BaseClass");
            }
            return BaseClassAtt;
        }

        @objid ("d83c1470-53b8-43b8-8282-190529570fba")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("6a0c5f89-135a-448d-879a-3b0599ddf640")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("17b78d3b-90b1-48ff-a979-f6c4b8c68a14")
        public static SmDependency ConstrainedElementDep() {
            if (ConstrainedElementDep == null) {
            	ConstrainedElementDep = classof().getDependencyDef("ConstrainedElement");
            }
            return ConstrainedElementDep;
        }

        @objid ("2b95f0fe-fb74-4ad3-a12c-d63436a47a3d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3e9b26d7-364b-45e5-896d-5829b0fa1f37")
        public static SmDependency getConstrainedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstrainedElementDep;
        }

        @objid ("8a28e487-3913-4680-ad72-f4d0809e20d4")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("dd89069d-84c0-4ac5-a99d-62c17ccbdf10")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("51a01c83-9cef-4861-8377-63cab53eff53")
        public static SmAttribute getBaseClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassAtt;
        }

        @objid ("00986bec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dc6e2f4e-e3f0-465b-a6cf-b1038b5700dc")
            public ISmObjectData createData() {
                return new ConstraintData();
            }

            @objid ("eb86fb17-e0db-4f0c-b108-b6e7b3398bd9")
            public SmObjectImpl createImpl() {
                return new ConstraintImpl();
            }

        }

        @objid ("00003b10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BaseClassSmAttribute extends SmAttribute {
            @objid ("626e41fb-4f45-4356-a96d-c5ba812b4e63")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBaseClass;
            }

            @objid ("ee4f4f51-939c-4a0f-9b68-b7211a65fd8a")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBaseClass = value;
            }

        }

        @objid ("00009cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("e9431268-5ec4-445e-95ee-3de90b49f328")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBody;
            }

            @objid ("f2ae8e9e-e5e2-4645-b767-b7caefad6974")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBody = value;
            }

        }

        @objid ("0000fd98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("27ad606c-f558-4b76-a19c-c20be6d1808d")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mLanguage;
            }

            @objid ("4e8b093a-82a4-4289-a6bc-1016b1554d44")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mLanguage = value;
            }

        }

        @objid ("00016238-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConstrainedElementSmDependency extends SmMultipleDependency {
            @objid ("db5a87cd-99b3-40b8-be78-bc328d80c3cf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConstraintData)data).mConstrainedElement != null)? ((ConstraintData)data).mConstrainedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("96f6aa45-cc6a-47fb-b3e5-e8dafb337648")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConstraintData) data).mConstrainedElement = new ArrayList<>(initialCapacity);
                return ((ConstraintData) data).mConstrainedElement;
            }

            @objid ("784e6883-147a-4c68-aaed-5fe4535aad51")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ConstraintDefinitionDep();
            }

        }

    }

}
