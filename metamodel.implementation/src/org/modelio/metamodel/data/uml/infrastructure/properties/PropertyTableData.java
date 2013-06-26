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
package org.modelio.metamodel.data.uml.infrastructure.properties;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
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
    @objid ("f214d45f-8ea0-4e80-8f28-2468471e1e8b")
    @SmaMetaAttribute(metaName="name", type=String.class, smAttributeClass=Metadata.NameSmAttribute.class)
     Object mName = "";

    @objid ("fdc2e452-fc7e-4421-a59d-816d4a98c3a7")
    @SmaMetaAttribute(metaName="content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("bc548c26-bec3-40bd-9db2-38cd76e2655a")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("3fa38e39-0dd2-4ae9-9a19-970a954425dd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00060306-ec98-1098-b22e-001ec947cd2a")
    public static class Metadata {
        @objid ("86249b83-ff11-4b23-ad3d-66498ec5ea7e")
        private static SmClass smClass = null;

        @objid ("79c09bb1-1916-4f16-a457-fc1e4ed4f794")
        private static SmAttribute nameAtt = null;

        @objid ("38b94c77-ca44-4474-b187-3b45b838f483")
        private static SmAttribute contentAtt = null;

        @objid ("e90cf3fa-7c9f-4238-9a1a-302079e62e39")
        private static SmDependency OwnerDep = null;

        @objid ("a9ff82ac-ac12-44ae-b1e6-52d118c364e2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(PropertyTableData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b29a93ff-907a-4a2a-93b6-843319546fa7")
        public static SmAttribute nameAtt() {
            if (nameAtt == null) {
            	nameAtt = classof().getAttributeDef("name");
            }
            return nameAtt;
        }

        @objid ("6b03840e-b380-49d9-b141-41324099188a")
        public static SmAttribute contentAtt() {
            if (contentAtt == null) {
            	contentAtt = classof().getAttributeDef("content");
            }
            return contentAtt;
        }

        @objid ("29e5180e-7231-4638-a13f-c1d93a332895")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c15d2e5e-224e-4249-8178-6d54a079878b")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return contentAtt;
        }

        @objid ("74cee7b6-373c-4f57-b795-c72f20bbaaaa")
        public static SmAttribute getNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return nameAtt;
        }

        @objid ("ceedde2f-c3bd-43ad-b031-552b5d7b5dec")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("6757735c-d765-4c4b-8b80-bb8f773e9f9c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00066486-ec98-1098-b22e-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6cbbfd85-6ba4-4d1a-acd1-7e1ffb8c0857")
            public ISmObjectData createData() {
                return new PropertyTableData();
            }

            @objid ("bcc2394c-3535-41ab-8a29-50f5b9aa9427")
            public SmObjectImpl createImpl() {
                return new PropertyTableImpl();
            }

        }

        @objid ("00074180-ec98-1098-b22e-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("a19105bf-7455-4703-8bac-e894c3ba0482")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mOwner;
            }

            @objid ("aade670d-c39f-43e1-902a-03f3fa78fb5b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((PropertyTableData) data).mOwner = value;
            }

            @objid ("742da7d3-fdf7-491b-b57c-c9c2475b2b9f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.PropertiesDep();
            }

        }

        @objid ("4bce00a5-281d-11e2-bf07-001ec947ccaf")
        public static class NameSmAttribute extends SmAttribute {
            @objid ("37619f37-6cde-4abb-b552-0f2304d0d0c6")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mName;
            }

            @objid ("3abe8d0e-7360-457c-979f-83b724ebbdeb")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mName = value;
            }

        }

        @objid ("4bd062cd-281d-11e2-bf07-001ec947ccaf")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("1af879da-3271-4609-aa2f-c80d110163a2")
            public Object getValue(ISmObjectData data) {
                return ((PropertyTableData) data).mContent;
            }

            @objid ("c591fded-f6b1-4720-9604-885613ab5501")
            public void setValue(ISmObjectData data, Object value) {
                ((PropertyTableData) data).mContent = value;
            }

        }

    }

}
