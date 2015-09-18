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
    @objid ("82ee9665-eacb-45dc-91ef-cbbcf1fca2b3")
    @SmaMetaAttribute(metaName="Definition", type=String.class, smAttributeClass=Metadata.DefinitionSmAttribute.class)
     Object mDefinition = "";

    @objid ("cbeea4c0-56ff-46ba-bb3f-f4e6f85884e2")
    @SmaMetaAssociation(metaName="AnalystProperties", typeDataClass=AnalystPropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.AnalystPropertiesSmDependency.class, component = true)
     SmObjectImpl mAnalystProperties;

    @objid ("153b4ad8-0935-4d8d-8646-e5f8e43c8ac5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("02ff5cdd-9877-466c-8285-f1b4962fbef1")
    public static class Metadata {
        @objid ("2caedf36-3a9d-4a95-9cda-6731d059d7e2")
        private static SmClass smClass = null;

        @objid ("3fb97bca-a5eb-472f-8373-995fc09ea3d6")
        private static SmAttribute DefinitionAtt = null;

        @objid ("d62a1cc0-33b5-4b41-8c1f-70a28db6d4f2")
        private static SmDependency AnalystPropertiesDep = null;

        @objid ("82c3b969-031f-4aa5-95f0-fd77354a6a07")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("448877a9-f740-4489-b32f-a29cf7dd0a8c")
        public static SmAttribute DefinitionAtt() {
            if (DefinitionAtt == null) {
            	DefinitionAtt = classof().getAttributeDef("Definition");
            }
            return DefinitionAtt;
        }

        @objid ("e292c6a6-792d-49da-a682-f0830660c671")
        public static SmDependency AnalystPropertiesDep() {
            if (AnalystPropertiesDep == null) {
            	AnalystPropertiesDep = classof().getDependencyDef("AnalystProperties");
            }
            return AnalystPropertiesDep;
        }

        @objid ("e6e4f6ad-0a21-47ba-b77f-c9a7f4452afd")
        public static SmDependency getAnalystPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystPropertiesDep;
        }

        @objid ("7d6623f2-2094-4107-b84b-a8c74077ac12")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4fabef19-f9eb-46a3-bafb-f7b843c642be")
        public static SmAttribute getDefinitionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionAtt;
        }

        @objid ("fda94f61-2256-4668-9a92-1bb3f1942409")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("28306399-dbb0-4eb5-a8a5-ddf753873272")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("288bb85e-149d-4ee5-ad88-47b97c192160")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("5f88e06e-6ed0-4c60-9c2d-c61ff8169506")
        public static class DefinitionSmAttribute extends SmAttribute {
            @objid ("37c9439d-829c-461d-b111-ee22aa021695")
            public Object getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mDefinition;
            }

            @objid ("4e401e07-2835-409b-a72a-f38684989adf")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystItemData) data).mDefinition = value;
            }

        }

        @objid ("067a03ba-79ed-4568-b849-c9b6e04277c1")
        public static class AnalystPropertiesSmDependency extends SmSingleDependency {
            @objid ("9b4c2c29-f60b-4177-a042-2d828931f012")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mAnalystProperties;
            }

            @objid ("073a579e-0393-47eb-b60f-2295cab5e578")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystItemData) data).mAnalystProperties = value;
            }

            @objid ("2ec3cc47-7d42-47d1-aba6-6b37365b9e7b")
            @Override
            public SmDependency getSymetric() {
                return AnalystPropertyTableData.Metadata.AnalystOwnerDep();
            }

        }

    }

}
