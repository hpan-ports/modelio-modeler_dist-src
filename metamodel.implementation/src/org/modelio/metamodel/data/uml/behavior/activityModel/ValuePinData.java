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
    @objid ("1e3e68ff-b14e-4cdc-aa22-bc6feed3e09b")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("a9efa43b-26c1-48fc-97d3-af029921f602")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0012639e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5305ca5f-e13b-43ad-b472-54167d61b335")
        private static SmClass smClass = null;

        @objid ("7ac12760-aa17-4e88-ad53-5e756d176922")
        private static SmAttribute ValueAtt = null;

        @objid ("a6369093-9fab-4b75-8dc8-54e17a78061c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ValuePinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d21da10-bb1c-4fd0-9399-8135c377d51f")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("0266ff1a-a5c9-4831-a2ba-51673a7ba0c5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("38e167de-6092-4506-ab1a-e5ff023550f2")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("0012a5ac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e0461d64-070c-4fba-bd60-08260b009af2")
            public ISmObjectData createData() {
                return new ValuePinData();
            }

            @objid ("cafd0785-fec6-4a5e-9bed-e17864e3f720")
            public SmObjectImpl createImpl() {
                return new ValuePinImpl();
            }

        }

        @objid ("0013061e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("cf030f5a-0d8b-4b00-9d81-a012f7766081")
            public Object getValue(ISmObjectData data) {
                return ((ValuePinData) data).mValue;
            }

            @objid ("20736c20-350a-4f98-9ee0-7c59f262b7db")
            public void setValue(ISmObjectData data, Object value) {
                ((ValuePinData) data).mValue = value;
            }

        }

    }

}
