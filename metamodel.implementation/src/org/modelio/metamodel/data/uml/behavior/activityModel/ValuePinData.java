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
package org.modelio.metamodel.data.uml.behavior.activityModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ValuePinImpl;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
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

@objid ("003f561a-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ValuePin.class, factory=ValuePinData.Metadata.ObjectFactory.class)
public class ValuePinData extends InputPinData {
    @objid ("6d584717-0c19-454e-928c-311c5fbe8d62")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("3bab0351-0b30-4129-994c-1e611cf5b23b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0012639e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fba875cb-adeb-4cb6-bf7d-1c368cdacbf2")
        private static SmClass smClass = null;

        @objid ("d9d64b6a-54ab-4b29-8742-25eee6de91fd")
        private static SmAttribute ValueAtt = null;

        @objid ("bb07fffb-012c-4fbe-8e20-5a7ca6629f39")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ValuePinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3f0f49ff-75b3-4d65-b205-67f0fc92c2ec")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("d4879977-ad08-4a16-afd1-b5216a4ad1bb")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("39b6c5a3-2415-46cb-8ee5-5e4189a700f2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0012a5ac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("56274ef0-3407-4a92-ab24-13dba4ad1e68")
            public ISmObjectData createData() {
                return new ValuePinData();
            }

            @objid ("190978c6-7e59-46c6-9d6e-857a8cd620a4")
            public SmObjectImpl createImpl() {
                return new ValuePinImpl();
            }

        }

        @objid ("0013061e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("bc17c6cc-fe6a-4e50-9b6a-5d305c1a75c1")
            public Object getValue(ISmObjectData data) {
                return ((ValuePinData) data).mValue;
            }

            @objid ("c9f39637-8411-487c-8625-0858367c08f2")
            public void setValue(ISmObjectData data, Object value) {
                ((ValuePinData) data).mValue = value;
            }

        }

    }

}
