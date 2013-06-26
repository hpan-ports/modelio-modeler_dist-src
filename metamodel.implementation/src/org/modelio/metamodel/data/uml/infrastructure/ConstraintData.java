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
    @objid ("a48fa8a1-34b8-46f5-8387-801acf304332")
    @SmaMetaAttribute(metaName="BaseClass", type=String.class, smAttributeClass=Metadata.BaseClassSmAttribute.class)
     Object mBaseClass = "";

    @objid ("cd11ce35-5b5e-4955-88b8-db4150d4f56e")
    @SmaMetaAttribute(metaName="Body", type=String.class, smAttributeClass=Metadata.BodySmAttribute.class)
     Object mBody = "";

    @objid ("13c67fba-820b-40e7-8b48-dd47c2203beb")
    @SmaMetaAttribute(metaName="Language", type=String.class, smAttributeClass=Metadata.LanguageSmAttribute.class)
     Object mLanguage = "";

    @objid ("d8244f1d-dab7-484c-9ada-1bde1f7f48b1")
    @SmaMetaAssociation(metaName="ConstrainedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ConstrainedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mConstrainedElement = null;

    @objid ("7be7c61b-5480-4ee3-8d00-f134cea46c11")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00982a7e-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e6e192f6-d9e2-4751-934c-cac2e5acbd19")
        private static SmClass smClass = null;

        @objid ("10d99b48-623b-45dc-a67a-5764161a3623")
        private static SmAttribute BaseClassAtt = null;

        @objid ("eca3217c-a29a-49b3-a37f-89ad6196b081")
        private static SmAttribute BodyAtt = null;

        @objid ("609d4b73-44dd-48e0-90a9-80790c0014b5")
        private static SmAttribute LanguageAtt = null;

        @objid ("644883b9-69fe-4bab-aa59-eab95c37b427")
        private static SmDependency ConstrainedElementDep = null;

        @objid ("ee40c935-a983-478c-a962-9739bb6c7cb2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ConstraintData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("eac93759-e0f7-40bc-be32-9b5804faceff")
        public static SmAttribute BaseClassAtt() {
            if (BaseClassAtt == null) {
            	BaseClassAtt = classof().getAttributeDef("BaseClass");
            }
            return BaseClassAtt;
        }

        @objid ("dbcf68cf-f89c-4c14-adc8-9ff86fcac6ab")
        public static SmAttribute BodyAtt() {
            if (BodyAtt == null) {
            	BodyAtt = classof().getAttributeDef("Body");
            }
            return BodyAtt;
        }

        @objid ("6fcecd74-7c56-4235-8af3-7d3d66d62f46")
        public static SmAttribute LanguageAtt() {
            if (LanguageAtt == null) {
            	LanguageAtt = classof().getAttributeDef("Language");
            }
            return LanguageAtt;
        }

        @objid ("8ded9ad2-8036-4e65-a4e5-519a7fc5386b")
        public static SmDependency ConstrainedElementDep() {
            if (ConstrainedElementDep == null) {
            	ConstrainedElementDep = classof().getDependencyDef("ConstrainedElement");
            }
            return ConstrainedElementDep;
        }

        @objid ("6852f8da-09b2-44a7-a096-94e7ff5864bd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b59afc19-1088-43fd-98f5-2cdbfd090973")
        public static SmAttribute getBodyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BodyAtt;
        }

        @objid ("a0238d96-6106-42b8-bdef-446e3fce9d1a")
        public static SmAttribute getBaseClassAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassAtt;
        }

        @objid ("4cb78fef-3388-46d2-87de-103cca6e4bf4")
        public static SmAttribute getLanguageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LanguageAtt;
        }

        @objid ("82191684-aa27-4707-a1a7-2fc5c4e6ecf3")
        public static SmDependency getConstrainedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConstrainedElementDep;
        }

        @objid ("00986bec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9fbefb18-548b-498c-8942-b80f98c0aca4")
            public ISmObjectData createData() {
                return new ConstraintData();
            }

            @objid ("e62de3d2-f2ee-462d-8810-0f3b82b8ba6b")
            public SmObjectImpl createImpl() {
                return new ConstraintImpl();
            }

        }

        @objid ("00003b10-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BaseClassSmAttribute extends SmAttribute {
            @objid ("1e36362e-f5fd-4e1a-8ec7-cac8f668dd27")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBaseClass;
            }

            @objid ("f2692c59-94d3-4c9b-a291-f5bdc84047fa")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBaseClass = value;
            }

        }

        @objid ("00009cd6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BodySmAttribute extends SmAttribute {
            @objid ("1cfe85c9-7b0b-4d79-84ef-4f02d7e8e54e")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mBody;
            }

            @objid ("2bb8746f-ae38-4252-9840-55c6e8d3848d")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mBody = value;
            }

        }

        @objid ("0000fd98-c4c3-1fd8-97fe-001ec947cd2a")
        public static class LanguageSmAttribute extends SmAttribute {
            @objid ("297f183a-7e53-4a17-8439-3bc49ad9415e")
            public Object getValue(ISmObjectData data) {
                return ((ConstraintData) data).mLanguage;
            }

            @objid ("2d45108d-8f1a-4bda-badd-ca00a7681803")
            public void setValue(ISmObjectData data, Object value) {
                ((ConstraintData) data).mLanguage = value;
            }

        }

        @objid ("00016238-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConstrainedElementSmDependency extends SmMultipleDependency {
            @objid ("34487356-6f05-4f34-9f0e-0e5f9a05f89e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ConstraintData)data).mConstrainedElement != null)? ((ConstraintData)data).mConstrainedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("17a74a3a-556b-48c6-ae27-f98d898693ad")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ConstraintData) data).mConstrainedElement = new ArrayList<>(initialCapacity);
                return ((ConstraintData) data).mConstrainedElement;
            }

            @objid ("10440a9b-593e-49a4-a5ca-382104ee0b0d")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ConstraintDefinitionDep();
            }

        }

    }

}
