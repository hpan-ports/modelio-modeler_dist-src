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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.InstanceData;
import org.modelio.metamodel.impl.uml.statik.AttributeLinkImpl;
import org.modelio.metamodel.uml.statik.AttributeLink;
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

@objid ("00006a72-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AttributeLink.class, factory=AttributeLinkData.Metadata.ObjectFactory.class)
public class AttributeLinkData extends ModelElementData {
    @objid ("a21b49ad-92d9-46fc-b4ea-f773d1dd8f92")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("94240a97-bc8e-4797-b749-f9ea74be9120")
    @SmaMetaAssociation(metaName="Attributed", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.AttributedSmDependency.class)
     SmObjectImpl mAttributed;

    @objid ("04f5c37f-ad52-43be-87f9-0f71b1e25e72")
    @SmaMetaAssociation(metaName="Base", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("0c13e2a5-7d77-4416-91cb-4ab90f80d158")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00454566-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("674610fa-887f-47fe-857b-3169eeef3292")
        private static SmClass smClass = null;

        @objid ("10750430-12f8-44b0-9ea8-b005509ad4e5")
        private static SmAttribute ValueAtt = null;

        @objid ("e650db3c-2f04-4ffe-bfb8-8994ea36f4cb")
        private static SmDependency AttributedDep = null;

        @objid ("71062112-5168-4933-aeb9-31a80811c79f")
        private static SmDependency BaseDep = null;

        @objid ("80dbe188-925f-41cf-b23a-a7b8882af9d5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("65a8fe0b-7e2a-4dff-9d09-deb0c1224fbd")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("6b6e5c90-2fe0-458c-bc17-fcdd61ffafed")
        public static SmDependency AttributedDep() {
            if (AttributedDep == null) {
            	AttributedDep = classof().getDependencyDef("Attributed");
            }
            return AttributedDep;
        }

        @objid ("9dc215f6-d6ce-472a-a9e4-b7e0ce7c948f")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("152b3bac-1bd4-48ae-93b2-6d342a0a0b0a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("48bff712-6fa4-4b00-b47b-8bcee22596e3")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("a4ff8b65-04c0-42bf-b42c-0281d0544846")
        public static SmDependency getAttributedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttributedDep;
        }

        @objid ("6f5d2ce9-896b-4b21-ac35-539c94c1faa5")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0045a18c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c713d9b2-32a4-4d6f-bfd1-11bb7fec7338")
            public ISmObjectData createData() {
                return new AttributeLinkData();
            }

            @objid ("0fde0827-9e2b-47cc-b4b2-2de847583b86")
            public SmObjectImpl createImpl() {
                return new AttributeLinkImpl();
            }

        }

        @objid ("00460528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("196786ef-7c54-41f3-8c40-cd66124d4f2e")
            public Object getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mValue;
            }

            @objid ("a5dc9838-6682-4e35-80cf-d98014967ba8")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeLinkData) data).mValue = value;
            }

        }

        @objid ("004666da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("e15f8def-7007-41e8-9304-d63e9d61afbb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mBase;
            }

            @objid ("ab396650-f69b-4373-ae01-79759256532d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mBase = value;
            }

            @objid ("3b617475-006a-4f80-9f52-a055f690841c")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OccurenceDep();
            }

        }

        @objid ("0046db2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AttributedSmDependency extends SmSingleDependency {
            @objid ("07d04026-b4a8-4975-9b96-02c61deb52b5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mAttributed;
            }

            @objid ("2a2f575c-c08e-4039-b776-7e851be65a8e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mAttributed = value;
            }

            @objid ("5598b57e-579b-4dbf-8537-dc9f08c458d4")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.SlotDep();
            }

        }

    }

}
