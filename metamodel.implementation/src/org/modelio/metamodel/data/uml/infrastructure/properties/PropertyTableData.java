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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableImpl;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
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

@objid ("0069a7f8-ec87-1098-b22e-001ec947cd2a")
@SmaMetaClass(mmClass=PropertyTable.class, factory=PropertyTableData.Metadata.ObjectFactory.class)
public class PropertyTableData extends ElementData {
    @objid ("03a712aa-2e79-4c50-a081-516bd30ee0e7")
    @SmaMetaAttribute(metaName="name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("4c61f5f0-14ef-4eb3-870d-a4673620888f")
    @SmaMetaAttribute(metaName="content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("278767ed-aa19-4480-94f9-7e0bf14ba7d8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("c1ccdcba-18f4-416b-b737-1d89d6b398f5")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("5a90f3a9-e440-4855-b971-6ea766c4414f")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("0abc6400-f166-47f3-954b-bb12a738ad7d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00060306-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("af7656c7-44b1-4175-aee3-26a157011e43")
        private static SmClass smClass = null;

        @objid ("a65effa2-6734-4c8e-b62c-b01a0758dc4c")
        private static SmAttribute nameAtt = null;

        @objid ("e640baa5-c5a3-45e8-9fc9-dd4d77535e1b")
        private static SmAttribute contentAtt = null;

        @objid ("54d2e787-91e8-4158-9500-43326fd97dbb")
        private static SmDependency OwnerDep = null;

        @objid ("303cf07c-70d1-43de-b4a0-6b0281dd7cc3")
        private static SmDependency OwnerValDefDep = null;

        @objid ("fe4a73d5-f94e-49bc-9843-45901e8e7537")
        private static SmDependency OwnerQueryDep = null;

        @objid ("6e0f47c1-4931-4fbc-a7c1-d910c39ad88a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("31902eff-e802-4808-9e73-b7d96ab7ac9f")
        public static SmAttribute nameAtt() {
            if (nameAtt == null) {
            	nameAtt = classof().getAttributeDef("name");
            }
            return nameAtt;
        }

        @objid ("a2e5c8ab-292f-485b-babc-5855ba20b44d")
        public static SmAttribute contentAtt() {
            if (contentAtt == null) {
            	contentAtt = classof().getAttributeDef("content");
            }
            return contentAtt;
        }

        @objid ("179d3a2e-eb97-4a25-bb98-0a92c91537f6")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("d7ca264a-253a-4636-9b7b-e8994f7355ed")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("68359555-e828-4b89-83f9-9472ae614260")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("06d5cf10-624d-49c4-bbb3-63ccec5f7ade")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("53a6030f-4da5-421a-8f67-e3f9686fefb2")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return nameAtt;
        }

        @objid ("179469ac-b8e8-4012-bee5-d91bbaa1904d")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("3607ac29-bbcc-4f5e-9df9-1bf3ce229524")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return contentAtt;
        }

        @objid ("9686dffb-a961-4960-bf14-193a1a13e7ee")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("a1df366d-c139-4bd8-9a1f-e0836f9a0d37")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("00066486-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d8cffbf1-76d8-41e6-b8d3-f0c18020580b")
            public ISmObjectData createData() {
                return new PropertyTableData();
            }

            @objid ("031a3fd6-5f3a-450a-a36d-80049df7badd")
            public SmObjectImpl createImpl() {
                return new PropertyTableImpl();
            }

        }

        @objid ("00074180-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("0620e1f9-8707-46a7-ad9d-077340c3c3c7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwner;
            }

            @objid ("4100e6d6-2e44-4af5-989d-a77e3c49bf91")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwner = value;
            }

            @objid ("47afd4b5-7472-48a8-8a1f-80880be52fa1")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.PropertiesDep();
            }

        }

        @objid ("4bce00a5-281d-11e2-bf07-001ec947ccaf")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("b5595a79-9ccb-40e5-a56d-1807bb729177")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mName;
            }

            @objid ("b26109d2-1fb4-4029-b4b6-6848eab677e8")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mName = value;
            }

        }

        @objid ("4bd062cd-281d-11e2-bf07-001ec947ccaf")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("bad1d020-949f-4344-915d-28287139838b")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mContent;
            }

            @objid ("17ac87bb-5362-46e3-afba-996182e17fd8")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mContent = value;
            }

        }

        @objid ("5723e993-0ce4-439c-b721-d8b9cd22cf48")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("a4d0466a-0102-4581-b0c3-158667c26dbb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerValDef;
            }

            @objid ("270486a0-37c2-4972-99fa-6bc7b516819e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerValDef = value;
            }

            @objid ("fd60b500-c403-4deb-a0c7-9dc2af84a13b")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ParametersDep();
            }

        }

        @objid ("98bda871-2541-4658-9fa2-cf78b46718de")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("377f9acb-3a78-48fd-b4e6-8ffa28d1b39a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerQuery;
            }

            @objid ("389579b4-dbd8-4323-a414-049980723339")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerQuery = value;
            }

            @objid ("a3a28613-b12e-4a7b-9653-e2f85dbd76b3")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ParametersDep();
            }

        }

    }

}
