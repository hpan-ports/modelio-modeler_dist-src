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
    @objid ("943ccee7-7d44-4462-982b-9423f89f7e37")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("01c7309b-e94e-4173-83ce-6d077c42fc2a")
    @SmaMetaAssociation(metaName="Attributed", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.AttributedSmDependency.class)
     SmObjectImpl mAttributed;

    @objid ("b3d703bd-92fb-459e-98bb-6c614e2ee38d")
    @SmaMetaAssociation(metaName="Base", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("aa9cc5c9-9f78-4915-8754-faecd9d4e0bc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00454566-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("95f92ae9-0fbc-4bda-8978-72ae23f29cb1")
        private static SmClass smClass = null;

        @objid ("83b41441-7e7b-4926-8329-4e7b7ba996fb")
        private static SmAttribute ValueAtt = null;

        @objid ("6c7d551f-f431-484a-8e2a-bdb755f63de0")
        private static SmDependency AttributedDep = null;

        @objid ("2afdb40d-b14b-4149-939f-397a5b855ec1")
        private static SmDependency BaseDep = null;

        @objid ("d46692e7-9a37-41b2-8f05-00eca3c5b7c5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("814d91dd-56d6-4d6f-9bcd-1da1184d5012")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("9640abdf-77cc-4bd3-9236-7577fa12115d")
        public static SmDependency AttributedDep() {
            if (AttributedDep == null) {
            	AttributedDep = classof().getDependencyDef("Attributed");
            }
            return AttributedDep;
        }

        @objid ("e2398791-7c28-4082-900d-6c66009390e3")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("4dfb90bb-d76b-4598-a10b-3a18d0f0b630")
        public static SmDependency getAttributedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttributedDep;
        }

        @objid ("01bbfe40-92c1-4cc2-a115-331a0ecde313")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("3851e82d-e2bf-40c0-84a1-60b87a0bfac4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ec0efdf4-8e4d-47cb-bc31-5d34e5163738")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0045a18c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6ea84938-cb81-4028-ab65-51bdfbe2eaba")
            public ISmObjectData createData() {
                return new AttributeLinkData();
            }

            @objid ("fc383510-066e-496a-9eb5-7a6796a04d7e")
            public SmObjectImpl createImpl() {
                return new AttributeLinkImpl();
            }

        }

        @objid ("00460528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("8baf3f15-14fd-487f-8654-f2711f242015")
            public Object getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mValue;
            }

            @objid ("3ab4bb57-726c-4aae-81d1-65e412d15af9")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeLinkData) data).mValue = value;
            }

        }

        @objid ("004666da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("d9acfaa1-2932-47f3-8a2d-74023194b8a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mBase;
            }

            @objid ("afdd1b03-efdd-48a0-a5cf-a01c70407a00")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mBase = value;
            }

            @objid ("ca869262-1efe-4ae0-9854-d89a92be377f")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OccurenceDep();
            }

        }

        @objid ("0046db2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AttributedSmDependency extends SmSingleDependency {
            @objid ("ce6f5b82-b58b-450f-9509-51af425d69cc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mAttributed;
            }

            @objid ("645b9e0a-8dad-4543-bb3d-ed5e0d8430ea")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mAttributed = value;
            }

            @objid ("4a2e8952-f833-46e6-a4a0-9a5a441d6dbb")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.SlotDep();
            }

        }

    }

}
