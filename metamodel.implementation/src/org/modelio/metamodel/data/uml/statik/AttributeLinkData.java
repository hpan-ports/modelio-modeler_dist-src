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
    @objid ("9a871c9c-78ff-4510-8b29-088b1a33fbbb")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("9c67442c-0388-4fbb-8fb1-104dd4fa7645")
    @SmaMetaAssociation(metaName="Attributed", typeDataClass=InstanceData.class, min=1, max=1, smAssociationClass=Metadata.AttributedSmDependency.class)
     SmObjectImpl mAttributed;

    @objid ("d05a6bc7-e5d6-406d-b745-2249a945c1d2")
    @SmaMetaAssociation(metaName="Base", typeDataClass=AttributeData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("d67b6399-0623-445f-8e80-92f8e4764ad7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00454566-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d9637676-f272-458b-9ea5-282e41300b5c")
        private static SmClass smClass = null;

        @objid ("6ef5bcfa-8641-4480-ad2b-53f8c5e9717c")
        private static SmAttribute ValueAtt = null;

        @objid ("bd1b7e96-1b5b-4acc-a471-a9586b0b9725")
        private static SmDependency AttributedDep = null;

        @objid ("4e376b7b-de15-4ab1-be59-a7f5677dc613")
        private static SmDependency BaseDep = null;

        @objid ("c480abb7-609a-4b4d-9d58-62638f79f3aa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AttributeLinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2c39d445-2943-44da-b970-582d74463a6c")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("f4a21371-fe4a-4317-b05c-41a36c928763")
        public static SmDependency AttributedDep() {
            if (AttributedDep == null) {
            	AttributedDep = classof().getDependencyDef("Attributed");
            }
            return AttributedDep;
        }

        @objid ("95e7e97c-d9d0-45d4-8f46-15f40241a3fe")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("f86d7609-afd2-44ba-b6c3-b54ff1269ec4")
        public static SmDependency getAttributedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AttributedDep;
        }

        @objid ("5969cfab-4132-4c04-82f5-10ef88079cb9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("932b9021-885d-41ae-b569-4be8f56f78c9")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("9bc6e23a-4d7c-4543-ab69-6bc885daf7f1")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0045a18c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5f60a04f-9042-4b3f-9e58-794464a890e4")
            public ISmObjectData createData() {
                return new AttributeLinkData();
            }

            @objid ("bd8270be-08de-427c-bd1f-52149740d09e")
            public SmObjectImpl createImpl() {
                return new AttributeLinkImpl();
            }

        }

        @objid ("00460528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("62f9eae9-b8c3-4773-a12d-00eec90c0e69")
            public Object getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mValue;
            }

            @objid ("d5452381-bddf-4445-8ab0-4568f3a63575")
            public void setValue(ISmObjectData data, Object value) {
                ((AttributeLinkData) data).mValue = value;
            }

        }

        @objid ("004666da-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("2dd48078-c449-43a2-9a75-d5a42c885f1d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mBase;
            }

            @objid ("3a5ea147-0eed-40ac-a539-3be607a26b38")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mBase = value;
            }

            @objid ("6f7de8ea-f4b2-477e-9523-8f89085e7c3b")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.OccurenceDep();
            }

        }

        @objid ("0046db2e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AttributedSmDependency extends SmSingleDependency {
            @objid ("c490123e-fdf1-4091-9af2-0b0f77c58e9e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AttributeLinkData) data).mAttributed;
            }

            @objid ("e06600be-38d0-4d78-bd4f-db93143fb84e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AttributeLinkData) data).mAttributed = value;
            }

            @objid ("661b034b-d897-4747-bccf-428b4ff70285")
            @Override
            public SmDependency getSymetric() {
                return InstanceData.Metadata.SlotDep();
            }

        }

    }

}
