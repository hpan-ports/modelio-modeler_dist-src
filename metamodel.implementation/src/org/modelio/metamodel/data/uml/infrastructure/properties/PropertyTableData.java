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
    @objid ("a2c5993a-fa28-43fd-86bf-72cb9524c4ed")
    @SmaMetaAttribute(metaName="name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("461819a2-c1cb-4a34-b477-1b71cd699c63")
    @SmaMetaAttribute(metaName="content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("45228c6c-8ed2-4ed6-941b-adfdfacc79fe")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9d546f45-6ed0-4aad-820c-4ac8cac77140")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("7e5c5999-a350-4004-8594-81e2c6b8768e")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("0ab029cc-c86a-4b0c-8ff3-ffa476eb1896")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00060306-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("ffd833d6-557c-439b-9f68-04d17ed534b2")
        private static SmClass smClass = null;

        @objid ("644cb23b-48d4-4752-9f5c-6b21370046ba")
        private static SmAttribute nameAtt = null;

        @objid ("5a62043f-c842-4ec0-a9ad-7aeec656df9a")
        private static SmAttribute contentAtt = null;

        @objid ("b3b56881-dc6f-4902-a39e-81a388886823")
        private static SmDependency OwnerDep = null;

        @objid ("a4c44c8b-9fb4-4cad-9a50-54892c7d323b")
        private static SmDependency OwnerValDefDep = null;

        @objid ("4ace8317-ac5a-4615-bcf2-0463366f4092")
        private static SmDependency OwnerQueryDep = null;

        @objid ("987085a4-0f07-4c78-b7c2-efdd1be9eabf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3403b52f-cbdf-4939-a8da-76ed6b6a0a50")
        public static SmAttribute nameAtt() {
            if (nameAtt == null) {
            	nameAtt = classof().getAttributeDef("name");
            }
            return nameAtt;
        }

        @objid ("71416730-2402-441b-b229-0f1aac9ca112")
        public static SmAttribute contentAtt() {
            if (contentAtt == null) {
            	contentAtt = classof().getAttributeDef("content");
            }
            return contentAtt;
        }

        @objid ("11af39fd-8fd7-4c68-a007-3c8e63e4926c")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("8b7e1993-e6ed-4bf8-8979-8a1067e2923e")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("1390af28-2060-40a6-87e0-a45ac4f148fc")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("b2456a0d-9b80-40f7-905e-432a83b9c44d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("739a9841-c585-4360-bed6-d059e4143b3e")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return contentAtt;
        }

        @objid ("c9ed9534-43fd-425c-88f3-851374ca901a")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("ce33800c-aa72-4dcf-9547-79f4f956be40")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("04fb815d-5557-412d-9fb4-a11d78d4dc47")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("2c1a9602-1d09-4fd4-b171-477936cea885")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return nameAtt;
        }

        @objid ("00066486-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("eace65b8-10f9-4b6c-b062-29091ff14510")
            public ISmObjectData createData() {
                return new PropertyTableData();
            }

            @objid ("3f2c47cb-ccf1-4295-a077-fb1d20b8c94d")
            public SmObjectImpl createImpl() {
                return new PropertyTableImpl();
            }

        }

        @objid ("00074180-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("3d223a63-f901-4b35-927c-4e5af5ebe5b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwner;
            }

            @objid ("640a51aa-3dae-47a8-9f63-4cef83009632")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwner = value;
            }

            @objid ("607f0ac2-00de-4617-9e96-49f534899c18")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.PropertiesDep();
            }

        }

        @objid ("4bce00a5-281d-11e2-bf07-001ec947ccaf")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("6d6e60ce-604c-4f56-83f9-1ff2b38b1b7e")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mName;
            }

            @objid ("d9b92b48-0077-4c2e-a2cb-b02435d101ff")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mName = value;
            }

        }

        @objid ("4bd062cd-281d-11e2-bf07-001ec947ccaf")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("1e7e2a48-813e-43c6-912e-e013f3976b3a")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mContent;
            }

            @objid ("161c54d5-93c6-4c0b-ac00-fd94fcbb76be")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mContent = value;
            }

        }

        @objid ("5723e993-0ce4-439c-b721-d8b9cd22cf48")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("231840d7-531f-4f77-8aef-8dc420759a4f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerValDef;
            }

            @objid ("781f8ce8-4607-4d60-8dc4-8ae4b919d149")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerValDef = value;
            }

            @objid ("7f2add29-e979-4fd0-92c6-2017dedc6aa7")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ParametersDep();
            }

        }

        @objid ("98bda871-2541-4658-9fa2-cf78b46718de")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("66cc6147-d846-4cbd-b19e-23597cbcc3a0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwnerQuery;
            }

            @objid ("fcef3a48-e829-4ab5-8568-7c81a8cd5e2e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwnerQuery = value;
            }

            @objid ("ac4ce144-95f7-4b57-8783-d98c363d4ad4")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ParametersDep();
            }

        }

    }

}
