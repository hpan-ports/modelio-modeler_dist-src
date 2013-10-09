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
    @objid ("e447a487-d95f-4516-8546-e7be3839aab6")
    @SmaMetaAttribute(metaName="Definition", type=String.class, smAttributeClass=Metadata.DefinitionSmAttribute.class)
     Object mDefinition = "";

    @objid ("67ae93be-3bab-4b28-b45e-d2f6c099fe4d")
    @SmaMetaAssociation(metaName="AnalystProperties", typeDataClass=AnalystPropertyTableData.class, min=1, max=1, smAssociationClass=Metadata.AnalystPropertiesSmDependency.class, component = true)
     SmObjectImpl mAnalystProperties;

    @objid ("9531b6f4-502d-4564-921e-9819ac62177b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("02ff5cdd-9877-466c-8285-f1b4962fbef1")
    public static class Metadata {
        @objid ("e4e7afcc-9efe-4f1c-954b-a3891dd0c9cf")
        private static SmClass smClass = null;

        @objid ("edc2c0a1-cb9a-4c59-974c-e88d66b49c46")
        private static SmAttribute DefinitionAtt = null;

        @objid ("a9779dac-6e04-49df-8f70-9719f6bf873c")
        private static SmDependency AnalystPropertiesDep = null;

        @objid ("697b9841-7a2c-4d92-8cc4-89bc281970b0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystItemData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("551710fc-618a-4da8-a590-b557ad960e0a")
        public static SmAttribute DefinitionAtt() {
            if (DefinitionAtt == null) {
            	DefinitionAtt = classof().getAttributeDef("Definition");
            }
            return DefinitionAtt;
        }

        @objid ("854466f4-450a-460b-a5d1-19e1d825cc32")
        public static SmDependency AnalystPropertiesDep() {
            if (AnalystPropertiesDep == null) {
            	AnalystPropertiesDep = classof().getDependencyDef("AnalystProperties");
            }
            return AnalystPropertiesDep;
        }

        @objid ("f0333c36-cc0a-443b-a341-a6a40e2bdee4")
        public static SmAttribute getDefinitionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinitionAtt;
        }

        @objid ("1e5f6e3c-06e3-4541-9437-3d882da76dbd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5f4543e8-1a29-4286-ba57-5c216fc04bf9")
        public static SmDependency getAnalystPropertiesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AnalystPropertiesDep;
        }

        @objid ("fda94f61-2256-4668-9a92-1bb3f1942409")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3319b476-0c3a-4435-b3b5-bf0afa706992")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("5d154eb6-8e64-42b6-b2ba-90accfda90ce")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("5f88e06e-6ed0-4c60-9c2d-c61ff8169506")
        public static class DefinitionSmAttribute extends SmAttribute {
            @objid ("ade45ae9-dc84-4368-be70-e80e8e39033f")
            public Object getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mDefinition;
            }

            @objid ("7b092a33-4423-46ec-b4f8-346d6af7a7bb")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystItemData) data).mDefinition = value;
            }

        }

        @objid ("067a03ba-79ed-4568-b849-c9b6e04277c1")
        public static class AnalystPropertiesSmDependency extends SmSingleDependency {
            @objid ("603a979a-642e-4827-b0af-d860918da275")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AnalystItemData) data).mAnalystProperties;
            }

            @objid ("08249c7f-fd7d-4228-8fa1-239c1f9f678d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AnalystItemData) data).mAnalystProperties = value;
            }

            @objid ("274b9200-3d60-4821-bc8d-a6bf1fd8da07")
            @Override
            public SmDependency getSymetric() {
                return AnalystPropertyTableData.Metadata.AnalystOwnerDep();
            }

        }

    }

}
