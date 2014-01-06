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
    @objid ("fcca2643-e804-4c23-b91e-e952aeaa414a")
    @SmaMetaAttribute(metaName="Value", type=String.class, smAttributeClass=Metadata.ValueSmAttribute.class)
     Object mValue = "";

    @objid ("38819998-2a9e-4279-9601-77404a00854c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0012639e-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("511389db-7a0b-46a3-b31b-db7a4334001e")
        private static SmClass smClass = null;

        @objid ("770c195b-9589-4878-9d19-bb8f5a03a8db")
        private static SmAttribute ValueAtt = null;

        @objid ("ef473bba-370b-4f23-8d32-ff821c2f4be7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ValuePinData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d38049b8-195a-4257-ae2b-ff8c4d2fb4a5")
        public static SmAttribute ValueAtt() {
            if (ValueAtt == null) {
            	ValueAtt = classof().getAttributeDef("Value");
            }
            return ValueAtt;
        }

        @objid ("68216aa0-d524-46fd-8d80-18d89804401d")
        public static SmAttribute getValueAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ValueAtt;
        }

        @objid ("c1c80b4e-0238-4254-ac9d-ffe8783eb5b1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0012a5ac-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cd61cdbd-da9f-4a12-8337-a6d5dd153289")
            public ISmObjectData createData() {
                return new ValuePinData();
            }

            @objid ("fbe6bd2b-e01a-4eea-a07f-ded6d47db145")
            public SmObjectImpl createImpl() {
                return new ValuePinImpl();
            }

        }

        @objid ("0013061e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ValueSmAttribute extends SmAttribute {
            @objid ("0980d85d-3652-49b8-b4af-0347a7b92d40")
            public Object getValue(ISmObjectData data) {
                return ((ValuePinData) data).mValue;
            }

            @objid ("2050797e-f565-487a-941d-2be7997feedb")
            public void setValue(ISmObjectData data, Object value) {
                ((ValuePinData) data).mValue = value;
            }

        }

    }

}
