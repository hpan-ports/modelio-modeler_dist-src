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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystElementImpl;
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

@objid ("c469b8a6-17c2-4568-b3ee-39110eb6291b")
@SmaMetaClass(mmClass=AnalystElement.class, factory=AnalystElementData.Metadata.ObjectFactory.class)
public abstract class AnalystElementData extends AnalystItemData {
    @objid ("2ad6bf0b-6437-422c-8a7c-23ac9377cbce")
    @SmaMetaAttribute(metaName="Version", type=Integer.class, smAttributeClass=Metadata.VersionSmAttribute.class)
     Object mVersion = 0;

    @objid ("2d8cd162-8ac0-4862-96e1-09b9a2f3b4d8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("35ee7ca1-df47-49be-a357-598ee4c4efd2")
    public static class Metadata {
        @objid ("21f4b6fa-42e2-4541-a3cc-75958668daff")
        private static SmClass smClass = null;

        @objid ("7733dba6-a076-4807-ad24-3dd64aae0b0e")
        private static SmAttribute VersionAtt = null;

        @objid ("af03329e-705d-4378-b3c2-5685d3a78297")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6ab75564-e41e-41a8-9961-e1db2c2c7cc2")
        public static SmAttribute VersionAtt() {
            if (VersionAtt == null) {
            	VersionAtt = classof().getAttributeDef("Version");
            }
            return VersionAtt;
        }

        @objid ("42378503-0182-4b63-9ce1-38ee3db23c7a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("87349b33-322d-4595-a5bb-2fb36c8663bd")
        public static SmAttribute getVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return VersionAtt;
        }

        @objid ("10a7b11d-a7cb-4dfa-be29-d2f8c7d0664f")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e6e250a8-cfb2-4ac8-9ef3-ad78d7160436")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("62e16130-f500-41ed-9187-3da28d065551")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("ddf3e6b1-a5ae-4d61-a56f-9f24fc09be38")
        public static class VersionSmAttribute extends SmAttribute {
            @objid ("c3f31117-dca0-4147-8492-6bdf14f93ea9")
            public Object getValue(ISmObjectData data) {
                return ((AnalystElementData) data).mVersion;
            }

            @objid ("f91fb5a0-ab1c-4b61-a9b5-5678bf1f5a05")
            public void setValue(ISmObjectData data, Object value) {
                ((AnalystElementData) data).mVersion = value;
            }

        }

    }

}
