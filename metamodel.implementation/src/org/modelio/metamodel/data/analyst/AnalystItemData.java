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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.data.analyst.AnalystPropertyTableData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.analyst.AnalystItemImpl;
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

@objid ("d56b278b-bf80-40c6-a568-104b8de90603")
@SmaMetaClass(mmClass=AnalystItem.class, factory=AnalystItemData.Metadata.ObjectFactory.class)
public abstract class AnalystItemData extends ModelElementData {
    @objid ("ffbf8331-fa9d-432b-ab12-1c9f2c37fae4")
    @SmaMetaAttribute(metaName="Definition", type=String.class, smAttributeClass=Metadata.DefinitionSmAttribute.class)
     Object mDefinition = "";

    @objid ("c8c7d37d-0259-4361-b01f-b484ddd1e408")
    @SmaMetaAssociation(metaName="AnalystProperties", typeDataClass=AnalystPropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.AnalystPropertiesSmDependency.class, component = true)
     SmObjectImpl mAnalystProperties;

    @objid ("76dc1375-244a-43f8-95ca-179ec261f9b3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("02ff5cdd-9877-466c-8285-f1b4962fbef1")
    public static class Metadata {
        @objid ("d10bff36-5735-4e7e-8d9e-66d0ffa92117")
        private static SmClass smClass = null;

        @objid ("1128ed5b-6766-45a1-8164-281a01e5898e")
        private static SmAttribute DefinitionAtt = null;

        @objid ("9943920d-37b9-457f-8606-bb2a0b0cb95c")
        private static SmDependency AnalystPropertiesDep = null;

        @objid ("3393d884-6203-428e-9fc5-843b8e11e0f2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("06773cf5-91b7-4751-b3bf-bc0f361805d7")
        public static SmAttribute DefinitionAtt() {
            if (DefinitionAtt == null) {
            	DefinitionAtt = classof().getAttributeDef("Definition");
            }
            return DefinitionAtt;
        }

        @objid ("6bbd5b04-9738-453e-b755-3304b2108b79")
        public static SmDependency AnalystPropertiesDep() {
            if (AnalystPropertiesDep == null) {
            	AnalystPropertiesDep = classof().getDependencyDef("AnalystProperties");
            }
            return AnalystPropertiesDep;
        }

        @objid ("f17a9b16-8a49-44cc-b20c-b38b87a798b7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e7af5449-ae55-4039-9929-ef3b92a2c2f0")
        public static SmAttribute getDefinitionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionAtt;
        }

        @objid ("a12f6a78-e0c7-4e56-a6b1-af8113b832a7")
        public static SmDependency getAnalystPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystPropertiesDep;
        }

        @objid ("fda94f61-2256-4668-9a92-1bb3f1942409")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("93a48532-c055-47cc-afa1-3ed6989f9ba3")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("67a0abc0-e543-4b11-a631-5b354609ea08")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("5f88e06e-6ed0-4c60-9c2d-c61ff8169506")
        public static class DefinitionSmAttribute extends SmAttribute {
            @objid ("6afbe28d-9c9e-43cf-83bc-146ae414c286")
            public Object getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mDefinition;
            }

            @objid ("108f63d6-1166-405e-b28e-75de71457966")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystItemData) data).mDefinition = value;
            }

        }

        @objid ("067a03ba-79ed-4568-b849-c9b6e04277c1")
        public static class AnalystPropertiesSmDependency extends SmSingleDependency {
            @objid ("27290843-af81-48a1-aead-c10ac9853295")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mAnalystProperties;
            }

            @objid ("5e1bbf4b-8d04-4728-b2d8-1d314e2ea563")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystItemData) data).mAnalystProperties = value;
            }

            @objid ("b8ccec8a-df1d-4680-a820-45848dc91250")
            @Override
            public SmDependency getSymetric() {
                return AnalystPropertyTableData.Metadata.AnalystOwnerDep();
            }

        }

    }

}
